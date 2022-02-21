// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLibraryInstallTasksResponseBody} extends {@link TeaModel}
 *
 * <p>ListLibraryInstallTasksResponseBody</p>
 */
public class ListLibraryInstallTasksResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListLibraryInstallTasksResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLibraryInstallTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private Items items; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListLibraryInstallTasksResponseBody build() {
            return new ListLibraryInstallTasksResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("ClusterBizId")
        private String clusterBizId;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExecuteTime")
        private Long executeTime;

        @NameInMap("Hostname")
        private String hostname;

        @NameInMap("LibraryBizId")
        private String libraryBizId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("TaskGroupId")
        private String taskGroupId;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskProcess")
        private Integer taskProcess;

        @NameInMap("TaskStatus")
        private String taskStatus;

        @NameInMap("TaskType")
        private String taskType;

        private Item(Builder builder) {
            this.clusterBizId = builder.clusterBizId;
            this.detail = builder.detail;
            this.endTime = builder.endTime;
            this.executeTime = builder.executeTime;
            this.hostname = builder.hostname;
            this.libraryBizId = builder.libraryBizId;
            this.startTime = builder.startTime;
            this.taskGroupId = builder.taskGroupId;
            this.taskId = builder.taskId;
            this.taskProcess = builder.taskProcess;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return clusterBizId
         */
        public String getClusterBizId() {
            return this.clusterBizId;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return executeTime
         */
        public Long getExecuteTime() {
            return this.executeTime;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return libraryBizId
         */
        public String getLibraryBizId() {
            return this.libraryBizId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return taskGroupId
         */
        public String getTaskGroupId() {
            return this.taskGroupId;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskProcess
         */
        public Integer getTaskProcess() {
            return this.taskProcess;
        }

        /**
         * @return taskStatus
         */
        public String getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String clusterBizId; 
            private String detail; 
            private Long endTime; 
            private Long executeTime; 
            private String hostname; 
            private String libraryBizId; 
            private Long startTime; 
            private String taskGroupId; 
            private String taskId; 
            private Integer taskProcess; 
            private String taskStatus; 
            private String taskType; 

            /**
             * ClusterBizId.
             */
            public Builder clusterBizId(String clusterBizId) {
                this.clusterBizId = clusterBizId;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExecuteTime.
             */
            public Builder executeTime(Long executeTime) {
                this.executeTime = executeTime;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * LibraryBizId.
             */
            public Builder libraryBizId(String libraryBizId) {
                this.libraryBizId = libraryBizId;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * TaskGroupId.
             */
            public Builder taskGroupId(String taskGroupId) {
                this.taskGroupId = taskGroupId;
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
             * TaskProcess.
             */
            public Builder taskProcess(Integer taskProcess) {
                this.taskProcess = taskProcess;
                return this;
            }

            /**
             * TaskStatus.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
