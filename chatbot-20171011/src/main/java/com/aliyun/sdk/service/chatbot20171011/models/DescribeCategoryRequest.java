// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCategoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeCategoryRequest</p>
 */
public class DescribeCategoryRequest extends Request {
    @Query
    @NameInMap("CategoryId")
    @Validation(required = true)
    private Long categoryId;

    private DescribeCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    public static final class Builder extends Request.Builder<DescribeCategoryRequest, Builder> {
        private Long categoryId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCategoryRequest response) {
            super(response);
            this.categoryId = response.categoryId;
        } 

        /**
         * CategoryId.
         */
        public Builder categoryId(Long categoryId) {
            this.putQueryParameter("CategoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        @Override
        public DescribeCategoryRequest build() {
            return new DescribeCategoryRequest(this);
        } 

    } 

}
