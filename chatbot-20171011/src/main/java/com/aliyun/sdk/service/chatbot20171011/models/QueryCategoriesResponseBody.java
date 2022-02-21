// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCategoriesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCategoriesResponseBody</p>
 */
public class QueryCategoriesResponseBody extends TeaModel {
    @NameInMap("Categories")
    private java.util.List < Children > categories;

    @NameInMap("RequestId")
    private String requestId;

    private QueryCategoriesResponseBody(Builder builder) {
        this.categories = builder.categories;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCategoriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return categories
     */
    public java.util.List < Children > getCategories() {
        return this.categories;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Children > categories; 
        private String requestId; 

        /**
         * Categories.
         */
        public Builder categories(java.util.List < Children > categories) {
            this.categories = categories;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryCategoriesResponseBody build() {
            return new QueryCategoriesResponseBody(this);
        } 

    } 

}
