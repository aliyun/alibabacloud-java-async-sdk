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
 * {@link CreateDefenseTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateDefenseTemplateRequest</p>
 */
public class CreateDefenseTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScene")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defenseScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseSubScene")
    private String defenseSubScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

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
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateOrigin")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateOrigin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer templateStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnbindResourceGroups")
    private java.util.List<String> unbindResourceGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnbindResources")
    private java.util.List<String> unbindResources;

    private CreateDefenseTemplateRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.defenseSubScene = builder.defenseSubScene;
        this.description = builder.description;
        this.detail = builder.detail;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.templateName = builder.templateName;
        this.templateOrigin = builder.templateOrigin;
        this.templateStatus = builder.templateStatus;
        this.templateType = builder.templateType;
        this.unbindResourceGroups = builder.unbindResourceGroups;
        this.unbindResources = builder.unbindResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDefenseTemplateRequest create() {
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
     * @return defenseSubScene
     */
    public String getDefenseSubScene() {
        return this.defenseSubScene;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return this.detail;
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
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateOrigin
     */
    public String getTemplateOrigin() {
        return this.templateOrigin;
    }

    /**
     * @return templateStatus
     */
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    /**
     * @return unbindResourceGroups
     */
    public java.util.List<String> getUnbindResourceGroups() {
        return this.unbindResourceGroups;
    }

    /**
     * @return unbindResources
     */
    public java.util.List<String> getUnbindResources() {
        return this.unbindResources;
    }

    public static final class Builder extends Request.Builder<CreateDefenseTemplateRequest, Builder> {
        private String defenseScene; 
        private String defenseSubScene; 
        private String description; 
        private String detail; 
        private Boolean dryRun; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String templateName; 
        private String templateOrigin; 
        private Integer templateStatus; 
        private String templateType; 
        private java.util.List<String> unbindResourceGroups; 
        private java.util.List<String> unbindResources; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseTemplateRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.defenseSubScene = request.defenseSubScene;
            this.description = request.description;
            this.detail = request.detail;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.templateName = request.templateName;
            this.templateOrigin = request.templateOrigin;
            this.templateStatus = request.templateStatus;
            this.templateType = request.templateType;
            this.unbindResourceGroups = request.unbindResourceGroups;
            this.unbindResources = request.unbindResources;
        } 

        /**
         * <p>The protection scenario. For more information, see the <strong>DefenseScene</strong> parameter in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
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
         * <p>The sub-scenario of the protection template. This parameter is supported only for the advanced bot management scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>web</p>
         */
        public Builder defenseSubScene(String defenseSubScene) {
            this.putQueryParameter("DefenseSubScene", defenseSubScene);
            this.defenseSubScene = defenseSubScene;
            return this;
        }

        /**
         * <p>The description of the protection template to create.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The detailed template information, which is a JSON-formatted string. Different key-value pairs represent different attributes of the protected object. For more information, see the Detail description.</p>
         * <blockquote>
         * <p>This parameter applies only to the new version of basic protection (<strong>waf_base</strong>) and the new version of bot management (<strong>bot_manager</strong>) protection scenarios. This parameter is required for the new version of bot management (<strong>bot_manager</strong>) protection scenario.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;trafficFeature&quot;:&quot;{\&quot;global\&quot;:0,\&quot;excludeStatus\&quot;:1,\&quot;conditions\&quot;:[{\&quot;key\&quot;:\&quot;URL\&quot;,\&quot;opValue\&quot;:\&quot;not-contain\&quot;,\&quot;values\&quot;:\&quot;test\&quot;}]}&quot;}</p>
         */
        public Builder detail(String detail) {
            this.putQueryParameter("Detail", detail);
            this.detail = detail;
            return this;
        }

        /**
         * <p>Specifies whether to enable the dry run mode. If you do not specify this parameter, a normal request is sent. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: A dry run request is sent. The system checks whether the request meets the execution conditions without performing the specified operation. If the dry run fails, the corresponding error code is returned. If the dry run succeeds, the error code Defense.Control.DryRunOperation is returned.</p>
         * </li>
         * <li><p><strong>false</strong>: A normal request is sent. The specified operation is performed after the request passes the check.</p>
         * </li>
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
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to obtain the ID of the current WAF instance.</p>
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
         * <p>The name of the protection template to create. The name must be 1 to 255 characters in length and can contain Chinese characters, letters, digits, underscores (_), periods (.), and hyphens (-).</p>
         * <blockquote>
         * <p>Template names must be unique within the same protection scenario (<strong>DefenseScene</strong>).</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test221</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The source of the protection template to create. Set the value to <strong>custom</strong>, which indicates user-defined.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder templateOrigin(String templateOrigin) {
            this.putQueryParameter("TemplateOrigin", templateOrigin);
            this.templateOrigin = templateOrigin;
            return this;
        }

        /**
         * <p>The status of the protection template to create. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder templateStatus(Integer templateStatus) {
            this.putQueryParameter("TemplateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * <p>The templatetype of the protection template to create. Valid values:</p>
         * <ul>
         * <li><strong>user_default</strong>: default protection.</li>
         * <li><strong>user_custom</strong>: custom protection.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        /**
         * <p>The protected object groups to unbind when creating a default protection template. Use the format [<strong>&quot;group1&quot;,&quot;group2&quot;,……</strong>].</p>
         * <blockquote>
         * <p>This parameter takes effect only when creating a <strong>default template</strong> (when <strong>TemplateType</strong> is set to <strong>user_default</strong>).</p>
         * </blockquote>
         */
        public Builder unbindResourceGroups(java.util.List<String> unbindResourceGroups) {
            this.putQueryParameter("UnbindResourceGroups", unbindResourceGroups);
            this.unbindResourceGroups = unbindResourceGroups;
            return this;
        }

        /**
         * <p>The protected objects to unbind when creating a default protection template. Use the format [<strong>&quot;XX1&quot;,&quot;XX2&quot;,……</strong>].</p>
         * <blockquote>
         * <p>This parameter takes effect only when creating a <strong>default template</strong> (when <strong>TemplateType</strong> is set to <strong>user_default</strong>).</p>
         * </blockquote>
         */
        public Builder unbindResources(java.util.List<String> unbindResources) {
            this.putQueryParameter("UnbindResources", unbindResources);
            this.unbindResources = unbindResources;
            return this;
        }

        @Override
        public CreateDefenseTemplateRequest build() {
            return new CreateDefenseTemplateRequest(this);
        } 

    } 

}
