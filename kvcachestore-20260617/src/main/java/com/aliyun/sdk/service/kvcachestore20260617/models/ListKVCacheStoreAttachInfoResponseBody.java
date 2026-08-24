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
 * {@link ListKVCacheStoreAttachInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListKVCacheStoreAttachInfoResponseBody</p>
 */
public class ListKVCacheStoreAttachInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AttachInfos")
    private java.util.List<AttachInfos> attachInfos;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListKVCacheStoreAttachInfoResponseBody(Builder builder) {
        this.attachInfos = builder.attachInfos;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKVCacheStoreAttachInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attachInfos
     */
    public java.util.List<AttachInfos> getAttachInfos() {
        return this.attachInfos;
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
        private java.util.List<AttachInfos> attachInfos; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListKVCacheStoreAttachInfoResponseBody model) {
            this.attachInfos = model.attachInfos;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * AttachInfos.
         */
        public Builder attachInfos(java.util.List<AttachInfos> attachInfos) {
            this.attachInfos = attachInfos;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListKVCacheStoreAttachInfoResponseBody build() {
            return new ListKVCacheStoreAttachInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListKVCacheStoreAttachInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListKVCacheStoreAttachInfoResponseBody</p>
     */
    public static class AttachInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedAt")
        private String attachedAt;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("KvcsId")
        private String kvcsId;

        @com.aliyun.core.annotation.NameInMap("MountPointId")
        private String mountPointId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VscId")
        private String vscId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private AttachInfos(Builder builder) {
            this.attachedAt = builder.attachedAt;
            this.capacity = builder.capacity;
            this.kvcsId = builder.kvcsId;
            this.mountPointId = builder.mountPointId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.type = builder.type;
            this.vscId = builder.vscId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AttachInfos create() {
            return builder().build();
        }

        /**
         * @return attachedAt
         */
        public String getAttachedAt() {
            return this.attachedAt;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vscId
         */
        public String getVscId() {
            return this.vscId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String attachedAt; 
            private Long capacity; 
            private String kvcsId; 
            private String mountPointId; 
            private String regionId; 
            private String status; 
            private String type; 
            private String vscId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(AttachInfos model) {
                this.attachedAt = model.attachedAt;
                this.capacity = model.capacity;
                this.kvcsId = model.kvcsId;
                this.mountPointId = model.mountPointId;
                this.regionId = model.regionId;
                this.status = model.status;
                this.type = model.type;
                this.vscId = model.vscId;
                this.zoneId = model.zoneId;
            } 

            /**
             * AttachedAt.
             */
            public Builder attachedAt(String attachedAt) {
                this.attachedAt = attachedAt;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>KVCacheStore KvcsId</p>
             * 
             * <strong>example:</strong>
             * <p>kvcs-xxxxx</p>
             */
            public Builder kvcsId(String kvcsId) {
                this.kvcsId = kvcsId;
                return this;
            }

            /**
             * MountPointId.
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VscId.
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public AttachInfos build() {
                return new AttachInfos(this);
            } 

        } 

    }
}
