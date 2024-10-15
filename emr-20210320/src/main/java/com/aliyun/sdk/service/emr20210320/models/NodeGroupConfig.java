// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NodeGroupConfig} extends {@link TeaModel}
 *
 * <p>NodeGroupConfig</p>
 */
public class NodeGroupConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalSecurityGroupIds")
    private java.util.List < String > additionalSecurityGroupIds;

    @com.aliyun.core.annotation.NameInMap("AutoScalingPolicy")
    private AutoScalingPolicy autoScalingPolicy;

    @com.aliyun.core.annotation.NameInMap("ComponentTags")
    private java.util.List < String > componentTags;

    @com.aliyun.core.annotation.NameInMap("CostOptimizedConfig")
    private CostOptimizedConfig costOptimizedConfig;

    @com.aliyun.core.annotation.NameInMap("DataDisks")
    private java.util.List < DataDisk > dataDisks;

    @com.aliyun.core.annotation.NameInMap("DeploymentSetStrategy")
    private String deploymentSetStrategy;

    @com.aliyun.core.annotation.NameInMap("GracefulShutdown")
    private Boolean gracefulShutdown;

    @com.aliyun.core.annotation.NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("NodeGroupType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupType;

    @com.aliyun.core.annotation.NameInMap("NodeResizeStrategy")
    private String nodeResizeStrategy;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("SpotBidPrices")
    private java.util.List < SpotBidPrice > spotBidPrices;

    @com.aliyun.core.annotation.NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("WithPublicIp")
    private Boolean withPublicIp;

    private NodeGroupConfig(Builder builder) {
        this.additionalSecurityGroupIds = builder.additionalSecurityGroupIds;
        this.autoScalingPolicy = builder.autoScalingPolicy;
        this.componentTags = builder.componentTags;
        this.costOptimizedConfig = builder.costOptimizedConfig;
        this.dataDisks = builder.dataDisks;
        this.deploymentSetStrategy = builder.deploymentSetStrategy;
        this.gracefulShutdown = builder.gracefulShutdown;
        this.instanceTypes = builder.instanceTypes;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeGroupType = builder.nodeGroupType;
        this.nodeResizeStrategy = builder.nodeResizeStrategy;
        this.paymentType = builder.paymentType;
        this.spotBidPrices = builder.spotBidPrices;
        this.spotInstanceRemedy = builder.spotInstanceRemedy;
        this.spotStrategy = builder.spotStrategy;
        this.subscriptionConfig = builder.subscriptionConfig;
        this.systemDisk = builder.systemDisk;
        this.vSwitchIds = builder.vSwitchIds;
        this.withPublicIp = builder.withPublicIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeGroupConfig create() {
        return builder().build();
    }

    /**
     * @return additionalSecurityGroupIds
     */
    public java.util.List < String > getAdditionalSecurityGroupIds() {
        return this.additionalSecurityGroupIds;
    }

    /**
     * @return autoScalingPolicy
     */
    public AutoScalingPolicy getAutoScalingPolicy() {
        return this.autoScalingPolicy;
    }

    /**
     * @return componentTags
     */
    public java.util.List < String > getComponentTags() {
        return this.componentTags;
    }

    /**
     * @return costOptimizedConfig
     */
    public CostOptimizedConfig getCostOptimizedConfig() {
        return this.costOptimizedConfig;
    }

    /**
     * @return dataDisks
     */
    public java.util.List < DataDisk > getDataDisks() {
        return this.dataDisks;
    }

    /**
     * @return deploymentSetStrategy
     */
    public String getDeploymentSetStrategy() {
        return this.deploymentSetStrategy;
    }

    /**
     * @return gracefulShutdown
     */
    public Boolean getGracefulShutdown() {
        return this.gracefulShutdown;
    }

    /**
     * @return instanceTypes
     */
    public java.util.List < String > getInstanceTypes() {
        return this.instanceTypes;
    }

    /**
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return nodeGroupType
     */
    public String getNodeGroupType() {
        return this.nodeGroupType;
    }

    /**
     * @return nodeResizeStrategy
     */
    public String getNodeResizeStrategy() {
        return this.nodeResizeStrategy;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return spotBidPrices
     */
    public java.util.List < SpotBidPrice > getSpotBidPrices() {
        return this.spotBidPrices;
    }

    /**
     * @return spotInstanceRemedy
     */
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return subscriptionConfig
     */
    public SubscriptionConfig getSubscriptionConfig() {
        return this.subscriptionConfig;
    }

    /**
     * @return systemDisk
     */
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    /**
     * @return withPublicIp
     */
    public Boolean getWithPublicIp() {
        return this.withPublicIp;
    }

    public static final class Builder {
        private java.util.List < String > additionalSecurityGroupIds; 
        private AutoScalingPolicy autoScalingPolicy; 
        private java.util.List < String > componentTags; 
        private CostOptimizedConfig costOptimizedConfig; 
        private java.util.List < DataDisk > dataDisks; 
        private String deploymentSetStrategy; 
        private Boolean gracefulShutdown; 
        private java.util.List < String > instanceTypes; 
        private Integer nodeCount; 
        private String nodeGroupName; 
        private String nodeGroupType; 
        private String nodeResizeStrategy; 
        private String paymentType; 
        private java.util.List < SpotBidPrice > spotBidPrices; 
        private Boolean spotInstanceRemedy; 
        private String spotStrategy; 
        private SubscriptionConfig subscriptionConfig; 
        private SystemDisk systemDisk; 
        private java.util.List < String > vSwitchIds; 
        private Boolean withPublicIp; 

        /**
         * <p>附加安全组。除集群设置的安全组外，为节点组单独设置的附加安全组。数组元数个数N的取值范围：0~2。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
         */
        public Builder additionalSecurityGroupIds(java.util.List < String > additionalSecurityGroupIds) {
            this.additionalSecurityGroupIds = additionalSecurityGroupIds;
            return this;
        }

        /**
         * AutoScalingPolicy.
         */
        public Builder autoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
            this.autoScalingPolicy = autoScalingPolicy;
            return this;
        }

        /**
         * ComponentTags.
         */
        public Builder componentTags(java.util.List < String > componentTags) {
            this.componentTags = componentTags;
            return this;
        }

        /**
         * <p>成本优化模式配置。</p>
         */
        public Builder costOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
            this.costOptimizedConfig = costOptimizedConfig;
            return this;
        }

        /**
         * <p>数据盘。当前数据盘只支持一种磁盘类型，即数组元数个数N的取值范围：1~1。</p>
         */
        public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * <p>部署集策略。取值范围：</p>
         * <ul>
         * <li>NONE：不适用部署集。</li>
         * <li>CLUSTER：使用集群级别部署集。</li>
         * <li>NODE_GROUP：使用节点组级别部署集。</li>
         * </ul>
         * <p>默认值：NONE。</p>
         * 
         * <strong>example:</strong>
         * <p>NONE</p>
         */
        public Builder deploymentSetStrategy(String deploymentSetStrategy) {
            this.deploymentSetStrategy = deploymentSetStrategy;
            return this;
        }

        /**
         * <p>节点组上部署的组件是否开启优雅下线。取值范围：</p>
         * <ul>
         * <li>true：开启优雅下线。</li>
         * <li>false：不开启优雅下线。</li>
         * </ul>
         * <p>默认值：false。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder gracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }

        /**
         * <p>节点实例类型列表。数组元数个数N的取值范围：1~100。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs.g6.xlarge&quot;]</p>
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>节点数量。取值范围：1~1000。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>节点组名称。最大长度128个字符。集群内要求节点组名称唯一。</p>
         * 
         * <strong>example:</strong>
         * <p>core-1</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>节点组类型。取值范围：</p>
         * <ul>
         * <li>MASTER：管理类型节点组。</li>
         * <li>CORE：存储类型节点组。</li>
         * <li>TASK：计算类型节点组。</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CORE</p>
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * <p>节点扩容策略。取值范围：</p>
         * <ul>
         * <li>COST_OPTIMIZED：成本优化策略。</li>
         * <li>PRIORITY：优先级策略。</li>
         * </ul>
         * <p>默认值：PRIORITY。</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        public Builder nodeResizeStrategy(String nodeResizeStrategy) {
            this.nodeResizeStrategy = nodeResizeStrategy;
            return this;
        }

        /**
         * <p>节点组付费类型。不传入时默认和集群付费类型一致。取值范围：</p>
         * <ul>
         * <li>PayAsYouGo：后付费，按量付费。</li>
         * <li>Subscription：预付费，包年包月。</li>
         * </ul>
         * <p>默认值：PayAsYouGo。</p>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>抢占式Spot实例出价价格。参数SpotStrategy取值为SpotWithPriceLimit时生效。数组元数个数N的取值范围：0~100。</p>
         */
        public Builder spotBidPrices(java.util.List < SpotBidPrice > spotBidPrices) {
            this.spotBidPrices = spotBidPrices;
            return this;
        }

        /**
         * <p>开启后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。取值范围：</p>
         * <ul>
         * <li>true：开启补齐抢占式实例。</li>
         * <li>false：不开启补齐抢占式实例。</li>
         * </ul>
         * <p>默认值：false。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }

        /**
         * <p>抢占式Spot实例策略。取值范围：</p>
         * <ul>
         * <li>NoSpot：正常按量付费实例。</li>
         * <li>SpotWithPriceLimit：设置最高出价的抢占式实例。</li>
         * <li>SpotAsPriceGo：系统自动出价，最高按量付费价格的抢占式实例。</li>
         * </ul>
         * <p>默认值：NoSpot。</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>节点组预付费配置。不传入时默认和集群预付费配置一致。</p>
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * <p>系统盘。</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>虚拟机交换机ID列表。数组元数个数N的取值范围：1~20。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;vsw-hp35g7ya5ymw68mmg****&quot;]</p>
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * <p>是否开公网IP。取值范围：</p>
         * <ul>
         * <li>true：开公网。</li>
         * <li>false：不开公网。</li>
         * </ul>
         * <p>默认值：false。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withPublicIp(Boolean withPublicIp) {
            this.withPublicIp = withPublicIp;
            return this;
        }

        public NodeGroupConfig build() {
            return new NodeGroupConfig(this);
        } 

    } 

}
