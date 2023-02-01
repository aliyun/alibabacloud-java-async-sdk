// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatasetListResponseBody</p>
 */
public class DescribeDatasetListResponseBody extends TeaModel {
    @NameInMap("DatasetInfoList")
    private java.util.List < DatasetInfoList> datasetInfoList;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDatasetListResponseBody(Builder builder) {
        this.datasetInfoList = builder.datasetInfoList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDatasetListResponseBody create() {
        return builder().build();
    }

    /**
     * @return datasetInfoList
     */
    public java.util.List < DatasetInfoList> getDatasetInfoList() {
        return this.datasetInfoList;
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
        private java.util.List < DatasetInfoList> datasetInfoList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * DatasetInfoList.
         */
        public Builder datasetInfoList(java.util.List < DatasetInfoList> datasetInfoList) {
            this.datasetInfoList = datasetInfoList;
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
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDatasetListResponseBody build() {
            return new DescribeDatasetListResponseBody(this);
        } 

    } 

    public static class DatasetInfoList extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("DatasetName")
        private String datasetName;

        @NameInMap("DatasetType")
        private String datasetType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        private DatasetInfoList(Builder builder) {
            this.createdTime = builder.createdTime;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.datasetType = builder.datasetType;
            this.modifiedTime = builder.modifiedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatasetInfoList create() {
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
         * @return datasetName
         */
        public String getDatasetName() {
            return this.datasetName;
        }

        /**
         * @return datasetType
         */
        public String getDatasetType() {
            return this.datasetType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public static final class Builder {
            private String createdTime; 
            private String datasetId; 
            private String datasetName; 
            private String datasetType; 
            private String modifiedTime; 

            /**
             * The creation time (UTC) of the dataset.
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
             * The name of the dataset.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * The type of the dataset. Valid values:
             * <p>
             * 
             * *   JWT_BLOCKING: a JSON Web Token (JWT) blacklist
             * *   IP_WHITELIST_CIDR : an IP address whitelist
             * *   PARAMETER_ACCESS : parameter-based access control
             */
            public Builder datasetType(String datasetType) {
                this.datasetType = datasetType;
                return this;
            }

            /**
             * The last modification time (UTC) of the dataset.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            public DatasetInfoList build() {
                return new DatasetInfoList(this);
            } 

        } 

    }
}
