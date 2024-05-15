// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateDTO} extends {@link TeaModel}
 *
 * <p>TemplateDTO</p>
 */
public class TemplateDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, ? > exif;

    @com.aliyun.core.annotation.NameInMap("QuestionConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < QuestionPlugin > questionConfigs;

    @com.aliyun.core.annotation.NameInMap("RobotConfigs")
    private java.util.List < java.util.Map<String, ?>> robotConfigs;

    @com.aliyun.core.annotation.NameInMap("SharedMode")
    private String sharedMode;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < String > tags;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("ViewConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private ViewConfigs viewConfigs;

    private TemplateDTO(Builder builder) {
        this.classify = builder.classify;
        this.description = builder.description;
        this.exif = builder.exif;
        this.questionConfigs = builder.questionConfigs;
        this.robotConfigs = builder.robotConfigs;
        this.sharedMode = builder.sharedMode;
        this.tags = builder.tags;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.viewConfigs = builder.viewConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateDTO create() {
        return builder().build();
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return exif
     */
    public java.util.Map < String, ? > getExif() {
        return this.exif;
    }

    /**
     * @return questionConfigs
     */
    public java.util.List < QuestionPlugin > getQuestionConfigs() {
        return this.questionConfigs;
    }

    /**
     * @return robotConfigs
     */
    public java.util.List < java.util.Map<String, ?>> getRobotConfigs() {
        return this.robotConfigs;
    }

    /**
     * @return sharedMode
     */
    public String getSharedMode() {
        return this.sharedMode;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return viewConfigs
     */
    public ViewConfigs getViewConfigs() {
        return this.viewConfigs;
    }

    public static final class Builder {
        private String classify; 
        private String description; 
        private java.util.Map < String, ? > exif; 
        private java.util.List < QuestionPlugin > questionConfigs; 
        private java.util.List < java.util.Map<String, ?>> robotConfigs; 
        private String sharedMode; 
        private java.util.List < String > tags; 
        private String templateId; 
        private String templateName; 
        private ViewConfigs viewConfigs; 

        /**
         * Classify.
         */
        public Builder classify(String classify) {
            this.classify = classify;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Exif.
         */
        public Builder exif(java.util.Map < String, ? > exif) {
            this.exif = exif;
            return this;
        }

        /**
         * QuestionConfigs.
         */
        public Builder questionConfigs(java.util.List < QuestionPlugin > questionConfigs) {
            this.questionConfigs = questionConfigs;
            return this;
        }

        /**
         * RobotConfigs.
         */
        public Builder robotConfigs(java.util.List < java.util.Map<String, ?>> robotConfigs) {
            this.robotConfigs = robotConfigs;
            return this;
        }

        /**
         * SharedMode.
         */
        public Builder sharedMode(String sharedMode) {
            this.sharedMode = sharedMode;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * ViewConfigs.
         */
        public Builder viewConfigs(ViewConfigs viewConfigs) {
            this.viewConfigs = viewConfigs;
            return this;
        }

        public TemplateDTO build() {
            return new TemplateDTO(this);
        } 

    } 

    public static class ViewConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ViewPlugins")
        private java.util.List < ViewPlugin > viewPlugins;

        private ViewConfigs(Builder builder) {
            this.viewPlugins = builder.viewPlugins;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ViewConfigs create() {
            return builder().build();
        }

        /**
         * @return viewPlugins
         */
        public java.util.List < ViewPlugin > getViewPlugins() {
            return this.viewPlugins;
        }

        public static final class Builder {
            private java.util.List < ViewPlugin > viewPlugins; 

            /**
             * ViewPlugins.
             */
            public Builder viewPlugins(java.util.List < ViewPlugin > viewPlugins) {
                this.viewPlugins = viewPlugins;
                return this;
            }

            public ViewConfigs build() {
                return new ViewConfigs(this);
            } 

        } 

    }
}
