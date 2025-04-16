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
 * {@link ModifyTrFirewallV2RoutePolicyScopeRequest} extends {@link RequestModel}
 *
 * <p>ModifyTrFirewallV2RoutePolicyScopeRequest</p>
 */
public class ModifyTrFirewallV2RoutePolicyScopeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCandidateList")
    private java.util.List<DestCandidateList> destCandidateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShouldRecover")
    private String shouldRecover;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SrcCandidateList")
    private java.util.List<SrcCandidateList> srcCandidateList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trFirewallRoutePolicyId;

    private ModifyTrFirewallV2RoutePolicyScopeRequest(Builder builder) {
        super(builder);
        this.destCandidateList = builder.destCandidateList;
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.shouldRecover = builder.shouldRecover;
        this.srcCandidateList = builder.srcCandidateList;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrFirewallV2RoutePolicyScopeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destCandidateList
     */
    public java.util.List<DestCandidateList> getDestCandidateList() {
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
     * @return shouldRecover
     */
    public String getShouldRecover() {
        return this.shouldRecover;
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

    public static final class Builder extends Request.Builder<ModifyTrFirewallV2RoutePolicyScopeRequest, Builder> {
        private java.util.List<DestCandidateList> destCandidateList; 
        private String firewallId; 
        private String lang; 
        private String shouldRecover; 
        private java.util.List<SrcCandidateList> srcCandidateList; 
        private String trFirewallRoutePolicyId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTrFirewallV2RoutePolicyScopeRequest request) {
            super(request);
            this.destCandidateList = request.destCandidateList;
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.shouldRecover = request.shouldRecover;
            this.srcCandidateList = request.srcCandidateList;
            this.trFirewallRoutePolicyId = request.trFirewallRoutePolicyId;
        } 

        /**
         * <p>The secondary traffic redirection instances.</p>
         */
        public Builder destCandidateList(java.util.List<DestCandidateList> destCandidateList) {
            String destCandidateListShrink = shrink(destCandidateList, "DestCandidateList", "json");
            this.putQueryParameter("DestCandidateList", destCandidateListShrink);
            this.destCandidateList = destCandidateList;
            return this;
        }

        /**
         * <p>The instance ID of the virtual private cloud (VPC) firewall.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-6520de0253bc4669bbd9</p>
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
         * <p>Specifies whether to restore the traffic redirection configurations. Valid values:</p>
         * <ul>
         * <li>true: roll back</li>
         * <li>false: withdraw</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder shouldRecover(String shouldRecover) {
            this.putQueryParameter("ShouldRecover", shouldRecover);
            this.shouldRecover = shouldRecover;
            return this;
        }

        /**
         * <p>The primary traffic redirection instances.</p>
         */
        public Builder srcCandidateList(java.util.List<SrcCandidateList> srcCandidateList) {
            String srcCandidateListShrink = shrink(srcCandidateList, "SrcCandidateList", "json");
            this.putQueryParameter("SrcCandidateList", srcCandidateListShrink);
            this.srcCandidateList = srcCandidateList;
            return this;
        }

        /**
         * <p>The ID of the routing policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-4d724d0139df48f18091</p>
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.putQueryParameter("TrFirewallRoutePolicyId", trFirewallRoutePolicyId);
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        @Override
        public ModifyTrFirewallV2RoutePolicyScopeRequest build() {
            return new ModifyTrFirewallV2RoutePolicyScopeRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyTrFirewallV2RoutePolicyScopeRequest} extends {@link TeaModel}
     *
     * <p>ModifyTrFirewallV2RoutePolicyScopeRequest</p>
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
             * <p>vpc-2ze9epancaw8t4shajuzi</p>
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
     * {@link ModifyTrFirewallV2RoutePolicyScopeRequest} extends {@link TeaModel}
     *
     * <p>ModifyTrFirewallV2RoutePolicyScopeRequest</p>
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
             * <p>vpc-2ze9epancaw8t4shajuzi</p>
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
}
