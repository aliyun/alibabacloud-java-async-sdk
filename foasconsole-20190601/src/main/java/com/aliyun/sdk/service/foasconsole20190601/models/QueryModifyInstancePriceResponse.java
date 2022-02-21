// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryModifyInstancePriceResponse} extends {@link TeaModel}
 *
 * <p>QueryModifyInstancePriceResponse</p>
 */
public class QueryModifyInstancePriceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryModifyInstancePriceResponseBody body;

    private QueryModifyInstancePriceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryModifyInstancePriceResponse create() {
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
    public QueryModifyInstancePriceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryModifyInstancePriceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryModifyInstancePriceResponseBody body);

        @Override
        QueryModifyInstancePriceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryModifyInstancePriceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryModifyInstancePriceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryModifyInstancePriceResponse response) {
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
        public Builder body(QueryModifyInstancePriceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryModifyInstancePriceResponse build() {
            return new QueryModifyInstancePriceResponse(this);
        } 

    } 

}
