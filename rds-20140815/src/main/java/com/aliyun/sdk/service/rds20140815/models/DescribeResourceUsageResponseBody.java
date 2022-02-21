// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResourceUsageResponseBody</p>
 */
public class DescribeResourceUsageResponseBody extends TeaModel {
    @NameInMap("ArchiveBackupSize")
    private Long archiveBackupSize;

    @NameInMap("BackupDataSize")
    private Long backupDataSize;

    @NameInMap("BackupLogSize")
    private Long backupLogSize;

    @NameInMap("BackupOssDataSize")
    private Long backupOssDataSize;

    @NameInMap("BackupOssLogSize")
    private Long backupOssLogSize;

    @NameInMap("BackupSize")
    private Long backupSize;

    @NameInMap("ColdBackupSize")
    private Long coldBackupSize;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DataSize")
    private Long dataSize;

    @NameInMap("DiskUsed")
    private Long diskUsed;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("LogSize")
    private Long logSize;

    @NameInMap("PaidBackupSize")
    private Long paidBackupSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQLSize")
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
         * ArchiveBackupSize.
         */
        public Builder archiveBackupSize(Long archiveBackupSize) {
            this.archiveBackupSize = archiveBackupSize;
            return this;
        }

        /**
         * BackupDataSize.
         */
        public Builder backupDataSize(Long backupDataSize) {
            this.backupDataSize = backupDataSize;
            return this;
        }

        /**
         * BackupLogSize.
         */
        public Builder backupLogSize(Long backupLogSize) {
            this.backupLogSize = backupLogSize;
            return this;
        }

        /**
         * BackupOssDataSize.
         */
        public Builder backupOssDataSize(Long backupOssDataSize) {
            this.backupOssDataSize = backupOssDataSize;
            return this;
        }

        /**
         * BackupOssLogSize.
         */
        public Builder backupOssLogSize(Long backupOssLogSize) {
            this.backupOssLogSize = backupOssLogSize;
            return this;
        }

        /**
         * BackupSize.
         */
        public Builder backupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }

        /**
         * ColdBackupSize.
         */
        public Builder coldBackupSize(Long coldBackupSize) {
            this.coldBackupSize = coldBackupSize;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DataSize.
         */
        public Builder dataSize(Long dataSize) {
            this.dataSize = dataSize;
            return this;
        }

        /**
         * DiskUsed.
         */
        public Builder diskUsed(Long diskUsed) {
            this.diskUsed = diskUsed;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * LogSize.
         */
        public Builder logSize(Long logSize) {
            this.logSize = logSize;
            return this;
        }

        /**
         * PaidBackupSize.
         */
        public Builder paidBackupSize(Long paidBackupSize) {
            this.paidBackupSize = paidBackupSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SQLSize.
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
