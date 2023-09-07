// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupPolicyResponseBody</p>
 */
public class DescribeBackupPolicyResponseBody extends TeaModel {
    @NameInMap("BackupFrequency")
    private String backupFrequency;

    @NameInMap("BackupRetentionPolicyOnClusterDeletion")
    private String backupRetentionPolicyOnClusterDeletion;

    @NameInMap("DataLevel1BackupFrequency")
    private String dataLevel1BackupFrequency;

    @NameInMap("DataLevel1BackupPeriod")
    private String dataLevel1BackupPeriod;

    @NameInMap("DataLevel1BackupRetentionPeriod")
    private String dataLevel1BackupRetentionPeriod;

    @NameInMap("DataLevel1BackupTime")
    private String dataLevel1BackupTime;

    @NameInMap("DataLevel2BackupAnotherRegionRegion")
    private String dataLevel2BackupAnotherRegionRegion;

    @NameInMap("DataLevel2BackupAnotherRegionRetentionPeriod")
    private String dataLevel2BackupAnotherRegionRetentionPeriod;

    @NameInMap("DataLevel2BackupPeriod")
    private String dataLevel2BackupPeriod;

    @NameInMap("DataLevel2BackupRetentionPeriod")
    private String dataLevel2BackupRetentionPeriod;

    @NameInMap("PreferredBackupPeriod")
    private String preferredBackupPeriod;

    @NameInMap("PreferredBackupTime")
    private String preferredBackupTime;

    @NameInMap("PreferredNextBackupTime")
    private String preferredNextBackupTime;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeBackupPolicyResponseBody(Builder builder) {
        this.backupFrequency = builder.backupFrequency;
        this.backupRetentionPolicyOnClusterDeletion = builder.backupRetentionPolicyOnClusterDeletion;
        this.dataLevel1BackupFrequency = builder.dataLevel1BackupFrequency;
        this.dataLevel1BackupPeriod = builder.dataLevel1BackupPeriod;
        this.dataLevel1BackupRetentionPeriod = builder.dataLevel1BackupRetentionPeriod;
        this.dataLevel1BackupTime = builder.dataLevel1BackupTime;
        this.dataLevel2BackupAnotherRegionRegion = builder.dataLevel2BackupAnotherRegionRegion;
        this.dataLevel2BackupAnotherRegionRetentionPeriod = builder.dataLevel2BackupAnotherRegionRetentionPeriod;
        this.dataLevel2BackupPeriod = builder.dataLevel2BackupPeriod;
        this.dataLevel2BackupRetentionPeriod = builder.dataLevel2BackupRetentionPeriod;
        this.preferredBackupPeriod = builder.preferredBackupPeriod;
        this.preferredBackupTime = builder.preferredBackupTime;
        this.preferredNextBackupTime = builder.preferredNextBackupTime;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return backupFrequency
     */
    public String getBackupFrequency() {
        return this.backupFrequency;
    }

    /**
     * @return backupRetentionPolicyOnClusterDeletion
     */
    public String getBackupRetentionPolicyOnClusterDeletion() {
        return this.backupRetentionPolicyOnClusterDeletion;
    }

    /**
     * @return dataLevel1BackupFrequency
     */
    public String getDataLevel1BackupFrequency() {
        return this.dataLevel1BackupFrequency;
    }

    /**
     * @return dataLevel1BackupPeriod
     */
    public String getDataLevel1BackupPeriod() {
        return this.dataLevel1BackupPeriod;
    }

    /**
     * @return dataLevel1BackupRetentionPeriod
     */
    public String getDataLevel1BackupRetentionPeriod() {
        return this.dataLevel1BackupRetentionPeriod;
    }

    /**
     * @return dataLevel1BackupTime
     */
    public String getDataLevel1BackupTime() {
        return this.dataLevel1BackupTime;
    }

    /**
     * @return dataLevel2BackupAnotherRegionRegion
     */
    public String getDataLevel2BackupAnotherRegionRegion() {
        return this.dataLevel2BackupAnotherRegionRegion;
    }

    /**
     * @return dataLevel2BackupAnotherRegionRetentionPeriod
     */
    public String getDataLevel2BackupAnotherRegionRetentionPeriod() {
        return this.dataLevel2BackupAnotherRegionRetentionPeriod;
    }

    /**
     * @return dataLevel2BackupPeriod
     */
    public String getDataLevel2BackupPeriod() {
        return this.dataLevel2BackupPeriod;
    }

    /**
     * @return dataLevel2BackupRetentionPeriod
     */
    public String getDataLevel2BackupRetentionPeriod() {
        return this.dataLevel2BackupRetentionPeriod;
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
     * @return preferredNextBackupTime
     */
    public String getPreferredNextBackupTime() {
        return this.preferredNextBackupTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String backupFrequency; 
        private String backupRetentionPolicyOnClusterDeletion; 
        private String dataLevel1BackupFrequency; 
        private String dataLevel1BackupPeriod; 
        private String dataLevel1BackupRetentionPeriod; 
        private String dataLevel1BackupTime; 
        private String dataLevel2BackupAnotherRegionRegion; 
        private String dataLevel2BackupAnotherRegionRetentionPeriod; 
        private String dataLevel2BackupPeriod; 
        private String dataLevel2BackupRetentionPeriod; 
        private String preferredBackupPeriod; 
        private String preferredBackupTime; 
        private String preferredNextBackupTime; 
        private String requestId; 

        /**
         * The backup frequency. Default value: Normal. Valid values:
         * <p>
         * 
         * *   **Normal**: standard backup. The system backs up data once a day.
         * *   **2/24H**: enhanced backup. The system backs up data every 2 hours.
         * *   **3/24H**: enhanced backup. The system backs up data every 3 hours.
         * *   **4/24H**: enhanced backup. The system backs up data every 4 hours.
         * 
         * > - If enhanced backup is enabled, all backups are retained for 24 hours. Backups are automatically deleted when the retention period ends. However, the system permanently retains the first backup that is created after 00:00 every day.
         * >-  If enhanced backup is enabled, **PreferredBackupPeriod** is automatically set to all days in a week (from Monday to Sunday).
         */
        public Builder backupFrequency(String backupFrequency) {
            this.backupFrequency = backupFrequency;
            return this;
        }

        /**
         * Indicates whether backups are retained when you delete a cluster. Valid values:
         * <p>
         * 
         * *   **ALL**: permanently retains all backups.
         * *   **LATEST**: permanently retains only the last backup.
         * *   **NONE**: does not retain backups.
         */
        public Builder backupRetentionPolicyOnClusterDeletion(String backupRetentionPolicyOnClusterDeletion) {
            this.backupRetentionPolicyOnClusterDeletion = backupRetentionPolicyOnClusterDeletion;
            return this;
        }

        /**
         * The backup frequency of level-1 backups. Default value: Normal. Valid values:
         * <p>
         * 
         * *   **Normal**: standard backup. The system backs up data once a day.
         * *   **2/24H**: frequent backup. The system backs up data every 2 hours.
         * *   **3/24H**: frequent backup. The system backs up data every 3 hours.
         * *   **4/24H**: frequent backup. The system backs up data every 4 hours.
         * 
         * >- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.
         * >- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](~~72672~~).
         */
        public Builder dataLevel1BackupFrequency(String dataLevel1BackupFrequency) {
            this.dataLevel1BackupFrequency = dataLevel1BackupFrequency;
            return this;
        }

        /**
         * The backup cycle of level-1 backups. Valid values:
         * <p>
         * 
         * *   **Monday**
         * *   **Tuesday**
         * *   **Wednesday**
         * *   **Thursday**
         * *   **Friday**
         * *   **Saturday**
         * *   **Sunday**
         * 
         * >- You need to specify at least two values. Separate multiple values with commas (,).
         * >- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.
         * >- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](~~72672~~).
         */
        public Builder dataLevel1BackupPeriod(String dataLevel1BackupPeriod) {
            this.dataLevel1BackupPeriod = dataLevel1BackupPeriod;
            return this;
        }

        /**
         * The retention period of level-1 backups. Valid values: 3 to 14. Unit: day.
         */
        public Builder dataLevel1BackupRetentionPeriod(String dataLevel1BackupRetentionPeriod) {
            this.dataLevel1BackupRetentionPeriod = dataLevel1BackupRetentionPeriod;
            return this;
        }

        /**
         * The period of time during which automatic backup is performed. The value must be in the `hh:mmZ-hh:mmZ` format. The time must be in UTC. The start time and the end time must be on the hour and must have an interval of 1 hour. Example: `14:00Z-15:00Z`.
         * <p>
         * 
         * >- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.
         * >- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](~~72672~~).
         */
        public Builder dataLevel1BackupTime(String dataLevel1BackupTime) {
            this.dataLevel1BackupTime = dataLevel1BackupTime;
            return this;
        }

        /**
         * The region where the cross-region level-2 backup is stored. For information about regions that support the cross-region backup feature, see [Overview](~~72672~~).
         */
        public Builder dataLevel2BackupAnotherRegionRegion(String dataLevel2BackupAnotherRegionRegion) {
            this.dataLevel2BackupAnotherRegionRegion = dataLevel2BackupAnotherRegionRegion;
            return this;
        }

        /**
         * The retention period of cross-region level-2 backups. Valid values:
         * <p>
         * 
         * *   **0**: The cross-region level-2 backup feature is disabled.
         * *   **30 to 7300**: Cross-region level-2 backups are retained for 30 to 7,300 days.
         * *   **1**: Cross-region level-2 backups are permanently retained.
         * 
         * > The default value is **0**. By default, the level-2 backup feature is disabled when you create a cluster.
         */
        public Builder dataLevel2BackupAnotherRegionRetentionPeriod(String dataLevel2BackupAnotherRegionRetentionPeriod) {
            this.dataLevel2BackupAnotherRegionRetentionPeriod = dataLevel2BackupAnotherRegionRetentionPeriod;
            return this;
        }

        /**
         * The backup cycle of level-2 backups. Valid values:
         * <p>
         * 
         * *   **Monday**
         * *   **Tuesday**
         * *   **Wednesday**
         * *   **Thursday**
         * *   **Friday**
         * *   **Saturday**
         * *   **Sunday**
         * 
         * >- You need to specify at least two values. Separate multiple values with commas (,).
         * >- This parameter is not supported for PolarDB for PostgreSQL (Compatible with Oracle) clusters or PolarDB for PostgreSQL clusters.
         * >- This parameter is unavailable if the region where your PolarDB for MySQL cluster is deployed does not support the cross-region backup feature. For information about regions that support the cross-region backup feature, see [Overview](~~72672~~).
         */
        public Builder dataLevel2BackupPeriod(String dataLevel2BackupPeriod) {
            this.dataLevel2BackupPeriod = dataLevel2BackupPeriod;
            return this;
        }

        /**
         * The retention period of level-2 backups. Valid values:
         * <p>
         * 
         * *   0: The level-2 backup feature is disabled.
         * *   30 to 7300: Level-2 backups are retained for 30 to 7,300 days.
         * *   \-1: Level-2 backups are permanently retained.
         * 
         * > The default value is **0**. By default, the level-2 backup feature is disabled when you create a cluster.
         */
        public Builder dataLevel2BackupRetentionPeriod(String dataLevel2BackupRetentionPeriod) {
            this.dataLevel2BackupRetentionPeriod = dataLevel2BackupRetentionPeriod;
            return this;
        }

        /**
         * The backup cycle. Valid values:
         * <p>
         * 
         * *   Monday
         * *   Tuesday
         * *   Wednesday
         * *   Thursday
         * *   Friday
         * *   Saturday
         * *   Sunday
         */
        public Builder preferredBackupPeriod(String preferredBackupPeriod) {
            this.preferredBackupPeriod = preferredBackupPeriod;
            return this;
        }

        /**
         * The time period when automatic backups are performed. The format is `HH:mmZ-HH:mmZ`. The time is displayed in UTC.
         */
        public Builder preferredBackupTime(String preferredBackupTime) {
            this.preferredBackupTime = preferredBackupTime;
            return this;
        }

        /**
         * The time when the next automatic backup will be performed. The format is `YYYY-MM-DDThh:mmZ`. The time is displayed in UTC.
         */
        public Builder preferredNextBackupTime(String preferredNextBackupTime) {
            this.preferredNextBackupTime = preferredNextBackupTime;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeBackupPolicyResponseBody build() {
            return new DescribeBackupPolicyResponseBody(this);
        } 

    } 

}
