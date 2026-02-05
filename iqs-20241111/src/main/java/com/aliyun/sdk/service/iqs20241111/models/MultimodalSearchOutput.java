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
 * {@link MultimodalSearchOutput} extends {@link TeaModel}
 *
 * <p>MultimodalSearchOutput</p>
 */
public class MultimodalSearchOutput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("imageItems")
    private java.util.List<UnifiedImageItem> imageItems;

    @com.aliyun.core.annotation.NameInMap("queryContext")
    private MultimodalQueryContext queryContext;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("searchInformation")
    private SearchInformation searchInformation;

    private MultimodalSearchOutput(Builder builder) {
        this.imageItems = builder.imageItems;
        this.queryContext = builder.queryContext;
        this.requestId = builder.requestId;
        this.searchInformation = builder.searchInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MultimodalSearchOutput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return imageItems
     */
    public java.util.List<UnifiedImageItem> getImageItems() {
        return this.imageItems;
    }

    /**
     * @return queryContext
     */
    public MultimodalQueryContext getQueryContext() {
        return this.queryContext;
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

    public static final class Builder {
        private java.util.List<UnifiedImageItem> imageItems; 
        private MultimodalQueryContext queryContext; 
        private String requestId; 
        private SearchInformation searchInformation; 

        private Builder() {
        } 

        private Builder(MultimodalSearchOutput model) {
            this.imageItems = model.imageItems;
            this.queryContext = model.queryContext;
            this.requestId = model.requestId;
            this.searchInformation = model.searchInformation;
        } 

        /**
         * imageItems.
         */
        public Builder imageItems(java.util.List<UnifiedImageItem> imageItems) {
            this.imageItems = imageItems;
            return this;
        }

        /**
         * queryContext.
         */
        public Builder queryContext(MultimodalQueryContext queryContext) {
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
         * searchInformation.
         */
        public Builder searchInformation(SearchInformation searchInformation) {
            this.searchInformation = searchInformation;
            return this;
        }

        public MultimodalSearchOutput build() {
            return new MultimodalSearchOutput(this);
        } 

    } 

}
