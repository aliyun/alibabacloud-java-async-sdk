// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link ListModelsRequest} extends {@link RequestModel}
 *
 * <p>ListModelsRequest</p>
 */
public class ListModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("capabilities")
    private java.util.List<String> capabilities;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("contextWindow")
    private Long contextWindow;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("features")
    private java.util.List<String> features;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("providers")
    private java.util.List<String> providers;

    private ListModelsRequest(Builder builder) {
        super(builder);
        this.capabilities = builder.capabilities;
        this.contextWindow = builder.contextWindow;
        this.features = builder.features;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.model = builder.model;
        this.name = builder.name;
        this.nextToken = builder.nextToken;
        this.providers = builder.providers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return capabilities
     */
    public java.util.List<String> getCapabilities() {
        return this.capabilities;
    }

    /**
     * @return contextWindow
     */
    public Long getContextWindow() {
        return this.contextWindow;
    }

    /**
     * @return features
     */
    public java.util.List<String> getFeatures() {
        return this.features;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return providers
     */
    public java.util.List<String> getProviders() {
        return this.providers;
    }

    public static final class Builder extends Request.Builder<ListModelsRequest, Builder> {
        private java.util.List<String> capabilities; 
        private Long contextWindow; 
        private java.util.List<String> features; 
        private String language; 
        private Long maxResults; 
        private String model; 
        private String name; 
        private String nextToken; 
        private java.util.List<String> providers; 

        private Builder() {
            super();
        } 

        private Builder(ListModelsRequest request) {
            super(request);
            this.capabilities = request.capabilities;
            this.contextWindow = request.contextWindow;
            this.features = request.features;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.model = request.model;
            this.name = request.name;
            this.nextToken = request.nextToken;
            this.providers = request.providers;
        } 

        /**
         * <p>The model type. Valid values:</p>
         * <ul>
         * <li>Reasoning: Deep thinking.</li>
         * <li>VU: Visual understanding.</li>
         * <li>IG: Image generation.</li>
         * <li>VG: Video generation.</li>
         * <li>ASR: Speech recognition.</li>
         * <li>TTS: Speech synthesis.</li>
         * <li>ME: Multimodal embedding.</li>
         * <li>Realtime-Omni: Real-time omni-modal.</li>
         * <li>Multimodal-Omni: Omni-modal.</li>
         * <li>Realtime-Text-to-Speech: Real-time speech synthesis.</li>
         * <li>TG: Text generation.</li>
         * <li>TR: Text embedding.</li>
         * <li>Realtime-ASR: Real-time speech recognition.</li>
         * <li>Realtime-Audio-Translate: Real-time audio translation.</li>
         * <li>3D-generation: 3D generation.</li>
         * <li>Realtime-Chatting: Real-time voice conversation.</li>
         * </ul>
         */
        public Builder capabilities(java.util.List<String> capabilities) {
            String capabilitiesShrink = shrink(capabilities, "capabilities", "json");
            this.putQueryParameter("capabilities", capabilitiesShrink);
            this.capabilities = capabilities;
            return this;
        }

        /**
         * <p>The context window size used to filter models with a context window smaller than this value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder contextWindow(Long contextWindow) {
            this.putQueryParameter("contextWindow", contextWindow);
            this.contextWindow = contextWindow;
            return this;
        }

        /**
         * <p>The model capability. Valid values:</p>
         * <ul>
         * <li>model-experience: Playground.</li>
         * <li>function-calling: Function calling.</li>
         * <li>structured-outputs: Structured output.</li>
         * <li>web-search: Web search.</li>
         * <li>prefix-completion: Partial mode.</li>
         * <li>cache: Cache.</li>
         * <li>batch: Batch inference.</li>
         * <li>fine-tuning: Model fine-tuning.</li>
         * </ul>
         */
        public Builder features(java.util.List<String> features) {
            String featuresShrink = shrink(features, "features", "json");
            this.putQueryParameter("features", featuresShrink);
            this.features = features;
            return this;
        }

        /**
         * <p>The language. Valid values:</p>
         * <ul>
         * <li>zh-CN: Chinese.</li>
         * <li>en-US: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid values: 0 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Long maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The model name for exact match.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The model name for fuzzy match.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-plus</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The next token.</p>
         * 
         * <strong>example:</strong>
         * <p>lwytFRtLdNk=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The provider. Valid values:</p>
         * <ul>
         * <li>qwen: Alibaba Cloud - Qwen.</li>
         * <li>zhipu-ai: Zhipu AI.</li>
         * <li>wan: Alibaba Cloud - Wan.</li>
         * <li>qwen-domain-model: Alibaba Cloud - Domain Model.</li>
         * <li>mini-max: MiniMax.</li>
         * <li>moonshot-ai: Moonshot AI.</li>
         * <li>deepseek: DeepSeek.</li>
         * <li>happyhorse: Alibaba Cloud - HappyHorse.</li>
         * <li>kling: Kling AI.</li>
         * <li>pixverse: PixVerse.</li>
         * <li>vidu: Vidu.</li>
         * <li>tripo: Tripo.</li>
         * <li>xiaomi: Xiaomi MiMo.</li>
         * </ul>
         */
        public Builder providers(java.util.List<String> providers) {
            String providersShrink = shrink(providers, "providers", "json");
            this.putQueryParameter("providers", providersShrink);
            this.providers = providers;
            return this;
        }

        @Override
        public ListModelsRequest build() {
            return new ListModelsRequest(this);
        } 

    } 

}
