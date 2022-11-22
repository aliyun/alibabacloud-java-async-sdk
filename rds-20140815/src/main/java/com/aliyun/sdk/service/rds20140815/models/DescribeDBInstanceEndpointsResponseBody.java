// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceEndpointsResponseBody</p>
 */
public class DescribeDBInstanceEndpointsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("IpAddress")
        private String ipAddress;

        @NameInMap("IpType")
        private String ipType;

        @NameInMap("Port")
        private String port;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
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
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * IpAddress.
             */
            public Builder ipAddress(String ipAddress) {
                this.ipAddress = ipAddress;
                return this;
            }

            /**
             * IpType.
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
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
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
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
        @NameInMap("AddressItem")
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
        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("Weight")
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
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * Weight.
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
        @NameInMap("NodeItem")
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
        @NameInMap("AddressItems")
        private AddressItems addressItems;

        @NameInMap("EndpointDescription")
        private String endpointDescription;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointType")
        private String endpointType;

        @NameInMap("NodeItems")
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
             * AddressItems.
             */
            public Builder addressItems(AddressItems addressItems) {
                this.addressItems = addressItems;
                return this;
            }

            /**
             * EndpointDescription.
             */
            public Builder endpointDescription(String endpointDescription) {
                this.endpointDescription = endpointDescription;
                return this;
            }

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
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
             * NodeItems.
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
        @NameInMap("DBInstanceEndpoint")
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
        @NameInMap("DBInstanceEndpoints")
        private DBInstanceEndpoints DBInstanceEndpoints;

        @NameInMap("DBInstanceName")
        private String DBInstanceName;

        @NameInMap("IpVersion")
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
             * DBInstanceEndpoints.
             */
            public Builder DBInstanceEndpoints(DBInstanceEndpoints DBInstanceEndpoints) {
                this.DBInstanceEndpoints = DBInstanceEndpoints;
                return this;
            }

            /**
             * DBInstanceName.
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * IpVersion.
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
