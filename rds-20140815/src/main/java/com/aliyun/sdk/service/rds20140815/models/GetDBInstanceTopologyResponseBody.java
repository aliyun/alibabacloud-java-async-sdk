// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDBInstanceTopologyResponseBody} extends {@link TeaModel}
 *
 * <p>GetDBInstanceTopologyResponseBody</p>
 */
public class GetDBInstanceTopologyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDBInstanceTopologyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBInstanceTopologyResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * An internal parameter. You can ignore this parameter.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The details about the topology.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * An internal parameter. You can ignore this parameter.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDBInstanceTopologyResponseBody build() {
            return new GetDBInstanceTopologyResponseBody(this);
        } 

    } 

    public static class Connections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Connections(Builder builder) {
            this.connectionString = builder.connectionString;
            this.DBInstanceName = builder.DBInstanceName;
            this.netType = builder.netType;
            this.zoneId = builder.zoneId;
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
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String connectionString; 
            private String DBInstanceName; 
            private String netType; 
            private String zoneId; 

            /**
             * The endpoint that is used to connect to the database instance.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * The network type of the endpoint. Valid values:
             * <p>
             * 
             * *   **vpc**
             * *   **public**
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Connections build() {
                return new Connections(this);
            } 

        } 

    }
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostGroupId")
        private String dedicatedHostGroupId;

        @com.aliyun.core.annotation.NameInMap("DedicatedHostId")
        private String dedicatedHostId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Nodes(Builder builder) {
            this.DBInstanceName = builder.DBInstanceName;
            this.dedicatedHostGroupId = builder.dedicatedHostGroupId;
            this.dedicatedHostId = builder.dedicatedHostId;
            this.nodeId = builder.nodeId;
            this.role = builder.role;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return dedicatedHostGroupId
         */
        public String getDedicatedHostGroupId() {
            return this.dedicatedHostGroupId;
        }

        /**
         * @return dedicatedHostId
         */
        public String getDedicatedHostId() {
            return this.dedicatedHostId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String DBInstanceName; 
            private String dedicatedHostGroupId; 
            private String dedicatedHostId; 
            private String nodeId; 
            private String role; 
            private String zoneId; 

            /**
             * The ID of the instance.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * The ID of the dedicated cluster.
             * <p>
             * 
             * > : If the instance does not reside in the specified dedicated cluster, no value is returned.
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * The host ID of the instance in the dedicated cluster.
             * <p>
             * 
             * > : If the instance does not reside in the specified dedicated cluster, no value is returned.
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * The ID of the instance.
             * <p>
             * 
             * > : The value \*\*-1\*\* is returned for an instance that does not reside in a dedicated cluster.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The type of the node. The following result is returned:
             * <p>
             * 
             * *   **Master**: a primary node
             * *   **Slave**: a secondary node
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The zone ID of the instance.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private java.util.List < Connections> connections;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

        private Data(Builder builder) {
            this.connections = builder.connections;
            this.DBInstanceName = builder.DBInstanceName;
            this.nodes = builder.nodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return connections
         */
        public java.util.List < Connections> getConnections() {
            return this.connections;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return nodes
         */
        public java.util.List < Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List < Connections> connections; 
            private String DBInstanceName; 
            private java.util.List < Nodes> nodes; 

            /**
             * The network connection information of the instance.
             */
            public Builder connections(java.util.List < Connections> connections) {
                this.connections = connections;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * The queried nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
