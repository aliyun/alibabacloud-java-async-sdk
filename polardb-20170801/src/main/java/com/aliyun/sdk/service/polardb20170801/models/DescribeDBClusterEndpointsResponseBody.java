// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBClusterEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterEndpointsResponseBody</p>
 */
public class DescribeDBClusterEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterEndpointsResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private String requestId; 

        /**
         * The details of the endpoints.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterEndpointsResponseBody build() {
            return new DescribeDBClusterEndpointsResponseBody(this);
        } 

    } 

    public static class AddressItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("PrivateZoneConnectionString")
        private String privateZoneConnectionString;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private AddressItems(Builder builder) {
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.netType = builder.netType;
            this.port = builder.port;
            this.privateZoneConnectionString = builder.privateZoneConnectionString;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressItems create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
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

        /**
         * @return privateZoneConnectionString
         */
        public String getPrivateZoneConnectionString() {
            return this.privateZoneConnectionString;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        public static final class Builder {
            private String connectionString; 
            private String IPAddress; 
            private String netType; 
            private String port; 
            private String privateZoneConnectionString; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcInstanceId; 

            /**
             * The endpoint.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The network type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Public**
             * *   **Private**
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * The port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The private domain name that is bound to the endpoint.
             */
            public Builder privateZoneConnectionString(String privateZoneConnectionString) {
                this.privateZoneConnectionString = privateZoneConnectionString;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) instance.
             * <p>
             * 
             * > This parameter is returned for only PolarDB for MySQL clusters.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public AddressItems build() {
                return new AddressItems(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressItems")
        private java.util.List < AddressItems> addressItems;

        @com.aliyun.core.annotation.NameInMap("AutoAddNewNodes")
        private String autoAddNewNodes;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBEndpointDescription")
        private String DBEndpointDescription;

        @com.aliyun.core.annotation.NameInMap("DBEndpointId")
        private String DBEndpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointConfig")
        private String endpointConfig;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("NodeWithRoles")
        private String nodeWithRoles;

        @com.aliyun.core.annotation.NameInMap("Nodes")
        private String nodes;

        @com.aliyun.core.annotation.NameInMap("ReadWriteMode")
        private String readWriteMode;

        private Items(Builder builder) {
            this.addressItems = builder.addressItems;
            this.autoAddNewNodes = builder.autoAddNewNodes;
            this.DBClusterId = builder.DBClusterId;
            this.DBEndpointDescription = builder.DBEndpointDescription;
            this.DBEndpointId = builder.DBEndpointId;
            this.endpointConfig = builder.endpointConfig;
            this.endpointType = builder.endpointType;
            this.nodeWithRoles = builder.nodeWithRoles;
            this.nodes = builder.nodes;
            this.readWriteMode = builder.readWriteMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return addressItems
         */
        public java.util.List < AddressItems> getAddressItems() {
            return this.addressItems;
        }

        /**
         * @return autoAddNewNodes
         */
        public String getAutoAddNewNodes() {
            return this.autoAddNewNodes;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBEndpointDescription
         */
        public String getDBEndpointDescription() {
            return this.DBEndpointDescription;
        }

        /**
         * @return DBEndpointId
         */
        public String getDBEndpointId() {
            return this.DBEndpointId;
        }

        /**
         * @return endpointConfig
         */
        public String getEndpointConfig() {
            return this.endpointConfig;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return nodeWithRoles
         */
        public String getNodeWithRoles() {
            return this.nodeWithRoles;
        }

        /**
         * @return nodes
         */
        public String getNodes() {
            return this.nodes;
        }

        /**
         * @return readWriteMode
         */
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

        public static final class Builder {
            private java.util.List < AddressItems> addressItems; 
            private String autoAddNewNodes; 
            private String DBClusterId; 
            private String DBEndpointDescription; 
            private String DBEndpointId; 
            private String endpointConfig; 
            private String endpointType; 
            private String nodeWithRoles; 
            private String nodes; 
            private String readWriteMode; 

            /**
             * The details of the endpoint.
             */
            public Builder addressItems(java.util.List < AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * Indicates whether new nodes are automatically associated with the default cluster endpoint. Valid values:
             * <p>
             * 
             * *   **Enable**
             * *   **Disable**
             */
            public Builder autoAddNewNodes(String autoAddNewNodes) {
                this.autoAddNewNodes = autoAddNewNodes;
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
             * The name of the endpoint.
             */
            public Builder DBEndpointDescription(String DBEndpointDescription) {
                this.DBEndpointDescription = DBEndpointDescription;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * The advanced configurations of the endpoint.
             * <p>
             * 
             * *   **DistributedTransaction**: indicates whether transaction splitting is enabled. Valid values:
             * 
             *     *   **on**
             *     *   **off**
             * 
             * *   **ConsistLevel**: the consistency level of sessions. Valid values:
             * 
             *     *   **0**: eventual consistency.
             *     *   **1**: session consistency.
             *     *   **2**: global consistency.
             * 
             * *   **LoadBalanceStrategy**: the load balancing policy that automatically schedules loads. Only **load** may be returned.
             * 
             * *   **MasterAcceptReads**: indicates whether the primary node processes read requests. Valid values:
             * 
             *     *   **on**
             *     *   **off**
             */
            public Builder endpointConfig(String endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Cluster**: the default endpoint.
             * *   **Primary**: the primary endpoint.
             * *   **Custom**: a custom cluster endpoint.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The role name of each node in the endpoint. The role name of the primary node is **Writer**. Multiple read-only nodes can be associated with an endpoint. Therefore, the role name of each read-only node is suffixed with a number, such as **Reader1** and **Reader2**.
             * <p>
             * 
             * > This parameter is valid only for PolarDB for PostgreSQL clusters and PolarDB for PostgreSQL (Compatible with Oracle)) clusters.
             */
            public Builder nodeWithRoles(String nodeWithRoles) {
                this.nodeWithRoles = nodeWithRoles;
                return this;
            }

            /**
             * The nodes in the endpoint.
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * The read/write mode. Valid values:
             * <p>
             * 
             * *   **ReadWrite**: handles read and write requests. Automatic read/write splitting is enabled.
             * *   **ReadOnly**: handles read-only requests.
             */
            public Builder readWriteMode(String readWriteMode) {
                this.readWriteMode = readWriteMode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
