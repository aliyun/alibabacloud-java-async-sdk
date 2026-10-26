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
    @com.aliyun.core.annotation.NameInMap("AutoUpgradeMinorVersion")
    private String autoUpgradeMinorVersion;

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
    @com.aliyun.core.annotation.NameInMap("CustomExtraInfo")
    private String customExtraInfo;

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
    @com.aliyun.core.annotation.NameInMap("ExternalReplication")
    private Boolean externalReplication;

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
        this.autoUpgradeMinorVersion = builder.autoUpgradeMinorVersion;
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
        this.customExtraInfo = builder.customExtraInfo;
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
        this.externalReplication = builder.externalReplication;
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
     * @return autoUpgradeMinorVersion
     */
    public String getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
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
     * @return customExtraInfo
     */
    public String getCustomExtraInfo() {
        return this.customExtraInfo;
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
     * @return externalReplication
     */
    public Boolean getExternalReplication() {
        return this.externalReplication;
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
        private String autoUpgradeMinorVersion; 
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
        private String customExtraInfo; 
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
        private Boolean externalReplication; 
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
            this.autoUpgradeMinorVersion = request.autoUpgradeMinorVersion;
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
            this.customExtraInfo = request.customExtraInfo;
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
            this.externalReplication = request.externalReplication;
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
         * <p>The number of ApsaraDB RDS for MySQL instances to create. This parameter is applicable only when you create multiple ApsaraDB RDS for MySQL instances at a time.</p>
         * <p>Valid values: <strong>1</strong> to <strong>20</strong>. Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>When you create multiple ApsaraDB RDS for MySQL instances, you can use the <strong>Tag.Key</strong> and <strong>Tag.Value</strong> parameters to add tags to the instances in the same batch. This facilitates instance management by tag after creation.</li>
         * <li>After multiple instances are created, the operation returns only the <strong>TaskId</strong>, <strong>RequestId</strong>, and <strong>Message</strong> parameters, and does not return other detail parameters. To query the details of a specific instance, you can call the DescribeDBInstanceAttribute operation.</li>
         * <li>If <strong>Engine</strong> is not set to <strong>MySQL</strong> and the value of this parameter is greater than <strong>1</strong>, the operation fails and returns the error code <code>InvalidParam.Engine</code>.</li>
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
         * <p>Specifies whether to automatically create a proxy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic creation. By default, a general-purpose proxy is created.</li>
         * <li><strong>false</strong>: disables automatic creation.</li>
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
         * <p>Specifies whether to enable automatic payment. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic payment. You must ensure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: generates an order without deducting fees.</li>
         * </ul>
         * <blockquote>
         * <p>The default value is true. If your payment method has an insufficient balance, you can set AutoPay to false. In this case, an unpaid order is generated, and you can log on to the ApsaraDB RDS console to pay the order manually.</p>
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
         * <p>Specifies whether to enable auto-renewal for the instance. This parameter is valid only when you create a subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If you purchase the instance on a monthly basis, the auto-renewal epoch is one month.</li>
         * <li>If you purchase the instance on a yearly basis, the auto-renewal epoch is one year.</li>
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
         * <p>Specifies whether to enable or disable automatic minor version upgrades. Valid values:</p>
         * <ul>
         * <li><strong>Auto</strong>: Enabled.</li>
         * <li><strong>Manual</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.putQueryParameter("AutoUpgradeMinorVersion", autoUpgradeMinorVersion);
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * <p>Specifies whether to use vouchers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: uses vouchers.</li>
         * <li><strong>false</strong>: does not use vouchers. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>If you use vouchers and later need to downgrade the instance configuration, the amount deducted by the vouchers will not be refunded.</p>
         * </blockquote>
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
         * <p>The configuration information of Babelfish for ApsaraDB RDS for PostgreSQL.</p>
         * <p>Configuration format: {&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;xxxxxxx&quot;,&quot;masterUsername&quot;:&quot;xxxxxxx&quot;,&quot;masterUserPassword&quot;:&quot;xxxxxxxx&quot;}</p>
         * <p>Parameter description:</p>
         * <ul>
         * <li><strong>babelfishEnabled</strong>: specifies whether to enable Babelfish. Set the value to <strong>true</strong> to enable Babelfish. By default, Babelfish is disabled.</li>
         * <li><strong>migrationMode</strong>: the database mode. Set the value to <strong>single-db</strong> for the single-database mode or <strong>multi-db</strong> for the multi-database mode.</li>
         * <li><strong>masterUsername</strong>: the initial administrator account. The username must be 1 to 63 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It cannot start with pg.</li>
         * <li><strong>masterUserPassword</strong>: the password of the administrator account. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! @ # $ % ^ &amp; * () _ + - =</code>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Babelfish overview</a>.</p>
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
         * BpeEnabled.
         */
        public Builder bpeEnabled(String bpeEnabled) {
            this.putQueryParameter("BpeEnabled", bpeEnabled);
            this.bpeEnabled = bpeEnabled;
            return this;
        }

        /**
         * <p>Specifies whether to enable the I/O performance burst feature for premium cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature.<blockquote>
         * <p>For more information about the I/O performance burst feature for premium cloud disks, see <a href="https://help.aliyun.com/document_detail/2340501.html">What is a premium cloud disk?</a>.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The extended business parameters.</p>
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
         * <p>The instance edition. Valid values:</p>
         * <ul>
         * <li><p>Regular instances</p>
         * <ul>
         * <li><strong>Basic</strong>: Basic Edition.</li>
         * <li><strong>HighAvailability</strong>: high-availability series.</li>
         * <li><strong>cluster</strong>: Cluster Edition for MySQL or PostgreSQL.</li>
         * <li><strong>AlwaysOn</strong>: Cluster Edition for SQL Server.</li>
         * <li><strong>Finance</strong>: RDS Enterprise Edition.<blockquote>
         * <p>This parameter is required when you create a SQL Server RDS Enterprise Edition&lt;props=&quot;china&quot;&gt;, Basic Edition Standard Edition, or Basic Edition Enterprise Edition instance. For example, when you create a Basic Edition 2022 RDS Enterprise Edition (2022_ent) instance, you must set this parameter to Basic.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * <li><p>Serverless instances</p>
         * <ul>
         * <li><strong>serverless_basic</strong>: Serverless Basic Edition. This value is applicable only to MySQL and PostgreSQL.</li>
         * <li><strong>serverless_standard</strong>: Serverless high-availability series. This value is applicable only to MySQL and PostgreSQL.</li>
         * <li><strong>serverless_ha</strong>: Serverless high-availability series for SQL Server.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when PayType is set to Serverless.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The client token that is used to ensure the idempotence of the request and prevent duplicate submissions. You can use the client to generate the value, but you must ensure that the value is unique across different requests. The value can contain a maximum of 64 ASCII characters and cannot contain non-ASCII characters.</p>
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
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2701832.html">data archiving</a> feature for premium cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature.</li>
         * </ul>
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
         * <p>The access mode of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: standard access mode.</li>
         * <li><strong>Safe</strong>: database proxy mode.</li>
         * </ul>
         * <p>The default value is allocated by the RDS system.</p>
         * <blockquote>
         * <p>SQL Server 2012, 2016, and 2017 instances support only the standard access mode.</p>
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
         * <p>The internal endpoint of the database.</p>
         * <p>Endpoint format: <code>xxx.mysql.rds.aliyuncs.com</code>, where <code>xxx</code> is the prefix of the instance ID, such as rm-uf6wjk5***.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The strategy for creating multiple instances at a time. This parameter takes effect only when <strong>Amount</strong> is greater than 1. Valid values:</p>
         * <ul>
         * <li><strong>Atomicity</strong>: atomicity. All instances in the same batch are created successfully, or if one instance fails to be created, all instances fail to be created. This is the default value.</li>
         * <li><strong>Partial</strong>: non-atomicity. The creation of an instance is not affected by other instances in the same batch.</li>
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
         * CustomExtraInfo.
         */
        public Builder customExtraInfo(String customExtraInfo) {
            this.putQueryParameter("CustomExtraInfo", customExtraInfo);
            this.customExtraInfo = customExtraInfo;
            return this;
        }

        /**
         * <p>The instance type. You can specify a standard or YiTian instance type. For details, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
         * <p>To create a Serverless instance, specify one of the following values:</p>
         * <ul>
         * <li>MySQL Basic Edition: <strong>mysql.n2.serverless.1c</strong></li>
         * <li>MySQL high-availability series: <strong>mysql.n2.serverless.2c</strong></li>
         * <li>SQL Server: <strong>mssql.mem2.serverless.s2</strong></li>
         * <li>PostgreSQL Basic Edition: <strong>pg.n2.serverless.1c</strong></li>
         * <li>PostgreSQL high-availability series: <strong>pg.n2.serverless.2c</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.n2.medium.2c</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The description of the instance. The description must be 2 to 255 characters in length. It must start with a letter and can contain letters, digits, Chinese characters, and hyphens (-).</p>
         * <blockquote>
         * <p>The description cannot start with http:// or https://.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testInstance</p>
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * <p>The network connectivity type of the instance. Set the value to <strong>Intranet</strong>, which indicates an internal network connection.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder DBInstanceNetType(String DBInstanceNetType) {
            this.putQueryParameter("DBInstanceNetType", DBInstanceNetType);
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }

        /**
         * <p>Instance storage capacity of the instance. Unit: GB. Instance storage capacity increases in increments of 5 GB. For more information about the valid values, see <a href="https://help.aliyun.com/document_detail/26312.html">Primary ApsaraDB RDS instance types</a>.</p>
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
         * <p>The instance storage type. Valid values:</p>
         * <ul>
         * <li><strong>local_ssd</strong>: premium local SSD (recommended).</li>
         * <li><strong>general_essd</strong>: premium cloud disk (recommended).</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD (not recommended, and no longer available in some regions).</li>
         * </ul>
         * <p>The default value of this parameter is automatically determined based on the instance type specified by <strong>DBInstanceClass</strong>:</p>
         * <ul>
         * <li>If the instance type code indicates a premium local SSD, the default value is <strong>local_ssd</strong>.</li>
         * <li>If the instance type code indicates a cloud disk, the default value is <strong>cloud_essd</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>Serverless instances support only PL1 ESSDs and premium cloud disks.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>general_essd</p>
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * <p>Specifies whether table names are case-sensitive. Valid values:</p>
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
         * <p>The ID of the parameter template. You can call the DescribeParameterGroups operation to query the parameter template ID.</p>
         * <blockquote>
         * <p>This parameter is supported only by MySQL and PostgreSQL. If you do not specify this parameter, the default parameter template is used. You can also create a custom parameter template and specify it here.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rpg-sys-****</p>
         */
        public Builder DBParamGroupId(String DBParamGroupId) {
            this.putQueryParameter("DBParamGroupId", DBParamGroupId);
            this.DBParamGroupId = DBParamGroupId;
            return this;
        }

        /**
         * <p>The time zone of the instance. This parameter takes effect only when <strong>Engine</strong> is set to <strong>MySQL</strong> or <strong>PostgreSQL</strong>.</p>
         * <ul>
         * <li>If <strong>Engine</strong> is set to <strong>MySQL</strong>:<ul>
         * <li>This parameter configures the UTC time zone. Valid values: <strong>-12:59</strong> to <strong>+13:00</strong>.</li>
         * <li>For an instance with premium local SSDs, you can specify a named time zone, such as Asia/Hong_Kong. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
         * </ul>
         * </li>
         * <li>If <strong>Engine</strong> is set to <strong>PostgreSQL</strong>:<ul>
         * <li>This parameter configures a named time zone. UTC time zones are not supported. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
         * <li>This parameter can be configured only for ApsaraDB RDS for PostgreSQL instances with cloud disks.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can set the time zone when you purchase a primary instance. Read-only instances do not support time zone settings and inherit the time zone of the primary instance.</li>
         * <li>If you do not specify this parameter, the system selects the default time zone based on the region where the instance is created.</li>
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
         * <p>The ID of the dedicated cluster host group.</p>
         * <p>This parameter is required when you create an instance in a dedicated cluster.</p>
         * <ul>
         * <li>You can call the DescribeDedicatedHostGroups operation to query the host group information.</li>
         * <li>If you have not created a host group, you can call the CreateDedicatedHostGroup operation to create one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dhg-4n****</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the release protection feature for the ApsaraDB RDS instance. This feature is supported only for pay-as-you-go instances. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature. This is the default value.</li>
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
         * <p>Specifies whether to perform a precheck for the instance creation operation. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs a precheck but does not create the instance. The check items include request parameters, request format, business limits, and inventory.</li>
         * <li><strong>false</strong>: sends a normal request and creates the instance directly after the check passes. This is the default value.</li>
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
         * <p>The ID of the key used for cloud disk encryption in the same region. If you specify this parameter, cloud disk encryption is enabled and cannot be disabled. You must also specify <strong>RoleARN</strong>.</p>
         * <p>You can view the key ID in the Key Management Service (KMS) console or create a new key. For more information, see <a href="https://help.aliyun.com/document_detail/181610.html">Create a CMK</a>.</p>
         * <blockquote>
         * <ul>
         * <li>For ApsaraDB RDS for MySQL, ApsaraDB RDS for PostgreSQL, and ApsaraDB RDS for SQL Server instances, you do not need to specify this parameter. You only need to specify <strong>RoleARN</strong> to use the service key to create an instance with cloud disk encryption enabled.</li>
         * <li>If RAM authorization requires RAM users to enable cloud disk encryption when creating instances, the instances cannot be created if cloud disk encryption is not enabled. Configure the following RAM policy for the RAM user:
         * <code>{&quot;Version&quot;:&quot;1&quot;,&quot;Statement&quot;:[{&quot;Effect&quot;:&quot;Deny&quot;,&quot;Action&quot;:&quot;rds:CreateDBInstance&quot;,&quot;Resource&quot;:&quot;*&quot;,&quot;Condition&quot;:{&quot;StringEquals&quot;:{&quot;rds:DiskEncryptionRequired&quot;:&quot;false&quot;}}}]}</code>
         * Warning: This configuration also affects the CreateOrder operation for creating instances in the console.</li>
         * </ul>
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
         * <p>The database engine. Valid values:</p>
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
         * <p>The database engine version. Valid values:</p>
         * <ul>
         * <li>Regular instances<ul>
         * <li>MySQL: <strong>5.5</strong>, <strong>5.6</strong>, <strong>5.7</strong>, and <strong>8.0</strong></li>
         * <li>SQL Server: <strong>08r2_ent_ha</strong> (cloud disk edition, discontinued), <strong>2008r2</strong> (premium local SSD, discontinued), <strong>2012</strong> (Enterprise Edition standalone), <strong>2012_ent_ha</strong>, <strong>2012_std_ha</strong>, <strong>2012_web</strong>, <strong>2014_ent_ha</strong>, <strong>2014_std_ha</strong>, <strong>2016_ent_ha</strong>, <strong>2016_std_ha</strong>, <strong>2016_web</strong>, <strong>2017_ent</strong>, <strong>2017_std_ha</strong>, <strong>2017_web</strong>, <strong>2019_ent</strong>, <strong>2019_std_ha</strong>, <strong>2019_web</strong>, <strong>2022_ent</strong>, <strong>2022_std_ha</strong>, <strong>2022_web</strong>, <strong>2025_ent</strong>, and <strong>2025_std</strong></li>
         * <li>PostgreSQL: <strong>10.0</strong>, <strong>11.0</strong>, <strong>12.0</strong>, <strong>13.0</strong>, <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong>, <strong>17.0</strong>, and <strong>18.0</strong></li>
         * <li>MariaDB: <strong>10.3</strong> and <strong>10.6</strong></li>
         * </ul>
         * </li>
         * <li>Serverless instances<ul>
         * <li>MySQL: <strong>5.7</strong> and <strong>8.0</strong></li>
         * <li>SQL Server: <strong>2016_std_sl</strong>, <strong>2017_std_sl</strong>, and <strong>2019_std_sl</strong></li>
         * <li>PostgreSQL: <strong>14.0</strong>, <strong>15.0</strong>, <strong>16.0</strong>, <strong>17.0</strong>, and <strong>18.0</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>MariaDB does not support Serverless instances.</li>
         * <li>For SQL Server instances, <code>_ent</code> indicates Enterprise Cluster Edition, <code>_ent_ha</code> indicates Enterprise Edition, <code>_std_ha</code> indicates Standard Edition, and <code>_web</code> indicates Web Edition.</li>
         * <li>SQL Server 2014 instances are not available on the international site.</li>
         * <li>Babelfish for ApsaraDB RDS for PostgreSQL instances support only major version 15.0.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * <p>Specifies whether to enable <a href="https://help.aliyun.com/document_detail/2856526.html">native replication for ApsaraDB RDS for MySQL</a>. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong>: enables the feature.</li>
         * <li><strong>OFF</strong>: disables the feature.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder externalReplication(Boolean externalReplication) {
            this.putQueryParameter("ExternalReplication", externalReplication);
            this.externalReplication = externalReplication;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: VPC.</li>
         * <li><strong>Classic</strong>: classic network.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>ApsaraDB RDS for MySQL cloud disk instances support only VPCs. You must set this parameter to <strong>VPC</strong>.</li>
         * <li>ApsaraDB RDS for PostgreSQL and ApsaraDB RDS for MariaDB instances support only VPCs. You must set this parameter to <strong>VPC</strong>.</li>
         * <li>ApsaraDB RDS for SQL Server Basic Edition and Web Edition instances support both the classic network and VPCs. Other instances support only VPCs. You must set this parameter to <strong>VPC</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE)</a> feature for premium cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the feature.</li>
         * <li><strong>0</strong>: disables the feature.</li>
         * </ul>
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
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2858761.html">16KB atomic write</a> feature. Valid values:</p>
         * <ul>
         * <li><strong>optimized</strong>: enables the feature.</li>
         * <li><strong>none</strong>: disables the feature. This is the default value.</li>
         * </ul>
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
         * <li><strong>Serverless</strong>: serverless billing method. MariaDB instances are not supported. For more information, see <a href="https://help.aliyun.com/document_detail/411291.html">Overview of ApsaraDB RDS for MySQL Serverless instances</a>, <a href="https://help.aliyun.com/document_detail/604344.html">Overview of ApsaraDB RDS for SQL Server Serverless instances</a>, and <a href="https://help.aliyun.com/document_detail/607742.html">Overview of ApsaraDB RDS for PostgreSQL Serverless instances</a>.<blockquote>
         * <p>The system automatically generates an order and completes the payment. You do not need to manually confirm the payment.</p>
         * </blockquote>
         * </li>
         * </ul>
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
         * <p>The subscription period of the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: yearly subscription.</li>
         * <li><strong>Month</strong>: monthly subscription.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
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
         * <p>The port used to initialize the instance during creation. Valid values:</p>
         * <ul>
         * <li>MySQL: 1000 to 65534</li>
         * <li>PostgreSQL, SQL Server, and MariaDB: 1000 to 5999</li>
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
         * <p>The internal IP address of the instance. The IP address must be within the address range of the specified vSwitch. By default, the system automatically allocates an IP address based on <strong>VPCId</strong> and <strong>VSwitchId</strong>.</p>
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
         * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/610399.html">DescribeRegions</a> operation to query the region ID.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmy****</p>
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
         * <p>The global resource descriptor (ARN) used for the authorization of the ApsaraDB RDS service account to access KMS. You can invoke the CheckCloudResourceAuthorized operation to query the ARN.</p>
         * <blockquote>
         * <p>Notice: When you enable cloud disk encryption, you must specify <strong>RoleARN</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1406****:role/aliyunrdsinstanceencryptiondefaultrole</p>
         */
        public Builder roleARN(String roleARN) {
            this.putQueryParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/43185.html">IP address whitelist</a> of the instance. Separate multiple IP addresses or CIDR blocks with commas (,). Duplicate IP addresses or CIDR blocks are not allowed. You can add up to 1,000 IP addresses or CIDR blocks to the whitelist of a single instance. The following formats are supported:</p>
         * <ul>
         * <li>IP addresses, such as 10.10.XX.XX.</li>
         * <li>CIDR blocks, such as 10.10.XX.XX/24. In this example, 24 indicates the length of the prefix in the CIDR block, and the prefix length ranges from 1 to 32.</li>
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
         * <p>The settings for the ApsaraDB RDS Serverless instance. This parameter is required when you create a Serverless instance.</p>
         * <blockquote>
         * <p>MariaDB does not support Serverless instances.</p>
         * </blockquote>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic storage expansion. This parameter is supported only by MySQL and PostgreSQL. Valid values:</p>
         * <ul>
         * <li><strong>Enable</strong>: enables automatic storage expansion.</li>
         * <li><strong>Disable</strong>: disables automatic storage expansion. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>You can also call the ModifyDasInstanceConfig operation to adjust this setting after the instance is created. For more information, see <a href="https://help.aliyun.com/document_detail/173826.html">Enable automatic storage expansion</a>.</p>
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
         * <p>The threshold percentage that triggers automatic storage expansion. Valid values:</p>
         * <ul>
         * <li><strong>10</strong></li>
         * <li><strong>20</strong></li>
         * <li><strong>30</strong></li>
         * <li><strong>40</strong></li>
         * <li><strong>50</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>StorageAutoScale</strong> is set to <strong>Enable</strong>.</p>
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
         * <p>The upper limit of the total storage capacity for automatic storage expansion. The automatic expansion does not cause the total storage capacity of the instance to exceed this value. Unit: GB.</p>
         * <blockquote>
         * <ul>
         * <li>The value must be greater than or equal to 0.</li>
         * <li>This parameter is required when <strong>StorageAutoScale</strong> is set to <strong>Enable</strong>.</li>
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
         * <p>Deprecated. You do not need to configure this parameter.</p>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the host on which the logger instance is created in the dedicated cluster.</p>
         * <p>This parameter is required when you create an RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
         * <ul>
         * <li>You can invoke the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.</li>
         * <li>If you do not have a host, you can invoke the CreateDedicatedHost operation to add one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp****</p>
         */
        public Builder targetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
            this.putQueryParameter("TargetDedicatedHostIdForLog", targetDedicatedHostIdForLog);
            this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
            return this;
        }

        /**
         * <p>The ID of the host on which the primary instance is created in the dedicated cluster.</p>
         * <p>This parameter is required when you create an instance in a dedicated cluster. If you do not specify this parameter, the system automatically assigns a host.</p>
         * <ul>
         * <li>You can call the DescribeDedicatedHosts operation to query the host information in the host group.</li>
         * <li>If you do not have a host, you can call the CreateDedicatedHost operation to add one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp****</p>
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * <p>The ID of the host on which the secondary instance is created in the dedicated cluster.</p>
         * <p>This parameter is required when you create a high-availability series or RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
         * <ul>
         * <li>You can invoke the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.</li>
         * <li>If you do not have a host, you can invoke the CreateDedicatedHost operation to add one.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>i-bp****</p>
         */
        public Builder targetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
            this.putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
            this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
            return this;
        }

        /**
         * <p>The minor engine version of the ApsaraDB RDS instance. This parameter is required only when you create a MySQL or PostgreSQL instance.
         * Format:</p>
         * <ul>
         * <li><p>MySQL: <code>&lt;Instance version&gt;_&lt;Numeric version number&gt;</code>. Examples: <code>rds_20200229</code>, <code>xcluster_20200229</code>, and <code>xcluster80_20200229</code>. Description:</p>
         * <ul>
         * <li>rds: high-availability series or Basic Edition.</li>
         * <li>xcluster: MySQL 5.7 RDS Enterprise Edition.</li>
         * <li>xcluster80: MySQL 8.0 RDS Enterprise Edition.</li>
         * </ul>
         * <blockquote>
         * <p>You can invoke the DescribeDBMiniEngineVersions operation to query the numeric version number. For more information about the differences between versions, see <a href="https://help.aliyun.com/document_detail/96060.html">AliSQL release notes</a>.</p>
         * </blockquote>
         * </li>
         * <li><p>PostgreSQL: <code>rds_postgres_&lt;Major version&gt;00_&lt;Minor version number&gt;</code>. Example: <code>rds_postgres_1400_20220830</code>. Description:</p>
         * <ul>
         * <li>1400: PostgreSQL major version 14.</li>
         * <li>20220830: AliPG minor engine version. You can invoke the DescribeDBMiniEngineVersions operation to query the minor engine version. For more information about the differences between versions, see <a href="https://help.aliyun.com/document_detail/126002.html">PostgreSQL release notes</a>.</li>
         * </ul>
         * <blockquote>
         * <p>If Babelfish is enabled in <strong>BabelfishConfig</strong>, the minor engine version format for the ApsaraDB RDS for PostgreSQL instance is <code>rds_postgres_&lt;Major version&gt;00_&lt;AliPG minor engine version&gt;_babelfish</code>.</p>
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
         * <p>The subscription duration. Valid values:</p>
         * <ul>
         * <li>If <strong>Period</strong> is set to <strong>Year</strong>, the valid values of <strong>UsedTime</strong> are <strong>1</strong> to <strong>5</strong>.</li>
         * <li>If <strong>Period</strong> is set to <strong>Month</strong>, the valid values of <strong>UsedTime</strong> are <strong>1</strong> to <strong>11</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
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
         * <p>The ID of the user backup. You can call the ListUserBackupFiles operation to query the backup ID. If you specify this parameter, the instance is created based on the user backup.</p>
         * <p>If you specify this parameter, the following limits apply:</p>
         * <ul>
         * <li><strong>PayType</strong> must be set to <strong>Postpaid</strong>.</li>
         * <li><strong>Engine</strong> must be set to <strong>MySQL</strong>.</li>
         * <li><strong>EngineVersion</strong> must be set to <strong>5.7</strong>.</li>
         * <li><strong>Category</strong> must be set to <strong>Basic</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>67798****</p>
         */
        public Builder userBackupId(String userBackupId) {
            this.putQueryParameter("UserBackupId", userBackupId);
            this.userBackupId = userBackupId;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the network type <strong>InstanceNetworkType</strong> is set to <strong>VPC</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <ul>
         * <li><strong>Zone mapping</strong>: The zone of the vSwitch specified by VSwitchId must correspond to the zone of the primary node (ZoneId) and the zone of the secondary node (ZoneIdSlave1). If you specify two vSwitch IDs, their sequence must match the sequence of ZoneId and ZoneIdSlave1.</li>
         * <li><strong>Network type limit</strong>: <strong>InstanceNetworkType</strong> must be set to <strong>VPC</strong>.</li>
         * <li><strong>Multiple vSwitches</strong>: If you specify <strong>ZoneIdSlave1</strong> and the value is not <strong>Auto</strong>, you must specify two vSwitch IDs and separate them with a comma (,).</li>
         * <li><strong>Character limit</strong>: VSwitchId cannot contain special characters such as spaces, exclamation marks (!), number signs (#), yen signs (¥), ampersands (&amp;), or percent signs (%).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The whitelist templates.
         * When you need to configure multiple IP addresses, separate multiple IP addresses or CIDR blocks with commas (,). Do not include spaces before or after the commas. Example: <code>192.168.0.1,172.16.213.9</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.0.1,172.16.213.9</p>
         */
        public Builder whitelistTemplateList(String whitelistTemplateList) {
            this.putQueryParameter("WhitelistTemplateList", whitelistTemplateList);
            this.whitelistTemplateList = whitelistTemplateList;
            return this;
        }

        /**
         * <p>The zone ID of the primary node.</p>
         * <ul>
         * <li>If you specify a VPC and a vSwitch, you must specify the zone ID of the target vSwitch. Otherwise, the instance cannot be created.</li>
         * <li>For a high-availability series instance, you must also specify <strong>ZoneIdSlave1</strong> to determine whether the instance uses a single-zone deployment or a multi-zone deployment.</li>
         * <li>For an RDS Enterprise Edition instance, you must also specify <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> to determine whether the instance uses a single-zone deployment or a multi-zone deployment.</li>
         * <li>For an ApsaraDB RDS for MySQL Cluster Edition instance, you must also specify <strong>ZoneIdSlave1</strong> for a two-node instance, and <strong>ZoneIdSlave1</strong> and <strong>ZoneIdSlave2</strong> for a three-node instance.</li>
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
         * <p>The zone ID of the secondary node.</p>
         * <ul>
         * <li>If you set this parameter to <strong>Auto</strong>, the instance uses a multi-zone deployment, and the system automatically selects a zone for the secondary node.</li>
         * <li>If you set this parameter to the same value as <strong>ZoneId</strong>, the instance uses a single-zone deployment.</li>
         * <li>If you set this parameter to a value different from <strong>ZoneId</strong>, the instance uses a multi-zone deployment.</li>
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
         * <p>The zone ID of the second secondary node. ApsaraDB RDS for MySQL Cluster Edition instances support the creation of one or two secondary nodes when you create the instance. If you want to create a second secondary node, you can use this parameter to specify the zone of the second secondary node.</p>
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

            private Builder() {
            } 

            private Builder(ServerlessConfig model) {
                this.autoPause = model.autoPause;
                this.maxCapacity = model.maxCapacity;
                this.minCapacity = model.minCapacity;
                this.switchForce = model.switchForce;
            } 

            /**
             * <p>Specifies whether to enable the smart pause and start feature for the Serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables the feature.</li>
             * <li><strong>false</strong>: disables the feature. This is the default value.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is required only for MySQL and PostgreSQL Serverless instances. If no connections are established within 10 minutes, the instance enters the paused state. When a connection is established, the instance is automatically awakened.</p>
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
             * <p>The maximum number of RDS capacity units (RCUs) for automatic scaling. Valid values:</p>
             * <ul>
             * <li>MySQL: <strong>1</strong> to <strong>32</strong></li>
             * <li>SQL Server: <strong>2</strong> to <strong>16</strong></li>
             * <li>PostgreSQL: <strong>1</strong> to <strong>14</strong></li>
             * </ul>
             * <blockquote>
             * <p>The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong>, and only <strong>integers</strong> are supported.</p>
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
             * <p>The minimum number of RCUs for automatic scaling. Valid values:</p>
             * <ul>
             * <li>MySQL: <strong>0.5</strong> to <strong>32</strong></li>
             * <li>SQL Server: <strong>2</strong> to <strong>16</strong> (integers only)</li>
             * <li>PostgreSQL: <strong>0.5</strong> to <strong>14</strong></li>
             * </ul>
             * <blockquote>
             * <p>The value of this parameter must be less than or equal to the value of <strong>MaxCapacity</strong>.</p>
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
             * <p>Specifies whether to enable forced elastic scaling for the Serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables the feature.</li>
             * <li><strong>false</strong>: disables the feature. This is the default value.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is required only for MySQL and PostgreSQL Serverless instances. After you enable this feature, the instance may be unavailable for 30 to 120 seconds during forced scaling. Use this feature with caution based on your business requirements.</li>
             * <li>Elastic scaling of RCUs usually takes effect immediately. However, in some special cases (such as during the execution of large transactions), scaling cannot be completed immediately. In this case, you can enable this parameter to force scaling.</li>
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key. You can specify this parameter to add a tag to the instance.</p>
             * <ul>
             * <li>If the specified tag key already exists, the tag key is directly added to the instance. You can call the ListTagResources operation to query existing tags.</li>
             * <li>If the specified tag key does not exist, the tag key is created and then added to the instance.</li>
             * <li>Empty strings are not allowed.</li>
             * <li>This parameter must be used together with <strong>Tag.Value</strong>.</li>
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
             * <p>The tag value that corresponds to the tag key. You can specify this parameter to add a tag to the instance.</p>
             * <ul>
             * <li>If the specified tag value exists for the corresponding tag key, the tag value is directly added to the instance. You can call the ListTagResources operation to query existing tags.</li>
             * <li>If the specified tag value does not exist for the corresponding tag key, the tag value is created and then added to the instance.</li>
             * <li>This parameter must be used together with <strong>Tag.Key</strong>.</li>
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
