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
 * {@link GetViberByRequestNoResponseBody} extends {@link TeaModel}
 *
 * <p>GetViberByRequestNoResponseBody</p>
 */
public class GetViberByRequestNoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetViberByRequestNoResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetViberByRequestNoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetViberByRequestNoResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetViberByRequestNoResponseBody build() {
            return new GetViberByRequestNoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetViberByRequestNoResponseBody} extends {@link TeaModel}
     *
     * <p>GetViberByRequestNoResponseBody</p>
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
     * {@link GetViberByRequestNoResponseBody} extends {@link TeaModel}
     *
     * <p>GetViberByRequestNoResponseBody</p>
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
     * {@link GetViberByRequestNoResponseBody} extends {@link TeaModel}
     *
     * <p>GetViberByRequestNoResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("NowRecovery")
        private String nowRecovery;

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
            this.nowRecovery = builder.nowRecovery;
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
         * @return nowRecovery
         */
        public String getNowRecovery() {
            return this.nowRecovery;
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
            private String nowRecovery; 
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
                this.nowRecovery = model.nowRecovery;
                this.otherLetterGuarantee = model.otherLetterGuarantee;
                this.recoveryDate = model.recoveryDate;
                this.replyContent = model.replyContent;
                this.suspensionDate = model.suspensionDate;
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
             * ApplyReason.
             */
            public Builder applyReason(String applyReason) {
                this.applyReason = applyReason;
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
             * NowRecovery.
             */
            public Builder nowRecovery(String nowRecovery) {
                this.nowRecovery = nowRecovery;
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
             * RecoveryDate.
             */
            public Builder recoveryDate(String recoveryDate) {
                this.recoveryDate = recoveryDate;
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
             * <p>SuspensionDate</p>
             * 
             * <strong>example:</strong>
             * <p>SuspensionDate</p>
             */
            public Builder suspensionDate(String suspensionDate) {
                this.suspensionDate = suspensionDate;
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
    /**
     * 
     * {@link GetViberByRequestNoResponseBody} extends {@link TeaModel}
     *
     * <p>GetViberByRequestNoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditRecord")
        private AuditRecord auditRecord;

        @com.aliyun.core.annotation.NameInMap("AuditResult")
        private String auditResult;

        @com.aliyun.core.annotation.NameInMap("AuditTime")
        private String auditTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModifier")
        private String gmtModifier;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MaapServiceNo")
        private String maapServiceNo;

        @com.aliyun.core.annotation.NameInMap("Modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RequestNo")
        private String requestNo;

        @com.aliyun.core.annotation.NameInMap("RequestType")
        private String requestType;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("SubscriberCode")
        private String subscriberCode;

        private Data(Builder builder) {
            this.auditRecord = builder.auditRecord;
            this.auditResult = builder.auditResult;
            this.auditTime = builder.auditTime;
            this.creator = builder.creator;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModifier = builder.gmtModifier;
            this.id = builder.id;
            this.maapServiceNo = builder.maapServiceNo;
            this.modifier = builder.modifier;
            this.reason = builder.reason;
            this.requestNo = builder.requestNo;
            this.requestType = builder.requestType;
            this.state = builder.state;
            this.subscriberCode = builder.subscriberCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return auditTime
         */
        public String getAuditTime() {
            return this.auditTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModifier
         */
        public String getGmtModifier() {
            return this.gmtModifier;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return maapServiceNo
         */
        public String getMaapServiceNo() {
            return this.maapServiceNo;
        }

        /**
         * @return modifier
         */
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return requestNo
         */
        public String getRequestNo() {
            return this.requestNo;
        }

        /**
         * @return requestType
         */
        public String getRequestType() {
            return this.requestType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return subscriberCode
         */
        public String getSubscriberCode() {
            return this.subscriberCode;
        }

        public static final class Builder {
            private AuditRecord auditRecord; 
            private String auditResult; 
            private String auditTime; 
            private String creator; 
            private String gmtCreate; 
            private String gmtModifier; 
            private String id; 
            private String maapServiceNo; 
            private String modifier; 
            private String reason; 
            private String requestNo; 
            private String requestType; 
            private String state; 
            private String subscriberCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditRecord = model.auditRecord;
                this.auditResult = model.auditResult;
                this.auditTime = model.auditTime;
                this.creator = model.creator;
                this.gmtCreate = model.gmtCreate;
                this.gmtModifier = model.gmtModifier;
                this.id = model.id;
                this.maapServiceNo = model.maapServiceNo;
                this.modifier = model.modifier;
                this.reason = model.reason;
                this.requestNo = model.requestNo;
                this.requestType = model.requestType;
                this.state = model.state;
                this.subscriberCode = model.subscriberCode;
            } 

            /**
             * AuditRecord.
             */
            public Builder auditRecord(AuditRecord auditRecord) {
                this.auditRecord = auditRecord;
                return this;
            }

            /**
             * AuditResult.
             */
            public Builder auditResult(String auditResult) {
                this.auditResult = auditResult;
                return this;
            }

            /**
             * AuditTime.
             */
            public Builder auditTime(String auditTime) {
                this.auditTime = auditTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModifier.
             */
            public Builder gmtModifier(String gmtModifier) {
                this.gmtModifier = gmtModifier;
                return this;
            }

            /**
             * <p>ID。</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * MaapServiceNo.
             */
            public Builder maapServiceNo(String maapServiceNo) {
                this.maapServiceNo = maapServiceNo;
                return this;
            }

            /**
             * Modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * RequestNo.
             */
            public Builder requestNo(String requestNo) {
                this.requestNo = requestNo;
                return this;
            }

            /**
             * RequestType.
             */
            public Builder requestType(String requestType) {
                this.requestType = requestType;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * SubscriberCode.
             */
            public Builder subscriberCode(String subscriberCode) {
                this.subscriberCode = subscriberCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
