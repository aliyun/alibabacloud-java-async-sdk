// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomizeRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteCustomizeRuleRequest</p>
 */
public class DeleteCustomizeRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    private DeleteCustomizeRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
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
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteCustomizeRuleRequest, Builder> {
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCustomizeRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
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
         * The ID of the account that you switch from the management account.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view. Valid values:
         * <p>
         * - 0: the current Alibaba Cloud account
         * - 1: the global account
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
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
