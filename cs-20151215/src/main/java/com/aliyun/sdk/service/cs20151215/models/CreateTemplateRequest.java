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
    @NameInMap("name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("template")
    @Validation(required = true)
    private String template;

    @Body
    @NameInMap("tags")
    private String tags;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("template_type")
    private String templateType;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.template = builder.template;
        this.tags = builder.tags;
        this.description = builder.description;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String name; 
        private String template; 
        private String tags; 
        private String description; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.name = request.name;
            this.template = request.template;
            this.tags = request.tags;
            this.description = request.description;
            this.templateType = request.templateType;
        } 

        /**
         * The name of the template.
         * <p>
         * 
         * Naming rule: the name must be 1 to 63 characters in length and cannot start with a hyphen (-). It must be 1 to 63 characters in length.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The content of the YAML template.
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * The tag of the orchestration template.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The description of the orchestration template.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * The type of the template. The value can be any value.
         * <p>
         * 
         * -If the value is "kubernetes", the template is displayed on the orchestration Template page in the console.
         * 
         * -If the value is "compose", it is not displayed in the console.
         * 
         * We recommend that you set this parameter to "kubernetes ".
         * 
         * Default value: "compose ".
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
