// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForCreatingOrderActivateRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForCreatingOrderActivateRequest</p>
 */
public class SaveBatchTaskForCreatingOrderActivateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderActivateParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < OrderActivateParam> orderActivateParam;

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

    private SaveBatchTaskForCreatingOrderActivateRequest(Builder builder) {
        super(builder);
        this.couponNo = builder.couponNo;
        this.lang = builder.lang;
        this.orderActivateParam = builder.orderActivateParam;
        this.promotionNo = builder.promotionNo;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveBatchTaskForCreatingOrderActivateRequest create() {
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
     * @return orderActivateParam
     */
    public java.util.List < OrderActivateParam> getOrderActivateParam() {
        return this.orderActivateParam;
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

    public static final class Builder extends Request.Builder<SaveBatchTaskForCreatingOrderActivateRequest, Builder> {
        private String couponNo; 
        private String lang; 
        private java.util.List < OrderActivateParam> orderActivateParam; 
        private String promotionNo; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 

        private Builder() {
            super();
        } 

        private Builder(SaveBatchTaskForCreatingOrderActivateRequest request) {
            super(request);
            this.couponNo = request.couponNo;
            this.lang = request.lang;
            this.orderActivateParam = request.orderActivateParam;
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
         * OrderActivateParam.
         */
        public Builder orderActivateParam(java.util.List < OrderActivateParam> orderActivateParam) {
            this.putQueryParameter("OrderActivateParam", orderActivateParam);
            this.orderActivateParam = orderActivateParam;
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
        public SaveBatchTaskForCreatingOrderActivateRequest build() {
            return new SaveBatchTaskForCreatingOrderActivateRequest(this);
        } 

    } 

    public static class OrderActivateParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AliyunDns")
        private Boolean aliyunDns;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Country")
        private String country;

        @com.aliyun.core.annotation.NameInMap("Dns1")
        private String dns1;

        @com.aliyun.core.annotation.NameInMap("Dns2")
        private String dns2;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EnableDomainProxy")
        private Boolean enableDomainProxy;

        @com.aliyun.core.annotation.NameInMap("PermitPremiumActivation")
        private Boolean permitPremiumActivation;

        @com.aliyun.core.annotation.NameInMap("PostalCode")
        private String postalCode;

        @com.aliyun.core.annotation.NameInMap("Province")
        private String province;

        @com.aliyun.core.annotation.NameInMap("RegistrantName")
        private String registrantName;

        @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
        private String registrantOrganization;

        @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
        private Long registrantProfileId;

        @com.aliyun.core.annotation.NameInMap("RegistrantType")
        private String registrantType;

        @com.aliyun.core.annotation.NameInMap("SubscriptionDuration")
        private Integer subscriptionDuration;

        @com.aliyun.core.annotation.NameInMap("TelArea")
        private String telArea;

        @com.aliyun.core.annotation.NameInMap("TelExt")
        private String telExt;

        @com.aliyun.core.annotation.NameInMap("Telephone")
        private String telephone;

        @com.aliyun.core.annotation.NameInMap("TrademarkDomainActivation")
        private Boolean trademarkDomainActivation;

        private OrderActivateParam(Builder builder) {
            this.address = builder.address;
            this.aliyunDns = builder.aliyunDns;
            this.city = builder.city;
            this.country = builder.country;
            this.dns1 = builder.dns1;
            this.dns2 = builder.dns2;
            this.domainName = builder.domainName;
            this.email = builder.email;
            this.enableDomainProxy = builder.enableDomainProxy;
            this.permitPremiumActivation = builder.permitPremiumActivation;
            this.postalCode = builder.postalCode;
            this.province = builder.province;
            this.registrantName = builder.registrantName;
            this.registrantOrganization = builder.registrantOrganization;
            this.registrantProfileId = builder.registrantProfileId;
            this.registrantType = builder.registrantType;
            this.subscriptionDuration = builder.subscriptionDuration;
            this.telArea = builder.telArea;
            this.telExt = builder.telExt;
            this.telephone = builder.telephone;
            this.trademarkDomainActivation = builder.trademarkDomainActivation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrderActivateParam create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return aliyunDns
         */
        public Boolean getAliyunDns() {
            return this.aliyunDns;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return dns1
         */
        public String getDns1() {
            return this.dns1;
        }

        /**
         * @return dns2
         */
        public String getDns2() {
            return this.dns2;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return enableDomainProxy
         */
        public Boolean getEnableDomainProxy() {
            return this.enableDomainProxy;
        }

        /**
         * @return permitPremiumActivation
         */
        public Boolean getPermitPremiumActivation() {
            return this.permitPremiumActivation;
        }

        /**
         * @return postalCode
         */
        public String getPostalCode() {
            return this.postalCode;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        /**
         * @return registrantName
         */
        public String getRegistrantName() {
            return this.registrantName;
        }

        /**
         * @return registrantOrganization
         */
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        /**
         * @return registrantProfileId
         */
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        /**
         * @return registrantType
         */
        public String getRegistrantType() {
            return this.registrantType;
        }

        /**
         * @return subscriptionDuration
         */
        public Integer getSubscriptionDuration() {
            return this.subscriptionDuration;
        }

        /**
         * @return telArea
         */
        public String getTelArea() {
            return this.telArea;
        }

        /**
         * @return telExt
         */
        public String getTelExt() {
            return this.telExt;
        }

        /**
         * @return telephone
         */
        public String getTelephone() {
            return this.telephone;
        }

        /**
         * @return trademarkDomainActivation
         */
        public Boolean getTrademarkDomainActivation() {
            return this.trademarkDomainActivation;
        }

        public static final class Builder {
            private String address; 
            private Boolean aliyunDns; 
            private String city; 
            private String country; 
            private String dns1; 
            private String dns2; 
            private String domainName; 
            private String email; 
            private Boolean enableDomainProxy; 
            private Boolean permitPremiumActivation; 
            private String postalCode; 
            private String province; 
            private String registrantName; 
            private String registrantOrganization; 
            private Long registrantProfileId; 
            private String registrantType; 
            private Integer subscriptionDuration; 
            private String telArea; 
            private String telExt; 
            private String telephone; 
            private Boolean trademarkDomainActivation; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AliyunDns.
             */
            public Builder aliyunDns(Boolean aliyunDns) {
                this.aliyunDns = aliyunDns;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * Dns1.
             */
            public Builder dns1(String dns1) {
                this.dns1 = dns1;
                return this;
            }

            /**
             * Dns2.
             */
            public Builder dns2(String dns2) {
                this.dns2 = dns2;
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
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * EnableDomainProxy.
             */
            public Builder enableDomainProxy(Boolean enableDomainProxy) {
                this.enableDomainProxy = enableDomainProxy;
                return this;
            }

            /**
             * PermitPremiumActivation.
             */
            public Builder permitPremiumActivation(Boolean permitPremiumActivation) {
                this.permitPremiumActivation = permitPremiumActivation;
                return this;
            }

            /**
             * PostalCode.
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * RegistrantName.
             */
            public Builder registrantName(String registrantName) {
                this.registrantName = registrantName;
                return this;
            }

            /**
             * RegistrantOrganization.
             */
            public Builder registrantOrganization(String registrantOrganization) {
                this.registrantOrganization = registrantOrganization;
                return this;
            }

            /**
             * RegistrantProfileId.
             */
            public Builder registrantProfileId(Long registrantProfileId) {
                this.registrantProfileId = registrantProfileId;
                return this;
            }

            /**
             * RegistrantType.
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * SubscriptionDuration.
             */
            public Builder subscriptionDuration(Integer subscriptionDuration) {
                this.subscriptionDuration = subscriptionDuration;
                return this;
            }

            /**
             * TelArea.
             */
            public Builder telArea(String telArea) {
                this.telArea = telArea;
                return this;
            }

            /**
             * TelExt.
             */
            public Builder telExt(String telExt) {
                this.telExt = telExt;
                return this;
            }

            /**
             * Telephone.
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * TrademarkDomainActivation.
             */
            public Builder trademarkDomainActivation(Boolean trademarkDomainActivation) {
                this.trademarkDomainActivation = trademarkDomainActivation;
                return this;
            }

            public OrderActivateParam build() {
                return new OrderActivateParam(this);
            } 

        } 

    }
}
