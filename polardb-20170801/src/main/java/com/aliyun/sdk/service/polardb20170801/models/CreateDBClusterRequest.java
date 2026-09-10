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
         * <p>The data retention policy for backups when the cluster is deleted. Valid values:</p>
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
         * <p>Specifies whether to enable I/O performance burst for the ESSD AutoPL cloud disk. Valid values:</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. The value of this parameter is generated by the client and is unique among different requests. The value is case-sensitive and cannot exceed 64 ASCII characters in length.</p>
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
         * <p>The point in time at which data is cloned. Valid values:</p>
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
         * <p>The network type of the cluster. Currently, only Virtual Private Cloud (VPC) is supported. Set the value to <strong>VPC</strong>.</p>
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
         * <p>The method used to create the cluster. Valid values:</p>
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
         * <p>The cluster name. The cluster name must meet the following requirements:</p>
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
         * <p>The node specifications. For details, see the following topics:</p>
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
         * <p>The database engine type. Valid values:</p>
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
         * <p>The database engine version.</p>
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
         * <p>The time zone of the cluster (UTC). The value can be set to any time frame within the range of <strong>-12:00 to +13:00</strong>, such as <strong>00:00</strong>. Default value: <strong>SYSTEM</strong>. The default time zone is the same as the time zone of the region.</p>
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
         * <p>The ENS node ID required when creating an ENS database.</p>
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
         * <p>The global database network (GDN) ID.</p>
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
         * <p>Specifies whether the hot standby cluster is enabled. Valid values:</p>
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
         * <p>The parameter template ID.</p>
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
         * <p>The billing method. Valid values:</p>
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
         * <p>This parameter is required when PayType is set to <strong>Prepaid</strong>. Specifies whether the subscription cluster uses a yearly or monthly billing cycle.</p>
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
         * <p>The coupon code. If not specified, the default coupon is used.</p>
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
         * <p id="p_wyg_t4a_glm" props="china" icmsditafragmentmagic=1>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1000 × capacity - baseline performance}.</p>
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
         * <p>The database proxy type. Valid values:</p>
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
         * <p>The maximum scaling limit per node. Valid values: 1 PCU to 32 PCUs.</p>
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
         * <p>The minimum scaling limit per node. Valid values: 1 PCU to 31 PCUs.</p>
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
         * <p>The serverless type. The value is fixed as <strong>AgileServerless</strong>.</p>
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
         * <p>The instance ID of the source ApsaraDB RDS instance or the source PolarDB cluster. This parameter is required only when <strong>CreationOption</strong> is set to <strong>MigrationFromRDS</strong>, <strong>CloneFromRDS</strong>, <strong>CloneFromPolarDB</strong>, or <strong>RecoverFromRecyclebin</strong>.</p>
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
         * <p>The UID of the account that owns the source backup set in cross-account backup restoration scenarios.</p>
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
         * <p>Specifies whether to enable automatic storage scaling for the Standard Edition cluster. Valid values:</p>
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
         */
        public Builder storageEncryption(Boolean storageEncryption) {
            this.putQueryParameter("StorageEncryption", storageEncryption);
            this.storageEncryption = storageEncryption;
            return this;
        }

        /**
         * <p>The key ID of the custom Key Management Service (KMS) key for cloud disk encryption in the same region as the instance. Specifying this parameter automatically enables cloud disk encryption, which cannot be disabled after being enabled. Leave this parameter empty to use the default service key for cloud disk encryption.</p>
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
         * <p>The billing type for storage. Valid values:</p>
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
         * <p>The storage space for the space-based billing (subscription) plan. Unit: GB.</p>
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
         * <p>The storage type for Enterprise Edition. Valid values:</p>
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
         * <p>The upper limit of automatic storage scaling for the Standard Edition cluster. Unit: GB.</p>
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
         * <p>Specifies whether to enable multi-zone strong data consistency for the cluster. Valid values:</p>
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
         * <p>This parameter is required when PayType is set to <strong>Prepaid</strong>.</p>
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
             * <p>The tag key. To add multiple tags to the cluster at a time, click <strong>Add</strong> to add tag keys.</p>
             * 
             * <strong>example:</strong>
             * <p>type</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value. To add multiple tags to the cluster at a time, click <strong>Add</strong> to add tag values.</p>
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
