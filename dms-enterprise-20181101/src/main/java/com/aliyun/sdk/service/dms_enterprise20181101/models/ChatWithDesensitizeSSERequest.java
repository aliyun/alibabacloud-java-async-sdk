// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ChatWithDesensitizeSSERequest} extends {@link RequestModel}
 *
 * <p>ChatWithDesensitizeSSERequest</p>
 */
public class ChatWithDesensitizeSSERequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioJson")
    private String audioJson;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesensitizationRule")
    private String desensitizationRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private Integer dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableCodeInterpreter")
    private Boolean enableCodeInterpreter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSearch")
    private Boolean enableSearch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableThinking")
    private Boolean enableThinking;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IncludeUsage")
    private Boolean includeUsage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Logprobs")
    private Boolean logprobs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxTokens")
    private Integer maxTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    private java.util.List<?> messages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModalitiesList")
    private java.util.List<String> modalitiesList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedDesensitization")
    private Boolean needDesensitization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PresencePenalty")
    private String presencePenalty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseFormat")
    private String responseFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchOptions")
    private java.util.Map<String, String> searchOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Seed")
    private Integer seed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stop")
    private java.util.List<String> stop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Temperature")
    private String temperature;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThinkingBudget")
    private Integer thinkingBudget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopK")
    private Integer topK;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopLogprobs")
    private Integer topLogprobs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopP")
    private String topP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VlHighResolutionImages")
    private Boolean vlHighResolutionImages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XDashScopeDataInspection")
    private String xDashScopeDataInspection;

    private ChatWithDesensitizeSSERequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.audioJson = builder.audioJson;
        this.desensitizationRule = builder.desensitizationRule;
        this.dimensions = builder.dimensions;
        this.enableCodeInterpreter = builder.enableCodeInterpreter;
        this.enableSearch = builder.enableSearch;
        this.enableThinking = builder.enableThinking;
        this.includeUsage = builder.includeUsage;
        this.input = builder.input;
        this.instanceId = builder.instanceId;
        this.logprobs = builder.logprobs;
        this.maxTokens = builder.maxTokens;
        this.messages = builder.messages;
        this.modalitiesList = builder.modalitiesList;
        this.model = builder.model;
        this.needDesensitization = builder.needDesensitization;
        this.parameters = builder.parameters;
        this.presencePenalty = builder.presencePenalty;
        this.responseFormat = builder.responseFormat;
        this.searchOptions = builder.searchOptions;
        this.seed = builder.seed;
        this.stop = builder.stop;
        this.stream = builder.stream;
        this.temperature = builder.temperature;
        this.thinkingBudget = builder.thinkingBudget;
        this.topK = builder.topK;
        this.topLogprobs = builder.topLogprobs;
        this.topP = builder.topP;
        this.vlHighResolutionImages = builder.vlHighResolutionImages;
        this.xDashScopeDataInspection = builder.xDashScopeDataInspection;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatWithDesensitizeSSERequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return audioJson
     */
    public String getAudioJson() {
        return this.audioJson;
    }

    /**
     * @return desensitizationRule
     */
    public String getDesensitizationRule() {
        return this.desensitizationRule;
    }

    /**
     * @return dimensions
     */
    public Integer getDimensions() {
        return this.dimensions;
    }

    /**
     * @return enableCodeInterpreter
     */
    public Boolean getEnableCodeInterpreter() {
        return this.enableCodeInterpreter;
    }

    /**
     * @return enableSearch
     */
    public Boolean getEnableSearch() {
        return this.enableSearch;
    }

    /**
     * @return enableThinking
     */
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    /**
     * @return includeUsage
     */
    public Boolean getIncludeUsage() {
        return this.includeUsage;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return logprobs
     */
    public Boolean getLogprobs() {
        return this.logprobs;
    }

    /**
     * @return maxTokens
     */
    public Integer getMaxTokens() {
        return this.maxTokens;
    }

    /**
     * @return messages
     */
    public java.util.List<?> getMessages() {
        return this.messages;
    }

    /**
     * @return modalitiesList
     */
    public java.util.List<String> getModalitiesList() {
        return this.modalitiesList;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return needDesensitization
     */
    public Boolean getNeedDesensitization() {
        return this.needDesensitization;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return presencePenalty
     */
    public String getPresencePenalty() {
        return this.presencePenalty;
    }

    /**
     * @return responseFormat
     */
    public String getResponseFormat() {
        return this.responseFormat;
    }

    /**
     * @return searchOptions
     */
    public java.util.Map<String, String> getSearchOptions() {
        return this.searchOptions;
    }

    /**
     * @return seed
     */
    public Integer getSeed() {
        return this.seed;
    }

    /**
     * @return stop
     */
    public java.util.List<String> getStop() {
        return this.stop;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return temperature
     */
    public String getTemperature() {
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
     * @return topLogprobs
     */
    public Integer getTopLogprobs() {
        return this.topLogprobs;
    }

    /**
     * @return topP
     */
    public String getTopP() {
        return this.topP;
    }

    /**
     * @return vlHighResolutionImages
     */
    public Boolean getVlHighResolutionImages() {
        return this.vlHighResolutionImages;
    }

    /**
     * @return xDashScopeDataInspection
     */
    public String getXDashScopeDataInspection() {
        return this.xDashScopeDataInspection;
    }

    public static final class Builder extends Request.Builder<ChatWithDesensitizeSSERequest, Builder> {
        private String regionId; 
        private String audioJson; 
        private String desensitizationRule; 
        private Integer dimensions; 
        private Boolean enableCodeInterpreter; 
        private Boolean enableSearch; 
        private Boolean enableThinking; 
        private Boolean includeUsage; 
        private String input; 
        private Long instanceId; 
        private Boolean logprobs; 
        private Integer maxTokens; 
        private java.util.List<?> messages; 
        private java.util.List<String> modalitiesList; 
        private String model; 
        private Boolean needDesensitization; 
        private String parameters; 
        private String presencePenalty; 
        private String responseFormat; 
        private java.util.Map<String, String> searchOptions; 
        private Integer seed; 
        private java.util.List<String> stop; 
        private Boolean stream; 
        private String temperature; 
        private Integer thinkingBudget; 
        private Integer topK; 
        private Integer topLogprobs; 
        private String topP; 
        private Boolean vlHighResolutionImages; 
        private String xDashScopeDataInspection; 

        private Builder() {
            super();
        } 

        private Builder(ChatWithDesensitizeSSERequest request) {
            super(request);
            this.regionId = request.regionId;
            this.audioJson = request.audioJson;
            this.desensitizationRule = request.desensitizationRule;
            this.dimensions = request.dimensions;
            this.enableCodeInterpreter = request.enableCodeInterpreter;
            this.enableSearch = request.enableSearch;
            this.enableThinking = request.enableThinking;
            this.includeUsage = request.includeUsage;
            this.input = request.input;
            this.instanceId = request.instanceId;
            this.logprobs = request.logprobs;
            this.maxTokens = request.maxTokens;
            this.messages = request.messages;
            this.modalitiesList = request.modalitiesList;
            this.model = request.model;
            this.needDesensitization = request.needDesensitization;
            this.parameters = request.parameters;
            this.presencePenalty = request.presencePenalty;
            this.responseFormat = request.responseFormat;
            this.searchOptions = request.searchOptions;
            this.seed = request.seed;
            this.stop = request.stop;
            this.stream = request.stream;
            this.temperature = request.temperature;
            this.thinkingBudget = request.thinkingBudget;
            this.topK = request.topK;
            this.topLogprobs = request.topLogprobs;
            this.topP = request.topP;
            this.vlHighResolutionImages = request.vlHighResolutionImages;
            this.xDashScopeDataInspection = request.xDashScopeDataInspection;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Output audio voice and format; only applicable to the Qwen-Omni model, provided that the modalities parameter is set to [&quot;text&quot;, &quot;audio&quot;].</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder audioJson(String audioJson) {
            this.putQueryParameter("AudioJson", audioJson);
            this.audioJson = audioJson;
            return this;
        }

        /**
         * <p>Masking category. Required when needDataMasking is true.</p>
         * 
         * <strong>example:</strong>
         * <p>UserInfo</p>
         */
        public Builder desensitizationRule(String desensitizationRule) {
            this.putQueryParameter("DesensitizationRule", desensitizationRule);
            this.desensitizationRule = desensitizationRule;
            return this;
        }

        /**
         * <p>The embedding dimensions.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder dimensions(Integer dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>Specifies whether to enable the code interpreter feature. Takes effect only when model is qwen3-max-preview and enable_thinking is true.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableCodeInterpreter(Boolean enableCodeInterpreter) {
            this.putQueryParameter("EnableCodeInterpreter", enableCodeInterpreter);
            this.enableCodeInterpreter = enableCodeInterpreter;
            return this;
        }

        /**
         * <p>Whether to enable web search.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder enableSearch(Boolean enableSearch) {
            this.putQueryParameter("EnableSearch", enableSearch);
            this.enableSearch = enableSearch;
            return this;
        }

        /**
         * <p>Specifies whether to enable thinking mode when using hybrid thinking models.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableThinking(Boolean enableThinking) {
            this.putQueryParameter("EnableThinking", enableThinking);
            this.enableThinking = enableThinking;
            return this;
        }

        /**
         * <p>Specifies whether to include token usage information in the final chunk of the streaming response.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder includeUsage(Boolean includeUsage) {
            this.putQueryParameter("IncludeUsage", includeUsage);
            this.includeUsage = includeUsage;
            return this;
        }

        /**
         * <p>The input to the embedding model.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The ID of the instance, used to specify the corresponding data masking rules. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder instanceId(Long instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to return the log probabilities of the output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder logprobs(Boolean logprobs) {
            this.putQueryParameter("Logprobs", logprobs);
            this.logprobs = logprobs;
            return this;
        }

        /**
         * <p>Limits the maximum number of tokens the model can generate. If the output exceeds this value, generation will be truncated. Suitable for scenarios where you need to control the output length.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder maxTokens(Integer maxTokens) {
            this.putQueryParameter("MaxTokens", maxTokens);
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * <p>The conversation context passed to the model, arranged in chronological order.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;content&quot;: &quot;你好&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     }
         * ]</p>
         */
        public Builder messages(java.util.List<?> messages) {
            String messagesShrink = shrink(messages, "Messages", "json");
            this.putBodyParameter("Messages", messagesShrink);
            this.messages = messages;
            return this;
        }

        /**
         * <p>Output data modality; only applicable to the Qwen-Omni model.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;text&quot;,&quot;audio&quot;]</p>
         */
        public Builder modalitiesList(java.util.List<String> modalitiesList) {
            String modalitiesListShrink = shrink(modalitiesList, "ModalitiesList", "json");
            this.putQueryParameter("ModalitiesList", modalitiesListShrink);
            this.modalitiesList = modalitiesList;
            return this;
        }

        /**
         * <p>The model name. Supported models: Qwen series text-only Large Language Models (commercial and open-source). Multi-modal models are not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>Whether to enable data masking. Defaults to false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needDesensitization(Boolean needDesensitization) {
            this.putQueryParameter("NeedDesensitization", needDesensitization);
            this.needDesensitization = needDesensitization;
            return this;
        }

        /**
         * <p>Model configuration parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder parameters(String parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>Controls the degree of repetition in generated text. Valid values: [-2.0, 2.0]. Positive values decrease repetition, while negative values increase it.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0</p>
         */
        public Builder presencePenalty(String presencePenalty) {
            this.putQueryParameter("PresencePenalty", presencePenalty);
            this.presencePenalty = presencePenalty;
            return this;
        }

        /**
         * <p>The format of the returned content. Valid values: text: Plain text response; json_object: Standardized JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder responseFormat(String responseFormat) {
            this.putQueryParameter("ResponseFormat", responseFormat);
            this.responseFormat = responseFormat;
            return this;
        }

        /**
         * <p>Web search strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder searchOptions(java.util.Map<String, String> searchOptions) {
            String searchOptionsShrink = shrink(searchOptions, "SearchOptions", "json");
            this.putQueryParameter("SearchOptions", searchOptionsShrink);
            this.searchOptions = searchOptions;
            return this;
        }

        /**
         * <p>Random seed. Used to ensure the reproducibility of results under the same input and parameters. Valid values: [0, 2^31−1].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder seed(Integer seed) {
            this.putQueryParameter("Seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * <p>Stop sequences.</p>
         */
        public Builder stop(java.util.List<String> stop) {
            String stopShrink = shrink(stop, "Stop", "json");
            this.putQueryParameter("Stop", stopShrink);
            this.stop = stop;
            return this;
        }

        /**
         * <p>Specifies whether to use streaming output.</p>
         * 
         * <strong>example:</strong>
         * <p>1-68f11da7e2b826dcc63c5877-hd</p>
         */
        public Builder stream(Boolean stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>The sampling temperature controls the diversity of the generated text. The higher the temperature, the more diverse the generated text, and conversely, the more deterministic the generated text. Valid values: [0, 2).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder temperature(String temperature) {
            this.putQueryParameter("Temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * <p>The maximum number of tokens allowed for the model&quot;s internal reasoning process.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        public Builder thinkingBudget(Integer thinkingBudget) {
            this.putQueryParameter("ThinkingBudget", thinkingBudget);
            this.thinkingBudget = thinkingBudget;
            return this;
        }

        /**
         * <p>Specifies the number of candidate tokens to consider during sampling. Higher values increase randomness, while lower values make the output more deterministic. Set to null or a value greater than 100 to disable.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * <p>Specifies the number of most likely candidate tokens to return at each generation step. Valid values: [0, 5].</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder topLogprobs(Integer topLogprobs) {
            this.putQueryParameter("TopLogprobs", topLogprobs);
            this.topLogprobs = topLogprobs;
            return this;
        }

        /**
         * <p>The probability threshold for nucleus sampling, used to control the diversity of the generated text. Higher Top-P values result in more diverse generated text. Valid values: (0,1.0].</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        public Builder topP(String topP) {
            this.putQueryParameter("TopP", topP);
            this.topP = topP;
            return this;
        }

        /**
         * <p>Specifies whether to increase the maximum pixel limit of input images to the equivalent of 16,384 tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder vlHighResolutionImages(Boolean vlHighResolutionImages) {
            this.putQueryParameter("VlHighResolutionImages", vlHighResolutionImages);
            this.vlHighResolutionImages = vlHighResolutionImages;
            return this;
        }

        /**
         * <p>Specifies whether to further identify non-compliant information in both input and output content, building upon the built-in content safety capabilities of the Tongyi Qianwen API.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder xDashScopeDataInspection(String xDashScopeDataInspection) {
            this.putQueryParameter("XDashScopeDataInspection", xDashScopeDataInspection);
            this.xDashScopeDataInspection = xDashScopeDataInspection;
            return this;
        }

        @Override
        public ChatWithDesensitizeSSERequest build() {
            return new ChatWithDesensitizeSSERequest(this);
        } 

    } 

}
