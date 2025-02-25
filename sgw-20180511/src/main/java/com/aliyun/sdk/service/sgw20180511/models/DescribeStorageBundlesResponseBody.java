// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageBundlesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStorageBundlesResponseBody</p>
 */
public class DescribeStorageBundlesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StorageBundles")
    private StorageBundles storageBundles;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeStorageBundlesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.storageBundles = builder.storageBundles;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageBundlesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return storageBundles
     */
    public StorageBundles getStorageBundles() {
        return this.storageBundles;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private StorageBundles storageBundles; 
        private Boolean success; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * StorageBundles.
         */
        public Builder storageBundles(StorageBundles storageBundles) {
            this.storageBundles = storageBundles;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeStorageBundlesResponseBody build() {
            return new DescribeStorageBundlesResponseBody(this);
        } 

    } 

    public static class StorageBundle extends TeaModel {
        @NameInMap("BackendBucketRegionId")
        private String backendBucketRegionId;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("StorageBundleId")
        private String storageBundleId;

        private StorageBundle(Builder builder) {
            this.backendBucketRegionId = builder.backendBucketRegionId;
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.name = builder.name;
            this.storageBundleId = builder.storageBundleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageBundle create() {
            return builder().build();
        }

        /**
         * @return backendBucketRegionId
         */
        public String getBackendBucketRegionId() {
            return this.backendBucketRegionId;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return storageBundleId
         */
        public String getStorageBundleId() {
            return this.storageBundleId;
        }

        public static final class Builder {
            private String backendBucketRegionId; 
            private Long createdTime; 
            private String description; 
            private String name; 
            private String storageBundleId; 

            /**
             * BackendBucketRegionId.
             */
            public Builder backendBucketRegionId(String backendBucketRegionId) {
                this.backendBucketRegionId = backendBucketRegionId;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * StorageBundleId.
             */
            public Builder storageBundleId(String storageBundleId) {
                this.storageBundleId = storageBundleId;
                return this;
            }

            public StorageBundle build() {
                return new StorageBundle(this);
            } 

        } 

    }
    public static class StorageBundles extends TeaModel {
        @NameInMap("StorageBundle")
        private java.util.List < StorageBundle> storageBundle;

        private StorageBundles(Builder builder) {
            this.storageBundle = builder.storageBundle;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageBundles create() {
            return builder().build();
        }

        /**
         * @return storageBundle
         */
        public java.util.List < StorageBundle> getStorageBundle() {
            return this.storageBundle;
        }

        public static final class Builder {
            private java.util.List < StorageBundle> storageBundle; 

            /**
             * StorageBundle.
             */
            public Builder storageBundle(java.util.List < StorageBundle> storageBundle) {
                this.storageBundle = storageBundle;
                return this;
            }

            public StorageBundles build() {
                return new StorageBundles(this);
            } 

        } 

    }
}
