// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain_intl20171218.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest} extends {@link RequestModel}
 *
 * <p>SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest</p>
 */
public class SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("City")
    private String city;

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

    @Body
    @NameInMap("IdentityCredential")
    @Validation(required = true)
    private String identityCredential;

    @Query
    @NameInMap("IdentityCredentialNo")
    @Validation(required = true)
    private String identityCredentialNo;

    @Query
    @NameInMap("IdentityCredentialType")
    @Validation(required = true)
    private String identityCredentialType;

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
    @Validation(required = true)
    private String telArea;

    @Query
    @NameInMap("TelExt")
    private String telExt;

    @Query
    @NameInMap("Telephone")
    @Validation(required = true)
    private String telephone;

    @Query
    @NameInMap("TransferOutProhibited")
    @Validation(required = true)
    private Boolean transferOutProhibited;

    @Query
    @NameInMap("UserClientIp")
    private String userClientIp;

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

    public static final class Builder extends Request.Builder<SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest, Builder> {
        private String address; 
        private String city; 
        private String country; 
        private java.util.List < String > domainName; 
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
         * IdentityCredential.
         */
        public Builder identityCredential(String identityCredential) {
            this.putBodyParameter("IdentityCredential", identityCredential);
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * IdentityCredentialNo.
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.putQueryParameter("IdentityCredentialNo", identityCredentialNo);
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * IdentityCredentialType.
         */
        public Builder identityCredentialType(String identityCredentialType) {
            this.putQueryParameter("IdentityCredentialType", identityCredentialType);
            this.identityCredentialType = identityCredentialType;
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

        @Override
        public SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest build() {
            return new SaveTaskForUpdatingRegistrantInfoByIdentityCredentialRequest(this);
        } 

    } 

}
