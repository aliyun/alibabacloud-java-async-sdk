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
 * {@link ListTodosResponseBody} extends {@link TeaModel}
 *
 * <p>ListTodosResponseBody</p>
 */
public class ListTodosResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("hasMore")
    private Boolean hasMore;

    @com.aliyun.core.annotation.NameInMap("items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("page")
    private Long page;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private ListTodosResponseBody(Builder builder) {
        this.code = builder.code;
        this.hasMore = builder.hasMore;
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTodosResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hasMore
     */
    public Boolean getHasMore() {
        return this.hasMore;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private Boolean hasMore; 
        private java.util.List<Items> items; 
        private Long maxResults; 
        private String message; 
        private String nextToken; 
        private Long page; 
        private Long pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(ListTodosResponseBody model) {
            this.code = model.code;
            this.hasMore = model.hasMore;
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.page = model.page;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
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
         * <p>Indicates whether more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder hasMore(Boolean hasMore) {
            this.hasMore = hasMore;
            return this;
        }

        /**
         * <p>The list of to-do items on the current page.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The effective maximum number of entries to return per page for the current request.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
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
         * <p>The pagination token for the next page. This field is an empty string if no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.page = page;
            return this;
        }

        /**
         * <p>The effective number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request tracking ID.</p>
         * 
         * <strong>example:</strong>
         * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of visible items under the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public ListTodosResponseBody build() {
            return new ListTodosResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTodosResponseBody} extends {@link TeaModel}
     *
     * <p>ListTodosResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assigneeCount")
        private Long assigneeCount;

        @com.aliyun.core.annotation.NameInMap("completedAt")
        private String completedAt;

        @com.aliyun.core.annotation.NameInMap("completedByUserId")
        private String completedByUserId;

        @com.aliyun.core.annotation.NameInMap("completedByUserName")
        private String completedByUserName;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("isRead")
        private Boolean isRead;

        @com.aliyun.core.annotation.NameInMap("messageId")
        private String messageId;

        @com.aliyun.core.annotation.NameInMap("myAssigneeStatus")
        private String myAssigneeStatus;

        @com.aliyun.core.annotation.NameInMap("myDisplayState")
        private String myDisplayState;

        @com.aliyun.core.annotation.NameInMap("priority")
        private String priority;

        @com.aliyun.core.annotation.NameInMap("questionCount")
        private Long questionCount;

        @com.aliyun.core.annotation.NameInMap("questionSummaries")
        private java.util.List<String> questionSummaries;

        @com.aliyun.core.annotation.NameInMap("sourceContext")
        private java.util.Map<String, ?> sourceContext;

        @com.aliyun.core.annotation.NameInMap("sourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("todoId")
        private String todoId;

        private Items(Builder builder) {
            this.assigneeCount = builder.assigneeCount;
            this.completedAt = builder.completedAt;
            this.completedByUserId = builder.completedByUserId;
            this.completedByUserName = builder.completedByUserName;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.isRead = builder.isRead;
            this.messageId = builder.messageId;
            this.myAssigneeStatus = builder.myAssigneeStatus;
            this.myDisplayState = builder.myDisplayState;
            this.priority = builder.priority;
            this.questionCount = builder.questionCount;
            this.questionSummaries = builder.questionSummaries;
            this.sourceContext = builder.sourceContext;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.title = builder.title;
            this.todoId = builder.todoId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return assigneeCount
         */
        public Long getAssigneeCount() {
            return this.assigneeCount;
        }

        /**
         * @return completedAt
         */
        public String getCompletedAt() {
            return this.completedAt;
        }

        /**
         * @return completedByUserId
         */
        public String getCompletedByUserId() {
            return this.completedByUserId;
        }

        /**
         * @return completedByUserName
         */
        public String getCompletedByUserName() {
            return this.completedByUserName;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return isRead
         */
        public Boolean getIsRead() {
            return this.isRead;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        /**
         * @return myAssigneeStatus
         */
        public String getMyAssigneeStatus() {
            return this.myAssigneeStatus;
        }

        /**
         * @return myDisplayState
         */
        public String getMyDisplayState() {
            return this.myDisplayState;
        }

        /**
         * @return priority
         */
        public String getPriority() {
            return this.priority;
        }

        /**
         * @return questionCount
         */
        public Long getQuestionCount() {
            return this.questionCount;
        }

        /**
         * @return questionSummaries
         */
        public java.util.List<String> getQuestionSummaries() {
            return this.questionSummaries;
        }

        /**
         * @return sourceContext
         */
        public java.util.Map<String, ?> getSourceContext() {
            return this.sourceContext;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return todoId
         */
        public String getTodoId() {
            return this.todoId;
        }

        public static final class Builder {
            private Long assigneeCount; 
            private String completedAt; 
            private String completedByUserId; 
            private String completedByUserName; 
            private String gmtCreate; 
            private String gmtModified; 
            private Boolean isRead; 
            private String messageId; 
            private String myAssigneeStatus; 
            private String myDisplayState; 
            private String priority; 
            private Long questionCount; 
            private java.util.List<String> questionSummaries; 
            private java.util.Map<String, ?> sourceContext; 
            private String sourceType; 
            private String status; 
            private String title; 
            private String todoId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.assigneeCount = model.assigneeCount;
                this.completedAt = model.completedAt;
                this.completedByUserId = model.completedByUserId;
                this.completedByUserName = model.completedByUserName;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.isRead = model.isRead;
                this.messageId = model.messageId;
                this.myAssigneeStatus = model.myAssigneeStatus;
                this.myDisplayState = model.myDisplayState;
                this.priority = model.priority;
                this.questionCount = model.questionCount;
                this.questionSummaries = model.questionSummaries;
                this.sourceContext = model.sourceContext;
                this.sourceType = model.sourceType;
                this.status = model.status;
                this.title = model.title;
                this.todoId = model.todoId;
            } 

            /**
             * <p>The number of assignees.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder assigneeCount(Long assigneeCount) {
                this.assigneeCount = assigneeCount;
                return this;
            }

            /**
             * <p>The completion time in the YYYY-MM-DD HH:mm:ss format (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:00:00</p>
             */
            public Builder completedAt(String completedAt) {
                this.completedAt = completedAt;
                return this;
            }

            /**
             * <p>The user ID of the user who completed the item. This field is empty if the item is not completed.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder completedByUserId(String completedByUserId) {
                this.completedByUserId = completedByUserId;
                return this;
            }

            /**
             * <p>The name of the user who completed the item. This field is empty if the item is not completed.</p>
             * 
             * <strong>example:</strong>
             * <p>John Doe</p>
             */
            public Builder completedByUserName(String completedByUserName) {
                this.completedByUserName = completedByUserName;
                return this;
            }

            /**
             * <p>The creation time in the YYYY-MM-DD HH:mm:ss format (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time in the YYYY-MM-DD HH:mm:ss format (UTC+8).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-12 10:00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Indicates whether the caller has read the item.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isRead(Boolean isRead) {
                this.isRead = isRead;
                return this;
            }

            /**
             * <p>The message ID of the assistant that sent the to-do item. This field is empty if there is no conversation source.</p>
             * 
             * <strong>example:</strong>
             * <p>msg-1</p>
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            /**
             * <p>The action status of the caller as an assignee.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder myAssigneeStatus(String myAssigneeStatus) {
                this.myAssigneeStatus = myAssigneeStatus;
                return this;
            }

            /**
             * <p>The list display status for the caller.</p>
             * 
             * <strong>example:</strong>
             * <p>TODO</p>
             */
            public Builder myDisplayState(String myDisplayState) {
                this.myDisplayState = myDisplayState;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder priority(String priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The number of questions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder questionCount(Long questionCount) {
                this.questionCount = questionCount;
                return this;
            }

            /**
             * <p>The list of question summaries.</p>
             */
            public Builder questionSummaries(java.util.List<String> questionSummaries) {
                this.questionSummaries = questionSummaries;
                return this;
            }

            /**
             * <p>The source context. This context is passed through as-is during creation.</p>
             * 
             * <strong>example:</strong>
             * <p>source=openapi</p>
             */
            public Builder sourceContext(java.util.Map<String, ?> sourceContext) {
                this.sourceContext = sourceContext;
                return this;
            }

            /**
             * <p>The source type of the to-do item.</p>
             * 
             * <strong>example:</strong>
             * <p>WORKFLOW</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The primary status of the to-do item.</p>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The to-do title.</p>
             * 
             * <strong>example:</strong>
             * <p>Governance approval</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>The to-do ID.</p>
             * 
             * <strong>example:</strong>
             * <p>todo_abc123</p>
             */
            public Builder todoId(String todoId) {
                this.todoId = todoId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
