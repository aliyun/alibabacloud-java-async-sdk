// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveBatchTaskForUpdatingContactInfoByNewContactRequest} extends {@link RequestModel}
 *
 * <p>SaveBatchTaskForUpdatingContactInfoByNewContactRequest</p>
 */
public class SaveBatchTaskForUpdatingContactInfoByNewContactRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("ContactType")
    @Validation(required = true)
    private String contactType;

    @Query
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private java.util.List < String > domainName;

    @Query
    @NameInMap("Email")
    private String email;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PostalCode")
    private String postalCode;

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
    @NameInMap("RegistrantType")
    @Validation(required = true)
    private String registrantType;

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
    @NameInMap("TransferOutProhibited")
    private Boolean transferOutProhibited;

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

    private SaveBatchTaskForUpdatingContactInfoByNewContactRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.city = builder.city;
        this.contactType = builder.contactType;
        this.country = builder.country;
        this.domainName = builder.domainName;
        this.email = builder.email;
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

    public static SaveBatchTaskForUpdatingContactInfoByNewContactRequest create() {
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
     * @return contactType
     */
    public String getContactType() {
        return this.contactType;
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
    public java.util.List < String > getDomainName() {
        return this.domainName;
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

    public static final class Builder extends Request.Builder<SaveBatchTaskForUpdatingContactInfoByNewContactRequest, Builder> {
        private String address; 
        private String city; 
        private String contactType; 
        private String country; 
        private java.util.List < String > domainName; 
        private String email; 
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

        private Builder(SaveBatchTaskForUpdatingContactInfoByNewContactRequest response) {
            super(response);
            this.address = response.address;
            this.city = response.city;
            this.contactType = response.contactType;
            this.country = response.country;
            this.domainName = response.domainName;
            this.email = response.email;
            this.lang = response.lang;
            this.postalCode = response.postalCode;
            this.province = response.province;
            this.registrantName = response.registrantName;
            this.registrantOrganization = response.registrantOrganization;
            this.registrantType = response.registrantType;
            this.telArea = response.telArea;
            this.telExt = response.telExt;
            this.telephone = response.telephone;
            this.transferOutProhibited = response.transferOutProhibited;
            this.userClientIp = response.userClientIp;
            this.zhAddress = response.zhAddress;
            this.zhCity = response.zhCity;
            this.zhProvince = response.zhProvince;
            this.zhRegistrantName = response.zhRegistrantName;
            this.zhRegistrantOrganization = response.zhRegistrantOrganization;
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
         * ContactType.
         */
        public Builder contactType(String contactType) {
            this.putQueryParameter("ContactType", contactType);
            this.contactType = contactType;
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
         * DomainName.
         */
        public Builder domainName(java.util.List < String > domainName) {
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
         * TransferOutProhibited.
         */
        public Builder transferOutProhibited(Boolean transferOutProhibited) {
            this.putQueryParameter("TransferOutProhibited", transferOutProhibited);
            this.transferOutProhibited = transferOutProhibited;
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
        public SaveBatchTaskForUpdatingContactInfoByNewContactRequest build() {
            return new SaveBatchTaskForUpdatingContactInfoByNewContactRequest(this);
        } 

    } 

}
