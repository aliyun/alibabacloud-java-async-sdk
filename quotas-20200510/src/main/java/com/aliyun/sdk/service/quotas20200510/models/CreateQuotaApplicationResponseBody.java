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
 * {@link CreateQuotaApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateQuotaApplicationResponseBody</p>
 */
public class CreateQuotaApplicationResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("QuotaDescription")
    private String quotaDescription;

    @com.aliyun.core.annotation.NameInMap("QuotaName")
    private String quotaName;

    @com.aliyun.core.annotation.NameInMap("QuotaUnit")
    private String quotaUnit;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
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

    public Builder toBuilder() {
        return new Builder(this);
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
        private java.util.Map<String, ?> dimension; 
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

        private Builder() {
        } 

        private Builder(CreateQuotaApplicationResponseBody model) {
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
            this.quotaDescription = model.quotaDescription;
            this.quotaName = model.quotaName;
            this.quotaUnit = model.quotaUnit;
            this.reason = model.reason;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the quota increase request.</p>
         * 
         * <strong>example:</strong>
         * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The time when the quota increase request was submitted. The time is in ISO 8601 format and in UTC. The value ends with Z.</p>
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
         * <p>804</p>
         */
        public Builder approveValue(Float approveValue) {
            this.approveValue = approveValue;
            return this;
        }

        /**
         * <p>The review comments on the quota increase request.</p>
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
         * <p>The quota dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        public Builder dimension(java.util.Map<String, ?> dimension) {
            this.dimension = dimension;
            return this;
        }

        /**
         * <p>The effective period of the quota. The time is in ISO 8601 format and in UTC. The value ends with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-19T09:25:56Z</p>
         */
        public Builder effectiveTime(String effectiveTime) {
            this.effectiveTime = effectiveTime;
            return this;
        }

        /**
         * <p>The time when the quota expires. The time is in ISO 8601 format and in UTC. The value ends with Z.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-20T09:25:56Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>Indicates whether a notification is sent about the request result. Valid values:</p>
         * <ul>
         * <li><p>0: no notification is sent.</p>
         * </li>
         * <li><p>3: a notification is sent.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
         * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:quotas::141339776561****:quota/ecs/q_security-groups</p>
         */
        public Builder quotaArn(String quotaArn) {
            this.quotaArn = quotaArn;
            return this;
        }

        /**
         * <p>The description of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>The maximum number of security groups that can be owned by the current account.</p>
         */
        public Builder quotaDescription(String quotaDescription) {
            this.quotaDescription = quotaDescription;
            return this;
        }

        /**
         * <p>The name of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>Maximum Number of Security Groups</p>
         */
        public Builder quotaName(String quotaName) {
            this.quotaName = quotaName;
            return this;
        }

        /**
         * <p>The unit of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>AMOUNT</p>
         */
        public Builder quotaUnit(String quotaUnit) {
            this.quotaUnit = quotaUnit;
            return this;
        }

        /**
         * <p>The reason for the quota increase request.</p>
         * 
         * <strong>example:</strong>
         * <p>Scale Out</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D47B3A10-CDAC-5412-B2EE-EC9A3DBE9053</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The approval status of the quota increase request.</p>
         * 
         * <strong>example:</strong>
         * <p>Process</p>
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
