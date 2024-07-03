// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDBInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDBInstanceRequest</p>
 */
public class CreateDBInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BabelfishConfig")
    private String babelfishConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BpeEnabled")
    private String bpeEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private Boolean burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BusinessInfo")
    private String businessInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdDataEnabled")
    private Boolean coldDataEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionMode")
    private String connectionMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionString")
    private String connectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateStrategy")
    private String createStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceClass")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceNetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer DBInstanceStorage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBIsIgnoreCase")
    private String DBIsIgnoreCase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBParamGroupId")
    private String DBParamGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBTimeZone")
    private String DBTimeZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private Boolean deletionProtection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptionKey")
    private String encryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Engine")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
    private String ioAccelerationEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageThreshold")
    private Integer storageThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageUpperBound")
    private Integer storageUpperBound;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemDBCharset")
    private String systemDBCharset;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForLog")
    private String targetDedicatedHostIdForLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForMaster")
    private String targetDedicatedHostIdForMaster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetDedicatedHostIdForSlave")
    private String targetDedicatedHostIdForSlave;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserBackupId")
    private String userBackupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WhitelistTemplateList")
    private String whitelistTemplateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneIdSlave2")
    private String zoneIdSlave2;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.babelfishConfig = builder.babelfishConfig;
        this.bpeEnabled = builder.bpeEnabled;
        this.burstingEnabled = builder.burstingEnabled;
        this.businessInfo = builder.businessInfo;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.coldDataEnabled = builder.coldDataEnabled;
        this.connectionMode = builder.connectionMode;
        this.connectionString = builder.connectionString;
        this.createStrategy = builder.createStrategy;
        this.DBInstanceClass = builder.DBInstanceClass;
        this.DBInstanceDescription = builder.DBInstanceDescription;
        this.DBInstanceNetType = builder.DBInstanceNetType;
        this.DBInstanceStorage = builder.DBInstanceStorage;
        this.DBInstanceStorageType = builder.DBInstanceStorageType;
        this.DBIsIgnoreCase = builder.DBIsIgnoreCase;
        this.DBParamGroupId = builder.DBParamGroupId;
        this.DBTimeZone = builder.DBTimeZone;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.deletionProtection = builder.deletionProtection;
        this.dryRun = builder.dryRun;
        this.encryptionKey = builder.encryptionKey;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.payType = builder.payType;
        this.period = builder.period;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleARN = builder.roleARN;
        this.securityIPList = builder.securityIPList;
        this.serverlessConfig = builder.serverlessConfig;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageThreshold = builder.storageThreshold;
        this.storageUpperBound = builder.storageUpperBound;
        this.systemDBCharset = builder.systemDBCharset;
        this.tag = builder.tag;
        this.targetDedicatedHostIdForLog = builder.targetDedicatedHostIdForLog;
        this.targetDedicatedHostIdForMaster = builder.targetDedicatedHostIdForMaster;
        this.targetDedicatedHostIdForSlave = builder.targetDedicatedHostIdForSlave;
        this.targetMinorVersion = builder.targetMinorVersion;
        this.usedTime = builder.usedTime;
        this.userBackupId = builder.userBackupId;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.whitelistTemplateList = builder.whitelistTemplateList;
        this.zoneId = builder.zoneId;
        this.zoneIdSlave1 = builder.zoneIdSlave1;
        this.zoneIdSlave2 = builder.zoneIdSlave2;
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
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return babelfishConfig
     */
    public String getBabelfishConfig() {
        return this.babelfishConfig;
    }

    /**
     * @return bpeEnabled
     */
    public String getBpeEnabled() {
        return this.bpeEnabled;
    }

    /**
     * @return burstingEnabled
     */
    public Boolean getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return businessInfo
     */
    public String getBusinessInfo() {
        return this.businessInfo;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return coldDataEnabled
     */
    public Boolean getColdDataEnabled() {
        return this.coldDataEnabled;
    }

    /**
     * @return connectionMode
     */
    public String getConnectionMode() {
        return this.connectionMode;
    }

    /**
     * @return connectionString
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * @return createStrategy
     */
    public String getCreateStrategy() {
        return this.createStrategy;
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
     * @return DBInstanceNetType
     */
    public String getDBInstanceNetType() {
        return this.DBInstanceNetType;
    }

    /**
     * @return DBInstanceStorage
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * @return DBInstanceStorageType
     */
    public String getDBInstanceStorageType() {
        return this.DBInstanceStorageType;
    }

    /**
     * @return DBIsIgnoreCase
     */
    public String getDBIsIgnoreCase() {
        return this.DBIsIgnoreCase;
    }

    /**
     * @return DBParamGroupId
     */
    public String getDBParamGroupId() {
        return this.DBParamGroupId;
    }

    /**
     * @return DBTimeZone
     */
    public String getDBTimeZone() {
        return this.DBTimeZone;
    }

    /**
     * @return dedicatedHostGroupId
     */
    public String getDedicatedHostGroupId() {
        return this.dedicatedHostGroupId;
    }

    /**
     * @return deletionProtection
     */
    public Boolean getDeletionProtection() {
        return this.deletionProtection;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return ioAccelerationEnabled
     */
    public String getIoAccelerationEnabled() {
        return this.ioAccelerationEnabled;
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
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return privateIpAddress
     */
    public String getPrivateIpAddress() {
        return this.privateIpAddress;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return roleARN
     */
    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return serverlessConfig
     */
    public ServerlessConfig getServerlessConfig() {
        return this.serverlessConfig;
    }

    /**
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    /**
     * @return storageThreshold
     */
    public Integer getStorageThreshold() {
        return this.storageThreshold;
    }

    /**
     * @return storageUpperBound
     */
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
    }

    /**
     * @return systemDBCharset
     */
    public String getSystemDBCharset() {
        return this.systemDBCharset;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return targetDedicatedHostIdForLog
     */
    public String getTargetDedicatedHostIdForLog() {
        return this.targetDedicatedHostIdForLog;
    }

    /**
     * @return targetDedicatedHostIdForMaster
     */
    public String getTargetDedicatedHostIdForMaster() {
        return this.targetDedicatedHostIdForMaster;
    }

    /**
     * @return targetDedicatedHostIdForSlave
     */
    public String getTargetDedicatedHostIdForSlave() {
        return this.targetDedicatedHostIdForSlave;
    }

    /**
     * @return targetMinorVersion
     */
    public String getTargetMinorVersion() {
        return this.targetMinorVersion;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    /**
     * @return userBackupId
     */
    public String getUserBackupId() {
        return this.userBackupId;
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
     * @return whitelistTemplateList
     */
    public String getWhitelistTemplateList() {
        return this.whitelistTemplateList;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * @return zoneIdSlave1
     */
    public String getZoneIdSlave1() {
        return this.zoneIdSlave1;
    }

    /**
     * @return zoneIdSlave2
     */
    public String getZoneIdSlave2() {
        return this.zoneIdSlave2;
    }

    public static final class Builder extends Request.Builder<CreateDBInstanceRequest, Builder> {
        private Integer amount; 
        private Boolean autoPay; 
        private String autoRenew; 
        private String babelfishConfig; 
        private String bpeEnabled; 
        private Boolean burstingEnabled; 
        private String businessInfo; 
        private String category; 
        private String clientToken; 
        private Boolean coldDataEnabled; 
        private String connectionMode; 
        private String connectionString; 
        private String createStrategy; 
        private String DBInstanceClass; 
        private String DBInstanceDescription; 
        private String DBInstanceNetType; 
        private Integer DBInstanceStorage; 
        private String DBInstanceStorageType; 
        private String DBIsIgnoreCase; 
        private String DBParamGroupId; 
        private String DBTimeZone; 
        private String dedicatedHostGroupId; 
        private Boolean deletionProtection; 
        private Boolean dryRun; 
        private String encryptionKey; 
        private String engine; 
        private String engineVersion; 
        private String instanceNetworkType; 
        private String ioAccelerationEnabled; 
        private String payType; 
        private String period; 
        private String port; 
        private String privateIpAddress; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String roleARN; 
        private String securityIPList; 
        private ServerlessConfig serverlessConfig; 
        private String storageAutoScale; 
        private Integer storageThreshold; 
        private Integer storageUpperBound; 
        private String systemDBCharset; 
        private java.util.List < Tag> tag; 
        private String targetDedicatedHostIdForLog; 
        private String targetDedicatedHostIdForMaster; 
        private String targetDedicatedHostIdForSlave; 
        private String targetMinorVersion; 
        private String usedTime; 
        private String userBackupId; 
        private String VPCId; 
        private String vSwitchId; 
        private String whitelistTemplateList; 
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.babelfishConfig = request.babelfishConfig;
            this.bpeEnabled = request.bpeEnabled;
            this.burstingEnabled = request.burstingEnabled;
            this.businessInfo = request.businessInfo;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.coldDataEnabled = request.coldDataEnabled;
            this.connectionMode = request.connectionMode;
            this.connectionString = request.connectionString;
            this.createStrategy = request.createStrategy;
            this.DBInstanceClass = request.DBInstanceClass;
            this.DBInstanceDescription = request.DBInstanceDescription;
            this.DBInstanceNetType = request.DBInstanceNetType;
            this.DBInstanceStorage = request.DBInstanceStorage;
            this.DBInstanceStorageType = request.DBInstanceStorageType;
            this.DBIsIgnoreCase = request.DBIsIgnoreCase;
            this.DBParamGroupId = request.DBParamGroupId;
            this.DBTimeZone = request.DBTimeZone;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.deletionProtection = request.deletionProtection;
            this.dryRun = request.dryRun;
            this.encryptionKey = request.encryptionKey;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.payType = request.payType;
            this.period = request.period;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.roleARN = request.roleARN;
            this.securityIPList = request.securityIPList;
            this.serverlessConfig = request.serverlessConfig;
            this.storageAutoScale = request.storageAutoScale;
            this.storageThreshold = request.storageThreshold;
            this.storageUpperBound = request.storageUpperBound;
            this.systemDBCharset = request.systemDBCharset;
            this.tag = request.tag;
            this.targetDedicatedHostIdForLog = request.targetDedicatedHostIdForLog;
            this.targetDedicatedHostIdForMaster = request.targetDedicatedHostIdForMaster;
            this.targetDedicatedHostIdForSlave = request.targetDedicatedHostIdForSlave;
            this.targetMinorVersion = request.targetMinorVersion;
            this.usedTime = request.usedTime;
            this.userBackupId = request.userBackupId;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.whitelistTemplateList = request.whitelistTemplateList;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * The number of ApsaraDB RDS for MySQL instances that you want to create. The parameter takes effect only when you create multiple ApsaraDB RDS for MySQL instances at a time by using a single request.
         * <p>
         * 
         * Valid values: **1** to **20**. Default value: **1**.
         * 
         * > *   If you want to create multiple ApsaraDB RDS for MySQL instances at a time by using a single request, you can add tags to all the instances by using the **Tag.Key** parameter and the **Tag.Value** parameter. After the instances are created, you can manage the instances based on the tags.
         * > *   After you submit a request to create multiple ApsaraDB RDS for MySQL instances, this operation returns **TaskId**, **RequestId**, and **Message**. You can call the DescribeDBInstanceAttribute operation to query the information about an instance.
         * > *   If the value of the **Engine** parameter is not **MySQL** and the value of the Amount parameter is greater than **1**, this operation fails and returns an error code `InvalidParam.Engine`.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * Specifies whether to enable the automatic payment feature. Valid values:
         * <p>
         * 
         * *   **true**: automatically completes the payment. You must make sure that your account balance is sufficient.
         * *   **false**: does not automatically complete the payment. An unpaid order is generated.
         * 
         * >  The default value is true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for the instance. You must specify this parameter only if the instance uses the subscription billing method. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > *   The auto-renewal cycle is one month for a monthly subscription.
         * > *   The auto-renewal cycle is one year for a yearly subscription.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The configuration of the Babelfish feature for the instance that runs PostgreSQL.
         * <p>
         * 
         * Format:{"babelfishEnabled":"true","migrationMode":"xxxxxxx","masterUsername":"xxxxxxx","masterUserPassword":"xxxxxxxx"}
         * 
         * The following list describes the fields in the format:
         * 
         * *   **babelfishEnabled**: specifies whether to enable Babelfish for the instance. If you set this field to **true**, you enable Babelfish for the instance. If you leave this parameter empty, Babelfish is disabled for the instance.
         * *   **migrationMode**: The migration mode of the instance. Valid values: **single-db** and **multi-db**.
         * *   **masterUsername**: The username of the administrator account. The username can contain lowercase letters, digits, and underscores (\_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.
         * *   **masterUserPassword**: The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters: `! @ # $ % ^ & * ( ) _ + - =`.
         * 
         * > This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](~~428613~~).
         */
        public Builder babelfishConfig(String babelfishConfig) {
            this.putQueryParameter("BabelfishConfig", babelfishConfig);
            this.babelfishConfig = babelfishConfig;
            return this;
        }

        /**
         * A deprecated parameter. You do not need to specify this parameter.
         */
        public Builder bpeEnabled(String bpeEnabled) {
            this.putQueryParameter("BpeEnabled", bpeEnabled);
            this.bpeEnabled = bpeEnabled;
            return this;
        }

        /**
         * An invalid parameter. You do not need to specify this parameter.
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * The additional business information about the instance.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * The RDS edition of the instance. Valid values:
         * <p>
         * 
         * *   Regular RDS instance
         * 
         *     *   **Basic**: RDS Basic Edition
         *     *   **HighAvailability**: RDS High-availability Edition
         *     *   **cluster**: RDS Cluster Edition for ApsaraDB RDS for MySQL or PostgreSQL
         *     *   **AlwaysOn**: RDS Cluster Edition for ApsaraDB RDS for SQL Server
         *     *   **Finance**: RDS Basic Edition for serverless instances
         * 
         * *   Serverless instance
         * 
         *     *   **serverless_basic**: RDS Basic Edition for serverless instances. This edition is available only for instances that run MySQL and PostgreSQL.
         *     *   **serverless_standard**: RDS High-availability Edition for serverless instances. This edition is available only for instances that run MySQL and PostgreSQL.
         *     *   **serverless_ha**: RDS High-availability Edition for serverless instances. This edition is available only for instances that run SQL Server.
         * 
         *     **
         * 
         *     **Note** This parameter is required when you create a serverless instance.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder coldDataEnabled(Boolean coldDataEnabled) {
            this.putQueryParameter("ColdDataEnabled", coldDataEnabled);
            this.coldDataEnabled = coldDataEnabled;
            return this;
        }

        /**
         * The connection mode of the instance. Valid values:
         * <p>
         * 
         * *   **Standard**: standard mode
         * *   **Safe**: database proxy mode
         * 
         * ApsaraDB RDS automatically assigns a connection mode to the instance.
         * 
         * > SQL Server 2012, SQL Server 2016, and SQL Server 2017 support only the standard mode.
         */
        public Builder connectionMode(String connectionMode) {
            this.putQueryParameter("ConnectionMode", connectionMode);
            this.connectionMode = connectionMode;
            return this;
        }

        /**
         * The internal endpoint that is used to connect to the instance.
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * The policy based on which multiple instances are created. The parameter takes effect only when the value of the **Amount** parameter is greater than 1. Valid values:
         * <p>
         * 
         * *   **Atomicity** (default): atomicity. The instances are all created together. If one instance cannot be created, none of the instances are created.
         * *   **Partial**: non-atomicity. Each instance is independently created. The failure in creating an instance does not affect the creation of the other instances.
         */
        public Builder createStrategy(String createStrategy) {
            this.putQueryParameter("CreateStrategy", createStrategy);
            this.createStrategy = createStrategy;
            return this;
        }

        /**
         * The instance type of the instance. You can specify a standard instance type or an economy instance type. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).
         * <p>
         * 
         * To create a serverless instance, set this parameter to one of the following values:
         * 
         * *   If you want to create a serverless instance that runs MySQL on RDS Basic Edition, set this parameter to **mysql.n2.serverless.1c**.
         * *   If you want to create a serverless instance that runs MySQL on RDS High-availability Edition, set this parameter to **mysql.n2.serverless.2c**.
         * *   If you want to create a serverless instance that runs SQL Server, set this parameter to **mssql.mem2.serverless.s2**.
         * *   If you want to create a serverless instance that runs PostgreSQL on RDS Basic Edition, set this parameter to **pg.n2.serverless.1c**.
         * *   If you want to create a serverless instance that runs PostgreSQL on RDS High-availability Edition, set this parameter to **pg.n2.serverless.2c**.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * The instance name. The name must be 2 to 255 characters in length and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         * <p>
         * 
         * > The name cannot start with http:// or https://.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * The network connection type of the instance. The value of this parameter is fixed as **Intranet**, indicating an internal network connection.
         */
        public Builder DBInstanceNetType(String DBInstanceNetType) {
            this.putQueryParameter("DBInstanceNetType", DBInstanceNetType);
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }

        /**
         * The storage capacity of the instance. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see [Primary ApsaraDB RDS instance types](~~26312~~).
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * The storage type of the instance. Valid values:
         * <p>
         * 
         * *   **local_ssd**: local SSD. This is the recommended storage type.
         * *   **cloud_ssd**: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.
         * *   **cloud_essd**: enhanced SSD (ESSD) of performance level 1 (PL1).
         * *   **cloud_essd2**: ESSD of PL2.
         * *   **cloud_essd3**: ESSD of PL3.
         * 
         * The default value of this parameter is determined by the instance type specified by the **DBInstanceClass** parameter.
         * 
         * *   If the instance type specifies the local SSD storage type, the default value of this parameter is **local_ssd**.
         * *   If the instance type specifies the standard SSD or ESSD storage type, the default value of this parameter is **cloud_essd**.
         * 
         * >  Serverless instances use only ESSDs of PL1. If you create a serverless instance, you must set this parameter to **cloud_essd**.
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * Specifies whether the table name is case-sensitive. Valid values:
         * <p>
         * 
         * *   **true**: Table names are not case-sensitive. This is the default value.
         * *   **false**: Table names are case-sensitive.
         */
        public Builder DBIsIgnoreCase(String DBIsIgnoreCase) {
            this.putQueryParameter("DBIsIgnoreCase", DBIsIgnoreCase);
            this.DBIsIgnoreCase = DBIsIgnoreCase;
            return this;
        }

        /**
         * The parameter template ID. You can call the DescribeParameterGroups operation to query the parameter template ID.
         * <p>
         * 
         * >  This parameter is available if you want to create an instance that runs MySQL or PostgreSQL. If you do not configure this parameter, the default parameter template is used. If you want to use a custom parameter template, you can customize a parameter template and set this parameter to the ID of the custom template.
         */
        public Builder DBParamGroupId(String DBParamGroupId) {
            this.putQueryParameter("DBParamGroupId", DBParamGroupId);
            this.DBParamGroupId = DBParamGroupId;
            return this;
        }

        /**
         * The time zone of the instance. This parameter takes effect only when you set the **Engine** parameter to **MySQL** or **PostgreSQL**.
         * <p>
         * 
         * *   If you set **Engine** to **MySQL**:
         * 
         *     *   The time zone of the instance is in UTC. Valid values: **-12:59** to **+13:00**.
         *     *   If the instance uses local SSDs, you can specify the name of the time zone. Example: Asia/Hong_Kong. For more information, see [Time zones](~~297356~~).
         * 
         * *   If you set **Engine** to **PostgreSQL**:
         * 
         *     *   The time zone of the instance is not in UTC. For more information, see [Time zones](~~297356~~).
         *     *   You can specify this parameter only when the instance runs PostgreSQL with standard SSDs or ESSDs.
         * 
         * > *   You can specify the time zone when you create a primary instance. You cannot specify the time zone when you create a read-only instance. Read-only instances inherit the time zone of their primary instance.
         * > *   If you do not specify this parameter, the system automatically assigns the default time zone of the region in which the instance resides.
         */
        public Builder DBTimeZone(String DBTimeZone) {
            this.putQueryParameter("DBTimeZone", DBTimeZone);
            this.DBTimeZone = DBTimeZone;
            return this;
        }

        /**
         * The ID of the dedicated cluster to which the instance belongs.
         * <p>
         * 
         * If you create the instance in a dedicated cluster, you must specify this parameter.
         * 
         * *   You can call the DescribeDedicatedHostGroups operation to query the information about the dedicated cluster.
         * *   If no dedicated clusters are created, you can call the CreateDedicatedHostGroup operation to create a dedicated cluster.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * Specifies whether to enable the release protection feature for the instance. This feature is available only for pay-as-you-go instances. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * Specifies whether to perform a dry run. Valid values:
         * <p>
         * 
         * *   **true**: performs a dry run but does not create the instance. The system checks items such as the request parameters, request format, service limits, and available resources.
         * *   **false** (default): performs a dry run and sends the request. If the request passes the dry run, the instance is created.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the key that is used for cloud disk encryption in the region in which the instance is deployed. If this parameter is specified, cloud disk encryption is enabled and you must also specify the **RoleARN** parameter. Cloud disk encryption cannot be disabled after it is enabled.
         * <p>
         * 
         * You can obtain the ID of the key in the Key Management Service (KMS) console or create a key. For more information, see [Create a key](~~181610~~).
         * 
         * > *   This parameter is not required when you create an instance that runs MySQL, PostgreSQL, or SQL Server. You need to only specify the **RoleARN** parameter to create an instance that has cloud disk encryption enabled by using the obtained key ID.
         * > *   You can configure RAM authorization to require a RAM user to enable cloud disk encryption when the RAM user is used to create an instance. If cloud disk encryption is disabled during the instance creation, the creation operation fails. To complete the configuration, you can attach the following policy to the RAM user: `{"Version":"1","Statement":[{"Effect":"Deny","Action":"rds:CreateDBInstance","Resource":"*","Condition":{"StringEquals":{"rds:DiskEncryptionRequired":"false"}}}]}`
         * 
         * 
         * ><warning>The configuration also affects the CreateOrder operation that is called to create instances in the console.></warning>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * The database engine of the instance. Valid values:
         * <p>
         * 
         * *   **MySQL**
         * *   **SQLServer**
         * *   **PostgreSQL**
         * *   **MariaDB**
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * The database engine version of the instance. Valid values:
         * <p>
         * 
         * *   Regular instance
         * 
         *     *   Valid values when you set Engine to MySQL: **5.5**, **5.6**, **5.7**, and **8.0**
         *     *   Valid values when you set Engine to SQLServer: **08r2\_ent_ha** (cloud disks, discontinued), **2008r2** (local disks, discontinued), **2012** (SQL Server EE Basic), **2012\_ent_ha**, **2012\_std_ha**, **2012\_web**, **2014\_ent_ha**, **2014\_std_ha**, **2016\_ent_ha**, **2016\_std_ha**, **2016\_web**, **2017\_ent**, **2017\_std_ha**, **2017\_web**, **2019\_ent**, **2019\_std_ha**, **2019\_web**, **2022\_ent**, **2022\_std_ha**, and **2022\_web**
         *     *   Valid values when you set Engine to PostgreSQL: **10.0**, **11.0**, **12.0**, **13.0**, **14.0**, **15.0**, and **16.0**
         *     *   Valid value if you set Engine to MariaDB: **10.3**
         * 
         * *   Serverless instance
         * 
         *     *   Valid values when you set Engine to MySQL: **5.7** and **8.0**
         *     *   Valid values when you set Engine to SQLServer: **2016\_std_sl**, **2017\_std_sl**, and **2019\_std_sl**
         *     *   Valid values when you set Engine to PostgreSQL: **14.0**, **15.0**, and **16.0**
         * 
         * > 
         * 
         * *   ApsaraDB RDS for MariaDB does not support serverless instances.
         * 
         * *   RDS instances that run SQL Server: `_ent` specifies SQL Server EE (Always On), `_ent_ha` specifies SQL Server EE, `_std_ha` specifies SQL Server SE, and `_web` specifies SQL Server Web.
         * 
         * *   RDS instances that run SQL Server 2014 are not available for purchase on the international site (alibabacloud.com).
         * 
         * *   Babelfish is supported only for RDS instances that run PostgreSQL 15.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   **VPC**: virtual private cloud (VPC)
         * *   **Classic**: the classic network
         * 
         * > 
         * 
         * *   If the instance runs MySQL and uses cloud disks, you must set this parameter to **VPC**.
         * 
         * *   If the instance runs PostgreSQL or MariaDB, you must set this parameter to **VPC**.
         * 
         * *   If the instance runs SQL Server Basic or SQL Server Web, you can set this parameter to VPC or Classic. If the instance runs other database engine, you must set this parameter to **VPC**.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * A reserved parameter.
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   **Postpaid**: pay-as-you-go.
         * *   **Prepaid**: subscription.
         * *   **Serverless**: serverless. This value is not supported for instances that run MariaDB. For more information, see [Overview of serverless ApsaraDB RDS for MySQL instances](~~411291~~), [Overview of serverless ApsaraDB RDS for SQL Server instances](~~604344~~), and [Overview of serverless ApsaraDB RDS for PostgreSQL instances](~~607742~~).
         * 
         * > The system automatically generates a purchase order and completes the payment.
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values:
         * <p>
         * 
         * *   **Year**
         * *   **Month**
         * 
         * >  If you set the PayType parameter to **Prepaid**, you must specify this parameter.
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The port. You can initialize the port when you create the instance.
         * <p>
         * 
         * *   Valid values if the instance runs MySQL: 1000 to 65534
         * *   Valid values if the instance runs PostgreSQL, SQL Server, or MariaDB: 1000 to 5999
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * The private IP address of the instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. ApsaraDB RDS automatically assigns a private IP address to the instance based on the values of the **VPCId** and **vSwitchId** parameters.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * The region ID. You can call the DescribeRegions operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
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
         * The Alibaba Cloud Resource Name (ARN) that is provided by your Alibaba Cloud account for RAM users. RAM users can use the ARN to connect ApsaraDB RDS to KMS. You can call the CheckCloudResourceAuthorized operation to query the ARN.
         */
        public Builder roleARN(String roleARN) {
            this.putQueryParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * The IP address whitelist of the instance. For more information, see [Use a database client or the CLI to connect to an ApsaraDB RDS for MySQL instance](~~43185~~). If the IP address whitelist contains more than one entry, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:
         * <p>
         * 
         * *   IP addresses, such as 10.10.XX.XX.
         * *   CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * The settings of the serverless instance. This parameter is required when you create a serverless instance.
         * <p>
         * 
         * >  ApsaraDB RDS for MariaDB does not support serverless instances.
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * Specifies whether to enable the automatic storage expansion feature for the instance. This feature is supported if the instance runs MySQL or PostgreSQL. Valid values:
         * <p>
         * 
         * *   **Enable**
         * *   **Disable** (default)
         * 
         * >  After the instance is created, you can call the ModifyDasInstanceConfig operation to adjust the settings. For more information, see [Configure automatic storage expansion](~~173826~~).
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * The threshold in percentage based on which automatic storage expansion is triggered. Valid values:
         * <p>
         * 
         * *   **10**
         * *   **20**
         * *   **30**
         * *   **40**
         * *   **50**
         * 
         * >  If you set the **StorageAutoScale** parameter to **Enable**, you must specify this parameter.
         */
        public Builder storageThreshold(Integer storageThreshold) {
            this.putQueryParameter("StorageThreshold", storageThreshold);
            this.storageThreshold = storageThreshold;
            return this;
        }

        /**
         * The maximum storage capacity that is allowed for automatic storage expansion. The storage capacity of the instance cannot exceed the maximum storage capacity. Unit: GB.
         * <p>
         * 
         * > *   Valid values: an integer greater than or equal to 0.
         * > *   If you set **StorageAutoScale** to **Enable**, you must specify this parameter.
         */
        public Builder storageUpperBound(Integer storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * A deprecated parameter. You do not need to specify this parameter.
         */
        public Builder systemDBCharset(String systemDBCharset) {
            this.putQueryParameter("SystemDBCharset", systemDBCharset);
            this.systemDBCharset = systemDBCharset;
            return this;
        }

        /**
         * The tags that are added to instances.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The ID of the host to which the logger instance belongs in the specified dedicated cluster.
         * <p>
         * 
         * If you want to create an instance that runs RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.
         * 
         * *   You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.
         * *   If no hosts are created, you can call the CreateDedicatedHost operation to create a host.
         */
        public Builder targetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
            this.putQueryParameter("TargetDedicatedHostIdForLog", targetDedicatedHostIdForLog);
            this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
            return this;
        }

        /**
         * The ID of the host to which the instance belongs in the specified dedicated cluster.
         * <p>
         * 
         * If you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.
         * 
         * *   You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.
         * *   If no hosts are created, you can call the CreateDedicatedHost operation to create a host.
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * The ID of the host to which the secondary instance belongs in the specified dedicated cluster.
         * <p>
         * 
         * If you want to create an instance that runs RDS High-availability Edition or RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.
         * 
         * *   You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.
         * *   If no hosts are created, you can call the CreateDedicatedHost operation to create a host.
         */
        public Builder targetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
            this.putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
            this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
            return this;
        }

        /**
         * The minor engine version of the instance. This parameter is required only when you create an instance that runs MySQL or PostgreSQL. The value format varies based on the database engine of the instance.
         * <p>
         * 
         * *   If you create an instance that runs MySQL, the value is in the following format: `<RDS edition>_<Minor engine version>`. Examples: `rds_20200229`, `xcluster_20200229`, and `xcluster80_20200229`.
         * 
         *     *   rds: The instance runs RDS Basic Edition or RDS High-availability Edition.
         *     *   xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.
         *     *   xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.
         * 
         *     > You can call the DescribeDBMiniEngineVersions operation to query the minor engine version. For more information about the differences between minor engine versions of AliSQL, see [Release notes](~~96060~~).
         * 
         * *   If you create an instance that runs PostgreSQL, the value is in the following format: `rds_postgres_<Major engine version>00_<Minor engine version>`. Example: `rds_postgres_1400_20220830`.
         * 
         *     *   1400: The major engine version is PostgreSQL 14.
         *     *   20220830: the AliPG version. You can call the DescribeDBMiniEngineVersions operation to query the AliPG version. For more information about minor engine versions, see [Release notes for AliPG](~~126002~~).
         * 
         *     > If you configure the **BabelfishConfig** parameter for your instance that runs PostgreSQL and set the babelfishEnabled field to true, the value of this parameter is in the following format: `rds_postgres_Major engine version00_AliPG version_babelfish`.
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * The subscription duration of the instance.
         * <p>
         * 
         * *   If you set the **Period** parameter to **Year**, the value of the **UsedTime** parameter ranges from **1 to 5**.
         * *   If you set the **Period** parameter to **Month**, the value of the **UsedTime** parameter ranges from **1 to 11**.
         * 
         * >  If you set the PayType parameter to **Prepaid**, you must specify this parameter.
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * The ID of the full backup file. You can call the ListUserBackupFiles operation to query the ID of the full backup file. If you want to create an instance by using the data of a backup file, you must specify this parameter.
         * <p>
         * 
         * This parameter is supported only when the following requirements are met:
         * 
         * *   The **PayType** parameter is set to **Postpaid**.
         * *   The **Engine** parameter is set to **MySQL**.
         * *   The **EngineVersion** parameter is set to **5.7**.
         * *   The **Category** parameter is set to **Basic**.
         */
        public Builder userBackupId(String userBackupId) {
            this.putQueryParameter("UserBackupId", userBackupId);
            this.userBackupId = userBackupId;
            return this;
        }

        /**
         * The ID of the VPC to which the instance belongs.
         * <p>
         * 
         * > This parameter is available when you set the **InstanceNetworkType** parameter to **VPC**.
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * The ID of the vSwitch. The vSwitch must belong to the zone that is specified by **ZoneId**.
         * <p>
         * 
         * *   If you set **InstanceNetworkType** to **VPC**, you must also specify this parameter.
         * *   If you specify the ZoneSlaveId1 parameter, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,).
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * The entries in the whitelist. If you enter multiple IP addresses or CIDR blocks, you must separate the IP addresses or CIDR blocks with commas (,). Do not add spaces preceding or following the commas. Example: `192.168.0.1,172.16.213.9`.
         */
        public Builder whitelistTemplateList(String whitelistTemplateList) {
            this.putQueryParameter("WhitelistTemplateList", whitelistTemplateList);
            this.whitelistTemplateList = whitelistTemplateList;
            return this;
        }

        /**
         * The zone ID of the primary instance.
         * <p>
         * 
         * *   If you specify a virtual private cloud (VPC) and a vSwitch, you must specify the ID of the zone to which the specified vSwitch belongs. Otherwise, the instance cannot be created.
         * *   If the instance runs RDS High-availability Edition, you must specify the **ZoneIdSlave1** parameter. The ZoneIdSlave1 parameter specifies whether to use the single-zone deployment method or the multi-zone deployment method.
         * *   If the instance runs RDS Enterprise Edition, you must specify the **ZoneIdSlave1** and **ZoneIdSlave2** parameters. The ZoneIdSlave1 and ZoneIdSlave2 parameters specify whether to use the single-zone deployment method or the multi-zone deployment method.
         * *   If the instance runs MySQL on RDS Cluster Edition, you must specify the **ZoneIdSlave1** parameter for the RDS cluster that has two nodes and the **ZoneIdSlave1** and **ZoneIdSlave2** parameters for the RDS cluster that has three nodes.
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * The zone ID of the secondary instance.
         * <p>
         * 
         * *   If you set this parameter to **Auto**, the multi-zone deployment method is used and the zone of the secondary instance is automatically configured.
         * *   If you set this parameter to the same value as the **ZoneId** parameter, the single-zone deployment method is used.
         * *   If you set this parameter to a value that is different from the value of the **ZoneId** parameter, the multiple-zone deployment method is used.
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder zoneIdSlave2(String zoneIdSlave2) {
            this.putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
            this.zoneIdSlave2 = zoneIdSlave2;
            return this;
        }

        @Override
        public CreateDBInstanceRequest build() {
            return new CreateDBInstanceRequest(this);
        } 

    } 

    public static class ServerlessConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoPause")
        private Boolean autoPause;

        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Double maxCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Double minCapacity;

        @com.aliyun.core.annotation.NameInMap("SwitchForce")
        private Boolean switchForce;

        private ServerlessConfig(Builder builder) {
            this.autoPause = builder.autoPause;
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
            this.switchForce = builder.switchForce;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerlessConfig create() {
            return builder().build();
        }

        /**
         * @return autoPause
         */
        public Boolean getAutoPause() {
            return this.autoPause;
        }

        /**
         * @return maxCapacity
         */
        public Double getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return minCapacity
         */
        public Double getMinCapacity() {
            return this.minCapacity;
        }

        /**
         * @return switchForce
         */
        public Boolean getSwitchForce() {
            return this.switchForce;
        }

        public static final class Builder {
            private Boolean autoPause; 
            private Double maxCapacity; 
            private Double minCapacity; 
            private Boolean switchForce; 

            /**
             * Specifies whether to enable the automatic startup and stop feature for the serverless instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * >  This parameter is required only for serverless instances that run MySQL and PostgreSQL. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is resumed.
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * The maximum number of RDS Capacity Units (RCUs). Valid values:
             * <p>
             * 
             * *   Serverless ApsaraDB RDS for MySQL instances: **1 to 32**
             * *   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**
             * *   Serverless ApsaraDB RDS for PostgreSQL instances: **1 to 14**
             * 
             * >  The value of this parameter must be greater than or equal to the value of **MinCapacity** and can be set only to an **integer**.
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * The minimum value of RCUs. Valid values:
             * <p>
             * 
             * *   Serverless ApsaraDB RDS for MySQL instances: **0.5 to 32**.
             * *   Serverless ApsaraDB RDS for SQL Server instances: **2 to 8**. Only integers are supported.
             * *   Serverless ApsaraDB RDS for PostgreSQL instances: **0.5 to 14**
             * 
             * >  The value of this parameter must be less than or equal to the value of **MaxCapacity**.
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * > 
             * 
             * *   This parameter is required only for serverless instances that run MySQL and PostgreSQL. If you set this parameter to true, a service interruption that lasts approximately 30 to 120 seconds occurs during forced scaling. Process with caution.
             * 
             * *   The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.
             */
            public Builder switchForce(Boolean switchForce) {
                this.switchForce = switchForce;
                return this;
            }

            public ServerlessConfig build() {
                return new ServerlessConfig(this);
            } 

        } 

    }
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

            /**
             * The tag key. You can use this parameter to add tags to the instance.
             * <p>
             * 
             * *   If the specified tag key is an existing key, the system directly adds the tag key to the instance. You can call the ListTagResources to query the existing tag.
             * *   If the specified tag key does not exist, the system creates the tag key and adds the tag key to the instance.
             * *   The value cannot be an empty string.
             * *   This parameter must be used together with the **Tag.Value** parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. You can use this parameter to add tags to the instance.
             * <p>
             * 
             * *   If the specified tag value is found in the specified tag key, the system directly adds the tag value to the instance. You can call the ListTagResources to query the existing tag.
             * *   If the specified tag value is not found in the specified tag key, the system creates the tag value and adds the tag value to the instance.
             * *   This parameter must be used together with the **Tag.Key** parameter.
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
