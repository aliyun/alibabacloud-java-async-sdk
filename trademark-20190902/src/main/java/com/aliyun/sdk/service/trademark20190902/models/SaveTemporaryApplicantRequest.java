// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveTemporaryApplicantRequest} extends {@link RequestModel}
 *
 * <p>SaveTemporaryApplicantRequest</p>
 */
public class SaveTemporaryApplicantRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("ApplicantId")
    @Validation(maximum = 2147483647, minimum = 1)
    private Long applicantId;

    @Query
    @NameInMap("BusinessLicenceOssKey")
    private String businessLicenceOssKey;

    @Query
    @NameInMap("CardNumber")
    private String cardNumber;

    @Query
    @NameInMap("City")
    private String city;

    @Query
    @NameInMap("CompleteApplicant")
    private Boolean completeApplicant;

    @Query
    @NameInMap("ContactAddress")
    private String contactAddress;

    @Query
    @NameInMap("ContactCity")
    private String contactCity;

    @Query
    @NameInMap("ContactCounty")
    private String contactCounty;

    @Query
    @NameInMap("ContactDistrict")
    private String contactDistrict;

    @Query
    @NameInMap("ContactEmail")
    private String contactEmail;

    @Query
    @NameInMap("ContactName")
    private String contactName;

    @Query
    @NameInMap("ContactNumber")
    private String contactNumber;

    @Query
    @NameInMap("ContactProvince")
    private String contactProvince;

    @Query
    @NameInMap("ContactZipCode")
    private String contactZipCode;

    @Query
    @NameInMap("Country")
    private String country;

    @Query
    @NameInMap("EAddress")
    private String eAddress;

    @Query
    @NameInMap("EName")
    private String eName;

    @Query
    @NameInMap("IdCardOssKey")
    private String idCardOssKey;

    @Query
    @NameInMap("LegalNoticeOssKey")
    private String legalNoticeOssKey;

    @Query
    @NameInMap("LoaOssKey")
    private String loaOssKey;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PassportOssKey")
    private String passportOssKey;

    @Query
    @NameInMap("PrincipalName")
    @Validation(maximum = 2, minimum = 1)
    private Integer principalName;

    @Query
    @NameInMap("Province")
    private String province;

    @Query
    @NameInMap("Region")
    private String region;

    @Query
    @NameInMap("Town")
    private String town;

    @Query
    @NameInMap("Type")
    private String type;

    private SaveTemporaryApplicantRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.applicantId = builder.applicantId;
        this.businessLicenceOssKey = builder.businessLicenceOssKey;
        this.cardNumber = builder.cardNumber;
        this.city = builder.city;
        this.completeApplicant = builder.completeApplicant;
        this.contactAddress = builder.contactAddress;
        this.contactCity = builder.contactCity;
        this.contactCounty = builder.contactCounty;
        this.contactDistrict = builder.contactDistrict;
        this.contactEmail = builder.contactEmail;
        this.contactName = builder.contactName;
        this.contactNumber = builder.contactNumber;
        this.contactProvince = builder.contactProvince;
        this.contactZipCode = builder.contactZipCode;
        this.country = builder.country;
        this.eAddress = builder.eAddress;
        this.eName = builder.eName;
        this.idCardOssKey = builder.idCardOssKey;
        this.legalNoticeOssKey = builder.legalNoticeOssKey;
        this.loaOssKey = builder.loaOssKey;
        this.name = builder.name;
        this.passportOssKey = builder.passportOssKey;
        this.principalName = builder.principalName;
        this.province = builder.province;
        this.region = builder.region;
        this.town = builder.town;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveTemporaryApplicantRequest create() {
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
     * @return applicantId
     */
    public Long getApplicantId() {
        return this.applicantId;
    }

    /**
     * @return businessLicenceOssKey
     */
    public String getBusinessLicenceOssKey() {
        return this.businessLicenceOssKey;
    }

    /**
     * @return cardNumber
     */
    public String getCardNumber() {
        return this.cardNumber;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return completeApplicant
     */
    public Boolean getCompleteApplicant() {
        return this.completeApplicant;
    }

    /**
     * @return contactAddress
     */
    public String getContactAddress() {
        return this.contactAddress;
    }

    /**
     * @return contactCity
     */
    public String getContactCity() {
        return this.contactCity;
    }

    /**
     * @return contactCounty
     */
    public String getContactCounty() {
        return this.contactCounty;
    }

    /**
     * @return contactDistrict
     */
    public String getContactDistrict() {
        return this.contactDistrict;
    }

    /**
     * @return contactEmail
     */
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * @return contactName
     */
    public String getContactName() {
        return this.contactName;
    }

    /**
     * @return contactNumber
     */
    public String getContactNumber() {
        return this.contactNumber;
    }

    /**
     * @return contactProvince
     */
    public String getContactProvince() {
        return this.contactProvince;
    }

    /**
     * @return contactZipCode
     */
    public String getContactZipCode() {
        return this.contactZipCode;
    }

    /**
     * @return country
     */
    public String getCountry() {
        return this.country;
    }

    /**
     * @return eAddress
     */
    public String getEAddress() {
        return this.eAddress;
    }

    /**
     * @return eName
     */
    public String getEName() {
        return this.eName;
    }

    /**
     * @return idCardOssKey
     */
    public String getIdCardOssKey() {
        return this.idCardOssKey;
    }

    /**
     * @return legalNoticeOssKey
     */
    public String getLegalNoticeOssKey() {
        return this.legalNoticeOssKey;
    }

    /**
     * @return loaOssKey
     */
    public String getLoaOssKey() {
        return this.loaOssKey;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return passportOssKey
     */
    public String getPassportOssKey() {
        return this.passportOssKey;
    }

    /**
     * @return principalName
     */
    public Integer getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return town
     */
    public String getTown() {
        return this.town;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SaveTemporaryApplicantRequest, Builder> {
        private String address; 
        private Long applicantId; 
        private String businessLicenceOssKey; 
        private String cardNumber; 
        private String city; 
        private Boolean completeApplicant; 
        private String contactAddress; 
        private String contactCity; 
        private String contactCounty; 
        private String contactDistrict; 
        private String contactEmail; 
        private String contactName; 
        private String contactNumber; 
        private String contactProvince; 
        private String contactZipCode; 
        private String country; 
        private String eAddress; 
        private String eName; 
        private String idCardOssKey; 
        private String legalNoticeOssKey; 
        private String loaOssKey; 
        private String name; 
        private String passportOssKey; 
        private Integer principalName; 
        private String province; 
        private String region; 
        private String town; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SaveTemporaryApplicantRequest request) {
            super(request);
            this.address = request.address;
            this.applicantId = request.applicantId;
            this.businessLicenceOssKey = request.businessLicenceOssKey;
            this.cardNumber = request.cardNumber;
            this.city = request.city;
            this.completeApplicant = request.completeApplicant;
            this.contactAddress = request.contactAddress;
            this.contactCity = request.contactCity;
            this.contactCounty = request.contactCounty;
            this.contactDistrict = request.contactDistrict;
            this.contactEmail = request.contactEmail;
            this.contactName = request.contactName;
            this.contactNumber = request.contactNumber;
            this.contactProvince = request.contactProvince;
            this.contactZipCode = request.contactZipCode;
            this.country = request.country;
            this.eAddress = request.eAddress;
            this.eName = request.eName;
            this.idCardOssKey = request.idCardOssKey;
            this.legalNoticeOssKey = request.legalNoticeOssKey;
            this.loaOssKey = request.loaOssKey;
            this.name = request.name;
            this.passportOssKey = request.passportOssKey;
            this.principalName = request.principalName;
            this.province = request.province;
            this.region = request.region;
            this.town = request.town;
            this.type = request.type;
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
         * ApplicantId.
         */
        public Builder applicantId(Long applicantId) {
            this.putQueryParameter("ApplicantId", applicantId);
            this.applicantId = applicantId;
            return this;
        }

        /**
         * BusinessLicenceOssKey.
         */
        public Builder businessLicenceOssKey(String businessLicenceOssKey) {
            this.putQueryParameter("BusinessLicenceOssKey", businessLicenceOssKey);
            this.businessLicenceOssKey = businessLicenceOssKey;
            return this;
        }

        /**
         * CardNumber.
         */
        public Builder cardNumber(String cardNumber) {
            this.putQueryParameter("CardNumber", cardNumber);
            this.cardNumber = cardNumber;
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
         * CompleteApplicant.
         */
        public Builder completeApplicant(Boolean completeApplicant) {
            this.putQueryParameter("CompleteApplicant", completeApplicant);
            this.completeApplicant = completeApplicant;
            return this;
        }

        /**
         * ContactAddress.
         */
        public Builder contactAddress(String contactAddress) {
            this.putQueryParameter("ContactAddress", contactAddress);
            this.contactAddress = contactAddress;
            return this;
        }

        /**
         * ContactCity.
         */
        public Builder contactCity(String contactCity) {
            this.putQueryParameter("ContactCity", contactCity);
            this.contactCity = contactCity;
            return this;
        }

        /**
         * ContactCounty.
         */
        public Builder contactCounty(String contactCounty) {
            this.putQueryParameter("ContactCounty", contactCounty);
            this.contactCounty = contactCounty;
            return this;
        }

        /**
         * ContactDistrict.
         */
        public Builder contactDistrict(String contactDistrict) {
            this.putQueryParameter("ContactDistrict", contactDistrict);
            this.contactDistrict = contactDistrict;
            return this;
        }

        /**
         * ContactEmail.
         */
        public Builder contactEmail(String contactEmail) {
            this.putQueryParameter("ContactEmail", contactEmail);
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.putQueryParameter("ContactName", contactName);
            this.contactName = contactName;
            return this;
        }

        /**
         * ContactNumber.
         */
        public Builder contactNumber(String contactNumber) {
            this.putQueryParameter("ContactNumber", contactNumber);
            this.contactNumber = contactNumber;
            return this;
        }

        /**
         * ContactProvince.
         */
        public Builder contactProvince(String contactProvince) {
            this.putQueryParameter("ContactProvince", contactProvince);
            this.contactProvince = contactProvince;
            return this;
        }

        /**
         * ContactZipCode.
         */
        public Builder contactZipCode(String contactZipCode) {
            this.putQueryParameter("ContactZipCode", contactZipCode);
            this.contactZipCode = contactZipCode;
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
         * EAddress.
         */
        public Builder eAddress(String eAddress) {
            this.putQueryParameter("EAddress", eAddress);
            this.eAddress = eAddress;
            return this;
        }

        /**
         * EName.
         */
        public Builder eName(String eName) {
            this.putQueryParameter("EName", eName);
            this.eName = eName;
            return this;
        }

        /**
         * IdCardOssKey.
         */
        public Builder idCardOssKey(String idCardOssKey) {
            this.putQueryParameter("IdCardOssKey", idCardOssKey);
            this.idCardOssKey = idCardOssKey;
            return this;
        }

        /**
         * LegalNoticeOssKey.
         */
        public Builder legalNoticeOssKey(String legalNoticeOssKey) {
            this.putQueryParameter("LegalNoticeOssKey", legalNoticeOssKey);
            this.legalNoticeOssKey = legalNoticeOssKey;
            return this;
        }

        /**
         * LoaOssKey.
         */
        public Builder loaOssKey(String loaOssKey) {
            this.putQueryParameter("LoaOssKey", loaOssKey);
            this.loaOssKey = loaOssKey;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PassportOssKey.
         */
        public Builder passportOssKey(String passportOssKey) {
            this.putQueryParameter("PassportOssKey", passportOssKey);
            this.passportOssKey = passportOssKey;
            return this;
        }

        /**
         * PrincipalName.
         */
        public Builder principalName(Integer principalName) {
            this.putQueryParameter("PrincipalName", principalName);
            this.principalName = principalName;
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
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Town.
         */
        public Builder town(String town) {
            this.putQueryParameter("Town", town);
            this.town = town;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public SaveTemporaryApplicantRequest build() {
            return new SaveTemporaryApplicantRequest(this);
        } 

    } 

}
