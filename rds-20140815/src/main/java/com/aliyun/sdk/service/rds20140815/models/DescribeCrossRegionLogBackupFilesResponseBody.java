// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossRegionLogBackupFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossRegionLogBackupFilesResponseBody</p>
 */
public class DescribeCrossRegionLogBackupFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

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

    private DescribeCrossRegionLogBackupFilesResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
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

    public static DescribeCrossRegionLogBackupFilesResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
        private String DBInstanceId; 
        private String endTime; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String regionId; 
        private String requestId; 
        private String startTime; 
        private Integer totalRecordCount; 

        /**
         * The instance ID.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The end of the time range to query. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The cross-region log backup files.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number. Pages start from page 1.
         * <p>
         * 
         * Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of cross-region backup files on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The region ID of the instance.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The beginning of the time range to query. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The total number of entries that are returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeCrossRegionLogBackupFilesResponseBody build() {
            return new DescribeCrossRegionLogBackupFilesResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrossBackupRegion")
        private String crossBackupRegion;

        @com.aliyun.core.annotation.NameInMap("CrossDownloadLink")
        private String crossDownloadLink;

        @com.aliyun.core.annotation.NameInMap("CrossIntranetDownloadLink")
        private String crossIntranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("CrossLogBackupId")
        private Integer crossLogBackupId;

        @com.aliyun.core.annotation.NameInMap("CrossLogBackupSize")
        private Long crossLogBackupSize;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Integer instanceId;

        @com.aliyun.core.annotation.NameInMap("LinkExpiredTime")
        private String linkExpiredTime;

        @com.aliyun.core.annotation.NameInMap("LogBeginTime")
        private String logBeginTime;

        @com.aliyun.core.annotation.NameInMap("LogEndTime")
        private String logEndTime;

        @com.aliyun.core.annotation.NameInMap("LogFileName")
        private String logFileName;

        private Item(Builder builder) {
            this.crossBackupRegion = builder.crossBackupRegion;
            this.crossDownloadLink = builder.crossDownloadLink;
            this.crossIntranetDownloadLink = builder.crossIntranetDownloadLink;
            this.crossLogBackupId = builder.crossLogBackupId;
            this.crossLogBackupSize = builder.crossLogBackupSize;
            this.instanceId = builder.instanceId;
            this.linkExpiredTime = builder.linkExpiredTime;
            this.logBeginTime = builder.logBeginTime;
            this.logEndTime = builder.logEndTime;
            this.logFileName = builder.logFileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return crossBackupRegion
         */
        public String getCrossBackupRegion() {
            return this.crossBackupRegion;
        }

        /**
         * @return crossDownloadLink
         */
        public String getCrossDownloadLink() {
            return this.crossDownloadLink;
        }

        /**
         * @return crossIntranetDownloadLink
         */
        public String getCrossIntranetDownloadLink() {
            return this.crossIntranetDownloadLink;
        }

        /**
         * @return crossLogBackupId
         */
        public Integer getCrossLogBackupId() {
            return this.crossLogBackupId;
        }

        /**
         * @return crossLogBackupSize
         */
        public Long getCrossLogBackupSize() {
            return this.crossLogBackupSize;
        }

        /**
         * @return instanceId
         */
        public Integer getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return linkExpiredTime
         */
        public String getLinkExpiredTime() {
            return this.linkExpiredTime;
        }

        /**
         * @return logBeginTime
         */
        public String getLogBeginTime() {
            return this.logBeginTime;
        }

        /**
         * @return logEndTime
         */
        public String getLogEndTime() {
            return this.logEndTime;
        }

        /**
         * @return logFileName
         */
        public String getLogFileName() {
            return this.logFileName;
        }

        public static final class Builder {
            private String crossBackupRegion; 
            private String crossDownloadLink; 
            private String crossIntranetDownloadLink; 
            private Integer crossLogBackupId; 
            private Long crossLogBackupSize; 
            private Integer instanceId; 
            private String linkExpiredTime; 
            private String logBeginTime; 
            private String logEndTime; 
            private String logFileName; 

            /**
             * The ID of the destination region within which the cross-region backup file is stored.
             */
            public Builder crossBackupRegion(String crossBackupRegion) {
                this.crossBackupRegion = crossBackupRegion;
                return this;
            }

            /**
             * The external URL from which you can download the cross-region log backup file.
             */
            public Builder crossDownloadLink(String crossDownloadLink) {
                this.crossDownloadLink = crossDownloadLink;
                return this;
            }

            /**
             * The internal URL from which you can download the cross-region log backup file.
             */
            public Builder crossIntranetDownloadLink(String crossIntranetDownloadLink) {
                this.crossIntranetDownloadLink = crossIntranetDownloadLink;
                return this;
            }

            /**
             * The ID of the cross-region log backup file.
             */
            public Builder crossLogBackupId(Integer crossLogBackupId) {
                this.crossLogBackupId = crossLogBackupId;
                return this;
            }

            /**
             * The size of the cross-region log backup file. Unit: bytes.
             */
            public Builder crossLogBackupSize(Long crossLogBackupSize) {
                this.crossLogBackupSize = crossLogBackupSize;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The time when the URL expires. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            /**
             * The start time of the cross-region log backup file. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder logBeginTime(String logBeginTime) {
                this.logBeginTime = logBeginTime;
                return this;
            }

            /**
             * The end time of the cross-region log backup file. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.
             */
            public Builder logEndTime(String logEndTime) {
                this.logEndTime = logEndTime;
                return this;
            }

            /**
             * The name of the cross-region log backup file.
             */
            public Builder logFileName(String logFileName) {
                this.logFileName = logFileName;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
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
