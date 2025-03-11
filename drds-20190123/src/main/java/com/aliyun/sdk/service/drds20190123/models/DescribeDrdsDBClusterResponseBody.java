// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link DescribeDrdsDBClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDrdsDBClusterResponseBody</p>
 */
public class DescribeDrdsDBClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbInstance")
    private DbInstance dbInstance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The details of each PolarDB cluster.</p>
         */
        public Builder dbInstance(DbInstance dbInstance) {
            this.dbInstance = dbInstance;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>60A77FD6-0DE4-4A34-B6FB-9C2673******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDrdsDBClusterResponseBody build() {
            return new DescribeDrdsDBClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDrdsDBClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBClusterResponseBody</p>
     */
    public static class DBNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNodeId")
        private String DBNodeId;

        @com.aliyun.core.annotation.NameInMap("DBNodeRole")
        private String DBNodeRole;

        @com.aliyun.core.annotation.NameInMap("DBNodeStatus")
        private String DBNodeStatus;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
             * <p>The ID of the node in the apsaradb for PolarDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-***************</p>
             */
            public Builder DBNodeId(String DBNodeId) {
                this.DBNodeId = DBNodeId;
                return this;
            }

            /**
             * <p>The role of a node in the apsaradb for PolarDB cluster. Valid values:</p>
             * <ul>
             * <li><strong>Reader</strong></li>
             * <li><strong>Writer</strong></li>
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
             * <p>The status of the nodes in the PolarDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBNodeStatus(String DBNodeStatus) {
                this.DBNodeStatus = DBNodeStatus;
                return this;
            }

            /**
             * <p>The ID of the zone where the node of the PolarDB cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
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
    /**
     * 
     * {@link DescribeDrdsDBClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBClusterResponseBody</p>
     */
    public static class DBNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBNode")
        private java.util.List<DBNode> DBNode;

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
        public java.util.List<DBNode> getDBNode() {
            return this.DBNode;
        }

        public static final class Builder {
            private java.util.List<DBNode> DBNode; 

            /**
             * DBNode.
             */
            public Builder DBNode(java.util.List<DBNode> DBNode) {
                this.DBNode = DBNode;
                return this;
            }

            public DBNodes build() {
                return new DBNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsDBClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBClusterResponseBody</p>
     */
    public static class Endpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("NodeIds")
        private String nodeIds;

        @com.aliyun.core.annotation.NameInMap("ReadWeight")
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
             * <p>The ID of the PolarDB connection address.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-*****************</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The ID list of the nodes in the PolarDB connection string. Separate multiple nodes with commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>pi-<em><strong><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></strong></em></p>
             */
            public Builder nodeIds(String nodeIds) {
                this.nodeIds = nodeIds;
                return this;
            }

            /**
             * <p>The read ratio of this connection address managed by the DRDS database.</p>
             * 
             * <strong>example:</strong>
             * <p>85</p>
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
    /**
     * 
     * {@link DescribeDrdsDBClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBClusterResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private java.util.List<Endpoint> endpoint;

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
        public java.util.List<Endpoint> getEndpoint() {
            return this.endpoint;
        }

        public static final class Builder {
            private java.util.List<Endpoint> endpoint; 

            /**
             * Endpoint.
             */
            public Builder endpoint(java.util.List<Endpoint> endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDrdsDBClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDrdsDBClusterResponseBody</p>
     */
    public static class DbInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("DBNodes")
        private DBNodes DBNodes;

        @com.aliyun.core.annotation.NameInMap("DbInstType")
        private String dbInstType;

        @com.aliyun.core.annotation.NameInMap("Endpoints")
        private Endpoints endpoints;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("RdsInstType")
        private String rdsInstType;

        @com.aliyun.core.annotation.NameInMap("ReadMode")
        private String readMode;

        @com.aliyun.core.annotation.NameInMap("RemainDays")
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
             * <p>The ID of the PolarDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-*****************</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The status of the PolarDB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * <p>The information about the nodes in the PolarDB Cluster.</p>
             */
            public Builder DBNodes(DBNodes DBNodes) {
                this.DBNodes = DBNodes;
                return this;
            }

            /**
             * <p>The type of storage used by the DRDS database.</p>
             * 
             * <strong>example:</strong>
             * <p>POLARDB</p>
             */
            public Builder dbInstType(String dbInstType) {
                this.dbInstType = dbInstType;
                return this;
            }

            /**
             * <p>The endpoint of the PolarDB read /write splitting endpoint</p>
             */
            public Builder endpoints(Endpoints endpoints) {
                this.endpoints = endpoints;
                return this;
            }

            /**
             * <p>The type of the DRDS database storage engine.</p>
             * 
             * <strong>example:</strong>
             * <p>POLARDB</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The version of the DRDS database storage engine.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the PolarDB cluster expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-09-27 11:22:33</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The network type of the PolarDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The billing method of the PolarDB cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The PolarDB access port.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The type of RDS instance. PolarDB cluster does not support this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>ignore</p>
             */
            public Builder rdsInstType(String rdsInstType) {
                this.rdsInstType = rdsInstType;
                return this;
            }

            /**
             * <p>This parameter specifies the Read mode when the database storage type is PolarDB.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><strong>DEFAULT</strong>: the default mode (that is, all read traffic is sent to the PolarDB read /write node).</li>
             * <li><strong>CUSTOM</strong>: Custom mode (you can customize the ratio of traffic sent to read /write nodes and read-only nodes).</li>
             * <li><strong>BALANCE</strong>: read balancing mode (the read traffic is automatically distributed by the read load module of the PolarDB cluster, which can also be understood as the read traffic being evenly distributed to each node).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CUSTOM</p>
             */
            public Builder readMode(String readMode) {
                this.readMode = readMode;
                return this;
            }

            /**
             * <p>The number of days remaining on the PolarDB for MySQL instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
