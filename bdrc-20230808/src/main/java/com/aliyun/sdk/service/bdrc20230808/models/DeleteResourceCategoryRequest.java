// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

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
 * {@link DeleteResourceCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteResourceCategoryRequest</p>
 */
public class DeleteResourceCategoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceCategoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceCategoryId;

    private DeleteResourceCategoryRequest(Builder builder) {
        super(builder);
        this.resourceCategoryId = builder.resourceCategoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResourceCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resourceCategoryId
     */
    public String getResourceCategoryId() {
        return this.resourceCategoryId;
    }

    public static final class Builder extends Request.Builder<DeleteResourceCategoryRequest, Builder> {
        private String resourceCategoryId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResourceCategoryRequest request) {
            super(request);
            this.resourceCategoryId = request.resourceCategoryId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-123***7890</p>
         */
        public Builder resourceCategoryId(String resourceCategoryId) {
            this.putBodyParameter("ResourceCategoryId", resourceCategoryId);
            this.resourceCategoryId = resourceCategoryId;
            return this;
        }

        @Override
        public DeleteResourceCategoryRequest build() {
            return new DeleteResourceCategoryRequest(this);
        } 

    } 

}
