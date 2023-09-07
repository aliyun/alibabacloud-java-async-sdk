// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClustersResponseBody</p>
 */
public class DescribeDBClustersResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBClustersResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClustersResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The details of the cluster.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of clusters returned per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBClustersResponseBody build() {
            return new DescribeDBClustersResponseBody(this);
        } 

    } 

    public static class DBNode extends TeaModel {
        @NameInMap("DBNodeClass")
        private String DBNodeClass;

        @NameInMap("DBNodeId")
        private String DBNodeId;

        @NameInMap("DBNodeRole")
        private String DBNodeRole;

        @NameInMap("HotReplicaMode")
        private String hotReplicaMode;

        @NameInMap("ImciSwitch")
        private String imciSwitch;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Serverless")
        private String serverless;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBNode(Builder builder) {
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeRole = builder.DBNodeRole;
            this.hotReplicaMode = builder.hotReplicaMode;
            this.imciSwitch = builder.imciSwitch;
            this.regionId = builder.regionId;
            this.serverless = builder.serverless;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNode create() {
            return builder().build();
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serverless
         */
        public String getServerless() {
            return this.serverless;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String DBNodeClass; 
            private String DBNodeId; 
            private String DBNodeRole; 
            private String hotReplicaMode; 
            private String imciSwitch; 
            private String regionId; 
            private String serverless; 
            private String zoneId; 

            /**
             * The specifications of the node.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * The ID of the node.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   **Writer**: The node is the primary node.
             * *   **Reader**: The node is a read-only node.
             */
            public Builder DBNodeRole(String DBNodeRole) {
                this.DBNodeRole = DBNodeRole;
                return this;
            }

            /**
             * Indicates whether the hot standby feature is enabled. Valid values:
             * <p>
             * 
             * *   **ON**
             * *   **OFF**
             */
            public Builder hotReplicaMode(String hotReplicaMode) {
                this.hotReplicaMode = hotReplicaMode;
                return this;
            }

            /**
             * Indicates whether the In-Memory Column Index (IMCI) feature is enabled. Valid values:
             * <p>
             * 
             * *   **ON**
             * *   **OFF**
             */
            public Builder imciSwitch(String imciSwitch) {
                this.imciSwitch = imciSwitch;
                return this;
            }

            /**
             * The ID of the region in which the node resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Indicates whether the serverless feature is enabled for the current node. **ON** indicates that the serverless feature is enabled. An empty value indicates that the serverless feature is disabled.
             */
            public Builder serverless(String serverless) {
                this.serverless = serverless;
                return this;
            }

            /**
             * The zone ID of the node.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBNode build() {
                return new DBNode(this);
            } 

        } 

    }
    public static class DBNodes extends TeaModel {
        @NameInMap("DBNode")
        private java.util.List < DBNode> DBNode;

        private DBNodes(Builder builder) {
            this.DBNode = builder.DBNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNodes create() {
            return builder().build();
        }

        /**
         * @return DBNode
         */
        public java.util.List < DBNode> getDBNode() {
            return this.DBNode;
        }

        public static final class Builder {
            private java.util.List < DBNode> DBNode; 

            /**
             * DBNode.
             */
            public Builder DBNode(java.util.List < DBNode> DBNode) {
                this.DBNode = DBNode;
                return this;
            }

            public DBNodes build() {
                return new DBNodes(this);
            } 

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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DBCluster extends TeaModel {
        @NameInMap("AiType")
        private String aiType;

        @NameInMap("Category")
        private String category;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("DBClusterNetworkType")
        private String DBClusterNetworkType;

        @NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @NameInMap("DBNodeClass")
        private String DBNodeClass;

        @NameInMap("DBNodeNumber")
        private Integer DBNodeNumber;

        @NameInMap("DBNodes")
        private DBNodes DBNodes;

        @NameInMap("DBType")
        private String DBType;

        @NameInMap("DBVersion")
        private String DBVersion;

        @NameInMap("DeletionLock")
        private Integer deletionLock;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Expired")
        private String expired;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ServerlessType")
        private String serverlessType;

        @NameInMap("StoragePayType")
        private String storagePayType;

        @NameInMap("StorageSpace")
        private Long storageSpace;

        @NameInMap("StorageUsed")
        private Long storageUsed;

        @NameInMap("StrictConsistency")
        private String strictConsistency;

        @NameInMap("Tags")
        private Tags tags;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
        private String vswitchId;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBCluster(Builder builder) {
            this.aiType = builder.aiType;
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterNetworkType = builder.DBClusterNetworkType;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeNumber = builder.DBNodeNumber;
            this.DBNodes = builder.DBNodes;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.deletionLock = builder.deletionLock;
            this.engine = builder.engine;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.lockMode = builder.lockMode;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serverlessType = builder.serverlessType;
            this.storagePayType = builder.storagePayType;
            this.storageSpace = builder.storageSpace;
            this.storageUsed = builder.storageUsed;
            this.strictConsistency = builder.strictConsistency;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBCluster create() {
            return builder().build();
        }

        /**
         * @return aiType
         */
        public String getAiType() {
            return this.aiType;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeNumber
         */
        public Integer getDBNodeNumber() {
            return this.DBNodeNumber;
        }

        /**
         * @return DBNodes
         */
        public DBNodes getDBNodes() {
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
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
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
         * @return serverlessType
         */
        public String getServerlessType() {
            return this.serverlessType;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String aiType; 
            private String category; 
            private String createTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterNetworkType; 
            private String DBClusterStatus; 
            private String DBNodeClass; 
            private Integer DBNodeNumber; 
            private DBNodes DBNodes; 
            private String DBType; 
            private String DBVersion; 
            private Integer deletionLock; 
            private String engine; 
            private String expireTime; 
            private String expired; 
            private String lockMode; 
            private String payType; 
            private String regionId; 
            private String resourceGroupId; 
            private String serverlessType; 
            private String storagePayType; 
            private Long storageSpace; 
            private Long storageUsed; 
            private String strictConsistency; 
            private Tags tags; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            /**
             * The type of the AI node. Valid values:
             * <p>
             * 
             * *   SearchNode: Search node
             * *   DLNode: ai node
             * 
             * Enumeration values:
             * 
             * *   SearchNode | DLNode
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     both
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   DLNode
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     DLNode
             * 
             *     <!-- -->
             * 
             *     .
             * 
             * *   DLNode
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     DLNode
             * 
             *     <!-- -->
             * 
             *     .
             */
            public Builder aiType(String aiType) {
                this.aiType = aiType;
                return this;
            }

            /**
             * The edition of the cluster. Valid values:
             * <p>
             * 
             * *   **Normal**: Cluster Edition
             * *   **Basic**: Single Node Edition
             * *   **Archive**: X-Engine Edition
             * *   **NormalMultimaster**: Multi-master Cluster (Database/Table)
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The time when the cluster was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the cluster.
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The network type of the cluster.
             */
            public Builder DBClusterNetworkType(String DBClusterNetworkType) {
                this.DBClusterNetworkType = DBClusterNetworkType;
                return this;
            }

            /**
             * The status of the cluster.
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * The specifications of the node.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * The number of nodes.
             */
            public Builder DBNodeNumber(Integer DBNodeNumber) {
                this.DBNodeNumber = DBNodeNumber;
                return this;
            }

            /**
             * The nodes of the cluster.
             */
            public Builder DBNodes(DBNodes DBNodes) {
                this.DBNodes = DBNodes;
                return this;
            }

            /**
             * The type of the database engine.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * The version of the database.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * Indicates whether the cluster is protected from deletion. Valid values:
             * <p>
             * 
             * *   **0**: The cluster is not locked.
             * *   **1**: The cluster is locked.
             * 
             * > If the cluster is locked, you cannot delete the cluster.
             */
            public Builder deletionLock(Integer deletionLock) {
                this.deletionLock = deletionLock;
                return this;
            }

            /**
             * The engine of the cluster.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The expiration time of the cluster.
             * <p>
             * 
             * > A specific value is returned only for subscription (**Prepaid**) clusters. For pay-as-you-go (**Postpaid**) clusters, an empty string is returned.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates whether the cluster has expired. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             * 
             * > A specific value is returned only for subscription (**Prepaid**) clusters.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The lock status of the cluster. Valid values:
             * <p>
             * 
             * *   **Unlock**: The cluster is not locked.
             * *   **ManualLock**: The cluster is manually locked.
             * *   **LockByExpiration**: The cluster is automatically locked due to cluster expiration.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * The billing method of the cluster. Valid values:
             * <p>
             * 
             * *   **Postpaid**: pay-as-you-go.
             * *   **Prepaid**: subscription.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The ID of the region in which the node resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * Indicates whether the cluster is a serverless cluster. **AgileServerless** indicates a serverless cluster. An empty value indicates a common cluster.
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * The billing method of the storage space. Valid values:
             * <p>
             * 
             * *   **Postpaid**: pay-as-you-go.
             * *   **Prepaid**: subscription.
             */
            public Builder storagePayType(String storagePayType) {
                this.storagePayType = storagePayType;
                return this;
            }

            /**
             * The storage space that is billed based on the subscription billing method. Unit: bytes.
             */
            public Builder storageSpace(Long storageSpace) {
                this.storageSpace = storageSpace;
                return this;
            }

            /**
             * The storage space this is occupied by the cluster. Unit: bytes.
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * Indicates whether multi-zone data consistency is enabled for the cluster. Valid values:
             * <p>
             * 
             * *   **ON**: multi-zone data consistency is enabled, which is suitable for Standard Edition clusters of Multi-zone Edition.
             * *   **OFF**: multi-zone data consistency is disabled.
             */
            public Builder strictConsistency(String strictConsistency) {
                this.strictConsistency = strictConsistency;
                return this;
            }

            /**
             * The tags of the cluster.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The VPC ID of the cluster.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The vSwitch ID of the cluster.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The zone ID of the cluster.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBCluster build() {
                return new DBCluster(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("DBCluster")
        private java.util.List < DBCluster> DBCluster;

        private Items(Builder builder) {
            this.DBCluster = builder.DBCluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return DBCluster
         */
        public java.util.List < DBCluster> getDBCluster() {
            return this.DBCluster;
        }

        public static final class Builder {
            private java.util.List < DBCluster> DBCluster; 

            /**
             * DBCluster.
             */
            public Builder DBCluster(java.util.List < DBCluster> DBCluster) {
                this.DBCluster = DBCluster;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
