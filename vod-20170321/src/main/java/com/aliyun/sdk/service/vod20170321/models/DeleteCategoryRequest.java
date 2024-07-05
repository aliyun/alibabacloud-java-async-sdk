// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCategoryRequest} extends {@link RequestModel}
 *
 * <p>DeleteCategoryRequest</p>
 */
public class DeleteCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CateId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The ID of the category. You can specify only one ID. You can use one of the following methods to obtain the ID:
         * <p>
         * 
         * *   Log on to the [ApsaraVideo VOD console](https://vod.console.aliyun.com). Choose **Configuration Management** > **Media Management** > **Categories**. On the Audio and Video / Image Category or Short Video Material Category tab, view the category ID.
         * *   Obtain the category ID from the response to the [AddCategory](~~AddCategory~~) operation.
         * 
         * >  If you specify the ID of a parent category, all subcategories under the parent category are deleted at the same time.
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
