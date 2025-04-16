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
 * {@link DescribeTrFirewallPolicyBackUpAssociationListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrFirewallPolicyBackUpAssociationListRequest</p>
 */
public class DescribeTrFirewallPolicyBackUpAssociationListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CandidateList")
    private java.util.List<CandidateList> candidateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    private DescribeTrFirewallPolicyBackUpAssociationListRequest(Builder builder) {
        super(builder);
        this.candidateList = builder.candidateList;
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrFirewallPolicyBackUpAssociationListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return candidateList
     */
    public java.util.List<CandidateList> getCandidateList() {
        return this.candidateList;
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
     * @return trFirewallRoutePolicyId
     */
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

    public static final class Builder extends Request.Builder<DescribeTrFirewallPolicyBackUpAssociationListRequest, Builder> {
        private java.util.List<CandidateList> candidateList; 
        private String firewallId; 
        private String lang; 
        private String trFirewallRoutePolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrFirewallPolicyBackUpAssociationListRequest request) {
            super(request);
            this.candidateList = request.candidateList;
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.trFirewallRoutePolicyId = request.trFirewallRoutePolicyId;
        } 

        /**
         * <p>The traffic redirection instances.</p>
         */
        public Builder candidateList(java.util.List<CandidateList> candidateList) {
            String candidateListShrink = shrink(candidateList, "CandidateList", "json");
            this.putQueryParameter("CandidateList", candidateListShrink);
            this.candidateList = candidateList;
            return this;
        }

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-8b268ce1b26e4c68****</p>
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The language of the content within the response. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong> (default): Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the routing policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-5dcafb12ff794a56****</p>
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.putQueryParameter("TrFirewallRoutePolicyId", trFirewallRoutePolicyId);
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        @Override
        public DescribeTrFirewallPolicyBackUpAssociationListRequest build() {
            return new DescribeTrFirewallPolicyBackUpAssociationListRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTrFirewallPolicyBackUpAssociationListRequest} extends {@link TeaModel}
     *
     * <p>DescribeTrFirewallPolicyBackUpAssociationListRequest</p>
     */
    public static class CandidateList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CandidateId")
        private String candidateId;

        @com.aliyun.core.annotation.NameInMap("CandidateType")
        private String candidateType;

        private CandidateList(Builder builder) {
            this.candidateId = builder.candidateId;
            this.candidateType = builder.candidateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CandidateList create() {
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

            private Builder(CandidateList model) {
                this.candidateId = model.candidateId;
                this.candidateType = model.candidateType;
            } 

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
             * <p>The type of the traffic redirection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC</p>
             */
            public Builder candidateType(String candidateType) {
                this.candidateType = candidateType;
                return this;
            }

            public CandidateList build() {
                return new CandidateList(this);
            } 

        } 

    }
}
