// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateHanaRestoreRequest} extends {@link RequestModel}
 *
 * <p>CreateHanaRestoreRequest</p>
 */
public class CreateHanaRestoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private Long backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPrefix")
    @com.aliyun.core.annotation.Validation(required = true)
    private String backupPrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckAccess")
    private Boolean checkAccess;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClearLog")
    private Boolean clearLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogPosition")
    private Long logPosition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterClientId")
    private String masterClientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryPointInTime")
    private Long recoveryPointInTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SidAdmin")
    private String sidAdmin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceClusterId")
    private String sourceClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SystemCopy")
    private Boolean systemCopy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseCatalog")
    private Boolean useCatalog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseDelta")
    private Boolean useDelta;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
    private String vaultId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VolumeId")
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
         * <p>The ID of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>1645628400235</p>
         */
        public Builder backupId(Long backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The backup prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETE_DATA_BACKUP_2022_05_02_15_39</p>
         */
        public Builder backupPrefix(String backupPrefix) {
            this.putQueryParameter("BackupPrefix", backupPrefix);
            this.backupPrefix = backupPrefix;
            return this;
        }

        /**
         * <p>Specifies whether to validate the differential backup and log backup. Valid values: true and false. If you set the value to true, HBR checks whether the required differential backup and log backup are available before the restore job starts. If the differential backup or log backup is unavailable, HBR does not start the restore job.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder checkAccess(Boolean checkAccess) {
            this.putQueryParameter("CheckAccess", checkAccess);
            this.checkAccess = checkAccess;
            return this;
        }

        /**
         * <p>Specifies whether to delete all log entries from the log area after the log entries are restored. Valid values: true and false. If you set the value to false, all log entries are deleted from the log area after the log entries are restored.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder clearLog(Boolean clearLog) {
            this.putQueryParameter("ClearLog", clearLog);
            this.clearLog = clearLog;
            return this;
        }

        /**
         * <p>The ID of the SAP HANA instance that you want to restore.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000fbrs5******ka9w</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The name of the database that you want to restore.</p>
         * 
         * <strong>example:</strong>
         * <p>TS2</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>The log position to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder logPosition(Long logPosition) {
            this.putQueryParameter("LogPosition", logPosition);
            this.logPosition = logPosition;
            return this;
        }

        /**
         * <p>The ID of the client where the primary node of the SAP HANA resides.</p>
         * 
         * <strong>example:</strong>
         * <p>c-000ii8tzv**********</p>
         */
        public Builder masterClientId(String masterClientId) {
            this.putQueryParameter("MasterClientId", masterClientId);
            this.masterClientId = masterClientId;
            return this;
        }

        /**
         * <p>The recovery mode. Valid values:</p>
         * <ul>
         * <li><strong>RECOVERY_TO_MOST_RECENT</strong>: restores the database to the recently available state to which the database has been backed up.</li>
         * <li><strong>RECOVERY_TO_POINT_IN_TIME</strong>: restores the database to a specified point in time.</li>
         * <li><strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>: restores the database to a specified backup.</li>
         * <li><strong>RECOVERY_TO_LOG_POSITION</strong>: restores the database to a specified log position.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RECOVERY_TO_POINT_IN_TIME</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        /**
         * <p>The point in time to which you want to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_POINT_IN_TIME</strong>. HBR restores the database to a state closest to the specified point in time.</p>
         * 
         * <strong>example:</strong>
         * <p>1635315505</p>
         */
        public Builder recoveryPointInTime(Long recoveryPointInTime) {
            this.putQueryParameter("RecoveryPointInTime", recoveryPointInTime);
            this.recoveryPointInTime = recoveryPointInTime;
            return this;
        }

        /**
         * <p>The SID admin account that is created by SAP HANA.</p>
         * 
         * <strong>example:</strong>
         * <p>DB</p>
         */
        public Builder sidAdmin(String sidAdmin) {
            this.putQueryParameter("SidAdmin", sidAdmin);
            this.sidAdmin = sidAdmin;
            return this;
        }

        /**
         * <p>The name of the source system. This parameter specifies the name of the source database that you want to restore. You must set the parameter in the <code>&lt;Source database name&gt;@SID</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>HNP@HNP</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The ID of the source SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000ii8tzv******xm0t</p>
         */
        public Builder sourceClusterId(String sourceClusterId) {
            this.putQueryParameter("SourceClusterId", sourceClusterId);
            this.sourceClusterId = sourceClusterId;
            return this;
        }

        /**
         * <p>Specifies whether to restore the database to a different instance.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder systemCopy(Boolean systemCopy) {
            this.putQueryParameter("SystemCopy", systemCopy);
            this.systemCopy = systemCopy;
            return this;
        }

        /**
         * <p>Specifies whether to use a catalog backup to restore the database. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_SPECIFIC_BACKUP</strong>. If you do not use a catalog backup, you must specify the prefix of a backup file. Then, HBR finds the backup file based on the specified prefix and restores the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder useCatalog(Boolean useCatalog) {
            this.putQueryParameter("UseCatalog", useCatalog);
            this.useCatalog = useCatalog;
            return this;
        }

        /**
         * <p>Specifies whether to use a differential backup or an incremental backup to restore the database. Valid values: true and false. If you want to use a differential backup or an incremental backup to restore the database, set the value to true. If you set the value to false, HBR uses a log backup to restore the database.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useDelta(Boolean useDelta) {
            this.putQueryParameter("UseDelta", useDelta);
            this.useDelta = useDelta;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-000************yqr</p>
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        /**
         * <p>The ID of the volume that you want to restore. This parameter is valid only if you set the Mode parameter to <strong>RECOVERY_TO_LOG_POSITION</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
