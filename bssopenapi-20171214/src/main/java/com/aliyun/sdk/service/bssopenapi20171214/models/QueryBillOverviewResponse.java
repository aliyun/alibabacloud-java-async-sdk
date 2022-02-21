// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBillOverviewResponse} extends {@link TeaModel}
 *
 * <p>QueryBillOverviewResponse</p>
 */
public class QueryBillOverviewResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBillOverviewResponseBody body;

    private QueryBillOverviewResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBillOverviewResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public QueryBillOverviewResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBillOverviewResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBillOverviewResponseBody body);

        @Override
        QueryBillOverviewResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBillOverviewResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBillOverviewResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBillOverviewResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(QueryBillOverviewResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBillOverviewResponse build() {
            return new QueryBillOverviewResponse(this);
        } 

    } 

}
