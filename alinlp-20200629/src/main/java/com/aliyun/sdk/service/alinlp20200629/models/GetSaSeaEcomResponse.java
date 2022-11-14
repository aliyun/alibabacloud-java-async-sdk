// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSaSeaEcomResponse} extends {@link TeaModel}
 *
 * <p>GetSaSeaEcomResponse</p>
 */
public class GetSaSeaEcomResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSaSeaEcomResponseBody body;

    private GetSaSeaEcomResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSaSeaEcomResponse create() {
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
    public GetSaSeaEcomResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSaSeaEcomResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSaSeaEcomResponseBody body);

        @Override
        GetSaSeaEcomResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSaSeaEcomResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSaSeaEcomResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSaSeaEcomResponse response) {
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
        public Builder body(GetSaSeaEcomResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSaSeaEcomResponse build() {
            return new GetSaSeaEcomResponse(this);
        } 

    } 

}
