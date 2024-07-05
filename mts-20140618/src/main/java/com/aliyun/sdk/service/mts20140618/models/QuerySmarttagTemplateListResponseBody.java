// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmarttagTemplateListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmarttagTemplateListResponseBody</p>
 */
public class QuerySmarttagTemplateListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The templates.
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
        @com.aliyun.core.annotation.NameInMap("AnalyseTypes")
        private String analyseTypes;

        @com.aliyun.core.annotation.NameInMap("FaceCategoryIds")
        private String faceCategoryIds;

        @com.aliyun.core.annotation.NameInMap("FaceCustomParamsConfig")
        private String faceCustomParamsConfig;

        @com.aliyun.core.annotation.NameInMap("Industry")
        private String industry;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("KeywordConfig")
        private String keywordConfig;

        @com.aliyun.core.annotation.NameInMap("KnowledgeConfig")
        private String knowledgeConfig;

        @com.aliyun.core.annotation.NameInMap("LabelType")
        private String labelType;

        @com.aliyun.core.annotation.NameInMap("LabelVersion")
        private String labelVersion;

        @com.aliyun.core.annotation.NameInMap("LandmarkGroupIds")
        private String landmarkGroupIds;

        @com.aliyun.core.annotation.NameInMap("ObjectGroupIds")
        private String objectGroupIds;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
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
            this.landmarkGroupIds = builder.landmarkGroupIds;
            this.objectGroupIds = builder.objectGroupIds;
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
         * @return landmarkGroupIds
         */
        public String getLandmarkGroupIds() {
            return this.landmarkGroupIds;
        }

        /**
         * @return objectGroupIds
         */
        public String getObjectGroupIds() {
            return this.objectGroupIds;
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
            private String landmarkGroupIds; 
            private String objectGroupIds; 
            private String scene; 
            private String templateId; 
            private String templateName; 

            /**
             * The analysis types that are used in the template. One or more values are returned. Valid values:
             * <p>
             * 
             * *   **ocr**: text recognition
             * *   **asr**: speech recognition
             * *   **classification**: video classification
             * *   **shows**: program recognition
             * *   **face**: facial recognition
             * *   **role**: figure recognition
             * *   **object**: object recognition
             * *   **tvstation**: logo recognition
             * *   **action**: action recognition
             * *   **emotion**: facial expression recognition
             * *   **landmark**: landmark recognition
             * *   **scene**: scene recognition
             * *   **movieip**: movie intellectual property recognition
             * *   **subtitle**: subtitle extraction
             */
            public Builder analyseTypes(String analyseTypes) {
                this.analyseTypes = analyseTypes;
                return this;
            }

            /**
             * The IDs of the system facial image libraries that are used in the template. One or more values are returned. Valid values:
             * <p>
             * 
             * *   celebrity: the facial image library of celebrities
             * *   politician: the facial image library of politicians
             * *   sensitive: the facial image library of sensitive figures
             */
            public Builder faceCategoryIds(String faceCategoryIds) {
                this.faceCategoryIds = faceCategoryIds;
                return this;
            }

            /**
             * The configurations of face-related algorithms. The value of this parameter is a JSON string and consists of the thresholds set for face detection and facial recognition. Valid values:
             * <p>
             * 
             * *   **faceDetThreshold**: The default threshold for face detection is 0.999. The threshold takes effect only for the faces that are strange to the system.
             * *   **faceRegThreshold**: The default threshold for facial recognition is 0.9.
             */
            public Builder faceCustomParamsConfig(String faceCustomParamsConfig) {
                this.faceCustomParamsConfig = faceCustomParamsConfig;
                return this;
            }

            /**
             * The industry to which the template applies. Default value: **common**. Valid values:
             * <p>
             * 
             * *   **microVideo**: short video industry
             * *   **common**: general industries
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * Indicates whether the template is the default template. Valid values:
             * <p>
             * 
             * *   **true**: The template is the default template.
             * *   **false**: The template is not the default template.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The configuration of keyword tags. The type field specifies the category of a keyword tag. You can specify one or more values and separate the values with commas (,). Valid values:
             * <p>
             * 
             * *   name
             * *   location
             * *   organization
             * *   other
             * 
             * > Keyword tags of all the categories are returned in one of the following scenarios: The KeywordConfig parameter is not specified or the Keyword field is invalid because it is not a JSON string, or the KeywordConfig parameter does not contain the type field or the type field is invalid.
             */
            public Builder keywordConfig(String keywordConfig) {
                this.keywordConfig = keywordConfig;
                return this;
            }

            /**
             * The fields to be identified as knowledge graph information when tags are returned in Smart tagging V2.0 and Smart tagging V2.0-custom modes. For more information, see [Knowledge graph fields in smart tagging jobs](~~356383~~). If this parameter is not specified or the specified value is NULL or invalid because it is not a JSON string, the following fields are returned:
             * <p>
             * 
             * *   movie-related fields:
             * 
             *     *   name: the name of the intellectual property that is featured in the movie
             *     *   alias: the alias of the intellectual property that is featured in the movie
             *     *   chnl: the category of the movie
             *     *   genre: the genre of the movie
             *     *   country: the country or region in which the movie was produced
             *     *   language: the language of the movie
             *     *   releaseYear: the year when the movie was released
             * 
             * *   music-related fields:
             * 
             *     *   songName: the name of the song
             *     *   artistName: the name of the singer
             *     *   artistArea: the region to which the singer belongs, such as China, Japan, Korea, Europe, and America, or others.
             *     *   albumName: the name of the album
             * 
             * *   person-related fields:
             * 
             *     *   name: the name of the person
             *     *   gender: the gender of the person
             *     *   citizenship: the nationality of the person
             *     *   occupation: the occupation of the person
             *     *   classification: the type into which the person is classified
             *     *   nationality: the ethnic group of the person
             *     *   birthPlace: the place where the person was born
             *     *   birthDate: the date when the person was born
             * 
             * *   landmark-related fields:
             * 
             *     *   name: the display name of the landmark
             *     *   nameEn: the English name of the landmark
             *     *   Description: the description of the parameter
             *     *   address: the address of the landmark
             * 
             * *   item-related fields:
             * 
             *     *   brandName: the brand of the item
             *     *   finegrainName: the fine-grained description of the item
             */
            public Builder knowledgeConfig(String knowledgeConfig) {
                this.knowledgeConfig = knowledgeConfig;
                return this;
            }

            /**
             * The type of the tagging. Default value: **auto**. Valid values:
             * <p>
             * 
             * *   **auto**: machine tagging
             * *   **hmi**: tagging by human and machine
             */
            public Builder labelType(String labelType) {
                this.labelType = labelType;
                return this;
            }

            /**
             * The version of the smart tagging feature. Default value: 1.0. Valid values:
             * <p>
             * 
             * *   1.0: Smart tagging V1.0
             * *   2.0: Smart tagging V2.0 (CPV tagging)
             * *   2.0-custom: Smart tagging V2.0-custom (CPV tagging by using custom models)
             */
            public Builder labelVersion(String labelVersion) {
                this.labelVersion = labelVersion;
                return this;
            }

            /**
             * The IDs of the landmark libraries that are used in the template.
             */
            public Builder landmarkGroupIds(String landmarkGroupIds) {
                this.landmarkGroupIds = landmarkGroupIds;
                return this;
            }

            /**
             * The IDs of the object libraries that are used in the template.
             */
            public Builder objectGroupIds(String objectGroupIds) {
                this.objectGroupIds = objectGroupIds;
                return this;
            }

            /**
             * The scenario in which the template is used. Valid values:
             * <p>
             * 
             * *   **search**: search scenarios
             * *   **recommend**: recommendation scenarios
             */
            public Builder scene(String scene) {
                this.scene = scene;
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
             * The name of the template.
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
        @com.aliyun.core.annotation.NameInMap("Template")
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
