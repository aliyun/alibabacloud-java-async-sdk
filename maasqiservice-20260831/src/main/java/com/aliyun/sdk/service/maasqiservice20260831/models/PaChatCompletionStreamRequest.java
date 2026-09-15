// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasqiservice20260831.models;

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
 * {@link PaChatCompletionStreamRequest} extends {@link RequestModel}
 *
 * <p>PaChatCompletionStreamRequest</p>
 */
public class PaChatCompletionStreamRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Agent-Api-Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIAgentApiKey;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Instance-Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String xQIInstanceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-QI-Session-Id")
    private String xQISessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("allowedTokenIds")
    private java.util.List<Long> allowedTokenIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("badWords")
    private java.util.List<String> badWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("chatTemplateKwargs")
    private ChatTemplateKwargs chatTemplateKwargs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("frequencyPenalty")
    private Double frequencyPenalty;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ignoreEos")
    private Boolean ignoreEos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeReasoning")
    private Boolean includeReasoning;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("logprobs")
    private Boolean logprobs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxCompletionTokens")
    private Long maxCompletionTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("maxTokens")
    private Long maxTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("minP")
    private Double minP;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("minTokens")
    private Long minTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mmProcessorKwargs")
    private MmProcessorKwargs mmProcessorKwargs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("n")
    private Long n;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parallelToolCalls")
    private Boolean parallelToolCalls;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("presencePenalty")
    private Double presencePenalty;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("promptLogprobs")
    private Long promptLogprobs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("reasoningEffort")
    private String reasoningEffort;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("repetitionPenalty")
    private Double repetitionPenalty;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("responseFormat")
    private ResponseFormat responseFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("seed")
    private Long seed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("skipSpecialTokens")
    private Boolean skipSpecialTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stop")
    private java.util.List<String> stop;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stopTokenIds")
    private java.util.List<Long> stopTokenIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("streamOptions")
    private StreamOptions streamOptions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("structuredOutputs")
    private StructuredOutputs structuredOutputs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("temperature")
    private Double temperature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("toolChoice")
    private String toolChoice;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tools")
    private java.util.List<Tools> tools;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topK")
    private Long topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topLogprobs")
    private Long topLogprobs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topP")
    private Double topP;

    private PaChatCompletionStreamRequest(Builder builder) {
        super(builder);
        this.xQIAgentApiKey = builder.xQIAgentApiKey;
        this.xQIInstanceId = builder.xQIInstanceId;
        this.xQISessionId = builder.xQISessionId;
        this.allowedTokenIds = builder.allowedTokenIds;
        this.badWords = builder.badWords;
        this.chatTemplateKwargs = builder.chatTemplateKwargs;
        this.frequencyPenalty = builder.frequencyPenalty;
        this.ignoreEos = builder.ignoreEos;
        this.includeReasoning = builder.includeReasoning;
        this.logprobs = builder.logprobs;
        this.maxCompletionTokens = builder.maxCompletionTokens;
        this.maxTokens = builder.maxTokens;
        this.messages = builder.messages;
        this.minP = builder.minP;
        this.minTokens = builder.minTokens;
        this.mmProcessorKwargs = builder.mmProcessorKwargs;
        this.model = builder.model;
        this.n = builder.n;
        this.parallelToolCalls = builder.parallelToolCalls;
        this.presencePenalty = builder.presencePenalty;
        this.promptLogprobs = builder.promptLogprobs;
        this.reasoningEffort = builder.reasoningEffort;
        this.repetitionPenalty = builder.repetitionPenalty;
        this.responseFormat = builder.responseFormat;
        this.seed = builder.seed;
        this.skipSpecialTokens = builder.skipSpecialTokens;
        this.stop = builder.stop;
        this.stopTokenIds = builder.stopTokenIds;
        this.stream = builder.stream;
        this.streamOptions = builder.streamOptions;
        this.structuredOutputs = builder.structuredOutputs;
        this.temperature = builder.temperature;
        this.toolChoice = builder.toolChoice;
        this.tools = builder.tools;
        this.topK = builder.topK;
        this.topLogprobs = builder.topLogprobs;
        this.topP = builder.topP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PaChatCompletionStreamRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xQIAgentApiKey
     */
    public String getXQIAgentApiKey() {
        return this.xQIAgentApiKey;
    }

    /**
     * @return xQIInstanceId
     */
    public String getXQIInstanceId() {
        return this.xQIInstanceId;
    }

    /**
     * @return xQISessionId
     */
    public String getXQISessionId() {
        return this.xQISessionId;
    }

    /**
     * @return allowedTokenIds
     */
    public java.util.List<Long> getAllowedTokenIds() {
        return this.allowedTokenIds;
    }

    /**
     * @return badWords
     */
    public java.util.List<String> getBadWords() {
        return this.badWords;
    }

    /**
     * @return chatTemplateKwargs
     */
    public ChatTemplateKwargs getChatTemplateKwargs() {
        return this.chatTemplateKwargs;
    }

    /**
     * @return frequencyPenalty
     */
    public Double getFrequencyPenalty() {
        return this.frequencyPenalty;
    }

    /**
     * @return ignoreEos
     */
    public Boolean getIgnoreEos() {
        return this.ignoreEos;
    }

    /**
     * @return includeReasoning
     */
    public Boolean getIncludeReasoning() {
        return this.includeReasoning;
    }

    /**
     * @return logprobs
     */
    public Boolean getLogprobs() {
        return this.logprobs;
    }

    /**
     * @return maxCompletionTokens
     */
    public Long getMaxCompletionTokens() {
        return this.maxCompletionTokens;
    }

    /**
     * @return maxTokens
     */
    public Long getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return minP
     */
    public Double getMinP() {
        return this.minP;
    }

    /**
     * @return minTokens
     */
    public Long getMinTokens() {
        return this.minTokens;
    }

    /**
     * @return mmProcessorKwargs
     */
    public MmProcessorKwargs getMmProcessorKwargs() {
        return this.mmProcessorKwargs;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return n
     */
    public Long getN() {
        return this.n;
    }

    /**
     * @return parallelToolCalls
     */
    public Boolean getParallelToolCalls() {
        return this.parallelToolCalls;
    }

    /**
     * @return presencePenalty
     */
    public Double getPresencePenalty() {
        return this.presencePenalty;
    }

    /**
     * @return promptLogprobs
     */
    public Long getPromptLogprobs() {
        return this.promptLogprobs;
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
    public Long getSeed() {
        return this.seed;
    }

    /**
     * @return skipSpecialTokens
     */
    public Boolean getSkipSpecialTokens() {
        return this.skipSpecialTokens;
    }

    /**
     * @return stop
     */
    public java.util.List<String> getStop() {
        return this.stop;
    }

    /**
     * @return stopTokenIds
     */
    public java.util.List<Long> getStopTokenIds() {
        return this.stopTokenIds;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return streamOptions
     */
    public StreamOptions getStreamOptions() {
        return this.streamOptions;
    }

    /**
     * @return structuredOutputs
     */
    public StructuredOutputs getStructuredOutputs() {
        return this.structuredOutputs;
    }

    /**
     * @return temperature
     */
    public Double getTemperature() {
        return this.temperature;
    }

    /**
     * @return toolChoice
     */
    public String getToolChoice() {
        return this.toolChoice;
    }

    /**
     * @return tools
     */
    public java.util.List<Tools> getTools() {
        return this.tools;
    }

    /**
     * @return topK
     */
    public Long getTopK() {
        return this.topK;
    }

    /**
     * @return topLogprobs
     */
    public Long getTopLogprobs() {
        return this.topLogprobs;
    }

    /**
     * @return topP
     */
    public Double getTopP() {
        return this.topP;
    }

    public static final class Builder extends Request.Builder<PaChatCompletionStreamRequest, Builder> {
        private String xQIAgentApiKey; 
        private String xQIInstanceId; 
        private String xQISessionId; 
        private java.util.List<Long> allowedTokenIds; 
        private java.util.List<String> badWords; 
        private ChatTemplateKwargs chatTemplateKwargs; 
        private Double frequencyPenalty; 
        private Boolean ignoreEos; 
        private Boolean includeReasoning; 
        private Boolean logprobs; 
        private Long maxCompletionTokens; 
        private Long maxTokens; 
        private java.util.List<Messages> messages; 
        private Double minP; 
        private Long minTokens; 
        private MmProcessorKwargs mmProcessorKwargs; 
        private String model; 
        private Long n; 
        private Boolean parallelToolCalls; 
        private Double presencePenalty; 
        private Long promptLogprobs; 
        private String reasoningEffort; 
        private Double repetitionPenalty; 
        private ResponseFormat responseFormat; 
        private Long seed; 
        private Boolean skipSpecialTokens; 
        private java.util.List<String> stop; 
        private java.util.List<Long> stopTokenIds; 
        private Boolean stream; 
        private StreamOptions streamOptions; 
        private StructuredOutputs structuredOutputs; 
        private Double temperature; 
        private String toolChoice; 
        private java.util.List<Tools> tools; 
        private Long topK; 
        private Long topLogprobs; 
        private Double topP; 

        private Builder() {
            super();
        } 

        private Builder(PaChatCompletionStreamRequest request) {
            super(request);
            this.xQIAgentApiKey = request.xQIAgentApiKey;
            this.xQIInstanceId = request.xQIInstanceId;
            this.xQISessionId = request.xQISessionId;
            this.allowedTokenIds = request.allowedTokenIds;
            this.badWords = request.badWords;
            this.chatTemplateKwargs = request.chatTemplateKwargs;
            this.frequencyPenalty = request.frequencyPenalty;
            this.ignoreEos = request.ignoreEos;
            this.includeReasoning = request.includeReasoning;
            this.logprobs = request.logprobs;
            this.maxCompletionTokens = request.maxCompletionTokens;
            this.maxTokens = request.maxTokens;
            this.messages = request.messages;
            this.minP = request.minP;
            this.minTokens = request.minTokens;
            this.mmProcessorKwargs = request.mmProcessorKwargs;
            this.model = request.model;
            this.n = request.n;
            this.parallelToolCalls = request.parallelToolCalls;
            this.presencePenalty = request.presencePenalty;
            this.promptLogprobs = request.promptLogprobs;
            this.reasoningEffort = request.reasoningEffort;
            this.repetitionPenalty = request.repetitionPenalty;
            this.responseFormat = request.responseFormat;
            this.seed = request.seed;
            this.skipSpecialTokens = request.skipSpecialTokens;
            this.stop = request.stop;
            this.stopTokenIds = request.stopTokenIds;
            this.stream = request.stream;
            this.streamOptions = request.streamOptions;
            this.structuredOutputs = request.structuredOutputs;
            this.temperature = request.temperature;
            this.toolChoice = request.toolChoice;
            this.tools = request.tools;
            this.topK = request.topK;
            this.topLogprobs = request.topLogprobs;
            this.topP = request.topP;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qis_xxx</p>
         */
        public Builder xQIAgentApiKey(String xQIAgentApiKey) {
            this.putHeaderParameter("X-QI-Agent-Api-Key", xQIAgentApiKey);
            this.xQIAgentApiKey = xQIAgentApiKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PA_xxx</p>
         */
        public Builder xQIInstanceId(String xQIInstanceId) {
            this.putHeaderParameter("X-QI-Instance-Id", xQIInstanceId);
            this.xQIInstanceId = xQIInstanceId;
            return this;
        }

        /**
         * X-QI-Session-Id.
         */
        public Builder xQISessionId(String xQISessionId) {
            this.putHeaderParameter("X-QI-Session-Id", xQISessionId);
            this.xQISessionId = xQISessionId;
            return this;
        }

        /**
         * allowedTokenIds.
         */
        public Builder allowedTokenIds(java.util.List<Long> allowedTokenIds) {
            this.putBodyParameter("allowedTokenIds", allowedTokenIds);
            this.allowedTokenIds = allowedTokenIds;
            return this;
        }

        /**
         * badWords.
         */
        public Builder badWords(java.util.List<String> badWords) {
            this.putBodyParameter("badWords", badWords);
            this.badWords = badWords;
            return this;
        }

        /**
         * chatTemplateKwargs.
         */
        public Builder chatTemplateKwargs(ChatTemplateKwargs chatTemplateKwargs) {
            this.putBodyParameter("chatTemplateKwargs", chatTemplateKwargs);
            this.chatTemplateKwargs = chatTemplateKwargs;
            return this;
        }

        /**
         * frequencyPenalty.
         */
        public Builder frequencyPenalty(Double frequencyPenalty) {
            this.putBodyParameter("frequencyPenalty", frequencyPenalty);
            this.frequencyPenalty = frequencyPenalty;
            return this;
        }

        /**
         * ignoreEos.
         */
        public Builder ignoreEos(Boolean ignoreEos) {
            this.putBodyParameter("ignoreEos", ignoreEos);
            this.ignoreEos = ignoreEos;
            return this;
        }

        /**
         * includeReasoning.
         */
        public Builder includeReasoning(Boolean includeReasoning) {
            this.putBodyParameter("includeReasoning", includeReasoning);
            this.includeReasoning = includeReasoning;
            return this;
        }

        /**
         * logprobs.
         */
        public Builder logprobs(Boolean logprobs) {
            this.putBodyParameter("logprobs", logprobs);
            this.logprobs = logprobs;
            return this;
        }

        /**
         * maxCompletionTokens.
         */
        public Builder maxCompletionTokens(Long maxCompletionTokens) {
            this.putBodyParameter("maxCompletionTokens", maxCompletionTokens);
            this.maxCompletionTokens = maxCompletionTokens;
            return this;
        }

        /**
         * maxTokens.
         */
        public Builder maxTokens(Long maxTokens) {
            this.putBodyParameter("maxTokens", maxTokens);
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * minP.
         */
        public Builder minP(Double minP) {
            this.putBodyParameter("minP", minP);
            this.minP = minP;
            return this;
        }

        /**
         * minTokens.
         */
        public Builder minTokens(Long minTokens) {
            this.putBodyParameter("minTokens", minTokens);
            this.minTokens = minTokens;
            return this;
        }

        /**
         * mmProcessorKwargs.
         */
        public Builder mmProcessorKwargs(MmProcessorKwargs mmProcessorKwargs) {
            this.putBodyParameter("mmProcessorKwargs", mmProcessorKwargs);
            this.mmProcessorKwargs = mmProcessorKwargs;
            return this;
        }

        /**
         * model.
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * n.
         */
        public Builder n(Long n) {
            this.putBodyParameter("n", n);
            this.n = n;
            return this;
        }

        /**
         * parallelToolCalls.
         */
        public Builder parallelToolCalls(Boolean parallelToolCalls) {
            this.putBodyParameter("parallelToolCalls", parallelToolCalls);
            this.parallelToolCalls = parallelToolCalls;
            return this;
        }

        /**
         * presencePenalty.
         */
        public Builder presencePenalty(Double presencePenalty) {
            this.putBodyParameter("presencePenalty", presencePenalty);
            this.presencePenalty = presencePenalty;
            return this;
        }

        /**
         * promptLogprobs.
         */
        public Builder promptLogprobs(Long promptLogprobs) {
            this.putBodyParameter("promptLogprobs", promptLogprobs);
            this.promptLogprobs = promptLogprobs;
            return this;
        }

        /**
         * reasoningEffort.
         */
        public Builder reasoningEffort(String reasoningEffort) {
            this.putBodyParameter("reasoningEffort", reasoningEffort);
            this.reasoningEffort = reasoningEffort;
            return this;
        }

        /**
         * repetitionPenalty.
         */
        public Builder repetitionPenalty(Double repetitionPenalty) {
            this.putBodyParameter("repetitionPenalty", repetitionPenalty);
            this.repetitionPenalty = repetitionPenalty;
            return this;
        }

        /**
         * responseFormat.
         */
        public Builder responseFormat(ResponseFormat responseFormat) {
            this.putBodyParameter("responseFormat", responseFormat);
            this.responseFormat = responseFormat;
            return this;
        }

        /**
         * seed.
         */
        public Builder seed(Long seed) {
            this.putBodyParameter("seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * skipSpecialTokens.
         */
        public Builder skipSpecialTokens(Boolean skipSpecialTokens) {
            this.putBodyParameter("skipSpecialTokens", skipSpecialTokens);
            this.skipSpecialTokens = skipSpecialTokens;
            return this;
        }

        /**
         * stop.
         */
        public Builder stop(java.util.List<String> stop) {
            this.putBodyParameter("stop", stop);
            this.stop = stop;
            return this;
        }

        /**
         * stopTokenIds.
         */
        public Builder stopTokenIds(java.util.List<Long> stopTokenIds) {
            this.putBodyParameter("stopTokenIds", stopTokenIds);
            this.stopTokenIds = stopTokenIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * streamOptions.
         */
        public Builder streamOptions(StreamOptions streamOptions) {
            this.putBodyParameter("streamOptions", streamOptions);
            this.streamOptions = streamOptions;
            return this;
        }

        /**
         * structuredOutputs.
         */
        public Builder structuredOutputs(StructuredOutputs structuredOutputs) {
            this.putBodyParameter("structuredOutputs", structuredOutputs);
            this.structuredOutputs = structuredOutputs;
            return this;
        }

        /**
         * temperature.
         */
        public Builder temperature(Double temperature) {
            this.putBodyParameter("temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * toolChoice.
         */
        public Builder toolChoice(String toolChoice) {
            this.putBodyParameter("toolChoice", toolChoice);
            this.toolChoice = toolChoice;
            return this;
        }

        /**
         * tools.
         */
        public Builder tools(java.util.List<Tools> tools) {
            this.putBodyParameter("tools", tools);
            this.tools = tools;
            return this;
        }

        /**
         * topK.
         */
        public Builder topK(Long topK) {
            this.putBodyParameter("topK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * topLogprobs.
         */
        public Builder topLogprobs(Long topLogprobs) {
            this.putBodyParameter("topLogprobs", topLogprobs);
            this.topLogprobs = topLogprobs;
            return this;
        }

        /**
         * topP.
         */
        public Builder topP(Double topP) {
            this.putBodyParameter("topP", topP);
            this.topP = topP;
            return this;
        }

        @Override
        public PaChatCompletionStreamRequest build() {
            return new PaChatCompletionStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class ChatTemplateKwargs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableThinking")
        private Boolean enableThinking;

        @com.aliyun.core.annotation.NameInMap("preserveThinking")
        private Boolean preserveThinking;

        private ChatTemplateKwargs(Builder builder) {
            this.enableThinking = builder.enableThinking;
            this.preserveThinking = builder.preserveThinking;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatTemplateKwargs create() {
            return builder().build();
        }

        /**
         * @return enableThinking
         */
        public Boolean getEnableThinking() {
            return this.enableThinking;
        }

        /**
         * @return preserveThinking
         */
        public Boolean getPreserveThinking() {
            return this.preserveThinking;
        }

        public static final class Builder {
            private Boolean enableThinking; 
            private Boolean preserveThinking; 

            private Builder() {
            } 

            private Builder(ChatTemplateKwargs model) {
                this.enableThinking = model.enableThinking;
                this.preserveThinking = model.preserveThinking;
            } 

            /**
             * enableThinking.
             */
            public Builder enableThinking(Boolean enableThinking) {
                this.enableThinking = enableThinking;
                return this;
            }

            /**
             * preserveThinking.
             */
            public Builder preserveThinking(Boolean preserveThinking) {
                this.preserveThinking = preserveThinking;
                return this;
            }

            public ChatTemplateKwargs build() {
                return new ChatTemplateKwargs(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class ImageUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private ImageUrl(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ImageUrl create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(ImageUrl model) {
                this.url = model.url;
            } 

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public ImageUrl build() {
                return new ImageUrl(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private ImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Content(Builder builder) {
            this.imageUrl = builder.imageUrl;
            this.text = builder.text;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return imageUrl
         */
        public ImageUrl getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ImageUrl imageUrl; 
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.imageUrl = model.imageUrl;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * imageUrl.
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Function(Builder builder) {
            this.arguments = builder.arguments;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String arguments; 
            private String name; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.arguments = model.arguments;
                this.name = model.name;
            } 

            /**
             * arguments.
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class ToolCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private Function function;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ToolCalls(Builder builder) {
            this.function = builder.function;
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCalls create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public Function getFunction() {
            return this.function;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Function function; 
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(ToolCalls model) {
                this.function = model.function;
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * function.
             */
            public Builder function(Function function) {
                this.function = function;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ToolCalls build() {
                return new ToolCalls(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("toolCallId")
        private String toolCallId;

        @com.aliyun.core.annotation.NameInMap("toolCalls")
        private java.util.List<ToolCalls> toolCalls;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
            this.toolCallId = builder.toolCallId;
            this.toolCalls = builder.toolCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List<Content> getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return toolCallId
         */
        public String getToolCallId() {
            return this.toolCallId;
        }

        /**
         * @return toolCalls
         */
        public java.util.List<ToolCalls> getToolCalls() {
            return this.toolCalls;
        }

        public static final class Builder {
            private java.util.List<Content> content; 
            private String role; 
            private String toolCallId; 
            private java.util.List<ToolCalls> toolCalls; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
                this.toolCallId = model.toolCallId;
                this.toolCalls = model.toolCalls;
            } 

            /**
             * content.
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * toolCallId.
             */
            public Builder toolCallId(String toolCallId) {
                this.toolCallId = toolCallId;
                return this;
            }

            /**
             * toolCalls.
             */
            public Builder toolCalls(java.util.List<ToolCalls> toolCalls) {
                this.toolCalls = toolCalls;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class MmProcessorKwargs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("maxDynamicPatch")
        private Long maxDynamicPatch;

        private MmProcessorKwargs(Builder builder) {
            this.maxDynamicPatch = builder.maxDynamicPatch;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MmProcessorKwargs create() {
            return builder().build();
        }

        /**
         * @return maxDynamicPatch
         */
        public Long getMaxDynamicPatch() {
            return this.maxDynamicPatch;
        }

        public static final class Builder {
            private Long maxDynamicPatch; 

            private Builder() {
            } 

            private Builder(MmProcessorKwargs model) {
                this.maxDynamicPatch = model.maxDynamicPatch;
            } 

            /**
             * maxDynamicPatch.
             */
            public Builder maxDynamicPatch(Long maxDynamicPatch) {
                this.maxDynamicPatch = maxDynamicPatch;
                return this;
            }

            public MmProcessorKwargs build() {
                return new MmProcessorKwargs(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class ResponseFormat extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ResponseFormat(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseFormat create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            private Builder() {
            } 

            private Builder(ResponseFormat model) {
                this.type = model.type;
            } 

            /**
             * type.
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
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class StreamOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("includeUsage")
        private Boolean includeUsage;

        private StreamOptions(Builder builder) {
            this.includeUsage = builder.includeUsage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamOptions create() {
            return builder().build();
        }

        /**
         * @return includeUsage
         */
        public Boolean getIncludeUsage() {
            return this.includeUsage;
        }

        public static final class Builder {
            private Boolean includeUsage; 

            private Builder() {
            } 

            private Builder(StreamOptions model) {
                this.includeUsage = model.includeUsage;
            } 

            /**
             * includeUsage.
             */
            public Builder includeUsage(Boolean includeUsage) {
                this.includeUsage = includeUsage;
                return this;
            }

            public StreamOptions build() {
                return new StreamOptions(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class StructuredOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("choice")
        private java.util.List<String> choice;

        private StructuredOutputs(Builder builder) {
            this.choice = builder.choice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StructuredOutputs create() {
            return builder().build();
        }

        /**
         * @return choice
         */
        public java.util.List<String> getChoice() {
            return this.choice;
        }

        public static final class Builder {
            private java.util.List<String> choice; 

            private Builder() {
            } 

            private Builder(StructuredOutputs model) {
                this.choice = model.choice;
            } 

            /**
             * choice.
             */
            public Builder choice(java.util.List<String> choice) {
                this.choice = choice;
                return this;
            }

            public StructuredOutputs build() {
                return new StructuredOutputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class City extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private City(Builder builder) {
            this.description = builder.description;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static City create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String type; 

            private Builder() {
            } 

            private Builder(City model) {
                this.description = model.description;
                this.type = model.type;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public City build() {
                return new City(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class Properties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("city")
        private City city;

        private Properties(Builder builder) {
            this.city = builder.city;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Properties create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public City getCity() {
            return this.city;
        }

        public static final class Builder {
            private City city; 

            private Builder() {
            } 

            private Builder(Properties model) {
                this.city = model.city;
            } 

            /**
             * city.
             */
            public Builder city(City city) {
                this.city = city;
                return this;
            }

            public Properties build() {
                return new Properties(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("properties")
        private Properties properties;

        @com.aliyun.core.annotation.NameInMap("required")
        private java.util.List<String> required;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Parameters(Builder builder) {
            this.properties = builder.properties;
            this.required = builder.required;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return properties
         */
        public Properties getProperties() {
            return this.properties;
        }

        /**
         * @return required
         */
        public java.util.List<String> getRequired() {
            return this.required;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Properties properties; 
            private java.util.List<String> required; 
            private String type; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.properties = model.properties;
                this.required = model.required;
                this.type = model.type;
            } 

            /**
             * properties.
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * required.
             */
            public Builder required(java.util.List<String> required) {
                this.required = required;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class ToolsFunction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private Parameters parameters;

        @com.aliyun.core.annotation.NameInMap("strict")
        private Boolean strict;

        private ToolsFunction(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.strict = builder.strict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolsFunction create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        /**
         * @return strict
         */
        public Boolean getStrict() {
            return this.strict;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Parameters parameters; 
            private Boolean strict; 

            private Builder() {
            } 

            private Builder(ToolsFunction model) {
                this.description = model.description;
                this.name = model.name;
                this.parameters = model.parameters;
                this.strict = model.strict;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * strict.
             */
            public Builder strict(Boolean strict) {
                this.strict = strict;
                return this;
            }

            public ToolsFunction build() {
                return new ToolsFunction(this);
            } 

        } 

    }
    /**
     * 
     * {@link PaChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>PaChatCompletionStreamRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private ToolsFunction function;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Tools(Builder builder) {
            this.function = builder.function;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public ToolsFunction getFunction() {
            return this.function;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private ToolsFunction function; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.function = model.function;
                this.type = model.type;
            } 

            /**
             * function.
             */
            public Builder function(ToolsFunction function) {
                this.function = function;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
}
