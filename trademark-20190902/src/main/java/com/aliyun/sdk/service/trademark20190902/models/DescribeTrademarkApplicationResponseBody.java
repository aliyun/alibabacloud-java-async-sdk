// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrademarkApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrademarkApplicationResponseBody</p>
 */
public class DescribeTrademarkApplicationResponseBody extends TeaModel {
    @NameInMap("AcceptUrl")
    private String acceptUrl;

    @NameInMap("AgreementId")
    private String agreementId;

    @NameInMap("Applicant")
    private Applicant applicant;

    @NameInMap("ApplicantId")
    private Long applicantId;

    @NameInMap("ApplicationStatus")
    private Integer applicationStatus;

    @NameInMap("ApplicationType")
    private Integer applicationType;

    @NameInMap("AuthorizationUrl")
    private String authorizationUrl;

    @NameInMap("BizId")
    private String bizId;

    @NameInMap("BlackAndWhiteIconUrl")
    private String blackAndWhiteIconUrl;

    @NameInMap("CreateTime")
    private Long createTime;

    @NameInMap("ExtendInfo")
    private java.util.Map < String, ? > extendInfo;

    @NameInMap("FirstClassification")
    private FirstClassification firstClassification;

    @NameInMap("Flags")
    private Flags flags;

    @NameInMap("JudgeResultUrls")
    private JudgeResultUrls judgeResultUrls;

    @NameInMap("Note")
    private String note;

    @NameInMap("OrderId")
    private String orderId;

    @NameInMap("OrderPrice")
    private Float orderPrice;

    @NameInMap("PrincipalName")
    private Integer principalName;

    @NameInMap("ReceiptUrls")
    private ReceiptUrls receiptUrls;

    @NameInMap("RecvUserLogistics")
    private String recvUserLogistics;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SendSbjLogistics")
    private String sendSbjLogistics;

    @NameInMap("SendUserLogistics")
    private String sendUserLogistics;

    @NameInMap("ServicePrice")
    private Float servicePrice;

    @NameInMap("Supplements")
    private Supplements supplements;

    @NameInMap("ThirdClassifications")
    private ThirdClassifications thirdClassifications;

    @NameInMap("TotalPrice")
    private Float totalPrice;

    @NameInMap("TrademarkIcon")
    private String trademarkIcon;

    @NameInMap("TrademarkName")
    private String trademarkName;

    @NameInMap("TrademarkNameType")
    private Integer trademarkNameType;

    @NameInMap("TrademarkNumber")
    private String trademarkNumber;

    @NameInMap("UpdateTime")
    private Long updateTime;

    private DescribeTrademarkApplicationResponseBody(Builder builder) {
        this.acceptUrl = builder.acceptUrl;
        this.agreementId = builder.agreementId;
        this.applicant = builder.applicant;
        this.applicantId = builder.applicantId;
        this.applicationStatus = builder.applicationStatus;
        this.applicationType = builder.applicationType;
        this.authorizationUrl = builder.authorizationUrl;
        this.bizId = builder.bizId;
        this.blackAndWhiteIconUrl = builder.blackAndWhiteIconUrl;
        this.createTime = builder.createTime;
        this.extendInfo = builder.extendInfo;
        this.firstClassification = builder.firstClassification;
        this.flags = builder.flags;
        this.judgeResultUrls = builder.judgeResultUrls;
        this.note = builder.note;
        this.orderId = builder.orderId;
        this.orderPrice = builder.orderPrice;
        this.principalName = builder.principalName;
        this.receiptUrls = builder.receiptUrls;
        this.recvUserLogistics = builder.recvUserLogistics;
        this.requestId = builder.requestId;
        this.sendSbjLogistics = builder.sendSbjLogistics;
        this.sendUserLogistics = builder.sendUserLogistics;
        this.servicePrice = builder.servicePrice;
        this.supplements = builder.supplements;
        this.thirdClassifications = builder.thirdClassifications;
        this.totalPrice = builder.totalPrice;
        this.trademarkIcon = builder.trademarkIcon;
        this.trademarkName = builder.trademarkName;
        this.trademarkNameType = builder.trademarkNameType;
        this.trademarkNumber = builder.trademarkNumber;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrademarkApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceptUrl
     */
    public String getAcceptUrl() {
        return this.acceptUrl;
    }

    /**
     * @return agreementId
     */
    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * @return applicant
     */
    public Applicant getApplicant() {
        return this.applicant;
    }

    /**
     * @return applicantId
     */
    public Long getApplicantId() {
        return this.applicantId;
    }

    /**
     * @return applicationStatus
     */
    public Integer getApplicationStatus() {
        return this.applicationStatus;
    }

    /**
     * @return applicationType
     */
    public Integer getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return authorizationUrl
     */
    public String getAuthorizationUrl() {
        return this.authorizationUrl;
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return blackAndWhiteIconUrl
     */
    public String getBlackAndWhiteIconUrl() {
        return this.blackAndWhiteIconUrl;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return extendInfo
     */
    public java.util.Map < String, ? > getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return firstClassification
     */
    public FirstClassification getFirstClassification() {
        return this.firstClassification;
    }

    /**
     * @return flags
     */
    public Flags getFlags() {
        return this.flags;
    }

    /**
     * @return judgeResultUrls
     */
    public JudgeResultUrls getJudgeResultUrls() {
        return this.judgeResultUrls;
    }

    /**
     * @return note
     */
    public String getNote() {
        return this.note;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return orderPrice
     */
    public Float getOrderPrice() {
        return this.orderPrice;
    }

    /**
     * @return principalName
     */
    public Integer getPrincipalName() {
        return this.principalName;
    }

    /**
     * @return receiptUrls
     */
    public ReceiptUrls getReceiptUrls() {
        return this.receiptUrls;
    }

    /**
     * @return recvUserLogistics
     */
    public String getRecvUserLogistics() {
        return this.recvUserLogistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sendSbjLogistics
     */
    public String getSendSbjLogistics() {
        return this.sendSbjLogistics;
    }

    /**
     * @return sendUserLogistics
     */
    public String getSendUserLogistics() {
        return this.sendUserLogistics;
    }

    /**
     * @return servicePrice
     */
    public Float getServicePrice() {
        return this.servicePrice;
    }

    /**
     * @return supplements
     */
    public Supplements getSupplements() {
        return this.supplements;
    }

    /**
     * @return thirdClassifications
     */
    public ThirdClassifications getThirdClassifications() {
        return this.thirdClassifications;
    }

    /**
     * @return totalPrice
     */
    public Float getTotalPrice() {
        return this.totalPrice;
    }

    /**
     * @return trademarkIcon
     */
    public String getTrademarkIcon() {
        return this.trademarkIcon;
    }

    /**
     * @return trademarkName
     */
    public String getTrademarkName() {
        return this.trademarkName;
    }

    /**
     * @return trademarkNameType
     */
    public Integer getTrademarkNameType() {
        return this.trademarkNameType;
    }

    /**
     * @return trademarkNumber
     */
    public String getTrademarkNumber() {
        return this.trademarkNumber;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String acceptUrl; 
        private String agreementId; 
        private Applicant applicant; 
        private Long applicantId; 
        private Integer applicationStatus; 
        private Integer applicationType; 
        private String authorizationUrl; 
        private String bizId; 
        private String blackAndWhiteIconUrl; 
        private Long createTime; 
        private java.util.Map < String, ? > extendInfo; 
        private FirstClassification firstClassification; 
        private Flags flags; 
        private JudgeResultUrls judgeResultUrls; 
        private String note; 
        private String orderId; 
        private Float orderPrice; 
        private Integer principalName; 
        private ReceiptUrls receiptUrls; 
        private String recvUserLogistics; 
        private String requestId; 
        private String sendSbjLogistics; 
        private String sendUserLogistics; 
        private Float servicePrice; 
        private Supplements supplements; 
        private ThirdClassifications thirdClassifications; 
        private Float totalPrice; 
        private String trademarkIcon; 
        private String trademarkName; 
        private Integer trademarkNameType; 
        private String trademarkNumber; 
        private Long updateTime; 

        /**
         * AcceptUrl.
         */
        public Builder acceptUrl(String acceptUrl) {
            this.acceptUrl = acceptUrl;
            return this;
        }

        /**
         * AgreementId.
         */
        public Builder agreementId(String agreementId) {
            this.agreementId = agreementId;
            return this;
        }

        /**
         * Applicant.
         */
        public Builder applicant(Applicant applicant) {
            this.applicant = applicant;
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
         * ApplicationStatus.
         */
        public Builder applicationStatus(Integer applicationStatus) {
            this.applicationStatus = applicationStatus;
            return this;
        }

        /**
         * ApplicationType.
         */
        public Builder applicationType(Integer applicationType) {
            this.applicationType = applicationType;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }

        /**
         * BlackAndWhiteIconUrl.
         */
        public Builder blackAndWhiteIconUrl(String blackAndWhiteIconUrl) {
            this.blackAndWhiteIconUrl = blackAndWhiteIconUrl;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * ExtendInfo.
         */
        public Builder extendInfo(java.util.Map < String, ? > extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * FirstClassification.
         */
        public Builder firstClassification(FirstClassification firstClassification) {
            this.firstClassification = firstClassification;
            return this;
        }

        /**
         * Flags.
         */
        public Builder flags(Flags flags) {
            this.flags = flags;
            return this;
        }

        /**
         * JudgeResultUrls.
         */
        public Builder judgeResultUrls(JudgeResultUrls judgeResultUrls) {
            this.judgeResultUrls = judgeResultUrls;
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
         * OrderId.
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * OrderPrice.
         */
        public Builder orderPrice(Float orderPrice) {
            this.orderPrice = orderPrice;
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
         * ReceiptUrls.
         */
        public Builder receiptUrls(ReceiptUrls receiptUrls) {
            this.receiptUrls = receiptUrls;
            return this;
        }

        /**
         * RecvUserLogistics.
         */
        public Builder recvUserLogistics(String recvUserLogistics) {
            this.recvUserLogistics = recvUserLogistics;
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
         * SendSbjLogistics.
         */
        public Builder sendSbjLogistics(String sendSbjLogistics) {
            this.sendSbjLogistics = sendSbjLogistics;
            return this;
        }

        /**
         * SendUserLogistics.
         */
        public Builder sendUserLogistics(String sendUserLogistics) {
            this.sendUserLogistics = sendUserLogistics;
            return this;
        }

        /**
         * ServicePrice.
         */
        public Builder servicePrice(Float servicePrice) {
            this.servicePrice = servicePrice;
            return this;
        }

        /**
         * Supplements.
         */
        public Builder supplements(Supplements supplements) {
            this.supplements = supplements;
            return this;
        }

        /**
         * ThirdClassifications.
         */
        public Builder thirdClassifications(ThirdClassifications thirdClassifications) {
            this.thirdClassifications = thirdClassifications;
            return this;
        }

        /**
         * TotalPrice.
         */
        public Builder totalPrice(Float totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        /**
         * TrademarkIcon.
         */
        public Builder trademarkIcon(String trademarkIcon) {
            this.trademarkIcon = trademarkIcon;
            return this;
        }

        /**
         * TrademarkName.
         */
        public Builder trademarkName(String trademarkName) {
            this.trademarkName = trademarkName;
            return this;
        }

        /**
         * TrademarkNameType.
         */
        public Builder trademarkNameType(Integer trademarkNameType) {
            this.trademarkNameType = trademarkNameType;
            return this;
        }

        /**
         * TrademarkNumber.
         */
        public Builder trademarkNumber(String trademarkNumber) {
            this.trademarkNumber = trademarkNumber;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DescribeTrademarkApplicationResponseBody build() {
            return new DescribeTrademarkApplicationResponseBody(this);
        } 

    } 

    public static class Applicant extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("ApplicantName")
        private String applicantName;

        @NameInMap("ApplicantRegion")
        private Integer applicantRegion;

        @NameInMap("ApplicantType")
        private Integer applicantType;

        @NameInMap("AuditStatus")
        private Integer auditStatus;

        @NameInMap("AuthorizationUrl")
        private String authorizationUrl;

        @NameInMap("BusinessLicenceUrl")
        private String businessLicenceUrl;

        @NameInMap("CardNumber")
        private String cardNumber;

        @NameInMap("ContactAddress")
        private String contactAddress;

        @NameInMap("ContactEmail")
        private String contactEmail;

        @NameInMap("ContactName")
        private String contactName;

        @NameInMap("ContactNumber")
        private String contactNumber;

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

        @NameInMap("PassportUrl")
        private String passportUrl;

        @NameInMap("PersonalType")
        private Long personalType;

        @NameInMap("PrincipalName")
        private Integer principalName;

        @NameInMap("Province")
        private String province;

        private Applicant(Builder builder) {
            this.address = builder.address;
            this.applicantName = builder.applicantName;
            this.applicantRegion = builder.applicantRegion;
            this.applicantType = builder.applicantType;
            this.auditStatus = builder.auditStatus;
            this.authorizationUrl = builder.authorizationUrl;
            this.businessLicenceUrl = builder.businessLicenceUrl;
            this.cardNumber = builder.cardNumber;
            this.contactAddress = builder.contactAddress;
            this.contactEmail = builder.contactEmail;
            this.contactName = builder.contactName;
            this.contactNumber = builder.contactNumber;
            this.contactZipcode = builder.contactZipcode;
            this.country = builder.country;
            this.eAddress = builder.eAddress;
            this.eName = builder.eName;
            this.idCardName = builder.idCardName;
            this.idCardNumber = builder.idCardNumber;
            this.idCardUrl = builder.idCardUrl;
            this.legalNoticeUrl = builder.legalNoticeUrl;
            this.passportUrl = builder.passportUrl;
            this.personalType = builder.personalType;
            this.principalName = builder.principalName;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Applicant create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
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
         * @return auditStatus
         */
        public Integer getAuditStatus() {
            return this.auditStatus;
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

        public static final class Builder {
            private String address; 
            private String applicantName; 
            private Integer applicantRegion; 
            private Integer applicantType; 
            private Integer auditStatus; 
            private String authorizationUrl; 
            private String businessLicenceUrl; 
            private String cardNumber; 
            private String contactAddress; 
            private String contactEmail; 
            private String contactName; 
            private String contactNumber; 
            private String contactZipcode; 
            private String country; 
            private String eAddress; 
            private String eName; 
            private String idCardName; 
            private String idCardNumber; 
            private String idCardUrl; 
            private String legalNoticeUrl; 
            private String passportUrl; 
            private Long personalType; 
            private Integer principalName; 
            private String province; 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
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
             * AuditStatus.
             */
            public Builder auditStatus(Integer auditStatus) {
                this.auditStatus = auditStatus;
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

            public Applicant build() {
                return new Applicant(this);
            } 

        } 

    }
    public static class FirstClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        private String classificationCode;

        @NameInMap("ClassificationName")
        private String classificationName;

        private FirstClassification(Builder builder) {
            this.classificationCode = builder.classificationCode;
            this.classificationName = builder.classificationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirstClassification create() {
            return builder().build();
        }

        /**
         * @return classificationCode
         */
        public String getClassificationCode() {
            return this.classificationCode;
        }

        /**
         * @return classificationName
         */
        public String getClassificationName() {
            return this.classificationName;
        }

        public static final class Builder {
            private String classificationCode; 
            private String classificationName; 

            /**
             * ClassificationCode.
             */
            public Builder classificationCode(String classificationCode) {
                this.classificationCode = classificationCode;
                return this;
            }

            /**
             * ClassificationName.
             */
            public Builder classificationName(String classificationName) {
                this.classificationName = classificationName;
                return this;
            }

            public FirstClassification build() {
                return new FirstClassification(this);
            } 

        } 

    }
    public static class Flags extends TeaModel {
        @NameInMap("Flag")
        private java.util.List < Integer > flag;

        private Flags(Builder builder) {
            this.flag = builder.flag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flags create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public java.util.List < Integer > getFlag() {
            return this.flag;
        }

        public static final class Builder {
            private java.util.List < Integer > flag; 

            /**
             * Flag.
             */
            public Builder flag(java.util.List < Integer > flag) {
                this.flag = flag;
                return this;
            }

            public Flags build() {
                return new Flags(this);
            } 

        } 

    }
    public static class JudgeResultUrls extends TeaModel {
        @NameInMap("JudgeResultUrl")
        private java.util.List < String > judgeResultUrl;

        private JudgeResultUrls(Builder builder) {
            this.judgeResultUrl = builder.judgeResultUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JudgeResultUrls create() {
            return builder().build();
        }

        /**
         * @return judgeResultUrl
         */
        public java.util.List < String > getJudgeResultUrl() {
            return this.judgeResultUrl;
        }

        public static final class Builder {
            private java.util.List < String > judgeResultUrl; 

            /**
             * JudgeResultUrl.
             */
            public Builder judgeResultUrl(java.util.List < String > judgeResultUrl) {
                this.judgeResultUrl = judgeResultUrl;
                return this;
            }

            public JudgeResultUrls build() {
                return new JudgeResultUrls(this);
            } 

        } 

    }
    public static class ReceiptUrls extends TeaModel {
        @NameInMap("ReceiptUrl")
        private java.util.List < String > receiptUrl;

        private ReceiptUrls(Builder builder) {
            this.receiptUrl = builder.receiptUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReceiptUrls create() {
            return builder().build();
        }

        /**
         * @return receiptUrl
         */
        public java.util.List < String > getReceiptUrl() {
            return this.receiptUrl;
        }

        public static final class Builder {
            private java.util.List < String > receiptUrl; 

            /**
             * ReceiptUrl.
             */
            public Builder receiptUrl(java.util.List < String > receiptUrl) {
                this.receiptUrl = receiptUrl;
                return this;
            }

            public ReceiptUrls build() {
                return new ReceiptUrls(this);
            } 

        } 

    }
    public static class UserFiles extends TeaModel {
        @NameInMap("UserFile")
        private java.util.List < String > userFile;

        private UserFiles(Builder builder) {
            this.userFile = builder.userFile;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserFiles create() {
            return builder().build();
        }

        /**
         * @return userFile
         */
        public java.util.List < String > getUserFile() {
            return this.userFile;
        }

        public static final class Builder {
            private java.util.List < String > userFile; 

            /**
             * UserFile.
             */
            public Builder userFile(java.util.List < String > userFile) {
                this.userFile = userFile;
                return this;
            }

            public UserFiles build() {
                return new UserFiles(this);
            } 

        } 

    }
    public static class Supplement extends TeaModel {
        @NameInMap("AcceptExpirationDate")
        private Long acceptExpirationDate;

        @NameInMap("AcceptTime")
        private Long acceptTime;

        @NameInMap("ApplicationType")
        private Integer applicationType;

        @NameInMap("Content")
        private String content;

        @NameInMap("OfficialFile")
        private String officialFile;

        @NameInMap("OperateTime")
        private Long operateTime;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("SbjExpirationDate")
        private Long sbjExpirationDate;

        @NameInMap("SendTime")
        private Long sendTime;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("SupplementId")
        private Long supplementId;

        @NameInMap("SupplementStatus")
        private Integer supplementStatus;

        @NameInMap("TrademarkNumber")
        private String trademarkNumber;

        @NameInMap("UserFiles")
        private UserFiles userFiles;

        private Supplement(Builder builder) {
            this.acceptExpirationDate = builder.acceptExpirationDate;
            this.acceptTime = builder.acceptTime;
            this.applicationType = builder.applicationType;
            this.content = builder.content;
            this.officialFile = builder.officialFile;
            this.operateTime = builder.operateTime;
            this.orderId = builder.orderId;
            this.sbjExpirationDate = builder.sbjExpirationDate;
            this.sendTime = builder.sendTime;
            this.serialNumber = builder.serialNumber;
            this.supplementId = builder.supplementId;
            this.supplementStatus = builder.supplementStatus;
            this.trademarkNumber = builder.trademarkNumber;
            this.userFiles = builder.userFiles;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Supplement create() {
            return builder().build();
        }

        /**
         * @return acceptExpirationDate
         */
        public Long getAcceptExpirationDate() {
            return this.acceptExpirationDate;
        }

        /**
         * @return acceptTime
         */
        public Long getAcceptTime() {
            return this.acceptTime;
        }

        /**
         * @return applicationType
         */
        public Integer getApplicationType() {
            return this.applicationType;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return officialFile
         */
        public String getOfficialFile() {
            return this.officialFile;
        }

        /**
         * @return operateTime
         */
        public Long getOperateTime() {
            return this.operateTime;
        }

        /**
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
        }

        /**
         * @return sbjExpirationDate
         */
        public Long getSbjExpirationDate() {
            return this.sbjExpirationDate;
        }

        /**
         * @return sendTime
         */
        public Long getSendTime() {
            return this.sendTime;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return supplementId
         */
        public Long getSupplementId() {
            return this.supplementId;
        }

        /**
         * @return supplementStatus
         */
        public Integer getSupplementStatus() {
            return this.supplementStatus;
        }

        /**
         * @return trademarkNumber
         */
        public String getTrademarkNumber() {
            return this.trademarkNumber;
        }

        /**
         * @return userFiles
         */
        public UserFiles getUserFiles() {
            return this.userFiles;
        }

        public static final class Builder {
            private Long acceptExpirationDate; 
            private Long acceptTime; 
            private Integer applicationType; 
            private String content; 
            private String officialFile; 
            private Long operateTime; 
            private String orderId; 
            private Long sbjExpirationDate; 
            private Long sendTime; 
            private String serialNumber; 
            private Long supplementId; 
            private Integer supplementStatus; 
            private String trademarkNumber; 
            private UserFiles userFiles; 

            /**
             * AcceptExpirationDate.
             */
            public Builder acceptExpirationDate(Long acceptExpirationDate) {
                this.acceptExpirationDate = acceptExpirationDate;
                return this;
            }

            /**
             * AcceptTime.
             */
            public Builder acceptTime(Long acceptTime) {
                this.acceptTime = acceptTime;
                return this;
            }

            /**
             * ApplicationType.
             */
            public Builder applicationType(Integer applicationType) {
                this.applicationType = applicationType;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * OfficialFile.
             */
            public Builder officialFile(String officialFile) {
                this.officialFile = officialFile;
                return this;
            }

            /**
             * OperateTime.
             */
            public Builder operateTime(Long operateTime) {
                this.operateTime = operateTime;
                return this;
            }

            /**
             * OrderId.
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * SbjExpirationDate.
             */
            public Builder sbjExpirationDate(Long sbjExpirationDate) {
                this.sbjExpirationDate = sbjExpirationDate;
                return this;
            }

            /**
             * SendTime.
             */
            public Builder sendTime(Long sendTime) {
                this.sendTime = sendTime;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * SupplementId.
             */
            public Builder supplementId(Long supplementId) {
                this.supplementId = supplementId;
                return this;
            }

            /**
             * SupplementStatus.
             */
            public Builder supplementStatus(Integer supplementStatus) {
                this.supplementStatus = supplementStatus;
                return this;
            }

            /**
             * TrademarkNumber.
             */
            public Builder trademarkNumber(String trademarkNumber) {
                this.trademarkNumber = trademarkNumber;
                return this;
            }

            /**
             * UserFiles.
             */
            public Builder userFiles(UserFiles userFiles) {
                this.userFiles = userFiles;
                return this;
            }

            public Supplement build() {
                return new Supplement(this);
            } 

        } 

    }
    public static class Supplements extends TeaModel {
        @NameInMap("Supplement")
        private java.util.List < Supplement> supplement;

        private Supplements(Builder builder) {
            this.supplement = builder.supplement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Supplements create() {
            return builder().build();
        }

        /**
         * @return supplement
         */
        public java.util.List < Supplement> getSupplement() {
            return this.supplement;
        }

        public static final class Builder {
            private java.util.List < Supplement> supplement; 

            /**
             * Supplement.
             */
            public Builder supplement(java.util.List < Supplement> supplement) {
                this.supplement = supplement;
                return this;
            }

            public Supplements build() {
                return new Supplements(this);
            } 

        } 

    }
    public static class ThirdClassification extends TeaModel {
        @NameInMap("ClassificationCode")
        private String classificationCode;

        @NameInMap("ClassificationName")
        private String classificationName;

        private ThirdClassification(Builder builder) {
            this.classificationCode = builder.classificationCode;
            this.classificationName = builder.classificationName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThirdClassification create() {
            return builder().build();
        }

        /**
         * @return classificationCode
         */
        public String getClassificationCode() {
            return this.classificationCode;
        }

        /**
         * @return classificationName
         */
        public String getClassificationName() {
            return this.classificationName;
        }

        public static final class Builder {
            private String classificationCode; 
            private String classificationName; 

            /**
             * ClassificationCode.
             */
            public Builder classificationCode(String classificationCode) {
                this.classificationCode = classificationCode;
                return this;
            }

            /**
             * ClassificationName.
             */
            public Builder classificationName(String classificationName) {
                this.classificationName = classificationName;
                return this;
            }

            public ThirdClassification build() {
                return new ThirdClassification(this);
            } 

        } 

    }
    public static class ThirdClassifications extends TeaModel {
        @NameInMap("ThirdClassification")
        private java.util.List < ThirdClassification> thirdClassification;

        private ThirdClassifications(Builder builder) {
            this.thirdClassification = builder.thirdClassification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ThirdClassifications create() {
            return builder().build();
        }

        /**
         * @return thirdClassification
         */
        public java.util.List < ThirdClassification> getThirdClassification() {
            return this.thirdClassification;
        }

        public static final class Builder {
            private java.util.List < ThirdClassification> thirdClassification; 

            /**
             * ThirdClassification.
             */
            public Builder thirdClassification(java.util.List < ThirdClassification> thirdClassification) {
                this.thirdClassification = thirdClassification;
                return this;
            }

            public ThirdClassifications build() {
                return new ThirdClassifications(this);
            } 

        } 

    }
}
