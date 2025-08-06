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
 * {@link DescribeVodUserQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodUserQuotaResponseBody</p>
 */
public class DescribeVodUserQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlockQuota")
    private Integer blockQuota;

    @com.aliyun.core.annotation.NameInMap("BlockRemain")
    private Integer blockRemain;

    @com.aliyun.core.annotation.NameInMap("DomainQuota")
    private Integer domainQuota;

    @com.aliyun.core.annotation.NameInMap("PreloadQuota")
    private Integer preloadQuota;

    @com.aliyun.core.annotation.NameInMap("PreloadRemain")
    private Integer preloadRemain;

    @com.aliyun.core.annotation.NameInMap("RefreshDirQuota")
    private Integer refreshDirQuota;

    @com.aliyun.core.annotation.NameInMap("RefreshDirRemain")
    private Integer refreshDirRemain;

    @com.aliyun.core.annotation.NameInMap("RefreshUrlQuota")
    private Integer refreshUrlQuota;

    @com.aliyun.core.annotation.NameInMap("RefreshUrlRemain")
    private Integer refreshUrlRemain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeVodUserQuotaResponseBody(Builder builder) {
        this.blockQuota = builder.blockQuota;
        this.blockRemain = builder.blockRemain;
        this.domainQuota = builder.domainQuota;
        this.preloadQuota = builder.preloadQuota;
        this.preloadRemain = builder.preloadRemain;
        this.refreshDirQuota = builder.refreshDirQuota;
        this.refreshDirRemain = builder.refreshDirRemain;
        this.refreshUrlQuota = builder.refreshUrlQuota;
        this.refreshUrlRemain = builder.refreshUrlRemain;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodUserQuotaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blockQuota
     */
    public Integer getBlockQuota() {
        return this.blockQuota;
    }

    /**
     * @return blockRemain
     */
    public Integer getBlockRemain() {
        return this.blockRemain;
    }

    /**
     * @return domainQuota
     */
    public Integer getDomainQuota() {
        return this.domainQuota;
    }

    /**
     * @return preloadQuota
     */
    public Integer getPreloadQuota() {
        return this.preloadQuota;
    }

    /**
     * @return preloadRemain
     */
    public Integer getPreloadRemain() {
        return this.preloadRemain;
    }

    /**
     * @return refreshDirQuota
     */
    public Integer getRefreshDirQuota() {
        return this.refreshDirQuota;
    }

    /**
     * @return refreshDirRemain
     */
    public Integer getRefreshDirRemain() {
        return this.refreshDirRemain;
    }

    /**
     * @return refreshUrlQuota
     */
    public Integer getRefreshUrlQuota() {
        return this.refreshUrlQuota;
    }

    /**
     * @return refreshUrlRemain
     */
    public Integer getRefreshUrlRemain() {
        return this.refreshUrlRemain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer blockQuota; 
        private Integer blockRemain; 
        private Integer domainQuota; 
        private Integer preloadQuota; 
        private Integer preloadRemain; 
        private Integer refreshDirQuota; 
        private Integer refreshDirRemain; 
        private Integer refreshUrlQuota; 
        private Integer refreshUrlRemain; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeVodUserQuotaResponseBody model) {
            this.blockQuota = model.blockQuota;
            this.blockRemain = model.blockRemain;
            this.domainQuota = model.domainQuota;
            this.preloadQuota = model.preloadQuota;
            this.preloadRemain = model.preloadRemain;
            this.refreshDirQuota = model.refreshDirQuota;
            this.refreshDirRemain = model.refreshDirRemain;
            this.refreshUrlQuota = model.refreshUrlQuota;
            this.refreshUrlRemain = model.refreshUrlRemain;
            this.requestId = model.requestId;
        } 

        /**
         * BlockQuota.
         */
        public Builder blockQuota(Integer blockQuota) {
            this.blockQuota = blockQuota;
            return this;
        }

        /**
         * BlockRemain.
         */
        public Builder blockRemain(Integer blockRemain) {
            this.blockRemain = blockRemain;
            return this;
        }

        /**
         * DomainQuota.
         */
        public Builder domainQuota(Integer domainQuota) {
            this.domainQuota = domainQuota;
            return this;
        }

        /**
         * PreloadQuota.
         */
        public Builder preloadQuota(Integer preloadQuota) {
            this.preloadQuota = preloadQuota;
            return this;
        }

        /**
         * PreloadRemain.
         */
        public Builder preloadRemain(Integer preloadRemain) {
            this.preloadRemain = preloadRemain;
            return this;
        }

        /**
         * RefreshDirQuota.
         */
        public Builder refreshDirQuota(Integer refreshDirQuota) {
            this.refreshDirQuota = refreshDirQuota;
            return this;
        }

        /**
         * RefreshDirRemain.
         */
        public Builder refreshDirRemain(Integer refreshDirRemain) {
            this.refreshDirRemain = refreshDirRemain;
            return this;
        }

        /**
         * RefreshUrlQuota.
         */
        public Builder refreshUrlQuota(Integer refreshUrlQuota) {
            this.refreshUrlQuota = refreshUrlQuota;
            return this;
        }

        /**
         * RefreshUrlRemain.
         */
        public Builder refreshUrlRemain(Integer refreshUrlRemain) {
            this.refreshUrlRemain = refreshUrlRemain;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeVodUserQuotaResponseBody build() {
            return new DescribeVodUserQuotaResponseBody(this);
        } 

    } 

}
