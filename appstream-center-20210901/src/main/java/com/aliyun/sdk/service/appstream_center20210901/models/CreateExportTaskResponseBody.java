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
 * {@link CreateExportTaskResponseBody} extends {@link TeaModel}
 *
 * <p>CreateExportTaskResponseBody</p>
 */
public class CreateExportTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExportTaskModel")
    private ExportTaskModel exportTaskModel;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateExportTaskResponseBody(Builder builder) {
        this.exportTaskModel = builder.exportTaskModel;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateExportTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return exportTaskModel
     */
    public ExportTaskModel getExportTaskModel() {
        return this.exportTaskModel;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ExportTaskModel exportTaskModel; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateExportTaskResponseBody model) {
            this.exportTaskModel = model.exportTaskModel;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the newly created export task. When the task is created, Status is INIT, Progress is 0, and the download URL and error message are empty.</p>
         */
        public Builder exportTaskModel(ExportTaskModel exportTaskModel) {
            this.exportTaskModel = exportTaskModel;
            return this;
        }

        /**
         * <p>The ID of the request. You can use the ID to locate call records and troubleshoot issues. The example value is partially desensitized.</p>
         * 
         * <strong>example:</strong>
         * <p>7D30C5D6-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateExportTaskResponseBody build() {
            return new CreateExportTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateExportTaskResponseBody} extends {@link TeaModel}
     *
     * <p>CreateExportTaskResponseBody</p>
     */
    public static class ExportTaskModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

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
                this.progress = model.progress;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskType = model.taskType;
            } 

            /**
             * <p>The time when the task was created. The time is in the yyyy-MM-dd HH:mm:ss format, accurate to seconds. The returned string does not include the time zone offset.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-07-27 19:00:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The download URL of the exported file. When the task is created by calling this operation, the file is not generated and this field is empty. The null in the example represents a JSON null value, not the string &quot;null&quot;. You can subsequently call DescribeExportTasks to query the latest download URL of the completed task and use it within the validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The error message when the task execution fails. When the task is created by calling this operation, this field is empty. The null in the example represents a JSON null value, not the string &quot;null&quot;. When you query the task status and it is FAILED, you can use this field to identify the cause of the failure.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The progress of the export task. The value is a percentage ranging from 0 to 100. When the task is created by calling this operation, 0 is returned. The value is updated based on the execution phase and reaches 100 when the task is completed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder progress(Float progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The status of the task. When the task is created by calling this operation, INIT (initialized and waiting for execution) is returned. You can subsequently call DescribeExportTasks to query RUNNING (executing), FINISHED (completed), or FAILED (failed). Do not treat INIT as export completion.</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the newly created export task. The value is a 32-character UUID string without hyphens. You can use this value as the TaskId parameter to query the task in DescribeExportTasks.</p>
             * 
             * <strong>example:</strong>
             * <p>8119078c29e948dba2e0a9917995332a</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The type of the export task. The value is the same as the TaskType in the request. For the meaning of each type, see the TaskType request parameter.</p>
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
