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
 * {@link SaveSingleTaskForCreatingOrderActivateRequest} extends {@link RequestModel}
 *
 * <p>SaveSingleTaskForCreatingOrderActivateRequest</p>
 */
public class SaveSingleTaskForCreatingOrderActivateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliyunDns")
    private Boolean aliyunDns;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CouponNo")
    private String couponNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dns1")
    private String dns1;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dns2")
    private String dns2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableDomainProxy")
    private Boolean enableDomainProxy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpectedPunycode")
    private String expectedPunycode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PermitPremiumActivation")
    private Boolean permitPremiumActivation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostalCode")
    private String postalCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromotionNo")
    private String promotionNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantName")
    private String registrantName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantOrganization")
    private String registrantOrganization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantType")
    private String registrantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionDuration")
    private Integer subscriptionDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelArea")
    private String telArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelExt")
    private String telExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Telephone")
    private String telephone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrademarkDomainActivation")
    private Boolean trademarkDomainActivation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseCoupon")
    private Boolean useCoupon;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsePromotion")
    private Boolean usePromotion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserClientIp")
    private String userClientIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhAddress")
    private String zhAddress;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhCity")
    private String zhCity;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhProvince")
    private String zhProvince;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhRegistrantName")
    private String zhRegistrantName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZhRegistrantOrganization")
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
        this.expectedPunycode = builder.expectedPunycode;
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
     * @return expectedPunycode
     */
    public String getExpectedPunycode() {
        return this.expectedPunycode;
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
        private String expectedPunycode; 
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
            this.expectedPunycode = request.expectedPunycode;
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
         * <p>The detailed address in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>chao yang qu</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>Specifies whether to use Alibaba Cloud DNS servers. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: <strong>true</strong>.</p>
         * <blockquote>
         * <ul>
         * <li>If you set this parameter to <strong>true</strong>, you do not need to specify the <strong>Dns1</strong> and <strong>Dns2</strong> parameters. Otherwise, the specified <strong>Dns1</strong> and <strong>Dns2</strong> parameters do not take effect.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If you set this parameter to <strong>false</strong>, you must specify the <strong>Dns1</strong> and <strong>Dns2</strong> parameters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder aliyunDns(Boolean aliyunDns) {
            this.putQueryParameter("AliyunDns", aliyunDns);
            this.aliyunDns = aliyunDns;
            return this;
        }

        /**
         * <p>The city name in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bei jing shi</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>The country code, such as <strong>CN</strong>.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder country(String country) {
            this.putQueryParameter("Country", country);
            this.country = country;
            return this;
        }

        /**
         * <p>The ID of the voucher. Default value: a string.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder couponNo(String couponNo) {
            this.putQueryParameter("CouponNo", couponNo);
            this.couponNo = couponNo;
            return this;
        }

        /**
         * <p>The first custom DNS server.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when the <strong>AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ns1.aliyun.com</p>
         */
        public Builder dns1(String dns1) {
            this.putQueryParameter("Dns1", dns1);
            this.dns1 = dns1;
            return this;
        }

        /**
         * <p>The second custom DNS server.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is available and required only when the <strong>AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ns2.aliyun.com</p>
         */
        public Builder dns2(String dns2) {
            this.putQueryParameter("Dns2", dns2);
            this.dns2 = dns2;
            return this;
        }

        /**
         * <p>The domain name that you want to register.</p>
         * <blockquote>
         * <p>When you register a domain name, you must specify the registrant information. If you do not specify the registrant information, the domain name registration fails. You can specify the RegistrantProfileId parameter to use a registrant profile that defines the registrant information.</p>
         * </blockquote>
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
         * <p>The email address.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:username@example.com">username@example.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Specifies whether to enable the domain name privacy protection service. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Enable.</li>
         * <li><strong>false</strong>: Do not enable.</li>
         * </ul>
         * <p>Default value: <strong>true</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableDomainProxy(Boolean enableDomainProxy) {
            this.putQueryParameter("EnableDomainProxy", enableDomainProxy);
            this.enableDomainProxy = enableDomainProxy;
            return this;
        }

        /**
         * <p>The domain name in Punycode format. This parameter can be left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>xn--fiqs8s.com</p>
         */
        public Builder expectedPunycode(String expectedPunycode) {
            this.putQueryParameter("ExpectedPunycode", expectedPunycode);
            this.expectedPunycode = expectedPunycode;
            return this;
        }

        /**
         * <p>The language of the error message returned by the API operation. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
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
         * <p>Specifies whether to allow the registration of premium domain names. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not allowed.</li>
         * <li><strong>true</strong>: Allowed.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder permitPremiumActivation(Boolean permitPremiumActivation) {
            this.putQueryParameter("PermitPremiumActivation", permitPremiumActivation);
            this.permitPremiumActivation = permitPremiumActivation;
            return this;
        }

        /**
         * <p>The postal code.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder postalCode(String postalCode) {
            this.putQueryParameter("PostalCode", postalCode);
            this.postalCode = postalCode;
            return this;
        }

        /**
         * <p>The ID of the coupon.</p>
         * 
         * <strong>example:</strong>
         * <p>123123</p>
         */
        public Builder promotionNo(String promotionNo) {
            this.putQueryParameter("PromotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * <p>The province name in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>bei jing</p>
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * <p>The name of the domain name contact in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ce shi</p>
         */
        public Builder registrantName(String registrantName) {
            this.putQueryParameter("RegistrantName", registrantName);
            this.registrantName = registrantName;
            return this;
        }

        /**
         * <p>The name of the domain name registrant in English.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ce shi</p>
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.putQueryParameter("RegistrantOrganization", registrantOrganization);
            this.registrantOrganization = registrantOrganization;
            return this;
        }

        /**
         * <p>The ID of the domain name registrant profile. The profile contains information such as the registrant name, contact name, phone number, and email address. You can use only a real-name verified registrant profile to register a domain name. If you have created a registrant profile, you can call the <a href="~~QueryRegistrantProfiles~~">QueryRegistrantProfiles</a> operation to query the profile ID.</p>
         * <blockquote>
         * <p>After you specify this parameter, you do not need to specify the <strong>RegistrantType</strong>, <strong>ZhRegistrantOrganization</strong>, <strong>ZhRegistrantName</strong>, <strong>ZhProvince</strong>, <strong>ZhCity</strong>, <strong>ZhAddress</strong>, <strong>RegistrantOrganization</strong>, <strong>RegistrantName</strong>, <strong>Province</strong>, <strong>City</strong>, <strong>Address</strong>, <strong>PostalCode</strong>, <strong>Country</strong>, <strong>TelArea</strong>, <strong>Telephone</strong>, <strong>TelExt</strong>, or <strong>Email</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * <p>The type of the domain name registrant. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Individual.</li>
         * <li><strong>2</strong>: Enterprise or organization.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder registrantType(String registrantType) {
            this.putQueryParameter("RegistrantType", registrantType);
            this.registrantType = registrantType;
            return this;
        }

        /**
         * <p>None.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-XX</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The subscription duration. Unit: <strong>year</strong>. Default value: <strong>1 year</strong>. Maximum value: <strong>10 years</strong>.</p>
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
         * <p>The country code for the phone number, such as <strong>86</strong> for China.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        public Builder telArea(String telArea) {
            this.putQueryParameter("TelArea", telArea);
            this.telArea = telArea;
            return this;
        }

        /**
         * <p>The extension number.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder telExt(String telExt) {
            this.putQueryParameter("TelExt", telExt);
            this.telExt = telExt;
            return this;
        }

        /**
         * <p>The phone number.</p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12345678</p>
         */
        public Builder telephone(String telephone) {
            this.putQueryParameter("Telephone", telephone);
            this.telephone = telephone;
            return this;
        }

        /**
         * <p>Specifies whether to allow the registration of trademark domain names. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not allowed.</li>
         * <li><strong>true</strong>: Allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder trademarkDomainActivation(Boolean trademarkDomainActivation) {
            this.putQueryParameter("TrademarkDomainActivation", trademarkDomainActivation);
            this.trademarkDomainActivation = trademarkDomainActivation;
            return this;
        }

        /**
         * <p>Specifies whether to use a voucher. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Use.</li>
         * <li><strong>false</strong>: Do not use.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
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
         * <p>Specifies whether to use a coupon. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: Not allowed.</li>
         * <li><strong>true</strong>: Allowed.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
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
         * <p>The IP address of the client. You can set this parameter to <strong>127.0.0.1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        /**
         * <p>The detailed address in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>朝阳区</p>
         */
        public Builder zhAddress(String zhAddress) {
            this.putQueryParameter("ZhAddress", zhAddress);
            this.zhAddress = zhAddress;
            return this;
        }

        /**
         * <p>The city name in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>北京市</p>
         */
        public Builder zhCity(String zhCity) {
            this.putQueryParameter("ZhCity", zhCity);
            this.zhCity = zhCity;
            return this;
        }

        /**
         * <p>The province name in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>北京</p>
         */
        public Builder zhProvince(String zhProvince) {
            this.putQueryParameter("ZhProvince", zhProvince);
            this.zhProvince = zhProvince;
            return this;
        }

        /**
         * <p>The name of the domain name contact in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
         */
        public Builder zhRegistrantName(String zhRegistrantName) {
            this.putQueryParameter("ZhRegistrantName", zhRegistrantName);
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }

        /**
         * <p>The name of the domain name registrant in Chinese.</p>
         * <blockquote>
         * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not specified. If you do not specify this parameter, the domain name registration fails.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>测试</p>
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
