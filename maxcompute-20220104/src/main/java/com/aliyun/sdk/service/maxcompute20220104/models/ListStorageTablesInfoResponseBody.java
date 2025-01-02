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

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
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
             * longTermStorage.
             */
            public Builder longTermStorage(Double longTermStorage) {
                this.longTermStorage = longTermStorage;
                return this;
            }

            /**
             * longTermStorageFileCount.
             */
            public Builder longTermStorageFileCount(Long longTermStorageFileCount) {
                this.longTermStorageFileCount = longTermStorageFileCount;
                return this;
            }

            /**
             * longTermStorageUnit.
             */
            public Builder longTermStorageUnit(String longTermStorageUnit) {
                this.longTermStorageUnit = longTermStorageUnit;
                return this;
            }

            /**
             * lowFreqStorage.
             */
            public Builder lowFreqStorage(Double lowFreqStorage) {
                this.lowFreqStorage = lowFreqStorage;
                return this;
            }

            /**
             * lowFreqStorageFileCount.
             */
            public Builder lowFreqStorageFileCount(Long lowFreqStorageFileCount) {
                this.lowFreqStorageFileCount = lowFreqStorageFileCount;
                return this;
            }

            /**
             * lowFreqStorageUnit.
             */
            public Builder lowFreqStorageUnit(String lowFreqStorageUnit) {
                this.lowFreqStorageUnit = lowFreqStorageUnit;
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
             * standardStorage.
             */
            public Builder standardStorage(Double standardStorage) {
                this.standardStorage = standardStorage;
                return this;
            }

            /**
             * standardStorageFileCount.
             */
            public Builder standardStorageFileCount(Long standardStorageFileCount) {
                this.standardStorageFileCount = standardStorageFileCount;
                return this;
            }

            /**
             * standardStorageUnit.
             */
            public Builder standardStorageUnit(String standardStorageUnit) {
                this.standardStorageUnit = standardStorageUnit;
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
             * totalStorage.
             */
            public Builder totalStorage(Double totalStorage) {
                this.totalStorage = totalStorage;
                return this;
            }

            /**
             * totalStorageFileCount.
             */
            public Builder totalStorageFileCount(Long totalStorageFileCount) {
                this.totalStorageFileCount = totalStorageFileCount;
                return this;
            }

            /**
             * totalStorageUnit.
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
             * storageTableInfoList.
             */
            public Builder storageTableInfoList(java.util.List<StorageTableInfoList> storageTableInfoList) {
                this.storageTableInfoList = storageTableInfoList;
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
