// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("tags")
    private String tags;

    @Body
    @NameInMap("template")
    @Validation(required = true)
    private String template;

    @Body
    @NameInMap("template_type")
    private String templateType;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.name = builder.name;
        this.tags = builder.tags;
        this.template = builder.template;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String description; 
        private String name; 
        private String tags; 
        private String template; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.name = request.name;
            this.tags = request.tags;
            this.template = request.template;
            this.templateType = request.templateType;
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
         * The name of the orchestration template.
         * <p>
         * 
         * The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).
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
         * The template content in the YAML format.
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * The type of template. You can set the parameter to a custom value.
         * <p>
         * 
         * *   If the parameter is set to `kubernetes`, the template is displayed on the Templates page in the console.
         * *   If you set the parameter to `compose`, the template is not displayed in the console.
         * 
         * We recommend that you set the parameter to `kubernetes`.
         * 
         * Default value: `compose`.
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("template_type", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

}
