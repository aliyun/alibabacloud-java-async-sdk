// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RulesInfo} extends {@link TeaModel}
 *
 * <p>RulesInfo</p>
 */
public class RulesInfo extends TeaModel {
    @NameInMap("Conditions")
    private java.util.List < ConditionBasicInfo > conditions;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Dialogues")
    private java.util.List < RuleTestDialogue > dialogues;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("Rules")
    private java.util.List < RuleInfo > rules;

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
    public java.util.List < ConditionBasicInfo > getConditions() {
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
    public java.util.List < RuleTestDialogue > getDialogues() {
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
    public java.util.List < RuleInfo > getRules() {
        return this.rules;
    }

    public static final class Builder {
        private java.util.List < ConditionBasicInfo > conditions; 
        private Integer count; 
        private java.util.List < RuleTestDialogue > dialogues; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List < RuleInfo > rules; 

        /**
         * 规则条件信息，多个规则的条件都放在一个list中
         */
        public Builder conditions(java.util.List < ConditionBasicInfo > conditions) {
            this.conditions = conditions;
            return this;
        }

        /**
         * 总条数
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * 测试文案
         */
        public Builder dialogues(java.util.List < RuleTestDialogue > dialogues) {
            this.dialogues = dialogues;
            return this;
        }

        /**
         * 当前页
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 页数
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 规则基本信息，可能有多个规则
         */
        public Builder rules(java.util.List < RuleInfo > rules) {
            this.rules = rules;
            return this;
        }

        public RulesInfo build() {
            return new RulesInfo(this);
        } 

    } 

}
