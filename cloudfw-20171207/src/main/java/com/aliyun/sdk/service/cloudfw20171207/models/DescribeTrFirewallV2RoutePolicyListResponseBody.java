// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallV2RoutePolicyListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallV2RoutePolicyListResponseBody</p>
 */
public class DescribeTrFirewallV2RoutePolicyListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private String totalCount;

    @NameInMap("TrFirewallRoutePolicies")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrFirewallRoutePolicies.
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
        @NameInMap("CandidateId")
        private String candidateId;

        @NameInMap("CandidateType")
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
             * CandidateId.
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * CandidateType.
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
        @NameInMap("CandidateId")
        private String candidateId;

        @NameInMap("CandidateType")
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
             * CandidateId.
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * CandidateType.
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
        @NameInMap("DestCandidateList")
        private java.util.List < DestCandidateList> destCandidateList;

        @NameInMap("PolicyDescription")
        private String policyDescription;

        @NameInMap("PolicyName")
        private String policyName;

        @NameInMap("PolicyStatus")
        private String policyStatus;

        @NameInMap("PolicyType")
        private String policyType;

        @NameInMap("SrcCandidateList")
        private java.util.List < SrcCandidateList> srcCandidateList;

        @NameInMap("TrFirewallRoutePolicyId")
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
             * DestCandidateList.
             */
            public Builder destCandidateList(java.util.List < DestCandidateList> destCandidateList) {
                this.destCandidateList = destCandidateList;
                return this;
            }

            /**
             * PolicyDescription.
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicyStatus.
             */
            public Builder policyStatus(String policyStatus) {
                this.policyStatus = policyStatus;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            /**
             * SrcCandidateList.
             */
            public Builder srcCandidateList(java.util.List < SrcCandidateList> srcCandidateList) {
                this.srcCandidateList = srcCandidateList;
                return this;
            }

            /**
             * TrFirewallRoutePolicyId.
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
