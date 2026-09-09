// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyDefenseRuleRequest</p>
 */
public class ModifyDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScene")
    private String defenseScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseType")
    private String defenseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private ModifyDefenseRuleRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.defenseType = builder.defenseType;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
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
     * @return defenseType
     */
    public String getDefenseType() {
        return this.defenseType;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return resource
     */
    public String getResource() {
        return this.resource;
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
        private String defenseType; 
        private Boolean dryRun; 
        private String instanceId; 
        private String regionId; 
        private String resource; 
        private String resourceManagerResourceGroupId; 
        private String rules; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDefenseRuleRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.defenseType = request.defenseType;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.rules = request.rules;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The protection scenario to modify. For more information, see the <strong>DefenseScene</strong> parameter in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_group</p>
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * <p>The type of the protection rule.</p>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        public Builder defenseType(String defenseType) {
            this.putQueryParameter("DefenseType", defenseType);
            this.defenseType = defenseType;
            return this;
        }

        /**
         * <p>Specifies whether to enable the dry run mode. If you do not specify this parameter, a normal request is sent. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A dry run request is sent. The system checks whether the request meets the execution conditions without performing the specified operation. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the error code Defense.Control.DryRunOperation is returned.</li>
         * <li><strong>false</strong>: A normal request is sent. The specified operation is performed after the request passes the check.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>Instance ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The protected object associated with the rule to modify.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>resource</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rencs***-waf</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The details of the protection rule. The value is a string that is converted from a JSON object constructed by a series of parameters. When you configure this parameter, specify the rule ID and the protection rule configuration to modify. The following parameters are included:</p>
         * <ul>
         * <li><p><strong>id</strong>: Long | Required | The rule ID.</p>
         * </li>
         * <li><p>Protection rule configuration: Same as the <strong>Rules</strong> parameter of the <strong>CreateDefenseRule</strong> operation. For more information, see the <strong>protection rule parameter description</strong> in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[
         *       {
         *             &quot;id&quot;: 2344,
         *             &quot;policyId&quot;: 1012,
         *             &quot;action&quot;: &quot;block&quot;
         *       }
         * ]</p>
         */
        public Builder rules(String rules) {
            this.putBodyParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The ID of the protection rule template.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>template</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5325</p>
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
