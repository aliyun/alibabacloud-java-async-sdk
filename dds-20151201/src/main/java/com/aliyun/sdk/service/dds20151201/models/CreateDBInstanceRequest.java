// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountPassword")
    private String accountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseNames")
    private String databaseNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Encrypted")
    private Boolean encrypted;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupIds")
    private String globalSecurityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HiddenZoneId")
    private String hiddenZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainEndTime")
    private String maintainEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaintainStartTime")
    private String maintainStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkType")
    private String networkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private Long provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadonlyReplicas")
    private String readonlyReplicas;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReplicationFactor")
    private String replicationFactor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreTime")
    private String restoreTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RestoreType")
    private String restoreType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecondaryZoneId")
    private String secondaryZoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcDBInstanceId")
    private String srcDBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcRegion")
    private String srcRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageEngine")
    private String storageEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TTLEnabled")
    private Boolean TTLEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
        this.dryRun = builder.dryRun;
        this.encrypted = builder.encrypted;
        this.encryptionKey = builder.encryptionKey;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.globalSecurityGroupIds = builder.globalSecurityGroupIds;
        this.hiddenZoneId = builder.hiddenZoneId;
        this.maintainEndTime = builder.maintainEndTime;
        this.maintainStartTime = builder.maintainStartTime;
        this.networkType = builder.networkType;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.provisionedIops = builder.provisionedIops;
        this.readonlyReplicas = builder.readonlyReplicas;
        this.regionId = builder.regionId;
        this.replicationFactor = builder.replicationFactor;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.restoreTime = builder.restoreTime;
        this.restoreType = builder.restoreType;
        this.secondaryZoneId = builder.secondaryZoneId;
        this.securityIPList = builder.securityIPList;
        this.srcDBInstanceId = builder.srcDBInstanceId;
        this.srcRegion = builder.srcRegion;
        this.storageEngine = builder.storageEngine;
        this.storageType = builder.storageType;
        this.TTLEnabled = builder.TTLEnabled;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return maintainEndTime
     */
    public String getMaintainEndTime() {
        return this.maintainEndTime;
    }

    /**
     * @return maintainStartTime
     */
    public String getMaintainStartTime() {
        return this.maintainStartTime;
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
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
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
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
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
     * @return srcDBInstanceId
     */
    public String getSrcDBInstanceId() {
        return this.srcDBInstanceId;
    }

    /**
     * @return srcRegion
     */
    public String getSrcRegion() {
        return this.srcRegion;
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
     * @return TTLEnabled
     */
    public Boolean getTTLEnabled() {
        return this.TTLEnabled;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
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
        private Boolean dryRun; 
        private Boolean encrypted; 
        private String encryptionKey; 
        private String engine; 
        private String engineVersion; 
        private String globalSecurityGroupIds; 
        private String hiddenZoneId; 
        private String maintainEndTime; 
        private String maintainStartTime; 
        private String networkType; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer period; 
        private Long provisionedIops; 
        private String readonlyReplicas; 
        private String regionId; 
        private String replicationFactor; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String restoreTime; 
        private String restoreType; 
        private String secondaryZoneId; 
        private String securityIPList; 
        private String srcDBInstanceId; 
        private String srcRegion; 
        private String storageEngine; 
        private String storageType; 
        private Boolean TTLEnabled; 
        private java.util.List<Tag> tag; 
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
            this.dryRun = request.dryRun;
            this.encrypted = request.encrypted;
            this.encryptionKey = request.encryptionKey;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.globalSecurityGroupIds = request.globalSecurityGroupIds;
            this.hiddenZoneId = request.hiddenZoneId;
            this.maintainEndTime = request.maintainEndTime;
            this.maintainStartTime = request.maintainStartTime;
            this.networkType = request.networkType;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.provisionedIops = request.provisionedIops;
            this.readonlyReplicas = request.readonlyReplicas;
            this.regionId = request.regionId;
            this.replicationFactor = request.replicationFactor;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.restoreTime = request.restoreTime;
            this.restoreType = request.restoreType;
            this.secondaryZoneId = request.secondaryZoneId;
            this.securityIPList = request.securityIPList;
            this.srcDBInstanceId = request.srcDBInstanceId;
            this.srcRegion = request.srcRegion;
            this.storageEngine = request.storageEngine;
            this.storageType = request.storageType;
            this.TTLEnabled = request.TTLEnabled;
            this.tag = request.tag;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The password of the root account. The password must meet the following requirements:</p>
         * <ul>
         * <li>It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters.</li>
         * <li>Special characters include !@#$%^&amp;*()_+-=.</li>
         * <li>It must be 8 to 32 characters in length.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about how to resolve the issue where database connection fails due to special characters in the account password in the connection string, see <a href="https://help.aliyun.com/document_detail/471568.html">What do I do if the connection to an ApsaraDB for MongoDB instance fails because the username or password in the connection string contains special characters?</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123456Aa</p>
         */
        public Builder accountPassword(String accountPassword) {
            this.putQueryParameter("AccountPassword", accountPassword);
            this.accountPassword = accountPassword;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables auto-renewal.</li>
         * <li><strong>false</strong>: disables auto-renewal. In this case, you must manually renew the instance. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid and optional only when the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The ID of the backup set. You can call the <a href="https://help.aliyun.com/document_detail/62172.html">DescribeBackups</a> operation to query the backup set ID.</p>
         * <blockquote>
         * <p>This parameter is required only when you call this operation to clone an instance from a backup set. You must also specify the <strong>SrcDBInstanceId</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>32994****</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The additional parameter for business information.</p>
         * 
         * <strong>example:</strong>
         * <p>{“ActivityId&quot;:&quot;000000000&quot;}</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PostPaid</strong>: pay-as-you-go. This is the default value.</li>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * </ul>
         * <blockquote>
         * <p>When this parameter is set to <strong>PrePaid</strong>, you must also specify the <strong>Period</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can generate the value of this parameter on the client side. The value must be unique across different requests and can be up to 64 ASCII characters in length. The value cannot contain non-ASCII characters.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><strong>default</strong> or <strong>null</strong>: uses a coupon. This is the default value.</li>
         * <li><strong>youhuiquan_promotion_option_id_for_blank</strong>: does not use a coupon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The instance type. You can call the <a href="https://help.aliyun.com/document_detail/149719.html">DescribeAvailableResource</a> operation to query the available instance types.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dds.mongo.standard</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The name of the instance. The name must meet the following requirements:</p>
         * <ul>
         * <li>It must start with a letter or a Chinese character.</li>
         * <li>It can contain digits, letters, Chinese characters, underscores (_), periods (.), and hyphens (-).</li>
         * <li>It must be 2 to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The instance storage. Unit: GB.</p>
         * <p>The valid values are subject to the instance type. For details, see <a href="https://help.aliyun.com/document_detail/311410.html">Replica set instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <blockquote>
         * <p>When you call this operation to clone an instance, you can specify this parameter to specify the databases to be cloned. If you do not specify this parameter, all databases of the instance are cloned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>mongodbtest</p>
         */
        public Builder databaseNames(String databaseNames) {
            this.putQueryParameter("DatabaseNames", databaseNames);
            this.databaseNames = databaseNames;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run on the request. Valid values:</p>
         * <ul>
         * <li>true: performs a dry run without calling the operation. The system checks items such as request parameters, request format, business limits, and inventory. If the check fails, the corresponding error is returned. If the check succeeds, the DryRunOperation error code is returned.</li>
         * <li>false (default): sends a normal request. After the check succeeds, the operation is directly executed.</li>
         * </ul>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Specifies whether to enable cloud disk encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder encrypted(Boolean encrypted) {
            this.putQueryParameter("Encrypted", encrypted);
            this.encrypted = encrypted;
            return this;
        }

        /**
         * <p>The ID of the custom key.</p>
         * 
         * <strong>example:</strong>
         * <p>2axxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The database engine. Set the value to <strong>MongoDB</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>MongoDB</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version. Valid values:</p>
         * <ul>
         * <li><strong>8.0</strong></li>
         * <li><strong>7.0</strong></li>
         * <li><strong>6.0</strong></li>
         * <li><strong>5.0</strong></li>
         * <li><strong>4.4</strong></li>
         * <li><strong>4.2</strong></li>
         * <li><strong>4.0</strong></li>
         * </ul>
         * <blockquote>
         * <p>When you call this operation to clone clone instance or restore clone instance from the recycle bin, the value of this parameter must be the same as that of the source instance.</p>
         * </blockquote>
         * <blockquote>
         * <p>Warning: Versions 3.4 and earlier are no longer available for sale.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4.4</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The global IP address whitelist templates of the instance. Separate multiple templates with commas (,). Duplicate templates are not allowed. This feature is in canary release.</p>
         * 
         * <strong>example:</strong>
         * <p>g-qxieqf40xjst1ngpr3jz</p>
         */
        public Builder globalSecurityGroupIds(String globalSecurityGroupIds) {
            this.putQueryParameter("GlobalSecurityGroupIds", globalSecurityGroupIds);
            this.globalSecurityGroupIds = globalSecurityGroupIds;
            return this;
        }

        /**
         * <p>The zone where the hidden node resides. You can specify this parameter for multi-zone deployment. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G.</li>
         * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H.</li>
         * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I.</li>
         * <li><strong>cn-hongkong-b</strong>: Hong Kong (China) Zone B.</li>
         * <li><strong>cn-hongkong-c</strong>: Hong Kong (China) Zone C.</li>
         * <li><strong>cn-hongkong-d</strong>: Hong Kong (China) Zone D.</li>
         * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A.</li>
         * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B.</li>
         * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C.</li>
         * <li><strong>ap-southeast-1a</strong>: Singapore Zone A.</li>
         * <li><strong>ap-southeast-1b</strong>: Singapore Zone B.</li>
         * <li><strong>ap-southeast-1c</strong>: Singapore Zone C.</li>
         * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A.</li>
         * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B.</li>
         * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C.</li>
         * <li><strong>eu-central-1a</strong>: Frankfurt Zone A.</li>
         * <li><strong>eu-central-1b</strong>: Frankfurt Zone B.</li>
         * <li><strong>eu-central-1c</strong>: Frankfurt Zone C.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is active only when the instance uses cloud disks.</li>
         * <li>The value of this parameter cannot be the same as the value of the <strong>ZoneId</strong> or <strong>SecondaryZoneId</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        public Builder hiddenZoneId(String hiddenZoneId) {
            this.putQueryParameter("HiddenZoneId", hiddenZoneId);
            this.hiddenZoneId = hiddenZoneId;
            return this;
        }

        /**
         * <p>The end time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>22:00Z</p>
         */
        public Builder maintainEndTime(String maintainEndTime) {
            this.putQueryParameter("MaintainEndTime", maintainEndTime);
            this.maintainEndTime = maintainEndTime;
            return this;
        }

        /**
         * <p>The start time of the maintenance window.</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z</p>
         */
        public Builder maintainStartTime(String maintainStartTime) {
            this.putQueryParameter("MaintainStartTime", maintainStartTime);
            this.maintainStartTime = maintainStartTime;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <p><strong>VPC</strong>: Virtual Private Cloud (VPC).</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
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
         * <p>The subscription duration of the instance. Unit: month.</p>
         * <p>Valid values: <strong>1</strong> to <strong>9</strong> (integers), <strong>12</strong>, <strong>24</strong>, <strong>36</strong>, and <strong>60</strong>.</p>
         * <blockquote>
         * <p>This parameter is required and valid only when the <strong>ChargeType</strong> parameter is set to <strong>PrePaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The provisioned performance (IOPS). Valid values: 0 to 50000.</p>
         * 
         * <strong>example:</strong>
         * <p>1960</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The number of <strong>read-only nodes</strong> in the replica set instance. Valid values: <strong>0</strong> to <strong>5</strong> (integers). Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder readonlyReplicas(String readonlyReplicas) {
            this.putQueryParameter("ReadonlyReplicas", readonlyReplicas);
            this.readonlyReplicas = readonlyReplicas;
            return this;
        }

        /**
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the region ID.</p>
         * <blockquote>
         * <p>When you call this operation to clone clone instance or restore clone instance from the recycle bin, the value of this parameter must be the same as that of the source instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of <strong>primary and secondary nodes</strong> in the replica set instance. Valid values:</p>
         * <ul>
         * <li><strong>3</strong> (default)</li>
         * <li><strong>5</strong></li>
         * <li><strong>7</strong></li>
         * </ul>
         * <blockquote>
         * <p>Notice: You do not need to specify this parameter for a standalone instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder replicationFactor(String replicationFactor) {
            this.putQueryParameter("ReplicationFactor", replicationFactor);
            this.replicationFactor = replicationFactor;
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
         * <p>The point in time to which you want to restore the instance. You can specify any point in time within the last seven days. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format. The time must be in UTC.</p>
         * <blockquote>
         * <p>This parameter is required only when you call this operation to clone an instance to a specific point in time. You must also specify the <strong>SrcDBInstanceId</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2022-03-13T12:11:14Z</p>
         */
        public Builder restoreTime(String restoreTime) {
            this.putQueryParameter("RestoreTime", restoreTime);
            this.restoreTime = restoreTime;
            return this;
        }

        /**
         * <p>The backup restoration type of the instance. Valid values:</p>
         * <ul>
         * <li>0: restores the instance to a specified backup set</li>
         * <li>1: restores the instance to a specified point in time</li>
         * <li>2: restores a released instance to a specified backup set</li>
         * <li>3: restores the instance to a specified geo-redundancy backup set</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder restoreType(String restoreType) {
            this.putQueryParameter("RestoreType", restoreType);
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The zone where the secondary node resides. You can specify this parameter for multi-zone deployment. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou-g</strong>: Hangzhou Zone G.</li>
         * <li><strong>cn-hangzhou-h</strong>: Hangzhou Zone H.</li>
         * <li><strong>cn-hangzhou-i</strong>: Hangzhou Zone I.</li>
         * <li><strong>cn-hongkong-b</strong>: Hong Kong (China) Zone B.</li>
         * <li><strong>cn-hongkong-c</strong>: Hong Kong (China) Zone C.</li>
         * <li><strong>cn-hongkong-d</strong>: Hong Kong (China) Zone D.</li>
         * <li><strong>cn-wulanchabu-a</strong>: Ulanqab Zone A.</li>
         * <li><strong>cn-wulanchabu-b</strong>: Ulanqab Zone B.</li>
         * <li><strong>cn-wulanchabu-c</strong>: Ulanqab Zone C.</li>
         * <li><strong>ap-southeast-1a</strong>: Singapore Zone A.</li>
         * <li><strong>ap-southeast-1b</strong>: Singapore Zone B.</li>
         * <li><strong>ap-southeast-1c</strong>: Singapore Zone C.</li>
         * <li><strong>ap-southeast-5a</strong>: Jakarta Zone A.</li>
         * <li><strong>ap-southeast-5b</strong>: Jakarta Zone B.</li>
         * <li><strong>ap-southeast-5c</strong>: Jakarta Zone C.</li>
         * <li><strong>eu-central-1a</strong>: Frankfurt Zone A.</li>
         * <li><strong>eu-central-1b</strong>: Frankfurt Zone B.</li>
         * <li><strong>eu-central-1c</strong>: Frankfurt Zone C.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter is active only when the instance uses cloud disks.</li>
         * <li>The value of this parameter cannot be the same as the value of the <strong>ZoneId</strong> or <strong>HiddenZoneId</strong> parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        public Builder secondaryZoneId(String secondaryZoneId) {
            this.putQueryParameter("SecondaryZoneId", secondaryZoneId);
            this.secondaryZoneId = secondaryZoneId;
            return this;
        }

        /**
         * <p>The IP address whitelist of the instance. Separate multiple IP addresses with commas (,). Duplicate IP addresses are not allowed. The following three formats are supported:</p>
         * <ul>
         * <li>0.0.0.0/0</li>
         * <li>IP address format, such as 10.23.12.24.</li>
         * <li>CIDR format, such as 10.23.12.0/24. 24 indicates the length of the prefix in the CIDR block, and the valid range is 1 to 32.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can add up to 1,000 IP addresses or CIDR blocks to each instance. The total number of IP addresses or CIDR blocks in all IP address whitelist groups cannot exceed 1,000.</li>
         * <li>0.0.0.0/0 indicates that all IP addresses can access the databases of the instance. This is a high-risk setting. Proceed with caution.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>192.168.xx.xx,192.168.xx.xx</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The source instance ID.</p>
         * <blockquote>
         * <p>When you call this operation to clone an instance, you must specify this parameter and the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter. When you call this operation to restore a revoked instance, you only need to specify this parameter, and you do not need to specify the <strong>BackupId</strong> or <strong>RestoreTime</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>dds-bp1ee12ad351****</p>
         */
        public Builder srcDBInstanceId(String srcDBInstanceId) {
            this.putQueryParameter("SrcDBInstanceId", srcDBInstanceId);
            this.srcDBInstanceId = srcDBInstanceId;
            return this;
        }

        /**
         * <p>The region where the source instance resides.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when the backup restoration type is 2 or 3.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder srcRegion(String srcRegion) {
            this.putQueryParameter("SrcRegion", srcRegion);
            this.srcRegion = srcRegion;
            return this;
        }

        /**
         * <p>The storage engine of the instance. Set the value to <strong>WiredTiger</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>When you call this operation to clone clone instance or restore clone instance from the recycle bin, the value of this parameter must be the same as that of the source instance.</li>
         * <li>For more information about the constraints on the selection of storage engines and versions, see <a href="https://help.aliyun.com/document_detail/61906.html">Versions and storage engines</a>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WiredTiger</p>
         */
        public Builder storageEngine(String storageEngine) {
            this.putQueryParameter("StorageEngine", storageEngine);
            this.storageEngine = storageEngine;
            return this;
        }

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><strong>cloud_essd1</strong>: PL1 ESSD.</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
         * <li><strong>cloud_auto</strong>: ESSD AutoPL cloud disk.</li>
         * <li><strong>local_ssd</strong>: local SSD.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you specify cloud_essd1 when you purchase a standalone instance, the instance actually uses a cloud_essd cloud disk.</li>
         * <li>ESSD AutoPL cloud disks are supported only on the Alibaba Cloud China site.</li>
         * <li>The default value for instances of version 4.4 and later is <strong>cloud_essd1</strong>.</li>
         * <li>The default value for instances of version 4.2 and earlier is <strong>local_ssd</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd1</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>Specifies whether to enable TTL index cleanup for the restored instance. A value of true or an empty value indicates that cleanup is enabled.</p>
         */
        public Builder TTLEnabled(Boolean TTLEnabled) {
            this.putQueryParameter("TTLEnabled", TTLEnabled);
            this.TTLEnabled = TTLEnabled;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1gzt31twhlo0sa5****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp175iuvg8nxqraf2****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The zone ID. You can call the <a href="https://help.aliyun.com/document_detail/61933.html">DescribeRegions</a> operation to query the zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
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

    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the tag.</p>
             * <blockquote>
             * <ul>
             * <li><strong>N</strong> specifies the sequence number of the tag. For example, <strong>Tag.1.Key</strong> specifies the key of the first tag, and <strong>Tag.2.Key</strong> specifies the key of the second tag.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>testdatabase</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * <blockquote>
             * <p><strong>N</strong> specifies the sequence number of the tag. For example, <strong>Tag.1.Value</strong> specifies the value of the first tag, and <strong>Tag.2.Value</strong> specifies the value of the second tag.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>apitest</p>
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
