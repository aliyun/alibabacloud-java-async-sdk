// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVaultResponse} extends {@link TeaModel}
 *
 * <p>DeleteVaultResponse</p>
 */
public class DeleteVaultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVaultResponseBody body;

    private DeleteVaultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVaultResponse create() {
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
    public DeleteVaultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVaultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVaultResponseBody body);

        @Override
        DeleteVaultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVaultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVaultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVaultResponse response) {
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
        public Builder body(DeleteVaultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVaultResponse build() {
            return new DeleteVaultResponse(this);
        } 

    } 

}
