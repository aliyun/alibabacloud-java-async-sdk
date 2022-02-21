// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTransitRouterResponse} extends {@link TeaModel}
 *
 * <p>CreateTransitRouterResponse</p>
 */
public class CreateTransitRouterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTransitRouterResponseBody body;

    private CreateTransitRouterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTransitRouterResponse create() {
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
    public CreateTransitRouterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTransitRouterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTransitRouterResponseBody body);

        @Override
        CreateTransitRouterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTransitRouterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTransitRouterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTransitRouterResponse response) {
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
        public Builder body(CreateTransitRouterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTransitRouterResponse build() {
            return new CreateTransitRouterResponse(this);
        } 

    } 

}
