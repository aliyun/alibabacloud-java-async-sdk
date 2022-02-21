// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRouteTableResponse} extends {@link TeaModel}
 *
 * <p>CreateRouteTableResponse</p>
 */
public class CreateRouteTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRouteTableResponseBody body;

    private CreateRouteTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRouteTableResponse create() {
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
    public CreateRouteTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRouteTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRouteTableResponseBody body);

        @Override
        CreateRouteTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRouteTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRouteTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRouteTableResponse response) {
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
        public Builder body(CreateRouteTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRouteTableResponse build() {
            return new CreateRouteTableResponse(this);
        } 

    } 

}
