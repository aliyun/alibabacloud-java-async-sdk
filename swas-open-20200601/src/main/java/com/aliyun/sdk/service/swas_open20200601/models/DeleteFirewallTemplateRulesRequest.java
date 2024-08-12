// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFirewallTemplateRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteFirewallTemplateRulesRequest</p>
 */
public class DeleteFirewallTemplateRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallTemplateRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > firewallTemplateRuleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteFirewallTemplateRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.firewallTemplateId = builder.firewallTemplateId;
        this.firewallTemplateRuleId = builder.firewallTemplateRuleId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFirewallTemplateRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return firewallTemplateId
     */
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    /**
     * @return firewallTemplateRuleId
     */
    public java.util.List < String > getFirewallTemplateRuleId() {
        return this.firewallTemplateRuleId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteFirewallTemplateRulesRequest, Builder> {
        private String clientToken; 
        private String firewallTemplateId; 
        private java.util.List < String > firewallTemplateRuleId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFirewallTemplateRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.firewallTemplateId = request.firewallTemplateId;
            this.firewallTemplateRuleId = request.firewallTemplateRuleId;
            this.regionId = request.regionId;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the firewall template.
         */
        public Builder firewallTemplateId(String firewallTemplateId) {
            this.putQueryParameter("FirewallTemplateId", firewallTemplateId);
            this.firewallTemplateId = firewallTemplateId;
            return this;
        }

        /**
         * The IDs of the firewall template rules.
         */
        public Builder firewallTemplateRuleId(java.util.List < String > firewallTemplateRuleId) {
            this.putQueryParameter("FirewallTemplateRuleId", firewallTemplateRuleId);
            this.firewallTemplateRuleId = firewallTemplateRuleId;
            return this;
        }

        /**
         * The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteFirewallTemplateRulesRequest build() {
            return new DeleteFirewallTemplateRulesRequest(this);
        } 

    } 

}
