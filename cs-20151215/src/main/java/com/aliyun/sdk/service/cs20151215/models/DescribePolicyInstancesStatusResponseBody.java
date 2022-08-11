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
         * instances_severity_count.
         */
        public Builder instancesSeverityCount(java.util.Map < String, ? > instancesSeverityCount) {
            this.instancesSeverityCount = instancesSeverityCount;
            return this;
        }

        /**
         * 不同策略类型下的策略实例计数列表
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
             * policy_category.
             */
            public Builder policyCategory(String policyCategory) {
                this.policyCategory = policyCategory;
                return this;
            }

            /**
             * policy_description.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * policy_instances_count.
             */
            public Builder policyInstancesCount(Long policyInstancesCount) {
                this.policyInstancesCount = policyInstancesCount;
                return this;
            }

            /**
             * policy_name.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * policy_severity.
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
