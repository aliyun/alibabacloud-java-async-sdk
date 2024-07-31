// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

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
        this.instanceId = builder.instanceId;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String instanceId; 
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
            this.instanceId = request.instanceId;
            this.name = request.name;
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
         * The description of the firewall template.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The firewall rule in the template.
         */
        public Builder firewallTemplateRule(java.util.List < FirewallTemplateRule> firewallTemplateRule) {
            this.putQueryParameter("FirewallTemplateRule", firewallTemplateRule);
            this.firewallTemplateRule = firewallTemplateRule;
            return this;
        }

        /**
         * The ID of the simple application server to which the firewall template is applied.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the firewall template.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
        public ModifyFirewallTemplateRequest build() {
            return new ModifyFirewallTemplateRequest(this);
        } 

    } 

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
             * The ID of the firewall rule.
             */
            public Builder firewallTemplateRuleId(String firewallTemplateRuleId) {
                this.firewallTemplateRuleId = firewallTemplateRuleId;
                return this;
            }

            /**
             * The port range. Valid values: 1 to 65535. Specify a port range in the format of \<start port number>/\<end port number>. Example: `1024/1055`, which indicates that the port range of 1024 to 1055.
             * <p>
             * 
             * >  If you set RuleProtocol to ICMP, you must set Port to -1/-1.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The remarks of the firewall template rule.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The transport layer protocol that the rule supports. Valid values:
             * <p>
             * 
             * *   TCP
             * *   UDP
             * *   TCP+UDP
             * *   ICMP
             */
            public Builder ruleProtocol(String ruleProtocol) {
                this.ruleProtocol = ruleProtocol;
                return this;
            }

            /**
             * The source address to which you want to grant access permissions. CIDR blocks and IPv4 addresses are supported.
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
