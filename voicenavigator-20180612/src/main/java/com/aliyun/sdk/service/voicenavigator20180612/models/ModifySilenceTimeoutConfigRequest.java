// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySilenceTimeoutConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifySilenceTimeoutConfigRequest</p>
 */
public class ModifySilenceTimeoutConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinalAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String finalAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinalActionParams")
    private String finalActionParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FinalPrompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String finalPrompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IntentTrigger")
    private String intentTrigger;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Prompt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String prompt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer threshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timeout")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long timeout;

    private ModifySilenceTimeoutConfigRequest(Builder builder) {
        super(builder);
        this.finalAction = builder.finalAction;
        this.finalActionParams = builder.finalActionParams;
        this.finalPrompt = builder.finalPrompt;
        this.instanceId = builder.instanceId;
        this.intentTrigger = builder.intentTrigger;
        this.prompt = builder.prompt;
        this.sourceType = builder.sourceType;
        this.threshold = builder.threshold;
        this.timeout = builder.timeout;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySilenceTimeoutConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return finalAction
     */
    public String getFinalAction() {
        return this.finalAction;
    }

    /**
     * @return finalActionParams
     */
    public String getFinalActionParams() {
        return this.finalActionParams;
    }

    /**
     * @return finalPrompt
     */
    public String getFinalPrompt() {
        return this.finalPrompt;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return intentTrigger
     */
    public String getIntentTrigger() {
        return this.intentTrigger;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return threshold
     */
    public Integer getThreshold() {
        return this.threshold;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    public static final class Builder extends Request.Builder<ModifySilenceTimeoutConfigRequest, Builder> {
        private String finalAction; 
        private String finalActionParams; 
        private String finalPrompt; 
        private String instanceId; 
        private String intentTrigger; 
        private String prompt; 
        private String sourceType; 
        private Integer threshold; 
        private Long timeout; 

        private Builder() {
            super();
        } 

        private Builder(ModifySilenceTimeoutConfigRequest request) {
            super(request);
            this.finalAction = request.finalAction;
            this.finalActionParams = request.finalActionParams;
            this.finalPrompt = request.finalPrompt;
            this.instanceId = request.instanceId;
            this.intentTrigger = request.intentTrigger;
            this.prompt = request.prompt;
            this.sourceType = request.sourceType;
            this.threshold = request.threshold;
            this.timeout = request.timeout;
        } 

        /**
         * FinalAction.
         */
        public Builder finalAction(String finalAction) {
            this.putQueryParameter("FinalAction", finalAction);
            this.finalAction = finalAction;
            return this;
        }

        /**
         * FinalActionParams.
         */
        public Builder finalActionParams(String finalActionParams) {
            this.putQueryParameter("FinalActionParams", finalActionParams);
            this.finalActionParams = finalActionParams;
            return this;
        }

        /**
         * FinalPrompt.
         */
        public Builder finalPrompt(String finalPrompt) {
            this.putQueryParameter("FinalPrompt", finalPrompt);
            this.finalPrompt = finalPrompt;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IntentTrigger.
         */
        public Builder intentTrigger(String intentTrigger) {
            this.putQueryParameter("IntentTrigger", intentTrigger);
            this.intentTrigger = intentTrigger;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Integer threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putQueryParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        @Override
        public ModifySilenceTimeoutConfigRequest build() {
            return new ModifySilenceTimeoutConfigRequest(this);
        } 

    } 

}
