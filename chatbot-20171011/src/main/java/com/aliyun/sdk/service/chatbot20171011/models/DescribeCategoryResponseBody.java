// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCategoryResponseBody</p>
 */
public class DescribeCategoryResponseBody extends TeaModel {
    @NameInMap("CategoryId")
    private Long categoryId;

    @NameInMap("Name")
    private String name;

    @NameInMap("ParentCategoryId")
    private Long parentCategoryId;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCategoryResponseBody(Builder builder) {
        this.categoryId = builder.categoryId;
        this.name = builder.name;
        this.parentCategoryId = builder.parentCategoryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parentCategoryId
     */
    public Long getParentCategoryId() {
        return this.parentCategoryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long categoryId; 
        private String name; 
        private Long parentCategoryId; 
        private String requestId; 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * ParentCategoryId.
         */
        public Builder parentCategoryId(Long parentCategoryId) {
            this.parentCategoryId = parentCategoryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCategoryResponseBody build() {
            return new DescribeCategoryResponseBody(this);
        } 

    } 

}
