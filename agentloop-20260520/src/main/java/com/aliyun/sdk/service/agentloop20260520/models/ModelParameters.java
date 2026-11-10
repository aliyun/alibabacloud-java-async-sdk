// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link ModelParameters} extends {@link TeaModel}
 *
 * <p>ModelParameters</p>
 */
public class ModelParameters extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableCacheControl")
    private Boolean enableCacheControl;

    @com.aliyun.core.annotation.NameInMap("enableThinking")
    private Boolean enableThinking;

    @com.aliyun.core.annotation.NameInMap("extraBody")
    private String extraBody;

    @com.aliyun.core.annotation.NameInMap("frequencyPenalty")
    private Float frequencyPenalty;

    @com.aliyun.core.annotation.NameInMap("maxCompletionTokens")
    private Integer maxCompletionTokens;

    @com.aliyun.core.annotation.NameInMap("maxTokens")
    private Long maxTokens;

    @com.aliyun.core.annotation.NameInMap("presencePenalty")
    private Float presencePenalty;

    @com.aliyun.core.annotation.NameInMap("reasoningEffort")
    private String reasoningEffort;

    @com.aliyun.core.annotation.NameInMap("repetitionPenalty")
    private Double repetitionPenalty;

    @com.aliyun.core.annotation.NameInMap("responseFormat")
    private ResponseFormat responseFormat;

    @com.aliyun.core.annotation.NameInMap("seed")
    private Integer seed;

    @com.aliyun.core.annotation.NameInMap("stopSequences")
    private java.util.List<String> stopSequences;

    @com.aliyun.core.annotation.NameInMap("temperature")
    private Float temperature;

    @com.aliyun.core.annotation.NameInMap("thinkingBudget")
    private Integer thinkingBudget;

    @com.aliyun.core.annotation.NameInMap("topK")
    private Integer topK;

    @com.aliyun.core.annotation.NameInMap("topP")
    private Float topP;

    private ModelParameters(Builder builder) {
        this.enableCacheControl = builder.enableCacheControl;
        this.enableThinking = builder.enableThinking;
        this.extraBody = builder.extraBody;
        this.frequencyPenalty = builder.frequencyPenalty;
        this.maxCompletionTokens = builder.maxCompletionTokens;
        this.maxTokens = builder.maxTokens;
        this.presencePenalty = builder.presencePenalty;
        this.reasoningEffort = builder.reasoningEffort;
        this.repetitionPenalty = builder.repetitionPenalty;
        this.responseFormat = builder.responseFormat;
        this.seed = builder.seed;
        this.stopSequences = builder.stopSequences;
        this.temperature = builder.temperature;
        this.thinkingBudget = builder.thinkingBudget;
        this.topK = builder.topK;
        this.topP = builder.topP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelParameters create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableCacheControl
     */
    public Boolean getEnableCacheControl() {
        return this.enableCacheControl;
    }

    /**
     * @return enableThinking
     */
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    /**
     * @return extraBody
     */
    public String getExtraBody() {
        return this.extraBody;
    }

    /**
     * @return frequencyPenalty
     */
    public Float getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    /**
     * @return maxCompletionTokens
     */
    public Integer getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }

    /**
     * @return maxTokens
     */
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * @return presencePenalty
     */
    public Float getPresencePenalty() {
        return this.presencePenalty;
    }

    /**
     * @return reasoningEffort
     */
    public String getReasoningEffort() {
        return this.reasoningEffort;
    }

    /**
     * @return repetitionPenalty
     */
    public Double getRepetitionPenalty() {
        return this.repetitionPenalty;
    }

    /**
     * @return responseFormat
     */
    public ResponseFormat getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * @return seed
     */
    public Integer getSeed() {
        return this.seed;
    }

    /**
     * @return stopSequences
     */
    public java.util.List<String> getStopSequences() {
        return this.stopSequences;
    }

    /**
     * @return temperature
     */
    public Float getTemperature() {
        return this.temperature;
    }

    /**
     * @return thinkingBudget
     */
    public Integer getThinkingBudget() {
        return this.thinkingBudget;
    }

    /**
     * @return topK
     */
    public Integer getTopK() {
        return this.topK;
    }

    /**
     * @return topP
     */
    public Float getTopP() {
        return this.topP;
    }

    public static final class Builder {
        private Boolean enableCacheControl; 
        private Boolean enableThinking; 
        private String extraBody; 
        private Float frequencyPenalty; 
        private Integer maxCompletionTokens; 
        private Long maxTokens; 
        private Float presencePenalty; 
        private String reasoningEffort; 
        private Double repetitionPenalty; 
        private ResponseFormat responseFormat; 
        private Integer seed; 
        private java.util.List<String> stopSequences; 
        private Float temperature; 
        private Integer thinkingBudget; 
        private Integer topK; 
        private Float topP; 

        private Builder() {
        } 

        private Builder(ModelParameters model) {
            this.enableCacheControl = model.enableCacheControl;
            this.enableThinking = model.enableThinking;
            this.extraBody = model.extraBody;
            this.frequencyPenalty = model.frequencyPenalty;
            this.maxCompletionTokens = model.maxCompletionTokens;
            this.maxTokens = model.maxTokens;
            this.presencePenalty = model.presencePenalty;
            this.reasoningEffort = model.reasoningEffort;
            this.repetitionPenalty = model.repetitionPenalty;
            this.responseFormat = model.responseFormat;
            this.seed = model.seed;
            this.stopSequences = model.stopSequences;
            this.temperature = model.temperature;
            this.thinkingBudget = model.thinkingBudget;
            this.topK = model.topK;
            this.topP = model.topP;
        } 

        /**
         * <p>Specifies whether to enable explicit caching for system messages.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableCacheControl(Boolean enableCacheControl) {
            this.enableCacheControl = enableCacheControl;
            return this;
        }

        /**
         * <p>Specifies whether to enable thinking mode. This takes effect only for hybrid thinking models and defaults to false if not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableThinking(Boolean enableThinking) {
            this.enableThinking = enableThinking;
            return this;
        }

        /**
         * <p>The extended parameters, which are a serialized string of a JSON object. These are merged into the top level of the model request body to pass through other Model Studio parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enable_search&quot;:false}</p>
         */
        public Builder extraBody(String extraBody) {
            this.extraBody = extraBody;
            return this;
        }

        /**
         * <p>The frequency penalty where positive values reduce repetition, with a range of -2.0 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        public Builder frequencyPenalty(Float frequencyPenalty) {
            this.frequencyPenalty = frequencyPenalty;
            return this;
        }

        /**
         * <p>The maximum number of output tokens, including the chain-of-thought and the response. This is recommended for thinking models.</p>
         * 
         * <strong>example:</strong>
         * <p>4096</p>
         */
        public Builder maxCompletionTokens(Integer maxCompletionTokens) {
            this.maxCompletionTokens = maxCompletionTokens;
            return this;
        }

        /**
         * <p>The maximum number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder maxTokens(Long maxTokens) {
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * <p>The presence penalty where positive values encourage new topics, with a range of -2.0 to 2.0.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        public Builder presencePenalty(Float presencePenalty) {
            this.presencePenalty = presencePenalty;
            return this;
        }

        /**
         * <p>The reasoning effort level. This takes effect only when thinking mode is enabled. For the Qwen3.8 series, valid values are low, medium, and xhigh. This cannot be set simultaneously with thinkingBudget.</p>
         * 
         * <strong>example:</strong>
         * <p>low</p>
         */
        public Builder reasoningEffort(String reasoningEffort) {
            this.reasoningEffort = reasoningEffort;
            return this;
        }

        /**
         * <p>The repetition penalty that controls the repetition of consecutive sequences. The value must be greater than 0. A value of 1.0 indicates no penalty, and a larger value results in less repetition.</p>
         * 
         * <strong>example:</strong>
         * <p>1.05</p>
         */
        public Builder repetitionPenalty(Double repetitionPenalty) {
            this.repetitionPenalty = repetitionPenalty;
            return this;
        }

        /**
         * <p>The response content format, which defaults to text if not specified.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;json_schema&quot;,&quot;jsonSchema&quot;:{&quot;name&quot;:&quot;answer&quot;,&quot;strict&quot;:true,&quot;schema&quot;:&quot;{\&quot;type\&quot;:\&quot;object\&quot;,\&quot;properties\&quot;:{\&quot;answer\&quot;:{\&quot;type\&quot;:\&quot;string\&quot;}},\&quot;required\&quot;:[\&quot;answer\&quot;]}&quot;}}</p>
         */
        public Builder responseFormat(ResponseFormat responseFormat) {
            this.responseFormat = responseFormat;
            return this;
        }

        /**
         * <p>The random seed, with a range of 0 to 2147483647, which attempts to return the same result for the same input and parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder seed(Integer seed) {
            this.seed = seed;
            return this;
        }

        /**
         * <p>The stop sequences that immediately halt generation when encountered.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;END&quot;]</p>
         */
        public Builder stopSequences(java.util.List<String> stopSequences) {
            this.stopSequences = stopSequences;
            return this;
        }

        /**
         * <p>The temperature parameter that controls the randomness of the output, with a range of 0 to 2.</p>
         * 
         * <strong>example:</strong>
         * <p>0.7</p>
         */
        public Builder temperature(Float temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * <p>The maximum number of tokens for the thinking process. This takes effect only when thinking mode is enabled and cannot be set simultaneously with reasoningEffort.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder thinkingBudget(Integer thinkingBudget) {
            this.thinkingBudget = thinkingBudget;
            return this;
        }

        /**
         * <p>The Top K sampling parameter, with a range of 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder topK(Integer topK) {
            this.topK = topK;
            return this;
        }

        /**
         * <p>The Top P sampling parameter, with a range of 0 to 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
         */
        public Builder topP(Float topP) {
            this.topP = topP;
            return this;
        }

        public ModelParameters build() {
            return new ModelParameters(this);
        } 

    } 

    /**
     * 
     * {@link ModelParameters} extends {@link TeaModel}
     *
     * <p>ModelParameters</p>
     */
    public static class JsonSchema extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("strict")
        private Boolean strict;

        private JsonSchema(Builder builder) {
            this.name = builder.name;
            this.schema = builder.schema;
            this.strict = builder.strict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JsonSchema create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return strict
         */
        public Boolean getStrict() {
            return this.strict;
        }

        public static final class Builder {
            private String name; 
            private String schema; 
            private Boolean strict; 

            private Builder() {
            } 

            private Builder(JsonSchema model) {
                this.name = model.name;
                this.schema = model.schema;
                this.strict = model.strict;
            } 

            /**
             * <p>The schema name.</p>
             * 
             * <strong>example:</strong>
             * <p>answer</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The JSON Schema definition, which is a serialized string of a JSON object.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;answer&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;answer&quot;]}</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>Specifies whether to strictly adhere to the schema structure. Set this to true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            public JsonSchema build() {
                return new JsonSchema(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModelParameters} extends {@link TeaModel}
     *
     * <p>ModelParameters</p>
     */
    public static class ResponseFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jsonSchema")
        private JsonSchema jsonSchema;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ResponseFormat(Builder builder) {
            this.jsonSchema = builder.jsonSchema;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseFormat create() {
            return builder().build();
        }

        /**
         * @return jsonSchema
         */
        public JsonSchema getJsonSchema() {
            return this.jsonSchema;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private JsonSchema jsonSchema; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResponseFormat model) {
                this.jsonSchema = model.jsonSchema;
                this.type = model.type;
            } 

            /**
             * <p>The JSON Schema constraint, which is required when the type is json_schema.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;answer&quot;,&quot;strict&quot;:true,&quot;schema&quot;:&quot;{\&quot;type\&quot;:\&quot;object\&quot;,\&quot;properties\&quot;:{\&quot;answer\&quot;:{\&quot;type\&quot;:\&quot;string\&quot;}},\&quot;required\&quot;:[\&quot;answer\&quot;]}&quot;}</p>
             */
            public Builder jsonSchema(JsonSchema jsonSchema) {
                this.jsonSchema = jsonSchema;
                return this;
            }

            /**
             * <p>The format type. Valid values: text, json_object, and json_schema. When using json_object, the prompt must explicitly request JSON output.</p>
             * 
             * <strong>example:</strong>
             * <p>json_object</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResponseFormat build() {
                return new ResponseFormat(this);
            } 

        } 

    }
}
