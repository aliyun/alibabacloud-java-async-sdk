// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link DescribeAIAgentInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIAgentInstanceResponseBody</p>
 */
public class DescribeAIAgentInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAIAgentInstanceResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIAgentInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Instance instance; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAIAgentInstanceResponseBody model) {
            this.instance = model.instance;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the AI agent.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7B117AF5-2A16-412C-B127-FA6175ED1AD0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIAgentInstanceResponseBody build() {
            return new DescribeAIAgentInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIAgentInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIAgentInstanceResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallLogUrl")
        private String callLogUrl;

        @com.aliyun.core.annotation.NameInMap("RuntimeConfig")
        private AIAgentRuntimeConfig runtimeConfig;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private AIAgentTemplateConfig templateConfig;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Instance(Builder builder) {
            this.callLogUrl = builder.callLogUrl;
            this.runtimeConfig = builder.runtimeConfig;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
            this.templateConfig = builder.templateConfig;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return callLogUrl
         */
        public String getCallLogUrl() {
            return this.callLogUrl;
        }

        /**
         * @return runtimeConfig
         */
        public AIAgentRuntimeConfig getRuntimeConfig() {
            return this.runtimeConfig;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateConfig
         */
        public AIAgentTemplateConfig getTemplateConfig() {
            return this.templateConfig;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String callLogUrl; 
            private AIAgentRuntimeConfig runtimeConfig; 
            private String sessionId; 
            private String status; 
            private AIAgentTemplateConfig templateConfig; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.callLogUrl = model.callLogUrl;
                this.runtimeConfig = model.runtimeConfig;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.templateConfig = model.templateConfig;
                this.userData = model.userData;
            } 

            /**
             * <p>The URL of the call log file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/call_logs/12345">https://example.com/call_logs/12345</a></p>
             */
            public Builder callLogUrl(String callLogUrl) {
                this.callLogUrl = callLogUrl;
                return this;
            }

            /**
             * <p>The runtime configurations of the AI agent.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VoiceChat&quot;:{&quot;AgentUserId&quot;:&quot;voice_agent_001&quot;,&quot;ChannelId&quot;:&quot;voice_channel_001&quot;,&quot;AuthToken&quot;:&quot;your_voice_chat_auth_token&quot;}}</p>
             */
            public Builder runtimeConfig(AIAgentRuntimeConfig runtimeConfig) {
                this.runtimeConfig = runtimeConfig;
                return this;
            }

            /**
             * SessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The state of the AI agent. Valid values: Finished and Executing.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The template configurations of the AI agent.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VoiceChat&quot;: {&quot;AppId&quot;: &quot;your_voice_chat_app_id&quot;}}</p>
             */
            public Builder templateConfig(AIAgentTemplateConfig templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The custom information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Email&quot;:&quot;<a href="mailto:johndoe@example.com">johndoe@example.com</a>&quot;,&quot;Preferences&quot;:{&quot;Language&quot;:&quot;en&quot;}}</p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
