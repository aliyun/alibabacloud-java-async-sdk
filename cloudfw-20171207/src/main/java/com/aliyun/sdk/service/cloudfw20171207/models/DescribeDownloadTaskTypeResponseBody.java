// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeDownloadTaskTypeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDownloadTaskTypeResponseBody</p>
 */
public class DescribeDownloadTaskTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskTypeArray")
    private java.util.List<TaskTypeArray> taskTypeArray;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDownloadTaskTypeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskTypeArray = builder.taskTypeArray;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDownloadTaskTypeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskTypeArray
     */
    public java.util.List<TaskTypeArray> getTaskTypeArray() {
        return this.taskTypeArray;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TaskTypeArray> taskTypeArray; 
        private Integer totalCount; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B835494C-D093-5524-BBDE-BD272077B40E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The task types.</p>
         */
        public Builder taskTypeArray(java.util.List<TaskTypeArray> taskTypeArray) {
            this.taskTypeArray = taskTypeArray;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDownloadTaskTypeResponseBody build() {
            return new DescribeDownloadTaskTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDownloadTaskTypeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDownloadTaskTypeResponseBody</p>
     */
    public static class TaskTypeArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private TaskTypeArray(Builder builder) {
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskTypeArray create() {
            return builder().build();
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String taskName; 
            private String taskType; 

            /**
             * <p>The name of the task type.</p>
             * 
             * <strong>example:</strong>
             * <p>Internet Boundary Firewall Assets</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The type of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>InternetFirewallAsset</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public TaskTypeArray build() {
                return new TaskTypeArray(this);
            } 

        } 

    }
}
