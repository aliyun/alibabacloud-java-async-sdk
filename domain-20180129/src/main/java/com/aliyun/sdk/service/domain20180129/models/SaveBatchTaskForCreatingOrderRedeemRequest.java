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
    private java.util.List<OrderRedeemParam> orderRedeemParam;

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
    public java.util.List<OrderRedeemParam> getOrderRedeemParam() {
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
        private java.util.List<OrderRedeemParam> orderRedeemParam; 
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
         * <p>Coupon number.</p>
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
         * <p>Language of error messages returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese;  </li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>List of job details.</p>
         * <p>This parameter is required.</p>
         */
        public Builder orderRedeemParam(java.util.List<OrderRedeemParam> orderRedeemParam) {
            this.putQueryParameter("OrderRedeemParam", orderRedeemParam);
            this.orderRedeemParam = orderRedeemParam;
            return this;
        }

        /**
         * <p>Coupon number.</p>
         * 
         * <strong>example:</strong>
         * <p>123213123</p>
         */
        public Builder promotionNo(String promotionNo) {
            this.putQueryParameter("PromotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * <p>Is coupon used? Valid values:  </p>
         * <ul>
         * <li><strong>false</strong>: No.  </li>
         * <li><strong>true</strong>: Yes.</li>
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
         * <p>Is coupon used? Valid values:  </p>
         * <ul>
         * <li><strong>false</strong>: No.  </li>
         * <li><strong>true</strong>: Yes.</li>
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
         * <p>User IP address. You can set it to <strong>127.0.0.1</strong>.</p>
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
        public SaveBatchTaskForCreatingOrderRedeemRequest build() {
            return new SaveBatchTaskForCreatingOrderRedeemRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveBatchTaskForCreatingOrderRedeemRequest} extends {@link TeaModel}
     *
     * <p>SaveBatchTaskForCreatingOrderRedeemRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(OrderRedeemParam model) {
                this.currentExpirationDate = model.currentExpirationDate;
                this.domainName = model.domainName;
            } 

            /**
             * <p>Current expiration date of the domain name, represented as the number of milliseconds from 00:00 UTC on January 1, 1970, to the domain’s current expiration date.</p>
             * 
             * <strong>example:</strong>
             * <p>000000</p>
             */
            public Builder currentExpirationDate(Long currentExpirationDate) {
                this.currentExpirationDate = currentExpirationDate;
                return this;
            }

            /**
             * <p>Domain name. If multiple domain names are involved, pass a domain name list. You can obtain the domain name list by using the <a href="https://help.aliyun.com/document_detail/67712.html">QueryDomainList</a> API.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun.com</p>
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
