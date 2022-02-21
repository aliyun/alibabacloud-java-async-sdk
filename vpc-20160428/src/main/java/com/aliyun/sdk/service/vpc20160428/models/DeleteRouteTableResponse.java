// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteTableResponse} extends {@link TeaModel}
 *
 * <p>DeleteRouteTableResponse</p>
 */
public class DeleteRouteTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRouteTableResponseBody body;

    private DeleteRouteTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRouteTableResponse create() {
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
    public DeleteRouteTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRouteTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRouteTableResponseBody body);

        @Override
        DeleteRouteTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRouteTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRouteTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRouteTableResponse response) {
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
        public Builder body(DeleteRouteTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRouteTableResponse build() {
            return new DeleteRouteTableResponse(this);
        } 

    } 

}
