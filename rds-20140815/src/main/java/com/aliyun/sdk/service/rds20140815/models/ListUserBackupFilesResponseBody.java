// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ListUserBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserBackupFilesResponseBody</p>
 */
public class ListUserBackupFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Records")
    private java.util.List<Records> records;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return records
     */
    public java.util.List<Records> getRecords() {
        return this.records;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Records> records; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUserBackupFilesResponseBody model) {
            this.records = model.records;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the full backup files.</p>
         */
        public Builder records(java.util.List<Records> records) {
            this.records = records;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AD67C22F-64F3-4448-A9A8-D1606D242879</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserBackupFilesResponseBody build() {
            return new ListUserBackupFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserBackupFilesResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupId")
        private String backupId;

        @com.aliyun.core.annotation.NameInMap("BinlogInfo")
        private String binlogInfo;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private String finishTime;

        @com.aliyun.core.annotation.NameInMap("ModificationTime")
        private String modificationTime;

        @com.aliyun.core.annotation.NameInMap("OssBucket")
        private String ossBucket;

        @com.aliyun.core.annotation.NameInMap("OssFileMetaData")
        private String ossFileMetaData;

        @com.aliyun.core.annotation.NameInMap("OssFileName")
        private String ossFileName;

        @com.aliyun.core.annotation.NameInMap("OssFilePath")
        private String ossFilePath;

        @com.aliyun.core.annotation.NameInMap("OssFileSize")
        private Long ossFileSize;

        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RestoreSize")
        private String restoreSize;

        @com.aliyun.core.annotation.NameInMap("Retention")
        private Integer retention;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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

            private Builder() {
            } 

            private Builder(Records model) {
                this.backupId = model.backupId;
                this.binlogInfo = model.binlogInfo;
                this.comment = model.comment;
                this.creationTime = model.creationTime;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.finishTime = model.finishTime;
                this.modificationTime = model.modificationTime;
                this.ossBucket = model.ossBucket;
                this.ossFileMetaData = model.ossFileMetaData;
                this.ossFileName = model.ossFileName;
                this.ossFilePath = model.ossFilePath;
                this.ossFileSize = model.ossFileSize;
                this.ossUrl = model.ossUrl;
                this.reason = model.reason;
                this.restoreSize = model.restoreSize;
                this.retention = model.retention;
                this.status = model.status;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The ID of the full backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>b-kwwvr7v8t7of********</p>
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * <p>The information about the binary log file that contains incremental data. If incremental data is generated during the full backup, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;binlogPosition&quot;:&quot;154&quot;,&quot;binlogFile&quot;:&quot;0.000002&quot;}</p>
             */
            public Builder binlogInfo(String binlogInfo) {
                this.binlogInfo = binlogInfo;
                return this;
            }

            /**
             * <p>The description of the full backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>BackupTest</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The time when the system started to import the full backup file. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1623231084000</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The time when the full backup file is successfully imported. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1623231750000</p>
             */
            public Builder finishTime(String finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The time when the full backup file is successfully imported. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1623231750000</p>
             */
            public Builder modificationTime(String modificationTime) {
                this.modificationTime = modificationTime;
                return this;
            }

            /**
             * <p>The name of the OSS bucket in which the full backup file is stored as an object.</p>
             * 
             * <strong>example:</strong>
             * <p>BackupTest</p>
             */
            public Builder ossBucket(String ossBucket) {
                this.ossBucket = ossBucket;
                return this;
            }

            /**
             * <p>The metadata of the full backup file. For more information, see <a href="https://help.aliyun.com/document_detail/31859.html">Manage object metadata</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Accept-Ranges&quot;:&quot;bytes&quot;,&quot;Connection&quot;:&quot;keep-alive&quot;,&quot;Content-Length&quot;:81014337,&quot;Content-Type&quot;:&quot;application/octet-stream&quot;,&quot;Date&quot;:1623309548000,&quot;ETag&quot;:&quot;889FE9E5FCEBFE4781829488A352863B-1&quot;,&quot;Last-Modified&quot;:1622186844000,&quot;Server&quot;:&quot;AliyunOSS&quot;,&quot;x-oss-hash-crc64ecma&quot;:&quot;5793608435727323129&quot;,&quot;x-oss-object-type&quot;:&quot;Multipart&quot;,&quot;x-oss-request-id&quot;:&quot;60C1BCEC92572F37318BD499&quot;,&quot;x-oss-server-time&quot;:&quot;166&quot;,&quot;x-oss-storage-class&quot;:&quot;Standard&quot;}</p>
             */
            public Builder ossFileMetaData(String ossFileMetaData) {
                this.ossFileMetaData = ossFileMetaData;
                return this;
            }

            /**
             * <p>The name of the full backup file that is stored as an object in an OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>backup_qp.xb</p>
             */
            public Builder ossFileName(String ossFileName) {
                this.ossFileName = ossFileName;
                return this;
            }

            /**
             * <p>The path of the full backup file that is stored as an object in an OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>test/backup_qp.xb</p>
             */
            public Builder ossFilePath(String ossFilePath) {
                this.ossFilePath = ossFilePath;
                return this;
            }

            /**
             * <p>The size of the full backup file that is stored as an object in an OSS bucket. Unit: KB.</p>
             * 
             * <strong>example:</strong>
             * <p>79115</p>
             */
            public Builder ossFileSize(Long ossFileSize) {
                this.ossFileSize = ossFileSize;
                return this;
            }

            /**
             * <p>The URL to download the full backup file from the OSS bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<strong><strong><strong>.oss-ap-</strong></strong></strong>**.aliyuncs.com/backup_qp.xb</p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * <p>The reason why the full backup file failed to be imported.</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The amount of storage that is required to restore the data of the full backup file. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder restoreSize(String restoreSize) {
                this.restoreSize = restoreSize;
                return this;
            }

            /**
             * <p>The retention period of the full backup file. Unit: days.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder retention(Integer retention) {
                this.retention = retention;
                return this;
            }

            /**
             * <p>The status of the full backup file. Valid values:</p>
             * <ul>
             * <li><strong>Importing</strong>: The full backup file is being imported.</li>
             * <li><strong>Failed</strong>: The full backup file fails to be imported.</li>
             * <li><strong>CheckSucccess</strong>: The full backup file passes the check.</li>
             * <li><strong>BackupSuccess</strong>: The full backup file is imported.</li>
             * <li><strong>Deleted</strong>: The full backup file is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BackupSuccess</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The zone ID of the full backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-b</p>
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
