// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterOperationTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterOperationTaskResponseBody</p>
 */
public class ListClusterOperationTaskResponseBody extends TeaModel {
    @NameInMap("ClusterOperationTaskList")
    private ClusterOperationTaskList clusterOperationTaskList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterOperationTaskResponseBody(Builder builder) {
        this.clusterOperationTaskList = builder.clusterOperationTaskList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterOperationTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterOperationTaskList
     */
    public ClusterOperationTaskList getClusterOperationTaskList() {
        return this.clusterOperationTaskList;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ClusterOperationTaskList clusterOperationTaskList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ClusterOperationTaskList.
         */
        public Builder clusterOperationTaskList(ClusterOperationTaskList clusterOperationTaskList) {
            this.clusterOperationTaskList = clusterOperationTaskList;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClusterOperationTaskResponseBody build() {
            return new ListClusterOperationTaskResponseBody(this);
        } 

    } 

    public static class ClusterOperationTask extends TeaModel {
        @NameInMap("Percentage")
        private String percentage;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        private ClusterOperationTask(Builder builder) {
            this.percentage = builder.percentage;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperationTask create() {
            return builder().build();
        }

        /**
         * @return percentage
         */
        public String getPercentage() {
            return this.percentage;
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

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        public static final class Builder {
            private String percentage; 
            private String status; 
            private String taskId; 
            private String taskName; 

            /**
             * Percentage.
             */
            public Builder percentage(String percentage) {
                this.percentage = percentage;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            public ClusterOperationTask build() {
                return new ClusterOperationTask(this);
            } 

        } 

    }
    public static class ClusterOperationTaskList extends TeaModel {
        @NameInMap("ClusterOperationTask")
        private java.util.List < ClusterOperationTask> clusterOperationTask;

        private ClusterOperationTaskList(Builder builder) {
            this.clusterOperationTask = builder.clusterOperationTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperationTaskList create() {
            return builder().build();
        }

        /**
         * @return clusterOperationTask
         */
        public java.util.List < ClusterOperationTask> getClusterOperationTask() {
            return this.clusterOperationTask;
        }

        public static final class Builder {
            private java.util.List < ClusterOperationTask> clusterOperationTask; 

            /**
             * ClusterOperationTask.
             */
            public Builder clusterOperationTask(java.util.List < ClusterOperationTask> clusterOperationTask) {
                this.clusterOperationTask = clusterOperationTask;
                return this;
            }

            public ClusterOperationTaskList build() {
                return new ClusterOperationTaskList(this);
            } 

        } 

    }
}
