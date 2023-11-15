// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOtaTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListOtaTaskResponseBody</p>
 */
public class ListOtaTaskResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskList")
    private java.util.List < TaskList> taskList;

    @NameInMap("TotalCount")
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
    public java.util.List < TaskList> getTaskList() {
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
        private java.util.List < TaskList> taskList; 
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
        public Builder taskList(java.util.List < TaskList> taskList) {
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

    public static class TaskList extends TeaModel {
        @NameInMap("OtaVersion")
        private String otaVersion;

        @NameInMap("TaskDisplayStatus")
        private String taskDisplayStatus;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskStartTime")
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
             * TaskStartTime.
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
