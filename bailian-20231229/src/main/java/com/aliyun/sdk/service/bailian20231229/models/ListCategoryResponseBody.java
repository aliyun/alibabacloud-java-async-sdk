// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link ListCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListCategoryResponseBody</p>
 */
public class ListCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCategoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCategoryResponseBody build() {
            return new ListCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListCategoryResponseBody</p>
     */
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private String categoryId;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("CategoryType")
        private String categoryType;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("ParentCategoryId")
        private String parentCategoryId;

        private CategoryList(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.categoryType = builder.categoryType;
            this.isDefault = builder.isDefault;
            this.parentCategoryId = builder.parentCategoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return categoryType
         */
        public String getCategoryType() {
            return this.categoryType;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return parentCategoryId
         */
        public String getParentCategoryId() {
            return this.parentCategoryId;
        }

        public static final class Builder {
            private String categoryId; 
            private String categoryName; 
            private String categoryType; 
            private Boolean isDefault; 
            private String parentCategoryId; 

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * CategoryType.
             */
            public Builder categoryType(String categoryType) {
                this.categoryType = categoryType;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * ParentCategoryId.
             */
            public Builder parentCategoryId(String parentCategoryId) {
                this.parentCategoryId = parentCategoryId;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListCategoryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryList")
        private java.util.List<CategoryList> categoryList;

        @com.aliyun.core.annotation.NameInMap("HasNext")
        private Boolean hasNext;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.categoryList = builder.categoryList;
            this.hasNext = builder.hasNext;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return categoryList
         */
        public java.util.List<CategoryList> getCategoryList() {
            return this.categoryList;
        }

        /**
         * @return hasNext
         */
        public Boolean getHasNext() {
            return this.hasNext;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CategoryList> categoryList; 
            private Boolean hasNext; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            /**
             * CategoryList.
             */
            public Builder categoryList(java.util.List<CategoryList> categoryList) {
                this.categoryList = categoryList;
                return this;
            }

            /**
             * HasNext.
             */
            public Builder hasNext(Boolean hasNext) {
                this.hasNext = hasNext;
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
