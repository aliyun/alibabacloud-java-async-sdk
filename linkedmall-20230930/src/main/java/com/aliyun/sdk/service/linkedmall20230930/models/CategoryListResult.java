// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CategoryListResult} extends {@link TeaModel}
 *
 * <p>CategoryListResult</p>
 */
public class CategoryListResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("categories")
    private java.util.List < Category > categories;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CategoryListResult(Builder builder) {
        this.categories = builder.categories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CategoryListResult create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public java.util.List < Category > getCategories() {
        return this.categories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Category > categories; 
        private String requestId; 

        /**
         * categories.
         */
        public Builder categories(java.util.List < Category > categories) {
            this.categories = categories;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CategoryListResult build() {
            return new CategoryListResult(this);
        } 

    } 

}
