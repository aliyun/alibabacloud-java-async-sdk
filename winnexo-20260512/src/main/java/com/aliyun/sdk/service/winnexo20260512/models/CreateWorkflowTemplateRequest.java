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
 * {@link CreateWorkflowTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkflowTemplateRequest</p>
 */
public class CreateWorkflowTemplateRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private CreateWorkflowTemplateRequest(Builder builder) {
        super(builder);
        this.action = builder.action;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.definition = builder.definition;
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkflowTemplateRequest create() {
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
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<CreateWorkflowTemplateRequest, Builder> {
        private String action; 
        private String collaborationGroupId; 
        private java.util.Map<String, ?> definition; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkflowTemplateRequest request) {
            super(request);
            this.action = request.action;
            this.collaborationGroupId = request.collaborationGroupId;
            this.definition = request.definition;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>The write action. Valid values: SAVE: Saves the template as a draft without taking effect. SUBMIT: Saves and submits the template and sets it as the only effective version. Default value: SUBMIT.</p>
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
         * <p>The complete JSON definition of the template, including name, description, and steps.</p>
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

        @Override
        public CreateWorkflowTemplateRequest build() {
            return new CreateWorkflowTemplateRequest(this);
        } 

    } 

}
