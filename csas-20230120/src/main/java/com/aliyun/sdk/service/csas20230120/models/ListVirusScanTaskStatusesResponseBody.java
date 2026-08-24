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
 * {@link ListVirusScanTaskStatusesResponseBody} extends {@link TeaModel}
 *
 * <p>ListVirusScanTaskStatusesResponseBody</p>
 */
public class ListVirusScanTaskStatusesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Tasks")
    private java.util.List<Tasks> tasks;

    private ListVirusScanTaskStatusesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tasks = builder.tasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirusScanTaskStatusesResponseBody create() {
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
     * @return tasks
     */
    public java.util.List<Tasks> getTasks() {
        return this.tasks;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Tasks> tasks; 

        private Builder() {
        } 

        private Builder(ListVirusScanTaskStatusesResponseBody model) {
            this.requestId = model.requestId;
            this.tasks = model.tasks;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Tasks.
         */
        public Builder tasks(java.util.List<Tasks> tasks) {
            this.tasks = tasks;
            return this;
        }

        public ListVirusScanTaskStatusesResponseBody build() {
            return new ListVirusScanTaskStatusesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVirusScanTaskStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTaskStatusesResponseBody</p>
     */
    public static class TaskStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceAckCount")
        private Integer deviceAckCount;

        @com.aliyun.core.annotation.NameInMap("DeviceResultFailCount")
        private Integer deviceResultFailCount;

        @com.aliyun.core.annotation.NameInMap("DeviceResultSuccessCount")
        private Integer deviceResultSuccessCount;

        @com.aliyun.core.annotation.NameInMap("DeviceStartCount")
        private Integer deviceStartCount;

        private TaskStatus(Builder builder) {
            this.deviceAckCount = builder.deviceAckCount;
            this.deviceResultFailCount = builder.deviceResultFailCount;
            this.deviceResultSuccessCount = builder.deviceResultSuccessCount;
            this.deviceStartCount = builder.deviceStartCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatus create() {
            return builder().build();
        }

        /**
         * @return deviceAckCount
         */
        public Integer getDeviceAckCount() {
            return this.deviceAckCount;
        }

        /**
         * @return deviceResultFailCount
         */
        public Integer getDeviceResultFailCount() {
            return this.deviceResultFailCount;
        }

        /**
         * @return deviceResultSuccessCount
         */
        public Integer getDeviceResultSuccessCount() {
            return this.deviceResultSuccessCount;
        }

        /**
         * @return deviceStartCount
         */
        public Integer getDeviceStartCount() {
            return this.deviceStartCount;
        }

        public static final class Builder {
            private Integer deviceAckCount; 
            private Integer deviceResultFailCount; 
            private Integer deviceResultSuccessCount; 
            private Integer deviceStartCount; 

            private Builder() {
            } 

            private Builder(TaskStatus model) {
                this.deviceAckCount = model.deviceAckCount;
                this.deviceResultFailCount = model.deviceResultFailCount;
                this.deviceResultSuccessCount = model.deviceResultSuccessCount;
                this.deviceStartCount = model.deviceStartCount;
            } 

            /**
             * DeviceAckCount.
             */
            public Builder deviceAckCount(Integer deviceAckCount) {
                this.deviceAckCount = deviceAckCount;
                return this;
            }

            /**
             * DeviceResultFailCount.
             */
            public Builder deviceResultFailCount(Integer deviceResultFailCount) {
                this.deviceResultFailCount = deviceResultFailCount;
                return this;
            }

            /**
             * DeviceResultSuccessCount.
             */
            public Builder deviceResultSuccessCount(Integer deviceResultSuccessCount) {
                this.deviceResultSuccessCount = deviceResultSuccessCount;
                return this;
            }

            /**
             * DeviceStartCount.
             */
            public Builder deviceStartCount(Integer deviceStartCount) {
                this.deviceStartCount = deviceStartCount;
                return this;
            }

            public TaskStatus build() {
                return new TaskStatus(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVirusScanTaskStatusesResponseBody} extends {@link TeaModel}
     *
     * <p>ListVirusScanTaskStatusesResponseBody</p>
     */
    public static class Tasks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private TaskStatus taskStatus;

        private Tasks(Builder builder) {
            this.taskId = builder.taskId;
            this.taskStatus = builder.taskStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tasks create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatus
         */
        public TaskStatus getTaskStatus() {
            return this.taskStatus;
        }

        public static final class Builder {
            private String taskId; 
            private TaskStatus taskStatus; 

            private Builder() {
            } 

            private Builder(Tasks model) {
                this.taskId = model.taskId;
                this.taskStatus = model.taskStatus;
            } 

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(TaskStatus taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            public Tasks build() {
                return new Tasks(this);
            } 

        } 

    }
}
