// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterPeerAttachmentAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterPeerAttachmentAttributeResponse</p>
 */
public class UpdateTransitRouterPeerAttachmentAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTransitRouterPeerAttachmentAttributeResponseBody body;

    private UpdateTransitRouterPeerAttachmentAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTransitRouterPeerAttachmentAttributeResponse create() {
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
    public UpdateTransitRouterPeerAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTransitRouterPeerAttachmentAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTransitRouterPeerAttachmentAttributeResponseBody body);

        @Override
        UpdateTransitRouterPeerAttachmentAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTransitRouterPeerAttachmentAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTransitRouterPeerAttachmentAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTransitRouterPeerAttachmentAttributeResponse response) {
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
        public Builder body(UpdateTransitRouterPeerAttachmentAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTransitRouterPeerAttachmentAttributeResponse build() {
            return new UpdateTransitRouterPeerAttachmentAttributeResponse(this);
        } 

    } 

}
