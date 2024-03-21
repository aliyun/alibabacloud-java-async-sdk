// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCommodityOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateCommodityOrderRequest</p>
 */
public class CreateCommodityOrderRequest extends Request {
    @Query
    @NameInMap("AutoPay")
    private Boolean autoPay;

    @Query
    @NameInMap("BizType")
    @Validation(required = true)
    private String bizType;

    @Query
    @NameInMap("ChargeType")
    private String chargeType;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("CommodityCode")
    @Validation(required = true)
    private String commodityCode;

    @Query
    @NameInMap("Components")
    @Validation(required = true)
    private java.util.Map < String, ? > components;

    @Query
    @NameInMap("Duration")
    @Validation(maximum = 10000, minimum = 1)
    private Integer duration;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OrderParams")
    private java.util.Map < String, ? > orderParams;

    @Query
    @NameInMap("OrderType")
    private String orderType;

    @Query
    @NameInMap("PricingCycle")
    private String pricingCycle;

    @Query
    @NameInMap("Quantity")
    @Validation(maximum = 10000, minimum = 1)
    private Integer quantity;

    @Query
    @NameInMap("SpecCode")
    private String specCode;

    @Query
    @NameInMap("UserId")
    private String userId;

    private CreateCommodityOrderRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.bizType = builder.bizType;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.commodityCode = builder.commodityCode;
        this.components = builder.components;
        this.duration = builder.duration;
        this.instanceId = builder.instanceId;
        this.orderParams = builder.orderParams;
        this.orderType = builder.orderType;
        this.pricingCycle = builder.pricingCycle;
        this.quantity = builder.quantity;
        this.specCode = builder.specCode;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCommodityOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return components
     */
    public java.util.Map < String, ? > getComponents() {
        return this.components;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return orderParams
     */
    public java.util.Map < String, ? > getOrderParams() {
        return this.orderParams;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return pricingCycle
     */
    public String getPricingCycle() {
        return this.pricingCycle;
    }

    /**
     * @return quantity
     */
    public Integer getQuantity() {
        return this.quantity;
    }

    /**
     * @return specCode
     */
    public String getSpecCode() {
        return this.specCode;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateCommodityOrderRequest, Builder> {
        private Boolean autoPay; 
        private String bizType; 
        private String chargeType; 
        private String clientToken; 
        private String commodityCode; 
        private java.util.Map < String, ? > components; 
        private Integer duration; 
        private String instanceId; 
        private java.util.Map < String, ? > orderParams; 
        private String orderType; 
        private String pricingCycle; 
        private Integer quantity; 
        private String specCode; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCommodityOrderRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.bizType = request.bizType;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.commodityCode = request.commodityCode;
            this.components = request.components;
            this.duration = request.duration;
            this.instanceId = request.instanceId;
            this.orderParams = request.orderParams;
            this.orderType = request.orderType;
            this.pricingCycle = request.pricingCycle;
            this.quantity = request.quantity;
            this.specCode = request.specCode;
            this.userId = request.userId;
        } 

        /**
         * AutoPay.
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * Components.
         */
        public Builder components(java.util.Map < String, ? > components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putQueryParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OrderParams.
         */
        public Builder orderParams(java.util.Map < String, ? > orderParams) {
            String orderParamsShrink = shrink(orderParams, "OrderParams", "json");
            this.putQueryParameter("OrderParams", orderParamsShrink);
            this.orderParams = orderParams;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * PricingCycle.
         */
        public Builder pricingCycle(String pricingCycle) {
            this.putQueryParameter("PricingCycle", pricingCycle);
            this.pricingCycle = pricingCycle;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Integer quantity) {
            this.putQueryParameter("Quantity", quantity);
            this.quantity = quantity;
            return this;
        }

        /**
         * SpecCode.
         */
        public Builder specCode(String specCode) {
            this.putQueryParameter("SpecCode", specCode);
            this.specCode = specCode;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateCommodityOrderRequest build() {
            return new CreateCommodityOrderRequest(this);
        } 

    } 

}
