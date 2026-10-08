// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeParameterTimedScheduleTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterTimedScheduleTaskResponseBody</p>
 */
public class DescribeParameterTimedScheduleTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private java.util.List<TaskList> taskList;

    private DescribeParameterTimedScheduleTaskResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterTimedScheduleTaskResponseBody create() {
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
     * @return taskList
     */
    public java.util.List<TaskList> getTaskList() {
        return this.taskList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TaskList> taskList; 

        private Builder() {
        } 

        private Builder(DescribeParameterTimedScheduleTaskResponseBody model) {
            this.requestId = model.requestId;
            this.taskList = model.taskList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A807C95D-410C-5BB5-96C0-C6E09F2C3D36</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of scan tasks.</p>
         */
        public Builder taskList(java.util.List<TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        public DescribeParameterTimedScheduleTaskResponseBody build() {
            return new DescribeParameterTimedScheduleTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeParameterTimedScheduleTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeParameterTimedScheduleTaskResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SwitchTime")
        private String switchTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TaskList(Builder builder) {
            this.DBInstanceName = builder.DBInstanceName;
            this.parameters = builder.parameters;
            this.status = builder.status;
            this.switchTime = builder.switchTime;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return DBInstanceName
         */
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return switchTime
         */
        public String getSwitchTime() {
            return this.switchTime;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String DBInstanceName; 
            private String parameters; 
            private String status; 
            private String switchTime; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskList model) {
                this.DBInstanceName = model.DBInstanceName;
                this.parameters = model.parameters;
                this.status = model.status;
                this.switchTime = model.switchTime;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze2za3is7baay****</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            /**
             * <p>The modified parameter settings.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;auto_increment_increment&quot;:&quot;1000&quot;,&quot;back_log&quot;:&quot;99&quot;}</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The status. Valid values:</p>
             * <ul>
             * <li><strong>PENDING</strong>: Pending.</li>
             * <li><strong>EXECUTING</strong>: Executing.</li>
             * <li><strong>COMPLETED</strong>: Completed.</li>
             * <li><strong>EXECUTING</strong>: Failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The effective period of the parameter modification.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-05-06T09:24:00Z</p>
             */
            public Builder switchTime(String switchTime) {
                this.switchTime = switchTime;
                return this;
            }

            /**
             * <p>The ID of the scheduled task for parameter modification.</p>
             * 
             * <strong>example:</strong>
             * <p>27056921</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
