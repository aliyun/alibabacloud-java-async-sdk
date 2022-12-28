// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrivateRegistryResponse} extends {@link TeaModel}
 *
 * <p>DeletePrivateRegistryResponse</p>
 */
public class DeletePrivateRegistryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrivateRegistryResponseBody body;

    private DeletePrivateRegistryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrivateRegistryResponse create() {
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
    public DeletePrivateRegistryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrivateRegistryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrivateRegistryResponseBody body);

        @Override
        DeletePrivateRegistryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrivateRegistryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrivateRegistryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrivateRegistryResponse response) {
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
        public Builder body(DeletePrivateRegistryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrivateRegistryResponse build() {
            return new DeletePrivateRegistryResponse(this);
        } 

    } 

}
