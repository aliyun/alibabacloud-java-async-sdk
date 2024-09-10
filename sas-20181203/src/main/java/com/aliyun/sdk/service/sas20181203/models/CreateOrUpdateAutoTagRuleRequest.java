// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateAutoTagRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateAutoTagRuleRequest</p>
 */
public class CreateOrUpdateAutoTagRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckAll")
    private Boolean checkAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expression")
    @com.aliyun.core.annotation.Validation(required = true)
    private String expression;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleDesc")
    private String ruleDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagContext")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagContext;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TagType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tagType;

    private CreateOrUpdateAutoTagRuleRequest(Builder builder) {
        super(builder);
        this.checkAll = builder.checkAll;
        this.expression = builder.expression;
        this.ruleDesc = builder.ruleDesc;
        this.ruleId = builder.ruleId;
        this.ruleName = builder.ruleName;
        this.tagContext = builder.tagContext;
        this.tagType = builder.tagType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateAutoTagRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkAll
     */
    public Boolean getCheckAll() {
        return this.checkAll;
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return ruleDesc
     */
    public String getRuleDesc() {
        return this.ruleDesc;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return tagContext
     */
    public String getTagContext() {
        return this.tagContext;
    }

    /**
     * @return tagType
     */
    public String getTagType() {
        return this.tagType;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateAutoTagRuleRequest, Builder> {
        private Boolean checkAll; 
        private String expression; 
        private String ruleDesc; 
        private Long ruleId; 
        private String ruleName; 
        private String tagContext; 
        private String tagType; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateAutoTagRuleRequest request) {
            super(request);
            this.checkAll = request.checkAll;
            this.expression = request.expression;
            this.ruleDesc = request.ruleDesc;
            this.ruleId = request.ruleId;
            this.ruleName = request.ruleName;
            this.tagContext = request.tagContext;
            this.tagType = request.tagType;
        } 

        /**
         * Specifies whether to check the rule on the backend. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder checkAll(Boolean checkAll) {
            this.putQueryParameter("CheckAll", checkAll);
            this.checkAll = checkAll;
            return this;
        }

        /**
         * The expression of the rule.
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * The description of the rule.
         */
        public Builder ruleDesc(String ruleDesc) {
            this.putQueryParameter("RuleDesc", ruleDesc);
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * The ID of the rule.
         * <p>
         * 
         * >  You can call the [ListAutoTagRules](~~ListAutoTagRules~~) operation to query the ID.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
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

        /**
         * The tag specified by the operation type of the rule.
         * <p>
         * 
         * *   If TagType is set to group, set this parameter to {"groupId":XXX}. XXX specifies the ID of the group. You can call the [DescribeGroupStruct](~~DescribeGroupStruct~~) operation to query the ID.
         * *   If TagType is set to tag, set this parameter to {"tagId":XXX}. XXX specifies the ID of the tag. You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the ID.
         */
        public Builder tagContext(String tagContext) {
            this.putQueryParameter("TagContext", tagContext);
            this.tagContext = tagContext;
            return this;
        }

        /**
         * The operation type of the rule. Valid values:
         * <p>
         * 
         * *   **group**
         * *   **tag**
         */
        public Builder tagType(String tagType) {
            this.putQueryParameter("TagType", tagType);
            this.tagType = tagType;
            return this;
        }

        @Override
        public CreateOrUpdateAutoTagRuleRequest build() {
            return new CreateOrUpdateAutoTagRuleRequest(this);
        } 

    } 

}
