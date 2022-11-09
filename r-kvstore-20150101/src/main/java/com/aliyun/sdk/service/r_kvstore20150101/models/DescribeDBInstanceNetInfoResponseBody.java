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
         * InstanceNetworkType.
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * NetInfoItems.
         */
        public Builder netInfoItems(NetInfoItems netInfoItems) {
            this.netInfoItems = netInfoItems;
            return this;
        }

        /**
         * RequestId.
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
            private String port; 
            private String upgradeable; 
            private String VPCId; 
            private String VPCInstanceId; 
            private String vSwitchId; 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * DBInstanceNetType.
             */
            public Builder DBInstanceNetType(String DBInstanceNetType) {
                this.DBInstanceNetType = DBInstanceNetType;
                return this;
            }

            /**
             * DirectConnection.
             */
            public Builder directConnection(Integer directConnection) {
                this.directConnection = directConnection;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
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
             * IPType.
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
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
             * Upgradeable.
             */
            public Builder upgradeable(String upgradeable) {
                this.upgradeable = upgradeable;
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
             * VPCInstanceId.
             */
            public Builder VPCInstanceId(String VPCInstanceId) {
                this.VPCInstanceId = VPCInstanceId;
                return this;
            }

            /**
             * VSwitchId.
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
