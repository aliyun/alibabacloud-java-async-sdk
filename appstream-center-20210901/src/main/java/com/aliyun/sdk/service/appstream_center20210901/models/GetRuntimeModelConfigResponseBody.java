// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link GetRuntimeModelConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetRuntimeModelConfigResponseBody</p>
 */
public class GetRuntimeModelConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetRuntimeModelConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRuntimeModelConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetRuntimeModelConfigResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetRuntimeModelConfigResponseBody build() {
            return new GetRuntimeModelConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRuntimeModelConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuntimeModelConfigResponseBody</p>
     */
    public static class InferenceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RequestModality")
        private java.util.List<String> requestModality;

        @com.aliyun.core.annotation.NameInMap("ResponseModality")
        private java.util.List<String> responseModality;

        private InferenceMetadata(Builder builder) {
            this.requestModality = builder.requestModality;
            this.responseModality = builder.responseModality;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InferenceMetadata create() {
            return builder().build();
        }

        /**
         * @return requestModality
         */
        public java.util.List<String> getRequestModality() {
            return this.requestModality;
        }

        /**
         * @return responseModality
         */
        public java.util.List<String> getResponseModality() {
            return this.responseModality;
        }

        public static final class Builder {
            private java.util.List<String> requestModality; 
            private java.util.List<String> responseModality; 

            private Builder() {
            } 

            private Builder(InferenceMetadata model) {
                this.requestModality = model.requestModality;
                this.responseModality = model.responseModality;
            } 

            /**
             * RequestModality.
             */
            public Builder requestModality(java.util.List<String> requestModality) {
                this.requestModality = requestModality;
                return this;
            }

            /**
             * ResponseModality.
             */
            public Builder responseModality(java.util.List<String> responseModality) {
                this.responseModality = responseModality;
                return this;
            }

            public InferenceMetadata build() {
                return new InferenceMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuntimeModelConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuntimeModelConfigResponseBody</p>
     */
    public static class LlmInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.List<String> features;

        @com.aliyun.core.annotation.NameInMap("InferenceMetadata")
        private InferenceMetadata inferenceMetadata;

        @com.aliyun.core.annotation.NameInMap("LlmCode")
        private String llmCode;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PublishedTime")
        private String publishedTime;

        @com.aliyun.core.annotation.NameInMap("RiskType")
        private String riskType;

        private LlmInfoList(Builder builder) {
            this.description = builder.description;
            this.features = builder.features;
            this.inferenceMetadata = builder.inferenceMetadata;
            this.llmCode = builder.llmCode;
            this.name = builder.name;
            this.publishedTime = builder.publishedTime;
            this.riskType = builder.riskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmInfoList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return features
         */
        public java.util.List<String> getFeatures() {
            return this.features;
        }

        /**
         * @return inferenceMetadata
         */
        public InferenceMetadata getInferenceMetadata() {
            return this.inferenceMetadata;
        }

        /**
         * @return llmCode
         */
        public String getLlmCode() {
            return this.llmCode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return publishedTime
         */
        public String getPublishedTime() {
            return this.publishedTime;
        }

        /**
         * @return riskType
         */
        public String getRiskType() {
            return this.riskType;
        }

        public static final class Builder {
            private String description; 
            private java.util.List<String> features; 
            private InferenceMetadata inferenceMetadata; 
            private String llmCode; 
            private String name; 
            private String publishedTime; 
            private String riskType; 

            private Builder() {
            } 

            private Builder(LlmInfoList model) {
                this.description = model.description;
                this.features = model.features;
                this.inferenceMetadata = model.inferenceMetadata;
                this.llmCode = model.llmCode;
                this.name = model.name;
                this.publishedTime = model.publishedTime;
                this.riskType = model.riskType;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Features.
             */
            public Builder features(java.util.List<String> features) {
                this.features = features;
                return this;
            }

            /**
             * InferenceMetadata.
             */
            public Builder inferenceMetadata(InferenceMetadata inferenceMetadata) {
                this.inferenceMetadata = inferenceMetadata;
                return this;
            }

            /**
             * LlmCode.
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * PublishedTime.
             */
            public Builder publishedTime(String publishedTime) {
                this.publishedTime = publishedTime;
                return this;
            }

            /**
             * RiskType.
             */
            public Builder riskType(String riskType) {
                this.riskType = riskType;
                return this;
            }

            public LlmInfoList build() {
                return new LlmInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuntimeModelConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuntimeModelConfigResponseBody</p>
     */
    public static class ModelProviderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LlmInfoList")
        private java.util.List<LlmInfoList> llmInfoList;

        @com.aliyun.core.annotation.NameInMap("ModelProviderTemplateId")
        private String modelProviderTemplateId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProviderName")
        private String providerName;

        private ModelProviderList(Builder builder) {
            this.llmInfoList = builder.llmInfoList;
            this.modelProviderTemplateId = builder.modelProviderTemplateId;
            this.name = builder.name;
            this.providerName = builder.providerName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelProviderList create() {
            return builder().build();
        }

        /**
         * @return llmInfoList
         */
        public java.util.List<LlmInfoList> getLlmInfoList() {
            return this.llmInfoList;
        }

        /**
         * @return modelProviderTemplateId
         */
        public String getModelProviderTemplateId() {
            return this.modelProviderTemplateId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        public static final class Builder {
            private java.util.List<LlmInfoList> llmInfoList; 
            private String modelProviderTemplateId; 
            private String name; 
            private String providerName; 

            private Builder() {
            } 

            private Builder(ModelProviderList model) {
                this.llmInfoList = model.llmInfoList;
                this.modelProviderTemplateId = model.modelProviderTemplateId;
                this.name = model.name;
                this.providerName = model.providerName;
            } 

            /**
             * LlmInfoList.
             */
            public Builder llmInfoList(java.util.List<LlmInfoList> llmInfoList) {
                this.llmInfoList = llmInfoList;
                return this;
            }

            /**
             * ModelProviderTemplateId.
             */
            public Builder modelProviderTemplateId(String modelProviderTemplateId) {
                this.modelProviderTemplateId = modelProviderTemplateId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProviderName.
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            public ModelProviderList build() {
                return new ModelProviderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRuntimeModelConfigResponseBody} extends {@link TeaModel}
     *
     * <p>GetRuntimeModelConfigResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultModel")
        private String defaultModel;

        @com.aliyun.core.annotation.NameInMap("ModelProviderList")
        private java.util.List<ModelProviderList> modelProviderList;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
        private String modelTemplateId;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateName")
        private String modelTemplateName;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateRefType")
        private String modelTemplateRefType;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private Data(Builder builder) {
            this.defaultModel = builder.defaultModel;
            this.modelProviderList = builder.modelProviderList;
            this.modelTemplateId = builder.modelTemplateId;
            this.modelTemplateName = builder.modelTemplateName;
            this.modelTemplateRefType = builder.modelTemplateRefType;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return defaultModel
         */
        public String getDefaultModel() {
            return this.defaultModel;
        }

        /**
         * @return modelProviderList
         */
        public java.util.List<ModelProviderList> getModelProviderList() {
            return this.modelProviderList;
        }

        /**
         * @return modelTemplateId
         */
        public String getModelTemplateId() {
            return this.modelTemplateId;
        }

        /**
         * @return modelTemplateName
         */
        public String getModelTemplateName() {
            return this.modelTemplateName;
        }

        /**
         * @return modelTemplateRefType
         */
        public String getModelTemplateRefType() {
            return this.modelTemplateRefType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String defaultModel; 
            private java.util.List<ModelProviderList> modelProviderList; 
            private String modelTemplateId; 
            private String modelTemplateName; 
            private String modelTemplateRefType; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.defaultModel = model.defaultModel;
                this.modelProviderList = model.modelProviderList;
                this.modelTemplateId = model.modelTemplateId;
                this.modelTemplateName = model.modelTemplateName;
                this.modelTemplateRefType = model.modelTemplateRefType;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * DefaultModel.
             */
            public Builder defaultModel(String defaultModel) {
                this.defaultModel = defaultModel;
                return this;
            }

            /**
             * ModelProviderList.
             */
            public Builder modelProviderList(java.util.List<ModelProviderList> modelProviderList) {
                this.modelProviderList = modelProviderList;
                return this;
            }

            /**
             * ModelTemplateId.
             */
            public Builder modelTemplateId(String modelTemplateId) {
                this.modelTemplateId = modelTemplateId;
                return this;
            }

            /**
             * ModelTemplateName.
             */
            public Builder modelTemplateName(String modelTemplateName) {
                this.modelTemplateName = modelTemplateName;
                return this;
            }

            /**
             * ModelTemplateRefType.
             */
            public Builder modelTemplateRefType(String modelTemplateRefType) {
                this.modelTemplateRefType = modelTemplateRefType;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
