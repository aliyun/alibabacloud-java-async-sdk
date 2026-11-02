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
         * <p>The agent instance information.</p>
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
        @com.aliyun.core.annotation.NameInMap("AgentConfig")
        private AIAgentConfig agentConfig;

        @com.aliyun.core.annotation.NameInMap("CallInfo")
        private AIAgentCallInfo callInfo;

        @com.aliyun.core.annotation.NameInMap("CallLogUrl")
        private String callLogUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("RuntimeConfig")
        private AIAgentRuntimeConfig runtimeConfig;

        @com.aliyun.core.annotation.NameInMap("SessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        @Deprecated
        private AIAgentTemplateConfig templateConfig;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Instance(Builder builder) {
            this.agentConfig = builder.agentConfig;
            this.callInfo = builder.callInfo;
            this.callLogUrl = builder.callLogUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
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
         * @return agentConfig
         */
        public AIAgentConfig getAgentConfig() {
            return this.agentConfig;
        }

        /**
         * @return callInfo
         */
        public AIAgentCallInfo getCallInfo() {
            return this.callInfo;
        }

        /**
         * @return callLogUrl
         */
        public String getCallLogUrl() {
            return this.callLogUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
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
            private AIAgentConfig agentConfig; 
            private AIAgentCallInfo callInfo; 
            private String callLogUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private AIAgentRuntimeConfig runtimeConfig; 
            private String sessionId; 
            private String status; 
            private AIAgentTemplateConfig templateConfig; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Instance model) {
                this.agentConfig = model.agentConfig;
                this.callInfo = model.callInfo;
                this.callLogUrl = model.callLogUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.runtimeConfig = model.runtimeConfig;
                this.sessionId = model.sessionId;
                this.status = model.status;
                this.templateConfig = model.templateConfig;
                this.userData = model.userData;
            } 

            /**
             * <p>The agent template configuration.</p>
             */
            public Builder agentConfig(AIAgentConfig agentConfig) {
                this.agentConfig = agentConfig;
                return this;
            }

            /**
             * <p>The PSTN call details. This field may be empty if the call has not ended.</p>
             */
            public Builder callInfo(AIAgentCallInfo callInfo) {
                this.callInfo = callInfo;
                return this;
            }

            /**
             * <p>The URL of the call log.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/call_logs/12345">https://example.com/call_logs/12345</a></p>
             */
            public Builder callLogUrl(String callLogUrl) {
                this.callLogUrl = callLogUrl;
                return this;
            }

            /**
             * <p>The creation time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-18T06:39:08.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The update time (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-18T06:40:12.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The runtime configuration of the agent.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VoiceChat&quot;:{&quot;AgentUserId&quot;:&quot;voice_agent_001&quot;,&quot;ChannelId&quot;:&quot;voice_channel_001&quot;,&quot;AuthToken&quot;:&quot;your_voice_chat_auth_token&quot;}}</p>
             */
            public Builder runtimeConfig(AIAgentRuntimeConfig runtimeConfig) {
                this.runtimeConfig = runtimeConfig;
                return this;
            }

            /**
             * <p>The unique identifier of the conversation. Default value: none.</p>
             * 
             * <strong>example:</strong>
             * <p>955535**************</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>The status of the agent instance, such as Finished or Executing.</p>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The agent template configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VoiceChat&quot;: {&quot;AppId&quot;: &quot;your_voice_chat_app_id&quot;}}</p>
             */
            public Builder templateConfig(AIAgentTemplateConfig templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * <p>The user-defined data.</p>
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
