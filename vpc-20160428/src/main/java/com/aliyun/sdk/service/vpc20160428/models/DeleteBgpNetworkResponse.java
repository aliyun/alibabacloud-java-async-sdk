// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBgpNetworkResponse} extends {@link TeaModel}
 *
 * <p>DeleteBgpNetworkResponse</p>
 */
public class DeleteBgpNetworkResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBgpNetworkResponseBody body;

    private DeleteBgpNetworkResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBgpNetworkResponse create() {
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
    public DeleteBgpNetworkResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBgpNetworkResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBgpNetworkResponseBody body);

        @Override
        DeleteBgpNetworkResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBgpNetworkResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBgpNetworkResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBgpNetworkResponse response) {
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
        public Builder body(DeleteBgpNetworkResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBgpNetworkResponse build() {
            return new DeleteBgpNetworkResponse(this);
        } 

    } 

}
