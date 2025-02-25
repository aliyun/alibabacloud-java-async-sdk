// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTasksResponseBody</p>
 */
public class DescribeTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("Tasks")
    private Tasks tasks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return tasks
     */
    public Tasks getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Tasks tasks; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(Tasks tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTasksResponseBody build() {
            return new DescribeTasksResponseBody(this);
        } 

    } 

    public static class SimpleTask extends TeaModel {
        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("MessageKey")
        private String messageKey;

        @NameInMap("Name")
        private String name;

        @NameInMap("Progress")
        private Integer progress;

        @NameInMap("RelatedResourceId")
        private String relatedResourceId;

        @NameInMap("StateCode")
        private String stateCode;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        private SimpleTask(Builder builder) {
            this.createdTime = builder.createdTime;
            this.messageKey = builder.messageKey;
            this.name = builder.name;
            this.progress = builder.progress;
            this.relatedResourceId = builder.relatedResourceId;
            this.stateCode = builder.stateCode;
            this.taskId = builder.taskId;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SimpleTask create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return messageKey
         */
        public String getMessageKey() {
            return this.messageKey;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return relatedResourceId
         */
        public String getRelatedResourceId() {
            return this.relatedResourceId;
        }

        /**
         * @return stateCode
         */
        public String getStateCode() {
            return this.stateCode;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private Long createdTime; 
            private String messageKey; 
            private String name; 
            private Integer progress; 
            private String relatedResourceId; 
            private String stateCode; 
            private String taskId; 
            private Long updatedTime; 

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * MessageKey.
             */
            public Builder messageKey(String messageKey) {
                this.messageKey = messageKey;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * RelatedResourceId.
             */
            public Builder relatedResourceId(String relatedResourceId) {
                this.relatedResourceId = relatedResourceId;
                return this;
            }

            /**
             * StateCode.
             */
            public Builder stateCode(String stateCode) {
                this.stateCode = stateCode;
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
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public SimpleTask build() {
                return new SimpleTask(this);
            } 

        } 

    }
    public static class Tasks extends TeaModel {
        @NameInMap("SimpleTask")
        private java.util.List < SimpleTask> simpleTask;

        private Tasks(Builder builder) {
            this.simpleTask = builder.simpleTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return simpleTask
         */
        public java.util.List < SimpleTask> getSimpleTask() {
            return this.simpleTask;
        }

        public static final class Builder {
            private java.util.List < SimpleTask> simpleTask; 

            /**
             * SimpleTask.
             */
            public Builder simpleTask(java.util.List < SimpleTask> simpleTask) {
                this.simpleTask = simpleTask;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
