// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationsResponseBody</p>
 */
public class ListQuotaApplicationsResponseBody extends TeaModel {
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

    private ListQuotaApplicationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quotaApplications = builder.quotaApplications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationsResponseBody create() {
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
         * The maximum number of records that are returned for the query.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position at which the query ends. An empty value indicates that all data is returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The details of the applications.
         */
        public Builder quotaApplications(java.util.List < QuotaApplications> quotaApplications) {
            this.quotaApplications = quotaApplications;
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
         * The total number of applications.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaApplicationsResponseBody build() {
            return new ListQuotaApplicationsResponseBody(this);
        } 

    } 

    public static class Period extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodUnit")
        private String periodUnit;

        @com.aliyun.core.annotation.NameInMap("PeriodValue")
        private Long periodValue;

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
        public Long getPeriodValue() {
            return this.periodValue;
        }

        public static final class Builder {
            private String periodUnit; 
            private Long periodValue; 

            /**
             * The unit of the calculation cycle. Valid values:
             * <p>
             * 
             * *   second
             * *   minute
             * *   hour
             * *   day
             * *   week
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * The value of the calculation cycle.
             */
            public Builder periodValue(Long periodValue) {
                this.periodValue = periodValue;
                return this;
            }

            public Period build() {
                return new Period(this);
            } 

        } 

    }
    public static class QuotaApplications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationId")
        private String applicationId;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("ApproveValue")
        private Float approveValue;

        @com.aliyun.core.annotation.NameInMap("AuditReason")
        private String auditReason;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DesireValue")
        private Float desireValue;

        @com.aliyun.core.annotation.NameInMap("Dimension")
        private java.util.Map < String, ? > dimension;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

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

        private QuotaApplications(Builder builder) {
            this.applicationId = builder.applicationId;
            this.applyTime = builder.applyTime;
            this.approveValue = builder.approveValue;
            this.auditReason = builder.auditReason;
            this.comment = builder.comment;
            this.desireValue = builder.desireValue;
            this.dimension = builder.dimension;
            this.effectiveTime = builder.effectiveTime;
            this.expireTime = builder.expireTime;
            this.noticeType = builder.noticeType;
            this.period = builder.period;
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

        public static QuotaApplications create() {
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
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return desireValue
         */
        public Float getDesireValue() {
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
            private String comment; 
            private Float desireValue; 
            private java.util.Map < String, ? > dimension; 
            private String effectiveTime; 
            private String expireTime; 
            private Integer noticeType; 
            private Period period; 
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
             * The remarks of the application.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The quota value that is approved.
             */
            public Builder desireValue(Float desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * The dimension of the application.
             */
            public Builder dimension(java.util.Map < String, ? > dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * The time when the application took effect.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * The time when the application expired.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Indicates whether Quota Center sends a notification about the application result. Valid values:
             * <p>
             * 
             * *   0: A notification about the application result is not sent.
             * *   3: A notification about the application result is sent.
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

            public QuotaApplications build() {
                return new QuotaApplications(this);
            } 

        } 

    }
}
