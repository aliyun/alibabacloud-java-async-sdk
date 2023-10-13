// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

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
    @NameInMap("DBInstanceNetInfos")
    private java.util.List < DBInstanceNetInfos> DBInstanceNetInfos;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceNetInfoResponseBody(Builder builder) {
        this.DBInstanceNetInfos = builder.DBInstanceNetInfos;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceNetInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceNetInfos
     */
    public java.util.List < DBInstanceNetInfos> getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DBInstanceNetInfos> DBInstanceNetInfos; 
        private String requestId; 

        /**
         * DBInstanceNetInfos.
         */
        public Builder DBInstanceNetInfos(java.util.List < DBInstanceNetInfos> DBInstanceNetInfos) {
            this.DBInstanceNetInfos = DBInstanceNetInfos;
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

    public static class PortList extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("Protocol")
        private String protocol;

        private PortList(Builder builder) {
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortList create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private Integer port; 
            private String protocol; 

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public PortList build() {
                return new PortList(this);
            } 

        } 

    }
    public static class DBInstanceNetInfos extends TeaModel {
        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("NetType")
        private String netType;

        @NameInMap("PortList")
        private java.util.List < PortList> portList;

        @NameInMap("UserVisible")
        private Boolean userVisible;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        @NameInMap("VswitchId")
        private String vswitchId;

        private DBInstanceNetInfos(Builder builder) {
            this.connectionString = builder.connectionString;
            this.ip = builder.ip;
            this.netType = builder.netType;
            this.portList = builder.portList;
            this.userVisible = builder.userVisible;
            this.vpcId = builder.vpcId;
            this.vpcInstanceId = builder.vpcInstanceId;
            this.vswitchId = builder.vswitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceNetInfos create() {
            return builder().build();
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return portList
         */
        public java.util.List < PortList> getPortList() {
            return this.portList;
        }

        /**
         * @return userVisible
         */
        public Boolean getUserVisible() {
            return this.userVisible;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vpcInstanceId
         */
        public String getVpcInstanceId() {
            return this.vpcInstanceId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String connectionString; 
            private String ip; 
            private String netType; 
            private java.util.List < PortList> portList; 
            private Boolean userVisible; 
            private String vpcId; 
            private String vpcInstanceId; 
            private String vswitchId; 

            /**
             * ConnectionString.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
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
             * PortList.
             */
            public Builder portList(java.util.List < PortList> portList) {
                this.portList = portList;
                return this;
            }

            /**
             * UserVisible.
             */
            public Builder userVisible(Boolean userVisible) {
                this.userVisible = userVisible;
                return this;
            }

            /**
             * VPC ID。
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VpcInstanceId.
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            /**
             * VswitchId.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public DBInstanceNetInfos build() {
                return new DBInstanceNetInfos(this);
            } 

        } 

    }
}
