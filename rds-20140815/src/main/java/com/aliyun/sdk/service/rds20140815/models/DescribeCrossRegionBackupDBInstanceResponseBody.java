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
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * ItemsNumbers.
         */
        public Builder itemsNumbers(Integer itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalRecords.
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
             * BackupEnabled.
             */
            public Builder backupEnabled(String backupEnabled) {
                this.backupEnabled = backupEnabled;
                return this;
            }

            /**
             * BackupEnabledTime.
             */
            public Builder backupEnabledTime(String backupEnabledTime) {
                this.backupEnabledTime = backupEnabledTime;
                return this;
            }

            /**
             * CrossBackupRegion.
             */
            public Builder crossBackupRegion(String crossBackupRegion) {
                this.crossBackupRegion = crossBackupRegion;
                return this;
            }

            /**
             * CrossBackupType.
             */
            public Builder crossBackupType(String crossBackupType) {
                this.crossBackupType = crossBackupType;
                return this;
            }

            /**
             * DBInstanceDescription.
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * DBInstanceId.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * DBInstanceStatus.
             */
            public Builder DBInstanceStatus(String DBInstanceStatus) {
                this.DBInstanceStatus = DBInstanceStatus;
                return this;
            }

            /**
             * Engine.
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * EngineVersion.
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * LogBackupEnabled.
             */
            public Builder logBackupEnabled(String logBackupEnabled) {
                this.logBackupEnabled = logBackupEnabled;
                return this;
            }

            /**
             * LogBackupEnabledTime.
             */
            public Builder logBackupEnabledTime(String logBackupEnabledTime) {
                this.logBackupEnabledTime = logBackupEnabledTime;
                return this;
            }

            /**
             * RetentType.
             */
            public Builder retentType(Integer retentType) {
                this.retentType = retentType;
                return this;
            }

            /**
             * Retention.
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
