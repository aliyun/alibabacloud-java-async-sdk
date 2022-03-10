// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDataLevelPermissionRuleConfigRequest} extends {@link RequestModel}
 *
 * <p>SetDataLevelPermissionRuleConfigRequest</p>
 */
public class SetDataLevelPermissionRuleConfigRequest extends Request {
    @Query
    @NameInMap("RuleModel")
    @Validation(required = true)
    private String ruleModel;

    private SetDataLevelPermissionRuleConfigRequest(Builder builder) {
        super(builder);
        this.ruleModel = builder.ruleModel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDataLevelPermissionRuleConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleModel
     */
    public String getRuleModel() {
        return this.ruleModel;
    }

    public static final class Builder extends Request.Builder<SetDataLevelPermissionRuleConfigRequest, Builder> {
        private String ruleModel; 

        private Builder() {
            super();
        } 

        private Builder(SetDataLevelPermissionRuleConfigRequest request) {
            super(request);
            this.ruleModel = request.ruleModel;
        } 

        /**
         * RuleModel.
         */
        public Builder ruleModel(String ruleModel) {
            this.putQueryParameter("RuleModel", ruleModel);
            this.ruleModel = ruleModel;
            return this;
        }

        @Override
        public SetDataLevelPermissionRuleConfigRequest build() {
            return new SetDataLevelPermissionRuleConfigRequest(this);
        } 

    } 

}
