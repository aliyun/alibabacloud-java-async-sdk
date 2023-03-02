// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaTableChangeLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaTableChangeLogResponseBody</p>
 */
public class GetMetaTableChangeLogResponseBody extends TeaModel {
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

    private GetMetaTableChangeLogResponseBody(Builder builder) {
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

    public static GetMetaTableChangeLogResponseBody create() {
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
         * The business data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaTableChangeLogResponseBody build() {
            return new GetMetaTableChangeLogResponseBody(this);
        } 

    } 

    public static class DataEntityList extends TeaModel {
        @NameInMap("ChangeContent")
        private String changeContent;

        @NameInMap("ChangeType")
        private String changeType;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("ObjectType")
        private String objectType;

        @NameInMap("Operator")
        private String operator;

        private DataEntityList(Builder builder) {
            this.changeContent = builder.changeContent;
            this.changeType = builder.changeType;
            this.createTime = builder.createTime;
            this.modifiedTime = builder.modifiedTime;
            this.objectType = builder.objectType;
            this.operator = builder.operator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEntityList create() {
            return builder().build();
        }

        /**
         * @return changeContent
         */
        public String getChangeContent() {
            return this.changeContent;
        }

        /**
         * @return changeType
         */
        public String getChangeType() {
            return this.changeType;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        public static final class Builder {
            private String changeContent; 
            private String changeType; 
            private Long createTime; 
            private Long modifiedTime; 
            private String objectType; 
            private String operator; 

            /**
             * The content of the change.
             */
            public Builder changeContent(String changeContent) {
                this.changeContent = changeContent;
                return this;
            }

            /**
             * The type of the change.
             */
            public Builder changeType(String changeType) {
                this.changeType = changeType;
                return this;
            }

            /**
             * The time when the metatable was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The last time when the metatable was modified.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The entity on which the change was made. Valid values: TABLE and PARTITION.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * The name of the operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
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
             * The information about the change logs of the metatable.
             */
            public Builder dataEntityList(java.util.List < DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
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
             * The number of entries returned per page. Default value: 10. Maximum value: 100.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
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
