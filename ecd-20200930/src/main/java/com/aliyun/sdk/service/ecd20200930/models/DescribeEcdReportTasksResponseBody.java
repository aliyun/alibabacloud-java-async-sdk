// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeEcdReportTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEcdReportTasksResponseBody</p>
 */
public class DescribeEcdReportTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportTaskList")
    private java.util.List<ExportTaskList> exportTaskList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeEcdReportTasksResponseBody(Builder builder) {
        this.exportTaskList = builder.exportTaskList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEcdReportTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskList
     */
    public java.util.List<ExportTaskList> getExportTaskList() {
        return this.exportTaskList;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<ExportTaskList> exportTaskList; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeEcdReportTasksResponseBody model) {
            this.exportTaskList = model.exportTaskList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The report export tasks.</p>
         */
        public Builder exportTaskList(java.util.List<ExportTaskList> exportTaskList) {
            this.exportTaskList = exportTaskList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEcdReportTasksResponseBody build() {
            return new DescribeEcdReportTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEcdReportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEcdReportTasksResponseBody</p>
     */
    public static class ExportTaskList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("ReportFileName")
        private String reportFileName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private ExportTaskList(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.errorCode = builder.errorCode;
            this.errorMsg = builder.errorMsg;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.progress = builder.progress;
            this.reportFileName = builder.reportFileName;
            this.status = builder.status;
            this.subType = builder.subType;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportTaskList create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
        }

        /**
         * @return reportFileName
         */
        public String getReportFileName() {
            return this.reportFileName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String errorCode; 
            private String errorMsg; 
            private String gmtCreate; 
            private String gmtModified; 
            private Float progress; 
            private String reportFileName; 
            private String status; 
            private String subType; 
            private String taskId; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(ExportTaskList model) {
                this.downloadUrl = model.downloadUrl;
                this.errorCode = model.errorCode;
                this.errorMsg = model.errorMsg;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.progress = model.progress;
                this.reportFileName = model.reportFileName;
                this.status = model.status;
                this.subType = model.subType;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The download URL of the report file.</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The error code returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>No Data.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The time when the task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-14T07:46:49.000+00:00</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the task was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-14T07:46:49.000+00:00</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The progress of the report export task. Unit: %.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The name of the report file.</p>
             * 
             * <strong>example:</strong>
             * <p>TestFileName</p>
             */
            public Builder reportFileName(String reportFileName) {
                this.reportFileName = reportFileName;
                return this;
            }

            /**
             * <p>The task status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The sub-type of the report export task.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>DESKTOP: cloud computer</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DESKTOP</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The ID of the report export task.</p>
             * 
             * <strong>example:</strong>
             * <p>ret-asdfkjg*****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the report.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>RESOURCE_REPORT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RESOURCE_REPORT</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public ExportTaskList build() {
                return new ExportTaskList(this);
            } 

        } 

    }
}
