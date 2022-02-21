// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVmResponse} extends {@link TeaModel}
 *
 * <p>DeleteVmResponse</p>
 */
public class DeleteVmResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVmResponseBody body;

    private DeleteVmResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVmResponse create() {
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
    public DeleteVmResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVmResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVmResponseBody body);

        @Override
        DeleteVmResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVmResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVmResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVmResponse response) {
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
        public Builder body(DeleteVmResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVmResponse build() {
            return new DeleteVmResponse(this);
        } 

    } 

}
