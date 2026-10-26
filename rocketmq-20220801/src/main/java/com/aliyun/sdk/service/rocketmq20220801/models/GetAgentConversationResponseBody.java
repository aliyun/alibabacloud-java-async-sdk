// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link GetAgentConversationResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentConversationResponseBody</p>
 */
public class GetAgentConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("currentRunStatus")
    private String currentRunStatus;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("pendingTool")
    private Object pendingTool;

    @com.aliyun.core.annotation.NameInMap("scenarioId")
    private String scenarioId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private GetAgentConversationResponseBody(Builder builder) {
        this.conversationId = builder.conversationId;
        this.createdAt = builder.createdAt;
        this.currentRunStatus = builder.currentRunStatus;
        this.id = builder.id;
        this.pendingTool = builder.pendingTool;
        this.scenarioId = builder.scenarioId;
        this.title = builder.title;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentConversationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversationId
     */
    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * @return createdAt
     */
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return currentRunStatus
     */
    public String getCurrentRunStatus() {
        return this.currentRunStatus;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return pendingTool
     */
    public Object getPendingTool() {
        return this.pendingTool;
    }

    /**
     * @return scenarioId
     */
    public String getScenarioId() {
        return this.scenarioId;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static final class Builder {
        private String conversationId; 
        private String createdAt; 
        private String currentRunStatus; 
        private String id; 
        private Object pendingTool; 
        private String scenarioId; 
        private String title; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(GetAgentConversationResponseBody model) {
            this.conversationId = model.conversationId;
            this.createdAt = model.createdAt;
            this.currentRunStatus = model.currentRunStatus;
            this.id = model.id;
            this.pendingTool = model.pendingTool;
            this.scenarioId = model.scenarioId;
            this.title = model.title;
            this.updatedAt = model.updatedAt;
        } 

        /**
         * conversationId.
         */
        public Builder conversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * currentRunStatus.
         */
        public Builder currentRunStatus(String currentRunStatus) {
            this.currentRunStatus = currentRunStatus;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * pendingTool.
         */
        public Builder pendingTool(Object pendingTool) {
            this.pendingTool = pendingTool;
            return this;
        }

        /**
         * scenarioId.
         */
        public Builder scenarioId(String scenarioId) {
            this.scenarioId = scenarioId;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public GetAgentConversationResponseBody build() {
            return new GetAgentConversationResponseBody(this);
        } 

    } 

}
