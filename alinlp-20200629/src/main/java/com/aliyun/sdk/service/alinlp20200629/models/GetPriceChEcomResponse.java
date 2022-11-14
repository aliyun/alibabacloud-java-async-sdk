// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPriceChEcomResponse} extends {@link TeaModel}
 *
 * <p>GetPriceChEcomResponse</p>
 */
public class GetPriceChEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPriceChEcomResponseBody body;

    private GetPriceChEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPriceChEcomResponse create() {
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
    public GetPriceChEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPriceChEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPriceChEcomResponseBody body);

        @Override
        GetPriceChEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPriceChEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPriceChEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPriceChEcomResponse response) {
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
        public Builder body(GetPriceChEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPriceChEcomResponse build() {
            return new GetPriceChEcomResponse(this);
        } 

    } 

}
