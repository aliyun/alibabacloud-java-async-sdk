// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link DescribeExportTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeExportTasksResponseBody</p>
 */
public class DescribeExportTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("ExportTaskModel")
    private java.util.List<ExportTaskModel> exportTaskModel;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeExportTasksResponseBody(Builder builder) {
        this.count = builder.count;
        this.exportTaskModel = builder.exportTaskModel;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExportTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return exportTaskModel
     */
    public java.util.List<ExportTaskModel> getExportTaskModel() {
        return this.exportTaskModel;
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

    public static final class Builder {
        private Integer count; 
        private java.util.List<ExportTaskModel> exportTaskModel; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeExportTasksResponseBody model) {
            this.count = model.count;
            this.exportTaskModel = model.exportTaskModel;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The total number of tasks that meet the query conditions. This value is independent of the number of tasks returned on the current page and can be used with PageSize to calculate the total number of pages. If no tasks meet the conditions, 0 is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The list of export tasks, sorted in descending order of task creation time, with the most recently created tasks listed first. If no tasks meet the conditions, an empty array is returned.</p>
         */
        public Builder exportTaskModel(java.util.List<ExportTaskModel> exportTaskModel) {
            this.exportTaskModel = exportTaskModel;
            return this;
        }

        /**
         * <p>The actual page number used for this query, which is the echoed value of the PageNumber request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The actual number of tasks per page used for this query, which is the echoed value of the PageSize request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate call records and troubleshoot issues. The example value is partially masked.</p>
         * 
         * <strong>example:</strong>
         * <p>D4A13D91-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeExportTasksResponseBody build() {
            return new DescribeExportTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeExportTasksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeExportTasksResponseBody</p>
     */
    public static class ExportTaskModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExportFileName")
        private String exportFileName;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Float progress;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        private ExportTaskModel(Builder builder) {
            this.createTime = builder.createTime;
            this.downloadUrl = builder.downloadUrl;
            this.errorMsg = builder.errorMsg;
            this.exportFileName = builder.exportFileName;
            this.progress = builder.progress;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskType = builder.taskType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExportTaskModel create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return exportFileName
         */
        public String getExportFileName() {
            return this.exportFileName;
        }

        /**
         * @return progress
         */
        public Float getProgress() {
            return this.progress;
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
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        public static final class Builder {
            private String createTime; 
            private String downloadUrl; 
            private String errorMsg; 
            private String exportFileName; 
            private Float progress; 
            private String status; 
            private String taskId; 
            private String taskType; 

            private Builder() {
            } 

            private Builder(ExportTaskModel model) {
                this.createTime = model.createTime;
                this.downloadUrl = model.downloadUrl;
                this.errorMsg = model.errorMsg;
                this.exportFileName = model.exportFileName;
                this.progress = model.progress;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The creation time of the task. The format is yyyy-MM-dd HH:mm:ss, accurate to seconds. The returned string does not include the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-27 19:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The OSS pre-signed download URL of the export file. This field is returned only for tasks whose Status is FINISHED. The default maximum validity period of the signature is 1 hour and does not exceed the 24-hour validity period after the task is created. When the remaining validity period is less than 10 minutes, the server automatically refreshes and returns a new URL. If the task is not completed, the task has expired, or the URL refresh fails, this field is empty. The domain name and path in the example URL are for demonstration purposes. The actual returned value is a complete URL with signature parameters. Use the URL returned by the most recent query for downloading.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.oss-cn-hangzhou.aliyuncs.com/">https://example.oss-cn-hangzhou.aliyuncs.com/</a>...</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The cause of the task execution failure. This field is returned only when Status is FAILED. The content is the English error description recorded by the server and can be directly displayed to users or used for troubleshooting. This field is empty in other states.</p>
             * 
             * <strong>example:</strong>
             * <p>The export sub type is not supported.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The name of the export file. The name consists of the task type, task creation time in yyyyMMddHHmmss format, and the first 8 characters of the task ID, connected by underscores, with the .xlsx extension. If the file is not generated, this field is empty.</p>
             * 
             * <strong>example:</strong>
             * <p>WUYING_SERVER_LIST_20260727190000_8119078c.xlsx</p>
             */
            public Builder exportFileName(String exportFileName) {
                this.exportFileName = exportFileName;
                return this;
            }

            /**
             * <p>The progress of the export task, in percentage. Valid values: 0 to 100. This value is updated based on the execution stage of the task and is 100 when the task is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of the export task. This operation returns the following valid values:</p>
             * <ul>
             * <li>INIT: The task is created and waiting to be executed. Continue polling.</li>
             * <li>RUNNING: The export file is being generated. You can display the progress based on Progress and continue polling.</li>
             * <li>FINISHED: The export file is generated. Stop polling and use DownloadUrl to download the file.</li>
             * <li>FAILED: The task execution failed. Stop polling and check ErrorMsg.</li>
             * </ul>
             * <p>The server also has an EXPIRED state, but this operation does not return tasks in this state.</p>
             * 
             * <strong>example:</strong>
             * <p>FINISHED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the export task, which is a 32-character UUID string without hyphens. You can use this value as the TaskId parameter for this operation to poll the task.</p>
             * 
             * <strong>example:</strong>
             * <p>8119078c29e948dba2e0a9917995332a</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the export task. For the meaning of each value, see the TaskType request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>WUYING_SERVER_LIST</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            public ExportTaskModel build() {
                return new ExportTaskModel(this);
            } 

        } 

    }
}
