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
 * {@link SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest</p>
 */
public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdentityCredential")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityCredential;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCredentialNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String identityCredentialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityCredentialType")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("RegistrantType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String registrantType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelArea")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telArea;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TelExt")
    private String telExt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Telephone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String telephone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransferOutProhibited")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean transferOutProhibited;

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

    private SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.domainName = builder.domainName;
        this.email = builder.email;
        this.identityCredential = builder.identityCredential;
        this.identityCredentialNo = builder.identityCredentialNo;
        this.identityCredentialType = builder.identityCredentialType;
        this.lang = builder.lang;
        this.postalCode = builder.postalCode;
        this.province = builder.province;
        this.registrantName = builder.registrantName;
        this.registrantOrganization = builder.registrantOrganization;
        this.registrantType = builder.registrantType;
        this.telArea = builder.telArea;
        this.telExt = builder.telExt;
        this.telephone = builder.telephone;
        this.transferOutProhibited = builder.transferOutProhibited;
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

    public static SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest create() {
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
     * @return domainName
     */
    public java.util.List<String> getDomainName() {
        return this.domainName;
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
     * @return transferOutProhibited
     */
    public Boolean getTransferOutProhibited() {
        return this.transferOutProhibited;
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

    public static final class Builder extends Request.Builder<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest, Builder> {
        private String address; 
        private String city; 
        private String country; 
        private java.util.List<String> domainName; 
        private String email; 
        private String identityCredential; 
        private String identityCredentialNo; 
        private String identityCredentialType; 
        private String lang; 
        private String postalCode; 
        private String province; 
        private String registrantName; 
        private String registrantOrganization; 
        private String registrantType; 
        private String telArea; 
        private String telExt; 
        private String telephone; 
        private Boolean transferOutProhibited; 
        private String userClientIp; 
        private String zhAddress; 
        private String zhCity; 
        private String zhProvince; 
        private String zhRegistrantName; 
        private String zhRegistrantOrganization; 

        private Builder() {
            super();
        } 

        private Builder(SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest request) {
            super(request);
            this.address = request.address;
            this.city = request.city;
            this.country = request.country;
            this.domainName = request.domainName;
            this.email = request.email;
            this.identityCredential = request.identityCredential;
            this.identityCredentialNo = request.identityCredentialNo;
            this.identityCredentialType = request.identityCredentialType;
            this.lang = request.lang;
            this.postalCode = request.postalCode;
            this.province = request.province;
            this.registrantName = request.registrantName;
            this.registrantOrganization = request.registrantOrganization;
            this.registrantType = request.registrantType;
            this.telArea = request.telArea;
            this.telExt = request.telExt;
            this.telephone = request.telephone;
            this.transferOutProhibited = request.transferOutProhibited;
            this.userClientIp = request.userClientIp;
            this.zhAddress = request.zhAddress;
            this.zhCity = request.zhCity;
            this.zhProvince = request.zhProvince;
            this.zhRegistrantName = request.zhRegistrantName;
            this.zhRegistrantOrganization = request.zhRegistrantOrganization;
        } 

        /**
         * <p>Specific address.</p>
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
         * <p>City.</p>
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
         * <p>Country code, such as <strong>CN</strong> or <strong>US</strong>.</p>
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
         * <p>List of domain names.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alibabacloud.com</p>
         */
        public Builder domainName(java.util.List<String> domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Mailbox.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:test@aliyun.com">test@aliyun.com</a></p>
         */
        public Builder email(String email) {
            this.putQueryParameter("Email", email);
            this.email = email;
            return this;
        }

        /**
         * <p>Base64-encoded image of the identity verification document. Image requirements:</p>
         * <ul>
         * <li>Format must be <strong>jpg</strong> or <strong>bmp</strong>.</li>
         * <li>Original image size must be between <strong>55 KB and 1 MB</strong>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>h6UPhXz/ADP/2Q==</p>
         */
        public Builder identityCredential(String identityCredential) {
            this.putBodyParameter("IdentityCredential", identityCredential);
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * <p>Certificate number used for identity verification, such as an ID card number or Unified Social Credit Code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5****************9</p>
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.putQueryParameter("IdentityCredentialNo", identityCredentialNo);
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * <p>Identity verification certificate type. Valid values:</p>
         * <ul>
         * <li><strong>SFZ</strong>: Identity card.</li>
         * <li><strong>HZ</strong>: Passport.</li>
         * <li><strong>YYZZ</strong>: Business license.</li>
         * <li><strong>ORG</strong>: Organization code certificate.</li>
         * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.</li>
         * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
         * </ul>
         * <p>If your certificate type is not listed above, see <a href="https://help.aliyun.com/document_detail/72209.html">Supported identity verification certificate types</a> for valid values of other certificate types.</p>
         * <blockquote>
         * <p>You must select the certificate type that matches the document you are submitting.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>Language of the error message returned by the API. Valid values:</p>
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
         * <p>Postal code.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder postalCode(String postalCode) {
            this.putQueryParameter("PostalCode", postalCode);
            this.postalCode = postalCode;
            return this;
        }

        /**
         * <p>Province.</p>
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
         * <p>Contact name.</p>
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
         * <p>Registrant organization name.</p>
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
         * <p>Domain registrant type. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Individual.</li>
         * <li><strong>2</strong>: Organization.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
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
         * <p>Telephone extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder telExt(String telExt) {
            this.putQueryParameter("TelExt", telExt);
            this.telExt = telExt;
            return this;
        }

        /**
         * <p>Telephone number.</p>
         * <p>This parameter is required.</p>
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
         * <p>Whether to add a transfer-out prohibition restriction. This indicates whether modifying the registrant imposes a 60-day restriction on domain name transfer-out. Default value: <strong>false</strong>, which means transfer-out is not restricted.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder transferOutProhibited(Boolean transferOutProhibited) {
            this.putQueryParameter("TransferOutProhibited", transferOutProhibited);
            this.transferOutProhibited = transferOutProhibited;
            return this;
        }

        /**
         * <p>User IP address.</p>
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
         * <p>Chinese address.</p>
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
         * <p>Chinese city name.</p>
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
         * <p>Chinese province name.</p>
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
         * <p>Chinese contact name.</p>
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
         * <p>Chinese registrant organization name.</p>
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
        public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest build() {
            return new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest(this);
        } 

    } 

}
