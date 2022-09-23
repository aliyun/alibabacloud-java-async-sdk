package com.aliyun.sdk.service.oss20190517.encryption.internal;

import com.aliyun.core.utils.ParseUtil;
import com.aliyun.sdk.gateway.oss.exception.OSSClientException;
import com.aliyun.sdk.service.oss20190517.encryption.crypto.CryptoScheme;
import darabonba.core.utils.CommonUtil;

import java.util.HashMap;
import java.util.Map;

public class Utils {
    private static final String RANGE_PREFIX = "bytes=";

    /**
     * Checks there an encryption info in the metadata.
     */
    public static boolean hasEncryptionInfo(Map<String, String> headers) {
        return headers != null &&
                headers.containsKey(CryptoHeaders.X_OSS_META_CRYPTO_KEY) &&
                headers.containsKey(CryptoHeaders.X_OSS_META_CRYPTO_IV);
    }

    /**
     * @return the corresponding material description from the given json string.
     */
    public static Map<String, String> getDescFromJsonString(String jsonString) {
        Map<String, String> map = new HashMap<String, String>();
        if (jsonString != null) {
            Object json = ParseUtil.parseJSON(jsonString);
            Map<String, Object> jmap = CommonUtil.assertAsMap(json);
            for (Object o : jmap.keySet()) {
                map.put((String) o, (String) jmap.get(o));
            }
        }
        return map;
    }

    public static long[] parseRange(String range) {
        String oriRange = range;
        if (range == null) {
            return null;
        }

        if (!range.startsWith(RANGE_PREFIX)) {
            throw new OSSClientException("Range does not start with " + RANGE_PREFIX, null);
        }

        range = range.substring(6);

        long lstart = -1;
        long lend = -1;
        try {
            String start = range.substring(0, range.indexOf('-'));
            if (!start.isEmpty()) {
                lstart = Long.parseLong(start);
            }
            String end = range.substring(range.indexOf('-') + 1);
            if (!end.isEmpty()) {
                lend = Long.parseLong(end);
            }
        } catch (Exception e) {
            throw new OSSClientException("Parse range fail", e);
        }

        if ((lstart < 0 && lend < 0) || (lstart > 0 && lend > 0 && lstart > lend)) {
            throw new OSSClientException("Invalid range value " + oriRange, null);
        }

        return new long[]{lstart, lend};
    }

    public static String toRangeString(long[] range) {
        if (range == null || range.length != 2) {
            return null;
        }

        long start = range[0];
        long end = range[1];

        if (start < 0 && end < 0 || (start > 0 && end > 0 && start > end)) {
            return null;
        }

        if (start < 0) {
            return String.format("%s-%d", RANGE_PREFIX, end);
        } else if (end < 0) {
            return String.format("%s%d-", RANGE_PREFIX, start);
        } else {
            return String.format("%s%d-%d", RANGE_PREFIX, start, end);
        }
    }

    /**
     * Adjusts the range-get start offset to align with cipher block.
     */
    public static long[] calcCryptoRange(long[] range) {
        if (range == null) {
            return null;
        }

        if (range[0] < 0 && range[1] < 0 || (range[0] > 0 && range[1] > 0 && range[0] > range[1])) {
            throw new OSSClientException("The range is illegal. + range:" + range[0] + "~" + range[1], null);
        }

        long[] adjustedCryptoRange = new long[2];
        adjustedCryptoRange[0] = range[0] < 0 ? range[0] : ((range[0] / CryptoScheme.BLOCK_SIZE) * CryptoScheme.BLOCK_SIZE);
        adjustedCryptoRange[1] = range[1];
        return adjustedCryptoRange;
    }
}
