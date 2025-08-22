// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

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
 * {@link DescribeDcdnUserQuotaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnUserQuotaResponseBody</p>
 */
public class DescribeDcdnUserQuotaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BlockQuota")
    private Integer blockQuota;

    @com.aliyun.core.annotation.NameInMap("BlockRemain")
    private Integer blockRemain;

    @com.aliyun.core.annotation.NameInMap("DomainQuota")
    private Integer domainQuota;

    @com.aliyun.core.annotation.NameInMap("IgnoreParamsQuota")
    private Integer ignoreParamsQuota;

    @com.aliyun.core.annotation.NameInMap("IgnoreParamsRemain")
    private Integer ignoreParamsRemain;

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

    private DescribeDcdnUserQuotaResponseBody(Builder builder) {
        this.blockQuota = builder.blockQuota;
        this.blockRemain = builder.blockRemain;
        this.domainQuota = builder.domainQuota;
        this.ignoreParamsQuota = builder.ignoreParamsQuota;
        this.ignoreParamsRemain = builder.ignoreParamsRemain;
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

    public static DescribeDcdnUserQuotaResponseBody create() {
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
     * @return ignoreParamsQuota
     */
    public Integer getIgnoreParamsQuota() {
        return this.ignoreParamsQuota;
    }

    /**
     * @return ignoreParamsRemain
     */
    public Integer getIgnoreParamsRemain() {
        return this.ignoreParamsRemain;
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
        private Integer ignoreParamsQuota; 
        private Integer ignoreParamsRemain; 
        private Integer preloadQuota; 
        private Integer preloadRemain; 
        private Integer refreshDirQuota; 
        private Integer refreshDirRemain; 
        private Integer refreshUrlQuota; 
        private Integer refreshUrlRemain; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDcdnUserQuotaResponseBody model) {
            this.blockQuota = model.blockQuota;
            this.blockRemain = model.blockRemain;
            this.domainQuota = model.domainQuota;
            this.ignoreParamsQuota = model.ignoreParamsQuota;
            this.ignoreParamsRemain = model.ignoreParamsRemain;
            this.preloadQuota = model.preloadQuota;
            this.preloadRemain = model.preloadRemain;
            this.refreshDirQuota = model.refreshDirQuota;
            this.refreshDirRemain = model.refreshDirRemain;
            this.refreshUrlQuota = model.refreshUrlQuota;
            this.refreshUrlRemain = model.refreshUrlRemain;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The maximum number of URLs that can be blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder blockQuota(Integer blockQuota) {
            this.blockQuota = blockQuota;
            return this;
        }

        /**
         * <p>The remaining number of URLs that can be blocked.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder blockRemain(Integer blockRemain) {
            this.blockRemain = blockRemain;
            return this;
        }

        /**
         * <p>The maximum number of accelerated domains.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder domainQuota(Integer domainQuota) {
            this.domainQuota = domainQuota;
            return this;
        }

        /**
         * <p>The maximum number of URLs or directories with parameters ignored that can be refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder ignoreParamsQuota(Integer ignoreParamsQuota) {
            this.ignoreParamsQuota = ignoreParamsQuota;
            return this;
        }

        /**
         * <p>The number of remaining URLs or directories with parameters ignored that can be refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder ignoreParamsRemain(Integer ignoreParamsRemain) {
            this.ignoreParamsRemain = ignoreParamsRemain;
            return this;
        }

        /**
         * <p>The maximum number of URLs that can be prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder preloadQuota(Integer preloadQuota) {
            this.preloadQuota = preloadQuota;
            return this;
        }

        /**
         * <p>The remaining number of URLs that can be prefetched.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder preloadRemain(Integer preloadRemain) {
            this.preloadRemain = preloadRemain;
            return this;
        }

        /**
         * <p>The maximum number of directories that can be refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder refreshDirQuota(Integer refreshDirQuota) {
            this.refreshDirQuota = refreshDirQuota;
            return this;
        }

        /**
         * <p>The remaining number of directories that can be refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder refreshDirRemain(Integer refreshDirRemain) {
            this.refreshDirRemain = refreshDirRemain;
            return this;
        }

        /**
         * <p>The maximum number of URLs that can be refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder refreshUrlQuota(Integer refreshUrlQuota) {
            this.refreshUrlQuota = refreshUrlQuota;
            return this;
        }

        /**
         * <p>The remaining number of URLs that can be refreshed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder refreshUrlRemain(Integer refreshUrlRemain) {
            this.refreshUrlRemain = refreshUrlRemain;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BFFCDFAD-DACC-484E-9BE6-0AF3B3A0DD23</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnUserQuotaResponseBody build() {
            return new DescribeDcdnUserQuotaResponseBody(this);
        } 

    } 

}
