// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The <strong>token</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the firewall template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ft-bcf1a7hrdq717****</p>
         */
        public Builder firewallTemplateId(String firewallTemplateId) {
            this.putQueryParameter("FirewallTemplateId", firewallTemplateId);
            this.firewallTemplateId = firewallTemplateId;
            return this;
        }

        /**
         * <p>The IDs of the firewall template rules.</p>
         * <p>This parameter is required.</p>
         */
        public Builder firewallTemplateRuleId(java.util.List < String > firewallTemplateRuleId) {
            this.putQueryParameter("FirewallTemplateRuleId", firewallTemplateRuleId);
            this.firewallTemplateRuleId = firewallTemplateRuleId;
            return this;
        }

        /**
         * <p>The region ID of the simple application server. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
