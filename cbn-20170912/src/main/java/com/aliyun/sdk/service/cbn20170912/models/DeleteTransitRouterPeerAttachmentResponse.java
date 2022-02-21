// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTransitRouterPeerAttachmentResponse} extends {@link TeaModel}
 *
 * <p>DeleteTransitRouterPeerAttachmentResponse</p>
 */
public class DeleteTransitRouterPeerAttachmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTransitRouterPeerAttachmentResponseBody body;

    private DeleteTransitRouterPeerAttachmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTransitRouterPeerAttachmentResponse create() {
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
    public DeleteTransitRouterPeerAttachmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTransitRouterPeerAttachmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTransitRouterPeerAttachmentResponseBody body);

        @Override
        DeleteTransitRouterPeerAttachmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTransitRouterPeerAttachmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTransitRouterPeerAttachmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTransitRouterPeerAttachmentResponse response) {
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
        public Builder body(DeleteTransitRouterPeerAttachmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTransitRouterPeerAttachmentResponse build() {
            return new DeleteTransitRouterPeerAttachmentResponse(this);
        } 

    } 

}
