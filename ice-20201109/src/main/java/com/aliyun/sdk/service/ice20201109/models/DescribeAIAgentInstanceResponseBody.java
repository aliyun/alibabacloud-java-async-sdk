// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * Instance.
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAIAgentInstanceResponseBody build() {
            return new DescribeAIAgentInstanceResponseBody(this);
        } 

    } 

    public static class Instance extends TeaModel {
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

        private Instance(Builder builder) {
            this.callLogUrl = builder.callLogUrl;
            this.runtimeConfig = builder.runtimeConfig;
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

            /**
             * CallLogUrl.
             */
            public Builder callLogUrl(String callLogUrl) {
                this.callLogUrl = callLogUrl;
                return this;
            }

            /**
             * RuntimeConfig.
             */
            public Builder runtimeConfig(AIAgentRuntimeConfig runtimeConfig) {
                this.runtimeConfig = runtimeConfig;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateConfig.
             */
            public Builder templateConfig(AIAgentTemplateConfig templateConfig) {
                this.templateConfig = templateConfig;
                return this;
            }

            /**
             * UserData.
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
