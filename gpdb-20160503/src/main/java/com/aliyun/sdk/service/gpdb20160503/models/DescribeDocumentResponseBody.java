// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDocumentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocumentResponseBody</p>
 */
public class DescribeDocumentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ChunkFileUrl")
    private String chunkFileUrl;

    @com.aliyun.core.annotation.NameInMap("DocsCount")
    private Integer docsCount;

    @com.aliyun.core.annotation.NameInMap("DocumentLoader")
    private String documentLoader;

    @com.aliyun.core.annotation.NameInMap("FileExt")
    private String fileExt;

    @com.aliyun.core.annotation.NameInMap("FileMd5")
    private String fileMd5;

    @com.aliyun.core.annotation.NameInMap("FileMtime")
    private String fileMtime;

    @com.aliyun.core.annotation.NameInMap("FileName")
    private String fileName;

    @com.aliyun.core.annotation.NameInMap("FileSize")
    private Long fileSize;

    @com.aliyun.core.annotation.NameInMap("FileUrl")
    private String fileUrl;

    @com.aliyun.core.annotation.NameInMap("FileVersion")
    private Integer fileVersion;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PlainChunkFileUrl")
    private String plainChunkFileUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TextSplitter")
    private String textSplitter;

    private DescribeDocumentResponseBody(Builder builder) {
        this.chunkFileUrl = builder.chunkFileUrl;
        this.docsCount = builder.docsCount;
        this.documentLoader = builder.documentLoader;
        this.fileExt = builder.fileExt;
        this.fileMd5 = builder.fileMd5;
        this.fileMtime = builder.fileMtime;
        this.fileName = builder.fileName;
        this.fileSize = builder.fileSize;
        this.fileUrl = builder.fileUrl;
        this.fileVersion = builder.fileVersion;
        this.message = builder.message;
        this.plainChunkFileUrl = builder.plainChunkFileUrl;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.status = builder.status;
        this.textSplitter = builder.textSplitter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocumentResponseBody create() {
        return builder().build();
    }

    /**
     * @return chunkFileUrl
     */
    public String getChunkFileUrl() {
        return this.chunkFileUrl;
    }

    /**
     * @return docsCount
     */
    public Integer getDocsCount() {
        return this.docsCount;
    }

    /**
     * @return documentLoader
     */
    public String getDocumentLoader() {
        return this.documentLoader;
    }

    /**
     * @return fileExt
     */
    public String getFileExt() {
        return this.fileExt;
    }

    /**
     * @return fileMd5
     */
    public String getFileMd5() {
        return this.fileMd5;
    }

    /**
     * @return fileMtime
     */
    public String getFileMtime() {
        return this.fileMtime;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    /**
     * @return fileSize
     */
    public Long getFileSize() {
        return this.fileSize;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
    }

    /**
     * @return fileVersion
     */
    public Integer getFileVersion() {
        return this.fileVersion;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return plainChunkFileUrl
     */
    public String getPlainChunkFileUrl() {
        return this.plainChunkFileUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return textSplitter
     */
    public String getTextSplitter() {
        return this.textSplitter;
    }

    public static final class Builder {
        private String chunkFileUrl; 
        private Integer docsCount; 
        private String documentLoader; 
        private String fileExt; 
        private String fileMd5; 
        private String fileMtime; 
        private String fileName; 
        private Long fileSize; 
        private String fileUrl; 
        private Integer fileVersion; 
        private String message; 
        private String plainChunkFileUrl; 
        private String requestId; 
        private String source; 
        private String status; 
        private String textSplitter; 

        /**
         * <p>URL of the split file, valid for 2 hours. The file format is JSONL, with each line formatted as <code>{&quot;page_content&quot;:&quot;*****&quot;, &quot;metadata&quot;: {&quot;**&quot;:&quot;***&quot;,&quot;**&quot;:&quot;***&quot;}</code>.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.xxx/music_chunk.jsonl">http://oss.xxx/music_chunk.jsonl</a></p>
         */
        public Builder chunkFileUrl(String chunkFileUrl) {
            this.chunkFileUrl = chunkFileUrl;
            return this;
        }

        /**
         * <p>Number of documents after splitting.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder docsCount(Integer docsCount) {
            this.docsCount = docsCount;
            return this;
        }

        /**
         * <p>Name of the document loader.</p>
         * 
         * <strong>example:</strong>
         * <p>RapidOCRPDFLoader</p>
         */
        public Builder documentLoader(String documentLoader) {
            this.documentLoader = documentLoader;
            return this;
        }

        /**
         * <p>File extension.</p>
         * 
         * <strong>example:</strong>
         * <p>txt</p>
         */
        public Builder fileExt(String fileExt) {
            this.fileExt = fileExt;
            return this;
        }

        /**
         * <p>MD5 value of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>b8078c9591413550f8963e37e24abcea</p>
         */
        public Builder fileMd5(String fileMd5) {
            this.fileMd5 = fileMd5;
            return this;
        }

        /**
         * <p>The last modified time of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-01 10:01:01.123456</p>
         */
        public Builder fileMtime(String fileMtime) {
            this.fileMtime = fileMtime;
            return this;
        }

        /**
         * <p>File name.</p>
         * 
         * <strong>example:</strong>
         * <p>music.txt</p>
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }

        /**
         * <p>File size, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder fileSize(Long fileSize) {
            this.fileSize = fileSize;
            return this;
        }

        /**
         * <p>Download URL of the document, valid for 2 hours.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.xxx/music.txt">http://oss.xxx/music.txt</a></p>
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }

        /**
         * <p>Document version. This value increments by 1 each time the same document is updated and uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder fileVersion(Integer fileVersion) {
            this.fileVersion = fileVersion;
            return this;
        }

        /**
         * <p>Detailed information returned by the API.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Download URL for the plain text (without metadata) after splitting, each line is a chunk, valid for 2 hours.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://oss.xxx/music_plain_chunk.txt">http://oss.xxx/music_plain_chunk.txt</a></p>
         */
        public Builder plainChunkFileUrl(String plainChunkFileUrl) {
            this.plainChunkFileUrl = plainChunkFileUrl;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Source of the document.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>API execution status, with values as follows:</p>
         * <ul>
         * <li><strong>success</strong>: Execution succeeded.</li>
         * <li><strong>fail</strong>: Execution failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Name of the text splitter.</p>
         * 
         * <strong>example:</strong>
         * <p>ChineseRecursiveTextSplitter</p>
         */
        public Builder textSplitter(String textSplitter) {
            this.textSplitter = textSplitter;
            return this;
        }

        public DescribeDocumentResponseBody build() {
            return new DescribeDocumentResponseBody(this);
        } 

    } 

}
