// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link UpdateAuditRequestRequest} extends {@link RequestModel}
 *
 * <p>UpdateAuditRequestRequest</p>
 */
public class UpdateAuditRequestRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditRecord")
    @com.aliyun.core.annotation.Validation(required = true)
    private AuditRecord auditRecord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditResult")
    private String auditResult;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UpdateAuditRequestRequest(Builder builder) {
        super(builder);
        this.auditRecord = builder.auditRecord;
        this.auditResult = builder.auditResult;
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.requestNo = builder.requestNo;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAuditRequestRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auditRecord
     */
    public AuditRecord getAuditRecord() {
        return this.auditRecord;
    }

    /**
     * @return auditResult
     */
    public String getAuditResult() {
        return this.auditResult;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requestNo
     */
    public String getRequestNo() {
        return this.requestNo;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<UpdateAuditRequestRequest, Builder> {
        private AuditRecord auditRecord; 
        private String auditResult; 
        private String custSpaceId; 
        private Long ownerId; 
        private String requestNo; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAuditRequestRequest request) {
            super(request);
            this.auditRecord = request.auditRecord;
            this.auditResult = request.auditResult;
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.requestNo = request.requestNo;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * <p>The Viber audit items.</p>
         * <p>This parameter is required.</p>
         */
        public Builder auditRecord(AuditRecord auditRecord) {
            String auditRecordShrink = shrink(auditRecord, "AuditRecord", "json");
            this.putQueryParameter("AuditRecord", auditRecordShrink);
            this.auditRecord = auditRecord;
            return this;
        }

        /**
         * <p>The audit result.</p>
         * 
         * <strong>example:</strong>
         * <p>unAudit</p>
         */
        public Builder auditResult(String auditResult) {
            this.putQueryParameter("AuditResult", auditResult);
            this.auditResult = auditResult;
            return this;
        }

        /**
         * <p>The space ID or instance ID of the ISV sub-customer. This is the channel ID. You can view it on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cams-8pi**urn5s</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The request number to update.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>114624518**5956096</p>
         */
        public Builder requestNo(String requestNo) {
            this.putQueryParameter("RequestNo", requestNo);
            this.requestNo = requestNo;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public UpdateAuditRequestRequest build() {
            return new UpdateAuditRequestRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAuditRequestRequest} extends {@link TeaModel}
     *
     * <p>UpdateAuditRequestRequest</p>
     */
    public static class CompanyAddress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompanyAddress")
        private String companyAddress;

        @com.aliyun.core.annotation.NameInMap("CompanyAddressTitle")
        private String companyAddressTitle;

        private CompanyAddress(Builder builder) {
            this.companyAddress = builder.companyAddress;
            this.companyAddressTitle = builder.companyAddressTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompanyAddress create() {
            return builder().build();
        }

        /**
         * @return companyAddress
         */
        public String getCompanyAddress() {
            return this.companyAddress;
        }

        /**
         * @return companyAddressTitle
         */
        public String getCompanyAddressTitle() {
            return this.companyAddressTitle;
        }

        public static final class Builder {
            private String companyAddress; 
            private String companyAddressTitle; 

            private Builder() {
            } 

            private Builder(CompanyAddress model) {
                this.companyAddress = model.companyAddress;
                this.companyAddressTitle = model.companyAddressTitle;
            } 

            /**
             * <p>The company address.</p>
             * 
             * <strong>example:</strong>
             * <p>123 Sunshine Street, City, Country</p>
             */
            public Builder companyAddress(String companyAddress) {
                this.companyAddress = companyAddress;
                return this;
            }

            /**
             * <p>The company address title.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx company</p>
             */
            public Builder companyAddressTitle(String companyAddressTitle) {
                this.companyAddressTitle = companyAddressTitle;
                return this;
            }

            public CompanyAddress build() {
                return new CompanyAddress(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAuditRequestRequest} extends {@link TeaModel}
     *
     * <p>UpdateAuditRequestRequest</p>
     */
    public static class CompanyTel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompanyTelNumber")
        private String companyTelNumber;

        @com.aliyun.core.annotation.NameInMap("CompanyTelTitle")
        private String companyTelTitle;

        private CompanyTel(Builder builder) {
            this.companyTelNumber = builder.companyTelNumber;
            this.companyTelTitle = builder.companyTelTitle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CompanyTel create() {
            return builder().build();
        }

        /**
         * @return companyTelNumber
         */
        public String getCompanyTelNumber() {
            return this.companyTelNumber;
        }

        /**
         * @return companyTelTitle
         */
        public String getCompanyTelTitle() {
            return this.companyTelTitle;
        }

        public static final class Builder {
            private String companyTelNumber; 
            private String companyTelTitle; 

            private Builder() {
            } 

            private Builder(CompanyTel model) {
                this.companyTelNumber = model.companyTelNumber;
                this.companyTelTitle = model.companyTelTitle;
            } 

            /**
             * <p>The company telephone number.</p>
             * 
             * <strong>example:</strong>
             * <p>07364245xxxx</p>
             */
            public Builder companyTelNumber(String companyTelNumber) {
                this.companyTelNumber = companyTelNumber;
                return this;
            }

            /**
             * <p>The telephone number title.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder companyTelTitle(String companyTelTitle) {
                this.companyTelTitle = companyTelTitle;
                return this;
            }

            public CompanyTel build() {
                return new CompanyTel(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateAuditRequestRequest} extends {@link TeaModel}
     *
     * <p>UpdateAuditRequestRequest</p>
     */
    public static class AuditRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgeLimit")
        private String ageLimit;

        @com.aliyun.core.annotation.NameInMap("ApplyReason")
        private String applyReason;

        @com.aliyun.core.annotation.NameInMap("BusinessAccountName")
        private String businessAccountName;

        @com.aliyun.core.annotation.NameInMap("BusinessLicenseRegistrationNumber")
        private String businessLicenseRegistrationNumber;

        @com.aliyun.core.annotation.NameInMap("CompanyAddress")
        private java.util.List<CompanyAddress> companyAddress;

        @com.aliyun.core.annotation.NameInMap("CompanyEnglishName")
        private String companyEnglishName;

        @com.aliyun.core.annotation.NameInMap("CompanyLegalName")
        private String companyLegalName;

        @com.aliyun.core.annotation.NameInMap("CompanyLegalPerson")
        private String companyLegalPerson;

        @com.aliyun.core.annotation.NameInMap("CompanyProfile")
        private String companyProfile;

        @com.aliyun.core.annotation.NameInMap("CompanyRegisteredCountry")
        private String companyRegisteredCountry;

        @com.aliyun.core.annotation.NameInMap("CompanyTel")
        private java.util.List<CompanyTel> companyTel;

        @com.aliyun.core.annotation.NameInMap("CompleteAddressOfHeadquarters")
        private String completeAddressOfHeadquarters;

        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactMail")
        private String contactMail;

        @com.aliyun.core.annotation.NameInMap("ContactName")
        private String contactName;

        @com.aliyun.core.annotation.NameInMap("ContactPhone")
        private String contactPhone;

        @com.aliyun.core.annotation.NameInMap("ContactPosition")
        private String contactPosition;

        @com.aliyun.core.annotation.NameInMap("EnableAutoReply")
        private String enableAutoReply;

        @com.aliyun.core.annotation.NameInMap("IndustryDescription")
        private String industryDescription;

        @com.aliyun.core.annotation.NameInMap("IndustryInvolved")
        private String industryInvolved;

        @com.aliyun.core.annotation.NameInMap("LetterGuarantee")
        private String letterGuarantee;

        @com.aliyun.core.annotation.NameInMap("Logo")
        private java.util.List<String> logo;

        @com.aliyun.core.annotation.NameInMap("MessageDestinationCountry")
        private java.util.List<String> messageDestinationCountry;

        @com.aliyun.core.annotation.NameInMap("MessageDestinationInternationalCountry")
        private java.util.List<String> messageDestinationInternationalCountry;

        @com.aliyun.core.annotation.NameInMap("MessageDialogueIntroduction")
        private String messageDialogueIntroduction;

        @com.aliyun.core.annotation.NameInMap("MessageEnableDate")
        private String messageEnableDate;

        @com.aliyun.core.annotation.NameInMap("MessageSessionName")
        private String messageSessionName;

        @com.aliyun.core.annotation.NameInMap("OtherLetterGuarantee")
        private String otherLetterGuarantee;

        @com.aliyun.core.annotation.NameInMap("RecoveryDate")
        private String recoveryDate;

        @com.aliyun.core.annotation.NameInMap("ReplyContent")
        private String replyContent;

        @com.aliyun.core.annotation.NameInMap("SuspensionDate")
        private String suspensionDate;

        @com.aliyun.core.annotation.NameInMap("WebAddress")
        private String webAddress;

        private AuditRecord(Builder builder) {
            this.ageLimit = builder.ageLimit;
            this.applyReason = builder.applyReason;
            this.businessAccountName = builder.businessAccountName;
            this.businessLicenseRegistrationNumber = builder.businessLicenseRegistrationNumber;
            this.companyAddress = builder.companyAddress;
            this.companyEnglishName = builder.companyEnglishName;
            this.companyLegalName = builder.companyLegalName;
            this.companyLegalPerson = builder.companyLegalPerson;
            this.companyProfile = builder.companyProfile;
            this.companyRegisteredCountry = builder.companyRegisteredCountry;
            this.companyTel = builder.companyTel;
            this.completeAddressOfHeadquarters = builder.completeAddressOfHeadquarters;
            this.contactEmail = builder.contactEmail;
            this.contactMail = builder.contactMail;
            this.contactName = builder.contactName;
            this.contactPhone = builder.contactPhone;
            this.contactPosition = builder.contactPosition;
            this.enableAutoReply = builder.enableAutoReply;
            this.industryDescription = builder.industryDescription;
            this.industryInvolved = builder.industryInvolved;
            this.letterGuarantee = builder.letterGuarantee;
            this.logo = builder.logo;
            this.messageDestinationCountry = builder.messageDestinationCountry;
            this.messageDestinationInternationalCountry = builder.messageDestinationInternationalCountry;
            this.messageDialogueIntroduction = builder.messageDialogueIntroduction;
            this.messageEnableDate = builder.messageEnableDate;
            this.messageSessionName = builder.messageSessionName;
            this.otherLetterGuarantee = builder.otherLetterGuarantee;
            this.recoveryDate = builder.recoveryDate;
            this.replyContent = builder.replyContent;
            this.suspensionDate = builder.suspensionDate;
            this.webAddress = builder.webAddress;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditRecord create() {
            return builder().build();
        }

        /**
         * @return ageLimit
         */
        public String getAgeLimit() {
            return this.ageLimit;
        }

        /**
         * @return applyReason
         */
        public String getApplyReason() {
            return this.applyReason;
        }

        /**
         * @return businessAccountName
         */
        public String getBusinessAccountName() {
            return this.businessAccountName;
        }

        /**
         * @return businessLicenseRegistrationNumber
         */
        public String getBusinessLicenseRegistrationNumber() {
            return this.businessLicenseRegistrationNumber;
        }

        /**
         * @return companyAddress
         */
        public java.util.List<CompanyAddress> getCompanyAddress() {
            return this.companyAddress;
        }

        /**
         * @return companyEnglishName
         */
        public String getCompanyEnglishName() {
            return this.companyEnglishName;
        }

        /**
         * @return companyLegalName
         */
        public String getCompanyLegalName() {
            return this.companyLegalName;
        }

        /**
         * @return companyLegalPerson
         */
        public String getCompanyLegalPerson() {
            return this.companyLegalPerson;
        }

        /**
         * @return companyProfile
         */
        public String getCompanyProfile() {
            return this.companyProfile;
        }

        /**
         * @return companyRegisteredCountry
         */
        public String getCompanyRegisteredCountry() {
            return this.companyRegisteredCountry;
        }

        /**
         * @return companyTel
         */
        public java.util.List<CompanyTel> getCompanyTel() {
            return this.companyTel;
        }

        /**
         * @return completeAddressOfHeadquarters
         */
        public String getCompleteAddressOfHeadquarters() {
            return this.completeAddressOfHeadquarters;
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactMail
         */
        public String getContactMail() {
            return this.contactMail;
        }

        /**
         * @return contactName
         */
        public String getContactName() {
            return this.contactName;
        }

        /**
         * @return contactPhone
         */
        public String getContactPhone() {
            return this.contactPhone;
        }

        /**
         * @return contactPosition
         */
        public String getContactPosition() {
            return this.contactPosition;
        }

        /**
         * @return enableAutoReply
         */
        public String getEnableAutoReply() {
            return this.enableAutoReply;
        }

        /**
         * @return industryDescription
         */
        public String getIndustryDescription() {
            return this.industryDescription;
        }

        /**
         * @return industryInvolved
         */
        public String getIndustryInvolved() {
            return this.industryInvolved;
        }

        /**
         * @return letterGuarantee
         */
        public String getLetterGuarantee() {
            return this.letterGuarantee;
        }

        /**
         * @return logo
         */
        public java.util.List<String> getLogo() {
            return this.logo;
        }

        /**
         * @return messageDestinationCountry
         */
        public java.util.List<String> getMessageDestinationCountry() {
            return this.messageDestinationCountry;
        }

        /**
         * @return messageDestinationInternationalCountry
         */
        public java.util.List<String> getMessageDestinationInternationalCountry() {
            return this.messageDestinationInternationalCountry;
        }

        /**
         * @return messageDialogueIntroduction
         */
        public String getMessageDialogueIntroduction() {
            return this.messageDialogueIntroduction;
        }

        /**
         * @return messageEnableDate
         */
        public String getMessageEnableDate() {
            return this.messageEnableDate;
        }

        /**
         * @return messageSessionName
         */
        public String getMessageSessionName() {
            return this.messageSessionName;
        }

        /**
         * @return otherLetterGuarantee
         */
        public String getOtherLetterGuarantee() {
            return this.otherLetterGuarantee;
        }

        /**
         * @return recoveryDate
         */
        public String getRecoveryDate() {
            return this.recoveryDate;
        }

        /**
         * @return replyContent
         */
        public String getReplyContent() {
            return this.replyContent;
        }

        /**
         * @return suspensionDate
         */
        public String getSuspensionDate() {
            return this.suspensionDate;
        }

        /**
         * @return webAddress
         */
        public String getWebAddress() {
            return this.webAddress;
        }

        public static final class Builder {
            private String ageLimit; 
            private String applyReason; 
            private String businessAccountName; 
            private String businessLicenseRegistrationNumber; 
            private java.util.List<CompanyAddress> companyAddress; 
            private String companyEnglishName; 
            private String companyLegalName; 
            private String companyLegalPerson; 
            private String companyProfile; 
            private String companyRegisteredCountry; 
            private java.util.List<CompanyTel> companyTel; 
            private String completeAddressOfHeadquarters; 
            private String contactEmail; 
            private String contactMail; 
            private String contactName; 
            private String contactPhone; 
            private String contactPosition; 
            private String enableAutoReply; 
            private String industryDescription; 
            private String industryInvolved; 
            private String letterGuarantee; 
            private java.util.List<String> logo; 
            private java.util.List<String> messageDestinationCountry; 
            private java.util.List<String> messageDestinationInternationalCountry; 
            private String messageDialogueIntroduction; 
            private String messageEnableDate; 
            private String messageSessionName; 
            private String otherLetterGuarantee; 
            private String recoveryDate; 
            private String replyContent; 
            private String suspensionDate; 
            private String webAddress; 

            private Builder() {
            } 

            private Builder(AuditRecord model) {
                this.ageLimit = model.ageLimit;
                this.applyReason = model.applyReason;
                this.businessAccountName = model.businessAccountName;
                this.businessLicenseRegistrationNumber = model.businessLicenseRegistrationNumber;
                this.companyAddress = model.companyAddress;
                this.companyEnglishName = model.companyEnglishName;
                this.companyLegalName = model.companyLegalName;
                this.companyLegalPerson = model.companyLegalPerson;
                this.companyProfile = model.companyProfile;
                this.companyRegisteredCountry = model.companyRegisteredCountry;
                this.companyTel = model.companyTel;
                this.completeAddressOfHeadquarters = model.completeAddressOfHeadquarters;
                this.contactEmail = model.contactEmail;
                this.contactMail = model.contactMail;
                this.contactName = model.contactName;
                this.contactPhone = model.contactPhone;
                this.contactPosition = model.contactPosition;
                this.enableAutoReply = model.enableAutoReply;
                this.industryDescription = model.industryDescription;
                this.industryInvolved = model.industryInvolved;
                this.letterGuarantee = model.letterGuarantee;
                this.logo = model.logo;
                this.messageDestinationCountry = model.messageDestinationCountry;
                this.messageDestinationInternationalCountry = model.messageDestinationInternationalCountry;
                this.messageDialogueIntroduction = model.messageDialogueIntroduction;
                this.messageEnableDate = model.messageEnableDate;
                this.messageSessionName = model.messageSessionName;
                this.otherLetterGuarantee = model.otherLetterGuarantee;
                this.recoveryDate = model.recoveryDate;
                this.replyContent = model.replyContent;
                this.suspensionDate = model.suspensionDate;
                this.webAddress = model.webAddress;
            } 

            /**
             * <p>The age limit.</p>
             * 
             * <strong>example:</strong>
             * <p>unlimited</p>
             */
            public Builder ageLimit(String ageLimit) {
                this.ageLimit = ageLimit;
                return this;
            }

            /**
             * <p>The reason for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>reason</p>
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
                return this;
            }

            /**
             * <p>The business account name.</p>
             * 
             * <strong>example:</strong>
             * <p>testaccount</p>
             */
            public Builder businessAccountName(String businessAccountName) {
                this.businessAccountName = businessAccountName;
                return this;
            }

            /**
             * <p>The business license registration number.</p>
             * 
             * <strong>example:</strong>
             * <p>9211515**345</p>
             */
            public Builder businessLicenseRegistrationNumber(String businessLicenseRegistrationNumber) {
                this.businessLicenseRegistrationNumber = businessLicenseRegistrationNumber;
                return this;
            }

            /**
             * <p>The company address.</p>
             */
            public Builder companyAddress(java.util.List<CompanyAddress> companyAddress) {
                this.companyAddress = companyAddress;
                return this;
            }

            /**
             * <p>The English name of the company.</p>
             * 
             * <strong>example:</strong>
             * <p>baidu</p>
             */
            public Builder companyEnglishName(String companyEnglishName) {
                this.companyEnglishName = companyEnglishName;
                return this;
            }

            /**
             * <p>The legal name of the company.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder companyLegalName(String companyLegalName) {
                this.companyLegalName = companyLegalName;
                return this;
            }

            /**
             * <p>The name of the legal representative of the company.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder companyLegalPerson(String companyLegalPerson) {
                this.companyLegalPerson = companyLegalPerson;
                return this;
            }

            /**
             * <p>The company profile.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder companyProfile(String companyProfile) {
                this.companyProfile = companyProfile;
                return this;
            }

            /**
             * <p>The country or region where the company is registered.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder companyRegisteredCountry(String companyRegisteredCountry) {
                this.companyRegisteredCountry = companyRegisteredCountry;
                return this;
            }

            /**
             * <p>The company telephone number.</p>
             */
            public Builder companyTel(java.util.List<CompanyTel> companyTel) {
                this.companyTel = companyTel;
                return this;
            }

            /**
             * <p>The complete address of the headquarters.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxstreet</p>
             */
            public Builder completeAddressOfHeadquarters(String completeAddressOfHeadquarters) {
                this.completeAddressOfHeadquarters = completeAddressOfHeadquarters;
                return this;
            }

            /**
             * <p>The email address of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>5**<a href="mailto:8585@gmail.com">8585@gmail.com</a></p>
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * <p>The contact email address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:xxxx@gamil.com">xxxx@gamil.com</a></p>
             */
            public Builder contactMail(String contactMail) {
                this.contactMail = contactMail;
                return this;
            }

            /**
             * <p>The name of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>mary</p>
             */
            public Builder contactName(String contactName) {
                this.contactName = contactName;
                return this;
            }

            /**
             * <p>The phone number of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>861515115***</p>
             */
            public Builder contactPhone(String contactPhone) {
                this.contactPhone = contactPhone;
                return this;
            }

            /**
             * <p>The position of the contact.</p>
             * 
             * <strong>example:</strong>
             * <p>job</p>
             */
            public Builder contactPosition(String contactPosition) {
                this.contactPosition = contactPosition;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto-reply. This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A‌</p>
             */
            public Builder enableAutoReply(String enableAutoReply) {
                this.enableAutoReply = enableAutoReply;
                return this;
            }

            /**
             * <p>The industry description.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder industryDescription(String industryDescription) {
                this.industryDescription = industryDescription;
                return this;
            }

            /**
             * <p>The industry to which the company belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>telecommunicationsAndIT</p>
             */
            public Builder industryInvolved(String industryInvolved) {
                this.industryInvolved = industryInvolved;
                return this;
            }

            /**
             * <p>The letter of guarantee (download URL).</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.xxx.xxx">https://xxx.xxx.xxx</a></p>
             */
            public Builder letterGuarantee(String letterGuarantee) {
                this.letterGuarantee = letterGuarantee;
                return this;
            }

            /**
             * <p>logo</p>
             */
            public Builder logo(java.util.List<String> logo) {
                this.logo = logo;
                return this;
            }

            /**
             * <p>The local destination countries or regions.</p>
             */
            public Builder messageDestinationCountry(java.util.List<String> messageDestinationCountry) {
                this.messageDestinationCountry = messageDestinationCountry;
                return this;
            }

            /**
             * <p>The international destination countries and regions.</p>
             */
            public Builder messageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
                this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
                return this;
            }

            /**
             * <p>The introduction to the business message dialogue.</p>
             * 
             * <strong>example:</strong>
             * <p>hello!</p>
             */
            public Builder messageDialogueIntroduction(String messageDialogueIntroduction) {
                this.messageDialogueIntroduction = messageDialogueIntroduction;
                return this;
            }

            /**
             * <p>The date on which business messaging is enabled (GMT time zone).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-07</p>
             */
            public Builder messageEnableDate(String messageEnableDate) {
                this.messageEnableDate = messageEnableDate;
                return this;
            }

            /**
             * <p>The business message session name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder messageSessionName(String messageSessionName) {
                this.messageSessionName = messageSessionName;
                return this;
            }

            /**
             * <p>The URL of the supplementary document.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.xxx.com">https://xxx.xxx.com</a></p>
             */
            public Builder otherLetterGuarantee(String otherLetterGuarantee) {
                this.otherLetterGuarantee = otherLetterGuarantee;
                return this;
            }

            /**
             * <p>The recovery date, in YYYY-MM-DD format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-11-07</p>
             */
            public Builder recoveryDate(String recoveryDate) {
                this.recoveryDate = recoveryDate;
                return this;
            }

            /**
             * <p>The reply content. This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder replyContent(String replyContent) {
                this.replyContent = replyContent;
                return this;
            }

            /**
             * <p>This field is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder suspensionDate(String suspensionDate) {
                this.suspensionDate = suspensionDate;
                return this;
            }

            /**
             * <p>The company web address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.xxx.xxx.com">https://www.xxx.xxx.com</a></p>
             */
            public Builder webAddress(String webAddress) {
                this.webAddress = webAddress;
                return this;
            }

            public AuditRecord build() {
                return new AuditRecord(this);
            } 

        } 

    }
}
