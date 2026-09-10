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
 * {@link DescribeDBClusterEndpointsZonalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterEndpointsZonalResponseBody</p>
 */
public class DescribeDBClusterEndpointsZonalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBClusterEndpointsZonalResponseBody(Builder builder) {
        this.items = builder.items;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClusterEndpointsZonalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDBClusterEndpointsZonalResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the cluster endpoints.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2DC120BF-6EBA-4C63-BE99-B09F9E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterEndpointsZonalResponseBody build() {
            return new DescribeDBClusterEndpointsZonalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterEndpointsZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterEndpointsZonalResponseBody</p>
     */
    public static class AddressItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("DashboardUsed")
        private Boolean dashboardUsed;

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
            this.dashboardUsed = builder.dashboardUsed;
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
         * @return dashboardUsed
         */
        public Boolean getDashboardUsed() {
            return this.dashboardUsed;
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
            private Boolean dashboardUsed; 
            private String IPAddress; 
            private String netType; 
            private String port; 
            private String privateZoneConnectionString; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcInstanceId; 

            private Builder() {
            } 

            private Builder(AddressItems model) {
                this.connectionString = model.connectionString;
                this.dashboardUsed = model.dashboardUsed;
                this.IPAddress = model.IPAddress;
                this.netType = model.netType;
                this.port = model.port;
                this.privateZoneConnectionString = model.privateZoneConnectionString;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.vpcInstanceId = model.vpcInstanceId;
            } 

            /**
             * <p>The connection string.</p>
             * 
             * <strong>example:</strong>
             * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>Specifies whether the endpoint is the dashboard endpoint of a PolarDB search node. Valid values:</p>
             * <ul>
             * <li><p>True: Yes.</p>
             * </li>
             * <li><p>False: No.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder dashboardUsed(Boolean dashboardUsed) {
                this.dashboardUsed = dashboardUsed;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>192.<em><strong>.</strong></em>.***</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The network type. Valid values:</p>
             * <ul>
             * <li><p>Public: Internet.</p>
             * </li>
             * <li><p>Private: internal network.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>1521</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The private domain name that is bound to the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><em><strong>.</strong></em>.**.com</p>
             */
            public Builder privateZoneConnectionString(String privateZoneConnectionString) {
                this.privateZoneConnectionString = privateZoneConnectionString;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-***************</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The virtual switch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-************</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-*************</p>
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
    /**
     * 
     * {@link DescribeDBClusterEndpointsZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterEndpointsZonalResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressItems")
        private java.util.List<AddressItems> addressItems;

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

        @com.aliyun.core.annotation.NameInMap("PolarSccTimeoutAction")
        private String polarSccTimeoutAction;

        @com.aliyun.core.annotation.NameInMap("PolarSccWaitTimeout")
        private String polarSccWaitTimeout;

        @com.aliyun.core.annotation.NameInMap("ReadWriteMode")
        private String readWriteMode;

        @com.aliyun.core.annotation.NameInMap("SccMode")
        private String sccMode;

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
            this.polarSccTimeoutAction = builder.polarSccTimeoutAction;
            this.polarSccWaitTimeout = builder.polarSccWaitTimeout;
            this.readWriteMode = builder.readWriteMode;
            this.sccMode = builder.sccMode;
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
        public java.util.List<AddressItems> getAddressItems() {
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
         * @return polarSccTimeoutAction
         */
        public String getPolarSccTimeoutAction() {
            return this.polarSccTimeoutAction;
        }

        /**
         * @return polarSccWaitTimeout
         */
        public String getPolarSccWaitTimeout() {
            return this.polarSccWaitTimeout;
        }

        /**
         * @return readWriteMode
         */
        public String getReadWriteMode() {
            return this.readWriteMode;
        }

        /**
         * @return sccMode
         */
        public String getSccMode() {
            return this.sccMode;
        }

        public static final class Builder {
            private java.util.List<AddressItems> addressItems; 
            private String autoAddNewNodes; 
            private String DBClusterId; 
            private String DBEndpointDescription; 
            private String DBEndpointId; 
            private String endpointConfig; 
            private String endpointType; 
            private String nodeWithRoles; 
            private String nodes; 
            private String polarSccTimeoutAction; 
            private String polarSccWaitTimeout; 
            private String readWriteMode; 
            private String sccMode; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.addressItems = model.addressItems;
                this.autoAddNewNodes = model.autoAddNewNodes;
                this.DBClusterId = model.DBClusterId;
                this.DBEndpointDescription = model.DBEndpointDescription;
                this.DBEndpointId = model.DBEndpointId;
                this.endpointConfig = model.endpointConfig;
                this.endpointType = model.endpointType;
                this.nodeWithRoles = model.nodeWithRoles;
                this.nodes = model.nodes;
                this.polarSccTimeoutAction = model.polarSccTimeoutAction;
                this.polarSccWaitTimeout = model.polarSccWaitTimeout;
                this.readWriteMode = model.readWriteMode;
                this.sccMode = model.sccMode;
            } 

            /**
             * <p>The connection string information.</p>
             */
            public Builder addressItems(java.util.List<AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * <p>Specifies whether new nodes are automatically added to the default cluster endpoint. Valid values:</p>
             * <ul>
             * <li><p>Enable.</p>
             * </li>
             * <li><p>Disable.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Enable</p>
             */
            public Builder autoAddNewNodes(String autoAddNewNodes) {
                this.autoAddNewNodes = autoAddNewNodes;
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
             * <p>The name of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder DBEndpointDescription(String DBEndpointDescription) {
                this.DBEndpointDescription = DBEndpointDescription;
                return this;
            }

            /**
             * <p>The endpoint ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-*************</p>
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * <p>The advanced configurations of the cluster endpoint.</p>
             * <ul>
             * <li><p><strong>DistributedTransaction</strong>: The status of transaction splitting. Valid values:</p>
             * <ul>
             * <li><p><strong>on</strong>: Transaction splitting is enabled.</p>
             * </li>
             * <li><p><strong>off</strong>: Transaction splitting is disabled.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>ConsistLevel</strong>: The consistency level. Valid values:</p>
             * <ul>
             * <li><p><strong>0</strong>: Eventual consistency.</p>
             * </li>
             * <li><p><strong>1</strong>: Session consistency.</p>
             * </li>
             * <li><p><strong>2</strong>: Global consistency.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p><strong>LoadBalanceStrategy</strong>: The load balancing policy for automatic scheduling based on loads. The value is fixed as <strong>load</strong>.</p>
             * </li>
             * <li><p><strong>MasterAcceptReads</strong>: Specifies whether the primary node accepts read requests. Valid values:</p>
             * <ul>
             * <li><p><strong>on</strong>: The primary node accepts read requests.</p>
             * </li>
             * <li><p><strong>off</strong>: The primary node does not accept read requests.</p>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;DistributedTransaction\&quot;:\&quot;off\&quot;,\&quot;ConsistLevel\&quot;:\&quot;0\&quot;,\&quot;LoadBalanceStrategy\&quot;:\&quot;load\&quot;,\&quot;MasterAcceptReads\&quot;:\&quot;on\&quot;}</p>
             */
            public Builder endpointConfig(String endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * <p>The type of the cluster endpoint. Valid values:</p>
             * <ul>
             * <li><p>Cluster: the default cluster endpoint.</p>
             * </li>
             * <li><p>Primary: the primary endpoint.</p>
             * </li>
             * <li><p>Custom: a custom cluster endpoint.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Custom</p>
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * <p>The role of each node in the endpoint. The primary node has the Writer role. Because multiple read-only nodes can be added to an endpoint, each read-only node is assigned a role name suffixed with a number, such as Reader1 and Reader2.</p>
             * 
             * <strong>example:</strong>
             * <p>Reader1</p>
             */
            public Builder nodeWithRoles(String nodeWithRoles) {
                this.nodeWithRoles = nodeWithRoles;
                return this;
            }

            /**
             * <p>The list of nodes that are configured for the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-<em><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></em></p>
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The policy for global consistency timeout. Valid values:</p>
             * <ul>
             * <li><p>0: Sends the request to the primary node.</p>
             * </li>
             * <li><p>2: Degrades the request. If a global consistency read times out, the query is automatically degraded to a regular request. The client does not receive an error message.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder polarSccTimeoutAction(String polarSccTimeoutAction) {
                this.polarSccTimeoutAction = polarSccTimeoutAction;
                return this;
            }

            /**
             * <p>The timeout period for global consistency.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder polarSccWaitTimeout(String polarSccWaitTimeout) {
                this.polarSccWaitTimeout = polarSccWaitTimeout;
                return this;
            }

            /**
             * <p>The read/write mode. Valid values:</p>
             * <ul>
             * <li><p>ReadWrite: read and write (automatic read/write splitting).</p>
             * </li>
             * <li><p>ReadOnly: read-only.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReadOnly</p>
             */
            public Builder readWriteMode(String readWriteMode) {
                this.readWriteMode = readWriteMode;
                return this;
            }

            /**
             * <p>Specifies whether global consistency (high-performance mode) is enabled for the node. Valid values:</p>
             * <ul>
             * <li><p>on: enabled.</p>
             * </li>
             * <li><p>off: disabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder sccMode(String sccMode) {
                this.sccMode = sccMode;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
