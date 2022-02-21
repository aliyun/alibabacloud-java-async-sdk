// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnUserQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnUserQuotaResponseBody</p>
 */
public class DescribeCdnUserQuotaResponseBody extends TeaModel {
    @NameInMap("BlockQuota")
    private Integer blockQuota;

    @NameInMap("BlockRemain")
    private Integer blockRemain;

    @NameInMap("DomainQuota")
    private Integer domainQuota;

    @NameInMap("PreloadQuota")
    private Integer preloadQuota;

    @NameInMap("PreloadRemain")
    private Integer preloadRemain;

    @NameInMap("RefreshDirQuota")
    private Integer refreshDirQuota;

    @NameInMap("RefreshDirRemain")
    private Integer refreshDirRemain;

    @NameInMap("RefreshUrlQuota")
    private Integer refreshUrlQuota;

    @NameInMap("RefreshUrlRemain")
    private Integer refreshUrlRemain;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCdnUserQuotaResponseBody(Builder builder) {
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

    public static DescribeCdnUserQuotaResponseBody create() {
        return builder().build();
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

        public DescribeCdnUserQuotaResponseBody build() {
            return new DescribeCdnUserQuotaResponseBody(this);
        } 

    } 

}
