// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateHanaBackupSettingRequest} extends {@link RequestModel}
 *
 * <p>UpdateHanaBackupSettingRequest</p>
 */
public class UpdateHanaBackupSettingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogBackupParameterFile")
    private String catalogBackupParameterFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogBackupUsingBackint")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean catalogBackupUsingBackint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataBackupParameterFile")
    private String dataBackupParameterFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableAutoLogBackup")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableAutoLogBackup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupParameterFile")
    private String logBackupParameterFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupTimeout")
    private Long logBackupTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupUsingBackint")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean logBackupUsingBackint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VaultId")
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
         * <p>The configuration file for catalog backup.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
         */
        public Builder catalogBackupParameterFile(String catalogBackupParameterFile) {
            this.putQueryParameter("CatalogBackupParameterFile", catalogBackupParameterFile);
            this.catalogBackupParameterFile = catalogBackupParameterFile;
            return this;
        }

        /**
         * <p>Specifies whether to use Backint to back up catalogs. Valid values:</p>
         * <ul>
         * <li>true: Backint is used to back up catalogs.</li>
         * <li>false: Backint is not used to back up catalogs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder catalogBackupUsingBackint(Boolean catalogBackupUsingBackint) {
            this.putQueryParameter("CatalogBackupUsingBackint", catalogBackupUsingBackint);
            this.catalogBackupUsingBackint = catalogBackupUsingBackint;
            return this;
        }

        /**
         * <p>The ID of the SAP HANA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cl-000ezvg******8znz</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The configuration file for data backup.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
         */
        public Builder dataBackupParameterFile(String dataBackupParameterFile) {
            this.putQueryParameter("DataBackupParameterFile", dataBackupParameterFile);
            this.dataBackupParameterFile = dataBackupParameterFile;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEMDB</p>
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic log backup. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables automatic log backup.</li>
         * <li><strong>false</strong>: disables automatic log backup.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAutoLogBackup(Boolean enableAutoLogBackup) {
            this.putQueryParameter("EnableAutoLogBackup", enableAutoLogBackup);
            this.enableAutoLogBackup = enableAutoLogBackup;
            return this;
        }

        /**
         * <p>The configuration file for log backup.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sap/SID/SYS/global/hdb/opt/hdbconfig/param</p>
         */
        public Builder logBackupParameterFile(String logBackupParameterFile) {
            this.putQueryParameter("LogBackupParameterFile", logBackupParameterFile);
            this.logBackupParameterFile = logBackupParameterFile;
            return this;
        }

        /**
         * <p>The interval at which logs are backed up. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder logBackupTimeout(Long logBackupTimeout) {
            this.putQueryParameter("LogBackupTimeout", logBackupTimeout);
            this.logBackupTimeout = logBackupTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to use Backint to back up logs. Valid values:</p>
         * <ul>
         * <li>true: Backint is used to back up logs.</li>
         * <li>false: Backint is not used to back up logs.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder logBackupUsingBackint(Boolean logBackupUsingBackint) {
            this.putQueryParameter("LogBackupUsingBackint", logBackupUsingBackint);
            this.logBackupUsingBackint = logBackupUsingBackint;
            return this;
        }

        /**
         * <p>The ID of the backup vault.</p>
         * 
         * <strong>example:</strong>
         * <p>v-0005n******rluw5</p>
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
