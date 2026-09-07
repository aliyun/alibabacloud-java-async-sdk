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
 * {@link UpdateRuleByIdRequest} extends {@link RequestModel}
 *
 * <p>UpdateRuleByIdRequest</p>
 */
public class UpdateRuleByIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsCopy")
    private Boolean isCopy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JsonStrForRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jsonStrForRule;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ReturnRelatedSchemes")
    private Boolean returnRelatedSchemes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    private UpdateRuleByIdRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
        this.isCopy = builder.isCopy;
        this.jsonStrForRule = builder.jsonStrForRule;
        this.returnRelatedSchemes = builder.returnRelatedSchemes;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleByIdRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseMeAgentId
     */
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
    }

    /**
     * @return isCopy
     */
    public Boolean getIsCopy() {
        return this.isCopy;
    }

    /**
     * @return jsonStrForRule
     */
    public String getJsonStrForRule() {
        return this.jsonStrForRule;
    }

    /**
     * @return returnRelatedSchemes
     */
    public Boolean getReturnRelatedSchemes() {
        return this.returnRelatedSchemes;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<UpdateRuleByIdRequest, Builder> {
        private Long baseMeAgentId; 
        private Boolean isCopy; 
        private String jsonStrForRule; 
        private Boolean returnRelatedSchemes; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleByIdRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.isCopy = request.isCopy;
            this.jsonStrForRule = request.jsonStrForRule;
            this.returnRelatedSchemes = request.returnRelatedSchemes;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>Workspace ID</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>Whether to copy. Setting to true is equivalent to copying the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isCopy(Boolean isCopy) {
            this.putBodyParameter("IsCopy", isCopy);
            this.isCopy = isCopy;
            return this;
        }

        /**
         * <p>For more information about the format of JsonStrForlRule, see <a href="https://help.aliyun.com/document_detail/453053.html"><code>Rule object description</code></a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder jsonStrForRule(String jsonStrForRule) {
            this.putBodyParameter("JsonStrForRule", jsonStrForRule);
            this.jsonStrForRule = jsonStrForRule;
            return this;
        }

        /**
         * <p>Returns the IDs and names of quality inspection schemes associated with this rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder returnRelatedSchemes(Boolean returnRelatedSchemes) {
            this.putBodyParameter("ReturnRelatedSchemes", returnRelatedSchemes);
            this.returnRelatedSchemes = returnRelatedSchemes;
            return this;
        }

        /**
         * <p>Rule ID. Not required when creating, required when modifying.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public UpdateRuleByIdRequest build() {
            return new UpdateRuleByIdRequest(this);
        } 

    } 

}
