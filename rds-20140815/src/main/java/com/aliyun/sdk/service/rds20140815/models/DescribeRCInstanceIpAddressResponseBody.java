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
 * {@link DescribeRCInstanceIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceIpAddressResponseBody</p>
 */
public class DescribeRCInstanceIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RCInstanceList")
    private java.util.List<RCInstanceList> RCInstanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private String total;

    private DescribeRCInstanceIpAddressResponseBody(Builder builder) {
        this.RCInstanceList = builder.RCInstanceList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceIpAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return RCInstanceList
     */
    public java.util.List<RCInstanceList> getRCInstanceList() {
        return this.RCInstanceList;
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
    public String getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<RCInstanceList> RCInstanceList; 
        private String requestId; 
        private String total; 

        private Builder() {
        } 

        private Builder(DescribeRCInstanceIpAddressResponseBody model) {
            this.RCInstanceList = model.RCInstanceList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * RCInstanceList.
         */
        public Builder RCInstanceList(java.util.List<RCInstanceList> RCInstanceList) {
            this.RCInstanceList = RCInstanceList;
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
        public Builder total(String total) {
            this.total = total;
            return this;
        }

        public DescribeRCInstanceIpAddressResponseBody build() {
            return new DescribeRCInstanceIpAddressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRCInstanceIpAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceIpAddressResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(IpAddressConfig model) {
                this.blackholeThreshold = model.blackholeThreshold;
                this.defenseBpsThreshold = model.defenseBpsThreshold;
                this.defensePpsThreshold = model.defensePpsThreshold;
                this.elasticThreshold = model.elasticThreshold;
                this.instanceIp = model.instanceIp;
                this.ipStatus = model.ipStatus;
                this.ipVersion = model.ipVersion;
                this.isBgppack = model.isBgppack;
                this.isFullProtection = model.isFullProtection;
                this.regionId = model.regionId;
            } 

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
             * IsFullProtection.
             */
            public Builder isFullProtection(Integer isFullProtection) {
                this.isFullProtection = isFullProtection;
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
    /**
     * 
     * {@link DescribeRCInstanceIpAddressResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRCInstanceIpAddressResponseBody</p>
     */
    public static class RCInstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InstanceStatus")
        private String instanceStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("IpAddressConfig")
        private java.util.List<IpAddressConfig> ipAddressConfig;

        private RCInstanceList(Builder builder) {
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceStatus = builder.instanceStatus;
            this.instanceType = builder.instanceType;
            this.ipAddressConfig = builder.ipAddressConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RCInstanceList create() {
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
        public java.util.List<IpAddressConfig> getIpAddressConfig() {
            return this.ipAddressConfig;
        }

        public static final class Builder {
            private String instanceId; 
            private String instanceName; 
            private String instanceStatus; 
            private String instanceType; 
            private java.util.List<IpAddressConfig> ipAddressConfig; 

            private Builder() {
            } 

            private Builder(RCInstanceList model) {
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.instanceStatus = model.instanceStatus;
                this.instanceType = model.instanceType;
                this.ipAddressConfig = model.ipAddressConfig;
            } 

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
            public Builder ipAddressConfig(java.util.List<IpAddressConfig> ipAddressConfig) {
                this.ipAddressConfig = ipAddressConfig;
                return this;
            }

            public RCInstanceList build() {
                return new RCInstanceList(this);
            } 

        } 

    }
}
