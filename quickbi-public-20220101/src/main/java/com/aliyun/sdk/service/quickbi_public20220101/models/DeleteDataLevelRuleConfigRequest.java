// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDataLevelRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteDataLevelRuleConfigRequest</p>
 */
public class DeleteDataLevelRuleConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CubeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cubeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private DeleteDataLevelRuleConfigRequest(Builder builder) {
        super(builder);
        this.cubeId = builder.cubeId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDataLevelRuleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cubeId
     */
    public String getCubeId() {
        return this.cubeId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteDataLevelRuleConfigRequest, Builder> {
        private String cubeId; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDataLevelRuleConfigRequest request) {
            super(request);
            this.cubeId = request.cubeId;
            this.ruleId = request.ruleId;
        } 

        /**
         * CubeId.
         */
        public Builder cubeId(String cubeId) {
            this.putQueryParameter("CubeId", cubeId);
            this.cubeId = cubeId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteDataLevelRuleConfigRequest build() {
            return new DeleteDataLevelRuleConfigRequest(this);
        } 

    } 

}
