// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
    private DBInstanceNetInfos DBInstanceNetInfos;

    @NameInMap("InstanceNetworkType")
    private String instanceNetworkType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SecurityIPMode")
    private String securityIPMode;

    private DescribeDBInstanceNetInfoResponseBody(Builder builder) {
        this.DBInstanceNetInfos = builder.DBInstanceNetInfos;
        this.instanceNetworkType = builder.instanceNetworkType;
        this.requestId = builder.requestId;
        this.securityIPMode = builder.securityIPMode;
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

    /**
     * @return securityIPMode
     */
    public String getSecurityIPMode() {
        return this.securityIPMode;
    }

    public static final class Builder {
        private DBInstanceNetInfos DBInstanceNetInfos; 
        private String instanceNetworkType; 
        private String requestId; 
        private String securityIPMode; 

        /**
         * Details of the endpoints of the instance.
         */
        public Builder DBInstanceNetInfos(DBInstanceNetInfos DBInstanceNetInfos) {
            this.DBInstanceNetInfos = DBInstanceNetInfos;
            return this;
        }

        /**
         * The network type of the instance. Valid values:
         * <p>
         * 
         * *   **Classic**: classic network
         * *   **VPC**: virtual private cloud (VPC)
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

        /**
         * The whitelist mode of the instance. Valid values:
         * <p>
         * 
         * *   **normal**: standard whitelist mode
         * *   **safety**: enhanced whitelist mode
         */
        public Builder securityIPMode(String securityIPMode) {
            this.securityIPMode = securityIPMode;
            return this;
        }

        public DescribeDBInstanceNetInfoResponseBody build() {
            return new DescribeDBInstanceNetInfoResponseBody(this);
        } 

    } 

    public static class DBInstanceWeight extends TeaModel {
        @NameInMap("Availability")
        private String availability;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceType")
        private String DBInstanceType;

        @NameInMap("Role")
        private String role;

        @NameInMap("Weight")
        private String weight;

        private DBInstanceWeight(Builder builder) {
            this.availability = builder.availability;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceType = builder.DBInstanceType;
            this.role = builder.role;
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
         * @return role
         */
        public String getRole() {
            return this.role;
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
            private String role; 
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
             * The ID of the instance.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The database engine of the instance. Valid values:
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
             * A deprecated parameter.
             */
            public Builder role(String role) {
                this.role = role;
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
        @NameInMap("DBInstanceWeight")
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
        @NameInMap("SecurityIPGroupName")
        private String securityIPGroupName;

        @NameInMap("SecurityIPs")
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
             * The IP addresses contained in the IP address whitelist.
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
        @NameInMap("securityIPGroup")
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
        @NameInMap("BabelfishPort")
        private String babelfishPort;

        @NameInMap("ConnectionString")
        private String connectionString;

        @NameInMap("ConnectionStringType")
        private String connectionStringType;

        @NameInMap("DBInstanceWeights")
        private DBInstanceWeights DBInstanceWeights;

        @NameInMap("DistributionType")
        private String distributionType;

        @NameInMap("ExpiredTime")
        private String expiredTime;

        @NameInMap("IPAddress")
        private String IPAddress;

        @NameInMap("IPType")
        private String IPType;

        @NameInMap("MaxDelayTime")
        private String maxDelayTime;

        @NameInMap("PGBouncerPort")
        private String PGBouncerPort;

        @NameInMap("Port")
        private String port;

        @NameInMap("SecurityIPGroups")
        private SecurityIPGroups securityIPGroups;

        @NameInMap("Upgradeable")
        private String upgradeable;

        @NameInMap("VPCId")
        private String VPCId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        private DBInstanceNetInfo(Builder builder) {
            this.babelfishPort = builder.babelfishPort;
            this.connectionString = builder.connectionString;
            this.connectionStringType = builder.connectionStringType;
            this.DBInstanceWeights = builder.DBInstanceWeights;
            this.distributionType = builder.distributionType;
            this.expiredTime = builder.expiredTime;
            this.IPAddress = builder.IPAddress;
            this.IPType = builder.IPType;
            this.maxDelayTime = builder.maxDelayTime;
            this.PGBouncerPort = builder.PGBouncerPort;
            this.port = builder.port;
            this.securityIPGroups = builder.securityIPGroups;
            this.upgradeable = builder.upgradeable;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceNetInfo create() {
            return builder().build();
        }

        /**
         * @return babelfishPort
         */
        public String getBabelfishPort() {
            return this.babelfishPort;
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
         * @return maxDelayTime
         */
        public String getMaxDelayTime() {
            return this.maxDelayTime;
        }

        /**
         * @return PGBouncerPort
         */
        public String getPGBouncerPort() {
            return this.PGBouncerPort;
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

        public static final class Builder {
            private String babelfishPort; 
            private String connectionString; 
            private String connectionStringType; 
            private DBInstanceWeights DBInstanceWeights; 
            private String distributionType; 
            private String expiredTime; 
            private String IPAddress; 
            private String IPType; 
            private String maxDelayTime; 
            private String PGBouncerPort; 
            private String port; 
            private SecurityIPGroups securityIPGroups; 
            private String upgradeable; 
            private String VPCId; 
            private String vSwitchId; 

            /**
             * The Tabular Data Stream (TDS) port of the instance for which Babelfish is enabled.
             * <p>
             * 
             * > This parameter applies only to ApsaraDB RDS for PostgreSQL instances. For more information about Babelfish for ApsaraDB RDS for PostgreSQL, see [Introduction to Babelfish](~~428613~~).
             */
            public Builder babelfishPort(String babelfishPort) {
                this.babelfishPort = babelfishPort;
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
             * *   **Normal**: regular endpoint
             * *   **ReadWriteSplitting**: read/write splitting endpoint
             */
            public Builder connectionStringType(String connectionStringType) {
                this.connectionStringType = connectionStringType;
                return this;
            }

            /**
             * Details of the weight. This parameter is returned only when the read/write splitting feature is enabled for the instance.
             */
            public Builder DBInstanceWeights(DBInstanceWeights DBInstanceWeights) {
                this.DBInstanceWeights = DBInstanceWeights;
                return this;
            }

            /**
             * The policy that is used to assign read weights. This parameter is returned only for a read/write splitting endpoint. Valid values:
             * <p>
             * 
             * *   **Standard**: The system automatically assigns read weights to the instance and its read-only instances based on the specifications of these instances.
             * *   **Custom**: You must manually allocate read weights to the instance and its read-only instances.
             */
            public Builder distributionType(String distributionType) {
                this.distributionType = distributionType;
                return this;
            }

            /**
             * The remaining validity period of the instance of the classic network in hybrid access mode. Unit: seconds.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The IP address of the endpoint.
             */
            public Builder IPAddress(String IPAddress) {
                this.IPAddress = IPAddress;
                return this;
            }

            /**
             * The type of the network.
             * <p>
             * 
             * *   Valid values when the instance resides in the classic network:
             * *   **Inner:**: internal network
             * *   **Public**: Internet
             * *   Valid values when the instance resides in a VPC:
             * *   **Private**: internal network
             * *   **Public**: Internet
             */
            public Builder IPType(String IPType) {
                this.IPType = IPType;
                return this;
            }

            /**
             * The latency threshold. This parameter is returned only for a read/write splitting endpoint. Unit: seconds.
             * <p>
             * 
             * > If the latency on a read-only instance exceeds the specified threshold, the system no longer forwards read requests to the read-only instance.
             */
            public Builder maxDelayTime(String maxDelayTime) {
                this.maxDelayTime = maxDelayTime;
                return this;
            }

            /**
             * PGBouncerPort.
             */
            public Builder PGBouncerPort(String PGBouncerPort) {
                this.PGBouncerPort = PGBouncerPort;
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
             * An array that consists of the details about the IP address whitelists.
             */
            public Builder securityIPGroups(SecurityIPGroups securityIPGroups) {
                this.securityIPGroups = securityIPGroups;
                return this;
            }

            /**
             * Indicates whether the IP version can be updated. Valid values:
             * <p>
             * 
             * *   **Enable**: The IP version can be updated.
             * *   **Disabled**: The IP version cannot be updated.
             * 
             * > The IP version can be updated from IPv4 to IPv6.
             */
            public Builder upgradeable(String upgradeable) {
                this.upgradeable = upgradeable;
                return this;
            }

            /**
             * The ID of the VPC.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public DBInstanceNetInfo build() {
                return new DBInstanceNetInfo(this);
            } 

        } 

    }
    public static class DBInstanceNetInfos extends TeaModel {
        @NameInMap("DBInstanceNetInfo")
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
