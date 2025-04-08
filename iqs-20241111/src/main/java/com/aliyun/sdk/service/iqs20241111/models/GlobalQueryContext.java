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
 * {@link GlobalQueryContext} extends {@link TeaModel}
 *
 * <p>GlobalQueryContext</p>
 */
public class GlobalQueryContext extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("originalQuery")
    private OriginalQuery originalQuery;

    private GlobalQueryContext(Builder builder) {
        this.originalQuery = builder.originalQuery;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GlobalQueryContext create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return originalQuery
     */
    public OriginalQuery getOriginalQuery() {
        return this.originalQuery;
    }

    public static final class Builder {
        private OriginalQuery originalQuery; 

        private Builder() {
        } 

        private Builder(GlobalQueryContext model) {
            this.originalQuery = model.originalQuery;
        } 

        /**
         * originalQuery.
         */
        public Builder originalQuery(OriginalQuery originalQuery) {
            this.originalQuery = originalQuery;
            return this;
        }

        public GlobalQueryContext build() {
            return new GlobalQueryContext(this);
        } 

    } 

    /**
     * 
     * {@link GlobalQueryContext} extends {@link TeaModel}
     *
     * <p>GlobalQueryContext</p>
     */
    public static class OriginalQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("page")
        private String page;

        @com.aliyun.core.annotation.NameInMap("query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("timeRange")
        private String timeRange;

        private OriginalQuery(Builder builder) {
            this.page = builder.page;
            this.query = builder.query;
            this.timeRange = builder.timeRange;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginalQuery create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public String getPage() {
            return this.page;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return timeRange
         */
        public String getTimeRange() {
            return this.timeRange;
        }

        public static final class Builder {
            private String page; 
            private String query; 
            private String timeRange; 

            private Builder() {
            } 

            private Builder(OriginalQuery model) {
                this.page = model.page;
                this.query = model.query;
                this.timeRange = model.timeRange;
            } 

            /**
             * page.
             */
            public Builder page(String page) {
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
             * timeRange.
             */
            public Builder timeRange(String timeRange) {
                this.timeRange = timeRange;
                return this;
            }

            public OriginalQuery build() {
                return new OriginalQuery(this);
            } 

        } 

    }
}
