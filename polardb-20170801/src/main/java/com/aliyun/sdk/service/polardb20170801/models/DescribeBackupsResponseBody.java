// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeBackupsResponseBody</p>
 */
public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private String pageNumber;

    @NameInMap("PageRecordCount")
    private String pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribeBackupsResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private String totalRecordCount; 

        /**
         * The details of backup sets.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * The total number of returned entries.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeBackupsResponseBody build() {
            return new DescribeBackupsResponseBody(this);
        } 

    } 

    public static class Backup extends TeaModel {
        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupId")
        private String backupId;

        @NameInMap("BackupMethod")
        private String backupMethod;

        @NameInMap("BackupMode")
        private String backupMode;

        @NameInMap("BackupSetSize")
        private String backupSetSize;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupStatus")
        private String backupStatus;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("BackupsLevel")
        private String backupsLevel;

        @NameInMap("ConsistentTime")
        private String consistentTime;

        @NameInMap("DBClusterId")
        private String DBClusterId;

        @NameInMap("ExpectExpireTime")
        private String expectExpireTime;

        @NameInMap("ExpectExpireType")
        private String expectExpireType;

        @NameInMap("IsAvail")
        private String isAvail;

        private Backup(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupId = builder.backupId;
            this.backupMethod = builder.backupMethod;
            this.backupMode = builder.backupMode;
            this.backupSetSize = builder.backupSetSize;
            this.backupStartTime = builder.backupStartTime;
            this.backupStatus = builder.backupStatus;
            this.backupType = builder.backupType;
            this.backupsLevel = builder.backupsLevel;
            this.consistentTime = builder.consistentTime;
            this.DBClusterId = builder.DBClusterId;
            this.expectExpireTime = builder.expectExpireTime;
            this.expectExpireType = builder.expectExpireType;
            this.isAvail = builder.isAvail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backup create() {
            return builder().build();
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupId
         */
        public String getBackupId() {
            return this.backupId;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupMode
         */
        public String getBackupMode() {
            return this.backupMode;
        }

        /**
         * @return backupSetSize
         */
        public String getBackupSetSize() {
            return this.backupSetSize;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupStatus
         */
        public String getBackupStatus() {
            return this.backupStatus;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return backupsLevel
         */
        public String getBackupsLevel() {
            return this.backupsLevel;
        }

        /**
         * @return consistentTime
         */
        public String getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return expectExpireTime
         */
        public String getExpectExpireTime() {
            return this.expectExpireTime;
        }

        /**
         * @return expectExpireType
         */
        public String getExpectExpireType() {
            return this.expectExpireType;
        }

        /**
         * @return isAvail
         */
        public String getIsAvail() {
            return this.isAvail;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupId; 
            private String backupMethod; 
            private String backupMode; 
            private String backupSetSize; 
            private String backupStartTime; 
            private String backupStatus; 
            private String backupType; 
            private String backupsLevel; 
            private String consistentTime; 
            private String DBClusterId; 
            private String expectExpireTime; 
            private String expectExpireType; 
            private String isAvail; 

            /**
             * The end time of the backup task. The time is displayed in UTC.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * The ID of the backup set.
             */
            public Builder backupId(String backupId) {
                this.backupId = backupId;
                return this;
            }

            /**
             * The backup method. Only **Snapshot** may be returned.
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * The backup mode. Valid values:
             * <p>
             * 
             * *   **Automated**
             * *   **Manual**
             */
            public Builder backupMode(String backupMode) {
                this.backupMode = backupMode;
                return this;
            }

            /**
             * The size of the backup set. Unit: bytes.
             * <p>
             * 
             * > After you delete the target snapshot backups, the storage space that is consumed by the backups is released. The released storage space is smaller than the size of the backup file, because the snapshots share specific data blocks. For more information, see [FAQ about backup](~~164881~~).
             */
            public Builder backupSetSize(String backupSetSize) {
                this.backupSetSize = backupSetSize;
                return this;
            }

            /**
             * The start time of the backup task. The time is displayed in UTC. Unit: seconds.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * The status of the backup set. Valid values:
             * <p>
             * 
             * *   **Success**
             * *   **Failed**
             */
            public Builder backupStatus(String backupStatus) {
                this.backupStatus = backupStatus;
                return this;
            }

            /**
             * The type of the backup. Only **FullBackup** may be returned.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * The level of the backup set. Valid values:
             * <p>
             * 
             * *   **Level-1**
             * *   **Level-2**
             */
            public Builder backupsLevel(String backupsLevel) {
                this.backupsLevel = backupsLevel;
                return this;
            }

            /**
             * The snapshot checkpoint time. The value follows the Unix time format. Unit: seconds.
             */
            public Builder consistentTime(String consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * The ID of the cluster.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * The expected expiration time of the backup set.
             * <p>
             * > This parameter is supported only for instances that are enabled with sparse backup.
             */
            public Builder expectExpireTime(String expectExpireTime) {
                this.expectExpireTime = expectExpireTime;
                return this;
            }

            /**
             * The expected expiration type of the backup set (This parameter is supported only for instances that are enabled with sparse backup).
             * <p>
             * 
             * Valid values:
             * 
             * *   NEVER
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   EXPIRED
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   DELAY
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             */
            public Builder expectExpireType(String expectExpireType) {
                this.expectExpireType = expectExpireType;
                return this;
            }

            /**
             * Indicates whether the backup set is available. Valid values:
             * <p>
             * 
             * *   **0**: The backup set is unavailable.
             * *   **1**: The backup set is available.
             */
            public Builder isAvail(String isAvail) {
                this.isAvail = isAvail;
                return this;
            }

            public Backup build() {
                return new Backup(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Backup")
        private java.util.List < Backup> backup;

        private Items(Builder builder) {
            this.backup = builder.backup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return backup
         */
        public java.util.List < Backup> getBackup() {
            return this.backup;
        }

        public static final class Builder {
            private java.util.List < Backup> backup; 

            /**
             * Backup.
             */
            public Builder backup(java.util.List < Backup> backup) {
                this.backup = backup;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
