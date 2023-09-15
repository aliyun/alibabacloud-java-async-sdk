// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveSingleTaskForCreatingOrderActivateRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForCreatingOrderActivateRequest</p>
 */
public class SaveSingleTaskForCreatingOrderActivateRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("AliyunDns")
    private Boolean aliyunDns;

    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("CouponNo")
    private String couponNo;

    @Query
    @NameInMap("Dns1")
    private String dns1;

    @Query
    @NameInMap("Dns2")
    private String dns2;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("EnableDomainProxy")
    private Boolean enableDomainProxy;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PermitPremiumActivation")
    private Boolean permitPremiumActivation;

    @Query
    @NameInMap("PostalCode")
    private String postalCode;

    @Query
    @NameInMap("PromotionNo")
    private String promotionNo;

    @Query
    @NameInMap("Province")
    private String province;

    @Query
    @NameInMap("RegistrantName")
    private String registrantName;

    @Query
    @NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @Query
    @NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @Query
    @NameInMap("RegistrantType")
    private String registrantType;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SubscriptionDuration")
    private Integer subscriptionDuration;

    @Query
    @NameInMap("TelArea")
    private String telArea;

    @Query
    @NameInMap("TelExt")
    private String telExt;

    @Query
    @NameInMap("Telephone")
    private String telephone;

    @Query
    @NameInMap("TrademarkDomainActivation")
    private Boolean trademarkDomainActivation;

    @Query
    @NameInMap("UseCoupon")
    private Boolean useCoupon;

    @Query
    @NameInMap("UsePromotion")
    private Boolean usePromotion;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

    @Query
    @NameInMap("ZhAddress")
    private String zhAddress;

    @Query
    @NameInMap("ZhCity")
    private String zhCity;

    @Query
    @NameInMap("ZhProvince")
    private String zhProvince;

    @Query
    @NameInMap("ZhRegistrantName")
    private String zhRegistrantName;

    @Query
    @NameInMap("ZhRegistrantOrganization")
    private String zhRegistrantOrganization;

    private SaveSingleTaskForCreatingOrderActivateRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.aliyunDns = builder.aliyunDns;
        this.city = builder.city;
        this.country = builder.country;
        this.couponNo = builder.couponNo;
        this.dns1 = builder.dns1;
        this.dns2 = builder.dns2;
        this.domainName = builder.domainName;
        this.email = builder.email;
        this.enableDomainProxy = builder.enableDomainProxy;
        this.lang = builder.lang;
        this.permitPremiumActivation = builder.permitPremiumActivation;
        this.postalCode = builder.postalCode;
        this.promotionNo = builder.promotionNo;
        this.province = builder.province;
        this.registrantName = builder.registrantName;
        this.registrantOrganization = builder.registrantOrganization;
        this.registrantProfileId = builder.registrantProfileId;
        this.registrantType = builder.registrantType;
        this.resourceGroupId = builder.resourceGroupId;
        this.subscriptionDuration = builder.subscriptionDuration;
        this.telArea = builder.telArea;
        this.telExt = builder.telExt;
        this.telephone = builder.telephone;
        this.trademarkDomainActivation = builder.trademarkDomainActivation;
        this.useCoupon = builder.useCoupon;
        this.usePromotion = builder.usePromotion;
        this.userClientIp = builder.userClientIp;
        this.zhAddress = builder.zhAddress;
        this.zhCity = builder.zhCity;
        this.zhProvince = builder.zhProvince;
        this.zhRegistrantName = builder.zhRegistrantName;
        this.zhRegistrantOrganization = builder.zhRegistrantOrganization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveSingleTaskForCreatingOrderActivateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return couponNo
     */
    public String getCouponNo() {
        return this.couponNo;
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return promotionNo
     */
    public String getPromotionNo() {
        return this.promotionNo;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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

    public static final class Builder extends Request.Builder<SaveSingleTaskForCreatingOrderActivateRequest, Builder> {
        private String address; 
        private Boolean aliyunDns; 
        private String city; 
        private String country; 
        private String couponNo; 
        private String dns1; 
        private String dns2; 
        private String domainName; 
        private String email; 
        private Boolean enableDomainProxy; 
        private String lang; 
        private Boolean permitPremiumActivation; 
        private String postalCode; 
        private String promotionNo; 
        private String province; 
        private String registrantName; 
        private String registrantOrganization; 
        private Long registrantProfileId; 
        private String registrantType; 
        private String resourceGroupId; 
        private Integer subscriptionDuration; 
        private String telArea; 
        private String telExt; 
        private String telephone; 
        private Boolean trademarkDomainActivation; 
        private Boolean useCoupon; 
        private Boolean usePromotion; 
        private String userClientIp; 
        private String zhAddress; 
        private String zhCity; 
        private String zhProvince; 
        private String zhRegistrantName; 
        private String zhRegistrantOrganization; 

        private Builder() {
            super();
        } 

        private Builder(SaveSingleTaskForCreatingOrderActivateRequest request) {
            super(request);
            this.address = request.address;
            this.aliyunDns = request.aliyunDns;
            this.city = request.city;
            this.country = request.country;
            this.couponNo = request.couponNo;
            this.dns1 = request.dns1;
            this.dns2 = request.dns2;
            this.domainName = request.domainName;
            this.email = request.email;
            this.enableDomainProxy = request.enableDomainProxy;
            this.lang = request.lang;
            this.permitPremiumActivation = request.permitPremiumActivation;
            this.postalCode = request.postalCode;
            this.promotionNo = request.promotionNo;
            this.province = request.province;
            this.registrantName = request.registrantName;
            this.registrantOrganization = request.registrantOrganization;
            this.registrantProfileId = request.registrantProfileId;
            this.registrantType = request.registrantType;
            this.resourceGroupId = request.resourceGroupId;
            this.subscriptionDuration = request.subscriptionDuration;
            this.telArea = request.telArea;
            this.telExt = request.telExt;
            this.telephone = request.telephone;
            this.trademarkDomainActivation = request.trademarkDomainActivation;
            this.useCoupon = request.useCoupon;
            this.usePromotion = request.usePromotion;
            this.userClientIp = request.userClientIp;
            this.zhAddress = request.zhAddress;
            this.zhCity = request.zhCity;
            this.zhProvince = request.zhProvince;
            this.zhRegistrantName = request.zhRegistrantName;
            this.zhRegistrantOrganization = request.zhRegistrantOrganization;
        } 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * AliyunDns.
         */
        public Builder aliyunDns(Boolean aliyunDns) {
            this.putQueryParameter("AliyunDns", aliyunDns);
            this.aliyunDns = aliyunDns;
            return this;
        }

        /**
         * City.
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
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
         * Dns1.
         */
        public Builder dns1(String dns1) {
            this.putQueryParameter("Dns1", dns1);
            this.dns1 = dns1;
            return this;
        }

        /**
         * Dns2.
         */
        public Builder dns2(String dns2) {
            this.putQueryParameter("Dns2", dns2);
            this.dns2 = dns2;
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
         * Email.
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * EnableDomainProxy.
         */
        public Builder enableDomainProxy(Boolean enableDomainProxy) {
            this.putQueryParameter("EnableDomainProxy", enableDomainProxy);
            this.enableDomainProxy = enableDomainProxy;
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
         * PermitPremiumActivation.
         */
        public Builder permitPremiumActivation(Boolean permitPremiumActivation) {
            this.putQueryParameter("PermitPremiumActivation", permitPremiumActivation);
            this.permitPremiumActivation = permitPremiumActivation;
            return this;
        }

        /**
         * PostalCode.
         */
        public Builder postalCode(String postalCode) {
            this.putQueryParameter("PostalCode", postalCode);
            this.postalCode = postalCode;
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
         * Province.
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * RegistrantName.
         */
        public Builder registrantName(String registrantName) {
            this.putQueryParameter("RegistrantName", registrantName);
            this.registrantName = registrantName;
            return this;
        }

        /**
         * RegistrantOrganization.
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.putQueryParameter("RegistrantOrganization", registrantOrganization);
            this.registrantOrganization = registrantOrganization;
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
         * RegistrantType.
         */
        public Builder registrantType(String registrantType) {
            this.putQueryParameter("RegistrantType", registrantType);
            this.registrantType = registrantType;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SubscriptionDuration.
         */
        public Builder subscriptionDuration(Integer subscriptionDuration) {
            this.putQueryParameter("SubscriptionDuration", subscriptionDuration);
            this.subscriptionDuration = subscriptionDuration;
            return this;
        }

        /**
         * TelArea.
         */
        public Builder telArea(String telArea) {
            this.putQueryParameter("TelArea", telArea);
            this.telArea = telArea;
            return this;
        }

        /**
         * TelExt.
         */
        public Builder telExt(String telExt) {
            this.putQueryParameter("TelExt", telExt);
            this.telExt = telExt;
            return this;
        }

        /**
         * Telephone.
         */
        public Builder telephone(String telephone) {
            this.putQueryParameter("Telephone", telephone);
            this.telephone = telephone;
            return this;
        }

        /**
         * TrademarkDomainActivation.
         */
        public Builder trademarkDomainActivation(Boolean trademarkDomainActivation) {
            this.putQueryParameter("TrademarkDomainActivation", trademarkDomainActivation);
            this.trademarkDomainActivation = trademarkDomainActivation;
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

        /**
         * ZhAddress.
         */
        public Builder zhAddress(String zhAddress) {
            this.putQueryParameter("ZhAddress", zhAddress);
            this.zhAddress = zhAddress;
            return this;
        }

        /**
         * ZhCity.
         */
        public Builder zhCity(String zhCity) {
            this.putQueryParameter("ZhCity", zhCity);
            this.zhCity = zhCity;
            return this;
        }

        /**
         * ZhProvince.
         */
        public Builder zhProvince(String zhProvince) {
            this.putQueryParameter("ZhProvince", zhProvince);
            this.zhProvince = zhProvince;
            return this;
        }

        /**
         * ZhRegistrantName.
         */
        public Builder zhRegistrantName(String zhRegistrantName) {
            this.putQueryParameter("ZhRegistrantName", zhRegistrantName);
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }

        /**
         * ZhRegistrantOrganization.
         */
        public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
            this.putQueryParameter("ZhRegistrantOrganization", zhRegistrantOrganization);
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }

        @Override
        public SaveSingleTaskForCreatingOrderActivateRequest build() {
            return new SaveSingleTaskForCreatingOrderActivateRequest(this);
        } 

    } 

}
