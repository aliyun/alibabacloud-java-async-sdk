// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVirtualBorderRouterResponse} extends {@link TeaModel}
 *
 * <p>DeleteVirtualBorderRouterResponse</p>
 */
public class DeleteVirtualBorderRouterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVirtualBorderRouterResponseBody body;

    private DeleteVirtualBorderRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVirtualBorderRouterResponse create() {
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
    public DeleteVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVirtualBorderRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVirtualBorderRouterResponseBody body);

        @Override
        DeleteVirtualBorderRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVirtualBorderRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVirtualBorderRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVirtualBorderRouterResponse response) {
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
        public Builder body(DeleteVirtualBorderRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVirtualBorderRouterResponse build() {
            return new DeleteVirtualBorderRouterResponse(this);
        } 

    } 

}
