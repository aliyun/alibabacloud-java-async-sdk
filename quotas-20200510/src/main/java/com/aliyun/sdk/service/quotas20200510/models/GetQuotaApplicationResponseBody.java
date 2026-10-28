// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetQuotaApplicationResponseBody model) {
            this.quotaApplication = model.quotaApplication;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the quota increase application.</p>
         */
        public Builder quotaApplication(QuotaApplication quotaApplication) {
            this.quotaApplication = quotaApplication;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BBD1D37-094C-4485-8B7D-64682F82BC18</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetQuotaApplicationResponseBody build() {
            return new GetQuotaApplicationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQuotaApplicationResponseBody} extends {@link TeaModel}
     *
     * <p>GetQuotaApplicationResponseBody</p>
     */
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
        private java.util.Map<String, ?> dimension;

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
        public java.util.Map<String, ?> getDimension() {
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
            private java.util.Map<String, ?> dimension; 
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

            private Builder() {
            } 

            private Builder(QuotaApplication model) {
                this.applicationId = model.applicationId;
                this.applyTime = model.applyTime;
                this.approveValue = model.approveValue;
                this.auditReason = model.auditReason;
                this.desireValue = model.desireValue;
                this.dimension = model.dimension;
                this.effectiveTime = model.effectiveTime;
                this.expireTime = model.expireTime;
                this.noticeType = model.noticeType;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaArn = model.quotaArn;
                this.quotaCategory = model.quotaCategory;
                this.quotaDescription = model.quotaDescription;
                this.quotaName = model.quotaName;
                this.quotaUnit = model.quotaUnit;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The time when the quota increase application was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-19T09:25:56Z</p>
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * <p>The approved quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder approveValue(Float approveValue) {
                this.approveValue = approveValue;
                return this;
            }

            /**
             * <p>The review comments for the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>Agree</p>
             */
            public Builder auditReason(String auditReason) {
                this.auditReason = auditReason;
                return this;
            }

            /**
             * <p>The requested quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>804</p>
             */
            public Builder desireValue(Integer desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * <p>The quota dimension.</p>
             * <p>Format: <code>{&quot;regionId&quot;:&quot;region&quot;}</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;cn-shanghai&quot;,&quot;cn-hangzhou&quot;]</p>
             */
            public Builder dimension(java.util.Map<String, ?> dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The effective period of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-19 15:30:00</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The time when the quota expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-06-29 15:30:00</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The notification type. Valid values:</p>
             * <ul>
             * <li>0: no notification</li>
             * <li>1: email notification</li>
             * <li>2: SMS notification</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder noticeType(Long noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * <p>The abbreviation of the cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>q_security-groups</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The ARN of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:quotas:cn-hangzhou:120886317861****:quota/ecs/q_security-groups/</p>
             */
            public Builder quotaArn(String quotaArn) {
                this.quotaArn = quotaArn;
                return this;
            }

            /**
             * <p>The quota category. Valid values:</p>
             * <ul>
             * <li>CommonQuota: general quota</li>
             * <li>FlowControl: API rate limit</li>
             * <li>WhiteListLabel: privilege</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CommonQuota</p>
             */
            public Builder quotaCategory(String quotaCategory) {
                this.quotaCategory = quotaCategory;
                return this;
            }

            /**
             * <p>The quota description.</p>
             * 
             * <strong>example:</strong>
             * <p>The maximum number of security groups that can be owned by the current account.</p>
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
                return this;
            }

            /**
             * <p>The quota name.</p>
             * 
             * <strong>example:</strong>
             * <p>Maximum Number of Security Groups</p>
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * <p>The quota unit.</p>
             * 
             * <strong>example:</strong>
             * <p>AMOUNT</p>
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * <p>The reason for the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>Scale Out</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The approval status of the quota increase application. Valid values:</p>
             * <ul>
             * <li><p>Disagree: Rejected.</p>
             * </li>
             * <li><p>Agree: Approved.</p>
             * </li>
             * <li><p>Process: Under review.</p>
             * </li>
             * <li><p>Cancel: Closed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Agree</p>
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
