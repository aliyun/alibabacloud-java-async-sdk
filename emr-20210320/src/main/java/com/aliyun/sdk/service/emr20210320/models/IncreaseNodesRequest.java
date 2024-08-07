// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IncreaseNodesRequest} extends {@link RequestModel}
 *
 * <p>IncreaseNodesRequest</p>
 */
public class IncreaseNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationConfigs")
    private java.util.List < ApplicationConfig > applicationConfigs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPayOrder")
    private Boolean autoPayOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncreaseNodeCount")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer increaseNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinIncreaseNodeCount")
    private Integer minIncreaseNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentDuration")
    private Integer paymentDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PaymentDurationUnit")
    private String paymentDurationUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private IncreaseNodesRequest(Builder builder) {
        super(builder);
        this.applicationConfigs = builder.applicationConfigs;
        this.autoPayOrder = builder.autoPayOrder;
        this.autoRenew = builder.autoRenew;
        this.clusterId = builder.clusterId;
        this.increaseNodeCount = builder.increaseNodeCount;
        this.minIncreaseNodeCount = builder.minIncreaseNodeCount;
        this.nodeGroupId = builder.nodeGroupId;
        this.paymentDuration = builder.paymentDuration;
        this.paymentDurationUnit = builder.paymentDurationUnit;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncreaseNodesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationConfigs
     */
    public java.util.List < ApplicationConfig > getApplicationConfigs() {
        return this.applicationConfigs;
    }

    /**
     * @return autoPayOrder
     */
    public Boolean getAutoPayOrder() {
        return this.autoPayOrder;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return increaseNodeCount
     */
    public Integer getIncreaseNodeCount() {
        return this.increaseNodeCount;
    }

    /**
     * @return minIncreaseNodeCount
     */
    public Integer getMinIncreaseNodeCount() {
        return this.minIncreaseNodeCount;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return paymentDuration
     */
    public Integer getPaymentDuration() {
        return this.paymentDuration;
    }

    /**
     * @return paymentDurationUnit
     */
    public String getPaymentDurationUnit() {
        return this.paymentDurationUnit;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<IncreaseNodesRequest, Builder> {
        private java.util.List < ApplicationConfig > applicationConfigs; 
        private Boolean autoPayOrder; 
        private Boolean autoRenew; 
        private String clusterId; 
        private Integer increaseNodeCount; 
        private Integer minIncreaseNodeCount; 
        private String nodeGroupId; 
        private Integer paymentDuration; 
        private String paymentDurationUnit; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(IncreaseNodesRequest request) {
            super(request);
            this.applicationConfigs = request.applicationConfigs;
            this.autoPayOrder = request.autoPayOrder;
            this.autoRenew = request.autoRenew;
            this.clusterId = request.clusterId;
            this.increaseNodeCount = request.increaseNodeCount;
            this.minIncreaseNodeCount = request.minIncreaseNodeCount;
            this.nodeGroupId = request.nodeGroupId;
            this.paymentDuration = request.paymentDuration;
            this.paymentDurationUnit = request.paymentDurationUnit;
            this.regionId = request.regionId;
        } 

        /**
         * The application configurations. You can specify a maximum of 1,000 items.
         */
        public Builder applicationConfigs(java.util.List < ApplicationConfig > applicationConfigs) {
            this.putQueryParameter("ApplicationConfigs", applicationConfigs);
            this.applicationConfigs = applicationConfigs;
            return this;
        }

        /**
         * Indicates whether to automatically pay for the orders involved in the scale-out operation. This parameter takes effect only when the PaymentType parameter is set to Subscription. Valid values:
         * <p>
         * 
         * *   true: automatically pays for the order involved in this operation.
         * *   false: does not automatically pay for the orders involved in this operation.
         * 
         * Default value: false
         */
        public Builder autoPayOrder(Boolean autoPayOrder) {
            this.putQueryParameter("AutoPayOrder", autoPayOrder);
            this.autoPayOrder = autoPayOrder;
            return this;
        }

        /**
         * Specifies whether to enable auto-renewal for nodes. Valid values:
         * <p>
         * 
         * *   true
         * *   false (default value)
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The number of nodes. The number of incremental nodes for this scale-out. Valid values: 1 to 500.
         */
        public Builder increaseNodeCount(Integer increaseNodeCount) {
            this.putQueryParameter("IncreaseNodeCount", increaseNodeCount);
            this.increaseNodeCount = increaseNodeCount;
            return this;
        }

        /**
         * The minimum number of nodes that can be added. Valid values: 1 to 500.
         * <p>
         * 
         * *   If you configure this parameter, and the number of available Elastic Compute Service (ECS) instances is less than the value of the IncreaseNodeCount parameter, the system tries to add nodes based on the number specified by the `MinIncreaseNodeCount` parameter. If the minimum number of nodes are added, the scale-out status is `PARTIAL_COMPLETED`.
         * *   If you do not configure this parameter, and the number of available ECS instances is less than the value of the IncreaseNodeCount parameter, the scale-out process fails. The scale-out status is `FAILED`.
         */
        public Builder minIncreaseNodeCount(Integer minIncreaseNodeCount) {
            this.putQueryParameter("MinIncreaseNodeCount", minIncreaseNodeCount);
            this.minIncreaseNodeCount = minIncreaseNodeCount;
            return this;
        }

        /**
         * The ID of the node group. The target node group to which you want to scale out the cluster.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * The subscription duration. Valid values when the PaymentDurationUnit value is Month: 1, 2, 3, 4, 5, 6, 7, 8, 9, 12, 24, 36, 48, and 60.
         */
        public Builder paymentDuration(Integer paymentDuration) {
            this.putQueryParameter("PaymentDuration", paymentDuration);
            this.paymentDuration = paymentDuration;
            return this;
        }

        /**
         * The unit of the subscription duration. Valid values:
         * <p>
         * 
         * *   Month
         */
        public Builder paymentDurationUnit(String paymentDurationUnit) {
            this.putQueryParameter("PaymentDurationUnit", paymentDurationUnit);
            this.paymentDurationUnit = paymentDurationUnit;
            return this;
        }

        /**
         * The ID of the region in which you want to create the instance.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public IncreaseNodesRequest build() {
            return new IncreaseNodesRequest(this);
        } 

    } 

}
