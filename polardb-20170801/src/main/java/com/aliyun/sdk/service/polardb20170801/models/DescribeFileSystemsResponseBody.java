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
 * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileSystemsResponseBody</p>
 */
public class DescribeFileSystemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BucketId")
    private String bucketId;

    @com.aliyun.core.annotation.NameInMap("FileCount")
    private Integer fileCount;

    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("FileSystems")
    private java.util.List<FileSystems> fileSystems;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFileSystemsResponseBody(Builder builder) {
        this.bucketId = builder.bucketId;
        this.fileCount = builder.fileCount;
        this.fileSystemId = builder.fileSystemId;
        this.fileSystems = builder.fileSystems;
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileSystemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bucketId
     */
    public String getBucketId() {
        return this.bucketId;
    }

    /**
     * @return fileCount
     */
    public Integer getFileCount() {
        return this.fileCount;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return fileSystems
     */
    public java.util.List<FileSystems> getFileSystems() {
        return this.fileSystems;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bucketId; 
        private Integer fileCount; 
        private String fileSystemId; 
        private java.util.List<FileSystems> fileSystems; 
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFileSystemsResponseBody model) {
            this.bucketId = model.bucketId;
            this.fileCount = model.fileCount;
            this.fileSystemId = model.fileSystemId;
            this.fileSystems = model.fileSystems;
            this.isTruncated = model.isTruncated;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>bucket-456</p>
         */
        public Builder bucketId(String bucketId) {
            this.bucketId = bucketId;
            return this;
        }

        /**
         * <p>The total number of files that meet the specified conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder fileCount(Integer fileCount) {
            this.fileCount = fileCount;
            return this;
        }

        /**
         * <p>The ID of the file system.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-123</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>The list of files.</p>
         */
        public Builder fileSystems(java.util.List<FileSystems> fileSystems) {
            this.fileSystems = fileSystems;
            return this;
        }

        /**
         * <p>Indicates whether the results are truncated. If the value is true, you can use NextToken to query subsequent results.</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The maximum number of records returned for this request.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>nextToken456</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFileSystemsResponseBody build() {
            return new DescribeFileSystemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFileSystemsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFileSystemsResponseBody</p>
     */
    public static class FileSystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private FileSystems(Builder builder) {
            this.capacity = builder.capacity;
            this.fileName = builder.fileName;
            this.lastModified = builder.lastModified;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FileSystems create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String capacity; 
            private String fileName; 
            private String lastModified; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(FileSystems model) {
                this.capacity = model.capacity;
                this.fileName = model.fileName;
                this.lastModified = model.lastModified;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The capacity of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>100GB</p>
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>test.txt</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The time when the file was last modified. The time is in the RFC 3339 UTC format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-03-25T09:37:10Z</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The storage type of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>SSD</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public FileSystems build() {
                return new FileSystems(this);
            } 

        } 

    }
}
