// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFileProtectRuleRequest} extends {@link RequestModel}
 *
 * <p>ListFileProtectRuleRequest</p>
 */
public class ListFileProtectRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlertLevel")
    private Integer alertLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    private ListFileProtectRuleRequest(Builder builder) {
        super(builder);
        this.alertLevel = builder.alertLevel;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.ruleAction = builder.ruleAction;
        this.ruleName = builder.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFileProtectRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertLevel
     */
    public Integer getAlertLevel() {
        return this.alertLevel;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    public static final class Builder extends Request.Builder<ListFileProtectRuleRequest, Builder> {
        private Integer alertLevel; 
        private Integer currentPage; 
        private Integer pageSize; 
        private String ruleAction; 
        private String ruleName; 

        private Builder() {
            super();
        } 

        private Builder(ListFileProtectRuleRequest request) {
            super(request);
            this.alertLevel = request.alertLevel;
            this.currentPage = request.currentPage;
            this.pageSize = request.pageSize;
            this.ruleAction = request.ruleAction;
            this.ruleName = request.ruleName;
        } 

        /**
         * The severity of alerts. Valid values:
         * <p>
         * 
         * *   0: does not generate alerts
         * *   1: sends notifications
         * *   2: suspicious
         * *   3: high-risk
         */
        public Builder alertLevel(Integer alertLevel) {
            this.putQueryParameter("AlertLevel", alertLevel);
            this.alertLevel = alertLevel;
            return this;
        }

        /**
         * The page number.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The handling method of the rule. Valid values:
         * <p>
         * 
         * *   pass: allow
         * *   alert
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        @Override
        public ListFileProtectRuleRequest build() {
            return new ListFileProtectRuleRequest(this);
        } 

    } 

}
