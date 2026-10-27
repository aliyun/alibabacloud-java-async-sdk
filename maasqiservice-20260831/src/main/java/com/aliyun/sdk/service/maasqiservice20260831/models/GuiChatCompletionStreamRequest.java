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
         * <p>The access key of the agent instance, which is used to authenticate QICloud Customer API operations.</p>
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
         * <p>The ID of the published Mobile-Use Agent instance. This ID must correspond to the X-QI-Agent-Api-Key.</p>
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
         * <p>The optional session identifier. You can omit this parameter in the first step, and it is generated by the server. You must pass back the same value in subsequent Mobile-Use Agent steps to continue the state.</p>
         * 
         * <strong>example:</strong>
         * <p>session-xxx</p>
         */
        public Builder xQISessionId(String xQISessionId) {
            this.putHeaderParameter("X-QI-Session-Id", xQISessionId);
            this.xQISessionId = xQISessionId;
            return this;
        }

        /**
         * <p>The whitelist of token IDs that are allowed to be generated.</p>
         * 
         * <strong>example:</strong>
         * <p>[10,11]</p>
         */
        public Builder allowedTokenIds(java.util.List<Long> allowedTokenIds) {
            this.putBodyParameter("allowedTokenIds", allowedTokenIds);
            this.allowedTokenIds = allowedTokenIds;
            return this;
        }

        /**
         * <p>The list of words or strings that are banned from being generated.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;blocked&quot;]</p>
         */
        public Builder badWords(java.util.List<String> badWords) {
            this.putBodyParameter("badWords", badWords);
            this.badWords = badWords;
            return this;
        }

        /**
         * <p>The vLLM or OpenAI-compatible template parameter object. The request values override the default values with the same names in the model and are passed as-is to the primary model of the Mobile-Use Agent.</p>
         */
        public Builder chatTemplateKwargs(ChatTemplateKwargs chatTemplateKwargs) {
            this.putBodyParameter("chatTemplateKwargs", chatTemplateKwargs);
            this.chatTemplateKwargs = chatTemplateKwargs;
            return this;
        }

        /**
         * <p>The frequency penalty parameter, which is passed through to the primary model of the Mobile-Use Agent.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder frequencyPenalty(Double frequencyPenalty) {
            this.putBodyParameter("frequencyPenalty", frequencyPenalty);
            this.frequencyPenalty = frequencyPenalty;
            return this;
        }

        /**
         * <p>Specifies whether to ignore the end-of-sequence (EOS) token and continue generation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder ignoreEos(Boolean ignoreEos) {
            this.putBodyParameter("ignoreEos", ignoreEos);
            this.ignoreEos = ignoreEos;
            return this;
        }

        /**
         * <p>Specifies whether to request the upstream to generate the reasoning field. The client-facing results of the Mobile-Use Agent do not directly expose internal thinking.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeReasoning(Boolean includeReasoning) {
            this.putBodyParameter("includeReasoning", includeReasoning);
            this.includeReasoning = includeReasoning;
            return this;
        }

        /**
         * <p>The model compatibility parameter. The JSON field is logprobs. Whether this parameter is accepted and takes effect depends on the model used by the instance. The current Mobile-Use Agent response does not provide token log probability details.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder logprobs(Boolean logprobs) {
            this.putBodyParameter("logprobs", logprobs);
            this.logprobs = logprobs;
            return this;
        }

        /**
         * <p>The OpenAI-compatible maximum number of completion tokens. If provided, the value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder maxCompletionTokens(Long maxCompletionTokens) {
            this.putBodyParameter("maxCompletionTokens", maxCompletionTokens);
            this.maxCompletionTokens = maxCompletionTokens;
            return this;
        }

        /**
         * <p>The OpenAI-compatible maximum number of generated tokens. If provided, the value must be greater than 0.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        public Builder maxTokens(Long maxTokens) {
            this.putBodyParameter("maxTokens", maxTokens);
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * <p>The messages for the current Mobile-Use Agent step. The first step can only contain one user message. Subsequent steps can only contain one tool message followed by one user message. Complete multi-round history is not allowed.</p>
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The metadata for the Mobile-Use Agent step. Supports screen_width, screen_height, available_apps, and the compatibility field harness_message. The tool receipt and harness_message cannot be passed at the same time.</p>
         */
        public Builder metadata(Metadata metadata) {
            this.putBodyParameter("metadata", metadata);
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The vLLM Min-P sampling parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>0.05</p>
         */
        public Builder minP(Double minP) {
            this.putBodyParameter("minP", minP);
            this.minP = minP;
            return this;
        }

        /**
         * <p>The minimum number of tokens to generate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minTokens(Long minTokens) {
            this.putBodyParameter("minTokens", minTokens);
            this.minTokens = minTokens;
            return this;
        }

        /**
         * <p>The multimodal preprocessor parameters, passed through to the Mobile-Use Agent primary model as-is by key.</p>
         */
        public Builder mmProcessorKwargs(MmProcessorKwargs mmProcessorKwargs) {
            this.putBodyParameter("mmProcessorKwargs", mmProcessorKwargs);
            this.mmProcessorKwargs = mmProcessorKwargs;
            return this;
        }

        /**
         * <p>Reserved for OpenAI client compatibility. This parameter is ignored during routing. The model is determined by the published configuration of the instance, and the model field in the response is always an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot; &quot;</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Set this parameter to 1. Whether this parameter is accepted depends on the model. The current Mobile-Use Agent response does not return multiple candidate actions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder n(Long n) {
            this.putBodyParameter("n", n);
            this.n = n;
            return this;
        }

        /**
         * <p>The model-compatible switch to invoke parallel tool calling. This parameter does not expand the set of Mobile-Use Agent actions active for this operation.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder parallelToolCalls(Boolean parallelToolCalls) {
            this.putBodyParameter("parallelToolCalls", parallelToolCalls);
            this.parallelToolCalls = parallelToolCalls;
            return this;
        }

        /**
         * <p>The presence penalty parameter, passed through to the Mobile-Use Agent primary model.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder presencePenalty(Double presencePenalty) {
            this.putBodyParameter("presencePenalty", presencePenalty);
            this.presencePenalty = presencePenalty;
            return this;
        }

        /**
         * <p>A model-compatible parameter. The JSON field is prompt_logprobs. Whether this parameter is accepted depends on the model. The current Mobile-Use Agent response does not return input token probability details.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder promptLogprobs(Long promptLogprobs) {
            this.putBodyParameter("promptLogprobs", promptLogprobs);
            this.promptLogprobs = promptLogprobs;
            return this;
        }

        /**
         * <p>The OpenAI-compatible reasoning effort, such as low, medium, or high.</p>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        public Builder reasoningEffort(String reasoningEffort) {
            this.putBodyParameter("reasoningEffort", reasoningEffort);
            this.reasoningEffort = reasoningEffort;
            return this;
        }

        /**
         * <p>The vLLM repetition penalty parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1</p>
         */
        public Builder repetitionPenalty(Double repetitionPenalty) {
            this.putBodyParameter("repetitionPenalty", repetitionPenalty);
            this.repetitionPenalty = repetitionPenalty;
            return this;
        }

        /**
         * <p>The model-compatible structured output options. This parameter does not change the final Mobile-Use Agent tool calling structure when you invoke this operation. Avoid output constraint Settings that conflict with the action protocol.</p>
         */
        public Builder responseFormat(ResponseFormat responseFormat) {
            this.putBodyParameter("responseFormat", responseFormat);
            this.responseFormat = responseFormat;
            return this;
        }

        /**
         * <p>The random seed.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        public Builder seed(Long seed) {
            this.putBodyParameter("seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * <p>Specifies whether to skip special tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder skipSpecialTokens(Boolean skipSpecialTokens) {
            this.putBodyParameter("skipSpecialTokens", skipSpecialTokens);
            this.skipSpecialTokens = skipSpecialTokens;
            return this;
        }

        /**
         * <p>The stop sequences. This parameter is compatible with a single string or an array of strings. The array format is shown here.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;DONE&quot;]</p>
         */
        public Builder stop(java.util.List<String> stop) {
            this.putBodyParameter("stop", stop);
            this.stop = stop;
            return this;
        }

        /**
         * <p>The list of vLLM stop token IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2]</p>
         */
        public Builder stopTokenIds(java.util.List<Long> stopTokenIds) {
            this.putBodyParameter("stopTokenIds", stopTokenIds);
            this.stopTokenIds = stopTokenIds;
            return this;
        }

        /**
         * <p>Specifies whether to use Server-Sent Events (SSE) for streaming responses. You must set this parameter to true for this operation.</p>
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
         * <p>The OpenAI-compatible streaming options.</p>
         */
        public Builder streamOptions(StreamOptions streamOptions) {
            this.putBodyParameter("streamOptions", streamOptions);
            this.streamOptions = streamOptions;
            return this;
        }

        /**
         * <p>The vLLM structured output constraints.</p>
         */
        public Builder structuredOutputs(StructuredOutputs structuredOutputs) {
            this.putBodyParameter("structuredOutputs", structuredOutputs);
            this.structuredOutputs = structuredOutputs;
            return this;
        }

        /**
         * <p>The sampling temperature, which overrides the default value of the Mobile-Use Agent primary model.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        public Builder temperature(Double temperature) {
            this.putBodyParameter("temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * <p>The vLLM Top-K sampling parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder topK(Long topK) {
            this.putBodyParameter("topK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>A model-compatible parameter. The JSON field is top_logprobs. Whether this parameter is accepted depends on the model. The current Mobile-Use Agent response does not return candidate token probability details.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder topLogprobs(Long topLogprobs) {
            this.putBodyParameter("topLogprobs", topLogprobs);
            this.topLogprobs = topLogprobs;
            return this;
        }

        /**
         * <p>The Top-P nucleus sampling parameter, which overrides the default value of the Mobile-Use Agent primary model.</p>
         * 
         * <strong>example:</strong>
         * <p>0.9</p>
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
             * <p>chat_template_kwargs.enable_thinking: the request-level switch for model thinking, which overrides the default value with the same name. Enabling this switch does not cause the Mobile-Use Agent response to return reasoning_content.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableThinking(Boolean enableThinking) {
                this.enableThinking = enableThinking;
                return this;
            }

            /**
             * <p>Specifies whether to preserve the existing thinking context in subsequent rounds. This parameter is passed as-is according to the vLLM or Qwen chat_template_kwargs.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>A publicly accessible HTTPS image URL or a Base64 image data URL. Each round of user messages must and can only contain one current screenshot. Expired or inaccessible image addresses are rejected.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/screenshot.png">https://example.com/screenshot.png</a></p>
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
             * <p>The compatible inline image field for input_image. You can pass a Base64 data URL.</p>
             * 
             * <strong>example:</strong>
             * <p>data:image/png;base64,...</p>
             */
            public Builder imageData(String imageData) {
                this.imageData = imageData;
                return this;
            }

            /**
             * <p>The screenshot reference. Supports an image_url string or an object containing a url field. The object format is shown here.</p>
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The text content, which can describe the current operation objective or supplement the current page state.</p>
             * 
             * <strong>example:</strong>
             * <p>Click the search button</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The type of the content item. Use text or input_text for text. Use image_url or input_image for screenshots.</p>
             * 
             * <strong>example:</strong>
             * <p>text</p>
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
             * <p>The message content. For a user message, use a content array that contains exactly one current screenshot and optionally attached task text. Screenshots support public HTTPS URLs or Base64 image data URLs. When role is set to tool, fill in the actual execution result of the previous action, which can be a non-empty string, object, or array.</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The message role. The current input must end with a user message. If an execution receipt from the previous round exists, the preceding message must be a tool message.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Required when role is set to tool. References the tool_call ID from the previous Mobile-Use Agent response.</p>
             * 
             * <strong>example:</strong>
             * <p>call_gui_1</p>
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
             * <p>The compatible alias for available_apps, which is also an array of app name strings.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Chrome&quot;,&quot;Settings&quot;]</p>
             */
            public Builder appList(java.util.List<String> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * <p>The supplementary list of application names for the Standard Edition of Mobile-Use Agent. The JSON field is available_apps. The newly passed list replaces the previous supplementary items, but the default applications are retained. An empty array does not clear the default applications. The Dedicated Edition of Mobile-Use Agent does not use this list.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;Chrome&quot;,&quot;Settings&quot;]</p>
             */
            public Builder availableApps(java.util.List<String> availableApps) {
                this.availableApps = availableApps;
                return this;
            }

            /**
             * <p>The Mobile-Use Agent Harness receipt text for legacy clients. This cannot be passed at the same time as the preceding tool message. New clients should prioritize using [tool,user] messages.</p>
             * 
             * <strong>example:</strong>
             * <p>previous action completed</p>
             */
            public Builder harnessMessage(String harnessMessage) {
                this.harnessMessage = harnessMessage;
                return this;
            }

            /**
             * <p>The screen height as a positive integer. For Base64 images, the width and height are parsed from the image itself. For URL images, this value is used for the runtime screen size.</p>
             * 
             * <strong>example:</strong>
             * <p>1080</p>
             */
            public Builder screenHeight(Long screenHeight) {
                this.screenHeight = screenHeight;
                return this;
            }

            /**
             * <p>The screen width as a positive integer. For Base64 images, the width and height are parsed from the image itself. For URL images, this value is used for the runtime screen size.</p>
             * 
             * <strong>example:</strong>
             * <p>1920</p>
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
             * <p>The maximum number of dynamic image patches allowed by the vision model.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
             * <p>The response format type, such as text, json_object, or json_schema.</p>
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
             * <p>Specifies whether to output the usage statistics block before data:[DONE].</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The set of allowed enum text values.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;tap&quot;,&quot;type&quot;]</p>
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
