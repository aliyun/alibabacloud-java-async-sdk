// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenChildInstanceRouteEntryToAttachmentResponse} extends {@link TeaModel}
 *
 * <p>CreateCenChildInstanceRouteEntryToAttachmentResponse</p>
 */
public class CreateCenChildInstanceRouteEntryToAttachmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCenChildInstanceRouteEntryToAttachmentResponseBody body;

    private CreateCenChildInstanceRouteEntryToAttachmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCenChildInstanceRouteEntryToAttachmentResponse create() {
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
    public CreateCenChildInstanceRouteEntryToAttachmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCenChildInstanceRouteEntryToAttachmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCenChildInstanceRouteEntryToAttachmentResponseBody body);

        @Override
        CreateCenChildInstanceRouteEntryToAttachmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCenChildInstanceRouteEntryToAttachmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCenChildInstanceRouteEntryToAttachmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCenChildInstanceRouteEntryToAttachmentResponse response) {
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
        public Builder body(CreateCenChildInstanceRouteEntryToAttachmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCenChildInstanceRouteEntryToAttachmentResponse build() {
            return new CreateCenChildInstanceRouteEntryToAttachmentResponse(this);
        } 

    } 

}
