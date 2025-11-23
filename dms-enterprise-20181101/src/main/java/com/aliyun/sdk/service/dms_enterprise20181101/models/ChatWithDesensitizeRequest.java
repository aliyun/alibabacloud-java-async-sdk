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
 * {@link ChatWithDesensitizeRequest} extends {@link RequestModel}
 *
 * <p>ChatWithDesensitizeRequest</p>
 */
public class ChatWithDesensitizeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesensitizationRule")
    private String desensitizationRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableThinking")
    private Boolean enableThinking;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxTokens")
    private Integer maxTokens;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.Map<String, ?>> messages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedDesensitization")
    private Boolean needDesensitization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PresencePenalty")
    private Float presencePenalty;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseFormat")
    private String responseFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Seed")
    private Integer seed;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stop")
    private java.util.List<String> stop;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Temperature")
    private Float temperature;

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
    private Float topP;

    private ChatWithDesensitizeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.desensitizationRule = builder.desensitizationRule;
        this.enableThinking = builder.enableThinking;
        this.instanceId = builder.instanceId;
        this.maxTokens = builder.maxTokens;
        this.messages = builder.messages;
        this.model = builder.model;
        this.needDesensitization = builder.needDesensitization;
        this.presencePenalty = builder.presencePenalty;
        this.responseFormat = builder.responseFormat;
        this.seed = builder.seed;
        this.stop = builder.stop;
        this.temperature = builder.temperature;
        this.thinkingBudget = builder.thinkingBudget;
        this.topK = builder.topK;
        this.topLogprobs = builder.topLogprobs;
        this.topP = builder.topP;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChatWithDesensitizeRequest create() {
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
     * @return desensitizationRule
     */
    public String getDesensitizationRule() {
        return this.desensitizationRule;
    }

    /**
     * @return enableThinking
     */
    public Boolean getEnableThinking() {
        return this.enableThinking;
    }

    /**
     * @return instanceId
     */
    public Long getInstanceId() {
        return this.instanceId;
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
    public java.util.List<java.util.Map<String, ?>> getMessages() {
        return this.messages;
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
     * @return presencePenalty
     */
    public Float getPresencePenalty() {
        return this.presencePenalty;
    }

    /**
     * @return responseFormat
     */
    public String getResponseFormat() {
        return this.responseFormat;
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
     * @return topLogprobs
     */
    public Integer getTopLogprobs() {
        return this.topLogprobs;
    }

    /**
     * @return topP
     */
    public Float getTopP() {
        return this.topP;
    }

    public static final class Builder extends Request.Builder<ChatWithDesensitizeRequest, Builder> {
        private String regionId; 
        private String desensitizationRule; 
        private Boolean enableThinking; 
        private Long instanceId; 
        private Integer maxTokens; 
        private java.util.List<java.util.Map<String, ?>> messages; 
        private String model; 
        private Boolean needDesensitization; 
        private Float presencePenalty; 
        private String responseFormat; 
        private Integer seed; 
        private java.util.List<String> stop; 
        private Float temperature; 
        private Integer thinkingBudget; 
        private Integer topK; 
        private Integer topLogprobs; 
        private Float topP; 

        private Builder() {
            super();
        } 

        private Builder(ChatWithDesensitizeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.desensitizationRule = request.desensitizationRule;
            this.enableThinking = request.enableThinking;
            this.instanceId = request.instanceId;
            this.maxTokens = request.maxTokens;
            this.messages = request.messages;
            this.model = request.model;
            this.needDesensitization = request.needDesensitization;
            this.presencePenalty = request.presencePenalty;
            this.responseFormat = request.responseFormat;
            this.seed = request.seed;
            this.stop = request.stop;
            this.temperature = request.temperature;
            this.thinkingBudget = request.thinkingBudget;
            this.topK = request.topK;
            this.topLogprobs = request.topLogprobs;
            this.topP = request.topP;
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
         * DesensitizationRule.
         */
        public Builder desensitizationRule(String desensitizationRule) {
            this.putQueryParameter("DesensitizationRule", desensitizationRule);
            this.desensitizationRule = desensitizationRule;
            return this;
        }

        /**
         * EnableThinking.
         */
        public Builder enableThinking(Boolean enableThinking) {
            this.putQueryParameter("EnableThinking", enableThinking);
            this.enableThinking = enableThinking;
            return this;
        }

        /**
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
         * MaxTokens.
         */
        public Builder maxTokens(Integer maxTokens) {
            this.putQueryParameter("MaxTokens", maxTokens);
            this.maxTokens = maxTokens;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *     {
         *         &quot;content&quot;: &quot;你好&quot;,
         *         &quot;role&quot;: &quot;user&quot;
         *     }
         * ]</p>
         */
        public Builder messages(java.util.List<java.util.Map<String, ?>> messages) {
            String messagesShrink = shrink(messages, "Messages", "json");
            this.putBodyParameter("Messages", messagesShrink);
            this.messages = messages;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * NeedDesensitization.
         */
        public Builder needDesensitization(Boolean needDesensitization) {
            this.putQueryParameter("NeedDesensitization", needDesensitization);
            this.needDesensitization = needDesensitization;
            return this;
        }

        /**
         * PresencePenalty.
         */
        public Builder presencePenalty(Float presencePenalty) {
            this.putQueryParameter("PresencePenalty", presencePenalty);
            this.presencePenalty = presencePenalty;
            return this;
        }

        /**
         * ResponseFormat.
         */
        public Builder responseFormat(String responseFormat) {
            this.putQueryParameter("ResponseFormat", responseFormat);
            this.responseFormat = responseFormat;
            return this;
        }

        /**
         * Seed.
         */
        public Builder seed(Integer seed) {
            this.putQueryParameter("Seed", seed);
            this.seed = seed;
            return this;
        }

        /**
         * Stop.
         */
        public Builder stop(java.util.List<String> stop) {
            String stopShrink = shrink(stop, "Stop", "json");
            this.putQueryParameter("Stop", stopShrink);
            this.stop = stop;
            return this;
        }

        /**
         * Temperature.
         */
        public Builder temperature(Float temperature) {
            this.putQueryParameter("Temperature", temperature);
            this.temperature = temperature;
            return this;
        }

        /**
         * ThinkingBudget.
         */
        public Builder thinkingBudget(Integer thinkingBudget) {
            this.putQueryParameter("ThinkingBudget", thinkingBudget);
            this.thinkingBudget = thinkingBudget;
            return this;
        }

        /**
         * TopK.
         */
        public Builder topK(Integer topK) {
            this.putQueryParameter("TopK", topK);
            this.topK = topK;
            return this;
        }

        /**
         * TopLogprobs.
         */
        public Builder topLogprobs(Integer topLogprobs) {
            this.putQueryParameter("TopLogprobs", topLogprobs);
            this.topLogprobs = topLogprobs;
            return this;
        }

        /**
         * TopP.
         */
        public Builder topP(Float topP) {
            this.putQueryParameter("TopP", topP);
            this.topP = topP;
            return this;
        }

        @Override
        public ChatWithDesensitizeRequest build() {
            return new ChatWithDesensitizeRequest(this);
        } 

    } 

}
