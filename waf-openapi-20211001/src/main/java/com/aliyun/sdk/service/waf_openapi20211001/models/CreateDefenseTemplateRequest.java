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
            this.templateName = request.templateName;
            this.templateOrigin = request.templateOrigin;
            this.templateStatus = request.templateStatus;
            this.templateType = request.templateType;
        } 

        /**
         * DefenseScene.
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateOrigin.
         */
        public Builder templateOrigin(String templateOrigin) {
            this.putQueryParameter("TemplateOrigin", templateOrigin);
            this.templateOrigin = templateOrigin;
            return this;
        }

        /**
         * TemplateStatus.
         */
        public Builder templateStatus(Integer templateStatus) {
            this.putQueryParameter("TemplateStatus", templateStatus);
            this.templateStatus = templateStatus;
            return this;
        }

        /**
         * TemplateType.
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
