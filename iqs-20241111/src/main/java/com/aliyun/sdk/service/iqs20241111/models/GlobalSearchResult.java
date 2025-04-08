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
 * {@link GlobalSearchResult} extends {@link TeaModel}
 *
 * <p>GlobalSearchResult</p>
 */
public class GlobalSearchResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pageItems")
    private java.util.List<GlobalPageItem> pageItems;

    @com.aliyun.core.annotation.NameInMap("queryContext")
    private GlobalQueryContext queryContext;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sceneItems")
    private java.util.List<GlobalSceneItem> sceneItems;

    @com.aliyun.core.annotation.NameInMap("searchInformation")
    private GlobalSearchInformation searchInformation;

    private GlobalSearchResult(Builder builder) {
        this.pageItems = builder.pageItems;
        this.queryContext = builder.queryContext;
        this.requestId = builder.requestId;
        this.sceneItems = builder.sceneItems;
        this.searchInformation = builder.searchInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalSearchResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageItems
     */
    public java.util.List<GlobalPageItem> getPageItems() {
        return this.pageItems;
    }

    /**
     * @return queryContext
     */
    public GlobalQueryContext getQueryContext() {
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
    public java.util.List<GlobalSceneItem> getSceneItems() {
        return this.sceneItems;
    }

    /**
     * @return searchInformation
     */
    public GlobalSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

    public static final class Builder {
        private java.util.List<GlobalPageItem> pageItems; 
        private GlobalQueryContext queryContext; 
        private String requestId; 
        private java.util.List<GlobalSceneItem> sceneItems; 
        private GlobalSearchInformation searchInformation; 

        private Builder() {
        } 

        private Builder(GlobalSearchResult model) {
            this.pageItems = model.pageItems;
            this.queryContext = model.queryContext;
            this.requestId = model.requestId;
            this.sceneItems = model.sceneItems;
            this.searchInformation = model.searchInformation;
        } 

        /**
         * pageItems.
         */
        public Builder pageItems(java.util.List<GlobalPageItem> pageItems) {
            this.pageItems = pageItems;
            return this;
        }

        /**
         * queryContext.
         */
        public Builder queryContext(GlobalQueryContext queryContext) {
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
        public Builder sceneItems(java.util.List<GlobalSceneItem> sceneItems) {
            this.sceneItems = sceneItems;
            return this;
        }

        /**
         * searchInformation.
         */
        public Builder searchInformation(GlobalSearchInformation searchInformation) {
            this.searchInformation = searchInformation;
            return this;
        }

        public GlobalSearchResult build() {
            return new GlobalSearchResult(this);
        } 

    } 

}
