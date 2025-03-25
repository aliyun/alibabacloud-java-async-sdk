// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceNetInfoResponseBody</p>
 */
public class DescribeDBInstanceNetInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceNetInfos")
    private DBInstanceNetInfos DBInstanceNetInfos;

    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceNetInfoResponseBody(Builder builder) {
        this.DBInstanceNetInfos = builder.DBInstanceNetInfos;
        this.instanceNetworkType = builder.instanceNetworkType;
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
    public DBInstanceNetInfos getDBInstanceNetInfos() {
        return this.DBInstanceNetInfos;
    }

    /**
     * @return instanceNetworkType
     */
    public String getInstanceNetworkType() {
        return this.instanceNetworkType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DBInstanceNetInfos DBInstanceNetInfos; 
        private String instanceNetworkType; 
        private String requestId; 

        /**
         * <p>The connection information of the instance.</p>
         */
        public Builder DBInstanceNetInfos(DBInstanceNetInfos DBInstanceNetInfos) {
            this.DBInstanceNetInfos = DBInstanceNetInfos;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li>Classic: classic network.</li>
         * <li>VPC: VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Classic</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
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
    public static class DBInstanceNetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddressType")
        private String addressType;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcInstanceId")
        private String vpcInstanceId;

        private DBInstanceNetInfo(Builder builder) {
            this.addressType = builder.addressType;
            this.connectionString = builder.connectionString;
            this.IPAddress = builder.IPAddress;
            this.IPType = builder.IPType;
            this.port = builder.port;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcInstanceId = builder.vpcInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceNetInfo create() {
            return builder().build();
        }

        /**
         * @return addressType
         */
        public String getAddressType() {
            return this.addressType;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
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
            private String addressType; 
            private String connectionString; 
            private String IPAddress; 
            private String IPType; 
            private String port; 
            private String VPCId; 
            private String vSwitchId; 
            private String vpcInstanceId; 

            /**
             * <p>The type of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>Intranet</p>
             */
            public Builder addressType(String addressType) {
                this.addressType = addressType;
                return this;
            }

            /**
             * <p>The endpoint that is used to connect to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>gp-xxxxxxx.gpdb.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.0.1</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The type of the IP address.</p>
             * <ul>
             * <li>Valid values for instances in the classic network: Inner and Public.</li>
             * <li>Valid values for instances in a virtual private cloud (VPC): Private and Public.</li>
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
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>3432</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The VPC ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxxx</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID. Multiple IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The ID of the instance that is deployed in a VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxxx</p>
             */
            public Builder vpcInstanceId(String vpcInstanceId) {
                this.vpcInstanceId = vpcInstanceId;
                return this;
            }

            public DBInstanceNetInfo build() {
                return new DBInstanceNetInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceNetInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoResponseBody</p>
     */
    public static class DBInstanceNetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceNetInfo")
        private java.util.List<DBInstanceNetInfo> DBInstanceNetInfo;

        private DBInstanceNetInfos(Builder builder) {
            this.DBInstanceNetInfo = builder.DBInstanceNetInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceNetInfos create() {
            return builder().build();
        }

        /**
         * @return DBInstanceNetInfo
         */
        public java.util.List<DBInstanceNetInfo> getDBInstanceNetInfo() {
            return this.DBInstanceNetInfo;
        }

        public static final class Builder {
            private java.util.List<DBInstanceNetInfo> DBInstanceNetInfo; 

            /**
             * DBInstanceNetInfo.
             */
            public Builder DBInstanceNetInfo(java.util.List<DBInstanceNetInfo> DBInstanceNetInfo) {
                this.DBInstanceNetInfo = DBInstanceNetInfo;
                return this;
            }

            public DBInstanceNetInfos build() {
                return new DBInstanceNetInfos(this);
            } 

        } 

    }
}
