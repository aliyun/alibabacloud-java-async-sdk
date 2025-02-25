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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

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

    private CreateDefenseTemplateRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.templateName = builder.templateName;
        this.templateOrigin = builder.templateOrigin;
        this.templateStatus = builder.templateStatus;
        this.templateType = builder.templateType;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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

    public static final class Builder extends Request.Builder<CreateDefenseTemplateRequest, Builder> {
        private String defenseScene; 
        private String description; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String templateName; 
        private String templateOrigin; 
        private Integer templateStatus; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateDefenseTemplateRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.templateName = request.templateName;
            this.templateOrigin = request.templateOrigin;
            this.templateStatus = request.templateStatus;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The scenario in which you want to use the protection rule template. For more information, see the description of the <strong>DefenseScene</strong> parameter in the <a href="~~CreateDefenseRule~~">CreateDefenseRule</a> topic.</p>
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
         * <p>The description of the protection rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
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
         * <li><strong>cn-hangzhou:</strong> the Chinese mainland.</li>
         * <li><strong>ap-southeast-1:</strong> outside the Chinese mainland.</li>
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
         * <p>The name of the protection rule template.</p>
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
         * <p>The origin of the protection rule template that you want to create. Set the value to <strong>custom</strong>. The value specifies that the protection rule template is a custom template.</p>
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
         * <p>The status of the protection rule template. Valid values:</p>
         * <ul>
         * <li><strong>0:</strong> disabled.</li>
         * <li><strong>1:</strong> enabled.</li>
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
         * <p>The type of the protection rule template. Valid values:</p>
         * <ul>
         * <li><strong>user_default:</strong> default template.</li>
         * <li><strong>user_custom:</strong> custom template.</li>
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

        @Override
        public CreateDefenseTemplateRequest build() {
            return new CreateDefenseTemplateRequest(this);
        } 

    } 

}
