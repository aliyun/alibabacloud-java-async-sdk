package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoCipher;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CipherInputStream extends FilterInputStream {
    private static final int MAX_RETRY = 1000;
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private CryptoCipher cryptoCipher;
    private boolean eof;
    private final byte[] bufin;
    private byte[] bufout;
    private int curr_pos;
    private int max_pos;

    public CipherInputStream(InputStream is, CryptoCipher cryptoCipher) {
        this(is, cryptoCipher, DEFAULT_IN_BUFFER_SIZE);
    }

    public CipherInputStream(InputStream is, CryptoCipher c, int buffsize) {
        super(is);
        this.cryptoCipher = c;
        if (buffsize <= 0 || (buffsize % DEFAULT_IN_BUFFER_SIZE) != 0) {
            throw new IllegalArgumentException(
                    "buffsize (" + buffsize + ") must be a positive multiple of " + DEFAULT_IN_BUFFER_SIZE);
        }
        this.bufin = new byte[buffsize];
    }

    @Override
    public int read() throws IOException {
        if (curr_pos >= max_pos) {
            if (eof)
                return -1;
            int count = 0;
            int len;
            do {
                if (count > MAX_RETRY)
                    throw new IOException("exceeded maximum number of attempts to read next chunk of data");
                len = nextChunk();
                count++;
            } while (len == 0);

            if (len == -1)
                return -1;
        }
        return ((int) bufout[curr_pos++] & 0xFF);
    }

    @Override
    public int read(byte[] b) throws IOException {
        return read(b, 0, b.length);
    }

    @Override
    public int read(byte[] buf, int off, int target_len) throws IOException {
        if (curr_pos >= max_pos) {
            if (eof)
                return -1;
            int count = 0;
            int len;
            do {
                if (count > MAX_RETRY)
                    throw new IOException("exceeded maximum number of attempts to read next chunk of data");
                len = nextChunk();
                count++;
            } while (len == 0);

            if (len == -1)
                return -1;
        }
        if (target_len <= 0)
            return 0;
        int len = max_pos - curr_pos;
        if (target_len < len)
            len = target_len;
        System.arraycopy(bufout, curr_pos, buf, off, len);
        curr_pos += len;
        return len;
    }

    /**
     * Note: This implementation will only skip up to the end of the buffered data,
     * potentially skipping 0 bytes.
     */
    @Override
    public long skip(long n) throws IOException {
        int available = max_pos - curr_pos;
        if (n > available)
            n = available;
        if (n < 0)
            return 0;
        curr_pos += n;
        return n;
    }

    @Override
    public int available() {
        return max_pos - curr_pos;
    }

    @Override
    public void close() throws IOException {
        in.close();
        try {
            cryptoCipher.doFinal();
        } catch (BadPaddingException ex) {
        } catch (IllegalBlockSizeException ex) {
        }
        curr_pos = max_pos = 0;
    }

    @Override
    public boolean markSupported() {
        return false;

    }

    @Override
    public void mark(int readlimit) {
    }

    @Override
    public void reset() throws IOException {
        throw new IllegalStateException("mark/reset not supported.");
    }

    final void resetInternal() {
        curr_pos = max_pos = 0;
        eof = false;
    }

    /**
     * Reads and process the next chunk of data into memory.
     *
     * @return the length of the data chunk read and processed, or -1 if end of
     * stream.
     * @throws IOException       if there is an IO exception from the underlying input stream
     * @throws SecurityException if there is authentication failure
     */
    private int nextChunk() throws IOException {
        if (eof)
            return -1;
        bufout = null;
        int len = in.read(bufin);
        if (len == -1) {
            eof = true;
            try {
                bufout = cryptoCipher.doFinal();
                if (bufout == null) {
                    return -1;
                }
                curr_pos = 0;
                return max_pos = bufout.length;
            } catch (IllegalBlockSizeException e) {
            } catch (BadPaddingException e) {
                throw new SecurityException(e);
            }
            return -1;
        }
        bufout = cryptoCipher.update(bufin, 0, len);
        curr_pos = 0;
        return max_pos = (bufout == null ? 0 : bufout.length);
    }

    void renewCryptoCipher() {
        cryptoCipher = cryptoCipher.recreate();
    }
}
