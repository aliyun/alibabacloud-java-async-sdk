// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBClusterResponseBody</p>
 */
public class DescribeDrdsDBClusterResponseBody extends TeaModel {
    @NameInMap("DbInstance")
    private DbInstance dbInstance;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeDrdsDBClusterResponseBody(Builder builder) {
        this.dbInstance = builder.dbInstance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDBClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return dbInstance
     */
    public DbInstance getDbInstance() {
        return this.dbInstance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private DbInstance dbInstance; 
        private String requestId; 
        private Boolean success; 

        /**
         * The details of each PolarDB cluster.
         */
        public Builder dbInstance(DbInstance dbInstance) {
            this.dbInstance = dbInstance;
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
         * The result of the request.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsDBClusterResponseBody build() {
            return new DescribeDrdsDBClusterResponseBody(this);
        } 

    } 

    public static class DBNode extends TeaModel {
        @NameInMap("DBNodeId")
        private String DBNodeId;

        @NameInMap("DBNodeRole")
        private String DBNodeRole;

        @NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @NameInMap("ZoneId")
        private String zoneId;

        private DBNode(Builder builder) {
            this.DBNodeId = builder.DBNodeId;
            this.DBNodeRole = builder.DBNodeRole;
            this.DBNodeStatus = builder.DBNodeStatus;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBNode create() {
            return builder().build();
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
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String DBNodeId; 
            private String DBNodeRole; 
            private String DBNodeStatus; 
            private String zoneId; 

            /**
             * The ID of the node in the apsaradb for PolarDB cluster.
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * The role of a node in the apsaradb for PolarDB cluster. Valid values:
             * <p>
             * 
             * *   **Reader**
             * *   **Writer**
             */
            public Builder DBNodeRole(String DBNodeRole) {
                this.DBNodeRole = DBNodeRole;
                return this;
            }

            /**
             * The status of the nodes in the PolarDB cluster.
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * The ID of the zone where the node of the PolarDB cluster resides.
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
    public static class Endpoint extends TeaModel {
        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("NodeIds")
        private String nodeIds;

        @NameInMap("ReadWeight")
        private Integer readWeight;

        private Endpoint(Builder builder) {
            this.endpointId = builder.endpointId;
            this.nodeIds = builder.nodeIds;
            this.readWeight = builder.readWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoint create() {
            return builder().build();
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return nodeIds
         */
        public String getNodeIds() {
            return this.nodeIds;
        }

        /**
         * @return readWeight
         */
        public Integer getReadWeight() {
            return this.readWeight;
        }

        public static final class Builder {
            private String endpointId; 
            private String nodeIds; 
            private Integer readWeight; 

            /**
             * The ID of the PolarDB connection address.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID list of the nodes in the PolarDB connection string. Separate multiple nodes with commas (,).
             */
            public Builder nodeIds(String nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * The read ratio of this connection address managed by the DRDS database.
             */
            public Builder readWeight(Integer readWeight) {
                this.readWeight = readWeight;
                return this;
            }

            public Endpoint build() {
                return new Endpoint(this);
            } 

        } 

    }
    public static class Endpoints extends TeaModel {
        @NameInMap("Endpoint")
        private java.util.List < Endpoint> endpoint;

        private Endpoints(Builder builder) {
            this.endpoint = builder.endpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public java.util.List < Endpoint> getEndpoint() {
            return this.endpoint;
        }

        public static final class Builder {
            private java.util.List < Endpoint> endpoint; 

            /**
             * Endpoint.
             */
            public Builder endpoint(java.util.List < Endpoint> endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    public static class DbInstance extends TeaModel {
        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("DBNodes")
        private DBNodes DBNodes;

        @NameInMap("DbInstType")
        private String dbInstType;

        @NameInMap("Endpoints")
        private Endpoints endpoints;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("RdsInstType")
        private String rdsInstType;

        @NameInMap("ReadMode")
        private String readMode;

        @NameInMap("RemainDays")
        private String remainDays;

        private DbInstance(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.DBNodes = builder.DBNodes;
            this.dbInstType = builder.dbInstType;
            this.endpoints = builder.endpoints;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.expireTime = builder.expireTime;
            this.networkType = builder.networkType;
            this.payType = builder.payType;
            this.port = builder.port;
            this.rdsInstType = builder.rdsInstType;
            this.readMode = builder.readMode;
            this.remainDays = builder.remainDays;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DbInstance create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return DBNodes
         */
        public DBNodes getDBNodes() {
            return this.DBNodes;
        }

        /**
         * @return dbInstType
         */
        public String getDbInstType() {
            return this.dbInstType;
        }

        /**
         * @return endpoints
         */
        public Endpoints getEndpoints() {
            return this.endpoints;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return rdsInstType
         */
        public String getRdsInstType() {
            return this.rdsInstType;
        }

        /**
         * @return readMode
         */
        public String getReadMode() {
            return this.readMode;
        }

        /**
         * @return remainDays
         */
        public String getRemainDays() {
            return this.remainDays;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private DBNodes DBNodes; 
            private String dbInstType; 
            private Endpoints endpoints; 
            private String engine; 
            private String engineVersion; 
            private String expireTime; 
            private String networkType; 
            private String payType; 
            private Integer port; 
            private String rdsInstType; 
            private String readMode; 
            private String remainDays; 

            /**
             * The ID of the PolarDB cluster.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The status of the PolarDB instance.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The information about the nodes in the PolarDB Cluster.
             */
            public Builder DBNodes(DBNodes DBNodes) {
                this.DBNodes = DBNodes;
                return this;
            }

            /**
             * The type of storage used by the DRDS database.
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * The endpoint of the PolarDB read /write splitting endpoint
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * The type of the DRDS database storage engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The version of the DRDS database storage engine.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The time when the PolarDB cluster expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The network type of the PolarDB cluster.
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The billing method of the PolarDB cluster.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * The PolarDB access port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The type of RDS instance. PolarDB cluster does not support this parameter.
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * This parameter specifies the Read mode when the database storage type is PolarDB.
             * <p>
             * 
             * Valid values:
             * 
             * *   **DEFAULT**: the default mode (that is, all read traffic is sent to the PolarDB read /write node).
             * *   **CUSTOM**: Custom mode (you can customize the ratio of traffic sent to read /write nodes and read-only nodes).
             * *   **BALANCE**: read balancing mode (the read traffic is automatically distributed by the read load module of the PolarDB cluster, which can also be understood as the read traffic being evenly distributed to each node).
             */
            public Builder readMode(String readMode) {
                this.readMode = readMode;
                return this;
            }

            /**
             * The number of days remaining on the PolarDB for MySQL instance.
             */
            public Builder remainDays(String remainDays) {
                this.remainDays = remainDays;
                return this;
            }

            public DbInstance build() {
                return new DbInstance(this);
            } 

        } 

    }
}
