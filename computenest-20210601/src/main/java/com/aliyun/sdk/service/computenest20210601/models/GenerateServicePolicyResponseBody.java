// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateServicePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateServicePolicyResponseBody</p>
 */
public class GenerateServicePolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MissingPolicy")
    private java.util.List < MissingPolicy> missingPolicy;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateServicePolicyResponseBody(Builder builder) {
        this.missingPolicy = builder.missingPolicy;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateServicePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return missingPolicy
     */
    public java.util.List < MissingPolicy> getMissingPolicy() {
        return this.missingPolicy;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < MissingPolicy> missingPolicy; 
        private String policy; 
        private String requestId; 

        /**
         * The policies that are missing.
         */
        public Builder missingPolicy(java.util.List < MissingPolicy> missingPolicy) {
            this.missingPolicy = missingPolicy;
            return this;
        }

        /**
         * The RAM policy.
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateServicePolicyResponseBody build() {
            return new GenerateServicePolicyResponseBody(this);
        } 

    } 

    public static class MissingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private java.util.List < String > action;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private String resource;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        private MissingPolicy(Builder builder) {
            this.action = builder.action;
            this.resource = builder.resource;
            this.serviceName = builder.serviceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MissingPolicy create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public java.util.List < String > getAction() {
            return this.action;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        public static final class Builder {
            private java.util.List < String > action; 
            private String resource; 
            private String serviceName; 

            /**
             * Operations on specific resources.
             */
            public Builder action(java.util.List < String > action) {
                this.action = action;
                return this;
            }

            /**
             * The specific objects authorized. An asterisk (*) denotes all resources.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            public MissingPolicy build() {
                return new MissingPolicy(this);
            } 

        } 

    }
}
