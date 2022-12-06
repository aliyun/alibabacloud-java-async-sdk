// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDirectionalAddressResponse} extends {@link TeaModel}
 *
 * <p>DeleteDirectionalAddressResponse</p>
 */
public class DeleteDirectionalAddressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteDirectionalAddressResponseBody body;

    private DeleteDirectionalAddressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteDirectionalAddressResponse create() {
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
    public DeleteDirectionalAddressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteDirectionalAddressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteDirectionalAddressResponseBody body);

        @Override
        DeleteDirectionalAddressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteDirectionalAddressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteDirectionalAddressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteDirectionalAddressResponse response) {
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
        public Builder body(DeleteDirectionalAddressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteDirectionalAddressResponse build() {
            return new DeleteDirectionalAddressResponse(this);
        } 

    } 

}
