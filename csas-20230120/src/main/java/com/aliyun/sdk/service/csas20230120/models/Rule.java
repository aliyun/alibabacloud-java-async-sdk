// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link Rule} extends {@link TeaModel}
 *
 * <p>Rule</p>
 */
public class Rule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Combinator")
    private String combinator;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("RuleSubType")
    private String ruleSubType;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<Rule> rules;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List<String> values;

    private Rule(Builder builder) {
        this.combinator = builder.combinator;
        this.id = builder.id;
        this.name = builder.name;
        this.operator = builder.operator;
        this.ruleSubType = builder.ruleSubType;
        this.ruleType = builder.ruleType;
        this.rules = builder.rules;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Rule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return combinator
     */
    public String getCombinator() {
        return this.combinator;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return ruleSubType
     */
    public String getRuleSubType() {
        return this.ruleSubType;
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
    public java.util.List<Rule> getRules() {
        return this.rules;
    }

    /**
     * @return values
     */
    public java.util.List<String> getValues() {
        return this.values;
    }

    public static final class Builder {
        private String combinator; 
        private String id; 
        private String name; 
        private String operator; 
        private String ruleSubType; 
        private String ruleType; 
        private java.util.List<Rule> rules; 
        private java.util.List<String> values; 

        private Builder() {
        } 

        private Builder(Rule model) {
            this.combinator = model.combinator;
            this.id = model.id;
            this.name = model.name;
            this.operator = model.operator;
            this.ruleSubType = model.ruleSubType;
            this.ruleType = model.ruleType;
            this.rules = model.rules;
            this.values = model.values;
        } 

        /**
         * Combinator.
         */
        public Builder combinator(String combinator) {
            this.combinator = combinator;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Operator.
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * RuleSubType.
         */
        public Builder ruleSubType(String ruleSubType) {
            this.ruleSubType = ruleSubType;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List<Rule> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Values.
         */
        public Builder values(java.util.List<String> values) {
            this.values = values;
            return this;
        }

        public Rule build() {
            return new Rule(this);
        } 

    } 

}
