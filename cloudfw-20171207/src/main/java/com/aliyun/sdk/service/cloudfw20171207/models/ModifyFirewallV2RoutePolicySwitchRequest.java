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
 * {@link ModifyFirewallV2RoutePolicySwitchRequest} extends {@link RequestModel}
 *
 * <p>ModifyFirewallV2RoutePolicySwitchRequest</p>
 */
public class ModifyFirewallV2RoutePolicySwitchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShouldRecover")
    private String shouldRecover;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicyId")
    private String trFirewallRoutePolicyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrFirewallRoutePolicySwitchStatus")
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
         * <p>The instance ID of the VPC boundary firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-tr-5b202e7f0be64611****</p>
         */
        public Builder firewallId(String firewallId) {
            this.putQueryParameter("FirewallId", firewallId);
            this.firewallId = firewallId;
            return this;
        }

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese</p>
         * </li>
         * <li><p><strong>en</strong>: English</p>
         * </li>
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
         * <p>Specifies whether to restore the traffic redirection configuration. Valid values:</p>
         * <ul>
         * <li><p>true: Rolls back the route.</p>
         * </li>
         * <li><p>false: Revokes the route.</p>
         * </li>
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
         * <p>The ID of the routing policy for the firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-93684cc5caa44b2e****</p>
         */
        public Builder trFirewallRoutePolicyId(String trFirewallRoutePolicyId) {
            this.putQueryParameter("TrFirewallRoutePolicyId", trFirewallRoutePolicyId);
            this.trFirewallRoutePolicyId = trFirewallRoutePolicyId;
            return this;
        }

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><p>open: Enables the policy.</p>
         * </li>
         * <li><p>close: Disables the policy.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
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
