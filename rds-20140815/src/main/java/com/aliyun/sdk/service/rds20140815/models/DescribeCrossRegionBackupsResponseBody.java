// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossRegionBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossRegionBackupsResponseBody</p>
 */
public class DescribeCrossRegionBackupsResponseBody extends TeaModel {
    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StartTime")
    private String startTime;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeCrossRegionBackupsResponseBody(Builder builder) {
        this.endTime = builder.endTime;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossRegionBackupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
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
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
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
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String endTime; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String regionId; 
        private String requestId; 
        private String startTime; 
        private Integer totalRecordCount; 

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCrossRegionBackupsResponseBody build() {
            return new DescribeCrossRegionBackupsResponseBody(this);
        } 

    } 

    public static class RestoreRegions extends TeaModel {
        @NameInMap("RestoreRegion")
        private java.util.List < String > restoreRegion;

        private RestoreRegions(Builder builder) {
            this.restoreRegion = builder.restoreRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreRegions create() {
            return builder().build();
        }

        /**
         * @return restoreRegion
         */
        public java.util.List < String > getRestoreRegion() {
            return this.restoreRegion;
        }

        public static final class Builder {
            private java.util.List < String > restoreRegion; 

            /**
             * RestoreRegion.
             */
            public Builder restoreRegion(java.util.List < String > restoreRegion) {
                this.restoreRegion = restoreRegion;
                return this;
            }

            public RestoreRegions build() {
                return new RestoreRegions(this);
            } 

        } 

    }
    public static class Item extends TeaModel {
        @NameInMap("BackupEndTime")
        private String backupEndTime;

        @NameInMap("BackupMethod")
        private String backupMethod;

        @NameInMap("BackupSetScale")
        private Integer backupSetScale;

        @NameInMap("BackupSetStatus")
        private Integer backupSetStatus;

        @NameInMap("BackupStartTime")
        private String backupStartTime;

        @NameInMap("BackupType")
        private String backupType;

        @NameInMap("Category")
        private String category;

        @NameInMap("ConsistentTime")
        private String consistentTime;

        @NameInMap("CrossBackupDownloadLink")
        private String crossBackupDownloadLink;

        @NameInMap("CrossBackupId")
        private Integer crossBackupId;

        @NameInMap("CrossBackupRegion")
        private String crossBackupRegion;

        @NameInMap("CrossBackupSetFile")
        private String crossBackupSetFile;

        @NameInMap("CrossBackupSetLocation")
        private String crossBackupSetLocation;

        @NameInMap("CrossBackupSetSize")
        private Long crossBackupSetSize;

        @NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @NameInMap("Engine")
        private String engine;

        @NameInMap("EngineVersion")
        private String engineVersion;

        @NameInMap("InstanceId")
        private Integer instanceId;

        @NameInMap("RestoreRegions")
        private RestoreRegions restoreRegions;

        private Item(Builder builder) {
            this.backupEndTime = builder.backupEndTime;
            this.backupMethod = builder.backupMethod;
            this.backupSetScale = builder.backupSetScale;
            this.backupSetStatus = builder.backupSetStatus;
            this.backupStartTime = builder.backupStartTime;
            this.backupType = builder.backupType;
            this.category = builder.category;
            this.consistentTime = builder.consistentTime;
            this.crossBackupDownloadLink = builder.crossBackupDownloadLink;
            this.crossBackupId = builder.crossBackupId;
            this.crossBackupRegion = builder.crossBackupRegion;
            this.crossBackupSetFile = builder.crossBackupSetFile;
            this.crossBackupSetLocation = builder.crossBackupSetLocation;
            this.crossBackupSetSize = builder.crossBackupSetSize;
            this.DBInstanceStorageType = builder.DBInstanceStorageType;
            this.engine = builder.engine;
            this.engineVersion = builder.engineVersion;
            this.instanceId = builder.instanceId;
            this.restoreRegions = builder.restoreRegions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return backupEndTime
         */
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        /**
         * @return backupMethod
         */
        public String getBackupMethod() {
            return this.backupMethod;
        }

        /**
         * @return backupSetScale
         */
        public Integer getBackupSetScale() {
            return this.backupSetScale;
        }

        /**
         * @return backupSetStatus
         */
        public Integer getBackupSetStatus() {
            return this.backupSetStatus;
        }

        /**
         * @return backupStartTime
         */
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        /**
         * @return backupType
         */
        public String getBackupType() {
            return this.backupType;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return consistentTime
         */
        public String getConsistentTime() {
            return this.consistentTime;
        }

        /**
         * @return crossBackupDownloadLink
         */
        public String getCrossBackupDownloadLink() {
            return this.crossBackupDownloadLink;
        }

        /**
         * @return crossBackupId
         */
        public Integer getCrossBackupId() {
            return this.crossBackupId;
        }

        /**
         * @return crossBackupRegion
         */
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        /**
         * @return crossBackupSetFile
         */
        public String getCrossBackupSetFile() {
            return this.crossBackupSetFile;
        }

        /**
         * @return crossBackupSetLocation
         */
        public String getCrossBackupSetLocation() {
            return this.crossBackupSetLocation;
        }

        /**
         * @return crossBackupSetSize
         */
        public Long getCrossBackupSetSize() {
            return this.crossBackupSetSize;
        }

        /**
         * @return DBInstanceStorageType
         */
        public String getDBInstanceStorageType() {
            return this.DBInstanceStorageType;
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
         * @return instanceId
         */
        public Integer getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return restoreRegions
         */
        public RestoreRegions getRestoreRegions() {
            return this.restoreRegions;
        }

        public static final class Builder {
            private String backupEndTime; 
            private String backupMethod; 
            private Integer backupSetScale; 
            private Integer backupSetStatus; 
            private String backupStartTime; 
            private String backupType; 
            private String category; 
            private String consistentTime; 
            private String crossBackupDownloadLink; 
            private Integer crossBackupId; 
            private String crossBackupRegion; 
            private String crossBackupSetFile; 
            private String crossBackupSetLocation; 
            private Long crossBackupSetSize; 
            private String DBInstanceStorageType; 
            private String engine; 
            private String engineVersion; 
            private Integer instanceId; 
            private RestoreRegions restoreRegions; 

            /**
             * BackupEndTime.
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * BackupMethod.
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * BackupSetScale.
             */
            public Builder backupSetScale(Integer backupSetScale) {
                this.backupSetScale = backupSetScale;
                return this;
            }

            /**
             * BackupSetStatus.
             */
            public Builder backupSetStatus(Integer backupSetStatus) {
                this.backupSetStatus = backupSetStatus;
                return this;
            }

            /**
             * BackupStartTime.
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * BackupType.
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * ConsistentTime.
             */
            public Builder consistentTime(String consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * CrossBackupDownloadLink.
             */
            public Builder crossBackupDownloadLink(String crossBackupDownloadLink) {
                this.crossBackupDownloadLink = crossBackupDownloadLink;
                return this;
            }

            /**
             * CrossBackupId.
             */
            public Builder crossBackupId(Integer crossBackupId) {
                this.crossBackupId = crossBackupId;
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
             * CrossBackupSetFile.
             */
            public Builder crossBackupSetFile(String crossBackupSetFile) {
                this.crossBackupSetFile = crossBackupSetFile;
                return this;
            }

            /**
             * CrossBackupSetLocation.
             */
            public Builder crossBackupSetLocation(String crossBackupSetLocation) {
                this.crossBackupSetLocation = crossBackupSetLocation;
                return this;
            }

            /**
             * CrossBackupSetSize.
             */
            public Builder crossBackupSetSize(Long crossBackupSetSize) {
                this.crossBackupSetSize = crossBackupSetSize;
                return this;
            }

            /**
             * DBInstanceStorageType.
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
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
             * InstanceId.
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * RestoreRegions.
             */
            public Builder restoreRegions(RestoreRegions restoreRegions) {
                this.restoreRegions = restoreRegions;
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
