// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAgentlessTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentlessTaskResponseBody</p>
 */
public class ListAgentlessTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List < List> list;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAgentlessTaskResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAgentlessTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return list
     */
    public java.util.List < List> getList() {
        return this.list;
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

    public static final class Builder {
        private java.util.List < List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The tasks.
         */
        public Builder list(java.util.List < List> list) {
            this.list = list;
            return this;
        }

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

        public ListAgentlessTaskResponseBody build() {
            return new ListAgentlessTaskResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("InternetIp")
        private String internetIp;

        @com.aliyun.core.annotation.NameInMap("IntranetIp")
        private String intranetIp;

        @com.aliyun.core.annotation.NameInMap("MeasureSpace")
        private Long measureSpace;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ProgressByProject")
        private String progressByProject;

        @com.aliyun.core.annotation.NameInMap("ReportDownloadUrl")
        private String reportDownloadUrl;

        @com.aliyun.core.annotation.NameInMap("ReportStatus")
        private String reportStatus;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TargetName")
        private String targetName;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private Integer targetType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("Uuid")
        private String uuid;

        private List(Builder builder) {
            this.endTime = builder.endTime;
            this.instanceName = builder.instanceName;
            this.internetIp = builder.internetIp;
            this.intranetIp = builder.intranetIp;
            this.measureSpace = builder.measureSpace;
            this.progress = builder.progress;
            this.progressByProject = builder.progressByProject;
            this.reportDownloadUrl = builder.reportDownloadUrl;
            this.reportStatus = builder.reportStatus;
            this.result = builder.result;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.targetName = builder.targetName;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.uuid = builder.uuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return internetIp
         */
        public String getInternetIp() {
            return this.internetIp;
        }

        /**
         * @return intranetIp
         */
        public String getIntranetIp() {
            return this.intranetIp;
        }

        /**
         * @return measureSpace
         */
        public Long getMeasureSpace() {
            return this.measureSpace;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return progressByProject
         */
        public String getProgressByProject() {
            return this.progressByProject;
        }

        /**
         * @return reportDownloadUrl
         */
        public String getReportDownloadUrl() {
            return this.reportDownloadUrl;
        }

        /**
         * @return reportStatus
         */
        public String getReportStatus() {
            return this.reportStatus;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return targetName
         */
        public String getTargetName() {
            return this.targetName;
        }

        /**
         * @return targetType
         */
        public Integer getTargetType() {
            return this.targetType;
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
         * @return uuid
         */
        public String getUuid() {
            return this.uuid;
        }

        public static final class Builder {
            private Long endTime; 
            private String instanceName; 
            private String internetIp; 
            private String intranetIp; 
            private Long measureSpace; 
            private Integer progress; 
            private String progressByProject; 
            private String reportDownloadUrl; 
            private String reportStatus; 
            private String result; 
            private Long startTime; 
            private Integer status; 
            private String targetName; 
            private Integer targetType; 
            private String taskId; 
            private String taskName; 
            private String uuid; 

            /**
             * The end timestamp of the task. Unit: milliseconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the asset.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The public IP address of the server.
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * The private IP address of the server.
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * The volume of detection data, in MB.
             */
            public Builder measureSpace(Long measureSpace) {
                this.measureSpace = measureSpace;
                return this;
            }

            /**
             * The progress of the task.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The execution progress of the inspection items.
             */
            public Builder progressByProject(String progressByProject) {
                this.progressByProject = progressByProject;
                return this;
            }

            /**
             * The download link for the report.
             */
            public Builder reportDownloadUrl(String reportDownloadUrl) {
                this.reportDownloadUrl = reportDownloadUrl;
                return this;
            }

            /**
             * The status of the report. Possible values:
             * <p>
             * 
             * *   **PREPARED**: In preparation.
             * *   **RUNNING**: In progress.
             * *   **SUCCESS**: Successful.
             * *   **TIMEOUT**: Timeout.
             * *   **FAILED**: Failed.
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * The result of the detection.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * The start timestamp of the task. Unit: milliseconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the detection task.
             * <p>
             * 
             * *   **1**: The detection task is in progress.
             * *   **2**: The detection task is complete.
             * *   **3**: The detection task fails.
             * *   **4**: The detection task times out.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the asset that is detected.
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * The type of the asset that is detected. Valid values:
             * <p>
             * 
             * *   **1**: snapshot
             * *   **2**: image
             */
            public Builder targetType(Integer targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The ID of the task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the detection task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The UUID of the asset.
             */
            public Builder uuid(String uuid) {
                this.uuid = uuid;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
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
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page.
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
}
