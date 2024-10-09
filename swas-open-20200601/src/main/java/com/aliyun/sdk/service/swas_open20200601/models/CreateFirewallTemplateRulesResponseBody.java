// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The firewall template rules.</p>
         */
        public Builder firewallTemplateRules(java.util.List < FirewallTemplateRules> firewallTemplateRules) {
            this.firewallTemplateRules = firewallTemplateRules;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFirewallTemplateRulesResponseBody build() {
            return new CreateFirewallTemplateRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateFirewallTemplateRulesResponseBody} extends {@link TeaModel}
     *
     * <p>CreateFirewallTemplateRulesResponseBody</p>
     */
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
             * <p>The ID of the firewall template rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ft-bcf1a7hrdq717****</p>
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
             * <p>The remarks of the firewall rule.</p>
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
             * <li>ICMP: the ICMP protocol</li>
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
             * <p>171.233.XX.XX</p>
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
