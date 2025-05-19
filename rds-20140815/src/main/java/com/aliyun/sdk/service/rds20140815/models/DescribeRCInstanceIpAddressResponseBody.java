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
         * <p>An array that consists of details of the instance.</p>
         */
        public Builder RCInstanceList(java.util.List<RCInstanceList> RCInstanceList) {
            this.RCInstanceList = RCInstanceList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C048E440-EA84-5E97-8C81-2A7060D0****_th**</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of the assets.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The basic protection threshold for the asset. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>5200</p>
             */
            public Builder blackholeThreshold(Integer blackholeThreshold) {
                this.blackholeThreshold = blackholeThreshold;
                return this;
            }

            /**
             * <p>The traffic scrubbing threshold for the asset measured in Mbit/s. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder defenseBpsThreshold(Integer defenseBpsThreshold) {
                this.defenseBpsThreshold = defenseBpsThreshold;
                return this;
            }

            /**
             * <p>The traffic scrubbing threshold for the asset measured in packets per second (PPS). Unit: packets per second (pps).</p>
             * 
             * <strong>example:</strong>
             * <p>70000</p>
             */
            public Builder defensePpsThreshold(Integer defensePpsThreshold) {
                this.defensePpsThreshold = defensePpsThreshold;
                return this;
            }

            /**
             * <p>The burstable protection threshold for the asset. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>12310</p>
             */
            public Builder elasticThreshold(Integer elasticThreshold) {
                this.elasticThreshold = elasticThreshold;
                return this;
            }

            /**
             * <p>The IP address of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>39.105.XXX.XXX</p>
             */
            public Builder instanceIp(String instanceIp) {
                this.instanceIp = instanceIp;
                return this;
            }

            /**
             * <p>The DDoS mitigation status of the asset. Valid values:</p>
             * <ul>
             * <li><strong>mitigating</strong></li>
             * <li><strong>blackholed</strong></li>
             * <li><strong>normal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder ipStatus(String ipStatus) {
                this.ipStatus = ipStatus;
                return this;
            }

            /**
             * <p>The IP version of the instance. Valid values:</p>
             * <ul>
             * <li><strong>v4</strong></li>
             * <li><strong>v6</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>v4</p>
             */
            public Builder ipVersion(String ipVersion) {
                this.ipVersion = ipVersion;
                return this;
            }

            /**
             * <p>Indicates whether the asset is added to the instance. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isBgppack(Boolean isBgppack) {
                this.isBgppack = isBgppack;
                return this;
            }

            /**
             * <p>Indicates whether best-effort protection is enabled for the asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Best-effort protection is disabled.</li>
             * <li><strong>1</strong>: Best-effort protection is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder isFullProtection(Integer isFullProtection) {
                this.isFullProtection = isFullProtection;
                return this;
            }

            /**
             * <p>The region code of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing-wt97-a01</p>
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
             * <p>The ID of the RDS Custom instance.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-kti8hw44yy0x53******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>rc-kti8hw44yy0x53******</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The DDoS mitigation status of the instance. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong></li>
             * <li><strong>abnormal</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder instanceStatus(String instanceStatus) {
                this.instanceStatus = instanceStatus;
                return this;
            }

            /**
             * <p>The type of the asset. The value is fixed to <strong>ecs</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>An array that consists of the details of the asset.</p>
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
