// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnRefreshQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnRefreshQuotaResponseBody</p>
 */
public class DescribeDcdnRefreshQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlockQuota")
    private String blockQuota;

    @com.aliyun.core.annotation.NameInMap("BlockRemain")
    private String blockRemain;

    @com.aliyun.core.annotation.NameInMap("DirQuota")
    private String dirQuota;

    @com.aliyun.core.annotation.NameInMap("DirRemain")
    private String dirRemain;

    @com.aliyun.core.annotation.NameInMap("IgnoreParamsQuota")
    private String ignoreParamsQuota;

    @com.aliyun.core.annotation.NameInMap("IgnoreParamsRemain")
    private String ignoreParamsRemain;

    @com.aliyun.core.annotation.NameInMap("PreloadQuota")
    private String preloadQuota;

    @com.aliyun.core.annotation.NameInMap("PreloadRemain")
    private String preloadRemain;

    @com.aliyun.core.annotation.NameInMap("RegexQuota")
    private String regexQuota;

    @com.aliyun.core.annotation.NameInMap("RegexRemain")
    private String regexRemain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UrlQuota")
    private String urlQuota;

    @com.aliyun.core.annotation.NameInMap("UrlRemain")
    private String urlRemain;

    private DescribeDcdnRefreshQuotaResponseBody(Builder builder) {
        this.blockQuota = builder.blockQuota;
        this.blockRemain = builder.blockRemain;
        this.dirQuota = builder.dirQuota;
        this.dirRemain = builder.dirRemain;
        this.ignoreParamsQuota = builder.ignoreParamsQuota;
        this.ignoreParamsRemain = builder.ignoreParamsRemain;
        this.preloadQuota = builder.preloadQuota;
        this.preloadRemain = builder.preloadRemain;
        this.regexQuota = builder.regexQuota;
        this.regexRemain = builder.regexRemain;
        this.requestId = builder.requestId;
        this.urlQuota = builder.urlQuota;
        this.urlRemain = builder.urlRemain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRefreshQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return blockQuota
     */
    public String getBlockQuota() {
        return this.blockQuota;
    }

    /**
     * @return blockRemain
     */
    public String getBlockRemain() {
        return this.blockRemain;
    }

    /**
     * @return dirQuota
     */
    public String getDirQuota() {
        return this.dirQuota;
    }

    /**
     * @return dirRemain
     */
    public String getDirRemain() {
        return this.dirRemain;
    }

    /**
     * @return ignoreParamsQuota
     */
    public String getIgnoreParamsQuota() {
        return this.ignoreParamsQuota;
    }

    /**
     * @return ignoreParamsRemain
     */
    public String getIgnoreParamsRemain() {
        return this.ignoreParamsRemain;
    }

    /**
     * @return preloadQuota
     */
    public String getPreloadQuota() {
        return this.preloadQuota;
    }

    /**
     * @return preloadRemain
     */
    public String getPreloadRemain() {
        return this.preloadRemain;
    }

    /**
     * @return regexQuota
     */
    public String getRegexQuota() {
        return this.regexQuota;
    }

    /**
     * @return regexRemain
     */
    public String getRegexRemain() {
        return this.regexRemain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return urlQuota
     */
    public String getUrlQuota() {
        return this.urlQuota;
    }

    /**
     * @return urlRemain
     */
    public String getUrlRemain() {
        return this.urlRemain;
    }

    public static final class Builder {
        private String blockQuota; 
        private String blockRemain; 
        private String dirQuota; 
        private String dirRemain; 
        private String ignoreParamsQuota; 
        private String ignoreParamsRemain; 
        private String preloadQuota; 
        private String preloadRemain; 
        private String regexQuota; 
        private String regexRemain; 
        private String requestId; 
        private String urlQuota; 
        private String urlRemain; 

        /**
         * The maximum number of URLs that can be blocked.
         */
        public Builder blockQuota(String blockQuota) {
            this.blockQuota = blockQuota;
            return this;
        }

        /**
         * The remaining number of URLs that can be blocked on the current day.
         */
        public Builder blockRemain(String blockRemain) {
            this.blockRemain = blockRemain;
            return this;
        }

        /**
         * The maximum number of directories that can be refreshed on the current day.
         */
        public Builder dirQuota(String dirQuota) {
            this.dirQuota = dirQuota;
            return this;
        }

        /**
         * The remaining number of directories that can be refreshed on the current day.
         */
        public Builder dirRemain(String dirRemain) {
            this.dirRemain = dirRemain;
            return this;
        }

        /**
         * The maximum number of URLs or directories with parameters ignored that can be refreshed on the current day.
         */
        public Builder ignoreParamsQuota(String ignoreParamsQuota) {
            this.ignoreParamsQuota = ignoreParamsQuota;
            return this;
        }

        /**
         * The number of remaining URLs or directories that can be refreshed with parameters ignored on the current day.
         */
        public Builder ignoreParamsRemain(String ignoreParamsRemain) {
            this.ignoreParamsRemain = ignoreParamsRemain;
            return this;
        }

        /**
         * The maximum number of URLs that can be prefetched on the current day.
         */
        public Builder preloadQuota(String preloadQuota) {
            this.preloadQuota = preloadQuota;
            return this;
        }

        /**
         * The remaining number of URLs that can be prefetched on the current day.
         */
        public Builder preloadRemain(String preloadRemain) {
            this.preloadRemain = preloadRemain;
            return this;
        }

        /**
         * The maximum number of URLs or directories that can be refreshed by using regular expressions on the current day.
         */
        public Builder regexQuota(String regexQuota) {
            this.regexQuota = regexQuota;
            return this;
        }

        /**
         * The remaining number of URLs or directories that can be refreshed by using regular expressions on the current day.
         */
        public Builder regexRemain(String regexRemain) {
            this.regexRemain = regexRemain;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The maximum number of URLs that can be refreshed on the current day.
         */
        public Builder urlQuota(String urlQuota) {
            this.urlQuota = urlQuota;
            return this;
        }

        /**
         * The remaining number of URLs that can be refreshed on the current day.
         */
        public Builder urlRemain(String urlRemain) {
            this.urlRemain = urlRemain;
            return this;
        }

        public DescribeDcdnRefreshQuotaResponseBody build() {
            return new DescribeDcdnRefreshQuotaResponseBody(this);
        } 

    } 

}
