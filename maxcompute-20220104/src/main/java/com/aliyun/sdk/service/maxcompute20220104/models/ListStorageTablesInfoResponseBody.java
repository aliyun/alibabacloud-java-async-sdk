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
 * {@link ListStorageTablesInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListStorageTablesInfoResponseBody</p>
 */
public class ListStorageTablesInfoResponseBody extends TeaModel {
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

    private ListStorageTablesInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStorageTablesInfoResponseBody create() {
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

        private Builder(ListStorageTablesInfoResponseBody model) {
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
         * <p>0bc12e6a16679892465424670db3eb</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListStorageTablesInfoResponseBody build() {
            return new ListStorageTablesInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStorageTablesInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListStorageTablesInfoResponseBody</p>
     */
    public static class StorageTableInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("isPartitioned")
        private Boolean isPartitioned;

        @com.aliyun.core.annotation.NameInMap("lastAccessTime")
        private Long lastAccessTime;

        @com.aliyun.core.annotation.NameInMap("longTermStorage")
        private Double longTermStorage;

        @com.aliyun.core.annotation.NameInMap("longTermStorageFileCount")
        private Long longTermStorageFileCount;

        @com.aliyun.core.annotation.NameInMap("longTermStorageUnit")
        private String longTermStorageUnit;

        @com.aliyun.core.annotation.NameInMap("lowFreqStorage")
        private Double lowFreqStorage;

        @com.aliyun.core.annotation.NameInMap("lowFreqStorageFileCount")
        private Long lowFreqStorageFileCount;

        @com.aliyun.core.annotation.NameInMap("lowFreqStorageUnit")
        private String lowFreqStorageUnit;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Double rate;

        @com.aliyun.core.annotation.NameInMap("schemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("standardStorage")
        private Double standardStorage;

        @com.aliyun.core.annotation.NameInMap("standardStorageFileCount")
        private Long standardStorageFileCount;

        @com.aliyun.core.annotation.NameInMap("standardStorageUnit")
        private String standardStorageUnit;

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

        @com.aliyun.core.annotation.NameInMap("totalStorage")
        private Double totalStorage;

        @com.aliyun.core.annotation.NameInMap("totalStorageFileCount")
        private Long totalStorageFileCount;

        @com.aliyun.core.annotation.NameInMap("totalStorageUnit")
        private String totalStorageUnit;

        private StorageTableInfoList(Builder builder) {
            this.date = builder.date;
            this.isPartitioned = builder.isPartitioned;
            this.lastAccessTime = builder.lastAccessTime;
            this.longTermStorage = builder.longTermStorage;
            this.longTermStorageFileCount = builder.longTermStorageFileCount;
            this.longTermStorageUnit = builder.longTermStorageUnit;
            this.lowFreqStorage = builder.lowFreqStorage;
            this.lowFreqStorageFileCount = builder.lowFreqStorageFileCount;
            this.lowFreqStorageUnit = builder.lowFreqStorageUnit;
            this.projectName = builder.projectName;
            this.rate = builder.rate;
            this.schemaName = builder.schemaName;
            this.standardStorage = builder.standardStorage;
            this.standardStorageFileCount = builder.standardStorageFileCount;
            this.standardStorageUnit = builder.standardStorageUnit;
            this.storageType = builder.storageType;
            this.tableName = builder.tableName;
            this.totalFrequency = builder.totalFrequency;
            this.totalInputAmount = builder.totalInputAmount;
            this.totalInputAmountUnit = builder.totalInputAmountUnit;
            this.totalStorage = builder.totalStorage;
            this.totalStorageFileCount = builder.totalStorageFileCount;
            this.totalStorageUnit = builder.totalStorageUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageTableInfoList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
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
         * @return longTermStorage
         */
        public Double getLongTermStorage() {
            return this.longTermStorage;
        }

        /**
         * @return longTermStorageFileCount
         */
        public Long getLongTermStorageFileCount() {
            return this.longTermStorageFileCount;
        }

        /**
         * @return longTermStorageUnit
         */
        public String getLongTermStorageUnit() {
            return this.longTermStorageUnit;
        }

        /**
         * @return lowFreqStorage
         */
        public Double getLowFreqStorage() {
            return this.lowFreqStorage;
        }

        /**
         * @return lowFreqStorageFileCount
         */
        public Long getLowFreqStorageFileCount() {
            return this.lowFreqStorageFileCount;
        }

        /**
         * @return lowFreqStorageUnit
         */
        public String getLowFreqStorageUnit() {
            return this.lowFreqStorageUnit;
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
         * @return standardStorage
         */
        public Double getStandardStorage() {
            return this.standardStorage;
        }

        /**
         * @return standardStorageFileCount
         */
        public Long getStandardStorageFileCount() {
            return this.standardStorageFileCount;
        }

        /**
         * @return standardStorageUnit
         */
        public String getStandardStorageUnit() {
            return this.standardStorageUnit;
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
         * @return totalStorage
         */
        public Double getTotalStorage() {
            return this.totalStorage;
        }

        /**
         * @return totalStorageFileCount
         */
        public Long getTotalStorageFileCount() {
            return this.totalStorageFileCount;
        }

        /**
         * @return totalStorageUnit
         */
        public String getTotalStorageUnit() {
            return this.totalStorageUnit;
        }

        public static final class Builder {
            private String date; 
            private Boolean isPartitioned; 
            private Long lastAccessTime; 
            private Double longTermStorage; 
            private Long longTermStorageFileCount; 
            private String longTermStorageUnit; 
            private Double lowFreqStorage; 
            private Long lowFreqStorageFileCount; 
            private String lowFreqStorageUnit; 
            private String projectName; 
            private Double rate; 
            private String schemaName; 
            private Double standardStorage; 
            private Long standardStorageFileCount; 
            private String standardStorageUnit; 
            private String storageType; 
            private String tableName; 
            private Long totalFrequency; 
            private Double totalInputAmount; 
            private String totalInputAmountUnit; 
            private Double totalStorage; 
            private Long totalStorageFileCount; 
            private String totalStorageUnit; 

            private Builder() {
            } 

            private Builder(StorageTableInfoList model) {
                this.date = model.date;
                this.isPartitioned = model.isPartitioned;
                this.lastAccessTime = model.lastAccessTime;
                this.longTermStorage = model.longTermStorage;
                this.longTermStorageFileCount = model.longTermStorageFileCount;
                this.longTermStorageUnit = model.longTermStorageUnit;
                this.lowFreqStorage = model.lowFreqStorage;
                this.lowFreqStorageFileCount = model.lowFreqStorageFileCount;
                this.lowFreqStorageUnit = model.lowFreqStorageUnit;
                this.projectName = model.projectName;
                this.rate = model.rate;
                this.schemaName = model.schemaName;
                this.standardStorage = model.standardStorage;
                this.standardStorageFileCount = model.standardStorageFileCount;
                this.standardStorageUnit = model.standardStorageUnit;
                this.storageType = model.storageType;
                this.tableName = model.tableName;
                this.totalFrequency = model.totalFrequency;
                this.totalInputAmount = model.totalInputAmount;
                this.totalInputAmountUnit = model.totalInputAmountUnit;
                this.totalStorage = model.totalStorage;
                this.totalStorageFileCount = model.totalStorageFileCount;
                this.totalStorageUnit = model.totalStorageUnit;
            } 

            /**
             * <p>The date on which the statistics are collected. This value is not returned.</p>
             * 
             * <strong>example:</strong>
             * <p>20241205</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>Indicates whether the table is a partitioned table.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isPartitioned(Boolean isPartitioned) {
                this.isPartitioned = isPartitioned;
                return this;
            }

            /**
             * <p>The time when the table was last accessed. This value is returned when the table is a non-partitioned table.</p>
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
             * <p>The storage usage at the long-term storage tier.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder longTermStorage(Double longTermStorage) {
                this.longTermStorage = longTermStorage;
                return this;
            }

            /**
             * <p>The number of long-term storage files.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder longTermStorageFileCount(Long longTermStorageFileCount) {
                this.longTermStorageFileCount = longTermStorageFileCount;
                return this;
            }

            /**
             * <p>The unit of the storage usage at the long-term storage tier.</p>
             * 
             * <strong>example:</strong>
             * <p>B</p>
             */
            public Builder longTermStorageUnit(String longTermStorageUnit) {
                this.longTermStorageUnit = longTermStorageUnit;
                return this;
            }

            /**
             * <p>The storage usage at the low-frequency tier.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowFreqStorage(Double lowFreqStorage) {
                this.lowFreqStorage = lowFreqStorage;
                return this;
            }

            /**
             * <p>The number of low-frequency storage files.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder lowFreqStorageFileCount(Long lowFreqStorageFileCount) {
                this.lowFreqStorageFileCount = lowFreqStorageFileCount;
                return this;
            }

            /**
             * <p>The unit of the storage usage at the low-frequency storage tier.</p>
             * 
             * <strong>example:</strong>
             * <p>B</p>
             */
            public Builder lowFreqStorageUnit(String lowFreqStorageUnit) {
                this.lowFreqStorageUnit = lowFreqStorageUnit;
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
             * <p>The change rate of the total storage usage compared with that of the recent {$recentDays} days.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
             * <p>The storage usage at the standard storage tier.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder standardStorage(Double standardStorage) {
                this.standardStorage = standardStorage;
                return this;
            }

            /**
             * <p>The number of standard storage files.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder standardStorageFileCount(Long standardStorageFileCount) {
                this.standardStorageFileCount = standardStorageFileCount;
                return this;
            }

            /**
             * <p>The unit of the storage usage at the standard storage tier.</p>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder standardStorageUnit(String standardStorageUnit) {
                this.standardStorageUnit = standardStorageUnit;
                return this;
            }

            /**
             * <p>The table storage type.</p>
             * <ul>
             * <li>standard</li>
             * <li>lowfrequency</li>
             * <li>longterm</li>
             * <li>unknown: This value is returned when the table is a partitioned table. You can call the ListStoragePartitionsInfo operation to query the storage type of each partition.</li>
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
             * <p>The total storage usage. For a partitioned table, this parameter indicates the sum of the storage usage of all partitions. If the storage types of partitions are different, the value is the sum of the storage usage of each storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>600</p>
             */
            public Builder totalStorage(Double totalStorage) {
                this.totalStorage = totalStorage;
                return this;
            }

            /**
             * <p>The total number of files.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalStorageFileCount(Long totalStorageFileCount) {
                this.totalStorageFileCount = totalStorageFileCount;
                return this;
            }

            /**
             * <p>The unit of storage usage.</p>
             * 
             * <strong>example:</strong>
             * <p>KB</p>
             */
            public Builder totalStorageUnit(String totalStorageUnit) {
                this.totalStorageUnit = totalStorageUnit;
                return this;
            }

            public StorageTableInfoList build() {
                return new StorageTableInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStorageTablesInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListStorageTablesInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("storageTableInfoList")
        private java.util.List<StorageTableInfoList> storageTableInfoList;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.date = builder.date;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.storageTableInfoList = builder.storageTableInfoList;
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
         * @return storageTableInfoList
         */
        public java.util.List<StorageTableInfoList> getStorageTableInfoList() {
            return this.storageTableInfoList;
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
            private java.util.List<StorageTableInfoList> storageTableInfoList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.date = model.date;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.storageTableInfoList = model.storageTableInfoList;
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
             * <p>The table storage information.</p>
             */
            public Builder storageTableInfoList(java.util.List<StorageTableInfoList> storageTableInfoList) {
                this.storageTableInfoList = storageTableInfoList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
