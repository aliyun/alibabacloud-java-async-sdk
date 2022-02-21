// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteExtensionProviderResponse} extends {@link TeaModel}
 *
 * <p>DeleteExtensionProviderResponse</p>
 */
public class DeleteExtensionProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteExtensionProviderResponseBody body;

    private DeleteExtensionProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteExtensionProviderResponse create() {
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
    public DeleteExtensionProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteExtensionProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteExtensionProviderResponseBody body);

        @Override
        DeleteExtensionProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteExtensionProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteExtensionProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteExtensionProviderResponse response) {
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
        public Builder body(DeleteExtensionProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteExtensionProviderResponse build() {
            return new DeleteExtensionProviderResponse(this);
        } 

    } 

}
