// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateApplicantRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicantRequest</p>
 */
public class UpdateApplicantRequest extends Request {
    @Query
    @NameInMap("Address")
    private String address;

    @Query
    @NameInMap("ApplicantId")
    @Validation(required = true)
    private Long applicantId;

    @Query
    @NameInMap("ApplicantName")
    private String applicantName;

    @Query
    @NameInMap("AuthorizationOssKey")
    private String authorizationOssKey;

    @Query
    @NameInMap("BusinessLicenceOssKey")
    private String businessLicenceOssKey;

    @Query
    @NameInMap("CardNumber")
    private String cardNumber;

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
    @NameInMap("ContactZipcode")
    private String contactZipcode;

    @Query
    @NameInMap("EAddress")
    private String eAddress;

    @Query
    @NameInMap("EName")
    private String eName;

    @Query
    @NameInMap("IdCardName")
    private String idCardName;

    @Query
    @NameInMap("IdCardNumber")
    private String idCardNumber;

    @Query
    @NameInMap("IdCardOssKey")
    private String idCardOssKey;

    @Query
    @NameInMap("LegalNoticeOssKey")
    private String legalNoticeOssKey;

    @Query
    @NameInMap("PassportOssKey")
    private String passportOssKey;

    @Query
    @NameInMap("PersonalType")
    private Long personalType;

    @Query
    @NameInMap("Province")
    private String province;

    private UpdateApplicantRequest(Builder builder) {
        super(builder);
        this.address = builder.address;
        this.applicantId = builder.applicantId;
        this.applicantName = builder.applicantName;
        this.authorizationOssKey = builder.authorizationOssKey;
        this.businessLicenceOssKey = builder.businessLicenceOssKey;
        this.cardNumber = builder.cardNumber;
        this.contactAddress = builder.contactAddress;
        this.contactCity = builder.contactCity;
        this.contactCounty = builder.contactCounty;
        this.contactDistrict = builder.contactDistrict;
        this.contactEmail = builder.contactEmail;
        this.contactName = builder.contactName;
        this.contactNumber = builder.contactNumber;
        this.contactProvince = builder.contactProvince;
        this.contactZipcode = builder.contactZipcode;
        this.eAddress = builder.eAddress;
        this.eName = builder.eName;
        this.idCardName = builder.idCardName;
        this.idCardNumber = builder.idCardNumber;
        this.idCardOssKey = builder.idCardOssKey;
        this.legalNoticeOssKey = builder.legalNoticeOssKey;
        this.passportOssKey = builder.passportOssKey;
        this.personalType = builder.personalType;
        this.province = builder.province;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicantRequest create() {
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
     * @return applicantName
     */
    public String getApplicantName() {
        return this.applicantName;
    }

    /**
     * @return authorizationOssKey
     */
    public String getAuthorizationOssKey() {
        return this.authorizationOssKey;
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
     * @return contactZipcode
     */
    public String getContactZipcode() {
        return this.contactZipcode;
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
     * @return idCardName
     */
    public String getIdCardName() {
        return this.idCardName;
    }

    /**
     * @return idCardNumber
     */
    public String getIdCardNumber() {
        return this.idCardNumber;
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
     * @return passportOssKey
     */
    public String getPassportOssKey() {
        return this.passportOssKey;
    }

    /**
     * @return personalType
     */
    public Long getPersonalType() {
        return this.personalType;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    public static final class Builder extends Request.Builder<UpdateApplicantRequest, Builder> {
        private String address; 
        private Long applicantId; 
        private String applicantName; 
        private String authorizationOssKey; 
        private String businessLicenceOssKey; 
        private String cardNumber; 
        private String contactAddress; 
        private String contactCity; 
        private String contactCounty; 
        private String contactDistrict; 
        private String contactEmail; 
        private String contactName; 
        private String contactNumber; 
        private String contactProvince; 
        private String contactZipcode; 
        private String eAddress; 
        private String eName; 
        private String idCardName; 
        private String idCardNumber; 
        private String idCardOssKey; 
        private String legalNoticeOssKey; 
        private String passportOssKey; 
        private Long personalType; 
        private String province; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicantRequest request) {
            super(request);
            this.address = request.address;
            this.applicantId = request.applicantId;
            this.applicantName = request.applicantName;
            this.authorizationOssKey = request.authorizationOssKey;
            this.businessLicenceOssKey = request.businessLicenceOssKey;
            this.cardNumber = request.cardNumber;
            this.contactAddress = request.contactAddress;
            this.contactCity = request.contactCity;
            this.contactCounty = request.contactCounty;
            this.contactDistrict = request.contactDistrict;
            this.contactEmail = request.contactEmail;
            this.contactName = request.contactName;
            this.contactNumber = request.contactNumber;
            this.contactProvince = request.contactProvince;
            this.contactZipcode = request.contactZipcode;
            this.eAddress = request.eAddress;
            this.eName = request.eName;
            this.idCardName = request.idCardName;
            this.idCardNumber = request.idCardNumber;
            this.idCardOssKey = request.idCardOssKey;
            this.legalNoticeOssKey = request.legalNoticeOssKey;
            this.passportOssKey = request.passportOssKey;
            this.personalType = request.personalType;
            this.province = request.province;
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
         * ApplicantName.
         */
        public Builder applicantName(String applicantName) {
            this.putQueryParameter("ApplicantName", applicantName);
            this.applicantName = applicantName;
            return this;
        }

        /**
         * AuthorizationOssKey.
         */
        public Builder authorizationOssKey(String authorizationOssKey) {
            this.putQueryParameter("AuthorizationOssKey", authorizationOssKey);
            this.authorizationOssKey = authorizationOssKey;
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
         * ContactZipcode.
         */
        public Builder contactZipcode(String contactZipcode) {
            this.putQueryParameter("ContactZipcode", contactZipcode);
            this.contactZipcode = contactZipcode;
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
         * IdCardName.
         */
        public Builder idCardName(String idCardName) {
            this.putQueryParameter("IdCardName", idCardName);
            this.idCardName = idCardName;
            return this;
        }

        /**
         * IdCardNumber.
         */
        public Builder idCardNumber(String idCardNumber) {
            this.putQueryParameter("IdCardNumber", idCardNumber);
            this.idCardNumber = idCardNumber;
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
         * PassportOssKey.
         */
        public Builder passportOssKey(String passportOssKey) {
            this.putQueryParameter("PassportOssKey", passportOssKey);
            this.passportOssKey = passportOssKey;
            return this;
        }

        /**
         * PersonalType.
         */
        public Builder personalType(Long personalType) {
            this.putQueryParameter("PersonalType", personalType);
            this.personalType = personalType;
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

        @Override
        public UpdateApplicantRequest build() {
            return new UpdateApplicantRequest(this);
        } 

    } 

}
