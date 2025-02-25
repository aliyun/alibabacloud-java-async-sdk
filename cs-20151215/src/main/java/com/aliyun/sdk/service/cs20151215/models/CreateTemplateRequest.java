// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tags")
    private String tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template")
    @com.aliyun.core.annotation.Validation(required = true)
    private String template;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("template_type")
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
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>this is test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the orchestration template.</p>
         * <p>The name must be 1 to 63 characters in length, and can contain digits, letters, and hyphens (-). It cannot start with a hyphen (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>service-account-template</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The label of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder tags(String tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The template content in the YAML format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: v1\nkind: ServiceAccount\nmetadata:\n  name: test-sa</p>
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>The type of template. You can set the parameter to a custom value.</p>
         * <ul>
         * <li>If the parameter is set to <code>kubernetes</code>, the template is displayed on the Templates page in the console.</li>
         * <li>If you set the parameter to <code>compose</code>, the template is not displayed in the console.</li>
         * </ul>
         * <p>We recommend that you set the parameter to <code>kubernetes</code>.</p>
         * <p>Default value: <code>compose</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>kubernetes</p>
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
