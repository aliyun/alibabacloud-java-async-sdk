// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartRestoreRequest} extends {@link RequestModel}
 *
 * <p>StartRestoreRequest</p>
 */
public class StartRestoreRequest extends Request {
    @Query
    @NameInMap("BackupDbNames")
    private String backupDbNames;

    @Query
    @NameInMap("BackupId")
    private String backupId;

    @Query
    @NameInMap("BackupLevel")
    private String backupLevel;

    @Query
    @NameInMap("BackupMode")
    private String backupMode;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    private StartRestoreRequest(Builder builder) {
        super(builder);
        this.backupDbNames = builder.backupDbNames;
        this.backupId = builder.backupId;
        this.backupLevel = builder.backupLevel;
        this.backupMode = builder.backupMode;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.preferredBackupTime = builder.preferredBackupTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRestoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupDbNames
     */
    public String getBackupDbNames() {
        return this.backupDbNames;
    }

    /**
     * @return backupId
     */
    public String getBackupId() {
        return this.backupId;
    }

    /**
     * @return backupLevel
     */
    public String getBackupLevel() {
        return this.backupLevel;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    public static final class Builder extends Request.Builder<StartRestoreRequest, Builder> {
        private String backupDbNames; 
        private String backupId; 
        private String backupLevel; 
        private String backupMode; 
        private String drdsInstanceId; 
        private String preferredBackupTime; 

        private Builder() {
            super();
        } 

        private Builder(StartRestoreRequest response) {
            super(response);
            this.backupDbNames = response.backupDbNames;
            this.backupId = response.backupId;
            this.backupLevel = response.backupLevel;
            this.backupMode = response.backupMode;
            this.drdsInstanceId = response.drdsInstanceId;
            this.preferredBackupTime = response.preferredBackupTime;
        } 

        /**
         * BackupDbNames.
         */
        public Builder backupDbNames(String backupDbNames) {
            this.putQueryParameter("BackupDbNames", backupDbNames);
            this.backupDbNames = backupDbNames;
            return this;
        }

        /**
         * BackupId.
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * BackupLevel.
         */
        public Builder backupLevel(String backupLevel) {
            this.putQueryParameter("BackupLevel", backupLevel);
            this.backupLevel = backupLevel;
            return this;
        }

        /**
         * BackupMode.
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * PreferredBackupTime.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        @Override
        public StartRestoreRequest build() {
            return new StartRestoreRequest(this);
        } 

    } 

}
