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
         * <p>The list of mount records.</p>
         */
        public Builder attachInfos(java.util.List<AttachInfos> attachInfos) {
            this.attachInfos = attachInfos;
            return this;
        }

        /**
         * <p>The query token, which is used to query the next batch of data.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh3NUkN7qf+fcWj7joK8M6tU</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID. This ID is returned regardless of whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>B127704C-ECB1-5B0A-AA9C-8F394A6F179F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned for a paging query.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

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
            this.instanceId = builder.instanceId;
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
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
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
            private String instanceId; 
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
                this.instanceId = model.instanceId;
                this.kvcsId = model.kvcsId;
                this.mountPointId = model.mountPointId;
                this.regionId = model.regionId;
                this.status = model.status;
                this.type = model.type;
                this.vscId = model.vscId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The time of the last attach operation in ISO 8601 format. If the instance is not attached, the value is null.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-20T08:30:00Z</p>
             */
            public Builder attachedAt(String attachedAt) {
                this.attachedAt = attachedAt;
                return this;
            }

            /**
             * <p>The capacity of the file system in GiB.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The ID of the compute resource, which is the ECS instance ID or the Lingjun compute node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>i-hdsagtg61h2hf21</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
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
             * <p>The ID of the file system-level mount point.</p>
             * 
             * <strong>example:</strong>
             * <p>mp-xxxxx</p>
             */
            public Builder mountPointId(String mountPointId) {
                this.mountPointId = mountPointId;
                return this;
            }

            /**
             * <p>The region where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The attach status. Valid values: Attaching, Attached, and Detaching. After the instance is detached, the record is deleted and not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>Attached</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The instance type. Valid value: kvcs.</p>
             * 
             * <strong>example:</strong>
             * <p>preview</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The ID of the compute-side VSC.</p>
             * 
             * <strong>example:</strong>
             * <p>vsc-001</p>
             */
            public Builder vscId(String vscId) {
                this.vscId = vscId;
                return this;
            }

            /**
             * <p>The zone where the instance is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
