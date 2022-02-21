// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGlobalDatabaseNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGlobalDatabaseNetworkResponseBody</p>
 */
public class DescribeGlobalDatabaseNetworkResponseBody extends TeaModel {
    @NameInMap("Connections")
    private java.util.List < Connections> connections;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DBClusters")
    private java.util.List < DBClusters> DBClusters;

    @NameInMap("DBType")
    private String DBType;

    @NameInMap("DBVersion")
    private String DBVersion;

    @NameInMap("GDNDescription")
    private String GDNDescription;

    @NameInMap("GDNId")
    private String GDNId;

    @NameInMap("GDNStatus")
    private String GDNStatus;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeGlobalDatabaseNetworkResponseBody(Builder builder) {
        this.connections = builder.connections;
        this.createTime = builder.createTime;
        this.DBClusters = builder.DBClusters;
        this.DBType = builder.DBType;
        this.DBVersion = builder.DBVersion;
        this.GDNDescription = builder.GDNDescription;
        this.GDNId = builder.GDNId;
        this.GDNStatus = builder.GDNStatus;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Connections> connections; 
        private String createTime; 
        private java.util.List < DBClusters> DBClusters; 
        private String DBType; 
        private String DBVersion; 
        private String GDNDescription; 
        private String GDNId; 
        private String GDNStatus; 
        private String requestId; 

        /**
         * Connections.
         */
        public Builder connections(java.util.List < Connections> connections) {
            this.connections = connections;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * DBClusters.
         */
        public Builder DBClusters(java.util.List < DBClusters> DBClusters) {
            this.DBClusters = DBClusters;
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
         * GDNDescription.
         */
        public Builder GDNDescription(String GDNDescription) {
            this.GDNDescription = GDNDescription;
            return this;
        }

        /**
         * GDNId.
         */
        public Builder GDNId(String GDNId) {
            this.GDNId = GDNId;
            return this;
        }

        /**
         * GDNStatus.
         */
        public Builder GDNStatus(String GDNStatus) {
            this.GDNStatus = GDNStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGlobalDatabaseNetworkResponseBody build() {
            return new DescribeGlobalDatabaseNetworkResponseBody(this);
        } 

    } 

    public static class Connections extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("Port")
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
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Port.
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

        @NameInMap("MaxConnections")
        private Integer maxConnections;

        @NameInMap("MaxIOPS")
        private Integer maxIOPS;

        @NameInMap("ZoneId")
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
    public static class DBClusters extends TeaModel {
        @NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @NameInMap("DBNodeClass")
        private String DBNodeClass;

        @NameInMap("DBNodes")
        private java.util.List < DBNodes> DBNodes;

        @NameInMap("DBType")
        private String DBType;

        @NameInMap("DBVersion")
        private String DBVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("Expired")
        private String expired;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ReplicaLag")
        private String replicaLag;

        @NameInMap("Role")
        private String role;

        @NameInMap("StorageUsed")
        private String storageUsed;

        private DBClusters(Builder builder) {
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
            this.storageUsed = builder.storageUsed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBClusters create() {
            return builder().build();
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
         * @return storageUsed
         */
        public String getStorageUsed() {
            return this.storageUsed;
        }

        public static final class Builder {
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
            private String storageUsed; 

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
             * DBClusterStatus.
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
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
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
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
             * ReplicaLag.
             */
            public Builder replicaLag(String replicaLag) {
                this.replicaLag = replicaLag;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * StorageUsed.
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
