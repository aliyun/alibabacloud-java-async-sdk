// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOrganizationWorkspaceListRequest} extends {@link RequestModel}
 *
 * <p>QueryOrganizationWorkspaceListRequest</p>
 */
public class QueryOrganizationWorkspaceListRequest extends Request {
    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNum")
    @Validation(maximum = 1000000, minimum = 1)
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("UserId")
    private String userId;

    private QueryOrganizationWorkspaceListRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryOrganizationWorkspaceListRequest create() {
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
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<QueryOrganizationWorkspaceListRequest, Builder> {
        private String keyword; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(QueryOrganizationWorkspaceListRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public QueryOrganizationWorkspaceListRequest build() {
            return new QueryOrganizationWorkspaceListRequest(this);
        } 

    } 

}
