// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationsForTemplateResponseBody</p>
 */
public class ListQuotaApplicationsForTemplateResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("QuotaBatchApplications")
    private java.util.List < QuotaBatchApplications> quotaBatchApplications;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListQuotaApplicationsForTemplateResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quotaBatchApplications = builder.quotaBatchApplications;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationsForTemplateResponseBody create() {
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
     * @return quotaBatchApplications
     */
    public java.util.List < QuotaBatchApplications> getQuotaBatchApplications() {
        return this.quotaBatchApplications;
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
        private java.util.List < QuotaBatchApplications> quotaBatchApplications; 
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
         * The queried quota application records.
         */
        public Builder quotaBatchApplications(java.util.List < QuotaBatchApplications> quotaBatchApplications) {
            this.quotaBatchApplications = quotaBatchApplications;
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

        public ListQuotaApplicationsForTemplateResponseBody build() {
            return new ListQuotaApplicationsForTemplateResponseBody(this);
        } 

    } 

    public static class AuditStatusVos extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("Status")
        private String status;

        private AuditStatusVos(Builder builder) {
            this.count = builder.count;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuditStatusVos create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer count; 
            private String status; 

            /**
             * The number of approval documents.
             */
            public Builder count(Integer count) {
                this.count = count;
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

            public AuditStatusVos build() {
                return new AuditStatusVos(this);
            } 

        } 

    }
    public static class QuotaBatchApplications extends TeaModel {
        @NameInMap("AliyunUids")
        private java.util.List < String > aliyunUids;

        @NameInMap("ApplyTime")
        private String applyTime;

        @NameInMap("AuditStatusVos")
        private java.util.List < AuditStatusVos> auditStatusVos;

        @NameInMap("BatchQuotaApplicationId")
        private String batchQuotaApplicationId;

        @NameInMap("DesireValue")
        private Double desireValue;

        @NameInMap("Dimensions")
        private java.util.Map < String, ? > dimensions;

        @NameInMap("EffectiveTime")
        private String effectiveTime;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @NameInMap("QuotaCategory")
        private String quotaCategory;

        @NameInMap("Reason")
        private String reason;

        private QuotaBatchApplications(Builder builder) {
            this.aliyunUids = builder.aliyunUids;
            this.applyTime = builder.applyTime;
            this.auditStatusVos = builder.auditStatusVos;
            this.batchQuotaApplicationId = builder.batchQuotaApplicationId;
            this.desireValue = builder.desireValue;
            this.dimensions = builder.dimensions;
            this.effectiveTime = builder.effectiveTime;
            this.expireTime = builder.expireTime;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaCategory = builder.quotaCategory;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaBatchApplications create() {
            return builder().build();
        }

        /**
         * @return aliyunUids
         */
        public java.util.List < String > getAliyunUids() {
            return this.aliyunUids;
        }

        /**
         * @return applyTime
         */
        public String getApplyTime() {
            return this.applyTime;
        }

        /**
         * @return auditStatusVos
         */
        public java.util.List < AuditStatusVos> getAuditStatusVos() {
            return this.auditStatusVos;
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
         * @return dimensions
         */
        public java.util.Map < String, ? > getDimensions() {
            return this.dimensions;
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
         * @return quotaCategory
         */
        public String getQuotaCategory() {
            return this.quotaCategory;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private java.util.List < String > aliyunUids; 
            private String applyTime; 
            private java.util.List < AuditStatusVos> auditStatusVos; 
            private String batchQuotaApplicationId; 
            private Double desireValue; 
            private java.util.Map < String, ? > dimensions; 
            private String effectiveTime; 
            private String expireTime; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaCategory; 
            private String reason; 

            /**
             * The Alibaba Cloud accounts for which the quotas are applied.
             */
            public Builder aliyunUids(java.util.List < String > aliyunUids) {
                this.aliyunUids = aliyunUids;
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
             * The number of applications in different approval states.
             */
            public Builder auditStatusVos(java.util.List < AuditStatusVos> auditStatusVos) {
                this.auditStatusVos = auditStatusVos;
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
             * The quota dimensions.
             * <p>
             * 
             * Format: {"regionId":"cn-hangzhou"}.
             */
            public Builder dimensions(java.util.Map < String, ? > dimensions) {
                this.dimensions = dimensions;
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
             * The end time of the validity period of the quota. The value is displayed in UTC.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
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
             * The quota type. Valid values:
             * <p>
             * 
             * *   CommonQuota: general quota
             * *   FlowControl: API rate limit
             * *   WhiteListLabel: privilege
             */
            public Builder quotaCategory(String quotaCategory) {
                this.quotaCategory = quotaCategory;
                return this;
            }

            /**
             * The reason for the quota increase application.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public QuotaBatchApplications build() {
                return new QuotaBatchApplications(this);
            } 

        } 

    }
}
