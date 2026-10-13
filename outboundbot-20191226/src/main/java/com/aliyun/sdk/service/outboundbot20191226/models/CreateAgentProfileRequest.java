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
         * <p>The agent profile template ID (unique value).</p>
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
         * <p>The app_ip (system field). This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        public Builder appIp(String appIp) {
            this.putBodyParameter("AppIp", appIp);
            this.appIp = appIp;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Describe the features of the current agent</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The FAQ category IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>[30000474726]</p>
         */
        public Builder faqCategoryIds(String faqCategoryIds) {
            this.putBodyParameter("FaqCategoryIds", faqCategoryIds);
            this.faqCategoryIds = faqCategoryIds;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The instruction configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;type&quot;: &quot;TransferToAgent&quot;,
         *     &quot;instructions&quot;: [{
         *         &quot;code&quot;: &quot;Transfer0&quot;,
         *         &quot;skillGroupId&quot;: &quot;testcode&quot;,
         *         &quot;skillGroupName&quot;: &quot;skillgroup&quot;
         *     }],
         *     &quot;timeoutEnable&quot;: false
         * }, {
         *     &quot;type&quot;: &quot;CollectNumber&quot;,
         *     &quot;instructions&quot;: [{
         *         &quot;code&quot;: &quot;DTMF0&quot;,
         *         &quot;name&quot;: &quot;Number collection test&quot;,
         *         &quot;collectVoice&quot;: true,
         *         &quot;terminator&quot;: &quot;#&quot;
         *     }]
         * }]</p>
         */
        public Builder instructionJson(String instructionJson) {
            this.putBodyParameter("InstructionJson", instructionJson);
            this.instructionJson = instructionJson;
            return this;
        }

        /**
         * <p>The label descriptions.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;name&quot;: &quot;Satisfaction&quot;,
         *     &quot;description&quot;: &quot;Whether you are interested in the introduced game content&quot;,
         *     &quot;valueList&quot;: &quot;[\&quot;Interested\&quot;,\&quot;Not interested\&quot;]&quot;
         * }]</p>
         */
        public Builder labelsJson(String labelsJson) {
            this.putBodyParameter("LabelsJson", labelsJson);
            this.labelsJson = labelsJson;
            return this;
        }

        /**
         * <p>The model ID (unique value).</p>
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
         * <p><strong>[Deprecated]</strong> The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder modelConfig(String modelConfig) {
            this.putBodyParameter("ModelConfig", modelConfig);
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * <p>The agent configuration in professional mode.</p>
         * 
         * <strong>example:</strong>
         * <p>\nName: Annie \nIdentity: Game Promoter\nBackground: Promote the latest welfare events to players over the phone, ensuring that every player can keep up with the information in a timely manner and enjoy the game.\nSkills: As a game customer service representative, recommend limited-time game welfare events to users, emphasize the event highlights, and inform them of the participation process.\nConstraints: You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest welfare events to players over the phone.\nAs a customer service representative who proactively contacts players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call, while keeping the language approachable to ensure that players can easily understand the event content.\nClarify the start and end times of the event to ensure that players do not get confused.\nEmphasize the key rewards and participation methods of the event to increase players\&quot; interest in participating</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The agent configuration in normal mode.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;name&quot;: &quot;Annie&quot;,
         *     &quot;gender&quot;: &quot;Female&quot;,
         *     &quot;age&quot;: 20,
         *     &quot;role&quot;: &quot;Game Promoter&quot;,
         *     &quot;communicationStyle&quot;: [&quot;Friendly&quot;, &quot;Conversational&quot;, &quot;Lively&quot;],
         *     &quot;goals&quot;: &quot;Promote the latest welfare events to players over the phone, ensuring that every player can keep up with the information in a timely manner and enjoy the game.&quot;,
         *     &quot;background&quot;: &quot;Event Introduction\nFrom ${Start Time} to ${End Time}, we have carefully prepared the \&quot;Limited-Time Treasure Hunt\&quot; welfare event for a week. As long as you log in to the game every day during this period, you can claim a login gift pack containing rare materials, energy potions, and limited-edition appearance rewards.\n\nEvent Highlights\nThe highlight of this event is that players who log in for 5 cumulative days will receive an extra \&quot;Mystery Chest\&quot;. Opening the chest to get a rare pet will add a powerful boost to your battles! Don\&quot;t miss this great opportunity to enhance your strength.\n\nHow to Participate\nAfter logging into the game, find \&quot;Limited-Time Treasure Hunt\&quot; in the event panel and click to claim the corresponding rewards. Remember to log in every day, the rewards won\&quot;t wait!&quot;,
         *     &quot;skills&quot;: &quot;As a game customer service representative, recommend limited-time game welfare events to users, emphasize the event highlights, and inform them of the participation process.&quot;,
         *     &quot;workflow&quot;: &quot;1. Friendly greeting and self-introduction\n- Opening: \&quot;Hello, respected adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive welfare event that is about to launch, which will definitely make your adventure more exciting!\&quot;\n- Introduce the welfare event only after confirming that the player wants to learn about it.\n2. Welfare event introduction\n3. Emphasize event highlights\n4. Explain how to participate and remind\n5. Encourage sharing and feedback\n- Call to action: \&quot;If you think this event is good, feel free to share the good news with your guild partners or game friends. At the same time, we also highly welcome you to tell us your experience and suggestions through the built-in feedback system of the game after the event ends.\&quot;\nSkill 6: Politely end the call\n- Closing: \&quot;Well, respected adventurer, the above is the main content of this event. I hope you can return with a full load from the event, and I wish you invincible in your journey! If you have any questions, feel free to contact our customer service team. Thank you for answering, look forward to serving you again, goodbye!\&quot;&quot;,
         *     &quot;constraint&quot;: &quot;You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest welfare events to players over the phone.\nAs a customer service representative who proactively contacts players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call, while keeping the language approachable to ensure that players can easily understand the event content.\nClarify the start and end times of the event to ensure that players do not get confused.\nEmphasize the key rewards and participation methods of the event to increase players\&quot; interest in participating.\nEncourage interaction and feedback among players to promote the activity of the game community.\nMaintain politeness when ending the call to leave a good impression on the player.\nWhen the user asks questions that are irrelevant to the goal or process, politely refuse and guide them back to the target question.\nFor questions you do not know, do not reply randomly. You need to politely reply \&quot;I am not sure\&quot; and guide them back to the target question.&quot;,
         *     &quot;openingPrompt&quot;: &quot;Hello, respected adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive welfare event that is about to launch, which will definitely make your adventure more exciting!&quot;,
         *     &quot;output&quot;: &quot;&quot;,
         *     &quot;aiHangupOutput&quot;: &quot;&quot;,
         *     &quot;aiSilenceTimeoutOutput&quot;: &quot;&quot;
         * }</p>
         */
        public Builder promptJson(String promptJson) {
            this.putBodyParameter("PromptJson", promptJson);
            this.promptJson = promptJson;
            return this;
        }

        /**
         * <p>The scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>Test scenario</p>
         */
        public Builder scenario(String scenario) {
            this.putBodyParameter("Scenario", scenario);
            this.scenario = scenario;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
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
         * <p>The variable configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;name&quot;: &quot;Start Time&quot;,
         *     &quot;description&quot;: &quot;Start time&quot;
         * }, {
         *     &quot;name&quot;: &quot;End Time&quot;,
         *     &quot;description&quot;: &quot;End time&quot;
         * }]</p>
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
