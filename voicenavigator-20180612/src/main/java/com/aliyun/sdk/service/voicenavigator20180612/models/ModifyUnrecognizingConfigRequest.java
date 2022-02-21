// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyUnrecognizingConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyUnrecognizingConfigRequest</p>
 */
public class ModifyUnrecognizingConfigRequest extends Request {
    @Query
    @NameInMap("FinalAction")
    @Validation(required = true)
    private String finalAction;

    @Query
    @NameInMap("FinalActionParams")
    private String finalActionParams;

    @Query
    @NameInMap("FinalPrompt")
    @Validation(required = true)
    private String finalPrompt;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Prompt")
    @Validation(required = true)
    private String prompt;

    @Query
    @NameInMap("Threshold")
    @Validation(required = true)
    private Integer threshold;

    private ModifyUnrecognizingConfigRequest(Builder builder) {
        super(builder);
        this.finalAction = builder.finalAction;
        this.finalActionParams = builder.finalActionParams;
        this.finalPrompt = builder.finalPrompt;
        this.instanceId = builder.instanceId;
        this.prompt = builder.prompt;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUnrecognizingConfigRequest create() {
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
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return threshold
     */
    public Integer getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<ModifyUnrecognizingConfigRequest, Builder> {
        private String finalAction; 
        private String finalActionParams; 
        private String finalPrompt; 
        private String instanceId; 
        private String prompt; 
        private Integer threshold; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUnrecognizingConfigRequest response) {
            super(response);
            this.finalAction = response.finalAction;
            this.finalActionParams = response.finalActionParams;
            this.finalPrompt = response.finalPrompt;
            this.instanceId = response.instanceId;
            this.prompt = response.prompt;
            this.threshold = response.threshold;
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
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putQueryParameter("Prompt", prompt);
            this.prompt = prompt;
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

        @Override
        public ModifyUnrecognizingConfigRequest build() {
            return new ModifyUnrecognizingConfigRequest(this);
        } 

    } 

}
