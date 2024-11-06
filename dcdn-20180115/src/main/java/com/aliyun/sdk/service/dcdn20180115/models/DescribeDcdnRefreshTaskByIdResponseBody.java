// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnRefreshTaskByIdResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnRefreshTaskByIdResponseBody</p>
 */
public class DescribeDcdnRefreshTaskByIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List < Tasks> tasks;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDcdnRefreshTaskByIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnRefreshTaskByIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tasks
     */
    public java.util.List < Tasks> getTasks() {
        return this.tasks;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Tasks> tasks; 
        private Long totalCount; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E0C2EF95-B1EC-4C93-855E-2059A7DA2B7B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>A list of prefetch or refresh tasks.</p>
         */
        public Builder tasks(java.util.List < Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        /**
         * <p>The total number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDcdnRefreshTaskByIdResponseBody build() {
            return new DescribeDcdnRefreshTaskByIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnRefreshTaskByIdResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnRefreshTaskByIdResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ObjectPath")
        private String objectPath;

        @com.aliyun.core.annotation.NameInMap("ObjectType")
        private String objectType;

        @com.aliyun.core.annotation.NameInMap("Process")
        private String process;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Tasks(Builder builder) {
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.objectPath = builder.objectPath;
            this.objectType = builder.objectType;
            this.process = builder.process;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return objectPath
         */
        public String getObjectPath() {
            return this.objectPath;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return process
         */
        public String getProcess() {
            return this.process;
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
            private String creationTime; 
            private String description; 
            private String objectPath; 
            private String objectType; 
            private String process; 
            private String status; 
            private String taskId; 

            /**
             * <p>The time when the task was created. The time follows the ISO8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-10T08:54:23Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error returned when the refresh or prefetch task failed. Valid values:</p>
             * <ul>
             * <li><strong>Internal Error</strong>: An internal error occurred.</li>
             * <li><strong>Origin Timeout</strong>: The response from the origin server timed out.</li>
             * <li><strong>Origin Return StatusCode 5XX</strong>: The origin server returned a 5XX error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Internal Error</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The path of the refresh or prefetch object.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com/image_01.png">http://example.com/image_01.png</a></p>
             */
            public Builder objectPath(String objectPath) {
                this.objectPath = objectPath;
                return this;
            }

            /**
             * <p>The type of the refresh or prefetch task. Valid values:</p>
             * <ul>
             * <li><strong>file</strong>: refreshes an individual file.</li>
             * <li><strong>directory</strong>: refreshes files under the specified directory.</li>
             * <li><strong>preload</strong>: prefetches an individual file.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>file</p>
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * <p>The progress of the task, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>100%</p>
             */
            public Builder process(String process) {
                this.process = process;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li><strong>Complete</strong>: The task is complete.</li>
             * <li><strong>Pending</strong>: The task is pending.</li>
             * <li><strong>Refreshing</strong>: The task is running.</li>
             * <li><strong>Failed</strong>: The task failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Complete</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>113681**</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
