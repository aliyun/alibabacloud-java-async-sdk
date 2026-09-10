// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link ListExplorerRegistryModulesRequest} extends {@link RequestModel}
 *
 * <p>ListExplorerRegistryModulesRequest</p>
 */
public class ListExplorerRegistryModulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("moduleName")
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sort")
    private String sort;

    private ListExplorerRegistryModulesRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.moduleName = builder.moduleName;
        this.nextToken = builder.nextToken;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExplorerRegistryModulesRequest create() {
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
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder extends Request.Builder<ListExplorerRegistryModulesRequest, Builder> {
        private String keyword; 
        private Integer maxResults; 
        private String moduleName; 
        private String nextToken; 
        private String sort; 

        private Builder() {
            super();
        } 

        private Builder(ListExplorerRegistryModulesRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.moduleName = request.moduleName;
            this.nextToken = request.nextToken;
            this.sort = request.sort;
        } 

        /**
         * <p>The search keyword for the module name. Fuzzy matching is performed based on <code>moduleName</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * <p>Valid values: 0 to 200.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The name of the module.</p>
         * <p>Note: The module name is not necessarily the same as the product name or resource name.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("moduleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The pagination token for the next page of results.</p>
         * <p>If the total number of entries exceeds the maxResults limit, the data is truncated. You can use nextToken to query the next page of data.</p>
         * 
         * <strong>example:</strong>
         * <p>DxEkv+3w0EDAQgcRFBp8Ep4dD+2BRJj42DLT6GrZysw=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort order of the returned results. Valid values:</p>
         * <ul>
         * <li>Normal (default): returns results in normal order.</li>
         * <li>Top: returns results sorted by popularity.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder sort(String sort) {
            this.putQueryParameter("sort", sort);
            this.sort = sort;
            return this;
        }

        @Override
        public ListExplorerRegistryModulesRequest build() {
            return new ListExplorerRegistryModulesRequest(this);
        } 

    } 

}
