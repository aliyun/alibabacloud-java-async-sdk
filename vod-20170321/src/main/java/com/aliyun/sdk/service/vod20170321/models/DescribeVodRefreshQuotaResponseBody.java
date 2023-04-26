// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVodRefreshQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodRefreshQuotaResponseBody</p>
 */
public class DescribeVodRefreshQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    private String blockQuota;

    @NameInMap("DirQuota")
    private String dirQuota;

    @NameInMap("DirRemain")
    private String dirRemain;

    @NameInMap("PreloadQuota")
    private String preloadQuota;

    @NameInMap("PreloadRemain")
    private String preloadRemain;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UrlQuota")
    private String urlQuota;

    @NameInMap("UrlRemain")
    private String urlRemain;

    @NameInMap("blockRemain")
    private String blockRemain;

    private DescribeVodRefreshQuotaResponseBody(Builder builder) {
        this.blockQuota = builder.blockQuota;
        this.dirQuota = builder.dirQuota;
        this.dirRemain = builder.dirRemain;
        this.preloadQuota = builder.preloadQuota;
        this.preloadRemain = builder.preloadRemain;
        this.requestId = builder.requestId;
        this.urlQuota = builder.urlQuota;
        this.urlRemain = builder.urlRemain;
        this.blockRemain = builder.blockRemain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodRefreshQuotaResponseBody create() {
        return builder().build();
    }

    /**
     * @return blockQuota
     */
    public String getBlockQuota() {
        return this.blockQuota;
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

    /**
     * @return blockRemain
     */
    public String getBlockRemain() {
        return this.blockRemain;
    }

    public static final class Builder {
        private String blockQuota; 
        private String dirQuota; 
        private String dirRemain; 
        private String preloadQuota; 
        private String preloadRemain; 
        private String requestId; 
        private String urlQuota; 
        private String urlRemain; 
        private String blockRemain; 

        /**
         * The remaining number of directories of files that can be refreshed on the current day.
         */
        public Builder blockQuota(String blockQuota) {
            this.blockQuota = blockQuota;
            return this;
        }

        /**
         * Queries the maximum number and remaining number of requests to refresh or prefetch files on the current day. You can prefetch files based on URLs and refresh files based on URLs or directories.
         */
        public Builder dirQuota(String dirQuota) {
            this.dirQuota = dirQuota;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder dirRemain(String dirRemain) {
            this.dirRemain = dirRemain;
            return this;
        }

        /**
         * PreloadQuota.
         */
        public Builder preloadQuota(String preloadQuota) {
            this.preloadQuota = preloadQuota;
            return this;
        }

        /**
         * The remaining number of OSS buckets that can be refreshed on the current day.
         */
        public Builder preloadRemain(String preloadRemain) {
            this.preloadRemain = preloadRemain;
            return this;
        }

        /**
         * The maximum number of directories of files that can be refreshed each day.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UrlQuota.
         */
        public Builder urlQuota(String urlQuota) {
            this.urlQuota = urlQuota;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **DescribeVodRefreshQuota**.
         */
        public Builder urlRemain(String urlRemain) {
            this.urlRemain = urlRemain;
            return this;
        }

        /**
         * The maximum number of URLs of files that can be prefetched each day.
         */
        public Builder blockRemain(String blockRemain) {
            this.blockRemain = blockRemain;
            return this;
        }

        public DescribeVodRefreshQuotaResponseBody build() {
            return new DescribeVodRefreshQuotaResponseBody(this);
        } 

    } 

}
