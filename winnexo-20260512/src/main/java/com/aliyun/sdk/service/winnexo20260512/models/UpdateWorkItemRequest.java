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
 * {@link UpdateWorkItemRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkItemRequest</p>
 */
public class UpdateWorkItemRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("expectedVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expectedVersion;

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
    @com.aliyun.core.annotation.NameInMap("workItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workflowTemplateIds")
    private java.util.List<String> workflowTemplateIds;

    private UpdateWorkItemRequest(Builder builder) {
        super(builder);
        this.acceptanceCriteria = builder.acceptanceCriteria;
        this.attachments = builder.attachments;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.collaboratorUserIds = builder.collaboratorUserIds;
        this.conversationId = builder.conversationId;
        this.description = builder.description;
        this.expectedVersion = builder.expectedVersion;
        this.ownerUserId = builder.ownerUserId;
        this.priority = builder.priority;
        this.tenantId = builder.tenantId;
        this.title = builder.title;
        this.workItemId = builder.workItemId;
        this.workflowTemplateIds = builder.workflowTemplateIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkItemRequest create() {
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
     * @return expectedVersion
     */
    public Long getExpectedVersion() {
        return this.expectedVersion;
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
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    /**
     * @return workflowTemplateIds
     */
    public java.util.List<String> getWorkflowTemplateIds() {
        return this.workflowTemplateIds;
    }

    public static final class Builder extends Request.Builder<UpdateWorkItemRequest, Builder> {
        private String acceptanceCriteria; 
        private java.util.List<Attachments> attachments; 
        private String collaborationGroupId; 
        private java.util.List<Long> collaboratorUserIds; 
        private String conversationId; 
        private String description; 
        private Long expectedVersion; 
        private Long ownerUserId; 
        private String priority; 
        private String tenantId; 
        private String title; 
        private String workItemId; 
        private java.util.List<String> workflowTemplateIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkItemRequest request) {
            super(request);
            this.acceptanceCriteria = request.acceptanceCriteria;
            this.attachments = request.attachments;
            this.collaborationGroupId = request.collaborationGroupId;
            this.collaboratorUserIds = request.collaboratorUserIds;
            this.conversationId = request.conversationId;
            this.description = request.description;
            this.expectedVersion = request.expectedVersion;
            this.ownerUserId = request.ownerUserId;
            this.priority = request.priority;
            this.tenantId = request.tenantId;
            this.title = request.title;
            this.workItemId = request.workItemId;
            this.workflowTemplateIds = request.workflowTemplateIds;
        } 

        /**
         * <p>The acceptance criteria.</p>
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
         * <p>The stable references for the attachments.</p>
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
         * <p>The ID of the collaboration space.</p>
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
         * <p>The list of user IDs of the collaborators.</p>
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
         * <p>The ID of the associated conversation.</p>
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
         * <p>The description of the work item.</p>
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
         * <p>The optimistic version number. Obtain this value from the version field in the previous response.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder expectedVersion(Long expectedVersion) {
            this.putBodyParameter("expectedVersion", expectedVersion);
            this.expectedVersion = expectedVersion;
            return this;
        }

        /**
         * <p>The user ID of the owner. If not specified, the user ID of the caller is used.</p>
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
         * <p>The scheduling priority.</p>
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
         * <p>The title of the work item.</p>
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
         * <p>The ID of the work item.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>wi_example</p>
         */
        public Builder workItemId(String workItemId) {
            this.putBodyParameter("workItemId", workItemId);
            this.workItemId = workItemId;
            return this;
        }

        /**
         * <p>The list of bound workflow template IDs. If not specified, the existing bindings are retained. If an empty array is provided, the bindings are cleared.</p>
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
        public UpdateWorkItemRequest build() {
            return new UpdateWorkItemRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkItemRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkItemRequest</p>
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
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>application/pdf</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The reference URL of the attachment.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder refUrl(String refUrl) {
                this.refUrl = refUrl;
                return this;
            }

            /**
             * <p>The resource ID of the attachment.</p>
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
             * <p>The resource type of the attachment.</p>
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
             * <p>The size of the attachment in bytes. The maximum size is 20 MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder sizeBytes(Long sizeBytes) {
                this.sizeBytes = sizeBytes;
                return this;
            }

            /**
             * <p>The title of the attachment.</p>
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
