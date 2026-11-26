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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("appToken")
    private String appToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> definition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserCode")
    private String opsUserCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("opsUserId")
    private String opsUserId;

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
        this.appToken = builder.appToken;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.definition = builder.definition;
        this.opsUserCode = builder.opsUserCode;
        this.opsUserId = builder.opsUserId;
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
     * @return appToken
     */
    public String getAppToken() {
        return this.appToken;
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
     * @return opsUserCode
     */
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    /**
     * @return opsUserId
     */
    public String getOpsUserId() {
        return this.opsUserId;
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
        private String appToken; 
        private String collaborationGroupId; 
        private java.util.Map<String, ?> definition; 
        private String opsUserCode; 
        private String opsUserId; 
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
            this.appToken = request.appToken;
            this.collaborationGroupId = request.collaborationGroupId;
            this.definition = request.definition;
            this.opsUserCode = request.opsUserCode;
            this.opsUserId = request.opsUserId;
            this.sourceVersion = request.sourceVersion;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
            this.version = request.version;
            this.versionDescription = request.versionDescription;
        } 

        /**
         * <p>The write action. Valid values: SAVE (saves the template as a draft without taking effect, and allows node names and executors to be left empty) and SUBMIT (requires complete nodes, and saves and submits the template as the only effective version). Default value: SUBMIT.</p>
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
         * <p>The platform application token issued by the console. If specified, the operation is executed as the user specified by opsUserId or opsUserCode.</p>
         * 
         * <strong>example:</strong>
         * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
         */
        public Builder appToken(String appToken) {
            this.putQueryParameter("appToken", appToken);
            this.appToken = appToken;
            return this;
        }

        /**
         * <p>The collaboration workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The complete JSON definition of the template for full overwriting.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;Customer Complaint Handling Process&quot;,&quot;schemaVersion&quot;:2,&quot;steps&quot;:[{&quot;stepId&quot;:&quot;collect&quot;,&quot;sortOrder&quot;:1,&quot;name&quot;:&quot;Collect Customer Information&quot;,&quot;specification&quot;:[{&quot;type&quot;:&quot;text&quot;,&quot;content&quot;:&quot;Collect Customer Information&quot;}],&quot;executorType&quot;:&quot;MEMBER&quot;,&quot;executorUserId&quot;:10086}],&quot;edges&quot;:[]}</p>
         */
        public Builder definition(java.util.Map<String, ?> definition) {
            String definitionShrink = shrink(definition, "definition", "json");
            this.putBodyParameter("definition", definitionShrink);
            this.definition = definition;
            return this;
        }

        /**
         * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder opsUserCode(String opsUserCode) {
            this.putQueryParameter("opsUserCode", opsUserCode);
            this.opsUserCode = opsUserCode;
            return this;
        }

        /**
         * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder opsUserId(String opsUserId) {
            this.putQueryParameter("opsUserId", opsUserId);
            this.opsUserId = opsUserId;
            return this;
        }

        /**
         * <p>The submitted version number on which the new version is based. This parameter is mutually exclusive with version. If not specified, the current effective version is used as the fallback.</p>
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
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl_9401</p>
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
         * <p>The version number to which the returned content belongs.</p>
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
         * <p>The change description for this version. An empty value indicates that no description is provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Added review step</p>
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
