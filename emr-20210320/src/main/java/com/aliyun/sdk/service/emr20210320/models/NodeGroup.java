// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link NodeGroup} extends {@link TeaModel}
 *
 * <p>NodeGroup</p>
 */
public class NodeGroup extends TeaModel {
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

    @NameInMap("NodeGroupId")
    private String nodeGroupId;

    @NameInMap("NodeGroupName")
    private String nodeGroupName;

    @NameInMap("NodeGroupState")
    private String nodeGroupState;

    @NameInMap("NodeGroupType")
    private String nodeGroupType;

    @NameInMap("NodeResizeStrategy")
    private String nodeResizeStrategy;

    @NameInMap("PaymentType")
    private String paymentType;

    @NameInMap("RunningNodeCount")
    private Integer runningNodeCount;

    @NameInMap("SpotBidPrices")
    private java.util.List < SpotBidPrice > spotBidPrices;

    @NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @NameInMap("StateChangeReason")
    private NodeGroupStateChangeReason stateChangeReason;

    @NameInMap("Status")
    private String status;

    @NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    @NameInMap("WithPublicIp")
    private Boolean withPublicIp;

    @NameInMap("ZoneId")
    private String zoneId;

    private NodeGroup(Builder builder) {
        this.additionalSecurityGroupIds = builder.additionalSecurityGroupIds;
        this.costOptimizedConfig = builder.costOptimizedConfig;
        this.dataDisks = builder.dataDisks;
        this.deploymentSetStrategy = builder.deploymentSetStrategy;
        this.gracefulShutdown = builder.gracefulShutdown;
        this.instanceTypes = builder.instanceTypes;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeGroupState = builder.nodeGroupState;
        this.nodeGroupType = builder.nodeGroupType;
        this.nodeResizeStrategy = builder.nodeResizeStrategy;
        this.paymentType = builder.paymentType;
        this.runningNodeCount = builder.runningNodeCount;
        this.spotBidPrices = builder.spotBidPrices;
        this.spotInstanceRemedy = builder.spotInstanceRemedy;
        this.spotStrategy = builder.spotStrategy;
        this.stateChangeReason = builder.stateChangeReason;
        this.status = builder.status;
        this.systemDisk = builder.systemDisk;
        this.vSwitchIds = builder.vSwitchIds;
        this.withPublicIp = builder.withPublicIp;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static NodeGroup create() {
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
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return nodeGroupState
     */
    public String getNodeGroupState() {
        return this.nodeGroupState;
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
     * @return runningNodeCount
     */
    public Integer getRunningNodeCount() {
        return this.runningNodeCount;
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
     * @return stateChangeReason
     */
    public NodeGroupStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private java.util.List < String > additionalSecurityGroupIds; 
        private CostOptimizedConfig costOptimizedConfig; 
        private java.util.List < DataDisk > dataDisks; 
        private String deploymentSetStrategy; 
        private Boolean gracefulShutdown; 
        private java.util.List < String > instanceTypes; 
        private String nodeGroupId; 
        private String nodeGroupName; 
        private String nodeGroupState; 
        private String nodeGroupType; 
        private String nodeResizeStrategy; 
        private String paymentType; 
        private Integer runningNodeCount; 
        private java.util.List < SpotBidPrice > spotBidPrices; 
        private Boolean spotInstanceRemedy; 
        private String spotStrategy; 
        private NodeGroupStateChangeReason stateChangeReason; 
        private String status; 
        private SystemDisk systemDisk; 
        private java.util.List < String > vSwitchIds; 
        private Boolean withPublicIp; 
        private String zoneId; 

        /**
         * 安全组ID。
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
         * 数据盘列表。
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
         */
        public Builder gracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }

        /**
         * 实例类型列表。
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * 节点组ID。
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * 节点组名称。最大长度128个字符。
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * 节点组状态。
         */
        public Builder nodeGroupState(String nodeGroupState) {
            this.nodeGroupState = nodeGroupState;
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
         * - COST_OPTIMIZED：成本优化策略。
         * <p>
         * - PRIORITY：优先级策略。
         */
        public Builder nodeResizeStrategy(String nodeResizeStrategy) {
            this.nodeResizeStrategy = nodeResizeStrategy;
            return this;
        }

        /**
         * 节点组付费类型。取值范围：
         * <p>
         * - PayAsYouGo：后付费，按量付费。
         * - Subscription：预付费，包年包月。
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * 存活节点数量。
         */
        public Builder runningNodeCount(Integer runningNodeCount) {
            this.runningNodeCount = runningNodeCount;
            return this;
        }

        /**
         * SpotBidPrices.
         */
        public Builder spotBidPrices(java.util.List < SpotBidPrice > spotBidPrices) {
            this.spotBidPrices = spotBidPrices;
            return this;
        }

        /**
         * 开启补齐抢占式实例后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。取值范围：
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
         * 是否支持竞价实例。
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * 状态变化原因。
         */
        public Builder stateChangeReason(NodeGroupStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }

        /**
         * 节点组状态，NodeGroupState别名。
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * 系统盘信息。
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * 虚拟机交换机ID列表。
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
         */
        public Builder withPublicIp(Boolean withPublicIp) {
            this.withPublicIp = withPublicIp;
            return this;
        }

        /**
         * 可用区ID。
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public NodeGroup build() {
            return new NodeGroup(this);
        } 

    } 

}
