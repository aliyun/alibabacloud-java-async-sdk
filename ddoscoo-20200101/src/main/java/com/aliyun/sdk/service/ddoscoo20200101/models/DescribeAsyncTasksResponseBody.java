// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAsyncTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAsyncTasksResponseBody</p>
 */
public class DescribeAsyncTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AsyncTasks")
    private java.util.List < AsyncTasks> asyncTasks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAsyncTasksResponseBody(Builder builder) {
        this.asyncTasks = builder.asyncTasks;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAsyncTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return asyncTasks
     */
    public java.util.List < AsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < AsyncTasks> asyncTasks; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * <p>An array that consists of the details of the asynchronous export tasks.</p>
         */
        public Builder asyncTasks(java.util.List < AsyncTasks> asyncTasks) {
            this.asyncTasks = asyncTasks;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>6623EA1F-30FB-5BC8-BEC9-74D55F6F08F1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of asynchronous export tasks that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAsyncTasksResponseBody build() {
            return new DescribeAsyncTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAsyncTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAsyncTasksResponseBody</p>
     */
    public static class AsyncTasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("TaskParams")
        private String taskParams;

        @com.aliyun.core.annotation.NameInMap("TaskResult")
        private String taskResult;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private Integer taskType;

        private AsyncTasks(Builder builder) {
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
            this.taskId = builder.taskId;
            this.taskParams = builder.taskParams;
            this.taskResult = builder.taskResult;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AsyncTasks create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskParams
         */
        public String getTaskParams() {
            return this.taskParams;
        }

        /**
         * @return taskResult
         */
        public String getTaskResult() {
            return this.taskResult;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private Long endTime; 
            private Long startTime; 
            private Long taskId; 
            private String taskParams; 
            private String taskResult; 
            private Integer taskStatus; 
            private Integer taskType; 

            /**
             * <p>The end time of the task. This value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>157927362000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start time of the task. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>156927362000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The task parameter. The value is a JSON string. The returned field in the value varies based on the value of <strong>TaskType</strong>.</p>
             * <p>If <strong>TaskType</strong> is set to <strong>1</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, or <strong>6</strong>, the following filed is returned:</p>
             * <ul>
             * <li><strong>instanceId</strong>: the ID of the instance. Data type: string.</li>
             * </ul>
             * <p>If <strong>TaskType</strong> is set to <strong>2</strong>, the following field is returned:</p>
             * <ul>
             * <li><strong>domain</strong>: the domain name of the website. Data type: string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;instanceId&quot;: &quot;ddoscoo-cn-mp91j1ao****&quot;}</p>
             */
            public Builder taskParams(String taskParams) {
                this.taskParams = taskParams;
                return this;
            }

            /**
             * <p>The execution result of the task. The value is a JSON string. The returned fields in the value vary based on the value of <strong>TaskType</strong>.</p>
             * <p>If <strong>TaskType</strong> is set to <strong>1</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, or <strong>6</strong>, the following fields are returned:</p>
             * <ul>
             * <li><strong>instanceId</strong>: the ID of the instance. Data type: string.</li>
             * <li><strong>url</strong>: the URL to download the exported file from Object Storage Service (OSS). Data type: string.</li>
             * </ul>
             * <p>If <strong>TaskType</strong> is set to <strong>2</strong>, the following fields are returned:</p>
             * <ul>
             * <li><strong>domain</strong>: the domain name of the website. Data type: string.</li>
             * <li><strong>url</strong>: the URL to download the exported file from OSS. Data type: string.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>{&quot;instanceId&quot;: &quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;url&quot;: &quot;https://<strong><strong>.oss-cn-beijing.aliyuncs.com/heap.bin?Expires=1584785140&amp;OSSAccessKeyId=TMP.3KfzD82FyRJevJdEkRX6JEFHhbvRBBb75PZJnyJmksA2QkMm47xFAFDgMhEV8Nm6Vxr8xExMfiy9LsUFAcLcTBrN3r</strong></strong>&amp;Signature=Sj8BNcsxJLE8l5qm4cjNlDt8gv****&quot;}</p>
             */
            public Builder taskResult(String taskResult) {
                this.taskResult = taskResult;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: indicates that the task is being initialized.</li>
             * <li><strong>1</strong>: indicates that the task is in progress.</li>
             * <li><strong>2</strong>: indicates that the task is successful.</li>
             * <li><strong>3</strong>: indicates that the task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: the task to export the port forwarding rules of an instance</li>
             * <li><strong>2</strong>: the task to export the forwarding rules of a website protected by an instance</li>
             * <li><strong>3</strong>: the task to export the sessions and health check settings of an instance</li>
             * <li><strong>4</strong>: the task to export the mitigation policies of an instance</li>
             * <li><strong>5</strong>: the task to download the blacklist for destination IP addresses of an instance</li>
             * <li><strong>6</strong>: the task to download the whitelist for destination IP addresses of an instance</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            public AsyncTasks build() {
                return new AsyncTasks(this);
            } 

        } 

    }
}
