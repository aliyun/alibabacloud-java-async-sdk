// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * DefaultRegistrantProfile.
         */
        public Builder defaultRegistrantProfile(Boolean defaultRegistrantProfile) {
            this.putQueryParameter("DefaultRegistrantProfile", defaultRegistrantProfile);
            this.defaultRegistrantProfile = defaultRegistrantProfile;
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
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * RegistrantProfileType.
         */
        public Builder registrantProfileType(String registrantProfileType) {
            this.putQueryParameter("RegistrantProfileType", registrantProfileType);
            this.registrantProfileType = registrantProfileType;
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
         * UserClientIp.
         */
        public Builder userClientIp(String userClientIp) {
            this.putQueryParameter("UserClientIp", userClientIp);
            this.userClientIp = userClientIp;
            return this;
        }

        @Override
        public SaveRegistrantProfileRequest build() {
            return new SaveRegistrantProfileRequest(this);
        } 

    } 

}
