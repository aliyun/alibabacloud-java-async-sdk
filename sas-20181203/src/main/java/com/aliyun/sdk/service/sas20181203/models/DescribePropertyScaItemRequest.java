// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribePropertyScaItemRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScaItemRequest</p>
 */
public class DescribePropertyScaItemRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Biz")
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
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchInfo")
    private String searchInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchItem")
    private String searchItem;

    private DescribePropertyScaItemRequest(Builder builder) {
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

    public static DescribePropertyScaItemRequest create() {
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

    public static final class Builder extends Request.Builder<DescribePropertyScaItemRequest, Builder> {
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

        private Builder(DescribePropertyScaItemRequest request) {
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
         * <li><strong>sca</strong>: middleware</li>
         * <li><strong>sca_database</strong>: database</li>
         * <li><strong>sca_web</strong>: web service</li>
         * </ul>
         * <blockquote>
         * <p>If you do not specify this parameter, the default value <strong>sca</strong> is used, which indicates that middleware fingerprints are queried.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sca</p>
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
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
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
         * <p>The number of entries to return on each page.</p>
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
         * <p>The search keyword. You must specify this parameter based on the value of the <strong>SearchItem</strong> parameter.</p>
         * <ul>
         * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>name</strong>, you must enter the name of an asset fingerprint.</p>
         * </li>
         * <li><p>If the <strong>SearchItem</strong> parameter is set to <strong>type</strong>, you must enter the type of an asset fingerprint. Valid values:</p>
         * <ul>
         * <li><strong>system_service</strong>: system service</li>
         * <li><strong>software_library</strong>: software library</li>
         * <li><strong>docker_component</strong>: container component</li>
         * <li><strong>database</strong>: database</li>
         * <li><strong>web_container</strong>: web container</li>
         * <li><strong>jar</strong>: JAR package</li>
         * <li><strong>web_framework</strong>: web framework</li>
         * </ul>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>system_service</p>
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * <p>The type of the search condition. Valid values:</p>
         * <ul>
         * <li><strong>name</strong>: the name of a database, middleware, or web service</li>
         * <li><strong>type</strong>: the type of a database, middleware, or web service</li>
         * </ul>
         * <blockquote>
         * <p>You must specify both the <strong>SearchItem</strong> and <strong>SearchInfo</strong> parameters before you can query the asset fingerprints based on the specified name or type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>type</p>
         */
        public Builder searchItem(String searchItem) {
            this.putQueryParameter("SearchItem", searchItem);
            this.searchItem = searchItem;
            return this;
        }

        @Override
        public DescribePropertyScaItemRequest build() {
            return new DescribePropertyScaItemRequest(this);
        } 

    } 

}
