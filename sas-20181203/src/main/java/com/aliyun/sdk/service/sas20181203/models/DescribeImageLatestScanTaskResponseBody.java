// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeImageLatestScanTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeImageLatestScanTaskResponseBody</p>
 */
public class DescribeImageLatestScanTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private java.util.List<Task> task;

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
    public java.util.List<Task> getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Task> task; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the information about the task.</p>
         */
        public Builder task(java.util.List<Task> task) {
            this.task = task;
            return this;
        }

        public DescribeImageLatestScanTaskResponseBody build() {
            return new DescribeImageLatestScanTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeImageLatestScanTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeImageLatestScanTaskResponseBody</p>
     */
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
             * <p>The time when the task was created. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-20 11:59:05</p>
             */
            public Builder create(String create) {
                this.create = create;
                return this;
            }

            /**
             * <p>The number of images that are scanned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder finish(Integer finish) {
                this.finish = finish;
                return this;
            }

            /**
             * <p>The end time of the task. A value is returned only when the task is in the Finished state. Otherwise, the returned value is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>1669693430977</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>9755662</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the task was last modified. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-20 12:00:05</p>
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The method in which the task was created. A task can be created in the Security Center console or by calling an API operation. Valid values:</p>
             * <ul>
             * <li><strong>console_batch</strong>: The task was created in the Security Center console.</li>
             * <li><strong>openapi</strong>: The task was created by calling an API operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>console_batch</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The start time of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1668614400000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the task. Valid value:</p>
             * <ul>
             * <li><strong>PROCESSING</strong>: The task is running.</li>
             * <li><strong>START</strong>: The task is being started.</li>
             * <li><strong>MESSAGE_SEND</strong>: The scan task is sent.</li>
             * <li><strong>PRE_ANALYZER</strong>: The image is in precheck.</li>
             * <li><strong>SUCCESS</strong>: The task was successful.</li>
             * <li><strong>FAIL</strong>: The task failed.</li>
             * <li><strong>TIMOUT</strong>: The task timed out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The digest value of the image.</p>
             * 
             * <strong>example:</strong>
             * <p>8f0fbdb41d3d1ade4ffdf21558443f4c03342010563bb8c43ccc09594d50****</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the scanned asset. Valid value:</p>
             * <ul>
             * <li><strong>IMAGE</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The ID of the scan task.</p>
             * 
             * <strong>example:</strong>
             * <p>0a960b9a48b788a8689154b032bf****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the task. Valid value:</p>
             * <ul>
             * <li><strong>IMAGE_SCAN</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
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
