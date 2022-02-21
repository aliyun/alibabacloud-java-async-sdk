// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRenewInstancePriceResponse} extends {@link TeaModel}
 *
 * <p>QueryRenewInstancePriceResponse</p>
 */
public class QueryRenewInstancePriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRenewInstancePriceResponseBody body;

    private QueryRenewInstancePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRenewInstancePriceResponse create() {
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
    public QueryRenewInstancePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRenewInstancePriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRenewInstancePriceResponseBody body);

        @Override
        QueryRenewInstancePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRenewInstancePriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRenewInstancePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRenewInstancePriceResponse response) {
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
        public Builder body(QueryRenewInstancePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRenewInstancePriceResponse build() {
            return new QueryRenewInstancePriceResponse(this);
        } 

    } 

}
