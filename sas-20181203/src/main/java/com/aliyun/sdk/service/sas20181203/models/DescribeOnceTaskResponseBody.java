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
    private java.util.List<TaskManageResponseList> taskManageResponseList;

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
    public java.util.List<TaskManageResponseList> getTaskManageResponseList() {
        return this.taskManageResponseList;
    }

    public static final class Builder {
        private PageInfo pageInfo; 
        private String requestId; 
        private java.util.List<TaskManageResponseList> taskManageResponseList; 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the tasks.</p>
         */
        public Builder taskManageResponseList(java.util.List<TaskManageResponseList> taskManageResponseList) {
            this.taskManageResponseList = taskManageResponseList;
            return this;
        }

        public DescribeOnceTaskResponseBody build() {
            return new DescribeOnceTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOnceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnceTaskResponseBody</p>
     */
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
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeOnceTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOnceTaskResponseBody</p>
     */
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
             * <p>The execution details of the task. The value of this parameter is in the JSON format.</p>
             * <ul>
             * <li><strong>causeCode</strong>: the returned code for the cause.</li>
             * <li><strong>causeMsg</strong>: the returned message for the cause.</li>
             * <li><strong>resCode</strong>: the returned code for troubleshooting.</li>
             * <li><strong>resMsg</strong>: the returned message for troubleshooting.</li>
             * <li><strong>problemType</strong>: the type of the issue.</li>
             * <li><strong>dispatchType</strong>: the task delivery method.</li>
             * <li><strong>uuid</strong>: the UUID of the server.</li>
             * <li><strong>instanceId</strong>: the instance ID of the server.</li>
             * <li><strong>internetIp</strong>: the public IP address of the server.</li>
             * <li><strong>intranetIp</strong>: the private IP address of the server.</li>
             * <li><strong>instanceName</strong>: the instance name of the server.</li>
             * <li><strong>url</strong>: the download URL of the troubleshooting log.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[
             *       {
             *             &quot;dispatchType&quot;: &quot;manual&quot;,
             *             &quot;causeMsg&quot;: [],
             *             &quot;causeCode&quot;: [],
             *             &quot;resCode&quot;: [
             *                   &quot;1003&quot;
             *             ],
             *             &quot;resMsg&quot;: [
             *                   &quot;powershell -executionpolicy bypass -c &quot;(New-Object Net.WebClient).DownloadFile(&quot;<a href="http://aegis.alicdn.com/download/aegis_client_self_check/win32/aegis_checker.exe%5C">http://aegis.alicdn.com/download/aegis_client_self_check/win32/aegis_checker.exe\</a>&quot;, $ExecutionContext.SessionState.Path.GetUnresolvedProviderPathFromPSPath(&quot;.\\aegis_checker.exe&quot;))&quot;; &quot;./aegis_checker.exe -b eyJtb2RlIjoxLCJqc3J2X2RvbWFpbiI6W10sImlzc3VlIjoib2ZmbGluZSIsInVwZGF0ZV9kb21haW4iOltdLCJ1dWlkIjoiaW5ldC1lYWUwNDg2Ny0wMDJmLTQyM2QtYWYwMC1jNzJjZDYyOWIyNDgiLCJjbWRfaWR4IjoiNDRjZThiZWI3ZGYyYTQxMjQ1NGM4ZDc5OTE1ODI1MzMifQ==&quot;&quot;
             *             ],
             *             &quot;problemType&quot;: &quot;offline&quot;,
             *             &quot;uuid&quot;: &quot;inet-eae04867-002f-423d-af00-c72cd629****&quot;
             *       }
             * ]</p>
             */
            public Builder detailData(String detailData) {
                this.detailData = detailData;
                return this;
            }

            /**
             * <p>The number of tasks that fail to be executed.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder failCount(Integer failCount) {
                this.failCount = failCount;
                return this;
            }

            /**
             * <p>The progress of the task. Unit: percent (%).</p>
             * 
             * <strong>example:</strong>
             * <p>10%</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The execution result of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>successful</p>
             */
            public Builder resultInfo(String resultInfo) {
                this.resultInfo = resultInfo;
                return this;
            }

            /**
             * <p>The number of tasks that are executed.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder successCount(Integer successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The timestamp that indicates the time when the task ends. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1650267989000</p>
             */
            public Builder taskEndTime(Long taskEndTime) {
                this.taskEndTime = taskEndTime;
                return this;
            }

            /**
             * <p>The task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e900f528f5a6229bb640ca27cb44c98e</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>CLIENT_PROBLEM_CHECK</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The timestamp that indicates the time when the task starts. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1649732012000</p>
             */
            public Builder taskStartTime(Long taskStartTime) {
                this.taskStartTime = taskStartTime;
                return this;
            }

            /**
             * <p>The status of the task. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: The task is started.</li>
             * <li><strong>2</strong>: The task is complete.</li>
             * <li><strong>3</strong>: The task fails.</li>
             * <li><strong>4</strong>: The task times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskStatus(Integer taskStatus) {
                this.taskStatus = taskStatus;
                return this;
            }

            /**
             * <p>The text description of the status for the task. Valid values:</p>
             * <ul>
             * <li><strong>INIT</strong>: The task is pending start.</li>
             * <li><strong>START</strong>: The task is started.</li>
             * <li><strong>DISPATCH</strong>: The self-check command is issued.</li>
             * <li><strong>SUCCESS</strong>: The self-check is complete.</li>
             * <li><strong>FAIL</strong>: The task fails.</li>
             * <li><strong>TIMEOUT</strong>: The task times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder taskStatusText(String taskStatusText) {
                this.taskStatusText = taskStatusText;
                return this;
            }

            /**
             * <p>The type of the task. Valid values:</p>
             * <ul>
             * <li><strong>CLIENT_PROBLEM_CHECK</strong>: a task of the Security Center client</li>
             * <li><strong>CLIENT_DEV_OPS</strong>: an O&amp;M task of Cloud Assistant</li>
             * <li><strong>ASSET_SECURITY_CHECK</strong>: a task for asset information collection</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLIENT_PROBLEM_CHECK</p>
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
