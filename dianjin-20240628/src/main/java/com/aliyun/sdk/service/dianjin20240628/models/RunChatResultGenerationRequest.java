// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link RunChatResultGenerationRequest} extends {@link RequestModel}
 *
 * <p>RunChatResultGenerationRequest</p>
 */
public class RunChatResultGenerationRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("inferenceParameters")
    private java.util.Map<String, ?> inferenceParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("stream")
    private Boolean stream;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tools")
    private java.util.List<Tools> tools;

    private RunChatResultGenerationRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.inferenceParameters = builder.inferenceParameters;
        this.messages = builder.messages;
        this.modelId = builder.modelId;
        this.sessionId = builder.sessionId;
        this.stream = builder.stream;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunChatResultGenerationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return inferenceParameters
     */
    public java.util.Map<String, ?> getInferenceParameters() {
        return this.inferenceParameters;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return stream
     */
    public Boolean getStream() {
        return this.stream;
    }

    /**
     * @return tools
     */
    public java.util.List<Tools> getTools() {
        return this.tools;
    }

    public static final class Builder extends Request.Builder<RunChatResultGenerationRequest, Builder> {
        private String workspaceId; 
        private java.util.Map<String, ?> inferenceParameters; 
        private java.util.List<Messages> messages; 
        private String modelId; 
        private String sessionId; 
        private Boolean stream; 
        private java.util.List<Tools> tools; 

        private Builder() {
            super();
        } 

        private Builder(RunChatResultGenerationRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.inferenceParameters = request.inferenceParameters;
            this.messages = request.messages;
            this.modelId = request.modelId;
            this.sessionId = request.sessionId;
            this.stream = request.stream;
            this.tools = request.tools;
        } 

        /**
         * <p>Path parameter. The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>Hyperparameters used for inference.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;topP&quot;: 0.8}</p>
         */
        public Builder inferenceParameters(java.util.Map<String, ?> inferenceParameters) {
            this.putBodyParameter("inferenceParameters", inferenceParameters);
            this.inferenceParameters = inferenceParameters;
            return this;
        }

        /**
         * <p>Messages to input into the model.</p>
         * <p>This parameter is required.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The model service type. Get this value from the /api/app/config API endpoint in the llmHelperTypeList field.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-max</p>
         */
        public Builder modelId(String modelId) {
            this.putBodyParameter("modelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>Session ID. Use this to mark a conversation.</p>
         * 
         * <strong>example:</strong>
         * <p>237645726354</p>
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>Streaming mode. Set to true for streaming responses. Set to false for full responses. Default is false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder stream(Boolean stream) {
            this.putBodyParameter("stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>Tool information. Specify a list of tools the model can call. When multiple tools are provided, the model selects one to generate a response.</p>
         */
        public Builder tools(java.util.List<Tools> tools) {
            this.putBodyParameter("tools", tools);
            this.tools = tools;
            return this;
        }

        @Override
        public RunChatResultGenerationRequest build() {
            return new RunChatResultGenerationRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunChatResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunChatResultGenerationRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private String content; 
            private String role; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.role = model.role;
            } 

            /**
             * <p>Message content.</p>
             * 
             * <strong>example:</strong>
             * <p>你是一个信息处理专家</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Message role.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunChatResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunChatResultGenerationRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("properties")
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Parameters(Builder builder) {
            this.properties = builder.properties;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return properties
         */
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.Map<String, ?> properties; 
            private String type; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.properties = model.properties;
                this.type = model.type;
            } 

            /**
             * <p>Properties.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *                             &quot;location&quot;: {
             *                                 &quot;type&quot;: &quot;string&quot;,
             *                                 &quot;description&quot;: &quot;The city and state, e.g. San Francisco, CA&quot;
             *                             },
             *                             &quot;unit&quot;: {
             *                                 &quot;type&quot;: &quot;string&quot;,
             *                                 &quot;enum&quot;: [
             *                                     &quot;celsius&quot;,
             *                                     &quot;fahrenheit&quot;
             *                                 ]
             *                             }
             *                         }</p>
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>Type.</p>
             * 
             * <strong>example:</strong>
             * <p>object</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunChatResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunChatResultGenerationRequest</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private Parameters parameters;

        @com.aliyun.core.annotation.NameInMap("required")
        private java.util.List<String> required;

        private Function(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.parameters = builder.parameters;
            this.required = builder.required;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public Parameters getParameters() {
            return this.parameters;
        }

        /**
         * @return required
         */
        public java.util.List<String> getRequired() {
            return this.required;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private Parameters parameters; 
            private java.util.List<String> required; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.description = model.description;
                this.name = model.name;
                this.parameters = model.parameters;
                this.required = model.required;
            } 

            /**
             * <p>A string describing the tool function. This helps the model decide when and how to call it.</p>
             * 
             * <strong>example:</strong>
             * <p>工具函数的描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>A string representing the tool function name. It must contain only letters, digits, underscores, and hyphens. Maximum length is 64 characters.</p>
             * 
             * <strong>example:</strong>
             * <p>get_time</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>An object describing the tool parameters. It must be a valid JSON Schema.</p>
             */
            public Builder parameters(Parameters parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>List of required parameters.</p>
             */
            public Builder required(java.util.List<String> required) {
                this.required = required;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link RunChatResultGenerationRequest} extends {@link TeaModel}
     *
     * <p>RunChatResultGenerationRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("function")
        private Function function;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Tools(Builder builder) {
            this.function = builder.function;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return function
         */
        public Function getFunction() {
            return this.function;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Function function; 
            private String type; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.function = model.function;
                this.type = model.type;
            } 

            /**
             * <p>An object containing name, description, and parameters.</p>
             */
            public Builder function(Function function) {
                this.function = function;
                return this;
            }

            /**
             * <p>A string indicating the tool type. Currently, only &quot;function&quot; is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>function</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
}
