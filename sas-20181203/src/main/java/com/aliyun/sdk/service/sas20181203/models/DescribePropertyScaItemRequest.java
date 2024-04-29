// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:
         * <p>
         * 
         * *   **sca**: middleware
         * *   **sca_database**: database
         * *   **sca_web**: web service
         * 
         * > If you do not specify this parameter, the default value **sca** is used, which indicates that middleware fingerprints are queried.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * The number of the page to return. Default value: **1**.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Specifies whether to forcefully refresh the data that you want to query. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false**: no
         */
        public Builder forceFlush(Boolean forceFlush) {
            this.putQueryParameter("ForceFlush", forceFlush);
            this.forceFlush = forceFlush;
            return this;
        }

        /**
         * The language of the content within the request and response. Default value: **zh**. Valid values:
         * <p>
         * 
         * *   **zh**: Chinese
         * *   **en**: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page.
         * <p>
         * 
         * > We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The search keyword. You must specify this parameter based on the value of the **SearchItem** parameter.
         * <p>
         * 
         * *   If the **SearchItem** parameter is set to **name**, you must enter the name of an asset fingerprint.
         * 
         * *   If the **SearchItem** parameter is set to **type**, you must enter the type of an asset fingerprint. Valid values:
         * 
         *     *   **system_service**: system service
         *     *   **software_library**: software library
         *     *   **docker_component**: container component
         *     *   **database**: database
         *     *   **web_container**: web container
         *     *   **jar**: JAR package
         *     *   **web_framework**: web framework
         * 
         * > You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * The type of the search condition. Valid values:
         * <p>
         * 
         * *   **name**: the name of a database, middleware, or web service
         * *   **type**: the type of a database, middleware, or web service
         * 
         * > You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the asset fingerprints based on the specified name or type.
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
