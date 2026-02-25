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

    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("GmtCreated")
    private String gmtCreated;

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
        this.createdBy = builder.createdBy;
        this.gmtCreated = builder.gmtCreated;
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
        private String createdBy; 
        private String gmtCreated; 
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
            this.createdBy = model.createdBy;
            this.gmtCreated = model.gmtCreated;
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
         * CacheInfos.
         */
        public Builder cacheInfos(java.util.List<CacheInfo> cacheInfos) {
            this.cacheInfos = cacheInfos;
            return this;
        }

        /**
         * CacheServiceId.
         */
        public Builder cacheServiceId(String cacheServiceId) {
            this.cacheServiceId = cacheServiceId;
            return this;
        }

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * GmtCreated.
         */
        public Builder gmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }

        /**
         * NetworkType.
         */
        public Builder networkType(String networkType) {
            this.networkType = networkType;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SupportRDMA.
         */
        public Builder supportRDMA(String supportRDMA) {
            this.supportRDMA = supportRDMA;
            return this;
        }

        /**
         * SupportedClientQuotaIds.
         */
        public Builder supportedClientQuotaIds(java.util.List<String> supportedClientQuotaIds) {
            this.supportedClientQuotaIds = supportedClientQuotaIds;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * UserVpc.
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
