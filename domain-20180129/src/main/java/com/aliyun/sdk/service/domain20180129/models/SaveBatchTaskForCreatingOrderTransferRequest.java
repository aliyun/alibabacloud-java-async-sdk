// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveBatchTaskForCreatingOrderTransferRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForCreatingOrderTransferRequest</p>
 */
public class SaveBatchTaskForCreatingOrderTransferRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderTransferParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OrderTransferParam> orderTransferParam;

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

    private SaveBatchTaskForCreatingOrderTransferRequest(Builder builder) {
        super(builder);
        this.couponNo = builder.couponNo;
        this.lang = builder.lang;
        this.orderTransferParam = builder.orderTransferParam;
        this.promotionNo = builder.promotionNo;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForCreatingOrderTransferRequest create() {
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
     * @return orderTransferParam
     */
    public java.util.List < OrderTransferParam> getOrderTransferParam() {
        return this.orderTransferParam;
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

    public static final class Builder extends Request.Builder<SaveBatchTaskForCreatingOrderTransferRequest, Builder> {
        private String couponNo; 
        private String lang; 
        private java.util.List < OrderTransferParam> orderTransferParam; 
        private String promotionNo; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForCreatingOrderTransferRequest request) {
            super(request);
            this.couponNo = request.couponNo;
            this.lang = request.lang;
            this.orderTransferParam = request.orderTransferParam;
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
         * <p>This parameter is required.</p>
         */
        public Builder orderTransferParam(java.util.List < OrderTransferParam> orderTransferParam) {
            this.putQueryParameter("OrderTransferParam", orderTransferParam);
            this.orderTransferParam = orderTransferParam;
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
        public SaveBatchTaskForCreatingOrderTransferRequest build() {
            return new SaveBatchTaskForCreatingOrderTransferRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveBatchTaskForCreatingOrderTransferRequest} extends {@link TeaModel}
     *
     * <p>SaveBatchTaskForCreatingOrderTransferRequest</p>
     */
    public static class OrderTransferParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationCode")
        private String authorizationCode;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("PermitPremiumTransfer")
        private Boolean permitPremiumTransfer;

        @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
        private Long registrantProfileId;

        private OrderTransferParam(Builder builder) {
            this.authorizationCode = builder.authorizationCode;
            this.domainName = builder.domainName;
            this.permitPremiumTransfer = builder.permitPremiumTransfer;
            this.registrantProfileId = builder.registrantProfileId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderTransferParam create() {
            return builder().build();
        }

        /**
         * @return authorizationCode
         */
        public String getAuthorizationCode() {
            return this.authorizationCode;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return permitPremiumTransfer
         */
        public Boolean getPermitPremiumTransfer() {
            return this.permitPremiumTransfer;
        }

        /**
         * @return registrantProfileId
         */
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        public static final class Builder {
            private String authorizationCode; 
            private String domainName; 
            private Boolean permitPremiumTransfer; 
            private Long registrantProfileId; 

            /**
             * AuthorizationCode.
             */
            public Builder authorizationCode(String authorizationCode) {
                this.authorizationCode = authorizationCode;
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
             * PermitPremiumTransfer.
             */
            public Builder permitPremiumTransfer(Boolean permitPremiumTransfer) {
                this.permitPremiumTransfer = permitPremiumTransfer;
                return this;
            }

            /**
             * RegistrantProfileId.
             */
            public Builder registrantProfileId(Long registrantProfileId) {
                this.registrantProfileId = registrantProfileId;
                return this;
            }

            public OrderTransferParam build() {
                return new OrderTransferParam(this);
            } 

        } 

    }
}
