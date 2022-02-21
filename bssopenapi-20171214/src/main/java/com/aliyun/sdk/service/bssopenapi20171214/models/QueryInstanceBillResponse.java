// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInstanceBillResponse} extends {@link TeaModel}
 *
 * <p>QueryInstanceBillResponse</p>
 */
public class QueryInstanceBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryInstanceBillResponseBody body;

    private QueryInstanceBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryInstanceBillResponse create() {
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
    public QueryInstanceBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInstanceBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryInstanceBillResponseBody body);

        @Override
        QueryInstanceBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInstanceBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryInstanceBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInstanceBillResponse response) {
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
        public Builder body(QueryInstanceBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInstanceBillResponse build() {
            return new QueryInstanceBillResponse(this);
        } 

    } 

}
