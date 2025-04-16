// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAutoProvisioningGroupsResponseBody</p>
 */
public class DescribeAutoProvisioningGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroups")
    private AutoProvisioningGroups autoProvisioningGroups;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAutoProvisioningGroupsResponseBody model) {
            this.autoProvisioningGroups = model.autoProvisioningGroups;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details about the auto provisioning groups.</p>
         */
        public Builder autoProvisioningGroups(AutoProvisioningGroups autoProvisioningGroups) {
            this.autoProvisioningGroups = autoProvisioningGroups;
            return this;
        }

        /**
         * <p>The number of the page returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>745CEC9F-0DD7-4451-9FE7-8B752F39****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of queried auto provisioning groups.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAutoProvisioningGroupsResponseBody build() {
            return new DescribeAutoProvisioningGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class LaunchTemplateConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("MaxPrice")
        private Float maxPrice;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Float priority;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
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

            private Builder() {
            } 

            private Builder(LaunchTemplateConfig model) {
                this.instanceType = model.instanceType;
                this.maxPrice = model.maxPrice;
                this.priority = model.priority;
                this.vSwitchId = model.vSwitchId;
                this.weightedCapacity = model.weightedCapacity;
            } 

            /**
             * <p>The instance type that is specified in the extended configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.g5.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum price of the instance type specified in the extended configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxPrice(Float maxPrice) {
                this.maxPrice = maxPrice;
                return this;
            }

            /**
             * <p>The priority of the instance type specified in the extended configuration. A value of 0 indicates the highest priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Float priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the vSwitch specified in the extended configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-sn5bsitu4lfzgc5o7****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The weight of the instance type specified in the extended configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class LaunchTemplateConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LaunchTemplateConfig")
        private java.util.List<LaunchTemplateConfig> launchTemplateConfig;

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
        public java.util.List<LaunchTemplateConfig> getLaunchTemplateConfig() {
            return this.launchTemplateConfig;
        }

        public static final class Builder {
            private java.util.List<LaunchTemplateConfig> launchTemplateConfig; 

            private Builder() {
            } 

            private Builder(LaunchTemplateConfigs model) {
                this.launchTemplateConfig = model.launchTemplateConfig;
            } 

            /**
             * LaunchTemplateConfig.
             */
            public Builder launchTemplateConfig(java.util.List<LaunchTemplateConfig> launchTemplateConfig) {
                this.launchTemplateConfig = launchTemplateConfig;
                return this;
            }

            public LaunchTemplateConfigs build() {
                return new LaunchTemplateConfigs(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class PayAsYouGoOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
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

            private Builder() {
            } 

            private Builder(PayAsYouGoOptions model) {
                this.allocationStrategy = model.allocationStrategy;
            } 

            /**
             * <p>The policy for creating pay-as-you-go instances. Valid values:</p>
             * <ul>
             * <li>lowest-price: cost optimization policy. This policy indicates that lowest-cost instance types are used to create instances.</li>
             * <li>prioritized: priority-based policy. This policy indicates that instances are created based on the priority specified by the LaunchTemplateConfig.N.Priority parameter.</li>
             * </ul>
             * <blockquote>
             * <p> The LaunchTemplateConfig.N.Priority parameter is set when the auto provisioning group is created, and cannot be modified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>prioritized</p>
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
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class SpotOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @com.aliyun.core.annotation.NameInMap("InstanceInterruptionBehavior")
        private String instanceInterruptionBehavior;

        @com.aliyun.core.annotation.NameInMap("InstancePoolsToUseCount")
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

            private Builder() {
            } 

            private Builder(SpotOptions model) {
                this.allocationStrategy = model.allocationStrategy;
                this.instanceInterruptionBehavior = model.instanceInterruptionBehavior;
                this.instancePoolsToUseCount = model.instancePoolsToUseCount;
            } 

            /**
             * <p>The policy for creating preemptible instances. Valid values:</p>
             * <ul>
             * <li>lowest-price: cost optimization policy. This policy indicates that the lowest-priced instance type is used to create instances.</li>
             * <li>diversified: balanced distribution policy. This policy indicates that instances are created evenly across multiple zones specified in the extended configuration.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>diversified</p>
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * <p>The action to be performed after the excess preemptible instances are stopped. Valid values:</p>
             * <ul>
             * <li>stop: retains the excess preemptible instances in the stopped state.</li>
             * <li>terminate: releases the excess preemptible instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stop</p>
             */
            public Builder instanceInterruptionBehavior(String instanceInterruptionBehavior) {
                this.instanceInterruptionBehavior = instanceInterruptionBehavior;
                return this;
            }

            /**
             * <p>The number of instances that the auto provisioning group creates by selecting the instance type of the lowest price.</p>
             * <blockquote>
             * <p> This parameter is set when the auto provisioning group is created, and cannot be modified.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The key of tag N that is added to the auto provisioning group.</p>
             * <p>Valid values of N: 1 to 20. The tag key cannot be an empty string. The tag key can be up to 128 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of tag N that is added to the auto provisioning group.</p>
             * <p>Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length and cannot contain http:// or https://.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
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
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

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
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tag = model.tag;
            } 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class TargetCapacitySpecification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultTargetCapacityType")
        private String defaultTargetCapacityType;

        @com.aliyun.core.annotation.NameInMap("PayAsYouGoTargetCapacity")
        private Float payAsYouGoTargetCapacity;

        @com.aliyun.core.annotation.NameInMap("SpotTargetCapacity")
        private Float spotTargetCapacity;

        @com.aliyun.core.annotation.NameInMap("TotalTargetCapacity")
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

            private Builder() {
            } 

            private Builder(TargetCapacitySpecification model) {
                this.defaultTargetCapacityType = model.defaultTargetCapacityType;
                this.payAsYouGoTargetCapacity = model.payAsYouGoTargetCapacity;
                this.spotTargetCapacity = model.spotTargetCapacity;
                this.totalTargetCapacity = model.totalTargetCapacity;
            } 

            /**
             * <p>The type of supplemental instances. When the sum of the <code>PayAsYouGoTargetCapacity</code> and <code>SpotTargetCapacity</code> values is less than the <code>TotalTargetCapacity</code> value, the auto provisioning group creates instances of the specified billing method to meet the target capacity. Valid values:</p>
             * <ul>
             * <li>PayAsYouGo: pay-as-you-go instances.</li>
             * <li>Spot: preemptible instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Spot</p>
             */
            public Builder defaultTargetCapacityType(String defaultTargetCapacityType) {
                this.defaultTargetCapacityType = defaultTargetCapacityType;
                return this;
            }

            /**
             * <p>The target capacity of pay-as-you-go instances that the auto provisioning group provisions.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder payAsYouGoTargetCapacity(Float payAsYouGoTargetCapacity) {
                this.payAsYouGoTargetCapacity = payAsYouGoTargetCapacity;
                return this;
            }

            /**
             * <p>The target capacity of preemptible instances that the auto provisioning group provisions.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder spotTargetCapacity(Float spotTargetCapacity) {
                this.spotTargetCapacity = spotTargetCapacity;
                return this;
            }

            /**
             * <p>The target capacity of the auto provisioning group. The capacity consists of the following parts:</p>
             * <ul>
             * <li>PayAsYouGoTargetCapacity</li>
             * <li>SpotTargetCapacity</li>
             * <li>The supplemental capacity besides instance capacities specified by PayAsYouGoTargetCapacity and SpotTargetCapacity.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>60</p>
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
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class AutoProvisioningGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupId")
        private String autoProvisioningGroupId;

        @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupName")
        private String autoProvisioningGroupName;

        @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroupType")
        private String autoProvisioningGroupType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ExcessCapacityTerminationPolicy")
        private String excessCapacityTerminationPolicy;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateConfigs")
        private LaunchTemplateConfigs launchTemplateConfigs;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("MaxSpotPrice")
        private Float maxSpotPrice;

        @com.aliyun.core.annotation.NameInMap("PayAsYouGoOptions")
        private PayAsYouGoOptions payAsYouGoOptions;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("SpotOptions")
        private SpotOptions spotOptions;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        @com.aliyun.core.annotation.NameInMap("TargetCapacitySpecification")
        private TargetCapacitySpecification targetCapacitySpecification;

        @com.aliyun.core.annotation.NameInMap("TerminateInstances")
        private Boolean terminateInstances;

        @com.aliyun.core.annotation.NameInMap("TerminateInstancesWithExpiration")
        private Boolean terminateInstancesWithExpiration;

        @com.aliyun.core.annotation.NameInMap("ValidFrom")
        private String validFrom;

        @com.aliyun.core.annotation.NameInMap("ValidUntil")
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

            private Builder() {
            } 

            private Builder(AutoProvisioningGroup model) {
                this.autoProvisioningGroupId = model.autoProvisioningGroupId;
                this.autoProvisioningGroupName = model.autoProvisioningGroupName;
                this.autoProvisioningGroupType = model.autoProvisioningGroupType;
                this.creationTime = model.creationTime;
                this.excessCapacityTerminationPolicy = model.excessCapacityTerminationPolicy;
                this.launchTemplateConfigs = model.launchTemplateConfigs;
                this.launchTemplateId = model.launchTemplateId;
                this.launchTemplateVersion = model.launchTemplateVersion;
                this.maxSpotPrice = model.maxSpotPrice;
                this.payAsYouGoOptions = model.payAsYouGoOptions;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.spotOptions = model.spotOptions;
                this.state = model.state;
                this.status = model.status;
                this.tags = model.tags;
                this.targetCapacitySpecification = model.targetCapacitySpecification;
                this.terminateInstances = model.terminateInstances;
                this.terminateInstancesWithExpiration = model.terminateInstancesWithExpiration;
                this.validFrom = model.validFrom;
                this.validUntil = model.validUntil;
            } 

            /**
             * <p>The ID of the auto provisioning group.</p>
             * 
             * <strong>example:</strong>
             * <p>apg-sn54avj8htgvtyh8****</p>
             */
            public Builder autoProvisioningGroupId(String autoProvisioningGroupId) {
                this.autoProvisioningGroupId = autoProvisioningGroupId;
                return this;
            }

            /**
             * <p>The name of the auto provisioning group.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsDocTest</p>
             */
            public Builder autoProvisioningGroupName(String autoProvisioningGroupName) {
                this.autoProvisioningGroupName = autoProvisioningGroupName;
                return this;
            }

            /**
             * <p>The delivery type of the auto provisioning group. Valid values:</p>
             * <ul>
             * <li>request: one-time delivery. When the auto provisioning group is started, it delivers instances only once. If the instances fail to be delivered, the auto provisioning group does not retry the delivery.</li>
             * <li>maintain: continuous delivery. When the auto provisioning group is started, it attempts to deliver instances that meet the target capacity and monitors the real-time capacity. If the target capacity of the auto provisioning group is not reached, the auto provisioning group continues to create instances until the target capacity is reached.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>maintain</p>
             */
            public Builder autoProvisioningGroupType(String autoProvisioningGroupType) {
                this.autoProvisioningGroupType = autoProvisioningGroupType;
                return this;
            }

            /**
             * <p>The time when the auto provisioning group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-01T15:10:20Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>Indicates whether to release the scaled-in instances when the real-time capacity of the auto provisioning group exceeds the target capacity and the group is triggered to scale in. Valid values:</p>
             * <ul>
             * <li>termination: releases the scaled-in instances.</li>
             * <li>no-termination: only removes the scaled-in instances from the auto provisioning group but does not release the instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>termination</p>
             */
            public Builder excessCapacityTerminationPolicy(String excessCapacityTerminationPolicy) {
                this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
                return this;
            }

            /**
             * <p>Details about the extended configurations.</p>
             */
            public Builder launchTemplateConfigs(LaunchTemplateConfigs launchTemplateConfigs) {
                this.launchTemplateConfigs = launchTemplateConfigs;
                return this;
            }

            /**
             * <p>The ID of the launch template associated with the auto provisioning group.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-bp1fgzds4bdogu03****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The version of the launch template associated with the auto provisioning group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The maximum price of preemptible instances in the auto provisioning group.</p>
             * <blockquote>
             * <p> When both the MaxSpotPrice and LaunchTemplateConfig.N.MaxPrice parameters are specified, the smaller one of the two parameter values is used.</p>
             * </blockquote>
             * <p>The LaunchTemplateConfig.N.Priority parameter is set when the auto provisioning group is created, and cannot be modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxSpotPrice(Float maxSpotPrice) {
                this.maxSpotPrice = maxSpotPrice;
                return this;
            }

            /**
             * <p>The policies related to pay-as-you-go instances.</p>
             */
            public Builder payAsYouGoOptions(PayAsYouGoOptions payAsYouGoOptions) {
                this.payAsYouGoOptions = payAsYouGoOptions;
                return this;
            }

            /**
             * <p>The region ID of the auto provisioning group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the auto provisioning group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-bp67acfmxazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The policy related to preemptible instances.</p>
             */
            public Builder spotOptions(SpotOptions spotOptions) {
                this.spotOptions = spotOptions;
                return this;
            }

            /**
             * <p>The overall status of instance scheduling in the auto provisioning group. Valid values:</p>
             * <ul>
             * <li>fulfilled: Scheduling was complete and the instances were delivered.</li>
             * <li>pending-fulfillment: The instances were being created.</li>
             * <li>pending-termination: The instances were being removed.</li>
             * <li>error: An exception occurred during scheduling and the instances were not delivered.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fulfilled</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The status of the auto provisioning group. Valid values:</p>
             * <ul>
             * <li>submitted: The auto provisioning group was created but did not execute scheduling tasks.</li>
             * <li>active: The auto provisioning group was executing scheduling tasks.</li>
             * <li>deleted: The auto provisioning group was deleted.</li>
             * <li>delete-running: The auto provisioning group was being deleted.</li>
             * <li>modifying: The auto provisioning group was being modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>submitted</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are added to the auto provisioning group.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The settings of the target capacity of the auto provisioning group.</p>
             */
            public Builder targetCapacitySpecification(TargetCapacitySpecification targetCapacitySpecification) {
                this.targetCapacitySpecification = targetCapacitySpecification;
                return this;
            }

            /**
             * <p>Indicates whether to release instances in the auto provisioning group when the auto provisioning group is deleted. Valid values:</p>
             * <ul>
             * <li>true: releases the instances.</li>
             * <li>false: only removes the instances from the auto provisioning group but does not release the instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder terminateInstances(Boolean terminateInstances) {
                this.terminateInstances = terminateInstances;
                return this;
            }

            /**
             * <p>Indicates whether to release instances in the auto provisioning group when the group expires. Valid values:</p>
             * <ul>
             * <li>true: releases the instances.</li>
             * <li>false: only removes the instances from the auto provisioning group but does not release the instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder terminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
                this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
                return this;
            }

            /**
             * <p>The time at which the auto provisioning group is started. The provisioning group is effective until the point in time specified by <code>ValidUntil</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-04-01T15:10:20Z</p>
             */
            public Builder validFrom(String validFrom) {
                this.validFrom = validFrom;
                return this;
            }

            /**
             * <p>The time at which the auto provisioning group expires. The period of time between this point in time and the point in time specified by the <code>ValidFrom</code> parameter is the validity period of the auto provisioning group.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-01T15:10:20Z</p>
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
    /**
     * 
     * {@link DescribeAutoProvisioningGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAutoProvisioningGroupsResponseBody</p>
     */
    public static class AutoProvisioningGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoProvisioningGroup")
        private java.util.List<AutoProvisioningGroup> autoProvisioningGroup;

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
        public java.util.List<AutoProvisioningGroup> getAutoProvisioningGroup() {
            return this.autoProvisioningGroup;
        }

        public static final class Builder {
            private java.util.List<AutoProvisioningGroup> autoProvisioningGroup; 

            private Builder() {
            } 

            private Builder(AutoProvisioningGroups model) {
                this.autoProvisioningGroup = model.autoProvisioningGroup;
            } 

            /**
             * AutoProvisioningGroup.
             */
            public Builder autoProvisioningGroup(java.util.List<AutoProvisioningGroup> autoProvisioningGroup) {
                this.autoProvisioningGroup = autoProvisioningGroup;
                return this;
            }

            public AutoProvisioningGroups build() {
                return new AutoProvisioningGroups(this);
            } 

        } 

    }
}
