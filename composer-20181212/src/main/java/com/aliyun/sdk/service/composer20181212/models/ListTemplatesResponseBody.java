// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplatesResponseBody</p>
 */
public class ListTemplatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Templates")
    private java.util.List < Templates> templates;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
        return this.templates;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Templates> templates; 
        private Integer totalCount; 

        /**
         * The unique identifier of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * A list of templates.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * The total number of templates.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTemplatesResponseBody build() {
            return new ListTemplatesResponseBody(this);
        } 

    } 

    public static class Templates extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("TemplateConnector")
        private String templateConnector;

        @NameInMap("TemplateCreator")
        private String templateCreator;

        @NameInMap("TemplateDescription")
        private String templateDescription;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateLocale")
        private String templateLocale;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateOverview")
        private String templateOverview;

        @NameInMap("TemplateSummary")
        private String templateSummary;

        @NameInMap("TemplateSummaryEn")
        private String templateSummaryEn;

        @NameInMap("TemplateTag")
        private String templateTag;

        @NameInMap("TemplateVersion")
        private Integer templateVersion;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Templates(Builder builder) {
            this.createTime = builder.createTime;
            this.templateConnector = builder.templateConnector;
            this.templateCreator = builder.templateCreator;
            this.templateDescription = builder.templateDescription;
            this.templateId = builder.templateId;
            this.templateLocale = builder.templateLocale;
            this.templateName = builder.templateName;
            this.templateOverview = builder.templateOverview;
            this.templateSummary = builder.templateSummary;
            this.templateSummaryEn = builder.templateSummaryEn;
            this.templateTag = builder.templateTag;
            this.templateVersion = builder.templateVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return templateConnector
         */
        public String getTemplateConnector() {
            return this.templateConnector;
        }

        /**
         * @return templateCreator
         */
        public String getTemplateCreator() {
            return this.templateCreator;
        }

        /**
         * @return templateDescription
         */
        public String getTemplateDescription() {
            return this.templateDescription;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateLocale
         */
        public String getTemplateLocale() {
            return this.templateLocale;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateOverview
         */
        public String getTemplateOverview() {
            return this.templateOverview;
        }

        /**
         * @return templateSummary
         */
        public String getTemplateSummary() {
            return this.templateSummary;
        }

        /**
         * @return templateSummaryEn
         */
        public String getTemplateSummaryEn() {
            return this.templateSummaryEn;
        }

        /**
         * @return templateTag
         */
        public String getTemplateTag() {
            return this.templateTag;
        }

        /**
         * @return templateVersion
         */
        public Integer getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String templateConnector; 
            private String templateCreator; 
            private String templateDescription; 
            private String templateId; 
            private String templateLocale; 
            private String templateName; 
            private String templateOverview; 
            private String templateSummary; 
            private String templateSummaryEn; 
            private String templateTag; 
            private Integer templateVersion; 
            private String updateTime; 

            /**
             * The time when the template was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * A list of connectors that are used in the template. The connectors are separated by commas.
             */
            public Builder templateConnector(String templateConnector) {
                this.templateConnector = templateConnector;
                return this;
            }

            /**
             * The publisher of the template.
             */
            public Builder templateCreator(String templateCreator) {
                this.templateCreator = templateCreator;
                return this;
            }

            /**
             * A brief introduction to the template.
             */
            public Builder templateDescription(String templateDescription) {
                this.templateDescription = templateDescription;
                return this;
            }

            /**
             * The ID of the template.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The language that is used in the template. Chinese and English are supported.
             */
            public Builder templateLocale(String templateLocale) {
                this.templateLocale = templateLocale;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * An overview of the template, which is a JSON string.
             */
            public Builder templateOverview(String templateOverview) {
                this.templateOverview = templateOverview;
                return this;
            }

            /**
             * A description of the template.
             */
            public Builder templateSummary(String templateSummary) {
                this.templateSummary = templateSummary;
                return this;
            }

            /**
             * A brief introduction to the template.
             */
            public Builder templateSummaryEn(String templateSummaryEn) {
                this.templateSummaryEn = templateSummaryEn;
                return this;
            }

            /**
             * The tag of the template.
             */
            public Builder templateTag(String templateTag) {
                this.templateTag = templateTag;
                return this;
            }

            /**
             * The version of the template, which is a number that increments from 0.
             */
            public Builder templateVersion(Integer templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The time when the template was last updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
