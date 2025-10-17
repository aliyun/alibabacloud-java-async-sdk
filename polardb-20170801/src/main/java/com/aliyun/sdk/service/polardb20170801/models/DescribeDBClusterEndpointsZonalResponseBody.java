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
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * RequestId.
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
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * DashboardUsed.
             */
            public Builder dashboardUsed(Boolean dashboardUsed) {
                this.dashboardUsed = dashboardUsed;
                return this;
            }

            /**
             * IPAddress.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * PrivateZoneConnectionString.
             */
            public Builder privateZoneConnectionString(String privateZoneConnectionString) {
                this.privateZoneConnectionString = privateZoneConnectionString;
                return this;
            }

            /**
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcInstanceId.
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
             * AddressItems.
             */
            public Builder addressItems(java.util.List<AddressItems> addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * AutoAddNewNodes.
             */
            public Builder autoAddNewNodes(String autoAddNewNodes) {
                this.autoAddNewNodes = autoAddNewNodes;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * DBEndpointDescription.
             */
            public Builder DBEndpointDescription(String DBEndpointDescription) {
                this.DBEndpointDescription = DBEndpointDescription;
                return this;
            }

            /**
             * DBEndpointId.
             */
            public Builder DBEndpointId(String DBEndpointId) {
                this.DBEndpointId = DBEndpointId;
                return this;
            }

            /**
             * EndpointConfig.
             */
            public Builder endpointConfig(String endpointConfig) {
                this.endpointConfig = endpointConfig;
                return this;
            }

            /**
             * EndpointType.
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * NodeWithRoles.
             */
            public Builder nodeWithRoles(String nodeWithRoles) {
                this.nodeWithRoles = nodeWithRoles;
                return this;
            }

            /**
             * Nodes.
             */
            public Builder nodes(String nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * PolarSccTimeoutAction.
             */
            public Builder polarSccTimeoutAction(String polarSccTimeoutAction) {
                this.polarSccTimeoutAction = polarSccTimeoutAction;
                return this;
            }

            /**
             * PolarSccWaitTimeout.
             */
            public Builder polarSccWaitTimeout(String polarSccWaitTimeout) {
                this.polarSccWaitTimeout = polarSccWaitTimeout;
                return this;
            }

            /**
             * ReadWriteMode.
             */
            public Builder readWriteMode(String readWriteMode) {
                this.readWriteMode = readWriteMode;
                return this;
            }

            /**
             * SccMode.
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
