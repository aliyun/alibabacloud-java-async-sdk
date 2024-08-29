// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDatabaseNetworkResponseBody</p>
 */
public class DescribeGlobalDatabaseNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connections")
    private java.util.List < Connections> connections;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBClusters")
    private java.util.List < DBClusters> DBClusters;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("DBVersion")
    private String DBVersion;

    @com.aliyun.core.annotation.NameInMap("GDNDescription")
    private String GDNDescription;

    @com.aliyun.core.annotation.NameInMap("GDNId")
    private String GDNId;

    @com.aliyun.core.annotation.NameInMap("GDNStatus")
    private String GDNStatus;

    @com.aliyun.core.annotation.NameInMap("GlobalDomainName")
    private String globalDomainName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeGlobalDatabaseNetworkResponseBody(Builder builder) {
        this.connections = builder.connections;
        this.createTime = builder.createTime;
        this.DBClusterId = builder.DBClusterId;
        this.DBClusters = builder.DBClusters;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.GDNDescription = builder.GDNDescription;
        this.GDNId = builder.GDNId;
        this.GDNStatus = builder.GDNStatus;
        this.globalDomainName = builder.globalDomainName;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDatabaseNetworkResponseBody create() {
        return builder().build();
    }

    /**
     * @return connections
     */
    public java.util.List < Connections> getConnections() {
        return this.connections;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return DBClusters
     */
    public java.util.List < DBClusters> getDBClusters() {
        return this.DBClusters;
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
     * @return GDNDescription
     */
    public String getGDNDescription() {
        return this.GDNDescription;
    }

    /**
     * @return GDNId
     */
    public String getGDNId() {
        return this.GDNId;
    }

    /**
     * @return GDNStatus
     */
    public String getGDNStatus() {
        return this.GDNStatus;
    }

    /**
     * @return globalDomainName
     */
    public String getGlobalDomainName() {
        return this.globalDomainName;
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

    public static final class Builder {
        private java.util.List < Connections> connections; 
        private String createTime; 
        private String DBClusterId; 
        private java.util.List < DBClusters> DBClusters; 
        private String DBType; 
        private String DBVersion; 
        private String GDNDescription; 
        private String GDNId; 
        private String GDNStatus; 
        private String globalDomainName; 
        private String requestId; 
        private String resourceGroupId; 

        /**
         * The information about the connection to the cluster.
         */
        public Builder connections(java.util.List < Connections> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * The time at which the GDN was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
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
         * The clusters in the GDN.
         */
        public Builder DBClusters(java.util.List < DBClusters> DBClusters) {
            this.DBClusters = DBClusters;
            return this;
        }

        /**
         * The type of the database engine. Only MySQL is supported.
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * The version of the database engine. Only version 8.0 is supported.
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * The description of the GDN. The description must meet the following requirements:
         * <p>
         * 
         * *   It cannot start with `http://` or `https://`.
         * *   It must start with a letter.
         * *   It can contain letters, digits, underscores (\_), and hyphens (-).
         * *   It must be 2 to 126 characters in length.
         */
        public Builder GDNDescription(String GDNDescription) {
            this.GDNDescription = GDNDescription;
            return this;
        }

        /**
         * The ID of the GDN.
         */
        public Builder GDNId(String GDNId) {
            this.GDNId = GDNId;
            return this;
        }

        /**
         * The status of the GDN. Valid values:
         * <p>
         * 
         * *   **Creating**: The GDN is being created.
         * *   **active**: The GDN is running.
         * *   **deleting**: The GDN is being deleted.
         * *   **locked**: The GDN is locked. If the GDN is locked, you cannot perform operations on clusters in the GDN.
         * *   **removing_member**: The secondary cluster is being removed from the GDN.
         */
        public Builder GDNStatus(String GDNStatus) {
            this.GDNStatus = GDNStatus;
            return this;
        }

        /**
         * GlobalDomainName.
         */
        public Builder globalDomainName(String globalDomainName) {
            this.globalDomainName = globalDomainName;
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
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        public DescribeGlobalDatabaseNetworkResponseBody build() {
            return new DescribeGlobalDatabaseNetworkResponseBody(this);
        } 

    } 

    public static class Connections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        private Connections(Builder builder) {
            this.connectionString = builder.connectionString;
            this.netType = builder.netType;
            this.port = builder.port;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Connections create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        public static final class Builder {
            private String connectionString; 
            private String netType; 
            private String port; 

            /**
             * The endpoint URL of the database service.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The network type for the database connection.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The port number for the database connection.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("DBNodeRole")
        private String DBNodeRole;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @com.aliyun.core.annotation.NameInMap("FailoverPriority")
        private Integer failoverPriority;

        @com.aliyun.core.annotation.NameInMap("MaxConnections")
        private Integer maxConnections;

        @com.aliyun.core.annotation.NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private DBNodes(Builder builder) {
            this.creationTime = builder.creationTime;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeRole = builder.DBNodeRole;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.failoverPriority = builder.failoverPriority;
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
            private String creationTime; 
            private String DBNodeClass; 
            private String DBNodeId; 
            private String DBNodeRole; 
            private String DBNodeStatus; 
            private Integer failoverPriority; 
            private Integer maxConnections; 
            private Integer maxIOPS; 
            private String zoneId; 

            /**
             * The time when the node was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
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
             * The node ID.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   **Writer**: the primary node
             * *   **Reader**: a read-only node
             */
            public Builder DBNodeRole(String DBNodeRole) {
                this.DBNodeRole = DBNodeRole;
                return this;
            }

            /**
             * The status of the node. Valid values:
             * <p>
             * 
             * *   **Creating**: The node is being created.
             * *   **Running**: The node is running.
             * *   **Deleting**: The node is being deleted.
             * *   **Rebooting**: The node is restarting.
             * *   **ClassChanging**: The specifications of the node are being changed.
             * *   **NetAddressCreating**: The network connection is being created.
             * *   **NetAddressDeleting**: The network connection is being deleted.
             * *   **NetAddressModifying**: The network connection is being modified.
             * *   **MinorVersionUpgrading**: The minor version of the node is being updated.
             * *   **Maintaining**: The node is being maintained.
             * *   **Switching**: A failover is being performed.
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * The failover priority. Each node is assigned a failover priority. The failover priority determines which node is selected as the primary node when a failover occurs. A larger value indicates a higher priority. Valid values: 1 to 15.
             */
            public Builder failoverPriority(Integer failoverPriority) {
                this.failoverPriority = failoverPriority;
                return this;
            }

            /**
             * The maximum number of concurrent connections.
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * The maximum input/output operations per second (IOPS).
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
                return this;
            }

            /**
             * The zone ID of the node.
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
    public static class DBClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodes")
        private java.util.List < DBNodes> DBNodes;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ReplicaLag")
        private String replicaLag;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("ServerlessType")
        private String serverlessType;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private String storageUsed;

        private DBClusters(Builder builder) {
            this.category = builder.category;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodes = builder.DBNodes;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.replicaLag = builder.replicaLag;
            this.role = builder.role;
            this.serverlessType = builder.serverlessType;
            this.storageUsed = builder.storageUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusters create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return replicaLag
         */
        public String getReplicaLag() {
            return this.replicaLag;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return serverlessType
         */
        public String getServerlessType() {
            return this.serverlessType;
        }

        /**
         * @return storageUsed
         */
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public static final class Builder {
            private String category; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterStatus; 
            private String DBNodeClass; 
            private java.util.List < DBNodes> DBNodes; 
            private String DBType; 
            private String DBVersion; 
            private String expireTime; 
            private String expired; 
            private String payType; 
            private String regionId; 
            private String replicaLag; 
            private String role; 
            private String serverlessType; 
            private String storageUsed; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
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
             * The status of the cluster. For more information, see [Cluster status table](~~99286~~).
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * The node specifications of the cluster.
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * The nodes of the cluster.
             */
            public Builder DBNodes(java.util.List < DBNodes> DBNodes) {
                this.DBNodes = DBNodes;
                return this;
            }

            /**
             * The database engine type of the cluster. Only MySQL is supported.
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * The version of the database engine. Only version 8.0 is supported.
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * The expiration time of the cluster.
             * <p>
             * 
             * >  A specific value is returned only for subscription (**Prepaid**) clusters. No value is returned for pay-as-you-go (**Postpaid**) clusters.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates whether the cluster has expired. Valid values:
             * <p>
             * 
             * *   **true** (default)
             * *   **false**
             * 
             * >  This parameter is returned only for subscription (**Prepaid**) clusters.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * The billing method of the cluster. Valid values:
             * <p>
             * 
             * *   **Postpaid**: pay-as-you-go
             * *   **Prepaid**: subscription
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The region ID of the cluster.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The cross-region data replication latency between the primary cluster and secondary clusters. Unit: seconds.
             */
            public Builder replicaLag(String replicaLag) {
                this.replicaLag = replicaLag;
                return this;
            }

            /**
             * The role of the cluster. Valid values:
             * <p>
             * 
             * *   **Primary**: the primary cluster
             * *   **standby**: a secondary cluster
             * 
             * >  A GDN consists of one primary cluster and up to four secondary clusters.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Indicates whether the cluster is a serverless cluster. The value is fixed at AgileServerless.
             * <p>
             * 
             * >  This parameter is returned only for serverless clusters.
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * The storage usage of the cluster. Unit: bytes.
             */
            public Builder storageUsed(String storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            public DBClusters build() {
                return new DBClusters(this);
            } 

        } 

    }
}
