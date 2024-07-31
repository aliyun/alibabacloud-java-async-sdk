// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFirewallTemplateRulesResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFirewallTemplateRulesResponseBody</p>
 */
public class CreateFirewallTemplateRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FirewallTemplateRules")
    private java.util.List < FirewallTemplateRules> firewallTemplateRules;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFirewallTemplateRulesResponseBody(Builder builder) {
        this.firewallTemplateRules = builder.firewallTemplateRules;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallTemplateRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return firewallTemplateRules
     */
    public java.util.List < FirewallTemplateRules> getFirewallTemplateRules() {
        return this.firewallTemplateRules;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < FirewallTemplateRules> firewallTemplateRules; 
        private String requestId; 

        /**
         * The firewall template rules.
         */
        public Builder firewallTemplateRules(java.util.List < FirewallTemplateRules> firewallTemplateRules) {
            this.firewallTemplateRules = firewallTemplateRules;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFirewallTemplateRulesResponseBody build() {
            return new CreateFirewallTemplateRulesResponseBody(this);
        } 

    } 

    public static class FirewallTemplateRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirewallTemplateRuleId")
        private String firewallTemplateRuleId;

        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleProtocol")
        private String ruleProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private FirewallTemplateRules(Builder builder) {
            this.firewallTemplateRuleId = builder.firewallTemplateRuleId;
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleProtocol = builder.ruleProtocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallTemplateRules create() {
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
             * The ID of the firewall template rule.
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
             * *   ICMP: the ICMP protocol
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

            public FirewallTemplateRules build() {
                return new FirewallTemplateRules(this);
            } 

        } 

    }
}
