// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyProtectionModuleRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyProtectionModuleRuleRequest</p>
 */
public class ModifyProtectionModuleRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LockVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long lockVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private ModifyProtectionModuleRuleRequest(Builder builder) {
        super(builder);
        this.defenseType = builder.defenseType;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.lockVersion = builder.lockVersion;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.rule = builder.rule;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionModuleRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseType
     */
    public String getDefenseType() {
        return this.defenseType;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return lockVersion
     */
    public Long getLockVersion() {
        return this.lockVersion;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<ModifyProtectionModuleRuleRequest, Builder> {
        private String defenseType; 
        private String domain; 
        private String instanceId; 
        private Long lockVersion; 
        private String regionId; 
        private String resourceGroupId; 
        private String rule; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyProtectionModuleRuleRequest request) {
            super(request);
            this.defenseType = request.defenseType;
            this.domain = request.domain;
            this.instanceId = request.instanceId;
            this.lockVersion = request.lockVersion;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.rule = request.rule;
            this.ruleId = request.ruleId;
        } 

        /**
         * DefenseType.
         */
        public Builder defenseType(String defenseType) {
            this.putQueryParameter("DefenseType", defenseType);
            this.defenseType = defenseType;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * LockVersion.
         */
        public Builder lockVersion(Long lockVersion) {
            this.putQueryParameter("LockVersion", lockVersion);
            this.lockVersion = lockVersion;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public ModifyProtectionModuleRuleRequest build() {
            return new ModifyProtectionModuleRuleRequest(this);
        } 

    } 

}
