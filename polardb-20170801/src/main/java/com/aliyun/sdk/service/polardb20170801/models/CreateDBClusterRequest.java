// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateDBClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateDBClusterRequest</p>
 */
public class CreateDBClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgenticDbClusterDescription")
    private String agenticDbClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgenticDbClusterId")
    private String agenticDbClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgenticDbType")
    private String agenticDbType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowShutDown")
    private String allowShutDown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoUseCoupon")
    private Boolean autoUseCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private String backupRetentionPolicyOnClusterDeletion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private String burstingEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloneDataPoint")
    private String cloneDataPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudProvider")
    private String cloudProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterNetworkType")
    private String clusterNetworkType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationCategory")
    private String creationCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreationOption")
    private String creationOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBMinorVersion")
    private String DBMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeClass")
    private String DBNodeClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNodeNum")
    private Integer DBNodeNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultTimeZone")
    private String defaultTimeZone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnsRegionId")
    private String ensRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GDNId")
    private String GDNId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HotStandbyCluster")
    private String hotStandbyCluster;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoosePolarLogBin")
    private String loosePolarLogBin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LooseXEngine")
    private String looseXEngine;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LooseXEngineUseMemoryPct")
    private String looseXEngineUseMemoryPct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LowerCaseTableNames")
    private String lowerCaseTableNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterGroupId")
    private String parameterGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionCode")
    private String promotionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private Long provisionedIops;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyClass")
    private String proxyClass;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyType")
    private String proxyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("ScaleMax")
    private String scaleMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleMin")
    private String scaleMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMax")
    private String scaleRoNumMax;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScaleRoNumMin")
    private String scaleRoNumMin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerlessType")
    private String serverlessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceResourceId")
    private String sourceResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceUid")
    private Long sourceUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyAZ")
    private String standbyAZ;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageEncryption")
    private Boolean storageEncryption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageEncryptionKey")
    private String storageEncryptionKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePayType")
    private String storagePayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    @com.aliyun.core.annotation.Validation(maximum = 100000, minimum = 10)
    private Long storageSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageUpperBound")
    @com.aliyun.core.annotation.Validation(maximum = 64000, minimum = 20)
    private Long storageUpperBound;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StrictConsistency")
    private String strictConsistency;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TDEStatus")
    private Boolean TDEStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetMinorVersion")
    private String targetMinorVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private CreateDBClusterRequest(Builder builder) {
        super(builder);
        this.agenticDbClusterDescription = builder.agenticDbClusterDescription;
        this.agenticDbClusterId = builder.agenticDbClusterId;
        this.agenticDbType = builder.agenticDbType;
        this.allowShutDown = builder.allowShutDown;
        this.architecture = builder.architecture;
        this.autoRenew = builder.autoRenew;
        this.autoUseCoupon = builder.autoUseCoupon;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.burstingEnabled = builder.burstingEnabled;
        this.clientToken = builder.clientToken;
        this.cloneDataPoint = builder.cloneDataPoint;
        this.cloudProvider = builder.cloudProvider;
        this.clusterNetworkType = builder.clusterNetworkType;
        this.creationCategory = builder.creationCategory;
        this.creationOption = builder.creationOption;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBMinorVersion = builder.DBMinorVersion;
        this.DBNodeClass = builder.DBNodeClass;
        this.DBNodeNum = builder.DBNodeNum;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.defaultTimeZone = builder.defaultTimeZone;
        this.ensRegionId = builder.ensRegionId;
        this.GDNId = builder.GDNId;
        this.hotStandbyCluster = builder.hotStandbyCluster;
        this.loosePolarLogBin = builder.loosePolarLogBin;
        this.looseXEngine = builder.looseXEngine;
        this.looseXEngineUseMemoryPct = builder.looseXEngineUseMemoryPct;
        this.lowerCaseTableNames = builder.lowerCaseTableNames;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.parameterGroupId = builder.parameterGroupId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.promotionCode = builder.promotionCode;
        this.provisionedIops = builder.provisionedIops;
        this.proxyClass = builder.proxyClass;
        this.proxyType = builder.proxyType;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scaleMax = builder.scaleMax;
        this.scaleMin = builder.scaleMin;
        this.scaleRoNumMax = builder.scaleRoNumMax;
        this.scaleRoNumMin = builder.scaleRoNumMin;
        this.securityIPList = builder.securityIPList;
        this.serverlessType = builder.serverlessType;
        this.sourceResourceId = builder.sourceResourceId;
        this.sourceUid = builder.sourceUid;
        this.standbyAZ = builder.standbyAZ;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageEncryption = builder.storageEncryption;
        this.storageEncryptionKey = builder.storageEncryptionKey;
        this.storagePayType = builder.storagePayType;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.storageUpperBound = builder.storageUpperBound;
        this.strictConsistency = builder.strictConsistency;
        this.TDEStatus = builder.TDEStatus;
        this.tag = builder.tag;
        this.targetMinorVersion = builder.targetMinorVersion;
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
     * @return agenticDbClusterDescription
     */
    public String getAgenticDbClusterDescription() {
        return this.agenticDbClusterDescription;
    }

    /**
     * @return agenticDbClusterId
     */
    public String getAgenticDbClusterId() {
        return this.agenticDbClusterId;
    }

    /**
     * @return agenticDbType
     */
    public String getAgenticDbType() {
        return this.agenticDbType;
    }

    /**
     * @return allowShutDown
     */
    public String getAllowShutDown() {
        return this.allowShutDown;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoUseCoupon
     */
    public Boolean getAutoUseCoupon() {
        return this.autoUseCoupon;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return burstingEnabled
     */
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloneDataPoint
     */
    public String getCloneDataPoint() {
        return this.cloneDataPoint;
    }

    /**
     * @return cloudProvider
     */
    public String getCloudProvider() {
        return this.cloudProvider;
    }

    /**
     * @return clusterNetworkType
     */
    public String getClusterNetworkType() {
        return this.clusterNetworkType;
    }

    /**
     * @return creationCategory
     */
    public String getCreationCategory() {
        return this.creationCategory;
    }

    /**
     * @return creationOption
     */
    public String getCreationOption() {
        return this.creationOption;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBMinorVersion
     */
    public String getDBMinorVersion() {
        return this.DBMinorVersion;
    }

    /**
     * @return DBNodeClass
     */
    public String getDBNodeClass() {
        return this.DBNodeClass;
    }

    /**
     * @return DBNodeNum
     */
    public Integer getDBNodeNum() {
        return this.DBNodeNum;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return DBVersion
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * @return defaultTimeZone
     */
    public String getDefaultTimeZone() {
        return this.defaultTimeZone;
    }

    /**
     * @return ensRegionId
     */
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    /**
     * @return GDNId
     */
    public String getGDNId() {
        return this.GDNId;
    }

    /**
     * @return hotStandbyCluster
     */
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    /**
     * @return loosePolarLogBin
     */
    public String getLoosePolarLogBin() {
        return this.loosePolarLogBin;
    }

    /**
     * @return looseXEngine
     */
    public String getLooseXEngine() {
        return this.looseXEngine;
    }

    /**
     * @return looseXEngineUseMemoryPct
     */
    public String getLooseXEngineUseMemoryPct() {
        return this.looseXEngineUseMemoryPct;
    }

    /**
     * @return lowerCaseTableNames
     */
    public String getLowerCaseTableNames() {
        return this.lowerCaseTableNames;
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
     * @return parameterGroupId
     */
    public String getParameterGroupId() {
        return this.parameterGroupId;
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
     * @return promotionCode
     */
    public String getPromotionCode() {
        return this.promotionCode;
    }

    /**
     * @return provisionedIops
     */
    public Long getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return proxyClass
     */
    public String getProxyClass() {
        return this.proxyClass;
    }

    /**
     * @return proxyType
     */
    public String getProxyType() {
        return this.proxyType;
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
     * @return scaleMax
     */
    public String getScaleMax() {
        return this.scaleMax;
    }

    /**
     * @return scaleMin
     */
    public String getScaleMin() {
        return this.scaleMin;
    }

    /**
     * @return scaleRoNumMax
     */
    public String getScaleRoNumMax() {
        return this.scaleRoNumMax;
    }

    /**
     * @return scaleRoNumMin
     */
    public String getScaleRoNumMin() {
        return this.scaleRoNumMin;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return serverlessType
     */
    public String getServerlessType() {
        return this.serverlessType;
    }

    /**
     * @return sourceResourceId
     */
    public String getSourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * @return sourceUid
     */
    public Long getSourceUid() {
        return this.sourceUid;
    }

    /**
     * @return standbyAZ
     */
    public String getStandbyAZ() {
        return this.standbyAZ;
    }

    /**
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
    }

    /**
     * @return storageEncryption
     */
    public Boolean getStorageEncryption() {
        return this.storageEncryption;
    }

    /**
     * @return storageEncryptionKey
     */
    public String getStorageEncryptionKey() {
        return this.storageEncryptionKey;
    }

    /**
     * @return storagePayType
     */
    public String getStoragePayType() {
        return this.storagePayType;
    }

    /**
     * @return storageSpace
     */
    public Long getStorageSpace() {
        return this.storageSpace;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    /**
     * @return storageUpperBound
     */
    public Long getStorageUpperBound() {
        return this.storageUpperBound;
    }

    /**
     * @return strictConsistency
     */
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    /**
     * @return TDEStatus
     */
    public Boolean getTDEStatus() {
        return this.TDEStatus;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
        private String agenticDbClusterDescription; 
        private String agenticDbClusterId; 
        private String agenticDbType; 
        private String allowShutDown; 
        private String architecture; 
        private Boolean autoRenew; 
        private Boolean autoUseCoupon; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String burstingEnabled; 
        private String clientToken; 
        private String cloneDataPoint; 
        private String cloudProvider; 
        private String clusterNetworkType; 
        private String creationCategory; 
        private String creationOption; 
        private String DBClusterDescription; 
        private String DBMinorVersion; 
        private String DBNodeClass; 
        private Integer DBNodeNum; 
        private String DBType; 
        private String DBVersion; 
        private String defaultTimeZone; 
        private String ensRegionId; 
        private String GDNId; 
        private String hotStandbyCluster; 
        private String loosePolarLogBin; 
        private String looseXEngine; 
        private String looseXEngineUseMemoryPct; 
        private String lowerCaseTableNames; 
        private String ownerAccount; 
        private Long ownerId; 
        private String parameterGroupId; 
        private String payType; 
        private String period; 
        private String promotionCode; 
        private Long provisionedIops; 
        private String proxyClass; 
        private String proxyType; 
        private String regionId; 
        private String resourceGroupId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scaleMax; 
        private String scaleMin; 
        private String scaleRoNumMax; 
        private String scaleRoNumMin; 
        private String securityIPList; 
        private String serverlessType; 
        private String sourceResourceId; 
        private Long sourceUid; 
        private String standbyAZ; 
        private String storageAutoScale; 
        private Boolean storageEncryption; 
        private String storageEncryptionKey; 
        private String storagePayType; 
        private Long storageSpace; 
        private String storageType; 
        private Long storageUpperBound; 
        private String strictConsistency; 
        private Boolean TDEStatus; 
        private java.util.List<Tag> tag; 
        private String targetMinorVersion; 
        private String usedTime; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDBClusterRequest request) {
            super(request);
            this.agenticDbClusterDescription = request.agenticDbClusterDescription;
            this.agenticDbClusterId = request.agenticDbClusterId;
            this.agenticDbType = request.agenticDbType;
            this.allowShutDown = request.allowShutDown;
            this.architecture = request.architecture;
            this.autoRenew = request.autoRenew;
            this.autoUseCoupon = request.autoUseCoupon;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.burstingEnabled = request.burstingEnabled;
            this.clientToken = request.clientToken;
            this.cloneDataPoint = request.cloneDataPoint;
            this.cloudProvider = request.cloudProvider;
            this.clusterNetworkType = request.clusterNetworkType;
            this.creationCategory = request.creationCategory;
            this.creationOption = request.creationOption;
            this.DBClusterDescription = request.DBClusterDescription;
            this.DBMinorVersion = request.DBMinorVersion;
            this.DBNodeClass = request.DBNodeClass;
            this.DBNodeNum = request.DBNodeNum;
            this.DBType = request.DBType;
            this.DBVersion = request.DBVersion;
            this.defaultTimeZone = request.defaultTimeZone;
            this.ensRegionId = request.ensRegionId;
            this.GDNId = request.GDNId;
            this.hotStandbyCluster = request.hotStandbyCluster;
            this.loosePolarLogBin = request.loosePolarLogBin;
            this.looseXEngine = request.looseXEngine;
            this.looseXEngineUseMemoryPct = request.looseXEngineUseMemoryPct;
            this.lowerCaseTableNames = request.lowerCaseTableNames;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.parameterGroupId = request.parameterGroupId;
            this.payType = request.payType;
            this.period = request.period;
            this.promotionCode = request.promotionCode;
            this.provisionedIops = request.provisionedIops;
            this.proxyClass = request.proxyClass;
            this.proxyType = request.proxyType;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scaleMax = request.scaleMax;
            this.scaleMin = request.scaleMin;
            this.scaleRoNumMax = request.scaleRoNumMax;
            this.scaleRoNumMin = request.scaleRoNumMin;
            this.securityIPList = request.securityIPList;
            this.serverlessType = request.serverlessType;
            this.sourceResourceId = request.sourceResourceId;
            this.sourceUid = request.sourceUid;
            this.standbyAZ = request.standbyAZ;
            this.storageAutoScale = request.storageAutoScale;
            this.storageEncryption = request.storageEncryption;
            this.storageEncryptionKey = request.storageEncryptionKey;
            this.storagePayType = request.storagePayType;
            this.storageSpace = request.storageSpace;
            this.storageType = request.storageType;
            this.storageUpperBound = request.storageUpperBound;
            this.strictConsistency = request.strictConsistency;
            this.TDEStatus = request.TDEStatus;
            this.tag = request.tag;
            this.targetMinorVersion = request.targetMinorVersion;
            this.usedTime = request.usedTime;
            this.VPCId = request.VPCId;
            this.vSwitchId = request.vSwitchId;
            this.zoneId = request.zoneId;
        } 

        /**
         * <p>The Agentic cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-******</p>
         */
        public Builder agenticDbClusterDescription(String agenticDbClusterDescription) {
            this.putQueryParameter("AgenticDbClusterDescription", agenticDbClusterDescription);
            this.agenticDbClusterDescription = agenticDbClusterDescription;
            return this;
        }

        /**
         * <p>The Agentic cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pagc-******</p>
         */
        public Builder agenticDbClusterId(String agenticDbClusterId) {
            this.putQueryParameter("AgenticDbClusterId", agenticDbClusterId);
            this.agenticDbClusterId = agenticDbClusterId;
            return this;
        }

        /**
         * <p>The Agentic database engine type. Valid values:</p>
         * <ul>
         * <li>dedicated</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dedicated</p>
         */
        public Builder agenticDbType(String agenticDbType) {
            this.putQueryParameter("AgenticDbType", agenticDbType);
            this.agenticDbType = agenticDbType;
            return this;
        }

        /**
         * <p>Specifies whether to enable No-activity Suspension. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables No-activity Suspension.</p>
         * </li>
         * <li><p><strong>false</strong>: disables No-activity Suspension (default).</p>
         * <blockquote>
         * <p>Only serverless clusters support this parameter.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowShutDown(String allowShutDown) {
            this.putQueryParameter("AllowShutDown", allowShutDown);
            this.allowShutDown = allowShutDown;
            return this;
        }

        /**
         * <p>The CPU architecture. Valid values:</p>
         * <ul>
         * <li>X86</li>
         * <li>ARM</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        public Builder architecture(String architecture) {
            this.putQueryParameter("Architecture", architecture);
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables auto-renewal.</li>
         * <li><strong>false</strong>: disables auto-renewal.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>Specifies whether to automatically use coupons. Valid values:</p>
         * <ul>
         * <li>true (default): Uses coupons.</li>
         * <li>false: Does not use coupons.</li>
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
         * <p>The data retention policy applied when the cluster is deleted. Valid values:</p>
         * <ul>
         * <li><strong>ALL</strong>: long-term retention (LTR) of all backups.</li>
         * <li><strong>LATEST</strong>: long-term retention (LTR) of the last backup (an automatic backup is performed before deletion).</li>
         * <li><strong>NONE</strong>: does not retain backups upon cluster deletion.</li>
         * </ul>
         * <p>When a cluster is created, the default value is <strong>NONE</strong>, which means backups are not retained upon cluster deletion.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when <strong>DBType</strong> is set to <strong>MySQL</strong>.</li>
         * <li>Serverless clusters do not support this parameter.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.putQueryParameter("BackupRetentionPolicyOnClusterDeletion", backupRetentionPolicyOnClusterDeletion);
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * <p>Specifies whether to enable I/O performance burst for ESSD AutoPL cloud disks. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables I/O performance burst.</li>
         * <li><strong>false</strong>: does not enable I/O performance burst (default).</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only when StorageType is set to ESSDAUTOPL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(String burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. The token is generated by the client and must be unique among different requests. The token is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>6000170000591aed949d0f5********************</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The point in time at which data is cloned. Valid values: </p>
         * <ul>
         * <li><strong>LATEST</strong>: the latest point in time.</li>
         * <li><strong>BackupID</strong>: a historical backup set ID. Set this parameter to the specific backup set ID.</li>
         * <li><strong>Timestamp</strong>: a historical point in time. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</li>
         * </ul>
         * <p> Default value: <strong>LATEST</strong>.</p>
         * <blockquote>
         * <p>If <strong>CreationOption</strong> is set to <strong>CloneFromRDS</strong>, this parameter can only be set to <strong>LATEST</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder cloneDataPoint(String cloneDataPoint) {
            this.putQueryParameter("CloneDataPoint", cloneDataPoint);
            this.cloneDataPoint = cloneDataPoint;
            return this;
        }

        /**
         * <p>The cloud service provider to which the instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ENS</p>
         */
        public Builder cloudProvider(String cloudProvider) {
            this.putQueryParameter("CloudProvider", cloudProvider);
            this.cloudProvider = cloudProvider;
            return this;
        }

        /**
         * <p>The network type of the cluster. Only virtual private clouds (VPCs) are supported. Set the value to <strong>VPC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder clusterNetworkType(String clusterNetworkType) {
            this.putQueryParameter("ClusterNetworkType", clusterNetworkType);
            this.clusterNetworkType = clusterNetworkType;
            return this;
        }

        /**
         * <p>The edition of the cluster. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: Cluster Edition (default).</li>
         * <li><strong>Basic</strong>: Single Node Edition.</li>
         * <li><strong>ArchiveNormal</strong>: PolarDB X-Engine Edition.</li>
         * <li><strong>NormalMultimaster</strong>: Multi-master Cluster Edition.</li>
         * <li><strong>SENormal</strong>: Standard Edition.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><strong>MySQL</strong> <strong>5.6</strong>, <strong>5.7</strong>, <strong>8.0</strong>, <strong>PostgreSQL</strong> <strong>14</strong>, and <strong>Oracle syntax-compatible 2.0</strong> support <strong>Basic</strong>.</li>
         * <li><strong>MySQL</strong> <strong>8.0</strong> supports <strong>ArchiveNormal</strong> and <strong>NormalMultimaster</strong>.</li>
         * <li><strong>MySQL</strong> <strong>5.6</strong>, <strong>5.7</strong>, <strong>8.0</strong>, and <strong>PostgreSQL</strong> <strong>14</strong> support <strong>SENormal</strong>.</li>
         * </ul>
         * </blockquote>
         * <p>For more information about editions, see <a href="https://help.aliyun.com/document_detail/183258.html">Product editions</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder creationCategory(String creationCategory) {
            this.putQueryParameter("CreationCategory", creationCategory);
            this.creationCategory = creationCategory;
            return this;
        }

        /**
         * <p>The method used to create the cluster. Valid values: </p>
         * <ul>
         * <li><p><strong>Normal</strong>: creates a new PolarDB cluster. For more information about console operations, see the following topics:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/58769.html">Create a PolarDB for MySQL database cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118063.html">Create a PolarDB for PostgreSQL database cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118182.html">Create a PolarDB for PostgreSQL (Compatible with Oracle) database cluster</a></li>
         * </ul>
         * </li>
         * <li><p><strong>CloneFromPolarDB</strong>: clones data from an existing PolarDB cluster to a new PolarDB cluster. For more information about console operations, see the following topics:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/87966.html">Clone a PolarDB for MySQL cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118108.html">Clone a PolarDB for PostgreSQL cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118221.html">Clone a PolarDB for PostgreSQL (Compatible with Oracle) cluster</a></li>
         * </ul>
         * </li>
         * <li><p><strong>RecoverFromRecyclebin</strong>: restores data from a released PolarDB cluster to a new PolarDB cluster. For more information about console operations, see the following topics:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/164880.html">Restore a released PolarDB for MySQL cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/432844.html">Restore a released PolarDB for PostgreSQL cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/424632.html">Restore a released PolarDB for PostgreSQL (Compatible with Oracle) cluster</a></li>
         * </ul>
         * </li>
         * <li><p><strong>CloneFromRDS</strong>: clones data from an existing ApsaraDB RDS instance to a new PolarDB cluster. For more information about console operations, see <a href="https://help.aliyun.com/document_detail/121812.html">Clone an ApsaraDB RDS for MySQL instance to a PolarDB for MySQL cluster</a>.</p>
         * </li>
         * <li><p><strong>MigrationFromRDS</strong>: migrates data from an existing ApsaraDB RDS instance to a new PolarDB cluster. The created PolarDB cluster is in read-only pattern and has Binlog enabled by default. For more information about console operations, see <a href="https://help.aliyun.com/document_detail/121582.html">Upgrade an ApsaraDB RDS for MySQL instance to a PolarDB for MySQL cluster</a>.</p>
         * </li>
         * <li><p><strong>CreateGdnStandby</strong>: creates a secondary cluster. For more information about console operations, see <a href="https://help.aliyun.com/document_detail/160381.html">Add a secondary cluster</a>.</p>
         * </li>
         * <li><p><strong>UpgradeFromPolarDB</strong>: performs instance migration and upgrade from PolarDB. For more information about console operations, see <a href="https://help.aliyun.com/document_detail/459712.html">Major engine version upgrade</a>.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>Normal</strong>.</p>
         * <blockquote>
         * <p>When <strong>DBType</strong> is set to <strong>MySQL</strong> and <strong>DBVersion</strong> is set to <strong>8.0</strong>, you can set this parameter to <strong>CreateGdnStandby</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder creationOption(String creationOption) {
            this.putQueryParameter("CreationOption", creationOption);
            this.creationOption = creationOption;
            return this;
        }

        /**
         * <p>The name of the cluster. The name must meet the following requirements:</p>
         * <ul>
         * <li>It cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>It must be 2 to 256 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.putQueryParameter("DBClusterDescription", DBClusterDescription);
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The minor version of the database engine. Valid values:</p>
         * <ul>
         * <li><p><strong>8.0.2</strong></p>
         * </li>
         * <li><p><strong>8.0.1</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>DBType</strong> is set to <strong>MySQL</strong> and <strong>DBVersion</strong> is set to <strong>8.0</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8.0.1</p>
         */
        public Builder DBMinorVersion(String DBMinorVersion) {
            this.putQueryParameter("DBMinorVersion", DBMinorVersion);
            this.DBMinorVersion = DBMinorVersion;
            return this;
        }

        /**
         * <p>The node specification. For more information, see the following topics:</p>
         * <ul>
         * <li>PolarDB for MySQL: <a href="https://help.aliyun.com/document_detail/102542.html">Compute node specifications</a>.</li>
         * <li>PolarDB for PostgreSQL (Compatible with Oracle): <a href="https://help.aliyun.com/document_detail/207921.html">Compute node specifications</a>.</li>
         * <li>PolarDB for PostgreSQL: <a href="https://help.aliyun.com/document_detail/209380.html">Compute node specifications</a>.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>To create a serverless cluster for PolarDB for MySQL Cluster Edition, set this parameter to <strong>polar.mysql.sl.small</strong>.</li>
         * <li>To create a serverless cluster for PolarDB for MySQL Standard Edition, set this parameter to <strong>polar.mysql.sl.small.c</strong>.</li>
         * <li>To create a serverless cluster for PolarDB for PostgreSQL Cluster Edition, set this parameter to <strong>polar.pg.sl.small</strong>.</li>
         * <li>To create a serverless cluster for PolarDB for PostgreSQL Standard Edition, set this parameter to <strong>polar.pg.sl.small.c</strong>.</li>
         * <li>To create a serverless cluster for PolarDB for PostgreSQL (Compatible with Oracle), set this parameter to <strong>polar.o.sl.small</strong>.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x4.medium</p>
         */
        public Builder DBNodeClass(String DBNodeClass) {
            this.putQueryParameter("DBNodeClass", DBNodeClass);
            this.DBNodeClass = DBNodeClass;
            return this;
        }

        /**
         * <p>The number of nodes for Standard Edition and Enterprise Edition. Valid values:</p>
         * <ul>
         * <li>Standard Edition: 1 to 8 (supports 1 read/write node and 7 read-only nodes).</li>
         * <li>Enterprise Edition: 1 to 16 (supports 1 read/write node and 15 read-only nodes).<blockquote>
         * <ul>
         * <li>Enterprise Edition has 2 nodes by default, and Standard Edition has 1 node by default.</li>
         * <li>Only PolarDB for MySQL supports this parameter.</li>
         * <li>Changing the number of nodes for Multi-master Cluster Edition clusters is not supported.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder DBNodeNum(Integer DBNodeNum) {
            this.putQueryParameter("DBNodeNum", DBNodeNum);
            this.DBNodeNum = DBNodeNum;
            return this;
        }

        /**
         * <p>The type of the database engine. Valid values: </p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.putQueryParameter("DBType", DBType);
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The database DPI engine version number.</p>
         * <ul>
         * <li><p>Valid values for MySQL version number: </p>
         * <ul>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>8.0</strong></li>
         * </ul>
         * </li>
         * <li><p>Valid values for PostgreSQL version number:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * <li><p><strong>15</strong>
         *   &lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>To create a serverless cluster for PolarDB for PostgreSQL, only version 14 is supported.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * <li><p>Valid values for Oracle version number:</p>
         * <ul>
         * <li><strong>11</strong></li>
         * <li><strong>14</strong></li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5.6</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.putQueryParameter("DBVersion", DBVersion);
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The default time zone of the cluster (UTC). The value can be any time frame within the range of <strong>-12:00 to +13:00</strong>, such as <strong>00:00</strong>. Default value: <strong>SYSTEM</strong>, which indicates that the default time zone is the same as the time zone of the region.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        public Builder defaultTimeZone(String defaultTimeZone) {
            this.putQueryParameter("DefaultTimeZone", defaultTimeZone);
            this.defaultTimeZone = defaultTimeZone;
            return this;
        }

        /**
         * <p>The ID of the Edge Node Service (ENS) node. This parameter is required when you create an ENS database.</p>
         * 
         * <strong>example:</strong>
         * <p>vn-hanoi-3</p>
         */
        public Builder ensRegionId(String ensRegionId) {
            this.putQueryParameter("EnsRegionId", ensRegionId);
            this.ensRegionId = ensRegionId;
            return this;
        }

        /**
         * <p>The ID of the Global Database Network (GDN).</p>
         * <blockquote>
         * <p>This parameter is required when <strong>CreationOption</strong> is set to <strong>CreateGdnStandby</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gdn-***********</p>
         */
        public Builder GDNId(String GDNId) {
            this.putQueryParameter("GDNId", GDNId);
            this.GDNId = GDNId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the hot standby cluster. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong> (default): enables the hot standby storage cluster.</li>
         * <li><strong>OFF</strong>: disables the hot standby cluster.</li>
         * <li><strong>STANDBY</strong>: enables the hot standby cluster.</li>
         * <li><strong>EQUAL</strong>: enables both the hot standby storage cluster and the hot standby compute cluster.</li>
         * <li><strong>3AZ</strong>: enables multi-zone strong data consistency.<blockquote>
         * <p><strong>STANDBY</strong> takes effect only for PolarDB for PostgreSQL.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder hotStandbyCluster(String hotStandbyCluster) {
            this.putQueryParameter("HotStandbyCluster", hotStandbyCluster);
            this.hotStandbyCluster = hotStandbyCluster;
            return this;
        }

        /**
         * <p>Specifies whether to enable the Binlog feature. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong>: enables the Binlog feature for the cluster.</li>
         * <li><strong>OFF</strong>: disables the Binlog feature for the cluster.<blockquote>
         * <p>This parameter takes effect only when <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder loosePolarLogBin(String loosePolarLogBin) {
            this.putQueryParameter("LoosePolarLogBin", loosePolarLogBin);
            this.loosePolarLogBin = loosePolarLogBin;
            return this;
        }

        /**
         * <p>Specifies whether to enable the X-Engine storage engine. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong>: enables the X-Engine storage engine for the cluster.</li>
         * <li><strong>OFF</strong>: disables the X-Engine storage engine for the cluster.<blockquote>
         * <p>This parameter takes effect only when <strong>CreationOption</strong> is not set to <strong>CreateGdnStandby</strong>, <strong>DBType</strong> is set to <strong>MySQL</strong>, and <strong>DBVersion</strong> is set to <strong>8.0</strong>. The memory specification of the node with X-Engine enabled must be 8 GB or more.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder looseXEngine(String looseXEngine) {
            this.putQueryParameter("LooseXEngine", looseXEngine);
            this.looseXEngine = looseXEngine;
            return this;
        }

        /**
         * <p>The percentage of memory allocated to the X-Engine storage engine. Valid values: integers from 10 to 90.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>LooseXEngine</strong> is set to <strong>ON</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder looseXEngineUseMemoryPct(String looseXEngineUseMemoryPct) {
            this.putQueryParameter("LooseXEngineUseMemoryPct", looseXEngineUseMemoryPct);
            this.looseXEngineUseMemoryPct = looseXEngineUseMemoryPct;
            return this;
        }

        /**
         * <p>Specifies whether table names are case-sensitive. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Table names are case-insensitive.</li>
         * <li><strong>0</strong>: Table names are case-sensitive.</li>
         * </ul>
         * <p>Default value: <strong>1</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder lowerCaseTableNames(String lowerCaseTableNames) {
            this.putQueryParameter("LowerCaseTableNames", lowerCaseTableNames);
            this.lowerCaseTableNames = lowerCaseTableNames;
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
         * <p>The ID of the parameter template.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the list of parameter templates in the target region, including parameter template IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pcpg-**************</p>
         */
        public Builder parameterGroupId(String parameterGroupId) {
            this.putQueryParameter("ParameterGroupId", parameterGroupId);
            this.parameterGroupId = parameterGroupId;
            return this;
        }

        /**
         * <p>The billing method. Valid values: </p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
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
         * <p>This is a required parameter to pass when <strong>PayType</strong> is set to <strong>Prepaid</strong>. Specifies the subscription type of the subscription cluster. </p>
         * <ul>
         * <li><strong>Year</strong>: annual subscription.</li>
         * <li><strong>Month</strong>: monthly subscription.</li>
         * </ul>
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
         * <p>The coupon code. If you do not specify this parameter, the default coupon is used.</p>
         * 
         * <strong>example:</strong>
         * <p>727xxxxxx934</p>
         */
        public Builder promotionCode(String promotionCode) {
            this.putQueryParameter("PromotionCode", promotionCode);
            this.promotionCode = promotionCode;
            return this;
        }

        /**
         * <p id="p_wyg_t4a_glm" props="china" icmsditafragmentmagic=1>The provisioned read/write IOPS for ESSD AutoPL cloud disks. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}.</p>
         * <p id="p_6de_jxy_k2g" props="china" icmsditafragmentmagic=1>Baseline performance = min{1,800 + 50 × capacity, 50000}.</p>
         * <note id="note_7kj_j0o_rgs" props="china" icmsditafragmentmagic=1>This parameter is supported only when StorageType is set to ESSDAUTOPL.</note>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder provisionedIops(Long provisionedIops) {
            this.putQueryParameter("ProvisionedIops", provisionedIops);
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The specification of the database proxy for Standard Edition. Valid values:</p>
         * <ul>
         * <li><strong>polar.maxscale.g2.medium.c</strong>: 2 cores.</li>
         * <li><strong>polar.maxscale.g2.large.c</strong>: 4 cores.</li>
         * <li><strong>polar.maxscale.g2.xlarge.c</strong>: 8 cores.</li>
         * <li><strong>polar.maxscale.g2.2xlarge.c</strong>: 16 cores.</li>
         * <li><strong>polar.maxscale.g2.3xlarge.c</strong>: 24 cores.</li>
         * <li><strong>polar.maxscale.g2.4xlarge.c</strong>: 32 cores.</li>
         * <li><strong>polar.maxscale.g2.8xlarge.c</strong>: 64 cores.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>polar.maxscale.g2.medium.c</p>
         */
        public Builder proxyClass(String proxyClass) {
            this.putQueryParameter("ProxyClass", proxyClass);
            this.proxyClass = proxyClass;
            return this;
        }

        /**
         * <p>The type of the database proxy. Valid values:</p>
         * <ul>
         * <li><strong>EXCLUSIVE</strong>: Dedicated Enterprise Edition.</li>
         * <li><strong>GENERAL</strong>: Standard Enterprise Edition.<blockquote>
         * <p>The proxy type must match the type that corresponds to the node specifications of the cluster:</p>
         * <ul>
         * <li>If the node specifications are General-purpose, set the proxy type to Standard Enterprise Edition.</li>
         * <li>If the node specifications are Dedicated, set the proxy type to Dedicated Enterprise Edition.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exclusive</p>
         */
        public Builder proxyType(String proxyType) {
            this.putQueryParameter("ProxyType", proxyType);
            this.proxyType = proxyType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
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
         * <p>The maximum scaling limit for a single node. Valid values: 1 PCU to 32 PCU.</p>
         * <blockquote>
         * <p>Only serverless clusters support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder scaleMax(String scaleMax) {
            this.putQueryParameter("ScaleMax", scaleMax);
            this.scaleMax = scaleMax;
            return this;
        }

        /**
         * <p>The minimum scaling limit for a single node. Valid values: 1 PCU to 31 PCU.</p>
         * <blockquote>
         * <p>Only serverless clusters support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scaleMin(String scaleMin) {
            this.putQueryParameter("ScaleMin", scaleMin);
            this.scaleMin = scaleMin;
            return this;
        }

        /**
         * <p>The maximum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
         * <blockquote>
         * <p>Only serverless clusters support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder scaleRoNumMax(String scaleRoNumMax) {
            this.putQueryParameter("ScaleRoNumMax", scaleRoNumMax);
            this.scaleRoNumMax = scaleRoNumMax;
            return this;
        }

        /**
         * <p>The minimum number of read-only nodes for scaling. Valid values: 0 to 15.</p>
         * <blockquote>
         * <p>Only serverless clusters support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder scaleRoNumMin(String scaleRoNumMin) {
            this.putQueryParameter("ScaleRoNumMin", scaleRoNumMin);
            this.scaleRoNumMin = scaleRoNumMin;
            return this;
        }

        /**
         * <p>The IP whitelist of the PolarDB cluster.</p>
         * <blockquote>
         * <p>You can configure multiple IP addresses in the whitelist. Separate multiple IP addresses with commas (,).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10.<em><strong>.</strong></em>.***</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The serverless type. Set the value to <strong>AgileServerless</strong> (agile).</p>
         * <blockquote>
         * <p>Only serverless clusters support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        public Builder serverlessType(String serverlessType) {
            this.putQueryParameter("ServerlessType", serverlessType);
            this.serverlessType = serverlessType;
            return this;
        }

        /**
         * <p>Instance ID of the source ApsaraDB RDS instance or the source PolarDB cluster. This parameter is required only when <strong>CreationOption</strong> is set to <strong>MigrationFromRDS</strong>, <strong>CloneFromRDS</strong>, <strong>CloneFromPolarDB</strong>, or <strong>RecoverFromRecyclebin</strong>.</p>
         * <ul>
         * <li><p>If <strong>CreationOption</strong> is set to <strong>MigrationFromRDS</strong> or <strong>CloneFromRDS</strong>, set this parameter to instance ID of the source ApsaraDB RDS instance. The source ApsaraDB RDS instance must run ApsaraDB RDS for MySQL 5.6, 5.7, or 8.0 High-availability Edition.</p>
         * </li>
         * <li><p>If <strong>CreationOption</strong> is set to <strong>CloneFromPolarDB</strong>, set this parameter to instance ID of the source PolarDB cluster. The cloned cluster and the source cluster use the same DBType by default. For example, if the source cluster runs MySQL 8.0, set <strong>DBType</strong> to <strong>MySQL</strong> and <strong>DBVersion</strong> to <strong>8.0</strong> for the cloned cluster.</p>
         * </li>
         * <li><p>If <strong>CreationOption</strong> is set to <strong>RecoverFromRecyclebin</strong>, set this parameter to instance ID of the released source PolarDB cluster. The restored cluster and the source cluster must use the same DBType. For example, if the source cluster runs MySQL 8.0, set <strong>DBType</strong> to <strong>MySQL</strong> and <strong>DBVersion</strong> to <strong>8.0</strong> for the restored cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rm-*************</p>
         */
        public Builder sourceResourceId(String sourceResourceId) {
            this.putQueryParameter("SourceResourceId", sourceResourceId);
            this.sourceResourceId = sourceResourceId;
            return this;
        }

        /**
         * <p>The UID of the account that owns the source backup set in a cross-account backup restoration scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>1022xxxxxxxx</p>
         */
        public Builder sourceUid(Long sourceUid) {
            this.putQueryParameter("SourceUid", sourceUid);
            this.sourceUid = sourceUid;
            return this;
        }

        /**
         * <p>The zone of the hot standby cluster.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the hot standby cluster or multi-zone strong data consistency is enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-g</p>
         */
        public Builder standbyAZ(String standbyAZ) {
            this.putQueryParameter("StandbyAZ", standbyAZ);
            this.standbyAZ = standbyAZ;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic storage scaling for Standard Edition clusters. Valid values:</p>
         * <ul>
         * <li>Enable: enables automatic storage scaling.</li>
         * <li>Disable: disables automatic storage scaling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enable</p>
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.putQueryParameter("StorageAutoScale", storageAutoScale);
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * <p>Specifies whether to enable cloud disk encryption. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled (default).<blockquote>
         * <p>This parameter takes effect only when <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StorageType</strong> is set to a Standard Edition storage type.</p>
         * </blockquote>
         */
        public Builder storageEncryption(Boolean storageEncryption) {
            this.putQueryParameter("StorageEncryption", storageEncryption);
            this.storageEncryption = storageEncryption;
            return this;
        }

        /**
         * <p>The ID of a custom encryption key for cloud disk encryption in the same region as the instance. If you specify this parameter, cloud disk encryption is automatically enabled and cannot be disabled. To use the default service key for cloud disk encryption, leave this parameter empty.</p>
         * <p>You can view the key ID in the Key Management Service (KMS) console or create a new key.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>DBType</strong> is set to <strong>MySQL</strong>.</p>
         * </blockquote>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>StorageType</strong> is set to a Standard Edition storage type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1022xxxxxxxx</p>
         */
        public Builder storageEncryptionKey(String storageEncryptionKey) {
            this.putQueryParameter("StorageEncryptionKey", storageEncryptionKey);
            this.storageEncryptionKey = storageEncryptionKey;
            return this;
        }

        /**
         * <p>The billing method for storage. Valid values:</p>
         * <ul>
         * <li>Postpaid: pay-by-capacity (pay-as-you-go).</li>
         * <li>Prepaid: pay-by-space (subscription).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder storagePayType(String storagePayType) {
            this.putQueryParameter("StoragePayType", storagePayType);
            this.storagePayType = storagePayType;
            return this;
        }

        /**
         * <p>The storage space for subscription (pay-by-space) billing. Unit: GB.</p>
         * <blockquote>
         * <ul>
         * <li>Valid values for PolarDB for MySQL Enterprise Edition: 10 to 50000.</li>
         * <li>Valid values for PolarDB for MySQL Standard Edition: 20 to 64000.</li>
         * <li>When the storage type of Standard Edition is ESSDAUTOPL, valid values are 40 to 64000 with a minimum step of 10, meaning only values such as 40, 50, 60, and so on are accepted.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder storageSpace(Long storageSpace) {
            this.putQueryParameter("StorageSpace", storageSpace);
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * <p>Valid values for Enterprise Edition storage type:</p>
         * <ul>
         * <li><strong>PSL5</strong></li>
         * <li><strong>PSL4</strong></li>
         * </ul>
         * <p>Valid values for Standard Edition storage type:</p>
         * <ul>
         * <li><strong>ESSDPL0</strong></li>
         * <li><strong>ESSDPL1</strong></li>
         * <li><strong>ESSDPL2</strong></li>
         * <li><strong>ESSDPL3</strong></li>
         * <li><strong>ESSDAUTOPL</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PSL4</p>
         */
        public Builder storageType(String storageType) {
            this.putQueryParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The upper limit for automatic storage scaling of Standard Edition clusters. Unit: GB.</p>
         * <blockquote>
         * <p>The maximum value is 32000.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>800</p>
         */
        public Builder storageUpperBound(Long storageUpperBound) {
            this.putQueryParameter("StorageUpperBound", storageUpperBound);
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * <p>Specifies whether multi-zone strong data consistency is enabled for the cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Multi-zone strong data consistency is enabled. This value applies to the Standard Edition three-zone deployment scenario.</p>
         * </li>
         * <li><p><strong>OFF</strong>: Multi-zone strong data consistency is not enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder strictConsistency(String strictConsistency) {
            this.putQueryParameter("StrictConsistency", strictConsistency);
            this.strictConsistency = strictConsistency;
            return this;
        }

        /**
         * <p>Specifies whether to enable Transparent Data Encryption (TDE). Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables TDE.</li>
         * <li><strong>false</strong>: disables TDE (default).</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when <strong>DBType</strong> is set to <strong>PostgreSQL</strong> or <strong>Oracle</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/167982.html">ModifyDBClusterTDE</a> operation to enable TDE for a PolarDB for MySQL cluster.</li>
         * <li>After TDE is enabled, it cannot be disabled.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder TDEStatus(Boolean TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The target minor engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0.1.1.54</p>
         */
        public Builder targetMinorVersion(String targetMinorVersion) {
            this.putQueryParameter("TargetMinorVersion", targetMinorVersion);
            this.targetMinorVersion = targetMinorVersion;
            return this;
        }

        /**
         * <p>This parameter is required when <strong>PayType</strong> is set to <strong>Prepaid</strong>.</p>
         * <ul>
         * <li>If <strong>Period</strong> is set to <strong>Month</strong>, <strong>UsedTime</strong> is an integer that ranges from <code>[1-9]</code>.</li>
         * <li>If <strong>Period</strong> is set to <strong>Year</strong>, <strong>UsedTime</strong> is an integer that ranges from <code>[1-3]</code>.</li>
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
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-**********</p>
         */
        public Builder VPCId(String VPCId) {
            this.putQueryParameter("VPCId", VPCId);
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * <blockquote>
         * <p>If you specify VPCId, you must also specify VSwitchId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vsw-**********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available zones.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-j</p>
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

    /**
     * 
     * {@link CreateDBClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateDBClusterRequest</p>
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
             * <p>The tag key. To add multiple tags to the target cluster at a time, click <strong>Add</strong> to add tag keys.</p>
             * <blockquote>
             * <p>You can add up to 20 tag pairs at a time. <code>Tag.N.Key</code> corresponds to <code>Tag.N.Value</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. To add multiple tags to the target cluster at a time, click <strong>Add</strong> to add tag values.</p>
             * <blockquote>
             * <p>You can add up to 20 tag pairs at a time. <code>Tag.N.Value</code> corresponds to <code>Tag.N.Key</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
