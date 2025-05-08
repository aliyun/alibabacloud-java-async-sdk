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
 * {@link UnifiedSearchResponse} extends {@link TeaModel}
 *
 * <p>UnifiedSearchResponse</p>
 */
public class UnifiedSearchResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("costCredits")
    private UnifiedCostCredits costCredits;

    @com.aliyun.core.annotation.NameInMap("pageItems")
    private java.util.List<UnifiedPageItem> pageItems;

    @com.aliyun.core.annotation.NameInMap("queryContext")
    private UnifiedQueryContext queryContext;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sceneItems")
    private java.util.List<UnifiedSceneItem> sceneItems;

    @com.aliyun.core.annotation.NameInMap("searchInformation")
    private UnifiedSearchInformation searchInformation;

    private UnifiedSearchResponse(BuilderImpl builder) {
        super(builder);
        this.costCredits = builder.costCredits;
        this.pageItems = builder.pageItems;
        this.queryContext = builder.queryContext;
        this.requestId = builder.requestId;
        this.sceneItems = builder.sceneItems;
        this.searchInformation = builder.searchInformation;
    }

    public static UnifiedSearchResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return costCredits
     */
    public UnifiedCostCredits getCostCredits() {
        return this.costCredits;
    }

    /**
     * @return pageItems
     */
    public java.util.List<UnifiedPageItem> getPageItems() {
        return this.pageItems;
    }

    /**
     * @return queryContext
     */
    public UnifiedQueryContext getQueryContext() {
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
    public java.util.List<UnifiedSceneItem> getSceneItems() {
        return this.sceneItems;
    }

    /**
     * @return searchInformation
     */
    public UnifiedSearchInformation getSearchInformation() {
        return this.searchInformation;
    }

    public interface Builder extends Response.Builder<UnifiedSearchResponse, Builder> {

        Builder costCredits(UnifiedCostCredits costCredits);

        Builder pageItems(java.util.List<UnifiedPageItem> pageItems);

        Builder queryContext(UnifiedQueryContext queryContext);

        Builder requestId(String requestId);

        Builder sceneItems(java.util.List<UnifiedSceneItem> sceneItems);

        Builder searchInformation(UnifiedSearchInformation searchInformation);

        @Override
        UnifiedSearchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnifiedSearchResponse, Builder>
            implements Builder {
        private UnifiedCostCredits costCredits; 
        private java.util.List<UnifiedPageItem> pageItems; 
        private UnifiedQueryContext queryContext; 
        private String requestId; 
        private java.util.List<UnifiedSceneItem> sceneItems; 
        private UnifiedSearchInformation searchInformation; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnifiedSearchResponse response) {
            super(response);
            this.costCredits = response.costCredits;
            this.pageItems = response.pageItems;
            this.queryContext = response.queryContext;
            this.requestId = response.requestId;
            this.sceneItems = response.sceneItems;
            this.searchInformation = response.searchInformation;
        } 

        /**
         * costCredits.
         */
        @Override
        public Builder costCredits(UnifiedCostCredits costCredits) {
            this.costCredits = costCredits;
            return this;
        }

        /**
         * pageItems.
         */
        @Override
        public Builder pageItems(java.util.List<UnifiedPageItem> pageItems) {
            this.pageItems = pageItems;
            return this;
        }

        /**
         * queryContext.
         */
        @Override
        public Builder queryContext(UnifiedQueryContext queryContext) {
            this.queryContext = queryContext;
            return this;
        }

        /**
         * requestId.
         */
        @Override
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sceneItems.
         */
        @Override
        public Builder sceneItems(java.util.List<UnifiedSceneItem> sceneItems) {
            this.sceneItems = sceneItems;
            return this;
        }

        /**
         * searchInformation.
         */
        @Override
        public Builder searchInformation(UnifiedSearchInformation searchInformation) {
            this.searchInformation = searchInformation;
            return this;
        }

        @Override
        public UnifiedSearchResponse build() {
            return new UnifiedSearchResponse(this);
        } 

    } 

}
