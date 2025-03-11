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
 * {@link StartRestoreRequest} extends {@link RequestModel}
 *
 * <p>StartRestoreRequest</p>
 */
public class StartRestoreRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupDbNames")
    private String backupDbNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupId")
    private String backupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupLevel")
    private String backupLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupMode")
    private String backupMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
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

        private Builder(StartRestoreRequest request) {
            super(request);
            this.backupDbNames = request.backupDbNames;
            this.backupId = request.backupId;
            this.backupLevel = request.backupLevel;
            this.backupMode = request.backupMode;
            this.drdsInstanceId = request.drdsInstanceId;
            this.preferredBackupTime = request.preferredBackupTime;
        } 

        /**
         * <p>The name of the database to be restored. Separate multiple databases with commas (,).</p>
         * <blockquote>
         * <p> If you do not specify any database name, all databases in the instance are restored by default.</p>
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
         * <p>The ID of the DRDS backup set.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system restores data by time (PreferredBackupTime).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23***</p>
         */
        public Builder backupId(String backupId) {
            this.putQueryParameter("BackupId", backupId);
            this.backupId = backupId;
            return this;
        }

        /**
         * <p>The level of the backup. Valid values:</p>
         * <ul>
         * <li>db: The database level.</li>
         * <li>instance: the instance level.</li>
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
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li>logic: the logical backup.</li>
         * <li>phy: fast backup</li>
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
         * <p>The ID of the DRDS instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rds********</p>
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * <p>The restoration time of the instance, in the format of<code> yyyy-MM-dd HH:mm:ss</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-09-10 20:18:18</p>
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
