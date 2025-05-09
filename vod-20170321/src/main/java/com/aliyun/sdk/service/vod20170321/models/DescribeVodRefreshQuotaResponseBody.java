// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodRefreshQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodRefreshQuotaResponseBody</p>
 */
public class DescribeVodRefreshQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlockQuota")
    private String blockQuota;

    @com.aliyun.core.annotation.NameInMap("DirQuota")
    private String dirQuota;

    @com.aliyun.core.annotation.NameInMap("DirRemain")
    private String dirRemain;

    @com.aliyun.core.annotation.NameInMap("PreloadQuota")
    private String preloadQuota;

    @com.aliyun.core.annotation.NameInMap("PreloadRemain")
    private String preloadRemain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UrlQuota")
    private String urlQuota;

    @com.aliyun.core.annotation.NameInMap("UrlRemain")
    private String urlRemain;

    @com.aliyun.core.annotation.NameInMap("blockRemain")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeVodRefreshQuotaResponseBody model) {
            this.blockQuota = model.blockQuota;
            this.dirQuota = model.dirQuota;
            this.dirRemain = model.dirRemain;
            this.preloadQuota = model.preloadQuota;
            this.preloadRemain = model.preloadRemain;
            this.requestId = model.requestId;
            this.urlQuota = model.urlQuota;
            this.urlRemain = model.urlRemain;
            this.blockRemain = model.blockRemain;
        } 

        /**
         * <p>The maximum number of Object Storage Service (OSS) buckets that can be refreshed each day.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder blockQuota(String blockQuota) {
            this.blockQuota = blockQuota;
            return this;
        }

        /**
         * <p>The maximum number of directories of files that can be refreshed each day.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder dirQuota(String dirQuota) {
            this.dirQuota = dirQuota;
            return this;
        }

        /**
         * <p>The remaining number of directories of files that can be refreshed on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        public Builder dirRemain(String dirRemain) {
            this.dirRemain = dirRemain;
            return this;
        }

        /**
         * <p>The maximum number of URLs of files that can be prefetched each day.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder preloadQuota(String preloadQuota) {
            this.preloadQuota = preloadQuota;
            return this;
        }

        /**
         * <p>The remaining number of URLs of files that can be prefetched on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder preloadRemain(String preloadRemain) {
            this.preloadRemain = preloadRemain;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>42E0554B-80F4-4921-****-ACFB22CAAAD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The maximum number of URLs of files that can be refreshed each day.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder urlQuota(String urlQuota) {
            this.urlQuota = urlQuota;
            return this;
        }

        /**
         * <p>The remaining number of URLs of files that can be refreshed on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>1996</p>
         */
        public Builder urlRemain(String urlRemain) {
            this.urlRemain = urlRemain;
            return this;
        }

        /**
         * <p>The remaining number of OSS buckets that can be refreshed on the current day.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
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
