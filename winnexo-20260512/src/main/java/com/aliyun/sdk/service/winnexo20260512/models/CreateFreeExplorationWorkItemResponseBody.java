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
         * <p>The technical names of the selected digital workers.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;sales-agent&quot;]</p>
         */
        public Builder agentNames(java.util.List<String> agentNames) {
            this.agentNames = agentNames;
            return this;
        }

        /**
         * <p>The business status code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ID of the collaboration workspace to which the work item belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>cg_9401</p>
         */
        public Builder collaborationGroupId(String collaborationGroupId) {
            this.collaborationGroupId = collaborationGroupId;
            return this;
        }

        /**
         * <p>The actual group topic ID, which can be associated in queryWorkItemFeed. It cannot be used as a workItemId in Workflow.</p>
         * 
         * <strong>example:</strong>
         * <p>conv_20261105_9f2c</p>
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * <p>The user ID of the creator on the platform.</p>
         * 
         * <strong>example:</strong>
         * <p>10001</p>
         */
        public Builder createdByUserId(Long createdByUserId) {
            this.createdByUserId = createdByUserId;
            return this;
        }

        /**
         * <p>The work item mode. The value is fixed to FREE_EXPLORATION.</p>
         * 
         * <strong>example:</strong>
         * <p>FREE_EXPLORATION</p>
         */
        public Builder itemType(String itemType) {
            this.itemType = itemType;
            return this;
        }

        /**
         * <p>The actual members of the topic, including the creator. For public topics, members of the entire workspace are not enumerated.</p>
         * 
         * <strong>example:</strong>
         * <p>[43]</p>
         */
        public Builder memberUserIds(java.util.List<Long> memberUserIds) {
            this.memberUserIds = memberUserIds;
            return this;
        }

        /**
         * <p>The error description.</p>
         * 
         * <strong>example:</strong>
         * <p>The requested resource does not exist</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The title of the work item.</p>
         * 
         * <strong>example:</strong>
         * <p>Investigate sales opportunities</p>
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * <p>The actual visibility scope. Valid values: PRIVATE, COLLABORATIVE, and PUBLIC.</p>
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
