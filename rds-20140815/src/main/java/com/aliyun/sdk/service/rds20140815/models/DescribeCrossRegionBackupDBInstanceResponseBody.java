// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeCrossRegionBackupDBInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossRegionBackupDBInstanceResponseBody</p>
 */
public class DescribeCrossRegionBackupDBInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
    private Integer itemsNumbers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecords")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCrossRegionBackupDBInstanceResponseBody model) {
            this.items = model.items;
            this.itemsNumbers = model.itemsNumbers;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.totalRecords = model.totalRecords;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of items in the cross-region backup settings list.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder itemsNumbers(Integer itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }

        /**
         * <p>The page number. Valid values: any integer greater than 0 that does not exceed the maximum value of the Integer data type.</p>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>33517002-182D-40BE-93EC-610BD3381045</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        public DescribeCrossRegionBackupDBInstanceResponseBody build() {
            return new DescribeCrossRegionBackupDBInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossRegionBackupDBInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossRegionBackupDBInstanceResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEnabled")
        private String backupEnabled;

        @com.aliyun.core.annotation.NameInMap("BackupEnabledTime")
        private String backupEnabledTime;

        @com.aliyun.core.annotation.NameInMap("CrossBackupRegion")
        private String crossBackupRegion;

        @com.aliyun.core.annotation.NameInMap("CrossBackupType")
        private String crossBackupType;

        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStatus")
        private String DBInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("LogBackupEnabled")
        private String logBackupEnabled;

        @com.aliyun.core.annotation.NameInMap("LogBackupEnabledTime")
        private String logBackupEnabledTime;

        @com.aliyun.core.annotation.NameInMap("RetentType")
        private Integer retentType;

        @com.aliyun.core.annotation.NameInMap("Retention")
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

            private Builder() {
            } 

            private Builder(Item model) {
                this.backupEnabled = model.backupEnabled;
                this.backupEnabledTime = model.backupEnabledTime;
                this.crossBackupRegion = model.crossBackupRegion;
                this.crossBackupType = model.crossBackupType;
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceStatus = model.DBInstanceStatus;
                this.engine = model.engine;
                this.engineVersion = model.engineVersion;
                this.lockMode = model.lockMode;
                this.logBackupEnabled = model.logBackupEnabled;
                this.logBackupEnabledTime = model.logBackupEnabledTime;
                this.retentType = model.retentType;
                this.retention = model.retention;
            } 

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
    /**
     * 
     * {@link DescribeCrossRegionBackupDBInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossRegionBackupDBInstanceResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

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
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.item = model.item;
            } 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
