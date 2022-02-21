// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOIDCProviderResponse} extends {@link TeaModel}
 *
 * <p>GetOIDCProviderResponse</p>
 */
public class GetOIDCProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOIDCProviderResponseBody body;

    private GetOIDCProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOIDCProviderResponse create() {
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
    public GetOIDCProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOIDCProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOIDCProviderResponseBody body);

        @Override
        GetOIDCProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOIDCProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOIDCProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOIDCProviderResponse response) {
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
        public Builder body(GetOIDCProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOIDCProviderResponse build() {
            return new GetOIDCProviderResponse(this);
        } 

    } 

}
