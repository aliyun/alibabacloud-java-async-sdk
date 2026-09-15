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
 * {@link GuiChatCompletionStreamRequest} extends {@link RequestModel}
 *
 * <p>GuiChatCompletionStreamRequest</p>
 */
public class GuiChatCompletionStreamRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("metadata")
    private Metadata metadata;

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
    @com.aliyun.core.annotation.NameInMap("topK")
    private Long topK;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topLogprobs")
    private Long topLogprobs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("topP")
    private Double topP;

    private GuiChatCompletionStreamRequest(Builder builder) {
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
        this.metadata = builder.metadata;
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
        this.topK = builder.topK;
        this.topLogprobs = builder.topLogprobs;
        this.topP = builder.topP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GuiChatCompletionStreamRequest create() {
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
     * @return metadata
     */
    public Metadata getMetadata() {
        return this.metadata;
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

    public static final class Builder extends Request.Builder<GuiChatCompletionStreamRequest, Builder> {
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
        private Metadata metadata; 
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
        private Long topK; 
        private Long topLogprobs; 
        private Double topP; 

        private Builder() {
            super();
        } 

        private Builder(GuiChatCompletionStreamRequest request) {
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
            this.metadata = request.metadata;
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
         * <p>GUI_xxx</p>
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
         * metadata.
         */
        public Builder metadata(Metadata metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
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
        public GuiChatCompletionStreamRequest build() {
            return new GuiChatCompletionStreamRequest(this);
        } 

    } 

    /**
     * 
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
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
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
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
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("imageData")
        private String imageData;

        @com.aliyun.core.annotation.NameInMap("imageUrl")
        private ImageUrl imageUrl;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Content(Builder builder) {
            this.imageData = builder.imageData;
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
         * @return imageData
         */
        public String getImageData() {
            return this.imageData;
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
            private String imageData; 
            private ImageUrl imageUrl; 
            private String text; 
            private String type; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.imageData = model.imageData;
                this.imageUrl = model.imageUrl;
                this.text = model.text;
                this.type = model.type;
            } 

            /**
             * imageData.
             */
            public Builder imageData(String imageData) {
                this.imageData = imageData;
                return this;
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
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private java.util.List<Content> content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("toolCallId")
        private String toolCallId;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
            this.toolCallId = builder.toolCallId;
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

        public static final class Builder {
            private java.util.List<Content> content; 
            private String role; 
            private String toolCallId; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
                this.toolCallId = model.toolCallId;
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

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
     */
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("appList")
        private java.util.List<String> appList;

        @com.aliyun.core.annotation.NameInMap("availableApps")
        private java.util.List<String> availableApps;

        @com.aliyun.core.annotation.NameInMap("harnessMessage")
        private String harnessMessage;

        @com.aliyun.core.annotation.NameInMap("screenHeight")
        private Long screenHeight;

        @com.aliyun.core.annotation.NameInMap("screenWidth")
        private Long screenWidth;

        private Metadata(Builder builder) {
            this.appList = builder.appList;
            this.availableApps = builder.availableApps;
            this.harnessMessage = builder.harnessMessage;
            this.screenHeight = builder.screenHeight;
            this.screenWidth = builder.screenWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return appList
         */
        public java.util.List<String> getAppList() {
            return this.appList;
        }

        /**
         * @return availableApps
         */
        public java.util.List<String> getAvailableApps() {
            return this.availableApps;
        }

        /**
         * @return harnessMessage
         */
        public String getHarnessMessage() {
            return this.harnessMessage;
        }

        /**
         * @return screenHeight
         */
        public Long getScreenHeight() {
            return this.screenHeight;
        }

        /**
         * @return screenWidth
         */
        public Long getScreenWidth() {
            return this.screenWidth;
        }

        public static final class Builder {
            private java.util.List<String> appList; 
            private java.util.List<String> availableApps; 
            private String harnessMessage; 
            private Long screenHeight; 
            private Long screenWidth; 

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.appList = model.appList;
                this.availableApps = model.availableApps;
                this.harnessMessage = model.harnessMessage;
                this.screenHeight = model.screenHeight;
                this.screenWidth = model.screenWidth;
            } 

            /**
             * appList.
             */
            public Builder appList(java.util.List<String> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * availableApps.
             */
            public Builder availableApps(java.util.List<String> availableApps) {
                this.availableApps = availableApps;
                return this;
            }

            /**
             * harnessMessage.
             */
            public Builder harnessMessage(String harnessMessage) {
                this.harnessMessage = harnessMessage;
                return this;
            }

            /**
             * screenHeight.
             */
            public Builder screenHeight(Long screenHeight) {
                this.screenHeight = screenHeight;
                return this;
            }

            /**
             * screenWidth.
             */
            public Builder screenWidth(Long screenWidth) {
                this.screenWidth = screenWidth;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
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
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
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
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
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
     * {@link GuiChatCompletionStreamRequest} extends {@link TeaModel}
     *
     * <p>GuiChatCompletionStreamRequest</p>
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
}
