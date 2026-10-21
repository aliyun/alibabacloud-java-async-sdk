// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListDataSetRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSetRecordsResponseBody</p>
 */
public class ListDataSetRecordsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSetRecords")
    private java.util.List<DataSetRecords> dataSetRecords;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDataSetRecordsResponseBody(Builder builder) {
        this.dataSetRecords = builder.dataSetRecords;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSetRecordsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSetRecords
     */
    public java.util.List<DataSetRecords> getDataSetRecords() {
        return this.dataSetRecords;
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
        private java.util.List<DataSetRecords> dataSetRecords; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDataSetRecordsResponseBody model) {
            this.dataSetRecords = model.dataSetRecords;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of dataset records.</p>
         */
        public Builder dataSetRecords(java.util.List<DataSetRecords> dataSetRecords) {
            this.dataSetRecords = dataSetRecords;
            return this;
        }

        /**
         * <p>The maximum number of results to return per query when you use the NextToken parameter. Valid values: 1 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to start the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page.</p>
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
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>57</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataSetRecordsResponseBody build() {
            return new ListDataSetRecordsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSetRecordsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSetRecordsResponseBody</p>
     */
    public static class DataSetRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSetId")
        private String dataSetId;

        @com.aliyun.core.annotation.NameInMap("DataSetName")
        private String dataSetName;

        @com.aliyun.core.annotation.NameInMap("DataSetRecordId")
        private String dataSetRecordId;

        @com.aliyun.core.annotation.NameInMap("DataSetRecordValues")
        private String dataSetRecordValues;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataSetRecords(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSetId = builder.dataSetId;
            this.dataSetName = builder.dataSetName;
            this.dataSetRecordId = builder.dataSetRecordId;
            this.dataSetRecordValues = builder.dataSetRecordValues;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSetRecords create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSetId
         */
        public String getDataSetId() {
            return this.dataSetId;
        }

        /**
         * @return dataSetName
         */
        public String getDataSetName() {
            return this.dataSetName;
        }

        /**
         * @return dataSetRecordId
         */
        public String getDataSetRecordId() {
            return this.dataSetRecordId;
        }

        /**
         * @return dataSetRecordValues
         */
        public String getDataSetRecordValues() {
            return this.dataSetRecordValues;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String dataSetId; 
            private String dataSetName; 
            private String dataSetRecordId; 
            private String dataSetRecordValues; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataSetRecords model) {
                this.createTime = model.createTime;
                this.dataSetId = model.dataSetId;
                this.dataSetName = model.dataSetName;
                this.dataSetRecordId = model.dataSetRecordId;
                this.dataSetRecordValues = model.dataSetRecordValues;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The creation time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1658974643000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>dataset-t8ha6p7k61rmniqw****</p>
             */
            public Builder dataSetId(String dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * <p>The name of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>lmftest</p>
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * <p>The ID of the dataset record.</p>
             * 
             * <strong>example:</strong>
             * <p>124566</p>
             */
            public Builder dataSetRecordId(String dataSetRecordId) {
                this.dataSetRecordId = dataSetRecordId;
                return this;
            }

            /**
             * <p>The values of the dataset record.</p>
             */
            public Builder dataSetRecordValues(String dataSetRecordValues) {
                this.dataSetRecordValues = dataSetRecordValues;
                return this;
            }

            /**
             * <p>The update time. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1658974643000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataSetRecords build() {
                return new DataSetRecords(this);
            } 

        } 

    }
}
