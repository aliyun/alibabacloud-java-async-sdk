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
 * {@link ListAgentProfilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentProfilesResponseBody</p>
 */
public class ListAgentProfilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAgentProfilesResponseBody(Builder builder) {
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

    public static ListAgentProfilesResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAgentProfilesResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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
         * <p>The message returned for the request.</p>
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAgentProfilesResponseBody build() {
            return new ListAgentProfilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentProfilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentProfilesResponseBody</p>
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
             * <p>The ID of the agent configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>37ca3ca1ac4b4e57adf3da5b5d939d04</p>
             */
            public Builder agentProfileId(String agentProfileId) {
                this.agentProfileId = agentProfileId;
                return this;
            }

            /**
             * <p>The ID of the agent template.</p>
             * 
             * <strong>example:</strong>
             * <p>default-survey</p>
             */
            public Builder agentProfileTemplateId(String agentProfileTemplateId) {
                this.agentProfileTemplateId = agentProfileTemplateId;
                return this;
            }

            /**
             * <p>The agent type.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder agentType(String agentType) {
                this.agentType = agentType;
                return this;
            }

            /**
             * <p>The time when the configuration was created.</p>
             * 
             * <strong>example:</strong>
             * <p>1721701525327</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>这是一个充满智慧的智能体。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e49ad122-15a1-443a-a102-84a78a93be79</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The instruction configuration in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;type&quot;:&quot;TransferToAgent&quot;,&quot;instructions&quot;:[{&quot;code&quot;:&quot;Transfer0&quot;,&quot;skillGroupId&quot;:&quot;123&quot;,&quot;skillGroupName&quot;:&quot;123&quot;}],&quot;timeoutEnable&quot;:false},{&quot;type&quot;:&quot;CollectNumber&quot;,&quot;instructions&quot;:[]}]</p>
             */
            public Builder instructionJson(String instructionJson) {
                this.instructionJson = instructionJson;
                return this;
            }

            /**
             * <p>The label definitions in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;name\&quot;:\&quot;是否送达\&quot;,\&quot;description\&quot;:\&quot;购买的家电是否已经送达\&quot;,\&quot;valueList\&quot;:\&quot;[\\\&quot;是\\\&quot;,\\\&quot;否\\\&quot;]\&quot;},{\&quot;name\&quot;:\&quot;预约上门时间\&quot;,\&quot;description\&quot;:\&quot;收集客户期望的上门安装时间\&quot;,\&quot;valueList\&quot;:\&quot;[]\&quot;}]</p>
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
             * <p>The prompt for the professional pattern.</p>
             * 
             * <strong>example:</strong>
             * <p>“”</p>
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * <p>The agent configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;:&quot;小x&quot;,&quot;gender&quot;:&quot;男&quot;,&quot;age&quot;:18,&quot;role&quot;:&quot;游戏推广员&quot;,&quot;communicationStyle&quot;:[&quot;亲切&quot;],&quot;goals&quot;:&quot;你好&quot;,&quot;background&quot;:&quot;不是很好&quot;,&quot;openingPrompt&quot;:&quot;你好，我是xxx&quot;}</p>
             */
            public Builder promptJson(String promptJson) {
                this.promptJson = promptJson;
                return this;
            }

            /**
             * <p>The scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>测试场景</p>
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>43972417-0657-452a-81c2-c59d8245a9b2</p>
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * <p>Indicates whether this is a system template.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * <p>The time when the configuration was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1721701525327</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The variable configuration in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;name\&quot;:\&quot;name\&quot;,\&quot;description\&quot;:\&quot;客户姓名\&quot;},{\&quot;name\&quot;:\&quot;gender\&quot;,\&quot;description\&quot;:\&quot;客户性别\&quot;}]</p>
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
