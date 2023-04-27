// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDefenseTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateDefenseTemplateRequest</p>
 */
public class CreateDefenseTemplateRequest extends Request {
    @Query
    @NameInMap("DefenseScene")
    @Validation(required = true)
    private String defenseScene;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("TemplateOrigin")
    @Validation(required = true)
    private String templateOrigin;

    @Query
    @NameInMap("TemplateStatus")
    @Validation(required = true)
    private Integer templateStatus;

    @Query
    @NameInMap("TemplateType")
    @Validation(required = true)
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
         * The scenario in which you want to use the protection rule template. For more information, see the description of the **DefenseScene** parameter in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * The description of the protection rule template.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * The name of the protection rule template.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template.
         */
        public Builder templateOrigin(String templateOrigin) {
            this.putQueryParameter("TemplateOrigin", templateOrigin);
            this.templateOrigin = templateOrigin;
            return this;
        }

        /**
         * The status of the protection rule template. Valid values:
         * <p>
         * 
         * *   **0:** disabled.
         * *   **1:** enabled.
         */
        public Builder templateStatus(Integer templateStatus) {
            this.putQueryParameter("TemplateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * The type of the protection rule template. Valid values:
         * <p>
         * 
         * *   **user_default:** default template.
         * *   **user_custom:** custom template.
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
