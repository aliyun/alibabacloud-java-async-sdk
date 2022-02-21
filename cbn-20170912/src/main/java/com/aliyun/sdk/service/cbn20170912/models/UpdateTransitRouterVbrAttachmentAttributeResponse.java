// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTransitRouterVbrAttachmentAttributeResponse} extends {@link TeaModel}
 *
 * <p>UpdateTransitRouterVbrAttachmentAttributeResponse</p>
 */
public class UpdateTransitRouterVbrAttachmentAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTransitRouterVbrAttachmentAttributeResponseBody body;

    private UpdateTransitRouterVbrAttachmentAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTransitRouterVbrAttachmentAttributeResponse create() {
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
    public UpdateTransitRouterVbrAttachmentAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTransitRouterVbrAttachmentAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTransitRouterVbrAttachmentAttributeResponseBody body);

        @Override
        UpdateTransitRouterVbrAttachmentAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTransitRouterVbrAttachmentAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTransitRouterVbrAttachmentAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTransitRouterVbrAttachmentAttributeResponse response) {
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
        public Builder body(UpdateTransitRouterVbrAttachmentAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTransitRouterVbrAttachmentAttributeResponse build() {
            return new UpdateTransitRouterVbrAttachmentAttributeResponse(this);
        } 

    } 

}
