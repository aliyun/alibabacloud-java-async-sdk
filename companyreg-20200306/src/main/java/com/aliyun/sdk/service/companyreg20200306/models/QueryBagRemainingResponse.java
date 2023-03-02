// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.companyreg20200306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBagRemainingResponse} extends {@link TeaModel}
 *
 * <p>QueryBagRemainingResponse</p>
 */
public class QueryBagRemainingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBagRemainingResponseBody body;

    private QueryBagRemainingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBagRemainingResponse create() {
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
    public QueryBagRemainingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBagRemainingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBagRemainingResponseBody body);

        @Override
        QueryBagRemainingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBagRemainingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBagRemainingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBagRemainingResponse response) {
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
        public Builder body(QueryBagRemainingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBagRemainingResponse build() {
            return new QueryBagRemainingResponse(this);
        } 

    } 

}
