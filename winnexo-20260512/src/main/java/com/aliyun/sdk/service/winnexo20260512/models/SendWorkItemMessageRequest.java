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
 * {@link SendWorkItemMessageRequest} extends {@link RequestModel}
 *
 * <p>SendWorkItemMessageRequest</p>
 */
public class SendWorkItemMessageRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String collaborationGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workItemId")
    private String workItemId;

    private SendWorkItemMessageRequest(Builder builder) {
        super(builder);
        this.collaborationGroupId = builder.collaborationGroupId;
        this.content = builder.content;
        this.conversationId = builder.conversationId;
        this.tenantId = builder.tenantId;
        this.workItemId = builder.workItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendWorkItemMessageRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return workItemId
     */
    public String getWorkItemId() {
        return this.workItemId;
    }

    public static final class Builder extends Request.Builder<SendWorkItemMessageRequest, Builder> {
        private String collaborationGroupId; 
        private String content; 
        private String conversationId; 
        private String tenantId; 
        private String workItemId; 

        private Builder() {
            super();
        } 

        private Builder(SendWorkItemMessageRequest request) {
            super(request);
            this.collaborationGroupId = request.collaborationGroupId;
            this.content = request.content;
            this.conversationId = request.conversationId;
            this.tenantId = request.tenantId;
            this.workItemId = request.workItemId;
        } 

        /**
         * <p>The ID of the collaboration space.</p>
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
         * <p>The body of the user message. The value cannot be empty and can be up to 32,768 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Compile a list of next steps based on the previous discussion</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The conversation ID returned by the API operation for creating a free exploration. You must specify at least one of this parameter and workItemId. If both are specified, they must match.</p>
         * 
         * <strong>example:</strong>
         * <p>01234567-89ab-4def-8123-456789abcdef</p>
         */
        public Builder conversationId(String conversationId) {
            this.putBodyParameter("conversationId", conversationId);
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The tenant ID. If not specified, the default tenant of the caller is used.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("tenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The ID of the free exploration work item. This parameter is compatible with the legacy-topic:<conversationId> format. You must specify at least one of workItemId and conversationId. If both are specified, they must point to the same session.</p>
         * 
         * <strong>example:</strong>
         * <p>wi_0123456789abcdef0123456789abcdef</p>
         */
        public Builder workItemId(String workItemId) {
            this.putBodyParameter("workItemId", workItemId);
            this.workItemId = workItemId;
            return this;
        }

        @Override
        public SendWorkItemMessageRequest build() {
            return new SendWorkItemMessageRequest(this);
        } 

    } 

}
