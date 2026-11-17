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
         * <p>The ID of the published Mobile Planner Agent instance. This ID must correspond to the X-QI-Agent-Api-Key.</p>
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
         * <p>The optional session identifier. You can omit this parameter in the first turn, and it is generated by the server. Pass it back in subsequent turns to continue the Mobile Planner Agent session.</p>
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
         * <p>The whitelist of allowed token IDs for generation.</p>
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
         * <p>The list of banned words or strings for generation.</p>
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
         * <p>The vLLM or OpenAI-compatible template parameter object. Request values are merged with the default values of the model. Request keys with the same name take precedence and are passed to the model as-is.</p>
         */
        public Builder chatTemplateKwargs(ChatTemplateKwargs chatTemplateKwargs) {
            this.putBodyParameter("chatTemplateKwargs", chatTemplateKwargs);
            this.chatTemplateKwargs = chatTemplateKwargs;
            return this;
        }

        /**
         * <p>The frequency penalty parameter, passed through to the Mobile Planner Agent model.</p>
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
         * <p>Specifies whether to require the upstream to return reasoning content. The specific capability depends on the model.</p>
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
         * <p>A model-compatible parameter with the JSON field logprobs. Whether it is accepted and takes effect depends on the model used by the instance. The current agent response does not provide token log probability details.</p>
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
         * <p>The maximum number of completion tokens. If provided, the value must be greater than 0 and is passed as an OpenAI-compatible model parameter.</p>
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
         * <p>The OpenAI-compatible maximum number of tokens to generate. If provided, it must be greater than 0.</p>
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
         * <p>The list of conversation messages. For the first call, you can submit a single turn or multiple turns of conversation. When continuing a session with an existing session ID, retain the complete and unmodified prefix of historical messages and append the messages for the current turn. Tool results are associated by using role=tool and the corresponding tool_call_id.</p>
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
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
         * <p>The multimodal preprocessor arguments, which are passed through to vLLM as-is by key.</p>
         */
        public Builder mmProcessorKwargs(MmProcessorKwargs mmProcessorKwargs) {
            this.putBodyParameter("mmProcessorKwargs", mmProcessorKwargs);
            this.mmProcessorKwargs = mmProcessorKwargs;
            return this;
        }

        /**
         * <p>Reserved for OpenAI client compatibility. This parameter is ignored during routing. The actual model is determined by the published configuration of the instance, and the model field in the response is fixed to an empty string.</p>
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
         * <p>Set this parameter to 1. Whether this parameter is accepted depends on the model. The current Mobile Planner Agent response does not return multiple candidate results. Do not use it for multi-candidate returns.</p>
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
         * <p>Specifies whether the model is allowed to generate multiple tool calls in parallel.</p>
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
         * <p>The presence penalty parameter, passed through to the Mobile Planner Agent model.</p>
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
         * <p>A model-compatible parameter with the JSON field prompt_logprobs. Whether it is accepted depends on the model. The current agent response does not return input token probability details.</p>
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
         * <p>high</p>
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
         * <p>The structured response format, such as json_object or json_schema.</p>
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
         * <p>The stop sequences. Compatible with a single string or an array of strings. The array format is shown here.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;END&quot;]</p>
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
         * <p>Specifies whether to use SSE streaming responses. You must set this parameter to true for this API operation.</p>
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
         * <p>The sampling temperature. This is passed as an OpenAI-compatible model parameter and overrides the default value of the model.</p>
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
         * <p>The tool choice strategy, which supports auto, none, required, or a named choice supported by the model.</p>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        public Builder toolChoice(String toolChoice) {
            this.putBodyParameter("toolChoice", toolChoice);
            this.toolChoice = toolChoice;
            return this;
        }

        /**
         * <p>The array of function tool definitions available for the current request. Mobile Planner Agent registers each named function to the runtime toolkit and streams back tool_calls.</p>
         */
        public Builder tools(java.util.List<Tools> tools) {
            this.putBodyParameter("tools", tools);
            this.tools = tools;
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
         * <p>A model-compatible parameter with the JSON field top_logprobs. It is used for models that support this feature. The current agent response does not provide candidate token probability details.</p>
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
         * <p>The Top-P sampling parameter. It is passed as an OpenAI-compatible model parameter to override the model default.</p>
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
             * <p>Specifies whether the model generates reasoning_content through chat_template_kwargs. This value is passed to the model used by the Mobile Planner Agent.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableThinking(Boolean enableThinking) {
                this.enableThinking = enableThinking;
                return this;
            }

            /**
             * <p>Specifies whether the model retains and reuses existing thinking content in subsequent turns. This value is passed through as-is according to vLLM or Qwen chat_template_kwargs.</p>
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
             * <p>The image address. Remote images must use HTTPS. You can also pass a Base64 data URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/image.png">https://example.com/image.png</a></p>
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
             * <p>The image reference when the type is set to image_url. HTTPS URLs and data:image/...;base64,... formats are supported.</p>
             */
            public Builder imageUrl(ImageUrl imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The non-empty text when type is set to text.</p>
             * 
             * <strong>example:</strong>
             * <p>Analyze this image</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The type of the content part. Mobile Planner Agent user messages support text or image_url.</p>
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
             * <p>The JSON object string of the function arguments.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;city&quot;:&quot;Hangzhou&quot;}</p>
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The name of the function to call.</p>
             * 
             * <strong>example:</strong>
             * <p>get_weather</p>
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
             * <p>The function information of the historical tool invocation, including the name and arguments in JSON string format. Subsequent turns should retain the actual return values.</p>
             */
            public Builder function(Function function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The tool invocation ID. Subsequent tool messages reference this ID by using tool_call_id.</p>
             * 
             * <strong>example:</strong>
             * <p>call_weather_1</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The tool invocation type. Currently, this is fixed to function.</p>
             * 
             * <strong>example:</strong>
             * <p>function</p>
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
             * <p>The content of the message. The Mobile Planner Agent supports text and multimodal content. Image URLs or Base64 data URLs are passed through to the Mobile Planner Agent model that supports multimodal inputs.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;text&quot;,&quot;text&quot;:&quot;Analyze the image content&quot;}]</p>
             */
            public Builder content(java.util.List<Content> content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The role of the message: user, assistant, tool, system, or developer. The system or developer role is used to override optional text instructions for the current turn. If omitted, the instructions in the instance configuration are used. Tool results use the tool role and are associated with a tool_call_id.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>Required when role is set to tool. The value must match the id in the preceding assistant.tool_calls.</p>
             * 
             * <strong>example:</strong>
             * <p>call_weather_1</p>
             */
            public Builder toolCallId(String toolCallId) {
                this.toolCallId = toolCallId;
                return this;
            }

            /**
             * <p>The list of function invocations that can be included when role is set to assistant. This is used to continue multi-turn tool invocations.</p>
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
             * <p>Example: The maximum number of dynamic image patches allowed for vision models.</p>
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
             * <p>The type of the response format, such as text, json_object, or json_schema.</p>
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
             * <p>The set of allowed enumeration text values.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;yes&quot;,&quot;no&quot;]</p>
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
             * <p>The example parameter description.</p>
             * 
             * <strong>example:</strong>
             * <p>The name of the city to query the weather for</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The JSON Schema type of the example city field.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
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
             * <p>The schema for the example business parameter city. The actual fields are determined by the caller\&quot;s tool definition.</p>
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
             * <p>The property definitions of the JSON Schema.</p>
             */
            public Builder properties(Properties properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The array of required field names in the JSON Schema.</p>
             */
            public Builder required(java.util.List<String> required) {
                this.required = required;
                return this;
            }

            /**
             * <p>The root schema type of the function parameters, typically object.</p>
             * 
             * <strong>example:</strong>
             * <p>object</p>
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
             * <p>The description of the function purpose, used by the model to determine when to call the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>Query the weather in a specified city</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the function. It must not be empty and is used to match assistant.tool_calls with subsequent tool results.</p>
             * 
             * <strong>example:</strong>
             * <p>get_weather</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The JSON Schema for the function parameters. It is passed to the model as raw JSON. If not provided, an empty object schema is used.</p>
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>Specifies whether the model is required to strictly follow the JSON Schema of the function parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The function tool definition, including the name, description, and JSON Schema parameters.</p>
             */
            public Builder function(ToolsFunction function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The type of the tool. Currently, it must be function.</p>
             * 
             * <strong>example:</strong>
             * <p>function</p>
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
