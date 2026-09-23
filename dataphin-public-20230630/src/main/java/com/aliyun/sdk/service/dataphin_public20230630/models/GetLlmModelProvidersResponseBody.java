// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link GetLlmModelProvidersResponseBody} extends {@link TeaModel}
 *
 * <p>GetLlmModelProvidersResponseBody</p>
 */
public class GetLlmModelProvidersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetLlmModelProvidersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLlmModelProvidersResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetLlmModelProvidersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of large language model service providers and available models.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The details of the backend exception.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetLlmModelProvidersResponseBody build() {
            return new GetLlmModelProvidersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLlmModelProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>GetLlmModelProvidersResponseBody</p>
     */
    public static class LlmModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CnName")
        private String cnName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EmbeddingDimensions")
        private java.util.List<Integer> embeddingDimensions;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("InvokeType")
        private String invokeType;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private Long modelId;

        @com.aliyun.core.annotation.NameInMap("ModelTypes")
        private java.util.List<String> modelTypes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ServiceProvider")
        private String serviceProvider;

        @com.aliyun.core.annotation.NameInMap("Tasks")
        private java.util.List<String> tasks;

        private LlmModels(Builder builder) {
            this.cnName = builder.cnName;
            this.description = builder.description;
            this.embeddingDimensions = builder.embeddingDimensions;
            this.enabled = builder.enabled;
            this.invokeType = builder.invokeType;
            this.modelId = builder.modelId;
            this.modelTypes = builder.modelTypes;
            this.name = builder.name;
            this.serviceProvider = builder.serviceProvider;
            this.tasks = builder.tasks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmModels create() {
            return builder().build();
        }

        /**
         * @return cnName
         */
        public String getCnName() {
            return this.cnName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return embeddingDimensions
         */
        public java.util.List<Integer> getEmbeddingDimensions() {
            return this.embeddingDimensions;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return invokeType
         */
        public String getInvokeType() {
            return this.invokeType;
        }

        /**
         * @return modelId
         */
        public Long getModelId() {
            return this.modelId;
        }

        /**
         * @return modelTypes
         */
        public java.util.List<String> getModelTypes() {
            return this.modelTypes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return serviceProvider
         */
        public String getServiceProvider() {
            return this.serviceProvider;
        }

        /**
         * @return tasks
         */
        public java.util.List<String> getTasks() {
            return this.tasks;
        }

        public static final class Builder {
            private String cnName; 
            private String description; 
            private java.util.List<Integer> embeddingDimensions; 
            private Boolean enabled; 
            private String invokeType; 
            private Long modelId; 
            private java.util.List<String> modelTypes; 
            private String name; 
            private String serviceProvider; 
            private java.util.List<String> tasks; 

            private Builder() {
            } 

            private Builder(LlmModels model) {
                this.cnName = model.cnName;
                this.description = model.description;
                this.embeddingDimensions = model.embeddingDimensions;
                this.enabled = model.enabled;
                this.invokeType = model.invokeType;
                this.modelId = model.modelId;
                this.modelTypes = model.modelTypes;
                this.name = model.name;
                this.serviceProvider = model.serviceProvider;
                this.tasks = model.tasks;
            } 

            /**
             * <p>The Chinese name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>通义千问-Max</p>
             */
            public Builder cnName(String cnName) {
                this.cnName = cnName;
                return this;
            }

            /**
             * <p>The description of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>General text generation model</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The list of available dimension values for the embedding model. This value is returned only for embedding models.</p>
             */
            public Builder embeddingDimensions(java.util.List<Integer> embeddingDimensions) {
                this.embeddingDimensions = embeddingDimensions;
                return this;
            }

            /**
             * <p>The enabling status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The model invocation method. Valid values:</p>
             * <ul>
             * <li>OPEN_AI</li>
             * <li>DASH_SCOPE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DASH_SCOPE</p>
             */
            public Builder invokeType(String invokeType) {
                this.invokeType = invokeType;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder modelId(Long modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The list of model modality types. Valid values:</p>
             * <ul>
             * <li>TEXT: text</li>
             * <li>IMAGE: image</li>
             * <li>AUDIO: audio</li>
             * <li>VIDEO: video</li>
             * <li>EMBEDDING: embedding</li>
             * </ul>
             */
            public Builder modelTypes(java.util.List<String> modelTypes) {
                this.modelTypes = modelTypes;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-max</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder serviceProvider(String serviceProvider) {
                this.serviceProvider = serviceProvider;
                return this;
            }

            /**
             * <p>The list of model task capabilities. Valid values:</p>
             * <ul>
             * <li>ASR: speech recognition</li>
             * <li>TTS: speech synthesis</li>
             * <li>TRANSLATION: speech translation</li>
             * </ul>
             */
            public Builder tasks(java.util.List<String> tasks) {
                this.tasks = tasks;
                return this;
            }

            public LlmModels build() {
                return new LlmModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLlmModelProvidersResponseBody} extends {@link TeaModel}
     *
     * <p>GetLlmModelProvidersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaseUrl")
        private String baseUrl;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LlmModels")
        private java.util.List<LlmModels> llmModels;

        @com.aliyun.core.annotation.NameInMap("ProviderSource")
        private String providerSource;

        @com.aliyun.core.annotation.NameInMap("ProviderType")
        private String providerType;

        @com.aliyun.core.annotation.NameInMap("ServiceProvider")
        private String serviceProvider;

        private Data(Builder builder) {
            this.baseUrl = builder.baseUrl;
            this.enabled = builder.enabled;
            this.id = builder.id;
            this.llmModels = builder.llmModels;
            this.providerSource = builder.providerSource;
            this.providerType = builder.providerType;
            this.serviceProvider = builder.serviceProvider;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baseUrl
         */
        public String getBaseUrl() {
            return this.baseUrl;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return llmModels
         */
        public java.util.List<LlmModels> getLlmModels() {
            return this.llmModels;
        }

        /**
         * @return providerSource
         */
        public String getProviderSource() {
            return this.providerSource;
        }

        /**
         * @return providerType
         */
        public String getProviderType() {
            return this.providerType;
        }

        /**
         * @return serviceProvider
         */
        public String getServiceProvider() {
            return this.serviceProvider;
        }

        public static final class Builder {
            private String baseUrl; 
            private Boolean enabled; 
            private Long id; 
            private java.util.List<LlmModels> llmModels; 
            private String providerSource; 
            private String providerType; 
            private String serviceProvider; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.baseUrl = model.baseUrl;
                this.enabled = model.enabled;
                this.id = model.id;
                this.llmModels = model.llmModels;
                this.providerSource = model.providerSource;
                this.providerType = model.providerType;
                this.serviceProvider = model.serviceProvider;
            } 

            /**
             * <p>The base URL of the model.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://dashscope.aliyuncs.com">https://dashscope.aliyuncs.com</a></p>
             */
            public Builder baseUrl(String baseUrl) {
                this.baseUrl = baseUrl;
                return this;
            }

            /**
             * <p>The enabling status.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The ID of the model service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The list of models provided by the model service provider.</p>
             */
            public Builder llmModels(java.util.List<LlmModels> llmModels) {
                this.llmModels = llmModels;
                return this;
            }

            /**
             * <p>The source of the model service provider. Valid values:</p>
             * <ul>
             * <li>BUILTIN_MODEL: built-in</li>
             * <li>BYOM: user-provided</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BUILTIN_MODEL</p>
             */
            public Builder providerSource(String providerSource) {
                this.providerSource = providerSource;
                return this;
            }

            /**
             * <p>The provider type. Valid values:</p>
             * <ul>
             * <li>BAILIAN</li>
             * <li>DEEPSEEK</li>
             * <li>AI_STACK</li>
             * <li>VLLM</li>
             * <li>AGENT_ONE</li>
             * <li>DATAPHIN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BAILIAN</p>
             */
            public Builder providerType(String providerType) {
                this.providerType = providerType;
                return this;
            }

            /**
             * <p>The name of the model service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder serviceProvider(String serviceProvider) {
                this.serviceProvider = serviceProvider;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
