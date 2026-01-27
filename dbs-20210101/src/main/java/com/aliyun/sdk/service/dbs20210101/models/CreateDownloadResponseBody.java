// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20210101.models;

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
 * {@link CreateDownloadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDownloadResponseBody</p>
 */
public class CreateDownloadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("ErrMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateDownloadResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>DBS.ParamIsInValid</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the download task.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>DBS.ParamIsInValid</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>formatType can not be empty</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>formatType can not be empty</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A08F908D-2C35-583F-93C1-ED80753F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateDownloadResponseBody build() {
            return new CreateDownloadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateDownloadResponseBody} extends {@link TeaModel}
     *
     * <p>CreateDownloadResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupSetTime")
        private Long backupSetTime;

        @com.aliyun.core.annotation.NameInMap("BakSetId")
        private String bakSetId;

        @com.aliyun.core.annotation.NameInMap("DbList")
        private String dbList;

        @com.aliyun.core.annotation.NameInMap("DownloadStatus")
        private String downloadStatus;

        @com.aliyun.core.annotation.NameInMap("ExportDataSize")
        private Long exportDataSize;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ImportDataSize")
        private Long importDataSize;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private String progress;

        @com.aliyun.core.annotation.NameInMap("RegionCode")
        private String regionCode;

        @com.aliyun.core.annotation.NameInMap("TargetPath")
        private String targetPath;

        @com.aliyun.core.annotation.NameInMap("TargetType")
        private String targetType;

        @com.aliyun.core.annotation.NameInMap("TaskId")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.backupSetTime = model.backupSetTime;
                this.bakSetId = model.bakSetId;
                this.dbList = model.dbList;
                this.downloadStatus = model.downloadStatus;
                this.exportDataSize = model.exportDataSize;
                this.format = model.format;
                this.gmtCreate = model.gmtCreate;
                this.importDataSize = model.importDataSize;
                this.progress = model.progress;
                this.regionCode = model.regionCode;
                this.targetPath = model.targetPath;
                this.targetType = model.targetType;
                this.taskId = model.taskId;
            } 

            /**
             * <p>The point in time of the backup set if the task is used to download a backup set at a specific point in time. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1661373070000</p>
             */
            public Builder backupSetTime(Long backupSetTime) {
                this.backupSetTime = backupSetTime;
                return this;
            }

            /**
             * <p>The ID of the full backup set.</p>
             * 
             * <strong>example:</strong>
             * <p>146005****</p>
             */
            public Builder bakSetId(String bakSetId) {
                this.bakSetId = bakSetId;
                return this;
            }

            /**
             * <p>The database and table information that is returned if databases and tables are filtered by the download task.</p>
             * 
             * <strong>example:</strong>
             * <p>testdb</p>
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * <p>The state of the download task. Valid values:</p>
             * <ul>
             * <li>initializing: The download task was being initialized.</li>
             * <li>queuing: The download task was queuing.</li>
             * <li>running: The download task was running.</li>
             * <li>failed: The download task failed.</li>
             * <li>finished: The download task was complete.</li>
             * <li>expired: The download task expired.</li>
             * </ul>
             * <blockquote>
             * <p>If the TargetType parameter is set to URL, the download task expires in three days after the task is complete.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>initializing</p>
             */
            public Builder downloadStatus(String downloadStatus) {
                this.downloadStatus = downloadStatus;
                return this;
            }

            /**
             * <p>The size of the downloaded data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder exportDataSize(Long exportDataSize) {
                this.exportDataSize = exportDataSize;
                return this;
            }

            /**
             * <p>The format to which the downloaded data is converted.</p>
             * 
             * <strong>example:</strong>
             * <p>CSV</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The time when the download task was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1661940917570</p>
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The size of the processed data. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder importDataSize(Long importDataSize) {
                this.importDataSize = importDataSize;
                return this;
            }

            /**
             * <p>The number of tables that have been downloaded and the total number of tables to be downloaded.</p>
             * <blockquote>
             * <p>If the task is in the preparation stage, 0/0 is returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0/0</p>
             */
            public Builder progress(String progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The ID of the region in which the instance resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionCode(String regionCode) {
                this.regionCode = regionCode;
                return this;
            }

            /**
             * <p>The destination path to which the backup set is downloaded.</p>
             * <blockquote>
             * <p> This parameter is returned if the value of <strong>TargetType is OSS</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>test_db/path</p>
             */
            public Builder targetPath(String targetPath) {
                this.targetPath = targetPath;
                return this;
            }

            /**
             * <p>The type of the destination to which the backup set is downloaded.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * <p>The ID of the download task.</p>
             * 
             * <strong>example:</strong>
             * <p>dt-qxnsfq5s****</p>
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
