// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetItemListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatasetItemListResponseBody</p>
 */
public class DescribeDatasetItemListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetItemInfoList")
    private java.util.List < DatasetItemInfoList> datasetItemInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDatasetItemListResponseBody(Builder builder) {
        this.datasetItemInfoList = builder.datasetItemInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatasetItemListResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetItemInfoList
     */
    public java.util.List < DatasetItemInfoList> getDatasetItemInfoList() {
        return this.datasetItemInfoList;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DatasetItemInfoList> datasetItemInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The Dataset information.
         */
        public Builder datasetItemInfoList(java.util.List < DatasetItemInfoList> datasetItemInfoList) {
            this.datasetItemInfoList = datasetItemInfoList;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatasetItemListResponseBody build() {
            return new DescribeDatasetItemListResponseBody(this);
        } 

    } 

    public static class DatasetItemInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetItemId")
        private String datasetItemId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private String expiredTime;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DatasetItemInfoList(Builder builder) {
            this.createdTime = builder.createdTime;
            this.datasetId = builder.datasetId;
            this.datasetItemId = builder.datasetItemId;
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.modifiedTime = builder.modifiedTime;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatasetItemInfoList create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return datasetItemId
         */
        public String getDatasetItemId() {
            return this.datasetItemId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredTime
         */
        public String getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String createdTime; 
            private String datasetId; 
            private String datasetItemId; 
            private String description; 
            private String expiredTime; 
            private String modifiedTime; 
            private String value; 

            /**
             * The time when the data entry was created.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The ID of the dataset.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * The ID of the data entry.
             */
            public Builder datasetItemId(String datasetItemId) {
                this.datasetItemId = datasetItemId;
                return this;
            }

            /**
             * The description of the data entry.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time in UTC when the data entry expires. The time is in the **yyyy-MM-ddTHH:mm:ssZ** format. If this parameter is empty, the data entry does not expire.
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The last modification time (UTC) of the data entry.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The value of the data entry.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DatasetItemInfoList build() {
                return new DatasetItemInfoList(this);
            } 

        } 

    }
}
