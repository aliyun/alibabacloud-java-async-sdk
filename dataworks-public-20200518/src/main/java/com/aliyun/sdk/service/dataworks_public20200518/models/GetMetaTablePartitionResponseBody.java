// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTablePartitionResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTablePartitionResponseBody</p>
 */
public class GetMetaTablePartitionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMetaTablePartitionResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTablePartitionResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * The number of entries returned per page. Default value: 10. Maximum value: 100.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The business data returned.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTablePartitionResponseBody build() {
            return new GetMetaTablePartitionResponseBody(this);
        } 

    } 

    public static class DataEntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSize")
        private Long dataSize;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("PartitionGuid")
        private String partitionGuid;

        @com.aliyun.core.annotation.NameInMap("PartitionLocation")
        private String partitionLocation;

        @com.aliyun.core.annotation.NameInMap("PartitionName")
        private String partitionName;

        @com.aliyun.core.annotation.NameInMap("PartitionPath")
        private String partitionPath;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        @com.aliyun.core.annotation.NameInMap("RecordCount")
        private Long recordCount;

        @com.aliyun.core.annotation.NameInMap("TableGuid")
        private String tableGuid;

        private DataEntityList(Builder builder) {
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.dataSize = builder.dataSize;
            this.modifiedTime = builder.modifiedTime;
            this.partitionGuid = builder.partitionGuid;
            this.partitionLocation = builder.partitionLocation;
            this.partitionName = builder.partitionName;
            this.partitionPath = builder.partitionPath;
            this.partitionType = builder.partitionType;
            this.recordCount = builder.recordCount;
            this.tableGuid = builder.tableGuid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEntityList create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSize
         */
        public Long getDataSize() {
            return this.dataSize;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return partitionGuid
         */
        public String getPartitionGuid() {
            return this.partitionGuid;
        }

        /**
         * @return partitionLocation
         */
        public String getPartitionLocation() {
            return this.partitionLocation;
        }

        /**
         * @return partitionName
         */
        public String getPartitionName() {
            return this.partitionName;
        }

        /**
         * @return partitionPath
         */
        public String getPartitionPath() {
            return this.partitionPath;
        }

        /**
         * @return partitionType
         */
        public String getPartitionType() {
            return this.partitionType;
        }

        /**
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return tableGuid
         */
        public String getTableGuid() {
            return this.tableGuid;
        }

        public static final class Builder {
            private String comment; 
            private Long createTime; 
            private Long dataSize; 
            private Long modifiedTime; 
            private String partitionGuid; 
            private String partitionLocation; 
            private String partitionName; 
            private String partitionPath; 
            private String partitionType; 
            private Long recordCount; 
            private String tableGuid; 

            /**
             * The time when the partition was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The type of the partition.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The comment.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * The number of entries in the partition.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The GUID of the metatable.
             */
            public Builder partitionGuid(String partitionGuid) {
                this.partitionGuid = partitionGuid;
                return this;
            }

            /**
             * PartitionLocation.
             */
            public Builder partitionLocation(String partitionLocation) {
                this.partitionLocation = partitionLocation;
                return this;
            }

            /**
             * The time when the partition was modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since the epoch time January 1, 1970, 00:00:00 UTC.
             */
            public Builder partitionName(String partitionName) {
                this.partitionName = partitionName;
                return this;
            }

            /**
             * The name of the partition.
             */
            public Builder partitionPath(String partitionPath) {
                this.partitionPath = partitionPath;
                return this;
            }

            /**
             * The location of the Hive partition.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * The GUID of the partition.
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * TableGuid.
             */
            public Builder tableGuid(String tableGuid) {
                this.tableGuid = tableGuid;
                return this;
            }

            public DataEntityList build() {
                return new DataEntityList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataEntityList")
        private java.util.List < DataEntityList> dataEntityList;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.dataEntityList = builder.dataEntityList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dataEntityList
         */
        public java.util.List < DataEntityList> getDataEntityList() {
            return this.dataEntityList;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < DataEntityList> dataEntityList; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The size of the partition. Unit: bytes.
             */
            public Builder dataEntityList(java.util.List < DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
                return this;
            }

            /**
             * The total number of partitions.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The list of partitions.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The path of the partition.
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
