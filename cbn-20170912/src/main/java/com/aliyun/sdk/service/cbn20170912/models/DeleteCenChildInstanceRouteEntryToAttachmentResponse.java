// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCenChildInstanceRouteEntryToAttachmentResponse} extends {@link TeaModel}
 *
 * <p>DeleteCenChildInstanceRouteEntryToAttachmentResponse</p>
 */
public class DeleteCenChildInstanceRouteEntryToAttachmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCenChildInstanceRouteEntryToAttachmentResponseBody body;

    private DeleteCenChildInstanceRouteEntryToAttachmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCenChildInstanceRouteEntryToAttachmentResponse create() {
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
    public DeleteCenChildInstanceRouteEntryToAttachmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCenChildInstanceRouteEntryToAttachmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCenChildInstanceRouteEntryToAttachmentResponseBody body);

        @Override
        DeleteCenChildInstanceRouteEntryToAttachmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCenChildInstanceRouteEntryToAttachmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCenChildInstanceRouteEntryToAttachmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCenChildInstanceRouteEntryToAttachmentResponse response) {
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
        public Builder body(DeleteCenChildInstanceRouteEntryToAttachmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCenChildInstanceRouteEntryToAttachmentResponse build() {
            return new DeleteCenChildInstanceRouteEntryToAttachmentResponse(this);
        } 

    } 

}
