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
 * {@link DescribeTrFirewallPolicyBackUpAssociationListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrFirewallPolicyBackUpAssociationListResponseBody</p>
 */
public class DescribeTrFirewallPolicyBackUpAssociationListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PolicyAssociationBackupConfigs")
    private java.util.List<PolicyAssociationBackupConfigs> policyAssociationBackupConfigs;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
    public java.util.List<PolicyAssociationBackupConfigs> getPolicyAssociationBackupConfigs() {
        return this.policyAssociationBackupConfigs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PolicyAssociationBackupConfigs> policyAssociationBackupConfigs; 
        private String requestId; 

        /**
         * <p>The route tables.</p>
         */
        public Builder policyAssociationBackupConfigs(java.util.List<PolicyAssociationBackupConfigs> policyAssociationBackupConfigs) {
            this.policyAssociationBackupConfigs = policyAssociationBackupConfigs;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C264A756-9B48-57E3-B312-716941E146C6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTrFirewallPolicyBackUpAssociationListResponseBody build() {
            return new DescribeTrFirewallPolicyBackUpAssociationListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrFirewallPolicyBackUpAssociationListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallPolicyBackUpAssociationListResponseBody</p>
     */
    public static class PolicyAssociationBackupConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CandidateId")
        private String candidateId;

        @com.aliyun.core.annotation.NameInMap("CandidateName")
        private String candidateName;

        @com.aliyun.core.annotation.NameInMap("CandidateType")
        private String candidateType;

        @com.aliyun.core.annotation.NameInMap("CurrentRouteTableId")
        private String currentRouteTableId;

        @com.aliyun.core.annotation.NameInMap("OriginalRouteTableId")
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
             * <p>The ID of the traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz9grb8ng3y7h7lf2****</p>
             */
            public Builder candidateId(String candidateId) {
                this.candidateId = candidateId;
                return this;
            }

            /**
             * <p>The name of the traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder candidateName(String candidateName) {
                this.candidateName = candidateName;
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

            /**
             * <p>The route table that is used after traffic redirection.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-wz9898grickmh5j09****</p>
             */
            public Builder currentRouteTableId(String currentRouteTableId) {
                this.currentRouteTableId = currentRouteTableId;
                return this;
            }

            /**
             * <p>The ID of the route table.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-wz9slp3s7m4qrzvnq****</p>
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
