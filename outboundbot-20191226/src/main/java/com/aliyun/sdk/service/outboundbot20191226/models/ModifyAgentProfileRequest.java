// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ModifyAgentProfileRequest} extends {@link RequestModel}
 *
 * <p>ModifyAgentProfileRequest</p>
 */
public class ModifyAgentProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProfileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProfileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApiPluginJson")
    private String apiPluginJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaqCategoryIds")
    private java.util.List<Long> faqCategoryIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstructionJson")
    private String instructionJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelsJson")
    private String labelsJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelConfig")
    private String modelConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Prompt")
    private String prompt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PromptJson")
    private String promptJson;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scenario")
    private String scenario;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VariablesJson")
    private String variablesJson;

    private ModifyAgentProfileRequest(Builder builder) {
        super(builder);
        this.agentProfileId = builder.agentProfileId;
        this.apiPluginJson = builder.apiPluginJson;
        this.description = builder.description;
        this.faqCategoryIds = builder.faqCategoryIds;
        this.instanceId = builder.instanceId;
        this.instructionJson = builder.instructionJson;
        this.labelsJson = builder.labelsJson;
        this.model = builder.model;
        this.modelConfig = builder.modelConfig;
        this.prompt = builder.prompt;
        this.promptJson = builder.promptJson;
        this.scenario = builder.scenario;
        this.variablesJson = builder.variablesJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAgentProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentProfileId
     */
    public String getAgentProfileId() {
        return this.agentProfileId;
    }

    /**
     * @return apiPluginJson
     */
    public String getApiPluginJson() {
        return this.apiPluginJson;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return faqCategoryIds
     */
    public java.util.List<Long> getFaqCategoryIds() {
        return this.faqCategoryIds;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instructionJson
     */
    public String getInstructionJson() {
        return this.instructionJson;
    }

    /**
     * @return labelsJson
     */
    public String getLabelsJson() {
        return this.labelsJson;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return modelConfig
     */
    public String getModelConfig() {
        return this.modelConfig;
    }

    /**
     * @return prompt
     */
    public String getPrompt() {
        return this.prompt;
    }

    /**
     * @return promptJson
     */
    public String getPromptJson() {
        return this.promptJson;
    }

    /**
     * @return scenario
     */
    public String getScenario() {
        return this.scenario;
    }

    /**
     * @return variablesJson
     */
    public String getVariablesJson() {
        return this.variablesJson;
    }

    public static final class Builder extends Request.Builder<ModifyAgentProfileRequest, Builder> {
        private String agentProfileId; 
        private String apiPluginJson; 
        private String description; 
        private java.util.List<Long> faqCategoryIds; 
        private String instanceId; 
        private String instructionJson; 
        private String labelsJson; 
        private String model; 
        private String modelConfig; 
        private String prompt; 
        private String promptJson; 
        private String scenario; 
        private String variablesJson; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAgentProfileRequest request) {
            super(request);
            this.agentProfileId = request.agentProfileId;
            this.apiPluginJson = request.apiPluginJson;
            this.description = request.description;
            this.faqCategoryIds = request.faqCategoryIds;
            this.instanceId = request.instanceId;
            this.instructionJson = request.instructionJson;
            this.labelsJson = request.labelsJson;
            this.model = request.model;
            this.modelConfig = request.modelConfig;
            this.prompt = request.prompt;
            this.promptJson = request.promptJson;
            this.scenario = request.scenario;
            this.variablesJson = request.variablesJson;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>37ca3ca1ac4b4e57adf3da5b5d939d04</p>
         */
        public Builder agentProfileId(String agentProfileId) {
            this.putBodyParameter("AgentProfileId", agentProfileId);
            this.agentProfileId = agentProfileId;
            return this;
        }

        /**
         * ApiPluginJson.
         */
        public Builder apiPluginJson(String apiPluginJson) {
            this.putBodyParameter("ApiPluginJson", apiPluginJson);
            this.apiPluginJson = apiPluginJson;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * FaqCategoryIds.
         */
        public Builder faqCategoryIds(java.util.List<Long> faqCategoryIds) {
            String faqCategoryIdsShrink = shrink(faqCategoryIds, "FaqCategoryIds", "json");
            this.putBodyParameter("FaqCategoryIds", faqCategoryIdsShrink);
            this.faqCategoryIds = faqCategoryIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>174952ab-9825-4cc9-a5e2-de82d7fa4cdd</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * InstructionJson.
         */
        public Builder instructionJson(String instructionJson) {
            this.putBodyParameter("InstructionJson", instructionJson);
            this.instructionJson = instructionJson;
            return this;
        }

        /**
         * LabelsJson.
         */
        public Builder labelsJson(String labelsJson) {
            this.putBodyParameter("LabelsJson", labelsJson);
            this.labelsJson = labelsJson;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * ModelConfig.
         */
        public Builder modelConfig(String modelConfig) {
            this.putBodyParameter("ModelConfig", modelConfig);
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * Prompt.
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * PromptJson.
         */
        public Builder promptJson(String promptJson) {
            this.putBodyParameter("PromptJson", promptJson);
            this.promptJson = promptJson;
            return this;
        }

        /**
         * Scenario.
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * VariablesJson.
         */
        public Builder variablesJson(String variablesJson) {
            this.putBodyParameter("VariablesJson", variablesJson);
            this.variablesJson = variablesJson;
            return this;
        }

        @Override
        public ModifyAgentProfileRequest build() {
            return new ModifyAgentProfileRequest(this);
        } 

    } 

}
