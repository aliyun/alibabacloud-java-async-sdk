// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterVpnAttachmentAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterVpnAttachmentAttributeResponse</p>
 */
public class UpdateTransitRouterVpnAttachmentAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTransitRouterVpnAttachmentAttributeResponseBody body;

    private UpdateTransitRouterVpnAttachmentAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTransitRouterVpnAttachmentAttributeResponse create() {
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
    public UpdateTransitRouterVpnAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTransitRouterVpnAttachmentAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTransitRouterVpnAttachmentAttributeResponseBody body);

        @Override
        UpdateTransitRouterVpnAttachmentAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTransitRouterVpnAttachmentAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTransitRouterVpnAttachmentAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTransitRouterVpnAttachmentAttributeResponse response) {
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
        public Builder body(UpdateTransitRouterVpnAttachmentAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTransitRouterVpnAttachmentAttributeResponse build() {
            return new UpdateTransitRouterVpnAttachmentAttributeResponse(this);
        } 

    } 

}
