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
 * {@link GetAssetsPropertyItemRequest} extends {@link RequestModel}
 *
 * <p>GetAssetsPropertyItemRequest</p>
 */
public class GetAssetsPropertyItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Biz")
    @com.aliyun.core.annotation.Validation(required = true)
    private String biz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceFlush")
    private Boolean forceFlush;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchInfo")
    private String searchInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchItem")
    private String searchItem;

    private GetAssetsPropertyItemRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.currentPage = builder.currentPage;
        this.forceFlush = builder.forceFlush;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.searchInfo = builder.searchInfo;
        this.searchItem = builder.searchItem;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAssetsPropertyItemRequest create() {
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
     * @return forceFlush
     */
    public Boolean getForceFlush() {
        return this.forceFlush;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return searchInfo
     */
    public String getSearchInfo() {
        return this.searchInfo;
    }

    /**
     * @return searchItem
     */
    public String getSearchItem() {
        return this.searchItem;
    }

    public static final class Builder extends Request.Builder<GetAssetsPropertyItemRequest, Builder> {
        private String biz; 
        private Integer currentPage; 
        private Boolean forceFlush; 
        private String lang; 
        private Integer pageSize; 
        private String searchInfo; 
        private String searchItem; 

        private Builder() {
            super();
        } 

        private Builder(GetAssetsPropertyItemRequest request) {
            super(request);
            this.biz = request.biz;
            this.currentPage = request.currentPage;
            this.forceFlush = request.forceFlush;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.searchInfo = request.searchInfo;
            this.searchItem = request.searchItem;
        } 

        /**
         * <p>The type of Asset Fingerprints to query. Default value: <strong>sca</strong>. Valid values:</p>
         * <ul>
         * <li><strong>lkm</strong>: kernel module</li>
         * <li><strong>autorun</strong>: startup item</li>
         * <li><strong>web_server</strong>: website.</li>
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
         * <p>The page number of the page to return. Default value: <strong>1</strong>, which indicates the first page.</p>
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
         * <p>Specifies whether to forcefully refresh the data to be queried. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Forcefully refresh.</li>
         * <li><strong>false</strong>: Do not forcefully refresh.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceFlush(Boolean forceFlush) {
            this.putQueryParameter("ForceFlush", forceFlush);
            this.forceFlush = forceFlush;
            return this;
        }

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English.</li>
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
         * <p>The maximum number of entries to return on each page when using paging. Default value: 20. If the PageSize parameter is left empty, 20 entries are returned by default.</p>
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
         * <p>The content to query. Specify different query content based on the value of <strong>SearchItem</strong>:</p>
         * <ul>
         * <li>If <strong>SearchItem</strong> is set to <strong>domain</strong>, enter the domain name of the Asset Fingerprints entry.</li>
         * <li>If <strong>SearchItem</strong> is set to <strong>module_name</strong>, enter the module name of the Asset Fingerprints entry.</li>
         * <li>If <strong>SearchItem</strong> is set to <strong>path</strong>, enter the startup item path of the Asset Fingerprints entry.</li>
         * </ul>
         * <blockquote>
         * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters must be used together. Both parameters must be set at the same time for the query to take effect. Setting only one parameter does not take effect. You can use these parameters to query all data of a specific Asset Fingerprints entry by name.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/lib/systemd/s****</p>
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * <p>The type of query condition. Set different aggregation search conditions based on the <strong>Biz</strong> parameter. Valid values:</p>
         * <ul>
         * <li>If <strong>Biz</strong> is set to <strong>web_server</strong>, the following search conditions are supported for <strong>SearchItem</strong>:<ul>
         * <li><strong>domain</strong>: domain name</li>
         * </ul>
         * </li>
         * <li>If <strong>Biz</strong> is set to <strong>lkm</strong>, the following search conditions are supported for <strong>SearchItem</strong>:<ul>
         * <li><strong>module_name</strong>: module name</li>
         * </ul>
         * </li>
         * <li>If <strong>Biz</strong> is set to <strong>autorun</strong>, the following search conditions are supported for <strong>SearchItem</strong>:<ul>
         * <li><strong>path</strong>: startup item path<blockquote>
         * <p>The <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters must be used together. Both parameters must be set at the same time for the query to take effect. Setting only one parameter does not take effect. You can use these parameters to query all data of a specific Asset Fingerprints entry by name.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>path</p>
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        @Override
        public GetAssetsPropertyItemRequest build() {
            return new GetAssetsPropertyItemRequest(this);
        } 

    } 

}
