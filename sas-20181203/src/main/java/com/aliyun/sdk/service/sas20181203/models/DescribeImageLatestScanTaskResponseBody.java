// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageLatestScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageLatestScanTaskResponseBody</p>
 */
public class DescribeImageLatestScanTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Task")
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
        @NameInMap("Create")
        private String create;

        @NameInMap("Finish")
        private Integer finish;

        @NameInMap("FinishTime")
        private Long finishTime;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Modified")
        private String modified;

        @NameInMap("Name")
        private String name;

        @NameInMap("Source")
        private String source;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskType")
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
             * The end time of the task. The value of this parameter is returned only if Status is SUCCESS. Otherwise, this parameter is returned empty.
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The primary key ID of the database.
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
             * The creation method. A task can be created in the Security Center console or by calling an operation. Valid values:
             * <p>
             * 
             * *   **console_batch**: The task was created in the Security Center console.
             * *   **openapi**: The task was created by calling an operation.
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
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **PROCESSING**: running
             * *   **START**: starting
             * *   **MESSAGE_SEND**: delivering
             * *   **PRE_ANALYZER**: image prechecking
             * *   **SUCCESS**: successful
             * *   **FAIL**: failed
             * *   **TIMOUT**: timed out
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
             * The type of the scanned asset. Valid values:
             * <p>
             * 
             * *   **IMAGE**: image
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **IMAGE_SCAN**: image scan task
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
