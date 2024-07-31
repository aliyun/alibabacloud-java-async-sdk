// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFirewallTemplateRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateFirewallTemplateRulesRequest</p>
 */
public class CreateFirewallTemplateRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < FirewallRule> firewallRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firewallTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateFirewallTemplateRulesRequest(Builder builder) {
        super(builder);
        this.firewallRule = builder.firewallRule;
        this.firewallTemplateId = builder.firewallTemplateId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallTemplateRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firewallRule
     */
    public java.util.List < FirewallRule> getFirewallRule() {
        return this.firewallRule;
    }

    /**
     * @return firewallTemplateId
     */
    public String getFirewallTemplateId() {
        return this.firewallTemplateId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateFirewallTemplateRulesRequest, Builder> {
        private java.util.List < FirewallRule> firewallRule; 
        private String firewallTemplateId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFirewallTemplateRulesRequest request) {
            super(request);
            this.firewallRule = request.firewallRule;
            this.firewallTemplateId = request.firewallTemplateId;
            this.regionId = request.regionId;
        } 

        /**
         * The details of the firewall rule.
         */
        public Builder firewallRule(java.util.List < FirewallRule> firewallRule) {
            this.putQueryParameter("FirewallRule", firewallRule);
            this.firewallRule = firewallRule;
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
         * The region ID of the simple application server to which the firewall template is applied. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateFirewallTemplateRulesRequest build() {
            return new CreateFirewallTemplateRulesRequest(this);
        } 

    } 

    public static class FirewallRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        @com.aliyun.core.annotation.Validation(required = true)
        private String port;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleProtocol")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ruleProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceCidrIp;

        private FirewallRule(Builder builder) {
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleProtocol = builder.ruleProtocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallRule create() {
            return builder().build();
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
            private String port; 
            private String remark; 
            private String ruleProtocol; 
            private String sourceCidrIp; 

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
             * The remarks of the firewall rule.
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

            public FirewallRule build() {
                return new FirewallRule(this);
            } 

        } 

    }
}
