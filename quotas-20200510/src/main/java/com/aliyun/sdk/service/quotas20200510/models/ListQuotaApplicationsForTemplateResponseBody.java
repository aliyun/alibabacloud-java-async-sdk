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
 * {@link ListQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationsForTemplateResponseBody</p>
 */
public class ListQuotaApplicationsForTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QuotaBatchApplications")
    private java.util.List<QuotaBatchApplications> quotaBatchApplications;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
     * @return quotaBatchApplications
     */
    public java.util.List<QuotaBatchApplications> getQuotaBatchApplications() {
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
        private java.util.List<QuotaBatchApplications> quotaBatchApplications; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListQuotaApplicationsForTemplateResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.quotaBatchApplications = model.quotaBatchApplications;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The maximum number of records returned for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the start of the data to read.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of historical quota applications.</p>
         */
        public Builder quotaBatchApplications(java.util.List<QuotaBatchApplications> quotaBatchApplications) {
            this.quotaBatchApplications = quotaBatchApplications;
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
         * <p>67</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaApplicationsForTemplateResponseBody build() {
            return new ListQuotaApplicationsForTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationsForTemplateResponseBody</p>
     */
    public static class AuditStatusVos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(AuditStatusVos model) {
                this.count = model.count;
                this.status = model.status;
            } 

            /**
             * <p>The number of applications.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The approval status of the quota increase application. Valid values:</p>
             * <ul>
             * <li><p>Disagree: denied.</p>
             * </li>
             * <li><p>Agree: approved.</p>
             * </li>
             * <li><p>Process: pending approval.</p>
             * </li>
             * <li><p>Cancel: closed.</p>
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

            public AuditStatusVos build() {
                return new AuditStatusVos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListQuotaApplicationsForTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationsForTemplateResponseBody</p>
     */
    public static class QuotaBatchApplications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUids")
        private java.util.List<String> aliyunUids;

        @com.aliyun.core.annotation.NameInMap("ApplyTime")
        private String applyTime;

        @com.aliyun.core.annotation.NameInMap("AuditStatusVos")
        private java.util.List<AuditStatusVos> auditStatusVos;

        @com.aliyun.core.annotation.NameInMap("BatchQuotaApplicationId")
        private String batchQuotaApplicationId;

        @com.aliyun.core.annotation.NameInMap("DesireValue")
        private Double desireValue;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.Map<String, ?> dimensions;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaCategory")
        private String quotaCategory;

        @com.aliyun.core.annotation.NameInMap("Reason")
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
        public java.util.List<String> getAliyunUids() {
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
        public java.util.List<AuditStatusVos> getAuditStatusVos() {
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
        public java.util.Map<String, ?> getDimensions() {
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
            private java.util.List<String> aliyunUids; 
            private String applyTime; 
            private java.util.List<AuditStatusVos> auditStatusVos; 
            private String batchQuotaApplicationId; 
            private Double desireValue; 
            private java.util.Map<String, ?> dimensions; 
            private String effectiveTime; 
            private String expireTime; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaCategory; 
            private String reason; 

            private Builder() {
            } 

            private Builder(QuotaBatchApplications model) {
                this.aliyunUids = model.aliyunUids;
                this.applyTime = model.applyTime;
                this.auditStatusVos = model.auditStatusVos;
                this.batchQuotaApplicationId = model.batchQuotaApplicationId;
                this.desireValue = model.desireValue;
                this.dimensions = model.dimensions;
                this.effectiveTime = model.effectiveTime;
                this.expireTime = model.expireTime;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaCategory = model.quotaCategory;
                this.reason = model.reason;
            } 

            /**
             * <p>The list of Alibaba Cloud accounts of the members in a resource directory for which the quota applications are submitted.</p>
             */
            public Builder aliyunUids(java.util.List<String> aliyunUids) {
                this.aliyunUids = aliyunUids;
                return this;
            }

            /**
             * <p>The UTC time when the quota increase application was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-23T02:38:18Z</p>
             */
            public Builder applyTime(String applyTime) {
                this.applyTime = applyTime;
                return this;
            }

            /**
             * <p>The number of applications in different approval states.</p>
             */
            public Builder auditStatusVos(java.util.List<AuditStatusVos> auditStatusVos) {
                this.auditStatusVos = auditStatusVos;
                return this;
            }

            /**
             * <p>The ID of the batch quota application.</p>
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
             * <p>105</p>
             */
            public Builder desireValue(Double desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * <p>The quota dimensions.</p>
             * <p>Format: {&quot;regionId&quot;:&quot;cn-hangzhou&quot;}.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder dimensions(java.util.Map<String, ?> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The UTC time when the quota takes effect.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-05-22T16:00:00Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The UTC time when the quota expires.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-14T02:08:56Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The abbreviation of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The quota ID.</p>
             * 
             * <strong>example:</strong>
             * <p>q_fhoz4k</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The type of the quota. Valid values:</p>
             * <ul>
             * <li><p>CommonQuota: general quota.</p>
             * </li>
             * <li><p>FlowControl: API rate limit.</p>
             * </li>
             * <li><p>WhiteListLabel: privilege.</p>
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
             * <p>The reason for the quota increase application.</p>
             * 
             * <strong>example:</strong>
             * <p>Business expansion</p>
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
