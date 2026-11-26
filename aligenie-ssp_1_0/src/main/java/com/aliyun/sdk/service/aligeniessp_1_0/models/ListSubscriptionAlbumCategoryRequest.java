// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligeniessp_1_0.models;

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
 * {@link ListSubscriptionAlbumCategoryRequest} extends {@link RequestModel}
 *
 * <p>ListSubscriptionAlbumCategoryRequest</p>
 */
public class ListSubscriptionAlbumCategoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryName")
    private String categoryName;

    private ListSubscriptionAlbumCategoryRequest(Builder builder) {
        super(builder);
        this.categoryName = builder.categoryName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSubscriptionAlbumCategoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return categoryName
     */
    public String getCategoryName() {
        return this.categoryName;
    }

    public static final class Builder extends Request.Builder<ListSubscriptionAlbumCategoryRequest, Builder> {
        private String categoryName; 

        private Builder() {
            super();
        } 

        private Builder(ListSubscriptionAlbumCategoryRequest request) {
            super(request);
            this.categoryName = request.categoryName;
        } 

        /**
         * <p>Category name</p>
         * 
         * <strong>example:</strong>
         * <p>儿歌</p>
         */
        public Builder categoryName(String categoryName) {
            this.putQueryParameter("CategoryName", categoryName);
            this.categoryName = categoryName;
            return this;
        }

        @Override
        public ListSubscriptionAlbumCategoryRequest build() {
            return new ListSubscriptionAlbumCategoryRequest(this);
        } 

    } 

}
