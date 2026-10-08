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
    private java.util.List<OrderActivateParam> orderActivateParam;

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
    public java.util.List<OrderActivateParam> getOrderActivateParam() {
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
        private java.util.List<OrderActivateParam> orderActivateParam; 
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
         * <p>The voucher ID.</p>
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
         * <p>The list of task details.</p>
         * <p>This parameter is required.</p>
         */
        public Builder orderActivateParam(java.util.List<OrderActivateParam> orderActivateParam) {
            this.putQueryParameter("OrderActivateParam", orderActivateParam);
            this.orderActivateParam = orderActivateParam;
            return this;
        }

        /**
         * <p>The coupon ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123124</p>
         */
        public Builder promotionNo(String promotionNo) {
            this.putQueryParameter("PromotionNo", promotionNo);
            this.promotionNo = promotionNo;
            return this;
        }

        /**
         * <p>Specifies whether to use a voucher.</p>
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
         * <p>Specifies whether to use a coupon.</p>
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
         * <p>The IP address of the user.</p>
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
        public SaveBatchTaskForCreatingOrderActivateRequest build() {
            return new SaveBatchTaskForCreatingOrderActivateRequest(this);
        } 

    } 

    /**
     * 
     * {@link SaveBatchTaskForCreatingOrderActivateRequest} extends {@link TeaModel}
     *
     * <p>SaveBatchTaskForCreatingOrderActivateRequest</p>
     */
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
        @com.aliyun.core.annotation.Validation(required = true)
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("EnableDomainProxy")
        private Boolean enableDomainProxy;

        @com.aliyun.core.annotation.NameInMap("ExpectedPunycode")
        private String expectedPunycode;

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

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

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

        @com.aliyun.core.annotation.NameInMap("ZhAddress")
        private String zhAddress;

        @com.aliyun.core.annotation.NameInMap("ZhCity")
        private String zhCity;

        @com.aliyun.core.annotation.NameInMap("ZhProvince")
        private String zhProvince;

        @com.aliyun.core.annotation.NameInMap("ZhRegistrantName")
        private String zhRegistrantName;

        @com.aliyun.core.annotation.NameInMap("ZhRegistrantOrganization")
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
            this.expectedPunycode = builder.expectedPunycode;
            this.permitPremiumActivation = builder.permitPremiumActivation;
            this.postalCode = builder.postalCode;
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
         * @return expectedPunycode
         */
        public String getExpectedPunycode() {
            return this.expectedPunycode;
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
            private String expectedPunycode; 
            private Boolean permitPremiumActivation; 
            private String postalCode; 
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
            private String zhAddress; 
            private String zhCity; 
            private String zhProvince; 
            private String zhRegistrantName; 
            private String zhRegistrantOrganization; 

            private Builder() {
            } 

            private Builder(OrderActivateParam model) {
                this.address = model.address;
                this.aliyunDns = model.aliyunDns;
                this.city = model.city;
                this.country = model.country;
                this.dns1 = model.dns1;
                this.dns2 = model.dns2;
                this.domainName = model.domainName;
                this.email = model.email;
                this.enableDomainProxy = model.enableDomainProxy;
                this.expectedPunycode = model.expectedPunycode;
                this.permitPremiumActivation = model.permitPremiumActivation;
                this.postalCode = model.postalCode;
                this.province = model.province;
                this.registrantName = model.registrantName;
                this.registrantOrganization = model.registrantOrganization;
                this.registrantProfileId = model.registrantProfileId;
                this.registrantType = model.registrantType;
                this.resourceGroupId = model.resourceGroupId;
                this.subscriptionDuration = model.subscriptionDuration;
                this.telArea = model.telArea;
                this.telExt = model.telExt;
                this.telephone = model.telephone;
                this.trademarkDomainActivation = model.trademarkDomainActivation;
                this.zhAddress = model.zhAddress;
                this.zhCity = model.zhCity;
                this.zhProvince = model.zhProvince;
                this.zhRegistrantName = model.zhRegistrantName;
                this.zhRegistrantOrganization = model.zhRegistrantOrganization;
            } 

            /**
             * <p>The mailing address in English.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>chao yan qu *** dasha *** hao</p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>Specifies whether to use Alibaba Cloud DNS. Valid values: <strong>true</strong> and <strong>false</strong>. Default value: <strong>true</strong>.</p>
             * <blockquote>
             * <ul>
             * <li>If this parameter is set to <strong>true</strong>, you do not need to specify the <strong>OrderActivateParam.N.Dns1</strong> and <strong>OrderActivateParam.N.Dns2</strong> parameters. Otherwise, the specified <strong>OrderActivateParam.N.Dns1</strong> and <strong>OrderActivateParam.N.Dns2</strong> parameters do not take effect.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>If this parameter is set to <strong>false</strong>, you must also specify the <strong>OrderActivateParam.N.Dns1</strong> and <strong>OrderActivateParam.N.Dns2</strong> parameters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder aliyunDns(Boolean aliyunDns) {
                this.aliyunDns = aliyunDns;
                return this;
            }

            /**
             * <p>The city name in English.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>bei jing shi</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>The country code. For example, <strong>CN</strong> represents China, and <strong>US</strong> represents the United States.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * <p>The custom DNS server 1.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is available and required only when the <strong>OrderActivateParam.N.AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ns2.aliyun.com</p>
             */
            public Builder dns1(String dns1) {
                this.dns1 = dns1;
                return this;
            }

            /**
             * <p>The custom DNS server 2.</p>
             * <blockquote>
             * <ul>
             * <li>This parameter is available and required only when the <strong>OrderActivateParam.N.AliyunDns</strong> parameter is set to <strong>false</strong>.</li>
             * </ul>
             * </blockquote>
             * <ul>
             * <li>Make sure that the custom DNS server is correct. Otherwise, the registration may fail.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ns1.aliyun.com</p>
             */
            public Builder dns2(String dns2) {
                this.dns2 = dns2;
                return this;
            }

            /**
             * <p>The domain name to be registered.</p>
             * <blockquote>
             * <p>When you register a domain name, you must specify the domain name registrant information. Otherwise, the domain name registration fails. You can specify the domain name registrant information by using the OrderActivateParam.N.RegistrantProfileId parameter to associate a domain name registrant profile.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The email address.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:username@example.com">username@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>Specifies whether to enable the domain name privacy protection service. Default value: <strong>true</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableDomainProxy(Boolean enableDomainProxy) {
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
                this.expectedPunycode = expectedPunycode;
                return this;
            }

            /**
             * <p>Specifies whether to allow the registration of premium domain names. Default value: <strong>false</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder permitPremiumActivation(Boolean permitPremiumActivation) {
                this.permitPremiumActivation = permitPremiumActivation;
                return this;
            }

            /**
             * <p>The postal code.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>102629</p>
             */
            public Builder postalCode(String postalCode) {
                this.postalCode = postalCode;
                return this;
            }

            /**
             * <p>The province name in English.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>bei jing</p>
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            /**
             * <p>The domain name contact in English.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>zhang san</p>
             */
            public Builder registrantName(String registrantName) {
                this.registrantName = registrantName;
                return this;
            }

            /**
             * <p>The name of the domain name registrant in English.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>zhang san</p>
             */
            public Builder registrantOrganization(String registrantOrganization) {
                this.registrantOrganization = registrantOrganization;
                return this;
            }

            /**
             * <p>The ID of the domain name registrant profile. The profile contains information such as the name of the domain name registrant, the domain name contact, the phone number, and the email address. You can only use the ID of a real-name verified domain name registrant profile to register a domain name. If you have created a domain name registrant profile, you can call the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> operation to query the profile ID.</p>
             * <blockquote>
             * <p>After you specify this parameter, you do not need to specify the <strong>OrderActivateParam.N.RegistrantType</strong>, <strong>OrderActivateParam.N.ZhRegistrantOrganization</strong>, <strong>OrderActivateParam.N.ZhRegistrantName</strong>, <strong>OrderActivateParam.N.ZhProvince</strong>, <strong>OrderActivateParam.N.ZhCity</strong>, <strong>OrderActivateParam.N.ZhAddress</strong>, <strong>OrderActivateParam.N.RegistrantOrganization</strong>, <strong>OrderActivateParam.N.RegistrantName</strong>, <strong>OrderActivateParam.N.Province</strong>, <strong>OrderActivateParam.N.City</strong>, <strong>OrderActivateParam.N.Address</strong>, <strong>OrderActivateParam.N.PostalCode</strong>, <strong>OrderActivateParam.N.Country</strong>, <strong>OrderActivateParam.N.TelArea</strong>, <strong>OrderActivateParam.N.Telephone</strong>, <strong>OrderActivateParam.N.TelExt</strong>, and <strong>OrderActivateParam.N.Email</strong> parameters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>000000</p>
             */
            public Builder registrantProfileId(Long registrantProfileId) {
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
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder registrantType(String registrantType) {
                this.registrantType = registrantType;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * <blockquote>
             * <p>If this parameter is not specified or the specified resource group ID does not exist, the default resource group ID is used.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rg-XX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The subscription duration. Unit: <strong>year</strong>. Default value: <strong>1</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subscriptionDuration(Integer subscriptionDuration) {
                this.subscriptionDuration = subscriptionDuration;
                return this;
            }

            /**
             * <p>The country code for the phone number. For example, the country code for China is <strong>86</strong>.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>86</p>
             */
            public Builder telArea(String telArea) {
                this.telArea = telArea;
                return this;
            }

            /**
             * <p>The extension number.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder telExt(String telExt) {
                this.telExt = telExt;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * <blockquote>
             * <p>This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1820000****</p>
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * <p>Specifies whether to allow the registration of trademark terms.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder trademarkDomainActivation(Boolean trademarkDomainActivation) {
                this.trademarkDomainActivation = trademarkDomainActivation;
                return this;
            }

            /**
             * <p>The mailing address in Chinese.</p>
             * <blockquote>
             * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>朝阳区<em><strong>大厦</strong></em>号</p>
             */
            public Builder zhAddress(String zhAddress) {
                this.zhAddress = zhAddress;
                return this;
            }

            /**
             * <p>The city name in Chinese.</p>
             * <blockquote>
             * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>北京市</p>
             */
            public Builder zhCity(String zhCity) {
                this.zhCity = zhCity;
                return this;
            }

            /**
             * <p>The province name in Chinese.</p>
             * <blockquote>
             * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>北京</p>
             */
            public Builder zhProvince(String zhProvince) {
                this.zhProvince = zhProvince;
                return this;
            }

            /**
             * <p>The domain name contact in Chinese.</p>
             * <blockquote>
             * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
             */
            public Builder zhRegistrantName(String zhRegistrantName) {
                this.zhRegistrantName = zhRegistrantName;
                return this;
            }

            /**
             * <p>The name of the domain name registrant in Chinese.</p>
             * <blockquote>
             * <p>This parameter is applicable only to the China site. This parameter is available and required only when the <strong>OrderActivateParam.N.RegistrantProfileId</strong> parameter is not specified. If this parameter is not specified, the domain name registration fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>张三</p>
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
