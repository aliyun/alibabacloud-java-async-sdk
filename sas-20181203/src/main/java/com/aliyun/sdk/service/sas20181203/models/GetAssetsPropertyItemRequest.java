// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The type of the asset fingerprint that you want to query. Default value: <strong>sca</strong>. Valid values:</p>
         * <ul>
         * <li><strong>lkm</strong>: kernel module</li>
         * <li><strong>autorun</strong>: startup item</li>
         * <li><strong>web_server</strong>: website</li>
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
         * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
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
         * <p>Specifies whether to forcefully refresh the data that you want to query. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
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
         * <p>The number of entries per page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.</p>
         * <blockquote>
         * <p>We recommend that you do not leave this parameter empty.</p>
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
         * <p>The value of the search condition. You must specify this parameter based on the value of the <strong>SearchItem</strong> parameter.</p>
         * <ul>
         * <li>If you set <strong>SearchItem</strong> to <strong>domain</strong>, you must enter the domain name.</li>
         * <li>If you set <strong>SearchItem</strong> to <strong>module_name</strong>, you must enter the module name.</li>
         * <li>If you set <strong>SearchItem</strong> to <strong>path</strong>, you must enter the path to the self-starting item.</li>
         * </ul>
         * <blockquote>
         * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the information about asset fingerprints by asset fingerprint name.</p>
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
         * <p>The type of the search condition. You must specify this parameter based on the value of the <strong>Biz</strong> parameter. Valid values:</p>
         * <ul>
         * <li><p>If you set <strong>Biz</strong> to <strong>web_server</strong>, set <strong>SearchItem</strong> to the following value:</p>
         * <ul>
         * <li><strong>domain</strong>: the domain name</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>Biz</strong> to <strong>lkm</strong>, set <strong>SearchItem</strong> to the following value:</p>
         * <ul>
         * <li><strong>module_name</strong>: the name of the module</li>
         * </ul>
         * </li>
         * <li><p>If you set <strong>Biz</strong> to <strong>autorun</strong>, set <strong>SearchItem</strong> to the following value:</p>
         * <ul>
         * <li><strong>path</strong>: the path to the self-starting item</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p> You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the information about asset fingerprints by asset fingerprint name.</p>
         * </blockquote>
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
