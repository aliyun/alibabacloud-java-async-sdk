// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5210DBB0-E327-4D45-ADBC-0B83C8796E26</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The templates.</p>
         */
        public Builder templates(Templates templates) {
            this.templates = templates;
            return this;
        }

        public QuerySmarttagTemplateListResponseBody build() {
            return new QuerySmarttagTemplateListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmarttagTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagTemplateListResponseBody</p>
     */
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
             * <p>The analysis types that are used in the template. One or more values are returned. Valid values:</p>
             * <ul>
             * <li><strong>ocr</strong>: text recognition</li>
             * <li><strong>asr</strong>: speech recognition</li>
             * <li><strong>classification</strong>: video classification</li>
             * <li><strong>shows</strong>: program recognition</li>
             * <li><strong>face</strong>: facial recognition</li>
             * <li><strong>role</strong>: figure recognition</li>
             * <li><strong>object</strong>: object recognition</li>
             * <li><strong>tvstation</strong>: logo recognition</li>
             * <li><strong>action</strong>: action recognition</li>
             * <li><strong>emotion</strong>: facial expression recognition</li>
             * <li><strong>landmark</strong>: landmark recognition</li>
             * <li><strong>scene</strong>: scene recognition</li>
             * <li><strong>movieip</strong>: movie intellectual property recognition</li>
             * <li><strong>subtitle</strong>: subtitle extraction</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ocr,asr,classification,shows,face,role,object,tvstation,action,emotion,landmark,scene</p>
             */
            public Builder analyseTypes(String analyseTypes) {
                this.analyseTypes = analyseTypes;
                return this;
            }

            /**
             * <p>The IDs of the system facial image libraries that are used in the template. One or more values are returned. Valid values:</p>
             * <ul>
             * <li>celebrity: the facial image library of celebrities</li>
             * <li>politician: the facial image library of politicians</li>
             * <li>sensitive: the facial image library of sensitive figures</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>politician,sensitive,celebrity</p>
             */
            public Builder faceCategoryIds(String faceCategoryIds) {
                this.faceCategoryIds = faceCategoryIds;
                return this;
            }

            /**
             * <p>The configurations of face-related algorithms. The value of this parameter is a JSON string and consists of the thresholds set for face detection and facial recognition. Valid values:</p>
             * <ul>
             * <li><strong>faceDetThreshold</strong>: The default threshold for face detection is 0.999. The threshold takes effect only for the faces that are strange to the system.</li>
             * <li><strong>faceRegThreshold</strong>: The default threshold for facial recognition is 0.9.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;faceDetThreshold&quot;:0.999, &quot;faceRegThreshold&quot;:0.9 }</p>
             */
            public Builder faceCustomParamsConfig(String faceCustomParamsConfig) {
                this.faceCustomParamsConfig = faceCustomParamsConfig;
                return this;
            }

            /**
             * <p>The industry to which the template applies. Default value: <strong>common</strong>. Valid values:</p>
             * <ul>
             * <li><strong>microVideo</strong>: short video industry</li>
             * <li><strong>common</strong>: general industries</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * <p>Indicates whether the template is the default template. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The template is the default template.</li>
             * <li><strong>false</strong>: The template is not the default template.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The configuration of keyword tags. The type field specifies the category of a keyword tag. You can specify one or more values and separate the values with commas (,). Valid values:</p>
             * <ul>
             * <li>name</li>
             * <li>location</li>
             * <li>organization</li>
             * <li>other</li>
             * </ul>
             * <blockquote>
             * <p>Keyword tags of all the categories are returned in one of the following scenarios: The KeywordConfig parameter is not specified or the Keyword field is invalid because it is not a JSON string, or the KeywordConfig parameter does not contain the type field or the type field is invalid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;type&quot;: &quot;name,location,organization,other&quot; }</p>
             */
            public Builder keywordConfig(String keywordConfig) {
                this.keywordConfig = keywordConfig;
                return this;
            }

            /**
             * <p>The fields to be identified as knowledge graph information when tags are returned in Smart tagging V2.0 and Smart tagging V2.0-custom modes. For more information, see <a href="https://help.aliyun.com/document_detail/356383.html">Knowledge graph fields in smart tagging jobs</a>. If this parameter is not specified or the specified value is NULL or invalid because it is not a JSON string, the following fields are returned:</p>
             * <ul>
             * <li><p>movie-related fields:</p>
             * <ul>
             * <li>name: the name of the intellectual property that is featured in the movie</li>
             * <li>alias: the alias of the intellectual property that is featured in the movie</li>
             * <li>chnl: the category of the movie</li>
             * <li>genre: the genre of the movie</li>
             * <li>country: the country or region in which the movie was produced</li>
             * <li>language: the language of the movie</li>
             * <li>releaseYear: the year when the movie was released</li>
             * </ul>
             * </li>
             * <li><p>music-related fields:</p>
             * <ul>
             * <li>songName: the name of the song</li>
             * <li>artistName: the name of the singer</li>
             * <li>artistArea: the region to which the singer belongs, such as China, Japan, Korea, Europe, and America, or others.</li>
             * <li>albumName: the name of the album</li>
             * </ul>
             * </li>
             * <li><p>person-related fields:</p>
             * <ul>
             * <li>name: the name of the person</li>
             * <li>gender: the gender of the person</li>
             * <li>citizenship: the nationality of the person</li>
             * <li>occupation: the occupation of the person</li>
             * <li>classification: the type into which the person is classified</li>
             * <li>nationality: the ethnic group of the person</li>
             * <li>birthPlace: the place where the person was born</li>
             * <li>birthDate: the date when the person was born</li>
             * </ul>
             * </li>
             * <li><p>landmark-related fields:</p>
             * <ul>
             * <li>name: the display name of the landmark</li>
             * <li>nameEn: the English name of the landmark</li>
             * <li>Description: the description of the parameter</li>
             * <li>address: the address of the landmark</li>
             * </ul>
             * </li>
             * <li><p>item-related fields:</p>
             * <ul>
             * <li>brandName: the brand of the item</li>
             * <li>finegrainName: the fine-grained description of the item</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;movie&quot;:&quot;name,alias,chnl,genre&quot;, &quot;music&quot;:&quot;songName,artistName&quot;, &quot;person&quot;:&quot;name,gender&quot; }</p>
             */
            public Builder knowledgeConfig(String knowledgeConfig) {
                this.knowledgeConfig = knowledgeConfig;
                return this;
            }

            /**
             * <p>The type of the tagging. Default value: <strong>auto</strong>. Valid values:</p>
             * <ul>
             * <li><strong>auto</strong>: machine tagging</li>
             * <li><strong>hmi</strong>: tagging by human and machine</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hmi</p>
             */
            public Builder labelType(String labelType) {
                this.labelType = labelType;
                return this;
            }

            /**
             * <p>The version of the smart tagging feature. Default value: 1.0. Valid values:</p>
             * <ul>
             * <li>1.0: Smart tagging V1.0</li>
             * <li>2.0: Smart tagging V2.0 (CPV tagging)</li>
             * <li>2.0-custom: Smart tagging V2.0-custom (CPV tagging by using custom models)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder labelVersion(String labelVersion) {
                this.labelVersion = labelVersion;
                return this;
            }

            /**
             * <p>The IDs of the landmark libraries that are used in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder landmarkGroupIds(String landmarkGroupIds) {
                this.landmarkGroupIds = landmarkGroupIds;
                return this;
            }

            /**
             * <p>The IDs of the object libraries that are used in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>general,item,weapon,animal</p>
             */
            public Builder objectGroupIds(String objectGroupIds) {
                this.objectGroupIds = objectGroupIds;
                return this;
            }

            /**
             * <p>The scenario in which the template is used. Valid values:</p>
             * <ul>
             * <li><strong>search</strong>: search scenarios</li>
             * <li><strong>recommend</strong>: recommendation scenarios</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>search</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>05de22f255284c7a8d2aab535dde****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>example-****</p>
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
    /**
     * 
     * {@link QuerySmarttagTemplateListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmarttagTemplateListResponseBody</p>
     */
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
