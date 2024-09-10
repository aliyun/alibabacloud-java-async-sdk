// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSyncAssetTaskListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSyncAssetTaskListResponseBody</p>
 */
public class DescribeSyncAssetTaskListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskRecords")
    private java.util.List < TaskRecords> taskRecords;

    private DescribeSyncAssetTaskListResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.taskRecords = builder.taskRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSyncAssetTaskListResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskRecords
     */
    public java.util.List < TaskRecords> getTaskRecords() {
        return this.taskRecords;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < TaskRecords> taskRecords; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The IDC scan tasks.
         */
        public Builder taskRecords(java.util.List < TaskRecords> taskRecords) {
            this.taskRecords = taskRecords;
            return this;
        }

        public DescribeSyncAssetTaskListResponseBody build() {
            return new DescribeSyncAssetTaskListResponseBody(this);
        } 

    } 

    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of IDC scan tasks on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of IDC scan tasks per page. Default value: 20. If you leave this parameter empty, 20 IDC scan tasks are returned on each page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of IDC scan tasks returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class TaskRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetCount")
        private Integer assetCount;

        @com.aliyun.core.annotation.NameInMap("IpSegments")
        private String ipSegments;

        @com.aliyun.core.annotation.NameInMap("ProcessRate")
        private Integer processRate;

        @com.aliyun.core.annotation.NameInMap("RootTaskId")
        private String rootTaskId;

        @com.aliyun.core.annotation.NameInMap("TaskEndTime")
        private Long taskEndTime;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private Long taskStartTime;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private String taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private TaskRecords(Builder builder) {
            this.assetCount = builder.assetCount;
            this.ipSegments = builder.ipSegments;
            this.processRate = builder.processRate;
            this.rootTaskId = builder.rootTaskId;
            this.taskEndTime = builder.taskEndTime;
            this.taskName = builder.taskName;
            this.taskStartTime = builder.taskStartTime;
            this.taskStatus = builder.taskStatus;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskRecords create() {
            return builder().build();
        }

        /**
         * @return assetCount
         */
        public Integer getAssetCount() {
            return this.assetCount;
        }

        /**
         * @return ipSegments
         */
        public String getIpSegments() {
            return this.ipSegments;
        }

        /**
         * @return processRate
         */
        public Integer getProcessRate() {
            return this.processRate;
        }

        /**
         * @return rootTaskId
         */
        public String getRootTaskId() {
            return this.rootTaskId;
        }

        /**
         * @return taskEndTime
         */
        public Long getTaskEndTime() {
            return this.taskEndTime;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskStartTime
         */
        public Long getTaskStartTime() {
            return this.taskStartTime;
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
            private Integer assetCount; 
            private String ipSegments; 
            private Integer processRate; 
            private String rootTaskId; 
            private Long taskEndTime; 
            private String taskName; 
            private Long taskStartTime; 
            private String taskStatus; 
            private String taskType; 

            /**
             * The number of assets that are detected by the task.
             */
            public Builder assetCount(Integer assetCount) {
                this.assetCount = assetCount;
                return this;
            }

            /**
             * The CIDR blocks that are used for scanning. Multiple CIDR blocks are separated by commas (,).
             */
            public Builder ipSegments(String ipSegments) {
                this.ipSegments = ipSegments;
                return this;
            }

            /**
             * The progress of the task, in percentage.
             */
            public Builder processRate(Integer processRate) {
                this.processRate = processRate;
                return this;
            }

            /**
             * The ID of the root task.
             */
            public Builder rootTaskId(String rootTaskId) {
                this.rootTaskId = rootTaskId;
                return this;
            }

            /**
             * The timestamp when the task ended.
             */
            public Builder taskEndTime(Long taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * The name of the task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The timestamp when the task started. Unit: milliseconds.
             */
            public Builder taskStartTime(Long taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            /**
             * The status of the IDC scan task. Valid Values:
             * <p>
             * 
             * *   **INIT**: The task is not started.
             * *   **START**: The task is started.
             * *   **MESSAGE_SEND**: The command is sent.
             * *   **SUCCESS**: The task is complete.
             * *   **FAIL**: The task failed.
             * *   **TIMEOUT**: The task timed out.
             */
            public Builder taskStatus(String taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The type of the task. The value is fixed as **IDC_PROBE_SCAN**, which indicates an IDC scan task.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public TaskRecords build() {
                return new TaskRecords(this);
            } 

        } 

    }
}
