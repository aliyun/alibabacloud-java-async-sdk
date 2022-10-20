// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRuleRequest</p>
 */
public class DeleteRuleRequest extends Request {
    @Body
    @NameInMap("ForceDelete")
    private Boolean forceDelete;

    @Body
    @NameInMap("IsSchemeData")
    private Integer isSchemeData;

    @Body
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    private DeleteRuleRequest(Builder builder) {
        super(builder);
        this.forceDelete = builder.forceDelete;
        this.isSchemeData = builder.isSchemeData;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDelete
     */
    public Boolean getForceDelete() {
        return this.forceDelete;
    }

    /**
     * @return isSchemeData
     */
    public Integer getIsSchemeData() {
        return this.isSchemeData;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteRuleRequest, Builder> {
        private Boolean forceDelete; 
        private Integer isSchemeData; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRuleRequest request) {
            super(request);
            this.forceDelete = request.forceDelete;
            this.isSchemeData = request.isSchemeData;
            this.ruleId = request.ruleId;
        } 

        /**
         * ForceDelete.
         */
        public Builder forceDelete(Boolean forceDelete) {
            this.putBodyParameter("ForceDelete", forceDelete);
            this.forceDelete = forceDelete;
            return this;
        }

        /**
         * IsSchemeData.
         */
        public Builder isSchemeData(Integer isSchemeData) {
            this.putBodyParameter("IsSchemeData", isSchemeData);
            this.isSchemeData = isSchemeData;
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
        public DeleteRuleRequest build() {
            return new DeleteRuleRequest(this);
        } 

    } 

}
