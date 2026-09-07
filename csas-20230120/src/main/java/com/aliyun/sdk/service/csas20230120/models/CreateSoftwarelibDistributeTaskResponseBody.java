// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link CreateSoftwarelibDistributeTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSoftwarelibDistributeTaskResponseBody</p>
 */
public class CreateSoftwarelibDistributeTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private Task task;

    private CreateSoftwarelibDistributeTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoftwarelibDistributeTaskResponseBody create() {
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
     * @return task
     */
    public Task getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private Task task; 

        private Builder() {
        } 

        private Builder(CreateSoftwarelibDistributeTaskResponseBody model) {
            this.requestId = model.requestId;
            this.task = model.task;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B608C6AE-623D-55C4-9454-601B88AE937E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the created task.</p>
         */
        public Builder task(Task task) {
            this.task = task;
            return this;
        }

        public CreateSoftwarelibDistributeTaskResponseBody build() {
            return new CreateSoftwarelibDistributeTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSoftwarelibDistributeTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSoftwarelibDistributeTaskResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SoftwareName")
        private String softwareName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupportOs")
        private String supportOs;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Task(Builder builder) {
            this.createTime = builder.createTime;
            this.name = builder.name;
            this.softwareName = builder.softwareName;
            this.status = builder.status;
            this.supportOs = builder.supportOs;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return softwareName
         */
        public String getSoftwareName() {
            return this.softwareName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supportOs
         */
        public String getSupportOs() {
            return this.supportOs;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String createTime; 
            private String name; 
            private String softwareName; 
            private String status; 
            private String supportOs; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.createTime = model.createTime;
                this.name = model.name;
                this.softwareName = model.softwareName;
                this.status = model.status;
                this.supportOs = model.supportOs;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The task creation time as a second-level UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1782268092</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>test_task</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The software name.</p>
             * 
             * <strong>example:</strong>
             * <p>test software</p>
             */
            public Builder softwareName(String softwareName) {
                this.softwareName = softwareName;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>enabled</strong>: enabled.</li>
             * <li><strong>disabled</strong>: disabled.</li>
             * </ul>
             * <p>The initial status of a task after creation is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>disabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The operating system to which the task applies. Valid values:</p>
             * <ul>
             * <li><strong>Windows</strong>: Windows.</li>
             * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
             * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Windows</p>
             */
            public Builder supportOs(String supportOs) {
                this.supportOs = supportOs;
                return this;
            }

            /**
             * <p>The task ID, which is used to query the task execution result.</p>
             * 
             * <strong>example:</strong>
             * <p>softwarelib-distribute-task-911dd7898bc2****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
