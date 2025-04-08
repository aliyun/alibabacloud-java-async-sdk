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
 * {@link ListTicketTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListTicketTasksResponseBody</p>
 */
public class ListTicketTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Params")
    private java.util.List<String> params;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTicketTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.params = builder.params;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTicketTasksResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return params
     */
    public java.util.List<String> getParams() {
        return this.params;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private java.util.List<String> params; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListTicketTasksResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.params = model.params;
            this.requestId = model.requestId;
        } 

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
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
         * Params.
         */
        public Builder params(java.util.List<String> params) {
            this.params = params;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTicketTasksResponseBody build() {
            return new ListTicketTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTicketTasksResponseBody} extends {@link TeaModel}
     *
     * <p>ListTicketTasksResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Assignee")
        private String assignee;

        @com.aliyun.core.annotation.NameInMap("AssigneeName")
        private String assigneeName;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("FileKeys")
        private java.util.List<String> fileKeys;

        @com.aliyun.core.annotation.NameInMap("FileUrls")
        private java.util.List<String> fileUrls;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TaskDefinitionNodeId")
        private String taskDefinitionNodeId;

        @com.aliyun.core.annotation.NameInMap("TaskDefinitionNodeType")
        private String taskDefinitionNodeType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TicketId")
        private String ticketId;

        private Data(Builder builder) {
            this.action = builder.action;
            this.assignee = builder.assignee;
            this.assigneeName = builder.assigneeName;
            this.comment = builder.comment;
            this.endTime = builder.endTime;
            this.fileKeys = builder.fileKeys;
            this.fileUrls = builder.fileUrls;
            this.instanceId = builder.instanceId;
            this.startTime = builder.startTime;
            this.taskDefinitionNodeId = builder.taskDefinitionNodeId;
            this.taskDefinitionNodeType = builder.taskDefinitionNodeType;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.ticketId = builder.ticketId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
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
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileKeys
         */
        public java.util.List<String> getFileKeys() {
            return this.fileKeys;
        }

        /**
         * @return fileUrls
         */
        public java.util.List<String> getFileUrls() {
            return this.fileUrls;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskDefinitionNodeId
         */
        public String getTaskDefinitionNodeId() {
            return this.taskDefinitionNodeId;
        }

        /**
         * @return taskDefinitionNodeType
         */
        public String getTaskDefinitionNodeType() {
            return this.taskDefinitionNodeType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return ticketId
         */
        public String getTicketId() {
            return this.ticketId;
        }

        public static final class Builder {
            private String action; 
            private String assignee; 
            private String assigneeName; 
            private String comment; 
            private Long endTime; 
            private java.util.List<String> fileKeys; 
            private java.util.List<String> fileUrls; 
            private String instanceId; 
            private Long startTime; 
            private String taskDefinitionNodeId; 
            private String taskDefinitionNodeType; 
            private String taskId; 
            private String taskName; 
            private String ticketId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.action = model.action;
                this.assignee = model.assignee;
                this.assigneeName = model.assigneeName;
                this.comment = model.comment;
                this.endTime = model.endTime;
                this.fileKeys = model.fileKeys;
                this.fileUrls = model.fileUrls;
                this.instanceId = model.instanceId;
                this.startTime = model.startTime;
                this.taskDefinitionNodeId = model.taskDefinitionNodeId;
                this.taskDefinitionNodeType = model.taskDefinitionNodeType;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.ticketId = model.ticketId;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
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
             * FileKeys.
             */
            public Builder fileKeys(java.util.List<String> fileKeys) {
                this.fileKeys = fileKeys;
                return this;
            }

            /**
             * FileUrls.
             */
            public Builder fileUrls(java.util.List<String> fileUrls) {
                this.fileUrls = fileUrls;
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
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TaskDefinitionNodeId.
             */
            public Builder taskDefinitionNodeId(String taskDefinitionNodeId) {
                this.taskDefinitionNodeId = taskDefinitionNodeId;
                return this;
            }

            /**
             * TaskDefinitionNodeType.
             */
            public Builder taskDefinitionNodeType(String taskDefinitionNodeType) {
                this.taskDefinitionNodeType = taskDefinitionNodeType;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TicketId.
             */
            public Builder ticketId(String ticketId) {
                this.ticketId = ticketId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
