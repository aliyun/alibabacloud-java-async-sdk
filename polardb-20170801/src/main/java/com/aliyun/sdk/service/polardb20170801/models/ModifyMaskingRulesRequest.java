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
    @com.aliyun.core.annotation.NameInMap("Enable")
    private String enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterfaceVersion")
    private String interfaceVersion;

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
        this.enable = builder.enable;
        this.interfaceVersion = builder.interfaceVersion;
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
        private String enable; 
        private String interfaceVersion; 
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
            this.enable = request.enable;
            this.interfaceVersion = request.interfaceVersion;
            this.ruleConfig = request.ruleConfig;
            this.ruleName = request.ruleName;
            this.ruleNameList = request.ruleNameList;
            this.ruleVersion = request.ruleVersion;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.</p>
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
         * <p>Specifies whether to enable the specified masking rule. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when the <code>RuleNameList</code> parameter is specfied.</p>
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
         * InterfaceVersion.
         */
        public Builder interfaceVersion(String interfaceVersion) {
            this.putQueryParameter("InterfaceVersion", interfaceVersion);
            this.interfaceVersion = interfaceVersion;
            return this;
        }

        /**
         * <p>The parameter that is used to specify the masking rule that you want to modify and the value in the JSON format. All parameter values are of the string type. Example: <code>{&quot;auto&quot;: {&quot;databases&quot;: [&quot;db1&quot;], &quot;tables&quot;: [&quot;tb1&quot;], &quot;columns&quot;: [&quot;c1,c2&quot;] }, &quot;description&quot;: &quot;This rule will be applied to the columns c1 and c2 in table t1&quot;, &quot;enabled&quot;: true, &quot;applies_to&quot;: [&quot;user&quot;]}</code>. Where,</p>
         * <ul>
         * <li><code>&quot;auto&quot;</code>: specifies that the dynamic masking algorithm is supported. This parameter is required.</li>
         * <li><code>&quot;databases&quot;</code>: Optional. The names of databases to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the masking rule applies to all databases in the cluster.</li>
         * <li><code>&quot;tables&quot;</code>: Optional. The names of tables to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all tables in the cluster.</li>
         * <li><code>&quot;columns&quot;</code>: Required. The names of fields to which the masking rule is applied. Separate the names with commas (,).</li>
         * <li><code>&quot;description&quot;</code>: Optional. The description of the masking rule. The description is up to 64 characters in length.</li>
         * <li><code>&quot;enabled&quot;</code>: Required. Specifies whether to enable the masking rule. Valid values: <strong>true</strong> (enable) and <strong>false</strong> (disable).</li>
         * <li><code>&quot;applies_to&quot;</code>: The names of database accounts to which the masking rule is applied. Separate the names with commas (,).</li>
         * <li><code>&quot;exempted&quot;</code>: The names of database accounts to which the masking rule is not applied. Separate the names with commas (,).</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you specify <code>RuleName</code>, <code>RuleConfig</code> parameter is required.</p>
         * </li>
         * <li><p>You need to select either <code>&quot;applies_to&quot;</code> or <code>&quot;exempted&quot;</code>.</p>
         * </li>
         * </ul>
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
         * </blockquote>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/212573.html">DescribeMaskingRules</a> operation to query the details of all masking rules for a specified cluster, such as the names of the masking rules.</p>
         * </li>
         * <li><p>If the rule name does not exist in the cluster, the system automatically creates a masking rule based on the name and the value of <code>RuleConfig</code>.</p>
         * </li>
         * </ul>
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
         * <p>The list of masking rule names. You can specify one or more masking rules at a time. Separate the masking rule names with commas (,).</p>
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
         * <p>The version of the masking rule. Default value: v1. Valid values:</p>
         * <ul>
         * <li>v1</li>
         * <li>v2</li>
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
