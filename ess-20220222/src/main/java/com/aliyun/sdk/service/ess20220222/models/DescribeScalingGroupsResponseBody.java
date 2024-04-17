// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupsResponseBody</p>
 */
public class DescribeScalingGroupsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingGroups")
    private java.util.List < ScalingGroups> scalingGroups;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeScalingGroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scalingGroups = builder.scalingGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupsResponseBody create() {
        return builder().build();
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
     * @return scalingGroups
     */
    public java.util.List < ScalingGroups> getScalingGroups() {
        return this.scalingGroups;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < ScalingGroups> scalingGroups; 
        private Integer totalCount; 

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
         * The information about the scaling groups.
         */
        public Builder scalingGroups(java.util.List < ScalingGroups> scalingGroups) {
            this.scalingGroups = scalingGroups;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingGroupsResponseBody build() {
            return new DescribeScalingGroupsResponseBody(this);
        } 

    } 

    public static class AlbServerGroups extends TeaModel {
        @NameInMap("AlbServerGroupId")
        private String albServerGroupId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Weight")
        private Integer weight;

        private AlbServerGroups(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroups create() {
            return builder().build();
        }

        /**
         * @return albServerGroupId
         */
        public String getAlbServerGroupId() {
            return this.albServerGroupId;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String albServerGroupId; 
            private Integer port; 
            private Integer weight; 

            /**
             * The ID of the ALB server group.
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * The port number used by an ECS instance as a backend server in the ALB server group.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server in the ALB server group.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public AlbServerGroups build() {
                return new AlbServerGroups(this);
            } 

        } 

    }
    public static class LaunchTemplateOverrides extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private LaunchTemplateOverrides(Builder builder) {
            this.instanceType = builder.instanceType;
            this.spotPriceLimit = builder.spotPriceLimit;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateOverrides create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Float spotPriceLimit; 
            private Integer weightedCapacity; 

            /**
             * The instance type. The instance type that is specified by this parameter overrides the instance type that is specified in the launch template.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The maximum bid price of the instance type that is specified by `LaunchTemplateOverride.InstanceType`.
             * <p>
             * 
             * >  This parameter takes effect only if you specify `LaunchTemplateId`.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * The weight of the instance type. The value of this parameter indicates the capacity of an instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public LaunchTemplateOverrides build() {
                return new LaunchTemplateOverrides(this);
            } 

        } 

    }
    public static class LoadBalancerConfigs extends TeaModel {
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("Weight")
        private Integer weight;

        private LoadBalancerConfigs(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerConfigs create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private Integer weight; 

            /**
             * The ID of the Classic Load Balancer (CLB, formerly known as Server Load Balancer or SLB) instance.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server in the CLB server group. If you increase the weight of an ECS instance, the number of access requests that are forwarded to the ECS instance increases. If you set the weight of an ECS instance to 0, no access requests are forwarded to the ECS instance. Valid values: 0 to 100.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public LoadBalancerConfigs build() {
                return new LoadBalancerConfigs(this);
            } 

        } 

    }
    public static class ServerGroups extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("ServerGroupId")
        private String serverGroupId;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Integer weight;

        private ServerGroups(Builder builder) {
            this.port = builder.port;
            this.serverGroupId = builder.serverGroupId;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerGroups create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return serverGroupId
         */
        public String getServerGroupId() {
            return this.serverGroupId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String serverGroupId; 
            private String type; 
            private Integer weight; 

            /**
             * The port number used by an ECS instance as a backend server in the server group.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the server group.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * The type of the server group. Valid values:
             * <p>
             * 
             * *   ALB: ALB server group
             * *   NLB: NLB server group
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of an ECS instance as a backend server in the server group.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public ServerGroups build() {
                return new ServerGroups(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Propagate")
        private Boolean propagate;

        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.propagate = builder.propagate;
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return propagate
         */
        public Boolean getPropagate() {
            return this.propagate;
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
            private Boolean propagate; 
            private String tagKey; 
            private String tagValue; 

            /**
             * Indicates whether the tags of the scaling group can be propagated to instances. Valid values:
             * <p>
             * 
             * *   true: The tags of the scaling group can be propagated to only instances that are newly created.
             * *   false: The tags of the scaling group cannot be propagated to instances.
             * 
             * Default value: false.
             */
            public Builder propagate(Boolean propagate) {
                this.propagate = propagate;
                return this;
            }

            /**
             * The tag key of the scaling group.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value of the scaling group.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class VServerGroupAttributes extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("VServerGroupId")
        private String vServerGroupId;

        @NameInMap("Weight")
        private Integer weight;

        private VServerGroupAttributes(Builder builder) {
            this.port = builder.port;
            this.vServerGroupId = builder.vServerGroupId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttributes create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String vServerGroupId; 
            private Integer weight; 

            /**
             * The port number that is used by the load balancer to provide external services.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The ID of the backend vServer group.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * The weight of the backend vServer group.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VServerGroupAttributes build() {
                return new VServerGroupAttributes(this);
            } 

        } 

    }
    public static class VServerGroups extends TeaModel {
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("VServerGroupAttributes")
        private java.util.List < VServerGroupAttributes> vServerGroupAttributes;

        private VServerGroups(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.vServerGroupAttributes = builder.vServerGroupAttributes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroups create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return vServerGroupAttributes
         */
        public java.util.List < VServerGroupAttributes> getVServerGroupAttributes() {
            return this.vServerGroupAttributes;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List < VServerGroupAttributes> vServerGroupAttributes; 

            /**
             * The ID of the load balancer to which the backend vServer group belongs.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * The attributes of the backend vServer group.
             */
            public Builder vServerGroupAttributes(java.util.List < VServerGroupAttributes> vServerGroupAttributes) {
                this.vServerGroupAttributes = vServerGroupAttributes;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
    public static class ScalingGroups extends TeaModel {
        @NameInMap("ActiveCapacity")
        private Integer activeCapacity;

        @NameInMap("ActiveScalingConfigurationId")
        private String activeScalingConfigurationId;

        @NameInMap("AlbServerGroups")
        private java.util.List < AlbServerGroups> albServerGroups;

        @NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @NameInMap("AzBalance")
        private Boolean azBalance;

        @NameInMap("CompensateWithOnDemand")
        private Boolean compensateWithOnDemand;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("CurrentHostName")
        private String currentHostName;

        @NameInMap("CustomPolicyARN")
        private String customPolicyARN;

        @NameInMap("DBInstanceIds")
        private java.util.List < String > DBInstanceIds;

        @NameInMap("DefaultCooldown")
        private Integer defaultCooldown;

        @NameInMap("DesiredCapacity")
        private Integer desiredCapacity;

        @NameInMap("EnableDesiredCapacity")
        private Boolean enableDesiredCapacity;

        @NameInMap("GroupDeletionProtection")
        private Boolean groupDeletionProtection;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("HealthCheckType")
        private String healthCheckType;

        @NameInMap("HealthCheckTypes")
        private java.util.List < String > healthCheckTypes;

        @NameInMap("InitCapacity")
        private Integer initCapacity;

        @NameInMap("IsElasticStrengthInAlarm")
        private Boolean isElasticStrengthInAlarm;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("LaunchTemplateOverrides")
        private java.util.List < LaunchTemplateOverrides> launchTemplateOverrides;

        @NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @NameInMap("LifecycleState")
        private String lifecycleState;

        @NameInMap("LoadBalancerConfigs")
        private java.util.List < LoadBalancerConfigs> loadBalancerConfigs;

        @NameInMap("LoadBalancerIds")
        private java.util.List < String > loadBalancerIds;

        @NameInMap("MaxInstanceLifetime")
        private Integer maxInstanceLifetime;

        @NameInMap("MaxSize")
        private Integer maxSize;

        @NameInMap("MinSize")
        private Integer minSize;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("MonitorGroupId")
        private String monitorGroupId;

        @NameInMap("MultiAZPolicy")
        private String multiAZPolicy;

        @NameInMap("OnDemandBaseCapacity")
        private Integer onDemandBaseCapacity;

        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        private Integer onDemandPercentageAboveBaseCapacity;

        @NameInMap("PendingCapacity")
        private Integer pendingCapacity;

        @NameInMap("PendingWaitCapacity")
        private Integer pendingWaitCapacity;

        @NameInMap("ProtectedCapacity")
        private Integer protectedCapacity;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RemovalPolicies")
        private java.util.List < String > removalPolicies;

        @NameInMap("RemovingCapacity")
        private Integer removingCapacity;

        @NameInMap("RemovingWaitCapacity")
        private Integer removingWaitCapacity;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("ScalingGroupName")
        private String scalingGroupName;

        @NameInMap("ScalingPolicy")
        private String scalingPolicy;

        @NameInMap("ServerGroups")
        private java.util.List < ServerGroups> serverGroups;

        @NameInMap("SpotAllocationStrategy")
        private String spotAllocationStrategy;

        @NameInMap("SpotInstancePools")
        private Integer spotInstancePools;

        @NameInMap("SpotInstanceRemedy")
        private Boolean spotInstanceRemedy;

        @NameInMap("StandbyCapacity")
        private Integer standbyCapacity;

        @NameInMap("StoppedCapacity")
        private Integer stoppedCapacity;

        @NameInMap("SuspendedProcesses")
        private java.util.List < String > suspendedProcesses;

        @NameInMap("SystemSuspended")
        private Boolean systemSuspended;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TotalCapacity")
        private Integer totalCapacity;

        @NameInMap("TotalInstanceCount")
        private Integer totalInstanceCount;

        @NameInMap("VServerGroups")
        private java.util.List < VServerGroups> vServerGroups;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VSwitchIds")
        private java.util.List < String > vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        private ScalingGroups(Builder builder) {
            this.activeCapacity = builder.activeCapacity;
            this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
            this.albServerGroups = builder.albServerGroups;
            this.allocationStrategy = builder.allocationStrategy;
            this.azBalance = builder.azBalance;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.creationTime = builder.creationTime;
            this.currentHostName = builder.currentHostName;
            this.customPolicyARN = builder.customPolicyARN;
            this.DBInstanceIds = builder.DBInstanceIds;
            this.defaultCooldown = builder.defaultCooldown;
            this.desiredCapacity = builder.desiredCapacity;
            this.enableDesiredCapacity = builder.enableDesiredCapacity;
            this.groupDeletionProtection = builder.groupDeletionProtection;
            this.groupType = builder.groupType;
            this.healthCheckType = builder.healthCheckType;
            this.healthCheckTypes = builder.healthCheckTypes;
            this.initCapacity = builder.initCapacity;
            this.isElasticStrengthInAlarm = builder.isElasticStrengthInAlarm;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateOverrides = builder.launchTemplateOverrides;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.lifecycleState = builder.lifecycleState;
            this.loadBalancerConfigs = builder.loadBalancerConfigs;
            this.loadBalancerIds = builder.loadBalancerIds;
            this.maxInstanceLifetime = builder.maxInstanceLifetime;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.modificationTime = builder.modificationTime;
            this.monitorGroupId = builder.monitorGroupId;
            this.multiAZPolicy = builder.multiAZPolicy;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.pendingCapacity = builder.pendingCapacity;
            this.pendingWaitCapacity = builder.pendingWaitCapacity;
            this.protectedCapacity = builder.protectedCapacity;
            this.regionId = builder.regionId;
            this.removalPolicies = builder.removalPolicies;
            this.removingCapacity = builder.removingCapacity;
            this.removingWaitCapacity = builder.removingWaitCapacity;
            this.resourceGroupId = builder.resourceGroupId;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingGroupName = builder.scalingGroupName;
            this.scalingPolicy = builder.scalingPolicy;
            this.serverGroups = builder.serverGroups;
            this.spotAllocationStrategy = builder.spotAllocationStrategy;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.standbyCapacity = builder.standbyCapacity;
            this.stoppedCapacity = builder.stoppedCapacity;
            this.suspendedProcesses = builder.suspendedProcesses;
            this.systemSuspended = builder.systemSuspended;
            this.tags = builder.tags;
            this.totalCapacity = builder.totalCapacity;
            this.totalInstanceCount = builder.totalInstanceCount;
            this.vServerGroups = builder.vServerGroups;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroups create() {
            return builder().build();
        }

        /**
         * @return activeCapacity
         */
        public Integer getActiveCapacity() {
            return this.activeCapacity;
        }

        /**
         * @return activeScalingConfigurationId
         */
        public String getActiveScalingConfigurationId() {
            return this.activeScalingConfigurationId;
        }

        /**
         * @return albServerGroups
         */
        public java.util.List < AlbServerGroups> getAlbServerGroups() {
            return this.albServerGroups;
        }

        /**
         * @return allocationStrategy
         */
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        /**
         * @return azBalance
         */
        public Boolean getAzBalance() {
            return this.azBalance;
        }

        /**
         * @return compensateWithOnDemand
         */
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return currentHostName
         */
        public String getCurrentHostName() {
            return this.currentHostName;
        }

        /**
         * @return customPolicyARN
         */
        public String getCustomPolicyARN() {
            return this.customPolicyARN;
        }

        /**
         * @return DBInstanceIds
         */
        public java.util.List < String > getDBInstanceIds() {
            return this.DBInstanceIds;
        }

        /**
         * @return defaultCooldown
         */
        public Integer getDefaultCooldown() {
            return this.defaultCooldown;
        }

        /**
         * @return desiredCapacity
         */
        public Integer getDesiredCapacity() {
            return this.desiredCapacity;
        }

        /**
         * @return enableDesiredCapacity
         */
        public Boolean getEnableDesiredCapacity() {
            return this.enableDesiredCapacity;
        }

        /**
         * @return groupDeletionProtection
         */
        public Boolean getGroupDeletionProtection() {
            return this.groupDeletionProtection;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return healthCheckType
         */
        public String getHealthCheckType() {
            return this.healthCheckType;
        }

        /**
         * @return healthCheckTypes
         */
        public java.util.List < String > getHealthCheckTypes() {
            return this.healthCheckTypes;
        }

        /**
         * @return initCapacity
         */
        public Integer getInitCapacity() {
            return this.initCapacity;
        }

        /**
         * @return isElasticStrengthInAlarm
         */
        public Boolean getIsElasticStrengthInAlarm() {
            return this.isElasticStrengthInAlarm;
        }

        /**
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateOverrides
         */
        public java.util.List < LaunchTemplateOverrides> getLaunchTemplateOverrides() {
            return this.launchTemplateOverrides;
        }

        /**
         * @return launchTemplateVersion
         */
        public String getLaunchTemplateVersion() {
            return this.launchTemplateVersion;
        }

        /**
         * @return lifecycleState
         */
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        /**
         * @return loadBalancerConfigs
         */
        public java.util.List < LoadBalancerConfigs> getLoadBalancerConfigs() {
            return this.loadBalancerConfigs;
        }

        /**
         * @return loadBalancerIds
         */
        public java.util.List < String > getLoadBalancerIds() {
            return this.loadBalancerIds;
        }

        /**
         * @return maxInstanceLifetime
         */
        public Integer getMaxInstanceLifetime() {
            return this.maxInstanceLifetime;
        }

        /**
         * @return maxSize
         */
        public Integer getMaxSize() {
            return this.maxSize;
        }

        /**
         * @return minSize
         */
        public Integer getMinSize() {
            return this.minSize;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return monitorGroupId
         */
        public String getMonitorGroupId() {
            return this.monitorGroupId;
        }

        /**
         * @return multiAZPolicy
         */
        public String getMultiAZPolicy() {
            return this.multiAZPolicy;
        }

        /**
         * @return onDemandBaseCapacity
         */
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        /**
         * @return onDemandPercentageAboveBaseCapacity
         */
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        /**
         * @return pendingCapacity
         */
        public Integer getPendingCapacity() {
            return this.pendingCapacity;
        }

        /**
         * @return pendingWaitCapacity
         */
        public Integer getPendingWaitCapacity() {
            return this.pendingWaitCapacity;
        }

        /**
         * @return protectedCapacity
         */
        public Integer getProtectedCapacity() {
            return this.protectedCapacity;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return removalPolicies
         */
        public java.util.List < String > getRemovalPolicies() {
            return this.removalPolicies;
        }

        /**
         * @return removingCapacity
         */
        public Integer getRemovingCapacity() {
            return this.removingCapacity;
        }

        /**
         * @return removingWaitCapacity
         */
        public Integer getRemovingWaitCapacity() {
            return this.removingWaitCapacity;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingGroupName
         */
        public String getScalingGroupName() {
            return this.scalingGroupName;
        }

        /**
         * @return scalingPolicy
         */
        public String getScalingPolicy() {
            return this.scalingPolicy;
        }

        /**
         * @return serverGroups
         */
        public java.util.List < ServerGroups> getServerGroups() {
            return this.serverGroups;
        }

        /**
         * @return spotAllocationStrategy
         */
        public String getSpotAllocationStrategy() {
            return this.spotAllocationStrategy;
        }

        /**
         * @return spotInstancePools
         */
        public Integer getSpotInstancePools() {
            return this.spotInstancePools;
        }

        /**
         * @return spotInstanceRemedy
         */
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        /**
         * @return standbyCapacity
         */
        public Integer getStandbyCapacity() {
            return this.standbyCapacity;
        }

        /**
         * @return stoppedCapacity
         */
        public Integer getStoppedCapacity() {
            return this.stoppedCapacity;
        }

        /**
         * @return suspendedProcesses
         */
        public java.util.List < String > getSuspendedProcesses() {
            return this.suspendedProcesses;
        }

        /**
         * @return systemSuspended
         */
        public Boolean getSystemSuspended() {
            return this.systemSuspended;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return totalCapacity
         */
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return totalInstanceCount
         */
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        /**
         * @return vServerGroups
         */
        public java.util.List < VServerGroups> getVServerGroups() {
            return this.vServerGroups;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List < String > getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer activeCapacity; 
            private String activeScalingConfigurationId; 
            private java.util.List < AlbServerGroups> albServerGroups; 
            private String allocationStrategy; 
            private Boolean azBalance; 
            private Boolean compensateWithOnDemand; 
            private String creationTime; 
            private String currentHostName; 
            private String customPolicyARN; 
            private java.util.List < String > DBInstanceIds; 
            private Integer defaultCooldown; 
            private Integer desiredCapacity; 
            private Boolean enableDesiredCapacity; 
            private Boolean groupDeletionProtection; 
            private String groupType; 
            private String healthCheckType; 
            private java.util.List < String > healthCheckTypes; 
            private Integer initCapacity; 
            private Boolean isElasticStrengthInAlarm; 
            private String launchTemplateId; 
            private java.util.List < LaunchTemplateOverrides> launchTemplateOverrides; 
            private String launchTemplateVersion; 
            private String lifecycleState; 
            private java.util.List < LoadBalancerConfigs> loadBalancerConfigs; 
            private java.util.List < String > loadBalancerIds; 
            private Integer maxInstanceLifetime; 
            private Integer maxSize; 
            private Integer minSize; 
            private String modificationTime; 
            private String monitorGroupId; 
            private String multiAZPolicy; 
            private Integer onDemandBaseCapacity; 
            private Integer onDemandPercentageAboveBaseCapacity; 
            private Integer pendingCapacity; 
            private Integer pendingWaitCapacity; 
            private Integer protectedCapacity; 
            private String regionId; 
            private java.util.List < String > removalPolicies; 
            private Integer removingCapacity; 
            private Integer removingWaitCapacity; 
            private String resourceGroupId; 
            private String scalingGroupId; 
            private String scalingGroupName; 
            private String scalingPolicy; 
            private java.util.List < ServerGroups> serverGroups; 
            private String spotAllocationStrategy; 
            private Integer spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Integer standbyCapacity; 
            private Integer stoppedCapacity; 
            private java.util.List < String > suspendedProcesses; 
            private Boolean systemSuspended; 
            private java.util.List < Tags> tags; 
            private Integer totalCapacity; 
            private Integer totalInstanceCount; 
            private java.util.List < VServerGroups> vServerGroups; 
            private String vSwitchId; 
            private java.util.List < String > vSwitchIds; 
            private String vpcId; 

            /**
             * The number of ECS instances that are in the In Service state in the scaling group.
             */
            public Builder activeCapacity(Integer activeCapacity) {
                this.activeCapacity = activeCapacity;
                return this;
            }

            /**
             * The ID of the active scaling configuration in the scaling group.
             */
            public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
                this.activeScalingConfigurationId = activeScalingConfigurationId;
                return this;
            }

            /**
             * The information about the Application Load Balancer (ALB) server groups.
             */
            public Builder albServerGroups(java.util.List < AlbServerGroups> albServerGroups) {
                this.albServerGroups = albServerGroups;
                return this;
            }

            /**
             * The allocation policy of instances. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. You can apply the policy to pay-as-you-go instances and preemptible instances. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:
             * <p>
             * 
             * *   priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of instances.
             * *   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * Indicates whether instances in the scaling group are evenly distributed across the specified zones. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder azBalance(Boolean azBalance) {
                this.azBalance = azBalance;
                return this;
            }

            /**
             * Indicates whether Auto Scaling can create pay-as-you-go instances to supplement preemptible instances in the case that preemptilble instances cannot be created due to price-related factors or insufficient inventory when MultiAZPolicy is set to COST_OPTIMIZED. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * The time at which the scaling group was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * >  This parameter is not available for use.
             */
            public Builder currentHostName(String currentHostName) {
                this.currentHostName = currentHostName;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the function that is specified in the custom scale-in policy. This parameter takes effect only if you set the first value of RemovalPolicies to CustomPolicy.
             */
            public Builder customPolicyARN(String customPolicyARN) {
                this.customPolicyARN = customPolicyARN;
                return this;
            }

            /**
             * The IDs of the ApsaraDB RDS instances that are associated with the scaling group.
             */
            public Builder DBInstanceIds(java.util.List < String > DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * The cooldown period of the scaling group. During the cooldown period, Auto Scaling does not execute the scaling activities that are triggered by [CloudMonitor](~~35170~~) event-triggered tasks.
             */
            public Builder defaultCooldown(Integer defaultCooldown) {
                this.defaultCooldown = defaultCooldown;
                return this;
            }

            /**
             * The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the expected number of ECS instances.
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * Indicates whether the Expected Number of Instances feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder enableDesiredCapacity(Boolean enableDesiredCapacity) {
                this.enableDesiredCapacity = enableDesiredCapacity;
                return this;
            }

            /**
             * Indicates whether Deletion Protection is enabled for the scaling group. Valid values:
             * <p>
             * 
             * *   true: Deletion Protection is enabled for the scaling group. The scaling group cannot be deleted.
             * *   false: Deletion Protection is disabled for the scaling group.
             */
            public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
                this.groupDeletionProtection = groupDeletionProtection;
                return this;
            }

            /**
             * The type of instances that are managed by the scaling group.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * The health check mode of the scaling group. Valid values:
             * <p>
             * 
             * *   NONE: Auto Scaling does not check the health status of instances in the scaling group.
             * *   ECS: Auto Scaling checks the health status of ECS instances in the scaling group.
             * *   LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of Classic Load Balancer (CLB) instances are not supported as the health check basis for instances in the scaling group.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * The health check modes of the scaling group. Valid values:
             * <p>
             * 
             * *   NONE: Auto Scaling does not check the health status of instances in the scaling group.
             * *   ECS: Auto Scaling checks the health status of ECS instances in the scaling group.
             * *   LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.
             */
            public Builder healthCheckTypes(java.util.List < String > healthCheckTypes) {
                this.healthCheckTypes = healthCheckTypes;
                return this;
            }

            /**
             * The number of instances that are in the Initialized state and ready to be scaled out in the scaling group.
             */
            public Builder initCapacity(Integer initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * >  This parameter is not available for use.
             */
            public Builder isElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
                this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
                return this;
            }

            /**
             * The ID of the launch template that is used by the scaling group.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * The information about the instance types that are extended in the launch template.
             */
            public Builder launchTemplateOverrides(java.util.List < LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
                return this;
            }

            /**
             * The version of the launch template that is used by the scaling group.
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * The lifecycle status of the scaling group. Valid values:
             * <p>
             * 
             * *   Active: The scaling group is in the Enabled state. Enabled scaling groups can receive requests to execute scaling rules and trigger scaling activities.
             * *   Inactive: The scaling group is in the Disabled state. Disabled scaling groups cannot receive requests to execute scaling rules.
             * *   Deleting: The scaling group is being deleted. Scaling groups that are being deleted cannot receive requests to execute scaling rules, and the parameter settings of the scaling groups cannot be modified.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * The load balancer configurations.
             */
            public Builder loadBalancerConfigs(java.util.List < LoadBalancerConfigs> loadBalancerConfigs) {
                this.loadBalancerConfigs = loadBalancerConfigs;
                return this;
            }

            /**
             * The IDs of the load balancers that are associated with the scaling group.
             */
            public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
                return this;
            }

            /**
             * The maximum life span of an ECS instance in the scaling group. Unit: seconds.
             * <p>
             * 
             * Valid values: 0 or from 86400 to `Integer.maxValue`. A value of 0 indicates that the ECS instance has an unlimited life span in the scaling group.
             * 
             * Default value: null.
             * 
             * >  This parameter is not supported by scaling groups of the Elastic Container Instance type and scaling groups whose ScalingPolicy is set to Recycle.
             */
            public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
                this.maxInstanceLifetime = maxInstanceLifetime;
                return this;
            }

            /**
             * The maximum number of ECS instances that can be contained in the scaling group.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * The minimum number of ECS instances that must be contained in the scaling group.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * The time when the scaling group was modified.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The ID of the CloudMonitor application group that is associated with the scaling group.
             */
            public Builder monitorGroupId(String monitorGroupId) {
                this.monitorGroupId = monitorGroupId;
                return this;
            }

            /**
             * The scaling policy of the ECS instances in the multi-zone scaling group. Valid values:
             * <p>
             * 
             * *   PRIORITY: ECS instances are created based on the value of VSwitchIds. If Auto Scaling cannot create ECS instances in the zone where the vSwitch of the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch of the next highest priority resides.
             * 
             * *   COST_OPTIMIZED: ECS instances are created based on the unit prices of their vCPUs. Auto Scaling preferentially creates ECS instances whose vCPUs are provided at the lowest price. If preemptible instance types are specified in the scaling configuration, Auto Scaling preferentially creates preemptible instances. You can also specify CompensateWithOnDemand to allow Auto Scaling to create pay-as-you-go instances in the case that preemptible instances cannot be created due to insufficient inventory of preemptible instance types.
             * 
             *     **
             * 
             *     **Note** The COST_OPTIMIZED setting takes effect only if you specified multiple instance types or preemptible instance types in your scaling configuration.
             * 
             * *   BALANCE: ECS instances are evenly distributed across the zones that are specified for the scaling group. If ECS instance are unevenly distributed across the specified zones due to insufficient inventory of instance types, you can call the RebalanceInstance operation to rebalance the distribution of the ECS instances.
             */
            public Builder multiAZPolicy(String multiAZPolicy) {
                this.multiAZPolicy = multiAZPolicy;
                return this;
            }

            /**
             * The minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances in the scaling group is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * The percentage of pay-as-you-go instances in the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are being added to the scaling group and configured.
             */
            public Builder pendingCapacity(Integer pendingCapacity) {
                this.pendingCapacity = pendingCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are in the Pending Add state in the scaling group.
             */
            public Builder pendingWaitCapacity(Integer pendingWaitCapacity) {
                this.pendingWaitCapacity = pendingWaitCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are in the Protected state in the scaling group.
             */
            public Builder protectedCapacity(Integer protectedCapacity) {
                this.protectedCapacity = protectedCapacity;
                return this;
            }

            /**
             * The region ID of the scaling group.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The instance removal policies. Valid values:
             * <p>
             * 
             * *   OldestInstance: Auto Scaling removes ECS instances that are added at the earliest point in time to the scaling group.
             * *   NewestInstance: Auto Scaling removes ECS instances that are most recently added to the scaling group.
             * *   OldestScalingConfiguration: Auto Scaling removes ECS instances that are created based on the earliest scaling configuration.
             */
            public Builder removalPolicies(java.util.List < String > removalPolicies) {
                this.removalPolicies = removalPolicies;
                return this;
            }

            /**
             * The number of ECS instances that are being removed from the scaling group.
             */
            public Builder removingCapacity(Integer removingCapacity) {
                this.removingCapacity = removingCapacity;
                return this;
            }

            /**
             * The number of ECS instances that are in the Pending Remove state in the scaling group.
             */
            public Builder removingWaitCapacity(Integer removingWaitCapacity) {
                this.removingWaitCapacity = removingWaitCapacity;
                return this;
            }

            /**
             * The ID of the resource group to which the scaling group belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The ID of the scaling group.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The name of the scaling group.
             */
            public Builder scalingGroupName(String scalingGroupName) {
                this.scalingGroupName = scalingGroupName;
                return this;
            }

            /**
             * The reclaim mode of the scaling group. Valid values:
             * <p>
             * 
             * *   recycle: economical mode
             * *   release: release mode
             * *   forcerelease: forced release mode
             * 
             * For more information, see [RemoveInstances](~~25955~~).
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * The information about the server groups.
             * <p>
             * 
             * >  You can use this parameter to obtain information about ALB server groups and Network Load Balancer (NLB) server groups associated with your scaling group.
             */
            public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
                this.serverGroups = serverGroups;
                return this;
            }

            /**
             * The allocation policy of preemptible instances. You can use this parameter to individually specify the allocation policy for preemptible instances. This parameter takes effect only if you set `MultiAZPolicy` to `COMPOSABLE`. Valid values:
             * <p>
             * 
             * *   priority: Auto Scaling selects instance types based on the specified order of the instance types to create the required number of preemptible instances.
             * *   lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.
             * 
             * Default value: priority.
             */
            public Builder spotAllocationStrategy(String spotAllocationStrategy) {
                this.spotAllocationStrategy = spotAllocationStrategy;
                return this;
            }

            /**
             * The number of specified instance types. Auto Scaling evenly creates preemptible instances of multiple instance types that are provided at the lowest price across the zones of the scaling group. Valid values: 0 to 10.
             */
            public Builder spotInstancePools(Integer spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * Indicates whether preemptible instances can be supplemented. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message which indicates that the preemptible instance is to be reclaimed.
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * The number of ECS instances that are in the Standby state in the scaling group.
             */
            public Builder standbyCapacity(Integer standbyCapacity) {
                this.standbyCapacity = standbyCapacity;
                return this;
            }

            /**
             * The number of instances that are in Economical Mode in the scaling group.
             */
            public Builder stoppedCapacity(Integer stoppedCapacity) {
                this.stoppedCapacity = stoppedCapacity;
                return this;
            }

            /**
             * The processes that are suspended. If no process is suspended, null is returned. Valid values:
             * <p>
             * 
             * *   ScaleIn: scale-in
             * *   ScaleOut: scale-out
             * *   HealthCheck: health check
             * *   AlarmNotification: event-triggered task
             * *   ScheduledAction: scheduled task
             */
            public Builder suspendedProcesses(java.util.List < String > suspendedProcesses) {
                this.suspendedProcesses = suspendedProcesses;
                return this;
            }

            /**
             * Indicates whether Auto Scaling stops executing scaling activities in the scaling group. Valid values:
             * <p>
             * 
             * *   true: Auto Scaling stops executing scaling activities in the scaling group if the scaling activities failed for more than seven consecutive days in the scaling group. You must modify the scaling group or scaling configuration to resume the execution of the scaling activities.
             * *   false: Auto Scaling does not stop executing scaling activities in the scaling group.
             */
            public Builder systemSuspended(Boolean systemSuspended) {
                this.systemSuspended = systemSuspended;
                return this;
            }

            /**
             * The tags of the scaling group.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The total weighted capacity of all ECS instances in the scaling group if Weighted is specified. In other cases, this parameter specifies the total number of ECS instances in the scaling group.
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * The total number of Elastic Compute Service (ECS) instances in the scaling group.
             */
            public Builder totalInstanceCount(Integer totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            /**
             * The backend vServer groups.
             */
            public Builder vServerGroups(java.util.List < VServerGroups> vServerGroups) {
                this.vServerGroups = vServerGroups;
                return this;
            }

            /**
             * The vSwitch ID of the scaling group.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The IDs of the vSwitches that are associated with the scaling group. If you specify VSwitchIds, VSwitchId is ignored.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) in which the scaling group resides.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ScalingGroups build() {
                return new ScalingGroups(this);
            } 

        } 

    }
}
