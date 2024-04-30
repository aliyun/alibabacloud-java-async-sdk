// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The information about the instance connection.
         */
        public Builder DBInstanceNetInfos(DBInstanceNetInfos DBInstanceNetInfos) {
            this.DBInstanceNetInfos = DBInstanceNetInfos;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   **VPC**: a virtual private cloud (VPC)
         * *   **Classic**: classic network
         */
        public Builder instanceNetworkType(String instanceNetworkType) {
            this.instanceNetworkType = instanceNetworkType;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstanceNetInfoForChannelResponseBody build() {
            return new DescribeDBInstanceNetInfoForChannelResponseBody(this);
        } 

    } 

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

            /**
             * The availability of the instance. Valid values:
             * <p>
             * 
             * *   **Unavailable**
             * *   **Available**
             */
            public Builder availability(String availability) {
                this.availability = availability;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The instance type. Valid values:
             * <p>
             * 
             * *   **Master**: primary instance
             * *   **Readonly**: read-only instance
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The weight of the instance.
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
    public static class DBInstanceWeights extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceWeight")
        private java.util.List < DBInstanceWeight> DBInstanceWeight;

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
        public java.util.List < DBInstanceWeight> getDBInstanceWeight() {
            return this.DBInstanceWeight;
        }

        public static final class Builder {
            private java.util.List < DBInstanceWeight> DBInstanceWeight; 

            /**
             * DBInstanceWeight.
             */
            public Builder DBInstanceWeight(java.util.List < DBInstanceWeight> DBInstanceWeight) {
                this.DBInstanceWeight = DBInstanceWeight;
                return this;
            }

            public DBInstanceWeights build() {
                return new DBInstanceWeights(this);
            } 

        } 

    }
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

            /**
             * The name of the IP address whitelist.
             */
            public Builder securityIPGroupName(String securityIPGroupName) {
                this.securityIPGroupName = securityIPGroupName;
                return this;
            }

            /**
             * The IP addresses that is contained in the IP address whitelist.
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
    public static class SecurityIPGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("securityIPGroup")
        private java.util.List < SecurityIPGroup> securityIPGroup;

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
        public java.util.List < SecurityIPGroup> getSecurityIPGroup() {
            return this.securityIPGroup;
        }

        public static final class Builder {
            private java.util.List < SecurityIPGroup> securityIPGroup; 

            /**
             * securityIPGroup.
             */
            public Builder securityIPGroup(java.util.List < SecurityIPGroup> securityIPGroup) {
                this.securityIPGroup = securityIPGroup;
                return this;
            }

            public SecurityIPGroups build() {
                return new SecurityIPGroups(this);
            } 

        } 

    }
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

            /**
             * The availability of the instance. Valid values:
             * <p>
             * 
             * *   **Unavailable**
             * *   **Available**
             */
            public Builder availability(String availability) {
                this.availability = availability;
                return this;
            }

            /**
             * The endpoint of the instance.
             */
            public Builder connectionString(String connectionString) {
                this.connectionString = connectionString;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Normal**: a regular endpoint
             * *   **ReadWriteSplitting**: a read/write splitting endpoint that is assigned after the shared proxy feature is enabled.
             */
            public Builder connectionStringType(String connectionStringType) {
                this.connectionStringType = connectionStringType;
                return this;
            }

            /**
             * The information about read weights to implement read/write splitting after the shared proxy feature is enabled.
             */
            public Builder DBInstanceWeights(DBInstanceWeights DBInstanceWeights) {
                this.DBInstanceWeights = DBInstanceWeights;
                return this;
            }

            /**
             * The policy that is used to assign read weights. This parameter is returned only for a read/write splitting endpoint that is assigned after the shared proxy feature is enabled. Valid values:
             * <p>
             * 
             * *   **Standard**: The system automatically allocates read weights to the instance and its read-only instances based on the specifications of the instances.
             * *   **Custom**: You must manually allocate read weights to the instance and its read-only instances.
             */
            public Builder distributionType(String distributionType) {
                this.distributionType = distributionType;
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
             * The network type of the IP address. Valid values:
             * <p>
             * 
             * *   **Public**: the Internet
             * *   **Inner**: the classic network
             * *   **Private**: a virtual private cloud (VPC)
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * The latency threshold that is allowed for read/write splitting of the shared proxy feature. Unit: seconds.
             * <p>
             * 
             * >  This parameter is returned only when **ConnectionStringType** is set to **ReadWriteSplitting**.
             */
            public Builder maxDelayTime(String maxDelayTime) {
                this.maxDelayTime = maxDelayTime;
                return this;
            }

            /**
             * The port number of the instance.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The details of the IP address whitelist.
             */
            public Builder securityIPGroups(SecurityIPGroups securityIPGroups) {
                this.securityIPGroups = securityIPGroups;
                return this;
            }

            /**
             * An internal parameter. You do not need to specify this parameter.
             */
            public Builder upgradeable(String upgradeable) {
                this.upgradeable = upgradeable;
                return this;
            }

            /**
             * The VPC ID of the instance.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The vSwitch ID of the instance.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The expiration time of the endpoint of the classic network type. Unit: seconds.
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
    public static class DBInstanceNetInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceNetInfo")
        private java.util.List < DBInstanceNetInfo> DBInstanceNetInfo;

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
        public java.util.List < DBInstanceNetInfo> getDBInstanceNetInfo() {
            return this.DBInstanceNetInfo;
        }

        public static final class Builder {
            private java.util.List < DBInstanceNetInfo> DBInstanceNetInfo; 

            /**
             * DBInstanceNetInfo.
             */
            public Builder DBInstanceNetInfo(java.util.List < DBInstanceNetInfo> DBInstanceNetInfo) {
                this.DBInstanceNetInfo = DBInstanceNetInfo;
                return this;
            }

            public DBInstanceNetInfos build() {
                return new DBInstanceNetInfos(this);
            } 

        } 

    }
}
