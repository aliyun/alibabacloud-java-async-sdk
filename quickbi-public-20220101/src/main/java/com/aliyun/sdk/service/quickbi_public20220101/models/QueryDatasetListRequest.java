// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDatasetListRequest} extends {@link RequestModel}
 *
 * <p>QueryDatasetListRequest</p>
 */
public class QueryDatasetListRequest extends Request {
    @Query
    @NameInMap("DirectoryId")
    private String directoryId;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("WithChildren")
    private Boolean withChildren;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private QueryDatasetListRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.keyword = builder.keyword;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.withChildren = builder.withChildren;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDatasetListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
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
     * @return withChildren
     */
    public Boolean getWithChildren() {
        return this.withChildren;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<QueryDatasetListRequest, Builder> {
        private String directoryId; 
        private String keyword; 
        private Integer pageNum; 
        private Integer pageSize; 
        private Boolean withChildren; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(QueryDatasetListRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.keyword = request.keyword;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.withChildren = request.withChildren;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * DirectoryId.
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
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
         * WithChildren.
         */
        public Builder withChildren(Boolean withChildren) {
            this.putQueryParameter("WithChildren", withChildren);
            this.withChildren = withChildren;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public QueryDatasetListRequest build() {
            return new QueryDatasetListRequest(this);
        } 

    } 

}
