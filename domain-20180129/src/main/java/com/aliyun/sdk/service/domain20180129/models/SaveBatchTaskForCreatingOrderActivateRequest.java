// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForCreatingOrderActivateRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForCreatingOrderActivateRequest</p>
 */
public class SaveBatchTaskForCreatingOrderActivateRequest extends Request {
    @Query
    @NameInMap("CouponNo")
    private String couponNo;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("OrderActivateParam")
    @Validation(required = true)
    private java.util.List < OrderActivateParam> orderActivateParam;

    @Query
    @NameInMap("PromotionNo")
    private String promotionNo;

    @Query
    @NameInMap("UseCoupon")
    private Boolean useCoupon;

    @Query
    @NameInMap("UsePromotion")
    private Boolean usePromotion;

    @Query
    @NameInMap("UserClientIp")
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

        private Builder(SaveBatchTaskForCreatingOrderActivateRequest response) {
            super(response);
            this.couponNo = response.couponNo;
            this.lang = response.lang;
            this.orderActivateParam = response.orderActivateParam;
            this.promotionNo = response.promotionNo;
            this.useCoupon = response.useCoupon;
            this.usePromotion = response.usePromotion;
            this.userClientIp = response.userClientIp;
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
        @NameInMap("Address")
        private String address;

        @NameInMap("AliyunDns")
        private Boolean aliyunDns;

        @NameInMap("City")
        private String city;

        @NameInMap("Country")
        private String country;

        @NameInMap("Dns1")
        private String dns1;

        @NameInMap("Dns2")
        private String dns2;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Email")
        private String email;

        @NameInMap("EnableDomainProxy")
        private Boolean enableDomainProxy;

        @NameInMap("PermitPremiumActivation")
        private Boolean permitPremiumActivation;

        @NameInMap("PostalCode")
        private String postalCode;

        @NameInMap("Province")
        private String province;

        @NameInMap("RegistrantName")
        private String registrantName;

        @NameInMap("RegistrantOrganization")
        private String registrantOrganization;

        @NameInMap("RegistrantProfileId")
        private Long registrantProfileId;

        @NameInMap("RegistrantType")
        private String registrantType;

        @NameInMap("SubscriptionDuration")
        private Integer subscriptionDuration;

        @NameInMap("TelArea")
        private String telArea;

        @NameInMap("TelExt")
        private String telExt;

        @NameInMap("Telephone")
        private String telephone;

        @NameInMap("TrademarkDomainActivation")
        private Boolean trademarkDomainActivation;

        @NameInMap("ZhAddress")
        private String zhAddress;

        @NameInMap("ZhCity")
        private String zhCity;

        @NameInMap("ZhProvince")
        private String zhProvince;

        @NameInMap("ZhRegistrantName")
        private String zhRegistrantName;

        @NameInMap("ZhRegistrantOrganization")
        private String zhRegistrantOrganization;

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
            this.zhAddress = builder.zhAddress;
            this.zhCity = builder.zhCity;
            this.zhProvince = builder.zhProvince;
            this.zhRegistrantName = builder.zhRegistrantName;
            this.zhRegistrantOrganization = builder.zhRegistrantOrganization;
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

        /**
         * @return zhAddress
         */
        public String getZhAddress() {
            return this.zhAddress;
        }

        /**
         * @return zhCity
         */
        public String getZhCity() {
            return this.zhCity;
        }

        /**
         * @return zhProvince
         */
        public String getZhProvince() {
            return this.zhProvince;
        }

        /**
         * @return zhRegistrantName
         */
        public String getZhRegistrantName() {
            return this.zhRegistrantName;
        }

        /**
         * @return zhRegistrantOrganization
         */
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
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
            private String zhAddress; 
            private String zhCity; 
            private String zhProvince; 
            private String zhRegistrantName; 
            private String zhRegistrantOrganization; 

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

            /**
             * ZhAddress.
             */
            public Builder zhAddress(String zhAddress) {
                this.zhAddress = zhAddress;
                return this;
            }

            /**
             * ZhCity.
             */
            public Builder zhCity(String zhCity) {
                this.zhCity = zhCity;
                return this;
            }

            /**
             * ZhProvince.
             */
            public Builder zhProvince(String zhProvince) {
                this.zhProvince = zhProvince;
                return this;
            }

            /**
             * ZhRegistrantName.
             */
            public Builder zhRegistrantName(String zhRegistrantName) {
                this.zhRegistrantName = zhRegistrantName;
                return this;
            }

            /**
             * ZhRegistrantOrganization.
             */
            public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
                this.zhRegistrantOrganization = zhRegistrantOrganization;
                return this;
            }

            public OrderActivateParam build() {
                return new OrderActivateParam(this);
            } 

        } 

    }
}
