// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCurrentConcurrencyResponse} extends {@link TeaModel}
 *
 * <p>GetCurrentConcurrencyResponse</p>
 */
public class GetCurrentConcurrencyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCurrentConcurrencyResponseBody body;

    private GetCurrentConcurrencyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCurrentConcurrencyResponse create() {
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
    public GetCurrentConcurrencyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCurrentConcurrencyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCurrentConcurrencyResponseBody body);

        @Override
        GetCurrentConcurrencyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCurrentConcurrencyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCurrentConcurrencyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCurrentConcurrencyResponse response) {
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
        public Builder body(GetCurrentConcurrencyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCurrentConcurrencyResponse build() {
            return new GetCurrentConcurrencyResponse(this);
        } 

    } 

}
