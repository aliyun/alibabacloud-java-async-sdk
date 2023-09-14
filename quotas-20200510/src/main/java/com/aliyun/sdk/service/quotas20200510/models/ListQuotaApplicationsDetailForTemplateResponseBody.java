// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsDetailForTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationsDetailForTemplateResponseBody</p>
 */
public class ListQuotaApplicationsDetailForTemplateResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("QuotaApplications")
    private java.util.List < QuotaApplications> quotaApplications;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * QuotaApplications.
         */
        public Builder quotaApplications(java.util.List < QuotaApplications> quotaApplications) {
            this.quotaApplications = quotaApplications;
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

        public ListQuotaApplicationsDetailForTemplateResponseBody build() {
            return new ListQuotaApplicationsDetailForTemplateResponseBody(this);
        } 

    } 

    public static class Period extends TeaModel {
        @NameInMap("PeriodUnit")
        private String periodUnit;

        @NameInMap("PeriodValue")
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
             * PeriodUnit.
             */
            public Builder periodUnit(String periodUnit) {
                this.periodUnit = periodUnit;
                return this;
            }

            /**
             * PeriodValue.
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
        @NameInMap("AliyunUid")
        private String aliyunUid;

        @NameInMap("ApplicationId")
        private String applicationId;

        @NameInMap("ApplyTime")
        private String applyTime;

        @NameInMap("ApproveValue")
        private Double approveValue;

        @NameInMap("AuditReason")
        private String auditReason;

        @NameInMap("BatchQuotaApplicationId")
        private String batchQuotaApplicationId;

        @NameInMap("DesireValue")
        private Double desireValue;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("EnvLanguage")
        private String envLanguage;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("NoticeType")
        private Integer noticeType;

        @NameInMap("Period")
        private Period period;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @NameInMap("QuotaArn")
        private String quotaArn;

        @NameInMap("QuotaCategory")
        private String quotaCategory;

        @NameInMap("QuotaDescription")
        private String quotaDescription;

        @NameInMap("QuotaDimension")
        private java.util.Map < String, String > quotaDimension;

        @NameInMap("QuotaName")
        private String quotaName;

        @NameInMap("QuotaUnit")
        private String quotaUnit;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Status")
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
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * ApplicationId.
             */
            public Builder applicationId(String applicationId) {
                this.applicationId = applicationId;
                return this;
            }

            /**
             * ApplyTime.
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * ApproveValue.
             */
            public Builder approveValue(Double approveValue) {
                this.approveValue = approveValue;
                return this;
            }

            /**
             * AuditReason.
             */
            public Builder auditReason(String auditReason) {
                this.auditReason = auditReason;
                return this;
            }

            /**
             * BatchQuotaApplicationId.
             */
            public Builder batchQuotaApplicationId(String batchQuotaApplicationId) {
                this.batchQuotaApplicationId = batchQuotaApplicationId;
                return this;
            }

            /**
             * DesireValue.
             */
            public Builder desireValue(Double desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * EffectiveTime.
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * EnvLanguage.
             */
            public Builder envLanguage(String envLanguage) {
                this.envLanguage = envLanguage;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * NoticeType.
             */
            public Builder noticeType(Integer noticeType) {
                this.noticeType = noticeType;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(Period period) {
                this.period = period;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * QuotaActionCode.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * QuotaArn.
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
             * QuotaDescription.
             */
            public Builder quotaDescription(String quotaDescription) {
                this.quotaDescription = quotaDescription;
                return this;
            }

            /**
             * QuotaDimension.
             */
            public Builder quotaDimension(java.util.Map < String, String > quotaDimension) {
                this.quotaDimension = quotaDimension;
                return this;
            }

            /**
             * QuotaName.
             */
            public Builder quotaName(String quotaName) {
                this.quotaName = quotaName;
                return this;
            }

            /**
             * QuotaUnit.
             */
            public Builder quotaUnit(String quotaUnit) {
                this.quotaUnit = quotaUnit;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Status.
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
