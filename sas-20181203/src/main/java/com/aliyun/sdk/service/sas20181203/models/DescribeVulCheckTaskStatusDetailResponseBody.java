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
 * {@link DescribeVulCheckTaskStatusDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulCheckTaskStatusDetailResponseBody</p>
 */
public class DescribeVulCheckTaskStatusDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskStatuses")
    private java.util.List<TaskStatuses> taskStatuses;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVulCheckTaskStatusDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskStatuses = builder.taskStatuses;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulCheckTaskStatusDetailResponseBody create() {
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
     * @return taskStatuses
     */
    public java.util.List<TaskStatuses> getTaskStatuses() {
        return this.taskStatuses;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TaskStatuses> taskStatuses; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVulCheckTaskStatusDetailResponseBody model) {
            this.requestId = model.requestId;
            this.taskStatuses = model.taskStatuses;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BE120DAB-F4E7-4C53-ADC3-A97578ABF384</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of vulnerability task statuses for the server.</p>
         */
        public Builder taskStatuses(java.util.List<TaskStatuses> taskStatuses) {
            this.taskStatuses = taskStatuses;
            return this;
        }

        /**
         * <p>The total number of vulnerability subtasks for the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulCheckTaskStatusDetailResponseBody build() {
            return new DescribeVulCheckTaskStatusDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulCheckTaskStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulCheckTaskStatusDetailResponseBody</p>
     */
    public static class TaskStatusList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TaskStatusList(Builder builder) {
            this.code = builder.code;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatusList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(TaskStatusList model) {
                this.code = model.code;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The failure code.</p>
             * 
             * <strong>example:</strong>
             * <p>push_command_failed</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The completion status of the check. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: Unprocessed.</li>
             * <li><strong>1</strong>: Collecting.</li>
             * <li><strong>2</strong>: Collection completed.</li>
             * <li><strong>3</strong>: Matching.</li>
             * <li><strong>4</strong>: Completed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The vulnerability type. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability</li>
             * <li><strong>sys</strong>: Windows system vulnerability</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability</li>
             * <li><strong>sca</strong>: sca vulnerability</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TaskStatusList build() {
                return new TaskStatusList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeVulCheckTaskStatusDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulCheckTaskStatusDetailResponseBody</p>
     */
    public static class TaskStatuses extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStatusList")
        private java.util.List<TaskStatusList> taskStatusList;

        private TaskStatuses(Builder builder) {
            this.taskId = builder.taskId;
            this.taskStatusList = builder.taskStatusList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskStatuses create() {
            return builder().build();
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStatusList
         */
        public java.util.List<TaskStatusList> getTaskStatusList() {
            return this.taskStatusList;
        }

        public static final class Builder {
            private String taskId; 
            private java.util.List<TaskStatusList> taskStatusList; 

            private Builder() {
            } 

            private Builder(TaskStatuses model) {
                this.taskId = model.taskId;
                this.taskStatusList = model.taskStatusList;
            } 

            /**
             * <p>The main task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16190385</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The list of vulnerability detection task statuses.</p>
             */
            public Builder taskStatusList(java.util.List<TaskStatusList> taskStatusList) {
                this.taskStatusList = taskStatusList;
                return this;
            }

            public TaskStatuses build() {
                return new TaskStatuses(this);
            } 

        } 

    }
}
