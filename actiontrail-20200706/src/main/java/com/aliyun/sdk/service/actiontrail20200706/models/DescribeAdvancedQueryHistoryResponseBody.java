// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeAdvancedQueryHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAdvancedQueryHistoryResponseBody</p>
 */
public class DescribeAdvancedQueryHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("QueryHistoryList")
    private java.util.List<QueryHistoryList> queryHistoryList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAdvancedQueryHistoryResponseBody(Builder builder) {
        this.queryHistoryList = builder.queryHistoryList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAdvancedQueryHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queryHistoryList
     */
    public java.util.List<QueryHistoryList> getQueryHistoryList() {
        return this.queryHistoryList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<QueryHistoryList> queryHistoryList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeAdvancedQueryHistoryResponseBody model) {
            this.queryHistoryList = model.queryHistoryList;
            this.requestId = model.requestId;
        } 

        /**
         * QueryHistoryList.
         */
        public Builder queryHistoryList(java.util.List<QueryHistoryList> queryHistoryList) {
            this.queryHistoryList = queryHistoryList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAdvancedQueryHistoryResponseBody build() {
            return new DescribeAdvancedQueryHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAdvancedQueryHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAdvancedQueryHistoryResponseBody</p>
     */
    public static class QueryHistoryList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        @com.aliyun.core.annotation.NameInMap("QuerySql")
        private String querySql;

        @com.aliyun.core.annotation.NameInMap("SimpleQuery")
        private Boolean simpleQuery;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private QueryHistoryList(Builder builder) {
            this.queryId = builder.queryId;
            this.querySql = builder.querySql;
            this.simpleQuery = builder.simpleQuery;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QueryHistoryList create() {
            return builder().build();
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        /**
         * @return querySql
         */
        public String getQuerySql() {
            return this.querySql;
        }

        /**
         * @return simpleQuery
         */
        public Boolean getSimpleQuery() {
            return this.simpleQuery;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private String queryId; 
            private String querySql; 
            private Boolean simpleQuery; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(QueryHistoryList model) {
                this.queryId = model.queryId;
                this.querySql = model.querySql;
                this.simpleQuery = model.simpleQuery;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * QueryId.
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            /**
             * QuerySql.
             */
            public Builder querySql(String querySql) {
                this.querySql = querySql;
                return this;
            }

            /**
             * SimpleQuery.
             */
            public Builder simpleQuery(Boolean simpleQuery) {
                this.simpleQuery = simpleQuery;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public QueryHistoryList build() {
                return new QueryHistoryList(this);
            } 

        } 

    }
}
