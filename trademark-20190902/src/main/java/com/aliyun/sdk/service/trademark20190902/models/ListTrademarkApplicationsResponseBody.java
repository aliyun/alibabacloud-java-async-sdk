// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trademark20190902.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTrademarkApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrademarkApplicationsResponseBody</p>
 */
public class ListTrademarkApplicationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TrademarkApplications")
    private TrademarkApplications trademarkApplications;

    private ListTrademarkApplicationsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trademarkApplications = builder.trademarkApplications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrademarkApplicationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trademarkApplications
     */
    public TrademarkApplications getTrademarkApplications() {
        return this.trademarkApplications;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private TrademarkApplications trademarkApplications; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrademarkApplications.
         */
        public Builder trademarkApplications(TrademarkApplications trademarkApplications) {
            this.trademarkApplications = trademarkApplications;
            return this;
        }

        public ListTrademarkApplicationsResponseBody build() {
            return new ListTrademarkApplicationsResponseBody(this);
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
        @NameInMap("Flags")
        private java.util.List < String > flags;

        private Flags(Builder builder) {
            this.flags = builder.flags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flags create() {
            return builder().build();
        }

        /**
         * @return flags
         */
        public java.util.List < String > getFlags() {
            return this.flags;
        }

        public static final class Builder {
            private java.util.List < String > flags; 

            /**
             * Flags.
             */
            public Builder flags(java.util.List < String > flags) {
                this.flags = flags;
                return this;
            }

            public Flags build() {
                return new Flags(this);
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
    public static class TrademarkApplicationThirdClassification extends TeaModel {
        @NameInMap("ThirdClassification")
        private java.util.List < ThirdClassification> thirdClassification;

        private TrademarkApplicationThirdClassification(Builder builder) {
            this.thirdClassification = builder.thirdClassification;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrademarkApplicationThirdClassification create() {
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

            public TrademarkApplicationThirdClassification build() {
                return new TrademarkApplicationThirdClassification(this);
            } 

        } 

    }
    public static class TrademarkApplication extends TeaModel {
        @NameInMap("AgreementId")
        private String agreementId;

        @NameInMap("ApplicantId")
        private Long applicantId;

        @NameInMap("ApplicantName")
        private String applicantName;

        @NameInMap("ApplicationStatus")
        private Integer applicationStatus;

        @NameInMap("ApplicationType")
        private Integer applicationType;

        @NameInMap("AuthorizationUrl")
        private String authorizationUrl;

        @NameInMap("BizId")
        private String bizId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("FirstClassification")
        private FirstClassification firstClassification;

        @NameInMap("Flags")
        private Flags flags;

        @NameInMap("Note")
        private String note;

        @NameInMap("OrderId")
        private String orderId;

        @NameInMap("OrderPrice")
        private Float orderPrice;

        @NameInMap("PrincipalName")
        private Integer principalName;

        @NameInMap("ServicePrice")
        private Float servicePrice;

        @NameInMap("SupplementId")
        private Long supplementId;

        @NameInMap("SupplementStatus")
        private Integer supplementStatus;

        @NameInMap("SystemVersion")
        private String systemVersion;

        @NameInMap("ThirdClassification")
        private TrademarkApplicationThirdClassification thirdClassification;

        @NameInMap("TotalPrice")
        private Float totalPrice;

        @NameInMap("TrademarkIcon")
        private String trademarkIcon;

        @NameInMap("TrademarkName")
        private String trademarkName;

        @NameInMap("TrademarkNumber")
        private String trademarkNumber;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("UserId")
        private String userId;

        private TrademarkApplication(Builder builder) {
            this.agreementId = builder.agreementId;
            this.applicantId = builder.applicantId;
            this.applicantName = builder.applicantName;
            this.applicationStatus = builder.applicationStatus;
            this.applicationType = builder.applicationType;
            this.authorizationUrl = builder.authorizationUrl;
            this.bizId = builder.bizId;
            this.createTime = builder.createTime;
            this.firstClassification = builder.firstClassification;
            this.flags = builder.flags;
            this.note = builder.note;
            this.orderId = builder.orderId;
            this.orderPrice = builder.orderPrice;
            this.principalName = builder.principalName;
            this.servicePrice = builder.servicePrice;
            this.supplementId = builder.supplementId;
            this.supplementStatus = builder.supplementStatus;
            this.systemVersion = builder.systemVersion;
            this.thirdClassification = builder.thirdClassification;
            this.totalPrice = builder.totalPrice;
            this.trademarkIcon = builder.trademarkIcon;
            this.trademarkName = builder.trademarkName;
            this.trademarkNumber = builder.trademarkNumber;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrademarkApplication create() {
            return builder().build();
        }

        /**
         * @return agreementId
         */
        public String getAgreementId() {
            return this.agreementId;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
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
         * @return servicePrice
         */
        public Float getServicePrice() {
            return this.servicePrice;
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
         * @return systemVersion
         */
        public String getSystemVersion() {
            return this.systemVersion;
        }

        /**
         * @return thirdClassification
         */
        public TrademarkApplicationThirdClassification getThirdClassification() {
            return this.thirdClassification;
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String agreementId; 
            private Long applicantId; 
            private String applicantName; 
            private Integer applicationStatus; 
            private Integer applicationType; 
            private String authorizationUrl; 
            private String bizId; 
            private Long createTime; 
            private FirstClassification firstClassification; 
            private Flags flags; 
            private String note; 
            private String orderId; 
            private Float orderPrice; 
            private Integer principalName; 
            private Float servicePrice; 
            private Long supplementId; 
            private Integer supplementStatus; 
            private String systemVersion; 
            private TrademarkApplicationThirdClassification thirdClassification; 
            private Float totalPrice; 
            private String trademarkIcon; 
            private String trademarkName; 
            private String trademarkNumber; 
            private Long updateTime; 
            private String userId; 

            /**
             * AgreementId.
             */
            public Builder agreementId(String agreementId) {
                this.agreementId = agreementId;
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
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
             * ServicePrice.
             */
            public Builder servicePrice(Float servicePrice) {
                this.servicePrice = servicePrice;
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
             * SystemVersion.
             */
            public Builder systemVersion(String systemVersion) {
                this.systemVersion = systemVersion;
                return this;
            }

            /**
             * ThirdClassification.
             */
            public Builder thirdClassification(TrademarkApplicationThirdClassification thirdClassification) {
                this.thirdClassification = thirdClassification;
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

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public TrademarkApplication build() {
                return new TrademarkApplication(this);
            } 

        } 

    }
    public static class TrademarkApplications extends TeaModel {
        @NameInMap("TrademarkApplication")
        private java.util.List < TrademarkApplication> trademarkApplication;

        private TrademarkApplications(Builder builder) {
            this.trademarkApplication = builder.trademarkApplication;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrademarkApplications create() {
            return builder().build();
        }

        /**
         * @return trademarkApplication
         */
        public java.util.List < TrademarkApplication> getTrademarkApplication() {
            return this.trademarkApplication;
        }

        public static final class Builder {
            private java.util.List < TrademarkApplication> trademarkApplication; 

            /**
             * TrademarkApplication.
             */
            public Builder trademarkApplication(java.util.List < TrademarkApplication> trademarkApplication) {
                this.trademarkApplication = trademarkApplication;
                return this;
            }

            public TrademarkApplications build() {
                return new TrademarkApplications(this);
            } 

        } 

    }
}
