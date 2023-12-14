// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomizeRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomizeRuleRequest</p>
 */
public class DeleteCustomizeRuleRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RuleId")
    private Long ruleId;

    private DeleteCustomizeRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCustomizeRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomizeRuleRequest, Builder> {
        private String regionId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomizeRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ruleId = request.ruleId;
        } 

        /**
         * The region in which the service is deployed.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteCustomizeRuleRequest build() {
            return new DeleteCustomizeRuleRequest(this);
        } 

    } 

}
