// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeCrossRegionBackupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossRegionBackupsResponseBody</p>
 */
public class DescribeCrossRegionBackupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
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
         * <p>The end of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-15T12:10:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The cross-region data backup files.</p>
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1.</p>
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
         * <p>The number of cross-region data backup files on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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
         * <p>60912B41-7579-4B5D-B289-8856030F0A6A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-30T12:10:00Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The total number of entries that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCrossRegionBackupsResponseBody build() {
            return new DescribeCrossRegionBackupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossRegionBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossRegionBackupsResponseBody</p>
     */
    public static class RestoreRegions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RestoreRegion")
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
    /**
     * 
     * {@link DescribeCrossRegionBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossRegionBackupsResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BackupEndTime")
        private String backupEndTime;

        @com.aliyun.core.annotation.NameInMap("BackupMethod")
        private String backupMethod;

        @com.aliyun.core.annotation.NameInMap("BackupSetScale")
        private Integer backupSetScale;

        @com.aliyun.core.annotation.NameInMap("BackupSetStatus")
        private Integer backupSetStatus;

        @com.aliyun.core.annotation.NameInMap("BackupStartTime")
        private String backupStartTime;

        @com.aliyun.core.annotation.NameInMap("BackupType")
        private String backupType;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("ConsistentTime")
        private String consistentTime;

        @com.aliyun.core.annotation.NameInMap("CrossBackupDownloadLink")
        private String crossBackupDownloadLink;

        @com.aliyun.core.annotation.NameInMap("CrossBackupId")
        private Integer crossBackupId;

        @com.aliyun.core.annotation.NameInMap("CrossBackupRegion")
        private String crossBackupRegion;

        @com.aliyun.core.annotation.NameInMap("CrossBackupSetFile")
        private String crossBackupSetFile;

        @com.aliyun.core.annotation.NameInMap("CrossBackupSetLocation")
        private String crossBackupSetLocation;

        @com.aliyun.core.annotation.NameInMap("CrossBackupSetSize")
        private Long crossBackupSetSize;

        @com.aliyun.core.annotation.NameInMap("DBInstanceStorageType")
        private String DBInstanceStorageType;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EngineVersion")
        private String engineVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Integer instanceId;

        @com.aliyun.core.annotation.NameInMap("RestoreRegions")
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
             * <p>The time when the cross-region data backup file was generated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-15T12:10:00Z</p>
             */
            public Builder backupEndTime(String backupEndTime) {
                this.backupEndTime = backupEndTime;
                return this;
            }

            /**
             * <p>The method that is used to generate the cross-region data backup file. Valid values:</p>
             * <ul>
             * <li><strong>L</strong>: logical backup</li>
             * <li><strong>P</strong>: physical backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>P</p>
             */
            public Builder backupMethod(String backupMethod) {
                this.backupMethod = backupMethod;
                return this;
            }

            /**
             * <p>The level at which the cross-region data backup file is generated.</p>
             * <ul>
             * <li><strong>0</strong>: instance-level backup</li>
             * <li><strong>1</strong>: database-level backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backupSetScale(Integer backupSetScale) {
                this.backupSetScale = backupSetScale;
                return this;
            }

            /**
             * <p>The status of the cross-region data backup. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The cross-region data backup is successful.</li>
             * <li><strong>1</strong>: The cross-region data backup failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder backupSetStatus(Integer backupSetStatus) {
                this.backupSetStatus = backupSetStatus;
                return this;
            }

            /**
             * <p>The time when the cross-region data backup started.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-30T12:10:00Z</p>
             */
            public Builder backupStartTime(String backupStartTime) {
                this.backupStartTime = backupStartTime;
                return this;
            }

            /**
             * <p>The type of the cross-region data backup. Valid values:</p>
             * <ul>
             * <li><strong>F</strong>: full data backup</li>
             * <li><strong>I</strong>: incremental data backup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>F</p>
             */
            public Builder backupType(String backupType) {
                this.backupType = backupType;
                return this;
            }

            /**
             * <p>The RDS edition of the instance. Valid values:</p>
             * <ul>
             * <li><strong>Basic</strong>: RDS Basic Edition.</li>
             * <li><strong>HighAvailability</strong>: RDS High-availability Edition.</li>
             * <li><strong>Finance</strong>: RDS Enterprise Edition. This edition is available only for the China site (aliyun.com).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HighAvailability</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The point in time that is indicated by the data in the cross-region data backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-12T05:44:46Z</p>
             */
            public Builder consistentTime(String consistentTime) {
                this.consistentTime = consistentTime;
                return this;
            }

            /**
             * <p>The external URL from which you can download the cross-region data backup file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsddrbak-shanghai.oss-cn-shanghai.aliyuncs.com/xxxxx">http://rdsddrbak-shanghai.oss-cn-shanghai.aliyuncs.com/xxxxx</a></p>
             */
            public Builder crossBackupDownloadLink(String crossBackupDownloadLink) {
                this.crossBackupDownloadLink = crossBackupDownloadLink;
                return this;
            }

            /**
             * <p>The ID of the cross-region data backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>14377</p>
             */
            public Builder crossBackupId(Integer crossBackupId) {
                this.crossBackupId = crossBackupId;
                return this;
            }

            /**
             * <p>The ID of the region in which the cross-region backup files of the instance are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder crossBackupRegion(String crossBackupRegion) {
                this.crossBackupRegion = crossBackupRegion;
                return this;
            }

            /**
             * <p>The name of the compressed package that contains the cross-region data backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou_rm-xxxxx_hins81xxx_data_20190612134426_qp.xb</p>
             */
            public Builder crossBackupSetFile(String crossBackupSetFile) {
                this.crossBackupSetFile = crossBackupSetFile;
                return this;
            }

            /**
             * <p>The location where the cross-region data backup file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder crossBackupSetLocation(String crossBackupSetLocation) {
                this.crossBackupSetLocation = crossBackupSetLocation;
                return this;
            }

            /**
             * <p>The size of the cross-region data backup file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>5312836</p>
             */
            public Builder crossBackupSetSize(Long crossBackupSetSize) {
                this.crossBackupSetSize = crossBackupSetSize;
                return this;
            }

            /**
             * <p>The storage type. Valid values:</p>
             * <ul>
             * <li><strong>local_ssd</strong>: local SSDs. This is the recommended storage type.</li>
             * <li><strong>cloud_ssd</strong>: standard SSD.</li>
             * <li><strong>cloud_essd</strong>: enhanced SSD (ESSD).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ssd</p>
             */
            public Builder DBInstanceStorageType(String DBInstanceStorageType) {
                this.DBInstanceStorageType = DBInstanceStorageType;
                return this;
            }

            /**
             * <p>The database engine of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>mysql</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
             */
            public Builder engineVersion(String engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            /**
             * <p>The instance ID. This parameter is used to determine whether the instance that generates the cross-region data backup file is a primary or secondary instance.</p>
             * 
             * <strong>example:</strong>
             * <p>8161055</p>
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The regions to which the cross-region data backup file can be restored.</p>
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
    /**
     * 
     * {@link DescribeCrossRegionBackupsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossRegionBackupsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
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
