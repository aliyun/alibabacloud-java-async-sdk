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
         * ScalingGroups.
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
             * AlbServerGroupId.
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * Weight.
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * SpotPriceLimit.
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * WeightedCapacity.
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
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * Weight.
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
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * ServerGroupId.
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
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
             * Propagate.
             */
            public Builder propagate(Boolean propagate) {
                this.propagate = propagate;
                return this;
            }

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
             * Port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * Weight.
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
             * LoadBalancerId.
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * VServerGroupAttributes.
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
             * ActiveCapacity.
             */
            public Builder activeCapacity(Integer activeCapacity) {
                this.activeCapacity = activeCapacity;
                return this;
            }

            /**
             * ActiveScalingConfigurationId.
             */
            public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
                this.activeScalingConfigurationId = activeScalingConfigurationId;
                return this;
            }

            /**
             * AlbServerGroups.
             */
            public Builder albServerGroups(java.util.List < AlbServerGroups> albServerGroups) {
                this.albServerGroups = albServerGroups;
                return this;
            }

            /**
             * AllocationStrategy.
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * AzBalance.
             */
            public Builder azBalance(Boolean azBalance) {
                this.azBalance = azBalance;
                return this;
            }

            /**
             * CompensateWithOnDemand.
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
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
             * CurrentHostName.
             */
            public Builder currentHostName(String currentHostName) {
                this.currentHostName = currentHostName;
                return this;
            }

            /**
             * CustomPolicyARN.
             */
            public Builder customPolicyARN(String customPolicyARN) {
                this.customPolicyARN = customPolicyARN;
                return this;
            }

            /**
             * DBInstanceIds.
             */
            public Builder DBInstanceIds(java.util.List < String > DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * DefaultCooldown.
             */
            public Builder defaultCooldown(Integer defaultCooldown) {
                this.defaultCooldown = defaultCooldown;
                return this;
            }

            /**
             * DesiredCapacity.
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * EnableDesiredCapacity.
             */
            public Builder enableDesiredCapacity(Boolean enableDesiredCapacity) {
                this.enableDesiredCapacity = enableDesiredCapacity;
                return this;
            }

            /**
             * GroupDeletionProtection.
             */
            public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
                this.groupDeletionProtection = groupDeletionProtection;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * HealthCheckType.
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * HealthCheckTypes.
             */
            public Builder healthCheckTypes(java.util.List < String > healthCheckTypes) {
                this.healthCheckTypes = healthCheckTypes;
                return this;
            }

            /**
             * InitCapacity.
             */
            public Builder initCapacity(Integer initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * IsElasticStrengthInAlarm.
             */
            public Builder isElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
                this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
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
             * LaunchTemplateOverrides.
             */
            public Builder launchTemplateOverrides(java.util.List < LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
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
             * LifecycleState.
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * LoadBalancerConfigs.
             */
            public Builder loadBalancerConfigs(java.util.List < LoadBalancerConfigs> loadBalancerConfigs) {
                this.loadBalancerConfigs = loadBalancerConfigs;
                return this;
            }

            /**
             * LoadBalancerIds.
             */
            public Builder loadBalancerIds(java.util.List < String > loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
                return this;
            }

            /**
             * MaxInstanceLifetime.
             */
            public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
                this.maxInstanceLifetime = maxInstanceLifetime;
                return this;
            }

            /**
             * MaxSize.
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * MinSize.
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * MonitorGroupId.
             */
            public Builder monitorGroupId(String monitorGroupId) {
                this.monitorGroupId = monitorGroupId;
                return this;
            }

            /**
             * MultiAZPolicy.
             */
            public Builder multiAZPolicy(String multiAZPolicy) {
                this.multiAZPolicy = multiAZPolicy;
                return this;
            }

            /**
             * OnDemandBaseCapacity.
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * OnDemandPercentageAboveBaseCapacity.
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * PendingCapacity.
             */
            public Builder pendingCapacity(Integer pendingCapacity) {
                this.pendingCapacity = pendingCapacity;
                return this;
            }

            /**
             * PendingWaitCapacity.
             */
            public Builder pendingWaitCapacity(Integer pendingWaitCapacity) {
                this.pendingWaitCapacity = pendingWaitCapacity;
                return this;
            }

            /**
             * ProtectedCapacity.
             */
            public Builder protectedCapacity(Integer protectedCapacity) {
                this.protectedCapacity = protectedCapacity;
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
             * RemovalPolicies.
             */
            public Builder removalPolicies(java.util.List < String > removalPolicies) {
                this.removalPolicies = removalPolicies;
                return this;
            }

            /**
             * RemovingCapacity.
             */
            public Builder removingCapacity(Integer removingCapacity) {
                this.removingCapacity = removingCapacity;
                return this;
            }

            /**
             * RemovingWaitCapacity.
             */
            public Builder removingWaitCapacity(Integer removingWaitCapacity) {
                this.removingWaitCapacity = removingWaitCapacity;
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
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * ScalingGroupName.
             */
            public Builder scalingGroupName(String scalingGroupName) {
                this.scalingGroupName = scalingGroupName;
                return this;
            }

            /**
             * ScalingPolicy.
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * ServerGroups.
             */
            public Builder serverGroups(java.util.List < ServerGroups> serverGroups) {
                this.serverGroups = serverGroups;
                return this;
            }

            /**
             * SpotAllocationStrategy.
             */
            public Builder spotAllocationStrategy(String spotAllocationStrategy) {
                this.spotAllocationStrategy = spotAllocationStrategy;
                return this;
            }

            /**
             * SpotInstancePools.
             */
            public Builder spotInstancePools(Integer spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * SpotInstanceRemedy.
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * StandbyCapacity.
             */
            public Builder standbyCapacity(Integer standbyCapacity) {
                this.standbyCapacity = standbyCapacity;
                return this;
            }

            /**
             * StoppedCapacity.
             */
            public Builder stoppedCapacity(Integer stoppedCapacity) {
                this.stoppedCapacity = stoppedCapacity;
                return this;
            }

            /**
             * SuspendedProcesses.
             */
            public Builder suspendedProcesses(java.util.List < String > suspendedProcesses) {
                this.suspendedProcesses = suspendedProcesses;
                return this;
            }

            /**
             * SystemSuspended.
             */
            public Builder systemSuspended(Boolean systemSuspended) {
                this.systemSuspended = systemSuspended;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * TotalInstanceCount.
             */
            public Builder totalInstanceCount(Integer totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            /**
             * VServerGroups.
             */
            public Builder vServerGroups(java.util.List < VServerGroups> vServerGroups) {
                this.vServerGroups = vServerGroups;
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
             * VSwitchIds.
             */
            public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * VpcId.
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
