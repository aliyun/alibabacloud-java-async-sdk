// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @Query
    @NameInMap("BackupSetID")
    private String backupSetID;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DBClusterCategory")
    @Validation(required = true)
    private String DBClusterCategory;

    @Query
    @NameInMap("DBClusterClass")
    @Validation(required = true)
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
    @Validation(required = true)
    private String DBNodeGroupCount;

    @Query
    @NameInMap("DBNodeStorage")
    @Validation(required = true)
    private String DBNodeStorage;

    @Query
    @NameInMap("DbNodeStorageType")
    @Validation(required = true)
    private String dbNodeStorageType;

    @Query
    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @Query
    @NameInMap("EncryptionType")
    private String encryptionType;

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
    @NameInMap("SourceDBClusterId")
    private String sourceDBClusterId;

    @Query
    @NameInMap("UsedTime")
    private String usedTime;

    @Query
    @NameInMap("VPCId")
    @Validation(required = true)
    private String VPCId;

    @Query
    @NameInMap("VSwitchBak")
    private String vSwitchBak;

    @Query
    @NameInMap("VSwitchBak2")
    private String vSwitchBak2;

    @Query
    @NameInMap("VSwitchId")
    @Validation(required = true)
    private String vSwitchId;

    @Query
    @NameInMap("ZondIdBak2")
    private String zondIdBak2;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("ZoneIdBak")
    private String zoneIdBak;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.backupSetID = builder.backupSetID;
        this.clientToken = builder.clientToken;
        this.DBClusterCategory = builder.DBClusterCategory;
        this.DBClusterClass = builder.DBClusterClass;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterNetworkType = builder.DBClusterNetworkType;
        this.DBClusterVersion = builder.DBClusterVersion;
        this.DBNodeGroupCount = builder.DBNodeGroupCount;
        this.DBNodeStorage = builder.DBNodeStorage;
        this.dbNodeStorageType = builder.dbNodeStorageType;
        this.encryptionKey = builder.encryptionKey;
        this.encryptionType = builder.encryptionType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceDBClusterId = builder.sourceDBClusterId;
        this.usedTime = builder.usedTime;
        this.VPCId = builder.VPCId;
        this.vSwitchBak = builder.vSwitchBak;
        this.vSwitchBak2 = builder.vSwitchBak2;
        this.vSwitchId = builder.vSwitchId;
        this.zondIdBak2 = builder.zondIdBak2;
        this.zoneId = builder.zoneId;
        this.zoneIdBak = builder.zoneIdBak;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDBInstanceRequest create() {
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
     * @return dbNodeStorageType
     */
    public String getDbNodeStorageType() {
        return this.dbNodeStorageType;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return encryptionType
     */
    public String getEncryptionType() {
        return this.encryptionType;
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
     * @return sourceDBClusterId
     */
    public String getSourceDBClusterId() {
        return this.sourceDBClusterId;
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
     * @return vSwitchBak
     */
    public String getVSwitchBak() {
        return this.vSwitchBak;
    }

    /**
     * @return vSwitchBak2
     */
    public String getVSwitchBak2() {
        return this.vSwitchBak2;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return zondIdBak2
     */
    public String getZondIdBak2() {
        return this.zondIdBak2;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneIdBak
     */
    public String getZoneIdBak() {
        return this.zoneIdBak;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private String backupSetID; 
        private String clientToken; 
        private String DBClusterCategory; 
        private String DBClusterClass; 
        private String DBClusterDescription; 
        private String DBClusterNetworkType; 
        private String DBClusterVersion; 
        private String DBNodeGroupCount; 
        private String DBNodeStorage; 
        private String dbNodeStorageType; 
        private String encryptionKey; 
        private String encryptionType; 
        private String ownerAccount; 
        private Long ownerId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String sourceDBClusterId; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchBak; 
        private String vSwitchBak2; 
        private String vSwitchId; 
        private String zondIdBak2; 
        private String zoneId; 
        private String zoneIdBak; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.backupSetID = request.backupSetID;
            this.clientToken = request.clientToken;
            this.DBClusterCategory = request.DBClusterCategory;
            this.DBClusterClass = request.DBClusterClass;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBClusterNetworkType = request.DBClusterNetworkType;
            this.DBClusterVersion = request.DBClusterVersion;
            this.DBNodeGroupCount = request.DBNodeGroupCount;
            this.DBNodeStorage = request.DBNodeStorage;
            this.dbNodeStorageType = request.dbNodeStorageType;
            this.encryptionKey = request.encryptionKey;
            this.encryptionType = request.encryptionType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceDBClusterId = request.sourceDBClusterId;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchBak = request.vSwitchBak;
            this.vSwitchBak2 = request.vSwitchBak2;
            this.vSwitchId = request.vSwitchId;
            this.zondIdBak2 = request.zondIdBak2;
            this.zoneId = request.zoneId;
            this.zoneIdBak = request.zoneIdBak;
        } 

        /**
         * The ID of the backup set. You can call the [DescribeBackups](~~360339~~) operation to query the backup sets.
         * <p>
         * 
         * >  If you want to restore the data of an ApsaraDB for ClickHouse cluster, this parameter is required.
         */
        public Builder backupSetID(String backupSetID) {
            this.putQueryParameter("BackupSetID", backupSetID);
            this.backupSetID = backupSetID;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. The value is a string and can be up to 64 ASCII characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The edition of the cluster. Valid values:
         * <p>
         * 
         * *   **Basic**: Single-replica Edition
         * *   **HighAvailability**: Double-replica Edition
         */
        public Builder DBClusterCategory(String DBClusterCategory) {
            this.putQueryParameter("DBClusterCategory", DBClusterCategory);
            this.DBClusterCategory = DBClusterCategory;
            return this;
        }

        /**
         * The specifications of the cluster.
         * <p>
         * 
         * *   Valid values when the cluster is of Single-replica Edition: -**S4**: 4 CPU cores and 16 GB of memory -**S8**: 8 CPU cores and 32 GB of memory -**S16**: 16 CPU cores and 64 GB of memory
         * 
         *     *   **S32**: 32 CPU cores and 128 GB of memory
         *     *   **S64**: 64 CPU cores and 256 GB of memory
         *     *   **S104**: 104 CPU cores and 384 GB of memory
         * 
         * *   Valid values when the cluster is of Double-replica Edition: -**C4**: 4 CPU cores and 16 GB of memory -**C8**: 8 CPU cores and 32 GB of memory -**C16**: 16 CPU cores and 64 GB of memory -**C32**: 32 CPU cores and 128 GB of memory -**C64**: 64 CPU cores and 256 GB of memory -**C104**: 104 CPU cores and 384 GB of memory
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.putQueryParameter("DBClusterClass", DBClusterClass);
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * The description of the cluster.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * The network type of the cluster. Only Virtual Private Cloud (VPC) is supported.
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.putQueryParameter("DBClusterNetworkType", DBClusterNetworkType);
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * The kernel version. Valid values:
         * <p>
         * 
         * *   **21.8.10.19**
         * *   **22.8.5.29**
         */
        public Builder DBClusterVersion(String DBClusterVersion) {
            this.putQueryParameter("DBClusterVersion", DBClusterVersion);
            this.DBClusterVersion = DBClusterVersion;
            return this;
        }

        /**
         * The number of nodes.
         * <p>
         * 
         * *   Valid values when the cluster is of Single-replica Edition: 1 to 48.
         * *   Valid values when the cluster is of Double-replica Edition: 1 to 24.
         */
        public Builder DBNodeGroupCount(String DBNodeGroupCount) {
            this.putQueryParameter("DBNodeGroupCount", DBNodeGroupCount);
            this.DBNodeGroupCount = DBNodeGroupCount;
            return this;
        }

        /**
         * The storage capacity of a single node. Valid values: 100 to 32000. Unit: GB.
         * <p>
         * 
         * >  This value is a multiple of 100.
         */
        public Builder DBNodeStorage(String DBNodeStorage) {
            this.putQueryParameter("DBNodeStorage", DBNodeStorage);
            this.DBNodeStorage = DBNodeStorage;
            return this;
        }

        /**
         * The storage type of the cluster. Valid values:
         * <p>
         * 
         * *   **CloudESSD_PL1**: The cluster uses an enhanced SSD (ESSD) of performance level (PL) 1.
         * *   **CloudESSD_PL2**: The cluster uses an ESSD of PL2.
         * *   **CloudESSD_PL3**: The cluster uses an ESSD of PL3.
         * *   **CloudEfficiency**: The cluster uses an ultra disk.
         */
        public Builder dbNodeStorageType(String dbNodeStorageType) {
            this.putQueryParameter("DbNodeStorageType", dbNodeStorageType);
            this.dbNodeStorageType = dbNodeStorageType;
            return this;
        }

        /**
         * You must specify this parameter when EncryptionType is set to CloudDisk.
         * <p>
         * 
         * The ID of the key that is used to encrypt data on disks. You can obtain the ID of the key from the Key Management Service (KMS) console. You can also create a key.
         * 
         * >  If EncryptionType is empty, you do not need to specify this parameter.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The encryption type. Set the value to **CloudDisk**, which indicates that only disk encryption is supported.
         * <p>
         * 
         * >  If this parameter is not specified, data is not encrypted.
         */
        public Builder encryptionType(String encryptionType) {
            this.putQueryParameter("EncryptionType", encryptionType);
            this.encryptionType = encryptionType;
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
         * The billing method of the cluster. Valid values:
         * <p>
         * 
         * *   **Postpaid**: The cluster uses the pay-as-you-go billing method.
         * *   **Prepaid**: The cluster uses the subscription billing method.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The unit of the subscription duration. This parameter is required when PayType is set to Prepaid.
         * <p>
         * 
         * Valid values:
         * 
         * *   **Year**
         * *   **Month**
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~170875~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group to which the cluster belongs.
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
         * The ID of the source cluster. You can call the [DescribeDBClusters](~~170879~~) operation to query backup set IDs.
         * <p>
         * 
         * >  If you want to restore the data of an ApsaraDB for ClickHouse cluster, this parameter is required.
         */
        public Builder sourceDBClusterId(String sourceDBClusterId) {
            this.putQueryParameter("SourceDBClusterId", sourceDBClusterId);
            this.sourceDBClusterId = sourceDBClusterId;
            return this;
        }

        /**
         * The subscription duration of the subscription cluster. This parameter is required when PayType is set to Prepaid.
         * <p>
         * 
         * Valid values:
         * 
         * *   If Period is set to Year, the value of UsedTime must be an integer that ranges from 1 to 3.
         * *   If Period is set to Month, the value of UsedTime must be an integer that ranges from 1 to 9.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The VPC ID.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * 备专有网络交换机
         */
        public Builder vSwitchBak(String vSwitchBak) {
            this.putQueryParameter("VSwitchBak", vSwitchBak);
            this.vSwitchBak = vSwitchBak;
            return this;
        }

        /**
         * 备专有网络交换机2
         */
        public Builder vSwitchBak2(String vSwitchBak2) {
            this.putQueryParameter("VSwitchBak2", vSwitchBak2);
            this.vSwitchBak2 = vSwitchBak2;
            return this;
        }

        /**
         * The vSwitch ID.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZondIdBak2.
         */
        public Builder zondIdBak2(String zondIdBak2) {
            this.putQueryParameter("ZondIdBak2", zondIdBak2);
            this.zondIdBak2 = zondIdBak2;
            return this;
        }

        /**
         * The zone ID. You can call the [DescribeRegions](~~170875~~) operation to query the most recent zone list.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * ZoneIdBak.
         */
        public Builder zoneIdBak(String zoneIdBak) {
            this.putQueryParameter("ZoneIdBak", zoneIdBak);
            this.zoneIdBak = zoneIdBak;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

}
