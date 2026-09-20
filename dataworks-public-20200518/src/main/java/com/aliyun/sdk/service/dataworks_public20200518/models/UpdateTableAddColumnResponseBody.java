// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link UpdateTableAddColumnResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateTableAddColumnResponseBody</p>
 */
public class UpdateTableAddColumnResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private UpdateTableAddColumnResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableAddColumnResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UpdateTableAddColumnResponseBody model) {
            this.requestId = model.requestId;
            this.taskInfo = model.taskInfo;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the request task.</p>
         * <p>After the request task is submitted, it is divided into multiple subtasks that are executed in sequence. The next subtask is executed only after the current subtask succeeds. The request task ends when all subtasks are completed. The request task terminates in the following situations. You must resolve the issue based on the error code and resubmit the request task:</p>
         * <ul>
         * <li>The request task fails to be submitted.</li>
         * <li>After the request task is submitted, any subtask fails.</li>
         * </ul>
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public UpdateTableAddColumnResponseBody build() {
            return new UpdateTableAddColumnResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTableAddColumnResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateTableAddColumnResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("NextTaskId")
        private String nextTaskId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
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

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.content = model.content;
                this.nextTaskId = model.nextTaskId;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The detailed execution status of the current subtask:</p>
             * <ul>
             * <li>If the execution succeeds, &quot;success&quot; is returned.</li>
             * <li>If the execution fails, the corresponding error details are returned.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The ID of the subtask to be executed next. If this field is empty, all subtasks have been completed.</p>
             * 
             * <strong>example:</strong>
             * <p>abc1</p>
             */
            public Builder nextTaskId(String nextTaskId) {
                this.nextTaskId = nextTaskId;
                return this;
            }

            /**
             * <p>The status of the current subtask. Valid values:</p>
             * <ul>
             * <li>operating: The subtask is being executed.</li>
             * <li>success: The subtask is executed.</li>
             * <li>failure: The subtask failed to be executed. For detailed error information, see the Content parameter.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the current subtask.</p>
             * 
             * <strong>example:</strong>
             * <p>abc2</p>
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
