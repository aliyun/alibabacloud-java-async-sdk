// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    @NameInMap("Amount")
    private Integer amount;

    @Query
    @NameInMap("AutoRenew")
    private String autoRenew;

    @Query
    @NameInMap("BusinessInfo")
    private String businessInfo;

    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ConnectionMode")
    private String connectionMode;

    @Query
    @NameInMap("CreateStrategy")
    private String createStrategy;

    @Query
    @NameInMap("DBInstanceClass")
    @Validation(required = true)
    private String DBInstanceClass;

    @Query
    @NameInMap("DBInstanceDescription")
    private String DBInstanceDescription;

    @Query
    @NameInMap("DBInstanceNetType")
    @Validation(required = true)
    private String DBInstanceNetType;

    @Query
    @NameInMap("DBInstanceStorage")
    @Validation(required = true)
    private Integer DBInstanceStorage;

    @Query
    @NameInMap("DBInstanceStorageType")
    private String DBInstanceStorageType;

    @Query
    @NameInMap("DBIsIgnoreCase")
    private String DBIsIgnoreCase;

    @Query
    @NameInMap("DBParamGroupId")
    private String DBParamGroupId;

    @Query
    @NameInMap("DBTimeZone")
    private String DBTimeZone;

    @Query
    @NameInMap("DedicatedHostGroupId")
    private String dedicatedHostGroupId;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

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
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    private String period;

    @Query
    @NameInMap("PrivateIpAddress")
    private String privateIpAddress;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("RoleARN")
    private String roleARN;

    @Query
    @NameInMap("SecurityIPList")
    @Validation(required = true)
    private String securityIPList;

    @Query
    @NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @Query
    @NameInMap("StorageThreshold")
    private Integer storageThreshold;

    @Query
    @NameInMap("StorageUpperBound")
    private Integer storageUpperBound;

    @Query
    @NameInMap("SystemDBCharset")
    private String systemDBCharset;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TargetDedicatedHostIdForLog")
    private String targetDedicatedHostIdForLog;

    @Query
    @NameInMap("TargetDedicatedHostIdForMaster")
    private String targetDedicatedHostIdForMaster;

    @Query
    @NameInMap("TargetDedicatedHostIdForSlave")
    private String targetDedicatedHostIdForSlave;

    @Query
    @NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    @Query
    @NameInMap("UsedTime")
    private String usedTime;

    @Query
    @NameInMap("UserBackupId")
    private String userBackupId;

    @Query
    @NameInMap("VPCId")
    private String VPCId;

    @Query
    @NameInMap("VSwitchId")
    private String vSwitchId;

    @Query
    @NameInMap("ZoneId")
    private String zoneId;

    @Query
    @NameInMap("ZoneIdSlave1")
    private String zoneIdSlave1;

    @Query
    @NameInMap("ZoneIdSlave2")
    private String zoneIdSlave2;

    private CreateDBInstanceRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoRenew = builder.autoRenew;
        this.businessInfo = builder.businessInfo;
        this.category = builder.category;
        this.clientToken = builder.clientToken;
        this.connectionMode = builder.connectionMode;
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
        this.dryRun = builder.dryRun;
        this.encryptionKey = builder.encryptionKey;
        this.engine = builder.engine;
        this.engineVersion = builder.engineVersion;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.payType = builder.payType;
        this.period = builder.period;
        this.privateIpAddress = builder.privateIpAddress;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.roleARN = builder.roleARN;
        this.securityIPList = builder.securityIPList;
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
     * @return autoRenew
     */
    public String getAutoRenew() {
        return this.autoRenew;
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
     * @return connectionMode
     */
    public String getConnectionMode() {
        return this.connectionMode;
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
        private String autoRenew; 
        private String businessInfo; 
        private String category; 
        private String clientToken; 
        private String connectionMode; 
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
        private Boolean dryRun; 
        private String encryptionKey; 
        private String engine; 
        private String engineVersion; 
        private String instanceNetworkType; 
        private String payType; 
        private String period; 
        private String privateIpAddress; 
        private String regionId; 
        private String resourceGroupId; 
        private Long resourceOwnerId; 
        private String roleARN; 
        private String securityIPList; 
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
        private String zoneId; 
        private String zoneIdSlave1; 
        private String zoneIdSlave2; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBInstanceRequest response) {
            super(response);
            this.amount = response.amount;
            this.autoRenew = response.autoRenew;
            this.businessInfo = response.businessInfo;
            this.category = response.category;
            this.clientToken = response.clientToken;
            this.connectionMode = response.connectionMode;
            this.createStrategy = response.createStrategy;
            this.DBInstanceClass = response.DBInstanceClass;
            this.DBInstanceDescription = response.DBInstanceDescription;
            this.DBInstanceNetType = response.DBInstanceNetType;
            this.DBInstanceStorage = response.DBInstanceStorage;
            this.DBInstanceStorageType = response.DBInstanceStorageType;
            this.DBIsIgnoreCase = response.DBIsIgnoreCase;
            this.DBParamGroupId = response.DBParamGroupId;
            this.DBTimeZone = response.DBTimeZone;
            this.dedicatedHostGroupId = response.dedicatedHostGroupId;
            this.dryRun = response.dryRun;
            this.encryptionKey = response.encryptionKey;
            this.engine = response.engine;
            this.engineVersion = response.engineVersion;
            this.instanceNetworkType = response.instanceNetworkType;
            this.payType = response.payType;
            this.period = response.period;
            this.privateIpAddress = response.privateIpAddress;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.roleARN = response.roleARN;
            this.securityIPList = response.securityIPList;
            this.storageAutoScale = response.storageAutoScale;
            this.storageThreshold = response.storageThreshold;
            this.storageUpperBound = response.storageUpperBound;
            this.systemDBCharset = response.systemDBCharset;
            this.tag = response.tag;
            this.targetDedicatedHostIdForLog = response.targetDedicatedHostIdForLog;
            this.targetDedicatedHostIdForMaster = response.targetDedicatedHostIdForMaster;
            this.targetDedicatedHostIdForSlave = response.targetDedicatedHostIdForSlave;
            this.targetMinorVersion = response.targetMinorVersion;
            this.usedTime = response.usedTime;
            this.userBackupId = response.userBackupId;
            this.VPCId = response.VPCId;
            this.vSwitchId = response.vSwitchId;
            this.zoneId = response.zoneId;
            this.zoneIdSlave1 = response.zoneIdSlave1;
            this.zoneIdSlave2 = response.zoneIdSlave2;
        } 

        /**
         * Amount.
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(String autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BusinessInfo.
         */
        public Builder businessInfo(String businessInfo) {
            this.putQueryParameter("BusinessInfo", businessInfo);
            this.businessInfo = businessInfo;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
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
         * ConnectionMode.
         */
        public Builder connectionMode(String connectionMode) {
            this.putQueryParameter("ConnectionMode", connectionMode);
            this.connectionMode = connectionMode;
            return this;
        }

        /**
         * CreateStrategy.
         */
        public Builder createStrategy(String createStrategy) {
            this.putQueryParameter("CreateStrategy", createStrategy);
            this.createStrategy = createStrategy;
            return this;
        }

        /**
         * DBInstanceClass.
         */
        public Builder DBInstanceClass(String DBInstanceClass) {
            this.putQueryParameter("DBInstanceClass", DBInstanceClass);
            this.DBInstanceClass = DBInstanceClass;
            return this;
        }

        /**
         * DBInstanceDescription.
         */
        public Builder DBInstanceDescription(String DBInstanceDescription) {
            this.putQueryParameter("DBInstanceDescription", DBInstanceDescription);
            this.DBInstanceDescription = DBInstanceDescription;
            return this;
        }

        /**
         * DBInstanceNetType.
         */
        public Builder DBInstanceNetType(String DBInstanceNetType) {
            this.putQueryParameter("DBInstanceNetType", DBInstanceNetType);
            this.DBInstanceNetType = DBInstanceNetType;
            return this;
        }

        /**
         * DBInstanceStorage.
         */
        public Builder DBInstanceStorage(Integer DBInstanceStorage) {
            this.putQueryParameter("DBInstanceStorage", DBInstanceStorage);
            this.DBInstanceStorage = DBInstanceStorage;
            return this;
        }

        /**
         * DBInstanceStorageType.
         */
        public Builder DBInstanceStorageType(String DBInstanceStorageType) {
            this.putQueryParameter("DBInstanceStorageType", DBInstanceStorageType);
            this.DBInstanceStorageType = DBInstanceStorageType;
            return this;
        }

        /**
         * DBIsIgnoreCase.
         */
        public Builder DBIsIgnoreCase(String DBIsIgnoreCase) {
            this.putQueryParameter("DBIsIgnoreCase", DBIsIgnoreCase);
            this.DBIsIgnoreCase = DBIsIgnoreCase;
            return this;
        }

        /**
         * DBParamGroupId.
         */
        public Builder DBParamGroupId(String DBParamGroupId) {
            this.putQueryParameter("DBParamGroupId", DBParamGroupId);
            this.DBParamGroupId = DBParamGroupId;
            return this;
        }

        /**
         * DBTimeZone.
         */
        public Builder DBTimeZone(String DBTimeZone) {
            this.putQueryParameter("DBTimeZone", DBTimeZone);
            this.DBTimeZone = DBTimeZone;
            return this;
        }

        /**
         * DedicatedHostGroupId.
         */
        public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
            this.putQueryParameter("DedicatedHostGroupId", dedicatedHostGroupId);
            this.dedicatedHostGroupId = dedicatedHostGroupId;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
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
         * Engine.
         */
        public Builder engine(String engine) {
            this.putQueryParameter("Engine", engine);
            this.engine = engine;
            return this;
        }

        /**
         * EngineVersion.
         */
        public Builder engineVersion(String engineVersion) {
            this.putQueryParameter("EngineVersion", engineVersion);
            this.engineVersion = engineVersion;
            return this;
        }

        /**
         * InstanceNetworkType.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.putQueryParameter("InstanceNetworkType", instanceNetworkType);
            this.instanceNetworkType = instanceNetworkType;
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
         * PrivateIpAddress.
         */
        public Builder privateIpAddress(String privateIpAddress) {
            this.putQueryParameter("PrivateIpAddress", privateIpAddress);
            this.privateIpAddress = privateIpAddress;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * RoleARN.
         */
        public Builder roleARN(String roleARN) {
            this.putQueryParameter("RoleARN", roleARN);
            this.roleARN = roleARN;
            return this;
        }

        /**
         * SecurityIPList.
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * StorageAutoScale.
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * StorageThreshold.
         */
        public Builder storageThreshold(Integer storageThreshold) {
            this.putQueryParameter("StorageThreshold", storageThreshold);
            this.storageThreshold = storageThreshold;
            return this;
        }

        /**
         * StorageUpperBound.
         */
        public Builder storageUpperBound(Integer storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * SystemDBCharset.
         */
        public Builder systemDBCharset(String systemDBCharset) {
            this.putQueryParameter("SystemDBCharset", systemDBCharset);
            this.systemDBCharset = systemDBCharset;
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
         * TargetDedicatedHostIdForLog.
         */
        public Builder targetDedicatedHostIdForLog(String targetDedicatedHostIdForLog) {
            this.putQueryParameter("TargetDedicatedHostIdForLog", targetDedicatedHostIdForLog);
            this.targetDedicatedHostIdForLog = targetDedicatedHostIdForLog;
            return this;
        }

        /**
         * TargetDedicatedHostIdForMaster.
         */
        public Builder targetDedicatedHostIdForMaster(String targetDedicatedHostIdForMaster) {
            this.putQueryParameter("TargetDedicatedHostIdForMaster", targetDedicatedHostIdForMaster);
            this.targetDedicatedHostIdForMaster = targetDedicatedHostIdForMaster;
            return this;
        }

        /**
         * TargetDedicatedHostIdForSlave.
         */
        public Builder targetDedicatedHostIdForSlave(String targetDedicatedHostIdForSlave) {
            this.putQueryParameter("TargetDedicatedHostIdForSlave", targetDedicatedHostIdForSlave);
            this.targetDedicatedHostIdForSlave = targetDedicatedHostIdForSlave;
            return this;
        }

        /**
         * TargetMinorVersion.
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
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
         * UserBackupId.
         */
        public Builder userBackupId(String userBackupId) {
            this.putQueryParameter("UserBackupId", userBackupId);
            this.userBackupId = userBackupId;
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

        /**
         * ZoneIdSlave1.
         */
        public Builder zoneIdSlave1(String zoneIdSlave1) {
            this.putQueryParameter("ZoneIdSlave1", zoneIdSlave1);
            this.zoneIdSlave1 = zoneIdSlave1;
            return this;
        }

        /**
         * ZoneIdSlave2.
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
