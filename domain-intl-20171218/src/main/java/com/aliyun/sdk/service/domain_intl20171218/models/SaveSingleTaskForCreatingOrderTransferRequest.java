// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForCreatingOrderTransferRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForCreatingOrderTransferRequest</p>
 */
public class SaveSingleTaskForCreatingOrderTransferRequest extends Request {
    @Query
    @NameInMap("AuthorizationCode")
    @Validation(required = true)
    private String authorizationCode;

    @Query
    @NameInMap("CouponNo")
    private String couponNo;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PermitPremiumTransfer")
    private Boolean permitPremiumTransfer;

    @Query
    @NameInMap("PromotionNo")
    private String promotionNo;

    @Query
    @NameInMap("RegistrantProfileId")
    @Validation(required = true)
    private Long registrantProfileId;

    @Query
    @NameInMap("UseCoupon")
    private Boolean useCoupon;

    @Query
    @NameInMap("UsePromotion")
    private Boolean usePromotion;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    private SaveSingleTaskForCreatingOrderTransferRequest(Builder builder) {
        super(builder);
        this.authorizationCode = builder.authorizationCode;
        this.couponNo = builder.couponNo;
        this.domainName = builder.domainName;
        this.lang = builder.lang;
        this.permitPremiumTransfer = builder.permitPremiumTransfer;
        this.promotionNo = builder.promotionNo;
        this.registrantProfileId = builder.registrantProfileId;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForCreatingOrderTransferRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationCode
     */
    public String getAuthorizationCode() {
        return this.authorizationCode;
    }

    /**
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
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
     * @return permitPremiumTransfer
     */
    public Boolean getPermitPremiumTransfer() {
        return this.permitPremiumTransfer;
    }

    /**
     * @return promotionNo
     */
    public String getPromotionNo() {
        return this.promotionNo;
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
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

    public static final class Builder extends Request.Builder<SaveSingleTaskForCreatingOrderTransferRequest, Builder> {
        private String authorizationCode; 
        private String couponNo; 
        private String domainName; 
        private String lang; 
        private Boolean permitPremiumTransfer; 
        private String promotionNo; 
        private Long registrantProfileId; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForCreatingOrderTransferRequest request) {
            super(request);
            this.authorizationCode = request.authorizationCode;
            this.couponNo = request.couponNo;
            this.domainName = request.domainName;
            this.lang = request.lang;
            this.permitPremiumTransfer = request.permitPremiumTransfer;
            this.promotionNo = request.promotionNo;
            this.registrantProfileId = request.registrantProfileId;
            this.useCoupon = request.useCoupon;
            this.usePromotion = request.usePromotion;
            this.userClientIp = request.userClientIp;
        } 

        /**
         * AuthorizationCode.
         */
        public Builder authorizationCode(String authorizationCode) {
            this.putQueryParameter("AuthorizationCode", authorizationCode);
            this.authorizationCode = authorizationCode;
            return this;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * PermitPremiumTransfer.
         */
        public Builder permitPremiumTransfer(Boolean permitPremiumTransfer) {
            this.putQueryParameter("PermitPremiumTransfer", permitPremiumTransfer);
            this.permitPremiumTransfer = permitPremiumTransfer;
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
         * RegistrantProfileId.
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
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
        public SaveSingleTaskForCreatingOrderTransferRequest build() {
            return new SaveSingleTaskForCreatingOrderTransferRequest(this);
        } 

    } 

}
