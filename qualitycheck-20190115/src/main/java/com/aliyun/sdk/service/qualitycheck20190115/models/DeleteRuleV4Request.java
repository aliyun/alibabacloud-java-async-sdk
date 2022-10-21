// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRuleV4Request} extends {@link RequestModel}
 *
 * <p>DeleteRuleV4Request</p>
 */
public class DeleteRuleV4Request extends Request {
    @Body
    @NameInMap("ForceDelete")
    private Boolean forceDelete;

    @Body
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    private DeleteRuleV4Request(Builder builder) {
        super(builder);
        this.forceDelete = builder.forceDelete;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRuleV4Request create() {
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
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteRuleV4Request, Builder> {
        private Boolean forceDelete; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRuleV4Request request) {
            super(request);
            this.forceDelete = request.forceDelete;
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
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteRuleV4Request build() {
            return new DeleteRuleV4Request(this);
        } 

    } 

}
