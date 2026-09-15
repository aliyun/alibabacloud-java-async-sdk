// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetAssetsPropertyDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAssetsPropertyDetailRequest</p>
 */
public class GetAssetsPropertyDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Biz")
    @com.aliyun.core.annotation.Validation(required = true)
    private String biz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ItemName")
    private String itemName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchCriteriaList")
    private java.util.List<SearchCriteriaList> searchCriteriaList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseNextToken")
    private Boolean useNextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private GetAssetsPropertyDetailRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.currentPage = builder.currentPage;
        this.itemName = builder.itemName;
        this.lang = builder.lang;
        this.nextToken = builder.nextToken;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.searchCriteriaList = builder.searchCriteriaList;
        this.useNextToken = builder.useNextToken;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetsPropertyDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return searchCriteriaList
     */
    public java.util.List<SearchCriteriaList> getSearchCriteriaList() {
        return this.searchCriteriaList;
    }

    /**
     * @return useNextToken
     */
    public Boolean getUseNextToken() {
        return this.useNextToken;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<GetAssetsPropertyDetailRequest, Builder> {
        private String biz; 
        private Integer currentPage; 
        private String itemName; 
        private String lang; 
        private String nextToken; 
        private Integer pageSize; 
        private String remark; 
        private java.util.List<SearchCriteriaList> searchCriteriaList; 
        private Boolean useNextToken; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(GetAssetsPropertyDetailRequest request) {
            super(request);
            this.biz = request.biz;
            this.currentPage = request.currentPage;
            this.itemName = request.itemName;
            this.lang = request.lang;
            this.nextToken = request.nextToken;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.searchCriteriaList = request.searchCriteriaList;
            this.useNextToken = request.useNextToken;
            this.uuid = request.uuid;
        } 

        /**
         * <p>The type of Asset Fingerprints to query. Default value: <strong>sca</strong>. Valid values:</p>
         * <ul>
         * <li><strong>lkm</strong>: kernel module</li>
         * <li><strong>autorun</strong>: startup item</li>
         * <li><strong>web_server</strong>: web site.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lkm</p>
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * <p>The page number of the page to return. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The aggregation item name of the Asset Fingerprints to query.</p>
         * <blockquote>
         * <p>Call the <a href="~~GetAssetsPropertyItem~~">GetAssetsPropertyItem</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>virtio</p>
         */
        public Builder itemName(String itemName) {
            this.putQueryParameter("ItemName", itemName);
            this.itemName = itemName;
            return this;
        }

        /**
         * <p>The language type of the request and response messages. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The token that marks the starting position for the query. Leave this parameter empty to query from the beginning.</p>
         * <blockquote>
         * <p>Do not specify this parameter for the first call. The response includes the NextToken value for the next call. Each subsequent response contains the NextToken value for the following call.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>71640f04f6e7b49764c8d08ae170xxxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The maximum number of entries per page for a paging query. Default value: 20. If you leave this parameter empty, 20 entries are returned per page by default.</p>
         * <blockquote>
         * <p>Do not leave PageSize empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The server name or IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * <p>The collection of search criteria for querying Asset Fingerprints details.</p>
         */
        public Builder searchCriteriaList(java.util.List<SearchCriteriaList> searchCriteriaList) {
            this.putQueryParameter("SearchCriteriaList", searchCriteriaList);
            this.searchCriteriaList = searchCriteriaList;
            return this;
        }

        /**
         * <p>Specifies whether to use the NextToken method to retrieve the vulnerability list. If this parameter is used, TotalCount is no longer returned. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Use the NextToken method.</li>
         * <li><strong>false</strong>: Do not use the NextToken method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder useNextToken(Boolean useNextToken) {
            this.putQueryParameter("UseNextToken", useNextToken);
            this.useNextToken = useNextToken;
            return this;
        }

        /**
         * <p>The UUID of the asset to query.</p>
         * <blockquote>
         * <p>Call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>38f72ea4-4c9f-4df1-bc6c-0f267614****</p>
         */
        public Builder uuid(String uuid) {
            this.putQueryParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public GetAssetsPropertyDetailRequest build() {
            return new GetAssetsPropertyDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetAssetsPropertyDetailRequest} extends {@link TeaModel}
     *
     * <p>GetAssetsPropertyDetailRequest</p>
     */
    public static class SearchCriteriaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private SearchCriteriaList(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SearchCriteriaList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(SearchCriteriaList model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The name of the search criterion. Valid values:</p>
             * <ul>
             * <li><strong>remarkItemName</strong>: the aggregation item name of Asset Fingerprints. Fuzzy match is supported.</li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li><ul>
             * <li>When <strong>Biz</strong> is set to <strong>web_server</strong>, <strong>remarkItemName</strong> indicates the domain name.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>When <strong>Biz</strong> is set to <strong>lkm</strong>, <strong>remarkItemName</strong> indicates the module name.</li>
             * </ul>
             * </li>
             * <li><ul>
             * <li>When <strong>Biz</strong> is set to <strong>autorun</strong>, <strong>remarkItemName</strong> indicates the startup item path.</li>
             * </ul>
             * </li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>remarkItemName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The value of the search criterion.</p>
             * 
             * <strong>example:</strong>
             * <p>virtio</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public SearchCriteriaList build() {
                return new SearchCriteriaList(this);
            } 

        } 

    }
}
