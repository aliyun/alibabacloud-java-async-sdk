// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < QuotaApplications> quotaApplications;

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
    public java.util.List < QuotaApplications> getQuotaApplications() {
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
        private java.util.List < QuotaApplications> quotaApplications; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The maximum number of records that can be returned for the query.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position from which you want to start the query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The details of the quota increase application.
         */
        public Builder quotaApplications(java.util.List < QuotaApplications> quotaApplications) {
            this.quotaApplications = quotaApplications;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of records that are returned for the query.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaApplicationsDetailForTemplateResponseBody build() {
            return new ListQuotaApplicationsDetailForTemplateResponseBody(this);
        } 

    } 

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

            /**
             * The unit of the calculation cycle of the quota.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The value of the calculation cycle of the quota.
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
        private java.util.Map < String, String > quotaDimension;

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
        public java.util.Map < String, String > getQuotaDimension() {
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
            private java.util.Map < String, String > quotaDimension; 
            private String quotaName; 
            private String quotaUnit; 
            private String reason; 
            private String status; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * The ID of the quota increase application.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * The time when the quota increase application was submitted. The value is displayed in UTC.
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * The quota value that is approved.
             */
            public Builder approveValue(Double approveValue) {
                this.approveValue = approveValue;
                return this;
            }

            /**
             * The approval result of the quota increase application.
             */
            public Builder auditReason(String auditReason) {
                this.auditReason = auditReason;
                return this;
            }

            /**
             * The ID of the quota application batch.
             */
            public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
                this.batchQuotaApplicationId = batchQuotaApplicationId;
                return this;
            }

            /**
             * The requested value of the quota.
             */
            public Builder desireValue(Double desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * The start time of the validity period of the quota. The value is displayed in UTC.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The language of the quota alert notification. Valid values:
             * <p>
             * 
             * *   zh: Chinese
             * *   en: English
             */
            public Builder envLanguage(String envLanguage) {
                this.envLanguage = envLanguage;
                return this;
            }

            /**
             * The end time of the validity period of the quota. The value is displayed in UTC.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates whether Quota Center sends a notification about the application result. Valid values:
             * <p>
             * 
             * *   0: no
             * *   3: yes
             */
            public Builder noticeType(Integer noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * The calculation cycle of the quota.
             */
            public Builder period(Period period) {
                this.period = period;
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
             * The quota ID.
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
             * The quota type. Valid values:
             * <p>
             * 
             * *   CommonQuota (default): general quota
             * *   WhiteListLabel: privilege
             * *   FlowControl: API rate limit
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
             * The quota dimensions.
             */
            public Builder quotaDimension(java.util.Map < String, String > quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * The quota name.
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
             * The reason for the quota increase application.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The approval status of the quota increase application. Valid values:
             * <p>
             * 
             * *   Disagree: The application is rejected.
             * *   Agree: The application is approved.
             * *   Process: The application is pending approval.
             * *   Cancel: The application is canceled.
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
