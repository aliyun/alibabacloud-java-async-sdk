// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
    @NameInMap("AccountPassword")
    private String accountPassword;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("BusinessInfo")
    private String businessInfo;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("CouponNo")
    private String couponNo;

    @Query
    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @Query
    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    private Integer DBInstanceStorage;

    @Query
    @NameInMap("DatabaseNames")
    private String databaseNames;

    @Query
    @NameInMap("Encrypted")
    private Boolean encrypted;

    @Query
    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @Query
    @NameInMap("Engine")
    @Validation(required = true)
    private String engine;

    @Query
    @NameInMap("EngineVersion")
    @Validation(required = true)
    private String engineVersion;

    @Query
    @NameInMap("GlobalSecurityGroupIds")
    private String globalSecurityGroupIds;

    @Query
    @NameInMap("HiddenZoneId")
    private String hiddenZoneId;

    @Query
    @NameInMap("NetworkType")
    private String networkType;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("ReadonlyReplicas")
    private String readonlyReplicas;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicationFactor")
    private String replicationFactor;

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
    @NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @Query
    @NameInMap("SecurityIPList")
    private String securityIPList;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("SrcDBInstanceId")
    private String srcDBInstanceId;

    @Query
    @NameInMap("StorageEngine")
    private String storageEngine;

    @Query
    @NameInMap("StorageType")
    private String storageType;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.accountPassword = builder.accountPassword;
        this.autoRenew = builder.autoRenew;
        this.backupId = builder.backupId;
        this.businessInfo = builder.businessInfo;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
        this.couponNo = builder.couponNo;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.databaseNames = builder.databaseNames;
        this.encrypted = builder.encrypted;
        this.encryptionKey = builder.encryptionKey;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.globalSecurityGroupIds = builder.globalSecurityGroupIds;
        this.hiddenZoneId = builder.hiddenZoneId;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.readonlyReplicas = builder.readonlyReplicas;
        this.regionId = builder.regionId;
        this.replicationFactor = builder.replicationFactor;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.securityIPList = builder.securityIPList;
        this.securityToken = builder.securityToken;
        this.srcDBInstanceId = builder.srcDBInstanceId;
        this.storageEngine = builder.storageEngine;
        this.storageType = builder.storageType;
        this.tag = builder.tag;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.zoneId = builder.zoneId;
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
     * @return accountPassword
     */
    public String getAccountPassword() {
        return this.accountPassword;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return DBInstanceClass
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * @return DBInstanceDescription
     */
    public String getDBInstanceDescription() {
        return this.DBInstanceDescription;
    }

    /**
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return databaseNames
     */
    public String getDatabaseNames() {
        return this.databaseNames;
    }

    /**
     * @return encrypted
     */
    public Boolean getEncrypted() {
        return this.encrypted;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return engineVersion
     */
    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * @return globalSecurityGroupIds
     */
    public String getGlobalSecurityGroupIds() {
        return this.globalSecurityGroupIds;
    }

    /**
     * @return hiddenZoneId
     */
    public String getHiddenZoneId() {
        return this.hiddenZoneId;
    }

    /**
     * @return networkType
     */
    public String getNetworkType() {
        return this.networkType;
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
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return readonlyReplicas
     */
    public String getReadonlyReplicas() {
        return this.readonlyReplicas;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicationFactor
     */
    public String getReplicationFactor() {
        return this.replicationFactor;
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
     * @return secondaryZoneId
     */
    public String getSecondaryZoneId() {
        return this.secondaryZoneId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return srcDBInstanceId
     */
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    /**
     * @return storageEngine
     */
    public String getStorageEngine() {
        return this.storageEngine;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private String accountPassword; 
        private String autoRenew; 
        private String backupId; 
        private String businessInfo; 
        private String chargeType; 
        private String clientToken; 
        private String clusterId; 
        private String couponNo; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private Integer DBInstanceStorage; 
        private String databaseNames; 
        private Boolean encrypted; 
        private String encryptionKey; 
        private String engine; 
        private String engineVersion; 
        private String globalSecurityGroupIds; 
        private String hiddenZoneId; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private String readonlyReplicas; 
        private String regionId; 
        private String replicationFactor; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String secondaryZoneId; 
        private String securityIPList; 
        private String securityToken; 
        private String srcDBInstanceId; 
        private String storageEngine; 
        private String storageType; 
        private java.util.List < Tag> tag; 
        private String vSwitchId; 
        private String vpcId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.accountPassword = request.accountPassword;
            this.autoRenew = request.autoRenew;
            this.backupId = request.backupId;
            this.businessInfo = request.businessInfo;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
            this.couponNo = request.couponNo;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.databaseNames = request.databaseNames;
            this.encrypted = request.encrypted;
            this.encryptionKey = request.encryptionKey;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.globalSecurityGroupIds = request.globalSecurityGroupIds;
            this.hiddenZoneId = request.hiddenZoneId;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.readonlyReplicas = request.readonlyReplicas;
            this.regionId = request.regionId;
            this.replicationFactor = request.replicationFactor;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.secondaryZoneId = request.secondaryZoneId;
            this.securityIPList = request.securityIPList;
            this.securityToken = request.securityToken;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.storageEngine = request.storageEngine;
            this.storageType = request.storageType;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * The network type of the instance. Set the value to VPC.
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * The storage engine of the instance. Default value: WiredTiger. Valid values:
         * <p>
         * 
         * *   **WiredTiger**
         * *   **RocksDB**
         * *   **TerarkDB**
         * 
         * >  *   When you call this operation to clone an instance or restore an instance from the recycle bin, set the value of this parameter to the storage engine of the source instance.
         * >  *   For more information about the limits on database versions and storage engines, see [MongoDB versions and storage engines](~~61906~~).
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the instance. Default value: false. Valid values:
         * <p>
         * 
         * *   **true**: The instance is automatically renewed.
         * *   **false**: The instance is manually renewed.
         * 
         * > This parameter is valid and optional when the **ChargeType** parameter is set to **PrePaid**.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The coupon code. Default value: `youhuiquan_promotion_option_id_for_blank`.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * The ID of the VPC.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The version of the database engine. Valid values:
         * <p>
         * 
         * *   **6.0**
         * *   **5.0**
         * *   **4.4**
         * *   **4.2**
         * *   **4.0**
         * 
         * > When you call this operation to clone an instance or restore an instance from the recycle bin, set the value of this parameter to the engine version of the source instance.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * cn
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of **read-only nodes** in the replica set instance. Default value: **0**. Valid values: **0** to **5**.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * The IP addresses in an IP address whitelist. Multiple IP addresses are separated by commas (,), and each IP address in the IP address whitelist must be unique. The following types of values are supported:
         * <p>
         * 
         * *   0.0.0.0/0
         * *   IP addresses, such as 10.23.12.24.
         * *   Classless Inter-Domain Routing (CIDR) blocks, such as 10.23.12.0/24. In this case, /24 indicates that the prefix of each IP address is 24-bit long. You can replace 24 with a value within the range of 1 to 32.
         * 
         * > *   A maximum of 1,000 IP addresses or CIDR blocks can be configured for each instance.
         * > *   If you enter 0.0.0.0/0, all IP addresses can access the instance. This may introduce security risks to the instance. Proceed with caution.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **PostPaid**: pay-as-you-go. This is the default value.
         * *   **PrePaid**: subscription.
         * 
         * > If you set this parameter to **PrePaid**, you must also specify the **Period** parameter.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The password of the root account. The password must meet the following requirements:
         * <p>
         * 
         * *   The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.
         * *   Special characters include ! # $ % ^ & \* ( ) \_ + - =
         * *   The password of the account must be 8 to 32 characters in length.
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The number of **nodes** in the replica set instance. Default value: 3. Valid values:
         * <p>
         * 
         * *   **3**
         * *   **5**
         * *   **7**
         */
        public Builder databaseNames(String databaseNames) {
            this.putQueryParameter("DatabaseNames", databaseNames);
            this.databaseNames = databaseNames;
            return this;
        }

        /**
         * Encrypted.
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The storage capacity of the instance. Unit: GB.
         * <p>
         * 
         * The values that can be specified for this parameter vary based on the instance types. For more information, see [Replica set instance types](~~311410~~).
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The name of the instance. The name of the instance must meet the following requirements:
         * <p>
         * 
         * *   The name must start with a letter.
         * *   The name can contain digits, letters, underscores (\_), and hyphens (-).
         * *   The name must be 2 to 256 characters in length.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder globalSecurityGroupIds(String globalSecurityGroupIds) {
            this.putQueryParameter("GlobalSecurityGroupIds", globalSecurityGroupIds);
            this.globalSecurityGroupIds = globalSecurityGroupIds;
            return this;
        }

        /**
         * Template for global IP whitelist of the instance, multiple IP whitelist templates should be separated by a comma (,) in English and cannot be repeated. (In function gray scale).
         */
        public Builder hiddenZoneId(String hiddenZoneId) {
            this.putQueryParameter("HiddenZoneId", hiddenZoneId);
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }

        /**
         * The ID of the source instance.
         * <p>
         * 
         * > When you call this operation to clone an instance, this parameter is required. The **BackupId** or **RestoreTime** parameter is also required. When you call this operation to restore an instance from the recycle bin, this parameter is required. The **BackupId** or **RestoreTime** parameter is not required.
         */
        public Builder networkType(String networkType) {
            this.putQueryParameter("NetworkType", networkType);
            this.networkType = networkType;
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
         * The ID of the vSwitch to which the instance is connected.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **cloud_essd1** :ESSD PL1.
         * *   **cloud_essd2**: ESSD PL2.
         * *   **cloud_essd3**: ESSD PL3.
         * *   **local_ssd**: local SSD.
         */
        public Builder readonlyReplicas(String readonlyReplicas) {
            this.putQueryParameter("ReadonlyReplicas", readonlyReplicas);
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }

        /**
         * The database engine of the instance. The value is fixed as **MongoDB**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the dedicated cluster to which the instance belongs.
         */
        public Builder replicationFactor(String replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
            return this;
        }

        /**
         * The zone where the secondary node resides for multi-zone deployment. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou-g**: Hangzhou Zone G.
         * *   **cn-hangzhou-h**: Hangzhou Zone H.
         * *   **cn-hangzhou-i**: Hangzhou Zone I.
         * *   **cn-hongkong-b**: Hongkong Zone B.
         * *   **cn-hongkong-c**: Hongkong Zone C.
         * *   **cn-hongkong-d**: Hongkong Zone D.
         * *   **cn-wulanchabu-a**: Ulanqab Zone A.
         * *   **cn-wulanchabu-b**: Ulanqab Zone B.
         * *   **cn-wulanchabu-c**: Ulanqab Zone C.
         * *   **ap-southeast-1a**: Singapore Zone A.
         * *   **ap-southeast-1b**: Singapore Zone B.
         * *   **ap-southeast-1c**: Singapore Zone C.
         * *   **ap-southeast-5a**: Jakarta Zone A.
         * *   **ap-southeast-5b**: Jakarta Zone B.
         * *   **ap-southeast-5c**: Jakarta Zone C.
         * *   **eu-central-1a**: Frankfurt Zone A.
         * *   **eu-central-1b**: Frankfurt Zone B.
         * *   **eu-central-1c**: Frankfurt Zone C.
         * 
         * >  *   This parameter is valid and required when the **EngineVersion** parameter is set to **4.4** or **5.0**.
         * >  *   The value of this parameter cannot be the same as the value of the **ZoneId** or **HiddenZoneId** parameter.
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
         * The name of the database.
         * <p>
         * 
         * > When you call this operation to clone an instance, you can set this parameter to specify the database to clone. Otherwise, all databases of the instance are cloned.
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * cn
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * The subscription period of the instance. Unit: months.
         * <p>
         * 
         * Valid values: **1** to **9**, **12**, **24**, **36**, and **60**.
         * 
         * > When you set the **ChargeType** parameter to **PrePaid**, this parameter is valid and required.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * The business information. This is an additional parameter.
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs.
         */
        public Builder storageEngine(String storageEngine) {
            this.putQueryParameter("StorageEngine", storageEngine);
            this.storageEngine = storageEngine;
            return this;
        }

        /**
         * The zone where the hidden node resides for multi-zone deployment. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou-g**: Hangzhou Zone G.
         * *   **cn-hangzhou-h**: Hangzhou Zone H.
         * *   **cn-hangzhou-i**: Hangzhou Zone I.
         * *   **cn-hongkong-b**: Hongkong Zone B.
         * *   **cn-hongkong-c**: Hongkong Zone C.
         * *   **cn-hongkong-d**: Hongkong Zone D.
         * *   **cn-wulanchabu-a**: Ulanqab Zone A.
         * *   **cn-wulanchabu-b**: Ulanqab Zone B.
         * *   **cn-wulanchabu-c**: Ulanqab Zone C.
         * *   **ap-southeast-1a**: Singapore Zone A.
         * *   **ap-southeast-1b**: Singapore Zone B.
         * *   **ap-southeast-1c**: Singapore Zone C.
         * *   **ap-southeast-5a**: Jakarta Zone A.
         * *   **ap-southeast-5b**: Jakarta Zone B.
         * *   **ap-southeast-5c**: Jakarta Zone C.
         * *   **eu-central-1a**: Frankfurt Zone A.
         * *   **eu-central-1b**: Frankfurt Zone B.
         * *   **eu-central-1c**: Frankfurt Zone C.
         * 
         * >  *   This parameter is valid and required when the **EngineVersion** parameter is set to **4.4** or **5.0**.
         * >  *   The value of this parameter cannot be the same as the value of the **ZoneId** or **SecondaryZoneId** parameter.
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The point in time to which the instance is restored, which must be within seven days. The time is displayed in the *yyyy-MM-dd*T*HH:mm:ss*Z format (UTC time).
         * <p>
         * 
         * > When you call this operation to restore an instance to the specified time, this parameter is required. The **SrcDBInstanceId** parameter is also required.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The ID of the backup set. You can call the [DescribeBackups](~~62172~~) operation to query the backup set ID.
         * <p>
         * 
         * > When you call this operation to clone an instance based on the backup set, this parameter is required. The **SrcDBInstanceId** parameter is also required.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * The instance type. You can also call the [DescribeAvailableResource](~~149719~~) operation to query the instance type.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
