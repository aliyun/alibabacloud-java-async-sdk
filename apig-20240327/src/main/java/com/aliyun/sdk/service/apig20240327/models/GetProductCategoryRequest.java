// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetProductCategoryRequest} extends {@link RequestModel}
 *
 * <p>GetProductCategoryRequest</p>
 */
public class GetProductCategoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("categoryId")
    private String categoryId;

    private GetProductCategoryRequest(Builder builder) {
        super(builder);
        this.categoryId = builder.categoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryId
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    public static final class Builder extends Request.Builder<GetProductCategoryRequest, Builder> {
        private String categoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetProductCategoryRequest request) {
            super(request);
            this.categoryId = request.categoryId;
        } 

        /**
         * <p>The ID of the product category.</p>
         * 
         * <strong>example:</strong>
         * <p>category-xxxxxxxx</p>
         */
        public Builder categoryId(String categoryId) {
            this.putPathParameter("categoryId", categoryId);
            this.categoryId = categoryId;
            return this;
        }

        @Override
        public GetProductCategoryRequest build() {
            return new GetProductCategoryRequest(this);
        } 

    } 

}
