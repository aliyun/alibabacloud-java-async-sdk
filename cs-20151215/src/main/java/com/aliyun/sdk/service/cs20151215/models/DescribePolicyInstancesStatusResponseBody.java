// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyInstancesStatusResponseBody</p>
 */
public class DescribePolicyInstancesStatusResponseBody extends TeaModel {
    @NameInMap("policy_instances")
    private java.util.List < PolicyInstances> policyInstances;

    @NameInMap("instances_severity_count")
    private java.util.Map < String, ? > instancesSeverityCount;

    private DescribePolicyInstancesStatusResponseBody(Builder builder) {
        this.policyInstances = builder.policyInstances;
        this.instancesSeverityCount = builder.instancesSeverityCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyInstancesStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyInstances
     */
    public java.util.List < PolicyInstances> getPolicyInstances() {
        return this.policyInstances;
    }

    /**
     * @return instancesSeverityCount
     */
    public java.util.Map < String, ? > getInstancesSeverityCount() {
        return this.instancesSeverityCount;
    }

    public static final class Builder {
        private java.util.List < PolicyInstances> policyInstances; 
        private java.util.Map < String, ? > instancesSeverityCount; 

        /**
         * List of policy instances under different policy types
         */
        public Builder policyInstances(java.util.List < PolicyInstances> policyInstances) {
            this.policyInstances = policyInstances;
            return this;
        }

        /**
         * Number of policy instances with different governance levels currently deployed in the cluster
         */
        public Builder instancesSeverityCount(java.util.Map < String, ? > instancesSeverityCount) {
            this.instancesSeverityCount = instancesSeverityCount;
            return this;
        }

        public DescribePolicyInstancesStatusResponseBody build() {
            return new DescribePolicyInstancesStatusResponseBody(this);
        } 

    } 

    public static class PolicyInstances extends TeaModel {
        @NameInMap("policy_category")
        private String policyCategory;

        @NameInMap("policy_name")
        private String policyName;

        @NameInMap("policy_description")
        private String policyDescription;

        @NameInMap("policy_severity")
        private String policySeverity;

        @NameInMap("policy_instances_count")
        private Long policyInstancesCount;

        private PolicyInstances(Builder builder) {
            this.policyCategory = builder.policyCategory;
            this.policyName = builder.policyName;
            this.policyDescription = builder.policyDescription;
            this.policySeverity = builder.policySeverity;
            this.policyInstancesCount = builder.policyInstancesCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyInstances create() {
            return builder().build();
        }

        /**
         * @return policyCategory
         */
        public String getPolicyCategory() {
            return this.policyCategory;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return policySeverity
         */
        public String getPolicySeverity() {
            return this.policySeverity;
        }

        /**
         * @return policyInstancesCount
         */
        public Long getPolicyInstancesCount() {
            return this.policyInstancesCount;
        }

        public static final class Builder {
            private String policyCategory; 
            private String policyName; 
            private String policyDescription; 
            private String policySeverity; 
            private Long policyInstancesCount; 

            /**
             * Policy type
             */
            public Builder policyCategory(String policyCategory) {
                this.policyCategory = policyCategory;
                return this;
            }

            /**
             * Policy name
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * Policy description
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * Policy governance level
             */
            public Builder policySeverity(String policySeverity) {
                this.policySeverity = policySeverity;
                return this;
            }

            /**
             * The number of deployed policy instances. If the field is empty, this type of policy instance is not deployed.
             */
            public Builder policyInstancesCount(Long policyInstancesCount) {
                this.policyInstancesCount = policyInstancesCount;
                return this;
            }

            public PolicyInstances build() {
                return new PolicyInstances(this);
            } 

        } 

    }
}
