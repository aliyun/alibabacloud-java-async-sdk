// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostPaidDesktopBillsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostPaidDesktopBillsResponseBody</p>
 */
public class DescribePostPaidDesktopBillsResponseBody extends TeaModel {
    @NameInMap("Bills")
    private java.util.List < Bills> bills;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PostPaidDesktopsBillsUrl")
    private String postPaidDesktopsBillsUrl;

    @NameInMap("PostPaidDesktopsCount")
    private Integer postPaidDesktopsCount;

    @NameInMap("PostPaidDesktopsTotalAmount")
    private Float postPaidDesktopsTotalAmount;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePostPaidDesktopBillsResponseBody(Builder builder) {
        this.bills = builder.bills;
        this.nextToken = builder.nextToken;
        this.postPaidDesktopsBillsUrl = builder.postPaidDesktopsBillsUrl;
        this.postPaidDesktopsCount = builder.postPaidDesktopsCount;
        this.postPaidDesktopsTotalAmount = builder.postPaidDesktopsTotalAmount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostPaidDesktopBillsResponseBody create() {
        return builder().build();
    }

    /**
     * @return bills
     */
    public java.util.List < Bills> getBills() {
        return this.bills;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return postPaidDesktopsBillsUrl
     */
    public String getPostPaidDesktopsBillsUrl() {
        return this.postPaidDesktopsBillsUrl;
    }

    /**
     * @return postPaidDesktopsCount
     */
    public Integer getPostPaidDesktopsCount() {
        return this.postPaidDesktopsCount;
    }

    /**
     * @return postPaidDesktopsTotalAmount
     */
    public Float getPostPaidDesktopsTotalAmount() {
        return this.postPaidDesktopsTotalAmount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Bills> bills; 
        private String nextToken; 
        private String postPaidDesktopsBillsUrl; 
        private Integer postPaidDesktopsCount; 
        private Float postPaidDesktopsTotalAmount; 
        private String requestId; 

        /**
         * Bills.
         */
        public Builder bills(java.util.List < Bills> bills) {
            this.bills = bills;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PostPaidDesktopsBillsUrl.
         */
        public Builder postPaidDesktopsBillsUrl(String postPaidDesktopsBillsUrl) {
            this.postPaidDesktopsBillsUrl = postPaidDesktopsBillsUrl;
            return this;
        }

        /**
         * PostPaidDesktopsCount.
         */
        public Builder postPaidDesktopsCount(Integer postPaidDesktopsCount) {
            this.postPaidDesktopsCount = postPaidDesktopsCount;
            return this;
        }

        /**
         * PostPaidDesktopsTotalAmount.
         */
        public Builder postPaidDesktopsTotalAmount(Float postPaidDesktopsTotalAmount) {
            this.postPaidDesktopsTotalAmount = postPaidDesktopsTotalAmount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePostPaidDesktopBillsResponseBody build() {
            return new DescribePostPaidDesktopBillsResponseBody(this);
        } 

    } 

    public static class Bills extends TeaModel {
        @NameInMap("BillEndTime")
        private String billEndTime;

        @NameInMap("BillId")
        private String billId;

        @NameInMap("BillStartTime")
        private String billStartTime;

        @NameInMap("BillType")
        private String billType;

        @NameInMap("CashPayment")
        private String cashPayment;

        @NameInMap("ChargeItem")
        private String chargeItem;

        @NameInMap("ConsumeTime")
        private String consumeTime;

        @NameInMap("ConsumeType")
        private String consumeType;

        @NameInMap("DiscountPrice")
        private String discountPrice;

        @NameInMap("GoldNote")
        private String goldNote;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("OriginalPrice")
        private String originalPrice;

        @NameInMap("Payment")
        private String payment;

        @NameInMap("Price")
        private String price;

        @NameInMap("PriceUnit")
        private String priceUnit;

        @NameInMap("Product")
        private String product;

        @NameInMap("ProductDetail")
        private String productDetail;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceGroupName")
        private String resourceGroupName;

        @NameInMap("Usage")
        private String usage;

        @NameInMap("UsageUnit")
        private String usageUnit;

        private Bills(Builder builder) {
            this.billEndTime = builder.billEndTime;
            this.billId = builder.billId;
            this.billStartTime = builder.billStartTime;
            this.billType = builder.billType;
            this.cashPayment = builder.cashPayment;
            this.chargeItem = builder.chargeItem;
            this.consumeTime = builder.consumeTime;
            this.consumeType = builder.consumeType;
            this.discountPrice = builder.discountPrice;
            this.goldNote = builder.goldNote;
            this.instanceId = builder.instanceId;
            this.originalPrice = builder.originalPrice;
            this.payment = builder.payment;
            this.price = builder.price;
            this.priceUnit = builder.priceUnit;
            this.product = builder.product;
            this.productDetail = builder.productDetail;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceGroupName = builder.resourceGroupName;
            this.usage = builder.usage;
            this.usageUnit = builder.usageUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Bills create() {
            return builder().build();
        }

        /**
         * @return billEndTime
         */
        public String getBillEndTime() {
            return this.billEndTime;
        }

        /**
         * @return billId
         */
        public String getBillId() {
            return this.billId;
        }

        /**
         * @return billStartTime
         */
        public String getBillStartTime() {
            return this.billStartTime;
        }

        /**
         * @return billType
         */
        public String getBillType() {
            return this.billType;
        }

        /**
         * @return cashPayment
         */
        public String getCashPayment() {
            return this.cashPayment;
        }

        /**
         * @return chargeItem
         */
        public String getChargeItem() {
            return this.chargeItem;
        }

        /**
         * @return consumeTime
         */
        public String getConsumeTime() {
            return this.consumeTime;
        }

        /**
         * @return consumeType
         */
        public String getConsumeType() {
            return this.consumeType;
        }

        /**
         * @return discountPrice
         */
        public String getDiscountPrice() {
            return this.discountPrice;
        }

        /**
         * @return goldNote
         */
        public String getGoldNote() {
            return this.goldNote;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return originalPrice
         */
        public String getOriginalPrice() {
            return this.originalPrice;
        }

        /**
         * @return payment
         */
        public String getPayment() {
            return this.payment;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return priceUnit
         */
        public String getPriceUnit() {
            return this.priceUnit;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return productDetail
         */
        public String getProductDetail() {
            return this.productDetail;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceGroupName
         */
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        /**
         * @return usage
         */
        public String getUsage() {
            return this.usage;
        }

        /**
         * @return usageUnit
         */
        public String getUsageUnit() {
            return this.usageUnit;
        }

        public static final class Builder {
            private String billEndTime; 
            private String billId; 
            private String billStartTime; 
            private String billType; 
            private String cashPayment; 
            private String chargeItem; 
            private String consumeTime; 
            private String consumeType; 
            private String discountPrice; 
            private String goldNote; 
            private String instanceId; 
            private String originalPrice; 
            private String payment; 
            private String price; 
            private String priceUnit; 
            private String product; 
            private String productDetail; 
            private String resourceGroupId; 
            private String resourceGroupName; 
            private String usage; 
            private String usageUnit; 

            /**
             * BillEndTime.
             */
            public Builder billEndTime(String billEndTime) {
                this.billEndTime = billEndTime;
                return this;
            }

            /**
             * BillId.
             */
            public Builder billId(String billId) {
                this.billId = billId;
                return this;
            }

            /**
             * BillStartTime.
             */
            public Builder billStartTime(String billStartTime) {
                this.billStartTime = billStartTime;
                return this;
            }

            /**
             * BillType.
             */
            public Builder billType(String billType) {
                this.billType = billType;
                return this;
            }

            /**
             * CashPayment.
             */
            public Builder cashPayment(String cashPayment) {
                this.cashPayment = cashPayment;
                return this;
            }

            /**
             * ChargeItem.
             */
            public Builder chargeItem(String chargeItem) {
                this.chargeItem = chargeItem;
                return this;
            }

            /**
             * ConsumeTime.
             */
            public Builder consumeTime(String consumeTime) {
                this.consumeTime = consumeTime;
                return this;
            }

            /**
             * ConsumeType.
             */
            public Builder consumeType(String consumeType) {
                this.consumeType = consumeType;
                return this;
            }

            /**
             * DiscountPrice.
             */
            public Builder discountPrice(String discountPrice) {
                this.discountPrice = discountPrice;
                return this;
            }

            /**
             * GoldNote.
             */
            public Builder goldNote(String goldNote) {
                this.goldNote = goldNote;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * OriginalPrice.
             */
            public Builder originalPrice(String originalPrice) {
                this.originalPrice = originalPrice;
                return this;
            }

            /**
             * Payment.
             */
            public Builder payment(String payment) {
                this.payment = payment;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * PriceUnit.
             */
            public Builder priceUnit(String priceUnit) {
                this.priceUnit = priceUnit;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * ProductDetail.
             */
            public Builder productDetail(String productDetail) {
                this.productDetail = productDetail;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceGroupName.
             */
            public Builder resourceGroupName(String resourceGroupName) {
                this.resourceGroupName = resourceGroupName;
                return this;
            }

            /**
             * Usage.
             */
            public Builder usage(String usage) {
                this.usage = usage;
                return this;
            }

            /**
             * UsageUnit.
             */
            public Builder usageUnit(String usageUnit) {
                this.usageUnit = usageUnit;
                return this;
            }

            public Bills build() {
                return new Bills(this);
            } 

        } 

    }
}
