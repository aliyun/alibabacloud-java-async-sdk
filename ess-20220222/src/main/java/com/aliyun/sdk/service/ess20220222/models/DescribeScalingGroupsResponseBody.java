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
 * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScalingGroupsResponseBody</p>
 */
public class DescribeScalingGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingGroups")
    private java.util.List<ScalingGroups> scalingGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ScalingGroups> getScalingGroups() {
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
        private java.util.List<ScalingGroups> scalingGroups; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeScalingGroupsResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.scalingGroups = model.scalingGroups;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * <p>The scaling groups.</p>
         */
        public Builder scalingGroups(java.util.List<ScalingGroups> scalingGroups) {
            this.scalingGroups = scalingGroups;
            return this;
        }

        /**
         * <p>The total number of scaling groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeScalingGroupsResponseBody build() {
            return new DescribeScalingGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <p>The port number used by the ECS instance after Auto Scaling adds the ECS instance to the ALB server group.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The weight of the ECS instance as a backend server after Auto Scaling adds the ECS instance to the ALB server group.</p>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
     */
    public static class CapacityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompensateWithOnDemand")
        private Boolean compensateWithOnDemand;

        @com.aliyun.core.annotation.NameInMap("OnDemandBaseCapacity")
        private Integer onDemandBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("OnDemandPercentageAboveBaseCapacity")
        private Integer onDemandPercentageAboveBaseCapacity;

        @com.aliyun.core.annotation.NameInMap("PriceComparisonMode")
        private String priceComparisonMode;

        @com.aliyun.core.annotation.NameInMap("SpotAutoReplaceOnDemand")
        private Boolean spotAutoReplaceOnDemand;

        private CapacityOptions(Builder builder) {
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.priceComparisonMode = builder.priceComparisonMode;
            this.spotAutoReplaceOnDemand = builder.spotAutoReplaceOnDemand;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityOptions create() {
            return builder().build();
        }

        /**
         * @return compensateWithOnDemand
         */
        public Boolean getCompensateWithOnDemand() {
            return this.compensateWithOnDemand;
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
         * @return priceComparisonMode
         */
        public String getPriceComparisonMode() {
            return this.priceComparisonMode;
        }

        /**
         * @return spotAutoReplaceOnDemand
         */
        public Boolean getSpotAutoReplaceOnDemand() {
            return this.spotAutoReplaceOnDemand;
        }

        public static final class Builder {
            private Boolean compensateWithOnDemand; 
            private Integer onDemandBaseCapacity; 
            private Integer onDemandPercentageAboveBaseCapacity; 
            private String priceComparisonMode; 
            private Boolean spotAutoReplaceOnDemand; 

            private Builder() {
            } 

            private Builder(CapacityOptions model) {
                this.compensateWithOnDemand = model.compensateWithOnDemand;
                this.onDemandBaseCapacity = model.onDemandBaseCapacity;
                this.onDemandPercentageAboveBaseCapacity = model.onDemandPercentageAboveBaseCapacity;
                this.priceComparisonMode = model.priceComparisonMode;
                this.spotAutoReplaceOnDemand = model.spotAutoReplaceOnDemand;
            } 

            /**
             * <p>Specifies whether to automatically create pay-as-you-go instances to meet the required number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and sufficient spot instances cannot be created due to price or inventory reasons. Valid values:</p>
             * <ul>
             * <li>true: Allowed.</li>
             * <li>false: Not allowed.</li>
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
             * <p>The minimum number of pay-as-you-go instances required in the scaling group. If the number of pay-as-you-go instances in the scaling group is less than this value, the system preferentially creates pay-as-you-go instances. Valid values: 0 to 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * <p>The percentage of pay-as-you-go instances among the excess instances after the scaling group meets the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The price comparison mode of the cost optimization strategy for the scaling group. Valid values:</p>
             * <ul>
             * <li><p>PricePerUnit: Compares prices based on the price per unit of capacity.</p>
             * <p>The capacity of an instance in the scaling group is equal to the weight set for the instance type. The default weight is 1, which means one ECS instance occupies one unit of capacity.</p>
             * </li>
             * <li><p>PricePerVCpu: Compares prices based on the price per vCPU.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PricePerUnit</p>
             */
            public Builder priceComparisonMode(String priceComparisonMode) {
                this.priceComparisonMode = priceComparisonMode;
                return this;
            }

            /**
             * <p>Specifies whether to use spot instances to replace pay-as-you-go capacity when CompensateWithOnDemand is enabled and the percentage of pay-as-you-go instances exceeds the value of OnDemandPercentageAboveBaseCapacity. In common scenarios where CompensateWithOnDemand downgrades spot instances to pay-as-you-go instances due to spot inventory or price reasons, this feature attempts to use spot instances to replace the excess pay-as-you-go capacity to avoid long-term retention of pay-as-you-go instances. Valid values:</p>
             * <ul>
             * <li>true: Allowed.</li>
             * <li>false: Not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder spotAutoReplaceOnDemand(Boolean spotAutoReplaceOnDemand) {
                this.spotAutoReplaceOnDemand = spotAutoReplaceOnDemand;
                return this;
            }

            public CapacityOptions build() {
                return new CapacityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
     */
    public static class DBInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
        private java.util.List<String> securityGroupIds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DBInstances(Builder builder) {
            this.DBInstanceId = builder.DBInstanceId;
            this.securityGroupIds = builder.securityGroupIds;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstances create() {
            return builder().build();
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return securityGroupIds
         */
        public java.util.List<String> getSecurityGroupIds() {
            return this.securityGroupIds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String DBInstanceId; 
            private java.util.List<String> securityGroupIds; 
            private String type; 

            private Builder() {
            } 

            private Builder(DBInstances model) {
                this.DBInstanceId = model.DBInstanceId;
                this.securityGroupIds = model.securityGroupIds;
                this.type = model.type;
            } 

            /**
             * <p>The database instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-m5eqju85s45mu0***</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The list of security group whitelists added to the database by the scaling group.</p>
             */
            public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
                this.securityGroupIds = securityGroupIds;
                return this;
            }

            /**
             * <p>The type of the database. Valid values:</p>
             * <ul>
             * <li>RDS</li>
             * <li>Redis</li>
             * <li>MongoDB</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DBInstances build() {
                return new DBInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <p>The maximum hourly price for the instance type specified in the launch template override (namely LaunchTemplateOverride.InstanceType).</p>
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
             * <p>The weight of the specified instance type, which indicates the capacity of a single instance of this type in the scaling group. A higher weight indicates that fewer instances of this type are required to meet the expected capacity.</p>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <p>The ID of the Classic Load Balancer (CLB) instance for load balancing.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-2zep8alpq5zq1a2xwyxxx</p>
             */
            public Builder loadBalancerId(String loadBalancerId) {
                this.loadBalancerId = loadBalancerId;
                return this;
            }

            /**
             * <p>The weight of the ECS instance as a backend server after Auto Scaling adds the ECS instance to the SLB server group. A higher weight indicates that more access requests are distributed to the ECS instance. If the weight is 0, the ECS instance does not receive access requests. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <p>The port number used by the ECS instance after Auto Scaling adds the ECS instance to the server group.</p>
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
             * <p>The weight of the ECS instance as a backend server after Auto Scaling adds the ECS instance to the server group.</p>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <p>Specifies whether the tag is propagated. Valid values:</p>
             * <ul>
             * <li>true: Tags on the scaling group are propagated only to newly created instances, but not to existing instances in the scaling group.</li>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <p>The port number used by the load balancing instance to provide services.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The attributes of the backend server group.</p>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <p>The ID of the load balancing instance to which the backend server group belongs.</p>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
     */
    public static class WarmPoolConfigurationCapacityOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DesiredGroupPreparedCapacity")
        private Integer desiredGroupPreparedCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
        private Integer minCapacity;

        private WarmPoolConfigurationCapacityOptions(Builder builder) {
            this.desiredGroupPreparedCapacity = builder.desiredGroupPreparedCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmPoolConfigurationCapacityOptions create() {
            return builder().build();
        }

        /**
         * @return desiredGroupPreparedCapacity
         */
        public Integer getDesiredGroupPreparedCapacity() {
            return this.desiredGroupPreparedCapacity;
        }

        /**
         * @return minCapacity
         */
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Integer desiredGroupPreparedCapacity; 
            private Integer minCapacity; 

            private Builder() {
            } 

            private Builder(WarmPoolConfigurationCapacityOptions model) {
                this.desiredGroupPreparedCapacity = model.desiredGroupPreparedCapacity;
                this.minCapacity = model.minCapacity;
            } 

            /**
             * <p>The expected number of pre-warmed instances to cover. The system maintains the sum of the current number of instances in the scaling group and the number of instances in the warm pool at this value.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder desiredGroupPreparedCapacity(Integer desiredGroupPreparedCapacity) {
                this.desiredGroupPreparedCapacity = desiredGroupPreparedCapacity;
                return this;
            }

            /**
             * <p>The minimum number of instances in the warm pool. The system always retains no less than this number of pre-warmed instances in the warm pool to ensure rapid scale-out from the warm pool at any time.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minCapacity(Integer minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public WarmPoolConfigurationCapacityOptions build() {
                return new WarmPoolConfigurationCapacityOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
     */
    public static class InstanceReusePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReuseOnScaleIn")
        private Boolean reuseOnScaleIn;

        private InstanceReusePolicy(Builder builder) {
            this.reuseOnScaleIn = builder.reuseOnScaleIn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceReusePolicy create() {
            return builder().build();
        }

        /**
         * @return reuseOnScaleIn
         */
        public Boolean getReuseOnScaleIn() {
            return this.reuseOnScaleIn;
        }

        public static final class Builder {
            private Boolean reuseOnScaleIn; 

            private Builder() {
            } 

            private Builder(InstanceReusePolicy model) {
                this.reuseOnScaleIn = model.reuseOnScaleIn;
            } 

            /**
             * <p>Specifies whether instances are returned to the warm pool when the scaling group scales in.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder reuseOnScaleIn(Boolean reuseOnScaleIn) {
                this.reuseOnScaleIn = reuseOnScaleIn;
                return this;
            }

            public InstanceReusePolicy build() {
                return new InstanceReusePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
     */
    public static class WarmPoolConfiguration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityOptions")
        private WarmPoolConfigurationCapacityOptions capacityOptions;

        @com.aliyun.core.annotation.NameInMap("InstanceReusePolicy")
        private InstanceReusePolicy instanceReusePolicy;

        @com.aliyun.core.annotation.NameInMap("PoolState")
        private String poolState;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private WarmPoolConfiguration(Builder builder) {
            this.capacityOptions = builder.capacityOptions;
            this.instanceReusePolicy = builder.instanceReusePolicy;
            this.poolState = builder.poolState;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarmPoolConfiguration create() {
            return builder().build();
        }

        /**
         * @return capacityOptions
         */
        public WarmPoolConfigurationCapacityOptions getCapacityOptions() {
            return this.capacityOptions;
        }

        /**
         * @return instanceReusePolicy
         */
        public InstanceReusePolicy getInstanceReusePolicy() {
            return this.instanceReusePolicy;
        }

        /**
         * @return poolState
         */
        public String getPoolState() {
            return this.poolState;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private WarmPoolConfigurationCapacityOptions capacityOptions; 
            private InstanceReusePolicy instanceReusePolicy; 
            private String poolState; 
            private String status; 

            private Builder() {
            } 

            private Builder(WarmPoolConfiguration model) {
                this.capacityOptions = model.capacityOptions;
                this.instanceReusePolicy = model.instanceReusePolicy;
                this.poolState = model.poolState;
                this.status = model.status;
            } 

            /**
             * <p>The capacity configuration of the warm pool.</p>
             */
            public Builder capacityOptions(WarmPoolConfigurationCapacityOptions capacityOptions) {
                this.capacityOptions = capacityOptions;
                return this;
            }

            /**
             * <p>The instance reuse policy.</p>
             */
            public Builder instanceReusePolicy(InstanceReusePolicy instanceReusePolicy) {
                this.instanceReusePolicy = instanceReusePolicy;
                return this;
            }

            /**
             * <p>The state of instances in the warm pool. Valid values:</p>
             * <ul>
             * <li><p>Running: The instances are in the running state. Scale-out is faster, but you are charged for the full cost of the instances.</p>
             * </li>
             * <li><p>Stopped: The instances are in the economical mode. You are charged only for resources such as cloud disks, elastic IP addresses (EIPs), and snapshots of the instances. However, instance startup may fail during scale-out due to insufficient inventory.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder poolState(String poolState) {
                this.poolState = poolState;
                return this;
            }

            /**
             * <p>The status of the warm pool. Valid values:</p>
             * <ul>
             * <li><p>Active: Active.</p>
             * </li>
             * <li><p>Deleting: Deleting.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public WarmPoolConfiguration build() {
                return new WarmPoolConfiguration(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
             * <li>ReplaceUnhealthy: Unhealthy instances in all zones are replaced normally.</li>
             * <li>IgnoreUnhealthy: Unhealthy instances in impaired zones are not replaced. Healthy zones are not affected.</li>
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
             * <p>Blocks scale-in triggered by specified types of scaling rules. The blocking scope covers all zones under the scaling group, not just the impaired zones. This prevents false scale-in caused by seemingly improved monitoring metrics due to unreachable instances in impaired zones. Valid values: </p>
             * <ul>
             * <li>StepScalingRule: Blocks scale-in triggered by step scaling rules. </li>
             * <li>TargetTrackingScalingRule: Blocks scale-in triggered by target tracking scaling rules. </li>
             * <li>None: No blocking.</li>
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
             * <p>Specifies whether scale-out creates instances only in healthy zones during the shift. Valid values: </p>
             * <ul>
             * <li>true: Scale-out creates instances only in healthy zones and skips impaired zones. </li>
             * <li>false: Scale-out is not restricted by zone and can create instances in any zone under the scaling group.</li>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
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
     * {@link DescribeScalingGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScalingGroupsResponseBody</p>
     */
    public static class ScalingGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveCapacity")
        private Integer activeCapacity;

        @com.aliyun.core.annotation.NameInMap("ActiveScalingConfigurationId")
        private String activeScalingConfigurationId;

        @com.aliyun.core.annotation.NameInMap("AlbServerGroups")
        private java.util.List<AlbServerGroups> albServerGroups;

        @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @com.aliyun.core.annotation.NameInMap("AutoRebalance")
        private Boolean autoRebalance;

        @com.aliyun.core.annotation.NameInMap("AzBalance")
        private Boolean azBalance;

        @com.aliyun.core.annotation.NameInMap("BalanceMode")
        private String balanceMode;

        @com.aliyun.core.annotation.NameInMap("CapacityOptions")
        private CapacityOptions capacityOptions;

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

        @com.aliyun.core.annotation.NameInMap("DBInstances")
        private java.util.List<DBInstances> DBInstances;

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

        @com.aliyun.core.annotation.NameInMap("SpotCapacity")
        private Integer spotCapacity;

        @com.aliyun.core.annotation.NameInMap("SpotInstancePools")
        private Integer spotInstancePools;

        @com.aliyun.core.annotation.NameInMap("SpotInstanceRemedy")
        private Boolean spotInstanceRemedy;

        @com.aliyun.core.annotation.NameInMap("StandbyCapacity")
        private Integer standbyCapacity;

        @com.aliyun.core.annotation.NameInMap("StopInstanceTimeout")
        private Integer stopInstanceTimeout;

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

        @com.aliyun.core.annotation.NameInMap("WarmPoolCapacity")
        private Integer warmPoolCapacity;

        @com.aliyun.core.annotation.NameInMap("WarmPoolConfiguration")
        private WarmPoolConfiguration warmPoolConfiguration;

        @com.aliyun.core.annotation.NameInMap("ZoneShiftOptions")
        private ZoneShiftOptions zoneShiftOptions;

        private ScalingGroups(Builder builder) {
            this.activeCapacity = builder.activeCapacity;
            this.activeScalingConfigurationId = builder.activeScalingConfigurationId;
            this.albServerGroups = builder.albServerGroups;
            this.allocationStrategy = builder.allocationStrategy;
            this.autoRebalance = builder.autoRebalance;
            this.azBalance = builder.azBalance;
            this.balanceMode = builder.balanceMode;
            this.capacityOptions = builder.capacityOptions;
            this.compensateWithOnDemand = builder.compensateWithOnDemand;
            this.creationTime = builder.creationTime;
            this.currentHostName = builder.currentHostName;
            this.customPolicyARN = builder.customPolicyARN;
            this.DBInstanceIds = builder.DBInstanceIds;
            this.DBInstances = builder.DBInstances;
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
            this.spotCapacity = builder.spotCapacity;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
            this.standbyCapacity = builder.standbyCapacity;
            this.stopInstanceTimeout = builder.stopInstanceTimeout;
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
            this.warmPoolCapacity = builder.warmPoolCapacity;
            this.warmPoolConfiguration = builder.warmPoolConfiguration;
            this.zoneShiftOptions = builder.zoneShiftOptions;
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
         * @return autoRebalance
         */
        public Boolean getAutoRebalance() {
            return this.autoRebalance;
        }

        /**
         * @return azBalance
         */
        public Boolean getAzBalance() {
            return this.azBalance;
        }

        /**
         * @return balanceMode
         */
        public String getBalanceMode() {
            return this.balanceMode;
        }

        /**
         * @return capacityOptions
         */
        public CapacityOptions getCapacityOptions() {
            return this.capacityOptions;
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
         * @return DBInstances
         */
        public java.util.List<DBInstances> getDBInstances() {
            return this.DBInstances;
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
         * @return spotCapacity
         */
        public Integer getSpotCapacity() {
            return this.spotCapacity;
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
         * @return stopInstanceTimeout
         */
        public Integer getStopInstanceTimeout() {
            return this.stopInstanceTimeout;
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
         * @return warmPoolCapacity
         */
        public Integer getWarmPoolCapacity() {
            return this.warmPoolCapacity;
        }

        /**
         * @return warmPoolConfiguration
         */
        public WarmPoolConfiguration getWarmPoolConfiguration() {
            return this.warmPoolConfiguration;
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
            private Boolean autoRebalance; 
            private Boolean azBalance; 
            private String balanceMode; 
            private CapacityOptions capacityOptions; 
            private Boolean compensateWithOnDemand; 
            private String creationTime; 
            private String currentHostName; 
            private String customPolicyARN; 
            private java.util.List<String> DBInstanceIds; 
            private java.util.List<DBInstances> DBInstances; 
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
            private Integer spotCapacity; 
            private Integer spotInstancePools; 
            private Boolean spotInstanceRemedy; 
            private Integer standbyCapacity; 
            private Integer stopInstanceTimeout; 
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
            private Integer warmPoolCapacity; 
            private WarmPoolConfiguration warmPoolConfiguration; 
            private ZoneShiftOptions zoneShiftOptions; 

            private Builder() {
            } 

            private Builder(ScalingGroups model) {
                this.activeCapacity = model.activeCapacity;
                this.activeScalingConfigurationId = model.activeScalingConfigurationId;
                this.albServerGroups = model.albServerGroups;
                this.allocationStrategy = model.allocationStrategy;
                this.autoRebalance = model.autoRebalance;
                this.azBalance = model.azBalance;
                this.balanceMode = model.balanceMode;
                this.capacityOptions = model.capacityOptions;
                this.compensateWithOnDemand = model.compensateWithOnDemand;
                this.creationTime = model.creationTime;
                this.currentHostName = model.currentHostName;
                this.customPolicyARN = model.customPolicyARN;
                this.DBInstanceIds = model.DBInstanceIds;
                this.DBInstances = model.DBInstances;
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
                this.spotCapacity = model.spotCapacity;
                this.spotInstancePools = model.spotInstancePools;
                this.spotInstanceRemedy = model.spotInstanceRemedy;
                this.standbyCapacity = model.standbyCapacity;
                this.stopInstanceTimeout = model.stopInstanceTimeout;
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
                this.warmPoolCapacity = model.warmPoolCapacity;
                this.warmPoolConfiguration = model.warmPoolConfiguration;
                this.zoneShiftOptions = model.zoneShiftOptions;
            } 

            /**
             * <p>The number of ECS instances that have been added to the scaling group and are running normally.</p>
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
             * <p>The collection of information about Application Load Balancer (ALB) server groups.</p>
             */
            public Builder albServerGroups(java.util.List<AlbServerGroups> albServerGroups) {
                this.albServerGroups = albServerGroups;
                return this;
            }

            /**
             * <p>The capacity allocation strategy, which determines how the scaling group selects available instance types to meet the capacity requirements. The capacity distribution strategy applies to both pay-as-you-go and spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
             * <ul>
             * <li>priority: Creates instances based on the order of the configured instance types.</li>
             * <li>lowestPrice: Creates instances based on the unit vCPU price of the instance types in ascending order.</li>
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
             * <p>Specifies whether to enable automatic balancing for the scaling group. This parameter takes effect only when BalancedOnly is enabled for the zone balance scaling group. Valid values:</p>
             * <ul>
             * <li>false: Automatic balancing for the scaling group is disabled.</li>
             * <li>true: Automatic balancing for the scaling group is enabled. The scaling group automatically detects the capacity across zones. If the capacity is unbalanced, the scaling group proactively scales in or out to rebalance the capacity across zones.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRebalance(Boolean autoRebalance) {
                this.autoRebalance = autoRebalance;
                return this;
            }

            /**
             * <p>Specifies whether the capacity of the scaling group is evenly distributed across multiple zones. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
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
             * <p>The zone balance mode. This parameter takes effect only when the zone balance mode is enabled. Valid values:</p>
             * <ul>
             * <li><p>BalancedBestEffort: If resource creation fails in a zone, the system falls back to other zones to ensure best-effort delivery of resources.</p>
             * </li>
             * <li><p>BalancedOnly: If resource creation fails in a zone, the system does not fall back to other zones. The scale-out activity partially succeeds to avoid excessive imbalance of resources across different zones.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BalancedBestEffort</p>
             */
            public Builder balanceMode(String balanceMode) {
                this.balanceMode = balanceMode;
                return this;
            }

            /**
             * <p>The capacity options.</p>
             */
            public Builder capacityOptions(CapacityOptions capacityOptions) {
                this.capacityOptions = capacityOptions;
                return this;
            }

            /**
             * <p>Specifies whether to automatically create pay-as-you-go instances to meet the requirement for the number of ECS instances when the MultiAZPolicy parameter is set to COST_OPTIMIZED and spot instances cannot be created due to price or inventory issues. Valid values:</p>
             * <ul>
             * <li>true: Allowed.</li>
             * <li>false: Not allowed.</li>
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
             * <blockquote>
             * <p>This parameter is not available.</p>
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the Function Compute function for the custom scale-in policy. This parameter takes effect only when the first removal policy in RemovalPolicies is set to CustomPolicy.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:fc:cn-zhangjiakou:16145688****:services/ess_custom_terminate_policy.LATEST/functions/ess_custom_terminate_policy_name</p>
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
             * <p>The list of databases associated with the scaling group.</p>
             */
            public Builder DBInstances(java.util.List<DBInstances> DBInstances) {
                this.DBInstances = DBInstances;
                return this;
            }

            /**
             * <p>The default cooldown time of the scaling group. During the cooldown time, the scaling group does not execute any other scaling activity. This parameter takes effect only for a scaling activity triggered by <a href="https://help.aliyun.com/document_detail/35170.html">CloudMonitor</a> event-triggered tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder defaultCooldown(Integer defaultCooldown) {
                this.defaultCooldown = defaultCooldown;
                return this;
            }

            /**
             * <p>The expected number of ECS instances in the scaling group. The scaling group automatically maintains the number of ECS instances at the expected number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder desiredCapacity(Integer desiredCapacity) {
                this.desiredCapacity = desiredCapacity;
                return this;
            }

            /**
             * <p>Specifies whether the expected number of instances feature is enabled. Valid values:</p>
             * <ul>
             * <li>true: The expected number of instances feature is enabled.</li>
             * <li>false: The expected number of instances feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableDesiredCapacity(Boolean enableDesiredCapacity) {
                this.enableDesiredCapacity = enableDesiredCapacity;
                return this;
            }

            /**
             * <p>Indicates whether deletion protection is enabled for the scaling group. Valid values:</p>
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
             * <p>The type of instances managed by the scaling group.</p>
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
             * <li>ECS: Health checks are performed on instances in the scaling group. This value is used to enable instance health checks for both ECS and ECI scaling groups.</li>
             * <li>LOAD_BALANCER: The health status of instances is determined based on the health check results of load balancing (CLB load balancing is not supported).</li>
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
             * <li>LOAD_BALANCER: The health status of instances is determined based on the load balancing health check results (the CLB load balancing type is not currently supported).</li>
             * </ul>
             */
            public Builder healthCheckTypes(java.util.List<String> healthCheckTypes) {
                this.healthCheckTypes = healthCheckTypes;
                return this;
            }

            /**
             * <p>The number of instances in the initialization state before scale-out in the scaling group.</p>
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
             * <p>This parameter is not available.</p>
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
             * <p>The instance type information that extends the launch template.</p>
             */
            public Builder launchTemplateOverrides(java.util.List<LaunchTemplateOverrides> launchTemplateOverrides) {
                this.launchTemplateOverrides = launchTemplateOverrides;
                return this;
            }

            /**
             * <p>The version of the launch template used by the scaling group.</p>
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
             * <li>Inactive: The scaling group is inactive. Inactive scaling groups do not receive any requests to execute scaling rules.</li>
             * <li>Deleting: The scaling group is being deleted. Scaling groups in the deleting state do not receive any requests to execute scaling rules, and their parameters cannot be modified.</li>
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
             * <p>The list of IDs of the load balancing instances associated with the scaling group.</p>
             */
            public Builder loadBalancerIds(java.util.List<String> loadBalancerIds) {
                this.loadBalancerIds = loadBalancerIds;
                return this;
            }

            /**
             * <p>The maximum lifetime of an instance in the scaling group. Unit: seconds.</p>
             * <p>Valid values: 0 or [86400, Integer.maxValue]. A value of 0 indicates that the configured value of MaxInstanceLifetime is cleared, which means MaxInstanceLifetime is not configured.</p>
             * <p>Default value: null.</p>
             * <blockquote>
             * <p>This parameter is not supported for scaling groups of the Elastic Container Instance (ECI) type or scaling groups that have the No Fees for Stopped Instances feature enabled.</p>
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
             * <p>The maximum number of ECS instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder maxSize(Integer maxSize) {
                this.maxSize = maxSize;
                return this;
            }

            /**
             * <p>The minimum number of ECS instances in the scaling group.</p>
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
             * <li>PRIORITY: Scales out and scales in instances based on the vSwitches defined in VSwitchIds. If ECS instances cannot be created in the active zone of the vSwitch with the highest priority, the system automatically uses the vSwitch with the next highest priority to create ECS instances.</li>
             * <li>COST_OPTIMIZED: Attempts to create instances based on the unit price of vCPUs from low to high. When the scaling configuration specifies multiple instance types with the spot billing method, the system preferentially creates spot instances. You can use the CompensateWithOnDemand parameter to specify whether to automatically attempt to create pay-as-you-go instances when spot instances cannot be created due to inventory issues.<blockquote>
             * <p>COST_OPTIMIZED takes effect only when the scaling configuration specifies multiple instance types or uses spot instances.</p>
             * </blockquote>
             * </li>
             * <li>BALANCE: Evenly allocates ECS instances across the active zones specified for the scaling group. If the distribution becomes unbalanced due to insufficient inventory, you can call the RebalanceInstance operation to balance the resources.</li>
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
             * <p>The percentage of pay-as-you-go instances to be created when the scaling group exceeds the minimum number of pay-as-you-go instances specified by OnDemandBaseCapacity. Valid values: 0 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are being added to the scaling group but have not completed the related configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pendingCapacity(Integer pendingCapacity) {
                this.pendingCapacity = pendingCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are in the pending wait state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pendingWaitCapacity(Integer pendingWaitCapacity) {
                this.pendingWaitCapacity = pendingWaitCapacity;
                return this;
            }

            /**
             * <p>The number of ECS instances that are in the protected state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder protectedCapacity(Integer protectedCapacity) {
                this.protectedCapacity = protectedCapacity;
                return this;
            }

            /**
             * <p>The ID of the region to which the scaling group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-qingdao</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The collection of policies for removing ECS instances from the scaling group. Valid values:</p>
             * <ul>
             * <li>OldestInstance: Removes the ECS instance that was created earliest.</li>
             * <li>NewestInstance: Removes the ECS instance that was created latest.</li>
             * <li>OldestScalingConfiguration: Removes the ECS instance that was created earliest based on the scaling configuration.</li>
             * </ul>
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
             * <p>The number of ECS instances that are in the removing wait state in the scaling group.</p>
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
             * 
             * <strong>example:</strong>
             * <p>rg-123****</p>
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
             * <p>The name of the scaling group.</p>
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
             * <li>recycle: The scaling group uses the shutdown and reclaim mode.</li>
             * <li>release: The scaling group uses the release mode.</li>
             * <li>forcerelease: The scaling group uses the force release mode.
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
             * <p>The collection of information about load balancing server groups.</p>
             * <blockquote>
             * <p>You can use this parameter to obtain the collection of information about ALB service groups, NLB server groups, and GWLB service groups associated with the scaling group.</p>
             * </blockquote>
             */
            public Builder serverGroups(java.util.List<ServerGroups> serverGroups) {
                this.serverGroups = serverGroups;
                return this;
            }

            /**
             * <p>The spot capacity distribution strategy. You can use this parameter to separately specify the distribution strategy for spot capacity. This parameter takes effect only when the MultiAZPolicy parameter is set to COMPOSABLE. Valid values:</p>
             * <ul>
             * <li>priority: Creates instances based on the order of the configured instance types.</li>
             * <li>lowestPrice: Creates instances based on the unit vCPU price of the instance types in ascending order.</li>
             * </ul>
             * <p>Default value: priority.</p>
             * 
             * <strong>example:</strong>
             * <p>lowestPrice</p>
             */
            public Builder spotAllocationStrategy(String spotAllocationStrategy) {
                this.spotAllocationStrategy = spotAllocationStrategy;
                return this;
            }

            /**
             * <p>The number of spot instances in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder spotCapacity(Integer spotCapacity) {
                this.spotCapacity = spotCapacity;
                return this;
            }

            /**
             * <p>The number of available instance types specified. The scaling group evenly creates spot instances based on the most cost-effective instance types. Valid values: 0 to 10.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder spotInstancePools(Integer spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * <p>Indicates whether the spot instance replacement feature is enabled. After this feature is enabled, when the scaling group receives a system message indicating that a spot instance will be reclaimed, the scaling group attempts to create a new instance to replace the spot instance to be reclaimed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            /**
             * <p>The number of instances that are in the standby state in the scaling group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standbyCapacity(Integer standbyCapacity) {
                this.standbyCapacity = standbyCapacity;
                return this;
            }

            /**
             * <p>The timeout period for waiting for an ECS instance to be stopped during the scale-in process. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder stopInstanceTimeout(Integer stopInstanceTimeout) {
                this.stopInstanceTimeout = stopInstanceTimeout;
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
             * <p>Indicates whether Auto Scaling stops executing any scaling activity in the scaling group. Valid values:</p>
             * <ul>
             * <li>true: Auto Scaling stops executing any scaling activity in the scaling group. This indicates that the scaling group has failed to execute scale-out or scale-in for more than seven consecutive days. You must modify the scaling group or scaling configuration to resume the execution of the scaling activity.</li>
             * <li>false: Auto Scaling executes the scaling activity in the scaling group.</li>
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
             * <p>The total weighted capacity of all ECS instances in the scaling group if instance type weights are configured. Otherwise, this parameter indicates the total number of ECS instances in the scaling group.</p>
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
             * <p>The collection of IDs of the vSwitches associated with the scaling group. If you use the VSwitchIds parameter, the VSwitchId parameter is ignored.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The ID of the VPC to which the scaling group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1vwnn14rqpyiczj****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The number of instances in the warm pool.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder warmPoolCapacity(Integer warmPoolCapacity) {
                this.warmPoolCapacity = warmPoolCapacity;
                return this;
            }

            /**
             * <p>The current warm pool configuration of the scaling group.</p>
             */
            public Builder warmPoolConfiguration(WarmPoolConfiguration warmPoolConfiguration) {
                this.warmPoolConfiguration = warmPoolConfiguration;
                return this;
            }

            /**
             * <p>The zone shift options.</p>
             */
            public Builder zoneShiftOptions(ZoneShiftOptions zoneShiftOptions) {
                this.zoneShiftOptions = zoneShiftOptions;
                return this;
            }

            public ScalingGroups build() {
                return new ScalingGroups(this);
            } 

        } 

    }
}
