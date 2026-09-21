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
         * <p>The returned result object.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
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
    public static class CreditMultiplier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Max")
        private Float max;

        @com.aliyun.core.annotation.NameInMap("Min")
        private Float min;

        private CreditMultiplier(Builder builder) {
            this.max = builder.max;
            this.min = builder.min;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreditMultiplier create() {
            return builder().build();
        }

        /**
         * @return max
         */
        public Float getMax() {
            return this.max;
        }

        /**
         * @return min
         */
        public Float getMin() {
            return this.min;
        }

        public static final class Builder {
            private Float max; 
            private Float min; 

            private Builder() {
            } 

            private Builder(CreditMultiplier model) {
                this.max = model.max;
                this.min = model.min;
            } 

            /**
             * <p>The maximum multiplier. A null value indicates no upper limit. For example, Min=1 with a null Max is displayed as 1x and above.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder max(Float max) {
                this.max = max;
                return this;
            }

            /**
             * <p>The minimum multiplier. When equal to Max, the multiplier is fixed. For example, Min=Max=2 is displayed as 2x.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder min(Float min) {
                this.min = min;
                return this;
            }

            public CreditMultiplier build() {
                return new CreditMultiplier(this);
            } 

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
             * <p>The list of request modalities (such as Text, Image, and Audio).</p>
             */
            public Builder requestModality(java.util.List<String> requestModality) {
                this.requestModality = requestModality;
                return this;
            }

            /**
             * <p>The list of response modalities (such as Text, Image, and Audio).</p>
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
        @com.aliyun.core.annotation.NameInMap("CreditMultiplier")
        private CreditMultiplier creditMultiplier;

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
            this.creditMultiplier = builder.creditMultiplier;
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
         * @return creditMultiplier
         */
        public CreditMultiplier getCreditMultiplier() {
            return this.creditMultiplier;
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
            private CreditMultiplier creditMultiplier; 
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
                this.creditMultiplier = model.creditMultiplier;
                this.description = model.description;
                this.features = model.features;
                this.inferenceMetadata = model.inferenceMetadata;
                this.llmCode = model.llmCode;
                this.name = model.name;
                this.publishedTime = model.publishedTime;
                this.riskType = model.riskType;
            } 

            /**
             * <p>The credit consumption multiplier. A null value indicates that the model does not participate in credit-based billing.</p>
             */
            public Builder creditMultiplier(CreditMultiplier creditMultiplier) {
                this.creditMultiplier = creditMultiplier;
                return this;
            }

            /**
             * <p>The model description.</p>
             * 
             * <strong>example:</strong>
             * <p>The Qwen3.6 native vision-language series Plus model demonstrates outstanding performance comparable to current top frontier models, with significant improvements over the 3.5 series. The model features significantly enhanced capabilities in agentic coding, frontend programming, vibe coding, multimodal universal recognition, OCR, and object localization</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of model features (such as function-calling, web-search, and structured-outputs).</p>
             */
            public Builder features(java.util.List<String> features) {
                this.features = features;
                return this;
            }

            /**
             * <p>The inference metadata (request and response modalities).</p>
             */
            public Builder inferenceMetadata(InferenceMetadata inferenceMetadata) {
                this.inferenceMetadata = inferenceMetadata;
                return this;
            }

            /**
             * <p>The model code.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.6-plus</p>
             */
            public Builder llmCode(String llmCode) {
                this.llmCode = llmCode;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>Qwen3.6-Plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The publish time (ISO 8601 format).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-04T06:25:17.000+00:00</p>
             */
            public Builder publishedTime(String publishedTime) {
                this.publishedTime = publishedTime;
                return this;
            }

            /**
             * <p>The model risk type (returned only when the request parameter IncludeRiskInfo is set to true).</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
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
             * <p>The list of model information.</p>
             */
            public Builder llmInfoList(java.util.List<LlmInfoList> llmInfoList) {
                this.llmInfoList = llmInfoList;
                return this;
            }

            /**
             * <p>The model provider template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mpt-xxxx</p>
             */
            public Builder modelProviderTemplateId(String modelProviderTemplateId) {
                this.modelProviderTemplateId = modelProviderTemplateId;
                return this;
            }

            /**
             * <p>The model provider template name.</p>
             * 
             * <strong>example:</strong>
             * <p>百炼</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The model provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
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
             * <p>The default model (format: providerName/llmCode).</p>
             * 
             * <strong>example:</strong>
             * <p>bailian/qwen3.6-plus</p>
             */
            public Builder defaultModel(String defaultModel) {
                this.defaultModel = defaultModel;
                return this;
            }

            /**
             * <p>The list of model providers.</p>
             */
            public Builder modelProviderList(java.util.List<ModelProviderList> modelProviderList) {
                this.modelProviderList = modelProviderList;
                return this;
            }

            /**
             * <p>The configured model group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>mt-xxxx</p>
             */
            public Builder modelTemplateId(String modelTemplateId) {
                this.modelTemplateId = modelTemplateId;
                return this;
            }

            /**
             * <p>The model group name.</p>
             * 
             * <strong>example:</strong>
             * <p>model-template-001</p>
             */
            public Builder modelTemplateName(String modelTemplateName) {
                this.modelTemplateName = modelTemplateName;
                return this;
            }

            /**
             * <p>The model template association type (only when present).</p>
             * 
             * <strong>example:</strong>
             * <p>Runtime</p>
             */
            public Builder modelTemplateRefType(String modelTemplateRefType) {
                this.modelTemplateRefType = modelTemplateRefType;
                return this;
            }

            /**
             * <p>The resource group ID to which the runtime belongs (null if not assigned to a resource group).</p>
             * 
             * <strong>example:</strong>
             * <p>rg-xxxxx</p>
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
