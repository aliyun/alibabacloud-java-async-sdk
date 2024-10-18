// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeOssDownloadsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOssDownloadsResponseBody</p>
 */
public class DescribeOssDownloadsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("MigrateTaskId")
    private String migrateTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Details of the backup file.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The ID of the migration task.</p>
         * 
         * <strong>example:</strong>
         * <p>562154852</p>
         */
        public Builder migrateTaskId(String migrateTaskId) {
            this.migrateTaskId = migrateTaskId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A5409D02-D661-4BF3-8F3D-0A814D0574E7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOssDownloadsResponseBody build() {
            return new DescribeOssDownloadsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOssDownloadsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssDownloadsResponseBody</p>
     */
    public static class OssDownload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupMode")
        private String backupMode;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileSize")
        private String fileSize;

        @com.aliyun.core.annotation.NameInMap("IsAvailable")
        private String isAvailable;

        @com.aliyun.core.annotation.NameInMap("Status")
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
             * <p>The backup type. Valid values:</p>
             * <ul>
             * <li><strong>Database</strong>: full backup file</li>
             * <li><strong>Differential_Database</strong>: incremental backup file</li>
             * <li><strong>Transaction_Log</strong>: log backup file</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Database</p>
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * <p>The time when the backup file was created in the download list. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-08-17T12:45:15Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>App description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end of the time range during which data was queried. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-08-27T12:45:15Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the backup file stored in the Object Storage Service (OSS) bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The size of the backup file. Unit: MB</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder fileSize(String fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>Indicates whether the backup file is available. Valid values: <strong>True and False</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isAvailable(String isAvailable) {
                this.isAvailable = isAvailable;
                return this;
            }

            /**
             * <p>The state of the backup file. Valid values:</p>
             * <ul>
             * <li><strong>NoStart</strong></li>
             * <li><strong>Downloading</strong></li>
             * <li><strong>Finished</strong></li>
             * <li><strong>DownloadFailed</strong></li>
             * <li><strong>VerifyFailed</strong></li>
             * <li><strong>Deleted</strong></li>
             * <li><strong>DeleteFailed</strong></li>
             * <li><strong>CheckSuccess</strong></li>
             * <li><strong>CheckFailed</strong></li>
             * <li><strong>Restoring</strong></li>
             * <li><strong>Restored</strong></li>
             * <li><strong>RestoreFailed</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Finished</p>
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
    /**
     * 
     * {@link DescribeOssDownloadsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOssDownloadsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OssDownload")
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
