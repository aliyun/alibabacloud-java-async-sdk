// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeGroupConfig} extends {@link TeaModel}
 *
 * <p>NodeGroupConfig</p>
 */
public class NodeGroupConfig extends TeaModel {
    @NameInMap("AdditionalSecurityGroupIds")
    private java.util.List < String > additionalSecurityGroupIds;

    @NameInMap("CostOptimizedConfig")
    private CostOptimizedConfig costOptimizedConfig;

    @NameInMap("DataDisks")
    private java.util.List < DataDisk > dataDisks;

    @NameInMap("DeploymentSetStrategy")
    private String deploymentSetStrategy;

    @NameInMap("GracefulShutdown")
    private Boolean gracefulShutdown;

    @NameInMap("InstanceTypes")
    private java.util.List < String > instanceTypes;

    @NameInMap("NodeCount")
    private Integer nodeCount;

    @NameInMap("NodeGroupName")
    private String nodeGroupName;

    @NameInMap("NodeGroupType")
    @Validation(required = true)
    private String nodeGroupType;

    @NameInMap("NodeResizeStrategy")
    private String nodeResizeStrategy;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("SpotBidPrices")
    private java.util.List < SpotBidPrice > spotBidPrices;

    @NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @NameInMap("SubscriptionConfig")
    private SubscriptionConfig subscriptionConfig;

    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    @NameInMap("WithPublicIp")
    private Boolean withPublicIp;

    private NodeGroupConfig(Builder builder) {
        this.additionalSecurityGroupIds = builder.additionalSecurityGroupIds;
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
         * 附加安全组。除集群设置的安全组外，为节点组单独设置的附加安全组。数组元数个数N的取值范围：0~2。
         */
        public Builder additionalSecurityGroupIds(java.util.List < String > additionalSecurityGroupIds) {
            this.additionalSecurityGroupIds = additionalSecurityGroupIds;
            return this;
        }

        /**
         * 成本优化模式配置。
         */
        public Builder costOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
            this.costOptimizedConfig = costOptimizedConfig;
            return this;
        }

        /**
         * 数据盘。当前数据盘只支持一种磁盘类型，即数组元数个数N的取值范围：1~1。
         */
        public Builder dataDisks(java.util.List < DataDisk > dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }

        /**
         * 部署集策略。取值范围：
         * <p>
         * - NONE：不适用部署集。
         * - CLUSTER：使用集群级别部署集。
         * - NODE_GROUP：使用节点组级别部署集。
         * 
         * 默认值：NONE。
         */
        public Builder deploymentSetStrategy(String deploymentSetStrategy) {
            this.deploymentSetStrategy = deploymentSetStrategy;
            return this;
        }

        /**
         * 节点组上部署的组件是否开启优雅下线。取值范围：
         * <p>
         * - true：开启优雅下线。
         * - false：不开启优雅下线。
         * 
         * 默认值：false。
         */
        public Builder gracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }

        /**
         * 节点实例类型列表。数组元数个数N的取值范围：1~100。
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * 节点数量。取值范围：1~1000。
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * 节点组名称。最大长度128个字符。集群内要求节点组名称唯一。
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * 节点组类型。取值范围：
         * <p>
         * - MASTER：管理类型节点组。
         * - CORE：存储类型节点组。
         * - TASK：计算类型节点组。
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * 节点扩容策略。取值范围：
         * <p>
         * - COST_OPTIMIZED：成本优化策略。
         * - PRIORITY：优先级策略。
         * 
         * 默认值：PRIORITY。
         */
        public Builder nodeResizeStrategy(String nodeResizeStrategy) {
            this.nodeResizeStrategy = nodeResizeStrategy;
            return this;
        }

        /**
         * 节点组付费类型。不传入时默认和集群付费类型一致。取值范围：
         * <p>
         * - PayAsYouGo：后付费，按量付费。
         * - Subscription：预付费，包年包月。
         * 
         * 默认值：PayAsYouGo。
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 抢占式Spot实例出价价格。参数SpotStrategy取值为SpotWithPriceLimit时生效。数组元数个数N的取值范围：0~100。
         */
        public Builder spotBidPrices(java.util.List < SpotBidPrice > spotBidPrices) {
            this.spotBidPrices = spotBidPrices;
            return this;
        }

        /**
         * 开启后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。取值范围：
         * <p>
         * - true：开启补齐抢占式实例。
         * - false：不开启补齐抢占式实例。
         * 
         * 默认值：false。
         */
        public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }

        /**
         * 抢占式Spot实例策略。取值范围：
         * <p>
         * - NoSpot：正常按量付费实例。
         * - SpotWithPriceLimit：设置最高出价的抢占式实例。
         * - SpotAsPriceGo：系统自动出价，最高按量付费价格的抢占式实例。
         * 
         * 默认值：NoSpot。
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * 节点组预付费配置。不传入时默认和集群预付费配置一致。
         */
        public Builder subscriptionConfig(SubscriptionConfig subscriptionConfig) {
            this.subscriptionConfig = subscriptionConfig;
            return this;
        }

        /**
         * 系统盘。
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * 虚拟机交换机ID列表。数组元数个数N的取值范围：1~20。
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        /**
         * 是否开公网IP。取值范围：
         * <p>
         * - true：开公网。
         * - false：不开公网。
         * 
         * 默认值：false。
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
