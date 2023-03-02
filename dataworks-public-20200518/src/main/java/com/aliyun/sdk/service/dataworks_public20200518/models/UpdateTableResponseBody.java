// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTableResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTableResponseBody</p>
 */
public class UpdateTableResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private UpdateTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String requestId; 
        private TaskInfo taskInfo; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the request task.
         * <p>
         * 
         * After a request task is submitted, it is divided into multiple subtasks that are run in sequence. After the current subtask is complete, the next subtask starts to run. After all subtasks are complete, the request task is complete. If a request task is aborted due to one of the following issues, address the issue based on the error code and initiate the request task again:
         * 
         * *   The request task fails to be submitted.
         * *   After the request task is submitted, a subtask fails to run.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public UpdateTableResponseBody build() {
            return new UpdateTableResponseBody(this);
        } 

    } 

    public static class TaskInfo extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("NextTaskId")
        private String nextTaskId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        private TaskInfo(Builder builder) {
            this.content = builder.content;
            this.nextTaskId = builder.nextTaskId;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return nextTaskId
         */
        public String getNextTaskId() {
            return this.nextTaskId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String content; 
            private String nextTaskId; 
            private String status; 
            private String taskId; 

            /**
             * Details about the status of the current subtask.
             * <p>
             * 
             * *   If the current subtask succeeds, success is returned.
             * *   If the current subtask fails, the error details are displayed.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The ID of the subtask that you want to run. If this parameter is left empty, all subtasks are complete. You can call the [GetDDLJobStatus](~~185659~~) operation to query the status of the subtask based on the subtask ID.
             */
            public Builder nextTaskId(String nextTaskId) {
                this.nextTaskId = nextTaskId;
                return this;
            }

            /**
             * The status of the current subtask. Valid values:
             * <p>
             * 
             * *   operating: The subtask is running.
             * *   success: The subtask succeeds.
             * *   failure: The subtask fails to run. For more information about the error details, see the Content parameter.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The ID of the current subtask.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
