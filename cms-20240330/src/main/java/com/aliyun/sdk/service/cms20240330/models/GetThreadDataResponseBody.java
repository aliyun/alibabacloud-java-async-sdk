// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link GetThreadDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetThreadDataResponseBody</p>
 */
public class GetThreadDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("digitalEmployeeName")
    private String digitalEmployeeName;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("threadId")
    private String threadId;

    private GetThreadDataResponseBody(Builder builder) {
        this.data = builder.data;
        this.digitalEmployeeName = builder.digitalEmployeeName;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.threadId = builder.threadId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThreadDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return digitalEmployeeName
     */
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return threadId
     */
    public String getThreadId() {
        return this.threadId;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String digitalEmployeeName; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private String threadId; 

        private Builder() {
        } 

        private Builder(GetThreadDataResponseBody model) {
            this.data = model.data;
            this.digitalEmployeeName = model.digitalEmployeeName;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.threadId = model.threadId;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * digitalEmployeeName.
         */
        public Builder digitalEmployeeName(String digitalEmployeeName) {
            this.digitalEmployeeName = digitalEmployeeName;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>8FDE2569-626B-5176-9844-28877A*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * threadId.
         */
        public Builder threadId(String threadId) {
            this.threadId = threadId;
            return this;
        }

        public GetThreadDataResponseBody build() {
            return new GetThreadDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetThreadDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetThreadDataResponseBody</p>
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
             * agents.
             */
            public Builder agents(java.util.List<java.util.Map<String, ?>> agents) {
                this.agents = agents;
                return this;
            }

            /**
             * artifacts.
             */
            public Builder artifacts(java.util.List<java.util.Map<String, ?>> artifacts) {
                this.artifacts = artifacts;
                return this;
            }

            /**
             * callId.
             */
            public Builder callId(String callId) {
                this.callId = callId;
                return this;
            }

            /**
             * contents.
             */
            public Builder contents(java.util.List<java.util.Map<String, ?>> contents) {
                this.contents = contents;
                return this;
            }

            /**
             * detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * events.
             */
            public Builder events(java.util.List<java.util.Map<String, ?>> events) {
                this.events = events;
                return this;
            }

            /**
             * parentCallId.
             */
            public Builder parentCallId(String parentCallId) {
                this.parentCallId = parentCallId;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * seq.
             */
            public Builder seq(Integer seq) {
                this.seq = seq;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * tools.
             */
            public Builder tools(java.util.List<java.util.Map<String, ?>> tools) {
                this.tools = tools;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * version.
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
    /**
     * 
     * {@link GetThreadDataResponseBody} extends {@link TeaModel}
     *
     * <p>GetThreadDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("messages")
        private java.util.List<Messages> messages;

        @com.aliyun.core.annotation.NameInMap("requestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        private Data(Builder builder) {
            this.messages = builder.messages;
            this.requestId = builder.requestId;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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

            private Builder(Data model) {
                this.messages = model.messages;
                this.requestId = model.requestId;
                this.traceId = model.traceId;
            } 

            /**
             * messages.
             */
            public Builder messages(java.util.List<Messages> messages) {
                this.messages = messages;
                return this;
            }

            /**
             * <p>Id of the request</p>
             * 
             * <strong>example:</strong>
             * <p>8FDE2569-626B-5176-9844-28877A*****</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * traceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
