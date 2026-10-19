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
         * <p>Workflow 必填验收标准</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>完成全部审批节点并产出报告</p>
         */
        public Builder acceptanceCriteria(String acceptanceCriteria) {
            this.putBodyParameter("acceptanceCriteria", acceptanceCriteria);
            this.acceptanceCriteria = acceptanceCriteria;
            return this;
        }

        /**
         * <p>空间内唯一需求编号，重复请求幂等</p>
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
         * <p>协作空间 ID</p>
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
         * <p>外部发起人展示标签</p>
         * 
         * <strong>example:</strong>
         * <p>外部发起人张三</p>
         */
        public Builder initiator(String initiator) {
            this.putBodyParameter("initiator", initiator);
            this.initiator = initiator;
            return this;
        }

        /**
         * <p>工作项优先级</p>
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
         * <p>工作流模板 ID，最多 64 字符</p>
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
         * <p>租户ID，公共参数；winnexo-cli 通过 --tenant-id 显式传入</p>
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
         * <p>需求标题</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>季度经营分析报告</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>业务变量对象，tags 可为字符串标签列表</p>
         * 
         * <strong>example:</strong>
         * <p>tags=季度报告</p>
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
