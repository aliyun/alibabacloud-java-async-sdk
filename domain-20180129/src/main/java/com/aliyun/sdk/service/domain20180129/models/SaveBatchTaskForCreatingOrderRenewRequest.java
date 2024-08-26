// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForCreatingOrderRenewRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForCreatingOrderRenewRequest</p>
 */
public class SaveBatchTaskForCreatingOrderRenewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderRenewParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OrderRenewParam> orderRenewParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionNo")
    private String promotionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseCoupon")
    private Boolean useCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsePromotion")
    private Boolean usePromotion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveBatchTaskForCreatingOrderRenewRequest(Builder builder) {
        super(builder);
        this.couponNo = builder.couponNo;
        this.lang = builder.lang;
        this.orderRenewParam = builder.orderRenewParam;
        this.promotionNo = builder.promotionNo;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForCreatingOrderRenewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return orderRenewParam
     */
    public java.util.List < OrderRenewParam> getOrderRenewParam() {
        return this.orderRenewParam;
    }

    /**
     * @return promotionNo
     */
    public String getPromotionNo() {
        return this.promotionNo;
    }

    /**
     * @return useCoupon
     */
    public Boolean getUseCoupon() {
        return this.useCoupon;
    }

    /**
     * @return usePromotion
     */
    public Boolean getUsePromotion() {
        return this.usePromotion;
    }

    /**
     * @return userClientIp
     */
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public static final class Builder extends Request.Builder<SaveBatchTaskForCreatingOrderRenewRequest, Builder> {
        private String couponNo; 
        private String lang; 
        private java.util.List < OrderRenewParam> orderRenewParam; 
        private String promotionNo; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForCreatingOrderRenewRequest request) {
            super(request);
            this.couponNo = request.couponNo;
            this.lang = request.lang;
            this.orderRenewParam = request.orderRenewParam;
            this.promotionNo = request.promotionNo;
            this.useCoupon = request.useCoupon;
            this.usePromotion = request.usePromotion;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * CouponNo.
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * OrderRenewParam.
         */
        public Builder orderRenewParam(java.util.List < OrderRenewParam> orderRenewParam) {
            this.putQueryParameter("OrderRenewParam", orderRenewParam);
            this.orderRenewParam = orderRenewParam;
            return this;
        }

        /**
         * PromotionNo.
         */
        public Builder promotionNo(String promotionNo) {
            this.putQueryParameter("PromotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * UseCoupon.
         */
        public Builder useCoupon(Boolean useCoupon) {
            this.putQueryParameter("UseCoupon", useCoupon);
            this.useCoupon = useCoupon;
            return this;
        }

        /**
         * UsePromotion.
         */
        public Builder usePromotion(Boolean usePromotion) {
            this.putQueryParameter("UsePromotion", usePromotion);
            this.usePromotion = usePromotion;
            return this;
        }

        /**
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveBatchTaskForCreatingOrderRenewRequest build() {
            return new SaveBatchTaskForCreatingOrderRenewRequest(this);
        } 

    } 

    public static class OrderRenewParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentExpirationDate")
        private Long currentExpirationDate;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDuration")
        private Integer subscriptionDuration;

        private OrderRenewParam(Builder builder) {
            this.currentExpirationDate = builder.currentExpirationDate;
            this.domainName = builder.domainName;
            this.subscriptionDuration = builder.subscriptionDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderRenewParam create() {
            return builder().build();
        }

        /**
         * @return currentExpirationDate
         */
        public Long getCurrentExpirationDate() {
            return this.currentExpirationDate;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return subscriptionDuration
         */
        public Integer getSubscriptionDuration() {
            return this.subscriptionDuration;
        }

        public static final class Builder {
            private Long currentExpirationDate; 
            private String domainName; 
            private Integer subscriptionDuration; 

            /**
             * CurrentExpirationDate.
             */
            public Builder currentExpirationDate(Long currentExpirationDate) {
                this.currentExpirationDate = currentExpirationDate;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * SubscriptionDuration.
             */
            public Builder subscriptionDuration(Integer subscriptionDuration) {
                this.subscriptionDuration = subscriptionDuration;
                return this;
            }

            public OrderRenewParam build() {
                return new OrderRenewParam(this);
            } 

        } 

    }
}
