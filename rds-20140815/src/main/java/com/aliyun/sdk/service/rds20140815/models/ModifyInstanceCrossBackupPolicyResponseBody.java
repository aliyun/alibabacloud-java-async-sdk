// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInstanceCrossBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyInstanceCrossBackupPolicyResponseBody</p>
 */
public class ModifyInstanceCrossBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupEnabled")
    private String backupEnabled;

    @NameInMap("CrossBackupRegion")
    private String crossBackupRegion;

    @NameInMap("CrossBackupType")
    private String crossBackupType;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("LogBackupEnabled")
    private String logBackupEnabled;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetentType")
    private Integer retentType;

    @NameInMap("Retention")
    private Integer retention;

    private ModifyInstanceCrossBackupPolicyResponseBody(Builder builder) {
        this.backupEnabled = builder.backupEnabled;
        this.crossBackupRegion = builder.crossBackupRegion;
        this.crossBackupType = builder.crossBackupType;
        this.DBInstanceId = builder.DBInstanceId;
        this.logBackupEnabled = builder.logBackupEnabled;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.retentType = builder.retentType;
        this.retention = builder.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyInstanceCrossBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupEnabled
     */
    public String getBackupEnabled() {
        return this.backupEnabled;
    }

    /**
     * @return crossBackupRegion
     */
    public String getCrossBackupRegion() {
        return this.crossBackupRegion;
    }

    /**
     * @return crossBackupType
     */
    public String getCrossBackupType() {
        return this.crossBackupType;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return logBackupEnabled
     */
    public String getLogBackupEnabled() {
        return this.logBackupEnabled;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retentType
     */
    public Integer getRetentType() {
        return this.retentType;
    }

    /**
     * @return retention
     */
    public Integer getRetention() {
        return this.retention;
    }

    public static final class Builder {
        private String backupEnabled; 
        private String crossBackupRegion; 
        private String crossBackupType; 
        private String DBInstanceId; 
        private String logBackupEnabled; 
        private String regionId; 
        private String requestId; 
        private Integer retentType; 
        private Integer retention; 

        /**
         * The status of the cross-region backup feature on the instance. Valid values:
         * <p>
         * 
         * *   **Disable**
         * *   **Enable**
         */
        public Builder backupEnabled(String backupEnabled) {
            this.backupEnabled = backupEnabled;
            return this;
        }

        /**
         * The ID of the region in which the cross-region backup files of the instance are stored.
         */
        public Builder crossBackupRegion(String crossBackupRegion) {
            this.crossBackupRegion = crossBackupRegion;
            return this;
        }

        /**
         * The policy that is used to save the cross-region backup files of the instance. Default value: **1**. The value 1 indicates that all cross-region backup files are saved.
         */
        public Builder crossBackupType(String crossBackupType) {
            this.crossBackupType = crossBackupType;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The status of the cross-region log backup feature on the instance. Valid values:
         * <p>
         * 
         * *   **Disable**
         * *   **Enable**
         */
        public Builder logBackupEnabled(String logBackupEnabled) {
            this.logBackupEnabled = logBackupEnabled;
            return this;
        }

        /**
         * The region ID of the source instance. You can call the [DescribeRegions](~~26243~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The policy that is used to retain the cross-region backup files of the instance. Default value: **1**. The value 1 indicates that the cross-region backup files of the instance are retained based on the specified retention period.
         */
        public Builder retentType(Integer retentType) {
            this.retentType = retentType;
            return this;
        }

        /**
         * The number of days for which the cross-region backup files of the instance are retained. Valid values: **7 to 1825**.
         */
        public Builder retention(Integer retention) {
            this.retention = retention;
            return this;
        }

        public ModifyInstanceCrossBackupPolicyResponseBody build() {
            return new ModifyInstanceCrossBackupPolicyResponseBody(this);
        } 

    } 

}
