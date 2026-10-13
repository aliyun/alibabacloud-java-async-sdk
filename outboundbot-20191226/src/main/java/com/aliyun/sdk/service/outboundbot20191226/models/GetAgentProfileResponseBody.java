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
 * {@link GetAgentProfileResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentProfileResponseBody</p>
 */
public class GetAgentProfileResponseBody extends TeaModel {
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

    private GetAgentProfileResponseBody(Builder builder) {
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

    public static GetAgentProfileResponseBody create() {
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

        private Builder(GetAgentProfileResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
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
         * <p>The returned message.</p>
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
         * <p>7A573837-3AD3-54CF-930A-07A3287042C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgentProfileResponseBody build() {
            return new GetAgentProfileResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentProfileResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentProfileResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentProfileId")
        private String agentProfileId;

        @com.aliyun.core.annotation.NameInMap("AgentProfileTemplateId")
        private String agentProfileTemplateId;

        @com.aliyun.core.annotation.NameInMap("AgentType")
        private String agentType;

        @com.aliyun.core.annotation.NameInMap("ApiPluginJson")
        private String apiPluginJson;

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

        @com.aliyun.core.annotation.NameInMap("NluConfigJson")
        private String nluConfigJson;

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
            this.apiPluginJson = builder.apiPluginJson;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.instanceId = builder.instanceId;
            this.instructionJson = builder.instructionJson;
            this.labelsJson = builder.labelsJson;
            this.model = builder.model;
            this.modelConfig = builder.modelConfig;
            this.nluConfigJson = builder.nluConfigJson;
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
         * @return apiPluginJson
         */
        public String getApiPluginJson() {
            return this.apiPluginJson;
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
         * @return nluConfigJson
         */
        public String getNluConfigJson() {
            return this.nluConfigJson;
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
            private String apiPluginJson; 
            private String createTime; 
            private String description; 
            private String instanceId; 
            private String instructionJson; 
            private String labelsJson; 
            private String model; 
            private String modelConfig; 
            private String nluConfigJson; 
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
                this.apiPluginJson = model.apiPluginJson;
                this.createTime = model.createTime;
                this.description = model.description;
                this.instanceId = model.instanceId;
                this.instructionJson = model.instructionJson;
                this.labelsJson = model.labelsJson;
                this.model = model.model;
                this.modelConfig = model.modelConfig;
                this.nluConfigJson = model.nluConfigJson;
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
             * <p>&quot;&quot;</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The API plugin configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder apiPluginJson(String apiPluginJson) {
                this.apiPluginJson = apiPluginJson;
                return this;
            }

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1741338619000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a large language model chatbot</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7f04f92c-ccfc-4f8f-a816-6902023be5c6</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instruction configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;TransferToAgent&quot;,&quot;instructions&quot;:[{&quot;code&quot;:&quot;Transfer0&quot;,&quot;skillGroupId&quot;:&quot;123&quot;,&quot;skillGroupName&quot;:&quot;123&quot;}],&quot;timeoutEnable&quot;:false},{&quot;type&quot;:&quot;CollectNumber&quot;,&quot;instructions&quot;:[]}]</p>
             */
            public Builder instructionJson(String instructionJson) {
                this.instructionJson = instructionJson;
                return this;
            }

            /**
             * <p>The label descriptions.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;name\&quot;:\&quot;Delivered\&quot;,\&quot;description\&quot;:\&quot;Whether the purchased home appliance has been delivered\&quot;,\&quot;valueList\&quot;:\&quot;[\\\&quot;Yes\\\&quot;,\\\&quot;No\\\&quot;]\&quot;},{\&quot;name\&quot;:\&quot;On-site Appointment Time\&quot;,\&quot;description\&quot;:\&quot;Collect the customer\&quot;s expected on-site installation time\&quot;,\&quot;valueList\&quot;:\&quot;[]\&quot;}]</p>
             */
            public Builder labelsJson(String labelsJson) {
                this.labelsJson = labelsJson;
                return this;
            }

            /**
             * <p>The model ID.</p>
             * 
             * <strong>example:</strong>
             * <p>model_002</p>
             */
            public Builder model(String model) {
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
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * <p>The NLU configuration. Parameter settings:</p>
             * <ul>
             * <li>chatbotInstanceId: the instance ID of the Chatbot large language model.</li>
             * <li>faqCategoryIds: the IDs of the attached FAQ categories.</li>
             * <li>llmAgentId: the workspace ID of the Chatbot large language model.</li>
             * <li>llmAgentKey: the workspace key of the Chatbot large language model.</li>
             * <li>llmAgentInstanceId: the workspace instance ID of the Chatbot large language model.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;chatbotInstanceId&quot;:&quot;chatbot-cn-j7eiVJZRmb&quot;,&quot;faqCategoryIds&quot;:[30000474726],&quot;llmAgentId&quot;:&quot;1246206&quot;,&quot;llmAgentInstanceId&quot;:&quot;outbound_05efb75a-95df-438e-9b9b-8f2c857d5498&quot;,&quot;llmAgentKey&quot;:&quot;d682716514814815ae77757c0bcbda01_p_outbound_public&quot;}</p>
             */
            public Builder nluConfigJson(String nluConfigJson) {
                this.nluConfigJson = nluConfigJson;
                return this;
            }

            /**
             * <p>The prompt in professional mode.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The agent configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;Xiao X&quot;,&quot;gender&quot;:&quot;Male&quot;,&quot;age&quot;:18,&quot;role&quot;:&quot;Game Promoter&quot;,&quot;communicationStyle&quot;:[&quot;Friendly&quot;],&quot;goals&quot;:&quot;Hello&quot;,&quot;background&quot;:&quot;Not very good&quot;,&quot;openingPrompt&quot;:&quot;Hello, I am XXX&quot;}</p>
             */
            public Builder promptJson(String promptJson) {
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
             * <p>false</p>
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1741338619000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The variable configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;name\&quot;:\&quot;name\&quot;,\&quot;description\&quot;:\&quot;Customer name\&quot;},{\&quot;name\&quot;:\&quot;gender\&quot;,\&quot;description\&quot;:\&quot;Customer gender\&quot;}]</p>
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
