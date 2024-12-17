// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link RulesInfo} extends {@link TeaModel}
 *
 * <p>RulesInfo</p>
 */
public class RulesInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List<ConditionBasicInfo> conditions;

    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("Dialogues")
    private java.util.List<RuleTestDialogue> dialogues;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<RuleInfo> rules;

    private RulesInfo(Builder builder) {
        this.conditions = builder.conditions;
        this.count = builder.count;
        this.dialogues = builder.dialogues;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RulesInfo create() {
        return builder().build();
    }

    /**
     * @return conditions
     */
    public java.util.List<ConditionBasicInfo> getConditions() {
        return this.conditions;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return dialogues
     */
    public java.util.List<RuleTestDialogue> getDialogues() {
        return this.dialogues;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return rules
     */
    public java.util.List<RuleInfo> getRules() {
        return this.rules;
    }

    public static final class Builder {
        private java.util.List<ConditionBasicInfo> conditions; 
        private Integer count; 
        private java.util.List<RuleTestDialogue> dialogues; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<RuleInfo> rules; 

        /**
         * Conditions.
         */
        public Builder conditions(java.util.List<ConditionBasicInfo> conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Dialogues.
         */
        public Builder dialogues(java.util.List<RuleTestDialogue> dialogues) {
            this.dialogues = dialogues;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(java.util.List<RuleInfo> rules) {
            this.rules = rules;
            return this;
        }

        public RulesInfo build() {
            return new RulesInfo(this);
        } 

    } 

}
