// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateDetail} extends {@link TeaModel}
 *
 * <p>TemplateDetail</p>
 */
public class TemplateDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AbandonReasons")
    private java.util.List < String > abandonReasons;

    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private SimpleUser creator;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, ? > exif;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Modifier")
    private SimpleUser modifier;

    @com.aliyun.core.annotation.NameInMap("QuestionConfigs")
    private java.util.List < QuestionPlugin > questionConfigs;

    @com.aliyun.core.annotation.NameInMap("SharedMode")
    private String sharedMode;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < String > tags;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("ViewConfigs")
    private ViewConfigs viewConfigs;

    private TemplateDetail(Builder builder) {
        this.abandonReasons = builder.abandonReasons;
        this.classify = builder.classify;
        this.creator = builder.creator;
        this.description = builder.description;
        this.exif = builder.exif;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.modifier = builder.modifier;
        this.questionConfigs = builder.questionConfigs;
        this.sharedMode = builder.sharedMode;
        this.status = builder.status;
        this.tags = builder.tags;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
        this.viewConfigs = builder.viewConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateDetail create() {
        return builder().build();
    }

    /**
     * @return abandonReasons
     */
    public java.util.List < String > getAbandonReasons() {
        return this.abandonReasons;
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return creator
     */
    public SimpleUser getCreator() {
        return this.creator;
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
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return modifier
     */
    public SimpleUser getModifier() {
        return this.modifier;
    }

    /**
     * @return questionConfigs
     */
    public java.util.List < QuestionPlugin > getQuestionConfigs() {
        return this.questionConfigs;
    }

    /**
     * @return sharedMode
     */
    public String getSharedMode() {
        return this.sharedMode;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return viewConfigs
     */
    public ViewConfigs getViewConfigs() {
        return this.viewConfigs;
    }

    public static final class Builder {
        private java.util.List < String > abandonReasons; 
        private String classify; 
        private SimpleUser creator; 
        private String description; 
        private java.util.Map < String, ? > exif; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private SimpleUser modifier; 
        private java.util.List < QuestionPlugin > questionConfigs; 
        private String sharedMode; 
        private String status; 
        private java.util.List < String > tags; 
        private String templateId; 
        private String templateName; 
        private String tenantId; 
        private String type; 
        private ViewConfigs viewConfigs; 

        /**
         * AbandonReasons.
         */
        public Builder abandonReasons(java.util.List < String > abandonReasons) {
            this.abandonReasons = abandonReasons;
            return this;
        }

        /**
         * Classify.
         */
        public Builder classify(String classify) {
            this.classify = classify;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(SimpleUser creator) {
            this.creator = creator;
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
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * Modifier.
         */
        public Builder modifier(SimpleUser modifier) {
            this.modifier = modifier;
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
         * SharedMode.
         */
        public Builder sharedMode(String sharedMode) {
            this.sharedMode = sharedMode;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * ViewConfigs.
         */
        public Builder viewConfigs(ViewConfigs viewConfigs) {
            this.viewConfigs = viewConfigs;
            return this;
        }

        public TemplateDetail build() {
            return new TemplateDetail(this);
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
