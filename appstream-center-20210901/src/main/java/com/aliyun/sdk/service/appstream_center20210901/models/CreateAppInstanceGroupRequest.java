// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppInstanceGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateAppInstanceGroupRequest</p>
 */
public class CreateAppInstanceGroupRequest extends Request {
    @Body
    @NameInMap("AppCenterImageId")
    @Validation(required = true)
    private String appCenterImageId;

    @Body
    @NameInMap("AppInstanceGroupName")
    @Validation(required = true)
    private String appInstanceGroupName;

    @Body
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Body
    @NameInMap("AutoRenew")
    private Boolean autoRenew;

    @Body
    @NameInMap("BizRegionId")
    @Validation(required = true)
    private String bizRegionId;

    @Body
    @NameInMap("ChargeResourceMode")
    @Validation(required = true)
    private String chargeResourceMode;

    @Body
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Body
    @NameInMap("NodePool")
    @Validation(required = true)
    private NodePool nodePool;

    @Body
    @NameInMap("Period")
    @Validation(required = true)
    private Integer period;

    @Body
    @NameInMap("PeriodUnit")
    @Validation(required = true)
    private String periodUnit;

    @Body
    @NameInMap("ProductType")
    @Validation(required = true)
    private String productType;

    @Body
    @NameInMap("PromotionId")
    private String promotionId;

    @Body
    @NameInMap("SessionTimeout")
    @Validation(required = true, maximum = 300)
    private Integer sessionTimeout;

    @Body
    @NameInMap("UserInfo")
    private UserInfo userInfo;

    @Body
    @NameInMap("Users")
    private java.util.List < String > users;

    private CreateAppInstanceGroupRequest(Builder builder) {
        super(builder);
        this.appCenterImageId = builder.appCenterImageId;
        this.appInstanceGroupName = builder.appInstanceGroupName;
        this.autoPay = builder.autoPay;
        this.autoRenew = builder.autoRenew;
        this.bizRegionId = builder.bizRegionId;
        this.chargeResourceMode = builder.chargeResourceMode;
        this.chargeType = builder.chargeType;
        this.nodePool = builder.nodePool;
        this.period = builder.period;
        this.periodUnit = builder.periodUnit;
        this.productType = builder.productType;
        this.promotionId = builder.promotionId;
        this.sessionTimeout = builder.sessionTimeout;
        this.userInfo = builder.userInfo;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppInstanceGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appCenterImageId
     */
    public String getAppCenterImageId() {
        return this.appCenterImageId;
    }

    /**
     * @return appInstanceGroupName
     */
    public String getAppInstanceGroupName() {
        return this.appInstanceGroupName;
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return bizRegionId
     */
    public String getBizRegionId() {
        return this.bizRegionId;
    }

    /**
     * @return chargeResourceMode
     */
    public String getChargeResourceMode() {
        return this.chargeResourceMode;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return nodePool
     */
    public NodePool getNodePool() {
        return this.nodePool;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return periodUnit
     */
    public String getPeriodUnit() {
        return this.periodUnit;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return promotionId
     */
    public String getPromotionId() {
        return this.promotionId;
    }

    /**
     * @return sessionTimeout
     */
    public Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    /**
     * @return userInfo
     */
    public UserInfo getUserInfo() {
        return this.userInfo;
    }

    /**
     * @return users
     */
    public java.util.List < String > getUsers() {
        return this.users;
    }

    public static final class Builder extends Request.Builder<CreateAppInstanceGroupRequest, Builder> {
        private String appCenterImageId; 
        private String appInstanceGroupName; 
        private Boolean autoPay; 
        private Boolean autoRenew; 
        private String bizRegionId; 
        private String chargeResourceMode; 
        private String chargeType; 
        private NodePool nodePool; 
        private Integer period; 
        private String periodUnit; 
        private String productType; 
        private String promotionId; 
        private Integer sessionTimeout; 
        private UserInfo userInfo; 
        private java.util.List < String > users; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppInstanceGroupRequest request) {
            super(request);
            this.appCenterImageId = request.appCenterImageId;
            this.appInstanceGroupName = request.appInstanceGroupName;
            this.autoPay = request.autoPay;
            this.autoRenew = request.autoRenew;
            this.bizRegionId = request.bizRegionId;
            this.chargeResourceMode = request.chargeResourceMode;
            this.chargeType = request.chargeType;
            this.nodePool = request.nodePool;
            this.period = request.period;
            this.periodUnit = request.periodUnit;
            this.productType = request.productType;
            this.promotionId = request.promotionId;
            this.sessionTimeout = request.sessionTimeout;
            this.userInfo = request.userInfo;
            this.users = request.users;
        } 

        /**
         * AppCenterImageId.
         */
        public Builder appCenterImageId(String appCenterImageId) {
            this.putBodyParameter("AppCenterImageId", appCenterImageId);
            this.appCenterImageId = appCenterImageId;
            return this;
        }

        /**
         * AppInstanceGroupName.
         */
        public Builder appInstanceGroupName(String appInstanceGroupName) {
            this.putBodyParameter("AppInstanceGroupName", appInstanceGroupName);
            this.appInstanceGroupName = appInstanceGroupName;
            return this;
        }

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * AutoRenew.
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putBodyParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * BizRegionId.
         */
        public Builder bizRegionId(String bizRegionId) {
            this.putBodyParameter("BizRegionId", bizRegionId);
            this.bizRegionId = bizRegionId;
            return this;
        }

        /**
         * ChargeResourceMode.
         */
        public Builder chargeResourceMode(String chargeResourceMode) {
            this.putBodyParameter("ChargeResourceMode", chargeResourceMode);
            this.chargeResourceMode = chargeResourceMode;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * NodePool.
         */
        public Builder nodePool(NodePool nodePool) {
            String nodePoolShrink = shrink(nodePool, "NodePool", "json");
            this.putBodyParameter("NodePool", nodePoolShrink);
            this.nodePool = nodePool;
            return this;
        }

        /**
         * Period.
         */
        public Builder period(Integer period) {
            this.putBodyParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * PeriodUnit.
         */
        public Builder periodUnit(String periodUnit) {
            this.putBodyParameter("PeriodUnit", periodUnit);
            this.periodUnit = periodUnit;
            return this;
        }

        /**
         * ProductType.
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * PromotionId.
         */
        public Builder promotionId(String promotionId) {
            this.putBodyParameter("PromotionId", promotionId);
            this.promotionId = promotionId;
            return this;
        }

        /**
         * SessionTimeout.
         */
        public Builder sessionTimeout(Integer sessionTimeout) {
            this.putBodyParameter("SessionTimeout", sessionTimeout);
            this.sessionTimeout = sessionTimeout;
            return this;
        }

        /**
         * UserInfo.
         */
        public Builder userInfo(UserInfo userInfo) {
            String userInfoShrink = shrink(userInfo, "UserInfo", "json");
            this.putBodyParameter("UserInfo", userInfoShrink);
            this.userInfo = userInfo;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < String > users) {
            this.putBodyParameter("Users", users);
            this.users = users;
            return this;
        }

        @Override
        public CreateAppInstanceGroupRequest build() {
            return new CreateAppInstanceGroupRequest(this);
        } 

    } 

    public static class NodePool extends TeaModel {
        @NameInMap("MaxScalingAmount")
        private Integer maxScalingAmount;

        @NameInMap("NodeAmount")
        @Validation(required = true)
        private Integer nodeAmount;

        @NameInMap("NodeCapacity")
        @Validation(required = true)
        private Integer nodeCapacity;

        @NameInMap("NodeInstanceType")
        @Validation(required = true)
        private String nodeInstanceType;

        @NameInMap("ScalingDownAfterIdleMinutes")
        private Integer scalingDownAfterIdleMinutes;

        @NameInMap("ScalingStep")
        private Integer scalingStep;

        @NameInMap("ScalingUsageThreshold")
        private String scalingUsageThreshold;

        @NameInMap("StrategyType")
        private String strategyType;

        private NodePool(Builder builder) {
            this.maxScalingAmount = builder.maxScalingAmount;
            this.nodeAmount = builder.nodeAmount;
            this.nodeCapacity = builder.nodeCapacity;
            this.nodeInstanceType = builder.nodeInstanceType;
            this.scalingDownAfterIdleMinutes = builder.scalingDownAfterIdleMinutes;
            this.scalingStep = builder.scalingStep;
            this.scalingUsageThreshold = builder.scalingUsageThreshold;
            this.strategyType = builder.strategyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodePool create() {
            return builder().build();
        }

        /**
         * @return maxScalingAmount
         */
        public Integer getMaxScalingAmount() {
            return this.maxScalingAmount;
        }

        /**
         * @return nodeAmount
         */
        public Integer getNodeAmount() {
            return this.nodeAmount;
        }

        /**
         * @return nodeCapacity
         */
        public Integer getNodeCapacity() {
            return this.nodeCapacity;
        }

        /**
         * @return nodeInstanceType
         */
        public String getNodeInstanceType() {
            return this.nodeInstanceType;
        }

        /**
         * @return scalingDownAfterIdleMinutes
         */
        public Integer getScalingDownAfterIdleMinutes() {
            return this.scalingDownAfterIdleMinutes;
        }

        /**
         * @return scalingStep
         */
        public Integer getScalingStep() {
            return this.scalingStep;
        }

        /**
         * @return scalingUsageThreshold
         */
        public String getScalingUsageThreshold() {
            return this.scalingUsageThreshold;
        }

        /**
         * @return strategyType
         */
        public String getStrategyType() {
            return this.strategyType;
        }

        public static final class Builder {
            private Integer maxScalingAmount; 
            private Integer nodeAmount; 
            private Integer nodeCapacity; 
            private String nodeInstanceType; 
            private Integer scalingDownAfterIdleMinutes; 
            private Integer scalingStep; 
            private String scalingUsageThreshold; 
            private String strategyType; 

            /**
             * MaxScalingAmount.
             */
            public Builder maxScalingAmount(Integer maxScalingAmount) {
                this.maxScalingAmount = maxScalingAmount;
                return this;
            }

            /**
             * NodeAmount.
             */
            public Builder nodeAmount(Integer nodeAmount) {
                this.nodeAmount = nodeAmount;
                return this;
            }

            /**
             * NodeCapacity.
             */
            public Builder nodeCapacity(Integer nodeCapacity) {
                this.nodeCapacity = nodeCapacity;
                return this;
            }

            /**
             * NodeInstanceType.
             */
            public Builder nodeInstanceType(String nodeInstanceType) {
                this.nodeInstanceType = nodeInstanceType;
                return this;
            }

            /**
             * ScalingDownAfterIdleMinutes.
             */
            public Builder scalingDownAfterIdleMinutes(Integer scalingDownAfterIdleMinutes) {
                this.scalingDownAfterIdleMinutes = scalingDownAfterIdleMinutes;
                return this;
            }

            /**
             * ScalingStep.
             */
            public Builder scalingStep(Integer scalingStep) {
                this.scalingStep = scalingStep;
                return this;
            }

            /**
             * ScalingUsageThreshold.
             */
            public Builder scalingUsageThreshold(String scalingUsageThreshold) {
                this.scalingUsageThreshold = scalingUsageThreshold;
                return this;
            }

            /**
             * StrategyType.
             */
            public Builder strategyType(String strategyType) {
                this.strategyType = strategyType;
                return this;
            }

            public NodePool build() {
                return new NodePool(this);
            } 

        } 

    }
    public static class UserInfo extends TeaModel {
        @NameInMap("Type")
        private String type;

        private UserInfo(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInfo create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UserInfo build() {
                return new UserInfo(this);
            } 

        } 

    }
}
