// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForCreatingOrderRedeemRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForCreatingOrderRedeemRequest</p>
 */
public class SaveBatchTaskForCreatingOrderRedeemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderRedeemParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OrderRedeemParam> orderRedeemParam;

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

    private SaveBatchTaskForCreatingOrderRedeemRequest(Builder builder) {
        super(builder);
        this.couponNo = builder.couponNo;
        this.lang = builder.lang;
        this.orderRedeemParam = builder.orderRedeemParam;
        this.promotionNo = builder.promotionNo;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForCreatingOrderRedeemRequest create() {
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
     * @return orderRedeemParam
     */
    public java.util.List < OrderRedeemParam> getOrderRedeemParam() {
        return this.orderRedeemParam;
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

    public static final class Builder extends Request.Builder<SaveBatchTaskForCreatingOrderRedeemRequest, Builder> {
        private String couponNo; 
        private String lang; 
        private java.util.List < OrderRedeemParam> orderRedeemParam; 
        private String promotionNo; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForCreatingOrderRedeemRequest request) {
            super(request);
            this.couponNo = request.couponNo;
            this.lang = request.lang;
            this.orderRedeemParam = request.orderRedeemParam;
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
         * OrderRedeemParam.
         */
        public Builder orderRedeemParam(java.util.List < OrderRedeemParam> orderRedeemParam) {
            this.putQueryParameter("OrderRedeemParam", orderRedeemParam);
            this.orderRedeemParam = orderRedeemParam;
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
        public SaveBatchTaskForCreatingOrderRedeemRequest build() {
            return new SaveBatchTaskForCreatingOrderRedeemRequest(this);
        } 

    } 

    public static class OrderRedeemParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentExpirationDate")
        private Long currentExpirationDate;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        private OrderRedeemParam(Builder builder) {
            this.currentExpirationDate = builder.currentExpirationDate;
            this.domainName = builder.domainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderRedeemParam create() {
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

        public static final class Builder {
            private Long currentExpirationDate; 
            private String domainName; 

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

            public OrderRedeemParam build() {
                return new OrderRedeemParam(this);
            } 

        } 

    }
}
