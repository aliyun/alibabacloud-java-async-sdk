// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    @com.aliyun.core.annotation.NameInMap("DBProxyEngineType")
    private String DBProxyEngineType;

    @com.aliyun.core.annotation.NameInMap("DBProxyFeatures")
    private String DBProxyFeatures;

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointAliases")
    private String dbProxyEndpointAliases;

    @com.aliyun.core.annotation.NameInMap("DbProxyEndpointReadWriteMode")
    private String dbProxyEndpointReadWriteMode;

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
        this.DBProxyEngineType = builder.DBProxyEngineType;
        this.DBProxyFeatures = builder.DBProxyFeatures;
        this.dbProxyEndpointAliases = builder.dbProxyEndpointAliases;
        this.dbProxyEndpointReadWriteMode = builder.dbProxyEndpointReadWriteMode;
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
        private String DBProxyEngineType; 
        private String DBProxyFeatures; 
        private String dbProxyEndpointAliases; 
        private String dbProxyEndpointReadWriteMode; 
        private EndpointConnectItems endpointConnectItems; 
        private String readOnlyInstanceDistributionType; 
        private String readOnlyInstanceMaxDelayTime; 
        private String readOnlyInstanceWeight; 
        private String requestId; 

        /**
         * The proxy endpoint queried.
         */
        public Builder DBProxyConnectString(String DBProxyConnectString) {
            this.DBProxyConnectString = DBProxyConnectString;
            return this;
        }

        /**
         * The network type of the proxy endpoint. Valid values:
         * <p>
         * 
         * *   **InnerString**: internal network
         * *   **OuterString**: Internet
         */
        public Builder DBProxyConnectStringNetType(String DBProxyConnectStringNetType) {
            this.DBProxyConnectStringNetType = DBProxyConnectStringNetType;
            return this;
        }

        /**
         * The port number that is associated with the proxy endpoint.
         */
        public Builder DBProxyConnectStringPort(String DBProxyConnectStringPort) {
            this.DBProxyConnectStringPort = DBProxyConnectStringPort;
            return this;
        }

        /**
         * The ID of the proxy endpoint.
         */
        public Builder DBProxyEndpointId(String DBProxyEndpointId) {
            this.DBProxyEndpointId = DBProxyEndpointId;
            return this;
        }

        /**
         * An internal parameter. You can ignore this parameter.
         */
        public Builder DBProxyEngineType(String DBProxyEngineType) {
            this.DBProxyEngineType = DBProxyEngineType;
            return this;
        }

        /**
         * The configuration of the proxy terminal. The value of this parameter is a JSON string that consists of the following fields:
         * <p>
         * 
         * *   **TransactionReadSqlRouteOptimizeStatus**: the status of the transaction splitting feature. Valid values: **0** and **1**. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.
         * *   **ConnectionPersist**: the status of the connection pooling feature. Valid values: **0**, **1**, and **2**. The value 0 indicates that the connection pooling feature is disabled. The value 1 indicates that the session connection pooling feature is enabled. The value 2 indicates that the transaction connection pooling feature is enabled.
         * *   **ReadWriteSpliting**: the status of the read/write splitting feature. Valid values: **0** and **1**. The value 0 indicates that the feature is disabled. The value 1 indicates that the feature is enabled.
         * *   **PinPreparedStmt**: an internal field that is available only for ApsaraDB RDS for PostgreSQL instances.
         * 
         * >  If the instance runs PostgreSQL, you can change only the value of the **ReadWriteSpliting** field. The **TransactionReadSqlRouteOptimizeStatus** and **PinPreparedStmt** fields are set to their default values 1.
         */
        public Builder DBProxyFeatures(String DBProxyFeatures) {
            this.DBProxyFeatures = DBProxyFeatures;
            return this;
        }

        /**
         * The description of the proxy terminal.
         */
        public Builder dbProxyEndpointAliases(String dbProxyEndpointAliases) {
            this.dbProxyEndpointAliases = dbProxyEndpointAliases;
            return this;
        }

        /**
         * The read and write attributes of the proxy terminal. Valid values:
         * <p>
         * 
         * *   **ReadWrite**: The proxy terminal supports read and write requests.
         * *   **ReadOnly**: The proxy terminal supports only read requests.
         */
        public Builder dbProxyEndpointReadWriteMode(String dbProxyEndpointReadWriteMode) {
            this.dbProxyEndpointReadWriteMode = dbProxyEndpointReadWriteMode;
            return this;
        }

        /**
         * An array that consists of the information about the proxy endpoint.
         */
        public Builder endpointConnectItems(EndpointConnectItems endpointConnectItems) {
            this.endpointConnectItems = endpointConnectItems;
            return this;
        }

        /**
         * The method that is used to assign read weights. For more information, see [Modify the latency threshold and read weights of ApsaraDB RDS for MySQL instances](~~96076~~). Valid values:
         * <p>
         * 
         * *   **Standard**: The system automatically assigns read weights to the instance and its read-only instances based on the specifications of these instances.
         * *   **Custom**: You must manually assign read weights to the instance and its read-only instances.
         */
        public Builder readOnlyInstanceDistributionType(String readOnlyInstanceDistributionType) {
            this.readOnlyInstanceDistributionType = readOnlyInstanceDistributionType;
            return this;
        }

        /**
         * The latency threshold that is allowed for read/write splitting. If the latency on a read-only instance exceeds the specified threshold, ApsaraDB RDS no longer forwards read requests to the read-only instance.
         */
        public Builder readOnlyInstanceMaxDelayTime(String readOnlyInstanceMaxDelayTime) {
            this.readOnlyInstanceMaxDelayTime = readOnlyInstanceMaxDelayTime;
            return this;
        }

        /**
         * The read weights of the instance and its read-only instances. The value of this parameter is a JSON string that consists of the following parameters:
         * <p>
         * 
         * *   **DBInstanceId**: the ID of the instance.
         * *   **DBInstanceType**: the role of the instance. Valid values: **Master** and **ReadOnly**.
         * *   **NodeID**: The IDs of the primary and secondary nodes of the cluster. An instance that runs RDS Cluster Edition refers to a cluster.
         * *   **NodeType**: The node type. Valid values: **Primary** and **Secondary**.
         * *   **Weight**: the read weight of the instance. The read weight increases in increments of **100** and cannot exceed **10000**.
         */
        public Builder readOnlyInstanceWeight(String readOnlyInstanceWeight) {
            this.readOnlyInstanceWeight = readOnlyInstanceWeight;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBProxyEndpointResponseBody build() {
            return new DescribeDBProxyEndpointResponseBody(this);
        } 

    } 

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
             * The proxy endpoint queried.
             */
            public Builder dbProxyEndpointConnectString(String dbProxyEndpointConnectString) {
                this.dbProxyEndpointConnectString = dbProxyEndpointConnectString;
                return this;
            }

            /**
             * The network type of the instance. Valid values:
             * <p>
             * 
             * *   **0**: Internet
             * *   **1**: classic network
             * *   **2**: virtual private cloud (VPC)
             */
            public Builder dbProxyEndpointNetType(String dbProxyEndpointNetType) {
                this.dbProxyEndpointNetType = dbProxyEndpointNetType;
                return this;
            }

            /**
             * The port number that is associated with the proxy endpoint. Default value: **3306**.
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
    public static class EndpointConnectItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointConnectItems")
        private java.util.List < EndpointConnectItemsEndpointConnectItems> endpointConnectItems;

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
        public java.util.List < EndpointConnectItemsEndpointConnectItems> getEndpointConnectItems() {
            return this.endpointConnectItems;
        }

        public static final class Builder {
            private java.util.List < EndpointConnectItemsEndpointConnectItems> endpointConnectItems; 

            /**
             * An array that consists of the information about the proxy endpoint.
             */
            public Builder endpointConnectItems(java.util.List < EndpointConnectItemsEndpointConnectItems> endpointConnectItems) {
                this.endpointConnectItems = endpointConnectItems;
                return this;
            }

            public EndpointConnectItems build() {
                return new EndpointConnectItems(this);
            } 

        } 

    }
}
