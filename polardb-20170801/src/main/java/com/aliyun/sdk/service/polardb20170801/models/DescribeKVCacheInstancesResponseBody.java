// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeKVCacheInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeKVCacheInstancesResponseBody</p>
 */
public class DescribeKVCacheInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeKVCacheInstancesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKVCacheInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeKVCacheInstancesResponseBody model) {
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of instances returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of instances that match the filter conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeKVCacheInstancesResponseBody build() {
            return new DescribeKVCacheInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeKVCacheInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKVCacheInstancesResponseBody</p>
     */
    public static class KVCacheItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIDBClusterId")
        private String AIDBClusterId;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("KVCacheInstanceId")
        private String KVCacheInstanceId;

        @com.aliyun.core.annotation.NameInMap("KVCacheInstanceStatus")
        private String KVCacheInstanceStatus;

        @com.aliyun.core.annotation.NameInMap("KVCacheSpace")
        private Integer KVCacheSpace;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VPCId")
        private String VPCId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private KVCacheItem(Builder builder) {
            this.AIDBClusterId = builder.AIDBClusterId;
            this.creationTime = builder.creationTime;
            this.DBClusterId = builder.DBClusterId;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.KVCacheInstanceId = builder.KVCacheInstanceId;
            this.KVCacheInstanceStatus = builder.KVCacheInstanceStatus;
            this.KVCacheSpace = builder.KVCacheSpace;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.VPCId = builder.VPCId;
            this.vSwitchId = builder.vSwitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KVCacheItem create() {
            return builder().build();
        }

        /**
         * @return AIDBClusterId
         */
        public String getAIDBClusterId() {
            return this.AIDBClusterId;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return KVCacheInstanceId
         */
        public String getKVCacheInstanceId() {
            return this.KVCacheInstanceId;
        }

        /**
         * @return KVCacheInstanceStatus
         */
        public String getKVCacheInstanceStatus() {
            return this.KVCacheInstanceStatus;
        }

        /**
         * @return KVCacheSpace
         */
        public Integer getKVCacheSpace() {
            return this.KVCacheSpace;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return VPCId
         */
        public String getVPCId() {
            return this.VPCId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String AIDBClusterId; 
            private String creationTime; 
            private String DBClusterId; 
            private String expireTime; 
            private String expired; 
            private String KVCacheInstanceId; 
            private String KVCacheInstanceStatus; 
            private Integer KVCacheSpace; 
            private String payType; 
            private String regionId; 
            private String VPCId; 
            private String vSwitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(KVCacheItem model) {
                this.AIDBClusterId = model.AIDBClusterId;
                this.creationTime = model.creationTime;
                this.DBClusterId = model.DBClusterId;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.KVCacheInstanceId = model.KVCacheInstanceId;
                this.KVCacheInstanceStatus = model.KVCacheInstanceStatus;
                this.KVCacheSpace = model.KVCacheSpace;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.VPCId = model.VPCId;
                this.vSwitchId = model.vSwitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AIDBClusterId.
             */
            public Builder AIDBClusterId(String AIDBClusterId) {
                this.AIDBClusterId = AIDBClusterId;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DBClusterId.
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * Expired.
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * KVCacheInstanceId.
             */
            public Builder KVCacheInstanceId(String KVCacheInstanceId) {
                this.KVCacheInstanceId = KVCacheInstanceId;
                return this;
            }

            /**
             * KVCacheInstanceStatus.
             */
            public Builder KVCacheInstanceStatus(String KVCacheInstanceStatus) {
                this.KVCacheInstanceStatus = KVCacheInstanceStatus;
                return this;
            }

            /**
             * KVCacheSpace.
             */
            public Builder KVCacheSpace(Integer KVCacheSpace) {
                this.KVCacheSpace = KVCacheSpace;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
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
             * VPCId.
             */
            public Builder VPCId(String VPCId) {
                this.VPCId = VPCId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public KVCacheItem build() {
                return new KVCacheItem(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeKVCacheInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeKVCacheInstancesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("KVCacheItem")
        private java.util.List<KVCacheItem> KVCacheItem;

        private Items(Builder builder) {
            this.KVCacheItem = builder.KVCacheItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return KVCacheItem
         */
        public java.util.List<KVCacheItem> getKVCacheItem() {
            return this.KVCacheItem;
        }

        public static final class Builder {
            private java.util.List<KVCacheItem> KVCacheItem; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.KVCacheItem = model.KVCacheItem;
            } 

            /**
             * KVCacheItem.
             */
            public Builder KVCacheItem(java.util.List<KVCacheItem> KVCacheItem) {
                this.KVCacheItem = KVCacheItem;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
