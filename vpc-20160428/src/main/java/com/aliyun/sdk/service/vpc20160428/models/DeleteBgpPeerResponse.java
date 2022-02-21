// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBgpPeerResponse} extends {@link TeaModel}
 *
 * <p>DeleteBgpPeerResponse</p>
 */
public class DeleteBgpPeerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBgpPeerResponseBody body;

    private DeleteBgpPeerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBgpPeerResponse create() {
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
    public DeleteBgpPeerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBgpPeerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBgpPeerResponseBody body);

        @Override
        DeleteBgpPeerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBgpPeerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBgpPeerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBgpPeerResponse response) {
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
        public Builder body(DeleteBgpPeerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBgpPeerResponse build() {
            return new DeleteBgpPeerResponse(this);
        } 

    } 

}
