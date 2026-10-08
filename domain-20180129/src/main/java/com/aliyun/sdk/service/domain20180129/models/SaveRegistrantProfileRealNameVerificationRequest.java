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
 * {@link SaveRegistrantProfileRealNameVerificationRequest} extends {@link RequestModel}
 *
 * <p>SaveRegistrantProfileRealNameVerificationRequest</p>
 */
public class SaveRegistrantProfileRealNameVerificationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Address")
    private String address;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Country")
    private String country;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCredential")
    private String identityCredential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCredentialNo")
    private String identityCredentialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCredentialType")
    private String identityCredentialType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PostalCode")
    private String postalCode;

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
    @com.aliyun.core.annotation.NameInMap("RegistrantProfileType")
    private String registrantProfileType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistrantType")
    private String registrantType;

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

    private SaveRegistrantProfileRealNameVerificationRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.email = builder.email;
        this.identityCredential = builder.identityCredential;
        this.identityCredentialNo = builder.identityCredentialNo;
        this.identityCredentialType = builder.identityCredentialType;
        this.lang = builder.lang;
        this.postalCode = builder.postalCode;
        this.province = builder.province;
        this.registrantName = builder.registrantName;
        this.registrantOrganization = builder.registrantOrganization;
        this.registrantProfileId = builder.registrantProfileId;
        this.registrantProfileType = builder.registrantProfileType;
        this.registrantType = builder.registrantType;
        this.telArea = builder.telArea;
        this.telExt = builder.telExt;
        this.telephone = builder.telephone;
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

    public static SaveRegistrantProfileRealNameVerificationRequest create() {
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
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return identityCredential
     */
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    /**
     * @return identityCredentialNo
     */
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    /**
     * @return identityCredentialType
     */
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return registrantProfileType
     */
    public String getRegistrantProfileType() {
        return this.registrantProfileType;
    }

    /**
     * @return registrantType
     */
    public String getRegistrantType() {
        return this.registrantType;
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

    public static final class Builder extends Request.Builder<SaveRegistrantProfileRealNameVerificationRequest, Builder> {
        private String address; 
        private String city; 
        private String country; 
        private String email; 
        private String identityCredential; 
        private String identityCredentialNo; 
        private String identityCredentialType; 
        private String lang; 
        private String postalCode; 
        private String province; 
        private String registrantName; 
        private String registrantOrganization; 
        private Long registrantProfileId; 
        private String registrantProfileType; 
        private String registrantType; 
        private String telArea; 
        private String telExt; 
        private String telephone; 
        private String userClientIp; 
        private String zhAddress; 
        private String zhCity; 
        private String zhProvince; 
        private String zhRegistrantName; 
        private String zhRegistrantOrganization; 

        private Builder() {
            super();
        } 

        private Builder(SaveRegistrantProfileRealNameVerificationRequest request) {
            super(request);
            this.address = request.address;
            this.city = request.city;
            this.country = request.country;
            this.email = request.email;
            this.identityCredential = request.identityCredential;
            this.identityCredentialNo = request.identityCredentialNo;
            this.identityCredentialType = request.identityCredentialType;
            this.lang = request.lang;
            this.postalCode = request.postalCode;
            this.province = request.province;
            this.registrantName = request.registrantName;
            this.registrantOrganization = request.registrantOrganization;
            this.registrantProfileId = request.registrantProfileId;
            this.registrantProfileType = request.registrantProfileType;
            this.registrantType = request.registrantType;
            this.telArea = request.telArea;
            this.telExt = request.telExt;
            this.telephone = request.telephone;
            this.userClientIp = request.userClientIp;
            this.zhAddress = request.zhAddress;
            this.zhCity = request.zhCity;
            this.zhProvince = request.zhProvince;
            this.zhRegistrantName = request.zhRegistrantName;
            this.zhRegistrantOrganization = request.zhRegistrantOrganization;
        } 

        /**
         * <p>Detailed address (in English).  </p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>City (in English).  </p>
         * <blockquote>
         * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
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
         * <p>Country code, such as <strong>CN</strong>.</p>
         * <blockquote>
         * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>Email address.  </p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>Base64-encoded image of the identity verification document. Image requirements:  </p>
         * <ul>
         * <li>Format must be <strong>jpg</strong> or <strong>bmp</strong>.  </li>
         * <li>Original image size must be between <strong>55 KB and 1 MB</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dGVzdA==</p>
         */
        public Builder identityCredential(String identityCredential) {
            this.putQueryParameter("IdentityCredential", identityCredential);
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * <p>Certificate number for identity verification.</p>
         * 
         * <strong>example:</strong>
         * <p>4111111111111110**</p>
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.putQueryParameter("IdentityCredentialNo", identityCredentialNo);
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * <p>Type of certificate used for identity verification. Valid values:  </p>
         * <ul>
         * <li><strong>SFZ</strong>: Identity card.  </li>
         * <li><strong>HZ</strong>: Passport.  </li>
         * <li><strong>YYZZ</strong>: Business license.  </li>
         * <li><strong>ORG</strong>: Organization code certificate.  </li>
         * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.  </li>
         * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
         * </ul>
         * <blockquote>
         * <p>For more certificate types, see <a href="https://help.aliyun.com/document_detail/72209.html">Supported Certificate Types for Identity Verification</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SFZ</p>
         */
        public Builder identityCredentialType(String identityCredentialType) {
            this.putQueryParameter("IdentityCredentialType", identityCredentialType);
            this.identityCredentialType = identityCredentialType;
            return this;
        }

        /**
         * <p>Language of the error message returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese  </li>
         * <li><strong>en</strong>: English</li>
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
         * <p>Postal code.  </p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>Province (in English).  </p>
         * <blockquote>
         * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
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
         * <p>Domain name contact (in English).  </p>
         * <blockquote>
         * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
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
         * <p>Registrant name (in English).</p>
         * <blockquote>
         * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>ID of the registrant profile template to be saved.  </p>
         * <p>The system automatically generates this ID after a registrant profile is successfully created. You can invoke the <a href="https://help.aliyun.com/document_detail/67701.html">QueryRegistrantProfiles</a> API to query the registrant profile ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * <p>Templatetype. Valid values:  </p>
         * <ul>
         * <li><strong>common</strong>: General template.  </li>
         * <li><strong>cnnic</strong>: CNNIC template.</li>
         * </ul>
         * <blockquote>
         * <p>The CNNIC template is supported only on the Alibaba Cloud international site (alibabacloud.com). Domains under the CNNIC registry, such as &quot;.cn&quot; and &quot;.中国&quot;, registered on the Alibaba Cloud international site must use the CNNIC template. Other domains must use the general template.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder registrantProfileType(String registrantProfileType) {
            this.putQueryParameter("RegistrantProfileType", registrantProfileType);
            this.registrantProfileType = registrantProfileType;
            return this;
        }

        /**
         * <p>Type of the registrant. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Individual.  </li>
         * <li><strong>2</strong>: Enterprise or organization.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>Telephone country code.</p>
         * <blockquote>
         * <p>For example, the telephone country code for China is <strong>86</strong>.</p>
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
         * <p>Extension number.</p>
         * <blockquote>
         * <p>This parameter is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>Telephone number.  </p>
         * <blockquote>
         * <p>This parameter is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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

        /**
         * <p>Full address (in Chinese).</p>
         * <blockquote>
         * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>City (in Chinese).  </p>
         * <blockquote>
         * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
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
         * <p>Province (in Chinese).  </p>
         * <blockquote>
         * <p>This parameter applies only to the China site (aliyun.com). It is available and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
         * <p>Domain name contact (in Chinese).  </p>
         * <blockquote>
         * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. If this parameter is not provided, domain name registration will fail.</p>
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
         * <p>Registrant name (in Chinese).</p>
         * <blockquote>
         * <p>This parameter applies only to the China site (aliyun.com). It is active and required only when the <strong>RegistrantProfileId</strong> parameter is not provided. Failure to provide it will cause domain registration to fail.</p>
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
        public SaveRegistrantProfileRealNameVerificationRequest build() {
            return new SaveRegistrantProfileRealNameVerificationRequest(this);
        } 

    } 

}
