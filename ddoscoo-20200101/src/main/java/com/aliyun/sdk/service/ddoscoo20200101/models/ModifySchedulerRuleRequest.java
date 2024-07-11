// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySchedulerRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifySchedulerRuleRequest</p>
 */
public class ModifySchedulerRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Param")
    private String param;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    private ModifySchedulerRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.param = builder.param;
        this.resourceGroupId = builder.resourceGroupId;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.rules = builder.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySchedulerRuleRequest create() {
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
     * @return param
     */
    public String getParam() {
        return this.param;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    public static final class Builder extends Request.Builder<ModifySchedulerRuleRequest, Builder> {
        private String regionId; 
        private String param; 
        private String resourceGroupId; 
        private String ruleName; 
        private Integer ruleType; 
        private String rules; 

        private Builder() {
            super();
        } 

        private Builder(ModifySchedulerRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.param = request.param;
            this.resourceGroupId = request.resourceGroupId;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.rules = request.rules;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The details of the CDN interaction rule. This parameter is a JSON string. The string contains the following fields:
         * <p>
         * 
         * *   **ParamType**: the type of the scheduling rule. This field is required and must be of the string type. Set the value to **cdn**. This indicates that you want to modify a CDN interaction rule.
         * 
         * *   **ParamData**: the values of parameters that you want to modify for the CDN interaction rule. This field is required and must be of the map type. The ParamData parameter contains the following parameters:
         * 
         *     *   **Domain**: the accelerated domain in CDN. This parameter is required and must be of the string type.
         *     *   **Cname**: the CNAME that is assigned to the accelerated domain. This parameter is required and must be of the string type.
         *     *   **AccessQps**: the queries per second (QPS) threshold that is used to switch service traffic to Anti-DDoS Pro or Anti-DDoS Premium. This parameter is required and must be of the integer type.
         *     *   **UpstreamQps**: the QPS threshold that is used to switch service traffic to CDN. This parameter is optional and must be of the integer type.
         */
        public Builder param(String param) {
            this.putQueryParameter("Param", param);
            this.param = param;
            return this;
        }

        /**
         * The ID of the resource group to which the instance belongs in Resource Management. This parameter is empty by default, which indicates that the instance belongs to the default resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The name of the rule that you want to modify.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The type of the scheduling rule. Valid values:
         * <p>
         * 
         * *   **2**: tiered protection
         * *   **3**: network acceleration
         * *   **5**: CDN interaction
         * *   **6**: cloud service interaction
         * *   **8**: secure acceleration
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The details of the scheduling rule. This parameter is a JSON string. The following list describes the fields in the value of the parameter:
         * <p>
         * 
         * *   **Type**: the address type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type. Valid values:
         * 
         *     *   **A**: IP address
         *     *   **CNAME**: domain name
         * 
         * *   **Value**: the address of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the string type.
         * 
         * *   **Priority**: the priority of the scheduling rule. This field is required and must be of the integer type. Valid values: **0** to **100**. A larger value indicates a higher priority.
         * 
         * *   **ValueType**: the type of the interaction resource that you want to use in the scheduling rule. This field is required and must be of the integer type. Valid values:
         * 
         *     *   **1**: the IP address of the Anti-DDoS Pro or Anti-DDoS Premium instance
         *     *   **2**: the IP address of the interaction resource in the tiered protection scenario
         *     *   **3**: the IP address that is used to accelerate access in the network acceleration scenario
         *     *   **5**: the domain name that is configured in Alibaba Cloud CDN (CDN) in the CDN interaction scenario
         *     *   **6** the IP address of the interaction resource in the cloud service interaction scenario
         *     *   **8**: the IP address of the Secure Chinese Mainland Acceleration (Sec-CMA) instance in the secure acceleration scenario
         * 
         * *   **RegionId**: the region where the interaction resource is deployed. This parameter must be specified when **ValueType** is set to **2**. The value must be of the string type.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        @Override
        public ModifySchedulerRuleRequest build() {
            return new ModifySchedulerRuleRequest(this);
        } 

    } 

}
