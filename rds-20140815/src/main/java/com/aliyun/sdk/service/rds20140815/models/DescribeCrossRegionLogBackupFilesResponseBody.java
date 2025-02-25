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
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The end of the time range to query. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-06-15T12:10:00Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The cross-region log backup files.</p>
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
         * <p>The number of cross-region backup files on the current page.</p>
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
         * <p>DAC241E8-28E6-49DA-BFB0-B2DD090885C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The beginning of the time range to query. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
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

        public DescribeCrossRegionLogBackupFilesResponseBody build() {
            return new DescribeCrossRegionLogBackupFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossRegionLogBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossRegionLogBackupFilesResponseBody</p>
     */
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
             * <p>The ID of the destination region within which the cross-region backup file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder crossBackupRegion(String crossBackupRegion) {
                this.crossBackupRegion = crossBackupRegion;
                return this;
            }

            /**
             * <p>The external URL from which you can download the cross-region log backup file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsddrlog-zb.oss-cn-zhangjiakou.aliyuncs.com/xxxxx">http://rdsddrlog-zb.oss-cn-zhangjiakou.aliyuncs.com/xxxxx</a></p>
             */
            public Builder crossDownloadLink(String crossDownloadLink) {
                this.crossDownloadLink = crossDownloadLink;
                return this;
            }

            /**
             * <p>The internal URL from which you can download the cross-region log backup file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://rdsddrlog-zb.oss-cn-zhangjiakou-internal.aliyuncs.com/xxxxx">http://rdsddrlog-zb.oss-cn-zhangjiakou-internal.aliyuncs.com/xxxxx</a></p>
             */
            public Builder crossIntranetDownloadLink(String crossIntranetDownloadLink) {
                this.crossIntranetDownloadLink = crossIntranetDownloadLink;
                return this;
            }

            /**
             * <p>The ID of the cross-region log backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>14567</p>
             */
            public Builder crossLogBackupId(Integer crossLogBackupId) {
                this.crossLogBackupId = crossLogBackupId;
                return this;
            }

            /**
             * <p>The size of the cross-region log backup file. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>5312836</p>
             */
            public Builder crossLogBackupSize(Long crossLogBackupSize) {
                this.crossLogBackupSize = crossLogBackupSize;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>8161055</p>
             */
            public Builder instanceId(Integer instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The time when the URL expires. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-06-30T15:00:00Z</p>
             */
            public Builder linkExpiredTime(String linkExpiredTime) {
                this.linkExpiredTime = linkExpiredTime;
                return this;
            }

            /**
             * <p>The start time of the cross-region log backup file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-30T12:10:00Z</p>
             */
            public Builder logBeginTime(String logBeginTime) {
                this.logBeginTime = logBeginTime;
                return this;
            }

            /**
             * <p>The end time of the cross-region log backup file. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-30T20:10:00Z</p>
             */
            public Builder logEndTime(String logEndTime) {
                this.logEndTime = logEndTime;
                return this;
            }

            /**
             * <p>The name of the cross-region log backup file.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou_rm-bpxxxxx_7198739_mysql-bin.000230</p>
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
    /**
     * 
     * {@link DescribeCrossRegionLogBackupFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossRegionLogBackupFilesResponseBody</p>
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
