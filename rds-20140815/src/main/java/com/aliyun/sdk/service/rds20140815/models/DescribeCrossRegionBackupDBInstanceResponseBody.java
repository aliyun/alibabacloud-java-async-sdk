// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossRegionBackupDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossRegionBackupDBInstanceResponseBody</p>
 */
public class DescribeCrossRegionBackupDBInstanceResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("ItemsNumbers")
    private Integer itemsNumbers;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecords")
    private Integer totalRecords;

    private DescribeCrossRegionBackupDBInstanceResponseBody(Builder builder) {
        this.items = builder.items;
        this.itemsNumbers = builder.itemsNumbers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.totalRecords = builder.totalRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossRegionBackupDBInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return itemsNumbers
     */
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static final class Builder {
        private Items items; 
        private Integer itemsNumbers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String requestId; 
        private Integer totalRecords; 

        /**
         * An array that consists of instances and their cross-region backup settings.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The total number of items returned for cross-region backup settings.
         */
        public Builder itemsNumbers(Integer itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }

        /**
         * The page number of the returned page. Valid values: any non-zero positive integer.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: 30.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the region.
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
         * The total number of returned entries.
         */
        public Builder totalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBody build() {
            return new DescribeCrossRegionBackupDBInstanceResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("BackupEnabled")
        private String backupEnabled;

        @NameInMap("BackupEnabledTime")
        private String backupEnabledTime;

        @NameInMap("CrossBackupRegion")
        private String crossBackupRegion;

        @NameInMap("CrossBackupType")
        private String crossBackupType;

        @NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("LogBackupEnabled")
        private String logBackupEnabled;

        @NameInMap("LogBackupEnabledTime")
        private String logBackupEnabledTime;

        @NameInMap("RetentType")
        private Integer retentType;

        @NameInMap("Retention")
        private Integer retention;

        private Item(Builder builder) {
            this.backupEnabled = builder.backupEnabled;
            this.backupEnabledTime = builder.backupEnabledTime;
            this.crossBackupRegion = builder.crossBackupRegion;
            this.crossBackupType = builder.crossBackupType;
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceStatus = builder.DBInstanceStatus;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.lockMode = builder.lockMode;
            this.logBackupEnabled = builder.logBackupEnabled;
            this.logBackupEnabledTime = builder.logBackupEnabledTime;
            this.retentType = builder.retentType;
            this.retention = builder.retention;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return backupEnabled
         */
        public String getBackupEnabled() {
            return this.backupEnabled;
        }

        /**
         * @return backupEnabledTime
         */
        public String getBackupEnabledTime() {
            return this.backupEnabledTime;
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
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
        }

        /**
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return DBInstanceStatus
         */
        public String getDBInstanceStatus() {
            return this.DBInstanceStatus;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return engineVersion
         */
        public String getEngineVersion() {
            return this.engineVersion;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return logBackupEnabled
         */
        public String getLogBackupEnabled() {
            return this.logBackupEnabled;
        }

        /**
         * @return logBackupEnabledTime
         */
        public String getLogBackupEnabledTime() {
            return this.logBackupEnabledTime;
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
            private String backupEnabledTime; 
            private String crossBackupRegion; 
            private String crossBackupType; 
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceStatus; 
            private String engine; 
            private String engineVersion; 
            private String lockMode; 
            private String logBackupEnabled; 
            private String logBackupEnabledTime; 
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
             * The time when cross-region backup was enabled on the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder backupEnabledTime(String backupEnabledTime) {
                this.backupEnabledTime = backupEnabledTime;
                return this;
            }

            /**
             * The ID of the region in which the cross-region data backup file is stored.
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
             * The name of the instance. It must be 2 to 256 characters in length. The name can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
             * <p>
             * 
             * > The value cannot start with http:// or https://.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
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
             * The status of the instance. For more information, see [Instance states](~~26315~~).
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * The database engine of the instance.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * The database engine version of the instance.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * The lock status of the instance. Valid values:
             * <p>
             * 
             * *   **Unlock**: The instance is not locked.
             * *   **ManualLock**: The instance is manually locked.
             * *   **LockByExpiration**: The instance is automatically locked after it expires.
             * *   **LockByRestoration**: The instance is automatically locked before it is rolled back.
             * *   **LockByDiskQuota**: The instance is automatically locked because its storage capacity is exhausted and the instance is inaccessible.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
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
             * The time when cross-region log backup was enabled on the instance. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder logBackupEnabledTime(String logBackupEnabledTime) {
                this.logBackupEnabledTime = logBackupEnabledTime;
                return this;
            }

            /**
             * The policy that is used to retain the cross-region backup files of the instance. Cross-region backups can be retained only based on the specified retention period. Default value: **1**.
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

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
