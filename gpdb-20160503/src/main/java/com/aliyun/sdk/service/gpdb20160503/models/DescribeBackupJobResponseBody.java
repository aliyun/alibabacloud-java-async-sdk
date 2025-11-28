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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeBackupJobResponseBody model) {
            this.backupId = model.backupId;
            this.backupJobId = model.backupJobId;
            this.backupMode = model.backupMode;
            this.backupStatus = model.backupStatus;
            this.process = model.process;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * <p>The backup set ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/210093.html">DescribeDataBackups</a> operation to query the IDs of all backup sets in the instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The backup job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder backupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        public Builder backupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The backup status. Valid values:</p>
         * <ul>
         * <li><strong>schedule</strong></li>
         * <li><strong>check</strong></li>
         * <li><strong>backup</strong></li>
         * <li><strong>finish</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>backup</p>
         */
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }

        /**
         * <p>The progress of the backup job.</p>
         * 
         * <strong>example:</strong>
         * <p>50%</p>
         */
        public Builder process(String process) {
            this.process = process;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D0521</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the backup job started. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-03T16:00:00Z</p>
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
