// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeLensMonitorDisksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLensMonitorDisksResponseBody</p>
 */
public class DescribeLensMonitorDisksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskInfos")
    private java.util.List<DiskInfos> diskInfos;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskInfos
     */
    public java.util.List<DiskInfos> getDiskInfos() {
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
        private java.util.List<DiskInfos> diskInfos; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeLensMonitorDisksResponseBody model) {
            this.diskInfos = model.diskInfos;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of cloud disk information.</p>
         */
        public Builder diskInfos(java.util.List<DiskInfos> diskInfos) {
            this.diskInfos = diskInfos;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID. A request ID is returned regardless of whether the API call succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLensMonitorDisksResponseBody build() {
            return new DescribeLensMonitorDisksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLensMonitorDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLensMonitorDisksResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>user</p>
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
    /**
     * 
     * {@link DescribeLensMonitorDisksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLensMonitorDisksResponseBody</p>
     */
    public static class DiskInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bps")
        private Integer bps;

        @com.aliyun.core.annotation.NameInMap("BurstingEnabled")
        private Boolean burstingEnabled;

        @com.aliyun.core.annotation.NameInMap("DiskCategory")
        private String diskCategory;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("DiskName")
        private String diskName;

        @com.aliyun.core.annotation.NameInMap("DiskStatus")
        private String diskStatus;

        @com.aliyun.core.annotation.NameInMap("DiskType")
        private String diskType;

        @com.aliyun.core.annotation.NameInMap("Iops")
        private Integer iops;

        @com.aliyun.core.annotation.NameInMap("LensTags")
        private java.util.List<String> lensTags;

        @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
        private String performanceLevel;

        @com.aliyun.core.annotation.NameInMap("ProvisionedIops")
        private Integer provisionedIops;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SharingEnabled")
        private String sharingEnabled;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Integer size;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
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
            this.sharingEnabled = builder.sharingEnabled;
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
        public java.util.List<String> getLensTags() {
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
         * @return sharingEnabled
         */
        public String getSharingEnabled() {
            return this.sharingEnabled;
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
        public java.util.List<Tags> getTags() {
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
            private java.util.List<String> lensTags; 
            private String performanceLevel; 
            private Integer provisionedIops; 
            private String regionId; 
            private String sharingEnabled; 
            private Integer size; 
            private java.util.List<Tags> tags; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(DiskInfos model) {
                this.bps = model.bps;
                this.burstingEnabled = model.burstingEnabled;
                this.diskCategory = model.diskCategory;
                this.diskId = model.diskId;
                this.diskName = model.diskName;
                this.diskStatus = model.diskStatus;
                this.diskType = model.diskType;
                this.iops = model.iops;
                this.lensTags = model.lensTags;
                this.performanceLevel = model.performanceLevel;
                this.provisionedIops = model.provisionedIops;
                this.regionId = model.regionId;
                this.sharingEnabled = model.sharingEnabled;
                this.size = model.size;
                this.tags = model.tags;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The maximum data throughput for read/write (I/O) operations per second. Unit: MB/s.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder bps(Integer bps) {
                this.bps = bps;
                return this;
            }

            /**
             * <p>Indicates whether burst (performance bursting) is enabled. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disk</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder burstingEnabled(Boolean burstingEnabled) {
                this.burstingEnabled = burstingEnabled;
                return this;
            }

            /**
             * <p>The cloud disk type. Valid values:</p>
             * <ul>
             * <li>cloud: basic cloud disk.</li>
             * <li>cloud_efficiency: ultra cloud disk.</li>
             * <li>cloud_ssd: standard SSD.</li>
             * <li>cloud_essd: Enterprise SSD (ESSD).</li>
             * <li>cloud_auto: ESSD AutoPL cloud disk.</li>
             * <li>cloud_essd_entry: ESSD Entry disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_essd</p>
             */
            public Builder diskCategory(String diskCategory) {
                this.diskCategory = diskCategory;
                return this;
            }

            /**
             * <p>The cloud disk ID.</p>
             * 
             * <strong>example:</strong>
             * <p>d-cd401****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The cloud disk name.</p>
             * 
             * <strong>example:</strong>
             * <p>disk-28c6b****</p>
             */
            public Builder diskName(String diskName) {
                this.diskName = diskName;
                return this;
            }

            /**
             * <p>The cloud disk status. Valid values:</p>
             * <ul>
             * <li>Available: in use.</li>
             * <li>Deleted: deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder diskStatus(String diskStatus) {
                this.diskStatus = diskStatus;
                return this;
            }

            /**
             * <p>The cloud disk type. Valid values:</p>
             * <ul>
             * <li>system: system cloud disk.</li>
             * <li>data: data cloud disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder diskType(String diskType) {
                this.diskType = diskType;
                return this;
            }

            /**
             * <p>The maximum number of read/write (I/O) operations per second. Unit: operations/s.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder iops(Integer iops) {
                this.iops = iops;
                return this;
            }

            /**
             * <p>The collection of event tags for the cloud disk. Event tags display events that occurred on the cloud disk within the last 24 hours, with a delay of up to 1 hour compared to the actual events.</p>
             */
            public Builder lensTags(java.util.List<String> lensTags) {
                this.lensTags = lensTags;
                return this;
            }

            /**
             * <p>The performance level (PL) of the ESSD cloud disk. Valid values:</p>
             * <ul>
             * <li>PL0: maximum random read/write IOPS of 10,000 per standard SSD.</li>
             * <li>PL1: maximum random read/write IOPS of 50,000 per standard SSD.</li>
             * <li>PL2: maximum random read/write IOPS of 100,000 per standard SSD.</li>
             * <li>PL3: maximum random read/write IOPS of 1,000,000 per standard SSD.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PL0</p>
             */
            public Builder performanceLevel(String performanceLevel) {
                this.performanceLevel = performanceLevel;
                return this;
            }

            /**
             * <p>The provisioned read/write IOPS of the ESSD AutoPL cloud disk. Valid values: 0 to min{50,000, 1,000 × Capacity - Baseline performance}.</p>
             * <p>Baseline performance = min{1,800 + 50 × Capacity, 50,000}.</p>
             * <p>This parameter is supported only when DiskCategory is set to cloud_auto. For more information, see <a href="https://help.aliyun.com/document_detail/368372.html">ESSD AutoPL cloud disk</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>4000</p>
             */
            public Builder provisionedIops(Integer provisionedIops) {
                this.provisionedIops = provisionedIops;
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
             * <p>Indicates whether the cloud disk is a shared cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sharingEnabled(String sharingEnabled) {
                this.sharingEnabled = sharingEnabled;
                return this;
            }

            /**
             * <p>The cloud disk size. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * <p>The collection of tags for the cloud disk.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The zone ID of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-j</p>
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
