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
         * <p>The start time of the free trial for the AI feature</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-13T01:20:28Z</p>
         */
        public Builder aiCreatingTime(String aiCreatingTime) {
            this.aiCreatingTime = aiCreatingTime;
            return this;
        }

        /**
         * <p>The AI node type. Valid values:</p>
         * <ul>
         * <li><p><strong>SearchNode</strong>: Search node.</p>
         * </li>
         * <li><p><strong>DLNode</strong>: AI node.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DLNode</p>
         */
        public Builder aiType(String aiType) {
            this.aiType = aiType;
            return this;
        }

        /**
         * <p>The CPU architecture. Valid values:</p>
         * <ul>
         * <li><p><strong>X86</strong></p>
         * </li>
         * <li><p><strong>ARM</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86</p>
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>The upgrade method for the minor version</p>
         * <ul>
         * <li><p>Auto: Automatic upgrade</p>
         * </li>
         * <li><p>Manual: Manual upgrade</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Auto</p>
         */
        public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * <p>The maximum number of blktags for the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>7,864,320</p>
         */
        public Builder blktagTotal(Long blktagTotal) {
            this.blktagTotal = blktagTotal;
            return this;
        }

        /**
         * <p>The number of used blktags.</p>
         * 
         * <strong>example:</strong>
         * <p>5,242,880</p>
         */
        public Builder blktagUsed(Long blktagUsed) {
            this.blktagUsed = blktagUsed;
            return this;
        }

        /**
         * <p>Indicates whether the I/O performance burst feature is enabled for the ESSD AutoPL disk. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled</p>
         * </li>
         * <li><p><strong>false</strong>: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder burstingEnabled(String burstingEnabled) {
            this.burstingEnabled = burstingEnabled;
            return this;
        }

        /**
         * <p>The <a href="https://help.aliyun.com/document_detail/183258.html">product edition</a>. Valid values:</p>
         * <ul>
         * <li><p><strong>Normal</strong>: Cluster Edition</p>
         * </li>
         * <li><p><strong>Basic</strong>: Single Node</p>
         * </li>
         * <li><p><strong>Archive</strong>: X-Engine</p>
         * </li>
         * <li><p><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</p>
         * </li>
         * <li><p><strong>SENormal</strong>: Standard Edition</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>PolarDB for PostgreSQL clusters of PostgreSQL 11 do not support the single node edition.</p>
         * </li>
         * <li><p>PolarDB for MySQL clusters of 8.0 and 5.7, and PolarDB for PostgreSQL clusters of PostgreSQL 14 support the Standard Edition.</p>
         * </li>
         * <li><p>PolarDB for MySQL clusters of 8.0 support X-Engine and the Multi-master Cluster Edition.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>Indicates whether storage compression is enabled. Valid values:</p>
         * <ul>
         * <li><p>ON: Enabled</p>
         * </li>
         * <li><p>OFF: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder compressStorageMode(String compressStorageMode) {
            this.compressStorageMode = compressStorageMode;
            return this;
        }

        /**
         * <p>The size of the compressed data in storage.</p>
         * <blockquote>
         * <p>This parameter is returned only when storage compression is enabled for the cluster.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15529410560</p>
         */
        public Builder compressStorageUsed(Long compressStorageUsed) {
            this.compressStorageUsed = compressStorageUsed;
            return this;
        }

        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>The cluster specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polar.mysql.x8.medium.c</p>
         */
        public Builder DBClusterClass(String DBClusterClass) {
            this.DBClusterClass = DBClusterClass;
            return this;
        }

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The network type of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * <p>The cluster status. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The cluster is being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: The cluster is running.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The cluster is being released.</p>
         * </li>
         * <li><p><strong>Rebooting</strong>: The cluster is being restarted.</p>
         * </li>
         * <li><p><strong>DBNodeCreating</strong>: A node is being added.</p>
         * </li>
         * <li><p><strong>DBNodeDeleting</strong>: A node is being deleted.</p>
         * </li>
         * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
         * </li>
         * <li><p><strong>NetAddressCreating</strong>: A network connection is being created.</p>
         * </li>
         * <li><p><strong>NetAddressDeleting</strong>: A network connection is being deleted.</p>
         * </li>
         * <li><p><strong>NetAddressModifying</strong>: A network connection is being modified.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The cluster is released.</p>
         * </li>
         * <li><p><strong>ClassChanged</strong>: Resources are being reclaimed after an upgrade or downgrade.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * <p>The details of the node information.</p>
         */
        public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }

        /**
         * <p>The database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The status of the current minor version of the database. Valid values:</p>
         * <ul>
         * <li><p><strong>Stable</strong>: The current version is stable.</p>
         * </li>
         * <li><p><strong>Old</strong>: The current version is old. We recommend that you upgrade the cluster to the latest version.</p>
         * </li>
         * <li><p><strong>HighRisk</strong>: The current version has critical bugs. Upgrade the cluster to the latest version immediately.</p>
         * </li>
         * <li><p><strong>Beta</strong>: The current version is a beta version.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>For more information about how to upgrade the minor engine version, see <a href="https://help.aliyun.com/document_detail/158572.html">Upgrade versions</a>.</p>
         * </li>
         * <li><p>This parameter is returned only when the <strong>DBType</strong> parameter is set to <strong>MySQL</strong>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Stable</p>
         */
        public Builder DBVersionStatus(String DBVersionStatus) {
            this.DBVersionStatus = DBVersionStatus;
            return this;
        }

        /**
         * <p>The total size of level-1 backups (snapshots). Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>74448896</p>
         */
        public Builder dataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
            this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
            return this;
        }

        /**
         * <p>The data replication relationship mode. Valid values:</p>
         * <ul>
         * <li><p><strong>AsyncSync</strong>: Asynchronous</p>
         * </li>
         * <li><p><strong>SemiSync</strong>: Semi-synchronous</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AsyncSync</p>
         */
        public Builder dataSyncMode(String dataSyncMode) {
            this.dataSyncMode = dataSyncMode;
            return this;
        }

        /**
         * <p>The lock state of the cluster for deletion. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: The cluster is not locked and can be deleted.</p>
         * </li>
         * <li><p><strong>1</strong>: The cluster is locked and cannot be deleted.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder deletionLock(Integer deletionLock) {
            this.deletionLock = deletionLock;
            return this;
        }

        /**
         * <p>The database engine.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The expiration time of the cluster.</p>
         * <blockquote>
         * <p>This parameter is returned only for <strong>Prepaid</strong> (subscription) clusters. An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2020-11-14T16:00:00Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Indicates whether the cluster has expired.</p>
         * <blockquote>
         * <p>This parameter is returned only for subscription clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder expired(String expired) {
            this.expired = expired;
            return this;
        }

        /**
         * <p>Indicates whether resources of the new primary database are supplemented after a cross-zone failover. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes</p>
         * </li>
         * <li><p><strong>false</strong>: No</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasCompleteStandbyRes(Boolean hasCompleteStandbyRes) {
            this.hasCompleteStandbyRes = hasCompleteStandbyRes;
            return this;
        }

        /**
         * <p>Indicates whether the hot standby storage cluster (and standby compute nodes) feature is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>StandbyClusterON</strong>: The hot standby storage cluster feature or both the hot standby storage cluster and standby compute node features are enabled.</p>
         * </li>
         * <li><p><strong>StandbyClusterOFF</strong>: The hot standby storage cluster feature or both the hot standby storage cluster and standby compute node features are disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>StandbyClusterON</p>
         */
        public Builder hotStandbyCluster(String hotStandbyCluster) {
            this.hotStandbyCluster = hotStandbyCluster;
            return this;
        }

        /**
         * <p>The automatic IMCI-based query acceleration feature. Valid values:</p>
         * <ul>
         * <li><p><code>ON</code>: Enabled.</p>
         * </li>
         * <li><p><code>OFF</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder imciAutoIndex(String imciAutoIndex) {
            this.imciAutoIndex = imciAutoIndex;
            return this;
        }

        /**
         * <p>Failover with hot replica. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: Enabled.</p>
         * </li>
         * <li><p><code>false</code>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder imperceptibleSwitch(String imperceptibleSwitch) {
            this.imperceptibleSwitch = imperceptibleSwitch;
            return this;
        }

        /**
         * <p>The maximum number of inodes for the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>6,291,456</p>
         */
        public Builder inodeTotal(Long inodeTotal) {
            this.inodeTotal = inodeTotal;
            return this;
        }

        /**
         * <p>The number of used inodes.</p>
         * 
         * <strong>example:</strong>
         * <p>4,194,304</p>
         */
        public Builder inodeUsed(Long inodeUsed) {
            this.inodeUsed = inodeUsed;
            return this;
        }

        /**
         * <p>Indicates whether the cluster uses the latest kernel version. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes</p>
         * </li>
         * <li><p><strong>false</strong>: No</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * <p>Indicates whether the database proxy uses the latest version. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes</p>
         * </li>
         * <li><p><strong>false</strong>: No</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isProxyLatestVersion(Boolean isProxyLatestVersion) {
            this.isProxyLatestVersion = isProxyLatestVersion;
            return this;
        }

        /**
         * <p>The lock mode. Valid values:</p>
         * <ul>
         * <li><p><strong>Unlock</strong>: The cluster is not locked.</p>
         * </li>
         * <li><p><strong>ManualLock</strong>: The cluster is manually locked.</p>
         * </li>
         * <li><p><strong>LockByExpiration</strong>: The cluster is automatically locked upon expiration.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * <p>The maintenance window of the cluster. The time is in the <code>HH:mmZ-HH:mmZ</code> format and is displayed in UTC. For example, <code>16:00Z-17:00Z</code> indicates that routine maintenance can be performed from 00:00 to 01:00 (UTC+8).</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z-19:00Z</p>
         */
        public Builder maintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }

        /**
         * <p>The Orca feature. Valid values:</p>
         * <ul>
         * <li><p>on: Enabled</p>
         * </li>
         * <li><p>off: Disabled</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder orca(String orca) {
            this.orca = orca;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: Pay-as-you-go.</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: Subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>The read and write IOPS that are preconfigured for the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <p>Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>This parameter is supported only when StorageType is set to ESSDAUTOPL.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder provisionedIops(String provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The number of CPU cores for the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder proxyCpuCores(String proxyCpuCores) {
            this.proxyCpuCores = proxyCpuCores;
            return this;
        }

        /**
         * <p>The Serverless type of the database proxy. Valid values:</p>
         * <ul>
         * <li><p>AgileServerless: Agile. This indicates a Serverless cluster.</p>
         * </li>
         * <li><p>SteadyServerless: Steady. This indicates a cluster with defined specifications (a subscription or pay-as-you-go cluster).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SteadyServerless</p>
         */
        public Builder proxyServerlessType(String proxyServerlessType) {
            this.proxyServerlessType = proxyServerlessType;
            return this;
        }

        /**
         * <p>The number of CPU cores for the database proxy with standard specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder proxyStandardCpuCores(String proxyStandardCpuCores) {
            this.proxyStandardCpuCores = proxyStandardCpuCores;
            return this;
        }

        /**
         * <p>The status of the database proxy. Valid values:</p>
         * <ul>
         * <li><p><strong>Creating</strong>: The proxy is being created.</p>
         * </li>
         * <li><p><strong>Running</strong>: The proxy is running.</p>
         * </li>
         * <li><p><strong>Deleting</strong>: The proxy is being released.</p>
         * </li>
         * <li><p><strong>Rebooting</strong>: The proxy is being restarted.</p>
         * </li>
         * <li><p><strong>DBNodeCreating</strong>: A node is being added.</p>
         * </li>
         * <li><p><strong>DBNodeDeleting</strong>: A node is being deleted.</p>
         * </li>
         * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
         * </li>
         * <li><p><strong>NetAddressCreating</strong>: A network connection is being created.</p>
         * </li>
         * <li><p><strong>NetAddressDeleting</strong>: A network connection is being deleted.</p>
         * </li>
         * <li><p><strong>NetAddressModifying</strong>: A network connection is being modified.</p>
         * </li>
         * <li><p><strong>Deleted</strong>: The proxy is released.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder proxyStatus(String proxyStatus) {
            this.proxyStatus = proxyStatus;
            return this;
        }

        /**
         * <p>The type of the database proxy. Valid values:</p>
         * <ul>
         * <li><p><strong>Exclusive</strong>: Dedicated Enterprise Edition</p>
         * </li>
         * <li><p><strong>General</strong>: Standard Enterprise Edition</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Exclusive</p>
         */
        public Builder proxyType(String proxyType) {
            this.proxyType = proxyType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>074467EF-86B9-4C23-ACBF-E9B81A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <ul>
         * <li><p>If RestoreType is set to <strong>RestoreByTime</strong> or <strong>RestoreByTimeOss</strong>, this parameter indicates the point in time for the restoration.</p>
         * </li>
         * <li><p>If RestoreType is set to <strong>RestoreByBackupSet</strong> or <strong>RestoreByBackupSetOss</strong>, this parameter indicates the ID of the backup set that is used for the restoration.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for clusters that are restored from a backup set or a point in time after June 1, 2024.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2179639137</p>
         */
        public Builder restoreDataPoint(String restoreDataPoint) {
            this.restoreDataPoint = restoreDataPoint;
            return this;
        }

        /**
         * <p>The method used to restore the cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>RestoreByTime</strong>: The cluster is restored from a point in time based on a level-1 backup.</p>
         * </li>
         * <li><p><strong>RestoreByBackupSet</strong>: The cluster is restored from a backup set based on a level-1 backup.</p>
         * </li>
         * <li><p><strong>RestoreByTimeOss</strong>: The cluster is restored from a point in time based on a level-2 backup.</p>
         * </li>
         * <li><p><strong>RestoreByBackupSetOss</strong>: The cluster is restored from a backup set based on a level-2 backup.</p>
         * </li>
         * <li><p><strong>CloneFromSourceCluster</strong>: The cluster is cloned from a source cluster.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for clusters that are restored from a backup set or a point in time after June 1, 2024.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>RestoreByTime</p>
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
         * <p>The storage usage for SQL. Unit: bytes. A value of -1 indicates that no data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder SQLSize(Long SQLSize) {
            this.SQLSize = SQLSize;
            return this;
        }

        /**
         * <p>The Serverless type. Valid values:</p>
         * <ul>
         * <li><p>AgileServerless: Agile</p>
         * </li>
         * <li><p>SteadyServerless: Steady</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        public Builder serverlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }

        /**
         * <p>The source cluster ID.</p>
         * <blockquote>
         * <p>This parameter is supported only for clusters that are restored from a backup set or a point in time after June 1, 2024.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>pc-pz51ziv48317b2880</p>
         */
        public Builder sourceDBCluster(String sourceDBCluster) {
            this.sourceDBCluster = sourceDBCluster;
            return this;
        }

        /**
         * <p>The ID of the region where the source cluster resides.</p>
         * <blockquote>
         * <p>This parameter is returned only if a source cluster ID exists.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * <p>The cross-zone disaster recovery mode. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: The cross-zone disaster recovery mode is enabled.</p>
         * </li>
         * <li><p><strong>OFF</strong>: The cross-zone disaster recovery mode is disabled.</p>
         * </li>
         * <li><p><strong>0</strong>: Customer drill mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder standbyHAMode(String standbyHAMode) {
            this.standbyHAMode = standbyHAMode;
            return this;
        }

        /**
         * <p>The maximum storage capacity of the current cluster specifications. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10995116277760</p>
         */
        public Builder storageMax(Long storageMax) {
            this.storageMax = storageMax;
            return this;
        }

        /**
         * <p>The billing method for storage. Valid values:</p>
         * <ul>
         * <li><p><strong>Postpaid</strong>: Pay-as-you-go.</p>
         * </li>
         * <li><p><strong>Prepaid</strong>: Subscription.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder storagePayType(String storagePayType) {
            this.storagePayType = storagePayType;
            return this;
        }

        /**
         * <p>The storage capacity. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder storageSpace(Long storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * <p>The storage class of the Enterprise Edition. Valid values:</p>
         * <ul>
         * <li><p><strong>PSL5</strong></p>
         * </li>
         * <li><p><strong>PSL4</strong></p>
         * </li>
         * </ul>
         * <p>The storage class of the Standard Edition. Valid values:</p>
         * <ul>
         * <li><p><strong>ESSDPL0</strong></p>
         * </li>
         * <li><p><strong>ESSDPL1</strong></p>
         * </li>
         * <li><p><strong>ESSDPL2</strong></p>
         * </li>
         * <li><p><strong>ESSDPL3</strong></p>
         * </li>
         * <li><p><strong>ESSDAUTOPL</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ESSDPL0</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>The used storage space. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3012558848</p>
         */
        public Builder storageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }

        /**
         * <p>Indicates whether strong consistency is enabled for the multi-zone cluster. Valid values:</p>
         * <ul>
         * <li><p><strong>ON</strong>: Strong consistency is enabled for the multi-zone cluster. This applies to Standard Edition clusters that are deployed in three zones.</p>
         * </li>
         * <li><p><strong>OFF</strong>: Strong consistency is not enabled for the multi-zone cluster.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder strictConsistency(String strictConsistency) {
            this.strictConsistency = strictConsistency;
            return this;
        }

        /**
         * <p>The specification type of the compute node. Valid values:</p>
         * <ul>
         * <li><p><strong>Exclusive</strong>: Dedicated</p>
         * </li>
         * <li><p><strong>General</strong>: General-purpose</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is returned only for PolarDB for MySQL Cluster Edition clusters.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Exclusive</p>
         */
        public Builder subCategory(String subCategory) {
            this.subCategory = subCategory;
            return this;
        }

        /**
         * <p>Indicates whether the failover with hot replica feature that is compatible with the IMCI feature is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder supportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
            this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
            return this;
        }

        /**
         * <p>The details of the tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-**********</p>
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The virtual switch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-**********</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i,cn-hangzhou-g</p>
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
             * <p>The number of CPU cores for bursting.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder addedCpuCores(String addedCpuCores) {
                this.addedCpuCores = addedCpuCores;
                return this;
            }

            /**
             * <p>The number of CPU cores in the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-14T05:58:42Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.large</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * <p>The node description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBNodeDescription(String DBNodeDescription) {
                this.DBNodeDescription = DBNodeDescription;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-****************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The node role. Valid values:</p>
             * <ul>
             * <li><p><strong>Writer</strong>: The primary node.</p>
             * </li>
             * <li><p><strong>Reader</strong>: The read-only node.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Reader</p>
             */
            public Builder DBNodeRole(String DBNodeRole) {
                this.DBNodeRole = DBNodeRole;
                return this;
            }

            /**
             * <p>The node status. Valid values:</p>
             * <ul>
             * <li><p><strong>Creating</strong>: The node is being created.</p>
             * </li>
             * <li><p><strong>Running</strong>: The node is running.</p>
             * </li>
             * <li><p><strong>Deleting</strong>: The node is being deleted.</p>
             * </li>
             * <li><p><strong>Rebooting</strong>: The node is being restarted.</p>
             * </li>
             * <li><p><strong>DBNodeCreating</strong>: A node is being added.</p>
             * </li>
             * <li><p><strong>DBNodeDeleting</strong>: A node is being deleted.</p>
             * </li>
             * <li><p><strong>ClassChanging</strong>: The node specifications are being changed.</p>
             * </li>
             * <li><p><strong>NetAddressCreating</strong>: A network connection is being created.</p>
             * </li>
             * <li><p><strong>NetAddressDeleting</strong>: A network connection is being deleted.</p>
             * </li>
             * <li><p><strong>NetAddressModifying</strong>: A network connection is being modified.</p>
             * </li>
             * <li><p><strong>MinorVersionUpgrading</strong>: The minor version is being updated.</p>
             * </li>
             * <li><p><strong>Maintaining</strong>: The instance is under maintenance.</p>
             * </li>
             * <li><p><strong>Switching</strong>: A failover is in progress.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * <p>The failover priority. Each node has a failover priority. A higher priority value indicates a higher probability that the node is elected as the primary node during a failover.
             * Valid values: 1 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failoverPriority(Integer failoverPriority) {
                this.failoverPriority = failoverPriority;
                return this;
            }

            /**
             * <p>Indicates whether hot standby is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>ON</strong>: Enabled</p>
             * </li>
             * <li><p><strong>OFF</strong>: Disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder hotReplicaMode(String hotReplicaMode) {
                this.hotReplicaMode = hotReplicaMode;
                return this;
            }

            /**
             * <p>Indicates whether the In-Memory Column Index (IMCI) feature is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>ON</strong>: Enabled</p>
             * </li>
             * <li><p><strong>OFF</strong>: Disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder imciSwitch(String imciSwitch) {
                this.imciSwitch = imciSwitch;
                return this;
            }

            /**
             * <p>The ID of the primary node in a Multi-master Cluster Edition cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp18z52akld3*****</p>
             */
            public Builder masterId(String masterId) {
                this.masterId = masterId;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections to the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum number of input/output operations per second (IOPS).</p>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>The memory size of the node. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The name of the hot replica compute node that corresponds to the node in an architecture where hot standby storage and hot standby compute are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp18z52mirror*****</p>
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
             * <p>The Orca feature. Valid values:</p>
             * <ul>
             * <li><p>on: Enabled</p>
             * </li>
             * <li><p>off: Disabled</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder orca(String orca) {
                this.orca = orca;
                return this;
            }

            /**
             * <p>The size of the remote memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>3072</p>
             */
            public Builder remoteMemorySize(String remoteMemorySize) {
                this.remoteMemorySize = remoteMemorySize;
                return this;
            }

            /**
             * <p>Indicates whether the global consistency (high-performance mode) feature is enabled for the node. Valid values:</p>
             * <ul>
             * <li><p><strong>ON</strong>: Enabled</p>
             * </li>
             * <li><p><strong>OFF</strong>: Disabled</p>
             * </li>
             * </ul>
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
             * <p>The routing weight.
             * Valid values: 1 to 100. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serverWeight(String serverWeight) {
                this.serverWeight = serverWeight;
                return this;
            }

            /**
             * <p>The Serverless type. Valid values:</p>
             * <ul>
             * <li><p>AgileServerless: Agile</p>
             * </li>
             * <li><p>SteadyServerless: Steady</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AgileServerless</p>
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * <p>Indicates whether the node is in the primary or secondary zone. This parameter is mainly used for resource peering.
             * Valid values:</p>
             * <ul>
             * <li><p>Primary: The primary zone</p>
             * </li>
             * <li><p>Standby: The secondary zone</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
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
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-d</p>
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
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
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
