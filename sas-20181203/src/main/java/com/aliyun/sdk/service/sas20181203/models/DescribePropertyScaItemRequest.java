// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePropertyScaItemRequest} extends {@link RequestModel}
 *
 * <p>DescribePropertyScaItemRequest</p>
 */
public class DescribePropertyScaItemRequest extends Request {
    @Query
    @NameInMap("Biz")
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
    private Integer pageSize;

    @Query
    @NameInMap("SearchInfo")
    private String searchInfo;

    @Query
    @NameInMap("SearchItem")
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
         * Biz.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * ForceFlush.
         */
        public Builder forceFlush(Boolean forceFlush) {
            this.putQueryParameter("ForceFlush", forceFlush);
            this.forceFlush = forceFlush;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * SearchInfo.
         */
        public Builder searchInfo(String searchInfo) {
            this.putQueryParameter("SearchInfo", searchInfo);
            this.searchInfo = searchInfo;
            return this;
        }

        /**
         * SearchItem.
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
