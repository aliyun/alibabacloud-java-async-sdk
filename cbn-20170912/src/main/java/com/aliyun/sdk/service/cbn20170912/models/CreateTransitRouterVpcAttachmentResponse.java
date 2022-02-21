// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterVpcAttachmentResponse} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterVpcAttachmentResponse</p>
 */
public class CreateTransitRouterVpcAttachmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTransitRouterVpcAttachmentResponseBody body;

    private CreateTransitRouterVpcAttachmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTransitRouterVpcAttachmentResponse create() {
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
    public CreateTransitRouterVpcAttachmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTransitRouterVpcAttachmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTransitRouterVpcAttachmentResponseBody body);

        @Override
        CreateTransitRouterVpcAttachmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTransitRouterVpcAttachmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTransitRouterVpcAttachmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTransitRouterVpcAttachmentResponse response) {
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
        public Builder body(CreateTransitRouterVpcAttachmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTransitRouterVpcAttachmentResponse build() {
            return new CreateTransitRouterVpcAttachmentResponse(this);
        } 

    } 

}
