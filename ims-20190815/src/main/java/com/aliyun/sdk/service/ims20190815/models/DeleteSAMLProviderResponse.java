// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSAMLProviderResponse} extends {@link TeaModel}
 *
 * <p>DeleteSAMLProviderResponse</p>
 */
public class DeleteSAMLProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSAMLProviderResponseBody body;

    private DeleteSAMLProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSAMLProviderResponse create() {
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
    public DeleteSAMLProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSAMLProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSAMLProviderResponseBody body);

        @Override
        DeleteSAMLProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSAMLProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSAMLProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSAMLProviderResponse response) {
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
        public Builder body(DeleteSAMLProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSAMLProviderResponse build() {
            return new DeleteSAMLProviderResponse(this);
        } 

    } 

}
