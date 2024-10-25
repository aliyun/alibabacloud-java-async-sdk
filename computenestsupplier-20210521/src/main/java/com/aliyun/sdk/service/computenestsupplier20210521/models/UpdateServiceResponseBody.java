// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateServiceResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateServiceResponseBody</p>
 */
public class UpdateServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRunResult")
    private DryRunResult dryRunResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateServiceResponseBody(Builder builder) {
        this.dryRunResult = builder.dryRunResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceResponseBody create() {
        return builder().build();
    }

    /**
     * @return dryRunResult
     */
    public DryRunResult getDryRunResult() {
        return this.dryRunResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DryRunResult dryRunResult; 
        private String requestId; 

        /**
         * DryRunResult.
         */
        public Builder dryRunResult(DryRunResult dryRunResult) {
            this.dryRunResult = dryRunResult;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DF0F666F-FBBC-55C3-A368-C955DE7B4839</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateServiceResponseBody build() {
            return new UpdateServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceResponseBody</p>
     */
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
             * Action.
             */
            public Builder action(java.util.List < String > action) {
                this.action = action;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * ServiceName.
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
    /**
     * 
     * {@link UpdateServiceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceResponseBody</p>
     */
    public static class RolePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MissingPolicy")
        private java.util.List < MissingPolicy> missingPolicy;

        @com.aliyun.core.annotation.NameInMap("Policy")
        private String policy;

        private RolePolicy(Builder builder) {
            this.missingPolicy = builder.missingPolicy;
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RolePolicy create() {
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

        public static final class Builder {
            private java.util.List < MissingPolicy> missingPolicy; 
            private String policy; 

            /**
             * MissingPolicy.
             */
            public Builder missingPolicy(java.util.List < MissingPolicy> missingPolicy) {
                this.missingPolicy = missingPolicy;
                return this;
            }

            /**
             * Policy.
             */
            public Builder policy(String policy) {
                this.policy = policy;
                return this;
            }

            public RolePolicy build() {
                return new RolePolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateServiceResponseBody</p>
     */
    public static class DryRunResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RolePolicy")
        private RolePolicy rolePolicy;

        private DryRunResult(Builder builder) {
            this.rolePolicy = builder.rolePolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DryRunResult create() {
            return builder().build();
        }

        /**
         * @return rolePolicy
         */
        public RolePolicy getRolePolicy() {
            return this.rolePolicy;
        }

        public static final class Builder {
            private RolePolicy rolePolicy; 

            /**
             * RolePolicy.
             */
            public Builder rolePolicy(RolePolicy rolePolicy) {
                this.rolePolicy = rolePolicy;
                return this;
            }

            public DryRunResult build() {
                return new DryRunResult(this);
            } 

        } 

    }
}
