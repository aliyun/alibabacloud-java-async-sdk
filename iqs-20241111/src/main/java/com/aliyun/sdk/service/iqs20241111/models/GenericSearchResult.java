// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link GenericSearchResult} extends {@link TeaModel}
 *
 * <p>GenericSearchResult</p>
 */
public class GenericSearchResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageItems")
    private java.util.List<ScorePageItem> pageItems;

    @com.aliyun.core.annotation.NameInMap("queryContext")
    private QueryContext queryContext;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sceneItems")
    private java.util.List<SceneItem> sceneItems;

    @com.aliyun.core.annotation.NameInMap("searchInformation")
    private SearchInformation searchInformation;

    @com.aliyun.core.annotation.NameInMap("weiboItems")
    private java.util.List<WeiboItem> weiboItems;

    private GenericSearchResult(Builder builder) {
        this.pageItems = builder.pageItems;
        this.queryContext = builder.queryContext;
        this.requestId = builder.requestId;
        this.sceneItems = builder.sceneItems;
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
    public java.util.List<ScorePageItem> getPageItems() {
        return this.pageItems;
    }

    /**
     * @return queryContext
     */
    public QueryContext getQueryContext() {
        return this.queryContext;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneItems
     */
    public java.util.List<SceneItem> getSceneItems() {
        return this.sceneItems;
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
    public java.util.List<WeiboItem> getWeiboItems() {
        return this.weiboItems;
    }

    public static final class Builder {
        private java.util.List<ScorePageItem> pageItems; 
        private QueryContext queryContext; 
        private String requestId; 
        private java.util.List<SceneItem> sceneItems; 
        private SearchInformation searchInformation; 
        private java.util.List<WeiboItem> weiboItems; 

        /**
         * pageItems.
         */
        public Builder pageItems(java.util.List<ScorePageItem> pageItems) {
            this.pageItems = pageItems;
            return this;
        }

        /**
         * queryContext.
         */
        public Builder queryContext(QueryContext queryContext) {
            this.queryContext = queryContext;
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
         * sceneItems.
         */
        public Builder sceneItems(java.util.List<SceneItem> sceneItems) {
            this.sceneItems = sceneItems;
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
        public Builder weiboItems(java.util.List<WeiboItem> weiboItems) {
            this.weiboItems = weiboItems;
            return this;
        }

        public GenericSearchResult build() {
            return new GenericSearchResult(this);
        } 

    } 

}
