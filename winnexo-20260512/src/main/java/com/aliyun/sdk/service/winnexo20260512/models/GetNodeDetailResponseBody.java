// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetNodeDetailResponseBody</p>
 */
public class GetNodeDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentWorkProcess")
    private AgentWorkProcess agentWorkProcess;

    @com.aliyun.core.annotation.NameInMap("artifacts")
    private java.util.List<Artifacts> artifacts;

    @com.aliyun.core.annotation.NameInMap("attemptSeq")
    private Long attemptSeq;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("conversationWritable")
    private Boolean conversationWritable;

    @com.aliyun.core.annotation.NameInMap("handler")
    private String handler;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("nodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("nodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.Map<String, ?> result;

    @com.aliyun.core.annotation.NameInMap("resumePending")
    private Boolean resumePending;

    @com.aliyun.core.annotation.NameInMap("runLog")
    private java.util.List<RunLog> runLog;

    @com.aliyun.core.annotation.NameInMap("stateVersion")
    private Long stateVersion;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("todoIds")
    private java.util.List<String> todoIds;

    @com.aliyun.core.annotation.NameInMap("turnSeq")
    private Long turnSeq;

    @com.aliyun.core.annotation.NameInMap("waitType")
    private String waitType;

    private GetNodeDetailResponseBody(Builder builder) {
        this.agentWorkProcess = builder.agentWorkProcess;
        this.artifacts = builder.artifacts;
        this.attemptSeq = builder.attemptSeq;
        this.code = builder.code;
        this.conversationId = builder.conversationId;
        this.conversationWritable = builder.conversationWritable;
        this.handler = builder.handler;
        this.message = builder.message;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.nodeType = builder.nodeType;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resumePending = builder.resumePending;
        this.runLog = builder.runLog;
        this.stateVersion = builder.stateVersion;
        this.status = builder.status;
        this.todoIds = builder.todoIds;
        this.turnSeq = builder.turnSeq;
        this.waitType = builder.waitType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentWorkProcess
     */
    public AgentWorkProcess getAgentWorkProcess() {
        return this.agentWorkProcess;
    }

    /**
     * @return artifacts
     */
    public java.util.List<Artifacts> getArtifacts() {
        return this.artifacts;
    }

    /**
     * @return attemptSeq
     */
    public Long getAttemptSeq() {
        return this.attemptSeq;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return conversationWritable
     */
    public Boolean getConversationWritable() {
        return this.conversationWritable;
    }

    /**
     * @return handler
     */
    public String getHandler() {
        return this.handler;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.Map<String, ?> getResult() {
        return this.result;
    }

    /**
     * @return resumePending
     */
    public Boolean getResumePending() {
        return this.resumePending;
    }

    /**
     * @return runLog
     */
    public java.util.List<RunLog> getRunLog() {
        return this.runLog;
    }

    /**
     * @return stateVersion
     */
    public Long getStateVersion() {
        return this.stateVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return todoIds
     */
    public java.util.List<String> getTodoIds() {
        return this.todoIds;
    }

    /**
     * @return turnSeq
     */
    public Long getTurnSeq() {
        return this.turnSeq;
    }

    /**
     * @return waitType
     */
    public String getWaitType() {
        return this.waitType;
    }

    public static final class Builder {
        private AgentWorkProcess agentWorkProcess; 
        private java.util.List<Artifacts> artifacts; 
        private Long attemptSeq; 
        private String code; 
        private String conversationId; 
        private Boolean conversationWritable; 
        private String handler; 
        private String message; 
        private String nodeId; 
        private String nodeName; 
        private String nodeType; 
        private String requestId; 
        private java.util.Map<String, ?> result; 
        private Boolean resumePending; 
        private java.util.List<RunLog> runLog; 
        private Long stateVersion; 
        private String status; 
        private java.util.List<String> todoIds; 
        private Long turnSeq; 
        private String waitType; 

        private Builder() {
        } 

        private Builder(GetNodeDetailResponseBody model) {
            this.agentWorkProcess = model.agentWorkProcess;
            this.artifacts = model.artifacts;
            this.attemptSeq = model.attemptSeq;
            this.code = model.code;
            this.conversationId = model.conversationId;
            this.conversationWritable = model.conversationWritable;
            this.handler = model.handler;
            this.message = model.message;
            this.nodeId = model.nodeId;
            this.nodeName = model.nodeName;
            this.nodeType = model.nodeType;
            this.requestId = model.requestId;
            this.result = model.result;
            this.resumePending = model.resumePending;
            this.runLog = model.runLog;
            this.stateVersion = model.stateVersion;
            this.status = model.status;
            this.todoIds = model.todoIds;
            this.turnSeq = model.turnSeq;
            this.waitType = model.waitType;
        } 

        /**
         * <p>The actual work process grouped by thoughts, skills, tools, replies, and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;thoughts&quot;:[],&quot;skillCalls&quot;:[],&quot;toolCalls&quot;:[],&quot;replies&quot;:[],&quot;artifacts&quot;:[]}</p>
         */
        public Builder agentWorkProcess(AgentWorkProcess agentWorkProcess) {
            this.agentWorkProcess = agentWorkProcess;
            return this;
        }

        /**
         * <p>The artifacts: saved node work records and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder artifacts(java.util.List<Artifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }

        /**
         * <p>The sequence number of the node execution attempt.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder attemptSeq(Long attemptSeq) {
            this.attemptSeq = attemptSeq;
            return this;
        }

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The node conversation ID. This parameter is empty if no conversation is created.</p>
         * 
         * <strong>example:</strong>
         * <p>conversation_example</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>Indicates whether the current node conversation can continue to receive input.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder conversationWritable(Boolean conversationWritable) {
            this.conversationWritable = conversationWritable;
            return this;
        }

        /**
         * <p>The display name of the node owner. This parameter is empty if the owner is unknown.</p>
         * 
         * <strong>example:</strong>
         * <p>Digital worker</p>
         */
        public Builder handler(String handler) {
            this.handler = handler;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The node key.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * <p>The display name of the node, which shares the same source as the node list.</p>
         * 
         * <strong>example:</strong>
         * <p>Query signed amount</p>
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * <p>The node type. The actual enum value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>AGENT</p>
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The node result summary, excluding inline content.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder result(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether there are pending follow-up turns to be dispatched.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder resumePending(Boolean resumePending) {
            this.resumePending = resumePending;
            return this;
        }

        /**
         * <p>The run log: saved node work records and artifacts.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder runLog(java.util.List<RunLog> runLog) {
            this.runLog = runLog;
            return this;
        }

        /**
         * <p>stateVersion</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder stateVersion(Long stateVersion) {
            this.stateVersion = stateVersion;
            return this;
        }

        /**
         * <p>The node running status. The actual enum value is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The list of to-do IDs associated with the current node.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder todoIds(java.util.List<String> todoIds) {
            this.todoIds = todoIds;
            return this;
        }

        /**
         * <p>The sequence number of the conversation turn in the current attempt.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder turnSeq(Long turnSeq) {
            this.turnSeq = turnSeq;
            return this;
        }

        /**
         * <p>The reason why the node is waiting. This parameter is empty if the node is not waiting.</p>
         * 
         * <strong>example:</strong>
         * <p>HUMAN_INPUT</p>
         */
        public Builder waitType(String waitType) {
            this.waitType = waitType;
            return this;
        }

        public GetNodeDetailResponseBody build() {
            return new GetNodeDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class AgentWorkProcessArtifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("artifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("artifactKey")
        private String artifactKey;

        @com.aliyun.core.annotation.NameInMap("ref")
        private java.util.Map<String, String> ref;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private AgentWorkProcessArtifacts(Builder builder) {
            this.artifactId = builder.artifactId;
            this.artifactKey = builder.artifactKey;
            this.ref = builder.ref;
            this.summary = builder.summary;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentWorkProcessArtifacts create() {
            return builder().build();
        }

        /**
         * @return artifactId
         */
        public String getArtifactId() {
            return this.artifactId;
        }

        /**
         * @return artifactKey
         */
        public String getArtifactKey() {
            return this.artifactKey;
        }

        /**
         * @return ref
         */
        public java.util.Map<String, String> getRef() {
            return this.ref;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String artifactId; 
            private String artifactKey; 
            private java.util.Map<String, String> ref; 
            private String summary; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(AgentWorkProcessArtifacts model) {
                this.artifactId = model.artifactId;
                this.artifactKey = model.artifactKey;
                this.ref = model.ref;
                this.summary = model.summary;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>The registered artifact ID. This parameter may be empty for artifacts derived only from the result summary.</p>
             * 
             * <strong>example:</strong>
             * <p>artifact_example</p>
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * <p>The unique key of the artifact in the node result.</p>
             * 
             * <strong>example:</strong>
             * <p>amount_report</p>
             */
            public Builder artifactKey(String artifactKey) {
                this.artifactKey = artifactKey;
                return this;
            }

            /**
             * <p>The stable reference of the artifact, including kind, id, and url. The URL of a registered artifact is a re-authentication entry point and can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;kind&quot;:&quot;INLINE&quot;,&quot;id&quot;:&quot;amount_report&quot;,&quot;url&quot;:&quot;inline://amount_report&quot;}</p>
             */
            public Builder ref(java.util.Map<String, String> ref) {
                this.ref = ref;
                return this;
            }

            /**
             * <p>The artifact summary, excluding inline content.</p>
             * 
             * <strong>example:</strong>
             * <p>Signed amount statistics completed</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The display title of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>Signed amount statistics report</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The artifact type.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AgentWorkProcessArtifacts build() {
                return new AgentWorkProcessArtifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class Replies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private Replies(Builder builder) {
            this.action = builder.action;
            this.detail = builder.detail;
            this.duration = builder.duration;
            this.nodeId = builder.nodeId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Replies create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String detail; 
            private Long duration; 
            private String nodeId; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Replies model) {
                this.action = model.action;
                this.detail = model.detail;
                this.duration = model.duration;
                this.nodeId = model.nodeId;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
             * 
             * <strong>example:</strong>
             * <p>REPLY</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>Data query for this turn completed</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The key of the parent node, not the conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Replies build() {
                return new Replies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class SkillCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private SkillCalls(Builder builder) {
            this.action = builder.action;
            this.detail = builder.detail;
            this.duration = builder.duration;
            this.nodeId = builder.nodeId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SkillCalls create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String detail; 
            private Long duration; 
            private String nodeId; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(SkillCalls model) {
                this.action = model.action;
                this.detail = model.detail;
                this.duration = model.duration;
                this.nodeId = model.nodeId;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
             * 
             * <strong>example:</strong>
             * <p>SKILL_CALL</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>Data query for this turn completed</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The key of the parent node, not the conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public SkillCalls build() {
                return new SkillCalls(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class Thoughts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private Thoughts(Builder builder) {
            this.action = builder.action;
            this.detail = builder.detail;
            this.duration = builder.duration;
            this.nodeId = builder.nodeId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Thoughts create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String detail; 
            private Long duration; 
            private String nodeId; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(Thoughts model) {
                this.action = model.action;
                this.detail = model.detail;
                this.duration = model.duration;
                this.nodeId = model.nodeId;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
             * 
             * <strong>example:</strong>
             * <p>THINK</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>Data query for this turn completed</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The key of the parent node, not the conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Thoughts build() {
                return new Thoughts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class ToolCalls extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private ToolCalls(Builder builder) {
            this.action = builder.action;
            this.detail = builder.detail;
            this.duration = builder.duration;
            this.nodeId = builder.nodeId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolCalls create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String detail; 
            private Long duration; 
            private String nodeId; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(ToolCalls model) {
                this.action = model.action;
                this.detail = model.detail;
                this.duration = model.duration;
                this.nodeId = model.nodeId;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
             * 
             * <strong>example:</strong>
             * <p>TOOL_CALL</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>Data query for this turn completed</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The key of the parent node, not the conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public ToolCalls build() {
                return new ToolCalls(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class AgentWorkProcess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("artifacts")
        private java.util.List<AgentWorkProcessArtifacts> artifacts;

        @com.aliyun.core.annotation.NameInMap("replies")
        private java.util.List<Replies> replies;

        @com.aliyun.core.annotation.NameInMap("skillCalls")
        private java.util.List<SkillCalls> skillCalls;

        @com.aliyun.core.annotation.NameInMap("thoughts")
        private java.util.List<Thoughts> thoughts;

        @com.aliyun.core.annotation.NameInMap("toolCalls")
        private java.util.List<ToolCalls> toolCalls;

        private AgentWorkProcess(Builder builder) {
            this.artifacts = builder.artifacts;
            this.replies = builder.replies;
            this.skillCalls = builder.skillCalls;
            this.thoughts = builder.thoughts;
            this.toolCalls = builder.toolCalls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentWorkProcess create() {
            return builder().build();
        }

        /**
         * @return artifacts
         */
        public java.util.List<AgentWorkProcessArtifacts> getArtifacts() {
            return this.artifacts;
        }

        /**
         * @return replies
         */
        public java.util.List<Replies> getReplies() {
            return this.replies;
        }

        /**
         * @return skillCalls
         */
        public java.util.List<SkillCalls> getSkillCalls() {
            return this.skillCalls;
        }

        /**
         * @return thoughts
         */
        public java.util.List<Thoughts> getThoughts() {
            return this.thoughts;
        }

        /**
         * @return toolCalls
         */
        public java.util.List<ToolCalls> getToolCalls() {
            return this.toolCalls;
        }

        public static final class Builder {
            private java.util.List<AgentWorkProcessArtifacts> artifacts; 
            private java.util.List<Replies> replies; 
            private java.util.List<SkillCalls> skillCalls; 
            private java.util.List<Thoughts> thoughts; 
            private java.util.List<ToolCalls> toolCalls; 

            private Builder() {
            } 

            private Builder(AgentWorkProcess model) {
                this.artifacts = model.artifacts;
                this.replies = model.replies;
                this.skillCalls = model.skillCalls;
                this.thoughts = model.thoughts;
                this.toolCalls = model.toolCalls;
            } 

            /**
             * <p>The artifacts: saved node work records and artifacts.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder artifacts(java.util.List<AgentWorkProcessArtifacts> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * <p>The replies: saved node work records and artifacts.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder replies(java.util.List<Replies> replies) {
                this.replies = replies;
                return this;
            }

            /**
             * <p>The skill calls: saved node work records and artifacts.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder skillCalls(java.util.List<SkillCalls> skillCalls) {
                this.skillCalls = skillCalls;
                return this;
            }

            /**
             * <p>The thoughts: saved node work records and artifacts.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder thoughts(java.util.List<Thoughts> thoughts) {
                this.thoughts = thoughts;
                return this;
            }

            /**
             * <p>The tool calls: saved node work records and artifacts.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder toolCalls(java.util.List<ToolCalls> toolCalls) {
                this.toolCalls = toolCalls;
                return this;
            }

            public AgentWorkProcess build() {
                return new AgentWorkProcess(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class Artifacts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("artifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("artifactKey")
        private String artifactKey;

        @com.aliyun.core.annotation.NameInMap("ref")
        private java.util.Map<String, String> ref;

        @com.aliyun.core.annotation.NameInMap("summary")
        private String summary;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Artifacts(Builder builder) {
            this.artifactId = builder.artifactId;
            this.artifactKey = builder.artifactKey;
            this.ref = builder.ref;
            this.summary = builder.summary;
            this.title = builder.title;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Artifacts create() {
            return builder().build();
        }

        /**
         * @return artifactId
         */
        public String getArtifactId() {
            return this.artifactId;
        }

        /**
         * @return artifactKey
         */
        public String getArtifactKey() {
            return this.artifactKey;
        }

        /**
         * @return ref
         */
        public java.util.Map<String, String> getRef() {
            return this.ref;
        }

        /**
         * @return summary
         */
        public String getSummary() {
            return this.summary;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String artifactId; 
            private String artifactKey; 
            private java.util.Map<String, String> ref; 
            private String summary; 
            private String title; 
            private String type; 

            private Builder() {
            } 

            private Builder(Artifacts model) {
                this.artifactId = model.artifactId;
                this.artifactKey = model.artifactKey;
                this.ref = model.ref;
                this.summary = model.summary;
                this.title = model.title;
                this.type = model.type;
            } 

            /**
             * <p>The registered artifact ID. This parameter may be empty for artifacts derived only from the result summary.</p>
             * 
             * <strong>example:</strong>
             * <p>artifact_example</p>
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * <p>The unique key of the artifact in the node result.</p>
             * 
             * <strong>example:</strong>
             * <p>amount_report</p>
             */
            public Builder artifactKey(String artifactKey) {
                this.artifactKey = artifactKey;
                return this;
            }

            /**
             * <p>The stable reference of the artifact, including kind, id, and url. The URL of a registered artifact is a re-authentication entry point and can be empty.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;kind&quot;:&quot;INLINE&quot;,&quot;id&quot;:&quot;amount_report&quot;,&quot;url&quot;:&quot;inline://amount_report&quot;}</p>
             */
            public Builder ref(java.util.Map<String, String> ref) {
                this.ref = ref;
                return this;
            }

            /**
             * <p>The artifact summary, excluding inline content.</p>
             * 
             * <strong>example:</strong>
             * <p>Signed amount statistics completed</p>
             */
            public Builder summary(String summary) {
                this.summary = summary;
                return this;
            }

            /**
             * <p>The display title of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>Signed amount statistics report</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The artifact type.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Artifacts build() {
                return new Artifacts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetNodeDetailResponseBody</p>
     */
    public static class RunLog extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private RunLog(Builder builder) {
            this.action = builder.action;
            this.detail = builder.detail;
            this.duration = builder.duration;
            this.nodeId = builder.nodeId;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RunLog create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String action; 
            private String detail; 
            private Long duration; 
            private String nodeId; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(RunLog model) {
                this.action = model.action;
                this.detail = model.detail;
                this.duration = model.duration;
                this.nodeId = model.nodeId;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, or ARTIFACT.</p>
             * 
             * <strong>example:</strong>
             * <p>REPLY</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The saved original record content. Tool invocation and artifact metadata are JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>Data query for this turn completed</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The time taken for this work record, in milliseconds. The value is 0 for artifact records.</p>
             * 
             * <strong>example:</strong>
             * <p>1200</p>
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The key of the parent node, not the conversation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>query.amount</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The time when the event is recorded, in ISO-8601 format. This is an empty string if the source record has no time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-14T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public RunLog build() {
                return new RunLog(this);
            } 

        } 

    }
}
