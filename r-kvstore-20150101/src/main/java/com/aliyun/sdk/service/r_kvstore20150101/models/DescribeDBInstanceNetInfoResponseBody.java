// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceNetInfoResponseBody</p>
 */
public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.NameInMap("NetInfoItems")
    private NetInfoItems netInfoItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The network type. Valid values:</p>
         * <ul>
         * <li><strong>CLASSIC</strong>: The instance runs in a classic network.</li>
         * <li><strong>VPC</strong>: The instance runs in a virtual private cloud (VPC).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CLASSIC</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>The network information about the instance.</p>
         */
        public Builder netInfoItems(NetInfoItems netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FC77D4E1-2A7C-4F0B-A4CC-CE0B9C314B9B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceNetInfoResponseBody build() {
            return new DescribeDBInstanceNetInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoResponseBody</p>
     */
    public static class InstanceNetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("DBInstanceNetType")
        private String DBInstanceNetType;

        @com.aliyun.core.annotation.NameInMap("DirectConnection")
        private Integer directConnection;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("IsSlaveProxy")
        private Integer isSlaveProxy;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Upgradeable")
        private String upgradeable;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VPCInstanceId")
        private String VPCInstanceId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
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
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1zxszhcgatnx****.redis.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The network type of the instance. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Internet</li>
             * <li><strong>1</strong>: classic network</li>
             * <li><strong>2</strong>: Virtual Private Cloud (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * <p>Indicates whether the address is a private endpoint. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The address is not a private endpoint.</li>
             * <li><strong>1</strong>: The address is a private endpoint.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder directConnection(Integer directConnection) {
                this.directConnection = directConnection;
                return this;
            }

            /**
             * <p>The expiration time of the classic network endpoint. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5183779</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.49.***</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The network type of the IP address. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: Internet</li>
             * <li><strong>Inner</strong>: classic network</li>
             * <li><strong>Private</strong>: VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Inner</p>
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * <p>Indicates whether the address is the endpoint for the secondary zone. Valid values: 1 and 0. A value of 1 indicates that the address is the endpoint for the secondary zone.</p>
             * <blockquote>
             * <p> This parameter is returned only after you enable the multi-zone read/write splitting architecture for the instance.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isSlaveProxy(Integer isSlaveProxy) {
                this.isSlaveProxy = isSlaveProxy;
                return this;
            }

            /**
             * <p>The service port of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6379</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The remaining validity period of the classic network endpoint. Unit: seconds.</p>
             * <blockquote>
             * <p> **A value of 0 indicates that the endpoint never expires.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder upgradeable(String upgradeable) {
                this.upgradeable = upgradeable;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the instance belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1nme44gek34slfc****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1ky7j6qc7umk****</p>
             */
            public Builder VPCInstanceId(String VPCInstanceId) {
                this.VPCInstanceId = VPCInstanceId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e7clcw529l773d****</p>
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
    /**
     * 
     * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoResponseBody</p>
     */
    public static class NetInfoItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceNetInfo")
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
