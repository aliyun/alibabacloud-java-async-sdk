// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageprocess20200320.models;

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
 * {@link GenerateReportRequest} extends {@link RequestModel}
 *
 * <p>GenerateReportRequest</p>
 */
public class GenerateReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReportConfigs")
    private java.util.List<ReportConfigs> reportConfigs;

    private GenerateReportRequest(Builder builder) {
        super(builder);
        this.reportConfigs = builder.reportConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return reportConfigs
     */
    public java.util.List<ReportConfigs> getReportConfigs() {
        return this.reportConfigs;
    }

    public static final class Builder extends Request.Builder<GenerateReportRequest, Builder> {
        private java.util.List<ReportConfigs> reportConfigs; 

        private Builder() {
            super();
        } 

        private Builder(GenerateReportRequest request) {
            super(request);
            this.reportConfigs = request.reportConfigs;
        } 

        /**
         * ReportConfigs.
         */
        public Builder reportConfigs(java.util.List<ReportConfigs> reportConfigs) {
            String reportConfigsShrink = shrink(reportConfigs, "ReportConfigs", "json");
            this.putBodyParameter("ReportConfigs", reportConfigsShrink);
            this.reportConfigs = reportConfigs;
            return this;
        }

        @Override
        public GenerateReportRequest build() {
            return new GenerateReportRequest(this);
        } 

    } 

    /**
     * 
     * {@link GenerateReportRequest} extends {@link TeaModel}
     *
     * <p>GenerateReportRequest</p>
     */
    public static class ReportConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("Theme")
        private String theme;

        private ReportConfigs(Builder builder) {
            this.action = builder.action;
            this.format = builder.format;
            this.templateVersion = builder.templateVersion;
            this.theme = builder.theme;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReportConfigs create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return theme
         */
        public String getTheme() {
            return this.theme;
        }

        public static final class Builder {
            private String action; 
            private String format; 
            private String templateVersion; 
            private String theme; 

            private Builder() {
            } 

            private Builder(ReportConfigs model) {
                this.action = model.action;
                this.format = model.format;
                this.templateVersion = model.templateVersion;
                this.theme = model.theme;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * Theme.
             */
            public Builder theme(String theme) {
                this.theme = theme;
                return this;
            }

            public ReportConfigs build() {
                return new ReportConfigs(this);
            } 

        } 

    }
}
