// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicantResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicantResponseBody</p>
 */
public class DescribeApplicantResponseBody extends TeaModel {
    @NameInMap("Address")
    private String address;

    @NameInMap("ApplicantId")
    private Long applicantId;

    @NameInMap("ApplicantName")
    private String applicantName;

    @NameInMap("ApplicantRegion")
    private Integer applicantRegion;

    @NameInMap("ApplicantType")
    private Integer applicantType;

    @NameInMap("ApplicantVersion")
    private String applicantVersion;

    @NameInMap("AuditStatus")
    private Integer auditStatus;

    @NameInMap("AuthorizationAuditStatus")
    private Integer authorizationAuditStatus;

    @NameInMap("AuthorizationUrl")
    private String authorizationUrl;

    @NameInMap("BusinessLicenceUrl")
    private String businessLicenceUrl;

    @NameInMap("CardNumber")
    private String cardNumber;

    @NameInMap("ContactAddress")
    private String contactAddress;

    @NameInMap("ContactCity")
    private String contactCity;

    @NameInMap("ContactCounty")
    private String contactCounty;

    @NameInMap("ContactDistrict")
    private String contactDistrict;

    @NameInMap("ContactEmail")
    private String contactEmail;

    @NameInMap("ContactName")
    private String contactName;

    @NameInMap("ContactNumber")
    private String contactNumber;

    @NameInMap("ContactProvince")
    private String contactProvince;

    @NameInMap("ContactZipcode")
    private String contactZipcode;

    @NameInMap("Country")
    private String country;

    @NameInMap("EAddress")
    private String eAddress;

    @NameInMap("EName")
    private String eName;

    @NameInMap("IdCardName")
    private String idCardName;

    @NameInMap("IdCardNumber")
    private String idCardNumber;

    @NameInMap("IdCardUrl")
    private String idCardUrl;

    @NameInMap("LegalNoticeUrl")
    private String legalNoticeUrl;

    @NameInMap("Note")
    private String note;

    @NameInMap("PassportUrl")
    private String passportUrl;

    @NameInMap("PersonalType")
    private Long personalType;

    @NameInMap("PrincipalName")
    private Integer principalName;

    @NameInMap("Province")
    private String province;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ValidDate")
    private Long validDate;

    private DescribeApplicantResponseBody(Builder builder) {
        this.address = builder.address;
        this.applicantId = builder.applicantId;
        this.applicantName = builder.applicantName;
        this.applicantRegion = builder.applicantRegion;
        this.applicantType = builder.applicantType;
        this.applicantVersion = builder.applicantVersion;
        this.auditStatus = builder.auditStatus;
        this.authorizationAuditStatus = builder.authorizationAuditStatus;
        this.authorizationUrl = builder.authorizationUrl;
        this.businessLicenceUrl = builder.businessLicenceUrl;
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
        this.country = builder.country;
        this.eAddress = builder.eAddress;
        this.eName = builder.eName;
        this.idCardName = builder.idCardName;
        this.idCardNumber = builder.idCardNumber;
        this.idCardUrl = builder.idCardUrl;
        this.legalNoticeUrl = builder.legalNoticeUrl;
        this.note = builder.note;
        this.passportUrl = builder.passportUrl;
        this.personalType = builder.personalType;
        this.principalName = builder.principalName;
        this.province = builder.province;
        this.requestId = builder.requestId;
        this.validDate = builder.validDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicantResponseBody create() {
        return builder().build();
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
     * @return applicantRegion
     */
    public Integer getApplicantRegion() {
        return this.applicantRegion;
    }

    /**
     * @return applicantType
     */
    public Integer getApplicantType() {
        return this.applicantType;
    }

    /**
     * @return applicantVersion
     */
    public String getApplicantVersion() {
        return this.applicantVersion;
    }

    /**
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return authorizationAuditStatus
     */
    public Integer getAuthorizationAuditStatus() {
        return this.authorizationAuditStatus;
    }

    /**
     * @return authorizationUrl
     */
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    /**
     * @return businessLicenceUrl
     */
    public String getBusinessLicenceUrl() {
        return this.businessLicenceUrl;
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
     * @return idCardUrl
     */
    public String getIdCardUrl() {
        return this.idCardUrl;
    }

    /**
     * @return legalNoticeUrl
     */
    public String getLegalNoticeUrl() {
        return this.legalNoticeUrl;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return passportUrl
     */
    public String getPassportUrl() {
        return this.passportUrl;
    }

    /**
     * @return personalType
     */
    public Long getPersonalType() {
        return this.personalType;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return validDate
     */
    public Long getValidDate() {
        return this.validDate;
    }

    public static final class Builder {
        private String address; 
        private Long applicantId; 
        private String applicantName; 
        private Integer applicantRegion; 
        private Integer applicantType; 
        private String applicantVersion; 
        private Integer auditStatus; 
        private Integer authorizationAuditStatus; 
        private String authorizationUrl; 
        private String businessLicenceUrl; 
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
        private String country; 
        private String eAddress; 
        private String eName; 
        private String idCardName; 
        private String idCardNumber; 
        private String idCardUrl; 
        private String legalNoticeUrl; 
        private String note; 
        private String passportUrl; 
        private Long personalType; 
        private Integer principalName; 
        private String province; 
        private String requestId; 
        private Long validDate; 

        /**
         * Address.
         */
        public Builder address(String address) {
            this.address = address;
            return this;
        }

        /**
         * ApplicantId.
         */
        public Builder applicantId(Long applicantId) {
            this.applicantId = applicantId;
            return this;
        }

        /**
         * ApplicantName.
         */
        public Builder applicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }

        /**
         * ApplicantRegion.
         */
        public Builder applicantRegion(Integer applicantRegion) {
            this.applicantRegion = applicantRegion;
            return this;
        }

        /**
         * ApplicantType.
         */
        public Builder applicantType(Integer applicantType) {
            this.applicantType = applicantType;
            return this;
        }

        /**
         * ApplicantVersion.
         */
        public Builder applicantVersion(String applicantVersion) {
            this.applicantVersion = applicantVersion;
            return this;
        }

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * AuthorizationAuditStatus.
         */
        public Builder authorizationAuditStatus(Integer authorizationAuditStatus) {
            this.authorizationAuditStatus = authorizationAuditStatus;
            return this;
        }

        /**
         * AuthorizationUrl.
         */
        public Builder authorizationUrl(String authorizationUrl) {
            this.authorizationUrl = authorizationUrl;
            return this;
        }

        /**
         * BusinessLicenceUrl.
         */
        public Builder businessLicenceUrl(String businessLicenceUrl) {
            this.businessLicenceUrl = businessLicenceUrl;
            return this;
        }

        /**
         * CardNumber.
         */
        public Builder cardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        /**
         * ContactAddress.
         */
        public Builder contactAddress(String contactAddress) {
            this.contactAddress = contactAddress;
            return this;
        }

        /**
         * ContactCity.
         */
        public Builder contactCity(String contactCity) {
            this.contactCity = contactCity;
            return this;
        }

        /**
         * ContactCounty.
         */
        public Builder contactCounty(String contactCounty) {
            this.contactCounty = contactCounty;
            return this;
        }

        /**
         * ContactDistrict.
         */
        public Builder contactDistrict(String contactDistrict) {
            this.contactDistrict = contactDistrict;
            return this;
        }

        /**
         * ContactEmail.
         */
        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        /**
         * ContactName.
         */
        public Builder contactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        /**
         * ContactNumber.
         */
        public Builder contactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
            return this;
        }

        /**
         * ContactProvince.
         */
        public Builder contactProvince(String contactProvince) {
            this.contactProvince = contactProvince;
            return this;
        }

        /**
         * ContactZipcode.
         */
        public Builder contactZipcode(String contactZipcode) {
            this.contactZipcode = contactZipcode;
            return this;
        }

        /**
         * Country.
         */
        public Builder country(String country) {
            this.country = country;
            return this;
        }

        /**
         * EAddress.
         */
        public Builder eAddress(String eAddress) {
            this.eAddress = eAddress;
            return this;
        }

        /**
         * EName.
         */
        public Builder eName(String eName) {
            this.eName = eName;
            return this;
        }

        /**
         * IdCardName.
         */
        public Builder idCardName(String idCardName) {
            this.idCardName = idCardName;
            return this;
        }

        /**
         * IdCardNumber.
         */
        public Builder idCardNumber(String idCardNumber) {
            this.idCardNumber = idCardNumber;
            return this;
        }

        /**
         * IdCardUrl.
         */
        public Builder idCardUrl(String idCardUrl) {
            this.idCardUrl = idCardUrl;
            return this;
        }

        /**
         * LegalNoticeUrl.
         */
        public Builder legalNoticeUrl(String legalNoticeUrl) {
            this.legalNoticeUrl = legalNoticeUrl;
            return this;
        }

        /**
         * Note.
         */
        public Builder note(String note) {
            this.note = note;
            return this;
        }

        /**
         * PassportUrl.
         */
        public Builder passportUrl(String passportUrl) {
            this.passportUrl = passportUrl;
            return this;
        }

        /**
         * PersonalType.
         */
        public Builder personalType(Long personalType) {
            this.personalType = personalType;
            return this;
        }

        /**
         * PrincipalName.
         */
        public Builder principalName(Integer principalName) {
            this.principalName = principalName;
            return this;
        }

        /**
         * Province.
         */
        public Builder province(String province) {
            this.province = province;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ValidDate.
         */
        public Builder validDate(Long validDate) {
            this.validDate = validDate;
            return this;
        }

        public DescribeApplicantResponseBody build() {
            return new DescribeApplicantResponseBody(this);
        } 

    } 

}
