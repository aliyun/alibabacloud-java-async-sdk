// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

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
    private ScalingGroups scalingGroups;

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
    public ScalingGroups getScalingGroups() {
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
        private ScalingGroups scalingGroups; 
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
        public Builder scalingGroups(ScalingGroups scalingGroups) {
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

    public static class AlbServerGroup extends TeaModel {
        @NameInMap("AlbServerGroupId")
        private String albServerGroupId;

        @NameInMap("Port")
        private Integer port;

        @NameInMap("Weight")
        private Integer weight;

        private AlbServerGroup(Builder builder) {
            this.albServerGroupId = builder.albServerGroupId;
            this.port = builder.port;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroup create() {
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

            public AlbServerGroup build() {
                return new AlbServerGroup(this);
            } 

        } 

    }
    public static class AlbServerGroups extends TeaModel {
        @NameInMap("AlbServerGroup")
        private java.util.List < AlbServerGroup> albServerGroup;

        private AlbServerGroups(Builder builder) {
            this.albServerGroup = builder.albServerGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlbServerGroups create() {
            return builder().build();
        }

        /**
         * @return albServerGroup
         */
        public java.util.List < AlbServerGroup> getAlbServerGroup() {
            return this.albServerGroup;
        }

        public static final class Builder {
            private java.util.List < AlbServerGroup> albServerGroup; 

            /**
             * AlbServerGroup.
             */
            public Builder albServerGroup(java.util.List < AlbServerGroup> albServerGroup) {
                this.albServerGroup = albServerGroup;
                return this;
            }

            public AlbServerGroups build() {
                return new AlbServerGroups(this);
            } 

        } 

    }
    public static class DBInstanceIds extends TeaModel {
        @NameInMap("DBInstanceId")
        private java.util.List < String > DBInstanceId;

        private DBInstanceIds(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceIds create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public java.util.List < String > getDBInstanceId() {
            return this.DBInstanceId;
        }

        public static final class Builder {
            private java.util.List < String > DBInstanceId; 

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(java.util.List < String > DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            public DBInstanceIds build() {
                return new DBInstanceIds(this);
            } 

        } 

    }
    public static class LaunchTemplateOverride extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("WeightedCapacity")
        private Integer weightedCapacity;

        private LaunchTemplateOverride(Builder builder) {
            this.instanceType = builder.instanceType;
            this.weightedCapacity = builder.weightedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateOverride create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return weightedCapacity
         */
        public Integer getWeightedCapacity() {
            return this.weightedCapacity;
        }

        public static final class Builder {
            private String instanceType; 
            private Integer weightedCapacity; 

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * WeightedCapacity.
             */
            public Builder weightedCapacity(Integer weightedCapacity) {
                this.weightedCapacity = weightedCapacity;
                return this;
            }

            public LaunchTemplateOverride build() {
                return new LaunchTemplateOverride(this);
            } 

        } 

    }
    public static class LaunchTemplateOverrides extends TeaModel {
        @NameInMap("LaunchTemplateOverride")
        private java.util.List < LaunchTemplateOverride> launchTemplateOverride;

        private LaunchTemplateOverrides(Builder builder) {
            this.launchTemplateOverride = builder.launchTemplateOverride;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LaunchTemplateOverrides create() {
            return builder().build();
        }

        /**
         * @return launchTemplateOverride
         */
        public java.util.List < LaunchTemplateOverride> getLaunchTemplateOverride() {
            return this.launchTemplateOverride;
        }

        public static final class Builder {
            private java.util.List < LaunchTemplateOverride> launchTemplateOverride; 

            /**
             * LaunchTemplateOverride.
             */
            public Builder launchTemplateOverride(java.util.List < LaunchTemplateOverride> launchTemplateOverride) {
                this.launchTemplateOverride = launchTemplateOverride;
                return this;
            }

            public LaunchTemplateOverrides build() {
                return new LaunchTemplateOverrides(this);
            } 

        } 

    }
    public static class LoadBalancerIds extends TeaModel {
        @NameInMap("LoadBalancerId")
        private java.util.List < String > loadBalancerId;

        private LoadBalancerIds(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LoadBalancerIds create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public java.util.List < String > getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public static final class Builder {
            private java.util.List < String > loadBalancerId; 

            /**
             * LoadBalancerId.
             */
            public Builder loadBalancerId(java.util.List < String > loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            public LoadBalancerIds build() {
                return new LoadBalancerIds(this);
            } 

        } 

    }
    public static class RemovalPolicies extends TeaModel {
        @NameInMap("RemovalPolicy")
        private java.util.List < String > removalPolicy;

        private RemovalPolicies(Builder builder) {
            this.removalPolicy = builder.removalPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemovalPolicies create() {
            return builder().build();
        }

        /**
         * @return removalPolicy
         */
        public java.util.List < String > getRemovalPolicy() {
            return this.removalPolicy;
        }

        public static final class Builder {
            private java.util.List < String > removalPolicy; 

            /**
             * RemovalPolicy.
             */
            public Builder removalPolicy(java.util.List < String > removalPolicy) {
                this.removalPolicy = removalPolicy;
                return this;
            }

            public RemovalPolicies build() {
                return new RemovalPolicies(this);
            } 

        } 

    }
    public static class SuspendedProcesses extends TeaModel {
        @NameInMap("SuspendedProcess")
        private java.util.List < String > suspendedProcess;

        private SuspendedProcesses(Builder builder) {
            this.suspendedProcess = builder.suspendedProcess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SuspendedProcesses create() {
            return builder().build();
        }

        /**
         * @return suspendedProcess
         */
        public java.util.List < String > getSuspendedProcess() {
            return this.suspendedProcess;
        }

        public static final class Builder {
            private java.util.List < String > suspendedProcess; 

            /**
             * SuspendedProcess.
             */
            public Builder suspendedProcess(java.util.List < String > suspendedProcess) {
                this.suspendedProcess = suspendedProcess;
                return this;
            }

            public SuspendedProcesses build() {
                return new SuspendedProcesses(this);
            } 

        } 

    }
    public static class VServerGroupAttribute extends TeaModel {
        @NameInMap("Port")
        private Integer port;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

        @NameInMap("Weight")
        private Integer weight;

        private VServerGroupAttribute(Builder builder) {
            this.port = builder.port;
            this.VServerGroupId = builder.VServerGroupId;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttribute create() {
            return builder().build();
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return VServerGroupId
         */
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Integer port; 
            private String VServerGroupId; 
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
            public Builder VServerGroupId(String VServerGroupId) {
                this.VServerGroupId = VServerGroupId;
                return this;
            }

            /**
             * Weight.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public VServerGroupAttribute build() {
                return new VServerGroupAttribute(this);
            } 

        } 

    }
    public static class VServerGroupAttributes extends TeaModel {
        @NameInMap("VServerGroupAttribute")
        private java.util.List < VServerGroupAttribute> VServerGroupAttribute;

        private VServerGroupAttributes(Builder builder) {
            this.VServerGroupAttribute = builder.VServerGroupAttribute;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroupAttributes create() {
            return builder().build();
        }

        /**
         * @return VServerGroupAttribute
         */
        public java.util.List < VServerGroupAttribute> getVServerGroupAttribute() {
            return this.VServerGroupAttribute;
        }

        public static final class Builder {
            private java.util.List < VServerGroupAttribute> VServerGroupAttribute; 

            /**
             * VServerGroupAttribute.
             */
            public Builder VServerGroupAttribute(java.util.List < VServerGroupAttribute> VServerGroupAttribute) {
                this.VServerGroupAttribute = VServerGroupAttribute;
                return this;
            }

            public VServerGroupAttributes build() {
                return new VServerGroupAttributes(this);
            } 

        } 

    }
    public static class VServerGroup extends TeaModel {
        @NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @NameInMap("VServerGroupAttributes")
        private VServerGroupAttributes VServerGroupAttributes;

        private VServerGroup(Builder builder) {
            this.loadBalancerId = builder.loadBalancerId;
            this.VServerGroupAttributes = builder.VServerGroupAttributes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroup create() {
            return builder().build();
        }

        /**
         * @return loadBalancerId
         */
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        /**
         * @return VServerGroupAttributes
         */
        public VServerGroupAttributes getVServerGroupAttributes() {
            return this.VServerGroupAttributes;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private VServerGroupAttributes VServerGroupAttributes; 

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
            public Builder VServerGroupAttributes(VServerGroupAttributes VServerGroupAttributes) {
                this.VServerGroupAttributes = VServerGroupAttributes;
                return this;
            }

            public VServerGroup build() {
                return new VServerGroup(this);
            } 

        } 

    }
    public static class VServerGroups extends TeaModel {
        @NameInMap("VServerGroup")
        private java.util.List < VServerGroup> VServerGroup;

        private VServerGroups(Builder builder) {
            this.VServerGroup = builder.VServerGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VServerGroups create() {
            return builder().build();
        }

        /**
         * @return VServerGroup
         */
        public java.util.List < VServerGroup> getVServerGroup() {
            return this.VServerGroup;
        }

        public static final class Builder {
            private java.util.List < VServerGroup> VServerGroup; 

            /**
             * VServerGroup.
             */
            public Builder VServerGroup(java.util.List < VServerGroup> VServerGroup) {
                this.VServerGroup = VServerGroup;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
    public static class VSwitchIds extends TeaModel {
        @NameInMap("VSwitchId")
        private java.util.List < String > vSwitchId;

        private VSwitchIds(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitchIds create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public java.util.List < String > getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private java.util.List < String > vSwitchId; 

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(java.util.List < String > vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public VSwitchIds build() {
                return new VSwitchIds(this);
            } 

        } 

    }
    public static class ScalingGroup extends TeaModel {
        @NameInMap("ActiveCapacity")
        private Integer activeCapacity;

        @NameInMap("ActiveScalingConfigurationId")
        private String activeScalingConfigurationId;

        @NameInMap("AlbServerGroups")
        private AlbServerGroups albServerGroups;

        @NameInMap("CompensateWithOnDemand")
        private Boolean compensateWithOnDemand;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("DBInstanceIds")
        private DBInstanceIds DBInstanceIds;

        @NameInMap("DefaultCooldown")
        private Integer defaultCooldown;

        @NameInMap("DesiredCapacity")
        private Integer desiredCapacity;

        @NameInMap("GroupDeletionProtection")
        private Boolean groupDeletionProtection;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("HealthCheckType")
        private String healthCheckType;

        @NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @NameInMap("LaunchTemplateOverrides")
        private LaunchTemplateOverrides launchTemplateOverrides;

        @NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @NameInMap("LifecycleState")
        private String lifecycleState;

        @NameInMap("LoadBalancerIds")
        private LoadBalancerIds loadBalancerIds;

        @NameInMap("MaxSize")
        private Integer maxSize;

        @NameInMap("MinSize")
        private Integer minSize;

        @NameInMap("ModificationTime")
        private String modificationTime;

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
        private RemovalPolicies removalPolicies;

        @NameInMap("RemovingCapacity")
        private Integer removingCapacity;

        @NameInMap("RemovingWaitCapacity")
        private Integer removingWaitCapacity;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("ScalingGroupName")
        private String scalingGroupName;

        @NameInMap("ScalingPolicy")
        private String scalingPolicy;

        @NameInMap("SpotInstancePools")
        private Integer spotInstancePools;

        @NameInMap("SpotInstanceRemedy")
        private Boolean spotInstanceRemedy;

        @NameInMap("StandbyCapacity")
        private Integer standbyCapacity;

        @NameInMap("StoppedCapacity")
        private Integer stoppedCapacity;

        @NameInMap("SuspendedProcesses")
        private SuspendedProcesses suspendedProcesses;

        @NameInMap("SystemSuspended")
        private Boolean systemSuspended;

        @NameInMap("TotalCapacity")
        private Integer totalCapacity;

        @NameInMap("TotalInstanceCount")
        private Integer totalInstanceCount;

        @NameInMap("VServerGroups")
        private VServerGroups VServerGroups;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VSwitchIds")
        private VSwitchIds vSwitchIds;

        @NameInMap("VpcId")
        private String vpcId;

        private ScalingGroup(Builder builder) {
            this.activeCapacity = builder.activeCapacity;
            this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
            this.albServerGroups = builder.albServerGroups;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.creationTime = builder.creationTime;
            this.DBInstanceIds = builder.DBInstanceIds;
            this.defaultCooldown = builder.defaultCooldown;
            this.desiredCapacity = builder.desiredCapacity;
            this.groupDeletionProtection = builder.groupDeletionProtection;
            this.groupType = builder.groupType;
            this.healthCheckType = builder.healthCheckType;
            this.launchTemplateId = builder.launchTemplateId;
            this.launchTemplateOverrides = builder.launchTemplateOverrides;
            this.launchTemplateVersion = builder.launchTemplateVersion;
            this.lifecycleState = builder.lifecycleState;
            this.loadBalancerIds = builder.loadBalancerIds;
            this.maxSize = builder.maxSize;
            this.minSize = builder.minSize;
            this.modificationTime = builder.modificationTime;
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
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingGroupName = builder.scalingGroupName;
            this.scalingPolicy = builder.scalingPolicy;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.standbyCapacity = builder.standbyCapacity;
            this.stoppedCapacity = builder.stoppedCapacity;
            this.suspendedProcesses = builder.suspendedProcesses;
            this.systemSuspended = builder.systemSuspended;
            this.totalCapacity = builder.totalCapacity;
            this.totalInstanceCount = builder.totalInstanceCount;
            this.VServerGroups = builder.VServerGroups;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroup create() {
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
        public AlbServerGroups getAlbServerGroups() {
            return this.albServerGroups;
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
         * @return DBInstanceIds
         */
        public DBInstanceIds getDBInstanceIds() {
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
         * @return launchTemplateId
         */
        public String getLaunchTemplateId() {
            return this.launchTemplateId;
        }

        /**
         * @return launchTemplateOverrides
         */
        public LaunchTemplateOverrides getLaunchTemplateOverrides() {
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
         * @return loadBalancerIds
         */
        public LoadBalancerIds getLoadBalancerIds() {
            return this.loadBalancerIds;
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
        public RemovalPolicies getRemovalPolicies() {
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
        public SuspendedProcesses getSuspendedProcesses() {
            return this.suspendedProcesses;
        }

        /**
         * @return systemSuspended
         */
        public Boolean getSystemSuspended() {
            return this.systemSuspended;
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
         * @return VServerGroups
         */
        public VServerGroups getVServerGroups() {
            return this.VServerGroups;
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
        public VSwitchIds getVSwitchIds() {
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
            private AlbServerGroups albServerGroups; 
            private Boolean compensateWithOnDemand; 
            private String creationTime; 
            private DBInstanceIds DBInstanceIds; 
            private Integer defaultCooldown; 
            private Integer desiredCapacity; 
            private Boolean groupDeletionProtection; 
            private String groupType; 
            private String healthCheckType; 
            private String launchTemplateId; 
            private LaunchTemplateOverrides launchTemplateOverrides; 
            private String launchTemplateVersion; 
            private String lifecycleState; 
            private LoadBalancerIds loadBalancerIds; 
            private Integer maxSize; 
            private Integer minSize; 
            private String modificationTime; 
            private String multiAZPolicy; 
            private Integer onDemandBaseCapacity; 
            private Integer onDemandPercentageAboveBaseCapacity; 
            private Integer pendingCapacity; 
            private Integer pendingWaitCapacity; 
            private Integer protectedCapacity; 
            private String regionId; 
            private RemovalPolicies removalPolicies; 
            private Integer removingCapacity; 
            private Integer removingWaitCapacity; 
            private String scalingGroupId; 
            private String scalingGroupName; 
            private String scalingPolicy; 
            private Integer spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Integer standbyCapacity; 
            private Integer stoppedCapacity; 
            private SuspendedProcesses suspendedProcesses; 
            private Boolean systemSuspended; 
            private Integer totalCapacity; 
            private Integer totalInstanceCount; 
            private VServerGroups VServerGroups; 
            private String vSwitchId; 
            private VSwitchIds vSwitchIds; 
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
            public Builder albServerGroups(AlbServerGroups albServerGroups) {
                this.albServerGroups = albServerGroups;
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
             * DBInstanceIds.
             */
            public Builder DBInstanceIds(DBInstanceIds DBInstanceIds) {
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
             * LaunchTemplateId.
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * LaunchTemplateOverrides.
             */
            public Builder launchTemplateOverrides(LaunchTemplateOverrides launchTemplateOverrides) {
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
             * LoadBalancerIds.
             */
            public Builder loadBalancerIds(LoadBalancerIds loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
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
            public Builder removalPolicies(RemovalPolicies removalPolicies) {
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
            public Builder suspendedProcesses(SuspendedProcesses suspendedProcesses) {
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
            public Builder VServerGroups(VServerGroups VServerGroups) {
                this.VServerGroups = VServerGroups;
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
            public Builder vSwitchIds(VSwitchIds vSwitchIds) {
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

            public ScalingGroup build() {
                return new ScalingGroup(this);
            } 

        } 

    }
    public static class ScalingGroups extends TeaModel {
        @NameInMap("ScalingGroup")
        private java.util.List < ScalingGroup> scalingGroup;

        private ScalingGroups(Builder builder) {
            this.scalingGroup = builder.scalingGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingGroups create() {
            return builder().build();
        }

        /**
         * @return scalingGroup
         */
        public java.util.List < ScalingGroup> getScalingGroup() {
            return this.scalingGroup;
        }

        public static final class Builder {
            private java.util.List < ScalingGroup> scalingGroup; 

            /**
             * ScalingGroup.
             */
            public Builder scalingGroup(java.util.List < ScalingGroup> scalingGroup) {
                this.scalingGroup = scalingGroup;
                return this;
            }

            public ScalingGroups build() {
                return new ScalingGroups(this);
            } 

        } 

    }
}
