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
    private java.util.List<QuotaApplicationTemplates> quotaApplicationTemplates;

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
     * @return quotaApplicationTemplates
     */
    public java.util.List<QuotaApplicationTemplates> getQuotaApplicationTemplates() {
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
        private java.util.List<QuotaApplicationTemplates> quotaApplicationTemplates; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListQuotaApplicationTemplatesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.quotaApplicationTemplates = model.quotaApplicationTemplates;
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
         * <p>The token that marks the position at which the query ends.</p>
         * <blockquote>
         * <p>An empty value indicates that all data is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The information about quota templates.</p>
         */
        public Builder quotaApplicationTemplates(java.util.List<QuotaApplicationTemplates> quotaApplicationTemplates) {
            this.quotaApplicationTemplates = quotaApplicationTemplates;
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
         * <p>The total number of records returned for the query.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListQuotaApplicationTemplatesResponseBody build() {
            return new ListQuotaApplicationTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaApplicationTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationTemplatesResponseBody</p>
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
             * <p>The unit of the calculation cycle. Valid values:</p>
             * <ul>
             * <li><p>second</p>
             * </li>
             * <li><p>minute</p>
             * </li>
             * <li><p>hour</p>
             * </li>
             * <li><p>day</p>
             * </li>
             * <li><p>week</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>day</p>
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
     * {@link ListQuotaApplicationTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationTemplatesResponseBody</p>
     */
    public static class QuotaApplicationTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicableRange")
        private java.util.List<Float> applicableRange;

        @com.aliyun.core.annotation.NameInMap("ApplicableType")
        private String applicableType;

        @com.aliyun.core.annotation.NameInMap("DesireValue")
        private Float desireValue;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.Map<String, ?> dimensions;

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
        public java.util.List<Float> getApplicableRange() {
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
            private java.util.List<Float> applicableRange; 
            private String applicableType; 
            private Float desireValue; 
            private java.util.Map<String, ?> dimensions; 
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

            private Builder() {
            } 

            private Builder(QuotaApplicationTemplates model) {
                this.applicableRange = model.applicableRange;
                this.applicableType = model.applicableType;
                this.desireValue = model.desireValue;
                this.dimensions = model.dimensions;
                this.effectiveTime = model.effectiveTime;
                this.envLanguage = model.envLanguage;
                this.expireTime = model.expireTime;
                this.id = model.id;
                this.noticeType = model.noticeType;
                this.period = model.period;
                this.productCode = model.productCode;
                this.quotaActionCode = model.quotaActionCode;
                this.quotaCategory = model.quotaCategory;
                this.quotaDescription = model.quotaDescription;
                this.quotaName = model.quotaName;
            } 

            /**
             * <p>None.</p>
             */
            public Builder applicableRange(java.util.List<Float> applicableRange) {
                this.applicableRange = applicableRange;
                return this;
            }

            /**
             * <p>The type of the adjustable value. Valid values:</p>
             * <ul>
             * <li><p>continuous</p>
             * </li>
             * <li><p>discontinuous</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>continuous</p>
             */
            public Builder applicableType(String applicableType) {
                this.applicableType = applicableType;
                return this;
            }

            /**
             * <p>The requested value of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>802</p>
             */
            public Builder desireValue(Float desireValue) {
                this.desireValue = desireValue;
                return this;
            }

            /**
             * <p>The quota dimensions.</p>
             * <p>Format: {&quot;regionId&quot;:&quot;Region&quot;}.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;regionId&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder dimensions(java.util.Map<String, ?> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The start time of the validity period of the quota. The value is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-28T06:07:00Z</p>
             */
            public Builder effectiveTime(String effectiveTime) {
                this.effectiveTime = effectiveTime;
                return this;
            }

            /**
             * <p>The language of the quota alert notification. Valid values:</p>
             * <ul>
             * <li><p>zh: Chinese</p>
             * </li>
             * <li><p>en: English</p>
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
             * <p>The end time of the validity period of the quota. The value is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-29T06:07:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the quota template.</p>
             * 
             * <strong>example:</strong>
             * <p>1****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether Quota Center sends a notification about the application result. Valid values:</p>
             * <ul>
             * <li><p>0: no</p>
             * </li>
             * <li><p>3: yes</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The ID of the quota.</p>
             * 
             * <strong>example:</strong>
             * <p>q_security-groups</p>
             */
            public Builder quotaActionCode(String quotaActionCode) {
                this.quotaActionCode = quotaActionCode;
                return this;
            }

            /**
             * <p>The type of the quota. Valid values:</p>
             * <ul>
             * <li><p>CommonQuota: general quota</p>
             * </li>
             * <li><p>FlowControl: API rate limit</p>
             * </li>
             * <li><p>WhiteListLabel: privilege</p>
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
             * <p>The maximum number of security groups that can be created by the current account.</p>
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

            public QuotaApplicationTemplates build() {
                return new QuotaApplicationTemplates(this);
            } 

        } 

    }
}
