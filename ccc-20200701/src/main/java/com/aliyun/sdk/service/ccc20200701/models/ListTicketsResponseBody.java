// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListTicketsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTicketsResponseBody</p>
 */
public class ListTicketsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTicketsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTicketsResponseBody build() {
            return new ListTicketsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTicketsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Assignee")
        private String assignee;

        @com.aliyun.core.annotation.NameInMap("AssigneeName")
        private String assigneeName;

        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CloseCode")
        private String closeCode;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("Context")
        private String context;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorName")
        private String creatorName;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskId")
        private String currentTaskId;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskName")
        private String currentTaskName;

        @com.aliyun.core.annotation.NameInMap("CurrentTaskStartTime")
        private Long currentTaskStartTime;

        @com.aliyun.core.annotation.NameInMap("CustomerId")
        private String customerId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("TicketId")
        private String ticketId;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private String updatedTime;

        private List(Builder builder) {
            this.assignee = builder.assignee;
            this.assigneeName = builder.assigneeName;
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.closeCode = builder.closeCode;
            this.comment = builder.comment;
            this.context = builder.context;
            this.createdTime = builder.createdTime;
            this.creator = builder.creator;
            this.creatorName = builder.creatorName;
            this.currentTaskId = builder.currentTaskId;
            this.currentTaskName = builder.currentTaskName;
            this.currentTaskStartTime = builder.currentTaskStartTime;
            this.customerId = builder.customerId;
            this.endTime = builder.endTime;
            this.instanceId = builder.instanceId;
            this.jobId = builder.jobId;
            this.source = builder.source;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.templateId = builder.templateId;
            this.templateVersion = builder.templateVersion;
            this.ticketId = builder.ticketId;
            this.title = builder.title;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return assignee
         */
        public String getAssignee() {
            return this.assignee;
        }

        /**
         * @return assigneeName
         */
        public String getAssigneeName() {
            return this.assigneeName;
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return closeCode
         */
        public String getCloseCode() {
            return this.closeCode;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return context
         */
        public String getContext() {
            return this.context;
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorName
         */
        public String getCreatorName() {
            return this.creatorName;
        }

        /**
         * @return currentTaskId
         */
        public String getCurrentTaskId() {
            return this.currentTaskId;
        }

        /**
         * @return currentTaskName
         */
        public String getCurrentTaskName() {
            return this.currentTaskName;
        }

        /**
         * @return currentTaskStartTime
         */
        public Long getCurrentTaskStartTime() {
            return this.currentTaskStartTime;
        }

        /**
         * @return customerId
         */
        public String getCustomerId() {
            return this.customerId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return updatedTime
         */
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String assignee; 
            private String assigneeName; 
            private String categoryId; 
            private String categoryName; 
            private String closeCode; 
            private String comment; 
            private String context; 
            private String createdTime; 
            private String creator; 
            private String creatorName; 
            private String currentTaskId; 
            private String currentTaskName; 
            private Long currentTaskStartTime; 
            private String customerId; 
            private Long endTime; 
            private String instanceId; 
            private String jobId; 
            private String source; 
            private Long startTime; 
            private String state; 
            private String templateId; 
            private String templateVersion; 
            private String ticketId; 
            private String title; 
            private String updatedTime; 

            /**
             * Assignee.
             */
            public Builder assignee(String assignee) {
                this.assignee = assignee;
                return this;
            }

            /**
             * AssigneeName.
             */
            public Builder assigneeName(String assigneeName) {
                this.assigneeName = assigneeName;
                return this;
            }

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CloseCode.
             */
            public Builder closeCode(String closeCode) {
                this.closeCode = closeCode;
                return this;
            }

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * Context.
             */
            public Builder context(String context) {
                this.context = context;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * CreatorName.
             */
            public Builder creatorName(String creatorName) {
                this.creatorName = creatorName;
                return this;
            }

            /**
             * CurrentTaskId.
             */
            public Builder currentTaskId(String currentTaskId) {
                this.currentTaskId = currentTaskId;
                return this;
            }

            /**
             * CurrentTaskName.
             */
            public Builder currentTaskName(String currentTaskName) {
                this.currentTaskName = currentTaskName;
                return this;
            }

            /**
             * CurrentTaskStartTime.
             */
            public Builder currentTaskStartTime(Long currentTaskStartTime) {
                this.currentTaskStartTime = currentTaskStartTime;
                return this;
            }

            /**
             * CustomerId.
             */
            public Builder customerId(String customerId) {
                this.customerId = customerId;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * TicketId.
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(String updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTicketsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
