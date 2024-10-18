// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageResponseBody</p>
 */
public class DescribeResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ArchiveBackupSize")
    private Long archiveBackupSize;

    @com.aliyun.core.annotation.NameInMap("BackupDataSize")
    private Long backupDataSize;

    @com.aliyun.core.annotation.NameInMap("BackupLogSize")
    private Long backupLogSize;

    @com.aliyun.core.annotation.NameInMap("BackupOssDataSize")
    private Long backupOssDataSize;

    @com.aliyun.core.annotation.NameInMap("BackupOssLogSize")
    private Long backupOssLogSize;

    @com.aliyun.core.annotation.NameInMap("BackupSize")
    private Long backupSize;

    @com.aliyun.core.annotation.NameInMap("ColdBackupSize")
    private Long coldBackupSize;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DataSize")
    private Long dataSize;

    @com.aliyun.core.annotation.NameInMap("DiskUsed")
    private Long diskUsed;

    @com.aliyun.core.annotation.NameInMap("Engine")
    private String engine;

    @com.aliyun.core.annotation.NameInMap("LogSize")
    private Long logSize;

    @com.aliyun.core.annotation.NameInMap("PaidBackupSize")
    private Long paidBackupSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQLSize")
    private Long SQLSize;

    private DescribeResourceUsageResponseBody(Builder builder) {
        this.archiveBackupSize = builder.archiveBackupSize;
        this.backupDataSize = builder.backupDataSize;
        this.backupLogSize = builder.backupLogSize;
        this.backupOssDataSize = builder.backupOssDataSize;
        this.backupOssLogSize = builder.backupOssLogSize;
        this.backupSize = builder.backupSize;
        this.coldBackupSize = builder.coldBackupSize;
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSize = builder.dataSize;
        this.diskUsed = builder.diskUsed;
        this.engine = builder.engine;
        this.logSize = builder.logSize;
        this.paidBackupSize = builder.paidBackupSize;
        this.requestId = builder.requestId;
        this.SQLSize = builder.SQLSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return archiveBackupSize
     */
    public Long getArchiveBackupSize() {
        return this.archiveBackupSize;
    }

    /**
     * @return backupDataSize
     */
    public Long getBackupDataSize() {
        return this.backupDataSize;
    }

    /**
     * @return backupLogSize
     */
    public Long getBackupLogSize() {
        return this.backupLogSize;
    }

    /**
     * @return backupOssDataSize
     */
    public Long getBackupOssDataSize() {
        return this.backupOssDataSize;
    }

    /**
     * @return backupOssLogSize
     */
    public Long getBackupOssLogSize() {
        return this.backupOssLogSize;
    }

    /**
     * @return backupSize
     */
    public Long getBackupSize() {
        return this.backupSize;
    }

    /**
     * @return coldBackupSize
     */
    public Long getColdBackupSize() {
        return this.coldBackupSize;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return dataSize
     */
    public Long getDataSize() {
        return this.dataSize;
    }

    /**
     * @return diskUsed
     */
    public Long getDiskUsed() {
        return this.diskUsed;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return logSize
     */
    public Long getLogSize() {
        return this.logSize;
    }

    /**
     * @return paidBackupSize
     */
    public Long getPaidBackupSize() {
        return this.paidBackupSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQLSize
     */
    public Long getSQLSize() {
        return this.SQLSize;
    }

    public static final class Builder {
        private Long archiveBackupSize; 
        private Long backupDataSize; 
        private Long backupLogSize; 
        private Long backupOssDataSize; 
        private Long backupOssLogSize; 
        private Long backupSize; 
        private Long coldBackupSize; 
        private String DBInstanceId; 
        private Long dataSize; 
        private Long diskUsed; 
        private String engine; 
        private Long logSize; 
        private Long paidBackupSize; 
        private String requestId; 
        private Long SQLSize; 

        /**
         * <p>The storage that is occupied by archived backup files on the instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder archiveBackupSize(Long archiveBackupSize) {
            this.archiveBackupSize = archiveBackupSize;
            return this;
        }

        /**
         * <p>The storage that is occupied by data backup files, excluding archived backup files, on the instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>94324736</p>
         */
        public Builder backupDataSize(Long backupDataSize) {
            this.backupDataSize = backupDataSize;
            return this;
        }

        /**
         * <p>The storage that is occupied by log backup files, excluding archived backup files, on the instance. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>45145563</p>
         */
        public Builder backupLogSize(Long backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }

        /**
         * <p>The size of data backup files that are stored in Object Storage Service (OSS) buckets. Unit: bytes. The value 0 indicates no data backup files are stored in OSS buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>8821760</p>
         */
        public Builder backupOssDataSize(Long backupOssDataSize) {
            this.backupOssDataSize = backupOssDataSize;
            return this;
        }

        /**
         * <p>The size of log backup files that are stored in OSS buckets. Unit: bytes. The value 0 indicates no log backup files are stored in OSS buckets.</p>
         * 
         * <strong>example:</strong>
         * <p>44180999</p>
         */
        public Builder backupOssLogSize(Long backupOssLogSize) {
            this.backupOssLogSize = backupOssLogSize;
            return this;
        }

        /**
         * <p>The storage that is used to store backup files. Unit: bytes. The value -1 indicates that no backup files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>53002759</p>
         */
        public Builder backupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }

        /**
         * <p>The storage that is used to store cold backup files. Unit: bytes. The value -1 indicates that no cold backup files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>2337275904</p>
         */
        public Builder coldBackupSize(Long coldBackupSize) {
            this.coldBackupSize = coldBackupSize;
            return this;
        }

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
         * <p>The storage that is used to store data files. Unit: bytes. The value -1 indicates that no data files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>1292094741</p>
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * <p>The total storage that is occupied by data files and log files on the instance. Unit: bytes. The value -1 indicates that no data files or log files are stored on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2337275904</p>
         */
        public Builder diskUsed(Long diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }

        /**
         * <p>The database engine of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * <p>The storage that is used to store log files. Unit: bytes. The value -1 indicates that no log files are stored.</p>
         * 
         * <strong>example:</strong>
         * <p>1045181163</p>
         */
        public Builder logSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }

        /**
         * <p>The backup storage for which you must pay. The system provides a free quota on backup storage. You must pay for the backup storage that exceeds the free quota. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder paidBackupSize(Long paidBackupSize) {
            this.paidBackupSize = paidBackupSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F937E173-559C-4498-8D90-38D32342B9E4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The storage that is occupied to execute SQL statements on the instance. Unit: bytes. The value -1 indicates that no SQL statements are executed.</p>
         * 
         * <strong>example:</strong>
         * <p>315052751</p>
         */
        public Builder SQLSize(Long SQLSize) {
            this.SQLSize = SQLSize;
            return this;
        }

        public DescribeResourceUsageResponseBody build() {
            return new DescribeResourceUsageResponseBody(this);
        } 

    } 

}
