// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
    @com.aliyun.core.annotation.NameInMap("AllowShutDown")
    private String allowShutDown;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

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
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("StandbyAZ")
    private String standbyAZ;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StoragePayType")
    private String storagePayType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    @com.aliyun.core.annotation.Validation(maximum = 64000, minimum = 20)
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
    private java.util.List < Tag> tag;

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
        this.allowShutDown = builder.allowShutDown;
        this.architecture = builder.architecture;
        this.autoRenew = builder.autoRenew;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.burstingEnabled = builder.burstingEnabled;
        this.clientToken = builder.clientToken;
        this.cloneDataPoint = builder.cloneDataPoint;
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
        this.standbyAZ = builder.standbyAZ;
        this.storageAutoScale = builder.storageAutoScale;
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
    public java.util.List < Tag> getTag() {
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
        private String allowShutDown; 
        private String architecture; 
        private Boolean autoRenew; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String burstingEnabled; 
        private String clientToken; 
        private String cloneDataPoint; 
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
        private String standbyAZ; 
        private String storageAutoScale; 
        private String storagePayType; 
        private Long storageSpace; 
        private String storageType; 
        private Long storageUpperBound; 
        private String strictConsistency; 
        private Boolean TDEStatus; 
        private java.util.List < Tag> tag; 
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
            this.allowShutDown = request.allowShutDown;
            this.architecture = request.architecture;
            this.autoRenew = request.autoRenew;
            this.backupRetentionPolicyOnClusterDeletion = request.backupRetentionPolicyOnClusterDeletion;
            this.burstingEnabled = request.burstingEnabled;
            this.clientToken = request.clientToken;
            this.cloneDataPoint = request.cloneDataPoint;
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
            this.standbyAZ = request.standbyAZ;
            this.storageAutoScale = request.storageAutoScale;
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
         * <p>Whether to enable idle pause. Values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled (default)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Only supported by Serverless clusters.</p>
         * </blockquote>
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
         * <p>CPU architecture. Available values include:</p>
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
         * <p>Whether to enable auto-renewal, with available values as follows:</p>
         * <ul>
         * <li><strong>true</strong>: Auto-renew.</li>
         * <li><strong>false</strong>: Do not auto-renew.</li>
         * </ul>
         * <p>The default is <strong>false</strong>.</p>
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
         * <p>Backup retention policy upon cluster deletion, with valid values as follows:</p>
         * <ul>
         * <li><strong>ALL</strong>: Permanently retain all backups.</li>
         * <li><strong>LATEST</strong>: Permanently retain the latest backup (automatically backed up before deletion).</li>
         * <li><strong>NONE</strong>: Do not retain backup sets upon cluster deletion.</li>
         * </ul>
         * <p>By default, the value is set to <strong>NONE</strong>, indicating no backup sets are retained upon cluster deletion.</p>
         * <blockquote>
         * <p>This parameter applies only when <strong>DBType</strong> is <strong>MySQL</strong>.
         * Serverless clusters do not support this parameter.</p>
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
         * BurstingEnabled.
         */
        public Builder burstingEnabled(String burstingEnabled) {
            this.putQueryParameter("BurstingEnabled", burstingEnabled);
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>Used to ensure idempotency of the request. Generated by the client, ensuring uniqueness across different requests, case-sensitive, and not exceeding 64 ASCII characters.</p>
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
         * <p>The point in time to clone data, with the following options:</p>
         * <ul>
         * <li><strong>LATEST</strong>: Data from the latest time point.</li>
         * <li><strong>BackupID</strong>: Historical backup set ID, please enter the specific backup set ID.</li>
         * <li><strong>Timestamp</strong>: Historical time point, please enter the specific time in the format <code>YYYY-MM-DDThh:mm:ssZ</code> (UTC time).</li>
         * </ul>
         * <p>The default value is <strong>LATEST</strong>.</p>
         * <blockquote>
         * <p>If <strong>CreationOption</strong> is <strong>CloneFromRDS</strong>, this parameter can only be set to <strong>LATEST</strong>.</p>
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
         * <p>Cluster network type, currently only VPC is supported, with a fixed value of <strong>VPC</strong>.</p>
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
         * <p>Product series, with valid values as follows:</p>
         * <ul>
         * <li><strong>Normal</strong>: Cluster Edition (default)</li>
         * <li><strong>Basic</strong>: Single-node</li>
         * <li><strong>ArchiveNormal</strong>: High Compression Engine (X-Engine)</li>
         * <li><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</li>
         * <li><strong>SENormal</strong>: Standard Edition</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><strong>MySQL</strong> <strong>5.6</strong>, <strong>5.7</strong>, <strong>8.0</strong>, <strong>PostgreSQL</strong> <strong>14</strong>, and <strong>Oracle Syntax Compatible 2.0</strong> support <strong>Basic</strong>.</li>
         * <li><strong>MySQL</strong> <strong>8.0</strong> supports <strong>ArchiveNormal</strong> and <strong>NormalMultimaster</strong>.</li>
         * <li><strong>MySQL</strong> <strong>5.6</strong>, <strong>5.7</strong>, <strong>8.0</strong>, and <strong>PostgreSQL</strong> <strong>14</strong> support <strong>SENormal</strong>.</li>
         * </ul>
         * </blockquote>
         * <p>For more information about product series, see <a href="https://help.aliyun.com/document_detail/183258.html">Product Series</a>.</p>
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
         * <p>Creation method, with the following values supported:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Creates a brand new PolarDB cluster. For console operations, refer to the following documents:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/58769.html">Create a PolarDB MySQL Edition Database Cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118063.html">Create a PolarDB PostgreSQL Edition Database Cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118182.html">Create a PolarDB PostgreSQL Edition (Oracle Compatible) Database Cluster</a></li>
         * </ul>
         * </li>
         * <li><p><strong>CloneFromPolarDB</strong>: Clones data from an existing PolarDB cluster to a new PolarDB cluster. For console operations, refer to the following documents:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/87966.html">Clone a PolarDB MySQL Edition Cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118108.html">Clone a PolarDB PostgreSQL Edition Cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/118221.html">Clone a PolarDB PostgreSQL Edition (Oracle Compatible) Cluster</a></li>
         * </ul>
         * </li>
         * <li><p><strong>RecoverFromRecyclebin</strong>: Recovers data from a released PolarDB cluster to a new PolarDB cluster. For console operations, refer to the following documents:</p>
         * <ul>
         * <li><a href="https://help.aliyun.com/document_detail/164880.html">Restore a Released PolarDB MySQL Edition Cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/432844.html">Restore a Released PolarDB PostgreSQL Edition Cluster</a></li>
         * <li><a href="https://help.aliyun.com/document_detail/424632.html">Restore a Released PolarDB PostgreSQL Edition (Oracle Compatible) Cluster</a></li>
         * </ul>
         * </li>
         * <li><p><strong>CloneFromRDS</strong>: Clones data from an existing RDS instance to a new PolarDB cluster. Console operation guide is available at <a href="https://help.aliyun.com/document_detail/121812.html">One-click Clone from RDS MySQL to PolarDB MySQL Edition</a>.</p>
         * </li>
         * <li><p><strong>MigrationFromRDS</strong>: Migrates data from an existing RDS instance to a new PolarDB cluster. The created PolarDB cluster operates in read-only mode with Binlog enabled by default. Console operation guide is at <a href="https://help.aliyun.com/document_detail/121582.html">One-click Upgrade from RDS MySQL to PolarDB MySQL Edition</a>.</p>
         * </li>
         * <li><p><strong>CreateGdnStandby</strong>: Creates a standby cluster. Console operation guide can be found at <a href="https://help.aliyun.com/document_detail/160381.html">Add Standby Cluster</a>.</p>
         * </li>
         * <li><p><strong>UpgradeFromPolarDB</strong>: Upgrades and migrates from PolarDB. Console operation guide is detailed in <a href="https://help.aliyun.com/document_detail/459712.html">Major Version Upgrade</a>.</p>
         * </li>
         * </ul>
         * <p>The default value is <strong>Normal</strong>.</p>
         * <blockquote>
         * <p>When <strong>DBType</strong> is <strong>MySQL</strong> and <strong>DBVersion</strong> is <strong>8.0</strong>, this parameter can also take the value <strong>CreateGdnStandby</strong>.</p>
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
         * <p>Cluster name, which must meet the following requirements:</p>
         * <ul>
         * <li>Cannot start with <code>http://</code> or <code>https://</code>.</li>
         * <li>Length should be between 2 and 256 characters.</li>
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
         * <p>Database engine minor version number. Valid values include:</p>
         * <ul>
         * <li><strong>8.0.2</strong></li>
         * <li><strong>8.0.1</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>DBType</strong> is <strong>MySQL</strong> and <strong>DBVersion</strong> is <strong>8.0</strong>.</p>
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
         * <p>Node specifications. For details, refer to the following documents:</p>
         * <ul>
         * <li>PolarDB MySQL Edition: <a href="https://help.aliyun.com/document_detail/102542.html">Compute Node Specifications</a>.</li>
         * <li>PolarDB PostgreSQL Edition (Oracle Compatible): <a href="https://help.aliyun.com/document_detail/207921.html">Compute Node Specifications</a>.</li>
         * <li>PolarDB PostgreSQL Edition: <a href="https://help.aliyun.com/document_detail/209380.html">Compute Node Specifications</a>.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For a Serverless cluster in PolarDB MySQL, enter <strong>polar.mysql.sl.small</strong>.
         * &lt;props=&quot;china&quot;&gt;&gt; - For a Serverless cluster in both PolarDB PostgreSQL (Oracle Compatible) and PolarDB PostgreSQL, enter <strong>polar.pg.sl.small.c</strong>.</li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The number of nodes. This parameter is supported for Standard Edition clusters. Valid values:</p>
         * <ul>
         * <li><strong>1</strong> (default): only one primary node.</li>
         * <li><strong>2</strong>: one read-only node and one primary node.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>By default, an Enterprise Edition cluster has two nodes and a Standard Edition cluster has one node.</p>
         * </li>
         * <li><p>This parameter is supported only for PolarDB for MySQL clusters.</p>
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
         * <p>Database engine type, with available values as follows:</p>
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
         * <p>Database engine version number.</p>
         * <ul>
         * <li><p>For MySQL, the version numbers are as follows:</p>
         * <ul>
         * <li><strong>5.6</strong></li>
         * <li><strong>5.7</strong></li>
         * <li><strong>8.0</strong></li>
         * </ul>
         * </li>
         * <li><p>For PostgreSQL, the version numbers are as follows:</p>
         * <ul>
         * <li><p><strong>11</strong></p>
         * </li>
         * <li><p><strong>14</strong></p>
         * </li>
         * <li><p><strong>15</strong>
         *   &lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>When creating a Serverless cluster in PolarDB PostgreSQL, only version <strong>14</strong> is supported.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * <li><p>For Oracle, the version numbers are as follows:</p>
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
         * <p>Cluster timezone (UTC), with selectable values ranging from <strong>-12:00</strong> to <strong>+13:00</strong> at whole-hour intervals, e.g., <strong>00:00</strong>. The default value is <strong>SYSTEM</strong>, which matches the Region&quot;s timezone.</p>
         * <blockquote>
         * <p>This parameter applies only when <strong>DBType</strong> is <strong>MySQL</strong>.</p>
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
         * <p>Global Database Network (GDN) ID.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>CreationOption</strong> is <strong>CreateGdnStandby</strong>.</p>
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
         * <p>Whether to enable the hot standby cluster. Values are as follows:</p>
         * <ul>
         * <li><strong>ON</strong> (default): Enables the hot standby cluster.</li>
         * <li><strong>OFF</strong>: Disables the hot standby cluster.</li>
         * <li><strong>STANDBY</strong>: Enables the hot standby cluster for the standard edition.<blockquote>
         * <p>The default value for standard edition clusters is <strong>STANDBY</strong>.</p>
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
         * <p>Enable Binlog feature, valid values are as follows:</p>
         * <ul>
         * <li><strong>ON</strong>: Cluster enables the Binlog feature. - <strong>OFF</strong>: Cluster disables the Binlog feature. &gt; This parameter takes effect only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong>.</li>
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
         * <p>Enable the X-Engine storage engine feature, with valid values as follows:</p>
         * <ul>
         * <li><strong>ON</strong>: The cluster enables the X-Engine engine.</li>
         * <li><strong>OFF</strong>: The cluster disables the X-Engine engine.<blockquote>
         * <p>This parameter is effective only when <strong>CreationOption</strong> is not <strong>CreateGdnStandby</strong>, <strong>DBType</strong> is <strong>MySQL</strong>, and <strong>DBVersion</strong> is <strong>8.0</strong>. The memory specification of nodes that enable the X-Engine engine must be at least 8 GB.</p>
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
         * <p>Set the ratio for enabling the X-Engine storage engine, with a range of integers from 10 to 90.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>LooseXEngine</strong> is <strong>ON</strong>.</p>
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
         * <p>Whether table names are case-sensitive, with valid values as follows:</p>
         * <ul>
         * <li><strong>1</strong>: Case-insensitive</li>
         * <li><strong>0</strong>: Case-sensitive</li>
         * </ul>
         * <p>The default value is <strong>1</strong>.</p>
         * <blockquote>
         * <p>This parameter applies only when <strong>DBType</strong> is <strong>MySQL</strong>.</p>
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
         * <p>Parameter template ID.</p>
         * <blockquote>
         * <p>You can view the list of parameter templates in the target region, including the parameter template ID, by calling the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> interface.</p>
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
         * <p>Payment type, with available values as follows:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: Pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: Subscription (monthly or yearly).</li>
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
         * <p>If the payment type is <strong>Prepaid</strong>, this parameter is required. It specifies whether the prepaid cluster is on a monthly or yearly basis.</p>
         * <ul>
         * <li><strong>Year</strong>: Yearly subscription.</li>
         * <li><strong>Month</strong>: Monthly subscription.</li>
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
         * <p id="p_wyg_t4a_glm">The provisioned read and write IOPS for ESSD AutoPL cloud disks. Possible values: 0 to min{50,000, 1000*capacity-Baseline Performance}.</p>
         * <p id="p_6de_jxy_k2g">Baseline Performance = min{1,800+50*capacity, 50000}.</p>
         * <note id="note_7kj_j0o_rgs">This parameter is supported only when StorageType is ESSDAUTOPL.</note>
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
         * <p>Standard edition database proxy specifications. Values are as follows:</p>
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
         * <p>Database proxy type, with values including:</p>
         * <ul>
         * <li><strong>EXCLUSIVE</strong>: Enterprise Exclusive Edition</li>
         * <li><strong>GENERAL</strong>: Enterprise General Purpose Edition<blockquote>
         * <p>The proxy type must match the type of the cluster&quot;s node specifications, i.e.,</p>
         * <ul>
         * <li>If the node specification is general, the proxy type should be Enterprise General Purpose Edition;</li>
         * <li>If the node specification is dedicated, the proxy type should be Enterprise Exclusive Edition.</li>
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
         * <p>Region ID.</p>
         * <blockquote>
         * <p>You can view available regions through the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> interface.</p>
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
         * <p>Resource group ID.</p>
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
         * <p>Maximum scaling limit for a single node. The value range is: 1 PCU~32 PCU.</p>
         * <blockquote>
         * <p>Only supported by Serverless clusters.</p>
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
         * <p>Minimum scaling limit for a single node. The value range is: 1 PCU~31 PCU.</p>
         * <blockquote>
         * <p>Only supported by Serverless clusters.</p>
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
         * <p>Maximum scaling limit for the number of read-only nodes. The value range is: 0~15.</p>
         * <blockquote>
         * <p>Only supported by Serverless clusters.</p>
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
         * <p>Minimum scaling limit for the number of read-only nodes. The value range is: 0~15.</p>
         * <blockquote>
         * <p>Only supported by Serverless clusters.</p>
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
         * <p>PolarDB cluster whitelist IP address.</p>
         * <blockquote>
         * <p>Supports configuring multiple whitelist IP addresses, with English commas separating multiple IP addresses.</p>
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
         * <p>Serverless type. The current value is fixed to <strong>AgileServerless</strong> (sensitive mode).</p>
         * <blockquote>
         * <p>This parameter is only supported by Serverless clusters.</p>
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
         * <p>Source RDS instance ID or source PolarDB cluster ID. This parameter is mandatory only when <strong>CreationOption</strong> is set to <strong>MigrationFromRDS</strong>, <strong>CloneFromRDS</strong>, <strong>CloneFromPolarDB</strong>, or <strong>RecoverFromRecyclebin</strong>.</p>
         * <ul>
         * <li><p>If <strong>CreationOption</strong> is <strong>MigrationFromRDS</strong> or <strong>CloneFromRDS</strong>, you need to input the source RDS instance ID. The source RDS instance version must be RDS MySQL 5.6, 5.7, or 8.0 High Availability edition.</p>
         * </li>
         * <li><p>If <strong>CreationOption</strong> is <strong>CloneFromPolarDB</strong>, you need to input the source PolarDB cluster ID. The DBType of the cloned cluster will default to match the source cluster. For example, if the source cluster is MySQL 8.0, the cloned cluster must also have <strong>DBType</strong> set to <strong>MySQL</strong> and <strong>DBVersion</strong> to <strong>8.0</strong>.</p>
         * </li>
         * <li><p>If <strong>CreationOption</strong> is <strong>RecoverFromRecyclebin</strong>, you need to input the released source PolarDB cluster ID. The DBType of the cluster being recovered from the recycle bin must match the source cluster. For example, if the source cluster was MySQL 8.0, the recovered cluster must also have <strong>DBType</strong> set to <strong>MySQL</strong> and <strong>DBVersion</strong> to <strong>8.0</strong>.</p>
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
         * <p>The availability zone where the hot standby cluster is stored. Applicable to the standard edition 3AZ scenario.</p>
         * <blockquote>
         * <p>This parameter takes effect only when multi-zone data strong consistency is enabled.</p>
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
         * <p>Whether to enable automatic storage expansion for standard edition clusters, with valid values as follows:</p>
         * <ul>
         * <li>Enable: Enables automatic storage expansion.</li>
         * <li>Disable: Disables automatic storage expansion.</li>
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
         * <p>The storage billing type, with valid values as follows:</p>
         * <ul>
         * <li>Postpaid: Pay-as-you-go (hourly).</li>
         * <li>Prepaid: Pay-per-use based on space (subscription).</li>
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
         * <p>Storage space for pay-by-space (subscription) billing. Unit: GB.</p>
         * <blockquote>
         * <ul>
         * <li>For PolarDB MySQL Standard Edition, the storage space range is 20 to 32000.</li>
         * <li>When the Standard Edition storage type is ESSDAUTOPL, the storage space range is 40 to 64000, with a minimum step size of 10, meaning you can only enter values like 40, 50, 60, and so on.</li>
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
         * <p>Enterprise edition storage types include:</p>
         * <ul>
         * <li><strong>PSL5</strong></li>
         * <li><strong>PSL4</strong></li>
         * </ul>
         * <p>Standard edition storage types include:</p>
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
         * <p>Set the upper limit for automatic storage expansion of standard edition clusters, in GB.</p>
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
         * <p>Whether the cluster has enabled strong data consistency across multiple zones. Values are as follows:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Indicates strong data consistency across multiple zones is enabled, applicable to the standard edition 3AZ scenario.</p>
         * </li>
         * <li><p><strong>OFF</strong>: Indicates strong data consistency across multiple zones is not enabled.</p>
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
         * <p>Enables TDE encryption. Valid values are as follows:</p>
         * <ul>
         * <li><strong>true</strong>: Enabled.</li>
         * <li><strong>false</strong>: Disabled (default).</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when <strong>DBType</strong> is <strong>PostgreSQL</strong> or <strong>Oracle</strong>.</li>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/167982.html">ModifyDBClusterTDE</a> interface to enable TDE encryption for a PolarDB MySQL cluster.</li>
         * <li>Once the TDE feature is enabled, it cannot be disabled.</li>
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
         * <p>List of tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
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
         * <p>If the payment type is <strong>Prepaid</strong>, this parameter is required.</p>
         * <ul>
         * <li>When <strong>Period</strong> is <strong>Month</strong>, <strong>UsedTime</strong> should be an integer within <code>[1-9]</code>.</li>
         * <li>When <strong>Period</strong> is <strong>Year</strong>, <strong>UsedTime</strong> should be an integer within <code>[1-3]</code>.</li>
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
         * <p>VPC ID.</p>
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
         * <p>Virtual switch ID.</p>
         * <blockquote>
         * <p>If VPCId has been selected, VSwitchId is mandatory.</p>
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
         * <p>Availability Zone ID.</p>
         * <blockquote>
         * <p>You can view the available zones through the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> interface.</p>
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

            /**
             * <p>Tag key. If you need to add multiple tags to the target cluster at once, click <strong>Add</strong> to add a tag key.</p>
             * <blockquote>
             * <p>Up to 20 pairs of tags can be added each time, where <code>Tag.N.Key</code> corresponds to <code>Tag.N.Value</code>.</p>
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
             * <p>Tag value. If you need to add multiple tags to the target cluster at once, click <strong>Add</strong> to add tag values.</p>
             * <blockquote>
             * <p>Up to 20 pairs of tags can be added each time, where <code>Tag.N.Value</code> corresponds to <code>Tag.N.Key</code>.</p>
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
