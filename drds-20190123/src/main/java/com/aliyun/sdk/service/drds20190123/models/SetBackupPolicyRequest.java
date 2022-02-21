// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetBackupPolicyRequest</p>
 */
public class SetBackupPolicyRequest extends Request {
    @Query
    @NameInMap("BackupDbNames")
    private String backupDbNames;

    @Query
    @NameInMap("BackupLevel")
    private String backupLevel;

    @Query
    @NameInMap("BackupLog")
    private String backupLog;

    @Query
    @NameInMap("BackupMode")
    private String backupMode;

    @Query
    @NameInMap("DataBackupRetentionPeriod")
    private String dataBackupRetentionPeriod;

    @Query
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    private String drdsInstanceId;

    @Query
    @NameInMap("LogBackupRetentionPeriod")
    private String logBackupRetentionPeriod;

    @Query
    @NameInMap("PreferredBackupEndTime")
    private String preferredBackupEndTime;

    @Query
    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @Query
    @NameInMap("PreferredBackupStartTime")
    private String preferredBackupStartTime;

    private SetBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupDbNames = builder.backupDbNames;
        this.backupLevel = builder.backupLevel;
        this.backupLog = builder.backupLog;
        this.backupMode = builder.backupMode;
        this.dataBackupRetentionPeriod = builder.dataBackupRetentionPeriod;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.logBackupRetentionPeriod = builder.logBackupRetentionPeriod;
        this.preferredBackupEndTime = builder.preferredBackupEndTime;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupStartTime = builder.preferredBackupStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetBackupPolicyRequest create() {
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
     * @return backupLevel
     */
    public String getBackupLevel() {
        return this.backupLevel;
    }

    /**
     * @return backupLog
     */
    public String getBackupLog() {
        return this.backupLog;
    }

    /**
     * @return backupMode
     */
    public String getBackupMode() {
        return this.backupMode;
    }

    /**
     * @return dataBackupRetentionPeriod
     */
    public String getDataBackupRetentionPeriod() {
        return this.dataBackupRetentionPeriod;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return logBackupRetentionPeriod
     */
    public String getLogBackupRetentionPeriod() {
        return this.logBackupRetentionPeriod;
    }

    /**
     * @return preferredBackupEndTime
     */
    public String getPreferredBackupEndTime() {
        return this.preferredBackupEndTime;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupStartTime
     */
    public String getPreferredBackupStartTime() {
        return this.preferredBackupStartTime;
    }

    public static final class Builder extends Request.Builder<SetBackupPolicyRequest, Builder> {
        private String backupDbNames; 
        private String backupLevel; 
        private String backupLog; 
        private String backupMode; 
        private String dataBackupRetentionPeriod; 
        private String drdsInstanceId; 
        private String logBackupRetentionPeriod; 
        private String preferredBackupEndTime; 
        private String preferredBackupPeriod; 
        private String preferredBackupStartTime; 

        private Builder() {
            super();
        } 

        private Builder(SetBackupPolicyRequest response) {
            super(response);
            this.backupDbNames = response.backupDbNames;
            this.backupLevel = response.backupLevel;
            this.backupLog = response.backupLog;
            this.backupMode = response.backupMode;
            this.dataBackupRetentionPeriod = response.dataBackupRetentionPeriod;
            this.drdsInstanceId = response.drdsInstanceId;
            this.logBackupRetentionPeriod = response.logBackupRetentionPeriod;
            this.preferredBackupEndTime = response.preferredBackupEndTime;
            this.preferredBackupPeriod = response.preferredBackupPeriod;
            this.preferredBackupStartTime = response.preferredBackupStartTime;
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
         * BackupLevel.
         */
        public Builder backupLevel(String backupLevel) {
            this.putQueryParameter("BackupLevel", backupLevel);
            this.backupLevel = backupLevel;
            return this;
        }

        /**
         * BackupLog.
         */
        public Builder backupLog(String backupLog) {
            this.putQueryParameter("BackupLog", backupLog);
            this.backupLog = backupLog;
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
         * DataBackupRetentionPeriod.
         */
        public Builder dataBackupRetentionPeriod(String dataBackupRetentionPeriod) {
            this.putQueryParameter("DataBackupRetentionPeriod", dataBackupRetentionPeriod);
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
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
         * LogBackupRetentionPeriod.
         */
        public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
            this.putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * PreferredBackupEndTime.
         */
        public Builder preferredBackupEndTime(String preferredBackupEndTime) {
            this.putQueryParameter("PreferredBackupEndTime", preferredBackupEndTime);
            this.preferredBackupEndTime = preferredBackupEndTime;
            return this;
        }

        /**
         * PreferredBackupPeriod.
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * PreferredBackupStartTime.
         */
        public Builder preferredBackupStartTime(String preferredBackupStartTime) {
            this.putQueryParameter("PreferredBackupStartTime", preferredBackupStartTime);
            this.preferredBackupStartTime = preferredBackupStartTime;
            return this;
        }

        @Override
        public SetBackupPolicyRequest build() {
            return new SetBackupPolicyRequest(this);
        } 

    } 

}
