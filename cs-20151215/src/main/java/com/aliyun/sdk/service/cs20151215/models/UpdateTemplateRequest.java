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
         * <p>The ID of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>72d20cf8-a533-4ea9-a10d-e7630d3d2708</p>
         */
        public Builder templateId(String templateId) {
            this.putPathParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>web server cluster</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>webserver01</p>
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
         * <p>web</p>
         */
        public Builder tags(String tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The YAML content of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>apiVersion: apps/v1\nkind: Deployment\nmetadata:\n  name: nginx-deployment-basic\n  labels:\n    app: nginx\nspec:\n  replicas: 2\n  selector:\n    matchLabels:\n      app: nginx\n  template:\n    metadata:\n      labels:\n        app: nginx\n    spec:\n      containers:\n      - name: nginx\n        image: busybox:latest\n        ports:\n        - containerPort: 8080</p>
         */
        public Builder template(String template) {
            this.putBodyParameter("template", template);
            this.template = template;
            return this;
        }

        /**
         * <p>The type of template. This parameter can be set to a custom value.</p>
         * <ul>
         * <li>If the parameter is set to <code>kubernetes</code>, the template is displayed on the Templates page in the console.</li>
         * <li>If the parameter is set to <code>compose</code>, the template is displayed on the Container Service - Swarm page in the console. Container Service for Swarm is deprecated.</li>
         * </ul>
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
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
