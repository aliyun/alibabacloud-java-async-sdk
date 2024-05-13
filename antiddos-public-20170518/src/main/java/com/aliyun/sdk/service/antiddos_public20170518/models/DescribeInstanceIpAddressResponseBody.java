// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceIpAddressResponseBody</p>
 */
public class DescribeInstanceIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private DescribeInstanceIpAddressResponseBody(Builder builder) {
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceIpAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceList
     */
    public java.util.List < InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < InstanceList> instanceList; 
        private String requestId; 
        private Integer total; 

        /**
         * An array that consists of details of the instance.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of the assets.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public DescribeInstanceIpAddressResponseBody build() {
            return new DescribeInstanceIpAddressResponseBody(this);
        } 

    } 

    public static class IpAddressConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackholeThreshold")
        private Integer blackholeThreshold;

        @com.aliyun.core.annotation.NameInMap("DefenseBpsThreshold")
        private Integer defenseBpsThreshold;

        @com.aliyun.core.annotation.NameInMap("DefensePpsThreshold")
        private Integer defensePpsThreshold;

        @com.aliyun.core.annotation.NameInMap("ElasticThreshold")
        private Integer elasticThreshold;

        @com.aliyun.core.annotation.NameInMap("InstanceIp")
        private String instanceIp;

        @com.aliyun.core.annotation.NameInMap("IpStatus")
        private String ipStatus;

        @com.aliyun.core.annotation.NameInMap("IpVersion")
        private String ipVersion;

        @com.aliyun.core.annotation.NameInMap("IsBgppack")
        private Boolean isBgppack;

        @com.aliyun.core.annotation.NameInMap("IsFullProtection")
        private Integer isFullProtection;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private IpAddressConfig(Builder builder) {
            this.blackholeThreshold = builder.blackholeThreshold;
            this.defenseBpsThreshold = builder.defenseBpsThreshold;
            this.defensePpsThreshold = builder.defensePpsThreshold;
            this.elasticThreshold = builder.elasticThreshold;
            this.instanceIp = builder.instanceIp;
            this.ipStatus = builder.ipStatus;
            this.ipVersion = builder.ipVersion;
            this.isBgppack = builder.isBgppack;
            this.isFullProtection = builder.isFullProtection;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpAddressConfig create() {
            return builder().build();
        }

        /**
         * @return blackholeThreshold
         */
        public Integer getBlackholeThreshold() {
            return this.blackholeThreshold;
        }

        /**
         * @return defenseBpsThreshold
         */
        public Integer getDefenseBpsThreshold() {
            return this.defenseBpsThreshold;
        }

        /**
         * @return defensePpsThreshold
         */
        public Integer getDefensePpsThreshold() {
            return this.defensePpsThreshold;
        }

        /**
         * @return elasticThreshold
         */
        public Integer getElasticThreshold() {
            return this.elasticThreshold;
        }

        /**
         * @return instanceIp
         */
        public String getInstanceIp() {
            return this.instanceIp;
        }

        /**
         * @return ipStatus
         */
        public String getIpStatus() {
            return this.ipStatus;
        }

        /**
         * @return ipVersion
         */
        public String getIpVersion() {
            return this.ipVersion;
        }

        /**
         * @return isBgppack
         */
        public Boolean getIsBgppack() {
            return this.isBgppack;
        }

        /**
         * @return isFullProtection
         */
        public Integer getIsFullProtection() {
            return this.isFullProtection;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private Integer blackholeThreshold; 
            private Integer defenseBpsThreshold; 
            private Integer defensePpsThreshold; 
            private Integer elasticThreshold; 
            private String instanceIp; 
            private String ipStatus; 
            private String ipVersion; 
            private Boolean isBgppack; 
            private Integer isFullProtection; 
            private String regionId; 

            /**
             * The basic protection threshold for the asset. Unit: Mbit/s.
             */
            public Builder blackholeThreshold(Integer blackholeThreshold) {
                this.blackholeThreshold = blackholeThreshold;
                return this;
            }

            /**
             * The traffic scrubbing threshold for the asset. Unit: Mbit/s.
             */
            public Builder defenseBpsThreshold(Integer defenseBpsThreshold) {
                this.defenseBpsThreshold = defenseBpsThreshold;
                return this;
            }

            /**
             * The packet scrubbing threshold for the asset. Unit: packets per second (pps).
             */
            public Builder defensePpsThreshold(Integer defensePpsThreshold) {
                this.defensePpsThreshold = defensePpsThreshold;
                return this;
            }

            /**
             * The burstable protection threshold for the asset. Unit: Mbit/s.
             */
            public Builder elasticThreshold(Integer elasticThreshold) {
                this.elasticThreshold = elasticThreshold;
                return this;
            }

            /**
             * The IP address of the asset.
             */
            public Builder instanceIp(String instanceIp) {
                this.instanceIp = instanceIp;
                return this;
            }

            /**
             * The DDoS mitigation status of the asset. Valid values:
             * <p>
             * 
             * *   **defense**: indicates that traffic scrubbing is performed on the asset.
             * *   **blackhole**: indicates that blackhole filtering is triggered for the asset.
             * *   **normal**: indicates that no DDoS attacks are launched against the asset.
             */
            public Builder ipStatus(String ipStatus) {
                this.ipStatus = ipStatus;
                return this;
            }

            /**
             * The IP protocol that is supported by the asset. Valid values:
             * <p>
             * 
             * *   **v4**: IPv4
             * *   **v6**: IPv6
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * Indicates whether the asset is added to the instance. Valid values:
             * <p>
             * 
             * *   **true**: yes
             * *   **false**: no
             */
            public Builder isBgppack(Boolean isBgppack) {
                this.isBgppack = isBgppack;
                return this;
            }

            /**
             * IsFullProtection.
             */
            public Builder isFullProtection(Integer isFullProtection) {
                this.isFullProtection = isFullProtection;
                return this;
            }

            /**
             * The region code of the asset.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public IpAddressConfig build() {
                return new IpAddressConfig(this);
            } 

        } 

    }
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IpAddressConfig")
        private java.util.List < IpAddressConfig> ipAddressConfig;

        private InstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.ipAddressConfig = builder.ipAddressConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceStatus
         */
        public String getInstanceStatus() {
            return this.instanceStatus;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return ipAddressConfig
         */
        public java.util.List < IpAddressConfig> getIpAddressConfig() {
            return this.ipAddressConfig;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private String instanceType; 
            private java.util.List < IpAddressConfig> ipAddressConfig; 

            /**
             * The ID of the instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The DDoS mitigation status of the instance. Valid values:
             * <p>
             * 
             * *   **normal**: normal
             * *   **abnormal**: under DDoS attacks
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * The type of the asset. Valid values:
             * <p>
             * 
             * *   **ecs**: ECS instance
             * *   **slb**: SLB instance
             * *   **eip**: EIP
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * An array that consists of the details of the asset.
             */
            public Builder ipAddressConfig(java.util.List < IpAddressConfig> ipAddressConfig) {
                this.ipAddressConfig = ipAddressConfig;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
