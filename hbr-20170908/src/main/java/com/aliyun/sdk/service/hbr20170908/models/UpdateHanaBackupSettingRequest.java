// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHanaBackupSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateHanaBackupSettingRequest</p>
 */
public class UpdateHanaBackupSettingRequest extends Request {
    @Query
    @NameInMap("CatalogBackupParameterFile")
    private String catalogBackupParameterFile;

    @Query
    @NameInMap("CatalogBackupUsingBackint")
    @Validation(required = true)
    private Boolean catalogBackupUsingBackint;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DataBackupParameterFile")
    private String dataBackupParameterFile;

    @Query
    @NameInMap("DatabaseName")
    @Validation(required = true)
    private String databaseName;

    @Query
    @NameInMap("EnableAutoLogBackup")
    @Validation(required = true)
    private Boolean enableAutoLogBackup;

    @Query
    @NameInMap("LogBackupParameterFile")
    private String logBackupParameterFile;

    @Query
    @NameInMap("LogBackupTimeout")
    private Long logBackupTimeout;

    @Query
    @NameInMap("LogBackupUsingBackint")
    @Validation(required = true)
    private Boolean logBackupUsingBackint;

    @Query
    @NameInMap("VaultId")
    private String vaultId;

    private UpdateHanaBackupSettingRequest(Builder builder) {
        super(builder);
        this.catalogBackupParameterFile = builder.catalogBackupParameterFile;
        this.catalogBackupUsingBackint = builder.catalogBackupUsingBackint;
        this.clusterId = builder.clusterId;
        this.dataBackupParameterFile = builder.dataBackupParameterFile;
        this.databaseName = builder.databaseName;
        this.enableAutoLogBackup = builder.enableAutoLogBackup;
        this.logBackupParameterFile = builder.logBackupParameterFile;
        this.logBackupTimeout = builder.logBackupTimeout;
        this.logBackupUsingBackint = builder.logBackupUsingBackint;
        this.vaultId = builder.vaultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHanaBackupSettingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogBackupParameterFile
     */
    public String getCatalogBackupParameterFile() {
        return this.catalogBackupParameterFile;
    }

    /**
     * @return catalogBackupUsingBackint
     */
    public Boolean getCatalogBackupUsingBackint() {
        return this.catalogBackupUsingBackint;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return dataBackupParameterFile
     */
    public String getDataBackupParameterFile() {
        return this.dataBackupParameterFile;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return enableAutoLogBackup
     */
    public Boolean getEnableAutoLogBackup() {
        return this.enableAutoLogBackup;
    }

    /**
     * @return logBackupParameterFile
     */
    public String getLogBackupParameterFile() {
        return this.logBackupParameterFile;
    }

    /**
     * @return logBackupTimeout
     */
    public Long getLogBackupTimeout() {
        return this.logBackupTimeout;
    }

    /**
     * @return logBackupUsingBackint
     */
    public Boolean getLogBackupUsingBackint() {
        return this.logBackupUsingBackint;
    }

    /**
     * @return vaultId
     */
    public String getVaultId() {
        return this.vaultId;
    }

    public static final class Builder extends Request.Builder<UpdateHanaBackupSettingRequest, Builder> {
        private String catalogBackupParameterFile; 
        private Boolean catalogBackupUsingBackint; 
        private String clusterId; 
        private String dataBackupParameterFile; 
        private String databaseName; 
        private Boolean enableAutoLogBackup; 
        private String logBackupParameterFile; 
        private Long logBackupTimeout; 
        private Boolean logBackupUsingBackint; 
        private String vaultId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHanaBackupSettingRequest request) {
            super(request);
            this.catalogBackupParameterFile = request.catalogBackupParameterFile;
            this.catalogBackupUsingBackint = request.catalogBackupUsingBackint;
            this.clusterId = request.clusterId;
            this.dataBackupParameterFile = request.dataBackupParameterFile;
            this.databaseName = request.databaseName;
            this.enableAutoLogBackup = request.enableAutoLogBackup;
            this.logBackupParameterFile = request.logBackupParameterFile;
            this.logBackupTimeout = request.logBackupTimeout;
            this.logBackupUsingBackint = request.logBackupUsingBackint;
            this.vaultId = request.vaultId;
        } 

        /**
         * The configuration file for catalog backup.
         */
        public Builder catalogBackupParameterFile(String catalogBackupParameterFile) {
            this.putQueryParameter("CatalogBackupParameterFile", catalogBackupParameterFile);
            this.catalogBackupParameterFile = catalogBackupParameterFile;
            return this;
        }

        /**
         * Specifies whether to use Backint to back up catalogs. Valid values:
         * <p>
         * 
         * *   true: Backint is used to back up catalogs.
         * *   false: Backint is not used to back up catalogs.
         */
        public Builder catalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
            this.putQueryParameter("CatalogBackupUsingBackint", catalogBackupUsingBackint);
            this.catalogBackupUsingBackint = catalogBackupUsingBackint;
            return this;
        }

        /**
         * The ID of the SAP HANA instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The configuration file for data backup.
         */
        public Builder dataBackupParameterFile(String dataBackupParameterFile) {
            this.putQueryParameter("DataBackupParameterFile", dataBackupParameterFile);
            this.dataBackupParameterFile = dataBackupParameterFile;
            return this;
        }

        /**
         * The name of the database.
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Specifies whether to enable automatic log backup. Valid values:
         * <p>
         * 
         * *   **true**: enables automatic log backup.
         * *   **false**: disables automatic log backup.
         */
        public Builder enableAutoLogBackup(Boolean enableAutoLogBackup) {
            this.putQueryParameter("EnableAutoLogBackup", enableAutoLogBackup);
            this.enableAutoLogBackup = enableAutoLogBackup;
            return this;
        }

        /**
         * The configuration file for log backup.
         */
        public Builder logBackupParameterFile(String logBackupParameterFile) {
            this.putQueryParameter("LogBackupParameterFile", logBackupParameterFile);
            this.logBackupParameterFile = logBackupParameterFile;
            return this;
        }

        /**
         * The interval at which logs are backed up. Unit: seconds.
         */
        public Builder logBackupTimeout(Long logBackupTimeout) {
            this.putQueryParameter("LogBackupTimeout", logBackupTimeout);
            this.logBackupTimeout = logBackupTimeout;
            return this;
        }

        /**
         * Specifies whether to use Backint to back up logs. Valid values:
         * <p>
         * 
         * *   true: Backint is used to back up logs.
         * *   false: Backint is not used to back up logs.
         */
        public Builder logBackupUsingBackint(Boolean logBackupUsingBackint) {
            this.putQueryParameter("LogBackupUsingBackint", logBackupUsingBackint);
            this.logBackupUsingBackint = logBackupUsingBackint;
            return this;
        }

        /**
         * The ID of the backup vault.
         */
        public Builder vaultId(String vaultId) {
            this.putQueryParameter("VaultId", vaultId);
            this.vaultId = vaultId;
            return this;
        }

        @Override
        public UpdateHanaBackupSettingRequest build() {
            return new UpdateHanaBackupSettingRequest(this);
        } 

    } 

}
