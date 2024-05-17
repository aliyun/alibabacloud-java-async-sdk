// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AISearchQuery} extends {@link TeaModel}
 *
 * <p>AISearchQuery</p>
 */
public class AISearchQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("card")
    private String card;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    private AISearchQuery(Builder builder) {
        this.card = builder.card;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AISearchQuery create() {
        return builder().build();
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

    public static final class Builder {
        private String card; 
        private String query; 

        /**
         * card.
         */
        public Builder card(String card) {
            this.card = card;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        public AISearchQuery build() {
            return new AISearchQuery(this);
        } 

    } 

}
