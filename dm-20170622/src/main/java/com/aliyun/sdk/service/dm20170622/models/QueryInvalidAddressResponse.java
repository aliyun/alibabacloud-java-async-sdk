// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20170622.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryInvalidAddressResponse} extends {@link TeaModel}
 *
 * <p>QueryInvalidAddressResponse</p>
 */
public class QueryInvalidAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryInvalidAddressResponseBody body;

    private QueryInvalidAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryInvalidAddressResponse create() {
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
    public QueryInvalidAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryInvalidAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryInvalidAddressResponseBody body);

        @Override
        QueryInvalidAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryInvalidAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryInvalidAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryInvalidAddressResponse response) {
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
        public Builder body(QueryInvalidAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryInvalidAddressResponse build() {
            return new QueryInvalidAddressResponse(this);
        } 

    } 

}
