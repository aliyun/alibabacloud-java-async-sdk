// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAssetsPropertyItemRequest} extends {@link RequestModel}
 *
 * <p>GetAssetsPropertyItemRequest</p>
 */
public class GetAssetsPropertyItemRequest extends Request {
    @Query
    @NameInMap("Biz")
    @Validation(required = true)
    private String biz;

    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("ForceFlush")
    private Boolean forceFlush;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SearchInfo")
    private String searchInfo;

    @Query
    @NameInMap("SearchItem")
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
         * The type of the asset fingerprint that you want to query. Default value: **sca**. Valid values:
         * <p>
         * 
         * *   **lkm**: kernel module
         * *   **autorun**: startup item
         * *   **web_server**: website
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
         * *   zh: Chinese
         * *   en: English
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The number of entries to return on each page. Default value: 20. If you leave this parameter empty, 20 entries are returned on each page.
         * <p>
         * 
         * >  We recommend that you do not leave this parameter empty.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The value of the search condition. You must specify this parameter based on the value of the **SearchItem** parameter.
         * <p>
         * 
         * *   If you set **SearchItem** to **domain**, you must enter the domain name.
         * *   If you set **SearchItem** to **module_name**, you must enter the module name.
         * *   If you set **SearchItem** to **path**, you must enter the path to the self-starting item.
         * 
         * >  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the information about asset fingerprints by asset fingerprint name.
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * The type of the search condition. You must specify this parameter based on the value of the **Biz** parameter. Valid values:
         * <p>
         * 
         * *   If you set **Biz** to **web_server**, set **SearchItem** to the following value:
         * 
         *     *   **domain**: the domain name
         * 
         * *   If you set **Biz** to **lkm**, set **SearchItem** to the following value:
         * 
         *     *   **module_name**: the name of the module
         * 
         * *   If you set **Biz** to **autorun**, set **SearchItem** to the following value:
         * 
         *     *   **path**: the path to the self-starting item
         * 
         * >  You must specify both the **SearchItem** and **SearchInfo** parameters before you can query the information about asset fingerprints by asset fingerprint name.
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
