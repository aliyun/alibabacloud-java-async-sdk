// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualBorderRouterResponse} extends {@link TeaModel}
 *
 * <p>CreateVirtualBorderRouterResponse</p>
 */
public class CreateVirtualBorderRouterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVirtualBorderRouterResponseBody body;

    private CreateVirtualBorderRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVirtualBorderRouterResponse create() {
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
    public CreateVirtualBorderRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVirtualBorderRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVirtualBorderRouterResponseBody body);

        @Override
        CreateVirtualBorderRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVirtualBorderRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVirtualBorderRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVirtualBorderRouterResponse response) {
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
        public Builder body(CreateVirtualBorderRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVirtualBorderRouterResponse build() {
            return new CreateVirtualBorderRouterResponse(this);
        } 

    } 

}
