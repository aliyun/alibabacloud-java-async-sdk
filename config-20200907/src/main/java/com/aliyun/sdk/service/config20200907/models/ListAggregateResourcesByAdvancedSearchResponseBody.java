// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListAggregateResourcesByAdvancedSearchResponseBody} extends {@link TeaModel}
 *
 * <p>ListAggregateResourcesByAdvancedSearchResponseBody</p>
 */
public class ListAggregateResourcesByAdvancedSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryResults")
    private QueryResults queryResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAggregateResourcesByAdvancedSearchResponseBody(Builder builder) {
        this.queryResults = builder.queryResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAggregateResourcesByAdvancedSearchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryResults
     */
    public QueryResults getQueryResults() {
        return this.queryResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private QueryResults queryResults; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAggregateResourcesByAdvancedSearchResponseBody model) {
            this.queryResults = model.queryResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder queryResults(QueryResults queryResults) {
            this.queryResults = queryResults;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B0DBF868-460F-5E7C-8F76-1ACE2FCCE153</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAggregateResourcesByAdvancedSearchResponseBody build() {
            return new ListAggregateResourcesByAdvancedSearchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAggregateResourcesByAdvancedSearchResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateResourcesByAdvancedSearchResponseBody</p>
     */
    public static class QueryResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List<String> columns;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<?> values;

        private QueryResultList(Builder builder) {
            this.columns = builder.columns;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryResultList create() {
            return builder().build();
        }

        /**
         * @return columns
         */
        public java.util.List<String> getColumns() {
            return this.columns;
        }

        /**
         * @return values
         */
        public java.util.List<?> getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List<String> columns; 
            private java.util.List<?> values; 

            private Builder() {
            } 

            private Builder(QueryResultList model) {
                this.columns = model.columns;
                this.values = model.values;
            } 

            /**
             * <p>The field names.</p>
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The resource data.</p>
             */
            public Builder values(java.util.List<?> values) {
                this.values = values;
                return this;
            }

            public QueryResultList build() {
                return new QueryResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAggregateResourcesByAdvancedSearchResponseBody} extends {@link TeaModel}
     *
     * <p>ListAggregateResourcesByAdvancedSearchResponseBody</p>
     */
    public static class QueryResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueryResultList")
        private QueryResultList queryResultList;

        private QueryResults(Builder builder) {
            this.queryResultList = builder.queryResultList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryResults create() {
            return builder().build();
        }

        /**
         * @return queryResultList
         */
        public QueryResultList getQueryResultList() {
            return this.queryResultList;
        }

        public static final class Builder {
            private QueryResultList queryResultList; 

            private Builder() {
            } 

            private Builder(QueryResults model) {
                this.queryResultList = model.queryResultList;
            } 

            /**
             * <p>The queried resources. A maximum of 1,000 data records can be returned. To view more data, use the download URL of the resource file.</p>
             */
            public Builder queryResultList(QueryResultList queryResultList) {
                this.queryResultList = queryResultList;
                return this;
            }

            public QueryResults build() {
                return new QueryResults(this);
            } 

        } 

    }
}
