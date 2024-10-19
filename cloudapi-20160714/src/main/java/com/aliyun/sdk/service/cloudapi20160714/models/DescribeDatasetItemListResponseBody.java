// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The Dataset information.</p>
         */
        public Builder datasetItemInfoList(java.util.List < DatasetItemInfoList> datasetItemInfoList) {
            this.datasetItemInfoList = datasetItemInfoList;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C6E9C6E4-608B-5C0F-9783-E288********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatasetItemListResponseBody build() {
            return new DescribeDatasetItemListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDatasetItemListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDatasetItemListResponseBody</p>
     */
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
             * <p>The time when the data entry was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-21T12:58:43Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The ID of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>4add6a61804e47858266883e********</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The ID of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>5045****</p>
             */
            public Builder datasetItemId(String datasetItemId) {
                this.datasetItemId = datasetItemId;
                return this;
            }

            /**
             * <p>The description of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time in UTC when the data entry expires. The time is in the <strong>yyyy-MM-ddTHH:mm:ssZ</strong> format. If this parameter is empty, the data entry does not expire.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-22T12:00:00Z</p>
             */
            public Builder expiredTime(String expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The last modification time (UTC) of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-09-21T12:58:43Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The value of the data entry.</p>
             * 
             * <strong>example:</strong>
             * <p>106.43.XXX.XXX</p>
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
