// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseRuleRequest</p>
 */
public class ModifyDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenseScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    private ModifyDefenseRuleRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.rules = builder.rules;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDefenseRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseScene
     */
    public String getDefenseScene() {
        return this.defenseScene;
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
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return rules
     */
    public String getRules() {
        return this.rules;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<ModifyDefenseRuleRequest, Builder> {
        private String defenseScene; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String rules; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseRuleRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.rules = request.rules;
            this.templateId = request.templateId;
        } 

        /**
         * The scenario in which you want to use the protection rule. For more information, see the description of the **DefenseScene** parameter in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The details of the protection rule. Specify a string that contains multiple parameters in the JSON format. You must specify the ID and the new configurations of the protection rule.
         * <p>
         * 
         * *   **id:** The ID of the protection rule. Data type: long. You must specify this parameter.
         * *   The protection rule configurations: The role of this parameter is the same as that of the **Rules** parameter in the **CreateDefenseRule** topic. For more information, see the "**Protection rule parameters**" section in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * The ID of the protection rule template to which the protection rule whose configurations you want to modify belongs.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public ModifyDefenseRuleRequest build() {
            return new ModifyDefenseRuleRequest(this);
        } 

    } 

}
