// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQuotaApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>GetQuotaApplicationResponseBody</p>
 */
public class GetQuotaApplicationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QuotaApplication")
    private QuotaApplication quotaApplication;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("ApproveValue")
        private Float approveValue;

        @com.aliyun.core.annotation.NameInMap("AuditReason")
        private String auditReason;

        @com.aliyun.core.annotation.NameInMap("DesireValue")
        private Integer desireValue;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private java.util.Map < String, ? > dimension;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private Long noticeType;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaArn")
        private String quotaArn;

        @com.aliyun.core.annotation.NameInMap("QuotaCategory")
        private String quotaCategory;

        @com.aliyun.core.annotation.NameInMap("QuotaDescription")
        private String quotaDescription;

        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaUnit")
        private String quotaUnit;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
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
            this.quotaCategory = builder.quotaCategory;
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
         * @return quotaCategory
         */
        public String getQuotaCategory() {
            return this.quotaCategory;
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
            private String quotaCategory; 
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
             * The expected value of the quota.
             */
            public Builder desireValue(Integer desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * The dimension.
             * <p>
             * 
             * Format: `{"regionId":"Region"}`.
             */
            public Builder dimension(java.util.Map < String, ? > dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * The time when the new quota value takes effect.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The time when the new quota expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The method of that is used to send alert notifications. Valid values:
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
             * The abbreviation of the Alibaba Cloud service name.
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
             * QuotaCategory.
             */
            public Builder quotaCategory(String quotaCategory) {
                this.quotaCategory = quotaCategory;
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
             * The unit of the new quota value.
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
             * *   Process: The application is being reviewed.
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
