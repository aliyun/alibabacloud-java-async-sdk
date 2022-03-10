// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSharedReportsRequest} extends {@link RequestModel}
 *
 * <p>ListSharedReportsRequest</p>
 */
public class ListSharedReportsRequest extends Request {
    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("TreeType")
    private String treeType;

    @Query
    @NameInMap("UserId")
    @Validation(required = true)
    private String userId;

    private ListSharedReportsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageSize = builder.pageSize;
        this.treeType = builder.treeType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSharedReportsRequest create() {
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

    public static final class Builder extends Request.Builder<ListSharedReportsRequest, Builder> {
        private String keyword; 
        private Integer pageSize; 
        private String treeType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListSharedReportsRequest request) {
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListSharedReportsRequest build() {
            return new ListSharedReportsRequest(this);
        } 

    } 

}
