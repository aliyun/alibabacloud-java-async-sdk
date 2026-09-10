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
 * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAttributeResponseBody</p>
 */
public class DescribeDBClusterAttributeResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Branch")
    private Branch branch;

    @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
    private String burstingEnabled;

    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("ColumnTable")
    private String columnTable;

    @com.aliyun.core.annotation.NameInMap("CompressStorageMode")
    private String compressStorageMode;

    @com.aliyun.core.annotation.NameInMap("CompressStorageUsed")
    private Long compressStorageUsed;

    @com.aliyun.core.annotation.NameInMap("ConnectionResourceQuota")
    private Long connectionResourceQuota;

    @com.aliyun.core.annotation.NameInMap("ConnectionResourceUsed")
    private Long connectionResourceUsed;

    @com.aliyun.core.annotation.NameInMap("CreationTime")
    private String creationTime;

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

    @com.aliyun.core.annotation.NameInMap("SearchClusterStatus")
    private String searchClusterStatus;

    @com.aliyun.core.annotation.NameInMap("SearchCompressStorageUsed")
    private Long searchCompressStorageUsed;

    @com.aliyun.core.annotation.NameInMap("SearchStorageUsed")
    private Long searchStorageUsed;

    @com.aliyun.core.annotation.NameInMap("ServerlessType")
    private String serverlessType;

    @com.aliyun.core.annotation.NameInMap("SourceDBCluster")
    private String sourceDBCluster;

    @com.aliyun.core.annotation.NameInMap("SourceRegionId")
    private String sourceRegionId;

    @com.aliyun.core.annotation.NameInMap("StandbyHAMode")
    private String standbyHAMode;

    @com.aliyun.core.annotation.NameInMap("StorageAutoScale")
    private String storageAutoScale;

    @com.aliyun.core.annotation.NameInMap("StorageMax")
    private Long storageMax;

    @com.aliyun.core.annotation.NameInMap("StoragePayType")
    private String storagePayType;

    @com.aliyun.core.annotation.NameInMap("StorageSpace")
    private Long storageSpace;

    @com.aliyun.core.annotation.NameInMap("StorageType")
    private String storageType;

    @com.aliyun.core.annotation.NameInMap("StorageUpperBound")
    private Integer storageUpperBound;

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

    private DescribeDBClusterAttributeResponseBody(Builder builder) {
        this.aiCreatingTime = builder.aiCreatingTime;
        this.aiType = builder.aiType;
        this.architecture = builder.architecture;
        this.autoUpgradeMinorVersion = builder.autoUpgradeMinorVersion;
        this.blktagTotal = builder.blktagTotal;
        this.blktagUsed = builder.blktagUsed;
        this.branch = builder.branch;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.columnTable = builder.columnTable;
        this.compressStorageMode = builder.compressStorageMode;
        this.compressStorageUsed = builder.compressStorageUsed;
        this.connectionResourceQuota = builder.connectionResourceQuota;
        this.connectionResourceUsed = builder.connectionResourceUsed;
        this.creationTime = builder.creationTime;
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
        this.searchClusterStatus = builder.searchClusterStatus;
        this.searchCompressStorageUsed = builder.searchCompressStorageUsed;
        this.searchStorageUsed = builder.searchStorageUsed;
        this.serverlessType = builder.serverlessType;
        this.sourceDBCluster = builder.sourceDBCluster;
        this.sourceRegionId = builder.sourceRegionId;
        this.standbyHAMode = builder.standbyHAMode;
        this.storageAutoScale = builder.storageAutoScale;
        this.storageMax = builder.storageMax;
        this.storagePayType = builder.storagePayType;
        this.storageSpace = builder.storageSpace;
        this.storageType = builder.storageType;
        this.storageUpperBound = builder.storageUpperBound;
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

    public static DescribeDBClusterAttributeResponseBody create() {
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
     * @return branch
     */
    public Branch getBranch() {
        return this.branch;
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
     * @return columnTable
     */
    public String getColumnTable() {
        return this.columnTable;
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
     * @return connectionResourceQuota
     */
    public Long getConnectionResourceQuota() {
        return this.connectionResourceQuota;
    }

    /**
     * @return connectionResourceUsed
     */
    public Long getConnectionResourceUsed() {
        return this.connectionResourceUsed;
    }

    /**
     * @return creationTime
     */
    public String getCreationTime() {
        return this.creationTime;
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
     * @return searchClusterStatus
     */
    public String getSearchClusterStatus() {
        return this.searchClusterStatus;
    }

    /**
     * @return searchCompressStorageUsed
     */
    public Long getSearchCompressStorageUsed() {
        return this.searchCompressStorageUsed;
    }

    /**
     * @return searchStorageUsed
     */
    public Long getSearchStorageUsed() {
        return this.searchStorageUsed;
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
     * @return storageAutoScale
     */
    public String getStorageAutoScale() {
        return this.storageAutoScale;
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
     * @return storageUpperBound
     */
    public Integer getStorageUpperBound() {
        return this.storageUpperBound;
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
        private Branch branch; 
        private String burstingEnabled; 
        private String category; 
        private String columnTable; 
        private String compressStorageMode; 
        private Long compressStorageUsed; 
        private Long connectionResourceQuota; 
        private Long connectionResourceUsed; 
        private String creationTime; 
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
        private String searchClusterStatus; 
        private Long searchCompressStorageUsed; 
        private Long searchStorageUsed; 
        private String serverlessType; 
        private String sourceDBCluster; 
        private String sourceRegionId; 
        private String standbyHAMode; 
        private String storageAutoScale; 
        private Long storageMax; 
        private String storagePayType; 
        private Long storageSpace; 
        private String storageType; 
        private Integer storageUpperBound; 
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

        private Builder(DescribeDBClusterAttributeResponseBody model) {
            this.aiCreatingTime = model.aiCreatingTime;
            this.aiType = model.aiType;
            this.architecture = model.architecture;
            this.autoUpgradeMinorVersion = model.autoUpgradeMinorVersion;
            this.blktagTotal = model.blktagTotal;
            this.blktagUsed = model.blktagUsed;
            this.branch = model.branch;
            this.burstingEnabled = model.burstingEnabled;
            this.category = model.category;
            this.columnTable = model.columnTable;
            this.compressStorageMode = model.compressStorageMode;
            this.compressStorageUsed = model.compressStorageUsed;
            this.connectionResourceQuota = model.connectionResourceQuota;
            this.connectionResourceUsed = model.connectionResourceUsed;
            this.creationTime = model.creationTime;
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
            this.searchClusterStatus = model.searchClusterStatus;
            this.searchCompressStorageUsed = model.searchCompressStorageUsed;
            this.searchStorageUsed = model.searchStorageUsed;
            this.serverlessType = model.serverlessType;
            this.sourceDBCluster = model.sourceDBCluster;
            this.sourceRegionId = model.sourceRegionId;
            this.standbyHAMode = model.standbyHAMode;
            this.storageAutoScale = model.storageAutoScale;
            this.storageMax = model.storageMax;
            this.storagePayType = model.storagePayType;
            this.storageSpace = model.storageSpace;
            this.storageType = model.storageType;
            this.storageUpperBound = model.storageUpperBound;
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
         * <p>The start time of the free AI feature.</p>
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
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>The minor version update policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder autoUpgradeMinorVersion(String autoUpgradeMinorVersion) {
            this.autoUpgradeMinorVersion = autoUpgradeMinorVersion;
            return this;
        }

        /**
         * <p>The maximum number of blktags in the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>7,864,320</p>
         */
        public Builder blktagTotal(Long blktagTotal) {
            this.blktagTotal = blktagTotal;
            return this;
        }

        /**
         * <p>The current blktag usage.</p>
         * 
         * <strong>example:</strong>
         * <p>5,242,880</p>
         */
        public Builder blktagUsed(Long blktagUsed) {
            this.blktagUsed = blktagUsed;
            return this;
        }

        /**
         * Branch.
         */
        public Builder branch(Branch branch) {
            this.branch = branch;
            return this;
        }

        /**
         * <p>Indicates whether I/O performance burst is enabled for the ESSD AutoPL cloud disk. Valid values:</p>
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
         * <li><strong>Normal</strong>: Cluster Edition</li>
         * <li><strong>Basic</strong>: Single Node Edition</li>
         * <li><strong>Archive</strong>: PolarDB X-Engine Edition</li>
         * <li><strong>NormalMultimaster</strong>: Multi-master Cluster Edition</li>
         * <li><strong>SENormal</strong>: PolarDB for MySQL Standard Edition</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>PolarDB for PostgreSQL 11 does not support Single Node Edition.</li>
         * <li>PolarDB for MySQL 8.0, PolarDB for MySQL 5.7, and PolarDB for PostgreSQL 14 support PolarDB for MySQL Standard Edition.</li>
         * <li>PolarDB for MySQL 8.0 supports PolarDB X-Engine Edition and Multi-master Cluster Edition.</li>
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
         * <p>Indicates whether the column store table is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder columnTable(String columnTable) {
            this.columnTable = columnTable;
            return this;
        }

        /**
         * <p>Indicates whether storage compression is enabled. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder compressStorageMode(String compressStorageMode) {
            this.compressStorageMode = compressStorageMode;
            return this;
        }

        /**
         * <p>The size of the storage data after compression.</p>
         * 
         * <strong>example:</strong>
         * <p>15529410560</p>
         */
        public Builder compressStorageUsed(Long compressStorageUsed) {
            this.compressStorageUsed = compressStorageUsed;
            return this;
        }

        /**
         * <p>The connection resource quota (AgenticDB exclusive).</p>
         */
        public Builder connectionResourceQuota(Long connectionResourceQuota) {
            this.connectionResourceQuota = connectionResourceQuota;
            return this;
        }

        /**
         * <p>The number of connection resources used (AgenticDB exclusive).</p>
         */
        public Builder connectionResourceUsed(Long connectionResourceUsed) {
            this.connectionResourceUsed = connectionResourceUsed;
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
         * <p>pc-*****************</p>
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
         * <p>The cluster status. For more information, see <a href="https://help.aliyun.com/document_detail/99286.html">Cluster status table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * <p>The node information.</p>
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
         * <p>The status of the current minor version. Valid values:</p>
         * <ul>
         * <li><strong>Stable</strong>: The current version is stable.</li>
         * <li><strong>Old</strong>: The current version is outdated. Upgrade to the latest version.</li>
         * <li><strong>HighRisk</strong>: The current version has critical defects. Upgrade to the latest version immediately.</li>
         * <li><strong>Beta</strong>: The current version is a Beta version.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>For more information about how to upgrade the minor version, see <a href="https://help.aliyun.com/document_detail/158572.html">Version upgrade</a>.</li>
         * <li>This parameter is returned only when the database engine type (<strong>DBType</strong>) is <strong>MySQL</strong>.</li>
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
         * <p>The data replication mode. Valid values:</p>
         * <ul>
         * <li><strong>AsyncSync</strong>: asynchronous</li>
         * <li><strong>SemiSync</strong>: semi-synchronous</li>
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
         * <p>The lock status of cluster deletion. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Unlocked. The cluster can be deleted.</li>
         * <li><strong>1</strong>: Locked. The cluster cannot be deleted.</li>
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
         * <p>The cluster engine.</p>
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
         * <p>Only clusters whose billing method is <strong>Prepaid</strong> (subscription) return a specific value for this parameter. <strong>Postpaid</strong> (pay-as-you-go) clusters return an empty value.</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder expired(String expired) {
            this.expired = expired;
            return this;
        }

        /**
         * <p>Indicates whether resources for the new primary database are replenished after a cross-zone failover. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Resources are replenished.</li>
         * <li><strong>false</strong>: Resources are not replenished.</li>
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
         * <p>Indicates whether the hot standby storage cluster (and Standby compute nodes) is enabled. Valid values:</p>
         * <ul>
         * <li><strong>StandbyClusterON</strong>: The hot standby storage cluster and Standby compute nodes are enabled.</li>
         * <li><strong>StandbyClusterOFF</strong>: The hot standby storage cluster and Standby compute nodes are disabled.</li>
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
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder imciAutoIndex(String imciAutoIndex) {
            this.imciAutoIndex = imciAutoIndex;
            return this;
        }

        /**
         * <p>The failover with hot replica feature. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder imperceptibleSwitch(String imperceptibleSwitch) {
            this.imperceptibleSwitch = imperceptibleSwitch;
            return this;
        }

        /**
         * <p>The maximum number of inodes in the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>6,291,456</p>
         */
        public Builder inodeTotal(Long inodeTotal) {
            this.inodeTotal = inodeTotal;
            return this;
        }

        /**
         * <p>The current inode usage.</p>
         * 
         * <strong>example:</strong>
         * <p>4,194,304</p>
         */
        public Builder inodeUsed(Long inodeUsed) {
            this.inodeUsed = inodeUsed;
            return this;
        }

        /**
         * <p>Indicates whether the cluster is running the latest kernel version. Valid values:</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isLatestVersion(Boolean isLatestVersion) {
            this.isLatestVersion = isLatestVersion;
            return this;
        }

        /**
         * <p>Indicates whether the database proxy is the latest version. Valid values:</p>
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
         * 
         * <strong>example:</strong>
         * <p>Unlock</p>
         */
        public Builder lockMode(String lockMode) {
            this.lockMode = lockMode;
            return this;
        }

        /**
         * <p>The maintenance window of the cluster. The time is in the <code>HH:mmZ-HH:mmZ</code> format (UTC). For example, <code>16:00Z-17:00Z</code> indicates that routine maintenance can be performed from 00:00 to 01:00 (UTC+08:00).</p>
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
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p id="p_wyg_t4a_glm" props="china" icmsditafragmentmagic=1>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1000 × Capacity - Baseline performance}.</p>
         * 
         * <strong>example:</strong>
         * <p>2500</p>
         */
        public Builder provisionedIops(String provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>The number of CPU cores of the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder proxyCpuCores(String proxyCpuCores) {
            this.proxyCpuCores = proxyCpuCores;
            return this;
        }

        /**
         * <p>The serverless type of the database proxy. Valid values:</p>
         * <ul>
         * <li>AgileServerless: agile serverless, which indicates a serverless cluster.</li>
         * <li>SteadyServerless: steady serverless, which indicates a cluster with defined specifications (a subscription or pay-as-you-go cluster).</li>
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
         * <p>The number of CPU cores in the standard configuration of the database proxy.</p>
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
         * <p>rg-***************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <ul>
         * <li>If RestoreType is <strong>RestoreByTime</strong> or <strong>RestoreByTimeOss</strong>, this value indicates the point in time to which the cluster is restored.</li>
         * <li>If RestoreType is <strong>RestoreByBackupSet</strong> or <strong>RestoreByBackupSetOss</strong>, this value indicates the ID of the backup set from which the cluster is restored.</li>
         * </ul>
         * <p><note>This parameter is supported only for clusters that are restored from a backup set or to a point in time after June 1, 2024.</note></p>
         * 
         * <strong>example:</strong>
         * <p>2179639137</p>
         */
        public Builder restoreDataPoint(String restoreDataPoint) {
            this.restoreDataPoint = restoreDataPoint;
            return this;
        }

        /**
         * <p>The cluster restoration method. Valid values:</p>
         * <ul>
         * <li><strong>RestoreByTime</strong>: Restores from a point in time based on a level-1 backup.</li>
         * <li><strong>RestoreByBackupSet</strong>: Restores from a backup set based on a level-1 backup.</li>
         * <li><strong>RestoreByTimeOss</strong>: Restores from a point in time based on a level-2 backup.</li>
         * <li><strong>RestoreByBackupSetOss</strong>: Restores from a backup set based on a level-2 backup.</li>
         * <li><strong>CloneFromSourceCluster</strong>: Clones from the source cluster.</li>
         * </ul>
         * <p><note>This parameter is supported only for clusters that are restored from a backup set or a point in time after June 1, 2024.</note></p>
         * 
         * <strong>example:</strong>
         * <p>RestoreByTime</p>
         */
        public Builder restoreType(String restoreType) {
            this.restoreType = restoreType;
            return this;
        }

        /**
         * <p>The row compression setting.</p>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder rowCompression(String rowCompression) {
            this.rowCompression = rowCompression;
            return this;
        }

        /**
         * <p>The storage size of SQL statements. Unit: bytes. A value of -1 indicates that no data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder SQLSize(Long SQLSize) {
            this.SQLSize = SQLSize;
            return this;
        }

        /**
         * <p>The running status of the search node.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder searchClusterStatus(String searchClusterStatus) {
            this.searchClusterStatus = searchClusterStatus;
            return this;
        }

        /**
         * <p>The compressed storage data size of the search node.</p>
         * 
         * <strong>example:</strong>
         * <p>15529410560</p>
         */
        public Builder searchCompressStorageUsed(Long searchCompressStorageUsed) {
            this.searchCompressStorageUsed = searchCompressStorageUsed;
            return this;
        }

        /**
         * <p>The storage usage of the search node.</p>
         * 
         * <strong>example:</strong>
         * <p>3012558848</p>
         */
        public Builder searchStorageUsed(Long searchStorageUsed) {
            this.searchStorageUsed = searchStorageUsed;
            return this;
        }

        /**
         * <p>The serverless type of the cluster. Valid values:</p>
         * <ul>
         * <li>AgileServerless: agile serverless. This value indicates a serverless cluster.</li>
         * <li>SteadyServerless: steady serverless. This value indicates a cluster with defined specifications that has the serverless feature enabled.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for serverless clusters or clusters with defined specifications that have the serverless feature enabled.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SteadyServerless</p>
         */
        public Builder serverlessType(String serverlessType) {
            this.serverlessType = serverlessType;
            return this;
        }

        /**
         * <p>The ID of the source cluster.
         * <note>This parameter is supported only for clusters restored from a backup set or point in time after June 1, 2024.</note></p>
         * 
         * <strong>example:</strong>
         * <p>pc-pz51ziv48317b2880</p>
         */
        public Builder sourceDBCluster(String sourceDBCluster) {
            this.sourceDBCluster = sourceDBCluster;
            return this;
        }

        /**
         * <p>The region ID of the source cluster.</p>
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
         * <li><strong>ON</strong>: Cross-zone disaster recovery mode is enabled.</li>
         * <li><strong>OFF</strong>: Cross-zone disaster recovery mode is disabled.</li>
         * <li><strong>0</strong>: Customer drill mode.</li>
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
         * StorageAutoScale.
         */
        public Builder storageAutoScale(String storageAutoScale) {
            this.storageAutoScale = storageAutoScale;
            return this;
        }

        /**
         * <p>The maximum storage capacity for the current cluster specifications. Unit: bytes.</p>
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
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
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
         * <p>The storage space billed by space (subscription). Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder storageSpace(Long storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * <p>The storage type. The value is fixed as <strong>HighPerformance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * StorageUpperBound.
         */
        public Builder storageUpperBound(Integer storageUpperBound) {
            this.storageUpperBound = storageUpperBound;
            return this;
        }

        /**
         * <p>The storage usage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3012558848</p>
         */
        public Builder storageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }

        /**
         * <p>Indicates whether multi-zone strong data consistency is enabled for the cluster. Valid values:</p>
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
         * <li><strong>Exclusive</strong>: Dedicated</li>
         * <li><strong>General</strong>: General-purpose</li>
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
         * <p>Indicates whether the failover with hot replica feature that is compatible with IMCI is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder supportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
            this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
            return this;
        }

        /**
         * <p>The tag information.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
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

        public DescribeDBClusterAttributeResponseBody build() {
            return new DescribeDBClusterAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
    public static class ChildBranch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchLsn")
        private String branchLsn;

        @com.aliyun.core.annotation.NameInMap("BranchTime")
        private String branchTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("HasChild")
        private Boolean hasChild;

        @com.aliyun.core.annotation.NameInMap("InsName")
        private String insName;

        private ChildBranch(Builder builder) {
            this.branchLsn = builder.branchLsn;
            this.branchTime = builder.branchTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.hasChild = builder.hasChild;
            this.insName = builder.insName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChildBranch create() {
            return builder().build();
        }

        /**
         * @return branchLsn
         */
        public String getBranchLsn() {
            return this.branchLsn;
        }

        /**
         * @return branchTime
         */
        public String getBranchTime() {
            return this.branchTime;
        }

        /**
         * @return DBClusterDescription
         */
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        /**
         * @return hasChild
         */
        public Boolean getHasChild() {
            return this.hasChild;
        }

        /**
         * @return insName
         */
        public String getInsName() {
            return this.insName;
        }

        public static final class Builder {
            private String branchLsn; 
            private String branchTime; 
            private String DBClusterDescription; 
            private Boolean hasChild; 
            private String insName; 

            private Builder() {
            } 

            private Builder(ChildBranch model) {
                this.branchLsn = model.branchLsn;
                this.branchTime = model.branchTime;
                this.DBClusterDescription = model.DBClusterDescription;
                this.hasChild = model.hasChild;
                this.insName = model.insName;
            } 

            /**
             * BranchLsn.
             */
            public Builder branchLsn(String branchLsn) {
                this.branchLsn = branchLsn;
                return this;
            }

            /**
             * BranchTime.
             */
            public Builder branchTime(String branchTime) {
                this.branchTime = branchTime;
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
             * HasChild.
             */
            public Builder hasChild(Boolean hasChild) {
                this.hasChild = hasChild;
                return this;
            }

            /**
             * InsName.
             */
            public Builder insName(String insName) {
                this.insName = insName;
                return this;
            }

            public ChildBranch build() {
                return new ChildBranch(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
    public static class Branch extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BranchLsn")
        private String branchLsn;

        @com.aliyun.core.annotation.NameInMap("BranchTime")
        private String branchTime;

        @com.aliyun.core.annotation.NameInMap("ChildBranch")
        private java.util.List<ChildBranch> childBranch;

        @com.aliyun.core.annotation.NameInMap("ParentInsName")
        private String parentInsName;

        private Branch(Builder builder) {
            this.branchLsn = builder.branchLsn;
            this.branchTime = builder.branchTime;
            this.childBranch = builder.childBranch;
            this.parentInsName = builder.parentInsName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Branch create() {
            return builder().build();
        }

        /**
         * @return branchLsn
         */
        public String getBranchLsn() {
            return this.branchLsn;
        }

        /**
         * @return branchTime
         */
        public String getBranchTime() {
            return this.branchTime;
        }

        /**
         * @return childBranch
         */
        public java.util.List<ChildBranch> getChildBranch() {
            return this.childBranch;
        }

        /**
         * @return parentInsName
         */
        public String getParentInsName() {
            return this.parentInsName;
        }

        public static final class Builder {
            private String branchLsn; 
            private String branchTime; 
            private java.util.List<ChildBranch> childBranch; 
            private String parentInsName; 

            private Builder() {
            } 

            private Builder(Branch model) {
                this.branchLsn = model.branchLsn;
                this.branchTime = model.branchTime;
                this.childBranch = model.childBranch;
                this.parentInsName = model.parentInsName;
            } 

            /**
             * BranchLsn.
             */
            public Builder branchLsn(String branchLsn) {
                this.branchLsn = branchLsn;
                return this;
            }

            /**
             * BranchTime.
             */
            public Builder branchTime(String branchTime) {
                this.branchTime = branchTime;
                return this;
            }

            /**
             * ChildBranch.
             */
            public Builder childBranch(java.util.List<ChildBranch> childBranch) {
                this.childBranch = childBranch;
                return this;
            }

            /**
             * ParentInsName.
             */
            public Builder parentInsName(String parentInsName) {
                this.parentInsName = parentInsName;
                return this;
            }

            public Branch build() {
                return new Branch(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddedCpuCores")
        private String addedCpuCores;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBNodeCXLRemoteMemory")
        private String DBNodeCXLRemoteMemory;

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

        @com.aliyun.core.annotation.NameInMap("DedicatedHostModel")
        private Boolean dedicatedHostModel;

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

        @com.aliyun.core.annotation.NameInMap("RemoteMemoryMax")
        private Integer remoteMemoryMax;

        @com.aliyun.core.annotation.NameInMap("RemoteMemoryMin")
        private Integer remoteMemoryMin;

        @com.aliyun.core.annotation.NameInMap("RemoteMemoryRecommended")
        private Integer remoteMemoryRecommended;

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
            this.DBNodeCXLRemoteMemory = builder.DBNodeCXLRemoteMemory;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeDescription = builder.DBNodeDescription;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeRole = builder.DBNodeRole;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.dedicatedHostModel = builder.dedicatedHostModel;
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
            this.remoteMemoryMax = builder.remoteMemoryMax;
            this.remoteMemoryMin = builder.remoteMemoryMin;
            this.remoteMemoryRecommended = builder.remoteMemoryRecommended;
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
         * @return DBNodeCXLRemoteMemory
         */
        public String getDBNodeCXLRemoteMemory() {
            return this.DBNodeCXLRemoteMemory;
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
         * @return dedicatedHostModel
         */
        public Boolean getDedicatedHostModel() {
            return this.dedicatedHostModel;
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
         * @return remoteMemoryMax
         */
        public Integer getRemoteMemoryMax() {
            return this.remoteMemoryMax;
        }

        /**
         * @return remoteMemoryMin
         */
        public Integer getRemoteMemoryMin() {
            return this.remoteMemoryMin;
        }

        /**
         * @return remoteMemoryRecommended
         */
        public Integer getRemoteMemoryRecommended() {
            return this.remoteMemoryRecommended;
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
            private String DBNodeCXLRemoteMemory; 
            private String DBNodeClass; 
            private String DBNodeDescription; 
            private String DBNodeId; 
            private String DBNodeRole; 
            private String DBNodeStatus; 
            private Boolean dedicatedHostModel; 
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
            private Integer remoteMemoryMax; 
            private Integer remoteMemoryMin; 
            private Integer remoteMemoryRecommended; 
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
                this.DBNodeCXLRemoteMemory = model.DBNodeCXLRemoteMemory;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeDescription = model.DBNodeDescription;
                this.DBNodeId = model.DBNodeId;
                this.DBNodeRole = model.DBNodeRole;
                this.DBNodeStatus = model.DBNodeStatus;
                this.dedicatedHostModel = model.dedicatedHostModel;
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
                this.remoteMemoryMax = model.remoteMemoryMax;
                this.remoteMemoryMin = model.remoteMemoryMin;
                this.remoteMemoryRecommended = model.remoteMemoryRecommended;
                this.remoteMemorySize = model.remoteMemorySize;
                this.sccMode = model.sccMode;
                this.serverWeight = model.serverWeight;
                this.serverlessType = model.serverlessType;
                this.subCluster = model.subCluster;
                this.subGroupDescription = model.subGroupDescription;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The number of CPU cores added by automatically scaling local resources.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder addedCpuCores(String addedCpuCores) {
                this.addedCpuCores = addedCpuCores;
                return this;
            }

            /**
             * <p>The number of CPU cores of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The time when the node was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-23T21:35:43Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The CXL remote memory configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>3072</p>
             */
            public Builder DBNodeCXLRemoteMemory(String DBNodeCXLRemoteMemory) {
                this.DBNodeCXLRemoteMemory = DBNodeCXLRemoteMemory;
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
             * <p>The role of the node. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Reader</p>
             */
            public Builder DBNodeRole(String DBNodeRole) {
                this.DBNodeRole = DBNodeRole;
                return this;
            }

            /**
             * <p>The status of the node. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * DedicatedHostModel.
             */
            public Builder dedicatedHostModel(Boolean dedicatedHostModel) {
                this.dedicatedHostModel = dedicatedHostModel;
                return this;
            }

            /**
             * <p>The failover priority. Each node has a failover priority that determines the probability of the node being elected as the primary node during a failover. A larger value indicates a higher priority.
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
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder hotReplicaMode(String hotReplicaMode) {
                this.hotReplicaMode = hotReplicaMode;
                return this;
            }

            /**
             * <p>Indicates whether In-Memory Column Index is enabled. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder imciSwitch(String imciSwitch) {
                this.imciSwitch = imciSwitch;
                return this;
            }

            /**
             * <p>The primary node ID of the Multi-master Cluster Edition.</p>
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
             * <p>The maximum number of I/O requests per second (IOPS).</p>
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
             * <p>The name of the hot replica that corresponds to the node in the hot standby storage and compute architecture.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp18z52mirror*****</p>
             */
            public Builder mirrorInsName(String mirrorInsName) {
                this.mirrorInsName = mirrorInsName;
                return this;
            }

            /**
             * <p>The multi-master local standby node.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-****************</p>
             */
            public Builder multiMasterLocalStandby(String multiMasterLocalStandby) {
                this.multiMasterLocalStandby = multiMasterLocalStandby;
                return this;
            }

            /**
             * <p>The multi-master primary node.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-****************</p>
             */
            public Builder multiMasterPrimaryNode(String multiMasterPrimaryNode) {
                this.multiMasterPrimaryNode = multiMasterPrimaryNode;
                return this;
            }

            /**
             * <p>The Orca feature. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
             */
            public Builder orca(String orca) {
                this.orca = orca;
                return this;
            }

            /**
             * RemoteMemoryMax.
             */
            public Builder remoteMemoryMax(Integer remoteMemoryMax) {
                this.remoteMemoryMax = remoteMemoryMax;
                return this;
            }

            /**
             * RemoteMemoryMin.
             */
            public Builder remoteMemoryMin(Integer remoteMemoryMin) {
                this.remoteMemoryMin = remoteMemoryMin;
                return this;
            }

            /**
             * RemoteMemoryRecommended.
             */
            public Builder remoteMemoryRecommended(Integer remoteMemoryRecommended) {
                this.remoteMemoryRecommended = remoteMemoryRecommended;
                return this;
            }

            /**
             * <p>The remote memory size. Unit: MB.</p>
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
             * <p>The routing weight.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serverWeight(String serverWeight) {
                this.serverWeight = serverWeight;
                return this;
            }

            /**
             * <p>The serverless type of the node. Valid values:</p>
             * <ul>
             * <li>AgileServerless: agile serverless. The node is a serverless node.</li>
             * <li>SteadyServerless: steady serverless. The node is a node with defined specifications that has the serverless feature enabled.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>This parameter is supported only for serverless clusters or clusters with defined specifications that have the serverless feature enabled. For more information, see <a href="https://help.aliyun.com/document_detail/452274.html">Serverless</a>.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SteadyServerless</p>
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * <p>Indicates whether the node is in the primary zone or the secondary zone. This parameter is mainly used for resource-symmetric deployments.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Primary: primary zone.</li>
             * <li>Standby: secondary zone.</li>
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
             * <p>The cluster subgroup description.</p>
             * 
             * <strong>example:</strong>
             * <p>test Description</p>
             */
            public Builder subGroupDescription(String subGroupDescription) {
                this.subGroupDescription = subGroupDescription;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
     * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterAttributeResponseBody</p>
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
