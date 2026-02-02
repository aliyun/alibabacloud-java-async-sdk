// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListReportTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListReportTemplatesResponseBody</p>
 */
public class ListReportTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("ReportTemplateList")
    private java.util.List<ReportTemplateList> reportTemplateList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListReportTemplatesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.reportTemplateList = builder.reportTemplateList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListReportTemplatesResponseBody create() {
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
     * @return reportTemplateList
     */
    public java.util.List<ReportTemplateList> getReportTemplateList() {
        return this.reportTemplateList;
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
        private java.util.List<ReportTemplateList> reportTemplateList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListReportTemplatesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.reportTemplateList = model.reportTemplateList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

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
         * ReportTemplateList.
         */
        public Builder reportTemplateList(java.util.List<ReportTemplateList> reportTemplateList) {
            this.reportTemplateList = reportTemplateList;
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

        public ListReportTemplatesResponseBody build() {
            return new ListReportTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListReportTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListReportTemplatesResponseBody</p>
     */
    public static class ReportScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ReportScope(Builder builder) {
            this.key = builder.key;
            this.matchType = builder.matchType;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportScope create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String matchType; 
            private String value; 

            private Builder() {
            } 

            private Builder(ReportScope model) {
                this.key = model.key;
                this.matchType = model.matchType;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ReportScope build() {
                return new ReportScope(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListReportTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListReportTemplatesResponseBody</p>
     */
    public static class ReportTemplateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ReportFileFormats")
        private String reportFileFormats;

        @com.aliyun.core.annotation.NameInMap("ReportGranularity")
        private String reportGranularity;

        @com.aliyun.core.annotation.NameInMap("ReportLanguage")
        private String reportLanguage;

        @com.aliyun.core.annotation.NameInMap("ReportScope")
        private java.util.List<ReportScope> reportScope;

        @com.aliyun.core.annotation.NameInMap("ReportTemplateDescription")
        private String reportTemplateDescription;

        @com.aliyun.core.annotation.NameInMap("ReportTemplateId")
        private String reportTemplateId;

        @com.aliyun.core.annotation.NameInMap("ReportTemplateName")
        private String reportTemplateName;

        @com.aliyun.core.annotation.NameInMap("SubscriptionFrequency")
        private String subscriptionFrequency;

        private ReportTemplateList(Builder builder) {
            this.reportFileFormats = builder.reportFileFormats;
            this.reportGranularity = builder.reportGranularity;
            this.reportLanguage = builder.reportLanguage;
            this.reportScope = builder.reportScope;
            this.reportTemplateDescription = builder.reportTemplateDescription;
            this.reportTemplateId = builder.reportTemplateId;
            this.reportTemplateName = builder.reportTemplateName;
            this.subscriptionFrequency = builder.subscriptionFrequency;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportTemplateList create() {
            return builder().build();
        }

        /**
         * @return reportFileFormats
         */
        public String getReportFileFormats() {
            return this.reportFileFormats;
        }

        /**
         * @return reportGranularity
         */
        public String getReportGranularity() {
            return this.reportGranularity;
        }

        /**
         * @return reportLanguage
         */
        public String getReportLanguage() {
            return this.reportLanguage;
        }

        /**
         * @return reportScope
         */
        public java.util.List<ReportScope> getReportScope() {
            return this.reportScope;
        }

        /**
         * @return reportTemplateDescription
         */
        public String getReportTemplateDescription() {
            return this.reportTemplateDescription;
        }

        /**
         * @return reportTemplateId
         */
        public String getReportTemplateId() {
            return this.reportTemplateId;
        }

        /**
         * @return reportTemplateName
         */
        public String getReportTemplateName() {
            return this.reportTemplateName;
        }

        /**
         * @return subscriptionFrequency
         */
        public String getSubscriptionFrequency() {
            return this.subscriptionFrequency;
        }

        public static final class Builder {
            private String reportFileFormats; 
            private String reportGranularity; 
            private String reportLanguage; 
            private java.util.List<ReportScope> reportScope; 
            private String reportTemplateDescription; 
            private String reportTemplateId; 
            private String reportTemplateName; 
            private String subscriptionFrequency; 

            private Builder() {
            } 

            private Builder(ReportTemplateList model) {
                this.reportFileFormats = model.reportFileFormats;
                this.reportGranularity = model.reportGranularity;
                this.reportLanguage = model.reportLanguage;
                this.reportScope = model.reportScope;
                this.reportTemplateDescription = model.reportTemplateDescription;
                this.reportTemplateId = model.reportTemplateId;
                this.reportTemplateName = model.reportTemplateName;
                this.subscriptionFrequency = model.subscriptionFrequency;
            } 

            /**
             * ReportFileFormats.
             */
            public Builder reportFileFormats(String reportFileFormats) {
                this.reportFileFormats = reportFileFormats;
                return this;
            }

            /**
             * ReportGranularity.
             */
            public Builder reportGranularity(String reportGranularity) {
                this.reportGranularity = reportGranularity;
                return this;
            }

            /**
             * ReportLanguage.
             */
            public Builder reportLanguage(String reportLanguage) {
                this.reportLanguage = reportLanguage;
                return this;
            }

            /**
             * ReportScope.
             */
            public Builder reportScope(java.util.List<ReportScope> reportScope) {
                this.reportScope = reportScope;
                return this;
            }

            /**
             * ReportTemplateDescription.
             */
            public Builder reportTemplateDescription(String reportTemplateDescription) {
                this.reportTemplateDescription = reportTemplateDescription;
                return this;
            }

            /**
             * ReportTemplateId.
             */
            public Builder reportTemplateId(String reportTemplateId) {
                this.reportTemplateId = reportTemplateId;
                return this;
            }

            /**
             * ReportTemplateName.
             */
            public Builder reportTemplateName(String reportTemplateName) {
                this.reportTemplateName = reportTemplateName;
                return this;
            }

            /**
             * SubscriptionFrequency.
             */
            public Builder subscriptionFrequency(String subscriptionFrequency) {
                this.subscriptionFrequency = subscriptionFrequency;
                return this;
            }

            public ReportTemplateList build() {
                return new ReportTemplateList(this);
            } 

        } 

    }
}
