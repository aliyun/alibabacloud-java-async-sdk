// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFirewallV2RoutePolicySwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyFirewallV2RoutePolicySwitchRequest</p>
 */
public class ModifyFirewallV2RoutePolicySwitchRequest extends Request {
    @Query
    @NameInMap("FirewallId")
    private String firewallId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("ShouldRecover")
    private String shouldRecover;

    @Query
    @NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    @Query
    @NameInMap("TrFirewallRoutePolicySwitchStatus")
    private String trFirewallRoutePolicySwitchStatus;

    private ModifyFirewallV2RoutePolicySwitchRequest(Builder builder) {
        super(builder);
        this.firewallId = builder.firewallId;
        this.lang = builder.lang;
        this.shouldRecover = builder.shouldRecover;
        this.trFirewallRoutePolicyId = builder.trFirewallRoutePolicyId;
        this.trFirewallRoutePolicySwitchStatus = builder.trFirewallRoutePolicySwitchStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFirewallV2RoutePolicySwitchRequest create() {
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
     * @return shouldRecover
     */
    public String getShouldRecover() {
        return this.shouldRecover;
    }

    /**
     * @return trFirewallRoutePolicyId
     */
    public String getTrFirewallRoutePolicyId() {
        return this.trFirewallRoutePolicyId;
    }

    /**
     * @return trFirewallRoutePolicySwitchStatus
     */
    public String getTrFirewallRoutePolicySwitchStatus() {
        return this.trFirewallRoutePolicySwitchStatus;
    }

    public static final class Builder extends Request.Builder<ModifyFirewallV2RoutePolicySwitchRequest, Builder> {
        private String firewallId; 
        private String lang; 
        private String shouldRecover; 
        private String trFirewallRoutePolicyId; 
        private String trFirewallRoutePolicySwitchStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFirewallV2RoutePolicySwitchRequest request) {
            super(request);
            this.firewallId = request.firewallId;
            this.lang = request.lang;
            this.shouldRecover = request.shouldRecover;
            this.trFirewallRoutePolicyId = request.trFirewallRoutePolicyId;
            this.trFirewallRoutePolicySwitchStatus = request.trFirewallRoutePolicySwitchStatus;
        } 

        /**
         * The instance ID of the virtual private cloud (VPC) firewall.
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
         * Specifies whether to restore the traffic redirection configurations. Valid values:
         * <p>
         * 
         * *   true: roll back
         * *   false: withdraw
         */
        public Builder shouldRecover(String shouldRecover) {
            this.putQueryParameter("ShouldRecover", shouldRecover);
            this.shouldRecover = shouldRecover;
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

        /**
         * The status of the routing policy. Valid values:
         * <p>
         * 
         * *   open: enabled
         * *   close: disabled
         */
        public Builder trFirewallRoutePolicySwitchStatus(String trFirewallRoutePolicySwitchStatus) {
            this.putQueryParameter("TrFirewallRoutePolicySwitchStatus", trFirewallRoutePolicySwitchStatus);
            this.trFirewallRoutePolicySwitchStatus = trFirewallRoutePolicySwitchStatus;
            return this;
        }

        @Override
        public ModifyFirewallV2RoutePolicySwitchRequest build() {
            return new ModifyFirewallV2RoutePolicySwitchRequest(this);
        } 

    } 

}
