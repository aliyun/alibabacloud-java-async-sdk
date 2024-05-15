// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrFirewallV2RoutePolicyRequest} extends {@link RequestModel}
 *
 * <p>CreateTrFirewallV2RoutePolicyRequest</p>
 */
public class CreateTrFirewallV2RoutePolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCandidateList")
    private java.util.List < DestCandidateList> destCandidateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyDescription")
    private String policyDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyName")
    private String policyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    private String policyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcCandidateList")
    private java.util.List < SrcCandidateList> srcCandidateList;

    private CreateTrFirewallV2RoutePolicyRequest(Builder builder) {
        super(builder);
        this.destCandidateList = builder.destCandidateList;
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.policyDescription = builder.policyDescription;
        this.policyName = builder.policyName;
        this.policyType = builder.policyType;
        this.srcCandidateList = builder.srcCandidateList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrFirewallV2RoutePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destCandidateList
     */
    public java.util.List < DestCandidateList> getDestCandidateList() {
        return this.destCandidateList;
    }

    /**
     * @return firewallId
     */
    public String getFirewallId() {
        return this.firewallId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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

    public static final class Builder extends Request.Builder<CreateTrFirewallV2RoutePolicyRequest, Builder> {
        private java.util.List < DestCandidateList> destCandidateList; 
        private String firewallId; 
        private String lang; 
        private String policyDescription; 
        private String policyName; 
        private String policyType; 
        private java.util.List < SrcCandidateList> srcCandidateList; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrFirewallV2RoutePolicyRequest request) {
            super(request);
            this.destCandidateList = request.destCandidateList;
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.policyDescription = request.policyDescription;
            this.policyName = request.policyName;
            this.policyType = request.policyType;
            this.srcCandidateList = request.srcCandidateList;
        } 

        /**
         * DestCandidateList.
         */
        public Builder destCandidateList(java.util.List < DestCandidateList> destCandidateList) {
            String destCandidateListShrink = shrink(destCandidateList, "DestCandidateList", "json");
            this.putQueryParameter("DestCandidateList", destCandidateListShrink);
            this.destCandidateList = destCandidateList;
            return this;
        }

        /**
         * FirewallId.
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * PolicyDescription.
         */
        public Builder policyDescription(String policyDescription) {
            this.putQueryParameter("PolicyDescription", policyDescription);
            this.policyDescription = policyDescription;
            return this;
        }

        /**
         * PolicyName.
         */
        public Builder policyName(String policyName) {
            this.putQueryParameter("PolicyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * PolicyType.
         */
        public Builder policyType(String policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        /**
         * SrcCandidateList.
         */
        public Builder srcCandidateList(java.util.List < SrcCandidateList> srcCandidateList) {
            String srcCandidateListShrink = shrink(srcCandidateList, "SrcCandidateList", "json");
            this.putQueryParameter("SrcCandidateList", srcCandidateListShrink);
            this.srcCandidateList = srcCandidateList;
            return this;
        }

        @Override
        public CreateTrFirewallV2RoutePolicyRequest build() {
            return new CreateTrFirewallV2RoutePolicyRequest(this);
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
}
