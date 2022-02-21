// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouterInterfaceResponse} extends {@link TeaModel}
 *
 * <p>CreateRouterInterfaceResponse</p>
 */
public class CreateRouterInterfaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRouterInterfaceResponseBody body;

    private CreateRouterInterfaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRouterInterfaceResponse create() {
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
    public CreateRouterInterfaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRouterInterfaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRouterInterfaceResponseBody body);

        @Override
        CreateRouterInterfaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRouterInterfaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRouterInterfaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRouterInterfaceResponse response) {
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
        public Builder body(CreateRouterInterfaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRouterInterfaceResponse build() {
            return new CreateRouterInterfaceResponse(this);
        } 

    } 

}
