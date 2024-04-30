// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceEndpointsResponseBody</p>
 */
public class DescribeDBInstanceEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceEndpointsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceEndpointsResponseBody build() {
            return new DescribeDBInstanceEndpointsResponseBody(this);
        } 

    } 

    public static class AddressItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IpAddress")
        private String ipAddress;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private String ipType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private AddressItem(Builder builder) {
            this.connectionString = builder.connectionString;
            this.ipAddress = builder.ipAddress;
            this.ipType = builder.ipType;
            this.port = builder.port;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressItem create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return ipAddress
         */
        public String getIpAddress() {
            return this.ipAddress;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String connectionString; 
            private String ipAddress; 
            private String ipType; 
            private String port; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * The endpoints of the instance.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The IP address.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * The type of the IP address. Valid values:
             * <p>
             * 
             * *   **Public**: Internet
             * *   **Private**: internal network
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            /**
             * The port number of the endpoint.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The VPC ID.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public AddressItem build() {
                return new AddressItem(this);
            } 

        } 

    }
    public static class AddressItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressItem")
        private java.util.List < AddressItem> addressItem;

        private AddressItems(Builder builder) {
            this.addressItem = builder.addressItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddressItems create() {
            return builder().build();
        }

        /**
         * @return addressItem
         */
        public java.util.List < AddressItem> getAddressItem() {
            return this.addressItem;
        }

        public static final class Builder {
            private java.util.List < AddressItem> addressItem; 

            /**
             * AddressItem.
             */
            public Builder addressItem(java.util.List < AddressItem> addressItem) {
                this.addressItem = addressItem;
                return this;
            }

            public AddressItems build() {
                return new AddressItems(this);
            } 

        } 

    }
    public static class NodeItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private NodeItem(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.nodeId = builder.nodeId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeItem create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private String nodeId; 
            private Integer weight; 

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The node ID.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The weight of the node. Read requests are distributed based on the weight.
             * <p>
             * 
             * Valid values: 0 to 100.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public NodeItem build() {
                return new NodeItem(this);
            } 

        } 

    }
    public static class NodeItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeItem")
        private java.util.List < NodeItem> nodeItem;

        private NodeItems(Builder builder) {
            this.nodeItem = builder.nodeItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeItems create() {
            return builder().build();
        }

        /**
         * @return nodeItem
         */
        public java.util.List < NodeItem> getNodeItem() {
            return this.nodeItem;
        }

        public static final class Builder {
            private java.util.List < NodeItem> nodeItem; 

            /**
             * NodeItem.
             */
            public Builder nodeItem(java.util.List < NodeItem> nodeItem) {
                this.nodeItem = nodeItem;
                return this;
            }

            public NodeItems build() {
                return new NodeItems(this);
            } 

        } 

    }
    public static class DBInstanceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressItems")
        private AddressItems addressItems;

        @com.aliyun.core.annotation.NameInMap("EndpointDescription")
        private String endpointDescription;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointType")
        private String endpointType;

        @com.aliyun.core.annotation.NameInMap("NodeItems")
        private NodeItems nodeItems;

        private DBInstanceEndpoint(Builder builder) {
            this.addressItems = builder.addressItems;
            this.endpointDescription = builder.endpointDescription;
            this.endpointId = builder.endpointId;
            this.endpointType = builder.endpointType;
            this.nodeItems = builder.nodeItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceEndpoint create() {
            return builder().build();
        }

        /**
         * @return addressItems
         */
        public AddressItems getAddressItems() {
            return this.addressItems;
        }

        /**
         * @return endpointDescription
         */
        public String getEndpointDescription() {
            return this.endpointDescription;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointType
         */
        public String getEndpointType() {
            return this.endpointType;
        }

        /**
         * @return nodeItems
         */
        public NodeItems getNodeItems() {
            return this.nodeItems;
        }

        public static final class Builder {
            private AddressItems addressItems; 
            private String endpointDescription; 
            private String endpointId; 
            private String endpointType; 
            private NodeItems nodeItems; 

            /**
             * The information about the endpoint.
             */
            public Builder addressItems(AddressItems addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * The user-defined description of the endpoint.
             */
            public Builder endpointDescription(String endpointDescription) {
                this.endpointDescription = endpointDescription;
                return this;
            }

            /**
             * The endpoint ID of the instance.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Primary**: the read/write endpoint of the instance
             * *   **Readonly**: the read-only endpoint of the instance
             */
            public Builder endpointType(String endpointType) {
                this.endpointType = endpointType;
                return this;
            }

            /**
             * The information about the node that is configured for the endpoint.
             */
            public Builder nodeItems(NodeItems nodeItems) {
                this.nodeItems = nodeItems;
                return this;
            }

            public DBInstanceEndpoint build() {
                return new DBInstanceEndpoint(this);
            } 

        } 

    }
    public static class DBInstanceEndpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceEndpoint")
        private java.util.List < DBInstanceEndpoint> DBInstanceEndpoint;

        private DBInstanceEndpoints(Builder builder) {
            this.DBInstanceEndpoint = builder.DBInstanceEndpoint;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceEndpoints create() {
            return builder().build();
        }

        /**
         * @return DBInstanceEndpoint
         */
        public java.util.List < DBInstanceEndpoint> getDBInstanceEndpoint() {
            return this.DBInstanceEndpoint;
        }

        public static final class Builder {
            private java.util.List < DBInstanceEndpoint> DBInstanceEndpoint; 

            /**
             * DBInstanceEndpoint.
             */
            public Builder DBInstanceEndpoint(java.util.List < DBInstanceEndpoint> DBInstanceEndpoint) {
                this.DBInstanceEndpoint = DBInstanceEndpoint;
                return this;
            }

            public DBInstanceEndpoints build() {
                return new DBInstanceEndpoints(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceEndpoints")
        private DBInstanceEndpoints DBInstanceEndpoints;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        private Data(Builder builder) {
            this.DBInstanceEndpoints = builder.DBInstanceEndpoints;
            this.DBInstanceName = builder.DBInstanceName;
            this.ipVersion = builder.ipVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return DBInstanceEndpoints
         */
        public DBInstanceEndpoints getDBInstanceEndpoints() {
            return this.DBInstanceEndpoints;
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        public static final class Builder {
            private DBInstanceEndpoints DBInstanceEndpoints; 
            private String DBInstanceName; 
            private String ipVersion; 

            /**
             * The information of the endpoints of the instance.
             */
            public Builder DBInstanceEndpoints(DBInstanceEndpoints DBInstanceEndpoints) {
                this.DBInstanceEndpoints = DBInstanceEndpoints;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * The version of the IP protocol. Valid values:
             * <p>
             * 
             * *   **ipv4**
             * *   **ipv6**
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
