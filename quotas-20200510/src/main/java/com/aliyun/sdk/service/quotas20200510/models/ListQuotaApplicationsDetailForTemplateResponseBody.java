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
 * {@link ListQuotaApplicationsDetailForTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationsDetailForTemplateResponseBody</p>
 */
public class ListQuotaApplicationsDetailForTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QuotaApplications")
    private java.util.List<QuotaApplications> quotaApplications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListQuotaApplicationsDetailForTemplateResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quotaApplications = builder.quotaApplications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationsDetailForTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return quotaApplications
     */
    public java.util.List<QuotaApplications> getQuotaApplications() {
        return this.quotaApplications;
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

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<QuotaApplications> quotaApplications; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListQuotaApplicationsDetailForTemplateResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.quotaApplications = model.quotaApplications;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of records returned for the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position from which the next query starts.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>A list of quota application details.</p>
         */
        public Builder quotaApplications(java.util.List<QuotaApplications> quotaApplications) {
            this.quotaApplications = quotaApplications;
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
         * <p>The total number of records returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBody build() {
            return new ListQuotaApplicationsDetailForTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaApplicationsDetailForTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationsDetailForTemplateResponseBody</p>
     */
    public static class Period extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PeriodValue")
        private Integer periodValue;

        private Period(Builder builder) {
            this.periodUnit = builder.periodUnit;
            this.periodValue = builder.periodValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Period create() {
            return builder().build();
        }

        /**
         * @return periodUnit
         */
        public String getPeriodUnit() {
            return this.periodUnit;
        }

        /**
         * @return periodValue
         */
        public Integer getPeriodValue() {
            return this.periodValue;
        }

        public static final class Builder {
            private String periodUnit; 
            private Integer periodValue; 

            private Builder() {
            } 

            private Builder(Period model) {
                this.periodUnit = model.periodUnit;
                this.periodValue = model.periodValue;
            } 

            /**
             * <p>The unit of the calculation cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>second</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The value of the calculation cycle.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder periodValue(Integer periodValue) {
                this.periodValue = periodValue;
                return this;
            }

            public Period build() {
                return new Period(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotaApplicationsDetailForTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationsDetailForTemplateResponseBody</p>
     */
    public static class QuotaApplications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("ApproveValue")
        private Double approveValue;

        @com.aliyun.core.annotation.NameInMap("AuditReason")
        private String auditReason;

        @com.aliyun.core.annotation.NameInMap("BatchQuotaApplicationId")
        private String batchQuotaApplicationId;

        @com.aliyun.core.annotation.NameInMap("DesireValue")
        private Double desireValue;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("EnvLanguage")
        private String envLanguage;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private Integer noticeType;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Period period;

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

        @com.aliyun.core.annotation.NameInMap("QuotaDimension")
        private java.util.Map<String, String> quotaDimension;

        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        @com.aliyun.core.annotation.NameInMap("QuotaUnit")
        private String quotaUnit;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private QuotaApplications(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.applicationId = builder.applicationId;
            this.applyTime = builder.applyTime;
            this.approveValue = builder.approveValue;
            this.auditReason = builder.auditReason;
            this.batchQuotaApplicationId = builder.batchQuotaApplicationId;
            this.desireValue = builder.desireValue;
            this.effectiveTime = builder.effectiveTime;
            this.envLanguage = builder.envLanguage;
            this.expireTime = builder.expireTime;
            this.noticeType = builder.noticeType;
            this.period = builder.period;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaArn = builder.quotaArn;
            this.quotaCategory = builder.quotaCategory;
            this.quotaDescription = builder.quotaDescription;
            this.quotaDimension = builder.quotaDimension;
            this.quotaName = builder.quotaName;
            this.quotaUnit = builder.quotaUnit;
            this.reason = builder.reason;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaApplications create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
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
        public Double getApproveValue() {
            return this.approveValue;
        }

        /**
         * @return auditReason
         */
        public String getAuditReason() {
            return this.auditReason;
        }

        /**
         * @return batchQuotaApplicationId
         */
        public String getBatchQuotaApplicationId() {
            return this.batchQuotaApplicationId;
        }

        /**
         * @return desireValue
         */
        public Double getDesireValue() {
            return this.desireValue;
        }

        /**
         * @return effectiveTime
         */
        public String getEffectiveTime() {
            return this.effectiveTime;
        }

        /**
         * @return envLanguage
         */
        public String getEnvLanguage() {
            return this.envLanguage;
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
        public Integer getNoticeType() {
            return this.noticeType;
        }

        /**
         * @return period
         */
        public Period getPeriod() {
            return this.period;
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
         * @return quotaDimension
         */
        public java.util.Map<String, String> getQuotaDimension() {
            return this.quotaDimension;
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
            private String aliyunUid; 
            private String applicationId; 
            private String applyTime; 
            private Double approveValue; 
            private String auditReason; 
            private String batchQuotaApplicationId; 
            private Double desireValue; 
            private String effectiveTime; 
            private String envLanguage; 
            private String expireTime; 
            private Integer noticeType; 
            private Period period; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaArn; 
            private String quotaCategory; 
            private String quotaDescription; 
            private java.util.Map<String, String> quotaDimension; 
            private String quotaName; 
            private String quotaUnit; 
            private String reason; 
            private String status; 

            private Builder() {
            } 

            private Builder(QuotaApplications model) {
                this.aliyunUid = model.aliyunUid;
                this.applicationId = model.applicationId;
                this.applyTime = model.applyTime;
                this.approveValue = model.approveValue;
                this.auditReason = model.auditReason;
                this.batchQuotaApplicationId = model.batchQuotaApplicationId;
                this.desireValue = model.desireValue;
                this.effectiveTime = model.effectiveTime;
                this.envLanguage = model.envLanguage;
                this.expireTime = model.expireTime;
                this.noticeType = model.noticeType;
                this.period = model.period;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaArn = model.quotaArn;
                this.quotaCategory = model.quotaCategory;
                this.quotaDescription = model.quotaDescription;
                this.quotaDimension = model.quotaDimension;
                this.quotaName = model.quotaName;
                this.quotaUnit = model.quotaUnit;
                this.reason = model.reason;
                this.status = model.status;
            } 

            /**
             * <p>The Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>175376458581****</p>
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The ID of the quota increase request.</p>
             * 
             * <strong>example:</strong>
             * <p>b926571d-cc09-4711-b547-58a615f0****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The UTC time when the quota increase request was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-15T09:13:53Z</p>
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * <p>The approved quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder approveValue(Double approveValue) {
                this.approveValue = approveValue;
                return this;
            }

            /**
             * <p>The reason for the approval.</p>
             * 
             * <strong>example:</strong>
             * <p>Agree</p>
             */
            public Builder auditReason(String auditReason) {
                this.auditReason = auditReason;
                return this;
            }

            /**
             * <p>The ID of the quota application batch.</p>
             * 
             * <strong>example:</strong>
             * <p>d314d6ae-867d-484c-9009-3d421a80****</p>
             */
            public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
                this.batchQuotaApplicationId = batchQuotaApplicationId;
                return this;
            }

            /**
             * <p>The requested quota value.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder desireValue(Double desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * <p>The UTC time when the new quota value takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-15T11:46:25Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The language of the alert notification. Valid values:</p>
             * <ul>
             * <li><p>zh: Chinese.</p>
             * </li>
             * <li><p>en: English.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder envLanguage(String envLanguage) {
                this.envLanguage = envLanguage;
                return this;
            }

            /**
             * <p>The UTC time when the new quota value expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-17T11:46:25Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether a notification is sent for the quota increase request. Valid values:</p>
             * <ul>
             * <li><p>0: No.</p>
             * </li>
             * <li><p>3: Yes.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder noticeType(Integer noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * <p>The calculation cycle of the quota.</p>
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The abbreviation of the Alibaba Cloud service name.</p>
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
             * <p>ecs.n1.large</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:quotas:<em>:120886317861</em>***:quota/csk/q_i5uzm3</p>
             */
            public Builder quotaArn(String quotaArn) {
                this.quotaArn = quotaArn;
                return this;
            }

            /**
             * <p>The quota type. Valid values:</p>
             * <ul>
             * <li><p>CommonQuota (default): General quota.</p>
             * </li>
             * <li><p>WhiteListLabel: Privilege quota.</p>
             * </li>
             * <li><p>FlowControl: API rate limit quota.</p>
             * </li>
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
             * <p>The description of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>The maximum number of nodes in a cluster</p>
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
                return this;
            }

            /**
             * <p>The quota dimensions.</p>
             */
            public Builder quotaDimension(java.util.Map<String, String> quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * <p>The name of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>Maximum Number of Nodes</p>
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * <p>The unit of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>GiB</p>
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * <p>The reason for the quota increase request.</p>
             * 
             * <strong>example:</strong>
             * <p>Maximum Number of Nodes</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The approval status of the quota increase request. Valid values:</p>
             * <ul>
             * <li><p>Disagree: The request is rejected.</p>
             * </li>
             * <li><p>Agree: The request is approved.</p>
             * </li>
             * <li><p>Process: The request is in review.</p>
             * </li>
             * <li><p>Cancel: The request is closed.</p>
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

            public QuotaApplications build() {
                return new QuotaApplications(this);
            } 

        } 

    }
}
