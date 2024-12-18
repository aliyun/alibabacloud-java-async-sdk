// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @com.aliyun.core.annotation.NameInMap("Amount")
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCreateProxy")
    private Boolean autoCreateProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private String autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

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
    @com.aliyun.core.annotation.NameInMap("OptimizedWrites")
    private String optimizedWrites;

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
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

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
    private java.util.List<Tag> tag;

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
        this.autoCreateProxy = builder.autoCreateProxy;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
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
        this.optimizedWrites = builder.optimizedWrites;
        this.payType = builder.payType;
        this.period = builder.period;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.promotionCode = builder.promotionCode;
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
     * @return autoCreateProxy
     */
    public Boolean getAutoCreateProxy() {
        return this.autoCreateProxy;
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
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
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
     * @return optimizedWrites
     */
    public String getOptimizedWrites() {
        return this.optimizedWrites;
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
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
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
    public java.util.List<Tag> getTag() {
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
        private Boolean autoCreateProxy; 
        private Boolean autoPay; 
        private String autoRenew; 
        private Boolean autoUseCoupon; 
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
        private String optimizedWrites; 
        private String payType; 
        private String period; 
        private String port; 
        private String privateIpAddress; 
        private String promotionCode; 
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
        private java.util.List<Tag> tag; 
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
            this.autoCreateProxy = request.autoCreateProxy;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
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
            this.optimizedWrites = request.optimizedWrites;
            this.payType = request.payType;
            this.period = request.period;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.promotionCode = request.promotionCode;
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
         * <p>The number of ApsaraDB RDS for MySQL instances that you want to create. The parameter takes effect only when you create multiple ApsaraDB RDS for MySQL instances at a time by using a single request.</p>
         * <p>Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>If you want to create multiple ApsaraDB RDS for MySQL instances at a time by using a single request, you can add tags to all the instances by using the <strong>Tag.Key</strong> parameter and the <strong>Tag.Value</strong> parameter. After the instances are created, you can manage the instances based on the tags.</li>
         * <li>After you submit a request to create multiple ApsaraDB RDS for MySQL instances, this operation returns <strong>TaskId</strong>, <strong>RequestId</strong>, and <strong>Message</strong>. You can call the DescribeDBInstanceAttribute operation to query the information about an instance.</li>
         * <li>If the value of the <strong>Engine</strong> parameter is not <strong>MySQL</strong> and the value of the Amount parameter is greater than <strong>1</strong>, this operation fails and returns an error code <code>InvalidParam.Engine</code>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create a database proxy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: automatically creates a database proxy. By default, a general-purpose database proxy is created.</li>
         * <li><strong>false</strong>: does not automatically create a database proxy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCreateProxy(Boolean autoCreateProxy) {
            this.putQueryParameter("AutoCreateProxy", autoCreateProxy);
            this.autoCreateProxy = autoCreateProxy;
            return this;
        }

        /**
         * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature. Make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
         * </ul>
         * <blockquote>
         * <p> Default value: true. If your account balance is insufficient, you can set the AutoPay parameter to false to generate an unpaid order. Then, you can log on to the ApsaraDB RDS console to complete the payment.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal for the instance. You must specify this parameter only if the instance uses the subscription billing method. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The auto-renewal cycle is one month for a monthly subscription.</li>
         * <li>The auto-renewal cycle is one year for a yearly subscription.</li>
         * </ul>
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
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses a coupon.</li>
         * <li><strong>false</strong> (default): does not use a coupon.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoUseCoupon(Boolean autoUseCoupon) {
            this.putQueryParameter("AutoUseCoupon", autoUseCoupon);
            this.autoUseCoupon = autoUseCoupon;
            return this;
        }

        /**
         * <p>The configuration of the Babelfish feature for the instance that runs PostgreSQL.</p>
         * <p>Format:{&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;xxxxxxx&quot;,&quot;masterUsername&quot;:&quot;xxxxxxx&quot;,&quot;masterUserPassword&quot;:&quot;xxxxxxxx&quot;}</p>
         * <p>The following list describes the fields in the format:</p>
         * <ul>
         * <li><strong>babelfishEnabled</strong>: specifies whether to enable Babelfish for the instance. If you set this field to <strong>true</strong>, you enable Babelfish for the instance. If you leave this parameter empty, Babelfish is disabled for the instance.</li>
         * <li><strong>migrationMode</strong>: The migration mode of the instance. Valid values: <strong>single-db</strong> and <strong>multi-db</strong>.</li>
         * <li><strong>masterUsername</strong>: The username of the administrator account. The username can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It can be up to 63 characters in length and cannot start with pg.</li>
         * <li><strong>masterUserPassword</strong>: The password of the administrator account. The password must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. It must be 8 to 32 characters in length. The password can contain any of the following characters: <code>! @ # $ % ^ &amp; * ( ) _ + - =</code>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Introduction to Babelfish</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;single-db&quot;,&quot;masterUsername&quot;:&quot;babelfish_user&quot;,&quot;masterUserPassword&quot;:&quot;Babelfish123!&quot;}</p>
         */
        public Builder babelfishConfig(String babelfishConfig) {
            this.putQueryParameter("BabelfishConfig", babelfishConfig);
            this.babelfishConfig = babelfishConfig;
            return this;
        }

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder bpeEnabled(String bpeEnabled) {
            this.putQueryParameter("BpeEnabled", bpeEnabled);
            this.bpeEnabled = bpeEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the I/O burst feature of general ESSDs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> For more information about the I/O burst feature of general ESSDs, see <a href="https://help.aliyun.com/document_detail/2340501.html">What are general ESSDs?</a></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(Boolean burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The additional business information about the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>121436975448952</p>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The RDS edition of the instance. Valid values:</p>
         * <ul>
         * <li><p>Regular RDS instance</p>
         * <ul>
         * <li><strong>Basic</strong>: RDS Basic Edition</li>
         * <li><strong>HighAvailability</strong>: RDS High-availability Edition</li>
         * <li><strong>cluster</strong>: RDS Cluster Edition for ApsaraDB RDS for MySQL or PostgreSQL</li>
         * <li><strong>AlwaysOn</strong>: RDS Cluster Edition for ApsaraDB RDS for SQL Server</li>
         * <li><strong>Finance</strong>: RDS Basic Edition for serverless instances</li>
         * </ul>
         * </li>
         * <li><p>Serverless instance</p>
         * <ul>
         * <li><strong>serverless_basic</strong>: RDS Basic Edition for serverless instances. This edition is available only for instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_standard</strong>: RDS High-availability Edition for serverless instances. This edition is available only for instances that run MySQL and PostgreSQL.</li>
         * <li><strong>serverless_ha</strong>: RDS High-availability Edition for serverless instances. This edition is available only for instances that run SQL Server.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when you create a serverless instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>HighAvailability</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz*****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to enable the data archiving feature of general ESSDs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> For more information about the data archiving feature of general ESSDs, see <a href="https://help.aliyun.com/document_detail/2701832.html">Use the data archiving feature of general ESSDs</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder coldDataEnabled(Boolean coldDataEnabled) {
            this.putQueryParameter("ColdDataEnabled", coldDataEnabled);
            this.coldDataEnabled = coldDataEnabled;
            return this;
        }

        /**
         * <p>The connection mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: standard mode</li>
         * <li><strong>Safe</strong>: database proxy mode</li>
         * </ul>
         * <p>ApsaraDB RDS automatically assigns a connection mode to the instance.</p>
         * <blockquote>
         * <p>SQL Server 2012, SQL Server 2016, and SQL Server 2017 support only the standard mode.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder connectionMode(String connectionMode) {
            this.putQueryParameter("ConnectionMode", connectionMode);
            this.connectionMode = connectionMode;
            return this;
        }

        /**
         * <p>The internal endpoint that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5*****.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The policy based on which multiple instances are created. The parameter takes effect only when the value of the <strong>Amount</strong> parameter is greater than 1. Valid values:</p>
         * <ul>
         * <li><strong>Atomicity</strong> (default): atomicity. The instances are all created together. If one instance cannot be created, none of the instances are created.</li>
         * <li><strong>Partial</strong>: non-atomicity. Each instance is independently created. The failure in creating an instance does not affect the creation of the other instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Atomicity</p>
         */
        public Builder createStrategy(String createStrategy) {
            this.putQueryParameter("CreateStrategy", createStrategy);
            this.createStrategy = createStrategy;
            return this;
        }

        /**
         * <p>The instance type of the instance. You can specify an instance type of the standard or YiTian product type. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <p>To create a serverless instance, set this parameter to one of the following values:</p>
         * <ul>
         * <li>If you want to create a serverless instance that runs MySQL on RDS Basic Edition, set this parameter to <strong>mysql.n2.serverless.1c</strong>.</li>
         * <li>If you want to create a serverless instance that runs MySQL on RDS High-availability Edition, set this parameter to <strong>mysql.n2.serverless.2c</strong>.</li>
         * <li>If you want to create a serverless instance that runs SQL Server, set this parameter to <strong>mssql.mem2.serverless.s2</strong>.</li>
         * <li>If you want to create a serverless instance that runs PostgreSQL on RDS Basic Edition, set this parameter to <strong>pg.n2.serverless.1c</strong>.</li>
         * <li>If you want to create a serverless instance that runs PostgreSQL on RDS High-availability Edition, set this parameter to <strong>pg.n2.serverless.2c</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds.mysql.s1.small</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The instance name. The name must be 2 to 255 characters in length and can contain letters, digits, underscores (_), and hyphens (-). The name must start with a letter.</p>
         * <blockquote>
         * <p>The name cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test database</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The network connection type of the instance. The value of this parameter is fixed as <strong>Intranet</strong>, indicating an internal network connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet</p>
         */
        public Builder DBInstanceNetType(String DBInstanceNetType) {
            this.putQueryParameter("DBInstanceNetType", DBInstanceNetType);
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }

        /**
         * <p>The storage capacity of the instance. Unit: GB. The storage capacity increases in increments of 5 GB. For more information, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * <p>The storage type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: local SSD. This is the recommended storage type.</li>
         * <li><strong>general_essd</strong>: general Enterprise SSD (ESSD). This is the recommended storage type.</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD</li>
         * <li><strong>cloud_ssd</strong>: standard SSD. This storage type is not recommended. Standard SSDs are no longer available for purchase in some Alibaba Cloud regions.</li>
         * </ul>
         * <p>The default value of this parameter is determined by the instance type specified by the <strong>DBInstanceClass</strong> parameter.</p>
         * <ul>
         * <li>If the instance type specifies the local SSD storage type, the default value of this parameter is <strong>local_ssd</strong>.</li>
         * <li>If the instance type specifies the standard SSD or ESSD storage type, the default value of this parameter is <strong>cloud_essd</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> Serverless instances support only PL1 ESSDs and general ESSDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_essd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>Specifies whether the table name is case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Table names are not case-sensitive. This is the default value.</li>
         * <li><strong>false</strong>: Table names are case-sensitive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder DBIsIgnoreCase(String DBIsIgnoreCase) {
            this.putQueryParameter("DBIsIgnoreCase", DBIsIgnoreCase);
            this.DBIsIgnoreCase = DBIsIgnoreCase;
            return this;
        }

        /**
         * <p>The parameter template ID. You can call the DescribeParameterGroups operation to query the parameter template ID.</p>
         * <blockquote>
         * <p> This parameter is available if you want to create an instance that runs MySQL or PostgreSQL. If you do not configure this parameter, the default parameter template is used. If you want to use a custom parameter template, you can customize a parameter template and set this parameter to the ID of the custom template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rpg-sys-*****</p>
         */
        public Builder DBParamGroupId(String DBParamGroupId) {
            this.putQueryParameter("DBParamGroupId", DBParamGroupId);
            this.DBParamGroupId = DBParamGroupId;
            return this;
        }

        /**
         * <p>The time zone of the instance. This parameter takes effect only when you set the <strong>Engine</strong> parameter to <strong>MySQL</strong> or <strong>PostgreSQL</strong>.</p>
         * <ul>
         * <li><p>If you set <strong>Engine</strong> to <strong>MySQL</strong>:</p>
         * <ul>
         * <li>The time zone of the instance is in UTC. Valid values: <strong>-12:59</strong> to <strong>+13:00</strong>.</li>
         * <li>If the instance uses local SSDs, you can specify the name of the time zone. Example: Asia/Hong_Kong. For more information, see <a href="https://help.aliyun.com/document_detail/297356.html">Time zones</a>.</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>Engine</strong> to <strong>PostgreSQL</strong>:</p>
         * <ul>
         * <li>The time zone of the instance is not in UTC. For more information, see <a href="https://help.aliyun.com/document_detail/297356.html">Time zones</a>.</li>
         * <li>You can specify this parameter only when the instance runs PostgreSQL with standard SSDs or ESSDs.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can specify the time zone when you create a primary instance. You cannot specify the time zone when you create a read-only instance. Read-only instances inherit the time zone of their primary instance.</li>
         * <li>If you do not specify this parameter, the system automatically assigns the default time zone of the region in which the instance resides.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>+08:00</p>
         */
        public Builder DBTimeZone(String DBTimeZone) {
            this.putQueryParameter("DBTimeZone", DBTimeZone);
            this.DBTimeZone = DBTimeZone;
            return this;
        }

        /**
         * <p>The ID of the dedicated cluster to which the instance belongs.</p>
         * <p>If you create the instance in a dedicated cluster, you must specify this parameter.</p>
         * <ul>
         * <li>You can call the DescribeDedicatedHostGroups operation to query the information about the dedicated cluster.</li>
         * <li>If no dedicated clusters are created, you can call the CreateDedicatedHostGroup operation to create a dedicated cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dhg-4n*****</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the release protection feature for the instance. This feature is available only for pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a dry run but does not create the instance. The system checks items such as the request parameters, request format, service limits, and available resources.</li>
         * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, the instance is created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the key that is used for cloud disk encryption in the region in which the instance is deployed. If this parameter is specified, cloud disk encryption is enabled and you must also specify the <strong>RoleARN</strong> parameter. Cloud disk encryption cannot be disabled after it is enabled.</p>
         * <p>You can obtain the ID of the key in the Key Management Service (KMS) console or create a key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Create a key</a>.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is not required when you create an instance that runs MySQL, PostgreSQL, or SQL Server. You need to only specify the <strong>RoleARN</strong> parameter to create an instance that has cloud disk encryption enabled by using the obtained key ID.</li>
         * <li>You can configure RAM authorization to require a RAM user to enable cloud disk encryption when the RAM user is used to create an instance. If cloud disk encryption is disabled during the instance creation, the creation operation fails. To complete the configuration, you can attach the following policy to the RAM user: <code>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:&quot;rds:CreateDBInstance&quot;,&quot;Resource&quot;:&quot;*&quot;,&quot;Condition&quot;:{&quot;StringEquals&quot;:{&quot;rds:DiskEncryptionRequired&quot;:&quot;false&quot;}}}]}</code></li>
         * </ul>
         * </blockquote>
         * <blockquote>
         * <p>Warning: The configuration also affects the CreateOrder operation that is called to create instances in the console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0d24*****-da7b-4786-b981-9a164dxxxxxx</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The database engine of the instance. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>SQLServer</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>MariaDB</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version of the instance. Valid values:</p>
         * <ul>
         * <li><p>Regular instance</p>
         * <ul>
         * <li>Valid values when you set Engine to MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
         * <li>Valid values when you set Engine to SQLServer: <strong>08r2_ent_ha</strong> (cloud disks, discontinued), <strong>2008r2</strong> (local disks, discontinued), <strong>2012</strong> (SQL Server EE Basic), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_ent_ha</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, and <strong>2022_web</strong></li>
         * <li>Valid values when you set Engine to PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, <strong>15.0</strong>, and <strong>16.0</strong></li>
         * <li>Valid value if you set Engine to MariaDB: <strong>10.3</strong></li>
         * </ul>
         * </li>
         * <li><p>Serverless instance</p>
         * <ul>
         * <li>Valid values when you set Engine to MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
         * <li>Valid values when you set Engine to SQLServer: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
         * <li>Valid values when you set Engine to PostgreSQL: <strong>14.0</strong>, <strong>15.0</strong>, and <strong>16.0</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>ApsaraDB RDS for MariaDB does not support serverless instances.</li>
         * <li>RDS instances that run SQL Server: <code>_ent</code> specifies SQL Server EE (Always On), <code>_ent_ha</code> specifies SQL Server EE, <code>_std_ha</code> specifies SQL Server SE, and <code>_web</code> specifies SQL Server Web.</li>
         * <li>RDS instances that run SQL Server 2014 are not available for purchase on the international site (alibabacloud.com).</li>
         * <li>Babelfish is supported only for RDS instances that run PostgreSQL 15.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: a virtual private cloud (VPC)</li>
         * <li><strong>Classic</strong>: the classic network</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If the instance runs MySQL and uses cloud disks, you must set this parameter to <strong>VPC</strong>.</li>
         * <li>If the instance runs PostgreSQL or MariaDB, you must set this parameter to <strong>VPC</strong>.</li>
         * <li>If the instance runs SQL Server Basic or SQL Server Web, you can set this parameter to VPC or Classic. If the instance runs other database engine, you must set this parameter to <strong>VPC</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Classic</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the I/O acceleration feature of general ESSDs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * <blockquote>
         * <p> For more information about the I/O acceleration feature of general ESSDs, see <a href="https://help.aliyun.com/document_detail/2527067.html">Introduction</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the write optimization feature.</p>
         * <ul>
         * <li><strong>optimized</strong>: enables the feature.</li>
         * <li><strong>none</strong>: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p> For more information about the write optimization feature, see <a href="https://help.aliyun.com/document_detail/2858761.html">Write optimization</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>optimized</p>
         */
        public Builder optimizedWrites(String optimizedWrites) {
            this.putQueryParameter("OptimizedWrites", optimizedWrites);
            this.optimizedWrites = optimizedWrites;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * <li><strong>Serverless</strong>: serverless. This value is not supported for instances that run MariaDB. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of serverless ApsaraDB RDS for MySQL instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of serverless ApsaraDB RDS for SQL Server instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of serverless ApsaraDB RDS for PostgreSQL instances</a>.</li>
         * </ul>
         * <blockquote>
         * <p>The system automatically generates a purchase order and completes the payment.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you set the PayType parameter to <strong>Prepaid</strong>, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The port. You can initialize the port when you create the instance.</p>
         * <ul>
         * <li>Valid values if the instance runs MySQL: 1000 to 65534</li>
         * <li>Valid values if the instance runs PostgreSQL, SQL Server, or MariaDB: 1000 to 5999</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The private IP address of the instance. The private IP address must be within the CIDR block that is supported by the specified vSwitch. ApsaraDB RDS automatically assigns a private IP address to the instance based on the values of the <strong>VPCId</strong> and <strong>vSwitchId</strong> parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * 
         * <strong>example:</strong>
         * <p>aliwood-1688-mobile-promotion</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy*****</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) that is provided by your Alibaba Cloud account for RAM users. RAM users can use the ARN to connect ApsaraDB RDS to KMS. You can call the CheckCloudResourceAuthorized operation to query the ARN.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1406xxxxxx:role/aliyunrdsinstanceencryptiondefaultrole</p>
         */
        public Builder roleARN(String roleARN) {
            this.putQueryParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * <p>The IP address whitelist of the instance. For more information, see <a href="https://help.aliyun.com/document_detail/43185.html">Use a database client or the CLI to connect to an ApsaraDB RDS for MySQL instance</a>. If the IP address whitelist contains more than one entry, separate the entries with commas (,). Each entry must be unique. The IP address whitelist can contain up to 1,000 entries. The entries in the IP address whitelist must be in one of the following formats:</p>
         * <ul>
         * <li>IP addresses, such as 10.10.XX.XX.</li>
         * <li>CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates that the prefix of each IP address in the IP address whitelist is 24 bits in length. You can replace 24 with a value within the range of 1 to 32.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10.10.XX.XX/24</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The settings of the serverless instance. This parameter is required when you create a serverless instance.</p>
         * <blockquote>
         * <p> ApsaraDB RDS for MariaDB does not support serverless instances.</p>
         * </blockquote>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable the automatic storage expansion feature for the instance. If the instance runs MySQL or PostgreSQL, this feature is supported. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong></li>
         * <li><strong>Disable</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p> After the instance is created, you can call the ModifyDasInstanceConfig operation to adjust the settings. For more information, see <a href="https://help.aliyun.com/document_detail/173826.html">Configure automatic storage expansion</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disable</p>
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * <p>The threshold in percentage based on which automatic storage expansion is triggered. Valid values:</p>
         * <ul>
         * <li><strong>10</strong></li>
         * <li><strong>20</strong></li>
         * <li><strong>30</strong></li>
         * <li><strong>40</strong></li>
         * <li><strong>50</strong></li>
         * </ul>
         * <blockquote>
         * <p> If you set the <strong>StorageAutoScale</strong> parameter to <strong>Enable</strong>, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder storageThreshold(Integer storageThreshold) {
            this.putQueryParameter("StorageThreshold", storageThreshold);
            this.storageThreshold = storageThreshold;
            return this;
        }

        /**
         * <p>The maximum storage capacity that is allowed for automatic storage expansion. The storage capacity of the instance cannot exceed the maximum storage capacity. Unit: GB.</p>
         * <blockquote>
         * <ul>
         * <li>Valid values: an integer greater than or equal to 0.</li>
         * <li>If you set <strong>StorageAutoScale</strong> to <strong>Enable</strong>, you must specify this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder storageUpperBound(Integer storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * <p>A deprecated parameter. You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>gbk</p>
         */
        public Builder systemDBCharset(String systemDBCharset) {
            this.putQueryParameter("SystemDBCharset", systemDBCharset);
            this.systemDBCharset = systemDBCharset;
            return this;
        }

        /**
         * <p>The tags that are added to instances.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the host to which the logger instance belongs in the specified dedicated cluster.</p>
         * <p>If you want to create an instance that runs RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
         * <ul>
         * <li>You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.</li>
         * <li>If no hosts are created, you can call the CreateDedicatedHost operation to create a host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp*****3</p>
         */
        public Builder targetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
            this.putQueryParameter("TargetDedicatedHostIdForLog", targetDedicatedHostIdForLog);
            this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
            return this;
        }

        /**
         * <p>The ID of the host to which the instance belongs in the specified dedicated cluster.</p>
         * <p>If you create the instance in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
         * <ul>
         * <li>You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.</li>
         * <li>If no hosts are created, you can call the CreateDedicatedHost operation to create a host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp*****1</p>
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * <p>The ID of the host to which the secondary instance belongs in the specified dedicated cluster.</p>
         * <p>If you want to create an instance that runs RDS High-availability Edition or RDS Enterprise Edition in a dedicated cluster, you must specify this parameter. If you do not specify this parameter, the system automatically assigns a host.</p>
         * <ul>
         * <li>You can call the DescribeDedicatedHosts operation to query the host in the dedicated cluster.</li>
         * <li>If no hosts are created, you can call the CreateDedicatedHost operation to create a host.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp*****2</p>
         */
        public Builder targetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
            this.putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
            this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
            return this;
        }

        /**
         * <p>The minor engine version of the instance. This parameter is required only when you create an instance that runs MySQL or PostgreSQL. The value format varies based on the database engine of the instance.</p>
         * <ul>
         * <li><p>If you create an instance that runs MySQL, the value is in the following format: <code>&lt;RDS edition&gt;_&lt;Minor engine version&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, and <code>xcluster80_20200229</code>.</p>
         * <ul>
         * <li>rds: The instance runs RDS Basic Edition or RDS High-availability Edition.</li>
         * <li>xcluster: The instance runs MySQL 5.7 on RDS Enterprise Edition.</li>
         * <li>xcluster80: The instance runs MySQL 8.0 on RDS Enterprise Edition.</li>
         * </ul>
         * <blockquote>
         * <p>You can call the DescribeDBMiniEngineVersions operation to query the minor engine version. For more information about the differences between minor engine versions of AliSQL, see <a href="https://help.aliyun.com/document_detail/96060.html">Release notes</a>.</p>
         * </blockquote>
         * </li>
         * <li><p>If you create an instance that runs PostgreSQL, the value is in the following format: <code>rds_postgres_&lt;Major engine version&gt;00_&lt;Minor engine version&gt;</code>. Example: <code>rds_postgres_1400_20220830</code>.</p>
         * <ul>
         * <li>1400: The major engine version is PostgreSQL 14.</li>
         * <li>20220830: the AliPG version. You can call the DescribeDBMiniEngineVersions operation to query the AliPG version. For more information about minor engine versions, see <a href="https://help.aliyun.com/document_detail/126002.html">Release notes for AliPG</a>.</li>
         * </ul>
         * <blockquote>
         * <p>If you configure the <strong>BabelfishConfig</strong> parameter for your instance that runs PostgreSQL and set the babelfishEnabled field to true, the value of this parameter is in the following format: <code>rds_postgres_Major engine version00_AliPG version_babelfish</code>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rds_20200229</p>
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * <p>The subscription duration of the instance. Valid values:</p>
         * <ul>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1 to 5</strong>.</li>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of the <strong>UsedTime</strong> parameter ranges from <strong>1 to 11</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> If you set the PayType parameter to <strong>Prepaid</strong>, you must also specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The ID of the full backup file. You can call the ListUserBackupFiles operation to query the ID of the full backup file. If you want to create an instance by using the data of a backup file, you must specify this parameter.</p>
         * <p>This parameter is supported only when the following requirements are met:</p>
         * <ul>
         * <li>The <strong>PayType</strong> parameter is set to <strong>Postpaid</strong>.</li>
         * <li>The <strong>Engine</strong> parameter is set to <strong>MySQL</strong>.</li>
         * <li>The <strong>EngineVersion</strong> parameter is set to <strong>5.7</strong>.</li>
         * <li>The <strong>Category</strong> parameter is set to <strong>Basic</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>67798*****</p>
         */
        public Builder userBackupId(String userBackupId) {
            this.putQueryParameter("UserBackupId", userBackupId);
            this.userBackupId = userBackupId;
            return this;
        }

        /**
         * <p>The ID of the VPC to which the instance belongs.</p>
         * <blockquote>
         * <p>This parameter is available when you set the <strong>InstanceNetworkType</strong> parameter to <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-*****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID. The vSwitch must belong to the zone that is specified by <strong>ZoneId</strong>.</p>
         * <ul>
         * <li>If you set <strong>InstanceNetworkType</strong> to <strong>VPC</strong>, you must also specify this parameter.</li>
         * <li>If you set the <strong>ZoneSlaveId1</strong> parameter to a value that is not <strong>Auto</strong>, you must specify the IDs of two vSwitches for this parameter and separate the IDs with a comma (,). The ZoneSlaveId1 parameter specifies the zone ID of the secondary node.</li>
         * <li>The value cannot contain <code>spaces</code>, exclamation points <code>(!)</code>, or special characters such as number signs <code>(#)</code>, dollar signs <code>($)</code>, ampersands <code>(&amp;)</code>, and percent signs <code>(%)</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-*****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The entries in the whitelist. If you enter multiple IP addresses or CIDR blocks, you must separate the IP addresses or CIDR blocks with commas (,). Do not add spaces preceding or following the commas. Example: <code>192.168.0.1,172.16.213.9</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>192.XXX.XX.1,172.XXX.XX.9</p>
         */
        public Builder whitelistTemplateList(String whitelistTemplateList) {
            this.putQueryParameter("WhitelistTemplateList", whitelistTemplateList);
            this.whitelistTemplateList = whitelistTemplateList;
            return this;
        }

        /**
         * <p>The zone ID of the primary instance.</p>
         * <ul>
         * <li>If you specify a virtual private cloud (VPC) and a vSwitch, you must specify the ID of the zone to which the specified vSwitch belongs. Otherwise, the instance cannot be created.</li>
         * <li>If the instance runs RDS High-availability Edition, you must specify the <strong>ZoneIdSlave1</strong> parameter. The ZoneIdSlave1 parameter specifies whether to use the single-zone deployment method or the multi-zone deployment method.</li>
         * <li>If the instance runs RDS Enterprise Edition, you must specify the <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> parameters. The ZoneIdSlave1 and ZoneIdSlave2 parameters specify whether to use the single-zone deployment method or the multi-zone deployment method.</li>
         * <li>If the instance runs MySQL on RDS Cluster Edition, you must specify the <strong>ZoneIdSlave1</strong> parameter for the RDS cluster that has two nodes and the <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> parameters for the RDS cluster that has three nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-b</p>
         */
        public Builder zoneId(String zoneId) {
            this.putQueryParameter("ZoneId", zoneId);
            this.zoneId = zoneId;
            return this;
        }

        /**
         * <p>The zone ID of the secondary instance.</p>
         * <ul>
         * <li>If you set this parameter to <strong>Auto</strong>, the multi-zone deployment method is used and the zone of the secondary instance is automatically configured.</li>
         * <li>If you set this parameter to the same value as the <strong>ZoneId</strong> parameter, the single-zone deployment method is used.</li>
         * <li>If you set this parameter to a value that is different from the value of the <strong>ZoneId</strong> parameter, the multiple-zone deployment method is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * <p>The zone ID of the other secondary node. When you create an ApsaraDB RDS for MySQL cluster, you can create one to two secondary nodes for the cluster. This parameter applies if you create a cluster that contains two secondary nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-d</p>
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

    /**
     * 
     * {@link CreateDBInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDBInstanceRequest</p>
     */
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
             * <p>Specifies whether to enable the automatic startup and stop feature for the serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is required only for serverless instances that run MySQL and PostgreSQL. After the automatic start and stop feature is enabled, if no connections to the instance are established within 10 minutes, the instance is suspended. After a connection to the instance is established, the instance is resumed.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * <p>The maximum number of RDS Capacity Units (RCUs). Valid values:</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>1 to 32</strong></li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong></li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>1 to 14</strong></li>
             * </ul>
             * <blockquote>
             * <p> The value of this parameter must be greater than or equal to the value of the <strong>MinCapacity</strong> parameter and can be set only to an <strong>integer</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of RCUs. Valid values:</p>
             * <ul>
             * <li>Serverless ApsaraDB RDS for MySQL instances: <strong>0.5 to 32</strong>.</li>
             * <li>Serverless ApsaraDB RDS for SQL Server instances: <strong>2 to 8</strong>. Only integers are supported.</li>
             * <li>Serverless ApsaraDB RDS for PostgreSQL instances: <strong>0.5 to 14</strong></li>
             * </ul>
             * <blockquote>
             * <p> The value of this parameter must be less than or equal to the value of the <strong>MaxCapacity</strong> parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * <p>Specifies whether to enable the forced scaling feature for the serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is required only for serverless instances that run MySQL and PostgreSQL. If you set this parameter to true, a service interruption that lasts approximately 30 to 120 seconds occurs during forced scaling. Process with caution.</li>
             * <li>The RCU scaling for a serverless instance immediately takes effect. In some cases, such as the execution of large transactions, the scaling does not immediately take effect. In this case, you can enable this feature to forcefully scale the RCUs of the instance.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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

            /**
             * <p>The tag key. You can use this parameter to add tags to the instance.</p>
             * <ul>
             * <li>If the specified tag key is an existing key, the system directly adds the tag key to the instance. You can call the ListTagResources to query the existing tag.</li>
             * <li>If the specified tag key does not exist, the system creates the tag key and adds the tag key to the instance.</li>
             * <li>The value cannot be an empty string.</li>
             * <li>This parameter must be used together with the <strong>Tag.Value</strong> parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testkey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. You can use this parameter to add tags to the instance.</p>
             * <ul>
             * <li>If the specified tag value is found in the specified tag key, the system directly adds the tag value to the instance. You can call the ListTagResources to query the existing tag.</li>
             * <li>If the specified tag value is not found in the specified tag key, the system creates the tag value and adds the tag value to the instance.</li>
             * <li>This parameter must be used together with the <strong>Tag.Key</strong> parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>testvalue1</p>
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
