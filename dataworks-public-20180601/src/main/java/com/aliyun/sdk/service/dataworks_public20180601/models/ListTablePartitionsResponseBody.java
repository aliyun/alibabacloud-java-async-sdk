// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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
 * {@link ListTablePartitionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTablePartitionsResponseBody</p>
 */
public class ListTablePartitionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListTablePartitionsResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTablePartitionsResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListTablePartitionsResponseBody build() {
            return new ListTablePartitionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTablePartitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablePartitionsResponseBody</p>
     */
    public static class PagedData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("PartitionComment")
        private String partitionComment;

        @com.aliyun.core.annotation.NameInMap("PartitionName")
        private String partitionName;

        @com.aliyun.core.annotation.NameInMap("PartitionPath")
        private String partitionPath;

        @com.aliyun.core.annotation.NameInMap("PartitionType")
        private String partitionType;

        private PagedData(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.location = builder.location;
            this.partitionComment = builder.partitionComment;
            this.partitionName = builder.partitionName;
            this.partitionPath = builder.partitionPath;
            this.partitionType = builder.partitionType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagedData create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return partitionComment
         */
        public String getPartitionComment() {
            return this.partitionComment;
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

        public static final class Builder {
            private Long gmtCreate; 
            private Long gmtModified; 
            private String location; 
            private String partitionComment; 
            private String partitionName; 
            private String partitionPath; 
            private String partitionType; 

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * PartitionComment.
             */
            public Builder partitionComment(String partitionComment) {
                this.partitionComment = partitionComment;
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

            public PagedData build() {
                return new PagedData(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTablePartitionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTablePartitionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("PagedData")
        private java.util.List<PagedData> pagedData;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.pageSize = builder.pageSize;
            this.pagedData = builder.pagedData;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return pagedData
         */
        public java.util.List<PagedData> getPagedData() {
            return this.pagedData;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageSize; 
            private java.util.List<PagedData> pagedData; 
            private Integer totalCount; 

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * PagedData.
             */
            public Builder pagedData(java.util.List<PagedData> pagedData) {
                this.pagedData = pagedData;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
