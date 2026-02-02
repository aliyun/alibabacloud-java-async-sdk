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
 * {@link GetReportTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetReportTemplateResponseBody</p>
 */
public class GetReportTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportTemplate")
    private ReportTemplate reportTemplate;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetReportTemplateResponseBody(Builder builder) {
        this.reportTemplate = builder.reportTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetReportTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportTemplate
     */
    public ReportTemplate getReportTemplate() {
        return this.reportTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ReportTemplate reportTemplate; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetReportTemplateResponseBody model) {
            this.reportTemplate = model.reportTemplate;
            this.requestId = model.requestId;
        } 

        /**
         * ReportTemplate.
         */
        public Builder reportTemplate(ReportTemplate reportTemplate) {
            this.reportTemplate = reportTemplate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetReportTemplateResponseBody build() {
            return new GetReportTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetReportTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportTemplateResponseBody</p>
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
     * {@link GetReportTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>GetReportTemplateResponseBody</p>
     */
    public static class ReportTemplate extends TeaModel {
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

        private ReportTemplate(Builder builder) {
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

        public static ReportTemplate create() {
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

            private Builder(ReportTemplate model) {
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

            public ReportTemplate build() {
                return new ReportTemplate(this);
            } 

        } 

    }
}
