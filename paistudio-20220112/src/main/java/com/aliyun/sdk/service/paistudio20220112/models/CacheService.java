// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link CacheService} extends {@link TeaModel}
 *
 * <p>CacheService</p>
 */
public class CacheService extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CacheInfos")
    private java.util.List<CacheInfo> cacheInfos;

    @com.aliyun.core.annotation.NameInMap("CacheServiceId")
    private String cacheServiceId;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

    @com.aliyun.core.annotation.NameInMap("IsSharded")
    private Boolean isSharded;

    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.NameInMap("QuotaId")
    private String quotaId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SupportRDMA")
    private String supportRDMA;

    @com.aliyun.core.annotation.NameInMap("SupportedClientQuotaIds")
    private java.util.List<String> supportedClientQuotaIds;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    private CacheService(Builder builder) {
        this.cacheInfos = builder.cacheInfos;
        this.cacheServiceId = builder.cacheServiceId;
        this.clusterId = builder.clusterId;
        this.createdBy = builder.createdBy;
        this.gmtCreated = builder.gmtCreated;
        this.isSharded = builder.isSharded;
        this.networkType = builder.networkType;
        this.quotaId = builder.quotaId;
        this.status = builder.status;
        this.supportRDMA = builder.supportRDMA;
        this.supportedClientQuotaIds = builder.supportedClientQuotaIds;
        this.tenantId = builder.tenantId;
        this.userId = builder.userId;
        this.userVpc = builder.userVpc;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CacheService create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cacheInfos
     */
    public java.util.List<CacheInfo> getCacheInfos() {
        return this.cacheInfos;
    }

    /**
     * @return cacheServiceId
     */
    public String getCacheServiceId() {
        return this.cacheServiceId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return gmtCreated
     */
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    /**
     * @return isSharded
     */
    public Boolean getIsSharded() {
        return this.isSharded;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
    }

    /**
     * @return quotaId
     */
    public String getQuotaId() {
        return this.quotaId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return supportRDMA
     */
    public String getSupportRDMA() {
        return this.supportRDMA;
    }

    /**
     * @return supportedClientQuotaIds
     */
    public java.util.List<String> getSupportedClientQuotaIds() {
        return this.supportedClientQuotaIds;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public static final class Builder {
        private java.util.List<CacheInfo> cacheInfos; 
        private String cacheServiceId; 
        private String clusterId; 
        private String createdBy; 
        private String gmtCreated; 
        private Boolean isSharded; 
        private String networkType; 
        private String quotaId; 
        private String status; 
        private String supportRDMA; 
        private java.util.List<String> supportedClientQuotaIds; 
        private String tenantId; 
        private String userId; 
        private UserVpc userVpc; 

        private Builder() {
        } 

        private Builder(CacheService model) {
            this.cacheInfos = model.cacheInfos;
            this.cacheServiceId = model.cacheServiceId;
            this.clusterId = model.clusterId;
            this.createdBy = model.createdBy;
            this.gmtCreated = model.gmtCreated;
            this.isSharded = model.isSharded;
            this.networkType = model.networkType;
            this.quotaId = model.quotaId;
            this.status = model.status;
            this.supportRDMA = model.supportRDMA;
            this.supportedClientQuotaIds = model.supportedClientQuotaIds;
            this.tenantId = model.tenantId;
            this.userId = model.userId;
            this.userVpc = model.userVpc;
        } 

        /**
         * <p>The list of data source cache information connected to the cache service. Each element corresponds to a data source and its access port.</p>
         */
        public Builder cacheInfos(java.util.List<CacheInfo> cacheInfos) {
            this.cacheInfos = cacheInfos;
            return this;
        }

        /**
         * <p>The cache service ID. This is the unique identifier of the cache service.</p>
         * 
         * <strong>example:</strong>
         * <p>cachea1b2c3d4e5f</p>
         */
        public Builder cacheServiceId(String cacheServiceId) {
            this.cacheServiceId = cacheServiceId;
            return this;
        }

        /**
         * <p>The ID of the cluster where the cache service resides.</p>
         * 
         * <strong>example:</strong>
         * <p>c1a2b3c4d5e6f7a8b9c0d1e2f3a4b5c6</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the resource quota that created the cache service.</p>
         * 
         * <strong>example:</strong>
         * <p>quota1a2b3c4d5e6</p>
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>The time when the cache service was created, in UTC in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-10T03:17:31Z</p>
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * <p>Indicates whether the service discovery of the cache service uses shard mode.</p>
         */
        public Builder isSharded(Boolean isSharded) {
            this.isSharded = isSharded;
            return this;
        }

        /**
         * <p>The type of RDMA network interface controller used by the cache service. This parameter is returned only when SupportRDMA is set to true. Valid values:</p>
         * <ul>
         * <li>eic: EIC network interface controller.</li>
         * <li>mlx: Mellanox network interface controller.</li>
         * </ul>
         * <p>This parameter is empty when RDMA is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>eic</p>
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
            return this;
        }

        /**
         * <p>The ID of the resource quota to which the cache service belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>quota1a2b3c4d5e6</p>
         */
        public Builder quotaId(String quotaId) {
            this.quotaId = quotaId;
            return this;
        }

        /**
         * <p>The current status of the cache service.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the cache service supports access through RDMA networks.</p>
         */
        public Builder supportRDMA(String supportRDMA) {
            this.supportRDMA = supportRDMA;
            return this;
        }

        /**
         * <p>The list of client quota IDs that are allowed to access the cache service.</p>
         */
        public Builder supportedClientQuotaIds(java.util.List<String> supportedClientQuotaIds) {
            this.supportedClientQuotaIds = supportedClientQuotaIds;
            return this;
        }

        /**
         * <p>The tenant ID to which the cache service belongs, which is the Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123456</p>
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the user who created the cache service.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789012345678</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The VPC network information of the cache service, including the VPC, vSwitch, and security group configurations.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
            return this;
        }

        public CacheService build() {
            return new CacheService(this);
        } 

    } 

}
