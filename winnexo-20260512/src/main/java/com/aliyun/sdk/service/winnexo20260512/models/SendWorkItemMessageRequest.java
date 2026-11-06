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
         * <p>目标会话所属的协作空间ID，必填，长度1至64，不能为空白。调用者须具有目标话题的查看和发送权限。</p>
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
         * <p>用户发送的文本正文，必填，长度1至32768，不能全为空白；保留原有文本格式。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>请根据刚才的讨论整理下一步行动清单。</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>已有自由探索话题的会话ID，长度1至128，可使用创建自由探索接口返回的conversation_id。与workItemId至少传一个，同时传入时须指向同一会话。</p>
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
         * <p>业务租户ID，可选。必须属于当前调用身份的可访问租户；无权访问时拒绝请求。未传时按现有鉴权规则解析租户，多租户用户无法唯一确定时需显式指定。</p>
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
         * <p>自由探索工作项ID，长度1至256；兼容legacy-topic:<conversationId>形式。与conversationId至少传一个，同时传入时须指向同一会话。普通工作项必须为FREE_EXPLORATION类型。</p>
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
