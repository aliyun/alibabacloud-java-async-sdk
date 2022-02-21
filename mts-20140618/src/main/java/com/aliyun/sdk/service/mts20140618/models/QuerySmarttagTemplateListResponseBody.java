// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmarttagTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmarttagTemplateListResponseBody</p>
 */
public class QuerySmarttagTemplateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Templates")
    private Templates templates;

    private QuerySmarttagTemplateListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmarttagTemplateListResponseBody create() {
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
    public Templates getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private String requestId; 
        private Templates templates; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Templates.
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        public QuerySmarttagTemplateListResponseBody build() {
            return new QuerySmarttagTemplateListResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
        @NameInMap("AnalyseTypes")
        private String analyseTypes;

        @NameInMap("FaceCategoryIds")
        private String faceCategoryIds;

        @NameInMap("FaceCustomParamsConfig")
        private String faceCustomParamsConfig;

        @NameInMap("Industry")
        private String industry;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("KeywordConfig")
        private String keywordConfig;

        @NameInMap("KnowledgeConfig")
        private String knowledgeConfig;

        @NameInMap("LabelType")
        private String labelType;

        @NameInMap("LabelVersion")
        private String labelVersion;

        @NameInMap("Scene")
        private String scene;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        private Template(Builder builder) {
            this.analyseTypes = builder.analyseTypes;
            this.faceCategoryIds = builder.faceCategoryIds;
            this.faceCustomParamsConfig = builder.faceCustomParamsConfig;
            this.industry = builder.industry;
            this.isDefault = builder.isDefault;
            this.keywordConfig = builder.keywordConfig;
            this.knowledgeConfig = builder.knowledgeConfig;
            this.labelType = builder.labelType;
            this.labelVersion = builder.labelVersion;
            this.scene = builder.scene;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return analyseTypes
         */
        public String getAnalyseTypes() {
            return this.analyseTypes;
        }

        /**
         * @return faceCategoryIds
         */
        public String getFaceCategoryIds() {
            return this.faceCategoryIds;
        }

        /**
         * @return faceCustomParamsConfig
         */
        public String getFaceCustomParamsConfig() {
            return this.faceCustomParamsConfig;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return keywordConfig
         */
        public String getKeywordConfig() {
            return this.keywordConfig;
        }

        /**
         * @return knowledgeConfig
         */
        public String getKnowledgeConfig() {
            return this.knowledgeConfig;
        }

        /**
         * @return labelType
         */
        public String getLabelType() {
            return this.labelType;
        }

        /**
         * @return labelVersion
         */
        public String getLabelVersion() {
            return this.labelVersion;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
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

        public static final class Builder {
            private String analyseTypes; 
            private String faceCategoryIds; 
            private String faceCustomParamsConfig; 
            private String industry; 
            private Boolean isDefault; 
            private String keywordConfig; 
            private String knowledgeConfig; 
            private String labelType; 
            private String labelVersion; 
            private String scene; 
            private String templateId; 
            private String templateName; 

            /**
             * AnalyseTypes.
             */
            public Builder analyseTypes(String analyseTypes) {
                this.analyseTypes = analyseTypes;
                return this;
            }

            /**
             * FaceCategoryIds.
             */
            public Builder faceCategoryIds(String faceCategoryIds) {
                this.faceCategoryIds = faceCategoryIds;
                return this;
            }

            /**
             * FaceCustomParamsConfig.
             */
            public Builder faceCustomParamsConfig(String faceCustomParamsConfig) {
                this.faceCustomParamsConfig = faceCustomParamsConfig;
                return this;
            }

            /**
             * Industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * KeywordConfig.
             */
            public Builder keywordConfig(String keywordConfig) {
                this.keywordConfig = keywordConfig;
                return this;
            }

            /**
             * KnowledgeConfig.
             */
            public Builder knowledgeConfig(String knowledgeConfig) {
                this.knowledgeConfig = knowledgeConfig;
                return this;
            }

            /**
             * LabelType.
             */
            public Builder labelType(String labelType) {
                this.labelType = labelType;
                return this;
            }

            /**
             * LabelVersion.
             */
            public Builder labelVersion(String labelVersion) {
                this.labelVersion = labelVersion;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
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

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    public static class Templates extends TeaModel {
        @NameInMap("Template")
        private java.util.List < Template> template;

        private Templates(Builder builder) {
            this.template = builder.template;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public java.util.List < Template> getTemplate() {
            return this.template;
        }

        public static final class Builder {
            private java.util.List < Template> template; 

            /**
             * Template.
             */
            public Builder template(java.util.List < Template> template) {
                this.template = template;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
