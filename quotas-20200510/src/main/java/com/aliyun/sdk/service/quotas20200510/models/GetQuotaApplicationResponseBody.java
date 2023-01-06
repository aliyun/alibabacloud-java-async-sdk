// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaApplicationResponseBody</p>
 */
public class GetQuotaApplicationResponseBody extends TeaModel {
    @NameInMap("QuotaApplication")
    private QuotaApplication quotaApplication;

    @NameInMap("RequestId")
    private String requestId;

    private GetQuotaApplicationResponseBody(Builder builder) {
        this.quotaApplication = builder.quotaApplication;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQuotaApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return quotaApplication
     */
    public QuotaApplication getQuotaApplication() {
        return this.quotaApplication;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QuotaApplication quotaApplication; 
        private String requestId; 

        /**
         * The details about the application.
         */
        public Builder quotaApplication(QuotaApplication quotaApplication) {
            this.quotaApplication = quotaApplication;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaApplicationResponseBody build() {
            return new GetQuotaApplicationResponseBody(this);
        } 

    } 

    public static class QuotaApplication extends TeaModel {
        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ApplyTime")
        private String applyTime;

        @NameInMap("ApproveValue")
        private Float approveValue;

        @NameInMap("AuditReason")
        private String auditReason;

        @NameInMap("DesireValue")
        private Integer desireValue;

        @NameInMap("Dimension")
        private java.util.Map < String, ? > dimension;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("NoticeType")
        private Long noticeType;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @NameInMap("QuotaArn")
        private String quotaArn;

        @NameInMap("QuotaDescription")
        private String quotaDescription;

        @NameInMap("QuotaName")
        private String quotaName;

        @NameInMap("QuotaUnit")
        private String quotaUnit;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
        private String status;

        private QuotaApplication(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applyTime = builder.applyTime;
            this.approveValue = builder.approveValue;
            this.auditReason = builder.auditReason;
            this.desireValue = builder.desireValue;
            this.dimension = builder.dimension;
            this.effectiveTime = builder.effectiveTime;
            this.expireTime = builder.expireTime;
            this.noticeType = builder.noticeType;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaArn = builder.quotaArn;
            this.quotaDescription = builder.quotaDescription;
            this.quotaName = builder.quotaName;
            this.quotaUnit = builder.quotaUnit;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaApplication create() {
            return builder().build();
        }

        /**
         * @return applicationId
         */
        public String getApplicationId() {
            return this.applicationId;
        }

        /**
         * @return applyTime
         */
        public String getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return approveValue
         */
        public Float getApproveValue() {
            return this.approveValue;
        }

        /**
         * @return auditReason
         */
        public String getAuditReason() {
            return this.auditReason;
        }

        /**
         * @return desireValue
         */
        public Integer getDesireValue() {
            return this.desireValue;
        }

        /**
         * @return dimension
         */
        public java.util.Map < String, ? > getDimension() {
            return this.dimension;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return noticeType
         */
        public Long getNoticeType() {
            return this.noticeType;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return quotaActionCode
         */
        public String getQuotaActionCode() {
            return this.quotaActionCode;
        }

        /**
         * @return quotaArn
         */
        public String getQuotaArn() {
            return this.quotaArn;
        }

        /**
         * @return quotaDescription
         */
        public String getQuotaDescription() {
            return this.quotaDescription;
        }

        /**
         * @return quotaName
         */
        public String getQuotaName() {
            return this.quotaName;
        }

        /**
         * @return quotaUnit
         */
        public String getQuotaUnit() {
            return this.quotaUnit;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String applicationId; 
            private String applyTime; 
            private Float approveValue; 
            private String auditReason; 
            private Integer desireValue; 
            private java.util.Map < String, ? > dimension; 
            private String effectiveTime; 
            private String expireTime; 
            private Long noticeType; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaArn; 
            private String quotaDescription; 
            private String quotaName; 
            private String quotaUnit; 
            private String reason; 
            private String status; 

            /**
             * The ID of the application.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The time when the application was submitted.
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * The approved quota value.
             */
            public Builder approveValue(Float approveValue) {
                this.approveValue = approveValue;
                return this;
            }

            /**
             * The result of the application.
             */
            public Builder auditReason(String auditReason) {
                this.auditReason = auditReason;
                return this;
            }

            /**
             * The quota for which you apply.
             */
            public Builder desireValue(Integer desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * The quota dimensions.
             * <p>
             * 
             * Format: `{"regionId":"Region"}`.
             */
            public Builder dimension(java.util.Map < String, ? > dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * The time when the quota took effect.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The time when the quota expired.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The notification method. Valid values:
             * <p>
             * 
             * *   0: Quota Center does not send a notification.
             * *   1: Quota Center sends an email notification.
             * *   2: Quota Center sends an SMS notification.
             */
            public Builder noticeType(Long noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * The abbreviation of the cloud service name.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The ID of the quota.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the quota.
             */
            public Builder quotaArn(String quotaArn) {
                this.quotaArn = quotaArn;
                return this;
            }

            /**
             * The description of the quota.
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
                return this;
            }

            /**
             * The name of the quota.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * The unit of the quota.
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * The reason for the application.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The status of the application. Valid values:
             * <p>
             * 
             * *   Disagree: The application is rejected.
             * *   Agree: The application is approved.
             * *   Process: The application is pending approval.
             * *   Cancel: The application is closed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public QuotaApplication build() {
                return new QuotaApplication(this);
            } 

        } 

    }
}
