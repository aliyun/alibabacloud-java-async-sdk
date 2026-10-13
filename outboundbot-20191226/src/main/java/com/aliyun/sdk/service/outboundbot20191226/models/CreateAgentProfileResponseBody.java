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
 * {@link CreateAgentProfileResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgentProfileResponseBody</p>
 */
public class CreateAgentProfileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateAgentProfileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentProfileResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CreateAgentProfileResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>254EB995-DEDF-48A4-9101-9CA5B72FFBCC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateAgentProfileResponseBody build() {
            return new CreateAgentProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateAgentProfileResponseBody} extends {@link TeaModel}
     *
     * <p>CreateAgentProfileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProfileId")
        private String agentProfileId;

        @com.aliyun.core.annotation.NameInMap("AgentProfileTemplateId")
        private String agentProfileTemplateId;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstructionJson")
        private String instructionJson;

        @com.aliyun.core.annotation.NameInMap("LabelsJson")
        private String labelsJson;

        @com.aliyun.core.annotation.NameInMap("Model")
        private String model;

        @com.aliyun.core.annotation.NameInMap("ModelConfig")
        private String modelConfig;

        @com.aliyun.core.annotation.NameInMap("Prompt")
        private String prompt;

        @com.aliyun.core.annotation.NameInMap("PromptJson")
        private String promptJson;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("System")
        private Boolean system;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VariablesJson")
        private String variablesJson;

        private Data(Builder builder) {
            this.agentProfileId = builder.agentProfileId;
            this.agentProfileTemplateId = builder.agentProfileTemplateId;
            this.agentType = builder.agentType;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.instructionJson = builder.instructionJson;
            this.labelsJson = builder.labelsJson;
            this.model = builder.model;
            this.modelConfig = builder.modelConfig;
            this.prompt = builder.prompt;
            this.promptJson = builder.promptJson;
            this.scenario = builder.scenario;
            this.scriptId = builder.scriptId;
            this.system = builder.system;
            this.updateTime = builder.updateTime;
            this.variablesJson = builder.variablesJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentProfileId
         */
        public String getAgentProfileId() {
            return this.agentProfileId;
        }

        /**
         * @return agentProfileTemplateId
         */
        public String getAgentProfileTemplateId() {
            return this.agentProfileTemplateId;
        }

        /**
         * @return agentType
         */
        public String getAgentType() {
            return this.agentType;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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
         * @return system
         */
        public Boolean getSystem() {
            return this.system;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return variablesJson
         */
        public String getVariablesJson() {
            return this.variablesJson;
        }

        public static final class Builder {
            private String agentProfileId; 
            private String agentProfileTemplateId; 
            private String agentType; 
            private String createTime; 
            private String description; 
            private String instanceId; 
            private String instructionJson; 
            private String labelsJson; 
            private String model; 
            private String modelConfig; 
            private String prompt; 
            private String promptJson; 
            private String scenario; 
            private String scriptId; 
            private Boolean system; 
            private String updateTime; 
            private String variablesJson; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentProfileId = model.agentProfileId;
                this.agentProfileTemplateId = model.agentProfileTemplateId;
                this.agentType = model.agentType;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.instructionJson = model.instructionJson;
                this.labelsJson = model.labelsJson;
                this.model = model.model;
                this.modelConfig = model.modelConfig;
                this.prompt = model.prompt;
                this.promptJson = model.promptJson;
                this.scenario = model.scenario;
                this.scriptId = model.scriptId;
                this.system = model.system;
                this.updateTime = model.updateTime;
                this.variablesJson = model.variablesJson;
            } 

            /**
             * <p>The agent profile ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d31794e2a51f47d2901b4094d88311d7</p>
             */
            public Builder agentProfileId(String agentProfileId) {
                this.agentProfileId = agentProfileId;
                return this;
            }

            /**
             * <p>The agent profile template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>default-survey</p>
             */
            public Builder agentProfileTemplateId(String agentProfileTemplateId) {
                this.agentProfileTemplateId = agentProfileTemplateId;
                return this;
            }

            /**
             * <p>agent type</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1739333534000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is an agent</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1e16c663-0339-4064-9d57-07f772e78f21</p>
             */
            public Builder instanceId(String instanceId) {
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
                this.model = model;
                return this;
            }

            /**
             * <p>The model configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder modelConfig(String modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * <p>The prompt in professional mode.</p>
             * 
             * <strong>example:</strong>
             * <p>\nName: Annie \nIdentity: Game Promoter\nBackground: Promote the latest welfare events to players over the phone, ensuring that every player can keep up with the information in a timely manner and enjoy the game.\nSkills: As a game customer service representative, recommend limited-time game welfare events to users, emphasize the event highlights, and inform them of the participation process.\nConstraints: You need to remember that you are Annie, from the customer service team of a popular game, focusing on promoting the latest welfare events to players over the phone.\nAs a customer service representative who proactively contacts players, you need to choose whether to introduce the event based on the player\&quot;s intention to learn about it.\nMaintain the professionalism of the call, while keeping the language approachable to ensure that players can easily understand the event content.\nClarify the start and end times of the event to ensure that players do not get confused.\nEmphasize the key rewards and participation methods of the event to increase players\&quot; interest in participating</p>
             */
            public Builder prompt(String prompt) {
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
                this.promptJson = promptJson;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Scenario</p>
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d13ad2d3-3fe6-4352-b38b-bd6559047de8</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>Indicates whether the template is a system template.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1737077564000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
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
                this.variablesJson = variablesJson;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
