// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeCommodityPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommodityPriceRequest</p>
 */
public class DescribeCommodityPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Orders")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Orders> orders;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionOptionNo")
    private String promotionOptionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<Orders> getOrders() {
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
        private java.util.List<Orders> orders; 
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
         * <p>The commodity orders.</p>
         * <p>This parameter is required.</p>
         */
        public Builder orders(java.util.List<Orders> orders) {
            this.putQueryParameter("Orders", orders);
            this.orders = orders;
            return this;
        }

        /**
         * <p>The coupon code.</p>
         * <blockquote>
         * <p> This parameter is unavailable on the China site (aliyun.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>50003298014****</p>
         */
        public Builder promotionOptionNo(String promotionOptionNo) {
            this.putQueryParameter("PromotionOptionNo", promotionOptionNo);
            this.promotionOptionNo = promotionOptionNo;
            return this;
        }

        /**
         * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
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

        @Override
        public DescribeCommodityPriceRequest build() {
            return new DescribeCommodityPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCommodityPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceRequest</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Properties model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * <p>The code of the attribute of the commodity module.</p>
             * <p>The information varies based on the commodity module. Examples: <strong>instance</strong> (GA instance) and <strong>ord_time</strong> (subscription duration).</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The value of the attribute.</p>
             * <p>The information varies based on the commodity module. Examples: <strong>instance_fee</strong> (GA instance fee) and <strong>1:Month</strong> (one-month subscription).</p>
             * 
             * <strong>example:</strong>
             * <p>instance_fee</p>
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
    /**
     * 
     * {@link DescribeCommodityPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentCode")
        private String componentCode;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.List<Properties> properties;

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
        public java.util.List<Properties> getProperties() {
            return this.properties;
        }

        public static final class Builder {
            private String componentCode; 
            private java.util.List<Properties> properties; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.componentCode = model.componentCode;
                this.properties = model.properties;
            } 

            /**
             * <p>The code of the commodity module.</p>
             * <p>The information varies based on the commodity module. Examples: <strong>instance</strong> (GA instance) and <strong>ord_time</strong> (subscription duration).</p>
             * 
             * <strong>example:</strong>
             * <p>instance</p>
             */
            public Builder componentCode(String componentCode) {
                this.componentCode = componentCode;
                return this;
            }

            /**
             * <p>The attributes of commodity modules.</p>
             * <p>The information varies based on the commodity module.</p>
             */
            public Builder properties(java.util.List<Properties> properties) {
                this.properties = properties;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCommodityPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeCommodityPriceRequest</p>
     */
    public static class Orders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("PricingCycle")
        private String pricingCycle;

        @com.aliyun.core.annotation.NameInMap("Quantity")
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
        public java.util.List<Components> getComponents() {
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
            private java.util.List<Components> components; 
            private Long duration; 
            private String orderType; 
            private String pricingCycle; 
            private Long quantity; 

            private Builder() {
            } 

            private Builder(Orders model) {
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.components = model.components;
                this.duration = model.duration;
                this.orderType = model.orderType;
                this.pricingCycle = model.pricingCycle;
                this.quantity = model.quantity;
            } 

            /**
             * <p>The billing method. Set the value to <strong>PREPAY</strong>, which specifies the subscription billing method.</p>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The commodity code.</p>
             * <p>Valid values on the China site (aliyun.com):</p>
             * <ul>
             * <li><strong>ga_gapluspre_public_cn</strong>: GA instance.</li>
             * <li><strong>ga_plusbwppre_public_cn</strong>: basic bandwidth plan.</li>
             * </ul>
             * <p>Valid values on the international site (alibabacloud.com):</p>
             * <ul>
             * <li><strong>ga_pluspre_public_intl</strong>: GA instance.</li>
             * <li><strong>ga_bwppreintl_public_intl:</strong> basic bandwidth plan.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ga_gapluspre_public_cn</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The information about commodity modules.</p>
             * <p>The information varies based on the commodity module.</p>
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The subscription duration.</p>
             * <ul>
             * <li>Valid values if you set <strong>PricingCycle</strong> to <strong>Month</strong>: <strong>1</strong> to <strong>9</strong>.</li>
             * <li>Valid values if you set <strong>PricingCycle</strong> to <strong>Year</strong>: <strong>1</strong> to <strong>3</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The type of the order. Valid values:</p>
             * <ul>
             * <li><strong>BUY</strong>: purchase order.</li>
             * <li><strong>RENEW</strong>: renewal order.</li>
             * <li><strong>UPGRADE</strong>: upgrade order.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUY</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The billing cycle. Valid values:</p>
             * <ul>
             * <li><strong>Month</strong></li>
             * <li><strong>Year</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Month</p>
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * <p>The number of instances that you want to purchase.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
