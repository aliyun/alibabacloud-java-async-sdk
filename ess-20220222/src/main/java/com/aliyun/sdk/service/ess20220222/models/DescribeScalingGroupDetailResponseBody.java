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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeScalingGroupDetailResponseBody model) {
            this.output = model.output;
            this.requestId = model.requestId;
            this.scalingGroup = model.scalingGroup;
        } 

        /**
         * <p>The output details of the ECI scaling group. Currently, only the Kubernetes Deployment YAML format is supported.</p>
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
         * <p>The Auto Scaling group.</p>
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

            private Builder() {
            } 

            private Builder(AlbServerGroups model) {
                this.albServerGroupId = model.albServerGroupId;
                this.port = model.port;
                this.weight = model.weight;
            } 

            /**
             * <p>The ID of the ALB server group.</p>
             * 
             * <strong>example:</strong>
             * <p>sgp-ddwb0y0g6y9bjm****</p>
             */
            public Builder albServerGroupId(String albServerGroupId) {
                this.albServerGroupId = albServerGroupId;
                return this;
            }

            /**
             * <p>The port number used by the instance after Auto Scaling adds the instance to the ALB server group.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the ALB server group.</p>
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

            private Builder() {
            } 

            private Builder(LaunchTemplateOverrides model) {
                this.instanceType = model.instanceType;
                this.spotPriceLimit = model.spotPriceLimit;
                this.weightedCapacity = model.weightedCapacity;
            } 

            /**
             * <p>The specified instance type, which overrides the instance type in the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c5.xlarge</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The maximum price for the spot instance type specified by LaunchTemplateOverride.InstanceType.</p>
             * <blockquote>
             * <p>This parameter takes effect only when the LaunchTemplateId parameter is specified.</p>
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
             * <p>The weight of the instance type, which indicates the capacity of a single instance of this instance type in the scaling group. A greater weight indicates that fewer instances of this instance type are required to meet the expected capacity.</p>
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

            private Builder() {
            } 

            private Builder(LoadBalancerConfigs model) {
                this.loadBalancerId = model.loadBalancerId;
                this.weight = model.weight;
            } 

            /**
             * <p>The ID of the load balancing CLB (formerly SLB) instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zein3ytoeq49cmkbyxr0</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The weight of the backend server.</p>
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

            private Builder() {
            } 

            private Builder(ServerGroups model) {
                this.port = model.port;
                this.serverGroupId = model.serverGroupId;
                this.type = model.type;
                this.weight = model.weight;
            } 

            /**
             * <p>The port number used by the instance after Auto Scaling adds the instance to the server group.</p>
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
             * <p>The type of the load balancing server group. Valid values:</p>
             * <ul>
             * <li>ALB: Application Load Balancer (ALB).</li>
             * <li>NLB: Network Load Balancer (NLB).</li>
             * <li>GWLB: Gateway Load Balancer (GWLB).</li>
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
             * <p>The weight of the instance as a backend server after Auto Scaling adds the instance to the server group.</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.propagate = model.propagate;
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>Indicates whether the tag is propagated. Valid values:</p>
             * <ul>
             * <li>true: Tags on the scaling group are propagated only to newly created instances, and not to instances that are already running in the scaling group.</li>
             * <li>false: Tags on the scaling group are not propagated to instances.</li>
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

            private Builder() {
            } 

            private Builder(VServerGroupAttributes model) {
                this.port = model.port;
                this.vServerGroupId = model.vServerGroupId;
                this.weight = model.weight;
            } 

            /**
             * <p>The Server Port of the backend server.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The ID of the backend server group.</p>
             * 
             * <strong>example:</strong>
             * <p>rsp-bp12bjrny****</p>
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            /**
             * <p>The weight of the backend server group.</p>
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

            private Builder() {
            } 

            private Builder(VServerGroups model) {
                this.loadBalancerId = model.loadBalancerId;
                this.vServerGroupAttributes = model.vServerGroupAttributes;
            } 

            /**
             * <p>The ID of the traditional load balancing CLB (formerly SLB) instance to which the virtual server group (virtual service) belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>147b46d767c-cn-qingdao-cm5****</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The attributes of the backend server group.</p>
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
    public static class ZoneShiftPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImpairedZoneHealthCheckBehavior")
        private String impairedZoneHealthCheckBehavior;

        @com.aliyun.core.annotation.NameInMap("ScaleInBlockedRuleTypes")
        private java.util.List<String> scaleInBlockedRuleTypes;

        @com.aliyun.core.annotation.NameInMap("ScaleOutInHealthyZonesOnly")
        private Boolean scaleOutInHealthyZonesOnly;

        private ZoneShiftPolicy(Builder builder) {
            this.impairedZoneHealthCheckBehavior = builder.impairedZoneHealthCheckBehavior;
            this.scaleInBlockedRuleTypes = builder.scaleInBlockedRuleTypes;
            this.scaleOutInHealthyZonesOnly = builder.scaleOutInHealthyZonesOnly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneShiftPolicy create() {
            return builder().build();
        }

        /**
         * @return impairedZoneHealthCheckBehavior
         */
        public String getImpairedZoneHealthCheckBehavior() {
            return this.impairedZoneHealthCheckBehavior;
        }

        /**
         * @return scaleInBlockedRuleTypes
         */
        public java.util.List<String> getScaleInBlockedRuleTypes() {
            return this.scaleInBlockedRuleTypes;
        }

        /**
         * @return scaleOutInHealthyZonesOnly
         */
        public Boolean getScaleOutInHealthyZonesOnly() {
            return this.scaleOutInHealthyZonesOnly;
        }

        public static final class Builder {
            private String impairedZoneHealthCheckBehavior; 
            private java.util.List<String> scaleInBlockedRuleTypes; 
            private Boolean scaleOutInHealthyZonesOnly; 

            private Builder() {
            } 

            private Builder(ZoneShiftPolicy model) {
                this.impairedZoneHealthCheckBehavior = model.impairedZoneHealthCheckBehavior;
                this.scaleInBlockedRuleTypes = model.scaleInBlockedRuleTypes;
                this.scaleOutInHealthyZonesOnly = model.scaleOutInHealthyZonesOnly;
            } 

            /**
             * <p>The health check behavior in impaired zones. Valid values: </p>
             * <ul>
             * <li>ReplaceUnhealthy: Unhealthy instances in all zones are replaced as usual. </li>
             * <li>IgnoreUnhealthy: Unhealthy instances in impaired zones are not replaced, while healthy zones are not affected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ReplaceUnhealthy</p>
             */
            public Builder impairedZoneHealthCheckBehavior(String impairedZoneHealthCheckBehavior) {
                this.impairedZoneHealthCheckBehavior = impairedZoneHealthCheckBehavior;
                return this;
            }

            /**
             * <p>Blocks scale-in activities triggered by specified types of scaling rules to prevent false scale-in caused by fake improvement of monitoring metrics due to unreachable instances in impaired zones. The blocking scope applies to all zones in the scaling group, not just impaired zones. Valid values: </p>
             * <ul>
             * <li>StepScalingRule: Blocks scale-in triggered by step scaling rules. </li>
             * <li>TargetTrackingScalingRule: Blocks scale-in triggered by target tracking scaling rules. </li>
             * <li>None: Does not block scale-in.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StepScalingRule</p>
             */
            public Builder scaleInBlockedRuleTypes(java.util.List<String> scaleInBlockedRuleTypes) {
                this.scaleInBlockedRuleTypes = scaleInBlockedRuleTypes;
                return this;
            }

            /**
             * <p>Specifies whether scale-out creates instances only in healthy zones during the zone shift. Valid values: </p>
             * <ul>
             * <li>true: Scale-out creates instances only in healthy zones and skips impaired zones. </li>
             * <li>false: Scale-out can create instances in any zone under the scaling group without zone restrictions.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scaleOutInHealthyZonesOnly(Boolean scaleOutInHealthyZonesOnly) {
                this.scaleOutInHealthyZonesOnly = scaleOutInHealthyZonesOnly;
                return this;
            }

            public ZoneShiftPolicy build() {
                return new ZoneShiftPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingGroupDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupDetailResponseBody</p>
     */
    public static class ZoneShiftOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExpiryTime")
        private String expiryTime;

        @com.aliyun.core.annotation.NameInMap("ImpairedZoneIds")
        private java.util.List<String> impairedZoneIds;

        @com.aliyun.core.annotation.NameInMap("ZoneShiftPolicy")
        private ZoneShiftPolicy zoneShiftPolicy;

        private ZoneShiftOptions(Builder builder) {
            this.expiryTime = builder.expiryTime;
            this.impairedZoneIds = builder.impairedZoneIds;
            this.zoneShiftPolicy = builder.zoneShiftPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ZoneShiftOptions create() {
            return builder().build();
        }

        /**
         * @return expiryTime
         */
        public String getExpiryTime() {
            return this.expiryTime;
        }

        /**
         * @return impairedZoneIds
         */
        public java.util.List<String> getImpairedZoneIds() {
            return this.impairedZoneIds;
        }

        /**
         * @return zoneShiftPolicy
         */
        public ZoneShiftPolicy getZoneShiftPolicy() {
            return this.zoneShiftPolicy;
        }

        public static final class Builder {
            private String expiryTime; 
            private java.util.List<String> impairedZoneIds; 
            private ZoneShiftPolicy zoneShiftPolicy; 

            private Builder() {
            } 

            private Builder(ZoneShiftOptions model) {
                this.expiryTime = model.expiryTime;
                this.impairedZoneIds = model.impairedZoneIds;
                this.zoneShiftPolicy = model.zoneShiftPolicy;
            } 

            /**
             * <p>The expiration time of the zone shift. After the expiration time, the system automatically ends the shift and restores the related zones. The time is displayed in UTC and follows the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T12:05Z</p>
             */
            public Builder expiryTime(String expiryTime) {
                this.expiryTime = expiryTime;
                return this;
            }

            /**
             * <p>The list of impaired zone IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-g</p>
             */
            public Builder impairedZoneIds(java.util.List<String> impairedZoneIds) {
                this.impairedZoneIds = impairedZoneIds;
                return this;
            }

            /**
             * <p>The behavior policy of the scaling group during the zone shift.</p>
             */
            public Builder zoneShiftPolicy(ZoneShiftPolicy zoneShiftPolicy) {
                this.zoneShiftPolicy = zoneShiftPolicy;
                return this;
            }

            public ZoneShiftOptions build() {
                return new ZoneShiftOptions(this);
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

        @com.aliyun.core.annotation.NameInMap("ZoneShiftOptions")
        private ZoneShiftOptions zoneShiftOptions;

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
            this.zoneShiftOptions = builder.zoneShiftOptions;
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

        /**
         * @return zoneShiftOptions
         */
        public ZoneShiftOptions getZoneShiftOptions() {
            return this.zoneShiftOptions;
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
            private ZoneShiftOptions zoneShiftOptions; 

            private Builder() {
            } 

            private Builder(ScalingGroup model) {
                this.activeCapacity = model.activeCapacity;
                this.activeScalingConfigurationId = model.activeScalingConfigurationId;
                this.albServerGroups = model.albServerGroups;
                this.allocationStrategy = model.allocationStrategy;
                this.azBalance = model.azBalance;
                this.compensateWithOnDemand = model.compensateWithOnDemand;
                this.creationTime = model.creationTime;
                this.currentHostName = model.currentHostName;
                this.customPolicyARN = model.customPolicyARN;
                this.DBInstanceIds = model.DBInstanceIds;
                this.defaultCooldown = model.defaultCooldown;
                this.desiredCapacity = model.desiredCapacity;
                this.enableDesiredCapacity = model.enableDesiredCapacity;
                this.groupDeletionProtection = model.groupDeletionProtection;
                this.groupType = model.groupType;
                this.healthCheckType = model.healthCheckType;
                this.healthCheckTypes = model.healthCheckTypes;
                this.initCapacity = model.initCapacity;
                this.isElasticStrengthInAlarm = model.isElasticStrengthInAlarm;
                this.launchTemplateId = model.launchTemplateId;
                this.launchTemplateOverrides = model.launchTemplateOverrides;
                this.launchTemplateVersion = model.launchTemplateVersion;
                this.lifecycleState = model.lifecycleState;
                this.loadBalancerConfigs = model.loadBalancerConfigs;
                this.loadBalancerIds = model.loadBalancerIds;
                this.maxInstanceLifetime = model.maxInstanceLifetime;
                this.maxSize = model.maxSize;
                this.minSize = model.minSize;
                this.modificationTime = model.modificationTime;
                this.monitorGroupId = model.monitorGroupId;
                this.multiAZPolicy = model.multiAZPolicy;
                this.onDemandBaseCapacity = model.onDemandBaseCapacity;
                this.onDemandPercentageAboveBaseCapacity = model.onDemandPercentageAboveBaseCapacity;
                this.pendingCapacity = model.pendingCapacity;
                this.pendingWaitCapacity = model.pendingWaitCapacity;
                this.protectedCapacity = model.protectedCapacity;
                this.regionId = model.regionId;
                this.removalPolicies = model.removalPolicies;
                this.removingCapacity = model.removingCapacity;
                this.removingWaitCapacity = model.removingWaitCapacity;
                this.resourceGroupId = model.resourceGroupId;
                this.scalingGroupId = model.scalingGroupId;
                this.scalingGroupName = model.scalingGroupName;
                this.scalingPolicy = model.scalingPolicy;
                this.serverGroups = model.serverGroups;
                this.spotAllocationStrategy = model.spotAllocationStrategy;
                this.spotInstancePools = model.spotInstancePools;
                this.spotInstanceRemedy = model.spotInstanceRemedy;
                this.standbyCapacity = model.standbyCapacity;
                this.stoppedCapacity = model.stoppedCapacity;
                this.suspendedProcesses = model.suspendedProcesses;
                this.systemSuspended = model.systemSuspended;
                this.tags = model.tags;
                this.totalCapacity = model.totalCapacity;
                this.totalInstanceCount = model.totalInstanceCount;
                this.vServerGroups = model.vServerGroups;
                this.vSwitchId = model.vSwitchId;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
                this.zoneShiftOptions = model.zoneShiftOptions;
            } 

            /**
             * <p>The number of ECS instances that have been added to the scaling group and are running properly.</p>
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
             * <p>The allocation strategy that determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution strategy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when MultiAZPolicy is set to COMPOSABLE. Valid values:</p>
             * <ul>
             * <li>priority: Creates instances based on the order of the configured instance types.</li>
             * <li>lowestPrice: Creates instances based on the unit price of vCPUs from low to high.</li>
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
             * <p>Specifies whether the capacity of the scaling group is evenly distributed across multiple zones. This parameter takes effect only when MultiAZPolicy is set to COMPOSABLE. Valid values:</p>
             * <ul>
             * <li>true: The capacity of the scaling group is evenly distributed across multiple zones.</li>
             * <li>false: The capacity of the scaling group is not evenly distributed across multiple zones.</li>
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
             * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when the number of spot instances cannot be met due to insufficient inventory or price limits. This parameter takes effect only when MultiAZPolicy is set to COST_OPTIMIZED. Valid values:</p>
             * <ul>
             * <li>true: Yes.</li>
             * <li>false: No.</li>
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
             * <p>The time when the scaling group was created. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-08-14T10:58Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>This parameter is not available.</p>
             * 
             * <strong>example:</strong>
             * <p>hostname</p>
             */
            public Builder currentHostName(String currentHostName) {
                this.currentHostName = currentHostName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the Function Compute function for the custom scale-in policy. This parameter takes effect only when the first removal policy in RemovalPolicies is set to CustomPolicy.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder customPolicyARN(String customPolicyARN) {
                this.customPolicyARN = customPolicyARN;
                return this;
            }

            /**
             * <p>The IDs of the ApsaraDB RDS instances associated with the scaling group.</p>
             */
            public Builder DBInstanceIds(java.util.List<String> DBInstanceIds) {
                this.DBInstanceIds = DBInstanceIds;
                return this;
            }

            /**
             * <p>The cooldown time. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder defaultCooldown(Integer defaultCooldown) {
                this.defaultCooldown = defaultCooldown;
                return this;
            }

            /**
             * <p>The expected number of instances in the scaling group. The scaling group automatically maintains the number of ECS instances at this expected value.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * <p>Indicates whether the expected number of instances feature is enabled. Valid values:</p>
             * <ul>
             * <li>true: The expected number of instances feature is enabled.</li>
             * <li>false: The expected number of instances feature is disabled.</li>
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
             * <p>Specifies whether deletion protection is enabled for the scaling group. Valid values:</p>
             * <ul>
             * <li>true: Deletion protection is enabled. The scaling group cannot be deleted.</li>
             * <li>false: Deletion protection is disabled.</li>
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
             * <p>The type of instances managed by the scaling group. Valid values:</p>
             * <ul>
             * <li>ECS: The scaling group manages ECS instances.</li>
             * <li>ECI: The scaling group manages ECI instances.</li>
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
             * <li>NONE: No health check is performed.</li>
             * <li>ECS: Health checks are performed on instances in the scaling group. This value applies to both ECS and Elastic Container Instance (ECI) scaling groups.</li>
             * <li>LOAD_BALANCER: The health status of instances is determined based on the health check results of load balancing (the CLB load balancing type is currently not supported).</li>
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
             * <li>NONE: No health check is performed.</li>
             * <li>ECS: Health checks are performed on instances in the scaling group. This value is used to enable instance health checks for both ECS and ECI scaling groups.</li>
             * <li>LOAD_BALANCER: The health status of instances is determined based on the health check results of load balancing (CLB load balancing is currently not supported).</li>
             * </ul>
             */
            public Builder healthCheckTypes(java.util.List<String> healthCheckTypes) {
                this.healthCheckTypes = healthCheckTypes;
                return this;
            }

            /**
             * <p>The number of instances in the scaling group that are in the initialization state before scale-out.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder initCapacity(Integer initCapacity) {
                this.initCapacity = initCapacity;
                return this;
            }

            /**
             * <p>This parameter is not available.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isElasticStrengthInAlarm(Boolean isElasticStrengthInAlarm) {
                this.isElasticStrengthInAlarm = isElasticStrengthInAlarm;
                return this;
            }

            /**
             * <p>The ID of the launch template used by the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>lt-m5e3ofjr1zn1aw7****</p>
             */
            public Builder launchTemplateId(String launchTemplateId) {
                this.launchTemplateId = launchTemplateId;
                return this;
            }

            /**
             * <p>The instance type overrides for the launch template.</p>
             */
            public Builder launchTemplateOverrides(java.util.List<LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
                return this;
            }

            /**
             * <p>The version of the launch template.</p>
             * 
             * <strong>example:</strong>
             * <p>Default</p>
             */
            public Builder launchTemplateVersion(String launchTemplateVersion) {
                this.launchTemplateVersion = launchTemplateVersion;
                return this;
            }

            /**
             * <p>The lifecycle state of the scaling group. Valid values:</p>
             * <ul>
             * <li>Active: The scaling group is active. Only active scaling groups can accept requests to execute scaling rules and trigger a scaling activity.</li>
             * <li>Inactive: The scaling group is inactive. Inactive scaling groups do not accept any requests to execute scaling rules.</li>
             * <li>Deleting: The scaling group is being deleted. Scaling groups in the Deleting state do not accept any requests to execute scaling rules, and their parameters cannot be modified.</li>
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
             * <p>The list of load balancing configurations.</p>
             */
            public Builder loadBalancerConfigs(java.util.List<LoadBalancerConfigs> loadBalancerConfigs) {
                this.loadBalancerConfigs = loadBalancerConfigs;
                return this;
            }

            /**
             * <p>The IDs of the load balancing instances associated with the scaling group.</p>
             */
            public Builder loadBalancerIds(java.util.List<String> loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
                return this;
            }

            /**
             * <p>The maximum lifetime of instances in the scaling group. Unit: seconds.
             * Valid values: 0 or [86400, Integer.maxValue]. A value of 0 indicates that the MaxInstanceLifetime value is cleared, which means MaxInstanceLifetime is not configured.
             * Default value: null.</p>
             * <blockquote>
             * <p>This parameter is not supported for ECI scaling groups or scaling groups that have the economical mode enabled.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>86400</p>
             */
            public Builder maxInstanceLifetime(Integer maxInstanceLifetime) {
                this.maxInstanceLifetime = maxInstanceLifetime;
                return this;
            }

            /**
             * <p>The maximum number of instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * <p>The minimum number of instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minSize(Integer minSize) {
                this.minSize = minSize;
                return this;
            }

            /**
             * <p>The time when the scaling group was modified. The time follows the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2014-08-14T10:58Z</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The ID of the CloudMonitor application group associated with the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1497****</p>
             */
            public Builder monitorGroupId(String monitorGroupId) {
                this.monitorGroupId = monitorGroupId;
                return this;
            }

            /**
             * <p>The scale-out and scale-in policy for ECS instances in a multi-zone scaling group. Valid values:</p>
             * <ul>
             * <li>PRIORITY: Scales instances based on the defined vSwitches (VSwitchIds). If ECS instances cannot be created in the active zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</li>
             * <li>COST_OPTIMIZED: Attempts to create instances based on the unit price of vCPUs from low to high. If the scaling configuration settings specify multiple instance types that use the spot billing method, the system preferentially creates spot instances. You can use the CompensateWithOnDemand parameter to specify whether to automatically create pay-as-you-go instances when spot instances cannot be created due to insufficient inventory.<blockquote>
             * <p>COST_OPTIMIZED is active only when the scaling configuration settings specify multiple instance types or use spot instances.</p>
             * </blockquote>
             * </li>
             * <li>BALANCE: Evenly allocates ECS instances across the active zones specified for the scaling group. If the distribution across active zones becomes unbalanced due to insufficient inventory, you can call the RebalanceInstance operation to balance the resources.</li>
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
             * <p>The minimum number of pay-as-you-go instances required in the scaling group. Valid values: 0 to 1000. When the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances to create when the number of instances exceeds the base capacity specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are being added to the scaling group but have not completed the relevant configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pendingCapacity(Integer pendingCapacity) {
                this.pendingCapacity = pendingCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are in the Pending Wait state in the scaling group.</p>
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
             * <p>The scale-in policies used to remove instances from the scaling group.</p>
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
             * <p>The number of ECS instances that are in the Removing Wait state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder removingWaitCapacity(Integer removingWaitCapacity) {
                this.removingWaitCapacity = removingWaitCapacity;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the new scaling group belongs.</p>
             * <blockquote>
             * <p>Assigns the new scaling group to the specified resource group. If this parameter is not specified, the scaling group belongs to the default resource group.</p>
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
             * <p>The name of the scaling group. The name must be unique within a region. It must be 2 to 64 characters in length and start with a digit, a letter, or a Chinese character. It can contain digits, underscores (_), hyphens (-), and periods (.).</p>
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
             * <li>recycle: The scaling group uses the shutdown reclaim mode.</li>
             * <li>release: The scaling group uses the release mode.</li>
             * <li>forcerelease: The scaling group uses the force release mode.</li>
             * <li>forcerecycle: The scaling group uses the force shutdown reclaim mode.
             * For more information about the actions on removed instances, see <a href="https://help.aliyun.com/document_detail/25955.html">RemoveInstances</a>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>recycle</p>
             */
            public Builder scalingPolicy(String scalingPolicy) {
                this.scalingPolicy = scalingPolicy;
                return this;
            }

            /**
             * <p>The information about the load balancing server groups.</p>
             * <blockquote>
             * <p>You can use this parameter to obtain information about the ALB service groups, NLB server groups, and GWLB service groups associated with the scaling group.</p>
             * </blockquote>
             */
            public Builder serverGroups(java.util.List<ServerGroups> serverGroups) {
                this.serverGroups = serverGroups;
                return this;
            }

            /**
             * <p>The allocation strategy that determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution strategy applies to both pay-as-you-go and spot capacities. This parameter takes effect only when MultiAZPolicy is set to COMPOSABLE. Valid values:</p>
             * <ul>
             * <li>priority: Creates instances based on the order of the configured instance types.</li>
             * <li>lowestPrice: Creates instances based on the unit price of vCPUs from low to high.</li>
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
             * <p>The number of available instance types. The scaling group creates spot instances of multiple instance types that have the lowest costs and distributes the instances evenly. Valid values: 0 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder spotInstancePools(Integer spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * <p>Specifies whether to enable the spot instance replenishment feature. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * <p>The number of instances that are in the Standby state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standbyCapacity(Integer standbyCapacity) {
                this.standbyCapacity = standbyCapacity;
                return this;
            }

            /**
             * <p>The number of instances in the scaling group that are in the economical mode.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stoppedCapacity(Integer stoppedCapacity) {
                this.stoppedCapacity = stoppedCapacity;
                return this;
            }

            /**
             * <p>The suspended processes. If no process is suspended, an empty value is returned. Valid values:</p>
             * <ul>
             * <li>ScaleIn: The scale-in process.</li>
             * <li>ScaleOut: The scale-out process.</li>
             * <li>HealthCheck: The health check process.</li>
             * <li>AlarmNotification: The event-triggered task process.</li>
             * <li>ScheduledAction: The scheduled task process.</li>
             * </ul>
             */
            public Builder suspendedProcesses(java.util.List<String> suspendedProcesses) {
                this.suspendedProcesses = suspendedProcesses;
                return this;
            }

            /**
             * <p>Specifies whether Auto Scaling stops executing the scaling activity in the scaling group. Valid values:</p>
             * <ul>
             * <li><p>true: Auto Scaling stops executing the scaling activity in the scaling group. This indicates that the scaling group has failed to execute scale-out and scale-in for more than 7 consecutive days. You must modify the scaling group or scaling configuration to recover the execution of the scaling activity.</p>
             * </li>
             * <li><p>false: Auto Scaling executes the scaling activity in the scaling group.</p>
             * </li>
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
             * <p>The collection of tags for the scaling group.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The total weighted capacity of all instances in the scaling group if instance type weights are configured. Otherwise, this parameter indicates the total number of instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * <p>The total number of ECS instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalInstanceCount(Integer totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            /**
             * <p>The list of backend server groups.</p>
             */
            public Builder vServerGroups(java.util.List<VServerGroups> vServerGroups) {
                this.vServerGroups = vServerGroups;
                return this;
            }

            /**
             * <p>The ID of the vSwitch associated with the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1whw2u46cn8zubm****</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The IDs of the vSwitches associated with the scaling group. If you specify the VSwitchIds parameter, the VSwitchId parameter is ignored.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9fcq97y1vqkd8bijcq6</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The zone shift options.</p>
             */
            public Builder zoneShiftOptions(ZoneShiftOptions zoneShiftOptions) {
                this.zoneShiftOptions = zoneShiftOptions;
                return this;
            }

            public ScalingGroup build() {
                return new ScalingGroup(this);
            } 

        } 

    }
}
