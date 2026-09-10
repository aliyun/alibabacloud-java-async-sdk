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
         * <p>The default AccessKey ID at the instance level.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder defaultAccessKeyId(String defaultAccessKeyId) {
            this.defaultAccessKeyId = defaultAccessKeyId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of records on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values:</p>
         * <ul>
         * <li><p><strong>30</strong></p>
         * </li>
         * <li><p><strong>50</strong></p>
         * </li>
         * <li><p><strong>100</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of path mappings.</p>
         */
        public Builder pathMappingItems(java.util.List<PathMappingItems> pathMappingItems) {
            this.pathMappingItems = pathMappingItems;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>925B84D9-CA72-432C-95CF-738C22******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The storage bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>pfs-xxx.oss-[regionId]-internal.aliyuncs.com</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The AccessKey ID of the storage bucket.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder bucketAccessKeyId(String bucketAccessKeyId) {
                this.bucketAccessKeyId = bucketAccessKeyId;
                return this;
            }

            /**
             * <p>The mapping path.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
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
