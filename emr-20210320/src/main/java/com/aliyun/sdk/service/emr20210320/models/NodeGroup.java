// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link NodeGroup} extends {@link TeaModel}
 *
 * <p>NodeGroup</p>
 */
public class NodeGroup extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalSecurityGroupIds")
    private java.util.List < String > additionalSecurityGroupIds;

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

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("NodeGroupState")
    private String nodeGroupState;

    @com.aliyun.core.annotation.NameInMap("NodeGroupType")
    private String nodeGroupType;

    @com.aliyun.core.annotation.NameInMap("NodeResizeStrategy")
    private String nodeResizeStrategy;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @com.aliyun.core.annotation.NameInMap("RunningNodeCount")
    private Integer runningNodeCount;

    @com.aliyun.core.annotation.NameInMap("SpotBidPrices")
    private java.util.List < SpotBidPrice > spotBidPrices;

    @com.aliyun.core.annotation.NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @com.aliyun.core.annotation.NameInMap("SpotStrategy")
    private String spotStrategy;

    @com.aliyun.core.annotation.NameInMap("StateChangeReason")
    private NodeGroupStateChangeReason stateChangeReason;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SystemDisk")
    private SystemDisk systemDisk;

    @com.aliyun.core.annotation.NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

    @com.aliyun.core.annotation.NameInMap("WithPublicIp")
    private Boolean withPublicIp;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
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
        this.privatePoolOptions = builder.privatePoolOptions;
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
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
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
        private PrivatePoolOptions privatePoolOptions; 
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
         * <p>安全组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
         */
        public Builder additionalSecurityGroupIds(java.util.List < String > additionalSecurityGroupIds) {
            this.additionalSecurityGroupIds = additionalSecurityGroupIds;
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
         * <p>数据盘列表。</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder gracefulShutdown(Boolean gracefulShutdown) {
            this.gracefulShutdown = gracefulShutdown;
            return this;
        }

        /**
         * <p>实例类型列表。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;ecs.g6.4xlarge&quot;]</p>
         */
        public Builder instanceTypes(java.util.List < String > instanceTypes) {
            this.instanceTypes = instanceTypes;
            return this;
        }

        /**
         * <p>节点组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>节点组名称。最大长度128个字符。</p>
         * 
         * <strong>example:</strong>
         * <p>core-1</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>节点组状态。</p>
         * 
         * <strong>example:</strong>
         * <p>CREATED</p>
         */
        public Builder nodeGroupState(String nodeGroupState) {
            this.nodeGroupState = nodeGroupState;
            return this;
        }

        /**
         * <p>节点组类型。取值范围：</p>
         * <ul>
         * <li>MASTER：管理类型节点组。</li>
         * <li>CORE：存储类型节点组。</li>
         * <li>TASK：计算类型节点组。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CORE</p>
         */
        public Builder nodeGroupType(String nodeGroupType) {
            this.nodeGroupType = nodeGroupType;
            return this;
        }

        /**
         * <ul>
         * <li>COST_OPTIMIZED：成本优化策略。</li>
         * <li>PRIORITY：优先级策略。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        public Builder nodeResizeStrategy(String nodeResizeStrategy) {
            this.nodeResizeStrategy = nodeResizeStrategy;
            return this;
        }

        /**
         * <p>节点组付费类型。取值范围：</p>
         * <ul>
         * <li>PayAsYouGo：后付费，按量付费。</li>
         * <li>Subscription：预付费，包年包月。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * PrivatePoolOptions.
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * <p>存活节点数量。</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>开启补齐抢占式实例后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。取值范围：</p>
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
         * <p>是否支持竞价实例。</p>
         * 
         * <strong>example:</strong>
         * <p>NoSpot</p>
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * <p>状态变化原因。</p>
         */
        public Builder stateChangeReason(NodeGroupStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>系统盘信息。</p>
         */
        public Builder systemDisk(SystemDisk systemDisk) {
            this.systemDisk = systemDisk;
            return this;
        }

        /**
         * <p>虚拟机交换机ID列表。</p>
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
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder withPublicIp(Boolean withPublicIp) {
            this.withPublicIp = withPublicIp;
            return this;
        }

        /**
         * <p>可用区ID。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing-h</p>
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
