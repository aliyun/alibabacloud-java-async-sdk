// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListQuotaApplicationTemplatesResponseBody</p>
 */
public class ListQuotaApplicationTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("QuotaApplicationTemplates")
    private java.util.List < QuotaApplicationTemplates> quotaApplicationTemplates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListQuotaApplicationTemplatesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.quotaApplicationTemplates = builder.quotaApplicationTemplates;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationTemplatesResponseBody create() {
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
     * @return quotaApplicationTemplates
     */
    public java.util.List < QuotaApplicationTemplates> getQuotaApplicationTemplates() {
        return this.quotaApplicationTemplates;
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
        private java.util.List < QuotaApplicationTemplates> quotaApplicationTemplates; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The maximum number of records returned for the query.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position at which the query ends.
         * <p>
         * 
         * > An empty value indicates that all data is returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The queried quota templates.
         */
        public Builder quotaApplicationTemplates(java.util.List < QuotaApplicationTemplates> quotaApplicationTemplates) {
            this.quotaApplicationTemplates = quotaApplicationTemplates;
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
         * The total number of records returned for the query.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaApplicationTemplatesResponseBody build() {
            return new ListQuotaApplicationTemplatesResponseBody(this);
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
            public Builder periodValue(Integer periodValue) {
                this.periodValue = periodValue;
                return this;
            }

            public Period build() {
                return new Period(this);
            } 

        } 

    }
    public static class QuotaApplicationTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableRange")
        private java.util.List < Float > applicableRange;

        @com.aliyun.core.annotation.NameInMap("ApplicableType")
        private String applicableType;

        @com.aliyun.core.annotation.NameInMap("DesireValue")
        private Float desireValue;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.Map < String, ? > dimensions;

        @com.aliyun.core.annotation.NameInMap("EffectiveTime")
        private String effectiveTime;

        @com.aliyun.core.annotation.NameInMap("EnvLanguage")
        private String envLanguage;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("NoticeType")
        private Integer noticeType;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Period period;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
        private String quotaActionCode;

        @com.aliyun.core.annotation.NameInMap("QuotaCategory")
        private String quotaCategory;

        @com.aliyun.core.annotation.NameInMap("QuotaDescription")
        private String quotaDescription;

        @com.aliyun.core.annotation.NameInMap("QuotaName")
        private String quotaName;

        private QuotaApplicationTemplates(Builder builder) {
            this.applicableRange = builder.applicableRange;
            this.applicableType = builder.applicableType;
            this.desireValue = builder.desireValue;
            this.dimensions = builder.dimensions;
            this.effectiveTime = builder.effectiveTime;
            this.envLanguage = builder.envLanguage;
            this.expireTime = builder.expireTime;
            this.id = builder.id;
            this.noticeType = builder.noticeType;
            this.period = builder.period;
            this.productCode = builder.productCode;
            this.quotaActionCode = builder.quotaActionCode;
            this.quotaCategory = builder.quotaCategory;
            this.quotaDescription = builder.quotaDescription;
            this.quotaName = builder.quotaName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QuotaApplicationTemplates create() {
            return builder().build();
        }

        /**
         * @return applicableRange
         */
        public java.util.List < Float > getApplicableRange() {
            return this.applicableRange;
        }

        /**
         * @return applicableType
         */
        public String getApplicableType() {
            return this.applicableType;
        }

        /**
         * @return desireValue
         */
        public Float getDesireValue() {
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
         * @return id
         */
        public String getId() {
            return this.id;
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

        public static final class Builder {
            private java.util.List < Float > applicableRange; 
            private String applicableType; 
            private Float desireValue; 
            private java.util.Map < String, ? > dimensions; 
            private String effectiveTime; 
            private String envLanguage; 
            private String expireTime; 
            private String id; 
            private Integer noticeType; 
            private Period period; 
            private String productCode; 
            private String quotaActionCode; 
            private String quotaCategory; 
            private String quotaDescription; 
            private String quotaName; 

            /**
             * None
             */
            public Builder applicableRange(java.util.List < Float > applicableRange) {
                this.applicableRange = applicableRange;
                return this;
            }

            /**
             * The type of the adjustable value. Valid values:
             * <p>
             * 
             * *   continuous
             * *   discontinuous
             */
            public Builder applicableType(String applicableType) {
                this.applicableType = applicableType;
                return this;
            }

            /**
             * The requested value of the quota.
             */
            public Builder desireValue(Float desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * The quota dimensions.
             * <p>
             * 
             * Format: {"regionId":"Region"}.
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
             * The ID of the quota template.
             */
            public Builder id(String id) {
                this.id = id;
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
             * The ID of the quota.
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * The type of the quota. Valid values:
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

            public QuotaApplicationTemplates build() {
                return new QuotaApplicationTemplates(this);
            } 

        } 

    }
}
