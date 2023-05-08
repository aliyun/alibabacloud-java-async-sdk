// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVulCheckTaskStatusDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulCheckTaskStatusDetailResponseBody</p>
 */
public class DescribeVulCheckTaskStatusDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskStatuses")
    private java.util.List < TaskStatuses> taskStatuses;

    @NameInMap("TotalCount")
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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskStatuses
     */
    public java.util.List < TaskStatuses> getTaskStatuses() {
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
        private java.util.List < TaskStatuses> taskStatuses; 
        private Integer totalCount; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskStatuses.
         */
        public Builder taskStatuses(java.util.List < TaskStatuses> taskStatuses) {
            this.taskStatuses = taskStatuses;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulCheckTaskStatusDetailResponseBody build() {
            return new DescribeVulCheckTaskStatusDetailResponseBody(this);
        } 

    } 

    public static class TaskStatusList extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
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

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
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
    public static class TaskStatuses extends TeaModel {
        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStatusList")
        private java.util.List < TaskStatusList> taskStatusList;

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
        public java.util.List < TaskStatusList> getTaskStatusList() {
            return this.taskStatusList;
        }

        public static final class Builder {
            private String taskId; 
            private java.util.List < TaskStatusList> taskStatusList; 

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskStatusList.
             */
            public Builder taskStatusList(java.util.List < TaskStatusList> taskStatusList) {
                this.taskStatusList = taskStatusList;
                return this;
            }

            public TaskStatuses build() {
                return new TaskStatuses(this);
            } 

        } 

    }
}
