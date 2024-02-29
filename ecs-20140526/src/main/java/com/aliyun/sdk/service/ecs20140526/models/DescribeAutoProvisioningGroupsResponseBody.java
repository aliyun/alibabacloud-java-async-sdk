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
         * Details about the auto provisioning groups.
         */
        public Builder autoProvisioningGroups(AutoProvisioningGroups autoProvisioningGroups) {
            this.autoProvisioningGroups = autoProvisioningGroups;
            return this;
        }

        /**
         * The number of the page returned.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
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
         * The number of queried auto provisioning groups.
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
             * The instance type that is specified in the extended configurations.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum price of the instance type specified in the extended configurations.
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * The priority of the instance type specified in the extended configurations. A value of 0 indicates the highest priority.
             */
            public Builder priority(Float priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the vSwitch specified in the extended configurations.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The weight of the instance type specified in the extended configurations.
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
             * The policy for creating pay-as-you-go instances. Valid values:
             * <p>
             * 
             * *   lowest-price: the cost optimization policy. The auto provisioning group selects the instance type of the lowest price to create pay-as-you-go instances.
             * *   prioritized: the priority-based policy. This policy indicates that instances are created based on the priority specified by the LaunchTemplateConfig.N.Priority parameter.
             * 
             * > The LaunchTemplateConfig.N.Priority parameter is set when the auto provisioning group is created, and cannot be modified.
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
             * The policy for creating preemptible instances. Valid values:
             * <p>
             * 
             * *   lowest-price: the cost optimization policy. The auto provisioning group selects the instance type of the lowest price to create preemptible instances.
             * *   diversified: the balanced distribution policy. The auto provisioning group creates the instances in the zones that are specified in extended configurations and evenly distributes the instances across the zones.
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * The action to be performed after the extra preemptible instances are stopped. Valid values:
             * <p>
             * 
             * *   stop: retains the extra preemptible instances in the stopped state.
             * *   terminate: releases the excess preemptible instances.
             */
            public Builder instanceInterruptionBehavior(String instanceInterruptionBehavior) {
                this.instanceInterruptionBehavior = instanceInterruptionBehavior;
                return this;
            }

            /**
             * The number of instances that the auto provisioning group creates by selecting the instance type of the lowest price.
             * <p>
             * 
             * > This parameter is set when the auto provisioning group is created, and cannot be modified.
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
    public static class Tag extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
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
             * The billing method of supplemental instances. The target capacity of the auto provisioning group must be at least the sum of the pay-as-you-go instance capacity specified by the PayAsYouGoTargetCapacity parameter and the preemptible instance capacity specified by the SpotTargetCapacity parameter. Valid values:
             * <p>
             * 
             * *   PayAsYouGo: pay-as-you-go instances
             * *   Spot: preemptible instances
             */
            public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
                this.defaultTargetCapacityType = defaultTargetCapacityType;
                return this;
            }

            /**
             * The target capacity of pay-as-you-go instances in the auto provisioning group.
             */
            public Builder payAsYouGoTargetCapacity(Float payAsYouGoTargetCapacity) {
                this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
                return this;
            }

            /**
             * The target capacity of preemptible instances in the auto provisioning group.
             */
            public Builder spotTargetCapacity(Float spotTargetCapacity) {
                this.spotTargetCapacity = spotTargetCapacity;
                return this;
            }

            /**
             * The target capacity of the auto provisioning group. The capacity consists of the following parts:
             * <p>
             * 
             * *   PayAsYouGoTargetCapacity
             * *   SpotTargetCapacity
             * *   The supplemental capacity besides instance capacities specified by the PayAsYouGoTargetCapacity and SpotTargetCapacity parameters
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

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("SpotOptions")
        private SpotOptions spotOptions;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

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
            this.resourceGroupId = builder.resourceGroupId;
            this.spotOptions = builder.spotOptions;
            this.state = builder.state;
            this.status = builder.status;
            this.tags = builder.tags;
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
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
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
            private String resourceGroupId; 
            private SpotOptions spotOptions; 
            private String state; 
            private String status; 
            private Tags tags; 
            private TargetCapacitySpecification targetCapacitySpecification; 
            private Boolean terminateInstances; 
            private Boolean terminateInstancesWithExpiration; 
            private String validFrom; 
            private String validUntil; 

            /**
             * The ID of the auto provisioning group.
             */
            public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
                this.autoProvisioningGroupId = autoProvisioningGroupId;
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
             * The delivery type of the auto provisioning group. Valid values:
             * <p>
             * 
             * *   request: the one-time delivery. When the auto provisioning group is started, the system delivers clusters only once. If the clusters fail to be delivered, the system does not retry the delivery.
             * *   maintain: continuous delivery. When the auto provisioning group is started, the system delivers clusters until the target capacity is reached. The system also monitors the capacity in real time. If the target capacity of the auto provisioning group is not reached, the system continues creating ECS instances until the target capacity is reached.
             */
            public Builder autoProvisioningGroupType(String autoProvisioningGroupType) {
                this.autoProvisioningGroupType = autoProvisioningGroupType;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Specifies whether to release the removed instances when the capacity of the auto provisioning group exceeds the target capacity and a scale-in event is triggered. Valid values:
             * <p>
             * 
             * *   termination: releases the removed instances.
             * *   no-termination: removes the instances from the auto provisioning group but does not release them.
             */
            public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
                this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
                return this;
            }

            /**
             * Details about the extended configurations.
             */
            public Builder launchTemplateConfigs(LaunchTemplateConfigs launchTemplateConfigs) {
                this.launchTemplateConfigs = launchTemplateConfigs;
                return this;
            }

            /**
             * The ID of the launch template associated with the auto provisioning group.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The version of the launch template associated with the auto provisioning group.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * The maximum price for preemptible instances in the auto provisioning group.
             * <p>
             * 
             * > If both the MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice parameters are specified, the smaller one of the two parameter values is used.
             * 
             * The LaunchTemplateConfig.N.MaxPrice parameter is set when the auto provisioning group is created, and cannot be modified.
             */
            public Builder maxSpotPrice(Float maxSpotPrice) {
                this.maxSpotPrice = maxSpotPrice;
                return this;
            }

            /**
             * The policies related to pay-as-you-go instances.
             */
            public Builder payAsYouGoOptions(PayAsYouGoOptions payAsYouGoOptions) {
                this.payAsYouGoOptions = payAsYouGoOptions;
                return this;
            }

            /**
             * The region ID of the auto provisioning group.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The policy related to preemptible instances.
             */
            public Builder spotOptions(SpotOptions spotOptions) {
                this.spotOptions = spotOptions;
                return this;
            }

            /**
             * The overall status of instance scheduling of the auto provisioning group. Valid values:
             * <p>
             * 
             * *   fulfilled: Scheduling is complete and the instance cluster is delivered.
             * *   pending-fulfillment: The instances are being created.
             * *   pending-termination: The instances are being removed.
             * *   error: An exception occurred during scheduling and the instance cluster is not delivered.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The status of the auto provisioning group. Valid values:
             * <p>
             * 
             * *   submitted: The auto provisioning group is created but has not started to execute scheduling tasks.
             * *   active: The auto provisioning group is executing scheduling tasks.
             * *   deleted: The auto provisioning group is deleted.
             * *   deleted-running: The auto provisioning group is being deleted.
             * *   modifying: The auto provisioning group is being modified.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The settings of the target capacity of the auto provisioning group.
             */
            public Builder targetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
                this.targetCapacitySpecification = targetCapacitySpecification;
                return this;
            }

            /**
             * Indicates whether the instances in the auto provisioning group are released when the auto provisioning group is deleted. Valid values:
             * <p>
             * 
             * *   true: releases instances in the auto provisioning group.
             * *   false: retains instances in the auto provisioning group.
             */
            public Builder terminateInstances(Boolean terminateInstances) {
                this.terminateInstances = terminateInstances;
                return this;
            }

            /**
             * Indicates whether the instances in the auto provisioning group are released when the auto provisioning group expires. Valid values:
             * <p>
             * 
             * *   true: releases instances in the auto provisioning group.
             * *   false: removes instances from the auto provisioning group but does not release them.
             */
            public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
                this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
                return this;
            }

            /**
             * The time at which the auto provisioning group is started. The provisioning group is effective to the point in time specified by the `ValidUntil` parameter.
             */
            public Builder validFrom(String validFrom) {
                this.validFrom = validFrom;
                return this;
            }

            /**
             * The time at which the auto provisioning group expires. The provisioning group is started from the point in time specified by the `ValidFrom` parameter.
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
