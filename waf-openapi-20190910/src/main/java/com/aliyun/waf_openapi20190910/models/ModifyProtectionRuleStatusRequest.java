// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link ModifyProtectionRuleStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyProtectionRuleStatusRequest</p>
 */
public class ModifyProtectionRuleStatusRequest extends Request {
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
    @NameInMap("RuleId")
    private Long ruleId;

    @Query
    @NameInMap("RuleStatus")
    private Integer ruleStatus;


    private ModifyProtectionRuleStatusRequest(Builder builder) {
        super(builder);
        this.defenseType = builder.defenseType;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.lockVersion = builder.lockVersion;
        this.ruleId = builder.ruleId;
        this.ruleStatus = builder.ruleStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyProtectionRuleStatusRequest create() {
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
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleStatus
     */
    public Integer getRuleStatus() {
        return this.ruleStatus;
    }

    public static final class Builder extends Request.Builder {
        private String defenseType; 
        private String domain; 
        private String instanceId; 
        private Long lockVersion; 
        private Long ruleId; 
        private Integer ruleStatus; 

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
         * <p>RuleId.</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>RuleStatus.</p>
         */
        public Builder ruleStatus(Integer ruleStatus) {
            this.putQueryParameter("RuleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        public ModifyProtectionRuleStatusRequest build() {
            return new ModifyProtectionRuleStatusRequest(this);
        } 

    } 

}
