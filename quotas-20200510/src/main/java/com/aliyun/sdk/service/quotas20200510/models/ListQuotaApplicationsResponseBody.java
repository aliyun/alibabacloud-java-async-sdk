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
    private java.util.List<QuotaApplications> quotaApplications;

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

        private Builder(ListQuotaApplicationsResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.quotaApplications = model.quotaApplications;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of records returned in this query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position of the returned data. An empty value indicates that all data has been returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The details of the quota increase applications.</p>
         */
        public Builder quotaApplications(java.util.List<QuotaApplications> quotaApplications) {
            this.quotaApplications = quotaApplications;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>730925FB-0BD0-40AC-AF3A-A6C6E9716879</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of quota increase applications.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaApplicationsResponseBody build() {
            return new ListQuotaApplicationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Period model) {
                this.periodUnit = model.periodUnit;
                this.periodValue = model.periodValue;
            } 

            /**
             * <p>The unit of the quota calculation period. Valid values:</p>
             * <ul>
             * <li>second: seconds.</li>
             * <li>minute: minutes.</li>
             * <li>hour: hours.</li>
             * <li>day: days.</li>
             * <li>week: weeks.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>second</p>
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * <p>The value of the quota calculation period.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListQuotaApplicationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationsResponseBody</p>
     */
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
        private java.util.Map<String, ?> dimension;

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
            private java.util.Map<String, ?> dimension; 
            private String effectiveTime; 
            private String expireTime; 
            private Integer noticeType; 
            private Period period; 
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

            private Builder(QuotaApplications model) {
                this.applicationId = model.applicationId;
                this.applyTime = model.applyTime;
                this.approveValue = model.approveValue;
                this.auditReason = model.auditReason;
                this.comment = model.comment;
                this.desireValue = model.desireValue;
                this.dimension = model.dimension;
                this.effectiveTime = model.effectiveTime;
                this.expireTime = model.expireTime;
                this.noticeType = model.noticeType;
                this.period = model.period;
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
             * <p>b926571d-cc09-4711-b547-58a615f0****</p>
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * <p>The time when the quota increase application was submitted. The value is in ISO 8601 format, in UTC, and ends with Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-15T09:13:53Z</p>
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * <p>The approved quota value of the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder approveValue(Float approveValue) {
                this.approveValue = approveValue;
                return this;
            }

            /**
             * <p>The approval comment for the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>Agree</p>
             */
            public Builder auditReason(String auditReason) {
                this.auditReason = auditReason;
                return this;
            }

            /**
             * <p>The remarks of the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The requested quota value of the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder desireValue(Float desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * <p>The quota dimensions of the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder dimension(java.util.Map<String, ?> dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The effective period of the quota increase application. The value is in ISO 8601 format, in UTC, and ends with Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-15T11:46:25Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The expiration time of the quota increase application. The value is in ISO 8601 format, in UTC, and ends with Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-17T11:46:25Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether a notification is sent for the quota increase application result. Valid values:</p>
             * <ul>
             * <li>0: No.</li>
             * <li>3: Yes.</li>
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
             * <p>The quota calculation period.</p>
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The abbreviation of the cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>csk</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>q_i5uzm3</p>
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
             * <p>The quota category. Valid values:</p>
             * <ul>
             * <li>CommonQuota (default): general quota.</li>
             * <li>WhiteListLabel: privilege.</li>
             * <li>FlowControl: API rate limit.</li>
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
             * <p>The maximum number of nodes in a cluster.</p>
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
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
             * <p>Node</p>
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * <p>The reason for the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>Business expansion</p>
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

            public QuotaApplications build() {
                return new QuotaApplications(this);
            } 

        } 

    }
}
