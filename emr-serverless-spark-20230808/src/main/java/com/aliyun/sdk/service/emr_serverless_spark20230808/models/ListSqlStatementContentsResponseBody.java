// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListSqlStatementContentsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSqlStatementContentsResponseBody</p>
 */
public class ListSqlStatementContentsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sqlStatementContents")
    private SqlStatementContents sqlStatementContents;

    private ListSqlStatementContentsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sqlStatementContents = builder.sqlStatementContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSqlStatementContentsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sqlStatementContents
     */
    public SqlStatementContents getSqlStatementContents() {
        return this.sqlStatementContents;
    }

    public static final class Builder {
        private String requestId; 
        private SqlStatementContents sqlStatementContents; 

        private Builder() {
        } 

        private Builder(ListSqlStatementContentsResponseBody model) {
            this.requestId = model.requestId;
            this.sqlStatementContents = model.sqlStatementContents;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sqlStatementContents.
         */
        public Builder sqlStatementContents(SqlStatementContents sqlStatementContents) {
            this.sqlStatementContents = sqlStatementContents;
            return this;
        }

        public ListSqlStatementContentsResponseBody build() {
            return new ListSqlStatementContentsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSqlStatementContentsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSqlStatementContentsResponseBody</p>
     */
    public static class SqlStatementContents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("contents")
        private String contents;

        @com.aliyun.core.annotation.NameInMap("maxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("nextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Integer totalCount;

        private SqlStatementContents(Builder builder) {
            this.contents = builder.contents;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SqlStatementContents create() {
            return builder().build();
        }

        /**
         * @return contents
         */
        public String getContents() {
            return this.contents;
        }

        /**
         * @return maxResults
         */
        public Integer getMaxResults() {
            return this.maxResults;
        }

        /**
         * @return nextToken
         */
        public String getNextToken() {
            return this.nextToken;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String contents; 
            private Integer maxResults; 
            private String nextToken; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(SqlStatementContents model) {
                this.contents = model.contents;
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.totalCount = model.totalCount;
            } 

            /**
             * contents.
             */
            public Builder contents(String contents) {
                this.contents = contents;
                return this;
            }

            /**
             * maxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * nextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * totalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public SqlStatementContents build() {
                return new SqlStatementContents(this);
            } 

        } 

    }
}
