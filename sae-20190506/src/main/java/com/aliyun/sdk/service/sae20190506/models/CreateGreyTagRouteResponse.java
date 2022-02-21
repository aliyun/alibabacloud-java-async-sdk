// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGreyTagRouteResponse} extends {@link TeaModel}
 *
 * <p>CreateGreyTagRouteResponse</p>
 */
public class CreateGreyTagRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateGreyTagRouteResponseBody body;

    private CreateGreyTagRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateGreyTagRouteResponse create() {
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
    public CreateGreyTagRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateGreyTagRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateGreyTagRouteResponseBody body);

        @Override
        CreateGreyTagRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateGreyTagRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateGreyTagRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateGreyTagRouteResponse response) {
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
        public Builder body(CreateGreyTagRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateGreyTagRouteResponse build() {
            return new CreateGreyTagRouteResponse(this);
        } 

    } 

}
