// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bss20140714.models;

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
 * {@link DescribeCouponListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCouponListResponseBody</p>
 */
public class DescribeCouponListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Coupons")
    private Coupons coupons;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCouponListResponseBody(Builder builder) {
        this.coupons = builder.coupons;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCouponListResponseBody create() {
        return builder().build();
    }

    /**
     * @return coupons
     */
    public Coupons getCoupons() {
        return this.coupons;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Coupons coupons; 
        private String requestId; 

        /**
         * Coupons.
         */
        public Builder coupons(Coupons coupons) {
            this.coupons = coupons;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCouponListResponseBody build() {
            return new DescribeCouponListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCouponListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCouponListResponseBody</p>
     */
    public static class ProductCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private java.util.List<String> productCode;

        private ProductCodes(Builder builder) {
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductCodes create() {
            return builder().build();
        }

        /**
         * @return productCode
         */
        public java.util.List<String> getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private java.util.List<String> productCode; 

            /**
             * ProductCode.
             */
            public Builder productCode(java.util.List<String> productCode) {
                this.productCode = productCode;
                return this;
            }

            public ProductCodes build() {
                return new ProductCodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCouponListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCouponListResponseBody</p>
     */
    public static class TradeTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TradeType")
        private java.util.List<String> tradeType;

        private TradeTypes(Builder builder) {
            this.tradeType = builder.tradeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TradeTypes create() {
            return builder().build();
        }

        /**
         * @return tradeType
         */
        public java.util.List<String> getTradeType() {
            return this.tradeType;
        }

        public static final class Builder {
            private java.util.List<String> tradeType; 

            /**
             * TradeType.
             */
            public Builder tradeType(java.util.List<String> tradeType) {
                this.tradeType = tradeType;
                return this;
            }

            public TradeTypes build() {
                return new TradeTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCouponListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCouponListResponseBody</p>
     */
    public static class Coupon extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Application")
        private String application;

        @com.aliyun.core.annotation.NameInMap("BalanceAmount")
        private String balanceAmount;

        @com.aliyun.core.annotation.NameInMap("CouponNumber")
        private String couponNumber;

        @com.aliyun.core.annotation.NameInMap("CouponTemplateId")
        private Long couponTemplateId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DeliveryTime")
        private String deliveryTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredAmount")
        private String expiredAmount;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("FrozenAmount")
        private String frozenAmount;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("PriceLimit")
        private String priceLimit;

        @com.aliyun.core.annotation.NameInMap("ProductCodes")
        private ProductCodes productCodes;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalAmount")
        private String totalAmount;

        @com.aliyun.core.annotation.NameInMap("TradeTypes")
        private TradeTypes tradeTypes;

        private Coupon(Builder builder) {
            this.application = builder.application;
            this.balanceAmount = builder.balanceAmount;
            this.couponNumber = builder.couponNumber;
            this.couponTemplateId = builder.couponTemplateId;
            this.creationTime = builder.creationTime;
            this.deliveryTime = builder.deliveryTime;
            this.description = builder.description;
            this.expiredAmount = builder.expiredAmount;
            this.expiredTime = builder.expiredTime;
            this.frozenAmount = builder.frozenAmount;
            this.modificationTime = builder.modificationTime;
            this.priceLimit = builder.priceLimit;
            this.productCodes = builder.productCodes;
            this.status = builder.status;
            this.totalAmount = builder.totalAmount;
            this.tradeTypes = builder.tradeTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coupon create() {
            return builder().build();
        }

        /**
         * @return application
         */
        public String getApplication() {
            return this.application;
        }

        /**
         * @return balanceAmount
         */
        public String getBalanceAmount() {
            return this.balanceAmount;
        }

        /**
         * @return couponNumber
         */
        public String getCouponNumber() {
            return this.couponNumber;
        }

        /**
         * @return couponTemplateId
         */
        public Long getCouponTemplateId() {
            return this.couponTemplateId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return deliveryTime
         */
        public String getDeliveryTime() {
            return this.deliveryTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredAmount
         */
        public String getExpiredAmount() {
            return this.expiredAmount;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return frozenAmount
         */
        public String getFrozenAmount() {
            return this.frozenAmount;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return priceLimit
         */
        public String getPriceLimit() {
            return this.priceLimit;
        }

        /**
         * @return productCodes
         */
        public ProductCodes getProductCodes() {
            return this.productCodes;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalAmount
         */
        public String getTotalAmount() {
            return this.totalAmount;
        }

        /**
         * @return tradeTypes
         */
        public TradeTypes getTradeTypes() {
            return this.tradeTypes;
        }

        public static final class Builder {
            private String application; 
            private String balanceAmount; 
            private String couponNumber; 
            private Long couponTemplateId; 
            private String creationTime; 
            private String deliveryTime; 
            private String description; 
            private String expiredAmount; 
            private String expiredTime; 
            private String frozenAmount; 
            private String modificationTime; 
            private String priceLimit; 
            private ProductCodes productCodes; 
            private String status; 
            private String totalAmount; 
            private TradeTypes tradeTypes; 

            /**
             * Application.
             */
            public Builder application(String application) {
                this.application = application;
                return this;
            }

            /**
             * BalanceAmount.
             */
            public Builder balanceAmount(String balanceAmount) {
                this.balanceAmount = balanceAmount;
                return this;
            }

            /**
             * CouponNumber.
             */
            public Builder couponNumber(String couponNumber) {
                this.couponNumber = couponNumber;
                return this;
            }

            /**
             * CouponTemplateId.
             */
            public Builder couponTemplateId(Long couponTemplateId) {
                this.couponTemplateId = couponTemplateId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DeliveryTime.
             */
            public Builder deliveryTime(String deliveryTime) {
                this.deliveryTime = deliveryTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ExpiredAmount.
             */
            public Builder expiredAmount(String expiredAmount) {
                this.expiredAmount = expiredAmount;
                return this;
            }

            /**
             * ExpiredTime.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * FrozenAmount.
             */
            public Builder frozenAmount(String frozenAmount) {
                this.frozenAmount = frozenAmount;
                return this;
            }

            /**
             * ModificationTime.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * PriceLimit.
             */
            public Builder priceLimit(String priceLimit) {
                this.priceLimit = priceLimit;
                return this;
            }

            /**
             * ProductCodes.
             */
            public Builder productCodes(ProductCodes productCodes) {
                this.productCodes = productCodes;
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
             * TotalAmount.
             */
            public Builder totalAmount(String totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }

            /**
             * TradeTypes.
             */
            public Builder tradeTypes(TradeTypes tradeTypes) {
                this.tradeTypes = tradeTypes;
                return this;
            }

            public Coupon build() {
                return new Coupon(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCouponListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCouponListResponseBody</p>
     */
    public static class Coupons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Coupon")
        private java.util.List<Coupon> coupon;

        private Coupons(Builder builder) {
            this.coupon = builder.coupon;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Coupons create() {
            return builder().build();
        }

        /**
         * @return coupon
         */
        public java.util.List<Coupon> getCoupon() {
            return this.coupon;
        }

        public static final class Builder {
            private java.util.List<Coupon> coupon; 

            /**
             * Coupon.
             */
            public Builder coupon(java.util.List<Coupon> coupon) {
                this.coupon = coupon;
                return this;
            }

            public Coupons build() {
                return new Coupons(this);
            } 

        } 

    }
}
