// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstanceNetInfoForChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceNetInfoForChannelResponseBody</p>
 */
public class DescribeDBInstanceNetInfoForChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceNetInfos")
    private DBInstanceNetInfos DBInstanceNetInfos;

    @com.aliyun.core.annotation.NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstanceNetInfoForChannelResponseBody(Builder builder) {
        this.DBInstanceNetInfos = builder.DBInstanceNetInfos;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceNetInfoForChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeDBInstanceNetInfoForChannelResponseBody model) {
            this.DBInstanceNetInfos = model.DBInstanceNetInfos;
            this.instanceNetworkType = model.instanceNetworkType;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the instance connection.</p>
         */
        public Builder DBInstanceNetInfos(DBInstanceNetInfos DBInstanceNetInfos) {
            this.DBInstanceNetInfos = DBInstanceNetInfos;
            return this;
        }

        /**
         * <p>The network type of the instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong>: a virtual private cloud (VPC)</li>
         * <li><strong>Classic</strong>: classic network</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>61DF1F28-F409-50C0-B90A-CCE82D44****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBody build() {
            return new DescribeDBInstanceNetInfoForChannelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceNetInfoForChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoForChannelResponseBody</p>
     */
    public static class DBInstanceWeight extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Availability")
        private String availability;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private String weight;

        private DBInstanceWeight(Builder builder) {
            this.availability = builder.availability;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceType = builder.DBInstanceType;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceWeight create() {
            return builder().build();
        }

        /**
         * @return availability
         */
        public String getAvailability() {
            return this.availability;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return weight
         */
        public String getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String availability; 
            private String DBInstanceId; 
            private String DBInstanceType; 
            private String weight; 

            private Builder() {
            } 

            private Builder(DBInstanceWeight model) {
                this.availability = model.availability;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceType = model.DBInstanceType;
                this.weight = model.weight;
            } 

            /**
             * <p>The availability of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unavailable</strong></li>
             * <li><strong>Available</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unavailable</p>
             */
            public Builder availability(String availability) {
                this.availability = availability;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6wjk5*****</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li><strong>Master</strong>: primary instance</li>
             * <li><strong>Readonly</strong>: read-only instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Master</p>
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * <p>The weight of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder weight(String weight) {
                this.weight = weight;
                return this;
            }

            public DBInstanceWeight build() {
                return new DBInstanceWeight(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceNetInfoForChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoForChannelResponseBody</p>
     */
    public static class DBInstanceWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceWeight")
        private java.util.List<DBInstanceWeight> DBInstanceWeight;

        private DBInstanceWeights(Builder builder) {
            this.DBInstanceWeight = builder.DBInstanceWeight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceWeights create() {
            return builder().build();
        }

        /**
         * @return DBInstanceWeight
         */
        public java.util.List<DBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

        public static final class Builder {
            private java.util.List<DBInstanceWeight> DBInstanceWeight; 

            private Builder() {
            } 

            private Builder(DBInstanceWeights model) {
                this.DBInstanceWeight = model.DBInstanceWeight;
            } 

            /**
             * DBInstanceWeight.
             */
            public Builder DBInstanceWeight(java.util.List<DBInstanceWeight> DBInstanceWeight) {
                this.DBInstanceWeight = DBInstanceWeight;
                return this;
            }

            public DBInstanceWeights build() {
                return new DBInstanceWeights(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceNetInfoForChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoForChannelResponseBody</p>
     */
    public static class SecurityIPGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityIPGroupName")
        private String securityIPGroupName;

        @com.aliyun.core.annotation.NameInMap("SecurityIPs")
        private String securityIPs;

        private SecurityIPGroup(Builder builder) {
            this.securityIPGroupName = builder.securityIPGroupName;
            this.securityIPs = builder.securityIPs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIPGroup create() {
            return builder().build();
        }

        /**
         * @return securityIPGroupName
         */
        public String getSecurityIPGroupName() {
            return this.securityIPGroupName;
        }

        /**
         * @return securityIPs
         */
        public String getSecurityIPs() {
            return this.securityIPs;
        }

        public static final class Builder {
            private String securityIPGroupName; 
            private String securityIPs; 

            private Builder() {
            } 

            private Builder(SecurityIPGroup model) {
                this.securityIPGroupName = model.securityIPGroupName;
                this.securityIPs = model.securityIPs;
            } 

            /**
             * <p>The name of the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder securityIPGroupName(String securityIPGroupName) {
                this.securityIPGroupName = securityIPGroupName;
                return this;
            }

            /**
             * <p>The IP addresses that is contained in the IP address whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>127.0.XX.XX</p>
             */
            public Builder securityIPs(String securityIPs) {
                this.securityIPs = securityIPs;
                return this;
            }

            public SecurityIPGroup build() {
                return new SecurityIPGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceNetInfoForChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoForChannelResponseBody</p>
     */
    public static class SecurityIPGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityIPGroup")
        private java.util.List<SecurityIPGroup> securityIPGroup;

        private SecurityIPGroups(Builder builder) {
            this.securityIPGroup = builder.securityIPGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityIPGroups create() {
            return builder().build();
        }

        /**
         * @return securityIPGroup
         */
        public java.util.List<SecurityIPGroup> getSecurityIPGroup() {
            return this.securityIPGroup;
        }

        public static final class Builder {
            private java.util.List<SecurityIPGroup> securityIPGroup; 

            private Builder() {
            } 

            private Builder(SecurityIPGroups model) {
                this.securityIPGroup = model.securityIPGroup;
            } 

            /**
             * securityIPGroup.
             */
            public Builder securityIPGroup(java.util.List<SecurityIPGroup> securityIPGroup) {
                this.securityIPGroup = securityIPGroup;
                return this;
            }

            public SecurityIPGroups build() {
                return new SecurityIPGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceNetInfoForChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoForChannelResponseBody</p>
     */
    public static class DBInstanceNetInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Availability")
        private String availability;

        @com.aliyun.core.annotation.NameInMap("ConnectionString")
        private String connectionString;

        @com.aliyun.core.annotation.NameInMap("ConnectionStringType")
        private String connectionStringType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceWeights")
        private DBInstanceWeights DBInstanceWeights;

        @com.aliyun.core.annotation.NameInMap("DistributionType")
        private String distributionType;

        @com.aliyun.core.annotation.NameInMap("IPAddress")
        private String IPAddress;

        @com.aliyun.core.annotation.NameInMap("IPType")
        private String IPType;

        @com.aliyun.core.annotation.NameInMap("MaxDelayTime")
        private String maxDelayTime;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("SecurityIPGroups")
        private SecurityIPGroups securityIPGroups;

        @com.aliyun.core.annotation.NameInMap("Upgradeable")
        private String upgradeable;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("expiredTime")
        private String expiredTime;

        private DBInstanceNetInfo(Builder builder) {
            this.availability = builder.availability;
            this.connectionString = builder.connectionString;
            this.connectionStringType = builder.connectionStringType;
            this.DBInstanceWeights = builder.DBInstanceWeights;
            this.distributionType = builder.distributionType;
            this.IPAddress = builder.IPAddress;
            this.IPType = builder.IPType;
            this.maxDelayTime = builder.maxDelayTime;
            this.port = builder.port;
            this.securityIPGroups = builder.securityIPGroups;
            this.upgradeable = builder.upgradeable;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.expiredTime = builder.expiredTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceNetInfo create() {
            return builder().build();
        }

        /**
         * @return availability
         */
        public String getAvailability() {
            return this.availability;
        }

        /**
         * @return connectionString
         */
        public String getConnectionString() {
            return this.connectionString;
        }

        /**
         * @return connectionStringType
         */
        public String getConnectionStringType() {
            return this.connectionStringType;
        }

        /**
         * @return DBInstanceWeights
         */
        public DBInstanceWeights getDBInstanceWeights() {
            return this.DBInstanceWeights;
        }

        /**
         * @return distributionType
         */
        public String getDistributionType() {
            return this.distributionType;
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
         * @return maxDelayTime
         */
        public String getMaxDelayTime() {
            return this.maxDelayTime;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return securityIPGroups
         */
        public SecurityIPGroups getSecurityIPGroups() {
            return this.securityIPGroups;
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
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public static final class Builder {
            private String availability; 
            private String connectionString; 
            private String connectionStringType; 
            private DBInstanceWeights DBInstanceWeights; 
            private String distributionType; 
            private String IPAddress; 
            private String IPType; 
            private String maxDelayTime; 
            private String port; 
            private SecurityIPGroups securityIPGroups; 
            private String upgradeable; 
            private String VPCId; 
            private String vSwitchId; 
            private String expiredTime; 

            private Builder() {
            } 

            private Builder(DBInstanceNetInfo model) {
                this.availability = model.availability;
                this.connectionString = model.connectionString;
                this.connectionStringType = model.connectionStringType;
                this.DBInstanceWeights = model.DBInstanceWeights;
                this.distributionType = model.distributionType;
                this.IPAddress = model.IPAddress;
                this.IPType = model.IPType;
                this.maxDelayTime = model.maxDelayTime;
                this.port = model.port;
                this.securityIPGroups = model.securityIPGroups;
                this.upgradeable = model.upgradeable;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.expiredTime = model.expiredTime;
            } 

            /**
             * <p>The availability of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Unavailable</strong></li>
             * <li><strong>Available</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unavailable</p>
             */
            public Builder availability(String availability) {
                this.availability = availability;
                return this;
            }

            /**
             * <p>The endpoint of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-uf6w*****.mysql.rds.aliyuncs.com</p>
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Normal</strong>: a regular endpoint</li>
             * <li><strong>ReadWriteSplitting</strong>: a read/write splitting endpoint that is assigned after the shared proxy feature is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder connectionStringType(String connectionStringType) {
                this.connectionStringType = connectionStringType;
                return this;
            }

            /**
             * <p>The information about read weights to implement read/write splitting after the shared proxy feature is enabled.</p>
             */
            public Builder DBInstanceWeights(DBInstanceWeights DBInstanceWeights) {
                this.DBInstanceWeights = DBInstanceWeights;
                return this;
            }

            /**
             * <p>The policy that is used to assign read weights. This parameter is returned only for a read/write splitting endpoint that is assigned after the shared proxy feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>Standard</strong>: The system automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.</li>
             * <li><strong>Custom</strong>: You must manually allocate read weights to the instance and its read-only instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder distributionType(String distributionType) {
                this.distributionType = distributionType;
                return this;
            }

            /**
             * <p>The IP address of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>172.16.XX.XX</p>
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * <p>The network type of the IP address. Valid values:</p>
             * <ul>
             * <li><strong>Public</strong>: the Internet</li>
             * <li><strong>Inner</strong>: the classic network</li>
             * <li><strong>Private</strong>: a virtual private cloud (VPC)</li>
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
             * <p>The latency threshold that is allowed for read/write splitting of the shared proxy feature. Unit: seconds.</p>
             * <blockquote>
             * <p> This parameter is returned only when <strong>ConnectionStringType</strong> is set to <strong>ReadWriteSplitting</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder maxDelayTime(String maxDelayTime) {
                this.maxDelayTime = maxDelayTime;
                return this;
            }

            /**
             * <p>The port number of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>6379</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The details of the IP address whitelist.</p>
             */
            public Builder securityIPGroups(SecurityIPGroups securityIPGroups) {
                this.securityIPGroups = securityIPGroups;
                return this;
            }

            /**
             * <p>An internal parameter. You do not need to specify this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Disabled</p>
             */
            public Builder upgradeable(String upgradeable) {
                this.upgradeable = upgradeable;
                return this;
            }

            /**
             * <p>The VPC ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1nme44gek34slfc****</p>
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * <p>The vSwitch ID of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1e7clcw529l773d****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The expiration time of the endpoint of the classic network type. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>5183779</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            public DBInstanceNetInfo build() {
                return new DBInstanceNetInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceNetInfoForChannelResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceNetInfoForChannelResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DBInstanceNetInfos model) {
                this.DBInstanceNetInfo = model.DBInstanceNetInfo;
            } 

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
