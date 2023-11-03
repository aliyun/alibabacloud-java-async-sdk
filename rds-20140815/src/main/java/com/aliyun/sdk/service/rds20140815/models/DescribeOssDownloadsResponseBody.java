// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeOssDownloadsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssDownloadsResponseBody</p>
 */
public class DescribeOssDownloadsResponseBody extends TeaModel {
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("Items")
    private Items items;

    @NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeOssDownloadsResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.items = builder.items;
        this.migrateTaskId = builder.migrateTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOssDownloadsResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return migrateTaskId
     */
    public String getMigrateTaskId() {
        return this.migrateTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private Items items; 
        private String migrateTaskId; 
        private String requestId; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Details of the backup file.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The ID of the migration task.
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssDownloadsResponseBody build() {
            return new DescribeOssDownloadsResponseBody(this);
        } 

    } 

    public static class OssDownload extends TeaModel {
        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileSize")
        private String fileSize;

        @NameInMap("IsAvailable")
        private String isAvailable;

        @NameInMap("Status")
        private String status;

        private OssDownload(Builder builder) {
            this.backupMode = builder.backupMode;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.fileName = builder.fileName;
            this.fileSize = builder.fileSize;
            this.isAvailable = builder.isAvailable;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OssDownload create() {
            return builder().build();
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileSize
         */
        public String getFileSize() {
            return this.fileSize;
        }

        /**
         * @return isAvailable
         */
        public String getIsAvailable() {
            return this.isAvailable;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String backupMode; 
            private String createTime; 
            private String description; 
            private String endTime; 
            private String fileName; 
            private String fileSize; 
            private String isAvailable; 
            private String status; 

            /**
             * The backup type. Valid values:
             * <p>
             * 
             * *   **Database**: full backup file
             * *   **Differential_Database**: incremental backup file
             * *   **Transaction_Log**: log backup file
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The time when the backup file was created in the download list. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the backup file.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The end of the time range during which data was queried. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the backup file stored in the Object Storage Service (OSS) bucket.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The size of the backup file. Unit: MB
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * Indicates whether the backup file is available. Valid values: **True and False**.
             */
            public Builder isAvailable(String isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * The state of the backup file. Valid values:
             * <p>
             * 
             * *   **NoStart**
             * *   **Downloading**
             * *   **Finished**
             * *   **DownloadFailed**
             * *   **VerifyFailed**
             * *   **Deleted**
             * *   **DeleteFailed**
             * *   **CheckSuccess**
             * *   **CheckFailed**
             * *   **Restoring**
             * *   **Restored**
             * *   **RestoreFailed**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public OssDownload build() {
                return new OssDownload(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("OssDownload")
        private java.util.List < OssDownload> ossDownload;

        private Items(Builder builder) {
            this.ossDownload = builder.ossDownload;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return ossDownload
         */
        public java.util.List < OssDownload> getOssDownload() {
            return this.ossDownload;
        }

        public static final class Builder {
            private java.util.List < OssDownload> ossDownload; 

            /**
             * OssDownload.
             */
            public Builder ossDownload(java.util.List < OssDownload> ossDownload) {
                this.ossDownload = ossDownload;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
