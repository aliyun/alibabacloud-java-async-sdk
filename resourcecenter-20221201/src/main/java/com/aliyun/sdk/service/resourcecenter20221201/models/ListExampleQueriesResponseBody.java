// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListExampleQueriesResponseBody} extends {@link TeaModel}
 *
 * <p>ListExampleQueriesResponseBody</p>
 */
public class ListExampleQueriesResponseBody extends TeaModel {
    @NameInMap("ExampleQueries")
    private java.util.List < ExampleQueries> exampleQueries;

    @NameInMap("MaxResults")
    private String maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
    public java.util.List < ExampleQueries> getExampleQueries() {
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
        private java.util.List < ExampleQueries> exampleQueries; 
        private String maxResults; 
        private String nextToken; 
        private String requestId; 

        /**
         * The information about the sample query templates.
         */
        public Builder exampleQueries(java.util.List < ExampleQueries> exampleQueries) {
            this.exampleQueries = exampleQueries;
            return this;
        }

        /**
         * The maximum number of entries per page.
         */
        public Builder maxResults(String maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The pagination token that is used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListExampleQueriesResponseBody build() {
            return new ListExampleQueriesResponseBody(this);
        } 

    } 

    public static class ExampleQueries extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("QueryId")
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
             * The description of the template.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The name of the template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the template.
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
