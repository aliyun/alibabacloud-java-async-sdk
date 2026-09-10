// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kvcachestore20260617.models;

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
 * {@link ListKVCacheStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListKVCacheStoresResponseBody</p>
 */
public class ListKVCacheStoresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KVCacheStores")
    private java.util.List<KVCacheStores> KVCacheStores;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PageTotal")
    private Integer pageTotal;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListKVCacheStoresResponseBody(Builder builder) {
        this.KVCacheStores = builder.KVCacheStores;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pageTotal = builder.pageTotal;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKVCacheStoresResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return KVCacheStores
     */
    public java.util.List<KVCacheStores> getKVCacheStores() {
        return this.KVCacheStores;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return pageTotal
     */
    public Integer getPageTotal() {
        return this.pageTotal;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<KVCacheStores> KVCacheStores; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer pageTotal; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListKVCacheStoresResponseBody model) {
            this.KVCacheStores = model.KVCacheStores;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.pageTotal = model.pageTotal;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of KVCacheStore instances. Each element contains the following fields: KvcsId, Name, Status, ExtraStatus, RegionId, ZoneId, HpnZone, Type, Capacity, PaymentType, MountPointId, CreateTime, and Description.</p>
         */
        public Builder KVCacheStores(java.util.List<KVCacheStores> KVCacheStores) {
            this.KVCacheStores = KVCacheStores;
            return this;
        }

        /**
         * <p>The maximum number of entries returned per pagination request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. This value is empty when no more data is available. This parameter is valid only for cursor-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number. This parameter is valid only for page number-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. This parameter is valid only for page number-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The total number of pages. This value is returned only for page number-based pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageTotal(Integer pageTotal) {
            this.pageTotal = pageTotal;
            return this;
        }

        /**
         * <p>The request ID. A request ID is returned regardless of whether the API call succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>56AC37CD-388E-5D21-951B-C50D16D8E812</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances. This value is returned only for page number-based pagination. For cursor-based pagination, the value is -1.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKVCacheStoresResponseBody build() {
            return new ListKVCacheStoresResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKVCacheStoresResponseBody} extends {@link TeaModel}
     *
     * <p>ListKVCacheStoresResponseBody</p>
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
             * <p>The tag key of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>chapter</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value-1766542011</p>
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
     * {@link ListKVCacheStoresResponseBody} extends {@link TeaModel}
     *
     * <p>ListKVCacheStoresResponseBody</p>
     */
    public static class KVCacheStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExtraStatus")
        private String extraStatus;

        @com.aliyun.core.annotation.NameInMap("HpnZone")
        private String hpnZone;

        @com.aliyun.core.annotation.NameInMap("KvcsId")
        private String kvcsId;

        @com.aliyun.core.annotation.NameInMap("MountPointId")
        private String mountPointId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PaymentType")
        private String paymentType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private KVCacheStores(Builder builder) {
            this.capacity = builder.capacity;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.extraStatus = builder.extraStatus;
            this.hpnZone = builder.hpnZone;
            this.kvcsId = builder.kvcsId;
            this.mountPointId = builder.mountPointId;
            this.name = builder.name;
            this.paymentType = builder.paymentType;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.type = builder.type;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KVCacheStores create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return extraStatus
         */
        public String getExtraStatus() {
            return this.extraStatus;
        }

        /**
         * @return hpnZone
         */
        public String getHpnZone() {
            return this.hpnZone;
        }

        /**
         * @return kvcsId
         */
        public String getKvcsId() {
            return this.kvcsId;
        }

        /**
         * @return mountPointId
         */
        public String getMountPointId() {
            return this.mountPointId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long capacity; 
            private String createTime; 
            private String description; 
            private String extraStatus; 
            private String hpnZone; 
            private String kvcsId; 
            private String mountPointId; 
            private String name; 
            private String paymentType; 
            private String regionId; 
            private String resourceGroupId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String type; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(KVCacheStores model) {
                this.capacity = model.capacity;
                this.createTime = model.createTime;
                this.description = model.description;
                this.extraStatus = model.extraStatus;
                this.hpnZone = model.hpnZone;
                this.kvcsId = model.kvcsId;
                this.mountPointId = model.mountPointId;
                this.name = model.name;
                this.paymentType = model.paymentType;
                this.regionId = model.regionId;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.tags = model.tags;
                this.type = model.type;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The storage capacity. Unit: GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The creation time in ISO 8601 format.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-18T10:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The instance description.</p>
             * 
             * <strong>example:</strong>
             * <p>production kvcachestore</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The extra status information. Valid values: CapacityExpanding, CapacityExpandSuccess, and CapacityExpandFail.</p>
             * 
             * <strong>example:</strong>
             * <p>CapacityExpanding</p>
             */
            public Builder extraStatus(String extraStatus) {
                this.extraStatus = extraStatus;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>kvcs-xxxxx</p>
             */
            public Builder kvcsId(String kvcsId) {
                this.kvcsId = kvcsId;
                return this;
            }

            /**
             * <p>The file system-level mount point ID. Instances under the same file system share this mount point. For more information, call ListKVCacheInstanceAttachInfo.</p>
             * 
             * <strong>example:</strong>
             * <p>mp-xxxxx</p>
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * <p>The instance name.</p>
             * 
             * <strong>example:</strong>
             * <p>production-instance</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The payment type. Valid values: PREPAY and POSTPAY.</p>
             * 
             * <strong>example:</strong>
             * <p>POSTPAY</p>
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
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
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek3dnrvdxj2dvq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The instance status. Valid values: Creating, Available, InUse, Stopping, Stopped, and Deleting.</p>
             * 
             * <strong>example:</strong>
             * <p>AVAILABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of resource tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The instance type. Valid values: kvcs (KVCacheStore, CPFS).</p>
             * 
             * <strong>example:</strong>
             * <p>preview</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public KVCacheStores build() {
                return new KVCacheStores(this);
            } 

        } 

    }
}
