// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageLatestScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageLatestScanTaskResponseBody</p>
 */
public class DescribeImageLatestScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private java.util.List < Task> task;

    private DescribeImageLatestScanTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageLatestScanTaskResponseBody create() {
        return builder().build();
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
    public java.util.List < Task> getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Task> task; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the information about the task.
         */
        public Builder task(java.util.List < Task> task) {
            this.task = task;
            return this;
        }

        public DescribeImageLatestScanTaskResponseBody build() {
            return new DescribeImageLatestScanTaskResponseBody(this);
        } 

    } 

    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Create")
        private String create;

        @com.aliyun.core.annotation.NameInMap("Finish")
        private Integer finish;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Modified")
        private String modified;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private Task(Builder builder) {
            this.create = builder.create;
            this.finish = builder.finish;
            this.finishTime = builder.finishTime;
            this.id = builder.id;
            this.modified = builder.modified;
            this.name = builder.name;
            this.source = builder.source;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.target = builder.target;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return create
         */
        public String getCreate() {
            return this.create;
        }

        /**
         * @return finish
         */
        public Integer getFinish() {
            return this.finish;
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modified
         */
        public String getModified() {
            return this.modified;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String create; 
            private Integer finish; 
            private Long finishTime; 
            private Long id; 
            private String modified; 
            private String name; 
            private String source; 
            private Long startTime; 
            private String status; 
            private String target; 
            private String targetType; 
            private String taskId; 
            private String taskType; 

            /**
             * The time when the task was created. The time is in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder create(String create) {
                this.create = create;
                return this;
            }

            /**
             * The number of images that are scanned.
             */
            public Builder finish(Integer finish) {
                this.finish = finish;
                return this;
            }

            /**
             * The end time of the task. A value is returned only when the task is in the Finished state. Otherwise, the returned value is empty.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The time when the task was last modified. The time is in the yyyy-MM-dd HH:mm:ss format.
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The method in which the task was created. A task can be created in the Security Center console or by calling an API operation. Valid values:
             * <p>
             * 
             * *   **console_batch**: The task was created in the Security Center console.
             * *   **openapi**: The task was created by calling an API operation.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The start time of the task.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the task. Valid value:
             * <p>
             * 
             * *   **PROCESSING**: The task is running.
             * *   **START**: The task is being started.
             * *   **MESSAGE_SEND**: The scan task is sent.
             * *   **PRE_ANALYZER**: The image is in precheck.
             * *   **SUCCESS**: The task was successful.
             * *   **FAIL**: The task failed.
             * *   **TIMOUT**: The task timed out.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The digest value of the image.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The type of the scanned asset. Valid value:
             * <p>
             * 
             * *   **IMAGE**
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The ID of the scan task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The type of the task. Valid value:
             * <p>
             * 
             * *   **IMAGE_SCAN**
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
}
