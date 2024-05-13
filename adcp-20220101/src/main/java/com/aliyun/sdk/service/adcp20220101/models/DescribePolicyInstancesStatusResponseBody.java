// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyInstancesStatusResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyInstancesStatusResponseBody</p>
 */
public class DescribePolicyInstancesStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Policies")
    private Policies policies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePolicyInstancesStatusResponseBody(Builder builder) {
        this.policies = builder.policies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyInstancesStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return policies
     */
    public Policies getPolicies() {
        return this.policies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policies policies; 
        private String requestId; 

        /**
         * The number of policy instances of each policy type.
         */
        public Builder policies(Policies policies) {
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

        public DescribePolicyInstancesStatusResponseBody build() {
            return new DescribePolicyInstancesStatusResponseBody(this);
        } 

    } 

    public static class PolicyClusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private PolicyClusters(Builder builder) {
            this.clusterId = builder.clusterId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyClusters create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String clusterId; 
            private String status; 

            /**
             * The ID of the associated cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The status of the deployment.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PolicyClusters build() {
                return new PolicyClusters(this);
            } 

        } 

    }
    public static class PolicyInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyCategory")
        private String policyCategory;

        @com.aliyun.core.annotation.NameInMap("PolicyClusters")
        private java.util.List < PolicyClusters> policyClusters;

        @com.aliyun.core.annotation.NameInMap("PolicyDescription")
        private String policyDescription;

        @com.aliyun.core.annotation.NameInMap("PolicyInstancesCount")
        private Long policyInstancesCount;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicySeverity")
        private String policySeverity;

        private PolicyInstances(Builder builder) {
            this.policyCategory = builder.policyCategory;
            this.policyClusters = builder.policyClusters;
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
         * @return policyClusters
         */
        public java.util.List < PolicyClusters> getPolicyClusters() {
            return this.policyClusters;
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
            private java.util.List < PolicyClusters> policyClusters; 
            private String policyDescription; 
            private Long policyInstancesCount; 
            private String policyName; 
            private String policySeverity; 

            /**
             * The type of the policy.
             */
            public Builder policyCategory(String policyCategory) {
                this.policyCategory = policyCategory;
                return this;
            }

            /**
             * The associated clusters in which the policy instances are deployed.
             */
            public Builder policyClusters(java.util.List < PolicyClusters> policyClusters) {
                this.policyClusters = policyClusters;
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
    public static class SeverityInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SeverityCount")
        private String severityCount;

        @com.aliyun.core.annotation.NameInMap("SeverityType")
        private String severityType;

        private SeverityInfo(Builder builder) {
            this.severityCount = builder.severityCount;
            this.severityType = builder.severityType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SeverityInfo create() {
            return builder().build();
        }

        /**
         * @return severityCount
         */
        public String getSeverityCount() {
            return this.severityCount;
        }

        /**
         * @return severityType
         */
        public String getSeverityType() {
            return this.severityType;
        }

        public static final class Builder {
            private String severityCount; 
            private String severityType; 

            /**
             * The number of policy instances.
             */
            public Builder severityCount(String severityCount) {
                this.severityCount = severityCount;
                return this;
            }

            /**
             * The severity level.
             */
            public Builder severityType(String severityType) {
                this.severityType = severityType;
                return this;
            }

            public SeverityInfo build() {
                return new SeverityInfo(this);
            } 

        } 

    }
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PolicyInstances")
        private java.util.List < PolicyInstances> policyInstances;

        @com.aliyun.core.annotation.NameInMap("SeverityInfo")
        private java.util.List < SeverityInfo> severityInfo;

        private Policies(Builder builder) {
            this.policyInstances = builder.policyInstances;
            this.severityInfo = builder.severityInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return policyInstances
         */
        public java.util.List < PolicyInstances> getPolicyInstances() {
            return this.policyInstances;
        }

        /**
         * @return severityInfo
         */
        public java.util.List < SeverityInfo> getSeverityInfo() {
            return this.severityInfo;
        }

        public static final class Builder {
            private java.util.List < PolicyInstances> policyInstances; 
            private java.util.List < SeverityInfo> severityInfo; 

            /**
             * The number of policy instances of each policy type.
             */
            public Builder policyInstances(java.util.List < PolicyInstances> policyInstances) {
                this.policyInstances = policyInstances;
                return this;
            }

            /**
             * The number of policy instances that are deployed in the cluster.
             */
            public Builder severityInfo(java.util.List < SeverityInfo> severityInfo) {
                this.severityInfo = severityInfo;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
}
