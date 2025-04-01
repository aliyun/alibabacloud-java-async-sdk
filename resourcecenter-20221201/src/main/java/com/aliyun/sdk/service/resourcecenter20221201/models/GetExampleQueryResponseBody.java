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
 * {@link GetExampleQueryResponseBody} extends {@link TeaModel}
 *
 * <p>GetExampleQueryResponseBody</p>
 */
public class GetExampleQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ExampleQuery")
    private ExampleQuery exampleQuery;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetExampleQueryResponseBody model) {
            this.exampleQuery = model.exampleQuery;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the sample query template.</p>
         */
        public Builder exampleQuery(ExampleQuery exampleQuery) {
            this.exampleQuery = exampleQuery;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36A3D9BE-B607-5993-B546-7E19EF65DC00</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExampleQueryResponseBody build() {
            return new GetExampleQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExampleQueryResponseBody} extends {@link TeaModel}
     *
     * <p>GetExampleQueryResponseBody</p>
     */
    public static class ExampleQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QueryId")
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

            private Builder() {
            } 

            private Builder(ExampleQuery model) {
                this.description = model.description;
                this.expression = model.expression;
                this.name = model.name;
                this.queryId = model.queryId;
            } 

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
             * <p>The query statement in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT
             *   resource_id,
             *   resource_name,
             *   region_id,
             *   zone_id,
             *   resource_type,
             *   account_id,
             *   create_time,
             *   resource_group_id,
             *   tags,
             *   ip_addresses,
             *   vpc_id,
             *   v_switch_id
             * FROM
             *   resources
             * ORDER BY
             *   resource_type,
             *   resource_id
             * LIMIT
             *   1000 OFFSET 0;</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
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

            public ExampleQuery build() {
                return new ExampleQuery(this);
            } 

        } 

    }
}
