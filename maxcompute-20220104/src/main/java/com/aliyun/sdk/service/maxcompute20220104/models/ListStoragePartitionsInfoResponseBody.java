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

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
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

            /**
             * fileCount.
             */
            public Builder fileCount(Long fileCount) {
                this.fileCount = fileCount;
                return this;
            }

            /**
             * fileSize.
             */
            public Builder fileSize(Double fileSize) {
                this.fileSize = fileSize;
                return this;
            }

            /**
             * fileSizeUnit.
             */
            public Builder fileSizeUnit(String fileSizeUnit) {
                this.fileSizeUnit = fileSizeUnit;
                return this;
            }

            /**
             * isPartitioned.
             */
            public Builder isPartitioned(Boolean isPartitioned) {
                this.isPartitioned = isPartitioned;
                return this;
            }

            /**
             * lastAccessTime.
             */
            public Builder lastAccessTime(Long lastAccessTime) {
                this.lastAccessTime = lastAccessTime;
                return this;
            }

            /**
             * partition.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * projectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * rate.
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            /**
             * schemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * storageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * tableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * totalFrequency.
             */
            public Builder totalFrequency(Long totalFrequency) {
                this.totalFrequency = totalFrequency;
                return this;
            }

            /**
             * totalInputAmount.
             */
            public Builder totalInputAmount(Double totalInputAmount) {
                this.totalInputAmount = totalInputAmount;
                return this;
            }

            /**
             * totalInputAmountUnit.
             */
            public Builder totalInputAmountUnit(String totalInputAmountUnit) {
                this.totalInputAmountUnit = totalInputAmountUnit;
                return this;
            }

            /**
             * type.
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

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * storagePartitionInfoList.
             */
            public Builder storagePartitionInfoList(java.util.List<StoragePartitionInfoList> storagePartitionInfoList) {
                this.storagePartitionInfoList = storagePartitionInfoList;
                return this;
            }

            /**
             * totalCount.
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
