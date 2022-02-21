// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateBackupPolicyRequest</p>
 */
public class UpdateBackupPolicyRequest extends Request {
    @Query
    @NameInMap("BackupPeriod")
    private String backupPeriod;

    @Query
    @NameInMap("BackupPlanBegin")
    private String backupPlanBegin;

    @Query
    @NameInMap("BackupSetRetention")
    private Integer backupSetRetention;

    @Query
    @NameInMap("BackupType")
    private String backupType;

    @Query
    @NameInMap("BackupWay")
    private String backupWay;

    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("ForceCleanOnHighSpaceUsage")
    private Integer forceCleanOnHighSpaceUsage;

    @Query
    @NameInMap("IsEnabled")
    private Integer isEnabled;

    @Query
    @NameInMap("LocalLogRetention")
    private Integer localLogRetention;

    @Query
    @NameInMap("LogLocalRetentionSpace")
    private Integer logLocalRetentionSpace;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RemoveLogRetention")
    private Integer removeLogRetention;

    private UpdateBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupPeriod = builder.backupPeriod;
        this.backupPlanBegin = builder.backupPlanBegin;
        this.backupSetRetention = builder.backupSetRetention;
        this.backupType = builder.backupType;
        this.backupWay = builder.backupWay;
        this.DBInstanceName = builder.DBInstanceName;
        this.forceCleanOnHighSpaceUsage = builder.forceCleanOnHighSpaceUsage;
        this.isEnabled = builder.isEnabled;
        this.localLogRetention = builder.localLogRetention;
        this.logLocalRetentionSpace = builder.logLocalRetentionSpace;
        this.regionId = builder.regionId;
        this.removeLogRetention = builder.removeLogRetention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBackupPolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backupPeriod
     */
    public String getBackupPeriod() {
        return this.backupPeriod;
    }

    /**
     * @return backupPlanBegin
     */
    public String getBackupPlanBegin() {
        return this.backupPlanBegin;
    }

    /**
     * @return backupSetRetention
     */
    public Integer getBackupSetRetention() {
        return this.backupSetRetention;
    }

    /**
     * @return backupType
     */
    public String getBackupType() {
        return this.backupType;
    }

    /**
     * @return backupWay
     */
    public String getBackupWay() {
        return this.backupWay;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return forceCleanOnHighSpaceUsage
     */
    public Integer getForceCleanOnHighSpaceUsage() {
        return this.forceCleanOnHighSpaceUsage;
    }

    /**
     * @return isEnabled
     */
    public Integer getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * @return localLogRetention
     */
    public Integer getLocalLogRetention() {
        return this.localLogRetention;
    }

    /**
     * @return logLocalRetentionSpace
     */
    public Integer getLogLocalRetentionSpace() {
        return this.logLocalRetentionSpace;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return removeLogRetention
     */
    public Integer getRemoveLogRetention() {
        return this.removeLogRetention;
    }

    public static final class Builder extends Request.Builder<UpdateBackupPolicyRequest, Builder> {
        private String backupPeriod; 
        private String backupPlanBegin; 
        private Integer backupSetRetention; 
        private String backupType; 
        private String backupWay; 
        private String DBInstanceName; 
        private Integer forceCleanOnHighSpaceUsage; 
        private Integer isEnabled; 
        private Integer localLogRetention; 
        private Integer logLocalRetentionSpace; 
        private String regionId; 
        private Integer removeLogRetention; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBackupPolicyRequest response) {
            super(response);
            this.backupPeriod = response.backupPeriod;
            this.backupPlanBegin = response.backupPlanBegin;
            this.backupSetRetention = response.backupSetRetention;
            this.backupType = response.backupType;
            this.backupWay = response.backupWay;
            this.DBInstanceName = response.DBInstanceName;
            this.forceCleanOnHighSpaceUsage = response.forceCleanOnHighSpaceUsage;
            this.isEnabled = response.isEnabled;
            this.localLogRetention = response.localLogRetention;
            this.logLocalRetentionSpace = response.logLocalRetentionSpace;
            this.regionId = response.regionId;
            this.removeLogRetention = response.removeLogRetention;
        } 

        /**
         * BackupPeriod.
         */
        public Builder backupPeriod(String backupPeriod) {
            this.putQueryParameter("BackupPeriod", backupPeriod);
            this.backupPeriod = backupPeriod;
            return this;
        }

        /**
         * BackupPlanBegin.
         */
        public Builder backupPlanBegin(String backupPlanBegin) {
            this.putQueryParameter("BackupPlanBegin", backupPlanBegin);
            this.backupPlanBegin = backupPlanBegin;
            return this;
        }

        /**
         * BackupSetRetention.
         */
        public Builder backupSetRetention(Integer backupSetRetention) {
            this.putQueryParameter("BackupSetRetention", backupSetRetention);
            this.backupSetRetention = backupSetRetention;
            return this;
        }

        /**
         * BackupType.
         */
        public Builder backupType(String backupType) {
            this.putQueryParameter("BackupType", backupType);
            this.backupType = backupType;
            return this;
        }

        /**
         * BackupWay.
         */
        public Builder backupWay(String backupWay) {
            this.putQueryParameter("BackupWay", backupWay);
            this.backupWay = backupWay;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * ForceCleanOnHighSpaceUsage.
         */
        public Builder forceCleanOnHighSpaceUsage(Integer forceCleanOnHighSpaceUsage) {
            this.putQueryParameter("ForceCleanOnHighSpaceUsage", forceCleanOnHighSpaceUsage);
            this.forceCleanOnHighSpaceUsage = forceCleanOnHighSpaceUsage;
            return this;
        }

        /**
         * IsEnabled.
         */
        public Builder isEnabled(Integer isEnabled) {
            this.putQueryParameter("IsEnabled", isEnabled);
            this.isEnabled = isEnabled;
            return this;
        }

        /**
         * LocalLogRetention.
         */
        public Builder localLogRetention(Integer localLogRetention) {
            this.putQueryParameter("LocalLogRetention", localLogRetention);
            this.localLogRetention = localLogRetention;
            return this;
        }

        /**
         * LogLocalRetentionSpace.
         */
        public Builder logLocalRetentionSpace(Integer logLocalRetentionSpace) {
            this.putQueryParameter("LogLocalRetentionSpace", logLocalRetentionSpace);
            this.logLocalRetentionSpace = logLocalRetentionSpace;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RemoveLogRetention.
         */
        public Builder removeLogRetention(Integer removeLogRetention) {
            this.putQueryParameter("RemoveLogRetention", removeLogRetention);
            this.removeLogRetention = removeLogRetention;
            return this;
        }

        @Override
        public UpdateBackupPolicyRequest build() {
            return new UpdateBackupPolicyRequest(this);
        } 

    } 

}
