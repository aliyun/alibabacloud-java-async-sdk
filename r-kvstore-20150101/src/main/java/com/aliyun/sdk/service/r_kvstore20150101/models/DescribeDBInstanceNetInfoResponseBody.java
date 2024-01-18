// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceNetInfoResponseBody</p>
 */
public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @NameInMap("NetInfoItems")
    private NetInfoItems netInfoItems;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceNetInfoResponseBody(Builder builder) {
        this.instanceNetworkType = builder.instanceNetworkType;
        this.netInfoItems = builder.netInfoItems;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceNetInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return netInfoItems
     */
    public NetInfoItems getNetInfoItems() {
        return this.netInfoItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceNetworkType; 
        private NetInfoItems netInfoItems; 
        private String requestId; 

        /**
         * The network type. Valid values:
         * <p>
         * 
         * *   **CLASSIC**: The instance runs in a classic network.
         * *   **VPC**: The instance runs in a virtual private cloud (VPC).
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The list of network information about the instance.
         */
        public Builder netInfoItems(NetInfoItems netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceNetInfoResponseBody build() {
            return new DescribeDBInstanceNetInfoResponseBody(this);
        } 

    } 

    public static class InstanceNetInfo extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @NameInMap("DirectConnection")
        private Integer directConnection;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("IPType")
        private String IPType;

        @NameInMap("IsSlaveProxy")
        private Integer isSlaveProxy;

        @NameInMap("Port")
        private String port;

        @NameInMap("Upgradeable")
        private String upgradeable;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VPCInstanceId")
        private String VPCInstanceId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private InstanceNetInfo(Builder builder) {
            this.connectionString = builder.connectionString;
            this.DBInstanceNetType = builder.DBInstanceNetType;
            this.directConnection = builder.directConnection;
            this.expiredTime = builder.expiredTime;
            this.IPAddress = builder.IPAddress;
            this.IPType = builder.IPType;
            this.isSlaveProxy = builder.isSlaveProxy;
            this.port = builder.port;
            this.upgradeable = builder.upgradeable;
            this.VPCId = builder.VPCId;
            this.VPCInstanceId = builder.VPCInstanceId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceNetInfo create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return DBInstanceNetType
         */
        public String getDBInstanceNetType() {
            return this.DBInstanceNetType;
        }

        /**
         * @return directConnection
         */
        public Integer getDirectConnection() {
            return this.directConnection;
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
         * @return IPType
         */
        public String getIPType() {
            return this.IPType;
        }

        /**
         * @return isSlaveProxy
         */
        public Integer getIsSlaveProxy() {
            return this.isSlaveProxy;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return upgradeable
         */
        public String getUpgradeable() {
            return this.upgradeable;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return VPCInstanceId
         */
        public String getVPCInstanceId() {
            return this.VPCInstanceId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String connectionString; 
            private String DBInstanceNetType; 
            private Integer directConnection; 
            private String expiredTime; 
            private String IPAddress; 
            private String IPType; 
            private Integer isSlaveProxy; 
            private String port; 
            private String upgradeable; 
            private String VPCId; 
            private String VPCInstanceId; 
            private String vSwitchId; 

            /**
             * The endpoint of the instance.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The network type of the endpoint. Valid values:
             * <p>
             * 
             * *   **0**: the Internet.
             * *   **1**: classic network.
             * *   **2**: VPC.
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * Indicates whether the address is a private endpoint. Valid values:
             * <p>
             * 
             * *   **0**: no.
             * *   **1**: yes.
             */
            public Builder directConnection(Integer directConnection) {
                this.directConnection = directConnection;
                return this;
            }

            /**
             * The expiration time of the classic network address of an ApsaraDB for Redis instance. Unit: seconds.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
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
             * The network type of the IP address. Valid values:
             * <p>
             * 
             * *   **Public**: Internet.
             * *   **Inner**: classic network.
             * *   **Private**: VPC.
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * IsSlaveProxy.
             */
            public Builder isSlaveProxy(Integer isSlaveProxy) {
                this.isSlaveProxy = isSlaveProxy;
                return this;
            }

            /**
             * The service port of the ApsaraDB for Redis instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The remaining validity period of the endpoint of the classic network. Unit: seconds.
             * <p>
             * 
             * >  A value of **0** indicates that the endpoint never expires.
             */
            public Builder upgradeable(String upgradeable) {
                this.upgradeable = upgradeable;
                return this;
            }

            /**
             * The ID of the VPC where the instance is deployed.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder VPCInstanceId(String VPCInstanceId) {
                this.VPCInstanceId = VPCInstanceId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public InstanceNetInfo build() {
                return new InstanceNetInfo(this);
            } 

        } 

    }
    public static class NetInfoItems extends TeaModel {
        @NameInMap("InstanceNetInfo")
        private java.util.List < InstanceNetInfo> instanceNetInfo;

        private NetInfoItems(Builder builder) {
            this.instanceNetInfo = builder.instanceNetInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetInfoItems create() {
            return builder().build();
        }

        /**
         * @return instanceNetInfo
         */
        public java.util.List < InstanceNetInfo> getInstanceNetInfo() {
            return this.instanceNetInfo;
        }

        public static final class Builder {
            private java.util.List < InstanceNetInfo> instanceNetInfo; 

            /**
             * InstanceNetInfo.
             */
            public Builder instanceNetInfo(java.util.List < InstanceNetInfo> instanceNetInfo) {
                this.instanceNetInfo = instanceNetInfo;
                return this;
            }

            public NetInfoItems build() {
                return new NetInfoItems(this);
            } 

        } 

    }
}
