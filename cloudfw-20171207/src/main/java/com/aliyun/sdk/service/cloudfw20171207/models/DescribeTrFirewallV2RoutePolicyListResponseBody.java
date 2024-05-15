// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallV2RoutePolicyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallV2RoutePolicyListResponseBody</p>
 */
public class DescribeTrFirewallV2RoutePolicyListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicies")
    private java.util.List < TrFirewallRoutePolicies> trFirewallRoutePolicies;

    private DescribeTrFirewallV2RoutePolicyListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trFirewallRoutePolicies = builder.trFirewallRoutePolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallV2RoutePolicyListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trFirewallRoutePolicies
     */
    public java.util.List < TrFirewallRoutePolicies> getTrFirewallRoutePolicies() {
        return this.trFirewallRoutePolicies;
    }

    public static final class Builder {
        private String requestId; 
        private String totalCount; 
        private java.util.List < TrFirewallRoutePolicies> trFirewallRoutePolicies; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The routing policies.
         */
        public Builder trFirewallRoutePolicies(java.util.List < TrFirewallRoutePolicies> trFirewallRoutePolicies) {
            this.trFirewallRoutePolicies = trFirewallRoutePolicies;
            return this;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBody build() {
            return new DescribeTrFirewallV2RoutePolicyListResponseBody(this);
        } 

    } 

    public static class DestCandidateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CandidateId")
        private String candidateId;

        @com.aliyun.core.annotation.NameInMap("CandidateType")
        private String candidateType;

        private DestCandidateList(Builder builder) {
            this.candidateId = builder.candidateId;
            this.candidateType = builder.candidateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DestCandidateList create() {
            return builder().build();
        }

        /**
         * @return candidateId
         */
        public String getCandidateId() {
            return this.candidateId;
        }

        /**
         * @return candidateType
         */
        public String getCandidateType() {
            return this.candidateType;
        }

        public static final class Builder {
            private String candidateId; 
            private String candidateType; 

            /**
             * The ID of the secondary traffic redirection instance.
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * The type of the secondary traffic redirection instance.
             */
            public Builder candidateType(String candidateType) {
                this.candidateType = candidateType;
                return this;
            }

            public DestCandidateList build() {
                return new DestCandidateList(this);
            } 

        } 

    }
    public static class SrcCandidateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CandidateId")
        private String candidateId;

        @com.aliyun.core.annotation.NameInMap("CandidateType")
        private String candidateType;

        private SrcCandidateList(Builder builder) {
            this.candidateId = builder.candidateId;
            this.candidateType = builder.candidateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SrcCandidateList create() {
            return builder().build();
        }

        /**
         * @return candidateId
         */
        public String getCandidateId() {
            return this.candidateId;
        }

        /**
         * @return candidateType
         */
        public String getCandidateType() {
            return this.candidateType;
        }

        public static final class Builder {
            private String candidateId; 
            private String candidateType; 

            /**
             * The ID of the primary traffic redirection instance.
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * The type of the primary traffic redirection instance.
             */
            public Builder candidateType(String candidateType) {
                this.candidateType = candidateType;
                return this;
            }

            public SrcCandidateList build() {
                return new SrcCandidateList(this);
            } 

        } 

    }
    public static class TrFirewallRoutePolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestCandidateList")
        private java.util.List < DestCandidateList> destCandidateList;

        @com.aliyun.core.annotation.NameInMap("PolicyDescription")
        private String policyDescription;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("SrcCandidateList")
        private java.util.List < SrcCandidateList> srcCandidateList;

        @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
        private String trFirewallRoutePolicyId;

        private TrFirewallRoutePolicies(Builder builder) {
            this.destCandidateList = builder.destCandidateList;
            this.policyDescription = builder.policyDescription;
            this.policyName = builder.policyName;
            this.policyStatus = builder.policyStatus;
            this.policyType = builder.policyType;
            this.srcCandidateList = builder.srcCandidateList;
            this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrFirewallRoutePolicies create() {
            return builder().build();
        }

        /**
         * @return destCandidateList
         */
        public java.util.List < DestCandidateList> getDestCandidateList() {
            return this.destCandidateList;
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
         * @return policyStatus
         */
        public String getPolicyStatus() {
            return this.policyStatus;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        /**
         * @return srcCandidateList
         */
        public java.util.List < SrcCandidateList> getSrcCandidateList() {
            return this.srcCandidateList;
        }

        /**
         * @return trFirewallRoutePolicyId
         */
        public String getTrFirewallRoutePolicyId() {
            return this.trFirewallRoutePolicyId;
        }

        public static final class Builder {
            private java.util.List < DestCandidateList> destCandidateList; 
            private String policyDescription; 
            private String policyName; 
            private String policyStatus; 
            private String policyType; 
            private java.util.List < SrcCandidateList> srcCandidateList; 
            private String trFirewallRoutePolicyId; 

            /**
             * The secondary traffic redirection instances.
             */
            public Builder destCandidateList(java.util.List < DestCandidateList> destCandidateList) {
                this.destCandidateList = destCandidateList;
                return this;
            }

            /**
             * The description of the routing policy.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * The name of the routing policy.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * The status of the routing policy. Valid values:
             * <p>
             * 
             * *   creating: The policy is being created.
             * *   deleting: The policy is being deleted.
             * *   opening: The policy is being enabled.
             * *   opened: The policy is enabled.
             * *   closing: The policy is being disabled.
             * *   closed: The policy is disabled.
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * The type of the traffic redirection scenario of the VPC firewall. Valid values:
             * <p>
             * 
             * *   **fullmesh**: interconnected instances
             * *   **one_to_one**: instance to instance
             * *   **end_to_end**: instance to instances
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * The primary traffic redirection instances.
             */
            public Builder srcCandidateList(java.util.List < SrcCandidateList> srcCandidateList) {
                this.srcCandidateList = srcCandidateList;
                return this;
            }

            /**
             * The ID of the routing policy.
             */
            public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
                this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
                return this;
            }

            public TrFirewallRoutePolicies build() {
                return new TrFirewallRoutePolicies(this);
            } 

        } 

    }
}
