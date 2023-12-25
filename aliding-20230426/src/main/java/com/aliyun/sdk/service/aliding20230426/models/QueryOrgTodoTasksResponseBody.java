// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrgTodoTasksResponseBody} extends {@link TeaModel}
 *
 * <p>QueryOrgTodoTasksResponseBody</p>
 */
public class QueryOrgTodoTasksResponseBody extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("todoCards")
    private java.util.List < TodoCards> todoCards;

    private QueryOrgTodoTasksResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.todoCards = builder.todoCards;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrgTodoTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return todoCards
     */
    public java.util.List < TodoCards> getTodoCards() {
        return this.todoCards;
    }

    public static final class Builder {
        private String nextToken; 
        private String requestId; 
        private java.util.List < TodoCards> todoCards; 

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * todoCards.
         */
        public Builder todoCards(java.util.List < TodoCards> todoCards) {
            this.todoCards = todoCards;
            return this;
        }

        public QueryOrgTodoTasksResponseBody build() {
            return new QueryOrgTodoTasksResponseBody(this);
        } 

    } 

    public static class DetailUrl extends TeaModel {
        @NameInMap("appUrl")
        private String appUrl;

        @NameInMap("pcUrl")
        private String pcUrl;

        private DetailUrl(Builder builder) {
            this.appUrl = builder.appUrl;
            this.pcUrl = builder.pcUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailUrl create() {
            return builder().build();
        }

        /**
         * @return appUrl
         */
        public String getAppUrl() {
            return this.appUrl;
        }

        /**
         * @return pcUrl
         */
        public String getPcUrl() {
            return this.pcUrl;
        }

        public static final class Builder {
            private String appUrl; 
            private String pcUrl; 

            /**
             * appUrl.
             */
            public Builder appUrl(String appUrl) {
                this.appUrl = appUrl;
                return this;
            }

            /**
             * pcUrl.
             */
            public Builder pcUrl(String pcUrl) {
                this.pcUrl = pcUrl;
                return this;
            }

            public DetailUrl build() {
                return new DetailUrl(this);
            } 

        } 

    }
    public static class TodoCards extends TeaModel {
        @NameInMap("bizTag")
        private String bizTag;

        @NameInMap("createdTime")
        private Long createdTime;

        @NameInMap("creatorId")
        private String creatorId;

        @NameInMap("detailUrl")
        private DetailUrl detailUrl;

        @NameInMap("dueTime")
        private Long dueTime;

        @NameInMap("isDone")
        private Boolean isDone;

        @NameInMap("modifiedTime")
        private Long modifiedTime;

        @NameInMap("priority")
        private Integer priority;

        @NameInMap("sourceId")
        private String sourceId;

        @NameInMap("subject")
        private String subject;

        @NameInMap("taskId")
        private String taskId;

        private TodoCards(Builder builder) {
            this.bizTag = builder.bizTag;
            this.createdTime = builder.createdTime;
            this.creatorId = builder.creatorId;
            this.detailUrl = builder.detailUrl;
            this.dueTime = builder.dueTime;
            this.isDone = builder.isDone;
            this.modifiedTime = builder.modifiedTime;
            this.priority = builder.priority;
            this.sourceId = builder.sourceId;
            this.subject = builder.subject;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TodoCards create() {
            return builder().build();
        }

        /**
         * @return bizTag
         */
        public String getBizTag() {
            return this.bizTag;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creatorId
         */
        public String getCreatorId() {
            return this.creatorId;
        }

        /**
         * @return detailUrl
         */
        public DetailUrl getDetailUrl() {
            return this.detailUrl;
        }

        /**
         * @return dueTime
         */
        public Long getDueTime() {
            return this.dueTime;
        }

        /**
         * @return isDone
         */
        public Boolean getIsDone() {
            return this.isDone;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return sourceId
         */
        public String getSourceId() {
            return this.sourceId;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String bizTag; 
            private Long createdTime; 
            private String creatorId; 
            private DetailUrl detailUrl; 
            private Long dueTime; 
            private Boolean isDone; 
            private Long modifiedTime; 
            private Integer priority; 
            private String sourceId; 
            private String subject; 
            private String taskId; 

            /**
             * bizTag.
             */
            public Builder bizTag(String bizTag) {
                this.bizTag = bizTag;
                return this;
            }

            /**
             * createdTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * creatorId.
             */
            public Builder creatorId(String creatorId) {
                this.creatorId = creatorId;
                return this;
            }

            /**
             * detailUrl.
             */
            public Builder detailUrl(DetailUrl detailUrl) {
                this.detailUrl = detailUrl;
                return this;
            }

            /**
             * dueTime.
             */
            public Builder dueTime(Long dueTime) {
                this.dueTime = dueTime;
                return this;
            }

            /**
             * isDone.
             */
            public Builder isDone(Boolean isDone) {
                this.isDone = isDone;
                return this;
            }

            /**
             * modifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * sourceId.
             */
            public Builder sourceId(String sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * taskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TodoCards build() {
                return new TodoCards(this);
            } 

        } 

    }
}
