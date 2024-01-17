// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrFirewallPolicyBackUpAssociationListRequest} extends {@link RequestModel}
 *
 * <p>DescribeTrFirewallPolicyBackUpAssociationListRequest</p>
 */
public class DescribeTrFirewallPolicyBackUpAssociationListRequest extends Request {
    @Query
    @NameInMap("FirewallId")
    private String firewallId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    private DescribeTrFirewallPolicyBackUpAssociationListRequest(Builder builder) {
        super(builder);
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
        private String firewallId; 
        private String lang; 
        private String trFirewallRoutePolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTrFirewallPolicyBackUpAssociationListRequest request) {
            super(request);
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.trFirewallRoutePolicyId = request.trFirewallRoutePolicyId;
        } 

        /**
         * The instance ID of the VPC firewall.
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * The language of the content within the response. Valid values:
         * <p>
         * 
         * *   **zh** (default): Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The ID of the routing policy.
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

}
