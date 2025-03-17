// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListFavoriteReportsRequest} extends {@link RequestModel}
 *
 * <p>ListFavoriteReportsRequest</p>
 */
public class ListFavoriteReportsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TreeType")
    private String treeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ListFavoriteReportsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageSize = builder.pageSize;
        this.treeType = builder.treeType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFavoriteReportsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return treeType
     */
    public String getTreeType() {
        return this.treeType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListFavoriteReportsRequest, Builder> {
        private String keyword; 
        private Integer pageSize; 
        private String treeType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListFavoriteReportsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.pageSize = request.pageSize;
            this.treeType = request.treeType;
            this.userId = request.userId;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * TreeType.
         */
        public Builder treeType(String treeType) {
            this.putQueryParameter("TreeType", treeType);
            this.treeType = treeType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b5d8fd9348cc4327****afb604</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListFavoriteReportsRequest build() {
            return new ListFavoriteReportsRequest(this);
        } 

    } 

}
