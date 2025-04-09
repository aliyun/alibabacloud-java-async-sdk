// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

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
 * {@link DescribeShardingNetworkAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShardingNetworkAddressResponseBody</p>
 */
public class DescribeShardingNetworkAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompatibleConnections")
    private CompatibleConnections compatibleConnections;

    @com.aliyun.core.annotation.NameInMap("NetworkAddresses")
    private NetworkAddresses networkAddresses;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeShardingNetworkAddressResponseBody(Builder builder) {
        this.compatibleConnections = builder.compatibleConnections;
        this.networkAddresses = builder.networkAddresses;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeShardingNetworkAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return compatibleConnections
     */
    public CompatibleConnections getCompatibleConnections() {
        return this.compatibleConnections;
    }

    /**
     * @return networkAddresses
     */
    public NetworkAddresses getNetworkAddresses() {
        return this.networkAddresses;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CompatibleConnections compatibleConnections; 
        private NetworkAddresses networkAddresses; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeShardingNetworkAddressResponseBody model) {
            this.compatibleConnections = model.compatibleConnections;
            this.networkAddresses = model.networkAddresses;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The endpoints of DynamoDB-compatible instances.</p>
         */
        public Builder compatibleConnections(CompatibleConnections compatibleConnections) {
            this.compatibleConnections = compatibleConnections;
            return this;
        }

        /**
         * <p>The endpoints of the ApsaraDB for MongoDB sharded cluster instance.</p>
         */
        public Builder networkAddresses(NetworkAddresses networkAddresses) {
            this.networkAddresses = networkAddresses;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18D8AAFD-6BEB-420F-8164-810CB0C0AA39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeShardingNetworkAddressResponseBody build() {
            return new DescribeShardingNetworkAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeShardingNetworkAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardingNetworkAddressResponseBody</p>
     */
    public static class CompatibleConnection extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkAddress")
        private String networkAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private CompatibleConnection(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.IPAddress = builder.IPAddress;
            this.networkAddress = builder.networkAddress;
            this.networkType = builder.networkType;
            this.port = builder.port;
            this.VPCId = builder.VPCId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompatibleConnection create() {
            return builder().build();
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return networkAddress
         */
        public String getNetworkAddress() {
            return this.networkAddress;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String expiredTime; 
            private String IPAddress; 
            private String networkAddress; 
            private String networkType; 
            private String port; 
            private String VPCId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(CompatibleConnection model) {
                this.expiredTime = model.expiredTime;
                this.IPAddress = model.IPAddress;
                this.networkAddress = model.networkAddress;
                this.networkType = model.networkType;
                this.port = model.port;
                this.VPCId = model.VPCId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The remaining duration of the classic network endpoint. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2591963</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.140.xxx.xx</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dds-bpxxxxxxxxxxxxxx.mongodb.rds.aliyuncs.com</p>
             */
            public Builder networkAddress(String networkAddress) {
                this.networkAddress = networkAddress;
                return this;
            }

            /**
             * <p>The network type of the instance.</p>
             * <ul>
             * <li><strong>VPC</strong>: virtual private cloud</li>
             * <li><strong>Classic</strong>: classic network</li>
             * <li><strong>Public</strong>: the Internet</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The port that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3717</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The VPC ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bpxxxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the Virtual Private Cloud (VPC).</p>
             * <blockquote>
             * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bpxxxxxxxx</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public CompatibleConnection build() {
                return new CompatibleConnection(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardingNetworkAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardingNetworkAddressResponseBody</p>
     */
    public static class CompatibleConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompatibleConnection")
        private java.util.List<CompatibleConnection> compatibleConnection;

        private CompatibleConnections(Builder builder) {
            this.compatibleConnection = builder.compatibleConnection;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompatibleConnections create() {
            return builder().build();
        }

        /**
         * @return compatibleConnection
         */
        public java.util.List<CompatibleConnection> getCompatibleConnection() {
            return this.compatibleConnection;
        }

        public static final class Builder {
            private java.util.List<CompatibleConnection> compatibleConnection; 

            private Builder() {
            } 

            private Builder(CompatibleConnections model) {
                this.compatibleConnection = model.compatibleConnection;
            } 

            /**
             * CompatibleConnection.
             */
            public Builder compatibleConnection(java.util.List<CompatibleConnection> compatibleConnection) {
                this.compatibleConnection = compatibleConnection;
                return this;
            }

            public CompatibleConnections build() {
                return new CompatibleConnections(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardingNetworkAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardingNetworkAddressResponseBody</p>
     */
    public static class NetworkAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionType")
        private String connectionType;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkAddress")
        private String networkAddress;

        @com.aliyun.core.annotation.NameInMap("NetworkType")
        private String networkType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("TxtRecord")
        private String txtRecord;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private NetworkAddress(Builder builder) {
            this.connectionType = builder.connectionType;
            this.expiredTime = builder.expiredTime;
            this.IPAddress = builder.IPAddress;
            this.networkAddress = builder.networkAddress;
            this.networkType = builder.networkType;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.role = builder.role;
            this.txtRecord = builder.txtRecord;
            this.VPCId = builder.VPCId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAddress create() {
            return builder().build();
        }

        /**
         * @return connectionType
         */
        public String getConnectionType() {
            return this.connectionType;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return IPAddress
         */
        public String getIPAddress() {
            return this.IPAddress;
        }

        /**
         * @return networkAddress
         */
        public String getNetworkAddress() {
            return this.networkAddress;
        }

        /**
         * @return networkType
         */
        public String getNetworkType() {
            return this.networkType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return txtRecord
         */
        public String getTxtRecord() {
            return this.txtRecord;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String connectionType; 
            private String expiredTime; 
            private String IPAddress; 
            private String networkAddress; 
            private String networkType; 
            private String nodeId; 
            private String nodeType; 
            private String port; 
            private String role; 
            private String txtRecord; 
            private String VPCId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(NetworkAddress model) {
                this.connectionType = model.connectionType;
                this.expiredTime = model.expiredTime;
                this.IPAddress = model.IPAddress;
                this.networkAddress = model.networkAddress;
                this.networkType = model.networkType;
                this.nodeId = model.nodeId;
                this.nodeType = model.nodeType;
                this.port = model.port;
                this.role = model.role;
                this.txtRecord = model.txtRecord;
                this.VPCId = model.VPCId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The public endpoint type. Valid values:</p>
             * <ul>
             * <li><strong>SRV</strong></li>
             * <li><strong>Normal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SRV</p>
             */
            public Builder connectionType(String connectionType) {
                this.connectionType = connectionType;
                return this;
            }

            /**
             * <p>The remaining duration of the classic network endpoint. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>2591963</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10.140.xxx.xx</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The connection string of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
             */
            public Builder networkAddress(String networkAddress) {
                this.networkAddress = networkAddress;
                return this;
            }

            /**
             * <p>The network type of the instance.</p>
             * <ul>
             * <li><strong>VPC</strong>: virtual private cloud</li>
             * <li><strong>Classic</strong>: classic network</li>
             * <li><strong>Public</strong>: the Internet</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * <p>The ID of the mongos node.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bpxxxxxxxx</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The type of the node. Valid values:</p>
             * <ul>
             * <li><strong>mongos</strong>: mongos node</li>
             * <li><strong>shard</strong>: shard node</li>
             * <li><strong>configserver</strong>: Configserver node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mongos</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>The port that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>3717</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The role of the node. Valid values:</p>
             * <ul>
             * <li>Primary</li>
             * <li>Secondary</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Primary</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Txt record which can be used to store MongoDB-related meta data, such as version, configuration parameters and etc. With the combination of txt record and other technology, for example SRV record, the MongoDB client can complete the complex service discovery and configuration passing.</p>
             * 
             * <strong>example:</strong>
             * <p>mongo.example.com. IN TXT &quot;config=replicaSet=myReplicaSet&quot;</p>
             */
            public Builder txtRecord(String txtRecord) {
                this.txtRecord = txtRecord;
                return this;
            }

            /**
             * <p>The VPC ID of the instance.</p>
             * <blockquote>
             * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vpc-bpxxxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch in the VPC.</p>
             * <blockquote>
             * <p> This parameter is returned when the network type is <strong>VPC</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>vsw-bpxxxxxxxx</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public NetworkAddress build() {
                return new NetworkAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeShardingNetworkAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeShardingNetworkAddressResponseBody</p>
     */
    public static class NetworkAddresses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NetworkAddress")
        private java.util.List<NetworkAddress> networkAddress;

        private NetworkAddresses(Builder builder) {
            this.networkAddress = builder.networkAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkAddresses create() {
            return builder().build();
        }

        /**
         * @return networkAddress
         */
        public java.util.List<NetworkAddress> getNetworkAddress() {
            return this.networkAddress;
        }

        public static final class Builder {
            private java.util.List<NetworkAddress> networkAddress; 

            private Builder() {
            } 

            private Builder(NetworkAddresses model) {
                this.networkAddress = model.networkAddress;
            } 

            /**
             * <p>The connection string of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>s-bpxxxxxxxx.mongodb.rds.aliyuncs.com</p>
             */
            public Builder networkAddress(java.util.List<NetworkAddress> networkAddress) {
                this.networkAddress = networkAddress;
                return this;
            }

            public NetworkAddresses build() {
                return new NetworkAddresses(this);
            } 

        } 

    }
}
