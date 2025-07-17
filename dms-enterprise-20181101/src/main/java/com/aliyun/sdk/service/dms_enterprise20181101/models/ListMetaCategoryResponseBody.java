// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link ListMetaCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaCategoryResponseBody</p>
 */
public class ListMetaCategoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryList")
    private CategoryList categoryList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListMetaCategoryResponseBody(Builder builder) {
        this.categoryList = builder.categoryList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaCategoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryList
     */
    public CategoryList getCategoryList() {
        return this.categoryList;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CategoryList categoryList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListMetaCategoryResponseBody model) {
            this.categoryList = model.categoryList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * CategoryList.
         */
        public Builder categoryList(CategoryList categoryList) {
            this.categoryList = categoryList;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMetaCategoryResponseBody build() {
            return new ListMetaCategoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaCategoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaCategoryResponseBody</p>
     */
    public static class CategoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetaCategory")
        private java.util.List<MetaCategory> metaCategory;

        private CategoryList(Builder builder) {
            this.metaCategory = builder.metaCategory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CategoryList create() {
            return builder().build();
        }

        /**
         * @return metaCategory
         */
        public java.util.List<MetaCategory> getMetaCategory() {
            return this.metaCategory;
        }

        public static final class Builder {
            private java.util.List<MetaCategory> metaCategory; 

            private Builder() {
            } 

            private Builder(CategoryList model) {
                this.metaCategory = model.metaCategory;
            } 

            /**
             * MetaCategory.
             */
            public Builder metaCategory(java.util.List<MetaCategory> metaCategory) {
                this.metaCategory = metaCategory;
                return this;
            }

            public CategoryList build() {
                return new CategoryList(this);
            } 

        } 

    }
}
