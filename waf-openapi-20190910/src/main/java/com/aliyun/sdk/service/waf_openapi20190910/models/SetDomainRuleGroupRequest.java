// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainRuleGroupRequest} extends {@link RequestModel}
 *
 * <p>SetDomainRuleGroupRequest</p>
 */
public class SetDomainRuleGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domains")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domains;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WafAiStatus")
    private Integer wafAiStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WafVersion")
    private Long wafVersion;

    private SetDomainRuleGroupRequest(Builder builder) {
        super(builder);
        this.domains = builder.domains;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleGroupId = builder.ruleGroupId;
        this.wafAiStatus = builder.wafAiStatus;
        this.wafVersion = builder.wafVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainRuleGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ruleGroupId
     */
    public Long getRuleGroupId() {
        return this.ruleGroupId;
    }

    /**
     * @return wafAiStatus
     */
    public Integer getWafAiStatus() {
        return this.wafAiStatus;
    }

    /**
     * @return wafVersion
     */
    public Long getWafVersion() {
        return this.wafVersion;
    }

    public static final class Builder extends Request.Builder<SetDomainRuleGroupRequest, Builder> {
        private String domains; 
        private String instanceId; 
        private String regionId; 
        private String resourceGroupId; 
        private Long ruleGroupId; 
        private Integer wafAiStatus; 
        private Long wafVersion; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainRuleGroupRequest request) {
            super(request);
            this.domains = request.domains;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.ruleGroupId = request.ruleGroupId;
            this.wafAiStatus = request.wafAiStatus;
            this.wafVersion = request.wafVersion;
        } 

        /**
         * Domains.
         */
        public Builder domains(String domains) {
            this.putQueryParameter("Domains", domains);
            this.domains = domains;
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
         * RuleGroupId.
         */
        public Builder ruleGroupId(Long ruleGroupId) {
            this.putQueryParameter("RuleGroupId", ruleGroupId);
            this.ruleGroupId = ruleGroupId;
            return this;
        }

        /**
         * WafAiStatus.
         */
        public Builder wafAiStatus(Integer wafAiStatus) {
            this.putQueryParameter("WafAiStatus", wafAiStatus);
            this.wafAiStatus = wafAiStatus;
            return this;
        }

        /**
         * WafVersion.
         */
        public Builder wafVersion(Long wafVersion) {
            this.putQueryParameter("WafVersion", wafVersion);
            this.wafVersion = wafVersion;
            return this;
        }

        @Override
        public SetDomainRuleGroupRequest build() {
            return new SetDomainRuleGroupRequest(this);
        } 

    } 

}
