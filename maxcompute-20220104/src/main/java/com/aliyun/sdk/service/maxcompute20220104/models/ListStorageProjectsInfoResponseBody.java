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
 * {@link ListStorageProjectsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>ListStorageProjectsInfoResponseBody</p>
 */
public class ListStorageProjectsInfoResponseBody extends TeaModel {
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

    private ListStorageProjectsInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStorageProjectsInfoResponseBody create() {
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

        private Builder(ListStorageProjectsInfoResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMsg = model.errorMsg;
            this.httpCode = model.httpCode;
            this.requestId = model.requestId;
        } 

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

        public ListStorageProjectsInfoResponseBody build() {
            return new ListStorageProjectsInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStorageProjectsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListStorageProjectsInfoResponseBody</p>
     */
    public static class StorageProjectInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("longTermStorage")
        private Double longTermStorage;

        @com.aliyun.core.annotation.NameInMap("longTermStorageUnit")
        private String longTermStorageUnit;

        @com.aliyun.core.annotation.NameInMap("lowFreqStorage")
        private Double lowFreqStorage;

        @com.aliyun.core.annotation.NameInMap("lowFreqStorageUnit")
        private String lowFreqStorageUnit;

        @com.aliyun.core.annotation.NameInMap("projectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Double rate;

        @com.aliyun.core.annotation.NameInMap("recycleBinStorage")
        private Double recycleBinStorage;

        @com.aliyun.core.annotation.NameInMap("recycleBinStorageUnit")
        private String recycleBinStorageUnit;

        @com.aliyun.core.annotation.NameInMap("standardStorage")
        private Double standardStorage;

        @com.aliyun.core.annotation.NameInMap("standardStorageUnit")
        private String standardStorageUnit;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("totalStorage")
        private Double totalStorage;

        @com.aliyun.core.annotation.NameInMap("totalStorageUnit")
        private String totalStorageUnit;

        private StorageProjectInfoList(Builder builder) {
            this.date = builder.date;
            this.longTermStorage = builder.longTermStorage;
            this.longTermStorageUnit = builder.longTermStorageUnit;
            this.lowFreqStorage = builder.lowFreqStorage;
            this.lowFreqStorageUnit = builder.lowFreqStorageUnit;
            this.projectName = builder.projectName;
            this.rate = builder.rate;
            this.recycleBinStorage = builder.recycleBinStorage;
            this.recycleBinStorageUnit = builder.recycleBinStorageUnit;
            this.standardStorage = builder.standardStorage;
            this.standardStorageUnit = builder.standardStorageUnit;
            this.timestamp = builder.timestamp;
            this.totalStorage = builder.totalStorage;
            this.totalStorageUnit = builder.totalStorageUnit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageProjectInfoList create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return longTermStorage
         */
        public Double getLongTermStorage() {
            return this.longTermStorage;
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
         * @return recycleBinStorage
         */
        public Double getRecycleBinStorage() {
            return this.recycleBinStorage;
        }

        /**
         * @return recycleBinStorageUnit
         */
        public String getRecycleBinStorageUnit() {
            return this.recycleBinStorageUnit;
        }

        /**
         * @return standardStorage
         */
        public Double getStandardStorage() {
            return this.standardStorage;
        }

        /**
         * @return standardStorageUnit
         */
        public String getStandardStorageUnit() {
            return this.standardStorageUnit;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalStorage
         */
        public Double getTotalStorage() {
            return this.totalStorage;
        }

        /**
         * @return totalStorageUnit
         */
        public String getTotalStorageUnit() {
            return this.totalStorageUnit;
        }

        public static final class Builder {
            private String date; 
            private Double longTermStorage; 
            private String longTermStorageUnit; 
            private Double lowFreqStorage; 
            private String lowFreqStorageUnit; 
            private String projectName; 
            private Double rate; 
            private Double recycleBinStorage; 
            private String recycleBinStorageUnit; 
            private Double standardStorage; 
            private String standardStorageUnit; 
            private Long timestamp; 
            private Double totalStorage; 
            private String totalStorageUnit; 

            private Builder() {
            } 

            private Builder(StorageProjectInfoList model) {
                this.date = model.date;
                this.longTermStorage = model.longTermStorage;
                this.longTermStorageUnit = model.longTermStorageUnit;
                this.lowFreqStorage = model.lowFreqStorage;
                this.lowFreqStorageUnit = model.lowFreqStorageUnit;
                this.projectName = model.projectName;
                this.rate = model.rate;
                this.recycleBinStorage = model.recycleBinStorage;
                this.recycleBinStorageUnit = model.recycleBinStorageUnit;
                this.standardStorage = model.standardStorage;
                this.standardStorageUnit = model.standardStorageUnit;
                this.timestamp = model.timestamp;
                this.totalStorage = model.totalStorage;
                this.totalStorageUnit = model.totalStorageUnit;
            } 

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
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
             * recycleBinStorage.
             */
            public Builder recycleBinStorage(Double recycleBinStorage) {
                this.recycleBinStorage = recycleBinStorage;
                return this;
            }

            /**
             * recycleBinStorageUnit.
             */
            public Builder recycleBinStorageUnit(String recycleBinStorageUnit) {
                this.recycleBinStorageUnit = recycleBinStorageUnit;
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
             * standardStorageUnit.
             */
            public Builder standardStorageUnit(String standardStorageUnit) {
                this.standardStorageUnit = standardStorageUnit;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
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
             * totalStorageUnit.
             */
            public Builder totalStorageUnit(String totalStorageUnit) {
                this.totalStorageUnit = totalStorageUnit;
                return this;
            }

            public StorageProjectInfoList build() {
                return new StorageProjectInfoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListStorageProjectsInfoResponseBody} extends {@link TeaModel}
     *
     * <p>ListStorageProjectsInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("storageProjectInfoList")
        private java.util.List<StorageProjectInfoList> storageProjectInfoList;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.date = builder.date;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.storageProjectInfoList = builder.storageProjectInfoList;
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
         * @return storageProjectInfoList
         */
        public java.util.List<StorageProjectInfoList> getStorageProjectInfoList() {
            return this.storageProjectInfoList;
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
            private java.util.List<StorageProjectInfoList> storageProjectInfoList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.date = model.date;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.storageProjectInfoList = model.storageProjectInfoList;
                this.totalCount = model.totalCount;
            } 

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
             * storageProjectInfoList.
             */
            public Builder storageProjectInfoList(java.util.List<StorageProjectInfoList> storageProjectInfoList) {
                this.storageProjectInfoList = storageProjectInfoList;
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
