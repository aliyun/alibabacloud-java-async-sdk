// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * baseMeAgentId
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * IsCopy.
         */
        public Builder isCopy(Boolean isCopy) {
            this.putBodyParameter("IsCopy", isCopy);
            this.isCopy = isCopy;
            return this;
        }

        /**
         * JsonStrForRule.
         */
        public Builder jsonStrForRule(String jsonStrForRule) {
            this.putBodyParameter("JsonStrForRule", jsonStrForRule);
            this.jsonStrForRule = jsonStrForRule;
            return this;
        }

        /**
         * ReturnRelatedSchemes.
         */
        public Builder returnRelatedSchemes(Boolean returnRelatedSchemes) {
            this.putBodyParameter("ReturnRelatedSchemes", returnRelatedSchemes);
            this.returnRelatedSchemes = returnRelatedSchemes;
            return this;
        }

        /**
         * RuleId.
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
