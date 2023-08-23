// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallPolicyBackUpAssociationListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallPolicyBackUpAssociationListResponseBody</p>
 */
public class DescribeTrFirewallPolicyBackUpAssociationListResponseBody extends TeaModel {
    @NameInMap("PolicyAssociationBackupConfigs")
    private java.util.List < PolicyAssociationBackupConfigs> policyAssociationBackupConfigs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeTrFirewallPolicyBackUpAssociationListResponseBody(Builder builder) {
        this.policyAssociationBackupConfigs = builder.policyAssociationBackupConfigs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallPolicyBackUpAssociationListResponseBody create() {
        return builder().build();
    }

    /**
     * @return policyAssociationBackupConfigs
     */
    public java.util.List < PolicyAssociationBackupConfigs> getPolicyAssociationBackupConfigs() {
        return this.policyAssociationBackupConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PolicyAssociationBackupConfigs> policyAssociationBackupConfigs; 
        private String requestId; 

        /**
         * PolicyAssociationBackupConfigs.
         */
        public Builder policyAssociationBackupConfigs(java.util.List < PolicyAssociationBackupConfigs> policyAssociationBackupConfigs) {
            this.policyAssociationBackupConfigs = policyAssociationBackupConfigs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrFirewallPolicyBackUpAssociationListResponseBody build() {
            return new DescribeTrFirewallPolicyBackUpAssociationListResponseBody(this);
        } 

    } 

    public static class PolicyAssociationBackupConfigs extends TeaModel {
        @NameInMap("CandidateId")
        private String candidateId;

        @NameInMap("CandidateName")
        private String candidateName;

        @NameInMap("CandidateType")
        private String candidateType;

        @NameInMap("CurrentRouteTableId")
        private String currentRouteTableId;

        @NameInMap("OriginalRouteTableId")
        private String originalRouteTableId;

        private PolicyAssociationBackupConfigs(Builder builder) {
            this.candidateId = builder.candidateId;
            this.candidateName = builder.candidateName;
            this.candidateType = builder.candidateType;
            this.currentRouteTableId = builder.currentRouteTableId;
            this.originalRouteTableId = builder.originalRouteTableId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyAssociationBackupConfigs create() {
            return builder().build();
        }

        /**
         * @return candidateId
         */
        public String getCandidateId() {
            return this.candidateId;
        }

        /**
         * @return candidateName
         */
        public String getCandidateName() {
            return this.candidateName;
        }

        /**
         * @return candidateType
         */
        public String getCandidateType() {
            return this.candidateType;
        }

        /**
         * @return currentRouteTableId
         */
        public String getCurrentRouteTableId() {
            return this.currentRouteTableId;
        }

        /**
         * @return originalRouteTableId
         */
        public String getOriginalRouteTableId() {
            return this.originalRouteTableId;
        }

        public static final class Builder {
            private String candidateId; 
            private String candidateName; 
            private String candidateType; 
            private String currentRouteTableId; 
            private String originalRouteTableId; 

            /**
             * CandidateId.
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * CandidateName.
             */
            public Builder candidateName(String candidateName) {
                this.candidateName = candidateName;
                return this;
            }

            /**
             * CandidateType.
             */
            public Builder candidateType(String candidateType) {
                this.candidateType = candidateType;
                return this;
            }

            /**
             * CurrentRouteTableId.
             */
            public Builder currentRouteTableId(String currentRouteTableId) {
                this.currentRouteTableId = currentRouteTableId;
                return this;
            }

            /**
             * OriginalRouteTableId.
             */
            public Builder originalRouteTableId(String originalRouteTableId) {
                this.originalRouteTableId = originalRouteTableId;
                return this;
            }

            public PolicyAssociationBackupConfigs build() {
                return new PolicyAssociationBackupConfigs(this);
            } 

        } 

    }
}
