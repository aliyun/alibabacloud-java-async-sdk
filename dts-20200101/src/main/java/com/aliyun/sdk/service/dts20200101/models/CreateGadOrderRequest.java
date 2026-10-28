// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link CreateGadOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateGadOrderRequest</p>
 */
public class CreateGadOrderRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

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
    private String DBInstanceClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
    private String DBInstanceNetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceStorage")
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
    @com.aliyun.core.annotation.NameInMap("DbList")
    private String dbList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbListMode")
    private Integer dbListMode;

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
    private String engineVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IoAccelerationEnabled")
    private String ioAccelerationEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterAccountExist")
    private Boolean masterAccountExist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterAccountName")
    private String masterAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterAccountPassword")
    private String masterAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterDatabaseName")
    private String masterDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterEngineArchType")
    private String masterEngineArchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
    private String masterInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterRegion")
    private String masterRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterShardAccountName")
    private String masterShardAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterShardAccountPassword")
    private String masterShardAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedCreateSlave")
    private Boolean needCreateSlave;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
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
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RoleARN")
    private String roleARN;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessConfig")
    private ServerlessConfig serverlessConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveAccountExist")
    private Boolean slaveAccountExist;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveAccountName")
    private String slaveAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveAccountPassword")
    private String slaveAccountPassword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveDatabaseName")
    private String slaveDatabaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveEngineArchType")
    private String slaveEngineArchType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveInstanceId")
    private String slaveInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveReadOnly")
    private Boolean slaveReadOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SlaveRegion")
    private String slaveRegion;

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
    @com.aliyun.core.annotation.NameInMap("SyncAccountType")
    private String syncAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncArchitecture")
    private String syncArchitecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SyncConflict")
    private String syncConflict;

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
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

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

    private CreateGadOrderRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoCreateProxy = builder.autoCreateProxy;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.babelfishConfig = builder.babelfishConfig;
        this.bpeEnabled = builder.bpeEnabled;
        this.burstingEnabled = builder.burstingEnabled;
        this.businessInfo = builder.businessInfo;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.clusterId = builder.clusterId;
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
        this.dbList = builder.dbList;
        this.dbListMode = builder.dbListMode;
        this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
        this.deletionProtection = builder.deletionProtection;
        this.dryRun = builder.dryRun;
        this.encryptionKey = builder.encryptionKey;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.ioAccelerationEnabled = builder.ioAccelerationEnabled;
        this.masterAccountExist = builder.masterAccountExist;
        this.masterAccountName = builder.masterAccountName;
        this.masterAccountPassword = builder.masterAccountPassword;
        this.masterDatabaseName = builder.masterDatabaseName;
        this.masterEngineArchType = builder.masterEngineArchType;
        this.masterInstanceId = builder.masterInstanceId;
        this.masterRegion = builder.masterRegion;
        this.masterShardAccountName = builder.masterShardAccountName;
        this.masterShardAccountPassword = builder.masterShardAccountPassword;
        this.needCreateSlave = builder.needCreateSlave;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.port = builder.port;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.roleARN = builder.roleARN;
        this.securityIPList = builder.securityIPList;
        this.serverlessConfig = builder.serverlessConfig;
        this.slaveAccountExist = builder.slaveAccountExist;
        this.slaveAccountName = builder.slaveAccountName;
        this.slaveAccountPassword = builder.slaveAccountPassword;
        this.slaveDatabaseName = builder.slaveDatabaseName;
        this.slaveEngineArchType = builder.slaveEngineArchType;
        this.slaveInstanceId = builder.slaveInstanceId;
        this.slaveReadOnly = builder.slaveReadOnly;
        this.slaveRegion = builder.slaveRegion;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageThreshold = builder.storageThreshold;
        this.storageUpperBound = builder.storageUpperBound;
        this.syncAccountType = builder.syncAccountType;
        this.syncArchitecture = builder.syncArchitecture;
        this.syncConflict = builder.syncConflict;
        this.systemDBCharset = builder.systemDBCharset;
        this.tag = builder.tag;
        this.targetDedicatedHostIdForLog = builder.targetDedicatedHostIdForLog;
        this.targetDedicatedHostIdForMaster = builder.targetDedicatedHostIdForMaster;
        this.targetDedicatedHostIdForSlave = builder.targetDedicatedHostIdForSlave;
        this.targetMinorVersion = builder.targetMinorVersion;
        this.usedTime = builder.usedTime;
        this.userBackupId = builder.userBackupId;
        this.vSwitchId = builder.vSwitchId;
        this.vpcId = builder.vpcId;
        this.whitelistTemplateList = builder.whitelistTemplateList;
        this.zoneId = builder.zoneId;
        this.zoneIdSlave1 = builder.zoneIdSlave1;
        this.zoneIdSlave2 = builder.zoneIdSlave2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGadOrderRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
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
     * @return dbList
     */
    public String getDbList() {
        return this.dbList;
    }

    /**
     * @return dbListMode
     */
    public Integer getDbListMode() {
        return this.dbListMode;
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
     * @return masterAccountExist
     */
    public Boolean getMasterAccountExist() {
        return this.masterAccountExist;
    }

    /**
     * @return masterAccountName
     */
    public String getMasterAccountName() {
        return this.masterAccountName;
    }

    /**
     * @return masterAccountPassword
     */
    public String getMasterAccountPassword() {
        return this.masterAccountPassword;
    }

    /**
     * @return masterDatabaseName
     */
    public String getMasterDatabaseName() {
        return this.masterDatabaseName;
    }

    /**
     * @return masterEngineArchType
     */
    public String getMasterEngineArchType() {
        return this.masterEngineArchType;
    }

    /**
     * @return masterInstanceId
     */
    public String getMasterInstanceId() {
        return this.masterInstanceId;
    }

    /**
     * @return masterRegion
     */
    public String getMasterRegion() {
        return this.masterRegion;
    }

    /**
     * @return masterShardAccountName
     */
    public String getMasterShardAccountName() {
        return this.masterShardAccountName;
    }

    /**
     * @return masterShardAccountPassword
     */
    public String getMasterShardAccountPassword() {
        return this.masterShardAccountPassword;
    }

    /**
     * @return needCreateSlave
     */
    public Boolean getNeedCreateSlave() {
        return this.needCreateSlave;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
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
     * @return slaveAccountExist
     */
    public Boolean getSlaveAccountExist() {
        return this.slaveAccountExist;
    }

    /**
     * @return slaveAccountName
     */
    public String getSlaveAccountName() {
        return this.slaveAccountName;
    }

    /**
     * @return slaveAccountPassword
     */
    public String getSlaveAccountPassword() {
        return this.slaveAccountPassword;
    }

    /**
     * @return slaveDatabaseName
     */
    public String getSlaveDatabaseName() {
        return this.slaveDatabaseName;
    }

    /**
     * @return slaveEngineArchType
     */
    public String getSlaveEngineArchType() {
        return this.slaveEngineArchType;
    }

    /**
     * @return slaveInstanceId
     */
    public String getSlaveInstanceId() {
        return this.slaveInstanceId;
    }

    /**
     * @return slaveReadOnly
     */
    public Boolean getSlaveReadOnly() {
        return this.slaveReadOnly;
    }

    /**
     * @return slaveRegion
     */
    public String getSlaveRegion() {
        return this.slaveRegion;
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
     * @return syncAccountType
     */
    public String getSyncAccountType() {
        return this.syncAccountType;
    }

    /**
     * @return syncArchitecture
     */
    public String getSyncArchitecture() {
        return this.syncArchitecture;
    }

    /**
     * @return syncConflict
     */
    public String getSyncConflict() {
        return this.syncConflict;
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

    public static final class Builder extends Request.Builder<CreateGadOrderRequest, Builder> {
        private Integer amount; 
        private Boolean autoCreateProxy; 
        private Boolean autoPay; 
        private String autoRenew; 
        private String babelfishConfig; 
        private String bpeEnabled; 
        private Boolean burstingEnabled; 
        private String businessInfo; 
        private String category; 
        private String clientToken; 
        private String clusterId; 
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
        private String dbList; 
        private Integer dbListMode; 
        private String dedicatedHostGroupId; 
        private Boolean deletionProtection; 
        private Boolean dryRun; 
        private String encryptionKey; 
        private String engine; 
        private String engineVersion; 
        private String instanceNetworkType; 
        private String ioAccelerationEnabled; 
        private Boolean masterAccountExist; 
        private String masterAccountName; 
        private String masterAccountPassword; 
        private String masterDatabaseName; 
        private String masterEngineArchType; 
        private String masterInstanceId; 
        private String masterRegion; 
        private String masterShardAccountName; 
        private String masterShardAccountPassword; 
        private Boolean needCreateSlave; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String port; 
        private String privateIpAddress; 
        private String regionId; 
        private String resourceGroupId; 
        private String roleARN; 
        private String securityIPList; 
        private ServerlessConfig serverlessConfig; 
        private Boolean slaveAccountExist; 
        private String slaveAccountName; 
        private String slaveAccountPassword; 
        private String slaveDatabaseName; 
        private String slaveEngineArchType; 
        private String slaveInstanceId; 
        private Boolean slaveReadOnly; 
        private String slaveRegion; 
        private String storageAutoScale; 
        private Integer storageThreshold; 
        private Integer storageUpperBound; 
        private String syncAccountType; 
        private String syncArchitecture; 
        private String syncConflict; 
        private String systemDBCharset; 
        private java.util.List<Tag> tag; 
        private String targetDedicatedHostIdForLog; 
        private String targetDedicatedHostIdForMaster; 
        private String targetDedicatedHostIdForSlave; 
        private String targetMinorVersion; 
        private String usedTime; 
        private String userBackupId; 
        private String vSwitchId; 
        private String vpcId; 
        private String whitelistTemplateList; 
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(CreateGadOrderRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoCreateProxy = request.autoCreateProxy;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.babelfishConfig = request.babelfishConfig;
            this.bpeEnabled = request.bpeEnabled;
            this.burstingEnabled = request.burstingEnabled;
            this.businessInfo = request.businessInfo;
            this.category = request.category;
            this.clientToken = request.clientToken;
            this.clusterId = request.clusterId;
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
            this.dbList = request.dbList;
            this.dbListMode = request.dbListMode;
            this.dedicatedHostGroupId = request.dedicatedHostGroupId;
            this.deletionProtection = request.deletionProtection;
            this.dryRun = request.dryRun;
            this.encryptionKey = request.encryptionKey;
            this.engine = request.engine;
            this.engineVersion = request.engineVersion;
            this.instanceNetworkType = request.instanceNetworkType;
            this.ioAccelerationEnabled = request.ioAccelerationEnabled;
            this.masterAccountExist = request.masterAccountExist;
            this.masterAccountName = request.masterAccountName;
            this.masterAccountPassword = request.masterAccountPassword;
            this.masterDatabaseName = request.masterDatabaseName;
            this.masterEngineArchType = request.masterEngineArchType;
            this.masterInstanceId = request.masterInstanceId;
            this.masterRegion = request.masterRegion;
            this.masterShardAccountName = request.masterShardAccountName;
            this.masterShardAccountPassword = request.masterShardAccountPassword;
            this.needCreateSlave = request.needCreateSlave;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.port = request.port;
            this.privateIpAddress = request.privateIpAddress;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.roleARN = request.roleARN;
            this.securityIPList = request.securityIPList;
            this.serverlessConfig = request.serverlessConfig;
            this.slaveAccountExist = request.slaveAccountExist;
            this.slaveAccountName = request.slaveAccountName;
            this.slaveAccountPassword = request.slaveAccountPassword;
            this.slaveDatabaseName = request.slaveDatabaseName;
            this.slaveEngineArchType = request.slaveEngineArchType;
            this.slaveInstanceId = request.slaveInstanceId;
            this.slaveReadOnly = request.slaveReadOnly;
            this.slaveRegion = request.slaveRegion;
            this.storageAutoScale = request.storageAutoScale;
            this.storageThreshold = request.storageThreshold;
            this.storageUpperBound = request.storageUpperBound;
            this.syncAccountType = request.syncAccountType;
            this.syncArchitecture = request.syncArchitecture;
            this.syncConflict = request.syncConflict;
            this.systemDBCharset = request.systemDBCharset;
            this.tag = request.tag;
            this.targetDedicatedHostIdForLog = request.targetDedicatedHostIdForLog;
            this.targetDedicatedHostIdForMaster = request.targetDedicatedHostIdForMaster;
            this.targetDedicatedHostIdForSlave = request.targetDedicatedHostIdForSlave;
            this.targetMinorVersion = request.targetMinorVersion;
            this.usedTime = request.usedTime;
            this.userBackupId = request.userBackupId;
            this.vSwitchId = request.vSwitchId;
            this.vpcId = request.vpcId;
            this.whitelistTemplateList = request.whitelistTemplateList;
            this.zoneId = request.zoneId;
            this.zoneIdSlave1 = request.zoneIdSlave1;
            this.zoneIdSlave2 = request.zoneIdSlave2;
        } 

        /**
         * <p>The number of ApsaraDB RDS for MySQL instances to be created. This parameter is applicable only when you create multiple ApsaraDB RDS for MySQL instances at a time.</p>
         * <p>Valid values: 1 to 20. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to automatically create a proxy. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables automatic creation. By default, a general-purpose proxy is created.</p>
         * </li>
         * <li><p><strong>false</strong>: disables automatic creation.</p>
         * </li>
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
         * <p>Specifies whether to enable auto-renewal upon expiration. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: no. This is the default value.</li>
         * <li><strong>true</strong>: yes.</li>
         * </ul>
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
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true: enables auto-renewal.</li>
         * <li>false: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The configuration information of Babelfish for ApsaraDB RDS for PostgreSQL.</p>
         * <p>Configuration format: {&quot;babelfishEnabled&quot;:&quot;true&quot;,&quot;migrationMode&quot;:&quot;xxxxxxx&quot;,&quot;masterUsername&quot;:&quot;xxxxxxx&quot;,&quot;masterUserPassword&quot;:&quot;xxxxxxxx&quot;}</p>
         * <p>Parameter descriptions:</p>
         * <ul>
         * <li><strong>babelfishEnabled</strong>: specifies whether to enable Babelfish. Set the value to <strong>true</strong> to enable Babelfish. By default, Babelfish is disabled if this parameter is not configured.</li>
         * <li><strong>migrationMode</strong>: the database mode. Set the value to <strong>single-db</strong> for the single-database mode or <strong>multi-db</strong> for the multi-database mode.</li>
         * <li><strong>masterUsername</strong>: the initial administrator account. The username must be 1 to 63 characters in length and can contain lowercase letters, digits, and underscores (_). It must start with a letter and end with a letter or digit. It cannot start with pg.</li>
         * <li><strong>masterUserPassword</strong>: the password of the administrator account. The password must be 8 to 32 characters in length and must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include <code>! @ # $ % ^ &amp; * () _ + - =</code>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is applicable only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see <a href="https://help.aliyun.com/document_detail/428613.html">Babelfish overview</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;isAnalyticReadOnlyIns\&quot;:\&quot;true\&quot;}</p>
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
         * <p>Specifies whether to enable the I/O performance burst feature for ESSD AutoPL cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the feature.</li>
         * <li><strong>false</strong>: disables the feature. This is the default value.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when StorageType is set to ESSDAUTOPL.</p>
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
         * <p>The additional parameter that specifies business information.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * <p>The instance edition. Valid values:</p>
         * <p>General instances:
         * Basic: Basic Edition.
         * HighAvailability: high-availability series.
         * cluster: Cluster Edition for MySQL or PostgreSQL.
         * AlwaysOn: Cluster Edition for SQL Server.
         * Finance: RDS Enterprise Edition.
         * Note: This parameter is required when you create an ApsaraDB RDS for SQL Server instance of the RDS Enterprise Edition, Basic Edition Standard, or Basic Edition Enterprise. For example, when you create a Basic Edition instance of the 2022 RDS Enterprise Edition (2022_ent), you must set this parameter to Basic.
         * Serverless instances:
         * serverless_basic: Serverless Basic Edition. This edition is active only for MySQL and PostgreSQL.</p>
         * <p>serverless_standard: Serverless high availability series. This edition is active only for MySQL and PostgreSQL.</p>
         * <p>serverless_ha: SQL Server Serverless high availability series.</p>
         * <p>Note: This parameter is required when PayType is set to Serverless.</p>
         * 
         * <strong>example:</strong>
         * <p>AlwaysOn</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. The portal rewrites this parameter as a random UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gad-x32115vv105f427</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the <a href="https://help.aliyun.com/document_detail/2701832.html">data archiving</a> feature for premium performance disks. Valid values:</p>
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
         * <p>Default value: allocated by the RDS system.</p>
         * <blockquote>
         * <p>SQL Server 2012, 2016, and 2017 support only the standard access mode.</p>
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
         * <p>The database connection address.</p>
         * 
         * <strong>example:</strong>
         * <p>Mid-end service</p>
         */
        public Builder connectionString(String connectionString) {
            this.putQueryParameter("ConnectionString", connectionString);
            this.connectionString = connectionString;
            return this;
        }

        /**
         * <p>The policy for creating multiple instances at a time. This parameter takes effect only when the <strong>Amount</strong> parameter is set to a value greater than 1. Valid values:</p>
         * <ul>
         * <li><strong>Atomicity</strong> (default): atomicity. All instances in the same batch are created successfully, or if one instance fails to be created, all instances fail to be created.</li>
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
         * <p>The instance type. Valid values:</p>
         * <ul>
         * <li><strong>selectdb.xlarge</strong>: 4 cores, 32 GB.</li>
         * <li><strong>selectdb.2xlarge</strong>: 8 cores, 64 GB.</li>
         * <li><strong>selectdb.4xlarge</strong>: 16 cores, 128 GB.</li>
         * <li><strong>selectdb.8xlarge</strong>: 32 cores, 256 GB.</li>
         * <li><strong>selectdb.16xlarge</strong>: 64 cores, 512 GB.</li>
         * <li><strong>selectdb.24xlarge</strong>: 96 cores, 768 GB.</li>
         * <li><strong>selectdb.32xlarge</strong>: 128 cores, 1024 GB.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mssql.x4.medium.e2</p>
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * <p>The name of the instance. The name must be 2 to 255 characters in length. It must start with a letter or Chinese character and can contain letters, Chinese characters, digits, and hyphens (-).</p>
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
         * <p>The network connection type of the instance. Set the value to Intranet, which indicates an internal network connection.</p>
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
         * <p>Instance storage capacity of the instance. Instance storage capacity of a read-only instance must be greater than or equal to that of the primary instance. Valid values: See the <strong>Storage Capacity</strong> column in <a href="https://help.aliyun.com/document_detail/145759.html">Read-only instance types</a>. The value must be a multiple of 5. Unit: GB.</p>
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
         * <li><strong>local_ssd</strong>: premium local SSD.</li>
         * <li><strong>cloud_ssd</strong>: standard SSD.</li>
         * <li><strong>cloud_essd</strong>: PL1 ESSD.</li>
         * <li><strong>cloud_essd2</strong>: PL2 ESSD.</li>
         * <li><strong>cloud_essd3</strong>: PL3 ESSD.</li>
         * <li><strong>general_essd</strong>: premium performance disk.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>If the primary ApsaraDB RDS for MySQL instance uses premium local SSDs, you can set this parameter only to <strong>local_ssd</strong>. If the primary instance uses cloud disks, you can set this parameter only to a cloud disk storage type.</li>
         * <li>ApsaraDB RDS for SQL Server supports only cloud disk storage types.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cloud_auto</p>
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
         * <p>The ID of the parameter template. You can call the DescribeParameterGroups operation to query the ID.</p>
         * <blockquote>
         * <p>This parameter is supported only for MySQL and PostgreSQL. If you do not specify this parameter, the default parameter template is used. You can also create a custom parameter template and use it here.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rpg-sys-01040402010***</p>
         */
        public Builder DBParamGroupId(String DBParamGroupId) {
            this.putQueryParameter("DBParamGroupId", DBParamGroupId);
            this.DBParamGroupId = DBParamGroupId;
            return this;
        }

        /**
         * <p>The time zone of the instance. This parameter takes effect only when <strong>Engine</strong> is set to <strong>MySQL</strong> or <strong>PostgreSQL</strong>.</p>
         * <ul>
         * <li>When <strong>Engine</strong> is set to <strong>MySQL</strong>:<ul>
         * <li>The parameter settings configure the UTC time zone. Valid values: <strong>-12:59</strong> to <strong>+13:00</strong>.</li>
         * <li>An instance with Premium Local SSDs can use a named time zone, such as Asia/Hong_Kong. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
         * </ul>
         * </li>
         * <li>When <strong>Engine</strong> is set to <strong>PostgreSQL</strong>:<ul>
         * <li>The parameter settings configure a named time zone. UTC time zones are not supported. For more information about named time zones, see <a href="https://help.aliyun.com/document_detail/297356.html">Named time zones</a>.</li>
         * <li>This parameter can be configured only for PostgreSQL instances that use cloud disks.</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>You can make parameter settings for the time zone when you purchase a primary instance. Read-only instances do not support time zone Settings and inherit the time zone of the primary instance.</li>
         * <li>If you do not make parameter settings for this parameter, the system selects the default time zone based on the region where the instance is created.</li>
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
         * <p>The objects to be migrated or synchronized, in JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/209545.html">Description of migration, synchronization, or change tracking objects</a>.</p>
         * <ul>
         * <li>The DbList parameter supports up to 1 MB of data.</li>
         * <li>If DbList contains filter conditions, the total length of DbList, including the filter conditions, cannot exceed 1 MB.</li>
         * <li>For distributed tasks (such as migration or synchronization tasks with PolarDB-X 1.0 as the source), DbList is split based on physical table shards to generate multiple subtasks. The DbList of each subtask supports up to 1 MB of data.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;dtstest\&quot;:{\&quot;name\&quot;:\&quot;dtstest\&quot;,\&quot;all\&quot;:true,\&quot;conflict\&quot;:\&quot;overwrite\&quot;}}</p>
         */
        public Builder dbList(String dbList) {
            this.putQueryParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * <p>The DbList mode for SQL Server disaster recovery. Set this parameter to 0. Valid values are 0, 1, and 2, and the value must be consistent within the same group.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder dbListMode(Integer dbListMode) {
            this.putQueryParameter("DbListMode", dbListMode);
            this.dbListMode = dbListMode;
            return this;
        }

        /**
         * <p>The ID of the existing dedicated cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>dhg-4kv98863455z***</p>
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to enable deletion protection for the resource stack. Valid values:</p>
         * <ul>
         * <li>Enabled: enables deletion protection for the resource stack.</li>
         * <li>Disabled (default): disables deletion protection for the resource stack. In this case, you can release the resource stack by using the console or calling the DeleteStack operation.</li>
         * </ul>
         * <blockquote>
         * <p>The deletion protection settings for a nested resource stack are the same as those for the root resource stack.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deletionProtection(Boolean deletionProtection) {
            this.putQueryParameter("DeletionProtection", deletionProtection);
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a precheck. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes. After the precheck succeeds, no changes are made to the instance.</li>
         * <li><strong>false</strong> (default): no. After the precheck succeeds, the database instance of the DTS task is modified and the task is run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the encryption key. If encryption is disabled, this parameter is empty.</p>
         * <blockquote>
         * <p>After disk encryption is enabled for a cloud disk instance, it cannot be disabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>07609cc3-3109-408f-a35e-c548e776***</p>
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
            return this;
        }

        /**
         * <p>The database engine type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SQLServer</p>
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * <p>The database engine version of the instance. The valid values vary based on the database engine type.</p>
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
         * <p>The network type of the instance. Set the value to <strong>VPC</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>Only VPCs are supported in Alibaba Cloud.</li>
         * <li>If you do not specify this parameter, the default value VPC is used.</li>
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
         * <p>Specifies whether to enable the Buffer Pool Extension (BPE) feature for premium performance disks. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enables the feature.</li>
         * <li><strong>0</strong>: disables the feature.</li>
         * </ul>
         * <blockquote>
         * <p>For more information about the Buffer Pool Extension (BPE) feature, see <a href="https://help.aliyun.com/document_detail/2527067.html">Buffer Pool Extension (BPE)</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ioAccelerationEnabled(String ioAccelerationEnabled) {
            this.putQueryParameter("IoAccelerationEnabled", ioAccelerationEnabled);
            this.ioAccelerationEnabled = ioAccelerationEnabled;
            return this;
        }

        /**
         * <p>Specifies whether the primary instance account exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder masterAccountExist(Boolean masterAccountExist) {
            this.putQueryParameter("MasterAccountExist", masterAccountExist);
            this.masterAccountExist = masterAccountExist;
            return this;
        }

        /**
         * <p>The privileged account of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gadtest</p>
         */
        public Builder masterAccountName(String masterAccountName) {
            this.putQueryParameter("MasterAccountName", masterAccountName);
            this.masterAccountName = masterAccountName;
            return this;
        }

        /**
         * <p>The password of the primary instance account.</p>
         * 
         * <strong>example:</strong>
         * <password>
         */
        public Builder masterAccountPassword(String masterAccountPassword) {
            this.putQueryParameter("MasterAccountPassword", masterAccountPassword);
            this.masterAccountPassword = masterAccountPassword;
            return this;
        }

        /**
         * <p>This parameter is specific to MongoDB. The architecture type of the primary database. Valid values:</p>
         * <ul>
         * <li>1: replica set.</li>
         * <li>2: sharded cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder masterDatabaseName(String masterDatabaseName) {
            this.putQueryParameter("MasterDatabaseName", masterDatabaseName);
            this.masterDatabaseName = masterDatabaseName;
            return this;
        }

        /**
         * <p>This parameter is specific to MongoDB. The architecture type of the primary database. Valid values:</p>
         * <ul>
         * <li>1: replica set.</li>
         * <li>2: sharded cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder masterEngineArchType(String masterEngineArchType) {
            this.putQueryParameter("MasterEngineArchType", masterEngineArchType);
            this.masterEngineArchType = masterEngineArchType;
            return this;
        }

        /**
         * <p>The primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-j6c685vh0j0y1k***</p>
         */
        public Builder masterInstanceId(String masterInstanceId) {
            this.putQueryParameter("MasterInstanceId", masterInstanceId);
            this.masterInstanceId = masterInstanceId;
            return this;
        }

        /**
         * <p>The region where the primary instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        public Builder masterRegion(String masterRegion) {
            this.putQueryParameter("MasterRegion", masterRegion);
            this.masterRegion = masterRegion;
            return this;
        }

        /**
         * <p>The shard account.</p>
         * 
         * <strong>example:</strong>
         * <p>db_test</p>
         */
        public Builder masterShardAccountName(String masterShardAccountName) {
            this.putQueryParameter("MasterShardAccountName", masterShardAccountName);
            this.masterShardAccountName = masterShardAccountName;
            return this;
        }

        /**
         * <p>The password of the shard account.</p>
         * 
         * <strong>example:</strong>
         * <password>
         */
        public Builder masterShardAccountPassword(String masterShardAccountPassword) {
            this.putQueryParameter("MasterShardAccountPassword", masterShardAccountPassword);
            this.masterShardAccountPassword = masterShardAccountPassword;
            return this;
        }

        /**
         * <p>Specifies whether to purchase a new secondary instance. If this parameter is set to false, an existing instance is used.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needCreateSlave(Boolean needCreateSlave) {
            this.putQueryParameter("NeedCreateSlave", needCreateSlave);
            this.needCreateSlave = needCreateSlave;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li><strong>PrePaid</strong>: subscription.</li>
         * <li><strong>PostPaid</strong>: pay-as-you-go.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing method for subscription instances. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: yearly.</li>
         * <li><strong>Month</strong>: monthly.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid and required only when the billing method is <strong>PrePaid</strong> (subscription).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The database service port of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5432</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>Settings for the internal network IP address of the instance. The IP address must be within the IP address range of the specified vSwitch. By default, the system automatically allocates an IP address based on the VpcId and VSwitchId parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>10.60.22.91</p>
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
            return this;
        }

        /**
         * <p>The region ID of the primary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
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
         * <p>rg-acfmx4gs2dcym***</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The global resource descriptor (ARN) for the authorization of the RDS cloud service account by the primary account to access KMS. You can call the CheckCloudResourceAuthorized operation to query the ARN.</p>
         * <blockquote>
         * <p>Notice: When you enable cloud disk encryption, you must specify <strong>RoleARN</strong>.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1929332604914597:role/aliyunr***tanceencryptiondefaultrole</p>
         */
        public Builder roleARN(String roleARN) {
            this.putQueryParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * <p>The IP addresses that are added to the whitelist of the instance. Separate multiple IP addresses with commas (,). Note: If you set this parameter to 127.0.0.1, access from all IP addresses is denied. If you set this parameter to 192.168.0.0/24, access from all IP addresses in the 192.168.0.XX format is allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.0.0/12</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The settings of the Serverless instance. This parameter is required when you create a Serverless instance.</p>
         */
        public Builder serverlessConfig(ServerlessConfig serverlessConfig) {
            String serverlessConfigShrink = shrink(serverlessConfig, "ServerlessConfig", "json");
            this.putQueryParameter("ServerlessConfig", serverlessConfigShrink);
            this.serverlessConfig = serverlessConfig;
            return this;
        }

        /**
         * <p>Specifies whether the secondary instance account exists.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder slaveAccountExist(Boolean slaveAccountExist) {
            this.putQueryParameter("SlaveAccountExist", slaveAccountExist);
            this.slaveAccountExist = slaveAccountExist;
            return this;
        }

        /**
         * <p>The account with the same name on the secondary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gadtest</p>
         */
        public Builder slaveAccountName(String slaveAccountName) {
            this.putQueryParameter("SlaveAccountName", slaveAccountName);
            this.slaveAccountName = slaveAccountName;
            return this;
        }

        /**
         * <p>The password of the secondary instance account.</p>
         * 
         * <strong>example:</strong>
         * <password>
         */
        public Builder slaveAccountPassword(String slaveAccountPassword) {
            this.putQueryParameter("SlaveAccountPassword", slaveAccountPassword);
            this.slaveAccountPassword = slaveAccountPassword;
            return this;
        }

        /**
         * <p>The name of the secondary database.</p>
         * 
         * <strong>example:</strong>
         * <p>slave_database</p>
         */
        public Builder slaveDatabaseName(String slaveDatabaseName) {
            this.putQueryParameter("SlaveDatabaseName", slaveDatabaseName);
            this.slaveDatabaseName = slaveDatabaseName;
            return this;
        }

        /**
         * <p>This parameter is specific to MongoDB. The architecture type of the secondary database. Valid values:</p>
         * <ul>
         * <li>1: replica set.</li>
         * <li>2: sharded cluster.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder slaveEngineArchType(String slaveEngineArchType) {
            this.putQueryParameter("SlaveEngineArchType", slaveEngineArchType);
            this.slaveEngineArchType = slaveEngineArchType;
            return this;
        }

        /**
         * <p>The secondary instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-t4nb481a8qn0b3***</p>
         */
        public Builder slaveInstanceId(String slaveInstanceId) {
            this.putQueryParameter("SlaveInstanceId", slaveInstanceId);
            this.slaveInstanceId = slaveInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether the secondary instance is read-only.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder slaveReadOnly(Boolean slaveReadOnly) {
            this.putQueryParameter("SlaveReadOnly", slaveReadOnly);
            this.slaveReadOnly = slaveReadOnly;
            return this;
        }

        /**
         * <p>The region where the secondary instance resides.</p>
         * 
         * <strong>example:</strong>
         * <p>ap-southeast-1</p>
         */
        public Builder slaveRegion(String slaveRegion) {
            this.putQueryParameter("SlaveRegion", slaveRegion);
            this.slaveRegion = slaveRegion;
            return this;
        }

        /**
         * <p>Specifies whether to enable Automatic storage scaling for the Standard Edition cluster. Valid values:</p>
         * <ul>
         * <li>Enable: enables Automatic storage scaling.</li>
         * <li>Disable: shutdown Automatic storage scaling.</li>
         * </ul>
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
         * <p>The threshold (in percentage) that triggers automatic storage expansion. Valid values:</p>
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
         * <p>60</p>
         */
        public Builder storageThreshold(Integer storageThreshold) {
            this.putQueryParameter("StorageThreshold", storageThreshold);
            this.storageThreshold = storageThreshold;
            return this;
        }

        /**
         * <p>The Settings for the upper limit of Automatic storage scaling for the Standard Edition cluster. Unit: GB.</p>
         * <blockquote>
         * <p>The maximum value is 32000.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>64000</p>
         */
        public Builder storageUpperBound(Integer storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * <p>The synchronization account type.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        public Builder syncAccountType(String syncAccountType) {
            this.putQueryParameter("SyncAccountType", syncAccountType);
            this.syncAccountType = syncAccountType;
            return this;
        }

        /**
         * <p>The synchronization topology. Valid values:</p>
         * <ul>
         * <li><strong>oneway</strong>: one-way synchronization. This is the default value.</li>
         * <li><strong>bidirectional</strong>: two-way synchronization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oneway</p>
         */
        public Builder syncArchitecture(String syncArchitecture) {
            this.putQueryParameter("SyncArchitecture", syncArchitecture);
            this.syncArchitecture = syncArchitecture;
            return this;
        }

        /**
         * <p>The conflict resolution policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        public Builder syncConflict(String syncConflict) {
            this.putQueryParameter("SyncConflict", syncConflict);
            this.syncConflict = syncConflict;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> This parameter is deprecated and does not need to be configured.</p>
         * 
         * <strong>example:</strong>
         * <p>utf8</p>
         */
        public Builder systemDBCharset(String systemDBCharset) {
            this.putQueryParameter("SystemDBCharset", systemDBCharset);
            this.systemDBCharset = systemDBCharset;
            return this;
        }

        /**
         * <p>The tags of the data migration instance. This parameter is used as a filter. If this parameter is not empty, only the instance tasks that have the specified tags are returned.</p>
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
         * <li>If no hosts are active, you can invoke the CreateDedicatedHost operation to create a host.</li>
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
         * <p>You can call the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.
         * If no hosts are available, you can call the CreateDedicatedHost operation to create a host.</p>
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
         * <p>This parameter is required when you create a high availability series or RDS Enterprise Edition instance in a dedicated cluster. If you do not specify this parameter, the system automatically allocates a host by default.</p>
         * <ul>
         * <li>You can invoke the DescribeDedicatedHosts operation to query the host information in the dedicated cluster.</li>
         * <li>If no hosts are active, you can invoke the CreateDedicatedHost operation to create a host.</li>
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
         * <p>The minor engine version of the ApsaraDB RDS instance. This parameter is required only when you create a MySQL or PostgreSQL instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rds_postgres_1700_20260***</p>
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * <p>The purchase duration for subscription instances.</p>
         * <ul>
         * <li>When <strong>Period</strong> is set to <strong>Month</strong>, valid values are 1, 2, 3, 4, 5, 6, 7, 8, and 9.</li>
         * <li>When <strong>Period</strong> is set to <strong>Year</strong>, valid values are 1, 2, 3, and 5.<blockquote>
         * <ul>
         * <li>This parameter is valid and required only when <strong>PayType</strong> is set to <strong>PrePaid</strong>.</li>
         * </ul>
         * </blockquote>
         * </li>
         * <li>For the billing method of subscription instances, you can specify it in the <strong>Period</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        /**
         * <p>The ID of the user backup. You can call the ListUserBackupFiles operation to query the ID. If you specify this parameter, the instance is created based on the user backup.</p>
         * <p>If you specify this parameter, the following limits apply:</p>
         * <ul>
         * <li>The PayType parameter must be set to Postpaid.</li>
         * <li>The Engine parameter must be set to MySQL.</li>
         * <li>The EngineVersion parameter must be set to 5.7.</li>
         * <li>The Category parameter must be set to Basic.</li>
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
         * <p>The ID of the vSwitch in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9gttyapd3i9dmzn***</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-m5ehjekt8mzvyyx5a1***</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        /**
         * <p>The whitelist. To configure multiple IP addresses, separate the IP addresses or CIDR blocks with commas (,) without spaces before or after the commas. Example: <code>192.168.0.1,172.16.213.9</code>.</p>
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
         * <li>If you set this parameter to <strong>Auto</strong>, it indicates a multi-zone deployment and the system automatically selects an active zone for the secondary node.</li>
         * <li>If you set this parameter to the same value as <strong>ZoneId</strong>, it is a single-zone deployment.</li>
         * <li>If you set this parameter to a value different from <strong>ZoneId</strong>, it is a multi-zone deployment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-i</p>
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * <p>The secondary zone 2.</p>
         * <blockquote>
         * <p>This parameter is active only for instances of the RDS Enterprise Edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-chengdu-b</p>
         */
        public Builder zoneIdSlave2(String zoneIdSlave2) {
            this.putQueryParameter("ZoneIdSlave2", zoneIdSlave2);
            this.zoneIdSlave2 = zoneIdSlave2;
            return this;
        }

        @Override
        public CreateGadOrderRequest build() {
            return new CreateGadOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateGadOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateGadOrderRequest</p>
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
             * <p>This parameter is required only for MySQL and PostgreSQL Serverless instances. If no connections are established within 10 minutes, the instance enters the paused state. When a connection is established, the instance is automatically woken up.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoPause(Boolean autoPause) {
                this.autoPause = autoPause;
                return this;
            }

            /**
             * <p>The maximum number of RDS capacity units (RCUs) for automatic scaling of the instance. Valid values:</p>
             * <ul>
             * <li>MySQL: <strong>1 to 32</strong></li>
             * <li>SQL Server: <strong>2 to 16</strong></li>
             * <li>PostgreSQL: <strong>1 to 14</strong></li>
             * </ul>
             * <blockquote>
             * <p>The value of this parameter must be greater than or equal to the value of <strong>MinCapacity</strong>. Only <strong>integers</strong> are supported.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxCapacity(Double maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of RCUs for automatic scaling of the instance. Valid values:</p>
             * <ul>
             * <li>MySQL: <strong>0.5 to 32</strong></li>
             * <li>SQL Server: <strong>2 to 16</strong> (only integers are supported)</li>
             * <li>PostgreSQL: <strong>0.5 to 14</strong></li>
             * </ul>
             * <blockquote>
             * <p>The value of this parameter must be less than or equal to the value of <strong>MaxCapacity</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minCapacity(Double minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            /**
             * <p>Specifies whether to enable forced elastic scaling for the Serverless instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enables forced elastic scaling.</li>
             * <li><strong>false</strong>: disables forced elastic scaling. This is the default value.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is required only for MySQL and PostgreSQL Serverless instances. After this parameter is enabled, the instance will be unavailable for 30 to 120 seconds during forced scaling. Use this feature with caution based on your business requirements.</li>
             * <li>Elastic scaling of instance RCUs usually takes effect immediately. However, in some special cases (such as during the execution of large transactions), scaling cannot be completed immediately. In this case, you can enable this parameter to perform forced scaling.</li>
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
     * {@link CreateGadOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateGadOrderRequest</p>
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
             * <p>The tag key. You can call the <a href="https://help.aliyun.com/document_detail/191187.html">ListTagResources</a> operation to query the tag key.</p>
             * <blockquote>
             * <ul>
             * <li>N indicates the sequence number of the tag key. For example, Tag.1.Key indicates the key of the first tag, and Tag.2.Key indicates the key of the second tag. You can specify 1 to 20 tag keys at a time.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>This parameter cannot be set to an empty string.</li>
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
             * <p>The tag value. You can call the <a href="https://help.aliyun.com/document_detail/191187.html">ListTagResources</a> operation to query the tag value.</p>
             * <blockquote>
             * <ul>
             * <li>N indicates the sequence number of the tag value. For example, Tag.1.Value indicates the value of the first tag, and Tag.2.Value indicates the value of the second tag. You can specify 1 to 20 tag values at a time.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>This parameter can be set to an empty string.</li>
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
