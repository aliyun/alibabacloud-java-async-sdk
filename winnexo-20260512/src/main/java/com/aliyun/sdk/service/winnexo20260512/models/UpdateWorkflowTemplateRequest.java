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
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("definition")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.Map<String, ?> definition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    private UpdateWorkflowTemplateRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.definition = builder.definition;
        this.templateId = builder.templateId;
        this.tenantId = builder.tenantId;
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

    public static final class Builder extends Request.Builder<UpdateWorkflowTemplateRequest, Builder> {
        private String collaborationGroupId; 
        private java.util.Map<String, ?> definition; 
        private String templateId; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkflowTemplateRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.definition = request.definition;
            this.templateId = request.templateId;
            this.tenantId = request.tenantId;
        } 

        /**
         * <p>协作空间 ID</p>
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
         * <p>完整模板定义 JSON（整体覆盖）</p>
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
         * <p>模板 ID</p>
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
         * <p>租户ID，公共参数；缺省时使用调用方默认租户</p>
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
        public UpdateWorkflowTemplateRequest build() {
            return new UpdateWorkflowTemplateRequest(this);
        } 

    } 

}
