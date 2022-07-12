// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceIpAddressResponseBody</p>
 */
public class DescribeInstanceIpAddressResponseBody extends TeaModel {
    @NameInMap("InstanceList")
    private java.util.List < InstanceList> instanceList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
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
         * InstanceList.
         */
        public Builder instanceList(java.util.List < InstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
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
        @NameInMap("BlackholeThreshold")
        private Integer blackholeThreshold;

        @NameInMap("DefenseBpsThreshold")
        private Integer defenseBpsThreshold;

        @NameInMap("DefensePpsThreshold")
        private Integer defensePpsThreshold;

        @NameInMap("ElasticThreshold")
        private Integer elasticThreshold;

        @NameInMap("InstanceIp")
        private String instanceIp;

        @NameInMap("IpStatus")
        private String ipStatus;

        @NameInMap("IpVersion")
        private String ipVersion;

        @NameInMap("IsBgppack")
        private Boolean isBgppack;

        @NameInMap("RegionId")
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
            private String regionId; 

            /**
             * BlackholeThreshold.
             */
            public Builder blackholeThreshold(Integer blackholeThreshold) {
                this.blackholeThreshold = blackholeThreshold;
                return this;
            }

            /**
             * DefenseBpsThreshold.
             */
            public Builder defenseBpsThreshold(Integer defenseBpsThreshold) {
                this.defenseBpsThreshold = defenseBpsThreshold;
                return this;
            }

            /**
             * DefensePpsThreshold.
             */
            public Builder defensePpsThreshold(Integer defensePpsThreshold) {
                this.defensePpsThreshold = defensePpsThreshold;
                return this;
            }

            /**
             * ElasticThreshold.
             */
            public Builder elasticThreshold(Integer elasticThreshold) {
                this.elasticThreshold = elasticThreshold;
                return this;
            }

            /**
             * InstanceIp.
             */
            public Builder instanceIp(String instanceIp) {
                this.instanceIp = instanceIp;
                return this;
            }

            /**
             * IpStatus.
             */
            public Builder ipStatus(String ipStatus) {
                this.ipStatus = ipStatus;
                return this;
            }

            /**
             * IpVersion.
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * IsBgppack.
             */
            public Builder isBgppack(Boolean isBgppack) {
                this.isBgppack = isBgppack;
                return this;
            }

            /**
             * RegionId.
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
        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceStatus")
        private String instanceStatus;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("IpAddressConfig")
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
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceStatus.
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * IpAddressConfig.
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
