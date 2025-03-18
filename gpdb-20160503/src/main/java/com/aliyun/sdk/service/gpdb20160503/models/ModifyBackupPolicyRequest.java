// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableRecoveryPoint")
    private Boolean enableRecoveryPoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupPeriod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preferredBackupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreferredBackupTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preferredBackupTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecoveryPointPeriod")
    private String recoveryPointPeriod;

    private ModifyBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupRetentionPeriod = builder.backupRetentionPeriod;
        this.DBInstanceId = builder.DBInstanceId;
        this.enableRecoveryPoint = builder.enableRecoveryPoint;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.recoveryPointPeriod = builder.recoveryPointPeriod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyBackupPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupRetentionPeriod
     */
    public Integer getBackupRetentionPeriod() {
        return this.backupRetentionPeriod;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return enableRecoveryPoint
     */
    public Boolean getEnableRecoveryPoint() {
        return this.enableRecoveryPoint;
    }

    /**
     * @return preferredBackupPeriod
     */
    public String getPreferredBackupPeriod() {
        return this.preferredBackupPeriod;
    }

    /**
     * @return preferredBackupTime
     */
    public String getPreferredBackupTime() {
        return this.preferredBackupTime;
    }

    /**
     * @return recoveryPointPeriod
     */
    public String getRecoveryPointPeriod() {
        return this.recoveryPointPeriod;
    }

    public static final class Builder extends Request.Builder<ModifyBackupPolicyRequest, Builder> {
        private Integer backupRetentionPeriod; 
        private String DBInstanceId; 
        private Boolean enableRecoveryPoint; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String recoveryPointPeriod; 

        private Builder() {
            super();
        } 

        private Builder(ModifyBackupPolicyRequest request) {
            super(request);
            this.backupRetentionPeriod = request.backupRetentionPeriod;
            this.DBInstanceId = request.DBInstanceId;
            this.enableRecoveryPoint = request.enableRecoveryPoint;
            this.preferredBackupPeriod = request.preferredBackupPeriod;
            this.preferredBackupTime = request.preferredBackupTime;
            this.recoveryPointPeriod = request.recoveryPointPeriod;
        } 

        /**
         * <p>The number of days for which data backup files are retained. Default value: 7. Maximum value: 7. Valid values: 1 to 7.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic point-in-time backup.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableRecoveryPoint(Boolean enableRecoveryPoint) {
            this.putQueryParameter("EnableRecoveryPoint", enableRecoveryPoint);
            this.enableRecoveryPoint = enableRecoveryPoint;
            return this;
        }

        /**
         * <p>The cycle based on which backups are performed. If more than one day of the week is specified, the days of the week are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>Monday</li>
         * <li>Tuesday</li>
         * <li>Wednesday</li>
         * <li>Thursday</li>
         * <li>Friday</li>
         * <li>Saturday</li>
         * <li>Sunday</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Tuesday, Thursday, Saturday</p>
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.putQueryParameter("PreferredBackupPeriod", preferredBackupPeriod);
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * <p>The backup window. Specify the backup window in the HH:mmZ-HH:mmZ format. The backup window must be in UTC. Default value: 00:00-01:00.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>15:00Z-16:00Z</p>
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * <p>The frequency of point-in-time backup.</p>
         * <ul>
         * <li>1: per hour</li>
         * <li>2: per 2 hours</li>
         * <li>4: per 4 hours</li>
         * <li>8: per 8 hours</li>
         * </ul>
         * <p>Default value: 8.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder recoveryPointPeriod(String recoveryPointPeriod) {
            this.putQueryParameter("RecoveryPointPeriod", recoveryPointPeriod);
            this.recoveryPointPeriod = recoveryPointPeriod;
            return this;
        }

        @Override
        public ModifyBackupPolicyRequest build() {
            return new ModifyBackupPolicyRequest(this);
        } 

    } 

}
