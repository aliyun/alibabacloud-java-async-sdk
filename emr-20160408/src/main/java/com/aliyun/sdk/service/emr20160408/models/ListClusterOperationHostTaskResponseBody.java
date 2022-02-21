// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterOperationHostTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterOperationHostTaskResponseBody</p>
 */
public class ListClusterOperationHostTaskResponseBody extends TeaModel {
    @NameInMap("ClusterOperationHostTaskList")
    private ClusterOperationHostTaskList clusterOperationHostTaskList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListClusterOperationHostTaskResponseBody(Builder builder) {
        this.clusterOperationHostTaskList = builder.clusterOperationHostTaskList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterOperationHostTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterOperationHostTaskList
     */
    public ClusterOperationHostTaskList getClusterOperationHostTaskList() {
        return this.clusterOperationHostTaskList;
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
        private ClusterOperationHostTaskList clusterOperationHostTaskList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * ClusterOperationHostTaskList.
         */
        public Builder clusterOperationHostTaskList(ClusterOperationHostTaskList clusterOperationHostTaskList) {
            this.clusterOperationHostTaskList = clusterOperationHostTaskList;
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

        public ListClusterOperationHostTaskResponseBody build() {
            return new ListClusterOperationHostTaskResponseBody(this);
        } 

    } 

    public static class ClusterOperationHostTask extends TeaModel {
        @NameInMap("Percentage")
        private String percentage;

        @NameInMap("Status")
        private String status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        private ClusterOperationHostTask(Builder builder) {
            this.percentage = builder.percentage;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperationHostTask create() {
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

            public ClusterOperationHostTask build() {
                return new ClusterOperationHostTask(this);
            } 

        } 

    }
    public static class ClusterOperationHostTaskList extends TeaModel {
        @NameInMap("ClusterOperationHostTask")
        private java.util.List < ClusterOperationHostTask> clusterOperationHostTask;

        private ClusterOperationHostTaskList(Builder builder) {
            this.clusterOperationHostTask = builder.clusterOperationHostTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterOperationHostTaskList create() {
            return builder().build();
        }

        /**
         * @return clusterOperationHostTask
         */
        public java.util.List < ClusterOperationHostTask> getClusterOperationHostTask() {
            return this.clusterOperationHostTask;
        }

        public static final class Builder {
            private java.util.List < ClusterOperationHostTask> clusterOperationHostTask; 

            /**
             * ClusterOperationHostTask.
             */
            public Builder clusterOperationHostTask(java.util.List < ClusterOperationHostTask> clusterOperationHostTask) {
                this.clusterOperationHostTask = clusterOperationHostTask;
                return this;
            }

            public ClusterOperationHostTaskList build() {
                return new ClusterOperationHostTaskList(this);
            } 

        } 

    }
}
