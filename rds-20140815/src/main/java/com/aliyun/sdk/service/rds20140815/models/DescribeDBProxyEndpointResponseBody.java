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
 * {@link DescribeDBProxyEndpointResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBProxyEndpointResponseBody</p>
 */
public class DescribeDBProxyEndpointResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBProxyConnectString")
    private String DBProxyConnectString;

    @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringNetType")
    private String DBProxyConnectStringNetType;

    @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringPort")
    private String DBProxyConnectStringPort;

    @com.aliyun.core.annotation.NameInMap("DBProxyEndpointId")
    private String DBProxyEndpointId;

    @com.aliyun.core.annotation.NameInMap("DBProxyEndpointMinSlaveCount")
    private String DBProxyEndpointMinSlaveCount;

    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.NameInMap("DBProxyFeatures")
    private String DBProxyFeatures;

    @com.aliyun.core.annotation.NameInMap("DBProxyNodes")
    private DBProxyNodes DBProxyNodes;

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointAliases")
    private String dbProxyEndpointAliases;

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointReadWriteMode")
    private String dbProxyEndpointReadWriteMode;

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointVswitchId")
    private String dbProxyEndpointVswitchId;

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointZoneId")
    private String dbProxyEndpointZoneId;

    @com.aliyun.core.annotation.NameInMap("EndpointConnectItems")
    private EndpointConnectItems endpointConnectItems;

    @com.aliyun.core.annotation.NameInMap("ReadOnlyInstanceDistributionType")
    private String readOnlyInstanceDistributionType;

    @com.aliyun.core.annotation.NameInMap("ReadOnlyInstanceMaxDelayTime")
    private String readOnlyInstanceMaxDelayTime;

    @com.aliyun.core.annotation.NameInMap("ReadOnlyInstanceWeight")
    private String readOnlyInstanceWeight;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBProxyEndpointResponseBody(Builder builder) {
        this.DBProxyConnectString = builder.DBProxyConnectString;
        this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
        this.DBProxyConnectStringPort = builder.DBProxyConnectStringPort;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEndpointMinSlaveCount = builder.DBProxyEndpointMinSlaveCount;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyFeatures = builder.DBProxyFeatures;
        this.DBProxyNodes = builder.DBProxyNodes;
        this.dbProxyEndpointAliases = builder.dbProxyEndpointAliases;
        this.dbProxyEndpointReadWriteMode = builder.dbProxyEndpointReadWriteMode;
        this.dbProxyEndpointVswitchId = builder.dbProxyEndpointVswitchId;
        this.dbProxyEndpointZoneId = builder.dbProxyEndpointZoneId;
        this.endpointConnectItems = builder.endpointConnectItems;
        this.readOnlyInstanceDistributionType = builder.readOnlyInstanceDistributionType;
        this.readOnlyInstanceMaxDelayTime = builder.readOnlyInstanceMaxDelayTime;
        this.readOnlyInstanceWeight = builder.readOnlyInstanceWeight;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBProxyEndpointResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBProxyConnectString
     */
    public String getDBProxyConnectString() {
        return this.DBProxyConnectString;
    }

    /**
     * @return DBProxyConnectStringNetType
     */
    public String getDBProxyConnectStringNetType() {
        return this.DBProxyConnectStringNetType;
    }

    /**
     * @return DBProxyConnectStringPort
     */
    public String getDBProxyConnectStringPort() {
        return this.DBProxyConnectStringPort;
    }

    /**
     * @return DBProxyEndpointId
     */
    public String getDBProxyEndpointId() {
        return this.DBProxyEndpointId;
    }

    /**
     * @return DBProxyEndpointMinSlaveCount
     */
    public String getDBProxyEndpointMinSlaveCount() {
        return this.DBProxyEndpointMinSlaveCount;
    }

    /**
     * @return DBProxyEngineType
     */
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    /**
     * @return DBProxyFeatures
     */
    public String getDBProxyFeatures() {
        return this.DBProxyFeatures;
    }

    /**
     * @return DBProxyNodes
     */
    public DBProxyNodes getDBProxyNodes() {
        return this.DBProxyNodes;
    }

    /**
     * @return dbProxyEndpointAliases
     */
    public String getDbProxyEndpointAliases() {
        return this.dbProxyEndpointAliases;
    }

    /**
     * @return dbProxyEndpointReadWriteMode
     */
    public String getDbProxyEndpointReadWriteMode() {
        return this.dbProxyEndpointReadWriteMode;
    }

    /**
     * @return dbProxyEndpointVswitchId
     */
    public String getDbProxyEndpointVswitchId() {
        return this.dbProxyEndpointVswitchId;
    }

    /**
     * @return dbProxyEndpointZoneId
     */
    public String getDbProxyEndpointZoneId() {
        return this.dbProxyEndpointZoneId;
    }

    /**
     * @return endpointConnectItems
     */
    public EndpointConnectItems getEndpointConnectItems() {
        return this.endpointConnectItems;
    }

    /**
     * @return readOnlyInstanceDistributionType
     */
    public String getReadOnlyInstanceDistributionType() {
        return this.readOnlyInstanceDistributionType;
    }

    /**
     * @return readOnlyInstanceMaxDelayTime
     */
    public String getReadOnlyInstanceMaxDelayTime() {
        return this.readOnlyInstanceMaxDelayTime;
    }

    /**
     * @return readOnlyInstanceWeight
     */
    public String getReadOnlyInstanceWeight() {
        return this.readOnlyInstanceWeight;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBProxyConnectString; 
        private String DBProxyConnectStringNetType; 
        private String DBProxyConnectStringPort; 
        private String DBProxyEndpointId; 
        private String DBProxyEndpointMinSlaveCount; 
        private String DBProxyEngineType; 
        private String DBProxyFeatures; 
        private DBProxyNodes DBProxyNodes; 
        private String dbProxyEndpointAliases; 
        private String dbProxyEndpointReadWriteMode; 
        private String dbProxyEndpointVswitchId; 
        private String dbProxyEndpointZoneId; 
        private EndpointConnectItems endpointConnectItems; 
        private String readOnlyInstanceDistributionType; 
        private String readOnlyInstanceMaxDelayTime; 
        private String readOnlyInstanceWeight; 
        private String requestId; 

        /**
         * <p>The proxy endpoint queried.</p>
         * 
         * <strong>example:</strong>
         * <p>testproxy****.rwlb.rds.aliyuncs.com</p>
         */
        public Builder DBProxyConnectString(String DBProxyConnectString) {
            this.DBProxyConnectString = DBProxyConnectString;
            return this;
        }

        /**
         * <p>The network type of the proxy endpoint. Valid values:</p>
         * <ul>
         * <li><strong>InnerString</strong>: internal network</li>
         * <li><strong>OuterString</strong>: Internet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InnerString</p>
         */
        public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }

        /**
         * <p>The port number that is associated with the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder DBProxyConnectStringPort(String DBProxyConnectStringPort) {
            this.DBProxyConnectStringPort = DBProxyConnectStringPort;
            return this;
        }

        /**
         * <p>The ID of the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>keaxncrjluwu0gue****</p>
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * <p>The minimum number of reserved instances.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder DBProxyEndpointMinSlaveCount(String DBProxyEndpointMinSlaveCount) {
            this.DBProxyEndpointMinSlaveCount = DBProxyEndpointMinSlaveCount;
            return this;
        }

        /**
         * <p>An internal parameter. You can ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * <p>The configuration of the proxy terminal. The value of this parameter is a JSON string that consists of the following parameters:</p>
         * <ul>
         * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: the status of the transaction splitting feature. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</li>
         * <li><strong>ConnectionPersist</strong>: the status of the connection pooling feature. Valid values: <strong>0</strong>, <strong>1</strong>, and <strong>2</strong>. The value 0 indicates that the connection pooling feature is disabled. The value 1 indicates that the session-level connection pooling feature is enabled. The value 2 indicates that the transaction-level connection pooling feature is enabled.</li>
         * <li><strong>ReadWriteSpliting</strong>: the status of the read/write splitting feature. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</li>
         * <li><strong>AZProximityAccess</strong>: the status of the nearest access feature. Valid values: <strong>0</strong> and <strong>1</strong>. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.</li>
         * <li><strong>PinPreparedStmt</strong>: an internal parameter that is available only for ApsaraDB RDS for PostgrSQL instances.</li>
         * </ul>
         * <blockquote>
         * <p> If the instance runs PostgreSQL, you can change only the value of the <strong>ReadWriteSpliting</strong> field. The <strong>TransactionReadSqlRouteOptimizeStatus</strong> and <strong>PinPreparedStmt</strong> fields are set to their default values 1.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TransactionReadSqlRouteOptimizeStatus:1;ConnectionPersist:0;ReadWriteSpliting:1</p>
         */
        public Builder DBProxyFeatures(String DBProxyFeatures) {
            this.DBProxyFeatures = DBProxyFeatures;
            return this;
        }

        /**
         * <p>The proxy nodes that are associated with the proxy terminal.</p>
         */
        public Builder DBProxyNodes(DBProxyNodes DBProxyNodes) {
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The description of the proxy terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>proxyterminal-test</p>
         */
        public Builder dbProxyEndpointAliases(String dbProxyEndpointAliases) {
            this.dbProxyEndpointAliases = dbProxyEndpointAliases;
            return this;
        }

        /**
         * <p>The read and write attributes of the proxy terminal. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: The proxy terminal supports read and write requests.</li>
         * <li><strong>ReadOnly</strong>: The proxy terminal supports only read requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        public Builder dbProxyEndpointReadWriteMode(String dbProxyEndpointReadWriteMode) {
            this.dbProxyEndpointReadWriteMode = dbProxyEndpointReadWriteMode;
            return this;
        }

        /**
         * <p>The vSwitch ID of the proxy terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        public Builder dbProxyEndpointVswitchId(String dbProxyEndpointVswitchId) {
            this.dbProxyEndpointVswitchId = dbProxyEndpointVswitchId;
            return this;
        }

        /**
         * <p>The zone ID of the proxy terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
        public Builder dbProxyEndpointZoneId(String dbProxyEndpointZoneId) {
            this.dbProxyEndpointZoneId = dbProxyEndpointZoneId;
            return this;
        }

        /**
         * <p>An array that consists of the information about the proxy endpoint.</p>
         */
        public Builder endpointConnectItems(EndpointConnectItems endpointConnectItems) {
            this.endpointConnectItems = endpointConnectItems;
            return this;
        }

        /**
         * <p>The method that is used to assign read weights. For more information, see <a href="https://help.aliyun.com/document_detail/96076.html">Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances</a>. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: The system automatically assigns read weights to the instance and its read-only instances based on the specifications of these instances.</li>
         * <li><strong>Custom</strong>: You must manually assign read weights to the instance and its read-only instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        public Builder readOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
            this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
            return this;
        }

        /**
         * <p>The latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the specified threshold, ApsaraDB RDS no longer forwards read requests to the read-only instance.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder readOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
            this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * <p>The read weights of the instance and its read-only instances. The value of this parameter is a JSON string that consists of the following parameters:</p>
         * <ul>
         * <li><strong>DBInstanceId</strong>: the ID of the instance.</li>
         * <li><strong>DBInstanceType</strong>: the role of the instance. Valid values: <strong>Master</strong> and <strong>ReadOnly</strong>.</li>
         * <li><strong>NodeID</strong>: The IDs of the primary and secondary nodes of the cluster. An instance that runs RDS Cluster Edition refers to a cluster.</li>
         * <li><strong>NodeType</strong>: The node type. Valid values: <strong>Primary</strong> and <strong>Secondary</strong>.</li>
         * <li><strong>Weight</strong>: the read weight of the instance. The read weight increases in increments of <strong>100</strong> and cannot exceed <strong>10000</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Availability&quot;:&quot;Available&quot;,&quot;DBInstanceId&quot;:&quot;rr-bp176984qewd8****&quot;,&quot;DBInstanceType&quot;:&quot;ReadOnly&quot;,&quot;Weight&quot;:400},{&quot;Availability&quot;:&quot;Available&quot;,&quot;DBInstanceId&quot;:&quot;rm-bp1ja4f56s7us****&quot;,&quot;DBInstanceType&quot;:&quot;Master&quot;,&quot;Weight&quot;:0}]</p>
         */
        public Builder readOnlyInstanceWeight(String readOnlyInstanceWeight) {
            this.readOnlyInstanceWeight = readOnlyInstanceWeight;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>847BA085-B377-4BFA-8267-F82345ECE1D2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBProxyEndpointResponseBody build() {
            return new DescribeDBProxyEndpointResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBProxyEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyEndpointResponseBody</p>
     */
    public static class DBProxyNodesDBProxyNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("zoneId")
        private String zoneId;

        private DBProxyNodesDBProxyNodes(Builder builder) {
            this.cpuCores = builder.cpuCores;
            this.nodeId = builder.nodeId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyNodesDBProxyNodes create() {
            return builder().build();
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String cpuCores; 
            private String nodeId; 
            private String zoneId; 

            /**
             * <p>The number of CPU cores of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The ID of the node in the zone.</p>
             * 
             * <strong>example:</strong>
             * <p>pn-xxxxxxx01</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The zone ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-c</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DBProxyNodesDBProxyNodes build() {
                return new DBProxyNodesDBProxyNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyEndpointResponseBody</p>
     */
    public static class DBProxyNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBProxyNodes")
        private java.util.List<DBProxyNodesDBProxyNodes> DBProxyNodes;

        private DBProxyNodes(Builder builder) {
            this.DBProxyNodes = builder.DBProxyNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBProxyNodes create() {
            return builder().build();
        }

        /**
         * @return DBProxyNodes
         */
        public java.util.List<DBProxyNodesDBProxyNodes> getDBProxyNodes() {
            return this.DBProxyNodes;
        }

        public static final class Builder {
            private java.util.List<DBProxyNodesDBProxyNodes> DBProxyNodes; 

            /**
             * <p>The proxy nodes that are associated with the proxy terminal.</p>
             */
            public Builder DBProxyNodes(java.util.List<DBProxyNodesDBProxyNodes> DBProxyNodes) {
                this.DBProxyNodes = DBProxyNodes;
                return this;
            }

            public DBProxyNodes build() {
                return new DBProxyNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyEndpointResponseBody</p>
     */
    public static class EndpointConnectItemsEndpointConnectItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbProxyEndpointConnectString")
        private String dbProxyEndpointConnectString;

        @com.aliyun.core.annotation.NameInMap("DbProxyEndpointNetType")
        private String dbProxyEndpointNetType;

        @com.aliyun.core.annotation.NameInMap("DbProxyEndpointPort")
        private String dbProxyEndpointPort;

        private EndpointConnectItemsEndpointConnectItems(Builder builder) {
            this.dbProxyEndpointConnectString = builder.dbProxyEndpointConnectString;
            this.dbProxyEndpointNetType = builder.dbProxyEndpointNetType;
            this.dbProxyEndpointPort = builder.dbProxyEndpointPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConnectItemsEndpointConnectItems create() {
            return builder().build();
        }

        /**
         * @return dbProxyEndpointConnectString
         */
        public String getDbProxyEndpointConnectString() {
            return this.dbProxyEndpointConnectString;
        }

        /**
         * @return dbProxyEndpointNetType
         */
        public String getDbProxyEndpointNetType() {
            return this.dbProxyEndpointNetType;
        }

        /**
         * @return dbProxyEndpointPort
         */
        public String getDbProxyEndpointPort() {
            return this.dbProxyEndpointPort;
        }

        public static final class Builder {
            private String dbProxyEndpointConnectString; 
            private String dbProxyEndpointNetType; 
            private String dbProxyEndpointPort; 

            /**
             * <p>The proxy endpoint queried.</p>
             * 
             * <strong>example:</strong>
             * <p>testproxy****.rwlb.rds.aliyuncs.com</p>
             */
            public Builder dbProxyEndpointConnectString(String dbProxyEndpointConnectString) {
                this.dbProxyEndpointConnectString = dbProxyEndpointConnectString;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Internet</li>
             * <li><strong>1</strong>: classic network</li>
             * <li><strong>2</strong>: virtual private cloud (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder dbProxyEndpointNetType(String dbProxyEndpointNetType) {
                this.dbProxyEndpointNetType = dbProxyEndpointNetType;
                return this;
            }

            /**
             * <p>The port number that is associated with the proxy endpoint. Default value: <strong>3306</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3306</p>
             */
            public Builder dbProxyEndpointPort(String dbProxyEndpointPort) {
                this.dbProxyEndpointPort = dbProxyEndpointPort;
                return this;
            }

            public EndpointConnectItemsEndpointConnectItems build() {
                return new EndpointConnectItemsEndpointConnectItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBProxyEndpointResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBProxyEndpointResponseBody</p>
     */
    public static class EndpointConnectItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointConnectItems")
        private java.util.List<EndpointConnectItemsEndpointConnectItems> endpointConnectItems;

        private EndpointConnectItems(Builder builder) {
            this.endpointConnectItems = builder.endpointConnectItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConnectItems create() {
            return builder().build();
        }

        /**
         * @return endpointConnectItems
         */
        public java.util.List<EndpointConnectItemsEndpointConnectItems> getEndpointConnectItems() {
            return this.endpointConnectItems;
        }

        public static final class Builder {
            private java.util.List<EndpointConnectItemsEndpointConnectItems> endpointConnectItems; 

            /**
             * <p>An array that consists of the information about the proxy endpoint.</p>
             */
            public Builder endpointConnectItems(java.util.List<EndpointConnectItemsEndpointConnectItems> endpointConnectItems) {
                this.endpointConnectItems = endpointConnectItems;
                return this;
            }

            public EndpointConnectItems build() {
                return new EndpointConnectItems(this);
            } 

        } 

    }
}
