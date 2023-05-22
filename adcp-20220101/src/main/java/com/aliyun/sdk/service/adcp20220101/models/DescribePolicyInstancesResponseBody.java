// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyInstancesResponseBody</p>
 */
public class DescribePolicyInstancesResponseBody extends TeaModel {
    @NameInMap("Policies")
    private java.util.List < Policies> policies;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePolicyInstancesResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return policies
     */
    public java.util.List < Policies> getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Policies> policies; 
        private String requestId; 

        /**
         * A list of policy instances.
         */
        public Builder policies(java.util.List < Policies> policies) {
            this.policies = policies;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolicyInstancesResponseBody build() {
            return new DescribePolicyInstancesResponseBody(this);
        } 

    } 

    public static class Policies extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("PolicyAction")
        private String policyAction;

        @NameInMap("PolicyCategory")
        private String policyCategory;

        @NameInMap("PolicyDescription")
        private String policyDescription;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyParameters")
        private java.util.Map < String, String > policyParameters;

        @NameInMap("PolicyScope")
        private String policyScope;

        @NameInMap("PolicySeverity")
        private String policySeverity;

        @NameInMap("TotalViolations")
        private Long totalViolations;

        private Policies(Builder builder) {
            this.clusterId = builder.clusterId;
            this.instanceName = builder.instanceName;
            this.policyAction = builder.policyAction;
            this.policyCategory = builder.policyCategory;
            this.policyDescription = builder.policyDescription;
            this.policyName = builder.policyName;
            this.policyParameters = builder.policyParameters;
            this.policyScope = builder.policyScope;
            this.policySeverity = builder.policySeverity;
            this.totalViolations = builder.totalViolations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return policyAction
         */
        public String getPolicyAction() {
            return this.policyAction;
        }

        /**
         * @return policyCategory
         */
        public String getPolicyCategory() {
            return this.policyCategory;
        }

        /**
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyParameters
         */
        public java.util.Map < String, String > getPolicyParameters() {
            return this.policyParameters;
        }

        /**
         * @return policyScope
         */
        public String getPolicyScope() {
            return this.policyScope;
        }

        /**
         * @return policySeverity
         */
        public String getPolicySeverity() {
            return this.policySeverity;
        }

        /**
         * @return totalViolations
         */
        public Long getTotalViolations() {
            return this.totalViolations;
        }

        public static final class Builder {
            private String clusterId; 
            private String instanceName; 
            private String policyAction; 
            private String policyCategory; 
            private String policyDescription; 
            private String policyName; 
            private java.util.Map < String, String > policyParameters; 
            private String policyScope; 
            private String policySeverity; 
            private Long totalViolations; 

            /**
             * The ID of the associated cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the policy instance.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The action of the policy. Valid values:
             * <p>
             * 
             * *   deny: blocks deployments that match the policy.
             * *   warn: generates alerts for deployments that match the policy.
             */
            public Builder policyAction(String policyAction) {
                this.policyAction = policyAction;
                return this;
            }

            /**
             * The type of the policy.
             */
            public Builder policyCategory(String policyCategory) {
                this.policyCategory = policyCategory;
                return this;
            }

            /**
             * The description of the policy.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * The name of the policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The parameters of the policy instance.
             */
            public Builder policyParameters(java.util.Map < String, String > policyParameters) {
                this.policyParameters = policyParameters;
                return this;
            }

            /**
             * The applicable scope of the policy instance.
             * <p>
             * 
             * A value of \* indicates all namespaces. This is the default value.
             * 
             * Multiple namespaces are separated by commas (,).
             */
            public Builder policyScope(String policyScope) {
                this.policyScope = policyScope;
                return this;
            }

            /**
             * The severity level of the policy.
             */
            public Builder policySeverity(String policySeverity) {
                this.policySeverity = policySeverity;
                return this;
            }

            /**
             * The total number of deployments that match the policy in the associated cluster, including the deployments that are blocked and the deployments that have triggered alerting.
             */
            public Builder totalViolations(Long totalViolations) {
                this.totalViolations = totalViolations;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
