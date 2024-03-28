// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCommodityPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommodityPriceRequest</p>
 */
public class DescribeCommodityPriceRequest extends Request {
    @Query
    @NameInMap("Orders")
    @Validation(required = true)
    private java.util.List < Orders> orders;

    @Query
    @NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DescribeCommodityPriceRequest(Builder builder) {
        super(builder);
        this.orders = builder.orders;
        this.promotionOptionNo = builder.promotionOptionNo;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommodityPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orders
     */
    public java.util.List < Orders> getOrders() {
        return this.orders;
    }

    /**
     * @return promotionOptionNo
     */
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCommodityPriceRequest, Builder> {
        private java.util.List < Orders> orders; 
        private String promotionOptionNo; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommodityPriceRequest request) {
            super(request);
            this.orders = request.orders;
            this.promotionOptionNo = request.promotionOptionNo;
            this.regionId = request.regionId;
        } 

        /**
         * The commodity orders.
         */
        public Builder orders(java.util.List < Orders> orders) {
            this.putQueryParameter("Orders", orders);
            this.orders = orders;
            return this;
        }

        /**
         * The coupon code.
         * <p>
         * 
         * >  This parameter is unavailable on the China site (aliyun.com).
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeCommodityPriceRequest build() {
            return new DescribeCommodityPriceRequest(this);
        } 

    } 

    public static class Properties extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Value")
        private String value;

        private Properties(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            /**
             * The code of the attribute of the commodity module.
             * <p>
             * 
             * The information varies based on the commodity module. Examples: **instance** (GA instance) and **ord_time** (subscription duration).
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The value of the attribute.
             * <p>
             * 
             * The information varies based on the commodity module. Examples: **instance_fee** (GA instance fee) and **1:Month** (one-month subscription).
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @NameInMap("ComponentCode")
        private String componentCode;

        @NameInMap("Properties")
        private java.util.List < Properties> properties;

        private Components(Builder builder) {
            this.componentCode = builder.componentCode;
            this.properties = builder.properties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentCode
         */
        public String getComponentCode() {
            return this.componentCode;
        }

        /**
         * @return properties
         */
        public java.util.List < Properties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String componentCode; 
            private java.util.List < Properties> properties; 

            /**
             * The code of the commodity module.
             * <p>
             * 
             * The information varies based on the commodity module. Examples: **instance** (GA instance) and **ord_time** (subscription duration).
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * The attributes of commodity modules.
             * <p>
             * 
             * The information varies based on the commodity module.
             */
            public Builder properties(java.util.List < Properties> properties) {
                this.properties = properties;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class Orders extends TeaModel {
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("Components")
        private java.util.List < Components> components;

        @NameInMap("Duration")
        private Long duration;

        @NameInMap("OrderType")
        private String orderType;

        @NameInMap("PricingCycle")
        private String pricingCycle;

        @NameInMap("Quantity")
        private Long quantity;

        private Orders(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.components = builder.components;
            this.duration = builder.duration;
            this.orderType = builder.orderType;
            this.pricingCycle = builder.pricingCycle;
            this.quantity = builder.quantity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orders create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
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
        public java.util.List < Components> getComponents() {
            return this.components;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
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
        public Long getQuantity() {
            return this.quantity;
        }

        public static final class Builder {
            private String chargeType; 
            private String commodityCode; 
            private java.util.List < Components> components; 
            private Long duration; 
            private String orderType; 
            private String pricingCycle; 
            private Long quantity; 

            /**
             * The billing method. Set the value to **PREPAY**, which specifies the subscription billing method.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The commodity code.
             * <p>
             * 
             * Valid values on the China site (aliyun.com):
             * 
             * *   **ga_gapluspre_public_cn**: GA instance.
             * *   **ga_plusbwppre_public_cn**: basic bandwidth plan.
             * 
             * Valid values on the international site (alibabacloud.com):
             * 
             * *   **ga_pluspre_public_intl**: GA instance.
             * *   **ga_bwppreintl_public_intl:** basic bandwidth plan.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The information about commodity modules.
             * <p>
             * 
             * The information varies based on the commodity module.
             */
            public Builder components(java.util.List < Components> components) {
                this.components = components;
                return this;
            }

            /**
             * The subscription duration.
             * <p>
             * 
             * *   Valid values if you set **PricingCycle** to **Month**: **1** to **9**.
             * *   Valid values if you set **PricingCycle** to **Year**: **1** to **3**.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The type of the order. Valid values:
             * <p>
             * 
             * *   **BUY**: purchase order.
             * *   **RENEW**: renewal order.
             * *   **UPGRADE**: upgrade order.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * The billing cycle. Valid values:
             * <p>
             * 
             * *   **Month**
             * *   **Year**
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * The number of instances that you want to purchase.
             */
            public Builder quantity(Long quantity) {
                this.quantity = quantity;
                return this;
            }

            public Orders build() {
                return new Orders(this);
            } 

        } 

    }
}
