// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationAvailableModelsResponseBody</p>
 */
public class DescribeApplicationAvailableModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsrModels")
    private java.util.List<AsrModels> asrModels;

    @com.aliyun.core.annotation.NameInMap("DefaultEmbeddingModel")
    private DefaultEmbeddingModel defaultEmbeddingModel;

    @com.aliyun.core.annotation.NameInMap("DefaultGraphLLMModel")
    private DefaultGraphLLMModel defaultGraphLLMModel;

    @com.aliyun.core.annotation.NameInMap("DefaultLLMModel")
    private DefaultLLMModel defaultLLMModel;

    @com.aliyun.core.annotation.NameInMap("DefaultMemoryType")
    private String defaultMemoryType;

    @com.aliyun.core.annotation.NameInMap("DefaultRerankModel")
    private DefaultRerankModel defaultRerankModel;

    @com.aliyun.core.annotation.NameInMap("DefaultVLModel")
    private DefaultVLModel defaultVLModel;

    @com.aliyun.core.annotation.NameInMap("DefaultVisualEmbedderModel")
    private DefaultVisualEmbedderModel defaultVisualEmbedderModel;

    @com.aliyun.core.annotation.NameInMap("DefaultVisualLlmModel")
    private DefaultVisualLlmModel defaultVisualLlmModel;

    @com.aliyun.core.annotation.NameInMap("EmbeddingModels")
    private java.util.List<EmbeddingModels> embeddingModels;

    @com.aliyun.core.annotation.NameInMap("GraphLlmModels")
    private java.util.List<GraphLlmModels> graphLlmModels;

    @com.aliyun.core.annotation.NameInMap("LlmModels")
    private java.util.List<LlmModels> llmModels;

    @com.aliyun.core.annotation.NameInMap("MemoryTypes")
    private java.util.List<String> memoryTypes;

    @com.aliyun.core.annotation.NameInMap("MultimodalSupported")
    private Boolean multimodalSupported;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RerankModels")
    private java.util.List<RerankModels> rerankModels;

    @com.aliyun.core.annotation.NameInMap("VLModels")
    private java.util.List<VLModels> VLModels;

    @com.aliyun.core.annotation.NameInMap("VisualEmbedderModels")
    private java.util.List<VisualEmbedderModels> visualEmbedderModels;

    @com.aliyun.core.annotation.NameInMap("VisualLlmModels")
    private java.util.List<VisualLlmModels> visualLlmModels;

    private DescribeApplicationAvailableModelsResponseBody(Builder builder) {
        this.asrModels = builder.asrModels;
        this.defaultEmbeddingModel = builder.defaultEmbeddingModel;
        this.defaultGraphLLMModel = builder.defaultGraphLLMModel;
        this.defaultLLMModel = builder.defaultLLMModel;
        this.defaultMemoryType = builder.defaultMemoryType;
        this.defaultRerankModel = builder.defaultRerankModel;
        this.defaultVLModel = builder.defaultVLModel;
        this.defaultVisualEmbedderModel = builder.defaultVisualEmbedderModel;
        this.defaultVisualLlmModel = builder.defaultVisualLlmModel;
        this.embeddingModels = builder.embeddingModels;
        this.graphLlmModels = builder.graphLlmModels;
        this.llmModels = builder.llmModels;
        this.memoryTypes = builder.memoryTypes;
        this.multimodalSupported = builder.multimodalSupported;
        this.requestId = builder.requestId;
        this.rerankModels = builder.rerankModels;
        this.VLModels = builder.VLModels;
        this.visualEmbedderModels = builder.visualEmbedderModels;
        this.visualLlmModels = builder.visualLlmModels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationAvailableModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asrModels
     */
    public java.util.List<AsrModels> getAsrModels() {
        return this.asrModels;
    }

    /**
     * @return defaultEmbeddingModel
     */
    public DefaultEmbeddingModel getDefaultEmbeddingModel() {
        return this.defaultEmbeddingModel;
    }

    /**
     * @return defaultGraphLLMModel
     */
    public DefaultGraphLLMModel getDefaultGraphLLMModel() {
        return this.defaultGraphLLMModel;
    }

    /**
     * @return defaultLLMModel
     */
    public DefaultLLMModel getDefaultLLMModel() {
        return this.defaultLLMModel;
    }

    /**
     * @return defaultMemoryType
     */
    public String getDefaultMemoryType() {
        return this.defaultMemoryType;
    }

    /**
     * @return defaultRerankModel
     */
    public DefaultRerankModel getDefaultRerankModel() {
        return this.defaultRerankModel;
    }

    /**
     * @return defaultVLModel
     */
    public DefaultVLModel getDefaultVLModel() {
        return this.defaultVLModel;
    }

    /**
     * @return defaultVisualEmbedderModel
     */
    public DefaultVisualEmbedderModel getDefaultVisualEmbedderModel() {
        return this.defaultVisualEmbedderModel;
    }

    /**
     * @return defaultVisualLlmModel
     */
    public DefaultVisualLlmModel getDefaultVisualLlmModel() {
        return this.defaultVisualLlmModel;
    }

    /**
     * @return embeddingModels
     */
    public java.util.List<EmbeddingModels> getEmbeddingModels() {
        return this.embeddingModels;
    }

    /**
     * @return graphLlmModels
     */
    public java.util.List<GraphLlmModels> getGraphLlmModels() {
        return this.graphLlmModels;
    }

    /**
     * @return llmModels
     */
    public java.util.List<LlmModels> getLlmModels() {
        return this.llmModels;
    }

    /**
     * @return memoryTypes
     */
    public java.util.List<String> getMemoryTypes() {
        return this.memoryTypes;
    }

    /**
     * @return multimodalSupported
     */
    public Boolean getMultimodalSupported() {
        return this.multimodalSupported;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rerankModels
     */
    public java.util.List<RerankModels> getRerankModels() {
        return this.rerankModels;
    }

    /**
     * @return VLModels
     */
    public java.util.List<VLModels> getVLModels() {
        return this.VLModels;
    }

    /**
     * @return visualEmbedderModels
     */
    public java.util.List<VisualEmbedderModels> getVisualEmbedderModels() {
        return this.visualEmbedderModels;
    }

    /**
     * @return visualLlmModels
     */
    public java.util.List<VisualLlmModels> getVisualLlmModels() {
        return this.visualLlmModels;
    }

    public static final class Builder {
        private java.util.List<AsrModels> asrModels; 
        private DefaultEmbeddingModel defaultEmbeddingModel; 
        private DefaultGraphLLMModel defaultGraphLLMModel; 
        private DefaultLLMModel defaultLLMModel; 
        private String defaultMemoryType; 
        private DefaultRerankModel defaultRerankModel; 
        private DefaultVLModel defaultVLModel; 
        private DefaultVisualEmbedderModel defaultVisualEmbedderModel; 
        private DefaultVisualLlmModel defaultVisualLlmModel; 
        private java.util.List<EmbeddingModels> embeddingModels; 
        private java.util.List<GraphLlmModels> graphLlmModels; 
        private java.util.List<LlmModels> llmModels; 
        private java.util.List<String> memoryTypes; 
        private Boolean multimodalSupported; 
        private String requestId; 
        private java.util.List<RerankModels> rerankModels; 
        private java.util.List<VLModels> VLModels; 
        private java.util.List<VisualEmbedderModels> visualEmbedderModels; 
        private java.util.List<VisualLlmModels> visualLlmModels; 

        private Builder() {
        } 

        private Builder(DescribeApplicationAvailableModelsResponseBody model) {
            this.asrModels = model.asrModels;
            this.defaultEmbeddingModel = model.defaultEmbeddingModel;
            this.defaultGraphLLMModel = model.defaultGraphLLMModel;
            this.defaultLLMModel = model.defaultLLMModel;
            this.defaultMemoryType = model.defaultMemoryType;
            this.defaultRerankModel = model.defaultRerankModel;
            this.defaultVLModel = model.defaultVLModel;
            this.defaultVisualEmbedderModel = model.defaultVisualEmbedderModel;
            this.defaultVisualLlmModel = model.defaultVisualLlmModel;
            this.embeddingModels = model.embeddingModels;
            this.graphLlmModels = model.graphLlmModels;
            this.llmModels = model.llmModels;
            this.memoryTypes = model.memoryTypes;
            this.multimodalSupported = model.multimodalSupported;
            this.requestId = model.requestId;
            this.rerankModels = model.rerankModels;
            this.VLModels = model.VLModels;
            this.visualEmbedderModels = model.visualEmbedderModels;
            this.visualLlmModels = model.visualLlmModels;
        } 

        /**
         * <p>The list of speech recognition models.</p>
         */
        public Builder asrModels(java.util.List<AsrModels> asrModels) {
            this.asrModels = asrModels;
            return this;
        }

        /**
         * <p>The default text embedding model.</p>
         */
        public Builder defaultEmbeddingModel(DefaultEmbeddingModel defaultEmbeddingModel) {
            this.defaultEmbeddingModel = defaultEmbeddingModel;
            return this;
        }

        /**
         * <p>The default graph large language model.</p>
         */
        public Builder defaultGraphLLMModel(DefaultGraphLLMModel defaultGraphLLMModel) {
            this.defaultGraphLLMModel = defaultGraphLLMModel;
            return this;
        }

        /**
         * <p>The default large language model.</p>
         */
        public Builder defaultLLMModel(DefaultLLMModel defaultLLMModel) {
            this.defaultLLMModel = defaultLLMModel;
            return this;
        }

        /**
         * <p>The default memory type.</p>
         * 
         * <strong>example:</strong>
         * <p>TEXT</p>
         */
        public Builder defaultMemoryType(String defaultMemoryType) {
            this.defaultMemoryType = defaultMemoryType;
            return this;
        }

        /**
         * <p>The default reranking model.</p>
         */
        public Builder defaultRerankModel(DefaultRerankModel defaultRerankModel) {
            this.defaultRerankModel = defaultRerankModel;
            return this;
        }

        /**
         * <p>The default vision-language model.</p>
         */
        public Builder defaultVLModel(DefaultVLModel defaultVLModel) {
            this.defaultVLModel = defaultVLModel;
            return this;
        }

        /**
         * <p>The default VisualEmbedder model.</p>
         */
        public Builder defaultVisualEmbedderModel(DefaultVisualEmbedderModel defaultVisualEmbedderModel) {
            this.defaultVisualEmbedderModel = defaultVisualEmbedderModel;
            return this;
        }

        /**
         * <p>The default VisualLLM model.</p>
         */
        public Builder defaultVisualLlmModel(DefaultVisualLlmModel defaultVisualLlmModel) {
            this.defaultVisualLlmModel = defaultVisualLlmModel;
            return this;
        }

        /**
         * <p>The list of available text embedding models.</p>
         */
        public Builder embeddingModels(java.util.List<EmbeddingModels> embeddingModels) {
            this.embeddingModels = embeddingModels;
            return this;
        }

        /**
         * <p>The list of available graph large language models.</p>
         */
        public Builder graphLlmModels(java.util.List<GraphLlmModels> graphLlmModels) {
            this.graphLlmModels = graphLlmModels;
            return this;
        }

        /**
         * <p>The list of available large language models.</p>
         */
        public Builder llmModels(java.util.List<LlmModels> llmModels) {
            this.llmModels = llmModels;
            return this;
        }

        /**
         * <p>The available memory types.</p>
         */
        public Builder memoryTypes(java.util.List<String> memoryTypes) {
            this.memoryTypes = memoryTypes;
            return this;
        }

        /**
         * <p>Indicates whether the current account supports Mem0 multimodal.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder multimodalSupported(Boolean multimodalSupported) {
            this.multimodalSupported = multimodalSupported;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of available reranking models.</p>
         */
        public Builder rerankModels(java.util.List<RerankModels> rerankModels) {
            this.rerankModels = rerankModels;
            return this;
        }

        /**
         * <p>The list of available vision-language models.</p>
         */
        public Builder VLModels(java.util.List<VLModels> VLModels) {
            this.VLModels = VLModels;
            return this;
        }

        /**
         * <p>The list of available VisualEmbedder models.</p>
         */
        public Builder visualEmbedderModels(java.util.List<VisualEmbedderModels> visualEmbedderModels) {
            this.visualEmbedderModels = visualEmbedderModels;
            return this;
        }

        /**
         * <p>The list of available VisualLLM models.</p>
         */
        public Builder visualLlmModels(java.util.List<VisualLlmModels> visualLlmModels) {
            this.visualLlmModels = visualLlmModels;
            return this;
        }

        public DescribeApplicationAvailableModelsResponseBody build() {
            return new DescribeApplicationAvailableModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class AsrModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Protocol")
        private String protocol;

        private AsrModels(Builder builder) {
            this.name = builder.name;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsrModels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String name; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(AsrModels model) {
                this.name = model.name;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>paraformer-realtime-v2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The protocol used by the speech recognition model.</p>
             * 
             * <strong>example:</strong>
             * <p>websocket</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public AsrModels build() {
                return new AsrModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class DefaultEmbeddingModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private Integer dimension;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Integer> dimensions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DefaultEmbeddingModel(Builder builder) {
            this.dimension = builder.dimension;
            this.dimensions = builder.dimensions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultEmbeddingModel create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public Integer getDimension() {
            return this.dimension;
        }

        /**
         * @return dimensions
         */
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer dimension; 
            private java.util.List<Integer> dimensions; 
            private String name; 

            private Builder() {
            } 

            private Builder(DefaultEmbeddingModel model) {
                this.dimension = model.dimension;
                this.dimensions = model.dimensions;
                this.name = model.name;
            } 

            /**
             * <p>The default vector dimensions of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder dimension(Integer dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The list of vector dimensions supported by the model.</p>
             */
            public Builder dimensions(java.util.List<Integer> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>text-embedding-v3</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DefaultEmbeddingModel build() {
                return new DefaultEmbeddingModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class DefaultGraphLLMModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DefaultGraphLLMModel(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultGraphLLMModel create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DefaultGraphLLMModel model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DefaultGraphLLMModel build() {
                return new DefaultGraphLLMModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class DefaultLLMModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DefaultLLMModel(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultLLMModel create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DefaultLLMModel model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DefaultLLMModel build() {
                return new DefaultLLMModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class DefaultRerankModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DefaultRerankModel(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultRerankModel create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DefaultRerankModel model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>gte-rerank-v2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DefaultRerankModel build() {
                return new DefaultRerankModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class DefaultVLModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DefaultVLModel(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultVLModel create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DefaultVLModel model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-vl-max</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DefaultVLModel build() {
                return new DefaultVLModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class DefaultVisualEmbedderModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private Integer dimension;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Integer> dimensions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DefaultVisualEmbedderModel(Builder builder) {
            this.dimension = builder.dimension;
            this.dimensions = builder.dimensions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultVisualEmbedderModel create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public Integer getDimension() {
            return this.dimension;
        }

        /**
         * @return dimensions
         */
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer dimension; 
            private java.util.List<Integer> dimensions; 
            private String name; 

            private Builder() {
            } 

            private Builder(DefaultVisualEmbedderModel model) {
                this.dimension = model.dimension;
                this.dimensions = model.dimensions;
                this.name = model.name;
            } 

            /**
             * <p>The default dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>2560</p>
             */
            public Builder dimension(Integer dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The available dimensions.</p>
             */
            public Builder dimensions(java.util.List<Integer> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.7-text-embedding</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DefaultVisualEmbedderModel build() {
                return new DefaultVisualEmbedderModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class DefaultVisualLlmModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SupportedModalities")
        private java.util.List<String> supportedModalities;

        private DefaultVisualLlmModel(Builder builder) {
            this.name = builder.name;
            this.supportedModalities = builder.supportedModalities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DefaultVisualLlmModel create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return supportedModalities
         */
        public java.util.List<String> getSupportedModalities() {
            return this.supportedModalities;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> supportedModalities; 

            private Builder() {
            } 

            private Builder(DefaultVisualLlmModel model) {
                this.name = model.name;
                this.supportedModalities = model.supportedModalities;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.6-flash</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The supported modalities.</p>
             */
            public Builder supportedModalities(java.util.List<String> supportedModalities) {
                this.supportedModalities = supportedModalities;
                return this;
            }

            public DefaultVisualLlmModel build() {
                return new DefaultVisualLlmModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class EmbeddingModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private Integer dimension;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Integer> dimensions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private EmbeddingModels(Builder builder) {
            this.dimension = builder.dimension;
            this.dimensions = builder.dimensions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EmbeddingModels create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public Integer getDimension() {
            return this.dimension;
        }

        /**
         * @return dimensions
         */
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer dimension; 
            private java.util.List<Integer> dimensions; 
            private String name; 

            private Builder() {
            } 

            private Builder(EmbeddingModels model) {
                this.dimension = model.dimension;
                this.dimensions = model.dimensions;
                this.name = model.name;
            } 

            /**
             * <p>The default vector dimensions of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder dimension(Integer dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The list of vector dimensions supported by the model.</p>
             */
            public Builder dimensions(java.util.List<Integer> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>text-embedding-v3</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public EmbeddingModels build() {
                return new EmbeddingModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class GraphLlmModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private GraphLlmModels(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GraphLlmModels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(GraphLlmModels model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public GraphLlmModels build() {
                return new GraphLlmModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class LlmModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private LlmModels(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LlmModels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(LlmModels model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-plus</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public LlmModels build() {
                return new LlmModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class RerankModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private RerankModels(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RerankModels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(RerankModels model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>gte-rerank-v2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RerankModels build() {
                return new RerankModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class VLModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private VLModels(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VLModels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(VLModels model) {
                this.name = model.name;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen-vl-max</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VLModels build() {
                return new VLModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class VisualEmbedderModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimension")
        private Integer dimension;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Integer> dimensions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private VisualEmbedderModels(Builder builder) {
            this.dimension = builder.dimension;
            this.dimensions = builder.dimensions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisualEmbedderModels create() {
            return builder().build();
        }

        /**
         * @return dimension
         */
        public Integer getDimension() {
            return this.dimension;
        }

        /**
         * @return dimensions
         */
        public java.util.List<Integer> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer dimension; 
            private java.util.List<Integer> dimensions; 
            private String name; 

            private Builder() {
            } 

            private Builder(VisualEmbedderModels model) {
                this.dimension = model.dimension;
                this.dimensions = model.dimensions;
                this.name = model.name;
            } 

            /**
             * <p>The default dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>2560</p>
             */
            public Builder dimension(Integer dimension) {
                this.dimension = dimension;
                return this;
            }

            /**
             * <p>The available dimensions.</p>
             */
            public Builder dimensions(java.util.List<Integer> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.7-text-embedding</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public VisualEmbedderModels build() {
                return new VisualEmbedderModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationAvailableModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationAvailableModelsResponseBody</p>
     */
    public static class VisualLlmModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SupportedModalities")
        private java.util.List<String> supportedModalities;

        private VisualLlmModels(Builder builder) {
            this.name = builder.name;
            this.supportedModalities = builder.supportedModalities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisualLlmModels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return supportedModalities
         */
        public java.util.List<String> getSupportedModalities() {
            return this.supportedModalities;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> supportedModalities; 

            private Builder() {
            } 

            private Builder(VisualLlmModels model) {
                this.name = model.name;
                this.supportedModalities = model.supportedModalities;
            } 

            /**
             * <p>The model name.</p>
             * 
             * <strong>example:</strong>
             * <p>qwen3.6-flash</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The supported modalities.</p>
             */
            public Builder supportedModalities(java.util.List<String> supportedModalities) {
                this.supportedModalities = supportedModalities;
                return this;
            }

            public VisualLlmModels build() {
                return new VisualLlmModels(this);
            } 

        } 

    }
}
