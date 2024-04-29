// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOnceTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOnceTaskResponseBody</p>
 */
public class DescribeOnceTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskManageResponseList")
    private java.util.List < TaskManageResponseList> taskManageResponseList;

    private DescribeOnceTaskResponseBody(Builder builder) {
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.taskManageResponseList = builder.taskManageResponseList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOnceTaskResponseBody create() {
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
     * @return taskManageResponseList
     */
    public java.util.List < TaskManageResponseList> getTaskManageResponseList() {
        return this.taskManageResponseList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List < TaskManageResponseList> taskManageResponseList; 

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * An array that consists of the tasks.
         */
        public Builder taskManageResponseList(java.util.List < TaskManageResponseList> taskManageResponseList) {
            this.taskManageResponseList = taskManageResponseList;
            return this;
        }

        public DescribeOnceTaskResponseBody build() {
            return new DescribeOnceTaskResponseBody(this);
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
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: **20**.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
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
    public static class TaskManageResponseList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailData")
        private String detailData;

        @com.aliyun.core.annotation.NameInMap("FailCount")
        private Integer failCount;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("ResultInfo")
        private String resultInfo;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Integer successCount;

        @com.aliyun.core.annotation.NameInMap("TaskEndTime")
        private Long taskEndTime;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskStartTime")
        private Long taskStartTime;

        @com.aliyun.core.annotation.NameInMap("TaskStatus")
        private Integer taskStatus;

        @com.aliyun.core.annotation.NameInMap("TaskStatusText")
        private String taskStatusText;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private TaskManageResponseList(Builder builder) {
            this.detailData = builder.detailData;
            this.failCount = builder.failCount;
            this.progress = builder.progress;
            this.resultInfo = builder.resultInfo;
            this.successCount = builder.successCount;
            this.taskEndTime = builder.taskEndTime;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskStartTime = builder.taskStartTime;
            this.taskStatus = builder.taskStatus;
            this.taskStatusText = builder.taskStatusText;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskManageResponseList create() {
            return builder().build();
        }

        /**
         * @return detailData
         */
        public String getDetailData() {
            return this.detailData;
        }

        /**
         * @return failCount
         */
        public Integer getFailCount() {
            return this.failCount;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return resultInfo
         */
        public String getResultInfo() {
            return this.resultInfo;
        }

        /**
         * @return successCount
         */
        public Integer getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return taskEndTime
         */
        public Long getTaskEndTime() {
            return this.taskEndTime;
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

        /**
         * @return taskStartTime
         */
        public Long getTaskStartTime() {
            return this.taskStartTime;
        }

        /**
         * @return taskStatus
         */
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        /**
         * @return taskStatusText
         */
        public String getTaskStatusText() {
            return this.taskStatusText;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String detailData; 
            private Integer failCount; 
            private String progress; 
            private String resultInfo; 
            private Integer successCount; 
            private Long taskEndTime; 
            private String taskId; 
            private String taskName; 
            private Long taskStartTime; 
            private Integer taskStatus; 
            private String taskStatusText; 
            private String taskType; 

            /**
             * The execution details of the task. The value of this parameter is in the JSON format.
             * <p>
             * 
             * *   **causeCode**: the returned code for the cause.
             * *   **causeMsg**: the returned message for the cause.
             * *   **resCode**: the returned code for troubleshooting.
             * *   **resMsg**: the returned message for troubleshooting.
             * *   **problemType**: the type of the issue.
             * *   **dispatchType**: the task delivery method.
             * *   **uuid**: the UUID of the server.
             * *   **instanceId**: the instance ID of the server.
             * *   **internetIp**: the public IP address of the server.
             * *   **intranetIp**: the private IP address of the server.
             * *   **instanceName**: the instance name of the server.
             * *   **url**: the download URL of the troubleshooting log.
             */
            public Builder detailData(String detailData) {
                this.detailData = detailData;
                return this;
            }

            /**
             * The number of tasks that fail to be executed.
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * The progress of the task. Unit: percent (%).
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The execution result of the task.
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * The number of tasks that are executed.
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * The timestamp that indicates the time when the task ends. Unit: milliseconds.
             */
            public Builder taskEndTime(Long taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * The task ID.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
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
             * The timestamp that indicates the time when the task starts. Unit: milliseconds.
             */
            public Builder taskStartTime(Long taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   **1**: The task is started.
             * *   **2**: The task is complete.
             * *   **3**: The task fails.
             * *   **4**: The task times out.
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * The text description of the status for the task. Valid values:
             * <p>
             * 
             * *   **INIT**: The task is pending start.
             * *   **START**: The task is started.
             * *   **DISPATCH**: The self-check command is issued.
             * *   **SUCCESS**: The self-check is complete.
             * *   **FAIL**: The task fails.
             * *   **TIMEOUT**: The task times out.
             */
            public Builder taskStatusText(String taskStatusText) {
                this.taskStatusText = taskStatusText;
                return this;
            }

            /**
             * The type of the task. Valid values:
             * <p>
             * 
             * *   **CLIENT_PROBLEM_CHECK**: a task of the Security Center client
             * *   **CLIENT_DEV_OPS**: an O\&M task of Cloud Assistant
             * *   **ASSET_SECURITY_CHECK**: a task for asset information collection
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public TaskManageResponseList build() {
                return new TaskManageResponseList(this);
            } 

        } 

    }
}
