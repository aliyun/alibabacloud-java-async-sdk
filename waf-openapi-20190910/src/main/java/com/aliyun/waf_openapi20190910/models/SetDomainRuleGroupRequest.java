// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link SetDomainRuleGroupRequest} extends {@link RequestModel}
 *
 * <p>SetDomainRuleGroupRequest</p>
 */
public class SetDomainRuleGroupRequest extends Request {
    @Query
    @NameInMap("Domains")
    private String domains;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("RuleGroupId")
    private Long ruleGroupId;

    @Query
    @NameInMap("WafVersion")
    private Long wafVersion;


    private SetDomainRuleGroupRequest(Builder builder) {
        super(builder);
        this.domains = builder.domains;
        this.instanceId = builder.instanceId;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleGroupId = builder.ruleGroupId;
        this.wafVersion = builder.wafVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainRuleGroupRequest create() {
        return builder().build();
    }

    /**
     * @return domains
     */
    public String getDomains() {
        return this.domains;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ruleGroupId
     */
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * @return wafVersion
     */
    public Long getWafVersion() {
        return this.wafVersion;
    }

    public static final class Builder extends Request.Builder {
        private String domains; 
        private String instanceId; 
        private String resourceGroupId; 
        private Long ruleGroupId; 
        private Long wafVersion; 

        /**
         * <p>Domains.</p>
         */
        public Builder domains(String domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
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
         * <p>ResourceGroupId.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>RuleGroupId.</p>
         */
        public Builder ruleGroupId(Long ruleGroupId) {
            this.putQueryParameter("RuleGroupId", ruleGroupId);
            this.ruleGroupId = ruleGroupId;
            return this;
        }

        /**
         * <p>WafVersion.</p>
         */
        public Builder wafVersion(Long wafVersion) {
            this.putQueryParameter("WafVersion", wafVersion);
            this.wafVersion = wafVersion;
            return this;
        }

        public SetDomainRuleGroupRequest build() {
            return new SetDomainRuleGroupRequest(this);
        } 

    } 

}
