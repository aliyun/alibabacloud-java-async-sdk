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
 * {@link DescribeDBClusterEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClusterEndpointsResponseBody</p>
 */
public class DescribeDBClusterEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

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

        private Builder(DescribeDBClusterEndpointsResponseBody model) {
            this.items = model.items;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the endpoints.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2DC120BF-6EBA-4C63-BE99-B09F9E******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBClusterEndpointsResponseBody build() {
            return new DescribeDBClusterEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClusterEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterEndpointsResponseBody</p>
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
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>********.rwlb.polardb-pg-public.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>Whether it is the dashboard endpoint of the PolarDB search node.</p>
             * <ul>
             * <li>Ture</li>
             * <li>False</li>
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
             * <p>The network type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong></li>
             * <li><strong>Private</strong></li>
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
             * <p>The port.</p>
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
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-***************</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-************</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) instance.</p>
             * <blockquote>
             * <p>This parameter is returned for only PolarDB for MySQL clusters.</p>
             * </blockquote>
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
     * {@link DescribeDBClusterEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClusterEndpointsResponseBody</p>
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
             * <p>The details of the endpoint.</p>
             */
            public Builder addressItems(java.util.List<AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * <p>Indicates whether new nodes are automatically associated with the default cluster endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Enable</strong></li>
             * <li><strong>Disable</strong></li>
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
             * <p>The ID of the cluster.</p>
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
             * <p>The ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>pe-*************</p>
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * <p>The advanced configurations of the endpoint.</p>
             * <ul>
             * <li><p><strong>DistributedTransaction</strong>: indicates whether transaction splitting is enabled. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>ConsistLevel</strong>: the consistency level of sessions. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: eventual consistency.</li>
             * <li><strong>1</strong>: session consistency.</li>
             * <li><strong>2</strong>: global consistency.</li>
             * </ul>
             * </li>
             * <li><p><strong>LoadBalanceStrategy</strong>: the load balancing policy that automatically schedules loads. Only <strong>load</strong> may be returned.</p>
             * </li>
             * <li><p><strong>MasterAcceptReads</strong>: indicates whether the primary node processes read requests. Valid values:</p>
             * <ul>
             * <li><strong>on</strong></li>
             * <li><strong>off</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;DistributedTransaction&quot;:&quot;off&quot;,&quot;ConsistLevel&quot;:&quot;0&quot;,&quot;LoadBalanceStrategy&quot;:&quot;load&quot;,&quot;MasterAcceptReads&quot;:&quot;on&quot;}</p>
             */
            public Builder endpointConfig(String endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Cluster</strong>: the default endpoint.</li>
             * <li><strong>Primary</strong>: the primary endpoint.</li>
             * <li><strong>Custom</strong>: a custom cluster endpoint.</li>
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
             * <p>The role name of each node in the endpoint. The role name of the primary node is <strong>Writer</strong>. Multiple read-only nodes can be associated with an endpoint. Therefore, the role name of each read-only node is suffixed with a number. For example, you can use <strong>Reader1</strong> and <strong>Reader2</strong> as the role names.</p>
             * <blockquote>
             * <p> This parameter is valid only for PolarDB for PostgreSQL clusters and PolarDB for PostgreSQL (Compatible with Oracle)) clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Reader1</p>
             */
            public Builder nodeWithRoles(String nodeWithRoles) {
                this.nodeWithRoles = nodeWithRoles;
                return this;
            }

            /**
             * <p>The nodes in the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>pi-<em><strong><strong><strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></strong></strong></em></p>
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The global consistency timeout policy. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: sends the request to the primary node.</li>
             * <li><strong>2</strong>: downgrades the consistency level of a query to inconsistent read when a global consistent read in the query times out. No error message is returned to the client.</li>
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
             * <p>Global consistency timeout.</p>
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
             * <li><strong>ReadWrite</strong>: handles read and write requests. Automatic read/write splitting is enabled.</li>
             * <li><strong>ReadOnly</strong>: handles read-only requests.</li>
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
             * <p>Indicates whether the global consistency (high-performance mode) feature is enabled for the node. Valid values:</p>
             * <ul>
             * <li><strong>on</strong>: enabled.</li>
             * <li><strong>off</strong>: disabled</li>
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
