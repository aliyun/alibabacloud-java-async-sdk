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
         * <p>The agent profile ID.</p>
         * <blockquote>
         * <p>You can obtain the agent profile ID of a created scenario from the ChatbotId response parameter of DescribeScript.</p>
         * </blockquote>
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
         * <p>The API plugin configuration.</p>
         * <blockquote>
         * <p>To bind multiple APIs, obtain the UUIDs of multiple APIs through ListApiPlugins, and fill them in the format of [{&quot;uuid&quot;:&quot;xxx&quot;},{&quot;uuid&quot;:&quot;xxxx&quot;},....].</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;uuid&quot;:&quot;a55d171da96c41a************&quot;},{&quot;uuid&quot;:&quot;d41a3e5195d1402********&quot;}]</p>
         */
        public Builder apiPluginJson(String apiPluginJson) {
            this.putBodyParameter("ApiPluginJson", apiPluginJson);
            this.apiPluginJson = apiPluginJson;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>First version submitted for review</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The FAQ category IDs.</p>
         */
        public Builder faqCategoryIds(java.util.List<Long> faqCategoryIds) {
            String faqCategoryIdsShrink = shrink(faqCategoryIds, "FaqCategoryIds", "json");
            this.putBodyParameter("FaqCategoryIds", faqCategoryIdsShrink);
            this.faqCategoryIds = faqCategoryIds;
            return this;
        }

        /**
         * <p>The instance ID.</p>
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
         * <p>The label description.</p>
         * 
         * <strong>example:</strong>
         * <p>[{
         *     &quot;name&quot;: &quot;Satisfied&quot;,
         *     &quot;description&quot;: &quot;Whether interested in the introduced game content&quot;,
         *     &quot;valueList&quot;: &quot;[\&quot;Interested\&quot;,\&quot;Not interested\&quot;]&quot;
         * }]</p>
         */
        public Builder labelsJson(String labelsJson) {
            this.putBodyParameter("LabelsJson", labelsJson);
            this.labelsJson = labelsJson;
            return this;
        }

        /**
         * <p>The model ID.</p>
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
         * <p>The model configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder modelConfig(String modelConfig) {
            this.putBodyParameter("ModelConfig", modelConfig);
            this.modelConfig = modelConfig;
            return this;
        }

        /**
         * <p>The prompt in professional mode.</p>
         * 
         * <strong>example:</strong>
         * <p>\nName: Annie \nIdentity: Game Promoter\nBackground: Promote the latest promotional events to players over the phone, ensuring that every player stays informed and enjoys the game.\nSkills: As a game customer service representative, recommend limited-time game promotional events to users, highlight the event benefits, and inform them of the participation process.\nConstraints: You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest promotional events to players over the phone.\nAs a customer service representative proactively contacting players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call while keeping the language approachable to ensure players can easily understand the event content.\nClarify the start and end times of the event to ensure players do not get confused.\nHighlight the key rewards and participation methods to increase players\&quot; interest in participating</p>
         */
        public Builder prompt(String prompt) {
            this.putBodyParameter("Prompt", prompt);
            this.prompt = prompt;
            return this;
        }

        /**
         * <p>The agent configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;name&quot;: &quot;Annie&quot;,
         *     &quot;gender&quot;: &quot;Female&quot;,
         *     &quot;age&quot;: 20,
         *     &quot;role&quot;: &quot;Game Promoter&quot;,
         *     &quot;communicationStyle&quot;: [&quot;Friendly&quot;, &quot;Conversational&quot;, &quot;Lively&quot;],
         *     &quot;goals&quot;: &quot;Promote the latest promotional events to players over the phone, ensuring that every player stays informed and enjoys the game.&quot;,
         *     &quot;background&quot;: &quot;Event Introduction\nStarting from ${Start Time} until ${End Time}, we have carefully prepared the \&quot;Limited-Time Treasure Hunt\&quot; promotional event for a week. As long as you log in to the game daily during this period, you can claim a login gift pack containing rare materials, energy potions, and exclusive cosmetic rewards.\n\nEvent Highlights\nThe highlight of this event is that players who log in for 5 cumulative days will receive an extra \&quot;Mystery Chest\&quot;. Opening the chest to obtain a rare pet will add a powerful boost to your battles! Do not miss this excellent opportunity to enhance your strength.\n\nHow to Participate\nAfter logging into the game, find \&quot;Limited-Time Treasure Hunt\&quot; in the event panel and click to claim the corresponding rewards. Remember to log in every day, the rewards wait for no one!&quot;,
         *     &quot;skills&quot;: &quot;As a game customer service representative, recommend limited-time game promotional events to users, highlight the event benefits, and inform them of the participation process.&quot;,
         *     &quot;workflow&quot;: &quot;1. Friendly greeting and self-introduction\n- Opening: \&quot;Greetings, honorable adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive promotional event that is about to launch, which will definitely make your adventure more exciting!\&quot;\n- Introduce the promotional event only after confirming that the player wants to learn about it.\n2. Promotional event introduction\n3. Highlight event benefits\n4. Explain how to participate and remind\n5. Encourage sharing and feedback\n- Call to action: \&quot;If you think this event is good, feel free to share this good news with your guild mates or game friends. At the same time, we also welcome you to share your experience and suggestions through the in-game feedback system after the event ends.\&quot;\nSkill 6: Politely end the call\n- Closing: \&quot;Well, honorable adventurer, that is the main content of this event. I hope you will return with full rewards from the event, and I wish you invincible in your journey! If you have any questions, feel free to contact our customer service team. Thank you for taking my call, I look forward to serving you again, goodbye!\&quot;&quot;,
         *     &quot;constraint&quot;: &quot;You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest promotional events to players over the phone.\nAs a customer service representative proactively contacting players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call while keeping the language approachable to ensure players can easily understand the event content.\nClarify the start and end times of the event to ensure players do not get confused.\nHighlight the key rewards and participation methods to increase players\&quot; interest in participating.\nEncourage interaction and feedback among players to promote the activity of the game community.\nMaintain politeness when ending the call to leave a good impression on the player.\nWhen the user asks questions unrelated to the goal or process, politely refuse and guide them back to the target topic.\nFor questions you do not know the answer to, do not reply randomly. You need to politely reply \&quot;I am not sure\&quot; and guide them back to the target topic.&quot;,
         *     &quot;openingPrompt&quot;: &quot;Greetings, honorable adventurer! I am Annie from the game customer service team. I am honored to connect with you today to share an exclusive promotional event that is about to launch, which will definitely make your adventure more exciting!&quot;,
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
        public ModifyAgentProfileRequest build() {
            return new ModifyAgentProfileRequest(this);
        } 

    } 

}
