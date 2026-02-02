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
 * {@link UpdateReportTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateReportTemplateRequest</p>
 */
public class UpdateReportTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportFileFormats")
    private String reportFileFormats;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportGranularity")
    private String reportGranularity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportLanguage")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String reportLanguage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportScope")
    private java.util.List<ReportScope> reportScope;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportTemplateDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String reportTemplateDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String reportTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportTemplateName")
    @com.aliyun.core.annotation.Validation(maxLength = 100)
    private String reportTemplateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SubscriptionFrequency")
    private String subscriptionFrequency;

    private UpdateReportTemplateRequest(Builder builder) {
        super(builder);
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

    public static UpdateReportTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateReportTemplateRequest, Builder> {
        private String reportFileFormats; 
        private String reportGranularity; 
        private String reportLanguage; 
        private java.util.List<ReportScope> reportScope; 
        private String reportTemplateDescription; 
        private String reportTemplateId; 
        private String reportTemplateName; 
        private String subscriptionFrequency; 

        private Builder() {
            super();
        } 

        private Builder(UpdateReportTemplateRequest request) {
            super(request);
            this.reportFileFormats = request.reportFileFormats;
            this.reportGranularity = request.reportGranularity;
            this.reportLanguage = request.reportLanguage;
            this.reportScope = request.reportScope;
            this.reportTemplateDescription = request.reportTemplateDescription;
            this.reportTemplateId = request.reportTemplateId;
            this.reportTemplateName = request.reportTemplateName;
            this.subscriptionFrequency = request.subscriptionFrequency;
        } 

        /**
         * ReportFileFormats.
         */
        public Builder reportFileFormats(String reportFileFormats) {
            this.putBodyParameter("ReportFileFormats", reportFileFormats);
            this.reportFileFormats = reportFileFormats;
            return this;
        }

        /**
         * ReportGranularity.
         */
        public Builder reportGranularity(String reportGranularity) {
            this.putBodyParameter("ReportGranularity", reportGranularity);
            this.reportGranularity = reportGranularity;
            return this;
        }

        /**
         * ReportLanguage.
         */
        public Builder reportLanguage(String reportLanguage) {
            this.putBodyParameter("ReportLanguage", reportLanguage);
            this.reportLanguage = reportLanguage;
            return this;
        }

        /**
         * ReportScope.
         */
        public Builder reportScope(java.util.List<ReportScope> reportScope) {
            String reportScopeShrink = shrink(reportScope, "ReportScope", "json");
            this.putBodyParameter("ReportScope", reportScopeShrink);
            this.reportScope = reportScope;
            return this;
        }

        /**
         * ReportTemplateDescription.
         */
        public Builder reportTemplateDescription(String reportTemplateDescription) {
            this.putBodyParameter("ReportTemplateDescription", reportTemplateDescription);
            this.reportTemplateDescription = reportTemplateDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>crt-xxx</p>
         */
        public Builder reportTemplateId(String reportTemplateId) {
            this.putBodyParameter("ReportTemplateId", reportTemplateId);
            this.reportTemplateId = reportTemplateId;
            return this;
        }

        /**
         * ReportTemplateName.
         */
        public Builder reportTemplateName(String reportTemplateName) {
            this.putBodyParameter("ReportTemplateName", reportTemplateName);
            this.reportTemplateName = reportTemplateName;
            return this;
        }

        /**
         * SubscriptionFrequency.
         */
        public Builder subscriptionFrequency(String subscriptionFrequency) {
            this.putBodyParameter("SubscriptionFrequency", subscriptionFrequency);
            this.subscriptionFrequency = subscriptionFrequency;
            return this;
        }

        @Override
        public UpdateReportTemplateRequest build() {
            return new UpdateReportTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateReportTemplateRequest} extends {@link TeaModel}
     *
     * <p>UpdateReportTemplateRequest</p>
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
}
