// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateDefenseRuleRequest</p>
 */
public class CreateDefenseRuleRequest extends Request {
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

    private CreateDefenseRuleRequest(Builder builder) {
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

    public static CreateDefenseRuleRequest create() {
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

    public static final class Builder extends Request.Builder<CreateDefenseRuleRequest, Builder> {
        private String defenseScene; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String rules; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseRuleRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.rules = request.rules;
            this.templateId = request.templateId;
        } 

        /**
         * The module to which the protection rule that you want to create belongs.
         * <p>
         * 
         * *   **waf_group:** the basic protection rule module.
         * *   **antiscan:** the scan protection module.
         * *   **ip_blacklist:** the IP address blacklist module.
         * *   **custom_acl:** the custom rule module.
         * *   **whitelist:** the whitelist module.
         * *   **region_block:** the region blacklist module.
         * *   **custom_response:** the custom response module.
         * *   **cc:** the HTTP flood protection module.
         * *   **tamperproof:** the website tamper-proofing module.
         * *   **dlp:** the data leakage prevention module.
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
         * The ID of the resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The configurations of the protection rule. Specify a string that contains multiple parameters in the JSON format.
         * <p>
         * 
         * >  The parameters vary based on the value of the **DefenseScene** parameter. For more information, see the "**Protection rule parameters**" section in this topic.
         */
        public Builder rules(String rules) {
            this.putQueryParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * The ID of the protection rule template for which you want to create a protection rule.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public CreateDefenseRuleRequest build() {
            return new CreateDefenseRuleRequest(this);
        } 

    } 

}
