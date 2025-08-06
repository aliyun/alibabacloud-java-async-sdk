// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetStorageListResponseBody} extends {@link TeaModel}
 *
 * <p>GetStorageListResponseBody</p>
 */
public class GetStorageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StorageList")
    private StorageList storageList;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private GetStorageListResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.storageList = builder.storageList;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStorageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return storageList
     */
    public StorageList getStorageList() {
        return this.storageList;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private StorageList storageList; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(GetStorageListResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.storageList = model.storageList;
            this.totalCount = model.totalCount;
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
         * StorageList.
         */
        public Builder storageList(StorageList storageList) {
            this.storageList = storageList;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetStorageListResponseBody build() {
            return new GetStorageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStorageListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageListResponseBody</p>
     */
    public static class Storage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("DefaultUpload")
        private Boolean defaultUpload;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StorageUsage")
        private Integer storageUsage;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        private Storage(Builder builder) {
            this.appId = builder.appId;
            this.defaultUpload = builder.defaultUpload;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupId = builder.groupId;
            this.location = builder.location;
            this.region = builder.region;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.storageUsage = builder.storageUsage;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Storage create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return defaultUpload
         */
        public Boolean getDefaultUpload() {
            return this.defaultUpload;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
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
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return storageUsage
         */
        public Integer getStorageUsage() {
            return this.storageUsage;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private String appId; 
            private Boolean defaultUpload; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupId; 
            private String location; 
            private String region; 
            private String resourceGroupId; 
            private Integer status; 
            private Integer storageUsage; 
            private Integer type; 

            private Builder() {
            } 

            private Builder(Storage model) {
                this.appId = model.appId;
                this.defaultUpload = model.defaultUpload;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupId = model.groupId;
                this.location = model.location;
                this.region = model.region;
                this.resourceGroupId = model.resourceGroupId;
                this.status = model.status;
                this.storageUsage = model.storageUsage;
                this.type = model.type;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * DefaultUpload.
             */
            public Builder defaultUpload(Boolean defaultUpload) {
                this.defaultUpload = defaultUpload;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
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
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StorageUsage.
             */
            public Builder storageUsage(Integer storageUsage) {
                this.storageUsage = storageUsage;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Storage build() {
                return new Storage(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStorageListResponseBody} extends {@link TeaModel}
     *
     * <p>GetStorageListResponseBody</p>
     */
    public static class StorageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Storage")
        private java.util.List<Storage> storage;

        private StorageList(Builder builder) {
            this.storage = builder.storage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageList create() {
            return builder().build();
        }

        /**
         * @return storage
         */
        public java.util.List<Storage> getStorage() {
            return this.storage;
        }

        public static final class Builder {
            private java.util.List<Storage> storage; 

            private Builder() {
            } 

            private Builder(StorageList model) {
                this.storage = model.storage;
            } 

            /**
             * Storage.
             */
            public Builder storage(java.util.List<Storage> storage) {
                this.storage = storage;
                return this;
            }

            public StorageList build() {
                return new StorageList(this);
            } 

        } 

    }
}
