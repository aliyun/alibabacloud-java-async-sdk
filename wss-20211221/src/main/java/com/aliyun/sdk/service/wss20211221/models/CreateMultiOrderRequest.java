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
    @com.aliyun.core.annotation.NameInMap("ChannelCookie")
    private String channelCookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderItems")
    private java.util.List<OrderItems> orderItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Properties")
    private java.util.Map<String, String> properties;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    private CreateMultiOrderRequest(Builder builder) {
        super(builder);
        this.channelCookie = builder.channelCookie;
        this.orderItems = builder.orderItems;
        this.orderType = builder.orderType;
        this.properties = builder.properties;
        this.resellerOwnerUid = builder.resellerOwnerUid;
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
     * @return channelCookie
     */
    public String getChannelCookie() {
        return this.channelCookie;
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

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static final class Builder extends Request.Builder<CreateMultiOrderRequest, Builder> {
        private String channelCookie; 
        private java.util.List<OrderItems> orderItems; 
        private String orderType; 
        private java.util.Map<String, String> properties; 
        private Long resellerOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(CreateMultiOrderRequest request) {
            super(request);
            this.channelCookie = request.channelCookie;
            this.orderItems = request.orderItems;
            this.orderType = request.orderType;
            this.properties = request.properties;
            this.resellerOwnerUid = request.resellerOwnerUid;
        } 

        /**
         * <p>The cookie information used for channel attribution. Specify this parameter if channel attribution information exists. Otherwise, you can leave it empty.</p>
         * 
         * <strong>example:</strong>
         * <p>channel=example</p>
         */
        public Builder channelCookie(String channelCookie) {
            this.putQueryParameter("ChannelCookie", channelCookie);
            this.channelCookie = channelCookie;
            return this;
        }

        /**
         * <p>The product information.</p>
         */
        public Builder orderItems(java.util.List<OrderItems> orderItems) {
            this.putQueryParameter("OrderItems", orderItems);
            this.orderItems = orderItems;
            return this;
        }

        /**
         * <p>The order type.</p>
         * 
         * <strong>example:</strong>
         * <p>create</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The extended properties.</p>
         */
        public Builder properties(java.util.Map<String, String> properties) {
            String propertiesShrink = shrink(properties, "Properties", "json");
            this.putQueryParameter("Properties", propertiesShrink);
            this.properties = properties;
            return this;
        }

        /**
         * <p>The ID of the actual end user. This parameter is required when a reseller partner places an order.</p>
         * 
         * <strong>example:</strong>
         * <p>100000000001</p>
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
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

            private Builder() {
            } 

            private Builder(Components model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the module.</p>
             * 
             * <strong>example:</strong>
             * <p>RegionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the module.</p>
             * <p>The sample values and valid values for each key of the monthly duration package for Enterprise Edition are as follows:</p>
             * <ul>
             * <li>RegionId: cn-shanghai</li>
             * <li>InstanceType: eds.enterprise_office.4c8g</li>
             * <li>DurationType (hours): [Enum] <ul>
             * <li>120</li>
             * <li>250</li>
             * </ul>
             * </li>
             * <li>OsType: [Enum] <ul>
             * <li>Windows</li>
             * <li>Linux</li>
             * </ul>
             * </li>
             * <li>RootDiskSize (GiB): 80</li>
             * <li>RootDiskCategory: [Enum] <ul>
             * <li>cloud_efficiency (ultra cloud disk)</li>
             * <li>cloud_auto (ESSD AutoPL cloud disk)</li>
             * <li>cloud_essd (enhanced standard SSD, supported only by specific instance types)</li>
             * </ul>
             * </li>
             * <li>RootPerformanceLevel: [Enum] <ul>
             * <li>PL0</li>
             * <li>PL1</li>
             * <li>PL2</li>
             * <li>PL3</li>
             * </ul>
             * </li>
             * <li>DataDiskSize (GiB): Valid values are the same as those of RootDiskSize.</li>
             * <li>DataDiskCategory: Valid values are the same as those of RootDiskCategory.</li>
             * <li>DataPerformanceLevel: Valid values are the same as those of RootPerformanceLevel.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
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

        @com.aliyun.core.annotation.NameInMap("BuyChange")
        private Boolean buyChange;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("PaidCallBackUrl")
        private String paidCallBackUrl;

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

        @com.aliyun.core.annotation.NameInMap("UnifiedExpireDay")
        private Integer unifiedExpireDay;

        private OrderItems(Builder builder) {
            this.amount = builder.amount;
            this.autoPay = builder.autoPay;
            this.autoRenew = builder.autoRenew;
            this.buyChange = builder.buyChange;
            this.components = builder.components;
            this.instanceIds = builder.instanceIds;
            this.paidCallBackUrl = builder.paidCallBackUrl;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.promotionId = builder.promotionId;
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
            this.unifiedExpireDay = builder.unifiedExpireDay;
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
         * @return buyChange
         */
        public Boolean getBuyChange() {
            return this.buyChange;
        }

        /**
         * @return components
         */
        public java.util.List<Components> getComponents() {
            return this.components;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return paidCallBackUrl
         */
        public String getPaidCallBackUrl() {
            return this.paidCallBackUrl;
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

        /**
         * @return unifiedExpireDay
         */
        public Integer getUnifiedExpireDay() {
            return this.unifiedExpireDay;
        }

        public static final class Builder {
            private Integer amount; 
            private Boolean autoPay; 
            private Boolean autoRenew; 
            private Boolean buyChange; 
            private java.util.List<Components> components; 
            private java.util.List<String> instanceIds; 
            private String paidCallBackUrl; 
            private Integer period; 
            private String periodUnit; 
            private String promotionId; 
            private java.util.List<String> resourceIds; 
            private String resourceType; 
            private Integer unifiedExpireDay; 

            private Builder() {
            } 

            private Builder(OrderItems model) {
                this.amount = model.amount;
                this.autoPay = model.autoPay;
                this.autoRenew = model.autoRenew;
                this.buyChange = model.buyChange;
                this.components = model.components;
                this.instanceIds = model.instanceIds;
                this.paidCallBackUrl = model.paidCallBackUrl;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.promotionId = model.promotionId;
                this.resourceIds = model.resourceIds;
                this.resourceType = model.resourceType;
                this.unifiedExpireDay = model.unifiedExpireDay;
            } 

            /**
             * <p>The purchase quantity.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
                return this;
            }

            /**
             * <p>Specifies whether to enable automatic payment.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoPay(Boolean autoPay) {
                this.autoPay = autoPay;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto-renewal.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoRenew(Boolean autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * <p>Specifies whether to modify the configuration of the monthly duration package.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder buyChange(Boolean buyChange) {
                this.buyChange = buyChange;
                return this;
            }

            /**
             * <p>The product modules.</p>
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The list of instance IDs.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The callback URL after the order is paid. Specify the URL to receive the payment result based on your business requirements.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/order/paid">https://example.com/order/paid</a></p>
             */
            public Builder paidCallBackUrl(String paidCallBackUrl) {
                this.paidCallBackUrl = paidCallBackUrl;
                return this;
            }

            /**
             * <p>The subscription period. Valid values:</p>
             * <ul>
             * <li><p>If <code>PeriodUnit</code> is set to <code>Year</code>, valid values are 1, 2, 3, and 5.</p>
             * </li>
             * <li><p>If <code>PeriodUnit</code> is set to <code>Month</code>, valid values are 1, 2, 3, and 6.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The unit of the subscription period for the subscription instance.</p>
             * <blockquote>
             * <p>This parameter is required only when the billing method of the instance is subscription. This parameter is case-sensitive. Make sure that the spelling is correct.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Year</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The ID of the promotion.</p>
             * 
             * <strong>example:</strong>
             * <p>youhuiquan_promotion_option_id_for_blank</p>
             */
            public Builder promotionId(String promotionId) {
                this.promotionId = promotionId;
                return this;
            }

            /**
             * <p>The list of resource IDs.</p>
             * <blockquote>
             * <p>For the monthly duration package, this parameter corresponds to the cloud desktop ID. This parameter is required when OrderType is not set to <code>create</code>.</p>
             * </blockquote>
             */
            public Builder resourceIds(java.util.List<String> resourceIds) {
                this.resourceIds = resourceIds;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * <blockquote>
             * <p>This parameter is case-sensitive. Make sure that the spelling is correct.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DurationPackage</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The unified expiration date, which can be a day from the 1st to the 28th of a month. If this parameter is not specified, the standard renewal process is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder unifiedExpireDay(Integer unifiedExpireDay) {
                this.unifiedExpireDay = unifiedExpireDay;
                return this;
            }

            public OrderItems build() {
                return new OrderItems(this);
            } 

        } 

    }
}
