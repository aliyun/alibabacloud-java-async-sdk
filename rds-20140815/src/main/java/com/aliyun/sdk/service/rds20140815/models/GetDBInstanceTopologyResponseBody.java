// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetDBInstanceTopologyResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>An internal parameter. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The details about the topology.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>An internal parameter. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7430AB1A-6D49-5B6D-B9E5-920250076074</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDBInstanceTopologyResponseBody build() {
            return new GetDBInstanceTopologyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBInstanceTopologyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Connections model) {
                this.connectionString = model.connectionString;
                this.DBInstanceName = model.DBInstanceName;
                this.netType = model.netType;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The endpoint that is used to connect to the database instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5ezban**********.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5ezban**********</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The network type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>vpc</strong></li>
             * <li><strong>public</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao-c</p>
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
    /**
     * 
     * {@link GetDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBInstanceTopologyResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.DBInstanceName = model.DBInstanceName;
                this.dedicatedHostGroupId = model.dedicatedHostGroupId;
                this.dedicatedHostId = model.dedicatedHostId;
                this.nodeId = model.nodeId;
                this.role = model.role;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5ezban**********</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The ID of the dedicated cluster.</p>
             * <blockquote>
             * <p>: If the instance does not reside in the specified dedicated cluster, no value is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>dhg-4n*****</p>
             */
            public Builder dedicatedHostGroupId(String dedicatedHostGroupId) {
                this.dedicatedHostGroupId = dedicatedHostGroupId;
                return this;
            }

            /**
             * <p>The host ID of the instance in the dedicated cluster.</p>
             * <blockquote>
             * <p>: If the instance does not reside in the specified dedicated cluster, no value is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-bpxxxxxxx</p>
             */
            public Builder dedicatedHostId(String dedicatedHostId) {
                this.dedicatedHostId = dedicatedHostId;
                return this;
            }

            /**
             * <p>The ID of the instance.</p>
             * <blockquote>
             * <p>: The value **-1** is returned for an instance that does not reside in a dedicated cluster.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>349054</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The type of the node. The following result is returned:</p>
             * <ul>
             * <li><strong>Master</strong>: a primary node</li>
             * <li><strong>Slave</strong>: a secondary node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>master</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The zone ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao-c</p>
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
    /**
     * 
     * {@link GetDBInstanceTopologyResponseBody} extends {@link TeaModel}
     *
     * <p>GetDBInstanceTopologyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Connections")
        private java.util.List<Connections> connections;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

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
        public java.util.List<Connections> getConnections() {
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
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        public static final class Builder {
            private java.util.List<Connections> connections; 
            private String DBInstanceName; 
            private java.util.List<Nodes> nodes; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.connections = model.connections;
                this.DBInstanceName = model.DBInstanceName;
                this.nodes = model.nodes;
            } 

            /**
             * <p>The network connection information of the instance.</p>
             */
            public Builder connections(java.util.List<Connections> connections) {
                this.connections = connections;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5ezban**********</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The queried nodes.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
