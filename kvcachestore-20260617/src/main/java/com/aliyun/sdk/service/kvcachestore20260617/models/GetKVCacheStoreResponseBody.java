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
 * {@link GetKVCacheStoreResponseBody} extends {@link TeaModel}
 *
 * <p>GetKVCacheStoreResponseBody</p>
 */
public class GetKVCacheStoreResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("KvCacheStore")
    private KvCacheStore kvCacheStore;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetKVCacheStoreResponseBody(Builder builder) {
        this.kvCacheStore = builder.kvCacheStore;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetKVCacheStoreResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return kvCacheStore
     */
    public KvCacheStore getKvCacheStore() {
        return this.kvCacheStore;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private KvCacheStore kvCacheStore; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetKVCacheStoreResponseBody model) {
            this.kvCacheStore = model.kvCacheStore;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the KvCacheStore instance.</p>
         */
        public Builder kvCacheStore(KvCacheStore kvCacheStore) {
            this.kvCacheStore = kvCacheStore;
            return this;
        }

        /**
         * <p>The request ID. A request ID is returned regardless of whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>019FB5E9-F9E8-52F5-9C56-2CDF479CBEB2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetKVCacheStoreResponseBody build() {
            return new GetKVCacheStoreResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetKVCacheStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetKVCacheStoreResponseBody</p>
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
             * <p>ac-cus-tag-6</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>advanced</p>
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
     * {@link GetKVCacheStoreResponseBody} extends {@link TeaModel}
     *
     * <p>GetKVCacheStoreResponseBody</p>
     */
    public static class KvCacheStore extends TeaModel {
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

        private KvCacheStore(Builder builder) {
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

        public static KvCacheStore create() {
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

            private Builder(KvCacheStore model) {
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
             * <p>The storage capacity, in GiB.</p>
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
             * <p>The extra status information. Valid values:</p>
             * <ul>
             * <li>CapacityExpanding</li>
             * <li>CapacityExpandSuccess</li>
             * <li>CapacityExpandFail</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CapacityExpanding</p>
             */
            public Builder extraStatus(String extraStatus) {
                this.extraStatus = extraStatus;
                return this;
            }

            /**
             * <p>The cluster number.</p>
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
             * <p>The file system-level mount point ID. Instances under the same file system share this mount point. For more information, use ListKVCacheInstanceAttachInfo.</p>
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
             * <p>The payment type. Valid values:</p>
             * <ul>
             * <li>PREPAY</li>
             * <li>POSTPAY</li>
             * </ul>
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
             * <p>rg-aekzrwkxbdvkctq</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The instance status. Valid values:</p>
             * <ul>
             * <li>Creating</li>
             * <li>Available</li>
             * <li>InUse</li>
             * <li>Stopping</li>
             * <li>Stopped</li>
             * <li>Deleting</li>
             * </ul>
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
             * <p>The instance type. Valid values:</p>
             * <ul>
             * <li>kvcs: KVCacheStore (CPFS).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>kvcs</p>
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

            public KvCacheStore build() {
                return new KvCacheStore(this);
            } 

        } 

    }
}
