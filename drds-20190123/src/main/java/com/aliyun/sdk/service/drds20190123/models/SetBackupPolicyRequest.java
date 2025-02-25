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

        private Builder(SetBackupPolicyRequest request) {
            super(request);
            this.backupDbNames = request.backupDbNames;
            this.backupLevel = request.backupLevel;
            this.backupLog = request.backupLog;
            this.backupMode = request.backupMode;
            this.dataBackupRetentionPeriod = request.dataBackupRetentionPeriod;
            this.drdsInstanceId = request.drdsInstanceId;
            this.logBackupRetentionPeriod = request.logBackupRetentionPeriod;
            this.preferredBackupEndTime = request.preferredBackupEndTime;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupStartTime = request.preferredBackupStartTime;
        } 

        /**
         * The databases to be backed up. Separate multiple databases with commas (,).
         * <p>
         * 
         * >  This parameter takes effect only when the backup level is database level.
         */
        public Builder backupDbNames(String backupDbNames) {
            this.putQueryParameter("BackupDbNames", backupDbNames);
            this.backupDbNames = backupDbNames;
            return this;
        }

        /**
         * The level of the backup. Valid values:
         * <p>
         * 
         * *   db: The database type.
         * *   instance: instance
         */
        public Builder backupLevel(String backupLevel) {
            this.putQueryParameter("BackupLevel", backupLevel);
            this.backupLevel = backupLevel;
            return this;
        }

        /**
         * Specifies whether to enable log Backup. Valid values:
         * <p>
         * 
         * *   1: enabled.
         * *   0: disabled.
         */
        public Builder backupLog(String backupLog) {
            this.putQueryParameter("BackupLog", backupLog);
            this.backupLog = backupLog;
            return this;
        }

        /**
         * The backup mode. Valid values:
         * <p>
         * 
         * *   **Logic **: logical backup
         * *   **phy**: physical backup
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * The retention period of the backup data. Value range: 7 to 730.
         */
        public Builder dataBackupRetentionPeriod(String dataBackupRetentionPeriod) {
            this.putQueryParameter("DataBackupRetentionPeriod", dataBackupRetentionPeriod);
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * The log retention period. Valid values: 7 to 730. This value must be less than or equal to the number of data backup days.
         */
        public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
            this.putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * The end time of the backup.
         */
        public Builder preferredBackupEndTime(String preferredBackupEndTime) {
            this.putQueryParameter("PreferredBackupEndTime", preferredBackupEndTime);
            this.preferredBackupEndTime = preferredBackupEndTime;
            return this;
        }

        /**
         * The backup cycle. Valid values:
         * <p>
         * 
         * *   0: Monday
         * *   1: Tuesday
         * *   2: Wednesday
         * *   3: Thursday
         * *   4: Friday
         * *   5: Saturday
         * *   6: Sunday
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * The start time of the backup.
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
