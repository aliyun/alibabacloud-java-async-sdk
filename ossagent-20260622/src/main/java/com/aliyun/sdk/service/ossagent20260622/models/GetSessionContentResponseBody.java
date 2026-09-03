// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ossagent20260622.models;

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
 * {@link GetSessionContentResponseBody} extends {@link TeaModel}
 *
 * <p>GetSessionContentResponseBody</p>
 */
public class GetSessionContentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private GetSessionContentResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSessionContentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder {
        private java.util.List<Content> content; 
        private String requestId; 
        private String sessionId; 

        private Builder() {
        } 

        private Builder(GetSessionContentResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
            this.sessionId = model.sessionId;
        } 

        /**
         * content.
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>UUID</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        public GetSessionContentResponseBody build() {
            return new GetSessionContentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSessionContentResponseBody} extends {@link TeaModel}
     *
     * <p>GetSessionContentResponseBody</p>
     */
    public static class AgentContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentContent")
        private String agentContent;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        private AgentContents(Builder builder) {
            this.agentContent = builder.agentContent;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentContents create() {
            return builder().build();
        }

        /**
         * @return agentContent
         */
        public String getAgentContent() {
            return this.agentContent;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String agentContent; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(AgentContents model) {
                this.agentContent = model.agentContent;
                this.timestamp = model.timestamp;
            } 

            /**
             * agentContent.
             */
            public Builder agentContent(String agentContent) {
                this.agentContent = agentContent;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public AgentContents build() {
                return new AgentContents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSessionContentResponseBody} extends {@link TeaModel}
     *
     * <p>GetSessionContentResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("agentContents")
        private java.util.List<AgentContents> agentContents;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("toolConfirm")
        private Boolean toolConfirm;

        @com.aliyun.core.annotation.NameInMap("userContent")
        private String userContent;

        private Content(Builder builder) {
            this.agentContents = builder.agentContents;
            this.timestamp = builder.timestamp;
            this.toolConfirm = builder.toolConfirm;
            this.userContent = builder.userContent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return agentContents
         */
        public java.util.List<AgentContents> getAgentContents() {
            return this.agentContents;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return toolConfirm
         */
        public Boolean getToolConfirm() {
            return this.toolConfirm;
        }

        /**
         * @return userContent
         */
        public String getUserContent() {
            return this.userContent;
        }

        public static final class Builder {
            private java.util.List<AgentContents> agentContents; 
            private String timestamp; 
            private Boolean toolConfirm; 
            private String userContent; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.agentContents = model.agentContents;
                this.timestamp = model.timestamp;
                this.toolConfirm = model.toolConfirm;
                this.userContent = model.userContent;
            } 

            /**
             * agentContents.
             */
            public Builder agentContents(java.util.List<AgentContents> agentContents) {
                this.agentContents = agentContents;
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
             * toolConfirm.
             */
            public Builder toolConfirm(Boolean toolConfirm) {
                this.toolConfirm = toolConfirm;
                return this;
            }

            /**
             * userContent.
             */
            public Builder userContent(String userContent) {
                this.userContent = userContent;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
