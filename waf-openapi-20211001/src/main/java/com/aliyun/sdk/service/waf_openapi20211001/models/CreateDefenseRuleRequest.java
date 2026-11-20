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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Rules")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    private CreateDefenseRuleRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.defenseType = builder.defenseType;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceType = builder.resourceType;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
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
        private String defenseType; 
        private Boolean dryRun; 
        private String instanceId; 
        private String regionId; 
        private String resource; 
        private String resourceManagerResourceGroupId; 
        private String resourceType; 
        private String rules; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseRuleRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.defenseType = request.defenseType;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceType = request.resourceType;
            this.rules = request.rules;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The WAF protection scenario to be created.</p>
         * <p>Valid values when the protection rule type <strong>DefenseType</strong> is set to <strong>template</strong>:</p>
         * <ul>
         * <li><p><strong>waf_group</strong>: basic protection.</p>
         * </li>
         * <li><p><strong>waf_base</strong>: new version of web core protection.</p>
         * </li>
         * <li><p><strong>antiscan</strong>: scan protection.</p>
         * </li>
         * <li><p><strong>ip_blacklist</strong>: IP blacklist.</p>
         * </li>
         * <li><p><strong>custom_acl</strong>: custom rules.</p>
         * </li>
         * <li><p><strong>whitelist</strong>: whitelist.</p>
         * </li>
         * <li><p><strong>region_block</strong>: area blocking.</p>
         * </li>
         * <li><p><strong>custom_response</strong>: custom response of the old version.</p>
         * </li>
         * <li><p><strong>cc</strong>: HTTP flood protection.</p>
         * </li>
         * <li><p><strong>tamperproof</strong>: web tamper-proofing.</p>
         * </li>
         * <li><p><strong>dlp</strong>: data leak prevention.</p>
         * </li>
         * <li><p><strong>spike_throttle</strong>: peak traffic throttling.</p>
         * </li>
         * <li><p><strong>bot_manager</strong>: bot management.</p>
         * </li>
         * </ul>
         * <p>Valid values when the protection rule type <strong>DefenseType</strong> is set to <strong>resource</strong>:</p>
         * <ul>
         * <li><p><strong>account_identifier</strong>: account extraction.</p>
         * </li>
         * <li><p><strong>custom_response</strong>: custom response of the new version.</p>
         * </li>
         * <li><p><strong>waf_codec</strong>: decoding.</p>
         * </li>
         * <li><p><strong>websdk</strong>: WebSDK integration.</p>
         * </li>
         * </ul>
         * <p>Valid values when the protection rule type <strong>DefenseType</strong> is set to <strong>global</strong>:</p>
         * <ul>
         * <li><p><strong>regular_custom</strong>: custom regular expressions.</p>
         * </li>
         * <li><p><strong>address_book</strong>: address book.</p>
         * </li>
         * <li><p><strong>custom_response</strong>: custom response of the new version.</p>
         * <blockquote>
         * <p>For globally configured custom responses, you can reference them under protected objects or rules. When custom response rules are referenced at different dimensions, the actual effective priority is: rule level &gt; protected object level &gt; default page.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Specifies whether to enable the dry run mode. If this parameter is not specified, a normal request is initiated. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: initiates a dry run request. The system only checks whether the request meets the execution conditions and does not perform the operations specified in the request. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the error code Defense.Control.DryRunOperation is returned.</li>
         * <li><strong>false</strong>: initiates a normal request. The system performs the operations specified in the request after the check succeeds.</li>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of your WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
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
         * <p>The protected object corresponding to the created rule.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>resource</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sec****-waf</p>
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
         * <p>The type of the protected target. This parameter applies to rules where <strong>DefenseType</strong> is set to <strong>resource</strong>. Valid values:</p>
         * <ul>
         * <li><strong>single</strong> (default): a single protected object.</li>
         * <li><strong>group</strong>: a protection group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The rule configuration content, which is converted into a string in JSON format constructed by a series of parameters.</p>
         * <blockquote>
         * <p>The specific parameters involved vary depending on the specified <strong>protection rule type</strong> (<strong>DefenseScene</strong>). For more information, see <strong>Protection rule parameter description</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_group</p>
         */
        public Builder rules(String rules) {
            this.putBodyParameter("Rules", rules);
            this.rules = rules;
            return this;
        }

        /**
         * <p>The ID of the protection template for the protection rule to be created.</p>
         * <blockquote>
         * <p>This parameter is required only when <strong>DefenseType</strong> is set to <strong>template</strong>.
         * The number of rules that can be created in a single protection template is limited. For more information, see <strong>Rule quantity limits</strong>. If the limit is reached, you can call the <a href="https://help.aliyun.com/document_detail/461613.html">CreateDefenseTemplate</a> operation to create a new protection template, or call the <a href="https://help.aliyun.com/document_detail/461422.html">ModifyDefenseRule</a> operation to modify an existing rule.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1122</p>
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
