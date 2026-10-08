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
    @com.aliyun.core.annotation.NameInMap("CausalConsistReadTimeout")
    private String causalConsistReadTimeout;

    @com.aliyun.core.annotation.NameInMap("DBProxyConnectString")
    private String DBProxyConnectString;

    @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringNetType")
    private String DBProxyConnectStringNetType;

    @com.aliyun.core.annotation.NameInMap("DBProxyConnectStringPort")
    private String DBProxyConnectStringPort;

    @com.aliyun.core.annotation.NameInMap("DBProxyEndpointCostThresholdForDuckdb")
    private String DBProxyEndpointCostThresholdForDuckdb;

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

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointVpcId")
    private String dbProxyEndpointVpcId;

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
        this.causalConsistReadTimeout = builder.causalConsistReadTimeout;
        this.DBProxyConnectString = builder.DBProxyConnectString;
        this.DBProxyConnectStringNetType = builder.DBProxyConnectStringNetType;
        this.DBProxyConnectStringPort = builder.DBProxyConnectStringPort;
        this.DBProxyEndpointCostThresholdForDuckdb = builder.DBProxyEndpointCostThresholdForDuckdb;
        this.DBProxyEndpointId = builder.DBProxyEndpointId;
        this.DBProxyEndpointMinSlaveCount = builder.DBProxyEndpointMinSlaveCount;
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyFeatures = builder.DBProxyFeatures;
        this.DBProxyNodes = builder.DBProxyNodes;
        this.dbProxyEndpointAliases = builder.dbProxyEndpointAliases;
        this.dbProxyEndpointReadWriteMode = builder.dbProxyEndpointReadWriteMode;
        this.dbProxyEndpointVpcId = builder.dbProxyEndpointVpcId;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return causalConsistReadTimeout
     */
    public String getCausalConsistReadTimeout() {
        return this.causalConsistReadTimeout;
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
     * @return DBProxyEndpointCostThresholdForDuckdb
     */
    public String getDBProxyEndpointCostThresholdForDuckdb() {
        return this.DBProxyEndpointCostThresholdForDuckdb;
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
     * @return dbProxyEndpointVpcId
     */
    public String getDbProxyEndpointVpcId() {
        return this.dbProxyEndpointVpcId;
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
        private String causalConsistReadTimeout; 
        private String DBProxyConnectString; 
        private String DBProxyConnectStringNetType; 
        private String DBProxyConnectStringPort; 
        private String DBProxyEndpointCostThresholdForDuckdb; 
        private String DBProxyEndpointId; 
        private String DBProxyEndpointMinSlaveCount; 
        private String DBProxyEngineType; 
        private String DBProxyFeatures; 
        private DBProxyNodes DBProxyNodes; 
        private String dbProxyEndpointAliases; 
        private String dbProxyEndpointReadWriteMode; 
        private String dbProxyEndpointVpcId; 
        private String dbProxyEndpointVswitchId; 
        private String dbProxyEndpointZoneId; 
        private EndpointConnectItems endpointConnectItems; 
        private String readOnlyInstanceDistributionType; 
        private String readOnlyInstanceMaxDelayTime; 
        private String readOnlyInstanceWeight; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBProxyEndpointResponseBody model) {
            this.causalConsistReadTimeout = model.causalConsistReadTimeout;
            this.DBProxyConnectString = model.DBProxyConnectString;
            this.DBProxyConnectStringNetType = model.DBProxyConnectStringNetType;
            this.DBProxyConnectStringPort = model.DBProxyConnectStringPort;
            this.DBProxyEndpointCostThresholdForDuckdb = model.DBProxyEndpointCostThresholdForDuckdb;
            this.DBProxyEndpointId = model.DBProxyEndpointId;
            this.DBProxyEndpointMinSlaveCount = model.DBProxyEndpointMinSlaveCount;
            this.DBProxyEngineType = model.DBProxyEngineType;
            this.DBProxyFeatures = model.DBProxyFeatures;
            this.DBProxyNodes = model.DBProxyNodes;
            this.dbProxyEndpointAliases = model.dbProxyEndpointAliases;
            this.dbProxyEndpointReadWriteMode = model.dbProxyEndpointReadWriteMode;
            this.dbProxyEndpointVpcId = model.dbProxyEndpointVpcId;
            this.dbProxyEndpointVswitchId = model.dbProxyEndpointVswitchId;
            this.dbProxyEndpointZoneId = model.dbProxyEndpointZoneId;
            this.endpointConnectItems = model.endpointConnectItems;
            this.readOnlyInstanceDistributionType = model.readOnlyInstanceDistributionType;
            this.readOnlyInstanceMaxDelayTime = model.readOnlyInstanceMaxDelayTime;
            this.readOnlyInstanceWeight = model.readOnlyInstanceWeight;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The timeout period for consistency reads. Unit: milliseconds. Default value: <strong>10</strong>. Valid values: <strong>0 to 60000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder causalConsistReadTimeout(String causalConsistReadTimeout) {
            this.causalConsistReadTimeout = causalConsistReadTimeout;
            return this;
        }

        /**
         * <p>The proxy endpoint.</p>
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
         * <li><strong>InnerString</strong>: internal endpoint.</li>
         * <li><strong>OuterString</strong>: public endpoint.</li>
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
         * <p>The port of the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        public Builder DBProxyConnectStringPort(String DBProxyConnectStringPort) {
            this.DBProxyConnectStringPort = DBProxyConnectStringPort;
            return this;
        }

        /**
         * DBProxyEndpointCostThresholdForDuckdb.
         */
        public Builder DBProxyEndpointCostThresholdForDuckdb(String DBProxyEndpointCostThresholdForDuckdb) {
            this.DBProxyEndpointCostThresholdForDuckdb = DBProxyEndpointCostThresholdForDuckdb;
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
         * <p>The settings of the proxy endpoint in JSON format. The following parameters are included:</p>
         * <ul>
         * <li><strong>TransactionReadSqlRouteOptimizeStatus</strong>: the transaction splitting setting. The value is <strong>0</strong> (disabled) or <strong>1</strong> (enabled).</li>
         * <li><strong>ConnectionPersist</strong>: the connection pool setting. The value is <strong>0</strong> (disabled), <strong>1</strong> (session-level connection pool), or <strong>2</strong> (transaction-level connection pooling).</li>
         * <li><strong>ReadWriteSpliting</strong>: the read/write splitting setting. The value is <strong>0</strong> (disabled) or <strong>1</strong> (enabled).</li>
         * <li><strong>AZProximityAccess</strong>: the nearest access feature. The value is <strong>0</strong> (disabled) or <strong>1</strong> (enabled).</li>
         * <li><strong>CausalConsistRead</strong>: the read consistency setting. The value is <strong>0</strong> (eventual consistency), <strong>1</strong> (session consistency), or <strong>2</strong> (global consistency).</li>
         * <li><strong>HtapFilter</strong>: the automatic request distribution among row store and column store nodes setting. The value is <strong>0</strong> (disabled) or <strong>1</strong> (enabled).</li>
         * <li><strong>PinPreparedStmt</strong>: visible only for ApsaraDB RDS for PostgreSQL. This is an internal parameter.</li>
         * </ul>
         * <blockquote>
         * <p>ApsaraDB RDS for PostgreSQL supports modification of only <strong>ReadWriteSpliting</strong>. <strong>TransactionReadSqlRouteOptimizeStatus</strong> and <strong>PinPreparedStmt</strong> are set to 1 by default.</p>
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
         * DBProxyNodes.
         */
        public Builder DBProxyNodes(DBProxyNodes DBProxyNodes) {
            this.DBProxyNodes = DBProxyNodes;
            return this;
        }

        /**
         * <p>The description of the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>proxyterminal-test</p>
         */
        public Builder dbProxyEndpointAliases(String dbProxyEndpointAliases) {
            this.dbProxyEndpointAliases = dbProxyEndpointAliases;
            return this;
        }

        /**
         * <p>The read/write type of the proxy endpoint. Valid values:</p>
         * <ul>
         * <li><strong>ReadWrite</strong>: read/write splitting mode.</li>
         * <li><strong>ReadOnly</strong>: read-only mode.</li>
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
         * <p>The VPC ID of the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-****</p>
         */
        public Builder dbProxyEndpointVpcId(String dbProxyEndpointVpcId) {
            this.dbProxyEndpointVpcId = dbProxyEndpointVpcId;
            return this;
        }

        /**
         * <p>The vSwitch ID of the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-****</p>
         */
        public Builder dbProxyEndpointVswitchId(String dbProxyEndpointVswitchId) {
            this.dbProxyEndpointVswitchId = dbProxyEndpointVswitchId;
            return this;
        }

        /**
         * <p>The zone information of the proxy endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-c</p>
         */
        public Builder dbProxyEndpointZoneId(String dbProxyEndpointZoneId) {
            this.dbProxyEndpointZoneId = dbProxyEndpointZoneId;
            return this;
        }

        /**
         * EndpointConnectItems.
         */
        public Builder endpointConnectItems(EndpointConnectItems endpointConnectItems) {
            this.endpointConnectItems = endpointConnectItems;
            return this;
        }

        /**
         * <p>The read weight distribution mode. For more information, see <a href="https://help.aliyun.com/document_detail/96076.html">Read weight distribution</a>. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: automatically distributes weights based on instance specifications.</li>
         * <li><strong>Custom</strong>: uses custom weight distribution.</li>
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
         * <p>The latency threshold for read/write splitting. When the latency of a read-only instance exceeds this threshold, read traffic is not routed to the instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder readOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
            this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * <p>The read weight distribution information, which specifies the read request weights of the primary instance and read-only instances. The value is in JSON format and includes the following parameters:</p>
         * <ul>
         * <li><strong>DBInstanceId</strong>: the instance ID.</li>
         * <li><strong>DBInstanceType</strong>: the instance type. The value is <strong>Master</strong> (primary instance) or <strong>ReadOnly</strong> (read-only instance).</li>
         * <li><strong>NodeID</strong>: the node ID of the primary node or secondary node of the primary instance in the Cluster Edition.</li>
         * <li><strong>NodeType</strong>: the node type in the Cluster Edition. The value is <strong>Primary</strong> (primary node of the primary instance) or <strong>Secondary</strong> (secondary node of the primary instance).</li>
         * <li><strong>Weight</strong>: the read request weight. The value increases in increments of <strong>100</strong>. Maximum value: <strong>10000</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;Availability\&quot;:\&quot;Available\&quot;,\&quot;DBInstanceId\&quot;:\&quot;rm-2z****\&quot;，\&quot;DBInstanceType\&quot;:\&quot;Master\&quot;,\&quot;NodeId\&quot;:\&quot;rn-t2****\&quot;,\&quot;NodeType\&quot;:\&quot;Primary\&quot;,\&quot;Weight\&quot;:0}, {\&quot;Availability\&quot;:\&quot;Available\&quot;,\&quot;DBInstanceId\&quot;:\&quot;rm-2z****\&quot;，\&quot;DBInstanceType\&quot;:\&quot;Master\&quot;,\&quot;NodeId\&quot;:\&quot;rn-z9****\&quot;,\&quot;NodeType\&quot;:\&quot;Secondary\&quot;,\&quot;Weight\&quot;:400}, {\&quot;Availability\&quot;:\&quot;Available\&quot;,,\&quot;DBInstanceId\&quot;:\&quot;rm-2z****\&quot;，\&quot;DBInstanceType\&quot;:\&quot;Master\&quot;,\&quot;NodeId\&quot;:\&quot;rn-1c****\&quot;,\&quot;NodeType\&quot;:\&quot;Secondary\&quot;,\&quot;Weight\&quot;:400}]]</p>
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

            private Builder() {
            } 

            private Builder(DBProxyNodesDBProxyNodes model) {
                this.cpuCores = model.cpuCores;
                this.nodeId = model.nodeId;
                this.zoneId = model.zoneId;
            } 

            /**
             * cpuCores.
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * nodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * zoneId.
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

            private Builder() {
            } 

            private Builder(DBProxyNodes model) {
                this.DBProxyNodes = model.DBProxyNodes;
            } 

            /**
             * DBProxyNodes.
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

            private Builder() {
            } 

            private Builder(EndpointConnectItemsEndpointConnectItems model) {
                this.dbProxyEndpointConnectString = model.dbProxyEndpointConnectString;
                this.dbProxyEndpointNetType = model.dbProxyEndpointNetType;
                this.dbProxyEndpointPort = model.dbProxyEndpointPort;
            } 

            /**
             * DbProxyEndpointConnectString.
             */
            public Builder dbProxyEndpointConnectString(String dbProxyEndpointConnectString) {
                this.dbProxyEndpointConnectString = dbProxyEndpointConnectString;
                return this;
            }

            /**
             * DbProxyEndpointNetType.
             */
            public Builder dbProxyEndpointNetType(String dbProxyEndpointNetType) {
                this.dbProxyEndpointNetType = dbProxyEndpointNetType;
                return this;
            }

            /**
             * DbProxyEndpointPort.
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

            private Builder() {
            } 

            private Builder(EndpointConnectItems model) {
                this.endpointConnectItems = model.endpointConnectItems;
            } 

            /**
             * EndpointConnectItems.
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
