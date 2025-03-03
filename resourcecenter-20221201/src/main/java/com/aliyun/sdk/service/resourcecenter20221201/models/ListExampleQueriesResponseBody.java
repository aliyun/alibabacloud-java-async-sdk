// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link ListExampleQueriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExampleQueriesResponseBody</p>
 */
public class ListExampleQueriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExampleQueries")
    private java.util.List<ExampleQueries> exampleQueries;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private String maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListExampleQueriesResponseBody(Builder builder) {
        this.exampleQueries = builder.exampleQueries;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExampleQueriesResponseBody create() {
        return builder().build();
    }

    /**
     * @return exampleQueries
     */
    public java.util.List<ExampleQueries> getExampleQueries() {
        return this.exampleQueries;
    }

    /**
     * @return maxResults
     */
    public String getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ExampleQueries> exampleQueries; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * <p>The information about the sample query templates.</p>
         */
        public Builder exampleQueries(java.util.List<ExampleQueries> exampleQueries) {
            this.exampleQueries = exampleQueries;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJzZWFyY2hBZnRlcnMiOlsiMTAwMTU2Nzk4MTU1OSJd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D696E6EF-3A6D-5770-801E-4982081FE4D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExampleQueriesResponseBody build() {
            return new ListExampleQueriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExampleQueriesResponseBody} extends {@link TeaModel}
     *
     * <p>ListExampleQueriesResponseBody</p>
     */
    public static class ExampleQueries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QueryId")
        private String queryId;

        private ExampleQueries(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.queryId = builder.queryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExampleQueries create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return queryId
         */
        public String getQueryId() {
            return this.queryId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String queryId; 

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Queries all resources on which you have permissions and sorts the resources by resource type and resource ID.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Query of All Alibaba Cloud Resources</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>sq-0PfKy****</p>
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            public ExampleQueries build() {
                return new ExampleQueries(this);
            } 

        } 

    }
}
