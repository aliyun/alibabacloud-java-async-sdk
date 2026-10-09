// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyIpsRulesToDefaultRequest} extends {@link RequestModel}
 *
 * <p>ModifyIpsRulesToDefaultRequest</p>
 */
public class ModifyIpsRulesToDefaultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AttackApp")
    private String attackApp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirewallType")
    private String firewallType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    private String rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private ModifyIpsRulesToDefaultRequest(Builder builder) {
        super(builder);
        this.attackApp = builder.attackApp;
        this.firewallType = builder.firewallType;
        this.lang = builder.lang;
        this.ruleType = builder.ruleType;
        this.rules = builder.rules;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIpsRulesToDefaultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attackApp
     */
    public String getAttackApp() {
        return this.attackApp;
    }

    /**
     * @return firewallType
     */
    public String getFirewallType() {
        return this.firewallType;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<ModifyIpsRulesToDefaultRequest, Builder> {
        private String attackApp; 
        private String firewallType; 
        private String lang; 
        private String ruleType; 
        private String rules; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIpsRulesToDefaultRequest request) {
            super(request);
            this.attackApp = request.attackApp;
            this.firewallType = request.firewallType;
            this.lang = request.lang;
            this.ruleType = request.ruleType;
            this.rules = request.rules;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The attack application.</p>
         * 
         * <strong>example:</strong>
         * <p>PHP</p>
         */
        public Builder attackApp(String attackApp) {
            this.putQueryParameter("AttackApp", attackApp);
            this.attackApp = attackApp;
            return this;
        }

        /**
         * <p>The type of the cloud firewall. Valid values:</p>
         * <ul>
         * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewalls.</li>
         * <li><strong>InternetFirewall</strong> (default): the Internet border firewall.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InternetFirewall</p>
         */
        public Builder firewallType(String firewallType) {
            this.putQueryParameter("FirewallType", firewallType);
            this.firewallType = firewallType;
            return this;
        }

        /**
         * <p>The language of the content. Valid values:</p>
         * <ul>
         * <li><p><strong>zh</strong> (default): Chinese.</p>
         * </li>
         * <li><p><strong>en</strong>: English.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li><strong>basicRule</strong></li>
         * <li><strong>customize</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customize</p>
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The rule list. Conditional requirement: when RuleType is set to customize, you must specify at least one of this parameter or AttackApp. If you specify only RuleType without Rules or AttackApp, the API returns ErrorParameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *   &quot;uuid_1&quot;,
         *   &quot;uuid_2&quot;
         * ]</p>
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>140.205.118.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public ModifyIpsRulesToDefaultRequest build() {
            return new ModifyIpsRulesToDefaultRequest(this);
        } 

    } 

}
