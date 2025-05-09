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
         * PackageCode.
         */
        public Builder packageCode(String packageCode) {
            this.putQueryParameter("PackageCode", packageCode);
            this.packageCode = packageCode;
            return this;
        }

        /**
         * ResellerOwnerUid.
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
     * {@link DescribeMultiPriceRequest} extends {@link TeaModel}
     *
     * <p>DescribeMultiPriceRequest</p>
     */
    public static class OrderItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Amount")
        private Integer amount;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

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

        private OrderItems(Builder builder) {
            this.amount = builder.amount;
            this.components = builder.components;
            this.instanceIds = builder.instanceIds;
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
            private java.util.List<Components> components; 
            private java.util.List<String> instanceIds; 
            private Integer period; 
            private String periodUnit; 
            private String promotionId; 
            private java.util.List<String> resourceIds; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(OrderItems model) {
                this.amount = model.amount;
                this.components = model.components;
                this.instanceIds = model.instanceIds;
                this.period = model.period;
                this.periodUnit = model.periodUnit;
                this.promotionId = model.promotionId;
                this.resourceIds = model.resourceIds;
                this.resourceType = model.resourceType;
            } 

            /**
             * Amount.
             */
            public Builder amount(Integer amount) {
                this.amount = amount;
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
             * InstanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
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
             * ResourceType.
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
