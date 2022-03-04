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
    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("AutoProvisioningGroups")
    private AutoProvisioningGroups autoProvisioningGroups;

    private DescribeAutoProvisioningGroupsResponseBody(Builder builder) {
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.pageNumber = builder.pageNumber;
        this.totalCount = builder.totalCount;
        this.autoProvisioningGroups = builder.autoProvisioningGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAutoProvisioningGroupsResponseBody create() {
        return builder().build();
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return autoProvisioningGroups
     */
    public AutoProvisioningGroups getAutoProvisioningGroups() {
        return this.autoProvisioningGroups;
    }

    public static final class Builder {
        private Integer pageSize; 
        private String requestId; 
        private Integer pageNumber; 
        private Integer totalCount; 
        private AutoProvisioningGroups autoProvisioningGroups; 

        /**
         * The number of rows per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of auto provisioning groups queried.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The details of the auto provisioning group.
         */
        public Builder autoProvisioningGroups(AutoProvisioningGroups autoProvisioningGroups) {
            this.autoProvisioningGroups = autoProvisioningGroups;
            return this;
        }

        public DescribeAutoProvisioningGroupsResponseBody build() {
            return new DescribeAutoProvisioningGroupsResponseBody(this);
        } 

    } 

    public static class LaunchTemplateConfig extends TeaModel {
        @NameInMap("MaxPrice")
        private Float maxPrice;

        @NameInMap("Priority")
        private Float priority;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("WeightedCapacity")
        private Float weightedCapacity;

        @NameInMap("InstanceType")
        private String instanceType;

        private LaunchTemplateConfig(Builder builder) {
            this.maxPrice = builder.maxPrice;
            this.priority = builder.priority;
            this.vSwitchId = builder.vSwitchId;
            this.weightedCapacity = builder.weightedCapacity;
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateConfig create() {
            return builder().build();
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

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private Float maxPrice; 
            private Float priority; 
            private String vSwitchId; 
            private Float weightedCapacity; 
            private String instanceType; 

            /**
             * The maximum price of the instance type corresponding to the extended launch template.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * The priority of the instance type corresponding to the extended launch template. The highest value is 0.
             */
            public Builder priority(Float priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the vSwitch corresponding to the extended launch template.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The weight of the instance type corresponding to the extended launch template.
             */
            public Builder weightedCapacity(Float weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            /**
             * Expand the instance type corresponding to the launch template.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
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
    public static class SpotOptions extends TeaModel {
        @NameInMap("InstancePoolsToUseCount")
        private Integer instancePoolsToUseCount;

        @NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @NameInMap("InstanceInterruptionBehavior")
        private String instanceInterruptionBehavior;

        private SpotOptions(Builder builder) {
            this.instancePoolsToUseCount = builder.instancePoolsToUseCount;
            this.allocationStrategy = builder.allocationStrategy;
            this.instanceInterruptionBehavior = builder.instanceInterruptionBehavior;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpotOptions create() {
            return builder().build();
        }

        /**
         * @return instancePoolsToUseCount
         */
        public Integer getInstancePoolsToUseCount() {
            return this.instancePoolsToUseCount;
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

        public static final class Builder {
            private Integer instancePoolsToUseCount; 
            private String allocationStrategy; 
            private String instanceInterruptionBehavior; 

            /**
             * The auto provisioning group selects the instance type with the lowest price to create the number of instances.
             * <p>
             * 
             * > This parameter is set when you create an auto provisioning group and cannot be modified.
             */
            public Builder instancePoolsToUseCount(Integer instancePoolsToUseCount) {
                this.instancePoolsToUseCount = instancePoolsToUseCount;
                return this;
            }

            /**
             * The policy used to create preemptible instances. Possible values:
             * <p>
             * 
             * -lowest-price: the cost optimization policy. Select the instance type with the lowest price.
             * 
             * -diversified: the distribution strategy of the balanced zone. Create instances in the zones specified by the extended launch template and distribute them evenly to each zone.
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * The next action after the excess preemptible instance is stopped. Possible values:
             * <p>
             * 
             * -stop: the status is stopped.
             * -terminate: release.
             */
            public Builder instanceInterruptionBehavior(String instanceInterruptionBehavior) {
                this.instanceInterruptionBehavior = instanceInterruptionBehavior;
                return this;
            }

            public SpotOptions build() {
                return new SpotOptions(this);
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
             * The policy used to create a pay-as-you-go instance. Possible values:
             * <p>
             * 
             * -lowest-price: the cost optimization policy. Select the instance type with the lowest price.
             * 
             * -prioritized: the priority policy. Create instances based on the Priority set by LaunchTemplateConfig.N.Priority.
             * 
             * > LaunchTemplateConfig.N.Priority is set when you create an auto provisioning group and cannot be modified.
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
    public static class TargetCapacitySpecification extends TeaModel {
        @NameInMap("SpotTargetCapacity")
        private Float spotTargetCapacity;

        @NameInMap("PayAsYouGoTargetCapacity")
        private Float payAsYouGoTargetCapacity;

        @NameInMap("DefaultTargetCapacityType")
        private String defaultTargetCapacityType;

        @NameInMap("TotalTargetCapacity")
        private Float totalTargetCapacity;

        private TargetCapacitySpecification(Builder builder) {
            this.spotTargetCapacity = builder.spotTargetCapacity;
            this.payAsYouGoTargetCapacity = builder.payAsYouGoTargetCapacity;
            this.defaultTargetCapacityType = builder.defaultTargetCapacityType;
            this.totalTargetCapacity = builder.totalTargetCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetCapacitySpecification create() {
            return builder().build();
        }

        /**
         * @return spotTargetCapacity
         */
        public Float getSpotTargetCapacity() {
            return this.spotTargetCapacity;
        }

        /**
         * @return payAsYouGoTargetCapacity
         */
        public Float getPayAsYouGoTargetCapacity() {
            return this.payAsYouGoTargetCapacity;
        }

        /**
         * @return defaultTargetCapacityType
         */
        public String getDefaultTargetCapacityType() {
            return this.defaultTargetCapacityType;
        }

        /**
         * @return totalTargetCapacity
         */
        public Float getTotalTargetCapacity() {
            return this.totalTargetCapacity;
        }

        public static final class Builder {
            private Float spotTargetCapacity; 
            private Float payAsYouGoTargetCapacity; 
            private String defaultTargetCapacityType; 
            private Float totalTargetCapacity; 

            /**
             * The target capacity of the preemptible instance.
             */
            public Builder spotTargetCapacity(Float spotTargetCapacity) {
                this.spotTargetCapacity = spotTargetCapacity;
                return this;
            }

            /**
             * The target capacity of the pay-as-you-go instance.
             */
            public Builder payAsYouGoTargetCapacity(Float payAsYouGoTargetCapacity) {
                this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
                return this;
            }

            /**
             * If the sum of PayAsYouGoTargetCapacity and SpotTargetCapacity is less than TotalTargetCapacity, the billing method of the specified differential capacity. Possible values:
             * <p>
             * 
             * -PayAsYouGo: pay-as-you-go instance
             * -Spot: preemptible instance
             */
            public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
                this.defaultTargetCapacityType = defaultTargetCapacityType;
                return this;
            }

            /**
             * The total capacity of the auto provisioning group. It consists of the following three parts:
             * <p>
             * 
             * -PayAsYouGoTargetCapacity
             * -SpotTargetCapacity
             * -Differential capacity beyond PayAsYouGoTargetCapacity and SpotTargetCapacity
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
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("AutoProvisioningGroupName")
        private String autoProvisioningGroupName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TerminateInstances")
        private Boolean terminateInstances;

        @NameInMap("MaxSpotPrice")
        private Float maxSpotPrice;

        @NameInMap("State")
        private String state;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("ValidFrom")
        private String validFrom;

        @NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @NameInMap("TerminateInstancesWithExpiration")
        private Boolean terminateInstancesWithExpiration;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ValidUntil")
        private String validUntil;

        @NameInMap("AutoProvisioningGroupType")
        private String autoProvisioningGroupType;

        @NameInMap("AutoProvisioningGroupId")
        private String autoProvisioningGroupId;

        @NameInMap("ExcessCapacityTerminationPolicy")
        private String excessCapacityTerminationPolicy;

        @NameInMap("LaunchTemplateConfigs")
        private LaunchTemplateConfigs launchTemplateConfigs;

        @NameInMap("SpotOptions")
        private SpotOptions spotOptions;

        @NameInMap("PayAsYouGoOptions")
        private PayAsYouGoOptions payAsYouGoOptions;

        @NameInMap("TargetCapacitySpecification")
        private TargetCapacitySpecification targetCapacitySpecification;

        private AutoProvisioningGroup(Builder builder) {
            this.creationTime = builder.creationTime;
            this.autoProvisioningGroupName = builder.autoProvisioningGroupName;
            this.status = builder.status;
            this.terminateInstances = builder.terminateInstances;
            this.maxSpotPrice = builder.maxSpotPrice;
            this.state = builder.state;
            this.launchTemplateId = builder.launchTemplateId;
            this.validFrom = builder.validFrom;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.terminateInstancesWithExpiration = builder.terminateInstancesWithExpiration;
            this.regionId = builder.regionId;
            this.validUntil = builder.validUntil;
            this.autoProvisioningGroupType = builder.autoProvisioningGroupType;
            this.autoProvisioningGroupId = builder.autoProvisioningGroupId;
            this.excessCapacityTerminationPolicy = builder.excessCapacityTerminationPolicy;
            this.launchTemplateConfigs = builder.launchTemplateConfigs;
            this.spotOptions = builder.spotOptions;
            this.payAsYouGoOptions = builder.payAsYouGoOptions;
            this.targetCapacitySpecification = builder.targetCapacitySpecification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoProvisioningGroup create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return autoProvisioningGroupName
         */
        public String getAutoProvisioningGroupName() {
            return this.autoProvisioningGroupName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return terminateInstances
         */
        public Boolean getTerminateInstances() {
            return this.terminateInstances;
        }

        /**
         * @return maxSpotPrice
         */
        public Float getMaxSpotPrice() {
            return this.maxSpotPrice;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return validFrom
         */
        public String getValidFrom() {
            return this.validFrom;
        }

        /**
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return terminateInstancesWithExpiration
         */
        public Boolean getTerminateInstancesWithExpiration() {
            return this.terminateInstancesWithExpiration;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return validUntil
         */
        public String getValidUntil() {
            return this.validUntil;
        }

        /**
         * @return autoProvisioningGroupType
         */
        public String getAutoProvisioningGroupType() {
            return this.autoProvisioningGroupType;
        }

        /**
         * @return autoProvisioningGroupId
         */
        public String getAutoProvisioningGroupId() {
            return this.autoProvisioningGroupId;
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
         * @return spotOptions
         */
        public SpotOptions getSpotOptions() {
            return this.spotOptions;
        }

        /**
         * @return payAsYouGoOptions
         */
        public PayAsYouGoOptions getPayAsYouGoOptions() {
            return this.payAsYouGoOptions;
        }

        /**
         * @return targetCapacitySpecification
         */
        public TargetCapacitySpecification getTargetCapacitySpecification() {
            return this.targetCapacitySpecification;
        }

        public static final class Builder {
            private String creationTime; 
            private String autoProvisioningGroupName; 
            private String status; 
            private Boolean terminateInstances; 
            private Float maxSpotPrice; 
            private String state; 
            private String launchTemplateId; 
            private String validFrom; 
            private String launchTemplateVersion; 
            private Boolean terminateInstancesWithExpiration; 
            private String regionId; 
            private String validUntil; 
            private String autoProvisioningGroupType; 
            private String autoProvisioningGroupId; 
            private String excessCapacityTerminationPolicy; 
            private LaunchTemplateConfigs launchTemplateConfigs; 
            private SpotOptions spotOptions; 
            private PayAsYouGoOptions payAsYouGoOptions; 
            private TargetCapacitySpecification targetCapacitySpecification; 

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The name of the auto provisioning group.
             */
            public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
                this.autoProvisioningGroupName = autoProvisioningGroupName;
                return this;
            }

            /**
             * The status of the auto provisioning group. Possible values:
             * <p>
             * 
             * -submitted: The auto provisioning group is created, but the scheduling task has not been started.
             * -active: the auto provisioning group has started scheduling tasks.
             * -deleted: the auto provisioning group has been deleted.
             * -delete-running: the auto provisioning group is being deleted.
             * -modifying: the auto provisioning group is being modified.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Specifies whether to release instances in an auto provisioning group. Possible values:
             * <p>
             * 
             * -true: Releases instances in the group.
             * -false: the instances in the group are retained.
             */
            public Builder terminateInstances(Boolean terminateInstances) {
                this.terminateInstances = terminateInstances;
                return this;
            }

            /**
             * The highest price for a preemptible instance.
             * <p>
             * 
             * > When MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice are set at the same time, the lowest value prevail.
             * 
             * LaunchTemplateConfig.N.MaxPrice is set when you create an auto provisioning group and cannot be modified.
             */
            public Builder maxSpotPrice(Float maxSpotPrice) {
                this.maxSpotPrice = maxSpotPrice;
                return this;
            }

            /**
             * The overall scheduling status of the auto provisioning group. Possible values:
             * <p>
             * 
             * -fulfilled: the scheduling task has been completed.
             * -pending-fulfillment: the instance is being created.
             * -pending-termination: the instance is being removed.
             * -error: An error occurred while scheduling and the instance cluster failed to be delivered.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The ID of the associated instance launch template.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The start time of the auto provisioning group. This parameter is used to determine the validity period in combination with "ValidUntil.
             */
            public Builder validFrom(String validFrom) {
                this.validFrom = validFrom;
                return this;
            }

            /**
             * The version of the associated instance launch template.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * Specifies whether to release instances in the auto provisioning group upon expiration. Possible values:
             * <p>
             * 
             * -true: Releases instances in the group.
             * -false: only instances in the group are removed from the auto provisioning group.
             */
            public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
                this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The expiration time of the auto provisioning group. This parameter is used together with "ValidFrom" to determine the validity period.
             */
            public Builder validUntil(String validUntil) {
                this.validUntil = validUntil;
                return this;
            }

            /**
             * The delivery type. Possible values:
             * <p>
             * 
             * -request: one-time request. The provisioning group delivers the instance cluster only at startup and does not retry after scheduling fails.
             * 
             * -maintain: continuous supply. The provisioning group attempts to deliver the instance cluster at startup and monitors the real-time capacity. If the target capacity is not reached, it attempts to continue creating ECS instances.
             */
            public Builder autoProvisioningGroupType(String autoProvisioningGroupType) {
                this.autoProvisioningGroupType = autoProvisioningGroupType;
                return this;
            }

            /**
             * The ID of the auto provisioning group.
             */
            public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
                this.autoProvisioningGroupId = autoProvisioningGroupId;
                return this;
            }

            /**
             * Whether to release the scale-in instance when the real-time capacity of the auto provisioning group exceeds the target capacity and the scale-in is triggered. Possible values:
             * <p>
             * 
             * -termination: releases the scaled-In instance.
             * -no-termination: only the scaled-in instances are removed from the auto provisioning group.
             */
            public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
                this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
                return this;
            }

            /**
             * The details of the extended launch template.
             */
            public Builder launchTemplateConfigs(LaunchTemplateConfigs launchTemplateConfigs) {
                this.launchTemplateConfigs = launchTemplateConfigs;
                return this;
            }

            /**
             * The policies related to preemptible instances.
             */
            public Builder spotOptions(SpotOptions spotOptions) {
                this.spotOptions = spotOptions;
                return this;
            }

            /**
             * Policies related to pay-as-you-go instances.
             */
            public Builder payAsYouGoOptions(PayAsYouGoOptions payAsYouGoOptions) {
                this.payAsYouGoOptions = payAsYouGoOptions;
                return this;
            }

            /**
             * The target capacity of the auto provisioning group.
             */
            public Builder targetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
                this.targetCapacitySpecification = targetCapacitySpecification;
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
