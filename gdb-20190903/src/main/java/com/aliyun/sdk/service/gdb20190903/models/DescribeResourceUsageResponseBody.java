// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

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

    @NameInMap("RequestId")
    private String requestId;

    private DescribeResourceUsageResponseBody(Builder builder) {
        this.backupSize = builder.backupSize;
        this.coldBackupSize = builder.coldBackupSize;
        this.DBInstanceId = builder.DBInstanceId;
        this.dataSize = builder.dataSize;
        this.diskUsed = builder.diskUsed;
        this.engine = builder.engine;
        this.logSize = builder.logSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceUsageResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long backupSize; 
        private Long coldBackupSize; 
        private String DBInstanceId; 
        private Long dataSize; 
        private Long diskUsed; 
        private String engine; 
        private Long logSize; 
        private String requestId; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeResourceUsageResponseBody build() {
            return new DescribeResourceUsageResponseBody(this);
        } 

    } 

}
