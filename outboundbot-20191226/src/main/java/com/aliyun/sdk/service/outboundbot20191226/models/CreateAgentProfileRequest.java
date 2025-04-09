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
 * {@link CreateAgentProfileRequest} extends {@link RequestModel}
 *
 * <p>CreateAgentProfileRequest</p>
 */
public class CreateAgentProfileRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AgentProfileTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentProfileTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIp")
    private String appIp;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaqCategoryIds")
    private String faqCategoryIds;

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
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("ScriptId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scriptId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VariablesJson")
    private String variablesJson;

    private CreateAgentProfileRequest(Builder builder) {
        super(builder);
        this.agentProfileTemplateId = builder.agentProfileTemplateId;
        this.appIp = builder.appIp;
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
        this.scriptId = builder.scriptId;
        this.variablesJson = builder.variablesJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentProfileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentProfileTemplateId
     */
    public String getAgentProfileTemplateId() {
        return this.agentProfileTemplateId;
    }

    /**
     * @return appIp
     */
    public String getAppIp() {
        return this.appIp;
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
    public String getFaqCategoryIds() {
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
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return variablesJson
     */
    public String getVariablesJson() {
        return this.variablesJson;
    }

    public static final class Builder extends Request.Builder<CreateAgentProfileRequest, Builder> {
        private String agentProfileTemplateId; 
        private String appIp; 
        private String description; 
        private String faqCategoryIds; 
        private String instanceId; 
        private String instructionJson; 
        private String labelsJson; 
        private String model; 
        private String modelConfig; 
        private String prompt; 
        private String promptJson; 
        private String scenario; 
        private String scriptId; 
        private String variablesJson; 

        private Builder() {
            super();
        } 

        private Builder(CreateAgentProfileRequest request) {
            super(request);
            this.agentProfileTemplateId = request.agentProfileTemplateId;
            this.appIp = request.appIp;
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
            this.scriptId = request.scriptId;
            this.variablesJson = request.variablesJson;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default-survey</p>
         */
        public Builder agentProfileTemplateId(String agentProfileTemplateId) {
            this.putBodyParameter("AgentProfileTemplateId", agentProfileTemplateId);
            this.agentProfileTemplateId = agentProfileTemplateId;
            return this;
        }

        /**
         * AppIp.
         */
        public Builder appIp(String appIp) {
            this.putBodyParameter("AppIp", appIp);
            this.appIp = appIp;
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
        public Builder faqCategoryIds(String faqCategoryIds) {
            this.putBodyParameter("FaqCategoryIds", faqCategoryIds);
            this.faqCategoryIds = faqCategoryIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model_001</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aa279896-64a6-4182-864c-4f2b04ec8d17</p>
         */
        public Builder scriptId(String scriptId) {
            this.putBodyParameter("ScriptId", scriptId);
            this.scriptId = scriptId;
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
        public CreateAgentProfileRequest build() {
            return new CreateAgentProfileRequest(this);
        } 

    } 

}
