// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCategoryListRequest} extends {@link RequestModel}
 *
 * <p>GetCategoryListRequest</p>
 */
public class GetCategoryListRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("CategoryId")
    private Long categoryId;

    private GetCategoryListRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.categoryId = builder.categoryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoryListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return categoryId
     */
    public Long getCategoryId() {
        return this.categoryId;
    }

    public static final class Builder extends Request.Builder<GetCategoryListRequest, Builder> {
        private String bizId; 
        private Long categoryId; 

        private Builder() {
            super();
        } 

        private Builder(GetCategoryListRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.categoryId = request.categoryId;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
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
        public GetCategoryListRequest build() {
            return new GetCategoryListRequest(this);
        } 

    } 

}
