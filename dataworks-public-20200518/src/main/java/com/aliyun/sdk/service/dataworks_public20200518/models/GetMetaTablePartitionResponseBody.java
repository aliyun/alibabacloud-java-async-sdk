// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTablePartitionResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTablePartitionResponseBody</p>
 */
public class GetMetaTablePartitionResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
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
        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DataSize")
        private Long dataSize;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("PartitionGuid")
        private String partitionGuid;

        @NameInMap("PartitionLocation")
        private String partitionLocation;

        @NameInMap("PartitionName")
        private String partitionName;

        @NameInMap("PartitionPath")
        private String partitionPath;

        @NameInMap("PartitionType")
        private String partitionType;

        @NameInMap("RecordCount")
        private Long recordCount;

        @NameInMap("TableGuid")
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
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSize.
             */
            public Builder dataSize(Long dataSize) {
                this.dataSize = dataSize;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PartitionGuid.
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
             * PartitionName.
             */
            public Builder partitionName(String partitionName) {
                this.partitionName = partitionName;
                return this;
            }

            /**
             * PartitionPath.
             */
            public Builder partitionPath(String partitionPath) {
                this.partitionPath = partitionPath;
                return this;
            }

            /**
             * PartitionType.
             */
            public Builder partitionType(String partitionType) {
                this.partitionType = partitionType;
                return this;
            }

            /**
             * RecordCount.
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
        @NameInMap("DataEntityList")
        private java.util.List < DataEntityList> dataEntityList;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
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
             * DataEntityList.
             */
            public Builder dataEntityList(java.util.List < DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
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
             * TotalCount.
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
