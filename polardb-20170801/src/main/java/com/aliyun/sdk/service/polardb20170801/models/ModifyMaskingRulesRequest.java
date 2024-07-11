// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    @com.aliyun.core.annotation.NameInMap("RuleConfig")
    private String ruleConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
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
            this.ruleConfig = request.ruleConfig;
            this.ruleName = request.ruleName;
            this.ruleNameList = request.ruleNameList;
            this.ruleVersion = request.ruleVersion;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * > You can call the [DescribeDBClusters](~~98094~~) operation to query the details of the clusters that belong to your Alibaba Cloud account, such as cluster IDs.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Specifies whether to enable the specified masking rule. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         * 
         * > This parameter is valid only when the `RuleNameList` parameter is specfied.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The parameter that is used to specify the masking rule that you want to modify and the value in the JSON format. All parameter values are of the string type. Example: `{"auto": {"databases": ["db1"], "tables": ["tb1"], "columns": ["c1,c2"] }, "description": "This rule will be applied to the columns c1 and c2 in table t1", "enabled": true, "applies_to": ["user"]}`. Parameters in the function:
         * <p>
         * 
         * *   `"auto"`: specifies that the dynamic masking algorithm is supported. This parameter is required.
         * *   `"databases"`: Optional. The names of databases to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the masking rule applies to all databases in the cluster.
         * *   `"tables"`: Optional. The names of tables to which the masking rule is applied. Separate the names with commas (,). If you leave this parameter empty, the rule applies to all tables in the cluster.
         * *   `"columns"`: Required. The names of fields to which the masking rule is applied. Separate the names with commas (,).
         * *   `"description"`: Optional. The description of the masking rule. The description can be up to 64 characters in length.
         * *   `"enabled"`: Required. Specifies whether to enable the masking rule. Valid values: **true** and **false**.
         * *   `"applies_to"`: The names of database accounts to which the masking rule is applied. Separate the names with commas (,).
         * *   `"exempted"`: The names of database accounts to which the masking rule is not applied. Separate the names with commas (,).
         * 
         * >- If you specify `RuleName`, `RuleConfig` parameter is required. 
         * >- You need to select either `"applies_to"` or `"exempted"`.
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putQueryParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * The name of the data masking rule. You can specify only one rule name at a time.
         * <p>
         * 
         * >- You can call the [DescribeMaskingRules](~~212573~~) operation to query the details of all masking rules for a specified cluster, such as the names of the masking rules.
         * >- If the rule name does not exist in the cluster, the system automatically creates a masking rule based on the name and the value of `RuleConfig`.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The list of masking rule names. You can specify one or more masking rules at a time. Separate the masking rule names with commas (,).
         * <p>
         * 
         * > You must specify either the `RuleName` or `RuleNameList` parameter.
         */
        public Builder ruleNameList(String ruleNameList) {
            this.putQueryParameter("RuleNameList", ruleNameList);
            this.ruleNameList = ruleNameList;
            return this;
        }

        /**
         * The version of the masking rule. Default value: v1. Valid values:
         * <p>
         * 
         * *   v1
         * *   v2
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
