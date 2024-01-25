// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHanaRestoreRequest} extends {@link RequestModel}
 *
 * <p>CreateHanaRestoreRequest</p>
 */
public class CreateHanaRestoreRequest extends Request {
    @Query
    @NameInMap("BackupId")
    private Long backupId;

    @Query
    @NameInMap("BackupPrefix")
    @Validation(required = true)
    private String backupPrefix;

    @Query
    @NameInMap("CheckAccess")
    private Boolean checkAccess;

    @Query
    @NameInMap("ClearLog")
    private Boolean clearLog;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Query
    @NameInMap("LogPosition")
    private Long logPosition;

    @Query
    @NameInMap("MasterClientId")
    private String masterClientId;

    @Query
    @NameInMap("Mode")
    @Validation(required = true)
    private String mode;

    @Query
    @NameInMap("RecoveryPointInTime")
    private Long recoveryPointInTime;

    @Query
    @NameInMap("SidAdmin")
    private String sidAdmin;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("SourceClusterId")
    private String sourceClusterId;

    @Query
    @NameInMap("SystemCopy")
    private Boolean systemCopy;

    @Query
    @NameInMap("UseCatalog")
    private Boolean useCatalog;

    @Query
    @NameInMap("UseDelta")
    private Boolean useDelta;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    @Query
    @NameInMap("VolumeId")
    private Integer volumeId;

    private CreateHanaRestoreRequest(Builder builder) {
        super(builder);
        this.backupId = builder.backupId;
        this.backupPrefix = builder.backupPrefix;
        this.checkAccess = builder.checkAccess;
        this.clearLog = builder.clearLog;
        this.clusterId = builder.clusterId;
        this.databaseName = builder.databaseName;
        this.logPosition = builder.logPosition;
        this.masterClientId = builder.masterClientId;
        this.mode = builder.mode;
        this.recoveryPointInTime = builder.recoveryPointInTime;
        this.sidAdmin = builder.sidAdmin;
        this.source = builder.source;
        this.sourceClusterId = builder.sourceClusterId;
        this.systemCopy = builder.systemCopy;
        this.useCatalog = builder.useCatalog;
        this.useDelta = builder.useDelta;
        this.vaultId = builder.vaultId;
        this.volumeId = builder.volumeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHanaRestoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupId
     */
    public Long getBackupId() {
        return this.backupId;
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return logPosition
     */
    public Long getLogPosition() {
        return this.logPosition;
    }

    /**
     * @return masterClientId
     */
    public String getMasterClientId() {
        return this.masterClientId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return recoveryPointInTime
     */
    public Long getRecoveryPointInTime() {
        return this.recoveryPointInTime;
    }

    /**
     * @return sidAdmin
     */
    public String getSidAdmin() {
        return this.sidAdmin;
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

    public static final class Builder extends Request.Builder<CreateHanaRestoreRequest, Builder> {
        private Long backupId; 
        private String backupPrefix; 
        private Boolean checkAccess; 
        private Boolean clearLog; 
        private String clusterId; 
        private String databaseName; 
        private Long logPosition; 
        private String masterClientId; 
        private String mode; 
        private Long recoveryPointInTime; 
        private String sidAdmin; 
        private String source; 
        private String sourceClusterId; 
        private Boolean systemCopy; 
        private Boolean useCatalog; 
        private Boolean useDelta; 
        private String vaultId; 
        private Integer volumeId; 

        private Builder() {
            super();
        } 

        private Builder(CreateHanaRestoreRequest request) {
            super(request);
            this.backupId = request.backupId;
            this.backupPrefix = request.backupPrefix;
            this.checkAccess = request.checkAccess;
            this.clearLog = request.clearLog;
            this.clusterId = request.clusterId;
            this.databaseName = request.databaseName;
            this.logPosition = request.logPosition;
            this.masterClientId = request.masterClientId;
            this.mode = request.mode;
            this.recoveryPointInTime = request.recoveryPointInTime;
            this.sidAdmin = request.sidAdmin;
            this.source = request.source;
            this.sourceClusterId = request.sourceClusterId;
            this.systemCopy = request.systemCopy;
            this.useCatalog = request.useCatalog;
            this.useDelta = request.useDelta;
            this.vaultId = request.vaultId;
            this.volumeId = request.volumeId;
        } 

        /**
         * The ID of the backup.
         */
        public Builder backupId(Long backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * The backup prefix.
         */
        public Builder backupPrefix(String backupPrefix) {
            this.putQueryParameter("BackupPrefix", backupPrefix);
            this.backupPrefix = backupPrefix;
            return this;
        }

        /**
         * Specifies whether to validate the differential backup and log backup. Valid values: true and false. If you set the value to true, HBR checks whether the required differential backup and log backup are available before the restore job starts. If the differential backup or log backup is unavailable, HBR does not start the restore job.
         */
        public Builder checkAccess(Boolean checkAccess) {
            this.putQueryParameter("CheckAccess", checkAccess);
            this.checkAccess = checkAccess;
            return this;
        }

        /**
         * Specifies whether to delete all log entries from the log area after the log entries are restored. Valid values: true and false. If you set the value to false, all log entries are deleted from the log area after the log entries are restored.
         */
        public Builder clearLog(Boolean clearLog) {
            this.putQueryParameter("ClearLog", clearLog);
            this.clearLog = clearLog;
            return this;
        }

        /**
         * The ID of the SAP HANA instance that you want to restore.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The name of the database that you want to restore.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * The log position to which you want to restore the database. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_LOG_POSITION**.
         */
        public Builder logPosition(Long logPosition) {
            this.putQueryParameter("LogPosition", logPosition);
            this.logPosition = logPosition;
            return this;
        }

        /**
         * The ID of the client where the primary node of the SAP HANA resides.
         */
        public Builder masterClientId(String masterClientId) {
            this.putQueryParameter("MasterClientId", masterClientId);
            this.masterClientId = masterClientId;
            return this;
        }

        /**
         * The recovery mode. Valid values:
         * <p>
         * 
         * *   **RECOVERY_TO_MOST_RECENT**: restores the database to the recently available state to which the database has been backed up.
         * *   **RECOVERY_TO_POINT_IN_TIME**: restores the database to a specified point in time.
         * *   **RECOVERY_TO_SPECIFIC_BACKUP**: restores the database to a specified backup.
         * *   **RECOVERY_TO_LOG_POSITION**: restores the database to a specified log position.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * The point in time to which you want to restore the database. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_POINT_IN_TIME**. HBR restores the database to a state closest to the specified point in time.
         */
        public Builder recoveryPointInTime(Long recoveryPointInTime) {
            this.putQueryParameter("RecoveryPointInTime", recoveryPointInTime);
            this.recoveryPointInTime = recoveryPointInTime;
            return this;
        }

        /**
         * The SID admin account that is created by SAP HANA.
         */
        public Builder sidAdmin(String sidAdmin) {
            this.putQueryParameter("SidAdmin", sidAdmin);
            this.sidAdmin = sidAdmin;
            return this;
        }

        /**
         * The name of the source system. This parameter specifies the name of the source database that you want to restore. You must set the parameter in the `<Source database name>@SID` format.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The ID of the source SAP HANA instance.
         */
        public Builder sourceClusterId(String sourceClusterId) {
            this.putQueryParameter("SourceClusterId", sourceClusterId);
            this.sourceClusterId = sourceClusterId;
            return this;
        }

        /**
         * Specifies whether to restore the database to a different instance.
         */
        public Builder systemCopy(Boolean systemCopy) {
            this.putQueryParameter("SystemCopy", systemCopy);
            this.systemCopy = systemCopy;
            return this;
        }

        /**
         * Specifies whether to use a catalog backup to restore the database. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_SPECIFIC_BACKUP**. If you do not use a catalog backup, you must specify the prefix of a backup file. Then, HBR finds the backup file based on the specified prefix and restores the backup file.
         */
        public Builder useCatalog(Boolean useCatalog) {
            this.putQueryParameter("UseCatalog", useCatalog);
            this.useCatalog = useCatalog;
            return this;
        }

        /**
         * Specifies whether to use a differential backup or an incremental backup to restore the database. Valid values: true and false. If you want to use a differential backup or an incremental backup to restore the database, set the value to true. If you set the value to false, HBR uses a log backup to restore the database.
         */
        public Builder useDelta(Boolean useDelta) {
            this.putQueryParameter("UseDelta", useDelta);
            this.useDelta = useDelta;
            return this;
        }

        /**
         * The ID of the vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        /**
         * The ID of the volume that you want to restore. This parameter is valid only if you set the Mode parameter to **RECOVERY_TO_LOG_POSITION**.
         */
        public Builder volumeId(Integer volumeId) {
            this.putQueryParameter("VolumeId", volumeId);
            this.volumeId = volumeId;
            return this;
        }

        @Override
        public CreateHanaRestoreRequest build() {
            return new CreateHanaRestoreRequest(this);
        } 

    } 

}
