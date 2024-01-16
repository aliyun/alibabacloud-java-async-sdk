// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateQuotaApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaApplicationResponseBody</p>
 */
public class CreateQuotaApplicationResponseBody extends TeaModel {
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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private CreateQuotaApplicationResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateQuotaApplicationResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
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
         * The quota value that is approved.
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
         * The requested value of the quota.
         */
        public Builder desireValue(Integer desireValue) {
            this.desireValue = desireValue;
            return this;
        }

        /**
         * The quota dimension.
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
         * Indicates whether Quota Center sends a notification about the application result. Valid values:
         * <p>
         * 
         * *   0: Quota Center does not send a notification.
         * *   3: Quota Center sends a notification.
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The status of the application. Valid values:
         * <p>
         * 
         * *   Disagree: The application is rejected.
         * *   Agree: The application is approved.
         * *   Process: The application is being reviewed.
         * *   Cancel: The application is canceled.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateQuotaApplicationResponseBody build() {
            return new CreateQuotaApplicationResponseBody(this);
        } 

    } 

}
