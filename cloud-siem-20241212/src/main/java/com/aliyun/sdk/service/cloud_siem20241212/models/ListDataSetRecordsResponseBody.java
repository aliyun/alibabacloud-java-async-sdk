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
         * DataSetRecords.
         */
        public Builder dataSetRecords(java.util.List<DataSetRecords> dataSetRecords) {
            this.dataSetRecords = dataSetRecords;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSetId.
             */
            public Builder dataSetId(String dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * DataSetName.
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * DataSetRecordId.
             */
            public Builder dataSetRecordId(String dataSetRecordId) {
                this.dataSetRecordId = dataSetRecordId;
                return this;
            }

            /**
             * DataSetRecordValues.
             */
            public Builder dataSetRecordValues(String dataSetRecordValues) {
                this.dataSetRecordValues = dataSetRecordValues;
                return this;
            }

            /**
             * UpdateTime.
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
