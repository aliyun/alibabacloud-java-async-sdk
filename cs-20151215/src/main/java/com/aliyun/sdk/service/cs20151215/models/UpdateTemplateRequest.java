// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template")
    private String template;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template_type")
    private String templateType;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.templateId = builder.templateId;
        this.description = builder.description;
        this.name = builder.name;
        this.tags = builder.tags;
        this.template = builder.template;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String templateId; 
        private String description; 
        private String name; 
        private String tags; 
        private String template; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest request) {
            super(request);
            this.templateId = request.templateId;
            this.description = request.description;
            this.name = request.name;
            this.tags = request.tags;
            this.template = request.template;
            this.templateType = request.templateType;
        } 

        /**
         * The ID of the template.
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The description of the template.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The name of the template.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The label of the template.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The YAML content of the template.
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * The type of template. This parameter can be set to a custom value.
         * <p>
         * 
         * *   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.
         * *   If the parameter is set to `compose`, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("template_type", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
