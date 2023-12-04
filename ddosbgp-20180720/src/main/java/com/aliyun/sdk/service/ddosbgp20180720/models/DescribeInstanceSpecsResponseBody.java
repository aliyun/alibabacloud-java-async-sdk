// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceSpecsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceSpecsResponseBody</p>
 */
public class DescribeInstanceSpecsResponseBody extends TeaModel {
    @NameInMap("InstanceSpecs")
    private java.util.List < InstanceSpecs> instanceSpecs;

    @NameInMap("RequestId")
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
         * The specifications of the Anti-DDoS Origin Enterprise instance, including whether the unlimited protection feature is enabled, and the numbers of times that the unlimited protection feature can be enabled and has been enabled.
         */
        public Builder instanceSpecs(java.util.List < InstanceSpecs> instanceSpecs) {
            this.instanceSpecs = instanceSpecs;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceSpecsResponseBody build() {
            return new DescribeInstanceSpecsResponseBody(this);
        } 

    } 

    public static class PackConfig extends TeaModel {
        @NameInMap("Bandwidth")
        private Long bandwidth;

        @NameInMap("BindIpCount")
        private Integer bindIpCount;

        @NameInMap("IpAdvanceThre")
        private Integer ipAdvanceThre;

        @NameInMap("IpBasicThre")
        private Integer ipBasicThre;

        @NameInMap("IpSpec")
        private Integer ipSpec;

        @NameInMap("NormalBandwidth")
        private Integer normalBandwidth;

        @NameInMap("PackAdvThre")
        private Integer packAdvThre;

        @NameInMap("PackBasicThre")
        private Integer packBasicThre;

        private PackConfig(Builder builder) {
            this.bandwidth = builder.bandwidth;
            this.bindIpCount = builder.bindIpCount;
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
            private Integer ipAdvanceThre; 
            private Integer ipBasicThre; 
            private Integer ipSpec; 
            private Integer normalBandwidth; 
            private Integer packAdvThre; 
            private Integer packBasicThre; 

            /**
             * The bandwidth of the package configuration.
             */
            public Builder bandwidth(Long bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * The number of IP addresses that are protected by the Anti-DDoS Origin Enterprise instance.
             */
            public Builder bindIpCount(Integer bindIpCount) {
                this.bindIpCount = bindIpCount;
                return this;
            }

            /**
             * The burstable bandwidth of each protected IP address. Unit: Gbit/s.
             */
            public Builder ipAdvanceThre(Integer ipAdvanceThre) {
                this.ipAdvanceThre = ipAdvanceThre;
                return this;
            }

            /**
             * The basic bandwidth of each protected IP address. Unit: Gbit/s.
             */
            public Builder ipBasicThre(Integer ipBasicThre) {
                this.ipBasicThre = ipBasicThre;
                return this;
            }

            /**
             * The number of IP addresses that can be protected by the Anti-DDoS Origin Enterprise instance.
             */
            public Builder ipSpec(Integer ipSpec) {
                this.ipSpec = ipSpec;
                return this;
            }

            /**
             * The normal clean bandwidth. Unit: Mbit/s.
             */
            public Builder normalBandwidth(Integer normalBandwidth) {
                this.normalBandwidth = normalBandwidth;
                return this;
            }

            /**
             * The burstable protection bandwidth of the Anti-DDoS Origin Enterprise instance. Unit: Gbit/s.
             */
            public Builder packAdvThre(Integer packAdvThre) {
                this.packAdvThre = packAdvThre;
                return this;
            }

            /**
             * The basic protection bandwidth of the Anti-DDoS Origin Enterprise instance. Unit: Gbit/s.
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
    public static class InstanceSpecs extends TeaModel {
        @NameInMap("AvailableDefenseTimes")
        private Integer availableDefenseTimes;

        @NameInMap("AvailableDeleteBlackholeCount")
        private String availableDeleteBlackholeCount;

        @NameInMap("DefenseTimesPercent")
        private Integer defenseTimesPercent;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IsFullDefenseMode")
        private Integer isFullDefenseMode;

        @NameInMap("PackConfig")
        private PackConfig packConfig;

        @NameInMap("Region")
        private String region;

        @NameInMap("TotalDefenseTimes")
        private Integer totalDefenseTimes;

        private InstanceSpecs(Builder builder) {
            this.availableDefenseTimes = builder.availableDefenseTimes;
            this.availableDeleteBlackholeCount = builder.availableDeleteBlackholeCount;
            this.defenseTimesPercent = builder.defenseTimesPercent;
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
            private String instanceId; 
            private Integer isFullDefenseMode; 
            private PackConfig packConfig; 
            private String region; 
            private Integer totalDefenseTimes; 

            /**
             * The number of times that the unlimited protection feature can be enabled.
             */
            public Builder availableDefenseTimes(Integer availableDefenseTimes) {
                this.availableDefenseTimes = availableDefenseTimes;
                return this;
            }

            /**
             * The number of times that blackhole filtering can be deactivated.
             */
            public Builder availableDeleteBlackholeCount(String availableDeleteBlackholeCount) {
                this.availableDeleteBlackholeCount = availableDeleteBlackholeCount;
                return this;
            }

            /**
             * DefenseTimesPercent.
             */
            public Builder defenseTimesPercent(Integer defenseTimesPercent) {
                this.defenseTimesPercent = defenseTimesPercent;
                return this;
            }

            /**
             * The ID of the Anti-DDoS Origin Enterprise instance.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * Indicates whether the unlimited protection feature is enabled. Valid values:
             * <p>
             * 
             * *   **0**: The unlimited protection feature is disabled.
             * *   **1**: The unlimited protection feature is enabled.
             */
            public Builder isFullDefenseMode(Integer isFullDefenseMode) {
                this.isFullDefenseMode = isFullDefenseMode;
                return this;
            }

            /**
             * The configurations of the Anti-DDoS Origin Enterprise instance, including the number of protected IP addresses and protection bandwidth.
             */
            public Builder packConfig(PackConfig packConfig) {
                this.packConfig = packConfig;
                return this;
            }

            /**
             * The region ID of the Anti-DDoS Origin Enterprise instance.
             * <p>
             * 
             * >  You can call the [DescribeRegions](~~118703~~) operation to query the name of the region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * The number of times that the unlimited protection feature can be enabled.
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
