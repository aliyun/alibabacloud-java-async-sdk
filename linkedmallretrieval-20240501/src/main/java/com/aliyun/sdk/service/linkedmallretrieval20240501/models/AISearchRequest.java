// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AISearchRequest} extends {@link RequestModel}
 *
 * <p>AISearchRequest</p>
 */
public class AISearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("card")
    private String card;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    private AISearchRequest(Builder builder) {
        super(builder);
        this.card = builder.card;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return card
     */
    public String getCard() {
        return this.card;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<AISearchRequest, Builder> {
        private String card; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(AISearchRequest request) {
            super(request);
            this.card = request.card;
            this.query = request.query;
        } 

        /**
         * card.
         */
        public Builder card(String card) {
            this.putQueryParameter("card", card);
            this.card = card;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        @Override
        public AISearchRequest build() {
            return new AISearchRequest(this);
        } 

    } 

}
