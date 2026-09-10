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
 * {@link DescribeGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDatabaseNetworkResponseBody</p>
 */
public class DescribeGlobalDatabaseNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connections")
    private java.util.List<Connections> connections;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("DBClusters")
    private java.util.List<DBClusters> DBClusters;

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

    @com.aliyun.core.annotation.NameInMap("Labels")
    private Labels labels;

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
        this.labels = builder.labels;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGlobalDatabaseNetworkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connections
     */
    public java.util.List<Connections> getConnections() {
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
    public java.util.List<DBClusters> getDBClusters() {
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
     * @return labels
     */
    public Labels getLabels() {
        return this.labels;
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
        private java.util.List<Connections> connections; 
        private String createTime; 
        private String DBClusterId; 
        private java.util.List<DBClusters> DBClusters; 
        private String DBType; 
        private String DBVersion; 
        private String GDNDescription; 
        private String GDNId; 
        private String GDNStatus; 
        private String globalDomainName; 
        private Labels labels; 
        private String requestId; 
        private String resourceGroupId; 

        private Builder() {
        } 

        private Builder(DescribeGlobalDatabaseNetworkResponseBody model) {
            this.connections = model.connections;
            this.createTime = model.createTime;
            this.DBClusterId = model.DBClusterId;
            this.DBClusters = model.DBClusters;
            this.DBType = model.DBType;
            this.DBVersion = model.DBVersion;
            this.GDNDescription = model.GDNDescription;
            this.GDNId = model.GDNId;
            this.GDNStatus = model.GDNStatus;
            this.globalDomainName = model.globalDomainName;
            this.labels = model.labels;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
        } 

        /**
         * <p>The connection details.</p>
         */
        public Builder connections(java.util.List<Connections> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * <p>The time when the GDN was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-24T11:57:54Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-bp1s826a1up******</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The clusters in the GDN.</p>
         */
        public Builder DBClusters(java.util.List<DBClusters> DBClusters) {
            this.DBClusters = DBClusters;
            return this;
        }

        /**
         * <p>The database engine type. Only MySQL is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The database engine version. Only version 8.0 is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        public Builder DBVersion(String DBVersion) {
            this.DBVersion = DBVersion;
            return this;
        }

        /**
         * <p>The description of the GDN. It must meet the following requirements:</p>
         * <ul>
         * <li><p>It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </li>
         * <li><p>It must start with a letter or a Chinese character.</p>
         * </li>
         * <li><p>It can contain only letters, Chinese characters, digits, underscores (_), and hyphens (-).</p>
         * </li>
         * <li><p>It must be 2 to 126 characters in length.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GDN-fortest</p>
         */
        public Builder GDNDescription(String GDNDescription) {
            this.GDNDescription = GDNDescription;
            return this;
        }

        /**
         * <p>The GDN ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-bp1fttxsrmv*****</p>
         */
        public Builder GDNId(String GDNId) {
            this.GDNId = GDNId;
            return this;
        }

        /**
         * <p>The status of the Global Database Network (GDN). Valid values:</p>
         * <ul>
         * <li><p><strong>creating</strong>: The GDN is being created.</p>
         * </li>
         * <li><p><strong>active</strong>: The GDN is running.</p>
         * </li>
         * <li><p><strong>deleting</strong>: The GDN is being deleted.</p>
         * </li>
         * <li><p><strong>locked</strong>: The GDN is locked. In this state, you cannot perform any operations on any cluster in the GDN.</p>
         * </li>
         * <li><p><strong>removing_member</strong>: A cluster is being removed from the GDN.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder GDNStatus(String GDNStatus) {
            this.GDNStatus = GDNStatus;
            return this;
        }

        /**
         * <p>The global domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>[gdnid].gdn.rds.aliyuncs.com</p>
         */
        public Builder globalDomainName(String globalDomainName) {
            this.globalDomainName = globalDomainName;
            return this;
        }

        /**
         * <p>The labels of the GDN.</p>
         */
        public Builder labels(Labels labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67F2E75F-AE67-4FB2-821F-A81237EACD15</p>
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

        public DescribeGlobalDatabaseNetworkResponseBody build() {
            return new DescribeGlobalDatabaseNetworkResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDatabaseNetworkResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Connections model) {
                this.connectionString = model.connectionString;
                this.netType = model.netType;
                this.port = model.port;
            } 

            /**
             * <p>The connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>abc.polardb.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The network type.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The port number of the connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
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
    /**
     * 
     * {@link DescribeGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDatabaseNetworkResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DBNodes model) {
                this.creationTime = model.creationTime;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeId = model.DBNodeId;
                this.DBNodeRole = model.DBNodeRole;
                this.DBNodeStatus = model.DBNodeStatus;
                this.failoverPriority = model.failoverPriority;
                this.maxConnections = model.maxConnections;
                this.maxIOPS = model.maxIOPS;
                this.zoneId = model.zoneId;
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
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.large</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
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
             * <ul>
             * <li><p><strong>Writer</strong>: the primary node</p>
             * </li>
             * <li><p><strong>Reader</strong>: a read-only node</p>
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
             * <p>The status of the node. Valid values:</p>
             * <ul>
             * <li><p><strong>Creating</strong>: The node is being created.</p>
             * </li>
             * <li><p><strong>Running</strong>: The node is running.</p>
             * </li>
             * <li><p><strong>Deleting</strong>: The node is being deleted.</p>
             * </li>
             * <li><p><strong>Rebooting</strong>: The node is being restarted.</p>
             * </li>
             * <li><p><strong>ClassChanging</strong>: The node type is being changed.</p>
             * </li>
             * <li><p><strong>NetAddressCreating</strong>: A network connection is being created.</p>
             * </li>
             * <li><p><strong>NetAddressDeleting</strong>: A network connection is being deleted.</p>
             * </li>
             * <li><p><strong>NetAddressModifying</strong>: A network connection is being modified.</p>
             * </li>
             * <li><p><strong>MinorVersionUpgrading</strong>: The minor version is being upgraded.</p>
             * </li>
             * <li><p><strong>Maintaining</strong>: The cluster is being maintained.</p>
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
             * <p>The failover priority. In the event of a failover, the system promotes a read-only node to the primary node. A larger value indicates a higher priority. Each read-only node is assigned a failover priority. Valid values: 1 to 15.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failoverPriority(Integer failoverPriority) {
                this.failoverPriority = failoverPriority;
                return this;
            }

            /**
             * <p>The maximum number of concurrent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>8000</p>
             */
            public Builder maxConnections(Integer maxConnections) {
                this.maxConnections = maxConnections;
                return this;
            }

            /**
             * <p>The maximum I/O operations per second (IOPS).</p>
             * 
             * <strong>example:</strong>
             * <p>32000</p>
             */
            public Builder maxIOPS(Integer maxIOPS) {
                this.maxIOPS = maxIOPS;
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
     * {@link DescribeGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDatabaseNetworkResponseBody</p>
     */
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
        private java.util.List<DBNodes> DBNodes;

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
            private java.util.List<DBNodes> DBNodes; 
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

            private Builder() {
            } 

            private Builder(DBClusters model) {
                this.category = model.category;
                this.DBClusterDescription = model.DBClusterDescription;
                this.DBClusterId = model.DBClusterId;
                this.DBClusterStatus = model.DBClusterStatus;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodes = model.DBNodes;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.replicaLag = model.replicaLag;
                this.role = model.role;
                this.serverlessType = model.serverlessType;
                this.storageUsed = model.storageUsed;
            } 

            /**
             * <p>The edition of the cluster. Valid values:</p>
             * <p><code>Normal</code>: Cluster Edition <code>Basic</code>: Single-node Edition <code>Archive</code>: X-Engine Edition <code>NormalMultimaster</code>: Multi-master Cluster Edition <code>SENormal</code>: Standard Edition</p>
             * <blockquote>
             * <ul>
             * <li><p>Single-node Edition is not supported for PolarDB for PostgreSQL clusters that run PostgreSQL 11.</p>
             * </li>
             * <li><p>Standard Edition is supported for PolarDB for MySQL clusters that run MySQL 8.0 or 5.7 and for PolarDB for PostgreSQL clusters that run PostgreSQL 14.</p>
             * </li>
             * <li><p>X-Engine Edition and Multi-master Cluster Edition are supported only for PolarDB for MySQL clusters that run MySQL 8.0.</p>
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
             * <p>The description of the cluster.</p>
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
             * <p>pc-wz9fb5nn44u1d****</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The status of the cluster. For more information, see <a href="https://help.aliyun.com/document_detail/99286.html">Cluster statuses</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * <p>The node type.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.x4.large</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * <p>The details of the nodes in the cluster.</p>
             */
            public Builder DBNodes(java.util.List<DBNodes> DBNodes) {
                this.DBNodes = DBNodes;
                return this;
            }

            /**
             * <p>The database engine. Only MySQL is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The database engine version. Only version 8.0 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The expiration time of the cluster.</p>
             * <blockquote>
             * <p>This parameter is returned only for subscription clusters. An empty string is returned for pay-as-you-go clusters.</p>
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
             * <p>Indicates whether the cluster has expired. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The cluster has expired.</p>
             * </li>
             * <li><p><strong>false</strong>: The cluster has not expired.</p>
             * </li>
             * </ul>
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
             * <p>The billing method of the cluster. Valid values:</p>
             * <ul>
             * <li><p><strong>Postpaid</strong>: pay-as-you-go.</p>
             * </li>
             * <li><p><strong>Prepaid</strong>: subscription.</p>
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
             * <p>The region ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The replication lag for cross-region replication between the primary and standby clusters. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder replicaLag(String replicaLag) {
                this.replicaLag = replicaLag;
                return this;
            }

            /**
             * <p>The role of the cluster in the GDN. Valid values:</p>
             * <ul>
             * <li><p><strong>primary</strong>: the primary cluster</p>
             * </li>
             * <li><p><strong>standby</strong>: a standby cluster</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>A GDN consists of one primary cluster and up to four standby clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>primary</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The type of the Serverless cluster. The value is fixed as <code>AgileServerless</code>.</p>
             * <blockquote>
             * <p>This parameter is returned only for Serverless clusters.</p>
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
             * <p>The amount of storage space used. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3012558848</p>
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
    /**
     * 
     * {@link DescribeGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGlobalDatabaseNetworkResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GDNVersion")
        private String GDNVersion;

        private Labels(Builder builder) {
            this.GDNVersion = builder.GDNVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return GDNVersion
         */
        public String getGDNVersion() {
            return this.GDNVersion;
        }

        public static final class Builder {
            private String GDNVersion; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.GDNVersion = model.GDNVersion;
            } 

            /**
             * <p>The version of the GDN.</p>
             * 
             * <strong>example:</strong>
             * <p>2.0</p>
             */
            public Builder GDNVersion(String GDNVersion) {
                this.GDNVersion = GDNVersion;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
}
