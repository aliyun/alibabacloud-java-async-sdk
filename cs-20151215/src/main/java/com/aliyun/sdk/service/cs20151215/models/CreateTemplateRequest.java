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
         * 模板描述。
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * 模板名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * 模板标签。
         */
        public Builder tags(String tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * YAML格式的模板内容。
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * 模板类型。默认值：kubernetes
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
