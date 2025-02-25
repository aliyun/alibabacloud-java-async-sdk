// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailadvqa20230417.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSaveOrderPopRequest} extends {@link RequestModel}
 *
 * <p>BatchSaveOrderPopRequest</p>
 */
public class BatchSaveOrderPopRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Orders")
    private java.util.List < Orders> orders;

    private BatchSaveOrderPopRequest(Builder builder) {
        super(builder);
        this.orders = builder.orders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSaveOrderPopRequest create() {
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

    public static final class Builder extends Request.Builder<BatchSaveOrderPopRequest, Builder> {
        private java.util.List < Orders> orders; 

        private Builder() {
            super();
        } 

        private Builder(BatchSaveOrderPopRequest request) {
            super(request);
            this.orders = request.orders;
        } 

        /**
         * Orders.
         */
        public Builder orders(java.util.List < Orders> orders) {
            String ordersShrink = shrink(orders, "Orders", "json");
            this.putQueryParameter("Orders", ordersShrink);
            this.orders = orders;
            return this;
        }

        @Override
        public BatchSaveOrderPopRequest build() {
            return new BatchSaveOrderPopRequest(this);
        } 

    } 

    public static class SubOrderModelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Feature")
        private String feature;

        @com.aliyun.core.annotation.NameInMap("OpenSubOrderId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openSubOrderId;

        @com.aliyun.core.annotation.NameInMap("OrderPayment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String orderPayment;

        @com.aliyun.core.annotation.NameInMap("OutProductId")
        private String outProductId;

        @com.aliyun.core.annotation.NameInMap("ProductAmount")
        @com.aliyun.core.annotation.Validation(required = true)
        private String productAmount;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("RefundStatus")
        private String refundStatus;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalFee")
        @com.aliyun.core.annotation.Validation(required = true)
        private String totalFee;

        private SubOrderModelList(Builder builder) {
            this.feature = builder.feature;
            this.openSubOrderId = builder.openSubOrderId;
            this.orderPayment = builder.orderPayment;
            this.outProductId = builder.outProductId;
            this.productAmount = builder.productAmount;
            this.productId = builder.productId;
            this.productName = builder.productName;
            this.refundStatus = builder.refundStatus;
            this.status = builder.status;
            this.totalFee = builder.totalFee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubOrderModelList create() {
            return builder().build();
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return openSubOrderId
         */
        public String getOpenSubOrderId() {
            return this.openSubOrderId;
        }

        /**
         * @return orderPayment
         */
        public String getOrderPayment() {
            return this.orderPayment;
        }

        /**
         * @return outProductId
         */
        public String getOutProductId() {
            return this.outProductId;
        }

        /**
         * @return productAmount
         */
        public String getProductAmount() {
            return this.productAmount;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return refundStatus
         */
        public String getRefundStatus() {
            return this.refundStatus;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalFee
         */
        public String getTotalFee() {
            return this.totalFee;
        }

        public static final class Builder {
            private String feature; 
            private String openSubOrderId; 
            private String orderPayment; 
            private String outProductId; 
            private String productAmount; 
            private String productId; 
            private String productName; 
            private String refundStatus; 
            private String status; 
            private String totalFee; 

            /**
             * Feature.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * OpenSubOrderId.
             */
            public Builder openSubOrderId(String openSubOrderId) {
                this.openSubOrderId = openSubOrderId;
                return this;
            }

            /**
             * OrderPayment.
             */
            public Builder orderPayment(String orderPayment) {
                this.orderPayment = orderPayment;
                return this;
            }

            /**
             * OutProductId.
             */
            public Builder outProductId(String outProductId) {
                this.outProductId = outProductId;
                return this;
            }

            /**
             * ProductAmount.
             */
            public Builder productAmount(String productAmount) {
                this.productAmount = productAmount;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * RefundStatus.
             */
            public Builder refundStatus(String refundStatus) {
                this.refundStatus = refundStatus;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TotalFee.
             */
            public Builder totalFee(String totalFee) {
                this.totalFee = totalFee;
                return this;
            }

            public SubOrderModelList build() {
                return new SubOrderModelList(this);
            } 

        } 

    }
    public static class Orders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelCode;

        @com.aliyun.core.annotation.NameInMap("ChannelOpenId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelOpenId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Feature")
        private String feature;

        @com.aliyun.core.annotation.NameInMap("OpenMerchantId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openMerchantId;

        @com.aliyun.core.annotation.NameInMap("OpenOrderId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String openOrderId;

        @com.aliyun.core.annotation.NameInMap("OrderCreateTime")
        @com.aliyun.core.annotation.Validation(required = true)
        private String orderCreateTime;

        @com.aliyun.core.annotation.NameInMap("OrderPayment")
        @com.aliyun.core.annotation.Validation(required = true)
        private String orderPayment;

        @com.aliyun.core.annotation.NameInMap("PayTime")
        private String payTime;

        @com.aliyun.core.annotation.NameInMap("PlatformType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String platformType;

        @com.aliyun.core.annotation.NameInMap("ShopId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String shopId;

        @com.aliyun.core.annotation.NameInMap("Status")
        @com.aliyun.core.annotation.Validation(required = true)
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubOrderModelList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < SubOrderModelList> subOrderModelList;

        @com.aliyun.core.annotation.NameInMap("TotalFee")
        @com.aliyun.core.annotation.Validation(required = true)
        private String totalFee;

        @com.aliyun.core.annotation.NameInMap("buyerOpenUid")
        private String buyerOpenUid;

        private Orders(Builder builder) {
            this.channelCode = builder.channelCode;
            this.channelOpenId = builder.channelOpenId;
            this.endTime = builder.endTime;
            this.feature = builder.feature;
            this.openMerchantId = builder.openMerchantId;
            this.openOrderId = builder.openOrderId;
            this.orderCreateTime = builder.orderCreateTime;
            this.orderPayment = builder.orderPayment;
            this.payTime = builder.payTime;
            this.platformType = builder.platformType;
            this.shopId = builder.shopId;
            this.status = builder.status;
            this.subOrderModelList = builder.subOrderModelList;
            this.totalFee = builder.totalFee;
            this.buyerOpenUid = builder.buyerOpenUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Orders create() {
            return builder().build();
        }

        /**
         * @return channelCode
         */
        public String getChannelCode() {
            return this.channelCode;
        }

        /**
         * @return channelOpenId
         */
        public String getChannelOpenId() {
            return this.channelOpenId;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return feature
         */
        public String getFeature() {
            return this.feature;
        }

        /**
         * @return openMerchantId
         */
        public String getOpenMerchantId() {
            return this.openMerchantId;
        }

        /**
         * @return openOrderId
         */
        public String getOpenOrderId() {
            return this.openOrderId;
        }

        /**
         * @return orderCreateTime
         */
        public String getOrderCreateTime() {
            return this.orderCreateTime;
        }

        /**
         * @return orderPayment
         */
        public String getOrderPayment() {
            return this.orderPayment;
        }

        /**
         * @return payTime
         */
        public String getPayTime() {
            return this.payTime;
        }

        /**
         * @return platformType
         */
        public String getPlatformType() {
            return this.platformType;
        }

        /**
         * @return shopId
         */
        public String getShopId() {
            return this.shopId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subOrderModelList
         */
        public java.util.List < SubOrderModelList> getSubOrderModelList() {
            return this.subOrderModelList;
        }

        /**
         * @return totalFee
         */
        public String getTotalFee() {
            return this.totalFee;
        }

        /**
         * @return buyerOpenUid
         */
        public String getBuyerOpenUid() {
            return this.buyerOpenUid;
        }

        public static final class Builder {
            private String channelCode; 
            private String channelOpenId; 
            private String endTime; 
            private String feature; 
            private String openMerchantId; 
            private String openOrderId; 
            private String orderCreateTime; 
            private String orderPayment; 
            private String payTime; 
            private String platformType; 
            private String shopId; 
            private String status; 
            private java.util.List < SubOrderModelList> subOrderModelList; 
            private String totalFee; 
            private String buyerOpenUid; 

            /**
             * ChannelCode.
             */
            public Builder channelCode(String channelCode) {
                this.channelCode = channelCode;
                return this;
            }

            /**
             * ChannelOpenId.
             */
            public Builder channelOpenId(String channelOpenId) {
                this.channelOpenId = channelOpenId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Feature.
             */
            public Builder feature(String feature) {
                this.feature = feature;
                return this;
            }

            /**
             * OpenMerchantId.
             */
            public Builder openMerchantId(String openMerchantId) {
                this.openMerchantId = openMerchantId;
                return this;
            }

            /**
             * OpenOrderId.
             */
            public Builder openOrderId(String openOrderId) {
                this.openOrderId = openOrderId;
                return this;
            }

            /**
             * OrderCreateTime.
             */
            public Builder orderCreateTime(String orderCreateTime) {
                this.orderCreateTime = orderCreateTime;
                return this;
            }

            /**
             * OrderPayment.
             */
            public Builder orderPayment(String orderPayment) {
                this.orderPayment = orderPayment;
                return this;
            }

            /**
             * PayTime.
             */
            public Builder payTime(String payTime) {
                this.payTime = payTime;
                return this;
            }

            /**
             * PlatformType.
             */
            public Builder platformType(String platformType) {
                this.platformType = platformType;
                return this;
            }

            /**
             * ShopId.
             */
            public Builder shopId(String shopId) {
                this.shopId = shopId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SubOrderModelList.
             */
            public Builder subOrderModelList(java.util.List < SubOrderModelList> subOrderModelList) {
                this.subOrderModelList = subOrderModelList;
                return this;
            }

            /**
             * TotalFee.
             */
            public Builder totalFee(String totalFee) {
                this.totalFee = totalFee;
                return this;
            }

            /**
             * buyerOpenUid.
             */
            public Builder buyerOpenUid(String buyerOpenUid) {
                this.buyerOpenUid = buyerOpenUid;
                return this;
            }

            public Orders build() {
                return new Orders(this);
            } 

        } 

    }
}
