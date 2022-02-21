// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserAvailableCreditAmountResponse} extends {@link TeaModel}
 *
 * <p>QueryUserAvailableCreditAmountResponse</p>
 */
public class QueryUserAvailableCreditAmountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryUserAvailableCreditAmountResponseBody body;

    private QueryUserAvailableCreditAmountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryUserAvailableCreditAmountResponse create() {
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
    public QueryUserAvailableCreditAmountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryUserAvailableCreditAmountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryUserAvailableCreditAmountResponseBody body);

        @Override
        QueryUserAvailableCreditAmountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryUserAvailableCreditAmountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryUserAvailableCreditAmountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryUserAvailableCreditAmountResponse response) {
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
        public Builder body(QueryUserAvailableCreditAmountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryUserAvailableCreditAmountResponse build() {
            return new QueryUserAvailableCreditAmountResponse(this);
        } 

    } 

}
