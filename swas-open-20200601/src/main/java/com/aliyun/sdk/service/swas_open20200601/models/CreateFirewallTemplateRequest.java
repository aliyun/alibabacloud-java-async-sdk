// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateFirewallTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateFirewallTemplateRequest</p>
 */
public class CreateFirewallTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallRule")
    private java.util.List < FirewallRule> firewallRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateFirewallTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.firewallRule = builder.firewallRule;
        this.name = builder.name;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFirewallTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return firewallRule
     */
    public java.util.List < FirewallRule> getFirewallRule() {
        return this.firewallRule;
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

    public static final class Builder extends Request.Builder<CreateFirewallTemplateRequest, Builder> {
        private String description; 
        private java.util.List < FirewallRule> firewallRule; 
        private String name; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateFirewallTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.firewallRule = request.firewallRule;
            this.name = request.name;
            this.regionId = request.regionId;
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
         * <p>The details of the firewall rule.</p>
         */
        public Builder firewallRule(java.util.List < FirewallRule> firewallRule) {
            this.putQueryParameter("FirewallRule", firewallRule);
            this.firewallRule = firewallRule;
            return this;
        }

        /**
         * <p>The name of the firewall template.</p>
         * <p>This parameter is required.</p>
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
         * <p>The region ID of the simple application server to which the firewall template belongs. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
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
        public CreateFirewallTemplateRequest build() {
            return new CreateFirewallTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFirewallTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateFirewallTemplateRequest</p>
     */
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
             * <p>The port range. Valid values: 1 to 65535. Specify a port range in the format of &lt;start port number&gt;/&lt;end port number&gt;. Example: <code>1024/1055</code>, which indicates that the port range of 1024 to 1055.</p>
             * <blockquote>
             * <p> If you set RuleProtocol to ICMP, you must set Port to -1/-1.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>223.166.XX.XX</p>
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
