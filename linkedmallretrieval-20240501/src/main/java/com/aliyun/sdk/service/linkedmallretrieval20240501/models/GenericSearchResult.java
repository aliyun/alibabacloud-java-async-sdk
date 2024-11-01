// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenericSearchResult} extends {@link TeaModel}
 *
 * <p>GenericSearchResult</p>
 */
public class GenericSearchResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageItems")
    private java.util.List < ScorePageItem > pageItems;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("searchInformation")
    private SearchInformation searchInformation;

    @com.aliyun.core.annotation.NameInMap("weiboItems")
    private java.util.List < WeiboItem > weiboItems;

    private GenericSearchResult(Builder builder) {
        this.pageItems = builder.pageItems;
        this.requestId = builder.requestId;
        this.searchInformation = builder.searchInformation;
        this.weiboItems = builder.weiboItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenericSearchResult create() {
        return builder().build();
    }

    /**
     * @return pageItems
     */
    public java.util.List < ScorePageItem > getPageItems() {
        return this.pageItems;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return searchInformation
     */
    public SearchInformation getSearchInformation() {
        return this.searchInformation;
    }

    /**
     * @return weiboItems
     */
    public java.util.List < WeiboItem > getWeiboItems() {
        return this.weiboItems;
    }

    public static final class Builder {
        private java.util.List < ScorePageItem > pageItems; 
        private String requestId; 
        private SearchInformation searchInformation; 
        private java.util.List < WeiboItem > weiboItems; 

        /**
         * pageItems.
         */
        public Builder pageItems(java.util.List < ScorePageItem > pageItems) {
            this.pageItems = pageItems;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * searchInformation.
         */
        public Builder searchInformation(SearchInformation searchInformation) {
            this.searchInformation = searchInformation;
            return this;
        }

        /**
         * weiboItems.
         */
        public Builder weiboItems(java.util.List < WeiboItem > weiboItems) {
            this.weiboItems = weiboItems;
            return this;
        }

        public GenericSearchResult build() {
            return new GenericSearchResult(this);
        } 

    } 

}
