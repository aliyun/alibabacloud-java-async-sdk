// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeZonesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeZonesResponseBody</p>
 */
public class DescribeZonesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    @com.aliyun.core.annotation.NameInMap("Zones")
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
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * The total number of pages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * The zones.
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
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * The key of tag N added to the zone.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N added to the zone.
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
        @com.aliyun.core.annotation.NameInMap("ResourceTag")
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
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("CreatorSubType")
        private String creatorSubType;

        @com.aliyun.core.annotation.NameInMap("DnsGroup")
        private String dnsGroup;

        @com.aliyun.core.annotation.NameInMap("DnsGroupChanging")
        private Boolean dnsGroupChanging;

        @com.aliyun.core.annotation.NameInMap("IsPtr")
        private Boolean isPtr;

        @com.aliyun.core.annotation.NameInMap("ProxyPattern")
        private String proxyPattern;

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Integer recordCount;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceTags")
        private ResourceTags resourceTags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private Long updateTimestamp;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        @com.aliyun.core.annotation.NameInMap("ZoneName")
        private String zoneName;

        @com.aliyun.core.annotation.NameInMap("ZoneTag")
        private String zoneTag;

        @com.aliyun.core.annotation.NameInMap("ZoneType")
        private String zoneType;

        private Zone(Builder builder) {
            this.createTime = builder.createTime;
            this.createTimestamp = builder.createTimestamp;
            this.creator = builder.creator;
            this.creatorSubType = builder.creatorSubType;
            this.dnsGroup = builder.dnsGroup;
            this.dnsGroupChanging = builder.dnsGroupChanging;
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
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return creatorSubType
         */
        public String getCreatorSubType() {
            return this.creatorSubType;
        }

        /**
         * @return dnsGroup
         */
        public String getDnsGroup() {
            return this.dnsGroup;
        }

        /**
         * @return dnsGroupChanging
         */
        public Boolean getDnsGroupChanging() {
            return this.dnsGroupChanging;
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
            private String creator; 
            private String creatorSubType; 
            private String dnsGroup; 
            private Boolean dnsGroupChanging; 
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
             * The time when the zone was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the zone was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * The creator of the zone.
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * The type of the user account.
             * <p>
             * 
             * *   **CUSTOMER**: Alibaba Cloud account
             * *   **SUB**: RAM user
             * *   **STS**: assumed role that obtains the Security Token Service (STS) token of a RAM role
             * *   **OTHER**: other types
             */
            public Builder creatorSubType(String creatorSubType) {
                this.creatorSubType = creatorSubType;
                return this;
            }

            /**
             * The logical location type of the built-in authoritative module in which the zone is added. Valid values:
             * <p>
             * 
             * *   **NORMAL_ZONE**: regular module
             * *   **FAST_ZONE**: acceleration module
             */
            public Builder dnsGroup(String dnsGroup) {
                this.dnsGroup = dnsGroup;
                return this;
            }

            /**
             * Indicates whether the zone is being removed to another logical location. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder dnsGroupChanging(Boolean dnsGroupChanging) {
                this.dnsGroupChanging = dnsGroupChanging;
                return this;
            }

            /**
             * Indicates whether the zone is a reverse lookup zone. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder isPtr(Boolean isPtr) {
                this.isPtr = isPtr;
                return this;
            }

            /**
             * Indicates whether the recursive resolution proxy feature is enabled for the zone. Valid values:
             * <p>
             * 
             * *   **ZONE**: The recursive resolution proxy feature is disabled for the zone.
             * *   **RECORD**: The recursive resolution proxy feature is enabled for the zone.
             */
            public Builder proxyPattern(String proxyPattern) {
                this.proxyPattern = proxyPattern;
                return this;
            }

            /**
             * The number of Domain Name System (DNS) records.
             */
            public Builder recordCount(Integer recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * The description of the zone.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The tags added to the resources.
             */
            public Builder resourceTags(ResourceTags resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            /**
             * The time when the zone was last modified. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The time when the DNS record was updated. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970.
             */
            public Builder updateTimestamp(Long updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            /**
             * The zone ID.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            /**
             * The name of the zone.
             */
            public Builder zoneName(String zoneName) {
                this.zoneName = zoneName;
                return this;
            }

            /**
             * The type of the cloud service. Valid values:
             * <p>
             * 
             * *   If ZoneType is set to AUTH_ZONE, no value is returned for this parameter.
             * *   If ZoneType is set to CLOUD_PRODUCT_ZONE, the type of the cloud service is returned.
             */
            public Builder zoneTag(String zoneTag) {
                this.zoneTag = zoneTag;
                return this;
            }

            /**
             * The type of zones. Valid values:
             * <p>
             * 
             * *   **AUTH_ZONE**: authoritative zone
             * *   **CLOUD_PRODUCT_ZONE**: authoritative zone for cloud services
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
        @com.aliyun.core.annotation.NameInMap("Zone")
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
