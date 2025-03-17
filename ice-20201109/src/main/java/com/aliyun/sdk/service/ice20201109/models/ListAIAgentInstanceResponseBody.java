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
 * {@link ListAIAgentInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIAgentInstanceResponseBody</p>
 */
public class ListAIAgentInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List<Instances> instances;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAIAgentInstanceResponseBody(Builder builder) {
        this.instances = builder.instances;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIAgentInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instances
     */
    public java.util.List<Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Instances> instances; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAIAgentInstanceResponseBody model) {
            this.instances = model.instances;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of the AI agents.</p>
         */
        public Builder instances(java.util.List<Instances> instances) {
            this.instances = instances;
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

        public ListAIAgentInstanceResponseBody build() {
            return new ListAIAgentInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIAgentInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIAgentInstanceResponseBody</p>
     */
    public static class Instances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallLogUrl")
        private String callLogUrl;

        @com.aliyun.core.annotation.NameInMap("RuntimeConfig")
        private AIAgentRuntimeConfig runtimeConfig;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateConfig")
        private AIAgentTemplateConfig templateConfig;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Instances(Builder builder) {
            this.callLogUrl = builder.callLogUrl;
            this.runtimeConfig = builder.runtimeConfig;
            this.status = builder.status;
            this.templateConfig = builder.templateConfig;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instances create() {
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
            private String status; 
            private AIAgentTemplateConfig templateConfig; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Instances model) {
                this.callLogUrl = model.callLogUrl;
                this.runtimeConfig = model.runtimeConfig;
                this.status = model.status;
                this.templateConfig = model.templateConfig;
                this.userData = model.userData;
            } 

            /**
             * <p>The URL of the call log file for the AI agent. The structure of the file is CallLog in the JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/call_logs/12345.json">https://example.com/call_logs/12345.json</a></p>
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
             * <p>The state of the instance. Valid values:</p>
             * <ul>
             * <li>Executing</li>
             * <li>Finished</li>
             * </ul>
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
             * <p>{&quot;VoiceChat&quot;: {&quot;VoiceId&quot;: &quot;zhixiaoxia&quot;}}</p>
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

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
