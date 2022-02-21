// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConvertInstancePriceResponse} extends {@link TeaModel}
 *
 * <p>QueryConvertInstancePriceResponse</p>
 */
public class QueryConvertInstancePriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryConvertInstancePriceResponseBody body;

    private QueryConvertInstancePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryConvertInstancePriceResponse create() {
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
    public QueryConvertInstancePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryConvertInstancePriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryConvertInstancePriceResponseBody body);

        @Override
        QueryConvertInstancePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryConvertInstancePriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryConvertInstancePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryConvertInstancePriceResponse response) {
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
        public Builder body(QueryConvertInstancePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryConvertInstancePriceResponse build() {
            return new QueryConvertInstancePriceResponse(this);
        } 

    } 

}
