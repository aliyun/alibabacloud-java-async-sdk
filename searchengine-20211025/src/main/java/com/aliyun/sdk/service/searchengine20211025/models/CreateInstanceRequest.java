// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("components")
    private java.util.List < Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("order")
    private Order order;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private java.util.List < Tags> tags;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.components = builder.components;
        this.order = builder.order;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
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

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String chargeType; 
        private java.util.List < Components> components; 
        private Order order; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.chargeType = request.chargeType;
            this.components = request.components;
            this.order = request.order;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
        } 

        /**
         * The billing method of the instance. Valid values: PREPAY: subscription. If you set this parameter to PREPAY, make sure that your Alibaba Cloud account supports balance payment or credit card payment. Otherwise, the system returns the InvalidPayMethod error message. If you set this parameter to PREPAY, you must also specify paymentInfo. POSTPAY: pay-as-you-go. This billing method is not supported.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("chargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * The information about the instance specification.
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

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("value")
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
             * The code of the specification, which must be consistent with the value that you specify on the buy page.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The value of the specification.
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
        @com.aliyun.core.annotation.NameInMap("autoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("pricingCycle")
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
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the specification.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
