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
 * {@link DescribePolarFsMappingResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarFsMappingResponseBody</p>
 */
public class DescribePolarFsMappingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultAccessKeyId")
    private String defaultAccessKeyId;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("PathMappingItems")
    private java.util.List<PathMappingItems> pathMappingItems;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private DescribePolarFsMappingResponseBody(Builder builder) {
        this.defaultAccessKeyId = builder.defaultAccessKeyId;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.pageSize = builder.pageSize;
        this.pathMappingItems = builder.pathMappingItems;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarFsMappingResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultAccessKeyId
     */
    public String getDefaultAccessKeyId() {
        return this.defaultAccessKeyId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pathMappingItems
     */
    public java.util.List<PathMappingItems> getPathMappingItems() {
        return this.pathMappingItems;
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
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String defaultAccessKeyId; 
        private String pageNumber; 
        private String pageRecordCount; 
        private String pageSize; 
        private java.util.List<PathMappingItems> pathMappingItems; 
        private String requestId; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribePolarFsMappingResponseBody model) {
            this.defaultAccessKeyId = model.defaultAccessKeyId;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.pageSize = model.pageSize;
            this.pathMappingItems = model.pathMappingItems;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * DefaultAccessKeyId.
         */
        public Builder defaultAccessKeyId(String defaultAccessKeyId) {
            this.defaultAccessKeyId = defaultAccessKeyId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PathMappingItems.
         */
        public Builder pathMappingItems(java.util.List<PathMappingItems> pathMappingItems) {
            this.pathMappingItems = pathMappingItems;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribePolarFsMappingResponseBody build() {
            return new DescribePolarFsMappingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarFsMappingResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarFsMappingResponseBody</p>
     */
    public static class PathMappingItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("BucketAccessKeyId")
        private String bucketAccessKeyId;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        private PathMappingItems(Builder builder) {
            this.bucket = builder.bucket;
            this.bucketAccessKeyId = builder.bucketAccessKeyId;
            this.path = builder.path;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PathMappingItems create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return bucketAccessKeyId
         */
        public String getBucketAccessKeyId() {
            return this.bucketAccessKeyId;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        public static final class Builder {
            private String bucket; 
            private String bucketAccessKeyId; 
            private String path; 

            private Builder() {
            } 

            private Builder(PathMappingItems model) {
                this.bucket = model.bucket;
                this.bucketAccessKeyId = model.bucketAccessKeyId;
                this.path = model.path;
            } 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * BucketAccessKeyId.
             */
            public Builder bucketAccessKeyId(String bucketAccessKeyId) {
                this.bucketAccessKeyId = bucketAccessKeyId;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            public PathMappingItems build() {
                return new PathMappingItems(this);
            } 

        } 

    }
}
