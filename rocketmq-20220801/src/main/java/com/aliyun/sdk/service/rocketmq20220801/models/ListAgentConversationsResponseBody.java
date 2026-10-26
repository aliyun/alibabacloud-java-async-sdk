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
 * {@link ListAgentConversationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentConversationsResponseBody</p>
 */
public class ListAgentConversationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    private ListAgentConversationsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentConversationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String nextToken; 

        private Builder() {
        } 

        private Builder(ListAgentConversationsResponseBody model) {
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        public ListAgentConversationsResponseBody build() {
            return new ListAgentConversationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentConversationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentConversationsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("access")
        private Object access;

        @com.aliyun.core.annotation.NameInMap("agent")
        private Object agent;

        @com.aliyun.core.annotation.NameInMap("analysisCoverage")
        private Object analysisCoverage;

        @com.aliyun.core.annotation.NameInMap("conversationId")
        private String conversationId;

        @com.aliyun.core.annotation.NameInMap("createdAt")
        private String createdAt;

        @com.aliyun.core.annotation.NameInMap("createdBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("currentRunStatus")
        private String currentRunStatus;

        @com.aliyun.core.annotation.NameInMap("editMonitorId")
        private String editMonitorId;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("owner")
        private Object owner;

        @com.aliyun.core.annotation.NameInMap("project")
        private Object project;

        @com.aliyun.core.annotation.NameInMap("scenarioId")
        private String scenarioId;

        @com.aliyun.core.annotation.NameInMap("shareScope")
        private String shareScope;

        @com.aliyun.core.annotation.NameInMap("sourceSessionId")
        private String sourceSessionId;

        @com.aliyun.core.annotation.NameInMap("tagging")
        private Object tagging;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("toolCallCount")
        private Long toolCallCount;

        @com.aliyun.core.annotation.NameInMap("updatedAt")
        private String updatedAt;

        @com.aliyun.core.annotation.NameInMap("usedSkills")
        private java.util.List<String> usedSkills;

        private Data(Builder builder) {
            this.access = builder.access;
            this.agent = builder.agent;
            this.analysisCoverage = builder.analysisCoverage;
            this.conversationId = builder.conversationId;
            this.createdAt = builder.createdAt;
            this.createdBy = builder.createdBy;
            this.currentRunStatus = builder.currentRunStatus;
            this.editMonitorId = builder.editMonitorId;
            this.id = builder.id;
            this.owner = builder.owner;
            this.project = builder.project;
            this.scenarioId = builder.scenarioId;
            this.shareScope = builder.shareScope;
            this.sourceSessionId = builder.sourceSessionId;
            this.tagging = builder.tagging;
            this.title = builder.title;
            this.toolCallCount = builder.toolCallCount;
            this.updatedAt = builder.updatedAt;
            this.usedSkills = builder.usedSkills;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return access
         */
        public Object getAccess() {
            return this.access;
        }

        /**
         * @return agent
         */
        public Object getAgent() {
            return this.agent;
        }

        /**
         * @return analysisCoverage
         */
        public Object getAnalysisCoverage() {
            return this.analysisCoverage;
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
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return currentRunStatus
         */
        public String getCurrentRunStatus() {
            return this.currentRunStatus;
        }

        /**
         * @return editMonitorId
         */
        public String getEditMonitorId() {
            return this.editMonitorId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return owner
         */
        public Object getOwner() {
            return this.owner;
        }

        /**
         * @return project
         */
        public Object getProject() {
            return this.project;
        }

        /**
         * @return scenarioId
         */
        public String getScenarioId() {
            return this.scenarioId;
        }

        /**
         * @return shareScope
         */
        public String getShareScope() {
            return this.shareScope;
        }

        /**
         * @return sourceSessionId
         */
        public String getSourceSessionId() {
            return this.sourceSessionId;
        }

        /**
         * @return tagging
         */
        public Object getTagging() {
            return this.tagging;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return toolCallCount
         */
        public Long getToolCallCount() {
            return this.toolCallCount;
        }

        /**
         * @return updatedAt
         */
        public String getUpdatedAt() {
            return this.updatedAt;
        }

        /**
         * @return usedSkills
         */
        public java.util.List<String> getUsedSkills() {
            return this.usedSkills;
        }

        public static final class Builder {
            private Object access; 
            private Object agent; 
            private Object analysisCoverage; 
            private String conversationId; 
            private String createdAt; 
            private String createdBy; 
            private String currentRunStatus; 
            private String editMonitorId; 
            private String id; 
            private Object owner; 
            private Object project; 
            private String scenarioId; 
            private String shareScope; 
            private String sourceSessionId; 
            private Object tagging; 
            private String title; 
            private Long toolCallCount; 
            private String updatedAt; 
            private java.util.List<String> usedSkills; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.access = model.access;
                this.agent = model.agent;
                this.analysisCoverage = model.analysisCoverage;
                this.conversationId = model.conversationId;
                this.createdAt = model.createdAt;
                this.createdBy = model.createdBy;
                this.currentRunStatus = model.currentRunStatus;
                this.editMonitorId = model.editMonitorId;
                this.id = model.id;
                this.owner = model.owner;
                this.project = model.project;
                this.scenarioId = model.scenarioId;
                this.shareScope = model.shareScope;
                this.sourceSessionId = model.sourceSessionId;
                this.tagging = model.tagging;
                this.title = model.title;
                this.toolCallCount = model.toolCallCount;
                this.updatedAt = model.updatedAt;
                this.usedSkills = model.usedSkills;
            } 

            /**
             * access.
             */
            public Builder access(Object access) {
                this.access = access;
                return this;
            }

            /**
             * agent.
             */
            public Builder agent(Object agent) {
                this.agent = agent;
                return this;
            }

            /**
             * analysisCoverage.
             */
            public Builder analysisCoverage(Object analysisCoverage) {
                this.analysisCoverage = analysisCoverage;
                return this;
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
             * createdBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
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
             * editMonitorId.
             */
            public Builder editMonitorId(String editMonitorId) {
                this.editMonitorId = editMonitorId;
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
             * owner.
             */
            public Builder owner(Object owner) {
                this.owner = owner;
                return this;
            }

            /**
             * project.
             */
            public Builder project(Object project) {
                this.project = project;
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
             * shareScope.
             */
            public Builder shareScope(String shareScope) {
                this.shareScope = shareScope;
                return this;
            }

            /**
             * sourceSessionId.
             */
            public Builder sourceSessionId(String sourceSessionId) {
                this.sourceSessionId = sourceSessionId;
                return this;
            }

            /**
             * tagging.
             */
            public Builder tagging(Object tagging) {
                this.tagging = tagging;
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
             * toolCallCount.
             */
            public Builder toolCallCount(Long toolCallCount) {
                this.toolCallCount = toolCallCount;
                return this;
            }

            /**
             * updatedAt.
             */
            public Builder updatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
                return this;
            }

            /**
             * usedSkills.
             */
            public Builder usedSkills(java.util.List<String> usedSkills) {
                this.usedSkills = usedSkills;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
