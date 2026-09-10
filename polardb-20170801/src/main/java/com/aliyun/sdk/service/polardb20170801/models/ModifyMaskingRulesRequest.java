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
 * {@link ModifyMaskingRulesRequest} extends {@link RequestModel}
 *
 * <p>ModifyMaskingRulesRequest</p>
 */
public class ModifyMaskingRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultAlgo")
    private String defaultAlgo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterfaceVersion")
    private String interfaceVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaskingAlgo")
    private String maskingAlgo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    @com.aliyun.core.annotation.Validation(maxLength = 8192)
    private String ruleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(maxLength = 8192)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleNameList")
    private String ruleNameList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleVersion")
    private String ruleVersion;

    private ModifyMaskingRulesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.defaultAlgo = builder.defaultAlgo;
        this.enable = builder.enable;
        this.interfaceVersion = builder.interfaceVersion;
        this.maskingAlgo = builder.maskingAlgo;
        this.ruleConfig = builder.ruleConfig;
        this.ruleName = builder.ruleName;
        this.ruleNameList = builder.ruleNameList;
        this.ruleVersion = builder.ruleVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyMaskingRulesRequest create() {
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
     * @return defaultAlgo
     */
    public String getDefaultAlgo() {
        return this.defaultAlgo;
    }

    /**
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return interfaceVersion
     */
    public String getInterfaceVersion() {
        return this.interfaceVersion;
    }

    /**
     * @return maskingAlgo
     */
    public String getMaskingAlgo() {
        return this.maskingAlgo;
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

    /**
     * @return ruleNameList
     */
    public String getRuleNameList() {
        return this.ruleNameList;
    }

    /**
     * @return ruleVersion
     */
    public String getRuleVersion() {
        return this.ruleVersion;
    }

    public static final class Builder extends Request.Builder<ModifyMaskingRulesRequest, Builder> {
        private String DBClusterId; 
        private String defaultAlgo; 
        private String enable; 
        private String interfaceVersion; 
        private String maskingAlgo; 
        private String ruleConfig; 
        private String ruleName; 
        private String ruleNameList; 
        private String ruleVersion; 

        private Builder() {
            super();
        } 

        private Builder(ModifyMaskingRulesRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.defaultAlgo = request.defaultAlgo;
            this.enable = request.enable;
            this.interfaceVersion = request.interfaceVersion;
            this.maskingAlgo = request.maskingAlgo;
            this.ruleConfig = request.ruleConfig;
            this.ruleName = request.ruleName;
            this.ruleNameList = request.ruleNameList;
            this.ruleVersion = request.ruleVersion;
        } 

        /**
         * <p>The cluster ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of all clusters in your account, including cluster IDs.</p>
         * </blockquote>
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
         * <p>The default algorithm.</p>
         * <blockquote>
         * <p>You must specify either MaskingAlgo or DefaultAIgo.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aes-128-gcm</p>
         */
        public Builder defaultAlgo(String defaultAlgo) {
            this.putQueryParameter("DefaultAlgo", defaultAlgo);
            this.defaultAlgo = defaultAlgo;
            return this;
        }

        /**
         * <p>Enables or disables the specified data masking rules. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the specified rules.</p>
         * </li>
         * <li><p><strong>false</strong>: disables the specified rules.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only when the <code>RuleNameList</code> parameter is specified.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The type of rule to modify. Valid values:</p>
         * <p>v1: Modifies a data masking rule.
         * v2: Modifies an encryption rule.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder interfaceVersion(String interfaceVersion) {
            this.putQueryParameter("InterfaceVersion", interfaceVersion);
            this.interfaceVersion = interfaceVersion;
            return this;
        }

        /**
         * <p>The masking algorithm. Specify one or more algorithms and their parameters. Format: <code>[{ &quot;name&quot;: &quot;algorithm_name&quot;, &quot;params&quot;: {&quot;key&quot;: &quot;value&quot;} }]</code></p>
         * 
         * <strong>example:</strong>
         * <p>[{
         * &quot;name&quot;: &quot;aes-128-gcm&quot;
         * }]</p>
         */
        public Builder maskingAlgo(String maskingAlgo) {
            this.putQueryParameter("MaskingAlgo", maskingAlgo);
            this.maskingAlgo = maskingAlgo;
            return this;
        }

        /**
         * <p>A JSON string that specifies the rule configuration. Example: <code>{&quot;auto&quot;: {&quot;databases&quot;: [&quot;db1&quot;], &quot;tables&quot;: [&quot;tb1&quot;], &quot;columns&quot;: [&quot;c1,c2&quot;] }, &quot;description&quot;: &quot;This rule will be applied to the columns c1 and c2 in table t1&quot;, &quot;enabled&quot;: true, &quot;applies_to&quot;: [&quot;user&quot;]}</code>. The JSON string includes the following fields:</p>
         * <ul>
         * <li><p><code>&quot;auto&quot;</code>: Required. The object that contains the configuration for the dynamic data masking algorithm.</p>
         * </li>
         * <li><p><code>&quot;databases&quot;</code>: Optional. The databases to which the rule applies. Separate multiple database names with a comma (,). If this parameter is omitted, the rule applies to all databases in the cluster.</p>
         * </li>
         * <li><p><code>&quot;tables&quot;</code>: Optional. The tables to which the rule applies. Separate multiple table names with a comma (,). If this parameter is omitted, the rule applies to all tables in the cluster.</p>
         * </li>
         * <li><p><code>&quot;columns&quot;</code>: Required. The columns to which the rule applies. Separate multiple column names with a comma (,).</p>
         * </li>
         * <li><p><code>&quot;description&quot;</code>: Optional. The rule description, up to 64 characters in length.</p>
         * </li>
         * <li><p><code>&quot;enabled&quot;</code>: Required. Specifies whether the data masking rule is enabled. Valid values: <strong>true</strong> (enabled) and <strong>false</strong> (disabled).</p>
         * </li>
         * <li><p><code>&quot;applies_to&quot;</code>: The database accounts to which the rule applies. Separate multiple account names with a comma (,).</p>
         * </li>
         * <li><p><code>&quot;exempted&quot;</code>: The database accounts that are exempt from the rule. Separate multiple account names with a comma (,).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>If you specify the <code>RuleName</code> parameter, you must also specify the <code>RuleConfig</code> parameter.</p>
         * </li>
         * <li><p>You must specify either <code>&quot;applies_to&quot;</code> or <code>&quot;exempted&quot;</code>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;auto&quot;: {&quot;databases&quot;: [&quot;db1&quot;], &quot;tables&quot;: [&quot;tb1&quot;], &quot;columns&quot;: [&quot;c1,c2&quot;] }, &quot;description&quot;: &quot;This rule will be applied to the columns c1 and c2 in table t1&quot;, &quot;enabled&quot;: true, &quot;applies_to&quot;: [&quot;user&quot;]}</p>
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putQueryParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * <p>The name of the data masking rule. You can specify only one rule name at a time.</p>
         * <blockquote>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeMaskingRules</a> operation to query the details of all data masking rules in the target cluster, including rule names.</p>
         * </li>
         * <li><p>If a rule with the specified name does not exist, the system creates a new one based on the provided <code>RuleConfig</code>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>A comma-separated list of data masking rule names.</p>
         * <blockquote>
         * <p>You must specify either the <code>RuleName</code> or <code>RuleNameList</code> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleNameList(String ruleNameList) {
            this.putQueryParameter("RuleNameList", ruleNameList);
            this.ruleNameList = ruleNameList;
            return this;
        }

        /**
         * <p>The version of the data masking rule. Valid values:</p>
         * <ul>
         * <li><p>v1 (default)</p>
         * </li>
         * <li><p>v2</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder ruleVersion(String ruleVersion) {
            this.putQueryParameter("RuleVersion", ruleVersion);
            this.ruleVersion = ruleVersion;
            return this;
        }

        @Override
        public ModifyMaskingRulesRequest build() {
            return new ModifyMaskingRulesRequest(this);
        } 

    } 

}
