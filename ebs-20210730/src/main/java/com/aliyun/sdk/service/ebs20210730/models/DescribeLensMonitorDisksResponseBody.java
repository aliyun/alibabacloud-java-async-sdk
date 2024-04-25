// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLensMonitorDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLensMonitorDisksResponseBody</p>
 */
public class DescribeLensMonitorDisksResponseBody extends TeaModel {
    @NameInMap("DiskInfos")
    private java.util.List < DiskInfos> diskInfos;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeLensMonitorDisksResponseBody(Builder builder) {
        this.diskInfos = builder.diskInfos;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLensMonitorDisksResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskInfos
     */
    public java.util.List < DiskInfos> getDiskInfos() {
        return this.diskInfos;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DiskInfos> diskInfos; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Cloud disk information list.
         */
        public Builder diskInfos(java.util.List < DiskInfos> diskInfos) {
            this.diskInfos = diskInfos;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLensMonitorDisksResponseBody build() {
            return new DescribeLensMonitorDisksResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("TagKey")
        private String tagKey;

        @NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * The tag key.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DiskInfos extends TeaModel {
        @NameInMap("Bps")
        private Integer bps;

        @NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @NameInMap("DiskCategory")
        private String diskCategory;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("DiskName")
        private String diskName;

        @NameInMap("DiskStatus")
        private String diskStatus;

        @NameInMap("DiskType")
        private String diskType;

        @NameInMap("Iops")
        private Integer iops;

        @NameInMap("LensTags")
        private java.util.List < String > lensTags;

        @NameInMap("PerformanceLevel")
        private String performanceLevel;

        @NameInMap("ProvisionedIops")
        private Integer provisionedIops;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("ZoneId")
        private String zoneId;

        private DiskInfos(Builder builder) {
            this.bps = builder.bps;
            this.burstingEnabled = builder.burstingEnabled;
            this.diskCategory = builder.diskCategory;
            this.diskId = builder.diskId;
            this.diskName = builder.diskName;
            this.diskStatus = builder.diskStatus;
            this.diskType = builder.diskType;
            this.iops = builder.iops;
            this.lensTags = builder.lensTags;
            this.performanceLevel = builder.performanceLevel;
            this.provisionedIops = builder.provisionedIops;
            this.regionId = builder.regionId;
            this.size = builder.size;
            this.tags = builder.tags;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskInfos create() {
            return builder().build();
        }

        /**
         * @return bps
         */
        public Integer getBps() {
            return this.bps;
        }

        /**
         * @return burstingEnabled
         */
        public Boolean getBurstingEnabled() {
            return this.burstingEnabled;
        }

        /**
         * @return diskCategory
         */
        public String getDiskCategory() {
            return this.diskCategory;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return diskName
         */
        public String getDiskName() {
            return this.diskName;
        }

        /**
         * @return diskStatus
         */
        public String getDiskStatus() {
            return this.diskStatus;
        }

        /**
         * @return diskType
         */
        public String getDiskType() {
            return this.diskType;
        }

        /**
         * @return iops
         */
        public Integer getIops() {
            return this.iops;
        }

        /**
         * @return lensTags
         */
        public java.util.List < String > getLensTags() {
            return this.lensTags;
        }

        /**
         * @return performanceLevel
         */
        public String getPerformanceLevel() {
            return this.performanceLevel;
        }

        /**
         * @return provisionedIops
         */
        public Integer getProvisionedIops() {
            return this.provisionedIops;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Integer bps; 
            private Boolean burstingEnabled; 
            private String diskCategory; 
            private String diskId; 
            private String diskName; 
            private String diskStatus; 
            private String diskType; 
            private Integer iops; 
            private java.util.List < String > lensTags; 
            private String performanceLevel; 
            private Integer provisionedIops; 
            private String regionId; 
            private Integer size; 
            private java.util.List < Tags> tags; 
            private String zoneId; 

            /**
             * The BPS.
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * Indicates whether the performance burst feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             * 
             * This parameter is available only if you set `DiskCategory` to `cloud_auto`. For more information, see [ESSD AutoPL disks](~~368372~~).
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * The type of the disk. Valid values:
             * <p>
             * - cloud
             * - cloud_efficiency
             * - cloud_ssd
             * - cloud_essd
             * - cloud_auto
             * - cloud_essd_entry
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * The ID of the disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The name of the disk.
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * The disk status. Valid values:
             * <p>
             * 
             * - Available
             * - Deleted
             */
            public Builder diskStatus(String diskStatus) {
                this.diskStatus = diskStatus;
                return this;
            }

            /**
             * The disk type. Valid values:
             * <p>
             * *   system: system disk
             * *   data: data disk
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * The IOPS.
             */
            public Builder iops(Integer iops) {
                this.iops = iops;
                return this;
            }

            /**
             * Lens tags of the disk.
             */
            public Builder lensTags(java.util.List < String > lensTags) {
                this.lensTags = lensTags;
                return this;
            }

            /**
             * The new performance level of the ESSD. Valid values:
             * <p>
             * 
             * *   PL0: An ESSD can deliver up to 10,000 random read/write IOPS.
             * *   PL1: An ESSD can deliver up to 50,000 random read/write IOPS.
             * *   PL2: An ESSD can deliver up to 100,000 random read/write IOPS.
             * *   PL3: An ESSD delivers up to 1,000,000 random read/write IOPS.
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * The provisioned read/write IOPS of the ESSD AutoPL disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline IOPS}
             * <p>
             * 
             * Baseline IOPS = min{1,800 + 50 × Capacity, 50,000}
             * 
             * >  This parameter is available only if the DiskCategory parameter is set to cloud_auto. For more information, see [ESSD AutoPL disks](https://www.alibabacloud.com/help/en/ecs/user-guide/essd-autopl-disks)
             */
            public Builder provisionedIops(Integer provisionedIops) {
                this.provisionedIops = provisionedIops;
                return this;
            }

            /**
             * The region ID of the disk.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The size of the disk. Unit: GiB.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * Tags of the disk.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the zone.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public DiskInfos build() {
                return new DiskInfos(this);
            } 

        } 

    }
}
