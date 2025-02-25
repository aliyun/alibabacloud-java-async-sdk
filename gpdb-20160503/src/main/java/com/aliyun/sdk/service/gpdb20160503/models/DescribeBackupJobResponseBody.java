// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeBackupJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupJobResponseBody</p>
 */
public class DescribeBackupJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.NameInMap("BackupJobId")
    private String backupJobId;

    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.NameInMap("BackupStatus")
    private String backupStatus;

    @com.aliyun.core.annotation.NameInMap("Process")
    private String process;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeBackupJobResponseBody(Builder builder) {
        this.backupId = builder.backupId;
        this.backupJobId = builder.backupJobId;
        this.backupMode = builder.backupMode;
        this.backupStatus = builder.backupStatus;
        this.process = builder.process;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupJobId
     */
    public String getBackupJobId() {
        return this.backupJobId;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return backupStatus
     */
    public String getBackupStatus() {
        return this.backupStatus;
    }

    /**
     * @return process
     */
    public String getProcess() {
        return this.process;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String backupId; 
        private String backupJobId; 
        private String backupMode; 
        private String backupStatus; 
        private String process; 
        private String requestId; 
        private String startTime; 

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * BackupJobId.
         */
        public Builder backupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }

        /**
         * BackupMode.
         */
        public Builder backupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        /**
         * BackupStatus.
         */
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * Process.
         */
        public Builder process(String process) {
            this.process = process;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeBackupJobResponseBody build() {
            return new DescribeBackupJobResponseBody(this);
        } 

    } 

}
