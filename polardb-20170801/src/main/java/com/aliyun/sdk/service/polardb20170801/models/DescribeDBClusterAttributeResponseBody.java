// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterAttributeResponseBody</p>
 */
public class DescribeDBClusterAttributeResponseBody extends TeaModel {
    @NameInMap("Category")
    private String category;

    @NameInMap("CreationTime")
    private String creationTime;

    @NameInMap("DBClusterDescription")
    private String DBClusterDescription;

    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("DBClusterNetworkType")
    private String DBClusterNetworkType;

    @NameInMap("DBClusterStatus")
    private String DBClusterStatus;

    @NameInMap("DBNodes")
    private java.util.List < DBNodes> DBNodes;

    @NameInMap("DBType")
    private String DBType;

    @NameInMap("DBVersion")
    private String DBVersion;

    @NameInMap("DBVersionStatus")
    private String DBVersionStatus;

    @NameInMap("DataLevel1BackupChainSize")
    private Long dataLevel1BackupChainSize;

    @NameInMap("DeletionLock")
    private Integer deletionLock;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("Expired")
    private String expired;

    @NameInMap("IsLatestVersion")
    private Boolean isLatestVersion;

    @NameInMap("IsProxyLatestVersion")
    private Boolean isProxyLatestVersion;

    @NameInMap("LockMode")
    private String lockMode;

    @NameInMap("MaintainTime")
    private String maintainTime;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("ProxyCpuCores")
    private String proxyCpuCores;

    @NameInMap("ProxyStandardCpuCores")
    private String proxyStandardCpuCores;

    @NameInMap("ProxyStatus")
    private String proxyStatus;

    @NameInMap("ProxyType")
    private String proxyType;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("SQLSize")
    private Long SQLSize;

    @NameInMap("StorageMax")
    private Long storageMax;

    @NameInMap("StorageType")
    private String storageType;

    @NameInMap("StorageUsed")
    private Long storageUsed;

    @NameInMap("SubCategory")
    private String subCategory;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("VPCId")
    private String VPCId;

    @NameInMap("VSwitchId")
    private String vSwitchId;

    @NameInMap("ZoneIds")
    private String zoneIds;

    private DescribeDBClusterAttributeResponseBody(Builder builder) {
        this.category = builder.category;
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
        this.deletionLock = builder.deletionLock;
        this.engine = builder.engine;
        this.expireTime = builder.expireTime;
        this.expired = builder.expired;
        this.isLatestVersion = builder.isLatestVersion;
        this.isProxyLatestVersion = builder.isProxyLatestVersion;
        this.lockMode = builder.lockMode;
        this.maintainTime = builder.maintainTime;
        this.payType = builder.payType;
        this.proxyCpuCores = builder.proxyCpuCores;
        this.proxyStandardCpuCores = builder.proxyStandardCpuCores;
        this.proxyStatus = builder.proxyStatus;
        this.proxyType = builder.proxyType;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.SQLSize = builder.SQLSize;
        this.storageMax = builder.storageMax;
        this.storageType = builder.storageType;
        this.storageUsed = builder.storageUsed;
        this.subCategory = builder.subCategory;
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
     * @return category
     */
    public String getCategory() {
        return this.category;
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
    public java.util.List < DBNodes> getDBNodes() {
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return proxyCpuCores
     */
    public String getProxyCpuCores() {
        return this.proxyCpuCores;
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
     * @return SQLSize
     */
    public Long getSQLSize() {
        return this.SQLSize;
    }

    /**
     * @return storageMax
     */
    public Long getStorageMax() {
        return this.storageMax;
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
     * @return subCategory
     */
    public String getSubCategory() {
        return this.subCategory;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
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
        private String category; 
        private String creationTime; 
        private String DBClusterDescription; 
        private String DBClusterId; 
        private String DBClusterNetworkType; 
        private String DBClusterStatus; 
        private java.util.List < DBNodes> DBNodes; 
        private String DBType; 
        private String DBVersion; 
        private String DBVersionStatus; 
        private Long dataLevel1BackupChainSize; 
        private Integer deletionLock; 
        private String engine; 
        private String expireTime; 
        private String expired; 
        private Boolean isLatestVersion; 
        private Boolean isProxyLatestVersion; 
        private String lockMode; 
        private String maintainTime; 
        private String payType; 
        private String proxyCpuCores; 
        private String proxyStandardCpuCores; 
        private String proxyStatus; 
        private String proxyType; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private Long SQLSize; 
        private Long storageMax; 
        private String storageType; 
        private Long storageUsed; 
        private String subCategory; 
        private java.util.List < Tags> tags; 
        private String VPCId; 
        private String vSwitchId; 
        private String zoneIds; 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.category = category;
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
        public Builder DBNodes(java.util.List < DBNodes> DBNodes) {
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
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
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
         * SQLSize.
         */
        public Builder SQLSize(Long SQLSize) {
            this.SQLSize = SQLSize;
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
         * SubCategory.
         */
        public Builder subCategory(String subCategory) {
            this.subCategory = subCategory;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
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

        public DescribeDBClusterAttributeResponseBody build() {
            return new DescribeDBClusterAttributeResponseBody(this);
        } 

    } 

    public static class DBNodes extends TeaModel {
        @NameInMap("AddedCpuCores")
        private String addedCpuCores;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DBNodeClass")
        private String DBNodeClass;

        @NameInMap("DBNodeId")
        private String DBNodeId;

        @NameInMap("DBNodeRole")
        private String DBNodeRole;

        @NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @NameInMap("FailoverPriority")
        private Integer failoverPriority;

        @NameInMap("HotReplicaMode")
        private String hotReplicaMode;

        @NameInMap("ImciSwitch")
        private String imciSwitch;

        @NameInMap("MasterId")
        private String masterId;

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBNodes(Builder builder) {
            this.addedCpuCores = builder.addedCpuCores;
            this.creationTime = builder.creationTime;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeRole = builder.DBNodeRole;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.failoverPriority = builder.failoverPriority;
            this.hotReplicaMode = builder.hotReplicaMode;
            this.imciSwitch = builder.imciSwitch;
            this.masterId = builder.masterId;
            this.maxConnections = builder.maxConnections;
            this.maxIOPS = builder.maxIOPS;
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String addedCpuCores; 
            private String creationTime; 
            private String DBNodeClass; 
            private String DBNodeId; 
            private String DBNodeRole; 
            private String DBNodeStatus; 
            private Integer failoverPriority; 
            private String hotReplicaMode; 
            private String imciSwitch; 
            private String masterId; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private String zoneId; 

            /**
             * AddedCpuCores.
             */
            public Builder addedCpuCores(String addedCpuCores) {
                this.addedCpuCores = addedCpuCores;
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
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
