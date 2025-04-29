// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link QueryTagInfoBySelectionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTagInfoBySelectionResponseBody</p>
 */
public class QueryTagInfoBySelectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTagInfoBySelectionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTagInfoBySelectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryTagInfoBySelectionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. <strong>OK</strong> indicates that the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1C3B8084-3A7D-570B-BC84-BF945A9CF65E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryTagInfoBySelectionResponseBody build() {
            return new QueryTagInfoBySelectionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTagInfoBySelectionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagInfoBySelectionResponseBody</p>
     */
    public static class ValueDict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        private ValueDict(Builder builder) {
            this.code = builder.code;
            this.desc = builder.desc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValueDict create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        public static final class Builder {
            private String code; 
            private String desc; 

            private Builder() {
            } 

            private Builder(ValueDict model) {
                this.code = model.code;
                this.desc = model.desc;
            } 

            /**
             * <p>The English name.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliyun</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The Chinese name.</p>
             * 
             * <strong>example:</strong>
             * <p>阿里云</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            public ValueDict build() {
                return new ValueDict(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTagInfoBySelectionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagInfoBySelectionResponseBody</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Hint")
        private String hint;

        @com.aliyun.core.annotation.NameInMap("Must")
        private Boolean must;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ValueDict")
        private java.util.List<ValueDict> valueDict;

        private ParamList(Builder builder) {
            this.code = builder.code;
            this.hint = builder.hint;
            this.must = builder.must;
            this.name = builder.name;
            this.type = builder.type;
            this.valueDict = builder.valueDict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return hint
         */
        public String getHint() {
            return this.hint;
        }

        /**
         * @return must
         */
        public Boolean getMust() {
            return this.must;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return valueDict
         */
        public java.util.List<ValueDict> getValueDict() {
            return this.valueDict;
        }

        public static final class Builder {
            private String code; 
            private String hint; 
            private Boolean must; 
            private String name; 
            private String type; 
            private java.util.List<ValueDict> valueDict; 

            private Builder() {
            } 

            private Builder(ParamList model) {
                this.code = model.code;
                this.hint = model.hint;
                this.must = model.must;
                this.name = model.name;
                this.type = model.type;
                this.valueDict = model.valueDict;
            } 

            /**
             * <p>The English name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>preame</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The input hint.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder hint(String hint) {
                this.hint = hint;
                return this;
            }

            /**
             * <p>Indicates whether the parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder must(Boolean must) {
                this.must = must;
                return this;
            }

            /**
             * <p>The Chinese name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>none</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type. The code that corresponds to EnumUIWidgetTypes.</p>
             * 
             * <strong>example:</strong>
             * <p>aqzx</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The definitions of the enumerated values such as Code or Desc.</p>
             */
            public Builder valueDict(java.util.List<ValueDict> valueDict) {
                this.valueDict = valueDict;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTagInfoBySelectionResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTagInfoBySelectionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthCodeList")
        private java.util.List<String> authCodeList;

        @com.aliyun.core.annotation.NameInMap("ComplexityType")
        private String complexityType;

        @com.aliyun.core.annotation.NameInMap("DemoAddress")
        private String demoAddress;

        @com.aliyun.core.annotation.NameInMap("DocAddress")
        private String docAddress;

        @com.aliyun.core.annotation.NameInMap("EnumDefinitionAddress")
        private String enumDefinitionAddress;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("IndustryId")
        private Long industryId;

        @com.aliyun.core.annotation.NameInMap("IndustryName")
        private String industryName;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        @com.aliyun.core.annotation.NameInMap("RichTextDescription")
        private String richTextDescription;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private Long tagId;

        @com.aliyun.core.annotation.NameInMap("TagName")
        private String tagName;

        private Data(Builder builder) {
            this.authCodeList = builder.authCodeList;
            this.complexityType = builder.complexityType;
            this.demoAddress = builder.demoAddress;
            this.docAddress = builder.docAddress;
            this.enumDefinitionAddress = builder.enumDefinitionAddress;
            this.flowName = builder.flowName;
            this.industryId = builder.industryId;
            this.industryName = builder.industryName;
            this.paramList = builder.paramList;
            this.richTextDescription = builder.richTextDescription;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.tagId = builder.tagId;
            this.tagName = builder.tagName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return authCodeList
         */
        public java.util.List<String> getAuthCodeList() {
            return this.authCodeList;
        }

        /**
         * @return complexityType
         */
        public String getComplexityType() {
            return this.complexityType;
        }

        /**
         * @return demoAddress
         */
        public String getDemoAddress() {
            return this.demoAddress;
        }

        /**
         * @return docAddress
         */
        public String getDocAddress() {
            return this.docAddress;
        }

        /**
         * @return enumDefinitionAddress
         */
        public String getEnumDefinitionAddress() {
            return this.enumDefinitionAddress;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return industryId
         */
        public Long getIndustryId() {
            return this.industryId;
        }

        /**
         * @return industryName
         */
        public String getIndustryName() {
            return this.industryName;
        }

        /**
         * @return paramList
         */
        public java.util.List<ParamList> getParamList() {
            return this.paramList;
        }

        /**
         * @return richTextDescription
         */
        public String getRichTextDescription() {
            return this.richTextDescription;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return tagId
         */
        public Long getTagId() {
            return this.tagId;
        }

        /**
         * @return tagName
         */
        public String getTagName() {
            return this.tagName;
        }

        public static final class Builder {
            private java.util.List<String> authCodeList; 
            private String complexityType; 
            private String demoAddress; 
            private String docAddress; 
            private String enumDefinitionAddress; 
            private String flowName; 
            private Long industryId; 
            private String industryName; 
            private java.util.List<ParamList> paramList; 
            private String richTextDescription; 
            private Long sceneId; 
            private String sceneName; 
            private Long tagId; 
            private String tagName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.authCodeList = model.authCodeList;
                this.complexityType = model.complexityType;
                this.demoAddress = model.demoAddress;
                this.docAddress = model.docAddress;
                this.enumDefinitionAddress = model.enumDefinitionAddress;
                this.flowName = model.flowName;
                this.industryId = model.industryId;
                this.industryName = model.industryName;
                this.paramList = model.paramList;
                this.richTextDescription = model.richTextDescription;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.tagId = model.tagId;
                this.tagName = model.tagName;
            } 

            /**
             * <p>The list of available authorization codes.</p>
             */
            public Builder authCodeList(java.util.List<String> authCodeList) {
                this.authCodeList = authCodeList;
                return this;
            }

            /**
             * ComplexityType.
             */
            public Builder complexityType(String complexityType) {
                this.complexityType = complexityType;
                return this;
            }

            /**
             * <p>The URL for the API demo.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz">https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz</a></p>
             */
            public Builder demoAddress(String demoAddress) {
                this.demoAddress = demoAddress;
                return this;
            }

            /**
             * <p>The URL for the API documentation.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz">https://help.aliyun.com/document_detail/388997.html?spm=a2c4g.2573870.0.0.3aa921cbOrtqJz</a></p>
             */
            public Builder docAddress(String docAddress) {
                this.docAddress = docAddress;
                return this;
            }

            /**
             * <p>The URL for the definitions of the enumerated values.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder enumDefinitionAddress(String enumDefinitionAddress) {
                this.enumDefinitionAddress = enumDefinitionAddress;
                return this;
            }

            /**
             * <p>The flow name.</p>
             * 
             * <strong>example:</strong>
             * <p>process name</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>The industry ID.</p>
             * 
             * <strong>example:</strong>
             * <p>83</p>
             */
            public Builder industryId(Long industryId) {
                this.industryId = industryId;
                return this;
            }

            /**
             * <p>The industry name.</p>
             * 
             * <strong>example:</strong>
             * <p>logistics</p>
             */
            public Builder industryName(String industryName) {
                this.industryName = industryName;
                return this;
            }

            /**
             * <p>The list of tag parameters.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            /**
             * RichTextDescription.
             */
            public Builder richTextDescription(String richTextDescription) {
                this.richTextDescription = richTextDescription;
                return this;
            }

            /**
             * <p>The scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>41</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scene name.</p>
             * 
             * <strong>example:</strong>
             * <p>General scenario</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The tag ID.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder tagId(Long tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * <p>The tag name.</p>
             * 
             * <strong>example:</strong>
             * <p>Number ownership</p>
             */
            public Builder tagName(String tagName) {
                this.tagName = tagName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
