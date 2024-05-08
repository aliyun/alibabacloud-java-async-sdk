// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDatasetListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDatasetListResponseBody</p>
 */
public class DescribeDatasetListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetInfoList")
    private java.util.List < DatasetInfoList> datasetInfoList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * The returned dataset information. It is an array consisting of datasetinfo.
         */
        public Builder datasetInfoList(java.util.List < DatasetInfoList> datasetInfoList) {
            this.datasetInfoList = datasetInfoList;
            return this;
        }

        /**
         * The number of the page to return. Pages start from page 1. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
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

        public DescribeDatasetListResponseBody build() {
            return new DescribeDatasetListResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class DatasetInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("DatasetName")
        private String datasetName;

        @com.aliyun.core.annotation.NameInMap("DatasetType")
        private String datasetType;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        private DatasetInfoList(Builder builder) {
            this.createdTime = builder.createdTime;
            this.datasetId = builder.datasetId;
            this.datasetName = builder.datasetName;
            this.datasetType = builder.datasetType;
            this.modifiedTime = builder.modifiedTime;
            this.tags = builder.tags;
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

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createdTime; 
            private String datasetId; 
            private String datasetName; 
            private String datasetType; 
            private String modifiedTime; 
            private java.util.List < Tags> tags; 

            /**
             * The time when the dataset was created. The time is displayed in UTC.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The dataset ID.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * The dataset name.
             */
            public Builder datasetName(String datasetName) {
                this.datasetName = datasetName;
                return this;
            }

            /**
             * The dataset type. Valid values:
             * <p>
             * 
             * *   JWT_BLOCKING : a JSON Web Token (JWT) blacklist
             * *   IP_WHITELIST_CIDR : an IP address whitelist
             * *   PARAMETER_ACCESS: a list of parameters for parameter-based access control
             */
            public Builder datasetType(String datasetType) {
                this.datasetType = datasetType;
                return this;
            }

            /**
             * The time when the dataset was last modified. The time is displayed in UTC.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The tags of the dataset.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public DatasetInfoList build() {
                return new DatasetInfoList(this);
            } 

        } 

    }
}
