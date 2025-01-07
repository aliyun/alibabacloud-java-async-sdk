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
 * {@link ListAgentlessTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListAgentlessTaskResponseBody</p>
 */
public class ListAgentlessTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private java.util.List<List> list;

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
    public java.util.List<List> getList() {
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
        private java.util.List<List> list; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * <p>The tasks.</p>
         */
        public Builder list(java.util.List<List> list) {
            this.list = list;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1A975D03-5F49-5354-B2CB-3918D5DA****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAgentlessTaskResponseBody build() {
            return new ListAgentlessTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAgentlessTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentlessTaskResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

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
            this.instanceId = builder.instanceId;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private String instanceId; 
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
             * <p>The end timestamp of the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1678895999999</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The instance ID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>s-wz95vuqky0ada4******</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>sql-test-0****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The public IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>8.210.XX.XX</p>
             */
            public Builder internetIp(String internetIp) {
                this.internetIp = internetIp;
                return this;
            }

            /**
             * <p>The private IP address of the server.</p>
             * 
             * <strong>example:</strong>
             * <p>172.25.XX.XX</p>
             */
            public Builder intranetIp(String intranetIp) {
                this.intranetIp = intranetIp;
                return this;
            }

            /**
             * <p>The amount of data detected. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>154.11</p>
             */
            public Builder measureSpace(Long measureSpace) {
                this.measureSpace = measureSpace;
                return this;
            }

            /**
             * <p>The progress of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The execution progress of the check items.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{&quot;scaVul&quot;:100,&quot;binary&quot;:100,&quot;baseline&quot;:100,&quot;vul&quot;:100,&quot;webshell&quot;:100,&quot;script&quot;:100,&quot;sensitiveInfo&quot;:100}&quot;</p>
             */
            public Builder progressByProject(String progressByProject) {
                this.progressByProject = progressByProject;
                return this;
            }

            /**
             * <p>The download URL of the report.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://newsas-oss-bucket.oss-cn-hangzhou.aliyuncs.com/agent_less_single_report">http://newsas-oss-bucket.oss-cn-hangzhou.aliyuncs.com/agent_less_single_report</a>****</p>
             */
            public Builder reportDownloadUrl(String reportDownloadUrl) {
                this.reportDownloadUrl = reportDownloadUrl;
                return this;
            }

            /**
             * <p>The status of the report. Valid values:</p>
             * <ul>
             * <li><strong>PREPARED</strong>: preparing</li>
             * <li><strong>RUNNING</strong>: running</li>
             * <li><strong>SUCCESS</strong>: succeeded</li>
             * <li><strong>TIMEOUT</strong>: timed out</li>
             * <li><strong>FAILED</strong>: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder reportStatus(String reportStatus) {
                this.reportStatus = reportStatus;
                return this;
            }

            /**
             * <p>The result of the detection.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The start timestamp of the task. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1672741657897</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the detection task.</p>
             * <ul>
             * <li><strong>1</strong>: The detection task is in progress.</li>
             * <li><strong>2</strong>: The detection task is complete.</li>
             * <li><strong>3</strong>: The detection task fails.</li>
             * <li><strong>4</strong>: The detection task times out.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the asset that is detected.</p>
             * 
             * <strong>example:</strong>
             * <p>hkdevt****</p>
             */
            public Builder targetName(String targetName) {
                this.targetName = targetName;
                return this;
            }

            /**
             * <p>The type of the asset that is detected. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: snapshot</li>
             * <li><strong>2</strong>: image</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder targetType(Integer targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The ID of the task.</p>
             * 
             * <strong>example:</strong>
             * <p>1538****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the detection task.</p>
             * 
             * <strong>example:</strong>
             * <p>AGENTLESS_SCAN</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The UUID of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
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
    /**
     * 
     * {@link ListAgentlessTaskResponseBody} extends {@link TeaModel}
     *
     * <p>ListAgentlessTaskResponseBody</p>
     */
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
             * <p>The number of entries returned per page.</p>
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
             * <p>55</p>
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
