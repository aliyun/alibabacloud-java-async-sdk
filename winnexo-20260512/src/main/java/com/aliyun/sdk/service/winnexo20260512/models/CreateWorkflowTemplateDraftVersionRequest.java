// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.winnexo20260512.models;

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
 * {@link CreateWorkflowTemplateDraftVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkflowTemplateDraftVersionRequest</p>
 */
public class CreateWorkflowTemplateDraftVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    @com.aliyun.core.annotation.Validation(required = true)
    private String version;

    private CreateWorkflowTemplateDraftVersionRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowTemplateDraftVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<CreateWorkflowTemplateDraftVersionRequest, Builder> {
        private String collaborationGroupId; 
        private String templateId; 
        private String tenantId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkflowTemplateDraftVersionRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
            this.version = request.version;
        } 

        /**
         * <p>The ID of the collaboration workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>group_example</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The ID of the template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl_example</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The version number of the template on which the edit is based. The format is a lowercase v followed by a positive integer, such as v1. A draft version is returned as-is.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        @Override
        public CreateWorkflowTemplateDraftVersionRequest build() {
            return new CreateWorkflowTemplateDraftVersionRequest(this);
        } 

    } 

}
