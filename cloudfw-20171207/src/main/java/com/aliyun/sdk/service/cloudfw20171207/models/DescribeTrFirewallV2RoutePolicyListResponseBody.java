// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>95EB5F3A-67FE-5780-92BD-5ECBA772AB7E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The routing policies.</p>
         */
        public Builder trFirewallRoutePolicies(java.util.List < TrFirewallRoutePolicies> trFirewallRoutePolicies) {
            this.trFirewallRoutePolicies = trFirewallRoutePolicies;
            return this;
        }

        public DescribeTrFirewallV2RoutePolicyListResponseBody build() {
            return new DescribeTrFirewallV2RoutePolicyListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrFirewallV2RoutePolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallV2RoutePolicyListResponseBody</p>
     */
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
             * <p>The ID of the secondary traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze9epancaw8t4sha****</p>
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * <p>The type of the secondary traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
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
    /**
     * 
     * {@link DescribeTrFirewallV2RoutePolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallV2RoutePolicyListResponseBody</p>
     */
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
             * <p>The ID of the primary traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze9epancaw8t4sha****</p>
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * <p>The type of the primary traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
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
    /**
     * 
     * {@link DescribeTrFirewallV2RoutePolicyListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallV2RoutePolicyListResponseBody</p>
     */
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
             * <p>The secondary traffic redirection instances.</p>
             */
            public Builder destCandidateList(java.util.List < DestCandidateList> destCandidateList) {
                this.destCandidateList = destCandidateList;
                return this;
            }

            /**
             * <p>The description of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The name of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>TEST_VPC_FW</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The status of the routing policy. Valid values:</p>
             * <ul>
             * <li>creating: The policy is being created.</li>
             * <li>deleting: The policy is being deleted.</li>
             * <li>opening: The policy is being enabled.</li>
             * <li>opened: The policy is enabled.</li>
             * <li>closing: The policy is being disabled.</li>
             * <li>closed: The policy is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>opened</p>
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * <p>The type of the traffic redirection scenario of the VPC firewall. Valid values:</p>
             * <ul>
             * <li><strong>fullmesh</strong>: interconnected instances</li>
             * <li><strong>one_to_one</strong>: instance to instance</li>
             * <li><strong>end_to_end</strong>: instance to instances</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fullmesh</p>
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * <p>The primary traffic redirection instances.</p>
             */
            public Builder srcCandidateList(java.util.List < SrcCandidateList> srcCandidateList) {
                this.srcCandidateList = srcCandidateList;
                return this;
            }

            /**
             * <p>The ID of the routing policy.</p>
             * 
             * <strong>example:</strong>
             * <p>policy-7b66257c14e141fb****</p>
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
