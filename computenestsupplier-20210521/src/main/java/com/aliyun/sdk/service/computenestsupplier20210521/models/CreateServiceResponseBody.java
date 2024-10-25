// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceResponseBody</p>
 */
public class CreateServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRunResult")
    private DryRunResult dryRunResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private CreateServiceResponseBody(Builder builder) {
        this.dryRunResult = builder.dryRunResult;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.status = builder.status;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceResponseBody create() {
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

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder {
        private DryRunResult dryRunResult; 
        private String requestId; 
        private String serviceId; 
        private String status; 
        private String version; 

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
         * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-0e6fca6a51a544xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The status of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>Created</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>draft</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        public CreateServiceResponseBody build() {
            return new CreateServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateServiceResponseBody</p>
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
     * {@link CreateServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateServiceResponseBody</p>
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
     * {@link CreateServiceResponseBody} extends {@link TeaModel}
     *
     * <p>CreateServiceResponseBody</p>
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
