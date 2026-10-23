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
 * {@link CreateWorkflowInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkflowInstanceRequest</p>
 */
public class CreateWorkflowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("acceptanceCriteria")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 10000, minLength = 1)
    private String acceptanceCriteria;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("businessId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String businessId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("initiator")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 1)
    private String initiator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priority")
    private String priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 256, minLength = 1)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, ?> variables;

    private CreateWorkflowInstanceRequest(Builder builder) {
        super(builder);
        this.acceptanceCriteria = builder.acceptanceCriteria;
        this.businessId = builder.businessId;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.initiator = builder.initiator;
        this.priority = builder.priority;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptanceCriteria
     */
    public String getAcceptanceCriteria() {
        return this.acceptanceCriteria;
    }

    /**
     * @return businessId
     */
    public String getBusinessId() {
        return this.businessId;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return initiator
     */
    public String getInitiator() {
        return this.initiator;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
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
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, ?> getVariables() {
        return this.variables;
    }

    public static final class Builder extends Request.Builder<CreateWorkflowInstanceRequest, Builder> {
        private String acceptanceCriteria; 
        private String businessId; 
        private String collaborationGroupId; 
        private String initiator; 
        private String priority; 
        private String templateId; 
        private String tenantId; 
        private String title; 
        private java.util.Map<String, ?> variables; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkflowInstanceRequest request) {
            super(request);
            this.acceptanceCriteria = request.acceptanceCriteria;
            this.businessId = request.businessId;
            this.collaborationGroupId = request.collaborationGroupId;
            this.initiator = request.initiator;
            this.priority = request.priority;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.variables = request.variables;
        } 

        /**
         * <p>The required acceptance criteria for the workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Complete all approval nodes and generate the report</p>
         */
        public Builder acceptanceCriteria(String acceptanceCriteria) {
            this.putBodyParameter("acceptanceCriteria", acceptanceCriteria);
            this.acceptanceCriteria = acceptanceCriteria;
            return this;
        }

        /**
         * <p>The unique requirement ID in the workspace. Repeated requests are idempotent.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REQ-1001</p>
         */
        public Builder businessId(String businessId) {
            this.putBodyParameter("businessId", businessId);
            this.businessId = businessId;
            return this;
        }

        /**
         * <p>The collaboration workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_20261016_abc123</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.putBodyParameter("collaborationGroupId", collaborationGroupId);
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The display label of the external initiator.</p>
         * 
         * <strong>example:</strong>
         * <p>External Initiator Zhang San</p>
         */
        public Builder initiator(String initiator) {
            this.putBodyParameter("initiator", initiator);
            this.initiator = initiator;
            return this;
        }

        /**
         * <p>The work item priority.</p>
         * 
         * <strong>example:</strong>
         * <p>HIGH</p>
         */
        public Builder priority(String priority) {
            this.putBodyParameter("priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The workflow template ID. Maximum length: 64 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wft_20261016_abc123</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("templateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The tenant ID. This is a common parameter explicitly passed by using --tenant-id in winnexo-cli.</p>
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
         * <p>The requirement title.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Quarterly Business Analysis Report</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The business variable object. The tags field can be a list of string tags.</p>
         * 
         * <strong>example:</strong>
         * <p>tags=Quarterly Report</p>
         */
        public Builder variables(java.util.Map<String, ?> variables) {
            String variablesShrink = shrink(variables, "variables", "json");
            this.putBodyParameter("variables", variablesShrink);
            this.variables = variables;
            return this;
        }

        @Override
        public CreateWorkflowInstanceRequest build() {
            return new CreateWorkflowInstanceRequest(this);
        } 

    } 

}
