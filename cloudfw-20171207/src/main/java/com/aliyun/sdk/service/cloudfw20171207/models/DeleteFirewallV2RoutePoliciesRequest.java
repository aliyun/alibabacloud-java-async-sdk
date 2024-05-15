// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFirewallV2RoutePoliciesRequest} extends {@link RequestModel}
 *
 * <p>DeleteFirewallV2RoutePoliciesRequest</p>
 */
public class DeleteFirewallV2RoutePoliciesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    private DeleteFirewallV2RoutePoliciesRequest(Builder builder) {
        super(builder);
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFirewallV2RoutePoliciesRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFirewallV2RoutePoliciesRequest, Builder> {
        private String firewallId; 
        private String lang; 
        private String trFirewallRoutePolicyId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFirewallV2RoutePoliciesRequest request) {
            super(request);
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.trFirewallRoutePolicyId = request.trFirewallRoutePolicyId;
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
         * TrFirewallRoutePolicyId.
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.putQueryParameter("TrFirewallRoutePolicyId", trFirewallRoutePolicyId);
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        @Override
        public DeleteFirewallV2RoutePoliciesRequest build() {
            return new DeleteFirewallV2RoutePoliciesRequest(this);
        } 

    } 

}
