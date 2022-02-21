// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterPeerAttachmentResponse} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterPeerAttachmentResponse</p>
 */
public class CreateTransitRouterPeerAttachmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTransitRouterPeerAttachmentResponseBody body;

    private CreateTransitRouterPeerAttachmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTransitRouterPeerAttachmentResponse create() {
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
    public CreateTransitRouterPeerAttachmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTransitRouterPeerAttachmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTransitRouterPeerAttachmentResponseBody body);

        @Override
        CreateTransitRouterPeerAttachmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTransitRouterPeerAttachmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTransitRouterPeerAttachmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTransitRouterPeerAttachmentResponse response) {
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
        public Builder body(CreateTransitRouterPeerAttachmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTransitRouterPeerAttachmentResponse build() {
            return new CreateTransitRouterPeerAttachmentResponse(this);
        } 

    } 

}
