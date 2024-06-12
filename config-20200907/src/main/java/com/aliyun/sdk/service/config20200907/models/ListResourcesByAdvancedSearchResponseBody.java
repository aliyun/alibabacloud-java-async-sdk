// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesByAdvancedSearchResponseBody} extends {@link TeaModel}
 *
 * <p>ListResourcesByAdvancedSearchResponseBody</p>
 */
public class ListResourcesByAdvancedSearchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryResults")
    private QueryResults queryResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListResourcesByAdvancedSearchResponseBody(Builder builder) {
        this.queryResults = builder.queryResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesByAdvancedSearchResponseBody create() {
        return builder().build();
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

        /**
         * The query result.
         */
        public Builder queryResults(QueryResults queryResults) {
            this.queryResults = queryResults;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListResourcesByAdvancedSearchResponseBody build() {
            return new ListResourcesByAdvancedSearchResponseBody(this);
        } 

    } 

    public static class QueryResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < String > columns;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List < ? > values;

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
        public java.util.List < String > getColumns() {
            return this.columns;
        }

        /**
         * @return values
         */
        public java.util.List < ? > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > columns; 
            private java.util.List < ? > values; 

            /**
             * The field names.
             */
            public Builder columns(java.util.List < String > columns) {
                this.columns = columns;
                return this;
            }

            /**
             * The resource data.
             */
            public Builder values(java.util.List < ? > values) {
                this.values = values;
                return this;
            }

            public QueryResultList build() {
                return new QueryResultList(this);
            } 

        } 

    }
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

            /**
             * The queried resources. A maximum of 1,000 data records can be returned. To view more data, use the download URL of the resource file.
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
