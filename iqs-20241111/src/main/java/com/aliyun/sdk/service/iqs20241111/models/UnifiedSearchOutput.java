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
 * {@link UnifiedSearchOutput} extends {@link TeaModel}
 *
 * <p>UnifiedSearchOutput</p>
 */
public class UnifiedSearchOutput extends TeaModel {
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

    private UnifiedSearchOutput(Builder builder) {
        this.costCredits = builder.costCredits;
        this.pageItems = builder.pageItems;
        this.queryContext = builder.queryContext;
        this.requestId = builder.requestId;
        this.sceneItems = builder.sceneItems;
        this.searchInformation = builder.searchInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedSearchOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private UnifiedCostCredits costCredits; 
        private java.util.List<UnifiedPageItem> pageItems; 
        private UnifiedQueryContext queryContext; 
        private String requestId; 
        private java.util.List<UnifiedSceneItem> sceneItems; 
        private UnifiedSearchInformation searchInformation; 

        private Builder() {
        } 

        private Builder(UnifiedSearchOutput model) {
            this.costCredits = model.costCredits;
            this.pageItems = model.pageItems;
            this.queryContext = model.queryContext;
            this.requestId = model.requestId;
            this.sceneItems = model.sceneItems;
            this.searchInformation = model.searchInformation;
        } 

        /**
         * costCredits.
         */
        public Builder costCredits(UnifiedCostCredits costCredits) {
            this.costCredits = costCredits;
            return this;
        }

        /**
         * pageItems.
         */
        public Builder pageItems(java.util.List<UnifiedPageItem> pageItems) {
            this.pageItems = pageItems;
            return this;
        }

        /**
         * queryContext.
         */
        public Builder queryContext(UnifiedQueryContext queryContext) {
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
        public Builder sceneItems(java.util.List<UnifiedSceneItem> sceneItems) {
            this.sceneItems = sceneItems;
            return this;
        }

        /**
         * searchInformation.
         */
        public Builder searchInformation(UnifiedSearchInformation searchInformation) {
            this.searchInformation = searchInformation;
            return this;
        }

        public UnifiedSearchOutput build() {
            return new UnifiedSearchOutput(this);
        } 

    } 

}
