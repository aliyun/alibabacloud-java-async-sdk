// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateProductOrdersRequest} extends {@link RequestModel}
 *
 * <p>CreateProductOrdersRequest</p>
 */
public class CreateProductOrdersRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Products")
    private java.util.List < Products> products;

    private CreateProductOrdersRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.products = builder.products;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductOrdersRequest create() {
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
     * @return products
     */
    public java.util.List < Products> getProducts() {
        return this.products;
    }

    public static final class Builder extends Request.Builder<CreateProductOrdersRequest, Builder> {
        private Boolean autoPay; 
        private java.util.List < Products> products; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductOrdersRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.products = request.products;
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
         * Products.
         */
        public Builder products(java.util.List < Products> products) {
            this.putBodyParameter("Products", products);
            this.products = products;
            return this;
        }

        @Override
        public CreateProductOrdersRequest build() {
            return new CreateProductOrdersRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateProductOrdersRequest} extends {@link TeaModel}
     *
     * <p>CreateProductOrdersRequest</p>
     */
    public static class InstanceProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InstanceProperties(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceProperties create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private String value; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InstanceProperties build() {
                return new InstanceProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateProductOrdersRequest} extends {@link TeaModel}
     *
     * <p>CreateProductOrdersRequest</p>
     */
    public static class Products extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("InstanceProperties")
        private java.util.List < InstanceProperties> instanceProperties;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("PricingCycle")
        private String pricingCycle;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        private Products(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.chargeType = builder.chargeType;
            this.duration = builder.duration;
            this.instanceProperties = builder.instanceProperties;
            this.orderType = builder.orderType;
            this.pricingCycle = builder.pricingCycle;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Products create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return instanceProperties
         */
        public java.util.List < InstanceProperties> getInstanceProperties() {
            return this.instanceProperties;
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
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private String chargeType; 
            private Long duration; 
            private java.util.List < InstanceProperties> instanceProperties; 
            private String orderType; 
            private String pricingCycle; 
            private String productCode; 

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * InstanceProperties.
             */
            public Builder instanceProperties(java.util.List < InstanceProperties> instanceProperties) {
                this.instanceProperties = instanceProperties;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * PricingCycle.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public Products build() {
                return new Products(this);
            } 

        } 

    }
}
