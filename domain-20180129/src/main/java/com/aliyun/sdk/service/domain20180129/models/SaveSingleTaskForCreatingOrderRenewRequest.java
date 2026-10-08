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
 * {@link SaveSingleTaskForCreatingOrderRenewRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForCreatingOrderRenewRequest</p>
 */
public class SaveSingleTaskForCreatingOrderRenewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentExpirationDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentExpirationDate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermitPremiumRenew")
    private Boolean permitPremiumRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionNo")
    private String promotionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer subscriptionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseCoupon")
    private Boolean useCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsePromotion")
    private Boolean usePromotion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForCreatingOrderRenewRequest(Builder builder) {
        super(builder);
        this.couponNo = builder.couponNo;
        this.currentExpirationDate = builder.currentExpirationDate;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.permitPremiumRenew = builder.permitPremiumRenew;
        this.promotionNo = builder.promotionNo;
        this.subscriptionDuration = builder.subscriptionDuration;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForCreatingOrderRenewRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return permitPremiumRenew
     */
    public Boolean getPermitPremiumRenew() {
        return this.permitPremiumRenew;
    }

    /**
     * @return promotionNo
     */
    public String getPromotionNo() {
        return this.promotionNo;
    }

    /**
     * @return subscriptionDuration
     */
    public Integer getSubscriptionDuration() {
        return this.subscriptionDuration;
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

    public static final class Builder extends Request.Builder<SaveSingleTaskForCreatingOrderRenewRequest, Builder> {
        private String couponNo; 
        private Long currentExpirationDate; 
        private String domainName; 
        private String lang; 
        private Boolean permitPremiumRenew; 
        private String promotionNo; 
        private Integer subscriptionDuration; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForCreatingOrderRenewRequest request) {
            super(request);
            this.couponNo = request.couponNo;
            this.currentExpirationDate = request.currentExpirationDate;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.permitPremiumRenew = request.permitPremiumRenew;
            this.promotionNo = request.promotionNo;
            this.subscriptionDuration = request.subscriptionDuration;
            this.useCoupon = request.useCoupon;
            this.usePromotion = request.usePromotion;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * <p>The coupon number.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The current expiration date of the domain name. This value is a Unix timestamp in milliseconds, representing the time elapsed since 00:00:00 UTC on January 1, 1970.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1522080000000</p>
         */
        public Builder currentExpirationDate(Long currentExpirationDate) {
            this.putQueryParameter("CurrentExpirationDate", currentExpirationDate);
            this.currentExpirationDate = currentExpirationDate;
            return this;
        }

        /**
         * <p>The domain name to renew.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The language of error messages returned by the API. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong>: Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * <p>The default value is <strong>en</strong>.</p>
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
         * PermitPremiumRenew.
         */
        public Builder permitPremiumRenew(Boolean permitPremiumRenew) {
            this.putQueryParameter("PermitPremiumRenew", permitPremiumRenew);
            this.permitPremiumRenew = permitPremiumRenew;
            return this;
        }

        /**
         * <p>The promotion number.</p>
         * 
         * <strong>example:</strong>
         * <p>123132</p>
         */
        public Builder promotionNo(String promotionNo) {
            this.putQueryParameter("PromotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * <p>The renewal period, in years. The value must be an integer from <strong>1</strong> to <strong>10</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder subscriptionDuration(Integer subscriptionDuration) {
            this.putQueryParameter("SubscriptionDuration", subscriptionDuration);
            this.subscriptionDuration = subscriptionDuration;
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
        public SaveSingleTaskForCreatingOrderRenewRequest build() {
            return new SaveSingleTaskForCreatingOrderRenewRequest(this);
        } 

    } 

}
