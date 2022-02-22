// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExternalSAMLIdentityProviderResponse} extends {@link TeaModel}
 *
 * <p>GetExternalSAMLIdentityProviderResponse</p>
 */
public class GetExternalSAMLIdentityProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExternalSAMLIdentityProviderResponseBody body;

    private GetExternalSAMLIdentityProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExternalSAMLIdentityProviderResponse create() {
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
    public GetExternalSAMLIdentityProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExternalSAMLIdentityProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExternalSAMLIdentityProviderResponseBody body);

        @Override
        GetExternalSAMLIdentityProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExternalSAMLIdentityProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExternalSAMLIdentityProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExternalSAMLIdentityProviderResponse response) {
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
        public Builder body(GetExternalSAMLIdentityProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExternalSAMLIdentityProviderResponse build() {
            return new GetExternalSAMLIdentityProviderResponse(this);
        } 

    } 

}
