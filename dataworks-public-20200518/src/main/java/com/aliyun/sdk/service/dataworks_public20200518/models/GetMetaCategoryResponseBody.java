// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMetaCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaCategoryResponseBody</p>
 */
public class GetMetaCategoryResponseBody extends TeaModel {
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

    private GetMetaCategoryResponseBody(Builder builder) {
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

    public static GetMetaCategoryResponseBody create() {
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
         * The returned result.
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
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaCategoryResponseBody build() {
            return new GetMetaCategoryResponseBody(this);
        } 

    } 

    public static class DataEntityList extends TeaModel {
        @NameInMap("CategoryId")
        private Long categoryId;

        @NameInMap("Comment")
        private String comment;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Depth")
        private Integer depth;

        @NameInMap("LastOperatorId")
        private String lastOperatorId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("ParentCategoryId")
        private Long parentCategoryId;

        private DataEntityList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.comment = builder.comment;
            this.createTime = builder.createTime;
            this.depth = builder.depth;
            this.lastOperatorId = builder.lastOperatorId;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.parentCategoryId = builder.parentCategoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataEntityList create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Long getCategoryId() {
            return this.categoryId;
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
         * @return depth
         */
        public Integer getDepth() {
            return this.depth;
        }

        /**
         * @return lastOperatorId
         */
        public String getLastOperatorId() {
            return this.lastOperatorId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return parentCategoryId
         */
        public Long getParentCategoryId() {
            return this.parentCategoryId;
        }

        public static final class Builder {
            private Long categoryId; 
            private String comment; 
            private Long createTime; 
            private Integer depth; 
            private String lastOperatorId; 
            private Long modifiedTime; 
            private String name; 
            private String ownerId; 
            private Long parentCategoryId; 

            /**
             * The ID of the category.
             */
            public Builder categoryId(Long categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * The remarks of the category.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * The time when the category was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The number of category levels.
             */
            public Builder depth(Integer depth) {
                this.depth = depth;
                return this;
            }

            /**
             * The ID of the user that performed the last operation.
             */
            public Builder lastOperatorId(String lastOperatorId) {
                this.lastOperatorId = lastOperatorId;
                return this;
            }

            /**
             * The time when the category was last modified.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The name of the category.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the category owner.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The ID of the parent category.
             */
            public Builder parentCategoryId(Long parentCategoryId) {
                this.parentCategoryId = parentCategoryId;
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

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.dataEntityList = builder.dataEntityList;
            this.pageNum = builder.pageNum;
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
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
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
            private Integer pageNum; 
            private Integer pageSize; 
            private Long totalCount; 

            /**
             * The information about the category tree.
             */
            public Builder dataEntityList(java.util.List < DataEntityList> dataEntityList) {
                this.dataEntityList = dataEntityList;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * The total number of categories.
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
