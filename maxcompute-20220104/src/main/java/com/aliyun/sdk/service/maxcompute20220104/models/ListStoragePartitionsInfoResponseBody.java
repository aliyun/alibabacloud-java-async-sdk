// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link ListStoragePartitionsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListStoragePartitionsInfoResponseBody</p>
 */
public class ListStoragePartitionsInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private ListStoragePartitionsInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStoragePartitionsInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListStoragePartitionsInfoResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OBJECT_NOT_EXIST</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This object does not exist.</p>
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>1xx: informational response. The request is received and is being processed.</li>
         * <li>2xx: success. The request is successfully received, understood, and accepted by the server.</li>
         * <li>3xx: redirection. The request is redirected, and further actions are required to complete the request.</li>
         * <li>4xx: client error. The request contains invalid request parameters and syntaxes, or specific request conditions cannot be met.</li>
         * <li>5xx: server error. The server cannot meet requirements due to other reasons.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0be3e0bd16661643917136451ebf55</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListStoragePartitionsInfoResponseBody build() {
            return new ListStoragePartitionsInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStoragePartitionsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListStoragePartitionsInfoResponseBody</p>
     */
    public static class StoragePartitionInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fileCount")
        private Long fileCount;

        @com.aliyun.core.annotation.NameInMap("fileSize")
        private Double fileSize;

        @com.aliyun.core.annotation.NameInMap("fileSizeUnit")
        private String fileSizeUnit;

        @com.aliyun.core.annotation.NameInMap("isPartitioned")
        private Boolean isPartitioned;

        @com.aliyun.core.annotation.NameInMap("lastAccessTime")
        private Long lastAccessTime;

        @com.aliyun.core.annotation.NameInMap("partition")
        private String partition;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Double rate;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("storageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("tableName")
        private String tableName;

        @com.aliyun.core.annotation.NameInMap("totalFrequency")
        private Long totalFrequency;

        @com.aliyun.core.annotation.NameInMap("totalInputAmount")
        private Double totalInputAmount;

        @com.aliyun.core.annotation.NameInMap("totalInputAmountUnit")
        private String totalInputAmountUnit;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private StoragePartitionInfoList(Builder builder) {
            this.fileCount = builder.fileCount;
            this.fileSize = builder.fileSize;
            this.fileSizeUnit = builder.fileSizeUnit;
            this.isPartitioned = builder.isPartitioned;
            this.lastAccessTime = builder.lastAccessTime;
            this.partition = builder.partition;
            this.projectName = builder.projectName;
            this.rate = builder.rate;
            this.schemaName = builder.schemaName;
            this.storageType = builder.storageType;
            this.tableName = builder.tableName;
            this.totalFrequency = builder.totalFrequency;
            this.totalInputAmount = builder.totalInputAmount;
            this.totalInputAmountUnit = builder.totalInputAmountUnit;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StoragePartitionInfoList create() {
            return builder().build();
        }

        /**
         * @return fileCount
         */
        public Long getFileCount() {
            return this.fileCount;
        }

        /**
         * @return fileSize
         */
        public Double getFileSize() {
            return this.fileSize;
        }

        /**
         * @return fileSizeUnit
         */
        public String getFileSizeUnit() {
            return this.fileSizeUnit;
        }

        /**
         * @return isPartitioned
         */
        public Boolean getIsPartitioned() {
            return this.isPartitioned;
        }

        /**
         * @return lastAccessTime
         */
        public Long getLastAccessTime() {
            return this.lastAccessTime;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        /**
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return totalFrequency
         */
        public Long getTotalFrequency() {
            return this.totalFrequency;
        }

        /**
         * @return totalInputAmount
         */
        public Double getTotalInputAmount() {
            return this.totalInputAmount;
        }

        /**
         * @return totalInputAmountUnit
         */
        public String getTotalInputAmountUnit() {
            return this.totalInputAmountUnit;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long fileCount; 
            private Double fileSize; 
            private String fileSizeUnit; 
            private Boolean isPartitioned; 
            private Long lastAccessTime; 
            private String partition; 
            private String projectName; 
            private Double rate; 
            private String schemaName; 
            private String storageType; 
            private String tableName; 
            private Long totalFrequency; 
            private Double totalInputAmount; 
            private String totalInputAmountUnit; 
            private String type; 

            private Builder() {
            } 

            private Builder(StoragePartitionInfoList model) {
                this.fileCount = model.fileCount;
                this.fileSize = model.fileSize;
                this.fileSizeUnit = model.fileSizeUnit;
                this.isPartitioned = model.isPartitioned;
                this.lastAccessTime = model.lastAccessTime;
                this.partition = model.partition;
                this.projectName = model.projectName;
                this.rate = model.rate;
                this.schemaName = model.schemaName;
                this.storageType = model.storageType;
                this.tableName = model.tableName;
                this.totalFrequency = model.totalFrequency;
                this.totalInputAmount = model.totalInputAmount;
                this.totalInputAmountUnit = model.totalInputAmountUnit;
                this.type = model.type;
            } 

            /**
             * <p>The number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * <p>The storage size.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder fileSize(Double fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * <p>The unit of the storage size.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder fileSizeUnit(String fileSizeUnit) {
                this.fileSizeUnit = fileSizeUnit;
                return this;
            }

            /**
             * <p>Indicates whether the table is a partitioned table. This operation returns the partition information. You do not need to take note of this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPartitioned(Boolean isPartitioned) {
                this.isPartitioned = isPartitioned;
                return this;
            }

            /**
             * <p>The time when the partition data was last accessed.</p>
             * <blockquote>
             * <p> The data collection method is upgraded from July 2023. If the data is not accessed after the upgrade or is accessed by using ALGO jobs or the direct read method of Hologres, the last access time cannot be collected.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1694589365</p>
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * <p>The partition name.</p>
             * 
             * <strong>example:</strong>
             * <p>ds=20241201</p>
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * <p>The project name.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The change rate of the total storage usage compared with that of the recent {$recentDays} days. No value is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1%</p>
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * <p>The schema name.</p>
             * 
             * <strong>example:</strong>
             * <p>schema</p>
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * <ul>
             * <li>standard</li>
             * <li>lowfrequency</li>
             * <li>longterm</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>standard</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The table name.</p>
             * 
             * <strong>example:</strong>
             * <p>bank_data</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * <p>The access frequency.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>Access behaviors include:</p>
             * </li>
             * <li><p>The table is used as the input table of an SQL task.</p>
             * </li>
             * <li><p>The table is downloaded by Tunnel.</p>
             * </li>
             * <li><p>The table is read by calling the Storage API. The partition granularity of the partitioned table is not available. Each time an access operation is performed, the access frequency is incremented by 1.</p>
             * </li>
             * <li><p>The data collection method is upgraded from July 2023. If the data is not accessed after the upgrade or is accessed by using ALGO jobs or the direct read method of Hologres, the access frequency cannot be collected.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalFrequency(Long totalFrequency) {
                this.totalFrequency = totalFrequency;
                return this;
            }

            /**
             * <p>The total amount of accessed data.</p>
             * <blockquote>
             * <p> The amount of data that is read by all access behaviors.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder totalInputAmount(Double totalInputAmount) {
                this.totalInputAmount = totalInputAmount;
                return this;
            }

            /**
             * <p>The unit of the total amount of accessed data.</p>
             * 
             * <strong>example:</strong>
             * <p>GB</p>
             */
            public Builder totalInputAmountUnit(String totalInputAmountUnit) {
                this.totalInputAmountUnit = totalInputAmountUnit;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>PARTITION</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StoragePartitionInfoList build() {
                return new StoragePartitionInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStoragePartitionsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListStoragePartitionsInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("storagePartitionInfoList")
        private java.util.List<StoragePartitionInfoList> storagePartitionInfoList;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.date = builder.date;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.storagePartitionInfoList = builder.storagePartitionInfoList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return storagePartitionInfoList
         */
        public java.util.List<StoragePartitionInfoList> getStoragePartitionInfoList() {
            return this.storagePartitionInfoList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String date; 
            private Long pageNumber; 
            private Long pageSize; 
            private java.util.List<StoragePartitionInfoList> storagePartitionInfoList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.date = model.date;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.storagePartitionInfoList = model.storagePartitionInfoList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The date on which the statistics are collected.</p>
             * 
             * <strong>example:</strong>
             * <p>20241205</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The partition storage information.</p>
             */
            public Builder storagePartitionInfoList(java.util.List<StoragePartitionInfoList> storagePartitionInfoList) {
                this.storagePartitionInfoList = storagePartitionInfoList;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>57</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
