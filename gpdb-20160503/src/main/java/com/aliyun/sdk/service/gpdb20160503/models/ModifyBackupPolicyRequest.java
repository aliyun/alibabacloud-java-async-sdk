// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>ModifyBackupPolicyRequest</p>
 */
public class ModifyBackupPolicyRequest extends Request {
    @Query
    @NameInMap("BackupRetentionPeriod")
    private Integer backupRetentionPeriod;

    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("EnableRecoveryPoint")
    private Boolean enableRecoveryPoint;

    @Query
    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @Query
    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @Query
    @NameInMap("RecoveryPointPeriod")
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

        private Builder(ModifyBackupPolicyRequest response) {
            super(response);
            this.backupRetentionPeriod = response.backupRetentionPeriod;
            this.DBInstanceId = response.DBInstanceId;
            this.enableRecoveryPoint = response.enableRecoveryPoint;
            this.preferredBackupPeriod = response.preferredBackupPeriod;
            this.preferredBackupTime = response.preferredBackupTime;
            this.recoveryPointPeriod = response.recoveryPointPeriod;
        } 

        /**
         * BackupRetentionPeriod.
         */
        public Builder backupRetentionPeriod(Integer backupRetentionPeriod) {
            this.putQueryParameter("BackupRetentionPeriod", backupRetentionPeriod);
            this.backupRetentionPeriod = backupRetentionPeriod;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * EnableRecoveryPoint.
         */
        public Builder enableRecoveryPoint(Boolean enableRecoveryPoint) {
            this.putQueryParameter("EnableRecoveryPoint", enableRecoveryPoint);
            this.enableRecoveryPoint = enableRecoveryPoint;
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
         * PreferredBackupTime.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.putQueryParameter("PreferredBackupTime", preferredBackupTime);
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * RecoveryPointPeriod.
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
