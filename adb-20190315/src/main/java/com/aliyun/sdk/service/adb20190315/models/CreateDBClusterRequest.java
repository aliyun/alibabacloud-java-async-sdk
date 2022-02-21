// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterRequest</p>
 */
public class CreateDBClusterRequest extends Request {
    @Query
    @NameInMap("BackupSetID")
    private String backupSetID;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ComputeResource")
    private String computeResource;

    @Query
    @NameInMap("DBClusterCategory")
    @Validation(required = true)
    private String DBClusterCategory;

    @Query
    @NameInMap("DBClusterClass")
    private String DBClusterClass;

    @Query
    @NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @Query
    @NameInMap("DBClusterNetworkType")
    @Validation(required = true)
    private String DBClusterNetworkType;

    @Query
    @NameInMap("DBClusterVersion")
    @Validation(required = true)
    private String DBClusterVersion;

    @Query
    @NameInMap("DBNodeGroupCount")
    private String DBNodeGroupCount;

    @Query
    @NameInMap("DBNodeStorage")
    private String DBNodeStorage;

    @Query
    @NameInMap("ElasticIOResource")
    private String elasticIOResource;

    @Query
    @NameInMap("ExecutorCount")
    private String executorCount;

    @Query
    @NameInMap("Mode")
    private String mode;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RestoreTime")
    private String restoreTime;

    @Query
    @NameInMap("RestoreType")
    private String restoreType;

    @Query
    @NameInMap("SourceDBInstanceName")
    private String sourceDBInstanceName;

    @Query
    @NameInMap("StorageResource")
    private String storageResource;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("UsedTime")
    private String usedTime;

    @Query
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateDBClusterRequest(Builder builder) {
        super(builder);
        this.backupSetID = builder.backupSetID;
        this.clientToken = builder.clientToken;
        this.computeResource = builder.computeResource;
        this.DBClusterCategory = builder.DBClusterCategory;
        this.DBClusterClass = builder.DBClusterClass;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterNetworkType = builder.DBClusterNetworkType;
        this.DBClusterVersion = builder.DBClusterVersion;
        this.DBNodeGroupCount = builder.DBNodeGroupCount;
        this.DBNodeStorage = builder.DBNodeStorage;
        this.elasticIOResource = builder.elasticIOResource;
        this.executorCount = builder.executorCount;
        this.mode = builder.mode;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.sourceDBInstanceName = builder.sourceDBInstanceName;
        this.storageResource = builder.storageResource;
        this.storageType = builder.storageType;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupSetID
     */
    public String getBackupSetID() {
        return this.backupSetID;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return computeResource
     */
    public String getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return DBClusterCategory
     */
    public String getDBClusterCategory() {
        return this.DBClusterCategory;
    }

    /**
     * @return DBClusterClass
     */
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterNetworkType
     */
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    /**
     * @return DBClusterVersion
     */
    public String getDBClusterVersion() {
        return this.DBClusterVersion;
    }

    /**
     * @return DBNodeGroupCount
     */
    public String getDBNodeGroupCount() {
        return this.DBNodeGroupCount;
    }

    /**
     * @return DBNodeStorage
     */
    public String getDBNodeStorage() {
        return this.DBNodeStorage;
    }

    /**
     * @return elasticIOResource
     */
    public String getElasticIOResource() {
        return this.elasticIOResource;
    }

    /**
     * @return executorCount
     */
    public String getExecutorCount() {
        return this.executorCount;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
     * @return restoreTime
     */
    public String getRestoreTime() {
        return this.restoreTime;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return sourceDBInstanceName
     */
    public String getSourceDBInstanceName() {
        return this.sourceDBInstanceName;
    }

    /**
     * @return storageResource
     */
    public String getStorageResource() {
        return this.storageResource;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return VPCId
     */
    public String getVPCId() {
        return this.VPCId;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBClusterRequest, Builder> {
        private String backupSetID; 
        private String clientToken; 
        private String computeResource; 
        private String DBClusterCategory; 
        private String DBClusterClass; 
        private String DBClusterDescription; 
        private String DBClusterNetworkType; 
        private String DBClusterVersion; 
        private String DBNodeGroupCount; 
        private String DBNodeStorage; 
        private String elasticIOResource; 
        private String executorCount; 
        private String mode; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String sourceDBInstanceName; 
        private String storageResource; 
        private String storageType; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterRequest response) {
            super(response);
            this.backupSetID = response.backupSetID;
            this.clientToken = response.clientToken;
            this.computeResource = response.computeResource;
            this.DBClusterCategory = response.DBClusterCategory;
            this.DBClusterClass = response.DBClusterClass;
            this.DBClusterDescription = response.DBClusterDescription;
            this.DBClusterNetworkType = response.DBClusterNetworkType;
            this.DBClusterVersion = response.DBClusterVersion;
            this.DBNodeGroupCount = response.DBNodeGroupCount;
            this.DBNodeStorage = response.DBNodeStorage;
            this.elasticIOResource = response.elasticIOResource;
            this.executorCount = response.executorCount;
            this.mode = response.mode;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.payType = response.payType;
            this.period = response.period;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.restoreTime = response.restoreTime;
            this.restoreType = response.restoreType;
            this.sourceDBInstanceName = response.sourceDBInstanceName;
            this.storageResource = response.storageResource;
            this.storageType = response.storageType;
            this.usedTime = response.usedTime;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
        } 

        /**
         * BackupSetID.
         */
        public Builder backupSetID(String backupSetID) {
            this.putQueryParameter("BackupSetID", backupSetID);
            this.backupSetID = backupSetID;
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
         * ComputeResource.
         */
        public Builder computeResource(String computeResource) {
            this.putQueryParameter("ComputeResource", computeResource);
            this.computeResource = computeResource;
            return this;
        }

        /**
         * DBClusterCategory.
         */
        public Builder DBClusterCategory(String DBClusterCategory) {
            this.putQueryParameter("DBClusterCategory", DBClusterCategory);
            this.DBClusterCategory = DBClusterCategory;
            return this;
        }

        /**
         * DBClusterClass.
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.putQueryParameter("DBClusterClass", DBClusterClass);
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * DBClusterDescription.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * DBClusterNetworkType.
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.putQueryParameter("DBClusterNetworkType", DBClusterNetworkType);
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * DBClusterVersion.
         */
        public Builder DBClusterVersion(String DBClusterVersion) {
            this.putQueryParameter("DBClusterVersion", DBClusterVersion);
            this.DBClusterVersion = DBClusterVersion;
            return this;
        }

        /**
         * DBNodeGroupCount.
         */
        public Builder DBNodeGroupCount(String DBNodeGroupCount) {
            this.putQueryParameter("DBNodeGroupCount", DBNodeGroupCount);
            this.DBNodeGroupCount = DBNodeGroupCount;
            return this;
        }

        /**
         * DBNodeStorage.
         */
        public Builder DBNodeStorage(String DBNodeStorage) {
            this.putQueryParameter("DBNodeStorage", DBNodeStorage);
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }

        /**
         * ElasticIOResource.
         */
        public Builder elasticIOResource(String elasticIOResource) {
            this.putQueryParameter("ElasticIOResource", elasticIOResource);
            this.elasticIOResource = elasticIOResource;
            return this;
        }

        /**
         * ExecutorCount.
         */
        public Builder executorCount(String executorCount) {
            this.putQueryParameter("ExecutorCount", executorCount);
            this.executorCount = executorCount;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * RestoreTime.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * RestoreType.
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * SourceDBInstanceName.
         */
        public Builder sourceDBInstanceName(String sourceDBInstanceName) {
            this.putQueryParameter("SourceDBInstanceName", sourceDBInstanceName);
            this.sourceDBInstanceName = sourceDBInstanceName;
            return this;
        }

        /**
         * StorageResource.
         */
        public Builder storageResource(String storageResource) {
            this.putQueryParameter("StorageResource", storageResource);
            this.storageResource = storageResource;
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

        /**
         * UsedTime.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZoneId.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBClusterRequest build() {
            return new CreateDBClusterRequest(this);
        } 

    } 

}
