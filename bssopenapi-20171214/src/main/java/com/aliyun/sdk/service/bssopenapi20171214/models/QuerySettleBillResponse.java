// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySettleBillResponse} extends {@link TeaModel}
 *
 * <p>QuerySettleBillResponse</p>
 */
public class QuerySettleBillResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySettleBillResponseBody body;

    private QuerySettleBillResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySettleBillResponse create() {
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
    public QuerySettleBillResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySettleBillResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySettleBillResponseBody body);

        @Override
        QuerySettleBillResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySettleBillResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySettleBillResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySettleBillResponse response) {
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
        public Builder body(QuerySettleBillResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySettleBillResponse build() {
            return new QuerySettleBillResponse(this);
        } 

    } 

}
