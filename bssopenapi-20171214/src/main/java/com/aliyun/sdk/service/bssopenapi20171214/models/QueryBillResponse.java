// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBillResponse} extends {@link TeaModel}
 *
 * <p>QueryBillResponse</p>
 */
public class QueryBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBillResponseBody body;

    private QueryBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBillResponse create() {
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
    public QueryBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBillResponseBody body);

        @Override
        QueryBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBillResponse response) {
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
        public Builder body(QueryBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBillResponse build() {
            return new QueryBillResponse(this);
        } 

    } 

}
