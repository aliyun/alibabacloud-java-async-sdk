// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTrFirewallV2ConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyTrFirewallV2ConfigurationRequest</p>
 */
public class ModifyTrFirewallV2ConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallId")
    private String firewallId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallName")
    private String firewallName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    private ModifyTrFirewallV2ConfigurationRequest(Builder builder) {
        super(builder);
        this.firewallId = builder.firewallId;
        this.firewallName = builder.firewallName;
        this.lang = builder.lang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTrFirewallV2ConfigurationRequest create() {
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
     * @return firewallName
     */
    public String getFirewallName() {
        return this.firewallName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    public static final class Builder extends Request.Builder<ModifyTrFirewallV2ConfigurationRequest, Builder> {
        private String firewallId; 
        private String firewallName; 
        private String lang; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTrFirewallV2ConfigurationRequest request) {
            super(request);
            this.firewallId = request.firewallId;
            this.firewallName = request.firewallName;
            this.lang = request.lang;
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
         * The instance name of the VPC firewall.
         */
        public Builder firewallName(String firewallName) {
            this.putQueryParameter("FirewallName", firewallName);
            this.firewallName = firewallName;
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

        @Override
        public ModifyTrFirewallV2ConfigurationRequest build() {
            return new ModifyTrFirewallV2ConfigurationRequest(this);
        } 

    } 

}
