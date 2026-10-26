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
 * {@link CreateAgentConversationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAgentConversationResponseBody</p>
 */
public class CreateAgentConversationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conversationId")
    private String conversationId;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private String createdAt;

    @com.aliyun.core.annotation.NameInMap("currentRunStatus")
    private String currentRunStatus;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("runId")
    private String runId;

    @com.aliyun.core.annotation.NameInMap("scenarioId")
    private String scenarioId;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private String updatedAt;

    private CreateAgentConversationResponseBody(Builder builder) {
        this.conversationId = builder.conversationId;
        this.createdAt = builder.createdAt;
        this.currentRunStatus = builder.currentRunStatus;
        this.id = builder.id;
        this.runId = builder.runId;
        this.scenarioId = builder.scenarioId;
        this.title = builder.title;
        this.updatedAt = builder.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAgentConversationResponseBody create() {
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
     * @return runId
     */
    public String getRunId() {
        return this.runId;
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
        private String runId; 
        private String scenarioId; 
        private String title; 
        private String updatedAt; 

        private Builder() {
        } 

        private Builder(CreateAgentConversationResponseBody model) {
            this.conversationId = model.conversationId;
            this.createdAt = model.createdAt;
            this.currentRunStatus = model.currentRunStatus;
            this.id = model.id;
            this.runId = model.runId;
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
         * runId.
         */
        public Builder runId(String runId) {
            this.runId = runId;
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

        public CreateAgentConversationResponseBody build() {
            return new CreateAgentConversationResponseBody(this);
        } 

    } 

}
