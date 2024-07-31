// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFirewallRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateFirewallRulesRequest</p>
 */
public class CreateFirewallRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallRules")
    private java.util.List < FirewallRules> firewallRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

    private CreateFirewallRulesRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.firewallRules = builder.firewallRules;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallRulesRequest create() {
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
     * @return firewallRules
     */
    public java.util.List < FirewallRules> getFirewallRules() {
        return this.firewallRules;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateFirewallRulesRequest, Builder> {
        private String clientToken; 
        private java.util.List < FirewallRules> firewallRules; 
        private String instanceId; 
        private String regionId; 
        private java.util.List < Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateFirewallRulesRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.firewallRules = request.firewallRules;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.tag = request.tag;
        } 

        /**
         * The client token.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Details about the firewall rules.
         */
        public Builder firewallRules(java.util.List < FirewallRules> firewallRules) {
            String firewallRulesShrink = shrink(firewallRules, "FirewallRules", "json");
            this.putQueryParameter("FirewallRules", firewallRulesShrink);
            this.firewallRules = firewallRules;
            return this;
        }

        /**
         * The ID of the simple application server.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * The tags that you want to add to the firewall. You can specify up to 20 tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateFirewallRulesRequest build() {
            return new CreateFirewallRulesRequest(this);
        } 

    } 

    public static class FirewallRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("RuleProtocol")
        private String ruleProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceCidrIp")
        private String sourceCidrIp;

        private FirewallRules(Builder builder) {
            this.port = builder.port;
            this.remark = builder.remark;
            this.ruleProtocol = builder.ruleProtocol;
            this.sourceCidrIp = builder.sourceCidrIp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FirewallRules create() {
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
             * The port number.
             * <p>
             * 
             * *   When the transport layer protocol is TCP and/or UDP, the port number range is 1 to 65535. Specify a port range in the format of \<Start port number>/\<End port number>. Example: 1/200.
             * *   When the transport layer protocol is ICMP, the port number range is -1/-1, which indicates all ports.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * The description of the firewall rule.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The transport layer protocol. Valid values:
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
             * The IP address or CIDR block that is allowed in the firewall rule.
             */
            public Builder sourceCidrIp(String sourceCidrIp) {
                this.sourceCidrIp = sourceCidrIp;
                return this;
            }

            public FirewallRules build() {
                return new FirewallRules(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag key cannot be an empty string. The tag key can be up to 64 characters in length and cannot contain http:// or https://. The tag key cannot start with acs: or aliyun.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value. Valid values of N: 1 to 20.
             * <p>
             * 
             * The tag value can be an empty string. The tag value can be up to 64 characters in length and cannot contain http:// or https://.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
