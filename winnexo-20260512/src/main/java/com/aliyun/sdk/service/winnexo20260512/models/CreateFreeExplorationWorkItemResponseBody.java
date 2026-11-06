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
 * {@link CreateFreeExplorationWorkItemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFreeExplorationWorkItemResponseBody</p>
 */
public class CreateFreeExplorationWorkItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("agentNames")
    private java.util.List<String> agentNames;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("collaborationGroupId")
    private String collaborationGroupId;

    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("createdByUserId")
    private Long createdByUserId;

    @com.aliyun.core.annotation.NameInMap("itemType")
    private String itemType;

    @com.aliyun.core.annotation.NameInMap("memberUserIds")
    private java.util.List<Long> memberUserIds;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("visibility")
    private String visibility;

    private CreateFreeExplorationWorkItemResponseBody(Builder builder) {
        this.agentNames = builder.agentNames;
        this.code = builder.code;
        this.collaborationGroupId = builder.collaborationGroupId;
        this.conversationId = builder.conversationId;
        this.createdByUserId = builder.createdByUserId;
        this.itemType = builder.itemType;
        this.memberUserIds = builder.memberUserIds;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.title = builder.title;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFreeExplorationWorkItemResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentNames
     */
    public java.util.List<String> getAgentNames() {
        return this.agentNames;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return collaborationGroupId
     */
    public String getCollaborationGroupId() {
        return this.collaborationGroupId;
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return createdByUserId
     */
    public Long getCreatedByUserId() {
        return this.createdByUserId;
    }

    /**
     * @return itemType
     */
    public String getItemType() {
        return this.itemType;
    }

    /**
     * @return memberUserIds
     */
    public java.util.List<Long> getMemberUserIds() {
        return this.memberUserIds;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return visibility
     */
    public String getVisibility() {
        return this.visibility;
    }

    public static final class Builder {
        private java.util.List<String> agentNames; 
        private String code; 
        private String collaborationGroupId; 
        private String conversationId; 
        private Long createdByUserId; 
        private String itemType; 
        private java.util.List<Long> memberUserIds; 
        private String message; 
        private String requestId; 
        private String title; 
        private String visibility; 

        private Builder() {
        } 

        private Builder(CreateFreeExplorationWorkItemResponseBody model) {
            this.agentNames = model.agentNames;
            this.code = model.code;
            this.collaborationGroupId = model.collaborationGroupId;
            this.conversationId = model.conversationId;
            this.createdByUserId = model.createdByUserId;
            this.itemType = model.itemType;
            this.memberUserIds = model.memberUserIds;
            this.message = model.message;
            this.requestId = model.requestId;
            this.title = model.title;
            this.visibility = model.visibility;
        } 

        /**
         * <p>已选择的数字员工技术名称</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sales-agent&quot;]</p>
         */
        public Builder agentNames(java.util.List<String> agentNames) {
            this.agentNames = agentNames;
            return this;
        }

        /**
         * <p>业务状态码，成功为200</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>所属协作空间 ID</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>真实群话题 ID，可在 queryWorkItemFeed 中关联；不可作为 Workflow workItemId</p>
         * 
         * <strong>example:</strong>
         * <p>conv_20261105_9f2c</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>平台创建人用户 ID</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder createdByUserId(Long createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }

        /**
         * <p>工作项模式，固定 FREE_EXPLORATION</p>
         * 
         * <strong>example:</strong>
         * <p>FREE_EXPLORATION</p>
         */
        public Builder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>实际话题成员，含创建人；公开档不枚举全空间成员</p>
         * 
         * <strong>example:</strong>
         * <p>[43]</p>
         */
        public Builder memberUserIds(java.util.List<Long> memberUserIds) {
            this.memberUserIds = memberUserIds;
            return this;
        }

        /**
         * <p>错误描述</p>
         * 
         * <strong>example:</strong>
         * <p>请求的资源不存在</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>请求追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>工作项标题</p>
         * 
         * <strong>example:</strong>
         * <p>调查销售机会</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>实际可见范围 PRIVATE/COLLABORATIVE/PUBLIC</p>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder visibility(String visibility) {
            this.visibility = visibility;
            return this;
        }

        public CreateFreeExplorationWorkItemResponseBody build() {
            return new CreateFreeExplorationWorkItemResponseBody(this);
        } 

    } 

}
