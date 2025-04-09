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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
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
             * AgentProfileId.
             */
            public Builder agentProfileId(String agentProfileId) {
                this.agentProfileId = agentProfileId;
                return this;
            }

            /**
             * AgentProfileTemplateId.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstructionJson.
             */
            public Builder instructionJson(String instructionJson) {
                this.instructionJson = instructionJson;
                return this;
            }

            /**
             * LabelsJson.
             */
            public Builder labelsJson(String labelsJson) {
                this.labelsJson = labelsJson;
                return this;
            }

            /**
             * Model.
             */
            public Builder model(String model) {
                this.model = model;
                return this;
            }

            /**
             * ModelConfig.
             */
            public Builder modelConfig(String modelConfig) {
                this.modelConfig = modelConfig;
                return this;
            }

            /**
             * Prompt.
             */
            public Builder prompt(String prompt) {
                this.prompt = prompt;
                return this;
            }

            /**
             * PromptJson.
             */
            public Builder promptJson(String promptJson) {
                this.promptJson = promptJson;
                return this;
            }

            /**
             * Scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * System.
             */
            public Builder system(Boolean system) {
                this.system = system;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VariablesJson.
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
