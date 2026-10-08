// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
    private java.util.List<OrderRenewParam> orderRenewParam;

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
    public java.util.List<OrderRenewParam> getOrderRenewParam() {
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
        private java.util.List<OrderRenewParam> orderRenewParam; 
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
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12312412</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The language of the error messages. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * <p>Default value: <strong>en</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The parameters for each domain name to be renewed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder orderRenewParam(java.util.List<OrderRenewParam> orderRenewParam) {
            this.putQueryParameter("OrderRenewParam", orderRenewParam);
            this.orderRenewParam = orderRenewParam;
            return this;
        }

        /**
         * <p>The promotion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123123123</p>
         */
        public Builder promotionNo(String promotionNo) {
            this.putQueryParameter("PromotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: Do not use a coupon.</p>
         * </li>
         * <li><p><strong>true</strong>: Use a coupon.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useCoupon(Boolean useCoupon) {
            this.putQueryParameter("UseCoupon", useCoupon);
            this.useCoupon = useCoupon;
            return this;
        }

        /**
         * <p>Specifies whether to use a promotion. Valid values:</p>
         * <ul>
         * <li><p><strong>false</strong>: Do not use a promotion.</p>
         * </li>
         * <li><p><strong>true</strong>: Use a promotion.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder usePromotion(Boolean usePromotion) {
            this.putQueryParameter("UsePromotion", usePromotion);
            this.usePromotion = usePromotion;
            return this;
        }

        /**
         * <p>The user\&quot;s IP address. You can set this parameter to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
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

    /**
     * 
     * {@link SaveBatchTaskForCreatingOrderRenewRequest} extends {@link TeaModel}
     *
     * <p>SaveBatchTaskForCreatingOrderRenewRequest</p>
     */
    public static class OrderRenewParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentExpirationDate")
        private Long currentExpirationDate;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("PermitPremiumRenew")
        private Boolean permitPremiumRenew;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDuration")
        private Integer subscriptionDuration;

        private OrderRenewParam(Builder builder) {
            this.currentExpirationDate = builder.currentExpirationDate;
            this.domainName = builder.domainName;
            this.permitPremiumRenew = builder.permitPremiumRenew;
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
         * @return permitPremiumRenew
         */
        public Boolean getPermitPremiumRenew() {
            return this.permitPremiumRenew;
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
            private Boolean permitPremiumRenew; 
            private Integer subscriptionDuration; 

            private Builder() {
            } 

            private Builder(OrderRenewParam model) {
                this.currentExpirationDate = model.currentExpirationDate;
                this.domainName = model.domainName;
                this.permitPremiumRenew = model.permitPremiumRenew;
                this.subscriptionDuration = model.subscriptionDuration;
            } 

            /**
             * <p>The current expiration date of the domain name, expressed in milliseconds since 00:00:00 UTC on January 1, 1970.</p>
             * 
             * <strong>example:</strong>
             * <p>1522080000000</p>
             */
            public Builder currentExpirationDate(Long currentExpirationDate) {
                this.currentExpirationDate = currentExpirationDate;
                return this;
            }

            /**
             * <p>The domain name that you want to renew. You can obtain a list of your domain names by calling the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Specifies whether to allow the renewal of premium domain names. Default value: false.</p>
             */
            public Builder permitPremiumRenew(Boolean permitPremiumRenew) {
                this.permitPremiumRenew = permitPremiumRenew;
                return this;
            }

            /**
             * <p>The renewal duration, in years. Default value: <strong>1</strong>. Valid values: <strong>1</strong> to <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
