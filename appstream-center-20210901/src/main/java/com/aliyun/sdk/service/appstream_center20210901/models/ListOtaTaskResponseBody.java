// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListOtaTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListOtaTaskResponseBody</p>
 */
public class ListOtaTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskList")
    private java.util.List<TaskList> taskList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListOtaTaskResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.taskList = builder.taskList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOtaTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List<TaskList> taskList; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskList.
         */
        public Builder taskList(java.util.List<TaskList> taskList) {
            this.taskList = taskList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOtaTaskResponseBody build() {
            return new ListOtaTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOtaTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListOtaTaskResponseBody</p>
     */
    public static class TaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OtaVersion")
        private String otaVersion;

        @com.aliyun.core.annotation.NameInMap("TaskDisplayStatus")
        private String taskDisplayStatus;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private String taskStartTime;

        private TaskList(Builder builder) {
            this.otaVersion = builder.otaVersion;
            this.taskDisplayStatus = builder.taskDisplayStatus;
            this.taskId = builder.taskId;
            this.taskStartTime = builder.taskStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskList create() {
            return builder().build();
        }

        /**
         * @return otaVersion
         */
        public String getOtaVersion() {
            return this.otaVersion;
        }

        /**
         * @return taskDisplayStatus
         */
        public String getTaskDisplayStatus() {
            return this.taskDisplayStatus;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskStartTime
         */
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

        public static final class Builder {
            private String otaVersion; 
            private String taskDisplayStatus; 
            private String taskId; 
            private String taskStartTime; 

            /**
             * OtaVersion.
             */
            public Builder otaVersion(String otaVersion) {
                this.otaVersion = otaVersion;
                return this;
            }

            /**
             * TaskDisplayStatus.
             */
            public Builder taskDisplayStatus(String taskDisplayStatus) {
                this.taskDisplayStatus = taskDisplayStatus;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-08-04T14:36:00+08:00</p>
             */
            public Builder taskStartTime(String taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            public TaskList build() {
                return new TaskList(this);
            } 

        } 

    }
}
