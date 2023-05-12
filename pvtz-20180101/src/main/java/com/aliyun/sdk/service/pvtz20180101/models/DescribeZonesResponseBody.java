// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalItems")
    private Integer totalItems;

    @NameInMap("TotalPages")
    private Integer totalPages;

    @NameInMap("Zones")
    private Zones zones;

    private DescribeZonesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZonesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    /**
     * @return zones
     */
    public Zones getZones() {
        return this.zones;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 
        private Zones zones; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Zones.
         */
        public Builder zones(Zones zones) {
            this.zones = zones;
            return this;
        }

        public DescribeZonesResponseBody build() {
            return new DescribeZonesResponseBody(this);
        } 

    } 

    public static class ResourceTag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private ResourceTag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ResourceTag build() {
                return new ResourceTag(this);
            } 

        } 

    }
    public static class ResourceTags extends TeaModel {
        @NameInMap("ResourceTag")
        private java.util.List < ResourceTag> resourceTag;

        private ResourceTags(Builder builder) {
            this.resourceTag = builder.resourceTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceTags create() {
            return builder().build();
        }

        /**
         * @return resourceTag
         */
        public java.util.List < ResourceTag> getResourceTag() {
            return this.resourceTag;
        }

        public static final class Builder {
            private java.util.List < ResourceTag> resourceTag; 

            /**
             * ResourceTag.
             */
            public Builder resourceTag(java.util.List < ResourceTag> resourceTag) {
                this.resourceTag = resourceTag;
                return this;
            }

            public ResourceTags build() {
                return new ResourceTags(this);
            } 

        } 

    }
    public static class Zone extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("IsPtr")
        private Boolean isPtr;

        @NameInMap("ProxyPattern")
        private String proxyPattern;

        @NameInMap("RecordCount")
        private Integer recordCount;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ResourceTags")
        private ResourceTags resourceTags;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @NameInMap("ZoneId")
        private String zoneId;

        @NameInMap("ZoneName")
        private String zoneName;

        @NameInMap("ZoneTag")
        private String zoneTag;

        @NameInMap("ZoneType")
        private String zoneType;

        private Zone(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.isPtr = builder.isPtr;
            this.proxyPattern = builder.proxyPattern;
            this.recordCount = builder.recordCount;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceTags = builder.resourceTags;
            this.updateTime = builder.updateTime;
            this.updateTimestamp = builder.updateTimestamp;
            this.zoneId = builder.zoneId;
            this.zoneName = builder.zoneName;
            this.zoneTag = builder.zoneTag;
            this.zoneType = builder.zoneType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zone create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return isPtr
         */
        public Boolean getIsPtr() {
            return this.isPtr;
        }

        /**
         * @return proxyPattern
         */
        public String getProxyPattern() {
            return this.proxyPattern;
        }

        /**
         * @return recordCount
         */
        public Integer getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceTags
         */
        public ResourceTags getResourceTags() {
            return this.resourceTags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updateTimestamp
         */
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        /**
         * @return zoneName
         */
        public String getZoneName() {
            return this.zoneName;
        }

        /**
         * @return zoneTag
         */
        public String getZoneTag() {
            return this.zoneTag;
        }

        /**
         * @return zoneType
         */
        public String getZoneType() {
            return this.zoneType;
        }

        public static final class Builder {
            private String createTime; 
            private Long createTimestamp; 
            private Boolean isPtr; 
            private String proxyPattern; 
            private Integer recordCount; 
            private String remark; 
            private String resourceGroupId; 
            private ResourceTags resourceTags; 
            private String updateTime; 
            private Long updateTimestamp; 
            private String zoneId; 
            private String zoneName; 
            private String zoneTag; 
            private String zoneType; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * IsPtr.
             */
            public Builder isPtr(Boolean isPtr) {
                this.isPtr = isPtr;
                return this;
            }

            /**
             * ProxyPattern.
             */
            public Builder proxyPattern(String proxyPattern) {
                this.proxyPattern = proxyPattern;
                return this;
            }

            /**
             * RecordCount.
             */
            public Builder recordCount(Integer recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ResourceTags.
             */
            public Builder resourceTags(ResourceTags resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * zone ID。
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * ZoneName.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            /**
             * ZoneTag.
             */
            public Builder zoneTag(String zoneTag) {
                this.zoneTag = zoneTag;
                return this;
            }

            /**
             * ZoneType.
             */
            public Builder zoneType(String zoneType) {
                this.zoneType = zoneType;
                return this;
            }

            public Zone build() {
                return new Zone(this);
            } 

        } 

    }
    public static class Zones extends TeaModel {
        @NameInMap("Zone")
        private java.util.List < Zone> zone;

        private Zones(Builder builder) {
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Zones create() {
            return builder().build();
        }

        /**
         * @return zone
         */
        public java.util.List < Zone> getZone() {
            return this.zone;
        }

        public static final class Builder {
            private java.util.List < Zone> zone; 

            /**
             * Zone.
             */
            public Builder zone(java.util.List < Zone> zone) {
                this.zone = zone;
                return this;
            }

            public Zones build() {
                return new Zones(this);
            } 

        } 

    }
}
