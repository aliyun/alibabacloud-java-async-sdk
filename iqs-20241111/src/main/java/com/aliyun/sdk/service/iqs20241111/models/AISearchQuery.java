// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AISearchQuery} extends {@link TeaModel}
 *
 * <p>AISearchQuery</p>
 */
public class AISearchQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("card")
    private String card;

    @com.aliyun.core.annotation.NameInMap("cardQuery")
    private String cardQuery;

    @com.aliyun.core.annotation.NameInMap("page")
    private Integer page;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("searchEngine")
    private String searchEngine;

    @com.aliyun.core.annotation.NameInMap("searchPlan")
    private String searchPlan;

    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private AISearchQuery(Builder builder) {
        this.card = builder.card;
        this.cardQuery = builder.cardQuery;
        this.page = builder.page;
        this.query = builder.query;
        this.searchEngine = builder.searchEngine;
        this.searchPlan = builder.searchPlan;
        this.sessionId = builder.sessionId;
        this.timeRange = builder.timeRange;
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
     * @return cardQuery
     */
    public String getCardQuery() {
        return this.cardQuery;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return searchEngine
     */
    public String getSearchEngine() {
        return this.searchEngine;
    }

    /**
     * @return searchPlan
     */
    public String getSearchPlan() {
        return this.searchPlan;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private String card; 
        private String cardQuery; 
        private Integer page; 
        private String query; 
        private String searchEngine; 
        private String searchPlan; 
        private String sessionId; 
        private String timeRange; 

        /**
         * card.
         */
        public Builder card(String card) {
            this.card = card;
            return this;
        }

        /**
         * cardQuery.
         */
        public Builder cardQuery(String cardQuery) {
            this.cardQuery = cardQuery;
            return this;
        }

        /**
         * page.
         */
        public Builder page(Integer page) {
            this.page = page;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * searchEngine.
         */
        public Builder searchEngine(String searchEngine) {
            this.searchEngine = searchEngine;
            return this;
        }

        /**
         * searchPlan.
         */
        public Builder searchPlan(String searchPlan) {
            this.searchPlan = searchPlan;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public AISearchQuery build() {
            return new AISearchQuery(this);
        } 

    } 

}
