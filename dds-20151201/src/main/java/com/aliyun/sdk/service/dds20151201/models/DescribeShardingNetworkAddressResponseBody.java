// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeShardingNetworkAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeShardingNetworkAddressResponseBody</p>
 */
public class DescribeShardingNetworkAddressResponseBody extends TeaModel {
    @NameInMap("CompatibleConnections")
    private CompatibleConnections compatibleConnections;

    @NameInMap("NetworkAddresses")
    private NetworkAddresses networkAddresses;

    @NameInMap("RequestId")
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

        /**
         * The endpoints of DynamoDB-compatible instances.
         */
        public Builder compatibleConnections(CompatibleConnections compatibleConnections) {
            this.compatibleConnections = compatibleConnections;
            return this;
        }

        /**
         * The endpoints of ApsaraDB for MongoDB instances.
         */
        public Builder networkAddresses(NetworkAddresses networkAddresses) {
            this.networkAddresses = networkAddresses;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeShardingNetworkAddressResponseBody build() {
            return new DescribeShardingNetworkAddressResponseBody(this);
        } 

    } 

    public static class CompatibleConnection extends TeaModel {
        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("NetworkAddress")
        private String networkAddress;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("Port")
        private String port;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VswitchId")
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

            /**
             * The remaining duration of the classic network endpoint. Unit: seconds.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The endpoint of the instance.
             */
            public Builder networkAddress(String networkAddress) {
                this.networkAddress = networkAddress;
                return this;
            }

            /**
             * The network type of the instance.
             * <p>
             * 
             * *   **VPC**: virtual private cloud
             * *   **Classic**: classic network
             * *   **Public**: the Internet
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The port that is used to connect to the instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The VPC ID of the instance.
             * <p>
             * 
             * >  This parameter is returned when the network type is **VPC**.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the vSwitch in the Virtual Private Cloud (VPC).
             * <p>
             * 
             * >  This parameter is returned when the network type is **VPC**.
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
    public static class CompatibleConnections extends TeaModel {
        @NameInMap("CompatibleConnection")
        private java.util.List < CompatibleConnection> compatibleConnection;

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
        public java.util.List < CompatibleConnection> getCompatibleConnection() {
            return this.compatibleConnection;
        }

        public static final class Builder {
            private java.util.List < CompatibleConnection> compatibleConnection; 

            /**
             * CompatibleConnection.
             */
            public Builder compatibleConnection(java.util.List < CompatibleConnection> compatibleConnection) {
                this.compatibleConnection = compatibleConnection;
                return this;
            }

            public CompatibleConnections build() {
                return new CompatibleConnections(this);
            } 

        } 

    }
    public static class NetworkAddress extends TeaModel {
        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("NetworkAddress")
        private String networkAddress;

        @NameInMap("NetworkType")
        private String networkType;

        @NameInMap("NodeId")
        private String nodeId;

        @NameInMap("NodeType")
        private String nodeType;

        @NameInMap("Port")
        private String port;

        @NameInMap("Role")
        private String role;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private NetworkAddress(Builder builder) {
            this.expiredTime = builder.expiredTime;
            this.IPAddress = builder.IPAddress;
            this.networkAddress = builder.networkAddress;
            this.networkType = builder.networkType;
            this.nodeId = builder.nodeId;
            this.nodeType = builder.nodeType;
            this.port = builder.port;
            this.role = builder.role;
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
            private String nodeId; 
            private String nodeType; 
            private String port; 
            private String role; 
            private String VPCId; 
            private String vswitchId; 

            /**
             * The remaining duration of the classic network endpoint. Unit: seconds.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The IP address of the instance.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The connection string of the instance.
             */
            public Builder networkAddress(String networkAddress) {
                this.networkAddress = networkAddress;
                return this;
            }

            /**
             * The network type of the instance.
             * <p>
             * 
             * *   **VPC**: virtual private cloud
             * *   **Classic**: classic network
             * *   **Public**: the Internet
             */
            public Builder networkType(String networkType) {
                this.networkType = networkType;
                return this;
            }

            /**
             * The ID of the mongos node.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * The type of the node. Valid values:
             * <p>
             * 
             * *   **mongos**: mongos node
             * *   **shard**: shard node
             * *   **configserver**: Configserver node
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * The port that is used to connect to the instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The role of the node. Valid values:
             * <p>
             * 
             * *   Primary
             * *   Secondary
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * The VPC ID of the instance.
             * <p>
             * 
             * >  This parameter is returned when the network type is **VPC**.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the vSwitch in the VPC.
             * <p>
             * 
             * >  This parameter is returned when the network type is **VPC**.
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
    public static class NetworkAddresses extends TeaModel {
        @NameInMap("NetworkAddress")
        private java.util.List < NetworkAddress> networkAddress;

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
        public java.util.List < NetworkAddress> getNetworkAddress() {
            return this.networkAddress;
        }

        public static final class Builder {
            private java.util.List < NetworkAddress> networkAddress; 

            /**
             * The connection string of the instance.
             */
            public Builder networkAddress(java.util.List < NetworkAddress> networkAddress) {
                this.networkAddress = networkAddress;
                return this;
            }

            public NetworkAddresses build() {
                return new NetworkAddresses(this);
            } 

        } 

    }
}
