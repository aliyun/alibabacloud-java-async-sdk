// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExampleQueryResponseBody} extends {@link TeaModel}
 *
 * <p>GetExampleQueryResponseBody</p>
 */
public class GetExampleQueryResponseBody extends TeaModel {
    @NameInMap("ExampleQuery")
    private ExampleQuery exampleQuery;

    @NameInMap("RequestId")
    private String requestId;

    private GetExampleQueryResponseBody(Builder builder) {
        this.exampleQuery = builder.exampleQuery;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExampleQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return exampleQuery
     */
    public ExampleQuery getExampleQuery() {
        return this.exampleQuery;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ExampleQuery exampleQuery; 
        private String requestId; 

        /**
         * ExampleQuery.
         */
        public Builder exampleQuery(ExampleQuery exampleQuery) {
            this.exampleQuery = exampleQuery;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExampleQueryResponseBody build() {
            return new GetExampleQueryResponseBody(this);
        } 

    } 

    public static class ExampleQuery extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("Name")
        private String name;

        @NameInMap("QueryId")
        private String queryId;

        private ExampleQuery(Builder builder) {
            this.description = builder.description;
            this.expression = builder.expression;
            this.name = builder.name;
            this.queryId = builder.queryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExampleQuery create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
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
            private String expression; 
            private String name; 
            private String queryId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * QueryId.
             */
            public Builder queryId(String queryId) {
                this.queryId = queryId;
                return this;
            }

            public ExampleQuery build() {
                return new ExampleQuery(this);
            } 

        } 

    }
}
