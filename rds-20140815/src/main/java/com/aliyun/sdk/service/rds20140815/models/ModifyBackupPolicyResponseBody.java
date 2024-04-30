// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyBackupPolicyResponseBody</p>
 */
public class ModifyBackupPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CompressType")
    private String compressType;

    @com.aliyun.core.annotation.NameInMap("DBInstanceID")
    private String DBInstanceID;

    @com.aliyun.core.annotation.NameInMap("EnableBackupLog")
    private String enableBackupLog;

    @com.aliyun.core.annotation.NameInMap("HighSpaceUsageProtection")
    private String highSpaceUsageProtection;

    @com.aliyun.core.annotation.NameInMap("LocalLogRetentionHours")
    private Integer localLogRetentionHours;

    @com.aliyun.core.annotation.NameInMap("LocalLogRetentionSpace")
    private String localLogRetentionSpace;

    @com.aliyun.core.annotation.NameInMap("LogBackupLocalRetentionNumber")
    private Integer logBackupLocalRetentionNumber;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyBackupPolicyResponseBody(Builder builder) {
        this.compressType = builder.compressType;
        this.DBInstanceID = builder.DBInstanceID;
        this.enableBackupLog = builder.enableBackupLog;
        this.highSpaceUsageProtection = builder.highSpaceUsageProtection;
        this.localLogRetentionHours = builder.localLogRetentionHours;
        this.localLogRetentionSpace = builder.localLogRetentionSpace;
        this.logBackupLocalRetentionNumber = builder.logBackupLocalRetentionNumber;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return compressType
     */
    public String getCompressType() {
        return this.compressType;
    }

    /**
     * @return DBInstanceID
     */
    public String getDBInstanceID() {
        return this.DBInstanceID;
    }

    /**
     * @return enableBackupLog
     */
    public String getEnableBackupLog() {
        return this.enableBackupLog;
    }

    /**
     * @return highSpaceUsageProtection
     */
    public String getHighSpaceUsageProtection() {
        return this.highSpaceUsageProtection;
    }

    /**
     * @return localLogRetentionHours
     */
    public Integer getLocalLogRetentionHours() {
        return this.localLogRetentionHours;
    }

    /**
     * @return localLogRetentionSpace
     */
    public String getLocalLogRetentionSpace() {
        return this.localLogRetentionSpace;
    }

    /**
     * @return logBackupLocalRetentionNumber
     */
    public Integer getLogBackupLocalRetentionNumber() {
        return this.logBackupLocalRetentionNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String compressType; 
        private String DBInstanceID; 
        private String enableBackupLog; 
        private String highSpaceUsageProtection; 
        private Integer localLogRetentionHours; 
        private String localLogRetentionSpace; 
        private Integer logBackupLocalRetentionNumber; 
        private String requestId; 

        /**
         * The method that is used to compress backups. Valid values:
         * <p>
         * 
         * *   **0:** Backups are not compressed.
         * *   **1**: Backups are compressed by using the zlib tool.
         * *   **2**: Backups are compressed in parallel by using the zlib tool.
         * *   **4**: Backups are compressed by using the QuickLZ tool and can be used to restore individual databases and tables.
         * *   **8**: Backups are compressed by using the QuickLZ tool but cannot be used to restore individual databases or tables. This value is supported only for instances that run MySQL 8.0.
         */
        public Builder compressType(String compressType) {
            this.compressType = compressType;
            return this;
        }

        /**
         * The instance ID.
         */
        public Builder DBInstanceID(String DBInstanceID) {
            this.DBInstanceID = DBInstanceID;
            return this;
        }

        /**
         * Indicates whether the log backup feature is enabled. Valid values:
         * <p>
         * 
         * *   **1**: The feature is enabled.
         * *   **0**: The feature is disabled.
         */
        public Builder enableBackupLog(String enableBackupLog) {
            this.enableBackupLog = enableBackupLog;
            return this;
        }

        /**
         * Specifies whether to forcefully delete log backup files from the instance when the storage usage of the instance exceeds 80% or the amount of remaining storage on the instance is less than 5 GB.
         */
        public Builder highSpaceUsageProtection(String highSpaceUsageProtection) {
            this.highSpaceUsageProtection = highSpaceUsageProtection;
            return this;
        }

        /**
         * The number of hours for which log backup files are retained on the instance.
         */
        public Builder localLogRetentionHours(Integer localLogRetentionHours) {
            this.localLogRetentionHours = localLogRetentionHours;
            return this;
        }

        /**
         * The maximum storage usage that is allowed for log backup files on the instance.
         */
        public Builder localLogRetentionSpace(String localLogRetentionSpace) {
            this.localLogRetentionSpace = localLogRetentionSpace;
            return this;
        }

        /**
         * The number of binary log files on the instance.
         */
        public Builder logBackupLocalRetentionNumber(Integer logBackupLocalRetentionNumber) {
            this.logBackupLocalRetentionNumber = logBackupLocalRetentionNumber;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyBackupPolicyResponseBody build() {
            return new ModifyBackupPolicyResponseBody(this);
        } 

    } 

}
