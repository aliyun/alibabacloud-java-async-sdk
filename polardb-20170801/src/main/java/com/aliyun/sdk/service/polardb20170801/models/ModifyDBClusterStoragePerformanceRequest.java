// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyDBClusterStoragePerformanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterStoragePerformanceRequest</p>
 */
public class ModifyDBClusterStoragePerformanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private String burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModifyType")
    private String modifyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private Integer provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    private ModifyDBClusterStoragePerformanceRequest(Builder builder) {
        super(builder);
        this.burstingEnabled = builder.burstingEnabled;
        this.clientToken = builder.clientToken;
        this.DBClusterId = builder.DBClusterId;
        this.modifyType = builder.modifyType;
        this.provisionedIops = builder.provisionedIops;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterStoragePerformanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return burstingEnabled
     */
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return modifyType
     */
    public String getModifyType() {
        return this.modifyType;
    }

    /**
     * @return provisionedIops
     */
    public Integer getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterStoragePerformanceRequest, Builder> {
        private String burstingEnabled; 
        private String clientToken; 
        private String DBClusterId; 
        private String modifyType; 
        private Integer provisionedIops; 
        private Long resourceOwnerId; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterStoragePerformanceRequest request) {
            super(request);
            this.burstingEnabled = request.burstingEnabled;
            this.clientToken = request.clientToken;
            this.DBClusterId = request.DBClusterId;
            this.modifyType = request.modifyType;
            this.provisionedIops = request.provisionedIops;
            this.resourceOwnerId = request.resourceOwnerId;
            this.storageType = request.storageType;
        } 

        /**
         * BurstingEnabled.
         */
        public Builder burstingEnabled(String burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * ModifyType.
         */
        public Builder modifyType(String modifyType) {
            this.putQueryParameter("ModifyType", modifyType);
            this.modifyType = modifyType;
            return this;
        }

        /**
         * ProvisionedIops.
         */
        public Builder provisionedIops(Integer provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public ModifyDBClusterStoragePerformanceRequest build() {
            return new ModifyDBClusterStoragePerformanceRequest(this);
        } 

    } 

}
