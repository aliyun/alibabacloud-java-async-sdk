// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link InvokeAgentRequest} extends {@link RequestModel}
 *
 * <p>InvokeAgentRequest</p>
 */
public class InvokeAgentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("context")
    private java.util.List<Context> context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("forwardedProps")
    private ForwardedProps forwardedProps;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parentRunId")
    private String parentRunId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resume")
    private java.util.List<Resume> resume;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("state")
    private Object state;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tools")
    private java.util.List<Tools> tools;

    private InvokeAgentRequest(Builder builder) {
        super(builder);
        this.context = builder.context;
        this.forwardedProps = builder.forwardedProps;
        this.messages = builder.messages;
        this.parentRunId = builder.parentRunId;
        this.resume = builder.resume;
        this.runId = builder.runId;
        this.state = builder.state;
        this.threadId = builder.threadId;
        this.tools = builder.tools;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeAgentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return context
     */
    public java.util.List<Context> getContext() {
        return this.context;
    }

    /**
     * @return forwardedProps
     */
    public ForwardedProps getForwardedProps() {
        return this.forwardedProps;
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return parentRunId
     */
    public String getParentRunId() {
        return this.parentRunId;
    }

    /**
     * @return resume
     */
    public java.util.List<Resume> getResume() {
        return this.resume;
    }

    /**
     * @return runId
     */
    public String getRunId() {
        return this.runId;
    }

    /**
     * @return state
     */
    public Object getState() {
        return this.state;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    /**
     * @return tools
     */
    public java.util.List<Tools> getTools() {
        return this.tools;
    }

    public static final class Builder extends Request.Builder<InvokeAgentRequest, Builder> {
        private java.util.List<Context> context; 
        private ForwardedProps forwardedProps; 
        private java.util.List<Messages> messages; 
        private String parentRunId; 
        private java.util.List<Resume> resume; 
        private String runId; 
        private Object state; 
        private String threadId; 
        private java.util.List<Tools> tools; 

        private Builder() {
            super();
        } 

        private Builder(InvokeAgentRequest request) {
            super(request);
            this.context = request.context;
            this.forwardedProps = request.forwardedProps;
            this.messages = request.messages;
            this.parentRunId = request.parentRunId;
            this.resume = request.resume;
            this.runId = request.runId;
            this.state = request.state;
            this.threadId = request.threadId;
            this.tools = request.tools;
        } 

        /**
         * <p>The AG-UI native context array. Each item contains description and value strings. Undeclared extension keys are still passed through. Currently, the downstream service only logs a warning and ignores them. The ACK resource context is carried by forwardedProps.ackContext. If omitted, it is processed as an empty array. Null values are not accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;description&quot;:&quot;cluster&quot;,&quot;value&quot;:&quot;c-1&quot;}]</p>
         */
        public Builder context(java.util.List<Context> context) {
            this.putBodyParameter("context", context);
            this.context = context;
            return this;
        }

        /**
         * <p>The AG-UI ACK extension parameters, including language, enableThinking, and source. Unknown extensions are preserved.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;enableThinking&quot;:true}</p>
         */
        public Builder forwardedProps(ForwardedProps forwardedProps) {
            this.putBodyParameter("forwardedProps", forwardedProps);
            this.forwardedProps = forwardedProps;
            return this;
        }

        /**
         * <p>The AG-UI message list. In the current phase, user input only declares plain text content. Historical assistant and tool messages, as well as toolCalls, are preserved. Only the text of the last user message is consumed. If omitted, it is processed as an empty array. Null values are not accepted. Undeclared extension fields are passed through.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;id&quot;:&quot;m-1&quot;,&quot;role&quot;:&quot;user&quot;,&quot;content&quot;:&quot;Hello&quot;}]</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.putBodyParameter("messages", messages);
            this.messages = messages;
            return this;
        }

        /**
         * <p>The parent run ID. This parameter is optional and is currently not used by the downstream service.</p>
         * 
         * <strong>example:</strong>
         * <p>r-0</p>
         */
        public Builder parentRunId(String parentRunId) {
            this.putBodyParameter("parentRunId", parentRunId);
            this.parentRunId = parentRunId;
            return this;
        }

        /**
         * <p>The AG-UI interrupt resume response list. Independent of the private protocol approval parameters. A single request must answer the current complete approval batch.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;interruptId&quot;:&quot;i-1&quot;,&quot;status&quot;:&quot;resolved&quot;,&quot;payload&quot;:{&quot;decision&quot;:&quot;yes&quot;}}]</p>
         */
        public Builder resume(java.util.List<Resume> resume) {
            this.putBodyParameter("resume", resume);
            this.resume = resume;
            return this;
        }

        /**
         * <p>The AG-UI current run ID. Must be explicitly provided as a string. Empty strings are allowed and will be generated by the downstream service. Missing or null values are rejected.</p>
         * 
         * <strong>example:</strong>
         * <p>run-1</p>
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The AG-UI native state. Accepts any JSON value, including null. This parameter is currently not used by the downstream service.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder state(Object state) {
            this.putBodyParameter("state", state);
            this.state = state;
            return this;
        }

        /**
         * <p>The AG-UI session ID. Must be explicitly provided as a string. If not empty, only 32 lowercase hexadecimal characters [0-9a-f]{32} are accepted. A standard run can be created or resumed by using this ID. If an empty string is provided, the server generates a session ID. A resume operation must use an existing session ID. Missing or null values are rejected. This API only accepts native requests and does not require the stream parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>abcdef0123456789abcdef0123456789</p>
         */
        public Builder threadId(String threadId) {
            this.putBodyParameter("threadId", threadId);
            this.threadId = threadId;
            return this;
        }

        /**
         * <p>The AG-UI native tool definitions. The name and description are strings, and parameters is an opaque JSON Schema. Accepted and passed through. Currently, the downstream service only logs a warning and ignores them. Frontend tool injection is not supported. If omitted, it is processed as an empty array. Null values are not accepted.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder tools(java.util.List<Tools> tools) {
            this.putBodyParameter("tools", tools);
            this.tools = tools;
            return this;
        }

        @Override
        public InvokeAgentRequest build() {
            return new InvokeAgentRequest(this);
        } 

    } 

    /**
     * 
     * {@link InvokeAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAgentRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        @com.aliyun.core.annotation.NameInMap("value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private Context(Builder builder) {
            this.description = builder.description;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String value; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.description = model.description;
                this.value = model.value;
            } 

            /**
             * <p>The description of the orchestration template.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The environment variable value.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAgentRequest</p>
     */
    public static class ForwardedProps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enableThinking")
        private Boolean enableThinking;

        @com.aliyun.core.annotation.NameInMap("language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("source")
        private String source;

        private ForwardedProps(Builder builder) {
            this.enableThinking = builder.enableThinking;
            this.language = builder.language;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForwardedProps create() {
            return builder().build();
        }

        /**
         * @return enableThinking
         */
        public Boolean getEnableThinking() {
            return this.enableThinking;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private Boolean enableThinking; 
            private String language; 
            private String source; 

            private Builder() {
            } 

            private Builder(ForwardedProps model) {
                this.enableThinking = model.enableThinking;
                this.language = model.language;
                this.source = model.source;
            } 

            /**
             * <p>Specifies whether to enable thinking.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableThinking(Boolean enableThinking) {
                this.enableThinking = enableThinking;
                return this;
            }

            /**
             * <p>The query language. Valid values:</p>
             * <ul>
             * <li>zh: Chinese.</li>
             * <li>en: English.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The source.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public ForwardedProps build() {
                return new ForwardedProps(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAgentRequest</p>
     */
    public static class Function extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Function(Builder builder) {
            this.arguments = builder.arguments;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Function create() {
            return builder().build();
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String arguments; 
            private String name; 

            private Builder() {
            } 

            private Builder(Function model) {
                this.arguments = model.arguments;
                this.name = model.name;
            } 

            /**
             * <p>The JSON string of the tool invocation parameters, not an expanded object.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The function name.</p>
             * 
             * <strong>example:</strong>
             * <p>navy</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Function build() {
                return new Function(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAgentRequest</p>
     */
    public static class ToolCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("encryptedValue")
        private String encryptedValue;

        @com.aliyun.core.annotation.NameInMap("function")
        private Function function;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ToolCalls(Builder builder) {
            this.encryptedValue = builder.encryptedValue;
            this.function = builder.function;
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCalls create() {
            return builder().build();
        }

        /**
         * @return encryptedValue
         */
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        /**
         * @return function
         */
        public Function getFunction() {
            return this.function;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String encryptedValue; 
            private Function function; 
            private String id; 
            private java.util.Map<String, ?> metadata; 
            private String type; 

            private Builder() {
            } 

            private Builder(ToolCalls model) {
                this.encryptedValue = model.encryptedValue;
                this.function = model.function;
                this.id = model.id;
                this.metadata = model.metadata;
                this.type = model.type;
            } 

            /**
             * <p>The encrypted content. The example is an invalid placeholder value and does not contain real ciphertext.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder encryptedValue(String encryptedValue) {
                this.encryptedValue = encryptedValue;
                return this;
            }

            /**
             * <p>The function information of the historical tool invocation, including the name and arguments in JSON string format. The actual return values should be preserved in subsequent turns.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;name&quot;: &quot;xxx&quot;, &quot;arguments&quot;: &quot;xxx&quot;}</p>
             */
            public Builder function(Function function) {
                this.function = function;
                return this;
            }

            /**
             * <p>The trigger ID.</p>
             * 
             * <strong>example:</strong>
             * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The tool invocation type. Fixed to function.</p>
             * 
             * <strong>example:</strong>
             * <p>function</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ToolCalls build() {
                return new ToolCalls(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAgentRequest</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("encryptedValue")
        private String encryptedValue;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("subagentRunId")
        private String subagentRunId;

        @com.aliyun.core.annotation.NameInMap("toolCallId")
        private String toolCallId;

        @com.aliyun.core.annotation.NameInMap("toolCalls")
        private java.util.List<ToolCalls> toolCalls;

        private Messages(Builder builder) {
            this.content = builder.content;
            this.encryptedValue = builder.encryptedValue;
            this.id = builder.id;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.role = builder.role;
            this.subagentRunId = builder.subagentRunId;
            this.toolCallId = builder.toolCallId;
            this.toolCalls = builder.toolCalls;
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
         * @return encryptedValue
         */
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return subagentRunId
         */
        public String getSubagentRunId() {
            return this.subagentRunId;
        }

        /**
         * @return toolCallId
         */
        public String getToolCallId() {
            return this.toolCallId;
        }

        /**
         * @return toolCalls
         */
        public java.util.List<ToolCalls> getToolCalls() {
            return this.toolCalls;
        }

        public static final class Builder {
            private String content; 
            private String encryptedValue; 
            private String id; 
            private java.util.Map<String, ?> metadata; 
            private String name; 
            private String role; 
            private String subagentRunId; 
            private String toolCallId; 
            private java.util.List<ToolCalls> toolCalls; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.content = model.content;
                this.encryptedValue = model.encryptedValue;
                this.id = model.id;
                this.metadata = model.metadata;
                this.name = model.name;
                this.role = model.role;
                this.subagentRunId = model.subagentRunId;
                this.toolCallId = model.toolCallId;
                this.toolCalls = model.toolCalls;
            } 

            /**
             * <p>The plain text content. This parameter can be omitted when the assistant only calls tools. Currently, only the text of the last user message is consumed.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The encrypted content of the tool invocation. The example is only a placeholder value.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder encryptedValue(String encryptedValue) {
                this.encryptedValue = encryptedValue;
                return this;
            }

            /**
             * <p>The message ID.</p>
             * 
             * <strong>example:</strong>
             * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The name.</p>
             * 
             * <strong>example:</strong>
             * <p>n-1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The message role. Valid values: user, developer, system, assistant, and tool. The user role requires text content. The assistant role can contain only toolCalls. The tool role requires content and toolCallId. Multimodal input is not declared in the current phase.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The sub-agent invocation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
             */
            public Builder subagentRunId(String subagentRunId) {
                this.subagentRunId = subagentRunId;
                return this;
            }

            /**
             * <p>Required when role is set to tool. References the tool_call ID from the previous Mobile-Use Agent response.</p>
             * 
             * <strong>example:</strong>
             * <p>64ea4d94937a4c5c84e2b3b814d14696</p>
             */
            public Builder toolCallId(String toolCallId) {
                this.toolCallId = toolCallId;
                return this;
            }

            /**
             * <p>A structured tool invocation in the historical messages of the assistant. The id, type, and function returned by the server are preserved.</p>
             */
            public Builder toolCalls(java.util.List<ToolCalls> toolCalls) {
                this.toolCalls = toolCalls;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAgentRequest</p>
     */
    public static class Resume extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("interruptId")
        private String interruptId;

        @com.aliyun.core.annotation.NameInMap("payload")
        private Object payload;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Resume(Builder builder) {
            this.interruptId = builder.interruptId;
            this.payload = builder.payload;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resume create() {
            return builder().build();
        }

        /**
         * @return interruptId
         */
        public String getInterruptId() {
            return this.interruptId;
        }

        /**
         * @return payload
         */
        public Object getPayload() {
            return this.payload;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String interruptId; 
            private Object payload; 
            private String status; 

            private Builder() {
            } 

            private Builder(Resume model) {
                this.interruptId = model.interruptId;
                this.payload = model.payload;
                this.status = model.status;
            } 

            /**
             * <p>Corresponds to outcome.interrupts[].id, not toolCallId.</p>
             * 
             * <strong>example:</strong>
             * <p>i-1</p>
             */
            public Builder interruptId(String interruptId) {
                this.interruptId = interruptId;
                return this;
            }

            /**
             * <p>The arbitrary JSON response payload. Tool approval uses an object with decision=yes/no, and ask_human uses a string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;decision&quot;:&quot;yes&quot;}</p>
             */
            public Builder payload(Object payload) {
                this.payload = payload;
                return this;
            }

            /**
             * <p>The response status. Valid values: resolved and cancelled. Both approval and rejection use resolved, distinguished by payload.decision.</p>
             * 
             * <strong>example:</strong>
             * <p>resolved</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Resume build() {
                return new Resume(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvokeAgentRequest} extends {@link TeaModel}
     *
     * <p>InvokeAgentRequest</p>
     */
    public static class Tools extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        @com.aliyun.core.annotation.NameInMap("metadata")
        private java.util.Map<String, ?> metadata;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("parameters")
        private Object parameters;

        private Tools(Builder builder) {
            this.description = builder.description;
            this.metadata = builder.metadata;
            this.name = builder.name;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tools create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return metadata
         */
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
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
        public Object getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private String description; 
            private java.util.Map<String, ?> metadata; 
            private String name; 
            private Object parameters; 

            private Builder() {
            } 

            private Builder(Tools model) {
                this.description = model.description;
                this.metadata = model.metadata;
                this.name = model.name;
                this.parameters = model.parameters;
            } 

            /**
             * <p>The description of the check item.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metadata(java.util.Map<String, ?> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The environment variable name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster-qa-icloud-edge-ohttp</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The optional JSON Schema for tool parameters. Cannot be null. The internal structure is defined by the tool.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;region\&quot;: \&quot;cn-shanghai\&quot;, \&quot;vpcId\&quot;: \&quot;vpc-uf6bnhlxne8enjurxxjv4\&quot;, \&quot;functionName\&quot;: \&quot;filemgr-cn-shanghai-334a349cd2\&quot;, \&quot;mountPointsServerAddr\&quot;: \&quot;334a349cd2-umc45.cn-shanghai.nas.aliyuncs.com\&quot;}</p>
             */
            public Builder parameters(Object parameters) {
                this.parameters = parameters;
                return this;
            }

            public Tools build() {
                return new Tools(this);
            } 

        } 

    }
}
