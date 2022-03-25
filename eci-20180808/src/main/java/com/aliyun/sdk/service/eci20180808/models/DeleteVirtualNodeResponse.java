// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eci20180808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVirtualNodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteVirtualNodeResponse</p>
 */
public class DeleteVirtualNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVirtualNodeResponseBody body;

    private DeleteVirtualNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVirtualNodeResponse create() {
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
    public DeleteVirtualNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVirtualNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVirtualNodeResponseBody body);

        @Override
        DeleteVirtualNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVirtualNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVirtualNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVirtualNodeResponse response) {
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
        public Builder body(DeleteVirtualNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVirtualNodeResponse build() {
            return new DeleteVirtualNodeResponse(this);
        } 

    } 

}
