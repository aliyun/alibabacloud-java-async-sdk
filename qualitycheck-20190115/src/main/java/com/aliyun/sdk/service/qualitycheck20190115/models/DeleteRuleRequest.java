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
 * {@link DeleteRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteRuleRequest</p>
 */
public class DeleteRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseMeAgentId")
    private Long baseMeAgentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ForceDelete")
    private Boolean forceDelete;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsSchemeData")
    private Integer isSchemeData;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private DeleteRuleRequest(Builder builder) {
        super(builder);
        this.baseMeAgentId = builder.baseMeAgentId;
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
     * @return baseMeAgentId
     */
    public Long getBaseMeAgentId() {
        return this.baseMeAgentId;
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
        private Long baseMeAgentId; 
        private Boolean forceDelete; 
        private Integer isSchemeData; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRuleRequest request) {
            super(request);
            this.baseMeAgentId = request.baseMeAgentId;
            this.forceDelete = request.forceDelete;
            this.isSchemeData = request.isSchemeData;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>Workspace ID.</p>
         */
        public Builder baseMeAgentId(Long baseMeAgentId) {
            this.putQueryParameter("BaseMeAgentId", baseMeAgentId);
            this.baseMeAgentId = baseMeAgentId;
            return this;
        }

        /**
         * <p>Whether to delete the rule even if it is associated with a quality check task.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder forceDelete(Boolean forceDelete) {
            this.putBodyParameter("ForceDelete", forceDelete);
            this.forceDelete = forceDelete;
            return this;
        }

        /**
         * <p>Indicates whether this is the new version of quality check. 0: old version. 1: new version. Default is 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isSchemeData(Integer isSchemeData) {
            this.putBodyParameter("IsSchemeData", isSchemeData);
            this.isSchemeData = isSchemeData;
            return this;
        }

        /**
         * <p>Rule ID.</p>
         * <p>This parameter is required.</p>
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
        public DeleteRuleRequest build() {
            return new DeleteRuleRequest(this);
        } 

    } 

}
