// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAIAgentInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIAgentInstanceResponseBody</p>
 */
public class ListAIAgentInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instances")
    private java.util.List < Instances> instances;

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

    /**
     * @return instances
     */
    public java.util.List < Instances> getInstances() {
        return this.instances;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Instances> instances; 
        private String requestId; 

        /**
         * Instances.
         */
        public Builder instances(java.util.List < Instances> instances) {
            this.instances = instances;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIAgentInstanceResponseBody build() {
            return new ListAIAgentInstanceResponseBody(this);
        } 

    } 

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

            public Instances build() {
                return new Instances(this);
            } 

        } 

    }
}
