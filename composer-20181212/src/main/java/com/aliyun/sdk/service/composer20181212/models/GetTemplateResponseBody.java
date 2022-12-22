// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Definition")
    private String definition;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

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

    private GetTemplateResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.definition = builder.definition;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
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

    public static GetTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return definition
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String definition; 
        private String regionId; 
        private String requestId; 
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
         * The definition of the template.
         */
        public Builder definition(String definition) {
            this.definition = definition;
            return this;
        }

        /**
         * The region where the template resides.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * A description of the template.
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
         * A brief introduction to the template.
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

        public GetTemplateResponseBody build() {
            return new GetTemplateResponseBody(this);
        } 

    } 

}
