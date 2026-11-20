// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openagent20260801.models;

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
 * {@link SendMessageRequest} extends {@link RequestModel}
 *
 * <p>SendMessageRequest</p>
 */
public class SendMessageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sessionId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-OpenAgent-Idempotency-Key")
    private String xOpenAgentIdempotencyKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachments")
    private java.util.List<Attachments> attachments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("commands")
    private java.util.List<Commands> commands;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resume")
    private java.util.List<Resume> resume;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private SendMessageRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.xOpenAgentIdempotencyKey = builder.xOpenAgentIdempotencyKey;
        this.attachments = builder.attachments;
        this.commands = builder.commands;
        this.content = builder.content;
        this.resume = builder.resume;
        this.runId = builder.runId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return xOpenAgentIdempotencyKey
     */
    public String getXOpenAgentIdempotencyKey() {
        return this.xOpenAgentIdempotencyKey;
    }

    /**
     * @return attachments
     */
    public java.util.List<Attachments> getAttachments() {
        return this.attachments;
    }

    /**
     * @return commands
     */
    public java.util.List<Commands> getCommands() {
        return this.commands;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<SendMessageRequest, Builder> {
        private String sessionId; 
        private String xOpenAgentIdempotencyKey; 
        private java.util.List<Attachments> attachments; 
        private java.util.List<Commands> commands; 
        private String content; 
        private java.util.List<Resume> resume; 
        private String runId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(SendMessageRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.xOpenAgentIdempotencyKey = request.xOpenAgentIdempotencyKey;
            this.attachments = request.attachments;
            this.commands = request.commands;
            this.content = request.content;
            this.resume = request.resume;
            this.runId = request.runId;
            this.type = request.type;
        } 

        /**
         * <p>The ID of the target session to which the message is sent or the run is resumed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        public Builder sessionId(String sessionId) {
            this.putPathParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * <p>The idempotency key for the request. Use the same key and the same business parameters when you retry the same request.</p>
         * 
         * <strong>example:</strong>
         * <p>send-message-example-001</p>
         */
        public Builder xOpenAgentIdempotencyKey(String xOpenAgentIdempotencyKey) {
            this.putHeaderParameter("X-OpenAgent-Idempotency-Key", xOpenAgentIdempotencyKey);
            this.xOpenAgentIdempotencyKey = xOpenAgentIdempotencyKey;
            return this;
        }

        /**
         * <p>The list of attachments.</p>
         */
        public Builder attachments(java.util.List<Attachments> attachments) {
            this.putBodyParameter("attachments", attachments);
            this.attachments = attachments;
            return this;
        }

        /**
         * <p>The MESSAGE commands. A skill command must include <code>payload.skillId</code>. A compact command must be sent separately without a body or attachments.</p>
         */
        public Builder commands(java.util.List<Commands> commands) {
            this.putBodyParameter("commands", commands);
            this.commands = commands;
            return this;
        }

        /**
         * <p>The message text in MESSAGE mode. This parameter cannot be empty. The type parameter can be omitted in this mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Query the status of the sample resource without making changes</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The list of interrupt replies. This parameter is required when <code>type</code> is set to <code>RESUME</code>. You must reply to all pending interrupts at once. Each <code>interruptId</code> can appear only once.</p>
         */
        public Builder resume(java.util.List<Resume> resume) {
            this.putBodyParameter("resume", resume);
            this.resume = resume;
            return this;
        }

        /**
         * <p>The ID of the active run to resubscribe to. This parameter is required in RECONNECT mode.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        public Builder runId(String runId) {
            this.putBodyParameter("runId", runId);
            this.runId = runId;
            return this;
        }

        /**
         * <p>The request type. Valid values: <code>MESSAGE</code> (sends a message), <code>RESUME</code> (resumes a run), and <code>RECONNECT</code> (reconnects to a run). Default value: <code>MESSAGE</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>MESSAGE</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public SendMessageRequest build() {
            return new SendMessageRequest(this);
        } 

    } 

    /**
     * 
     * {@link SendMessageRequest} extends {@link TeaModel}
     *
     * <p>SendMessageRequest</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileExtension")
        private String fileExtension;

        @com.aliyun.core.annotation.NameInMap("fileId")
        private String fileId;

        @com.aliyun.core.annotation.NameInMap("sourceName")
        private String sourceName;

        @com.aliyun.core.annotation.NameInMap("workspacePath")
        private String workspacePath;

        private Attachments(Builder builder) {
            this.fileExtension = builder.fileExtension;
            this.fileId = builder.fileId;
            this.sourceName = builder.sourceName;
            this.workspacePath = builder.workspacePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return fileExtension
         */
        public String getFileExtension() {
            return this.fileExtension;
        }

        /**
         * @return fileId
         */
        public String getFileId() {
            return this.fileId;
        }

        /**
         * @return sourceName
         */
        public String getSourceName() {
            return this.sourceName;
        }

        /**
         * @return workspacePath
         */
        public String getWorkspacePath() {
            return this.workspacePath;
        }

        public static final class Builder {
            private String fileExtension; 
            private String fileId; 
            private String sourceName; 
            private String workspacePath; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.fileExtension = model.fileExtension;
                this.fileId = model.fileId;
                this.sourceName = model.sourceName;
                this.workspacePath = model.workspacePath;
            } 

            /**
             * <p>The file name extension.</p>
             * 
             * <strong>example:</strong>
             * <p>xlsx</p>
             */
            public Builder fileExtension(String fileExtension) {
                this.fileExtension = fileExtension;
                return this;
            }

            /**
             * <p>The ID of the file after it is uploaded.</p>
             * 
             * <strong>example:</strong>
             * <p>att_12345678</p>
             */
            public Builder fileId(String fileId) {
                this.fileId = fileId;
                return this;
            }

            /**
             * <p>The original name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>File.xlsx</p>
             */
            public Builder sourceName(String sourceName) {
                this.sourceName = sourceName;
                return this;
            }

            /**
             * <p>The workspace path.</p>
             * 
             * <strong>example:</strong>
             * <p>source/att_12345678.xlsx</p>
             */
            public Builder workspacePath(String workspacePath) {
                this.workspacePath = workspacePath;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendMessageRequest} extends {@link TeaModel}
     *
     * <p>SendMessageRequest</p>
     */
    public static class Payload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("skillId")
        private String skillId;

        private Payload(Builder builder) {
            this.name = builder.name;
            this.skillId = builder.skillId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Payload create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        public static final class Builder {
            private String name; 
            private String skillId; 

            private Builder() {
            } 

            private Builder(Payload model) {
                this.name = model.name;
                this.skillId = model.skillId;
            } 

            /**
             * <p>The skill name snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>Intelligent analysis</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The skill ID.</p>
             * 
             * <strong>example:</strong>
             * <p>agentcore_example</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            public Payload build() {
                return new Payload(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendMessageRequest} extends {@link TeaModel}
     *
     * <p>SendMessageRequest</p>
     */
    public static class Commands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("payload")
        private Payload payload;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Commands(Builder builder) {
            this.payload = builder.payload;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
            return builder().build();
        }

        /**
         * @return payload
         */
        public Payload getPayload() {
            return this.payload;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Payload payload; 
            private String type; 

            private Builder() {
            } 

            private Builder(Commands model) {
                this.payload = model.payload;
                this.type = model.type;
            } 

            /**
             * <p>The parameter object corresponding to the command type. For a skill command, you must specify the skill to be executed by using <code>skillId</code>. The <code>name</code> parameter is optional and is used only to save a snapshot of the display name. It is not used for execution or authorization checks. For a compact command, omit this object.</p>
             */
            public Builder payload(Payload payload) {
                this.payload = payload;
                return this;
            }

            /**
             * <p>The command type.</p>
             * 
             * <strong>example:</strong>
             * <p>skill</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
    /**
     * 
     * {@link SendMessageRequest} extends {@link TeaModel}
     *
     * <p>SendMessageRequest</p>
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
             * <p>The ID of the interrupt to be replied to. Obtain this value from <code>data.outcome.interrupts[].id</code> in the SSE <code>RUN_FINISHED</code> event or <code>data.outcome.interrupts[].id</code> in the <code>GetRun</code> response.</p>
             * 
             * <strong>example:</strong>
             * <p>interrupt_example_001</p>
             */
            public Builder interruptId(String interruptId) {
                this.interruptId = interruptId;
                return this;
            }

            /**
             * <p>The interrupt processing result. This parameter is required when <code>status</code> is set to <code>resolved</code> and must conform to the <code>responseSchema</code> of the corresponding interrupt. Do not provide this parameter when <code>status</code> is set to <code>cancelled</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
             */
            public Builder payload(Object payload) {
                this.payload = payload;
                return this;
            }

            /**
             * <p>The reply method for the current interrupt. A value of <code>resolved</code> indicates that the answer, confirmation, or tool result required by the interrupt is submitted, and <code>payload</code> must be provided. A value of <code>cancelled</code> indicates that the interrupt is canceled, and <code>payload</code> is not provided.</p>
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
}
