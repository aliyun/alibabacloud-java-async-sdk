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
    public java.util.List<Task> getTask() {
        return this.task;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Task> task; 

        private Builder() {
        } 

        private Builder(DescribeImageLatestScanTaskResponseBody model) {
            this.requestId = model.requestId;
            this.task = model.task;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0B48AB3C-84FC-424D-A01D-B9270EF4****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task information.</p>
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

            private Builder() {
            } 

            private Builder(Task model) {
                this.create = model.create;
                this.finish = model.finish;
                this.finishTime = model.finishTime;
                this.id = model.id;
                this.modified = model.modified;
                this.name = model.name;
                this.source = model.source;
                this.startTime = model.startTime;
                this.status = model.status;
                this.target = model.target;
                this.targetType = model.targetType;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The time when the task was created. Format: yyyy-MM-ddTHH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-20 11:59:05</p>
             */
            public Builder create(String create) {
                this.create = create;
                return this;
            }

            /**
             * <p>The number of completed image tasks.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder finish(Integer finish) {
                this.finish = finish;
                return this;
            }

            /**
             * <p>The time when the task ended. This parameter is returned only when the task status is Finished. Otherwise, an empty value is returned. This value is a UNIX timestamp. Unit: milliseconds.</p>
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
             * <p>The time when the task was last modified. Format: yyyy-MM-ddTHH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-20 12:00:05</p>
             */
            public Builder modified(String modified) {
                this.modified = modified;
                return this;
            }

            /**
             * <p>The task name.</p>
             * 
             * <strong>example:</strong>
             * <p>IMAGE_SCAN</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The creation method. The task can be created from the console or by calling an API operation. Valid values:</p>
             * <ul>
             * <li><strong>console_batch</strong>: console</li>
             * <li><strong>openapi</strong>: API</li>
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
             * <p>The time when the task started. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1668614400000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>PROCESSING</strong>: The task is being executed.</li>
             * <li><strong>START</strong>: The task is starting.</li>
             * <li><strong>MESSAGE_SEND</strong>: The scan is being distributed.</li>
             * <li><strong>PRE_ANALYZER</strong>: The image is being pre-checked.</li>
             * <li><strong>SUCCESS</strong>: The task is executed.</li>
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
             * <p>The digest of the target image.</p>
             * 
             * <strong>example:</strong>
             * <p>8f0fbdb41d3d1ade4ffdf21558443f4c03342010563bb8c43ccc09594d50****</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The scan target type. Valid values:</p>
             * <ul>
             * <li><strong>IMAGE</strong>: image</li>
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
             * <p>The task type. Valid values:</p>
             * <ul>
             * <li><strong>IMAGE_SCAN</strong>: image scan</li>
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
