// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
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
    private java.util.List<TrFirewallRoutePolicies> trFirewallRoutePolicies;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<TrFirewallRoutePolicies> getTrFirewallRoutePolicies() {
        return this.trFirewallRoutePolicies;
    }

    public static final class Builder {
        private String requestId; 
        private String totalCount; 
        private java.util.List<TrFirewallRoutePolicies> trFirewallRoutePolicies; 

        private Builder() {
        } 

        private Builder(DescribeTrFirewallV2RoutePolicyListResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trFirewallRoutePolicies = model.trFirewallRoutePolicies;
        } 

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
         * <p>The list of firewall routing policies.</p>
         */
        public Builder trFirewallRoutePolicies(java.util.List<TrFirewallRoutePolicies> trFirewallRoutePolicies) {
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

            private Builder() {
            } 

            private Builder(DestCandidateList model) {
                this.candidateId = model.candidateId;
                this.candidateType = model.candidateType;
            } 

            /**
             * <p>The ID of the traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze9epancaw8t4sha****</p>
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * <p>The type of the traffic redirection instance.</p>
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

            private Builder() {
            } 

            private Builder(SrcCandidateList model) {
                this.candidateId = model.candidateId;
                this.candidateType = model.candidateType;
            } 

            /**
             * <p>The ID of the traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2ze9epancaw8t4sha****</p>
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * <p>The type of the traffic redirection instance.</p>
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
        private java.util.List<DestCandidateList> destCandidateList;

        @com.aliyun.core.annotation.NameInMap("PolicyDescription")
        private String policyDescription;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyStatus")
        private String policyStatus;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        @com.aliyun.core.annotation.NameInMap("SrcCandidateList")
        private java.util.List<SrcCandidateList> srcCandidateList;

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
        public java.util.List<DestCandidateList> getDestCandidateList() {
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
        public java.util.List<SrcCandidateList> getSrcCandidateList() {
            return this.srcCandidateList;
        }

        /**
         * @return trFirewallRoutePolicyId
         */
        public String getTrFirewallRoutePolicyId() {
            return this.trFirewallRoutePolicyId;
        }

        public static final class Builder {
            private java.util.List<DestCandidateList> destCandidateList; 
            private String policyDescription; 
            private String policyName; 
            private String policyStatus; 
            private String policyType; 
            private java.util.List<SrcCandidateList> srcCandidateList; 
            private String trFirewallRoutePolicyId; 

            private Builder() {
            } 

            private Builder(TrFirewallRoutePolicies model) {
                this.destCandidateList = model.destCandidateList;
                this.policyDescription = model.policyDescription;
                this.policyName = model.policyName;
                this.policyStatus = model.policyStatus;
                this.policyType = model.policyType;
                this.srcCandidateList = model.srcCandidateList;
                this.trFirewallRoutePolicyId = model.trFirewallRoutePolicyId;
            } 

            /**
             * <p>The list of secondary traffic redirection instances.</p>
             */
            public Builder destCandidateList(java.util.List<DestCandidateList> destCandidateList) {
                this.destCandidateList = destCandidateList;
                return this;
            }

            /**
             * <p>The policy description.</p>
             * 
             * <strong>example:</strong>
             * <p>Point to multipoint</p>
             */
            public Builder policyDescription(String policyDescription) {
                this.policyDescription = policyDescription;
                return this;
            }

            /**
             * <p>The policy name.</p>
             * 
             * <strong>example:</strong>
             * <p>Singapore Point to Multipoint</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The policy status. Valid values:</p>
             * <ul>
             * <li><p>creating: being created</p>
             * </li>
             * <li><p>deleting: being deleted</p>
             * </li>
             * <li><p>opening: being enabled</p>
             * </li>
             * <li><p>opened: enabled</p>
             * </li>
             * <li><p>closing: being disabled</p>
             * </li>
             * <li><p>closed: disabled</p>
             * </li>
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
             * <p>The traffic redirection scenario type for the virtual private cloud (VPC) firewall on CEN Enterprise Edition. Valid values:</p>
             * <ul>
             * <li><p><strong>fullmesh</strong>: multi-point interconnection</p>
             * </li>
             * <li><p><strong>one_to_one</strong>: point-to-point</p>
             * </li>
             * <li><p><strong>end_to_end</strong>: point-to-multipoint</p>
             * </li>
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
             * <p>The list of primary traffic redirection instances.</p>
             */
            public Builder srcCandidateList(java.util.List<SrcCandidateList> srcCandidateList) {
                this.srcCandidateList = srcCandidateList;
                return this;
            }

            /**
             * <p>The ID of the firewall routing policy.</p>
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
