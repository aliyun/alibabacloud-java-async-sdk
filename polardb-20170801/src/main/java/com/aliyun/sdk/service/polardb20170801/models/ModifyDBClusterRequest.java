// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterRequest</p>
 */
public class ModifyDBClusterRequest extends Request {
    @Query
    @NameInMap("CompressStorage")
    private String compressStorage;

    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("DataSyncMode")
    private String dataSyncMode;

    @Query
    @NameInMap("FaultSimulateMode")
    private String faultSimulateMode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("StandbyHAMode")
    private String standbyHAMode;

    @Query
    @NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @Query
    @NameInMap("StorageUpperBound")
    @Validation(maximum = 64000, minimum = 20)
    private Long storageUpperBound;

    private ModifyDBClusterRequest(Builder builder) {
        super(builder);
        this.compressStorage = builder.compressStorage;
        this.DBClusterId = builder.DBClusterId;
        this.dataSyncMode = builder.dataSyncMode;
        this.faultSimulateMode = builder.faultSimulateMode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.standbyHAMode = builder.standbyHAMode;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageUpperBound = builder.storageUpperBound;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compressStorage
     */
    public String getCompressStorage() {
        return this.compressStorage;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return dataSyncMode
     */
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    /**
     * @return faultSimulateMode
     */
    public String getFaultSimulateMode() {
        return this.faultSimulateMode;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return standbyHAMode
     */
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    /**
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    /**
     * @return storageUpperBound
     */
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterRequest, Builder> {
        private String compressStorage; 
        private String DBClusterId; 
        private String dataSyncMode; 
        private String faultSimulateMode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String standbyHAMode; 
        private String storageAutoScale; 
        private Long storageUpperBound; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterRequest request) {
            super(request);
            this.compressStorage = request.compressStorage;
            this.DBClusterId = request.DBClusterId;
            this.dataSyncMode = request.dataSyncMode;
            this.faultSimulateMode = request.faultSimulateMode;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.standbyHAMode = request.standbyHAMode;
            this.storageAutoScale = request.storageAutoScale;
            this.storageUpperBound = request.storageUpperBound;
        } 

        /**
         * Enable storage compression function. The value of this parameter is ON.
         */
        public Builder compressStorage(String compressStorage) {
            this.putQueryParameter("CompressStorage", compressStorage);
            this.compressStorage = compressStorage;
            return this;
        }

        /**
         * The cluster ID.
         * <p>
         * 
         * >  You can call the DescribeDBClusters operation to query information about all PolarDB clusters that are deployed in a specified region, such as cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The method used to replicate data across zones. Valid values:
         * <p>
         * 
         * *   **AsyncSync**: the asynchronous mode.
         * *   **SemiSync**: the semi-synchronous mode.
         */
        public Builder dataSyncMode(String dataSyncMode) {
            this.putQueryParameter("DataSyncMode", dataSyncMode);
            this.dataSyncMode = dataSyncMode;
            return this;
        }

        /**
         * The fault scenario that you want to simulate for the cluster.
         * <p>
         * 
         * *   Set the value to **0**. The value 0 indicates the scenario in which the primary zone of the cluster fails.
         * 
         * > 
         * 
         * *   This parameter takes effect only when you set the `StandbyHAMode` parameter to 0.
         * 
         * *   If you set this parameter to 0, all compute nodes deployed in the primary zone are unavailable. In this case, the switchover degrades the cluster performance.
         */
        public Builder faultSimulateMode(String faultSimulateMode) {
            this.putQueryParameter("FaultSimulateMode", faultSimulateMode);
            this.faultSimulateMode = faultSimulateMode;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
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
         * Specifies whether to enable the cross-zone automatic switchover mode. Valid values:
         * <p>
         * 
         * *   **ON**: Enable the cross-zone automatic switchover mode.
         * *   **OFF**: Disable the cross-zone automatic switchover mode.
         * *   **0**: Enable the customer drill mode.
         */
        public Builder standbyHAMode(String standbyHAMode) {
            this.putQueryParameter("StandbyHAMode", standbyHAMode);
            this.standbyHAMode = standbyHAMode;
            return this;
        }

        /**
         * Specifies whether to enable automatic storage scaling for the cluster of Standard Edition. Valid values:
         * <p>
         * 
         * *   Enable
         * *   Disable
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * The maximum storage capacity of the cluster of Standard Edition in automatic scaling. Unit: GB.
         * <p>
         * 
         * >  The maximum value of this parameter is 32000.
         */
        public Builder storageUpperBound(Long storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        @Override
        public ModifyDBClusterRequest build() {
            return new ModifyDBClusterRequest(this);
        } 

    } 

}
