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
    @NameInMap("instances_severity_count")
    private java.util.Map < String, ? > instancesSeverityCount;

    @NameInMap("policy_instances")
    private java.util.List < PolicyInstances> policyInstances;

    private DescribePolicyInstancesStatusResponseBody(Builder builder) {
        this.instancesSeverityCount = builder.instancesSeverityCount;
        this.policyInstances = builder.policyInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyInstancesStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return instancesSeverityCount
     */
    public java.util.Map < String, ? > getInstancesSeverityCount() {
        return this.instancesSeverityCount;
    }

    /**
     * @return policyInstances
     */
    public java.util.List < PolicyInstances> getPolicyInstances() {
        return this.policyInstances;
    }

    public static final class Builder {
        private java.util.Map < String, ? > instancesSeverityCount; 
        private java.util.List < PolicyInstances> policyInstances; 

        /**
         * Information about the number of policy instances of each severity level.
         */
        public Builder instancesSeverityCount(java.util.Map < String, ? > instancesSeverityCount) {
            this.instancesSeverityCount = instancesSeverityCount;
            return this;
        }

        /**
         * Details about policy instances of different types.
         */
        public Builder policyInstances(java.util.List < PolicyInstances> policyInstances) {
            this.policyInstances = policyInstances;
            return this;
        }

        public DescribePolicyInstancesStatusResponseBody build() {
            return new DescribePolicyInstancesStatusResponseBody(this);
        } 

    } 

    public static class PolicyInstances extends TeaModel {
        @NameInMap("policy_category")
        private String policyCategory;

        @NameInMap("policy_description")
        private String policyDescription;

        @NameInMap("policy_instances_count")
        private Long policyInstancesCount;

        @NameInMap("policy_name")
        private String policyName;

        @NameInMap("policy_severity")
        private String policySeverity;

        private PolicyInstances(Builder builder) {
            this.policyCategory = builder.policyCategory;
            this.policyDescription = builder.policyDescription;
            this.policyInstancesCount = builder.policyInstancesCount;
            this.policyName = builder.policyName;
            this.policySeverity = builder.policySeverity;
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
         * @return policyDescription
         */
        public String getPolicyDescription() {
            return this.policyDescription;
        }

        /**
         * @return policyInstancesCount
         */
        public Long getPolicyInstancesCount() {
            return this.policyInstancesCount;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policySeverity
         */
        public String getPolicySeverity() {
            return this.policySeverity;
        }

        public static final class Builder {
            private String policyCategory; 
            private String policyDescription; 
            private Long policyInstancesCount; 
            private String policyName; 
            private String policySeverity; 

            /**
             * The policy type. For more information about different types of policies and their descriptions, see [Predefined security policies of ACK](https://www.alibabacloud.com/help/doc-detail/359819.html).
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
             * The number of policy instances that are deployed. If this parameter is empty, no policy instance is deployed.
             */
            public Builder policyInstancesCount(Long policyInstancesCount) {
                this.policyInstancesCount = policyInstancesCount;
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
             * The severity level of the policy.
             */
            public Builder policySeverity(String policySeverity) {
                this.policySeverity = policySeverity;
                return this;
            }

            public PolicyInstances build() {
                return new PolicyInstances(this);
            } 

        } 

    }
}
