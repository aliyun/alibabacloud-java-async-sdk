// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Quota} extends {@link TeaModel}
 *
 * <p>Quota</p>
 */
public class Quota extends TeaModel {
    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("EnableTideResource")
    private Boolean enableTideResource;

    @NameInMap("IsExclusiveQuota")
    private Boolean isExclusiveQuota;

    @NameInMap("QuotaId")
    private String quotaId;

    @NameInMap("QuotaName")
    private String quotaName;

    @NameInMap("QuotaType")
    private String quotaType;

    @NameInMap("ResourceLevel")
    private String resourceLevel;

    @NameInMap("TotalQuota")
    private QuotaDetail totalQuota;

    @NameInMap("TotalTideQuota")
    private QuotaDetail totalTideQuota;

    @NameInMap("UsedQuota")
    private QuotaDetail usedQuota;

    @NameInMap("UsedTideQuota")
    private QuotaDetail usedTideQuota;

    private Quota(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.enableTideResource = builder.enableTideResource;
        this.isExclusiveQuota = builder.isExclusiveQuota;
        this.quotaId = builder.quotaId;
        this.quotaName = builder.quotaName;
        this.quotaType = builder.quotaType;
        this.resourceLevel = builder.resourceLevel;
        this.totalQuota = builder.totalQuota;
        this.totalTideQuota = builder.totalTideQuota;
        this.usedQuota = builder.usedQuota;
        this.usedTideQuota = builder.usedTideQuota;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Quota create() {
        return builder().build();
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return enableTideResource
     */
    public Boolean getEnableTideResource() {
        return this.enableTideResource;
    }

    /**
     * @return isExclusiveQuota
     */
    public Boolean getIsExclusiveQuota() {
        return this.isExclusiveQuota;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return quotaType
     */
    public String getQuotaType() {
        return this.quotaType;
    }

    /**
     * @return resourceLevel
     */
    public String getResourceLevel() {
        return this.resourceLevel;
    }

    /**
     * @return totalQuota
     */
    public QuotaDetail getTotalQuota() {
        return this.totalQuota;
    }

    /**
     * @return totalTideQuota
     */
    public QuotaDetail getTotalTideQuota() {
        return this.totalTideQuota;
    }

    /**
     * @return usedQuota
     */
    public QuotaDetail getUsedQuota() {
        return this.usedQuota;
    }

    /**
     * @return usedTideQuota
     */
    public QuotaDetail getUsedTideQuota() {
        return this.usedTideQuota;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private Boolean enableTideResource; 
        private Boolean isExclusiveQuota; 
        private String quotaId; 
        private String quotaName; 
        private String quotaType; 
        private String resourceLevel; 
        private QuotaDetail totalQuota; 
        private QuotaDetail totalTideQuota; 
        private QuotaDetail usedQuota; 
        private QuotaDetail usedTideQuota; 

        /**
         * ??????id
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ????????????
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * ??????????????????????????????
         */
        public Builder enableTideResource(Boolean enableTideResource) {
            this.enableTideResource = enableTideResource;
            return this;
        }

        /**
         * ???????????????Quota???
         */
        public Builder isExclusiveQuota(Boolean isExclusiveQuota) {
            this.isExclusiveQuota = isExclusiveQuota;
            return this;
        }

        /**
         * ????????????id
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder quotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }

        /**
         * ??????????????????????????????????????????
         */
        public Builder resourceLevel(String resourceLevel) {
            this.resourceLevel = resourceLevel;
            return this;
        }

        /**
         * ????????????
         */
        public Builder totalQuota(QuotaDetail totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder totalTideQuota(QuotaDetail totalTideQuota) {
            this.totalTideQuota = totalTideQuota;
            return this;
        }

        /**
         * ????????????
         */
        public Builder usedQuota(QuotaDetail usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        /**
         * ??????????????????
         */
        public Builder usedTideQuota(QuotaDetail usedTideQuota) {
            this.usedTideQuota = usedTideQuota;
            return this;
        }

        public Quota build() {
            return new Quota(this);
        } 

    } 

}
