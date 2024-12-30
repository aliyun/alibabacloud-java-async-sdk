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
 * {@link QueryDatasetListRequest} extends {@link RequestModel}
 *
 * <p>QueryDatasetListRequest</p>
 */
public class QueryDatasetListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithChildren")
    private Boolean withChildren;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>schemaad8aad00-9c55-4984-a767-b4e0ec60****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>Information about the directory where the dataset is located</p>
         * 
         * <strong>example:</strong>
         * <p>Queries the datasets of a specified workspace. The datasets are sorted in descending order by creation time.</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>Specifies the directory ID.</p>
         * <ul>
         * <li>If this field is not empty, all datasets in the directory are obtained.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder withChildren(Boolean withChildren) {
            this.putQueryParameter("WithChildren", withChildren);
            this.withChildren = withChildren;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>95296e95-ca89-4c7d-8af9-dedf0ad0****</p>
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
