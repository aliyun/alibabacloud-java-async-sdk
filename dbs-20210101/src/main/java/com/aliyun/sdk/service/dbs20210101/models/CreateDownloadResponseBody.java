// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDownloadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDownloadResponseBody</p>
 */
public class CreateDownloadResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrCode")
    private String errCode;

    @NameInMap("ErrMessage")
    private String errMessage;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private String success;

    private CreateDownloadResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDownloadResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errCode; 
        private String errMessage; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * The status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateDownloadResponseBody build() {
            return new CreateDownloadResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BackupSetTime")
        private Long backupSetTime;

        @NameInMap("BakSetId")
        private String bakSetId;

        @NameInMap("DbList")
        private String dbList;

        @NameInMap("DownloadStatus")
        private String downloadStatus;

        @NameInMap("ExportDataSize")
        private Long exportDataSize;

        @NameInMap("Format")
        private String format;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("ImportDataSize")
        private Long importDataSize;

        @NameInMap("Progress")
        private String progress;

        @NameInMap("RegionCode")
        private String regionCode;

        @NameInMap("TargetPath")
        private String targetPath;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.backupSetTime = builder.backupSetTime;
            this.bakSetId = builder.bakSetId;
            this.dbList = builder.dbList;
            this.downloadStatus = builder.downloadStatus;
            this.exportDataSize = builder.exportDataSize;
            this.format = builder.format;
            this.gmtCreate = builder.gmtCreate;
            this.importDataSize = builder.importDataSize;
            this.progress = builder.progress;
            this.regionCode = builder.regionCode;
            this.targetPath = builder.targetPath;
            this.targetType = builder.targetType;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return backupSetTime
         */
        public Long getBackupSetTime() {
            return this.backupSetTime;
        }

        /**
         * @return bakSetId
         */
        public String getBakSetId() {
            return this.bakSetId;
        }

        /**
         * @return dbList
         */
        public String getDbList() {
            return this.dbList;
        }

        /**
         * @return downloadStatus
         */
        public String getDownloadStatus() {
            return this.downloadStatus;
        }

        /**
         * @return exportDataSize
         */
        public Long getExportDataSize() {
            return this.exportDataSize;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return importDataSize
         */
        public Long getImportDataSize() {
            return this.importDataSize;
        }

        /**
         * @return progress
         */
        public String getProgress() {
            return this.progress;
        }

        /**
         * @return regionCode
         */
        public String getRegionCode() {
            return this.regionCode;
        }

        /**
         * @return targetPath
         */
        public String getTargetPath() {
            return this.targetPath;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private Long backupSetTime; 
            private String bakSetId; 
            private String dbList; 
            private String downloadStatus; 
            private Long exportDataSize; 
            private String format; 
            private Long gmtCreate; 
            private Long importDataSize; 
            private String progress; 
            private String regionCode; 
            private String targetPath; 
            private String targetType; 
            private String taskId; 

            /**
             * The point in time of the backup set if the task is used to download a backup set at a specific point in time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder backupSetTime(Long backupSetTime) {
                this.backupSetTime = backupSetTime;
                return this;
            }

            /**
             * The ID of the full backup set.
             */
            public Builder bakSetId(String bakSetId) {
                this.bakSetId = bakSetId;
                return this;
            }

            /**
             * The database and table information that is returned if databases and tables are filtered by the download task.
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * The state of the download task. Valid values:
             * <p>
             * 
             * *   initializing: The download task was being initialized.
             * *   queuing: The download task was queuing.
             * *   running: The download task was running.
             * *   failed: The download task failed.
             * *   finished: The download task was complete.
             * *   expired: The download task expired.
             * 
             * > If the TargetType parameter is set to URL, the download task expires in three days after the task is complete.
             */
            public Builder downloadStatus(String downloadStatus) {
                this.downloadStatus = downloadStatus;
                return this;
            }

            /**
             * The size of the downloaded data. Unit: bytes.
             */
            public Builder exportDataSize(Long exportDataSize) {
                this.exportDataSize = exportDataSize;
                return this;
            }

            /**
             * The format to which the downloaded data is converted.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The time when the download task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The size of the processed data. Unit: bytes.
             */
            public Builder importDataSize(Long importDataSize) {
                this.importDataSize = importDataSize;
                return this;
            }

            /**
             * The number of tables that have been downloaded and the total number of tables to be downloaded.
             * <p>
             * 
             * > If the task is in the preparation stage, 0/0 is returned.
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * The destination path to which the backup set is downloaded.
             * <p>
             * 
             * > This parameter is returned if the TargetType parameter is set to OSS.
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * The type of the destination to which the backup set is downloaded.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * The ID of the download task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
