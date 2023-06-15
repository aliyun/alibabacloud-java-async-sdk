// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUserBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserBackupFilesResponseBody</p>
 */
public class ListUserBackupFilesResponseBody extends TeaModel {
    @NameInMap("Records")
    private java.util.List < Records> records;

    @NameInMap("RequestId")
    private String requestId;

    private ListUserBackupFilesResponseBody(Builder builder) {
        this.records = builder.records;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserBackupFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return records
     */
    public java.util.List < Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Records> records; 
        private String requestId; 

        /**
         * An array that consists of the information about the full backup files that are returned.
         */
        public Builder records(java.util.List < Records> records) {
            this.records = records;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserBackupFilesResponseBody build() {
            return new ListUserBackupFilesResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BinlogInfo")
        private String binlogInfo;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("FinishTime")
        private String finishTime;

        @NameInMap("ModificationTime")
        private String modificationTime;

        @NameInMap("OssBucket")
        private String ossBucket;

        @NameInMap("OssFileMetaData")
        private String ossFileMetaData;

        @NameInMap("OssFileName")
        private String ossFileName;

        @NameInMap("OssFilePath")
        private String ossFilePath;

        @NameInMap("OssFileSize")
        private Long ossFileSize;

        @NameInMap("OssUrl")
        private String ossUrl;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("RestoreSize")
        private String restoreSize;

        @NameInMap("Retention")
        private Integer retention;

        @NameInMap("Status")
        private String status;

        @NameInMap("ZoneId")
        private String zoneId;

        private Records(Builder builder) {
            this.backupId = builder.backupId;
            this.binlogInfo = builder.binlogInfo;
            this.comment = builder.comment;
            this.creationTime = builder.creationTime;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.finishTime = builder.finishTime;
            this.modificationTime = builder.modificationTime;
            this.ossBucket = builder.ossBucket;
            this.ossFileMetaData = builder.ossFileMetaData;
            this.ossFileName = builder.ossFileName;
            this.ossFilePath = builder.ossFilePath;
            this.ossFileSize = builder.ossFileSize;
            this.ossUrl = builder.ossUrl;
            this.reason = builder.reason;
            this.restoreSize = builder.restoreSize;
            this.retention = builder.retention;
            this.status = builder.status;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return binlogInfo
         */
        public String getBinlogInfo() {
            return this.binlogInfo;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return finishTime
         */
        public String getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return modificationTime
         */
        public String getModificationTime() {
            return this.modificationTime;
        }

        /**
         * @return ossBucket
         */
        public String getOssBucket() {
            return this.ossBucket;
        }

        /**
         * @return ossFileMetaData
         */
        public String getOssFileMetaData() {
            return this.ossFileMetaData;
        }

        /**
         * @return ossFileName
         */
        public String getOssFileName() {
            return this.ossFileName;
        }

        /**
         * @return ossFilePath
         */
        public String getOssFilePath() {
            return this.ossFilePath;
        }

        /**
         * @return ossFileSize
         */
        public Long getOssFileSize() {
            return this.ossFileSize;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return restoreSize
         */
        public String getRestoreSize() {
            return this.restoreSize;
        }

        /**
         * @return retention
         */
        public Integer getRetention() {
            return this.retention;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String backupId; 
            private String binlogInfo; 
            private String comment; 
            private String creationTime; 
            private String engine; 
            private String engineVersion; 
            private String finishTime; 
            private String modificationTime; 
            private String ossBucket; 
            private String ossFileMetaData; 
            private String ossFileName; 
            private String ossFilePath; 
            private Long ossFileSize; 
            private String ossUrl; 
            private String reason; 
            private String restoreSize; 
            private Integer retention; 
            private String status; 
            private String zoneId; 

            /**
             * The ID of the full backup file.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * The information about the binary log file that contains incremental data. If incremental data is generated during the full backup, this parameter is returned.
             */
            public Builder binlogInfo(String binlogInfo) {
                this.binlogInfo = binlogInfo;
                return this;
            }

            /**
             * The description of the full backup file.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The time when the system started to import the full backup file. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The database engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the instance.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The time when the full backup file is successfully imported. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * The time when the full backup file is successfully imported. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * The name of the OSS bucket in which the full backup file is stored as an object.
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * The metadata of the full backup file. For more information, see [Manage object metadata](~~31859~~).
             */
            public Builder ossFileMetaData(String ossFileMetaData) {
                this.ossFileMetaData = ossFileMetaData;
                return this;
            }

            /**
             * The name of the full backup file that is stored as an object in an OSS bucket.
             */
            public Builder ossFileName(String ossFileName) {
                this.ossFileName = ossFileName;
                return this;
            }

            /**
             * The path of the full backup file that is stored as an object in an OSS bucket.
             */
            public Builder ossFilePath(String ossFilePath) {
                this.ossFilePath = ossFilePath;
                return this;
            }

            /**
             * The size of the full backup file that is stored as an object in an OSS bucket. Unit: KB.
             */
            public Builder ossFileSize(Long ossFileSize) {
                this.ossFileSize = ossFileSize;
                return this;
            }

            /**
             * The URL to download the full backup file from the OSS bucket.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * The reason why the full backup file failed to be imported.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The amount of storage that is required to restore the data of the full backup file. Unit: GB.
             */
            public Builder restoreSize(String restoreSize) {
                this.restoreSize = restoreSize;
                return this;
            }

            /**
             * The retention period of the full backup file. Unit: days.
             */
            public Builder retention(Integer retention) {
                this.retention = retention;
                return this;
            }

            /**
             * The status of the full backup file. Valid values:
             * <p>
             * 
             * *   **Importing**: The full backup file is being imported.
             * *   **Failed**: The full backup file fails to be imported.
             * *   **CheckSucccess**: The full backup file passes the check.
             * *   **BackupSuccess**: The full backup file is imported.
             * *   **Deleted**: The full backup file is deleted.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The zone ID of the full backup file.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
}
