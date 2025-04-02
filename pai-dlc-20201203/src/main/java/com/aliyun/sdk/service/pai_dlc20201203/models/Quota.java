// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link Quota} extends {@link TeaModel}
 *
 * <p>Quota</p>
 */
public class Quota extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("QuotaConfig")
    private QuotaConfig quotaConfig;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.NameInMap("QuotaType")
    private String quotaType;

    @com.aliyun.core.annotation.NameInMap("TotalQuota")
    private QuotaDetail totalQuota;

    @com.aliyun.core.annotation.NameInMap("TotalTideQuota")
    private QuotaDetail totalTideQuota;

    @com.aliyun.core.annotation.NameInMap("UsedQuota")
    private QuotaDetail usedQuota;

    @com.aliyun.core.annotation.NameInMap("UsedTideQuota")
    private QuotaDetail usedTideQuota;

    private Quota(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.quotaConfig = builder.quotaConfig;
        this.quotaId = builder.quotaId;
        this.quotaName = builder.quotaName;
        this.quotaType = builder.quotaType;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return quotaConfig
     */
    public QuotaConfig getQuotaConfig() {
        return this.quotaConfig;
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
        private QuotaConfig quotaConfig; 
        private String quotaId; 
        private String quotaName; 
        private String quotaType; 
        private QuotaDetail totalQuota; 
        private QuotaDetail totalTideQuota; 
        private QuotaDetail usedQuota; 
        private QuotaDetail usedTideQuota; 

        private Builder() {
        } 

        private Builder(Quota model) {
            this.clusterId = model.clusterId;
            this.clusterName = model.clusterName;
            this.quotaConfig = model.quotaConfig;
            this.quotaId = model.quotaId;
            this.quotaName = model.quotaName;
            this.quotaType = model.quotaType;
            this.totalQuota = model.totalQuota;
            this.totalTideQuota = model.totalTideQuota;
            this.usedQuota = model.usedQuota;
            this.usedTideQuota = model.usedTideQuota;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * QuotaConfig.
         */
        public Builder quotaConfig(QuotaConfig quotaConfig) {
            this.quotaConfig = quotaConfig;
            return this;
        }

        /**
         * QuotaId.
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * QuotaName.
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * QuotaType.
         */
        public Builder quotaType(String quotaType) {
            this.quotaType = quotaType;
            return this;
        }

        /**
         * TotalQuota.
         */
        public Builder totalQuota(QuotaDetail totalQuota) {
            this.totalQuota = totalQuota;
            return this;
        }

        /**
         * TotalTideQuota.
         */
        public Builder totalTideQuota(QuotaDetail totalTideQuota) {
            this.totalTideQuota = totalTideQuota;
            return this;
        }

        /**
         * UsedQuota.
         */
        public Builder usedQuota(QuotaDetail usedQuota) {
            this.usedQuota = usedQuota;
            return this;
        }

        /**
         * UsedTideQuota.
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
