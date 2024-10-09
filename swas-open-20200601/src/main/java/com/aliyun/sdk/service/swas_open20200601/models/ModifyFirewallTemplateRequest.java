// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFirewallTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyFirewallTemplateRequest</p>
 */
public class ModifyFirewallTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallTemplateRule")
    private java.util.List < FirewallTemplateRule> firewallTemplateRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyFirewallTemplateRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.firewallTemplateId = builder.firewallTemplateId;
        this.firewallTemplateRule = builder.firewallTemplateRule;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFirewallTemplateRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return firewallTemplateId
     */
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    /**
     * @return firewallTemplateRule
     */
    public java.util.List < FirewallTemplateRule> getFirewallTemplateRule() {
        return this.firewallTemplateRule;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyFirewallTemplateRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String firewallTemplateId; 
        private java.util.List < FirewallTemplateRule> firewallTemplateRule; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFirewallTemplateRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.firewallTemplateId = request.firewallTemplateId;
            this.firewallTemplateRule = request.firewallTemplateRule;
            this.name = request.name;
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
         * <p>The description of the firewall template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * <p>The firewall rule in the template.</p>
         */
        public Builder firewallTemplateRule(java.util.List < FirewallTemplateRule> firewallTemplateRule) {
            this.putQueryParameter("FirewallTemplateRule", firewallTemplateRule);
            this.firewallTemplateRule = firewallTemplateRule;
            return this;
        }

        /**
         * <p>The name of the firewall template.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public ModifyFirewallTemplateRequest build() {
            return new ModifyFirewallTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyFirewallTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyFirewallTemplateRequest</p>
     */
    public static class FirewallTemplateRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirewallTemplateRuleId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String firewallTemplateRuleId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleProtocol")
        private String ruleProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private FirewallTemplateRule(Builder builder) {
            this.firewallTemplateRuleId = builder.firewallTemplateRuleId;
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleProtocol = builder.ruleProtocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallTemplateRule create() {
            return builder().build();
        }

        /**
         * @return firewallTemplateRuleId
         */
        public String getFirewallTemplateRuleId() {
            return this.firewallTemplateRuleId;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return ruleProtocol
         */
        public String getRuleProtocol() {
            return this.ruleProtocol;
        }

        /**
         * @return sourceCidrIp
         */
        public String getSourceCidrIp() {
            return this.sourceCidrIp;
        }

        public static final class Builder {
            private String firewallTemplateRuleId; 
            private String port; 
            private String remark; 
            private String ruleProtocol; 
            private String sourceCidrIp; 

            /**
             * <p>The ID of the firewall rule.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eeea34d9867b4d55a4ff8d5fcfbd****</p>
             */
            public Builder firewallTemplateRuleId(String firewallTemplateRuleId) {
                this.firewallTemplateRuleId = firewallTemplateRuleId;
                return this;
            }

            /**
             * <p>The port range. Valid values: 1 to 65535. Specify a port range in the format of &lt;start port number&gt;/&lt;end port number&gt;. Example: <code>1024/1055</code>, which indicates that the port range of 1024 to 1055.</p>
             * <blockquote>
             * <p> If you set RuleProtocol to ICMP, you must set Port to -1/-1.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The remarks of the firewall template rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * <p>The transport layer protocol that the rule supports. Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>UDP</li>
             * <li>TCP+UDP</li>
             * <li>ICMP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder ruleProtocol(String ruleProtocol) {
                this.ruleProtocol = ruleProtocol;
                return this;
            }

            /**
             * <p>The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0.0.0/0</p>
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public FirewallTemplateRule build() {
                return new FirewallTemplateRule(this);
            } 

        } 

    }
}
