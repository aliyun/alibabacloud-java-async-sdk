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
 * {@link DescribeDbClusterAttributeZonalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbClusterAttributeZonalResponseBody</p>
 */
public class DescribeDbClusterAttributeZonalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AiCreatingTime")
    private String aiCreatingTime;

    @com.aliyun.core.annotation.NameInMap("AiType")
    private String aiType;

    @com.aliyun.core.annotation.NameInMap("Architecture")
    private String architecture;

    @com.aliyun.core.annotation.NameInMap("AutoUpgradeMinorVersion")
    private String autoUpgradeMinorVersion;

    @com.aliyun.core.annotation.NameInMap("BlktagTotal")
    private Long blktagTotal;

    @com.aliyun.core.annotation.NameInMap("BlktagUsed")
    private Long blktagUsed;

    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private String burstingEnabled;

    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("CompressStorageMode")
    private String compressStorageMode;

    @com.aliyun.core.annotation.NameInMap("CompressStorageUsed")
    private Long compressStorageUsed;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterClass")
    private String DBClusterClass;

    @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBClusterNetworkType")
    private String DBClusterNetworkType;

    @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
    private String DBClusterStatus;

    @com.aliyun.core.annotation.NameInMap("DBNodes")
    private java.util.List<DBNodes> DBNodes;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("DBVersionStatus")
    private String DBVersionStatus;

    @com.aliyun.core.annotation.NameInMap("DataLevel1BackupChainSize")
    private Long dataLevel1BackupChainSize;

    @com.aliyun.core.annotation.NameInMap("DataSyncMode")
    private String dataSyncMode;

    @com.aliyun.core.annotation.NameInMap("DeletionLock")
    private Integer deletionLock;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("Expired")
    private String expired;

    @com.aliyun.core.annotation.NameInMap("HasCompleteStandbyRes")
    private Boolean hasCompleteStandbyRes;

    @com.aliyun.core.annotation.NameInMap("HotStandbyCluster")
    private String hotStandbyCluster;

    @com.aliyun.core.annotation.NameInMap("ImciAutoIndex")
    private String imciAutoIndex;

    @com.aliyun.core.annotation.NameInMap("ImperceptibleSwitch")
    private String imperceptibleSwitch;

    @com.aliyun.core.annotation.NameInMap("InodeTotal")
    private Long inodeTotal;

    @com.aliyun.core.annotation.NameInMap("InodeUsed")
    private Long inodeUsed;

    @com.aliyun.core.annotation.NameInMap("IsLatestVersion")
    private Boolean isLatestVersion;

    @com.aliyun.core.annotation.NameInMap("IsProxyLatestVersion")
    private Boolean isProxyLatestVersion;

    @com.aliyun.core.annotation.NameInMap("LockMode")
    private String lockMode;

    @com.aliyun.core.annotation.NameInMap("MaintainTime")
    private String maintainTime;

    @com.aliyun.core.annotation.NameInMap("Orca")
    private String orca;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
    private String provisionedIops;

    @com.aliyun.core.annotation.NameInMap("ProxyCpuCores")
    private String proxyCpuCores;

    @com.aliyun.core.annotation.NameInMap("ProxyServerlessType")
    private String proxyServerlessType;

    @com.aliyun.core.annotation.NameInMap("ProxyStandardCpuCores")
    private String proxyStandardCpuCores;

    @com.aliyun.core.annotation.NameInMap("ProxyStatus")
    private String proxyStatus;

    @com.aliyun.core.annotation.NameInMap("ProxyType")
    private String proxyType;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("RestoreDataPoint")
    private String restoreDataPoint;

    @com.aliyun.core.annotation.NameInMap("RestoreType")
    private String restoreType;

    @com.aliyun.core.annotation.NameInMap("RowCompression")
    private String rowCompression;

    @com.aliyun.core.annotation.NameInMap("SQLSize")
    private Long SQLSize;

    @com.aliyun.core.annotation.NameInMap("ServerlessType")
    private String serverlessType;

    @com.aliyun.core.annotation.NameInMap("SourceDBCluster")
    private String sourceDBCluster;

    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.NameInMap("StandbyHAMode")
    private String standbyHAMode;

    @com.aliyun.core.annotation.NameInMap("StorageMax")
    private Long storageMax;

    @com.aliyun.core.annotation.NameInMap("StoragePayType")
    private String storagePayType;

    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    private Long storageSpace;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("StorageUsed")
    private Long storageUsed;

    @com.aliyun.core.annotation.NameInMap("StrictConsistency")
    private String strictConsistency;

    @com.aliyun.core.annotation.NameInMap("SubCategory")
    private String subCategory;

    @com.aliyun.core.annotation.NameInMap("SupportInstantSwitchWithImci")
    private String supportInstantSwitchWithImci;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("VPCId")
    private String VPCId;

    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    private String vSwitchId;

    @com.aliyun.core.annotation.NameInMap("ZoneIds")
    private String zoneIds;

    private DescribeDbClusterAttributeZonalResponseBody(Builder builder) {
        this.aiCreatingTime = builder.aiCreatingTime;
        this.aiType = builder.aiType;
        this.architecture = builder.architecture;
        this.autoUpgradeMinorVersion = builder.autoUpgradeMinorVersion;
        this.blktagTotal = builder.blktagTotal;
        this.blktagUsed = builder.blktagUsed;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.compressStorageMode = builder.compressStorageMode;
        this.compressStorageUsed = builder.compressStorageUsed;
        this.creationTime = builder.creationTime;
        this.DBClusterClass = builder.DBClusterClass;
        this.DBClusterDescription = builder.DBClusterDescription;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusterNetworkType = builder.DBClusterNetworkType;
        this.DBClusterStatus = builder.DBClusterStatus;
        this.DBNodes = builder.DBNodes;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.DBVersionStatus = builder.DBVersionStatus;
        this.dataLevel1BackupChainSize = builder.dataLevel1BackupChainSize;
        this.dataSyncMode = builder.dataSyncMode;
        this.deletionLock = builder.deletionLock;
        this.engine = builder.engine;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.hasCompleteStandbyRes = builder.hasCompleteStandbyRes;
        this.hotStandbyCluster = builder.hotStandbyCluster;
        this.imciAutoIndex = builder.imciAutoIndex;
        this.imperceptibleSwitch = builder.imperceptibleSwitch;
        this.inodeTotal = builder.inodeTotal;
        this.inodeUsed = builder.inodeUsed;
        this.isLatestVersion = builder.isLatestVersion;
        this.isProxyLatestVersion = builder.isProxyLatestVersion;
        this.lockMode = builder.lockMode;
        this.maintainTime = builder.maintainTime;
        this.orca = builder.orca;
        this.payType = builder.payType;
        this.provisionedIops = builder.provisionedIops;
        this.proxyCpuCores = builder.proxyCpuCores;
        this.proxyServerlessType = builder.proxyServerlessType;
        this.proxyStandardCpuCores = builder.proxyStandardCpuCores;
        this.proxyStatus = builder.proxyStatus;
        this.proxyType = builder.proxyType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.restoreDataPoint = builder.restoreDataPoint;
        this.restoreType = builder.restoreType;
        this.rowCompression = builder.rowCompression;
        this.SQLSize = builder.SQLSize;
        this.serverlessType = builder.serverlessType;
        this.sourceDBCluster = builder.sourceDBCluster;
        this.sourceRegionId = builder.sourceRegionId;
        this.standbyHAMode = builder.standbyHAMode;
        this.storageMax = builder.storageMax;
        this.storagePayType = builder.storagePayType;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.storageUsed = builder.storageUsed;
        this.strictConsistency = builder.strictConsistency;
        this.subCategory = builder.subCategory;
        this.supportInstantSwitchWithImci = builder.supportInstantSwitchWithImci;
        this.tags = builder.tags;
        this.VPCId = builder.VPCId;
        this.vSwitchId = builder.vSwitchId;
        this.zoneIds = builder.zoneIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbClusterAttributeZonalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aiCreatingTime
     */
    public String getAiCreatingTime() {
        return this.aiCreatingTime;
    }

    /**
     * @return aiType
     */
    public String getAiType() {
        return this.aiType;
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return autoUpgradeMinorVersion
     */
    public String getAutoUpgradeMinorVersion() {
        return this.autoUpgradeMinorVersion;
    }

    /**
     * @return blktagTotal
     */
    public Long getBlktagTotal() {
        return this.blktagTotal;
    }

    /**
     * @return blktagUsed
     */
    public Long getBlktagUsed() {
        return this.blktagUsed;
    }

    /**
     * @return burstingEnabled
     */
    public String getBurstingEnabled() {
        return this.burstingEnabled;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return compressStorageMode
     */
    public String getCompressStorageMode() {
        return this.compressStorageMode;
    }

    /**
     * @return compressStorageUsed
     */
    public Long getCompressStorageUsed() {
        return this.compressStorageUsed;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
    }

    /**
     * @return DBClusterClass
     */
    public String getDBClusterClass() {
        return this.DBClusterClass;
    }

    /**
     * @return DBClusterDescription
     */
    public String getDBClusterDescription() {
        return this.DBClusterDescription;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBClusterNetworkType
     */
    public String getDBClusterNetworkType() {
        return this.DBClusterNetworkType;
    }

    /**
     * @return DBClusterStatus
     */
    public String getDBClusterStatus() {
        return this.DBClusterStatus;
    }

    /**
     * @return DBNodes
     */
    public java.util.List<DBNodes> getDBNodes() {
        return this.DBNodes;
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
     * @return DBVersionStatus
     */
    public String getDBVersionStatus() {
        return this.DBVersionStatus;
    }

    /**
     * @return dataLevel1BackupChainSize
     */
    public Long getDataLevel1BackupChainSize() {
        return this.dataLevel1BackupChainSize;
    }

    /**
     * @return dataSyncMode
     */
    public String getDataSyncMode() {
        return this.dataSyncMode;
    }

    /**
     * @return deletionLock
     */
    public Integer getDeletionLock() {
        return this.deletionLock;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expired
     */
    public String getExpired() {
        return this.expired;
    }

    /**
     * @return hasCompleteStandbyRes
     */
    public Boolean getHasCompleteStandbyRes() {
        return this.hasCompleteStandbyRes;
    }

    /**
     * @return hotStandbyCluster
     */
    public String getHotStandbyCluster() {
        return this.hotStandbyCluster;
    }

    /**
     * @return imciAutoIndex
     */
    public String getImciAutoIndex() {
        return this.imciAutoIndex;
    }

    /**
     * @return imperceptibleSwitch
     */
    public String getImperceptibleSwitch() {
        return this.imperceptibleSwitch;
    }

    /**
     * @return inodeTotal
     */
    public Long getInodeTotal() {
        return this.inodeTotal;
    }

    /**
     * @return inodeUsed
     */
    public Long getInodeUsed() {
        return this.inodeUsed;
    }

    /**
     * @return isLatestVersion
     */
    public Boolean getIsLatestVersion() {
        return this.isLatestVersion;
    }

    /**
     * @return isProxyLatestVersion
     */
    public Boolean getIsProxyLatestVersion() {
        return this.isProxyLatestVersion;
    }

    /**
     * @return lockMode
     */
    public String getLockMode() {
        return this.lockMode;
    }

    /**
     * @return maintainTime
     */
    public String getMaintainTime() {
        return this.maintainTime;
    }

    /**
     * @return orca
     */
    public String getOrca() {
        return this.orca;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return provisionedIops
     */
    public String getProvisionedIops() {
        return this.provisionedIops;
    }

    /**
     * @return proxyCpuCores
     */
    public String getProxyCpuCores() {
        return this.proxyCpuCores;
    }

    /**
     * @return proxyServerlessType
     */
    public String getProxyServerlessType() {
        return this.proxyServerlessType;
    }

    /**
     * @return proxyStandardCpuCores
     */
    public String getProxyStandardCpuCores() {
        return this.proxyStandardCpuCores;
    }

    /**
     * @return proxyStatus
     */
    public String getProxyStatus() {
        return this.proxyStatus;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return restoreDataPoint
     */
    public String getRestoreDataPoint() {
        return this.restoreDataPoint;
    }

    /**
     * @return restoreType
     */
    public String getRestoreType() {
        return this.restoreType;
    }

    /**
     * @return rowCompression
     */
    public String getRowCompression() {
        return this.rowCompression;
    }

    /**
     * @return SQLSize
     */
    public Long getSQLSize() {
        return this.SQLSize;
    }

    /**
     * @return serverlessType
     */
    public String getServerlessType() {
        return this.serverlessType;
    }

    /**
     * @return sourceDBCluster
     */
    public String getSourceDBCluster() {
        return this.sourceDBCluster;
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return standbyHAMode
     */
    public String getStandbyHAMode() {
        return this.standbyHAMode;
    }

    /**
     * @return storageMax
     */
    public Long getStorageMax() {
        return this.storageMax;
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
     * @return storageUsed
     */
    public Long getStorageUsed() {
        return this.storageUsed;
    }

    /**
     * @return strictConsistency
     */
    public String getStrictConsistency() {
        return this.strictConsistency;
    }

    /**
     * @return subCategory
     */
    public String getSubCategory() {
        return this.subCategory;
    }

    /**
     * @return supportInstantSwitchWithImci
     */
    public String getSupportInstantSwitchWithImci() {
        return this.supportInstantSwitchWithImci;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
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
     * @return zoneIds
     */
    public String getZoneIds() {
        return this.zoneIds;
    }

    public static final class Builder {
        private String aiCreatingTime; 
        private String aiType; 
        private String architecture; 
        private String autoUpgradeMinorVersion; 
        private Long blktagTotal; 
        private Long blktagUsed; 
        private String burstingEnabled; 
        private String category; 
        private String compressStorageMode; 
        private Long compressStorageUsed; 
        private String creationTime; 
        private String DBClusterClass; 
        private String DBClusterDescription; 
        private String DBClusterId; 
        private String DBClusterNetworkType; 
        private String DBClusterStatus; 
        private java.util.List<DBNodes> DBNodes; 
        private String DBType; 
        private String DBVersion; 
        private String DBVersionStatus; 
        private Long dataLevel1BackupChainSize; 
        private String dataSyncMode; 
        private Integer deletionLock; 
        private String engine; 
        private String expireTime; 
        private String expired; 
        private Boolean hasCompleteStandbyRes; 
        private String hotStandbyCluster; 
        private String imciAutoIndex; 
        private String imperceptibleSwitch; 
        private Long inodeTotal; 
        private Long inodeUsed; 
        private Boolean isLatestVersion; 
        private Boolean isProxyLatestVersion; 
        private String lockMode; 
        private String maintainTime; 
        private String orca; 
        private String payType; 
        private String provisionedIops; 
        private String proxyCpuCores; 
        private String proxyServerlessType; 
        private String proxyStandardCpuCores; 
        private String proxyStatus; 
        private String proxyType; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String restoreDataPoint; 
        private String restoreType; 
        private String rowCompression; 
        private Long SQLSize; 
        private String serverlessType; 
        private String sourceDBCluster; 
        private String sourceRegionId; 
        private String standbyHAMode; 
        private Long storageMax; 
        private String storagePayType; 
        private Long storageSpace; 
        private String storageType; 
        private Long storageUsed; 
        private String strictConsistency; 
        private String subCategory; 
        private String supportInstantSwitchWithImci; 
        private java.util.List<Tags> tags; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneIds; 

        private Builder() {
        } 

        private Builder(DescribeDbClusterAttributeZonalResponseBody model) {
            this.aiCreatingTime = model.aiCreatingTime;
            this.aiType = model.aiType;
            this.architecture = model.architecture;
            this.autoUpgradeMinorVersion = model.autoUpgradeMinorVersion;
            this.blktagTotal = model.blktagTotal;
            this.blktagUsed = model.blktagUsed;
            this.burstingEnabled = model.burstingEnabled;
            this.category = model.category;
            this.compressStorageMode = model.compressStorageMode;
            this.compressStorageUsed = model.compressStorageUsed;
            this.creationTime = model.creationTime;
            this.DBClusterClass = model.DBClusterClass;
            this.DBClusterDescription = model.DBClusterDescription;
            this.DBClusterId = model.DBClusterId;
            this.DBClusterNetworkType = model.DBClusterNetworkType;
            this.DBClusterStatus = model.DBClusterStatus;
            this.DBNodes = model.DBNodes;
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.DBVersionStatus = model.DBVersionStatus;
            this.dataLevel1BackupChainSize = model.dataLevel1BackupChainSize;
            this.dataSyncMode = model.dataSyncMode;
            this.deletionLock = model.deletionLock;
            this.engine = model.engine;
            this.expireTime = model.expireTime;
            this.expired = model.expired;
            this.hasCompleteStandbyRes = model.hasCompleteStandbyRes;
            this.hotStandbyCluster = model.hotStandbyCluster;
            this.imciAutoIndex = model.imciAutoIndex;
            this.imperceptibleSwitch = model.imperceptibleSwitch;
            this.inodeTotal = model.inodeTotal;
            this.inodeUsed = model.inodeUsed;
            this.isLatestVersion = model.isLatestVersion;
            this.isProxyLatestVersion = model.isProxyLatestVersion;
            this.lockMode = model.lockMode;
            this.maintainTime = model.maintainTime;
            this.orca = model.orca;
            this.payType = model.payType;
            this.provisionedIops = model.provisionedIops;
            this.proxyCpuCores = model.proxyCpuCores;
            this.proxyServerlessType = model.proxyServerlessType;
            this.proxyStandardCpuCores = model.proxyStandardCpuCores;
            this.proxyStatus = model.proxyStatus;
            this.proxyType = model.proxyType;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.restoreDataPoint = model.restoreDataPoint;
            this.restoreType = model.restoreType;
            this.rowCompression = model.rowCompression;
            this.SQLSize = model.SQLSize;
            this.serverlessType = model.serverlessType;
            this.sourceDBCluster = model.sourceDBCluster;
            this.sourceRegionId = model.sourceRegionId;
            this.standbyHAMode = model.standbyHAMode;
            this.storageMax = model.storageMax;
            this.storagePayType = model.storagePayType;
            this.storageSpace = model.storageSpace;
            this.storageType = model.storageType;
            this.storageUsed = model.storageUsed;
            this.strictConsistency = model.strictConsistency;
            this.subCategory = model.subCategory;
            this.supportInstantSwitchWithImci = model.supportInstantSwitchWithImci;
            this.tags = model.tags;
            this.VPCId = model.VPCId;
            this.vSwitchId = model.vSwitchId;
            this.zoneIds = model.zoneIds;
        } 

        /**
         * AiCreatingTime.
         */
        public Builder aiCreatingTime(String aiCreatingTime) {
            this.aiCreatingTime = aiCreatingTime;
            return this;
        }

        /**
         * AiType.
         */
        public Builder aiType(String aiType) {
            this.aiType = aiType;
            return this;
        }

        /**
         * Architecture.
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * AutoUpgradeMinorVersion.
         */
        public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * BlktagTotal.
         */
        public Builder blktagTotal(Long blktagTotal) {
            this.blktagTotal = blktagTotal;
            return this;
        }

        /**
         * BlktagUsed.
         */
        public Builder blktagUsed(Long blktagUsed) {
            this.blktagUsed = blktagUsed;
            return this;
        }

        /**
         * BurstingEnabled.
         */
        public Builder burstingEnabled(String burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * CompressStorageMode.
         */
        public Builder compressStorageMode(String compressStorageMode) {
            this.compressStorageMode = compressStorageMode;
            return this;
        }

        /**
         * CompressStorageUsed.
         */
        public Builder compressStorageUsed(Long compressStorageUsed) {
            this.compressStorageUsed = compressStorageUsed;
            return this;
        }

        /**
         * CreationTime.
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * DBClusterClass.
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * DBClusterDescription.
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * DBClusterNetworkType.
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * DBClusterStatus.
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * DBNodes.
         */
        public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * DBVersion.
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * DBVersionStatus.
         */
        public Builder DBVersionStatus(String DBVersionStatus) {
            this.DBVersionStatus = DBVersionStatus;
            return this;
        }

        /**
         * DataLevel1BackupChainSize.
         */
        public Builder dataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
            this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
            return this;
        }

        /**
         * DataSyncMode.
         */
        public Builder dataSyncMode(String dataSyncMode) {
            this.dataSyncMode = dataSyncMode;
            return this;
        }

        /**
         * DeletionLock.
         */
        public Builder deletionLock(Integer deletionLock) {
            this.deletionLock = deletionLock;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * ExpireTime.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * Expired.
         */
        public Builder expired(String expired) {
            this.expired = expired;
            return this;
        }

        /**
         * HasCompleteStandbyRes.
         */
        public Builder hasCompleteStandbyRes(Boolean hasCompleteStandbyRes) {
            this.hasCompleteStandbyRes = hasCompleteStandbyRes;
            return this;
        }

        /**
         * HotStandbyCluster.
         */
        public Builder hotStandbyCluster(String hotStandbyCluster) {
            this.hotStandbyCluster = hotStandbyCluster;
            return this;
        }

        /**
         * ImciAutoIndex.
         */
        public Builder imciAutoIndex(String imciAutoIndex) {
            this.imciAutoIndex = imciAutoIndex;
            return this;
        }

        /**
         * ImperceptibleSwitch.
         */
        public Builder imperceptibleSwitch(String imperceptibleSwitch) {
            this.imperceptibleSwitch = imperceptibleSwitch;
            return this;
        }

        /**
         * InodeTotal.
         */
        public Builder inodeTotal(Long inodeTotal) {
            this.inodeTotal = inodeTotal;
            return this;
        }

        /**
         * InodeUsed.
         */
        public Builder inodeUsed(Long inodeUsed) {
            this.inodeUsed = inodeUsed;
            return this;
        }

        /**
         * IsLatestVersion.
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * IsProxyLatestVersion.
         */
        public Builder isProxyLatestVersion(Boolean isProxyLatestVersion) {
            this.isProxyLatestVersion = isProxyLatestVersion;
            return this;
        }

        /**
         * LockMode.
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * MaintainTime.
         */
        public Builder maintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }

        /**
         * Orca.
         */
        public Builder orca(String orca) {
            this.orca = orca;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * ProvisionedIops.
         */
        public Builder provisionedIops(String provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * ProxyCpuCores.
         */
        public Builder proxyCpuCores(String proxyCpuCores) {
            this.proxyCpuCores = proxyCpuCores;
            return this;
        }

        /**
         * ProxyServerlessType.
         */
        public Builder proxyServerlessType(String proxyServerlessType) {
            this.proxyServerlessType = proxyServerlessType;
            return this;
        }

        /**
         * ProxyStandardCpuCores.
         */
        public Builder proxyStandardCpuCores(String proxyStandardCpuCores) {
            this.proxyStandardCpuCores = proxyStandardCpuCores;
            return this;
        }

        /**
         * ProxyStatus.
         */
        public Builder proxyStatus(String proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }

        /**
         * ProxyType.
         */
        public Builder proxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * RestoreDataPoint.
         */
        public Builder restoreDataPoint(String restoreDataPoint) {
            this.restoreDataPoint = restoreDataPoint;
            return this;
        }

        /**
         * RestoreType.
         */
        public Builder restoreType(String restoreType) {
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>RowCompression</p>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder rowCompression(String rowCompression) {
            this.rowCompression = rowCompression;
            return this;
        }

        /**
         * SQLSize.
         */
        public Builder SQLSize(Long SQLSize) {
            this.SQLSize = SQLSize;
            return this;
        }

        /**
         * ServerlessType.
         */
        public Builder serverlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }

        /**
         * SourceDBCluster.
         */
        public Builder sourceDBCluster(String sourceDBCluster) {
            this.sourceDBCluster = sourceDBCluster;
            return this;
        }

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * StandbyHAMode.
         */
        public Builder standbyHAMode(String standbyHAMode) {
            this.standbyHAMode = standbyHAMode;
            return this;
        }

        /**
         * StorageMax.
         */
        public Builder storageMax(Long storageMax) {
            this.storageMax = storageMax;
            return this;
        }

        /**
         * StoragePayType.
         */
        public Builder storagePayType(String storagePayType) {
            this.storagePayType = storagePayType;
            return this;
        }

        /**
         * StorageSpace.
         */
        public Builder storageSpace(Long storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * StorageUsed.
         */
        public Builder storageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }

        /**
         * StrictConsistency.
         */
        public Builder strictConsistency(String strictConsistency) {
            this.strictConsistency = strictConsistency;
            return this;
        }

        /**
         * SubCategory.
         */
        public Builder subCategory(String subCategory) {
            this.subCategory = subCategory;
            return this;
        }

        /**
         * SupportInstantSwitchWithImci.
         */
        public Builder supportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
            this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * VPCId.
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * VSwitchId.
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * ZoneIds.
         */
        public Builder zoneIds(String zoneIds) {
            this.zoneIds = zoneIds;
            return this;
        }

        public DescribeDbClusterAttributeZonalResponseBody build() {
            return new DescribeDbClusterAttributeZonalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDbClusterAttributeZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDbClusterAttributeZonalResponseBody</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddedCpuCores")
        private String addedCpuCores;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeDescription")
        private String DBNodeDescription;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("DBNodeRole")
        private String DBNodeRole;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @com.aliyun.core.annotation.NameInMap("FailoverPriority")
        private Integer failoverPriority;

        @com.aliyun.core.annotation.NameInMap("HotReplicaMode")
        private String hotReplicaMode;

        @com.aliyun.core.annotation.NameInMap("ImciSwitch")
        private String imciSwitch;

        @com.aliyun.core.annotation.NameInMap("MasterId")
        private String masterId;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("MemorySize")
        private String memorySize;

        @com.aliyun.core.annotation.NameInMap("MirrorInsName")
        private String mirrorInsName;

        @com.aliyun.core.annotation.NameInMap("MultiMasterLocalStandby")
        private String multiMasterLocalStandby;

        @com.aliyun.core.annotation.NameInMap("MultiMasterPrimaryNode")
        private String multiMasterPrimaryNode;

        @com.aliyun.core.annotation.NameInMap("Orca")
        private String orca;

        @com.aliyun.core.annotation.NameInMap("RemoteMemorySize")
        private String remoteMemorySize;

        @com.aliyun.core.annotation.NameInMap("SccMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sccMode;

        @com.aliyun.core.annotation.NameInMap("ServerWeight")
        private String serverWeight;

        @com.aliyun.core.annotation.NameInMap("ServerlessType")
        private String serverlessType;

        @com.aliyun.core.annotation.NameInMap("SubCluster")
        private String subCluster;

        @com.aliyun.core.annotation.NameInMap("SubGroupDescription")
        private String subGroupDescription;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBNodes(Builder builder) {
            this.addedCpuCores = builder.addedCpuCores;
            this.cpuCores = builder.cpuCores;
            this.creationTime = builder.creationTime;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeDescription = builder.DBNodeDescription;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeRole = builder.DBNodeRole;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.failoverPriority = builder.failoverPriority;
            this.hotReplicaMode = builder.hotReplicaMode;
            this.imciSwitch = builder.imciSwitch;
            this.masterId = builder.masterId;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
            this.memorySize = builder.memorySize;
            this.mirrorInsName = builder.mirrorInsName;
            this.multiMasterLocalStandby = builder.multiMasterLocalStandby;
            this.multiMasterPrimaryNode = builder.multiMasterPrimaryNode;
            this.orca = builder.orca;
            this.remoteMemorySize = builder.remoteMemorySize;
            this.sccMode = builder.sccMode;
            this.serverWeight = builder.serverWeight;
            this.serverlessType = builder.serverlessType;
            this.subCluster = builder.subCluster;
            this.subGroupDescription = builder.subGroupDescription;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodes create() {
            return builder().build();
        }

        /**
         * @return addedCpuCores
         */
        public String getAddedCpuCores() {
            return this.addedCpuCores;
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeDescription
         */
        public String getDBNodeDescription() {
            return this.DBNodeDescription;
        }

        /**
         * @return DBNodeId
         */
        public String getDBNodeId() {
            return this.DBNodeId;
        }

        /**
         * @return DBNodeRole
         */
        public String getDBNodeRole() {
            return this.DBNodeRole;
        }

        /**
         * @return DBNodeStatus
         */
        public String getDBNodeStatus() {
            return this.DBNodeStatus;
        }

        /**
         * @return failoverPriority
         */
        public Integer getFailoverPriority() {
            return this.failoverPriority;
        }

        /**
         * @return hotReplicaMode
         */
        public String getHotReplicaMode() {
            return this.hotReplicaMode;
        }

        /**
         * @return imciSwitch
         */
        public String getImciSwitch() {
            return this.imciSwitch;
        }

        /**
         * @return masterId
         */
        public String getMasterId() {
            return this.masterId;
        }

        /**
         * @return maxConnections
         */
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        /**
         * @return maxIOPS
         */
        public Integer getMaxIOPS() {
            return this.maxIOPS;
        }

        /**
         * @return memorySize
         */
        public String getMemorySize() {
            return this.memorySize;
        }

        /**
         * @return mirrorInsName
         */
        public String getMirrorInsName() {
            return this.mirrorInsName;
        }

        /**
         * @return multiMasterLocalStandby
         */
        public String getMultiMasterLocalStandby() {
            return this.multiMasterLocalStandby;
        }

        /**
         * @return multiMasterPrimaryNode
         */
        public String getMultiMasterPrimaryNode() {
            return this.multiMasterPrimaryNode;
        }

        /**
         * @return orca
         */
        public String getOrca() {
            return this.orca;
        }

        /**
         * @return remoteMemorySize
         */
        public String getRemoteMemorySize() {
            return this.remoteMemorySize;
        }

        /**
         * @return sccMode
         */
        public String getSccMode() {
            return this.sccMode;
        }

        /**
         * @return serverWeight
         */
        public String getServerWeight() {
            return this.serverWeight;
        }

        /**
         * @return serverlessType
         */
        public String getServerlessType() {
            return this.serverlessType;
        }

        /**
         * @return subCluster
         */
        public String getSubCluster() {
            return this.subCluster;
        }

        /**
         * @return subGroupDescription
         */
        public String getSubGroupDescription() {
            return this.subGroupDescription;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String addedCpuCores; 
            private String cpuCores; 
            private String creationTime; 
            private String DBNodeClass; 
            private String DBNodeDescription; 
            private String DBNodeId; 
            private String DBNodeRole; 
            private String DBNodeStatus; 
            private Integer failoverPriority; 
            private String hotReplicaMode; 
            private String imciSwitch; 
            private String masterId; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private String memorySize; 
            private String mirrorInsName; 
            private String multiMasterLocalStandby; 
            private String multiMasterPrimaryNode; 
            private String orca; 
            private String remoteMemorySize; 
            private String sccMode; 
            private String serverWeight; 
            private String serverlessType; 
            private String subCluster; 
            private String subGroupDescription; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DBNodes model) {
                this.addedCpuCores = model.addedCpuCores;
                this.cpuCores = model.cpuCores;
                this.creationTime = model.creationTime;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeDescription = model.DBNodeDescription;
                this.DBNodeId = model.DBNodeId;
                this.DBNodeRole = model.DBNodeRole;
                this.DBNodeStatus = model.DBNodeStatus;
                this.failoverPriority = model.failoverPriority;
                this.hotReplicaMode = model.hotReplicaMode;
                this.imciSwitch = model.imciSwitch;
                this.masterId = model.masterId;
                this.maxConnections = model.maxConnections;
                this.maxIOPS = model.maxIOPS;
                this.memorySize = model.memorySize;
                this.mirrorInsName = model.mirrorInsName;
                this.multiMasterLocalStandby = model.multiMasterLocalStandby;
                this.multiMasterPrimaryNode = model.multiMasterPrimaryNode;
                this.orca = model.orca;
                this.remoteMemorySize = model.remoteMemorySize;
                this.sccMode = model.sccMode;
                this.serverWeight = model.serverWeight;
                this.serverlessType = model.serverlessType;
                this.subCluster = model.subCluster;
                this.subGroupDescription = model.subGroupDescription;
                this.zoneId = model.zoneId;
            } 

            /**
             * AddedCpuCores.
             */
            public Builder addedCpuCores(String addedCpuCores) {
                this.addedCpuCores = addedCpuCores;
                return this;
            }

            /**
             * CpuCores.
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DBNodeClass.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * DBNodeDescription.
             */
            public Builder DBNodeDescription(String DBNodeDescription) {
                this.DBNodeDescription = DBNodeDescription;
                return this;
            }

            /**
             * DBNodeId.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * DBNodeRole.
             */
            public Builder DBNodeRole(String DBNodeRole) {
                this.DBNodeRole = DBNodeRole;
                return this;
            }

            /**
             * DBNodeStatus.
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * FailoverPriority.
             */
            public Builder failoverPriority(Integer failoverPriority) {
                this.failoverPriority = failoverPriority;
                return this;
            }

            /**
             * HotReplicaMode.
             */
            public Builder hotReplicaMode(String hotReplicaMode) {
                this.hotReplicaMode = hotReplicaMode;
                return this;
            }

            /**
             * ImciSwitch.
             */
            public Builder imciSwitch(String imciSwitch) {
                this.imciSwitch = imciSwitch;
                return this;
            }

            /**
             * MasterId.
             */
            public Builder masterId(String masterId) {
                this.masterId = masterId;
                return this;
            }

            /**
             * MaxConnections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * MaxIOPS.
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * MemorySize.
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * MirrorInsName.
             */
            public Builder mirrorInsName(String mirrorInsName) {
                this.mirrorInsName = mirrorInsName;
                return this;
            }

            /**
             * <p>MultiMasterLocalStandby</p>
             * 
             * <strong>example:</strong>
             * <p>MultiMasterLocalStandby</p>
             */
            public Builder multiMasterLocalStandby(String multiMasterLocalStandby) {
                this.multiMasterLocalStandby = multiMasterLocalStandby;
                return this;
            }

            /**
             * <p>MultiMasterPrimaryNode</p>
             * 
             * <strong>example:</strong>
             * <p>MultiMasterPrimaryNode</p>
             */
            public Builder multiMasterPrimaryNode(String multiMasterPrimaryNode) {
                this.multiMasterPrimaryNode = multiMasterPrimaryNode;
                return this;
            }

            /**
             * Orca.
             */
            public Builder orca(String orca) {
                this.orca = orca;
                return this;
            }

            /**
             * RemoteMemorySize.
             */
            public Builder remoteMemorySize(String remoteMemorySize) {
                this.remoteMemorySize = remoteMemorySize;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder sccMode(String sccMode) {
                this.sccMode = sccMode;
                return this;
            }

            /**
             * ServerWeight.
             */
            public Builder serverWeight(String serverWeight) {
                this.serverWeight = serverWeight;
                return this;
            }

            /**
             * ServerlessType.
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * SubCluster.
             */
            public Builder subCluster(String subCluster) {
                this.subCluster = subCluster;
                return this;
            }

            /**
             * <p>SubGroupDescription</p>
             * 
             * <strong>example:</strong>
             * <p>SubGroupDescription</p>
             */
            public Builder subGroupDescription(String subGroupDescription) {
                this.subGroupDescription = subGroupDescription;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBNodes build() {
                return new DBNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDbClusterAttributeZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDbClusterAttributeZonalResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
