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
 * {@link DescribeAIDBClusterDatasetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAIDBClusterDatasetsResponseBody</p>
 */
public class DescribeAIDBClusterDatasetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ContinuationToken")
    private String continuationToken;

    @com.aliyun.core.annotation.NameInMap("DataServiceId")
    private String dataServiceId;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("DatasetMode")
    private String datasetMode;

    @com.aliyun.core.annotation.NameInMap("DatasetType")
    private String datasetType;

    @com.aliyun.core.annotation.NameInMap("Datasets")
    private java.util.List<Datasets> datasets;

    @com.aliyun.core.annotation.NameInMap("FileCount")
    private String fileCount;

    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("NextContinuationToken")
    private String nextContinuationToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RelativeDBClusterId")
    private String relativeDBClusterId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalRecords")
    private String totalRecords;

    private DescribeAIDBClusterDatasetsResponseBody(Builder builder) {
        this.continuationToken = builder.continuationToken;
        this.dataServiceId = builder.dataServiceId;
        this.datasetId = builder.datasetId;
        this.datasetMode = builder.datasetMode;
        this.datasetType = builder.datasetType;
        this.datasets = builder.datasets;
        this.fileCount = builder.fileCount;
        this.isTruncated = builder.isTruncated;
        this.nextContinuationToken = builder.nextContinuationToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.relativeDBClusterId = builder.relativeDBClusterId;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalRecords = builder.totalRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAIDBClusterDatasetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return continuationToken
     */
    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * @return dataServiceId
     */
    public String getDataServiceId() {
        return this.dataServiceId;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return datasetMode
     */
    public String getDatasetMode() {
        return this.datasetMode;
    }

    /**
     * @return datasetType
     */
    public String getDatasetType() {
        return this.datasetType;
    }

    /**
     * @return datasets
     */
    public java.util.List<Datasets> getDatasets() {
        return this.datasets;
    }

    /**
     * @return fileCount
     */
    public String getFileCount() {
        return this.fileCount;
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return nextContinuationToken
     */
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return relativeDBClusterId
     */
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalRecords
     */
    public String getTotalRecords() {
        return this.totalRecords;
    }

    public static final class Builder {
        private String continuationToken; 
        private String dataServiceId; 
        private String datasetId; 
        private String datasetMode; 
        private String datasetType; 
        private java.util.List<Datasets> datasets; 
        private String fileCount; 
        private Boolean isTruncated; 
        private String nextContinuationToken; 
        private String pageNumber; 
        private String pageSize; 
        private String relativeDBClusterId; 
        private String requestId; 
        private String totalCount; 
        private String totalRecords; 

        private Builder() {
        } 

        private Builder(DescribeAIDBClusterDatasetsResponseBody model) {
            this.continuationToken = model.continuationToken;
            this.dataServiceId = model.dataServiceId;
            this.datasetId = model.datasetId;
            this.datasetMode = model.datasetMode;
            this.datasetType = model.datasetType;
            this.datasets = model.datasets;
            this.fileCount = model.fileCount;
            this.isTruncated = model.isTruncated;
            this.nextContinuationToken = model.nextContinuationToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.relativeDBClusterId = model.relativeDBClusterId;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalRecords = model.totalRecords;
        } 

        /**
         * ContinuationToken.
         */
        public Builder continuationToken(String continuationToken) {
            this.continuationToken = continuationToken;
            return this;
        }

        /**
         * DataServiceId.
         */
        public Builder dataServiceId(String dataServiceId) {
            this.dataServiceId = dataServiceId;
            return this;
        }

        /**
         * DatasetId.
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * DatasetMode.
         */
        public Builder datasetMode(String datasetMode) {
            this.datasetMode = datasetMode;
            return this;
        }

        /**
         * DatasetType.
         */
        public Builder datasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }

        /**
         * Datasets.
         */
        public Builder datasets(java.util.List<Datasets> datasets) {
            this.datasets = datasets;
            return this;
        }

        /**
         * FileCount.
         */
        public Builder fileCount(String fileCount) {
            this.fileCount = fileCount;
            return this;
        }

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * NextContinuationToken.
         */
        public Builder nextContinuationToken(String nextContinuationToken) {
            this.nextContinuationToken = nextContinuationToken;
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
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RelativeDBClusterId.
         */
        public Builder relativeDBClusterId(String relativeDBClusterId) {
            this.relativeDBClusterId = relativeDBClusterId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalRecords.
         */
        public Builder totalRecords(String totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        public DescribeAIDBClusterDatasetsResponseBody build() {
            return new DescribeAIDBClusterDatasetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAIDBClusterDatasetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAIDBClusterDatasetsResponseBody</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BucketName")
        private String bucketName;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetType")
        private String datasetType;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("LastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("TrainMode")
        private String trainMode;

        private Datasets(Builder builder) {
            this.bucketName = builder.bucketName;
            this.capacity = builder.capacity;
            this.creationTime = builder.creationTime;
            this.datasetId = builder.datasetId;
            this.datasetType = builder.datasetType;
            this.fileName = builder.fileName;
            this.lastModified = builder.lastModified;
            this.path = builder.path;
            this.storageType = builder.storageType;
            this.trainMode = builder.trainMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
            return builder().build();
        }

        /**
         * @return bucketName
         */
        public String getBucketName() {
            return this.bucketName;
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetType
         */
        public String getDatasetType() {
            return this.datasetType;
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
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return trainMode
         */
        public String getTrainMode() {
            return this.trainMode;
        }

        public static final class Builder {
            private String bucketName; 
            private String capacity; 
            private String creationTime; 
            private String datasetId; 
            private String datasetType; 
            private String fileName; 
            private String lastModified; 
            private String path; 
            private String storageType; 
            private String trainMode; 

            private Builder() {
            } 

            private Builder(Datasets model) {
                this.bucketName = model.bucketName;
                this.capacity = model.capacity;
                this.creationTime = model.creationTime;
                this.datasetId = model.datasetId;
                this.datasetType = model.datasetType;
                this.fileName = model.fileName;
                this.lastModified = model.lastModified;
                this.path = model.path;
                this.storageType = model.storageType;
                this.trainMode = model.trainMode;
            } 

            /**
             * BucketName.
             */
            public Builder bucketName(String bucketName) {
                this.bucketName = bucketName;
                return this;
            }

            /**
             * Capacity.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
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
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * DatasetType.
             */
            public Builder datasetType(String datasetType) {
                this.datasetType = datasetType;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * LastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * Path.
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * TrainMode.
             */
            public Builder trainMode(String trainMode) {
                this.trainMode = trainMode;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
}
