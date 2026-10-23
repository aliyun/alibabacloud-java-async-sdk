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
 * {@link UpdateWorkflowTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkflowTemplateRequest</p>
 */
public class UpdateWorkflowTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> definition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sourceVersion")
    private String sourceVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("version")
    private String version;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("versionDescription")
    @com.aliyun.core.annotation.Validation(maxLength = 500)
    private String versionDescription;

    private UpdateWorkflowTemplateRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.definition = builder.definition;
        this.sourceVersion = builder.sourceVersion;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
        this.version = builder.version;
        this.versionDescription = builder.versionDescription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkflowTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return definition
     */
    public java.util.Map<String, ?> getDefinition() {
        return this.definition;
    }

    /**
     * @return sourceVersion
     */
    public String getSourceVersion() {
        return this.sourceVersion;
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

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    public static final class Builder extends Request.Builder<UpdateWorkflowTemplateRequest, Builder> {
        private String action; 
        private String collaborationGroupId; 
        private java.util.Map<String, ?> definition; 
        private String sourceVersion; 
        private String templateId; 
        private String tenantId; 
        private String version; 
        private String versionDescription; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowTemplateRequest request) {
            super(request);
            this.action = request.action;
            this.collaborationGroupId = request.collaborationGroupId;
            this.definition = request.definition;
            this.sourceVersion = request.sourceVersion;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
            this.version = request.version;
            this.versionDescription = request.versionDescription;
        } 

        /**
         * <p>The write action. Valid values:</p>
         * <ul>
         * <li>SAVE: Saves the template as a draft without taking effect.</li>
         * <li>SUBMIT: Saves and submits the template, setting it as the only effective version.
         * Default value: SUBMIT.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUBMIT</p>
         */
        public Builder action(String action) {
            this.putBodyParameter("action", action);
            this.action = action;
            return this;
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
         * <p>The complete JSON definition of the template to overwrite the existing one.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder definition(java.util.Map<String, ?> definition) {
            String definitionShrink = shrink(definition, "definition", "json");
            this.putBodyParameter("definition", definitionShrink);
            this.definition = definition;
            return this;
        }

        /**
         * <p>The submitted version number on which the new version is based. This parameter is mutually exclusive with the version parameter. If not specified, the current effective version is used as the fallback.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder sourceVersion(String sourceVersion) {
            this.putBodyParameter("sourceVersion", sourceVersion);
            this.sourceVersion = sourceVersion;
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
         * <p>The tenant ID. This is a common parameter. If not specified, the default tenant of the caller is used.</p>
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
         * <p>The draft template version number to write. The format is a lowercase v followed by a positive integer, such as v1. Submitted versions cannot be written. If not specified, a new version is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder version(String version) {
            this.putBodyParameter("version", version);
            this.version = version;
            return this;
        }

        /**
         * <p>The version description. The maximum length is 500 characters. When writing a draft, if this parameter is not specified or is null, the original value is retained. An empty string clears the value.</p>
         * 
         * <strong>example:</strong>
         * <p>Add a review step</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("versionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        @Override
        public UpdateWorkflowTemplateRequest build() {
            return new UpdateWorkflowTemplateRequest(this);
        } 

    } 

}
