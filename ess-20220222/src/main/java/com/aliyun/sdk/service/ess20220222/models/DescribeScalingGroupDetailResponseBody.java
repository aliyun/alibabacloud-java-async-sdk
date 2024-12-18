// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupDetailResponseBody</p>
 */
public class DescribeScalingGroupDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingGroup")
    private ScalingGroup scalingGroup;

    private DescribeScalingGroupDetailResponseBody(Builder builder) {
        this.output = builder.output;
        this.requestId = builder.requestId;
        this.scalingGroup = builder.scalingGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScalingGroupDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingGroup
     */
    public ScalingGroup getScalingGroup() {
        return this.scalingGroup;
    }

    public static final class Builder {
        private String output; 
        private String requestId; 
        private ScalingGroup scalingGroup; 

        /**
         * <p>The output details of the scaling group of the Elastic Container Instance type. Currently, the output is displayed in a Kubernetes Deployment YAML file.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: apps/v1
         * kind: Deployment
         * metadata:
         *   name: nginx-deployment
         *   labels:
         *     app: nginx
         *   spec:
         *     replicas: 3
         *     selector:
         *        matchLabels:
         *         app: nginx
         *     template:
         *       metadata:
         *         labels:
         *           app: nginx
         *         annotations:
         *           k8s.aliyun.com/eip-bandwidth: 10
         *           k8s.aliyun.com/eci-with-eip: true
         *         spec:
         *           containers:
         *           - name: nginx
         *             image: nginx:1.14.2
         *             ports:
         *             - containerPort: 80</p>
         */
        public Builder output(String output) {
            this.output = output;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scaling group.</p>
         */
        public Builder scalingGroup(ScalingGroup scalingGroup) {
            this.scalingGroup = scalingGroup;
            return this;
        }

        public DescribeScalingGroupDetailResponseBody build() {
            return new DescribeScalingGroupDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class AlbServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlbServerGroupId")
        private String albServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
             * <p>The ID of the Application Load Balancer (ALB) server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-ddwb0y0g6y9bjm****</p>
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * <p>The port number used by an ECS instance as a backend server in the ALB server group.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The weight of an ECS instance as a backend server in the ALB server group.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class LaunchTemplateOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("WeightedCapacity")
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
             * <p>The instance type. The instance type that is specified by using this parameter overwrites the instance type of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum bid price of the instance type that is specified by <code>LaunchTemplateOverride.InstanceType</code>.</p>
             * <blockquote>
             * <p> This parameter takes effect only if you specify <code>LaunchTemplateId</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.025</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>The weight of the instance type. The value of this parameter indicates the capacity of an instance of the specified instance type in the scaling group. A higher weight indicates that a smaller number of instances of the specified instance type are required to meet the expected capacity requirement.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class LoadBalancerConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
             * <p>The ID of the CLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zein3ytoeq49cmkbyxr0</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The weight of a backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class ServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("ServerGroupId")
        private String serverGroupId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
             * <p>The port number used by an ECS instance as a backend server in the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-i9ouakeaerr*****</p>
             */
            public Builder serverGroupId(String serverGroupId) {
                this.serverGroupId = serverGroupId;
                return this;
            }

            /**
             * <p>The type of the server group. Valid values:</p>
             * <ul>
             * <li>ALB</li>
             * <li>NLB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALB</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The weight of an ECS instance as a backend server in the server group.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Propagate")
        private Boolean propagate;

        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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
             * <p>Indicates whether the tags of the scaling group can be propagated to instances. Valid values:</p>
             * <ul>
             * <li>true: The tags of the scaling group can be propagated to only instances that are newly created.</li>
             * <li>false: The tags of the scaling group cannot be propagated to any instances.</li>
             * </ul>
             * <p>Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder propagate(Boolean propagate) {
                this.propagate = propagate;
                return this;
            }

            /**
             * <p>The tag key of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>Department</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>Finance</p>
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
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class VServerGroupAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        @com.aliyun.core.annotation.NameInMap("Weight")
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
             * <p>The port number of a backend vServer.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend vServer group.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-bp12bjrny****</p>
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * <p>The weight of the backend vServer group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class VServerGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
        private String loadBalancerId;

        @com.aliyun.core.annotation.NameInMap("VServerGroupAttributes")
        private java.util.List<VServerGroupAttributes> vServerGroupAttributes;

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
        public java.util.List<VServerGroupAttributes> getVServerGroupAttributes() {
            return this.vServerGroupAttributes;
        }

        public static final class Builder {
            private String loadBalancerId; 
            private java.util.List<VServerGroupAttributes> vServerGroupAttributes; 

            /**
             * <p>The ID of the Classic Load Balancer (CLB, formerly known as Server Load Balancer or SLB) instance to which the backend vServer group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>147b46d767c-cn-qingdao-cm5****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The attributes of the backend vServer group.</p>
             */
            public Builder vServerGroupAttributes(java.util.List<VServerGroupAttributes> vServerGroupAttributes) {
                this.vServerGroupAttributes = vServerGroupAttributes;
                return this;
            }

            public VServerGroups build() {
                return new VServerGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class ScalingGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCapacity")
        private Integer activeCapacity;

        @com.aliyun.core.annotation.NameInMap("ActiveScalingConfigurationId")
        private String activeScalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("AlbServerGroups")
        private java.util.List<AlbServerGroups> albServerGroups;

        @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @com.aliyun.core.annotation.NameInMap("AzBalance")
        private Boolean azBalance;

        @com.aliyun.core.annotation.NameInMap("CompensateWithOnDemand")
        private Boolean compensateWithOnDemand;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("CurrentHostName")
        private String currentHostName;

        @com.aliyun.core.annotation.NameInMap("CustomPolicyARN")
        private String customPolicyARN;

        @com.aliyun.core.annotation.NameInMap("DBInstanceIds")
        private java.util.List<String> DBInstanceIds;

        @com.aliyun.core.annotation.NameInMap("DefaultCooldown")
        private Integer defaultCooldown;

        @com.aliyun.core.annotation.NameInMap("DesiredCapacity")
        private Integer desiredCapacity;

        @com.aliyun.core.annotation.NameInMap("EnableDesiredCapacity")
        private Boolean enableDesiredCapacity;

        @com.aliyun.core.annotation.NameInMap("GroupDeletionProtection")
        private Boolean groupDeletionProtection;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckType")
        private String healthCheckType;

        @com.aliyun.core.annotation.NameInMap("HealthCheckTypes")
        private java.util.List<String> healthCheckTypes;

        @com.aliyun.core.annotation.NameInMap("InitCapacity")
        private Integer initCapacity;

        @com.aliyun.core.annotation.NameInMap("IsElasticStrengthInAlarm")
        private Boolean isElasticStrengthInAlarm;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateId")
        private String launchTemplateId;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateOverrides")
        private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides;

        @com.aliyun.core.annotation.NameInMap("LaunchTemplateVersion")
        private String launchTemplateVersion;

        @com.aliyun.core.annotation.NameInMap("LifecycleState")
        private String lifecycleState;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerConfigs")
        private java.util.List<LoadBalancerConfigs> loadBalancerConfigs;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerIds")
        private java.util.List<String> loadBalancerIds;

        @com.aliyun.core.annotation.NameInMap("MaxInstanceLifetime")
        private Integer maxInstanceLifetime;

        @com.aliyun.core.annotation.NameInMap("MaxSize")
        private Integer maxSize;

        @com.aliyun.core.annotation.NameInMap("MinSize")
        private Integer minSize;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("MonitorGroupId")
        private String monitorGroupId;

        @com.aliyun.core.annotation.NameInMap("MultiAZPolicy")
        private String multiAZPolicy;

        @com.aliyun.core.annotation.NameInMap("OnDemandBaseCapacity")
        private Integer onDemandBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("OnDemandPercentageAboveBaseCapacity")
        private Integer onDemandPercentageAboveBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("PendingCapacity")
        private Integer pendingCapacity;

        @com.aliyun.core.annotation.NameInMap("PendingWaitCapacity")
        private Integer pendingWaitCapacity;

        @com.aliyun.core.annotation.NameInMap("ProtectedCapacity")
        private Integer protectedCapacity;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RemovalPolicies")
        private java.util.List<String> removalPolicies;

        @com.aliyun.core.annotation.NameInMap("RemovingCapacity")
        private Integer removingCapacity;

        @com.aliyun.core.annotation.NameInMap("RemovingWaitCapacity")
        private Integer removingWaitCapacity;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupName")
        private String scalingGroupName;

        @com.aliyun.core.annotation.NameInMap("ScalingPolicy")
        private String scalingPolicy;

        @com.aliyun.core.annotation.NameInMap("ServerGroups")
        private java.util.List<ServerGroups> serverGroups;

        @com.aliyun.core.annotation.NameInMap("SpotAllocationStrategy")
        private String spotAllocationStrategy;

        @com.aliyun.core.annotation.NameInMap("SpotInstancePools")
        private Integer spotInstancePools;

        @com.aliyun.core.annotation.NameInMap("SpotInstanceRemedy")
        private Boolean spotInstanceRemedy;

        @com.aliyun.core.annotation.NameInMap("StandbyCapacity")
        private Integer standbyCapacity;

        @com.aliyun.core.annotation.NameInMap("StoppedCapacity")
        private Integer stoppedCapacity;

        @com.aliyun.core.annotation.NameInMap("SuspendedProcesses")
        private java.util.List<String> suspendedProcesses;

        @com.aliyun.core.annotation.NameInMap("SystemSuspended")
        private Boolean systemSuspended;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Integer totalCapacity;

        @com.aliyun.core.annotation.NameInMap("TotalInstanceCount")
        private Integer totalInstanceCount;

        @com.aliyun.core.annotation.NameInMap("VServerGroups")
        private java.util.List<VServerGroups> vServerGroups;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ScalingGroup(Builder builder) {
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
        public java.util.List<AlbServerGroups> getAlbServerGroups() {
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
        public java.util.List<String> getDBInstanceIds() {
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
        public java.util.List<String> getHealthCheckTypes() {
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
        public java.util.List<LaunchTemplateOverrides> getLaunchTemplateOverrides() {
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
        public java.util.List<LoadBalancerConfigs> getLoadBalancerConfigs() {
            return this.loadBalancerConfigs;
        }

        /**
         * @return loadBalancerIds
         */
        public java.util.List<String> getLoadBalancerIds() {
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
        public java.util.List<String> getRemovalPolicies() {
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
        public java.util.List<ServerGroups> getServerGroups() {
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
        public java.util.List<String> getSuspendedProcesses() {
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
        public java.util.List<Tags> getTags() {
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
        public java.util.List<VServerGroups> getVServerGroups() {
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
        public java.util.List<String> getVSwitchIds() {
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
            private java.util.List<AlbServerGroups> albServerGroups; 
            private String allocationStrategy; 
            private Boolean azBalance; 
            private Boolean compensateWithOnDemand; 
            private String creationTime; 
            private String currentHostName; 
            private String customPolicyARN; 
            private java.util.List<String> DBInstanceIds; 
            private Integer defaultCooldown; 
            private Integer desiredCapacity; 
            private Boolean enableDesiredCapacity; 
            private Boolean groupDeletionProtection; 
            private String groupType; 
            private String healthCheckType; 
            private java.util.List<String> healthCheckTypes; 
            private Integer initCapacity; 
            private Boolean isElasticStrengthInAlarm; 
            private String launchTemplateId; 
            private java.util.List<LaunchTemplateOverrides> launchTemplateOverrides; 
            private String launchTemplateVersion; 
            private String lifecycleState; 
            private java.util.List<LoadBalancerConfigs> loadBalancerConfigs; 
            private java.util.List<String> loadBalancerIds; 
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
            private java.util.List<String> removalPolicies; 
            private Integer removingCapacity; 
            private Integer removingWaitCapacity; 
            private String resourceGroupId; 
            private String scalingGroupId; 
            private String scalingGroupName; 
            private String scalingPolicy; 
            private java.util.List<ServerGroups> serverGroups; 
            private String spotAllocationStrategy; 
            private Integer spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Integer standbyCapacity; 
            private Integer stoppedCapacity; 
            private java.util.List<String> suspendedProcesses; 
            private Boolean systemSuspended; 
            private java.util.List<Tags> tags; 
            private Integer totalCapacity; 
            private Integer totalInstanceCount; 
            private java.util.List<VServerGroups> vServerGroups; 
            private String vSwitchId; 
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 

            /**
             * <p>The number of ECS instances that are in the In Service state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder activeCapacity(Integer activeCapacity) {
                this.activeCapacity = activeCapacity;
                return this;
            }

            /**
             * <p>The ID of the active scaling configuration in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asc-bp1et2qekq3ojr33****</p>
             */
            public Builder activeScalingConfigurationId(String activeScalingConfigurationId) {
                this.activeScalingConfigurationId = activeScalingConfigurationId;
                return this;
            }

            /**
             * <p>The information about the Application Load Balancer (ALB) server groups.</p>
             */
            public Builder albServerGroups(java.util.List<AlbServerGroups> albServerGroups) {
                this.albServerGroups = albServerGroups;
                return this;
            }

            /**
             * <p>The allocation policy of instances. Auto Scaling selects instance types based on the allocation policy to create the required number of instances. You can apply the policy to pay-as-you-go instances and preemptible instances. This parameter takes effect only if you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>. Valid values:</p>
             * <ul>
             * <li>priority: Auto Scaling selects instance types based on the specified order to create the required number of instances.</li>
             * <li>lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>priority</p>
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * <p>Indicates whether instances in the scaling group are evenly distributed across zones. This parameter takes effect only if you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder azBalance(Boolean azBalance) {
                this.azBalance = azBalance;
                return this;
            }

            /**
             * <p>Indicates whether pay-as-you-go ECS instances can be automatically created to reach the required number of ECS instances when preemptible ECS instances cannot be created due to high prices or insufficient inventory of resources. This parameter takes effect when you set <code>MultiAZPolicy</code> to <code>COST_OPTIMIZED</code>. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder compensateWithOnDemand(Boolean compensateWithOnDemand) {
                this.compensateWithOnDemand = compensateWithOnDemand;
                return this;
            }

            /**
             * <p>The time when the scaling group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-08-14T10:58Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hostname</p>
             */
            public Builder currentHostName(String currentHostName) {
                this.currentHostName = currentHostName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the function that is specified in the custom scale-in policy. This parameter takes effect only if you set the first value of RemovalPolicies to CustomPolicy.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder customPolicyARN(String customPolicyARN) {
                this.customPolicyARN = customPolicyARN;
                return this;
            }

            /**
             * <p>The IDs of the ApsaraDB RDS instances that are associated with the scaling group.</p>
             */
            public Builder DBInstanceIds(java.util.List<String> DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * <p>The cooldown period of the scaling group. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder defaultCooldown(Integer defaultCooldown) {
                this.defaultCooldown = defaultCooldown;
                return this;
            }

            /**
             * <p>The expected number of ECS instances in the scaling group. Auto Scaling automatically maintains the expected number of ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * <p>Indicates whether the Expected Number of Instances feature is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDesiredCapacity(Boolean enableDesiredCapacity) {
                this.enableDesiredCapacity = enableDesiredCapacity;
                return this;
            }

            /**
             * <p>Indicates whether Deletion Protection is enabled for the scaling group. Valid values:</p>
             * <ul>
             * <li>true: Deletion Protection is enabled for the scaling group. This way, the scaling group cannot be deleted.</li>
             * <li>false: Deletion Protection is disabled for the scaling group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder groupDeletionProtection(Boolean groupDeletionProtection) {
                this.groupDeletionProtection = groupDeletionProtection;
                return this;
            }

            /**
             * <p>The type of the instances that are managed by the scaling group. Valid values:</p>
             * <ul>
             * <li>ECS: ECS instances</li>
             * <li>ECI: elastic container instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The health check mode of the scaling group. Valid values:</p>
             * <ul>
             * <li>NONE: Auto Scaling does not perform health checks.</li>
             * <li>ECS: Auto Scaling checks the health status of instances in the scaling group. If you want to enable instance health check, you can set the value to ECS, regardless of whether the scaling group is of ECS type or Elastic Container Instance type.</li>
             * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of Classic Load Balancer (CLB) instances are not supported as the health check basis for instances in the scaling group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder healthCheckType(String healthCheckType) {
                this.healthCheckType = healthCheckType;
                return this;
            }

            /**
             * <p>The health check mode of the scaling group. Valid values:</p>
             * <ul>
             * <li>NONE: Auto Scaling does not perform health checks.</li>
             * <li>ECS: Auto Scaling checks the health status of instances in the scaling group. If you want to enable instance health check, you can set the value to ECS, regardless of whether the scaling group is of ECS type or Elastic Container Instance type.</li>
             * <li>LOAD_BALANCER: Auto Scaling checks the health status of instances in the scaling group based on the health check results of load balancers. The health check results of CLB instances are not supported as the health check basis for instances in the scaling group.</li>
             * </ul>
             */
            public Builder healthCheckTypes(java.util.List<String> healthCheckTypes) {
                this.healthCheckTypes = healthCheckTypes;
                return this;
            }

            /**
             * <p>The number of instances that are in the Initialized state and not added to the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder initCapacity(Integer initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * <blockquote>
             * <p> This parameter is not available for use.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
                this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
                return this;
            }

            /**
             * <p>The ID of the launch template that is used by the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-m5e3ofjr1zn1aw7****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The information about the instance types that are extended in the launch template.</p>
             */
            public Builder launchTemplateOverrides(java.util.List<LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
                return this;
            }

            /**
             * <p>The version number of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The status of the scaling group. Valid values:</p>
             * <ul>
             * <li>Active: The scaling group is in the Enabled state. Enabled scaling groups can receive requests to execute scaling rules and trigger scaling activities.</li>
             * <li>Inactive: The scaling group is in the Disabled state. Disabled scaling groups cannot receive requests to execute scaling rules.</li>
             * <li>Deleting: The scaling group is being deleted. Scaling groups that are being deleted cannot receive requests to execute scaling rules, and the parameter settings of the scaling groups cannot be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder lifecycleState(String lifecycleState) {
                this.lifecycleState = lifecycleState;
                return this;
            }

            /**
             * <p>The CLB configurations.</p>
             */
            public Builder loadBalancerConfigs(java.util.List<LoadBalancerConfigs> loadBalancerConfigs) {
                this.loadBalancerConfigs = loadBalancerConfigs;
                return this;
            }

            /**
             * <p>The IDs of the SLB instances that are associated with the scaling group.</p>
             */
            public Builder loadBalancerIds(java.util.List<String> loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
                return this;
            }

            /**
             * <p>The maximum life span of an instance in the scaling group. Unit: seconds.</p>
             * <p>Valid values: 0 or from 86400 to <code>Integer.maxValue</code>. A value of 0 for MaxInstanceLifetime indicates that any previously set limit has been removed, which effectively disables the maximum instance lifetime constraint.</p>
             * <p>Default value: null.</p>
             * <blockquote>
             * <p> This parameter is not supported by scaling groups of the Elastic Container Instance type and scaling groups whose ScalingPolicy is set to Recycle.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
                this.maxInstanceLifetime = maxInstanceLifetime;
                return this;
            }

            /**
             * <p>The maximum number of ECS instances that can be contained in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * <p>The minimum number of ECS instances that must be contained in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * <p>The time when the scaling group was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-08-14T10:58Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The ID of the CloudMonitor application group that is associated with the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1497****</p>
             */
            public Builder monitorGroupId(String monitorGroupId) {
                this.monitorGroupId = monitorGroupId;
                return this;
            }

            /**
             * <p>The scaling policy of the ECS instances in the multi-zone scaling group. Valid values:</p>
             * <ul>
             * <li><p>PRIORITY: ECS instances are created based on the value of VSwitchIds. If Auto Scaling cannot create ECS instances in the zone where the vSwitch of the highest priority resides, Auto Scaling creates ECS instances in the zone where the vSwitch of the next highest priority resides.</p>
             * </li>
             * <li><p>COST_OPTIMIZED: ECS instances are created based on the unit prices of their vCPUs. Auto Scaling preferentially creates ECS instances that use the lowest-priced vCPUs. If preemptible instance types are specified in the scaling configuration, Auto Scaling preferentially creates preemptible instances. You can also specify CompensateWithOnDemand to allow Auto Scaling to create pay-as-you-go instances in the case that preemptible instances cannot be created due to insufficient inventory of preemptible instance types.</p>
             * <p>**</p>
             * <p><strong>Note</strong> The COST_OPTIMIZED setting takes effect only if you specified multiple instance types or preemptible instance types in your scaling configuration.</p>
             * </li>
             * <li><p>BALANCE: ECS instances are evenly distributed across the zones of the scaling group. If ECS instance are unevenly distributed across the specified zones due to insufficient inventory of instance types, you can call the RebalanceInstance operation to rebalance the distribution of the ECS instances.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PRIORITY</p>
             */
            public Builder multiAZPolicy(String multiAZPolicy) {
                this.multiAZPolicy = multiAZPolicy;
                return this;
            }

            /**
             * <p>The minimum number of pay-as-you-go instances that must be contained in the scaling group. Valid values: 0 to 1000. If the number of pay-as-you-go instances in the scaling group is less than the value of this parameter, Auto Scaling preferentially creates pay-as-you-go instances.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances among the excess instances when the minimum number of pay-as-you-go instances reaches the requirement. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are being added to the scaling group and configured.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pendingCapacity(Integer pendingCapacity) {
                this.pendingCapacity = pendingCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are in the Pending Add state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pendingWaitCapacity(Integer pendingWaitCapacity) {
                this.pendingWaitCapacity = pendingWaitCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are in the Protected state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder protectedCapacity(Integer protectedCapacity) {
                this.protectedCapacity = protectedCapacity;
                return this;
            }

            /**
             * <p>The region ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The instance removal policies.</p>
             */
            public Builder removalPolicies(java.util.List<String> removalPolicies) {
                this.removalPolicies = removalPolicies;
                return this;
            }

            /**
             * <p>The number of ECS instances that are being removed from the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder removingCapacity(Integer removingCapacity) {
                this.removingCapacity = removingCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are in the Pending Remove state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder removingWaitCapacity(Integer removingWaitCapacity) {
                this.removingWaitCapacity = removingWaitCapacity;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the scaling group belongs.</p>
             * <blockquote>
             * <p> If you specify this parameter, new scaling groups are added to the specified resource group. If you do not specify this parameter, new scaling groups are added to the default resource group.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2epf32c4uyji</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp14wlu85wrpchm0****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The name of the scaling group. The name of each scaling group must be unique in a region.</p>
             * <p>The name must be 2 to 64 characters in length, and can contain letters, digits, underscores (_), hyphens (-), and periods (.). It must start with a letter or digit.</p>
             * 
             * <strong>example:</strong>
             * <p>dyrSuvBOtO1dEdIlIbp****</p>
             */
            public Builder scalingGroupName(String scalingGroupName) {
                this.scalingGroupName = scalingGroupName;
                return this;
            }

            /**
             * <p>The reclaim mode of the scaling group. Valid values:</p>
             * <ul>
             * <li>recycle: economical mode</li>
             * <li>release: release mode</li>
             * <li>forcerelease: forced release mode</li>
             * <li>forcerecycle: forced recycle mode</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>recycle</p>
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * <p>The information about the server groups.</p>
             * <blockquote>
             * <p> You can use this parameter to obtain information about ALB server groups and Network Load Balancer (NLB) server groups attached to your scaling group.</p>
             * </blockquote>
             */
            public Builder serverGroups(java.util.List<ServerGroups> serverGroups) {
                this.serverGroups = serverGroups;
                return this;
            }

            /**
             * <p>The allocation policy of preemptible instances. Auto Scaling selects instance types based on the allocation policy to create the required number of preemptible instances. You can apply the policy to pay-as-you-go instances and preemptible instances. This parameter takes effect only if you set <code>MultiAZPolicy</code> to <code>COMPOSABLE</code>. Valid values:</p>
             * <ul>
             * <li>priority: Auto Scaling selects instance types based on the specified order to create the required number of preemptible instances.</li>
             * <li>lowestPrice: Auto Scaling selects instance types that have the lowest unit price of vCPUs to create the required number of preemptible instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lowestPrice</p>
             */
            public Builder spotAllocationStrategy(String spotAllocationStrategy) {
                this.spotAllocationStrategy = spotAllocationStrategy;
                return this;
            }

            /**
             * <p>The number of instance types that are specified. Preemptible instances of multiple lowest-priced instance types are evenly distributed across the zones of the scaling group. Valid values: 0 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder spotInstancePools(Integer spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * <p>Indicates whether preemptible instances can be supplemented. If this parameter is set to true, Auto Scaling creates an instance to replace a preemptible instance when Auto Scaling receives the system message which indicates that the preemptible instance is to be reclaimed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * <p>The number of ECS instances that are in the Standby state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standbyCapacity(Integer standbyCapacity) {
                this.standbyCapacity = standbyCapacity;
                return this;
            }

            /**
             * <p>The number of instances that are stopped in Economical Mode in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stoppedCapacity(Integer stoppedCapacity) {
                this.stoppedCapacity = stoppedCapacity;
                return this;
            }

            /**
             * <p>The processes that are suspended. If no process is suspended, null is returned. Valid values:</p>
             * <ul>
             * <li>ScaleIn: scale-in</li>
             * <li>ScaleOut: scale-out</li>
             * <li>HealthCheck: health check</li>
             * <li>AlarmNotification: event-triggered task</li>
             * <li>ScheduledAction: scheduled task</li>
             * </ul>
             */
            public Builder suspendedProcesses(java.util.List<String> suspendedProcesses) {
                this.suspendedProcesses = suspendedProcesses;
                return this;
            }

            /**
             * <p>Indicates whether Auto Scaling stops executing scaling activities in the scaling group. Valid values:</p>
             * <ul>
             * <li>true: Auto Scaling stops executing scaling activities in the scaling group if the scaling activities failed for more than seven consecutive days in the scaling group. You must modify the scaling group or scaling configuration to resume the execution of the scaling activities.</li>
             * <li>false: Auto Scaling does not stop executing scaling activities in the scaling group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder systemSuspended(Boolean systemSuspended) {
                this.systemSuspended = systemSuspended;
                return this;
            }

            /**
             * <p>The tags of the scaling group.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The total weighted capacity of all ECS instances in the scaling group if Weighted is specified. In other cases, the value of this parameter indicates the total number of ECS instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * <p>The total number of Elastic Compute Service (ECS) instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalInstanceCount(Integer totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            /**
             * <p>The backend vServer groups.</p>
             */
            public Builder vServerGroups(java.util.List<VServerGroups> vServerGroups) {
                this.vServerGroups = vServerGroups;
                return this;
            }

            /**
             * <p>The vSwitch ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1whw2u46cn8zubm****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches that are associated with the scaling group. If you specify VSwitchIds, VSwitchId is ignored.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID of the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9fcq97y1vqkd8bijcq6</p>
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
}
