// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

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
         * <p>Action After Prompt</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TransferToAgent</p>
         */
        public Builder finalAction(String finalAction) {
            this.putQueryParameter("FinalAction", finalAction);
            this.finalAction = finalAction;
            return this;
        }

        /**
         * <p>Parameters for the post-prompt action, specified in a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder finalActionParams(String finalActionParams) {
            this.putQueryParameter("FinalActionParams", finalActionParams);
            this.finalActionParams = finalActionParams;
            return this;
        }

        /**
         * <p>The prompt that plays after the silence timeout threshold is reached.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>再见</p>
         */
        public Builder finalPrompt(String finalPrompt) {
            this.putQueryParameter("FinalPrompt", finalPrompt);
            this.finalPrompt = finalPrompt;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12f407b22cbe4890ac595f09985848d5</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The intent trigger for the silence timeout.</p>
         * 
         * <strong>example:</strong>
         * <p>Timeout</p>
         */
        public Builder intentTrigger(String intentTrigger) {
            this.putQueryParameter("IntentTrigger", intentTrigger);
            this.intentTrigger = intentTrigger;
            return this;
        }

        /**
         * <p>The prompt that plays when the system detects no user input during the specified timeout period.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>不好意思，听不见您说什么</p>
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The type of source that triggers the action.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>chatbotIntent</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The maximum number of times the system plays the silence timeout prompt before it performs the post-prompt action.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder threshold(Integer threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * <p>The duration of the silence timeout, in seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
