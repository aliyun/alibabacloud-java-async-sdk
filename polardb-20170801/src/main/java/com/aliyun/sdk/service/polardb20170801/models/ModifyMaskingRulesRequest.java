// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMaskingRulesRequest} extends {@link RequestModel}
 *
 * <p>ModifyMaskingRulesRequest</p>
 */
public class ModifyMaskingRulesRequest extends Request {
    @Query
    @NameInMap("DBClusterId")
    @Validation(required = true)
    private String DBClusterId;

    @Query
    @NameInMap("Enable")
    private String enable;

    @Query
    @NameInMap("RuleConfig")
    private String ruleConfig;

    @Query
    @NameInMap("RuleName")
    private String ruleName;

    @Query
    @NameInMap("RuleNameList")
    private String ruleNameList;

    private ModifyMaskingRulesRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.enable = builder.enable;
        this.ruleConfig = builder.ruleConfig;
        this.ruleName = builder.ruleName;
        this.ruleNameList = builder.ruleNameList;
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

    public static final class Builder extends Request.Builder<ModifyMaskingRulesRequest, Builder> {
        private String DBClusterId; 
        private String enable; 
        private String ruleConfig; 
        private String ruleName; 
        private String ruleNameList; 

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
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * RuleConfig.
         */
        public Builder ruleConfig(String ruleConfig) {
            this.putQueryParameter("RuleConfig", ruleConfig);
            this.ruleConfig = ruleConfig;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleNameList.
         */
        public Builder ruleNameList(String ruleNameList) {
            this.putQueryParameter("RuleNameList", ruleNameList);
            this.ruleNameList = ruleNameList;
            return this;
        }

        @Override
        public ModifyMaskingRulesRequest build() {
            return new ModifyMaskingRulesRequest(this);
        } 

    } 

}
