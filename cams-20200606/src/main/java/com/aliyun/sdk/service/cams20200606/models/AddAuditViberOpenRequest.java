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
 * {@link AddAuditViberOpenRequest} extends {@link RequestModel}
 *
 * <p>AddAuditViberOpenRequest</p>
 */
public class AddAuditViberOpenRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuditRecord")
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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private AddAuditViberOpenRequest(Builder builder) {
        super(builder);
        this.auditRecord = builder.auditRecord;
        this.auditResult = builder.auditResult;
        this.custSpaceId = builder.custSpaceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddAuditViberOpenRequest create() {
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

    public static final class Builder extends Request.Builder<AddAuditViberOpenRequest, Builder> {
        private AuditRecord auditRecord; 
        private String auditResult; 
        private String custSpaceId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(AddAuditViberOpenRequest request) {
            super(request);
            this.auditRecord = request.auditRecord;
            this.auditResult = request.auditResult;
            this.custSpaceId = request.custSpaceId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * AuditRecord.
         */
        public Builder auditRecord(AuditRecord auditRecord) {
            String auditRecordShrink = shrink(auditRecord, "AuditRecord", "json");
            this.putQueryParameter("AuditRecord", auditRecordShrink);
            this.auditRecord = auditRecord;
            return this;
        }

        /**
         * AuditResult.
         */
        public Builder auditResult(String auditResult) {
            this.putQueryParameter("AuditResult", auditResult);
            this.auditResult = auditResult;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
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
        public AddAuditViberOpenRequest build() {
            return new AddAuditViberOpenRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddAuditViberOpenRequest} extends {@link TeaModel}
     *
     * <p>AddAuditViberOpenRequest</p>
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
             * CompanyAddress.
             */
            public Builder companyAddress(String companyAddress) {
                this.companyAddress = companyAddress;
                return this;
            }

            /**
             * CompanyAddressTitle.
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
     * {@link AddAuditViberOpenRequest} extends {@link TeaModel}
     *
     * <p>AddAuditViberOpenRequest</p>
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
             * CompanyTelNumber.
             */
            public Builder companyTelNumber(String companyTelNumber) {
                this.companyTelNumber = companyTelNumber;
                return this;
            }

            /**
             * CompanyTelTitle.
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
     * {@link AddAuditViberOpenRequest} extends {@link TeaModel}
     *
     * <p>AddAuditViberOpenRequest</p>
     */
    public static class AuditRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgeLimit")
        private String ageLimit;

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

        @com.aliyun.core.annotation.NameInMap("ContactMail")
        private String contactMail;

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

        @com.aliyun.core.annotation.NameInMap("ReplyContent")
        private String replyContent;

        @com.aliyun.core.annotation.NameInMap("WebAddress")
        private String webAddress;

        private AuditRecord(Builder builder) {
            this.ageLimit = builder.ageLimit;
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
            this.contactMail = builder.contactMail;
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
            this.replyContent = builder.replyContent;
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
         * @return contactMail
         */
        public String getContactMail() {
            return this.contactMail;
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
         * @return replyContent
         */
        public String getReplyContent() {
            return this.replyContent;
        }

        /**
         * @return webAddress
         */
        public String getWebAddress() {
            return this.webAddress;
        }

        public static final class Builder {
            private String ageLimit; 
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
            private String contactMail; 
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
            private String replyContent; 
            private String webAddress; 

            private Builder() {
            } 

            private Builder(AuditRecord model) {
                this.ageLimit = model.ageLimit;
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
                this.contactMail = model.contactMail;
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
                this.replyContent = model.replyContent;
                this.webAddress = model.webAddress;
            } 

            /**
             * AgeLimit.
             */
            public Builder ageLimit(String ageLimit) {
                this.ageLimit = ageLimit;
                return this;
            }

            /**
             * BusinessAccountName.
             */
            public Builder businessAccountName(String businessAccountName) {
                this.businessAccountName = businessAccountName;
                return this;
            }

            /**
             * BusinessLicenseRegistrationNumber.
             */
            public Builder businessLicenseRegistrationNumber(String businessLicenseRegistrationNumber) {
                this.businessLicenseRegistrationNumber = businessLicenseRegistrationNumber;
                return this;
            }

            /**
             * CompanyAddress.
             */
            public Builder companyAddress(java.util.List<CompanyAddress> companyAddress) {
                this.companyAddress = companyAddress;
                return this;
            }

            /**
             * CompanyEnglishName.
             */
            public Builder companyEnglishName(String companyEnglishName) {
                this.companyEnglishName = companyEnglishName;
                return this;
            }

            /**
             * CompanyLegalName.
             */
            public Builder companyLegalName(String companyLegalName) {
                this.companyLegalName = companyLegalName;
                return this;
            }

            /**
             * CompanyLegalPerson.
             */
            public Builder companyLegalPerson(String companyLegalPerson) {
                this.companyLegalPerson = companyLegalPerson;
                return this;
            }

            /**
             * CompanyProfile.
             */
            public Builder companyProfile(String companyProfile) {
                this.companyProfile = companyProfile;
                return this;
            }

            /**
             * CompanyRegisteredCountry.
             */
            public Builder companyRegisteredCountry(String companyRegisteredCountry) {
                this.companyRegisteredCountry = companyRegisteredCountry;
                return this;
            }

            /**
             * CompanyTel.
             */
            public Builder companyTel(java.util.List<CompanyTel> companyTel) {
                this.companyTel = companyTel;
                return this;
            }

            /**
             * CompleteAddressOfHeadquarters.
             */
            public Builder completeAddressOfHeadquarters(String completeAddressOfHeadquarters) {
                this.completeAddressOfHeadquarters = completeAddressOfHeadquarters;
                return this;
            }

            /**
             * ContactMail.
             */
            public Builder contactMail(String contactMail) {
                this.contactMail = contactMail;
                return this;
            }

            /**
             * EnableAutoReply.
             */
            public Builder enableAutoReply(String enableAutoReply) {
                this.enableAutoReply = enableAutoReply;
                return this;
            }

            /**
             * IndustryDescription.
             */
            public Builder industryDescription(String industryDescription) {
                this.industryDescription = industryDescription;
                return this;
            }

            /**
             * IndustryInvolved.
             */
            public Builder industryInvolved(String industryInvolved) {
                this.industryInvolved = industryInvolved;
                return this;
            }

            /**
             * LetterGuarantee.
             */
            public Builder letterGuarantee(String letterGuarantee) {
                this.letterGuarantee = letterGuarantee;
                return this;
            }

            /**
             * Logo.
             */
            public Builder logo(java.util.List<String> logo) {
                this.logo = logo;
                return this;
            }

            /**
             * MessageDestinationCountry.
             */
            public Builder messageDestinationCountry(java.util.List<String> messageDestinationCountry) {
                this.messageDestinationCountry = messageDestinationCountry;
                return this;
            }

            /**
             * MessageDestinationInternationalCountry.
             */
            public Builder messageDestinationInternationalCountry(java.util.List<String> messageDestinationInternationalCountry) {
                this.messageDestinationInternationalCountry = messageDestinationInternationalCountry;
                return this;
            }

            /**
             * MessageDialogueIntroduction.
             */
            public Builder messageDialogueIntroduction(String messageDialogueIntroduction) {
                this.messageDialogueIntroduction = messageDialogueIntroduction;
                return this;
            }

            /**
             * MessageEnableDate.
             */
            public Builder messageEnableDate(String messageEnableDate) {
                this.messageEnableDate = messageEnableDate;
                return this;
            }

            /**
             * MessageSessionName.
             */
            public Builder messageSessionName(String messageSessionName) {
                this.messageSessionName = messageSessionName;
                return this;
            }

            /**
             * OtherLetterGuarantee.
             */
            public Builder otherLetterGuarantee(String otherLetterGuarantee) {
                this.otherLetterGuarantee = otherLetterGuarantee;
                return this;
            }

            /**
             * ReplyContent.
             */
            public Builder replyContent(String replyContent) {
                this.replyContent = replyContent;
                return this;
            }

            /**
             * WebAddress.
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
