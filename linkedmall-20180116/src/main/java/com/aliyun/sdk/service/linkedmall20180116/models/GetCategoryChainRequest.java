// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20180116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCategoryChainRequest} extends {@link RequestModel}
 *
 * <p>GetCategoryChainRequest</p>
 */
public class GetCategoryChainRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("CategoryId")
    private Long categoryId;

    @Query
    @NameInMap("ItemId")
    private Long itemId;

    @Query
    @NameInMap("LmItemId")
    private String lmItemId;

    private GetCategoryChainRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.categoryId = builder.categoryId;
        this.itemId = builder.itemId;
        this.lmItemId = builder.lmItemId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCategoryChainRequest create() {
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

    /**
     * @return itemId
     */
    public Long getItemId() {
        return this.itemId;
    }

    /**
     * @return lmItemId
     */
    public String getLmItemId() {
        return this.lmItemId;
    }

    public static final class Builder extends Request.Builder<GetCategoryChainRequest, Builder> {
        private String bizId; 
        private Long categoryId; 
        private Long itemId; 
        private String lmItemId; 

        private Builder() {
            super();
        } 

        private Builder(GetCategoryChainRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.categoryId = request.categoryId;
            this.itemId = request.itemId;
            this.lmItemId = request.lmItemId;
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

        /**
         * ItemId.
         */
        public Builder itemId(Long itemId) {
            this.putQueryParameter("ItemId", itemId);
            this.itemId = itemId;
            return this;
        }

        /**
         * LmItemId.
         */
        public Builder lmItemId(String lmItemId) {
            this.putQueryParameter("LmItemId", lmItemId);
            this.lmItemId = lmItemId;
            return this;
        }

        @Override
        public GetCategoryChainRequest build() {
            return new GetCategoryChainRequest(this);
        } 

    } 

}
