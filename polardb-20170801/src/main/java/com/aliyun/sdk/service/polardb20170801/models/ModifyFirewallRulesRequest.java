// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyFirewallRulesRequest} extends {@link RequestModel}
 *
 * <p>ModifyFirewallRulesRequest</p>
 */
public class ModifyFirewallRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    private ModifyFirewallRulesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.ruleConfig = builder.ruleConfig;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFirewallRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return ruleConfig
     */
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<ModifyFirewallRulesRequest, Builder> {
        private String DBClusterId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String ruleConfig; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFirewallRulesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.ruleConfig = request.ruleConfig;
            this.ruleName = request.ruleName;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>A JSON string that contains the configuration parameters of the firewall rule to modify and their values. The parameter values are strings. Example: <code>{ &quot;id&quot;: &quot;test&quot;, &quot;enabled&quot;: &quot;true&quot;, &quot;mode&quot;: &quot;Defending&quot;, &quot;users&quot;: { &quot;applies_to&quot;: [] }, &quot;endpoint&quot;: &quot;[{&quot;EndpointName&quot;:&quot;pe-***************&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Endpoint&quot;},{&quot;EndpointName&quot;:&quot;pe-***************&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-***************&quot;},{&quot;EndpointName&quot;:&quot;pe-***************&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-***************&quot;}]&quot;, &quot;type&quot;: &quot;BlackList&quot;, &quot;sub_rules&quot;: [] }, &quot;RuleName&quot;: &quot;test&quot; }</code>. The parameters are described as follows:</p>
         * <ul>
         * <li><p><code>&quot;id&quot;</code>: Required. The name of the firewall rule.</p>
         * </li>
         * <li><p><code>&quot;databases&quot;</code>: Optional. The names of the databases to which the rule applies. You can specify multiple database names. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all databases in the cluster.</p>
         * </li>
         * <li><p><code>&quot;tables&quot;</code>: Optional. The names of the tables to which the rule applies. You can specify multiple table names. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all tables in the cluster.</p>
         * </li>
         * <li><p><code>&quot;columns&quot;</code>: Required. The names of the fields to which the rule applies. You can specify multiple field names. Separate the names with commas (,).</p>
         * </li>
         * <li><p><code>&quot;description&quot;</code>: Optional. The description of the data masking rule. The description can be up to 64 characters in length.</p>
         * </li>
         * <li><p><code>&quot;enabled&quot;</code>: Required. Specifies whether to enable or disable the data masking rule. Valid values: <strong>true</strong> (enable) and <strong>false</strong> (disable).</p>
         * </li>
         * <li><p><code>&quot;applies_to&quot;</code>: The names of the database accounts to which the rule applies. You can specify multiple database account names. Separate the names with commas (,).</p>
         * </li>
         * <li><p><code>&quot;exempted&quot;</code>: The names of the database accounts to which the rule does not apply. You can specify multiple database account names. Separate the names with commas (,).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If you specify the <code>RuleName</code> parameter, the <code>RuleConfig</code> parameter is required.</p>
         * </li>
         * <li><p>You must specify either <code>&quot;applies_to&quot;</code> or <code>&quot;exempted&quot;</code>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;id&quot;:&quot;test&quot;,&quot;enabled&quot;:&quot;true&quot;,&quot;mode&quot;:&quot;Collecting&quot;,&quot;users&quot;:{&quot;applies_to&quot;:[]},&quot;endpoint&quot;:&quot;[{&quot;EndpointName&quot;:&quot;pe-<strong><strong><strong><strong><strong><strong>&quot;,&quot;EndpointType&quot;:&quot;Cluster&quot;,&quot;DBEndpointDescription&quot;:&quot;Cluster Address&quot;},{&quot;EndpointName&quot;:&quot;pe-</strong></strong></strong></strong></strong></strong>&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-<strong><strong><strong><strong><strong><strong>&quot;},{&quot;EndpointName&quot;:&quot;pe-</strong></strong></strong></strong></strong></strong>&quot;,&quot;EndpointType&quot;:&quot;Custom&quot;,&quot;DBEndpointDescription&quot;:&quot;pc-************K&quot;}]&quot;,&quot;type&quot;:&quot;WhiteList&quot;}</p>
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putQueryParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>The name of the firewall rule. You can specify only one rule name at a time.</p>
         * <blockquote>
         * <ul>
         * <li><p>Call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeFirewallRules</a> operation to query the details of all firewall rules for the target cluster, including the rule names.</p>
         * </li>
         * <li><p>If the specified rule name does not exist in the current cluster, the system automatically creates a new firewall rule based on the rule name and the value of <code>RuleConfig</code>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public ModifyFirewallRulesRequest build() {
            return new ModifyFirewallRulesRequest(this);
        } 

    } 

}
