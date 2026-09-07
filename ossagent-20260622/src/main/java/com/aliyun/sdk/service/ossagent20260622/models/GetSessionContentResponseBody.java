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
         * <p>The conversation text content.</p>
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
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>UUID</p>
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
             * <p>The detailed conversation chunk content. All chunks compose the complete response.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;id\&quot;:\&quot;16aa7737-9e6a-4500-abd2-96c5f17d1188\&quot;,\&quot;object\&quot;:\&quot;chat.completion.chunk\&quot;,\&quot;created\&quot;:1788408524,\&quot;model\&quot;:\&quot;oss-agent\&quot;,\&quot;choices\&quot;:[{\&quot;index\&quot;:0,\&quot;delta\&quot;:{\&quot;role\&quot;:\&quot;assistant\&quot;,\&quot;content\&quot;:\&quot;，Hello， I am OSS Agent\&quot;}}]}</p>
             */
            public Builder agentContent(String agentContent) {
                this.agentContent = agentContent;
                return this;
            }

            /**
             * <p>The time when the content was generated, in the yyyy-MM-dd HH:mm:ss,SSS format.</p>
             * 
             * <strong>example:</strong>
             * <p>1774577589</p>
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
             * <p>The detailed conversation content.</p>
             */
            public Builder agentContents(java.util.List<AgentContents> agentContents) {
                this.agentContents = agentContents;
                return this;
            }

            /**
             * <p>The time when the session occurred, in the yyyy-MM-dd HH:mm:ss,SSS format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-09-03 04:08:30,637</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>Indicates whether tool confirmation is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder toolConfirm(Boolean toolConfirm) {
                this.toolConfirm = toolConfirm;
                return this;
            }

            /**
             * <p>The user content of the first message in the session.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;role\&quot;:\&quot;user\&quot;,\&quot;content\&quot;:\&quot;Hi OSS\&quot;}]</p>
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
