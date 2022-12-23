// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteCategoryRequest</p>
 */
public class DeleteCategoryRequest extends Request {
    @Query
    @NameInMap("CateId")
    @Validation(required = true)
    private Long cateId;

    private DeleteCategoryRequest(Builder builder) {
        super(builder);
        this.cateId = builder.cateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCategoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cateId
     */
    public Long getCateId() {
        return this.cateId;
    }

    public static final class Builder extends Request.Builder<DeleteCategoryRequest, Builder> {
        private Long cateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteCategoryRequest request) {
            super(request);
            this.cateId = request.cateId;
        } 

        /**
         * The ID of the category.
         */
        public Builder cateId(Long cateId) {
            this.putQueryParameter("CateId", cateId);
            this.cateId = cateId;
            return this;
        }

        @Override
        public DeleteCategoryRequest build() {
            return new DeleteCategoryRequest(this);
        } 

    } 

}
