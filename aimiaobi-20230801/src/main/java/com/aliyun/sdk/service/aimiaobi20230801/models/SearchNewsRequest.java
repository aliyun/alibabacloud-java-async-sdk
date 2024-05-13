// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchNewsRequest} extends {@link RequestModel}
 *
 * <p>SearchNewsRequest</p>
 */
public class SearchNewsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FilterNotNull")
    private Boolean filterNotNull;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeContent")
    private Boolean includeContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Page")
    private Integer page;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchSources")
    private java.util.List < String > searchSources;

    private SearchNewsRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.filterNotNull = builder.filterNotNull;
        this.includeContent = builder.includeContent;
        this.page = builder.page;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.searchSources = builder.searchSources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchNewsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return filterNotNull
     */
    public Boolean getFilterNotNull() {
        return this.filterNotNull;
    }

    /**
     * @return includeContent
     */
    public Boolean getIncludeContent() {
        return this.includeContent;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return searchSources
     */
    public java.util.List < String > getSearchSources() {
        return this.searchSources;
    }

    public static final class Builder extends Request.Builder<SearchNewsRequest, Builder> {
        private String agentKey; 
        private Boolean filterNotNull; 
        private Boolean includeContent; 
        private Integer page; 
        private Integer pageSize; 
        private String query; 
        private java.util.List < String > searchSources; 

        private Builder() {
            super();
        } 

        private Builder(SearchNewsRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.filterNotNull = request.filterNotNull;
            this.includeContent = request.includeContent;
            this.page = request.page;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.searchSources = request.searchSources;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * FilterNotNull.
         */
        public Builder filterNotNull(Boolean filterNotNull) {
            this.putBodyParameter("FilterNotNull", filterNotNull);
            this.filterNotNull = filterNotNull;
            return this;
        }

        /**
         * IncludeContent.
         */
        public Builder includeContent(Boolean includeContent) {
            this.putBodyParameter("IncludeContent", includeContent);
            this.includeContent = includeContent;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putBodyParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putBodyParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * SearchSources.
         */
        public Builder searchSources(java.util.List < String > searchSources) {
            String searchSourcesShrink = shrink(searchSources, "SearchSources", "json");
            this.putBodyParameter("SearchSources", searchSourcesShrink);
            this.searchSources = searchSources;
            return this;
        }

        @Override
        public SearchNewsRequest build() {
            return new SearchNewsRequest(this);
        } 

    } 

}
