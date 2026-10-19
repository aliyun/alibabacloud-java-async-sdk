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
 * {@link CreateWorkItemRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkItemRequest</p>
 */
public class CreateWorkItemRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("acceptanceCriteria")
    private String acceptanceCriteria;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("attachments")
    private java.util.List<Attachments> attachments;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaboratorUserIds")
    private java.util.List<Long> collaboratorUserIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("itemType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ownerUserId")
    private Long ownerUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("priority")
    private String priority;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("title")
    @com.aliyun.core.annotation.Validation(required = true)
    private String title;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workflowTemplateIds")
    private java.util.List<String> workflowTemplateIds;

    private CreateWorkItemRequest(Builder builder) {
        super(builder);
        this.acceptanceCriteria = builder.acceptanceCriteria;
        this.attachments = builder.attachments;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.collaboratorUserIds = builder.collaboratorUserIds;
        this.conversationId = builder.conversationId;
        this.description = builder.description;
        this.itemType = builder.itemType;
        this.ownerUserId = builder.ownerUserId;
        this.priority = builder.priority;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.workflowTemplateIds = builder.workflowTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkItemRequest create() {
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
     * @return attachments
     */
    public java.util.List<Attachments> getAttachments() {
        return this.attachments;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return collaboratorUserIds
     */
    public java.util.List<Long> getCollaboratorUserIds() {
        return this.collaboratorUserIds;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * @return ownerUserId
     */
    public Long getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
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
     * @return workflowTemplateIds
     */
    public java.util.List<String> getWorkflowTemplateIds() {
        return this.workflowTemplateIds;
    }

    public static final class Builder extends Request.Builder<CreateWorkItemRequest, Builder> {
        private String acceptanceCriteria; 
        private java.util.List<Attachments> attachments; 
        private String collaborationGroupId; 
        private java.util.List<Long> collaboratorUserIds; 
        private String conversationId; 
        private String description; 
        private String itemType; 
        private Long ownerUserId; 
        private String priority; 
        private String tenantId; 
        private String title; 
        private java.util.List<String> workflowTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkItemRequest request) {
            super(request);
            this.acceptanceCriteria = request.acceptanceCriteria;
            this.attachments = request.attachments;
            this.collaborationGroupId = request.collaborationGroupId;
            this.collaboratorUserIds = request.collaboratorUserIds;
            this.conversationId = request.conversationId;
            this.description = request.description;
            this.itemType = request.itemType;
            this.ownerUserId = request.ownerUserId;
            this.priority = request.priority;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.workflowTemplateIds = request.workflowTemplateIds;
        } 

        /**
         * <p>验收标准</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder acceptanceCriteria(String acceptanceCriteria) {
            this.putBodyParameter("acceptanceCriteria", acceptanceCriteria);
            this.acceptanceCriteria = acceptanceCriteria;
            return this;
        }

        /**
         * <p>输入附件稳定引用</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder attachments(java.util.List<Attachments> attachments) {
            String attachmentsShrink = shrink(attachments, "attachments", "json");
            this.putBodyParameter("attachments", attachmentsShrink);
            this.attachments = attachments;
            return this;
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
         * <p>协作人用户ID列表</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder collaboratorUserIds(java.util.List<Long> collaboratorUserIds) {
            String collaboratorUserIdsShrink = shrink(collaboratorUserIds, "collaboratorUserIds", "json");
            this.putBodyParameter("collaboratorUserIds", collaboratorUserIdsShrink);
            this.collaboratorUserIds = collaboratorUserIds;
            return this;
        }

        /**
         * <p>关联会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("conversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>工作项描述</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>工作项类型；仅接受 WORKFLOW</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WORKFLOW</p>
         */
        public Builder itemType(String itemType) {
            this.putBodyParameter("itemType", itemType);
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>负责人用户ID；缺省为调用者本人</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder ownerUserId(Long ownerUserId) {
            this.putBodyParameter("ownerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>排产优先级</p>
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

        /**
         * <p>工作项标题</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder title(String title) {
            this.putBodyParameter("title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>绑定的工作流模板ID列表</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder workflowTemplateIds(java.util.List<String> workflowTemplateIds) {
            String workflowTemplateIdsShrink = shrink(workflowTemplateIds, "workflowTemplateIds", "json");
            this.putBodyParameter("workflowTemplateIds", workflowTemplateIdsShrink);
            this.workflowTemplateIds = workflowTemplateIds;
            return this;
        }

        @Override
        public CreateWorkItemRequest build() {
            return new CreateWorkItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkItemRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkItemRequest</p>
     */
    public static class Attachments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("refUrl")
        private String refUrl;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resourceKind")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceKind;

        @com.aliyun.core.annotation.NameInMap("sizeBytes")
        private Long sizeBytes;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        private Attachments(Builder builder) {
            this.contentType = builder.contentType;
            this.refUrl = builder.refUrl;
            this.resourceId = builder.resourceId;
            this.resourceKind = builder.resourceKind;
            this.sizeBytes = builder.sizeBytes;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attachments create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return refUrl
         */
        public String getRefUrl() {
            return this.refUrl;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceKind
         */
        public String getResourceKind() {
            return this.resourceKind;
        }

        /**
         * @return sizeBytes
         */
        public Long getSizeBytes() {
            return this.sizeBytes;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String contentType; 
            private String refUrl; 
            private String resourceId; 
            private String resourceKind; 
            private Long sizeBytes; 
            private String title; 

            private Builder() {
            } 

            private Builder(Attachments model) {
                this.contentType = model.contentType;
                this.refUrl = model.refUrl;
                this.resourceId = model.resourceId;
                this.resourceKind = model.resourceKind;
                this.sizeBytes = model.sizeBytes;
                this.title = model.title;
            } 

            /**
             * <p>内容类型</p>
             * 
             * <strong>example:</strong>
             * <p>application/pdf</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>附件引用地址</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder refUrl(String refUrl) {
                this.refUrl = refUrl;
                return this;
            }

            /**
             * <p>附件资源ID</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>res_example</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>附件资源类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>attachment</p>
             */
            public Builder resourceKind(String resourceKind) {
                this.resourceKind = resourceKind;
                return this;
            }

            /**
             * <p>附件大小(字节)，上限 20MB</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>附件标题</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Attachments build() {
                return new Attachments(this);
            } 

        } 

    }
}
