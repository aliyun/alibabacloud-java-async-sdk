// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

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
 * {@link SetBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>SetBackupPolicyRequest</p>
 */
public class SetBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupDbNames")
    private String backupDbNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLevel")
    private String backupLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLog")
    private String backupLog;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataBackupRetentionPeriod")
    private String dataBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogBackupRetentionPeriod")
    private String logBackupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupEndTime")
    private String preferredBackupEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupStartTime")
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
         * <p>The databases to be backed up. Separate multiple databases with commas (,).</p>
         * <blockquote>
         * <p> This parameter takes effect only when the backup level is database level.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test1,test2</p>
         */
        public Builder backupDbNames(String backupDbNames) {
            this.putQueryParameter("BackupDbNames", backupDbNames);
            this.backupDbNames = backupDbNames;
            return this;
        }

        /**
         * <p>The level of the backup. Valid values:</p>
         * <ul>
         * <li>db: The database type.</li>
         * <li>instance: instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>db</p>
         */
        public Builder backupLevel(String backupLevel) {
            this.putQueryParameter("BackupLevel", backupLevel);
            this.backupLevel = backupLevel;
            return this;
        }

        /**
         * <p>Specifies whether to enable log Backup. Valid values:</p>
         * <ul>
         * <li>1: enabled.</li>
         * <li>0: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder backupLog(String backupLog) {
            this.putQueryParameter("BackupLog", backupLog);
            this.backupLog = backupLog;
            return this;
        }

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li>**Logic **: logical backup</li>
         * <li><strong>phy</strong>: physical backup</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>phy</p>
         */
        public Builder backupMode(String backupMode) {
            this.putQueryParameter("BackupMode", backupMode);
            this.backupMode = backupMode;
            return this;
        }

        /**
         * <p>The retention period of the backup data. Value range: 7 to 730.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder dataBackupRetentionPeriod(String dataBackupRetentionPeriod) {
            this.putQueryParameter("DataBackupRetentionPeriod", dataBackupRetentionPeriod);
            this.dataBackupRetentionPeriod = dataBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>drds************</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The log retention period. Valid values: 7 to 730. This value must be less than or equal to the number of data backup days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder logBackupRetentionPeriod(String logBackupRetentionPeriod) {
            this.putQueryParameter("LogBackupRetentionPeriod", logBackupRetentionPeriod);
            this.logBackupRetentionPeriod = logBackupRetentionPeriod;
            return this;
        }

        /**
         * <p>The end time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>12:30:30</p>
         */
        public Builder preferredBackupEndTime(String preferredBackupEndTime) {
            this.putQueryParameter("PreferredBackupEndTime", preferredBackupEndTime);
            this.preferredBackupEndTime = preferredBackupEndTime;
            return this;
        }

        /**
         * <p>The backup cycle. Valid values:</p>
         * <ul>
         * <li>0: Monday</li>
         * <li>1: Tuesday</li>
         * <li>2: Wednesday</li>
         * <li>3: Thursday</li>
         * <li>4: Friday</li>
         * <li>5: Saturday</li>
         * <li>6: Sunday</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The start time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>11:30:30</p>
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
