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
 * {@link SaveRegistrantProfileRequest} extends {@link RequestModel}
 *
 * <p>SaveRegistrantProfileRequest</p>
 */
public class SaveRegistrantProfileRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("DefaultRegistrantProfile")
    private Boolean defaultRegistrantProfile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Email")
    private String email;

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

    private SaveRegistrantProfileRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.city = builder.city;
        this.country = builder.country;
        this.defaultRegistrantProfile = builder.defaultRegistrantProfile;
        this.email = builder.email;
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

    public static SaveRegistrantProfileRequest create() {
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
     * @return defaultRegistrantProfile
     */
    public Boolean getDefaultRegistrantProfile() {
        return this.defaultRegistrantProfile;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
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

    public static final class Builder extends Request.Builder<SaveRegistrantProfileRequest, Builder> {
        private String address; 
        private String city; 
        private String country; 
        private Boolean defaultRegistrantProfile; 
        private String email; 
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

        private Builder(SaveRegistrantProfileRequest request) {
            super(request);
            this.address = request.address;
            this.city = request.city;
            this.country = request.country;
            this.defaultRegistrantProfile = request.defaultRegistrantProfile;
            this.email = request.email;
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
         * <p>Street address (English).</p>
         * 
         * <strong>example:</strong>
         * <p>zhe jiang sheng hang zhou shi shi li qu shi li zhen shi li da sha 1001 hao</p>
         */
        public Builder address(String address) {
            this.putQueryParameter("Address", address);
            this.address = address;
            return this;
        }

        /**
         * <p>City (English). Enter the name of the city where the registrant is located.  </p>
         * <blockquote>
         * <p>Include the word “shi” (meaning “city”) in the city name. For example, if the registrant is in Hangzhou, enter “hang zhou shi”.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>hang zhou shi</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>Country code. For example, <strong>CN</strong> represents China and <strong>US</strong> represents the United States.</p>
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
         * <p>Whether to set this profile as the default template. Valid values:  </p>
         * <ul>
         * <li><strong>true</strong>: Default template.  </li>
         * <li><strong>false</strong>: Non-default template.</li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder defaultRegistrantProfile(Boolean defaultRegistrantProfile) {
            this.putQueryParameter("DefaultRegistrantProfile", defaultRegistrantProfile);
            this.defaultRegistrantProfile = defaultRegistrantProfile;
            return this;
        }

        /**
         * <p>Mailbox.</p>
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
         * <p>Language of the error message returned by the API. Valid values:  </p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.  </li>
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
         * <p>310024</p>
         */
        public Builder postalCode(String postalCode) {
            this.putQueryParameter("PostalCode", postalCode);
            this.postalCode = postalCode;
            return this;
        }

        /**
         * <p>Province (in English). Enter the name of the province where the registrant resides.</p>
         * <blockquote>
         * <p>Enter only the province name without the word &quot;Province.&quot; For example, if the registrant is in Zhejiang Province, enter &quot;zhe jiang&quot; for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>zhe jiang</p>
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * <p>Contact name (in English).</p>
         * 
         * <strong>example:</strong>
         * <p>li si</p>
         */
        public Builder registrantName(String registrantName) {
            this.putQueryParameter("RegistrantName", registrantName);
            this.registrantName = registrantName;
            return this;
        }

        /**
         * <p>Registrant name (in English).</p>
         * 
         * <strong>example:</strong>
         * <p>li si</p>
         */
        public Builder registrantOrganization(String registrantOrganization) {
            this.putQueryParameter("RegistrantOrganization", registrantOrganization);
            this.registrantOrganization = registrantOrganization;
            return this;
        }

        /**
         * <p>The information template ID, which is automatically generated by the system after the information template is successfully created.</p>
         * <blockquote>
         * <p>You must specify this parameter when updating an information template. After the information template is successfully created, you can invoke the <a href="~~QueryRegistrantProfiles~~">QueryRegistrantProfiles</a> API to query the information template ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.putQueryParameter("RegistrantProfileId", registrantProfileId);
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * <p>Information template type. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: Common template.</li>
         * <li><strong>cnnic</strong>: CNNIC template.</li>
         * </ul>
         * <blockquote>
         * <p>The CNNIC template is supported only on the Alibaba Cloud international site (alibabacloud.com). Domain names such as &quot;.cn&quot; and &quot;.中国&quot; registered under the CNNIC domain name registry on the Alibaba Cloud international site require the CNNIC template. All other domain names use the common template.</p>
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
         * <p>Registrant type. Valid values:  </p>
         * <ul>
         * <li><strong>1</strong>: Individual.  </li>
         * <li><strong>2</strong>: Organization.</li>
         * </ul>
         * <p>Default value: <strong>1</strong>.</p>
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
         * <p>Telephone country code. For example, the telephone country code for China is <strong>86</strong>.</p>
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
         * <p>Telephone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1829756****</p>
         */
        public Builder telephone(String telephone) {
            this.putQueryParameter("Telephone", telephone);
            this.telephone = telephone;
            return this;
        }

        /**
         * <p>User IP address. You can set it to 127.0.0.1.</p>
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
         * <p>Detailed address (in Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省杭州市示例区示例镇示例大厦1001号</p>
         */
        public Builder zhAddress(String zhAddress) {
            this.putQueryParameter("ZhAddress", zhAddress);
            this.zhAddress = zhAddress;
            return this;
        }

        /**
         * <p>City (in Chinese). Enter the name of the city where the registrant resides.</p>
         * <blockquote>
         * <p>Include the word &quot;City&quot; in the city name. For example, if the registrant is in Hangzhou, enter &quot;杭州市&quot; for this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>杭州市</p>
         */
        public Builder zhCity(String zhCity) {
            this.putQueryParameter("ZhCity", zhCity);
            this.zhCity = zhCity;
            return this;
        }

        /**
         * <p>Province (Chinese). Enter the name of the province where the registrant is located.  </p>
         * <blockquote>
         * <p>Enter only the province name without the word “省”. For example, if the registrant is in Zhejiang Province, enter “浙江”.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>浙江</p>
         */
        public Builder zhProvince(String zhProvince) {
            this.putQueryParameter("ZhProvince", zhProvince);
            this.zhProvince = zhProvince;
            return this;
        }

        /**
         * <p>Contact name (Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        public Builder zhRegistrantName(String zhRegistrantName) {
            this.putQueryParameter("ZhRegistrantName", zhRegistrantName);
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }

        /**
         * <p>Registrant name (in Chinese).</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
         */
        public Builder zhRegistrantOrganization(String zhRegistrantOrganization) {
            this.putQueryParameter("ZhRegistrantOrganization", zhRegistrantOrganization);
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }

        @Override
        public SaveRegistrantProfileRequest build() {
            return new SaveRegistrantProfileRequest(this);
        } 

    } 

}
