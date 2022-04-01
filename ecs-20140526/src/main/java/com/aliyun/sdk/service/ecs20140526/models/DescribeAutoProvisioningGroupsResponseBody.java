// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoProvisioningGroupsResponseBody</p>
 */
public class DescribeAutoProvisioningGroupsResponseBody extends TeaModel {
    @NameInMap("AutoProvisioningGroups")
    private AutoProvisioningGroups autoProvisioningGroups;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAutoProvisioningGroupsResponseBody(Builder builder) {
        this.autoProvisioningGroups = builder.autoProvisioningGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoProvisioningGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return autoProvisioningGroups
     */
    public AutoProvisioningGroups getAutoProvisioningGroups() {
        return this.autoProvisioningGroups;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private AutoProvisioningGroups autoProvisioningGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AutoProvisioningGroups.
         */
        public Builder autoProvisioningGroups(AutoProvisioningGroups autoProvisioningGroups) {
            this.autoProvisioningGroups = autoProvisioningGroups;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoProvisioningGroupsResponseBody build() {
            return new DescribeAutoProvisioningGroupsResponseBody(this);
        } 

    } 

    public static class LaunchTemplateConfig extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("Priority")
        private Float priority;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("WeightedCapacity")
        private Float weightedCapacity;

        private LaunchTemplateConfig(Builder builder) {
            this.instanceType = builder.instanceType;
            this.maxPrice = builder.maxPrice;
            this.priority = builder.priority;
            this.vSwitchId = builder.vSwitchId;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateConfig create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return maxPrice
         */
        public Float getMaxPrice() {
            return this.maxPrice;
        }

        /**
         * @return priority
         */
        public Float getPriority() {
            return this.priority;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return weightedCapacity
         */
        public Float getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Float maxPrice; 
            private Float priority; 
            private String vSwitchId; 
            private Float weightedCapacity; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * MaxPrice.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Float priority) {
                this.priority = priority;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * WeightedCapacity.
             */
            public Builder weightedCapacity(Float weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public LaunchTemplateConfig build() {
                return new LaunchTemplateConfig(this);
            } 

        } 

    }
    public static class LaunchTemplateConfigs extends TeaModel {
        @NameInMap("LaunchTemplateConfig")
        private java.util.List < LaunchTemplateConfig> launchTemplateConfig;

        private LaunchTemplateConfigs(Builder builder) {
            this.launchTemplateConfig = builder.launchTemplateConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateConfigs create() {
            return builder().build();
        }

        /**
         * @return launchTemplateConfig
         */
        public java.util.List < LaunchTemplateConfig> getLaunchTemplateConfig() {
            return this.launchTemplateConfig;
        }

        public static final class Builder {
            private java.util.List < LaunchTemplateConfig> launchTemplateConfig; 

            /**
             * LaunchTemplateConfig.
             */
            public Builder launchTemplateConfig(java.util.List < LaunchTemplateConfig> launchTemplateConfig) {
                this.launchTemplateConfig = launchTemplateConfig;
                return this;
            }

            public LaunchTemplateConfigs build() {
                return new LaunchTemplateConfigs(this);
            } 

        } 

    }
    public static class PayAsYouGoOptions extends TeaModel {
        @NameInMap("AllocationStrategy")
        private String allocationStrategy;

        private PayAsYouGoOptions(Builder builder) {
            this.allocationStrategy = builder.allocationStrategy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PayAsYouGoOptions create() {
            return builder().build();
        }

        /**
         * @return allocationStrategy
         */
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        public static final class Builder {
            private String allocationStrategy; 

            /**
             * AllocationStrategy.
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            public PayAsYouGoOptions build() {
                return new PayAsYouGoOptions(this);
            } 

        } 

    }
    public static class SpotOptions extends TeaModel {
        @NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @NameInMap("InstanceInterruptionBehavior")
        private String instanceInterruptionBehavior;

        @NameInMap("InstancePoolsToUseCount")
        private Integer instancePoolsToUseCount;

        private SpotOptions(Builder builder) {
            this.allocationStrategy = builder.allocationStrategy;
            this.instanceInterruptionBehavior = builder.instanceInterruptionBehavior;
            this.instancePoolsToUseCount = builder.instancePoolsToUseCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotOptions create() {
            return builder().build();
        }

        /**
         * @return allocationStrategy
         */
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        /**
         * @return instanceInterruptionBehavior
         */
        public String getInstanceInterruptionBehavior() {
            return this.instanceInterruptionBehavior;
        }

        /**
         * @return instancePoolsToUseCount
         */
        public Integer getInstancePoolsToUseCount() {
            return this.instancePoolsToUseCount;
        }

        public static final class Builder {
            private String allocationStrategy; 
            private String instanceInterruptionBehavior; 
            private Integer instancePoolsToUseCount; 

            /**
             * AllocationStrategy.
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * InstanceInterruptionBehavior.
             */
            public Builder instanceInterruptionBehavior(String instanceInterruptionBehavior) {
                this.instanceInterruptionBehavior = instanceInterruptionBehavior;
                return this;
            }

            /**
             * InstancePoolsToUseCount.
             */
            public Builder instancePoolsToUseCount(Integer instancePoolsToUseCount) {
                this.instancePoolsToUseCount = instancePoolsToUseCount;
                return this;
            }

            public SpotOptions build() {
                return new SpotOptions(this);
            } 

        } 

    }
    public static class TargetCapacitySpecification extends TeaModel {
        @NameInMap("DefaultTargetCapacityType")
        private String defaultTargetCapacityType;

        @NameInMap("PayAsYouGoTargetCapacity")
        private Float payAsYouGoTargetCapacity;

        @NameInMap("SpotTargetCapacity")
        private Float spotTargetCapacity;

        @NameInMap("TotalTargetCapacity")
        private Float totalTargetCapacity;

        private TargetCapacitySpecification(Builder builder) {
            this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
            this.payAsYouGoTargetCapacity = builder.payAsYouGoTargetCapacity;
            this.spotTargetCapacity = builder.spotTargetCapacity;
            this.totalTargetCapacity = builder.totalTargetCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetCapacitySpecification create() {
            return builder().build();
        }

        /**
         * @return defaultTargetCapacityType
         */
        public String getDefaultTargetCapacityType() {
            return this.defaultTargetCapacityType;
        }

        /**
         * @return payAsYouGoTargetCapacity
         */
        public Float getPayAsYouGoTargetCapacity() {
            return this.payAsYouGoTargetCapacity;
        }

        /**
         * @return spotTargetCapacity
         */
        public Float getSpotTargetCapacity() {
            return this.spotTargetCapacity;
        }

        /**
         * @return totalTargetCapacity
         */
        public Float getTotalTargetCapacity() {
            return this.totalTargetCapacity;
        }

        public static final class Builder {
            private String defaultTargetCapacityType; 
            private Float payAsYouGoTargetCapacity; 
            private Float spotTargetCapacity; 
            private Float totalTargetCapacity; 

            /**
             * DefaultTargetCapacityType.
             */
            public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
                this.defaultTargetCapacityType = defaultTargetCapacityType;
                return this;
            }

            /**
             * PayAsYouGoTargetCapacity.
             */
            public Builder payAsYouGoTargetCapacity(Float payAsYouGoTargetCapacity) {
                this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
                return this;
            }

            /**
             * SpotTargetCapacity.
             */
            public Builder spotTargetCapacity(Float spotTargetCapacity) {
                this.spotTargetCapacity = spotTargetCapacity;
                return this;
            }

            /**
             * TotalTargetCapacity.
             */
            public Builder totalTargetCapacity(Float totalTargetCapacity) {
                this.totalTargetCapacity = totalTargetCapacity;
                return this;
            }

            public TargetCapacitySpecification build() {
                return new TargetCapacitySpecification(this);
            } 

        } 

    }
    public static class AutoProvisioningGroup extends TeaModel {
        @NameInMap("AutoProvisioningGroupId")
        private String autoProvisioningGroupId;

        @NameInMap("AutoProvisioningGroupName")
        private String autoProvisioningGroupName;

        @NameInMap("AutoProvisioningGroupType")
        private String autoProvisioningGroupType;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("ExcessCapacityTerminationPolicy")
        private String excessCapacityTerminationPolicy;

        @NameInMap("LaunchTemplateConfigs")
        private LaunchTemplateConfigs launchTemplateConfigs;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @NameInMap("MaxSpotPrice")
        private Float maxSpotPrice;

        @NameInMap("PayAsYouGoOptions")
        private PayAsYouGoOptions payAsYouGoOptions;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SpotOptions")
        private SpotOptions spotOptions;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetCapacitySpecification")
        private TargetCapacitySpecification targetCapacitySpecification;

        @NameInMap("TerminateInstances")
        private Boolean terminateInstances;

        @NameInMap("TerminateInstancesWithExpiration")
        private Boolean terminateInstancesWithExpiration;

        @NameInMap("ValidFrom")
        private String validFrom;

        @NameInMap("ValidUntil")
        private String validUntil;

        private AutoProvisioningGroup(Builder builder) {
            this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
            this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
            this.autoProvisioningGroupType = builder.autoProvisioningGroupType;
            this.creationTime = builder.creationTime;
            this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
            this.launchTemplateConfigs = builder.launchTemplateConfigs;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.maxSpotPrice = builder.maxSpotPrice;
            this.payAsYouGoOptions = builder.payAsYouGoOptions;
            this.regionId = builder.regionId;
            this.spotOptions = builder.spotOptions;
            this.state = builder.state;
            this.status = builder.status;
            this.targetCapacitySpecification = builder.targetCapacitySpecification;
            this.terminateInstances = builder.terminateInstances;
            this.terminateInstancesWithExpiration = builder.terminateInstancesWithExpiration;
            this.validFrom = builder.validFrom;
            this.validUntil = builder.validUntil;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoProvisioningGroup create() {
            return builder().build();
        }

        /**
         * @return autoProvisioningGroupId
         */
        public String getAutoProvisioningGroupId() {
            return this.autoProvisioningGroupId;
        }

        /**
         * @return autoProvisioningGroupName
         */
        public String getAutoProvisioningGroupName() {
            return this.autoProvisioningGroupName;
        }

        /**
         * @return autoProvisioningGroupType
         */
        public String getAutoProvisioningGroupType() {
            return this.autoProvisioningGroupType;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return excessCapacityTerminationPolicy
         */
        public String getExcessCapacityTerminationPolicy() {
            return this.excessCapacityTerminationPolicy;
        }

        /**
         * @return launchTemplateConfigs
         */
        public LaunchTemplateConfigs getLaunchTemplateConfigs() {
            return this.launchTemplateConfigs;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return maxSpotPrice
         */
        public Float getMaxSpotPrice() {
            return this.maxSpotPrice;
        }

        /**
         * @return payAsYouGoOptions
         */
        public PayAsYouGoOptions getPayAsYouGoOptions() {
            return this.payAsYouGoOptions;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return spotOptions
         */
        public SpotOptions getSpotOptions() {
            return this.spotOptions;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetCapacitySpecification
         */
        public TargetCapacitySpecification getTargetCapacitySpecification() {
            return this.targetCapacitySpecification;
        }

        /**
         * @return terminateInstances
         */
        public Boolean getTerminateInstances() {
            return this.terminateInstances;
        }

        /**
         * @return terminateInstancesWithExpiration
         */
        public Boolean getTerminateInstancesWithExpiration() {
            return this.terminateInstancesWithExpiration;
        }

        /**
         * @return validFrom
         */
        public String getValidFrom() {
            return this.validFrom;
        }

        /**
         * @return validUntil
         */
        public String getValidUntil() {
            return this.validUntil;
        }

        public static final class Builder {
            private String autoProvisioningGroupId; 
            private String autoProvisioningGroupName; 
            private String autoProvisioningGroupType; 
            private String creationTime; 
            private String excessCapacityTerminationPolicy; 
            private LaunchTemplateConfigs launchTemplateConfigs; 
            private String launchTemplateId; 
            private String launchTemplateVersion; 
            private Float maxSpotPrice; 
            private PayAsYouGoOptions payAsYouGoOptions; 
            private String regionId; 
            private SpotOptions spotOptions; 
            private String state; 
            private String status; 
            private TargetCapacitySpecification targetCapacitySpecification; 
            private Boolean terminateInstances; 
            private Boolean terminateInstancesWithExpiration; 
            private String validFrom; 
            private String validUntil; 

            /**
             * AutoProvisioningGroupId.
             */
            public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
                this.autoProvisioningGroupId = autoProvisioningGroupId;
                return this;
            }

            /**
             * AutoProvisioningGroupName.
             */
            public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
                this.autoProvisioningGroupName = autoProvisioningGroupName;
                return this;
            }

            /**
             * AutoProvisioningGroupType.
             */
            public Builder autoProvisioningGroupType(String autoProvisioningGroupType) {
                this.autoProvisioningGroupType = autoProvisioningGroupType;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * ExcessCapacityTerminationPolicy.
             */
            public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
                this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
                return this;
            }

            /**
             * LaunchTemplateConfigs.
             */
            public Builder launchTemplateConfigs(LaunchTemplateConfigs launchTemplateConfigs) {
                this.launchTemplateConfigs = launchTemplateConfigs;
                return this;
            }

            /**
             * LaunchTemplateId.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * LaunchTemplateVersion.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * MaxSpotPrice.
             */
            public Builder maxSpotPrice(Float maxSpotPrice) {
                this.maxSpotPrice = maxSpotPrice;
                return this;
            }

            /**
             * PayAsYouGoOptions.
             */
            public Builder payAsYouGoOptions(PayAsYouGoOptions payAsYouGoOptions) {
                this.payAsYouGoOptions = payAsYouGoOptions;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * SpotOptions.
             */
            public Builder spotOptions(SpotOptions spotOptions) {
                this.spotOptions = spotOptions;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetCapacitySpecification.
             */
            public Builder targetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
                this.targetCapacitySpecification = targetCapacitySpecification;
                return this;
            }

            /**
             * TerminateInstances.
             */
            public Builder terminateInstances(Boolean terminateInstances) {
                this.terminateInstances = terminateInstances;
                return this;
            }

            /**
             * TerminateInstancesWithExpiration.
             */
            public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
                this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
                return this;
            }

            /**
             * ValidFrom.
             */
            public Builder validFrom(String validFrom) {
                this.validFrom = validFrom;
                return this;
            }

            /**
             * ValidUntil.
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            public AutoProvisioningGroup build() {
                return new AutoProvisioningGroup(this);
            } 

        } 

    }
    public static class AutoProvisioningGroups extends TeaModel {
        @NameInMap("AutoProvisioningGroup")
        private java.util.List < AutoProvisioningGroup> autoProvisioningGroup;

        private AutoProvisioningGroups(Builder builder) {
            this.autoProvisioningGroup = builder.autoProvisioningGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoProvisioningGroups create() {
            return builder().build();
        }

        /**
         * @return autoProvisioningGroup
         */
        public java.util.List < AutoProvisioningGroup> getAutoProvisioningGroup() {
            return this.autoProvisioningGroup;
        }

        public static final class Builder {
            private java.util.List < AutoProvisioningGroup> autoProvisioningGroup; 

            /**
             * AutoProvisioningGroup.
             */
            public Builder autoProvisioningGroup(java.util.List < AutoProvisioningGroup> autoProvisioningGroup) {
                this.autoProvisioningGroup = autoProvisioningGroup;
                return this;
            }

            public AutoProvisioningGroups build() {
                return new AutoProvisioningGroups(this);
            } 

        } 

    }
}
