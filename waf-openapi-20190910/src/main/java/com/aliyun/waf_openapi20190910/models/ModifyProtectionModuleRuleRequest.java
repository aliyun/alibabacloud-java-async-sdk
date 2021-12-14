// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyProtectionModuleRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyProtectionModuleRuleRequest</p>
 */
public class ModifyProtectionModuleRuleRequest extends Request {
    @Query
    @NameInMap("DefenseType")
    private String defenseType;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("LockVersion")
    private Long lockVersion;

    @Query
    @NameInMap("Rule")
    private String rule;

    @Query
    @NameInMap("RuleId")
    private Long ruleId;


    private ModifyProtectionModuleRuleRequest(Builder builder) {
        super(builder);
        this.defenseType = builder.defenseType;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.lockVersion = builder.lockVersion;
        this.rule = builder.rule;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionModuleRuleRequest create() {
        return builder().build();
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

    public static final class Builder extends Request.Builder {
        private String defenseType; 
        private String domain; 
        private String instanceId; 
        private Long lockVersion; 
        private String rule; 
        private Long ruleId; 

        /**
         * <p>DefenseType.</p>
         */
        public Builder defenseType(String defenseType) {
            this.putQueryParameter("DefenseType", defenseType);
            this.defenseType = defenseType;
            return this;
        }

        /**
         * <p>Domain.</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>LockVersion.</p>
         */
        public Builder lockVersion(Long lockVersion) {
            this.putQueryParameter("LockVersion", lockVersion);
            this.lockVersion = lockVersion;
            return this;
        }

        /**
         * <p>Rule.</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>RuleId.</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        public ModifyProtectionModuleRuleRequest build() {
            return new ModifyProtectionModuleRuleRequest(this);
        } 

    } 

}
