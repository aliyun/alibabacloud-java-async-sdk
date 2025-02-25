// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecsResponseBody</p>
 */
public class DescribeInstanceSpecsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceSpecs")
    private java.util.List < InstanceSpecs> instanceSpecs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceSpecsResponseBody(Builder builder) {
        this.instanceSpecs = builder.instanceSpecs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceSpecsResponseBody create() {
        return builder().build();
    }

    /**
     * @return instanceSpecs
     */
    public java.util.List < InstanceSpecs> getInstanceSpecs() {
        return this.instanceSpecs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < InstanceSpecs> instanceSpecs; 
        private String requestId; 

        /**
         * <p>The specifications of the Anti-DDoS Origin instance, including whether best-effort protection is enabled, the number of available best-effort protection sessions, and the number of used best-effort protection sessions.</p>
         */
        public Builder instanceSpecs(java.util.List < InstanceSpecs> instanceSpecs) {
            this.instanceSpecs = instanceSpecs;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5840AB9F-1419-4620-807D-5EA476090247</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSpecsResponseBody build() {
            return new DescribeInstanceSpecsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSpecsResponseBody</p>
     */
    public static class PackConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Long bandwidth;

        @com.aliyun.core.annotation.NameInMap("BindIpCount")
        private Integer bindIpCount;

        @com.aliyun.core.annotation.NameInMap("ElasticBwMbps")
        private Integer elasticBwMbps;

        @com.aliyun.core.annotation.NameInMap("ElasticBwMode")
        private String elasticBwMode;

        @com.aliyun.core.annotation.NameInMap("IpAdvanceThre")
        private Integer ipAdvanceThre;

        @com.aliyun.core.annotation.NameInMap("IpBasicThre")
        private Integer ipBasicThre;

        @com.aliyun.core.annotation.NameInMap("IpSpec")
        private Integer ipSpec;

        @com.aliyun.core.annotation.NameInMap("NormalBandwidth")
        private Integer normalBandwidth;

        @com.aliyun.core.annotation.NameInMap("PackAdvThre")
        private Integer packAdvThre;

        @com.aliyun.core.annotation.NameInMap("PackBasicThre")
        private Integer packBasicThre;

        private PackConfig(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bindIpCount = builder.bindIpCount;
            this.elasticBwMbps = builder.elasticBwMbps;
            this.elasticBwMode = builder.elasticBwMode;
            this.ipAdvanceThre = builder.ipAdvanceThre;
            this.ipBasicThre = builder.ipBasicThre;
            this.ipSpec = builder.ipSpec;
            this.normalBandwidth = builder.normalBandwidth;
            this.packAdvThre = builder.packAdvThre;
            this.packBasicThre = builder.packBasicThre;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PackConfig create() {
            return builder().build();
        }

        /**
         * @return bandwidth
         */
        public Long getBandwidth() {
            return this.bandwidth;
        }

        /**
         * @return bindIpCount
         */
        public Integer getBindIpCount() {
            return this.bindIpCount;
        }

        /**
         * @return elasticBwMbps
         */
        public Integer getElasticBwMbps() {
            return this.elasticBwMbps;
        }

        /**
         * @return elasticBwMode
         */
        public String getElasticBwMode() {
            return this.elasticBwMode;
        }

        /**
         * @return ipAdvanceThre
         */
        public Integer getIpAdvanceThre() {
            return this.ipAdvanceThre;
        }

        /**
         * @return ipBasicThre
         */
        public Integer getIpBasicThre() {
            return this.ipBasicThre;
        }

        /**
         * @return ipSpec
         */
        public Integer getIpSpec() {
            return this.ipSpec;
        }

        /**
         * @return normalBandwidth
         */
        public Integer getNormalBandwidth() {
            return this.normalBandwidth;
        }

        /**
         * @return packAdvThre
         */
        public Integer getPackAdvThre() {
            return this.packAdvThre;
        }

        /**
         * @return packBasicThre
         */
        public Integer getPackBasicThre() {
            return this.packBasicThre;
        }

        public static final class Builder {
            private Long bandwidth; 
            private Integer bindIpCount; 
            private Integer elasticBwMbps; 
            private String elasticBwMode; 
            private Integer ipAdvanceThre; 
            private Integer ipBasicThre; 
            private Integer ipSpec; 
            private Integer normalBandwidth; 
            private Integer packAdvThre; 
            private Integer packBasicThre; 

            /**
             * <p>The bandwidth. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The number of IP addresses that are protected by the Anti-DDoS Origin Enterprise instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bindIpCount(Integer bindIpCount) {
                this.bindIpCount = bindIpCount;
                return this;
            }

            /**
             * <p>The burstable clean bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder elasticBwMbps(Integer elasticBwMbps) {
                this.elasticBwMbps = elasticBwMbps;
                return this;
            }

            /**
             * <p>The metering method of burstable clean bandwidth. Valid values:</p>
             * <ul>
             * <li><strong>month</strong>: the monthly 95th percentile metering method.</li>
             * <li><strong>day</strong>: the daily 95th percentile metering method.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>day</p>
             */
            public Builder elasticBwMode(String elasticBwMode) {
                this.elasticBwMode = elasticBwMode;
                return this;
            }

            /**
             * <p>The burstable protection bandwidth of each protected IP address. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder ipAdvanceThre(Integer ipAdvanceThre) {
                this.ipAdvanceThre = ipAdvanceThre;
                return this;
            }

            /**
             * <p>The basic protection bandwidth of each protected IP address. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder ipBasicThre(Integer ipBasicThre) {
                this.ipBasicThre = ipBasicThre;
                return this;
            }

            /**
             * <p>The number of IP addresses that can be protected by the Anti-DDoS Origin Enterprise instance.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder ipSpec(Integer ipSpec) {
                this.ipSpec = ipSpec;
                return this;
            }

            /**
             * <p>The clean bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder normalBandwidth(Integer normalBandwidth) {
                this.normalBandwidth = normalBandwidth;
                return this;
            }

            /**
             * <p>The burstable protection bandwidth of the Anti-DDoS Origin instance. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder packAdvThre(Integer packAdvThre) {
                this.packAdvThre = packAdvThre;
                return this;
            }

            /**
             * <p>The basic protection bandwidth of the Anti-DDoS Origin instance. Unit: Gbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder packBasicThre(Integer packBasicThre) {
                this.packBasicThre = packBasicThre;
                return this;
            }

            public PackConfig build() {
                return new PackConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstanceSpecsResponseBody</p>
     */
    public static class InstanceSpecs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvailableDefenseTimes")
        private Integer availableDefenseTimes;

        @com.aliyun.core.annotation.NameInMap("AvailableDeleteBlackholeCount")
        private String availableDeleteBlackholeCount;

        @com.aliyun.core.annotation.NameInMap("DefenseTimesPercent")
        private Integer defenseTimesPercent;

        @com.aliyun.core.annotation.NameInMap("DowngradeStatus")
        private Integer downgradeStatus;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IsFullDefenseMode")
        private Integer isFullDefenseMode;

        @com.aliyun.core.annotation.NameInMap("PackConfig")
        private PackConfig packConfig;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("TotalDefenseTimes")
        private Integer totalDefenseTimes;

        private InstanceSpecs(Builder builder) {
            this.availableDefenseTimes = builder.availableDefenseTimes;
            this.availableDeleteBlackholeCount = builder.availableDeleteBlackholeCount;
            this.defenseTimesPercent = builder.defenseTimesPercent;
            this.downgradeStatus = builder.downgradeStatus;
            this.instanceId = builder.instanceId;
            this.isFullDefenseMode = builder.isFullDefenseMode;
            this.packConfig = builder.packConfig;
            this.region = builder.region;
            this.totalDefenseTimes = builder.totalDefenseTimes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceSpecs create() {
            return builder().build();
        }

        /**
         * @return availableDefenseTimes
         */
        public Integer getAvailableDefenseTimes() {
            return this.availableDefenseTimes;
        }

        /**
         * @return availableDeleteBlackholeCount
         */
        public String getAvailableDeleteBlackholeCount() {
            return this.availableDeleteBlackholeCount;
        }

        /**
         * @return defenseTimesPercent
         */
        public Integer getDefenseTimesPercent() {
            return this.defenseTimesPercent;
        }

        /**
         * @return downgradeStatus
         */
        public Integer getDowngradeStatus() {
            return this.downgradeStatus;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return isFullDefenseMode
         */
        public Integer getIsFullDefenseMode() {
            return this.isFullDefenseMode;
        }

        /**
         * @return packConfig
         */
        public PackConfig getPackConfig() {
            return this.packConfig;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return totalDefenseTimes
         */
        public Integer getTotalDefenseTimes() {
            return this.totalDefenseTimes;
        }

        public static final class Builder {
            private Integer availableDefenseTimes; 
            private String availableDeleteBlackholeCount; 
            private Integer defenseTimesPercent; 
            private Integer downgradeStatus; 
            private String instanceId; 
            private Integer isFullDefenseMode; 
            private PackConfig packConfig; 
            private String region; 
            private Integer totalDefenseTimes; 

            /**
             * <p>The available best-effort protection sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder availableDefenseTimes(Integer availableDefenseTimes) {
                this.availableDefenseTimes = availableDefenseTimes;
                return this;
            }

            /**
             * <p>The number of times that blackhole filtering can be deactivated.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder availableDeleteBlackholeCount(String availableDeleteBlackholeCount) {
                this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
                return this;
            }

            /**
             * <p>The percentage of the used best-effort protection sessions. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder defenseTimesPercent(Integer defenseTimesPercent) {
                this.defenseTimesPercent = defenseTimesPercent;
                return this;
            }

            /**
             * <p>Indicates whether the instance is downgraded. Valid value:</p>
             * <ul>
             * <li><strong>8</strong>: The instance is downgraded due to excessive bandwidth usage.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder downgradeStatus(Integer downgradeStatus) {
                this.downgradeStatus = downgradeStatus;
                return this;
            }

            /**
             * <p>The ID of the Anti-DDoS Origin instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ddosbgp-cn-n6w1r7nz****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Indicates whether best-effort protection is enabled. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Best-effort protection is disabled.</li>
             * <li><strong>1</strong>: Best-effort protection is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder isFullDefenseMode(Integer isFullDefenseMode) {
                this.isFullDefenseMode = isFullDefenseMode;
                return this;
            }

            /**
             * <p>The configurations of the Anti-DDoS Origin instance, including the number of protected IP addresses and protection bandwidth.</p>
             */
            public Builder packConfig(PackConfig packConfig) {
                this.packConfig = packConfig;
                return this;
            }

            /**
             * <p>The region ID of the Anti-DDoS Origin instance.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the name of the region.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The total best-effort protection sessions.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalDefenseTimes(Integer totalDefenseTimes) {
                this.totalDefenseTimes = totalDefenseTimes;
                return this;
            }

            public InstanceSpecs build() {
                return new InstanceSpecs(this);
            } 

        } 

    }
}
