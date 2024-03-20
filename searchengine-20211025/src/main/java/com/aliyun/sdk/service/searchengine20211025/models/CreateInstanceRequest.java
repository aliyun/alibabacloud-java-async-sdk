// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("chargeType")
    private String chargeType;

    @Body
    @NameInMap("components")
    private java.util.List < Components> components;

    @Body
    @NameInMap("order")
    private Order order;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.components = builder.components;
        this.order = builder.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return components
     */
    public java.util.List < Components> getComponents() {
        return this.components;
    }

    /**
     * @return order
     */
    public Order getOrder() {
        return this.order;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String chargeType; 
        private java.util.List < Components> components; 
        private Order order; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.components = request.components;
            this.order = request.order;
        } 

        /**
         * The billing method of the instance. Valid values: PREPAY and POSTPAY. PREPAY indicates the instance is a subscription instance. When you set this parameter to PREPAY, make sure that your Alibaba Cloud account supports balance payment or credit card payment. Otherwise, the system returns the InvalidPayMethod error message. If you set this parameter to PREPAY, you must also specify the paymentInfo parameter. POSTPAY indicates that the instance is a pay-as-you-go instance. This billing method is not supported.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("chargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * A list of instance-related specifications.
         */
        public Builder components(java.util.List < Components> components) {
            this.putBodyParameter("components", components);
            this.components = components;
            return this;
        }

        /**
         * The billing information.
         */
        public Builder order(Order order) {
            this.putBodyParameter("order", order);
            this.order = order;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class Components extends TeaModel {
        @NameInMap("code")
        private String code;

        @NameInMap("value")
        private String value;

        private Components(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
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
             * The specification code, which must be consistent with values of the corresponding module parameters.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Values that you specify for the corresponding module components on the buy page.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class Order extends TeaModel {
        @NameInMap("autoRenew")
        private Boolean autoRenew;

        @NameInMap("duration")
        private Long duration;

        @NameInMap("pricingCycle")
        private String pricingCycle;

        private Order(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.duration = builder.duration;
            this.pricingCycle = builder.pricingCycle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Order create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public Boolean getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return pricingCycle
         */
        public String getPricingCycle() {
            return this.pricingCycle;
        }

        public static final class Builder {
            private Boolean autoRenew; 
            private Long duration; 
            private String pricingCycle; 

            /**
             * Specifies whether to enable auto-renewal. Valid values: true and false.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The billing duration. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, and 12.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The unit of the billing duration. Valid values: Month and Year.
             */
            public Builder pricingCycle(String pricingCycle) {
                this.pricingCycle = pricingCycle;
                return this;
            }

            public Order build() {
                return new Order(this);
            } 

        } 

    }
}
