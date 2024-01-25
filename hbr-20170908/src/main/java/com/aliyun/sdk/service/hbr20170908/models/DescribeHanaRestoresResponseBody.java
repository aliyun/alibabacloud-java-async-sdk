// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHanaRestoresResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHanaRestoresResponseBody</p>
 */
public class DescribeHanaRestoresResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HanaRestore")
    private HanaRestore hanaRestore;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHanaRestoresResponseBody(Builder builder) {
        this.code = builder.code;
        this.hanaRestore = builder.hanaRestore;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHanaRestoresResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return hanaRestore
     */
    public HanaRestore getHanaRestore() {
        return this.hanaRestore;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private HanaRestore hanaRestore; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * The HTTP status code. The status code 200 indicates that the call is successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The information about restore jobs.
         */
        public Builder hanaRestore(HanaRestore hanaRestore) {
            this.hanaRestore = hanaRestore;
            return this;
        }

        /**
         * The message that is returned. If the call is successful, "successful" is returned. If the call fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned on each page. Valid values: 1 to 99. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful. Valid values:
         * <p>
         * 
         * *   true: The call is successful.
         * *   false: The call fails.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHanaRestoresResponseBody build() {
            return new DescribeHanaRestoresResponseBody(this);
        } 

    } 

    public static class HanaRestores extends TeaModel {
        @NameInMap("BackupID")
        private Long backupID;

        @NameInMap("BackupPrefix")
        private String backupPrefix;

        @NameInMap("CheckAccess")
        private Boolean checkAccess;

        @NameInMap("ClearLog")
        private Boolean clearLog;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("CurrentPhase")
        private Integer currentPhase;

        @NameInMap("CurrentProgress")
        private Long currentProgress;

        @NameInMap("DatabaseName")
        private String databaseName;

        @NameInMap("DatabaseRestoreId")
        private Long databaseRestoreId;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("LogPosition")
        private Long logPosition;

        @NameInMap("MaxPhase")
        private Integer maxPhase;

        @NameInMap("MaxProgress")
        private Long maxProgress;

        @NameInMap("Message")
        private String message;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("Phase")
        private String phase;

        @NameInMap("ReachedTime")
        private Long reachedTime;

        @NameInMap("RecoveryPointInTime")
        private Long recoveryPointInTime;

        @NameInMap("RestoreId")
        private String restoreId;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceClusterId")
        private String sourceClusterId;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("State")
        private String state;

        @NameInMap("Status")
        private String status;

        @NameInMap("SystemCopy")
        private Boolean systemCopy;

        @NameInMap("UseCatalog")
        private Boolean useCatalog;

        @NameInMap("UseDelta")
        private Boolean useDelta;

        @NameInMap("VaultId")
        private String vaultId;

        @NameInMap("VolumeId")
        private Integer volumeId;

        private HanaRestores(Builder builder) {
            this.backupID = builder.backupID;
            this.backupPrefix = builder.backupPrefix;
            this.checkAccess = builder.checkAccess;
            this.clearLog = builder.clearLog;
            this.clusterId = builder.clusterId;
            this.currentPhase = builder.currentPhase;
            this.currentProgress = builder.currentProgress;
            this.databaseName = builder.databaseName;
            this.databaseRestoreId = builder.databaseRestoreId;
            this.endTime = builder.endTime;
            this.logPosition = builder.logPosition;
            this.maxPhase = builder.maxPhase;
            this.maxProgress = builder.maxProgress;
            this.message = builder.message;
            this.mode = builder.mode;
            this.phase = builder.phase;
            this.reachedTime = builder.reachedTime;
            this.recoveryPointInTime = builder.recoveryPointInTime;
            this.restoreId = builder.restoreId;
            this.source = builder.source;
            this.sourceClusterId = builder.sourceClusterId;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.status = builder.status;
            this.systemCopy = builder.systemCopy;
            this.useCatalog = builder.useCatalog;
            this.useDelta = builder.useDelta;
            this.vaultId = builder.vaultId;
            this.volumeId = builder.volumeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaRestores create() {
            return builder().build();
        }

        /**
         * @return backupID
         */
        public Long getBackupID() {
            return this.backupID;
        }

        /**
         * @return backupPrefix
         */
        public String getBackupPrefix() {
            return this.backupPrefix;
        }

        /**
         * @return checkAccess
         */
        public Boolean getCheckAccess() {
            return this.checkAccess;
        }

        /**
         * @return clearLog
         */
        public Boolean getClearLog() {
            return this.clearLog;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return currentPhase
         */
        public Integer getCurrentPhase() {
            return this.currentPhase;
        }

        /**
         * @return currentProgress
         */
        public Long getCurrentProgress() {
            return this.currentProgress;
        }

        /**
         * @return databaseName
         */
        public String getDatabaseName() {
            return this.databaseName;
        }

        /**
         * @return databaseRestoreId
         */
        public Long getDatabaseRestoreId() {
            return this.databaseRestoreId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return logPosition
         */
        public Long getLogPosition() {
            return this.logPosition;
        }

        /**
         * @return maxPhase
         */
        public Integer getMaxPhase() {
            return this.maxPhase;
        }

        /**
         * @return maxProgress
         */
        public Long getMaxProgress() {
            return this.maxProgress;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return reachedTime
         */
        public Long getReachedTime() {
            return this.reachedTime;
        }

        /**
         * @return recoveryPointInTime
         */
        public Long getRecoveryPointInTime() {
            return this.recoveryPointInTime;
        }

        /**
         * @return restoreId
         */
        public String getRestoreId() {
            return this.restoreId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceClusterId
         */
        public String getSourceClusterId() {
            return this.sourceClusterId;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return systemCopy
         */
        public Boolean getSystemCopy() {
            return this.systemCopy;
        }

        /**
         * @return useCatalog
         */
        public Boolean getUseCatalog() {
            return this.useCatalog;
        }

        /**
         * @return useDelta
         */
        public Boolean getUseDelta() {
            return this.useDelta;
        }

        /**
         * @return vaultId
         */
        public String getVaultId() {
            return this.vaultId;
        }

        /**
         * @return volumeId
         */
        public Integer getVolumeId() {
            return this.volumeId;
        }

        public static final class Builder {
            private Long backupID; 
            private String backupPrefix; 
            private Boolean checkAccess; 
            private Boolean clearLog; 
            private String clusterId; 
            private Integer currentPhase; 
            private Long currentProgress; 
            private String databaseName; 
            private Long databaseRestoreId; 
            private Long endTime; 
            private Long logPosition; 
            private Integer maxPhase; 
            private Long maxProgress; 
            private String message; 
            private String mode; 
            private String phase; 
            private Long reachedTime; 
            private Long recoveryPointInTime; 
            private String restoreId; 
            private String source; 
            private String sourceClusterId; 
            private Long startTime; 
            private String state; 
            private String status; 
            private Boolean systemCopy; 
            private Boolean useCatalog; 
            private Boolean useDelta; 
            private String vaultId; 
            private Integer volumeId; 

            /**
             * The ID of the backup.
             */
            public Builder backupID(Long backupID) {
                this.backupID = backupID;
                return this;
            }

            /**
             * The backup prefix.
             */
            public Builder backupPrefix(String backupPrefix) {
                this.backupPrefix = backupPrefix;
                return this;
            }

            /**
             * Indicates whether the differential backup and log backup are validated. Valid values:
             * <p>
             * 
             * *   true: HBR checks whether the required differential backup and log backup are available before the restore job starts. If the differential backup or log backup is unavailable, HBR does not start the restore job.
             * *   false: HBR does not check whether the required differential backup and log backup are available before the restore job starts.
             */
            public Builder checkAccess(Boolean checkAccess) {
                this.checkAccess = checkAccess;
                return this;
            }

            /**
             * Indicates whether all log entries are deleted from the log area after the log entries are restored. Valid values: true and false. If the return value is false, all log entries are deleted from the log area after the log entries are restored.
             */
            public Builder clearLog(Boolean clearLog) {
                this.clearLog = clearLog;
                return this;
            }

            /**
             * The ID of the SAP HANA instance that is restored.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The current recovery phase. This value is obtained from SAP HANA.
             */
            public Builder currentPhase(Integer currentPhase) {
                this.currentPhase = currentPhase;
                return this;
            }

            /**
             * The current progress. This value is obtained from SAP HANA.
             */
            public Builder currentProgress(Long currentProgress) {
                this.currentProgress = currentProgress;
                return this;
            }

            /**
             * The name of the database.
             */
            public Builder databaseName(String databaseName) {
                this.databaseName = databaseName;
                return this;
            }

            /**
             * The ID of the database recovery.
             */
            public Builder databaseRestoreId(Long databaseRestoreId) {
                this.databaseRestoreId = databaseRestoreId;
                return this;
            }

            /**
             * The time when the restore job ends. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The log position to which the database is restored. This parameter is returned only if the value of the Mode parameter is **RECOVERY_TO_LOG_POSITION**.
             */
            public Builder logPosition(Long logPosition) {
                this.logPosition = logPosition;
                return this;
            }

            /**
             * The maximum recovery phase. This value is obtained from SAP HANA.
             */
            public Builder maxPhase(Integer maxPhase) {
                this.maxPhase = maxPhase;
                return this;
            }

            /**
             * The maximum progress. This value is obtained from SAP HANA.
             */
            public Builder maxProgress(Long maxProgress) {
                this.maxProgress = maxProgress;
                return this;
            }

            /**
             * The details of the recovery phase.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The recovery mode. Valid values:
             * <p>
             * 
             * *   **RECOVERY_TO_MOST_RECENT**: The database is restored to the recently available state to which the database has been backed up.
             * *   **RECOVERY_TO_POINT_IN_TIME**: The database is restored to a specified point in time.
             * *   **RECOVERY_TO_SPECIFIC_BACKUP**: The database is restored to a specified backup.
             * *   **RECOVERY_TO_LOG_POSITION**: The database is restored to a specified log position.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * The recovery phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * The point in time at which the database is restored.
             */
            public Builder reachedTime(Long reachedTime) {
                this.reachedTime = reachedTime;
                return this;
            }

            /**
             * The point in time to which the database is restored. This parameter is returned only if the value of the Mode parameter is **RECOVERY_TO_POINT_IN_TIME**. HBR restores the database to a state closest to the specified point in time.
             */
            public Builder recoveryPointInTime(Long recoveryPointInTime) {
                this.recoveryPointInTime = recoveryPointInTime;
                return this;
            }

            /**
             * The ID of the restore job.
             */
            public Builder restoreId(String restoreId) {
                this.restoreId = restoreId;
                return this;
            }

            /**
             * The name of the source system. This parameter indicates the name of the source database that is restored. Format: `<Source database name>@SID`.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * The ID of the source SAP HANA instance.
             */
            public Builder sourceClusterId(String sourceClusterId) {
                this.sourceClusterId = sourceClusterId;
                return this;
            }

            /**
             * The time when the restore job starts. This value is a UNIX timestamp. Unit: seconds.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The recovery status. This value is obtained from SAP HANA.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The status of the restore job. Valid values:
             * <p>
             * 
             * *   **RUNNING**: The restore job is running.
             * *   **COMPLETE**: The restore job is completed.
             * *   **PARTIAL_COMPLETE**: The restore job is partially completed.
             * *   **FAILED**: The restore job has failed.
             * *   **CANCELED**: The restore job is canceled.
             * *   **EXPIRED**: The restore job has timed out.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Indicates whether the database is restored to a different instance. Valid values:
             * <p>
             * 
             * *   true: The database is restored to a different instance.
             * *   false: The database is restored within the same instance.
             */
            public Builder systemCopy(Boolean systemCopy) {
                this.systemCopy = systemCopy;
                return this;
            }

            /**
             * Indicates whether a catalog backup is used to restore the database. This parameter is returned only if the value of the Mode parameter is **RECOVERY_TO_SPECIFIC_BACKUP**. If the return value is false, HBR finds the backup file based on the specified prefix and then restores the backup file.
             */
            public Builder useCatalog(Boolean useCatalog) {
                this.useCatalog = useCatalog;
                return this;
            }

            /**
             * Indicates whether a differential backup or an incremental backup is used to restore the database. Valid values: true and false. If the return value is true, HBR uses a differential backup or an incremental backup to restore the database. If the return value is false, HBR uses a log backup to restore the database.
             */
            public Builder useDelta(Boolean useDelta) {
                this.useDelta = useDelta;
                return this;
            }

            /**
             * The ID of the backup vault.
             */
            public Builder vaultId(String vaultId) {
                this.vaultId = vaultId;
                return this;
            }

            /**
             * The ID of the volume that is restored. This parameter is returned only if the value of the Mode parameter is **RECOVERY_TO_LOG_POSITION**.
             */
            public Builder volumeId(Integer volumeId) {
                this.volumeId = volumeId;
                return this;
            }

            public HanaRestores build() {
                return new HanaRestores(this);
            } 

        } 

    }
    public static class HanaRestore extends TeaModel {
        @NameInMap("HanaRestores")
        private java.util.List < HanaRestores> hanaRestores;

        private HanaRestore(Builder builder) {
            this.hanaRestores = builder.hanaRestores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HanaRestore create() {
            return builder().build();
        }

        /**
         * @return hanaRestores
         */
        public java.util.List < HanaRestores> getHanaRestores() {
            return this.hanaRestores;
        }

        public static final class Builder {
            private java.util.List < HanaRestores> hanaRestores; 

            /**
             * HanaRestores.
             */
            public Builder hanaRestores(java.util.List < HanaRestores> hanaRestores) {
                this.hanaRestores = hanaRestores;
                return this;
            }

            public HanaRestore build() {
                return new HanaRestore(this);
            } 

        } 

    }
}
