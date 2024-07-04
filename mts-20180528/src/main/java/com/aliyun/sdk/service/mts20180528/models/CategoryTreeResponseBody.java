// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20180528.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CategoryTreeResponseBody} extends {@link TeaModel}
 *
 * <p>CategoryTreeResponseBody</p>
 */
public class CategoryTreeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CategoryTree")
    private String categoryTree;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CategoryTreeResponseBody(Builder builder) {
        this.categoryTree = builder.categoryTree;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CategoryTreeResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryTree
     */
    public String getCategoryTree() {
        return this.categoryTree;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String categoryTree; 
        private String requestId; 

        /**
         * CategoryTree.
         */
        public Builder categoryTree(String categoryTree) {
            this.categoryTree = categoryTree;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CategoryTreeResponseBody build() {
            return new CategoryTreeResponseBody(this);
        } 

    } 

}
