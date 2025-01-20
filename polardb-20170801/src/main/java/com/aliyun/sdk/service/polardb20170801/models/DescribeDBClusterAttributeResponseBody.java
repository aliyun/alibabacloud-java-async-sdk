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

    private DescribeDBClusterAttributeResponseBody(Builder builder) {
        this.aiCreatingTime = builder.aiCreatingTime;
        this.aiType = builder.aiType;
        this.architecture = builder.architecture;
        this.blktagTotal = builder.blktagTotal;
        this.blktagUsed = builder.blktagUsed;
        this.burstingEnabled = builder.burstingEnabled;
        this.category = builder.category;
        this.compressStorageMode = builder.compressStorageMode;
        this.compressStorageUsed = builder.compressStorageUsed;
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

    public static DescribeDBClusterAttributeResponseBody create() {
        return builder().build();
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
        private Long blktagTotal; 
        private Long blktagUsed; 
        private String burstingEnabled; 
        private String category; 
        private String compressStorageMode; 
        private Long compressStorageUsed; 
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

        /**
         * <p>Start time for free AI activation</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-13T01:20:28Z</p>
         */
        public Builder aiCreatingTime(String aiCreatingTime) {
            this.aiCreatingTime = aiCreatingTime;
            return this;
        }

        /**
         * <p>Types of AI nodes. Values include:</p>
         * <ul>
         * <li><strong>SearchNode</strong>: Search node.</li>
         * <li><strong>DLNode</strong>: AI node.</li>
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
         * <p>CPU architecture. Available options are:</p>
         * <ul>
         * <li><strong>X86</strong></li>
         * <li><strong>ARM</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>X86</p>
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * <p>Maximum number of blktags in the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>7,864,320</p>
         */
        public Builder blktagTotal(Long blktagTotal) {
            this.blktagTotal = blktagTotal;
            return this;
        }

        /**
         * <p>Current blktag usage.</p>
         * 
         * <strong>example:</strong>
         * <p>5,242,880</p>
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
         * <p><a href="https://help.aliyun.com/document_detail/183258.html">Product Series</a>, with values as follows:</p>
         * <ul>
         * <li><strong>Normal</strong>: Cluster Edition</li>
         * <li><strong>Basic</strong>: Single Node</li>
         * <li><strong>Archive</strong>: High Compression Engine (X-Engine)</li>
         * <li><strong>NormalMultimaster</strong>: Multi-Master Cluster Edition</li>
         * <li><strong>SENormal</strong>: Standard Edition</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>PolarDB PostgreSQL version 11 does not support single-node.</li>
         * <li>PolarDB MySQL versions 8.0 and 5.7, and PolarDB PostgreSQL version 14 support the Standard Edition.</li>
         * <li>PolarDB MySQL version 8.0 supports High Compression Engine (X-Engine) and Multi-Master Cluster Edition.</li>
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
         * <p>Whether storage compression is enabled. Values are as follows:</p>
         * <ul>
         * <li>ON: Enabled</li>
         * <li>OFF: Disabled</li>
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
         * <p>Compressed storage data size.</p>
         * <blockquote>
         * <p>This parameter is supported only when the cluster&quot;s storage compression feature is enabled.</p>
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
         * <p>Cluster creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-14T05:58:42Z</p>
         */
        public Builder creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        /**
         * <p>Cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder DBClusterDescription(String DBClusterDescription) {
            this.DBClusterDescription = DBClusterDescription;
            return this;
        }

        /**
         * <p>Cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>Network type of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder DBClusterNetworkType(String DBClusterNetworkType) {
            this.DBClusterNetworkType = DBClusterNetworkType;
            return this;
        }

        /**
         * <p>Cluster status. For the full list of values, refer to <a href="https://help.aliyun.com/document_detail/99286.html">Cluster Status Table</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder DBClusterStatus(String DBClusterStatus) {
            this.DBClusterStatus = DBClusterStatus;
            return this;
        }

        /**
         * <p>The information about the nodes.</p>
         */
        public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
            this.DBNodes = DBNodes;
            return this;
        }

        /**
         * <p>Database engine type.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>Database engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The status of the minor version. Valid values:</p>
         * <ul>
         * <li><strong>Stable</strong>: The minor version is stable.</li>
         * <li><strong>Old</strong>: The minor version is outdated. We recommend that you update it to the latest version.</li>
         * <li><strong>HighRisk</strong>: The minor version has critical defects. We recommend that you immediately update it to the latest version.</li>
         * <li><strong>Beta</strong>: The minor version is a Beta version.</li>
         * </ul>
         * <blockquote>
         * <p> For information about how to update the minor version, see <a href="https://help.aliyun.com/document_detail/158572.html">Minor version update</a>.</p>
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
         * <p>Total size of Level 1 backups (snapshots), in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>74448896</p>
         */
        public Builder dataLevel1BackupChainSize(Long dataLevel1BackupChainSize) {
            this.dataLevel1BackupChainSize = dataLevel1BackupChainSize;
            return this;
        }

        /**
         * <p>Data replication relationship mode. Values are as follows:</p>
         * <ul>
         * <li><strong>AsyncSync</strong>: Asynchronous</li>
         * <li><strong>SemiSync</strong>: Semi-synchronous</li>
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
         * <p>Lock status for cluster deletion, with values as follows:</p>
         * <ul>
         * <li><strong>0</strong>: Unlocked, cluster can be deleted.</li>
         * <li><strong>1</strong>: Locked, cluster cannot be deleted.</li>
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
         * <p>Cluster engine.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>Cluster expiration time.</p>
         * <blockquote>
         * <p>Only clusters with <strong>Prepaid</strong> (subscription) payment methods return specific parameter values; <strong>Postpaid</strong> (pay-as-you-go) clusters return empty values.</p>
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
         * <p>Whether the cluster has expired.</p>
         * <blockquote>
         * <p>This parameter is only supported for clusters with <strong>Prepaid</strong> (Subscription) payment methods.</p>
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
         * <p>Whether to replenish resources for the new primary after cross-AZ switch. Values are as follows:</p>
         * <ul>
         * <li><strong>true</strong>: Yes</li>
         * <li><strong>false</strong>: No</li>
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
         * <p>Whether to enable storage hot backup cluster (and Standby compute nodes). Values are as follows:</p>
         * <ul>
         * <li><strong>StandbyClusterON</strong>: Enable storage hot backup/Enable storage hot backup and Standby compute nodes.</li>
         * <li><strong>StandbyClusterOFF</strong>: Disable storage hot backup/Disable storage hot backup and Standby compute nodes.</li>
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
         * <p>Indicates whether the automatic IMCI-based query acceleration feature is enabled. Valid values:</p>
         * <ul>
         * <li><code>ON</code>: enabled</li>
         * <li><code>OFF</code>: disabled</li>
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
         * ImperceptibleSwitch.
         */
        public Builder imperceptibleSwitch(String imperceptibleSwitch) {
            this.imperceptibleSwitch = imperceptibleSwitch;
            return this;
        }

        /**
         * <p>Maximum number of inodes in the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>6,291,456</p>
         */
        public Builder inodeTotal(Long inodeTotal) {
            this.inodeTotal = inodeTotal;
            return this;
        }

        /**
         * <p>Current inode usage.</p>
         * 
         * <strong>example:</strong>
         * <p>4,194,304</p>
         */
        public Builder inodeUsed(Long inodeUsed) {
            this.inodeUsed = inodeUsed;
            return this;
        }

        /**
         * <p>Indicates whether it is the latest kernel version. Values are as follows:</p>
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
         * <p>Indicates whether it is the latest version of the database proxy, with possible values as follows:</p>
         * <ul>
         * <li><strong>true</strong>: Yes</li>
         * <li><strong>false</strong>: No</li>
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
         * <p>Lock mode. Possible values are as follows:</p>
         * <ul>
         * <li><strong>Unlock</strong>: Unlocked.</li>
         * <li><strong>ManualLock</strong>: Manually triggered lock.</li>
         * <li><strong>LockByExpiration</strong>: Automatic cluster lock upon expiration.</li>
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
         * <p>The maintenance window for the cluster, formatted as <code>HH:mmZ-HH:mmZ</code> (UTC time). For example, <code>16:00Z-17:00Z</code> indicates that routine maintenance can be performed from 0:00 to 1:00 (UTC+08:00).</p>
         * 
         * <strong>example:</strong>
         * <p>18:00Z-19:00Z</p>
         */
        public Builder maintainTime(String maintainTime) {
            this.maintainTime = maintainTime;
            return this;
        }

        /**
         * <p>Orca function with possible values as follows:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enabled</p>
         * </li>
         * <li><p><strong>off</strong>: Disabled</p>
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
         * <p>Payment type. Possible values are:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: Pay-As-You-Go</li>
         * <li><strong>Prepaid</strong>: Prepaid (Subscription).</li>
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
         * <p>Describes the preconfigured read and write IOPS for ESSD AutoPL cloud disks. Possible values: 0 to min{50,000, 1000<em>capacity - baseline performance}.<br>Baseline performance = min{1,800 + 50</em>capacity, 50000}.<br>Note: This parameter is supported only when StorageType is ESSDAUTOPL.</p>
         * 
         * <strong>example:</strong>
         * <p>2500</p>
         */
        public Builder provisionedIops(String provisionedIops) {
            this.provisionedIops = provisionedIops;
            return this;
        }

        /**
         * <p>Number of CPU cores for the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder proxyCpuCores(String proxyCpuCores) {
            this.proxyCpuCores = proxyCpuCores;
            return this;
        }

        /**
         * <p>Serverless type for the database proxy. Currently, the value is fixed to AgileServerless.</p>
         * 
         * <strong>example:</strong>
         * <p>AgileServerless</p>
         */
        public Builder proxyServerlessType(String proxyServerlessType) {
            this.proxyServerlessType = proxyServerlessType;
            return this;
        }

        /**
         * <p>Standard configuration CPU cores for the database proxy.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder proxyStandardCpuCores(String proxyStandardCpuCores) {
            this.proxyStandardCpuCores = proxyStandardCpuCores;
            return this;
        }

        /**
         * <p>Status of the database proxy. Possible values include:</p>
         * <ul>
         * <li><strong>Creating</strong>: Creating</li>
         * <li><strong>Running</strong>: Running</li>
         * <li><strong>Deleting</strong>: Releasing</li>
         * <li><strong>Rebooting</strong>: Restarting</li>
         * <li><strong>DBNodeCreating</strong>: Adding nodes</li>
         * <li><strong>DBNodeDeleting</strong>: Deleting nodes</li>
         * <li><strong>ClassChanging</strong>: Changing node specifications</li>
         * <li><strong>NetAddressCreating</strong>: Creating network connections</li>
         * <li><strong>NetAddressDeleting</strong>: Deleting network connections</li>
         * <li><strong>NetAddressModifying</strong>: Modifying network connections</li>
         * <li><strong>Deleted</strong>: Released</li>
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
         * <p>Database proxy types, with the following values:</p>
         * <ul>
         * <li><strong>Exclusive</strong>: Enterprise Exclusive Edition</li>
         * <li><strong>General</strong>: Enterprise General Purpose Edition</li>
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
         * <p>Region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>074467EF-86B9-4C23-ACBF-E9B81A******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-***************</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>If RestoreType is <strong>RestoreByTime</strong> or <strong>RestoreByTimeOss</strong>, this value represents the recovery time point. If RestoreType is <strong>RestoreByBackupSet</strong> or <strong>RestoreByBackupSetOss</strong>, this value indicates the ID of the backup set on which the recovery is based.
         * <note>Only clusters restored from a backup set or time point after June 1, 2024, support this parameter.</note></p>
         * 
         * <strong>example:</strong>
         * <p>2179639137</p>
         */
        public Builder restoreDataPoint(String restoreDataPoint) {
            this.restoreDataPoint = restoreDataPoint;
            return this;
        }

        /**
         * <p>Cluster recovery method, with possible values:</p>
         * <ul>
         * <li><strong>RestoreByTime</strong>: Restore from a time point based on primary backup. * <strong>RestoreByBackupSet</strong>: Restore from a backup set based on primary backup. * <strong>RestoreByTimeOss</strong>: Restore from a time point based on secondary backup. * <strong>RestoreByBackupSetOss</strong>: Restore from a backup set based on secondary backup. * <strong>CloneFromSourceCluster</strong>: Clone from the source cluster.
         * <note>This parameter is only supported for clusters restored from a backup set or time point after June 1, 2024.</note></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RestoreByTime</p>
         */
        public Builder restoreType(String restoreType) {
            this.restoreType = restoreType;
            return this;
        }

        /**
         * RowCompression.
         */
        public Builder rowCompression(String rowCompression) {
            this.rowCompression = rowCompression;
            return this;
        }

        /**
         * <p>Storage amount of SQL, in bytes. If the value is -1, it indicates no data.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder SQLSize(Long SQLSize) {
            this.SQLSize = SQLSize;
            return this;
        }

        /**
         * <p>Serverless type. Valid values are as follows:</p>
         * <ul>
         * <li>AgileServerless: Agile - SteadyServerless: Stable</li>
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
         * <p>Source cluster ID. <note>Clusters restored from backup sets or specific points in time after June 1, 2024, support this parameter.</note></p>
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
         * <blockquote>
         * <p> This parameter is returned only if the source cluster ID exists.</p>
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
         * <p>Cross-AZ disaster recovery mode. Values are as follows:</p>
         * <ul>
         * <li><strong>ON</strong>: Enable cross-AZ disaster recovery mode.</li>
         * <li><strong>OFF</strong>: Disable cross-AZ disaster recovery mode.</li>
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
         * <p>The maximum storage capacity of the current cluster specification, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>10995116277760</p>
         */
        public Builder storageMax(Long storageMax) {
            this.storageMax = storageMax;
            return this;
        }

        /**
         * <p>Storage billing type. Valid values are as follows:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: Pay-as-you-go (by capacity).</li>
         * <li><strong>Prepaid</strong>: Subscription (by space).</li>
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
         * <p>Storage space for pay-by-space (subscription) billing. Unit: Byte.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder storageSpace(Long storageSpace) {
            this.storageSpace = storageSpace;
            return this;
        }

        /**
         * <p>Storage type, with a fixed value of <strong>HighPerformance</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>HighPerformance</p>
         */
        public Builder storageType(String storageType) {
            this.storageType = storageType;
            return this;
        }

        /**
         * <p>Amount of used storage space, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3012558848</p>
         */
        public Builder storageUsed(Long storageUsed) {
            this.storageUsed = storageUsed;
            return this;
        }

        /**
         * <p>Indicates whether multi-AZ data strong consistency is enabled for the cluster. The value ranges are as follows:</p>
         * <ul>
         * <li><strong>ON</strong>: Indicates that multi-AZ data strong consistency is enabled, applicable to the Standard 3AZ scenario.</li>
         * <li><strong>OFF</strong>: Indicates that multi-AZ data strong consistency is not enabled.</li>
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
         * <p>Specification type of compute nodes, with possible values as follows:</p>
         * <ul>
         * <li><strong>Exclusive</strong>: Dedicated specification</li>
         * <li><strong>General</strong>: General-purpose specification</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is supported only for PolarDB MySQL Edition with the product series set to Cluster Edition.</p>
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
         * <p>Indicates whether queries based on In-Memory Column Indexes (IMCIs) are supported during and after a failover with hot replica.</p>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder supportInstantSwitchWithImci(String supportInstantSwitchWithImci) {
            this.supportInstantSwitchWithImci = supportInstantSwitchWithImci;
            return this;
        }

        /**
         * <p>Details of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-*******************</p>
         */
        public Builder VPCId(String VPCId) {
            this.VPCId = VPCId;
            return this;
        }

        /**
         * <p>VSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-*********************</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }

        /**
         * <p>Availability Zone IDs.</p>
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
            private String zoneId; 

            /**
             * <p>Number of CPU cores for second-level elastic scaling.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder addedCpuCores(String addedCpuCores) {
                this.addedCpuCores = addedCpuCores;
                return this;
            }

            /**
             * <p>Number of CPU cores for the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>Node creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-23T21:35:43Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Node specification.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.large</p>
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
             * <p>Node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-****************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>Node role, with possible values as follows:</p>
             * <ul>
             * <li><strong>Writer</strong>: Primary node.</li>
             * <li><strong>Reader</strong>: Read-only node.</li>
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
             * <p>Node status, with possible values as follows:</p>
             * <ul>
             * <li><strong>Creating</strong>: Creating</li>
             * <li><strong>Running</strong>: Running</li>
             * <li><strong>Deleting</strong>: Deleting</li>
             * <li><strong>Rebooting</strong>: Rebooting</li>
             * <li><strong>DBNodeCreating</strong>: Adding node</li>
             * <li><strong>DBNodeDeleting</strong>: Removing node</li>
             * <li><strong>ClassChanging</strong>: Modifying node specification</li>
             * <li><strong>NetAddressCreating</strong>: Creating network connection</li>
             * <li><strong>NetAddressDeleting</strong>: Deleting network connection</li>
             * <li><strong>NetAddressModifying</strong>: Modifying network connection</li>
             * <li><strong>MinorVersionUpgrading</strong>: Upgrading minor version</li>
             * <li><strong>Maintaining</strong>: Instance maintenance</li>
             * <li><strong>Switching</strong>: Switching</li>
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
             * <p>Failover priority. Each node has a failover priority, determining the likelihood of being elected as the primary node during a failover. A higher value indicates a higher priority.
             * Range: 1 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failoverPriority(Integer failoverPriority) {
                this.failoverPriority = failoverPriority;
                return this;
            }

            /**
             * <p>Whether hot standby is enabled. Possible values are:</p>
             * <ul>
             * <li><strong>ON</strong>: Enabled</li>
             * <li><strong>OFF</strong>: Disabled</li>
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
             * <p>Whether columnar index is enabled. Possible values are:</p>
             * <ul>
             * <li><strong>ON</strong>: Enabled</li>
             * <li><strong>OFF</strong>: Disabled</li>
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
             * <p>Primary node ID of the multi-master architecture cluster edition.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp18z52akld3*****</p>
             */
            public Builder masterId(String masterId) {
                this.masterId = masterId;
                return this;
            }

            /**
             * <p>Maximum concurrent connections of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>Maximum number of I/O requests, that is, IOPS.</p>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * <p>Node memory size, in MB.</p>
             * 
             * <strong>example:</strong>
             * <p>8192</p>
             */
            public Builder memorySize(String memorySize) {
                this.memorySize = memorySize;
                return this;
            }

            /**
             * <p>The name of the hot standby compute node corresponding to the node when the hot standby storage and compute clusters feature is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-bp18z52mirror*****</p>
             */
            public Builder mirrorInsName(String mirrorInsName) {
                this.mirrorInsName = mirrorInsName;
                return this;
            }

            /**
             * MultiMasterLocalStandby.
             */
            public Builder multiMasterLocalStandby(String multiMasterLocalStandby) {
                this.multiMasterLocalStandby = multiMasterLocalStandby;
                return this;
            }

            /**
             * MultiMasterPrimaryNode.
             */
            public Builder multiMasterPrimaryNode(String multiMasterPrimaryNode) {
                this.multiMasterPrimaryNode = multiMasterPrimaryNode;
                return this;
            }

            /**
             * <p>Orca feature, valid values are:</p>
             * <ul>
             * <li>on: enabled</li>
             * <li>off: disabled</li>
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
             * <p>Remote memory size, in MB.</p>
             * 
             * <strong>example:</strong>
             * <p>3072</p>
             */
            public Builder remoteMemorySize(String remoteMemorySize) {
                this.remoteMemorySize = remoteMemorySize;
                return this;
            }

            /**
             * <p>Whether the node has the global consistency (high-performance mode) feature enabled. Possible values are:</p>
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
             * <p>Routing weight.
             * Range: 1~100. Default is 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serverWeight(String serverWeight) {
                this.serverWeight = serverWeight;
                return this;
            }

            /**
             * <p>Serverless type. Possible values include:</p>
             * <ul>
             * <li><strong>AgileServerless</strong>: Agile</li>
             * <li><strong>SteadyServerless</strong>: Steady</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is only supported by Serverless clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>AgileServerless</p>
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * <p>Identifies whether the node is in the primary or standby availability zone, primarily used in resource mirroring scenarios.
             * Values include:</p>
             * <ul>
             * <li><strong>Primary</strong>: Primary Availability Zone</li>
             * <li><strong>Standby</strong>: Standby Availability Zone</li>
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
             * <p>Availability zone ID.</p>
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

            /**
             * <p>Tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag value.</p>
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
