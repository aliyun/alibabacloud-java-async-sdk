// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link UpdateNodeGroupAttributesRequest} extends {@link RequestModel}
 *
 * <p>UpdateNodeGroupAttributesRequest</p>
 */
public class UpdateNodeGroupAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AckConfig")
    private AckConfig ackConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AdditionalSecurityGroupIds")
    @Deprecated
    private java.util.List<String> additionalSecurityGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCompensateState")
    private Boolean autoCompensateState;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CostOptimizedConfig")
    private CostOptimizedConfig costOptimizedConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EcsSpotStrategy")
    private String ecsSpotStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableGracefulDecommission")
    private Boolean enableGracefulDecommission;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceTypeList")
    private java.util.List<String> instanceTypeList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyPairName")
    @Deprecated
    private String keyPairName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxSize")
    private Integer maxSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinSize")
    private Integer minSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Integer nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeResizeStrategy")
    private String nodeResizeStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotBidPrices")
    private java.util.List<SpotBidPrice> spotBidPrices;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SpotInstanceRemedy")
    private Boolean spotInstanceRemedy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VSwitchId")
    @Deprecated
    private String vSwitchId;

    private UpdateNodeGroupAttributesRequest(Builder builder) {
        super(builder);
        this.ackConfig = builder.ackConfig;
        this.additionalSecurityGroupIds = builder.additionalSecurityGroupIds;
        this.autoCompensateState = builder.autoCompensateState;
        this.clusterId = builder.clusterId;
        this.costOptimizedConfig = builder.costOptimizedConfig;
        this.description = builder.description;
        this.ecsSpotStrategy = builder.ecsSpotStrategy;
        this.enableGracefulDecommission = builder.enableGracefulDecommission;
        this.instanceTypeList = builder.instanceTypeList;
        this.keyPairName = builder.keyPairName;
        this.maxSize = builder.maxSize;
        this.minSize = builder.minSize;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.nodeResizeStrategy = builder.nodeResizeStrategy;
        this.regionId = builder.regionId;
        this.spotBidPrices = builder.spotBidPrices;
        this.spotInstanceRemedy = builder.spotInstanceRemedy;
        this.vSwitchId = builder.vSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNodeGroupAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ackConfig
     */
    public AckConfig getAckConfig() {
        return this.ackConfig;
    }

    /**
     * @return additionalSecurityGroupIds
     */
    public java.util.List<String> getAdditionalSecurityGroupIds() {
        return this.additionalSecurityGroupIds;
    }

    /**
     * @return autoCompensateState
     */
    public Boolean getAutoCompensateState() {
        return this.autoCompensateState;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return costOptimizedConfig
     */
    public CostOptimizedConfig getCostOptimizedConfig() {
        return this.costOptimizedConfig;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ecsSpotStrategy
     */
    public String getEcsSpotStrategy() {
        return this.ecsSpotStrategy;
    }

    /**
     * @return enableGracefulDecommission
     */
    public Boolean getEnableGracefulDecommission() {
        return this.enableGracefulDecommission;
    }

    /**
     * @return instanceTypeList
     */
    public java.util.List<String> getInstanceTypeList() {
        return this.instanceTypeList;
    }

    /**
     * @return keyPairName
     */
    public String getKeyPairName() {
        return this.keyPairName;
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
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return this.nodeCount;
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
     * @return nodeResizeStrategy
     */
    public String getNodeResizeStrategy() {
        return this.nodeResizeStrategy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spotBidPrices
     */
    public java.util.List<SpotBidPrice> getSpotBidPrices() {
        return this.spotBidPrices;
    }

    /**
     * @return spotInstanceRemedy
     */
    public Boolean getSpotInstanceRemedy() {
        return this.spotInstanceRemedy;
    }

    /**
     * @return vSwitchId
     */
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static final class Builder extends Request.Builder<UpdateNodeGroupAttributesRequest, Builder> {
        private AckConfig ackConfig; 
        private java.util.List<String> additionalSecurityGroupIds; 
        private Boolean autoCompensateState; 
        private String clusterId; 
        private CostOptimizedConfig costOptimizedConfig; 
        private String description; 
        private String ecsSpotStrategy; 
        private Boolean enableGracefulDecommission; 
        private java.util.List<String> instanceTypeList; 
        private String keyPairName; 
        private Integer maxSize; 
        private Integer minSize; 
        private Integer nodeCount; 
        private String nodeGroupId; 
        private String nodeGroupName; 
        private String nodeResizeStrategy; 
        private String regionId; 
        private java.util.List<SpotBidPrice> spotBidPrices; 
        private Boolean spotInstanceRemedy; 
        private String vSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNodeGroupAttributesRequest request) {
            super(request);
            this.ackConfig = request.ackConfig;
            this.additionalSecurityGroupIds = request.additionalSecurityGroupIds;
            this.autoCompensateState = request.autoCompensateState;
            this.clusterId = request.clusterId;
            this.costOptimizedConfig = request.costOptimizedConfig;
            this.description = request.description;
            this.ecsSpotStrategy = request.ecsSpotStrategy;
            this.enableGracefulDecommission = request.enableGracefulDecommission;
            this.instanceTypeList = request.instanceTypeList;
            this.keyPairName = request.keyPairName;
            this.maxSize = request.maxSize;
            this.minSize = request.minSize;
            this.nodeCount = request.nodeCount;
            this.nodeGroupId = request.nodeGroupId;
            this.nodeGroupName = request.nodeGroupName;
            this.nodeResizeStrategy = request.nodeResizeStrategy;
            this.regionId = request.regionId;
            this.spotBidPrices = request.spotBidPrices;
            this.spotInstanceRemedy = request.spotInstanceRemedy;
            this.vSwitchId = request.vSwitchId;
        } 

        /**
         * AckConfig.
         */
        public Builder ackConfig(AckConfig ackConfig) {
            this.putQueryParameter("AckConfig", ackConfig);
            this.ackConfig = ackConfig;
            return this;
        }

        /**
         * <p>安全组ID列表。</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sg-hp3abbae8lb6lmb1****&quot;]</p>
         */
        public Builder additionalSecurityGroupIds(java.util.List<String> additionalSecurityGroupIds) {
            this.putQueryParameter("AdditionalSecurityGroupIds", additionalSecurityGroupIds);
            this.additionalSecurityGroupIds = additionalSecurityGroupIds;
            return this;
        }

        /**
         * <p>自动补偿状态。</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoCompensateState(Boolean autoCompensateState) {
            this.putQueryParameter("AutoCompensateState", autoCompensateState);
            this.autoCompensateState = autoCompensateState;
            return this;
        }

        /**
         * <p>集群ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>成本优化模式配置</p>
         */
        public Builder costOptimizedConfig(CostOptimizedConfig costOptimizedConfig) {
            this.putQueryParameter("CostOptimizedConfig", costOptimizedConfig);
            this.costOptimizedConfig = costOptimizedConfig;
            return this;
        }

        /**
         * <p>节点组描述。</p>
         * 
         * <strong>example:</strong>
         * <p>emr-core-1</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>抢占式实例策略</p>
         * 
         * <strong>example:</strong>
         * <p>SpotWithPriceLimit</p>
         */
        public Builder ecsSpotStrategy(String ecsSpotStrategy) {
            this.putQueryParameter("EcsSpotStrategy", ecsSpotStrategy);
            this.ecsSpotStrategy = ecsSpotStrategy;
            return this;
        }

        /**
         * <p>开启优雅下线。（V303创建集群时task组默认不开启优雅下线）</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableGracefulDecommission(Boolean enableGracefulDecommission) {
            this.putQueryParameter("EnableGracefulDecommission", enableGracefulDecommission);
            this.enableGracefulDecommission = enableGracefulDecommission;
            return this;
        }

        /**
         * <p>ecs 实例规格列表。</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder instanceTypeList(java.util.List<String> instanceTypeList) {
            this.putQueryParameter("InstanceTypeList", instanceTypeList);
            this.instanceTypeList = instanceTypeList;
            return this;
        }

        /**
         * <p>ECS登录秘钥对。</p>
         * 
         * <strong>example:</strong>
         * <p>test_pair</p>
         */
        public Builder keyPairName(String keyPairName) {
            this.putQueryParameter("KeyPairName", keyPairName);
            this.keyPairName = keyPairName;
            return this;
        }

        /**
         * <p>节点组最大实例数</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxSize(Integer maxSize) {
            this.putQueryParameter("MaxSize", maxSize);
            this.maxSize = maxSize;
            return this;
        }

        /**
         * <p>节点组最小实例数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder minSize(Integer minSize) {
            this.putQueryParameter("MinSize", minSize);
            this.minSize = minSize;
            return this;
        }

        /**
         * <p>节点组目标值</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder nodeCount(Integer nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>节点组ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-869471354ecd****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>节点组名称。</p>
         * 
         * <strong>example:</strong>
         * <p>CORE1</p>
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.putQueryParameter("NodeGroupName", nodeGroupName);
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * <p>节点扩容策略，支持：COST_OPTIMIZED,PRIORITY 默认值：PRIORITY</p>
         * 
         * <strong>example:</strong>
         * <p>PRIORITY</p>
         */
        public Builder nodeResizeStrategy(String nodeResizeStrategy) {
            this.putQueryParameter("NodeResizeStrategy", nodeResizeStrategy);
            this.nodeResizeStrategy = nodeResizeStrategy;
            return this;
        }

        /**
         * <p>区域ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>抢占式Spot实例价格上限。spotStrategy：SpotWithPriceLimit时生效</p>
         */
        public Builder spotBidPrices(java.util.List<SpotBidPrice> spotBidPrices) {
            this.putQueryParameter("SpotBidPrices", spotBidPrices);
            this.spotBidPrices = spotBidPrices;
            return this;
        }

        /**
         * <p>是否开启补齐抢占式实例。开启后，当收到抢占式实例将被回收的系统消息时，伸缩组将尝试创建新的实例，替换掉将被回收的抢占式实例。默认值：false</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
            this.putQueryParameter("SpotInstanceRemedy", spotInstanceRemedy);
            this.spotInstanceRemedy = spotInstanceRemedy;
            return this;
        }

        /**
         * <p>虚拟机交换机ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-hp35g7ya5ymw68mmg****</p>
         */
        public Builder vSwitchId(String vSwitchId) {
            this.putQueryParameter("VSwitchId", vSwitchId);
            this.vSwitchId = vSwitchId;
            return this;
        }

        @Override
        public UpdateNodeGroupAttributesRequest build() {
            return new UpdateNodeGroupAttributesRequest(this);
        } 

    } 

}
