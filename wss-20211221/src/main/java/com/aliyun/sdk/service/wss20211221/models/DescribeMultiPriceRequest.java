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
 * {@link DescribeMultiPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeMultiPriceRequest</p>
 */
public class DescribeMultiPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderItems")
    private java.util.List<OrderItems> orderItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PackageCode")
    private String packageCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    private DescribeMultiPriceRequest(Builder builder) {
        super(builder);
        this.orderItems = builder.orderItems;
        this.orderType = builder.orderType;
        this.packageCode = builder.packageCode;
        this.resellerOwnerUid = builder.resellerOwnerUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMultiPriceRequest create() {
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
     * @return packageCode
     */
    public String getPackageCode() {
        return this.packageCode;
    }

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static final class Builder extends Request.Builder<DescribeMultiPriceRequest, Builder> {
        private java.util.List<OrderItems> orderItems; 
        private String orderType; 
        private String packageCode; 
        private Long resellerOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMultiPriceRequest request) {
            super(request);
            this.orderItems = request.orderItems;
            this.orderType = request.orderType;
            this.packageCode = request.packageCode;
            this.resellerOwnerUid = request.resellerOwnerUid;
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
         * <p>The package code. You do not need to specify this parameter for non-package types.</p>
         * 
         * <strong>example:</strong>
         * <p>pacakge</p>
         */
        public Builder packageCode(String packageCode) {
            this.putQueryParameter("PackageCode", packageCode);
            this.packageCode = packageCode;
            return this;
        }

        /**
         * <p>The user ID for resource ownership in the reseller pattern. You do not need to specify this parameter for non-reseller patterns.</p>
         * 
         * <strong>example:</strong>
         * <p>182864463481****</p>
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        @Override
        public DescribeMultiPriceRequest build() {
            return new DescribeMultiPriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMultiPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceRequest</p>
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
             * <p>The following section describes the sample values and valid values of each key for the Enterprise Edition monthly package:</p>
             * <ul>
             * <li>RegionId: cn-shanghai</li>
             * <li>InstanceType: eds.enterprise_office.4c8g</li>
             * <li>DurationType (hours): Valid values: <ul>
             * <li>120</li>
             * <li>250</li>
             * </ul>
             * </li>
             * <li>OsType: Valid values: <ul>
             * <li>Windows</li>
             * <li>Linux</li>
             * </ul>
             * </li>
             * <li>RootDiskSize (GiB): 80</li>
             * <li>RootDiskCategory: Valid values: <ul>
             * <li>cloud_efficiency (ultra cloud disk)</li>
             * <li>cloud_auto (ESSD AutoPL cloud disk)</li>
             * <li>cloud_essd (enhanced standard SSD, supported only by specific instance types)</li>
             * </ul>
             * </li>
             * <li>RootPerformanceLevel: Valid values: <ul>
             * <li>PL0</li>
             * <li>PL1</li>
             * <li>PL2</li>
             * <li>PL3</li>
             * </ul>
             * </li>
             * <li>DataDiskSize (GiB): Same as RootDiskSize.</li>
             * <li>DataDiskCategory: Same as RootDiskCategory.</li>
             * <li>DataPerformanceLevel: Same as RootPerformanceLevel.</li>
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
     * {@link DescribeMultiPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceRequest</p>
     */
    public static class OrderItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("InstanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PromotionId")
        private String promotionId;

        @com.aliyun.core.annotation.NameInMap("ResourceIds")
        private java.util.List<String> resourceIds;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("SavingPlanPeriod")
        private String savingPlanPeriod;

        @com.aliyun.core.annotation.NameInMap("UnifiedExpireDay")
        private Integer unifiedExpireDay;

        private OrderItems(Builder builder) {
            this.amount = builder.amount;
            this.components = builder.components;
            this.data = builder.data;
            this.instanceIds = builder.instanceIds;
            this.period = builder.period;
            this.periodUnit = builder.periodUnit;
            this.promotionId = builder.promotionId;
            this.resourceIds = builder.resourceIds;
            this.resourceType = builder.resourceType;
            this.savingPlanPeriod = builder.savingPlanPeriod;
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
         * @return components
         */
        public java.util.List<Components> getComponents() {
            return this.components;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
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
         * @return savingPlanPeriod
         */
        public String getSavingPlanPeriod() {
            return this.savingPlanPeriod;
        }

        /**
         * @return unifiedExpireDay
         */
        public Integer getUnifiedExpireDay() {
            return this.unifiedExpireDay;
        }

        public static final class Builder {
            private Integer amount; 
            private java.util.List<Components> components; 
            private String data; 
            private java.util.List<String> instanceIds; 
            private Integer period; 
            private String periodUnit; 
            private String promotionId; 
            private java.util.List<String> resourceIds; 
            private String resourceType; 
            private String savingPlanPeriod; 
            private Integer unifiedExpireDay; 

            private Builder() {
            } 

            private Builder(OrderItems model) {
                this.amount = model.amount;
                this.components = model.components;
                this.data = model.data;
                this.instanceIds = model.instanceIds;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.promotionId = model.promotionId;
                this.resourceIds = model.resourceIds;
                this.resourceType = model.resourceType;
                this.savingPlanPeriod = model.savingPlanPeriod;
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
             * <p>The list of product modules.</p>
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The extended data of the order item, which is passed as a JSON string. The structure varies based on the order scenario. For the billing method change scenario, you can pass the instance and the list of target billing methods. If no extended data is required, you can leave this parameter empty.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;resourceType&quot;:&quot;Desktop&quot;,&quot;chargeType&quot;:&quot;POSTPAY&quot;,&quot;instanceId&quot;:&quot;ecd-6wye9optu0kag****&quot;}]</p>
             */
            public Builder data(String data) {
                this.data = data;
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
             * <p>The subscription period. Valid values:</p>
             * <ul>
             * <li><p>When <code>PeriodUnit</code> is set to <code>Year</code>: 1, 2, and 3.</p>
             * </li>
             * <li><p>When <code>PeriodUnit</code> is set to <code>Month</code>: 1, 2, 3, and 6.</p>
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
             * <p>The unit of the subscription period.</p>
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
             * 
             * <strong>example:</strong>
             * <p>DurationPackage</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The subscription period of the savings plan. For example, 1Year indicates one year.</p>
             * 
             * <strong>example:</strong>
             * <p>1Year</p>
             */
            public Builder savingPlanPeriod(String savingPlanPeriod) {
                this.savingPlanPeriod = savingPlanPeriod;
                return this;
            }

            /**
             * <p>The unified expiration date, which can be a day from the 1st to the 28th of a month. If you do not specify this parameter, the instance is renewed in the standard way.</p>
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
