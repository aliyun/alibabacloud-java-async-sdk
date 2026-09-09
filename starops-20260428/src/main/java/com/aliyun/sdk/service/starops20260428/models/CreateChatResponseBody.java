// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link CreateChatResponseBody} extends {@link TeaModel}
 *
 * <p>CreateChatResponseBody</p>
 */
public class CreateChatResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("messages")
    private java.util.List<Messages> messages;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private CreateChatResponseBody(Builder builder) {
        this.messages = builder.messages;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return messages
     */
    public java.util.List<Messages> getMessages() {
        return this.messages;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private java.util.List<Messages> messages; 
        private String requestId; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(CreateChatResponseBody model) {
            this.messages = model.messages;
            this.requestId = model.requestId;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The list of messages in the session.</p>
         */
        public Builder messages(java.util.List<Messages> messages) {
            this.messages = messages;
            return this;
        }

        /**
         * <p>The ID data of the current message request. The first request ID in the root data.</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-XXXX-XXXX-XXXX-9A629907C1F0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID data of the current message request. The first trace ID in the root data.</p>
         * 
         * <strong>example:</strong>
         * <p>21504600000008405622576e3b48</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CreateChatResponseBody build() {
            return new CreateChatResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateChatResponseBody} extends {@link TeaModel}
     *
     * <p>CreateChatResponseBody</p>
     */
    public static class Messages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agents")
        private java.util.List<java.util.Map<String, ?>> agents;

        @com.aliyun.core.annotation.NameInMap("artifacts")
        private java.util.List<java.util.Map<String, ?>> artifacts;

        @com.aliyun.core.annotation.NameInMap("callId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("contents")
        private java.util.List<java.util.Map<String, ?>> contents;

        @com.aliyun.core.annotation.NameInMap("detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("events")
        private java.util.List<java.util.Map<String, ?>> events;

        @com.aliyun.core.annotation.NameInMap("parentCallId")
        private String parentCallId;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("seq")
        private Integer seq;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("tools")
        private java.util.List<java.util.Map<String, ?>> tools;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private String version;

        private Messages(Builder builder) {
            this.agents = builder.agents;
            this.artifacts = builder.artifacts;
            this.callId = builder.callId;
            this.contents = builder.contents;
            this.detail = builder.detail;
            this.events = builder.events;
            this.parentCallId = builder.parentCallId;
            this.role = builder.role;
            this.seq = builder.seq;
            this.timestamp = builder.timestamp;
            this.tools = builder.tools;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Messages create() {
            return builder().build();
        }

        /**
         * @return agents
         */
        public java.util.List<java.util.Map<String, ?>> getAgents() {
            return this.agents;
        }

        /**
         * @return artifacts
         */
        public java.util.List<java.util.Map<String, ?>> getArtifacts() {
            return this.artifacts;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
        }

        /**
         * @return contents
         */
        public java.util.List<java.util.Map<String, ?>> getContents() {
            return this.contents;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return events
         */
        public java.util.List<java.util.Map<String, ?>> getEvents() {
            return this.events;
        }

        /**
         * @return parentCallId
         */
        public String getParentCallId() {
            return this.parentCallId;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return seq
         */
        public Integer getSeq() {
            return this.seq;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return tools
         */
        public java.util.List<java.util.Map<String, ?>> getTools() {
            return this.tools;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> agents; 
            private java.util.List<java.util.Map<String, ?>> artifacts; 
            private String callId; 
            private java.util.List<java.util.Map<String, ?>> contents; 
            private String detail; 
            private java.util.List<java.util.Map<String, ?>> events; 
            private String parentCallId; 
            private String role; 
            private Integer seq; 
            private String timestamp; 
            private java.util.List<java.util.Map<String, ?>> tools; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(Messages model) {
                this.agents = model.agents;
                this.artifacts = model.artifacts;
                this.callId = model.callId;
                this.contents = model.contents;
                this.detail = model.detail;
                this.events = model.events;
                this.parentCallId = model.parentCallId;
                this.role = model.role;
                this.seq = model.seq;
                this.timestamp = model.timestamp;
                this.tools = model.tools;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>The list of invoked agents.</p>
             */
            public Builder agents(java.util.List<java.util.Map<String, ?>> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * <p>The artifact output information.</p>
             */
            public Builder artifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * <p>The current execution ID.</p>
             * 
             * <strong>example:</strong>
             * <p>call_search_001</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * <p>The content information.</p>
             */
            public Builder contents(java.util.List<java.util.Map<String, ?>> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * <p>The message details.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>The list of events.</p>
             */
            public Builder events(java.util.List<java.util.Map<String, ?>> events) {
                this.events = events;
                return this;
            }

            /**
             * <p>The execution ID of the parent level.</p>
             * 
             * <strong>example:</strong>
             * <p>sess_abc123</p>
             */
            public Builder parentCallId(String parentCallId) {
                this.parentCallId = parentCallId;
                return this;
            }

            /**
             * <p>The role that initiated the message.</p>
             * 
             * <strong>example:</strong>
             * <p>tool</p>
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * <p>The sequence number of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder seq(Integer seq) {
                this.seq = seq;
                return this;
            }

            /**
             * <p>The timestamp in nanoseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1765000005</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The list of tools used.</p>
             */
            public Builder tools(java.util.List<java.util.Map<String, ?>> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * <p>The specific type of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>done</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version number of the message.</p>
             * 
             * <strong>example:</strong>
             * <p>v0.1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Messages build() {
                return new Messages(this);
            } 

        } 

    }
}
