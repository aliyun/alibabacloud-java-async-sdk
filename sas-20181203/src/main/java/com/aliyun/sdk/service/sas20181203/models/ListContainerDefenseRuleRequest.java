// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListContainerDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>ListContainerDefenseRuleRequest</p>
 */
public class ListContainerDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List<Conditions> conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDefaultRule")
    private Integer isDefaultRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    private Integer ruleType;

    private ListContainerDefenseRuleRequest(Builder builder) {
        super(builder);
        this.conditions = builder.conditions;
        this.currentPage = builder.currentPage;
        this.isDefaultRule = builder.isDefaultRule;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.ruleType = builder.ruleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListContainerDefenseRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conditions
     */
    public java.util.List<Conditions> getConditions() {
        return this.conditions;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return isDefaultRule
     */
    public Integer getIsDefaultRule() {
        return this.isDefaultRule;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    public static final class Builder extends Request.Builder<ListContainerDefenseRuleRequest, Builder> {
        private java.util.List<Conditions> conditions; 
        private Integer currentPage; 
        private Integer isDefaultRule; 
        private String lang; 
        private Integer pageSize; 
        private Integer ruleType; 

        private Builder() {
            super();
        } 

        private Builder(ListContainerDefenseRuleRequest request) {
            super(request);
            this.conditions = request.conditions;
            this.currentPage = request.currentPage;
            this.isDefaultRule = request.isDefaultRule;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.ruleType = request.ruleType;
        } 

        /**
         * <p>The details of the condition.</p>
         */
        public Builder conditions(java.util.List<Conditions> conditions) {
            this.putQueryParameter("Conditions", conditions);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>Specifies whether to query system rules.</p>
         * <blockquote>
         * <p> This parameter is deprecated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isDefaultRule(Integer isDefaultRule) {
            this.putQueryParameter("IsDefaultRule", isDefaultRule);
            this.isDefaultRule = isDefaultRule;
            return this;
        }

        /**
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p> We recommend that you do not leave this parameter empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The rule type. Valid values:</p>
         * <ul>
         * <li>1: system rule</li>
         * <li>2: user-defined rule</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        @Override
        public ListContainerDefenseRuleRequest build() {
            return new ListContainerDefenseRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListContainerDefenseRuleRequest} extends {@link TeaModel}
     *
     * <p>ListContainerDefenseRuleRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * <p>The condition type. Valid values:</p>
             * <ul>
             * <li><strong>ruleName</strong>: the rule name</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ruleName</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The rule content.</p>
             * 
             * <strong>example:</strong>
             * <p>auto-test-rule-**</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
}
