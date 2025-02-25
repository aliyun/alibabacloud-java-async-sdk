// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link CreateMultiOrderRequest} extends {@link RequestModel}
 *
 * <p>CreateMultiOrderRequest</p>
 */
public class CreateMultiOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderItems")
    private java.util.List<OrderItems> orderItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, String> properties;

    private CreateMultiOrderRequest(Builder builder) {
        super(builder);
        this.orderItems = builder.orderItems;
        this.orderType = builder.orderType;
        this.properties = builder.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMultiOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orderItems
     */
    public java.util.List<OrderItems> getOrderItems() {
        return this.orderItems;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return properties
     */
    public java.util.Map<String, String> getProperties() {
        return this.properties;
    }

    public static final class Builder extends Request.Builder<CreateMultiOrderRequest, Builder> {
        private java.util.List<OrderItems> orderItems; 
        private String orderType; 
        private java.util.Map<String, String> properties; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultiOrderRequest request) {
            super(request);
            this.orderItems = request.orderItems;
            this.orderType = request.orderType;
            this.properties = request.properties;
        } 

        /**
         * OrderItems.
         */
        public Builder orderItems(java.util.List<OrderItems> orderItems) {
            this.putQueryParameter("OrderItems", orderItems);
            this.orderItems = orderItems;
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
         * Properties.
         */
        public Builder properties(java.util.Map<String, String> properties) {
            String propertiesShrink = shrink(properties, "Properties", "json");
            this.putQueryParameter("Properties", propertiesShrink);
            this.properties = properties;
            return this;
        }

        @Override
        public CreateMultiOrderRequest build() {
            return new CreateMultiOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMultiOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateMultiOrderRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Components(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    /**
     * 
     * {@link CreateMultiOrderRequest} extends {@link TeaModel}
     *
     * <p>CreateMultiOrderRequest</p>
     */
    public static class OrderItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("AutoPay")
        private Boolean autoPay;

        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private Boolean autoRenew;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("ResourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceType;

        private OrderItems(Builder builder) {
            this.amount = builder.amount;
            this.autoPay = builder.autoPay;
            this.autoRenew = builder.autoRenew;
            this.components = builder.components;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.promotionId = builder.promotionId;
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderItems create() {
            return builder().build();
        }

        /**
         * @return amount
         */
        public Integer getAmount() {
            return this.amount;
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
         * @return components
         */
        public java.util.List<Components> getComponents() {
            return this.components;
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
         * @return promotionId
         */
        public String getPromotionId() {
            return this.promotionId;
        }

        /**
         * @return resourceIds
         */
        public java.util.List<String> getResourceIds() {
            return this.resourceIds;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Integer amount; 
            private Boolean autoPay; 
            private Boolean autoRenew; 
            private java.util.List<Components> components; 
            private Integer period; 
            private String periodUnit; 
            private String promotionId; 
            private java.util.List<String> resourceIds; 
            private String resourceType; 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * AutoPay.
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * AutoRenew.
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * Components.
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * PromotionId.
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * ResourceIds.
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DurationPackage</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public OrderItems build() {
                return new OrderItems(this);
            } 

        } 

    }
}
