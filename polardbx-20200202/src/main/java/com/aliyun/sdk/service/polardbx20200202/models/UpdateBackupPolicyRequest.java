// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link UpdateBackupPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpdateBackupPolicyRequest</p>
 */
public class UpdateBackupPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPeriod")
    private String backupPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupPlanBegin")
    private String backupPlanBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupSetRetention")
    private Integer backupSetRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupType")
    private String backupType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackupWay")
    private String backupWay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdDataBackupInterval")
    private Integer coldDataBackupInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColdDataBackupRetention")
    private Integer coldDataBackupRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRegionDataBackupRetention")
    private Integer crossRegionDataBackupRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CrossRegionLogBackupRetention")
    private Integer crossRegionLogBackupRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DestCrossRegion")
    private String destCrossRegion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceCleanOnHighSpaceUsage")
    private Integer forceCleanOnHighSpaceUsage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsCrossRegionDataBackupEnabled")
    private Boolean isCrossRegionDataBackupEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsCrossRegionLogBackupEnabled")
    private Boolean isCrossRegionLogBackupEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsEnabled")
    private Integer isEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalLogRetention")
    private Integer localLogRetention;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocalLogRetentionNumber")
    private Integer localLogRetentionNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogLocalRetentionSpace")
    private Integer logLocalRetentionSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveLogRetention")
    private Integer removeLogRetention;

    private UpdateBackupPolicyRequest(Builder builder) {
        super(builder);
        this.backupPeriod = builder.backupPeriod;
        this.backupPlanBegin = builder.backupPlanBegin;
        this.backupSetRetention = builder.backupSetRetention;
        this.backupType = builder.backupType;
        this.backupWay = builder.backupWay;
        this.coldDataBackupInterval = builder.coldDataBackupInterval;
        this.coldDataBackupRetention = builder.coldDataBackupRetention;
        this.crossRegionDataBackupRetention = builder.crossRegionDataBackupRetention;
        this.crossRegionLogBackupRetention = builder.crossRegionLogBackupRetention;
        this.DBInstanceName = builder.DBInstanceName;
        this.destCrossRegion = builder.destCrossRegion;
        this.forceCleanOnHighSpaceUsage = builder.forceCleanOnHighSpaceUsage;
        this.isCrossRegionDataBackupEnabled = builder.isCrossRegionDataBackupEnabled;
        this.isCrossRegionLogBackupEnabled = builder.isCrossRegionLogBackupEnabled;
        this.isEnabled = builder.isEnabled;
        this.localLogRetention = builder.localLogRetention;
        this.localLogRetentionNumber = builder.localLogRetentionNumber;
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
     * @return coldDataBackupInterval
     */
    public Integer getColdDataBackupInterval() {
        return this.coldDataBackupInterval;
    }

    /**
     * @return coldDataBackupRetention
     */
    public Integer getColdDataBackupRetention() {
        return this.coldDataBackupRetention;
    }

    /**
     * @return crossRegionDataBackupRetention
     */
    public Integer getCrossRegionDataBackupRetention() {
        return this.crossRegionDataBackupRetention;
    }

    /**
     * @return crossRegionLogBackupRetention
     */
    public Integer getCrossRegionLogBackupRetention() {
        return this.crossRegionLogBackupRetention;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return destCrossRegion
     */
    public String getDestCrossRegion() {
        return this.destCrossRegion;
    }

    /**
     * @return forceCleanOnHighSpaceUsage
     */
    public Integer getForceCleanOnHighSpaceUsage() {
        return this.forceCleanOnHighSpaceUsage;
    }

    /**
     * @return isCrossRegionDataBackupEnabled
     */
    public Boolean getIsCrossRegionDataBackupEnabled() {
        return this.isCrossRegionDataBackupEnabled;
    }

    /**
     * @return isCrossRegionLogBackupEnabled
     */
    public Boolean getIsCrossRegionLogBackupEnabled() {
        return this.isCrossRegionLogBackupEnabled;
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
     * @return localLogRetentionNumber
     */
    public Integer getLocalLogRetentionNumber() {
        return this.localLogRetentionNumber;
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
        private Integer coldDataBackupInterval; 
        private Integer coldDataBackupRetention; 
        private Integer crossRegionDataBackupRetention; 
        private Integer crossRegionLogBackupRetention; 
        private String DBInstanceName; 
        private String destCrossRegion; 
        private Integer forceCleanOnHighSpaceUsage; 
        private Boolean isCrossRegionDataBackupEnabled; 
        private Boolean isCrossRegionLogBackupEnabled; 
        private Integer isEnabled; 
        private Integer localLogRetention; 
        private Integer localLogRetentionNumber; 
        private Integer logLocalRetentionSpace; 
        private String regionId; 
        private Integer removeLogRetention; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBackupPolicyRequest request) {
            super(request);
            this.backupPeriod = request.backupPeriod;
            this.backupPlanBegin = request.backupPlanBegin;
            this.backupSetRetention = request.backupSetRetention;
            this.backupType = request.backupType;
            this.backupWay = request.backupWay;
            this.coldDataBackupInterval = request.coldDataBackupInterval;
            this.coldDataBackupRetention = request.coldDataBackupRetention;
            this.crossRegionDataBackupRetention = request.crossRegionDataBackupRetention;
            this.crossRegionLogBackupRetention = request.crossRegionLogBackupRetention;
            this.DBInstanceName = request.DBInstanceName;
            this.destCrossRegion = request.destCrossRegion;
            this.forceCleanOnHighSpaceUsage = request.forceCleanOnHighSpaceUsage;
            this.isCrossRegionDataBackupEnabled = request.isCrossRegionDataBackupEnabled;
            this.isCrossRegionLogBackupEnabled = request.isCrossRegionLogBackupEnabled;
            this.isEnabled = request.isEnabled;
            this.localLogRetention = request.localLogRetention;
            this.localLogRetentionNumber = request.localLogRetentionNumber;
            this.logLocalRetentionSpace = request.logLocalRetentionSpace;
            this.regionId = request.regionId;
            this.removeLogRetention = request.removeLogRetention;
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
         * ColdDataBackupInterval.
         */
        public Builder coldDataBackupInterval(Integer coldDataBackupInterval) {
            this.putQueryParameter("ColdDataBackupInterval", coldDataBackupInterval);
            this.coldDataBackupInterval = coldDataBackupInterval;
            return this;
        }

        /**
         * ColdDataBackupRetention.
         */
        public Builder coldDataBackupRetention(Integer coldDataBackupRetention) {
            this.putQueryParameter("ColdDataBackupRetention", coldDataBackupRetention);
            this.coldDataBackupRetention = coldDataBackupRetention;
            return this;
        }

        /**
         * CrossRegionDataBackupRetention.
         */
        public Builder crossRegionDataBackupRetention(Integer crossRegionDataBackupRetention) {
            this.putQueryParameter("CrossRegionDataBackupRetention", crossRegionDataBackupRetention);
            this.crossRegionDataBackupRetention = crossRegionDataBackupRetention;
            return this;
        }

        /**
         * CrossRegionLogBackupRetention.
         */
        public Builder crossRegionLogBackupRetention(Integer crossRegionLogBackupRetention) {
            this.putQueryParameter("CrossRegionLogBackupRetention", crossRegionLogBackupRetention);
            this.crossRegionLogBackupRetention = crossRegionLogBackupRetention;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasdyuoo</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DestCrossRegion.
         */
        public Builder destCrossRegion(String destCrossRegion) {
            this.putQueryParameter("DestCrossRegion", destCrossRegion);
            this.destCrossRegion = destCrossRegion;
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
         * IsCrossRegionDataBackupEnabled.
         */
        public Builder isCrossRegionDataBackupEnabled(Boolean isCrossRegionDataBackupEnabled) {
            this.putQueryParameter("IsCrossRegionDataBackupEnabled", isCrossRegionDataBackupEnabled);
            this.isCrossRegionDataBackupEnabled = isCrossRegionDataBackupEnabled;
            return this;
        }

        /**
         * IsCrossRegionLogBackupEnabled.
         */
        public Builder isCrossRegionLogBackupEnabled(Boolean isCrossRegionLogBackupEnabled) {
            this.putQueryParameter("IsCrossRegionLogBackupEnabled", isCrossRegionLogBackupEnabled);
            this.isCrossRegionLogBackupEnabled = isCrossRegionLogBackupEnabled;
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
         * LocalLogRetentionNumber.
         */
        public Builder localLogRetentionNumber(Integer localLogRetentionNumber) {
            this.putQueryParameter("LocalLogRetentionNumber", localLogRetentionNumber);
            this.localLogRetentionNumber = localLogRetentionNumber;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
