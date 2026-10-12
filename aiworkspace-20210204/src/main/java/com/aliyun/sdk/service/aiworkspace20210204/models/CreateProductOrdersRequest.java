// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
    private java.util.List<Products> products;

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
    public java.util.List<Products> getProducts() {
        return this.products;
    }

    public static final class Builder extends Request.Builder<CreateProductOrdersRequest, Builder> {
        private Boolean autoPay; 
        private java.util.List<Products> products; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductOrdersRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.products = request.products;
        } 

        /**
         * <p>Specifies whether automatic payment is applied to all products specified in the Products parameter. Valid values:</p>
         * <ul>
         * <li>true: automatic payment</li>
         * <li>false: no automatic payment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putBodyParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The list of products to purchase, separated by commas.</p>
         */
        public Builder products(java.util.List<Products> products) {
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

            private Builder() {
            } 

            private Builder(InstanceProperties model) {
                this.code = model.code;
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The code of the instance property.</p>
             * 
             * <strong>example:</strong>
             * <p>commodity_type</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The name of the instance property.</p>
             * 
             * <strong>example:</strong>
             * <p>Object Storage Service (OSS)</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the instance property.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
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
        private java.util.List<InstanceProperties> instanceProperties;

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
        public java.util.List<InstanceProperties> getInstanceProperties() {
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
            private java.util.List<InstanceProperties> instanceProperties; 
            private String orderType; 
            private String pricingCycle; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(Products model) {
                this.autoRenew = model.autoRenew;
                this.chargeType = model.chargeType;
                this.duration = model.duration;
                this.instanceProperties = model.instanceProperties;
                this.orderType = model.orderType;
                this.pricingCycle = model.pricingCycle;
                this.productCode = model.productCode;
            } 

            /**
             * <p>Specifies whether to enable auto-renewal. Valid values:</p>
             * <ul>
             * <li>true: Auto-renewal is enabled.</li>
             * <li>false: Auto-renewal is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>The billing method. Currently, only POSTPAY is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The purchase duration. This parameter is used together with PricingCycle. Currently, only 1 is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The list of instance property information.</p>
             * <ul>
             * <li>DataWorks_share:
             * [ {
             * &quot;Code&quot;: &quot;region&quot;,
             * &quot;Value&quot;: &quot;cn-shanghai&quot;
             * }
             * ]</li>
             * <li>OSS_share:
             * [ {
             * &quot;Code&quot;: &quot;commodity_type&quot;,
             * &quot;Value&quot;: &quot;oss&quot;,
             * &quot;Name&quot;: &quot;Object Storage Service (OSS)&quot;
             * },
             * {
             * &quot;Code&quot;: &quot;ord_time&quot;,
             * &quot;Value&quot;: &quot;1:Hour&quot;,
             * &quot;Name&quot;: &quot;1 hour&quot;
             * }
             * ]</li>
             * <li>PAI_share: None</li>
             * <li>MaxCompute_share for the Chinese site:
             * [
             * {
             * &quot;Code&quot;: &quot;region&quot;,
             * &quot;Value&quot;: &quot;cn-hangzhou&quot;
             * },
             * {
             * &quot;Code&quot;: &quot;odps_specification_type&quot;,
             * &quot;Value&quot;: &quot;OdpsStandard&quot;
             * },
             * {
             * &quot;Code&quot;: &quot;ord_time&quot;,
             * &quot;Value&quot;: &quot;1:Hour&quot;
             * }
             * ]</li>
             * <li>MaxCompute_share for the international site:
             * [
             * {
             * &quot;Code&quot;: &quot;region&quot;,
             * &quot;Value&quot;: &quot;cn-hangzhou&quot;
             * },
             * {
             * &quot;Code&quot;: &quot;ord_time&quot;,
             * &quot;Value&quot;: &quot;1:Hour&quot;
             * }
             * ]</li>
             * </ul>
             */
            public Builder instanceProperties(java.util.List<InstanceProperties> instanceProperties) {
                this.instanceProperties = instanceProperties;
                return this;
            }

            /**
             * <p>The order type. Currently, only BUY is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>BUY</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The pricing unit. Valid values:</p>
             * <ul>
             * <li>Month: Monthly pricing. Only DataWorks_share supports this value.</li>
             * <li>Hour: Hourly pricing. Only OSS_share and MaxCompute_share support this value.</li>
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
             * <p>The product code. Valid values:</p>
             * <ul>
             * <li>DataWorks_share: Pay-as-you-go DataWorks.</li>
             * <li>MaxCompute_share: Pay-as-you-go MaxCompute.</li>
             * <li>PAI_share: Pay-as-you-go PAI.</li>
             * <li>OSS_share: Pay-as-you-go OSS.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DataWorks_share</p>
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
