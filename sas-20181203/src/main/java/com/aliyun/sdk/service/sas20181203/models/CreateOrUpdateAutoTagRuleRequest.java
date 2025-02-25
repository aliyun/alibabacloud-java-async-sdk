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
         * <p>Specifies whether to check the rule on the backend. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder checkAll(Boolean checkAll) {
            this.putQueryParameter("CheckAll", checkAll);
            this.checkAll = checkAll;
            return this;
        }

        /**
         * <p>The expression of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;groups&quot;:&quot;0&quot;,&quot;fieldValueType&quot;:&quot;string&quot;,&quot;field&quot;:&quot;internetIp&quot;,&quot;operator&quot;:&quot;equals&quot;,&quot;value&quot;:&quot;12.0.0.1&quot;}]</p>
         */
        public Builder expression(String expression) {
            this.putQueryParameter("Expression", expression);
            this.expression = expression;
            return this;
        }

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>describe</p>
         */
        public Builder ruleDesc(String ruleDesc) {
            this.putQueryParameter("RuleDesc", ruleDesc);
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListAutoTagRules~~">ListAutoTagRules</a> operation to query the ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>300566</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The name of the rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text-001</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The tag specified by the operation type of the rule.</p>
         * <ul>
         * <li>If TagType is set to group, set this parameter to {&quot;groupId&quot;:XXX}. XXX specifies the ID of the group. You can call the <a href="~~DescribeGroupStruct~~">DescribeGroupStruct</a> operation to query the ID.</li>
         * <li>If TagType is set to tag, set this parameter to {&quot;tagId&quot;:XXX}. XXX specifies the ID of the tag. You can call the <a href="~~DescribeGroupedTags~~">DescribeGroupedTags</a> operation to query the ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;tagId&quot;:7804789}</p>
         */
        public Builder tagContext(String tagContext) {
            this.putQueryParameter("TagContext", tagContext);
            this.tagContext = tagContext;
            return this;
        }

        /**
         * <p>The operation type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>group</strong></li>
         * <li><strong>tag</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
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
