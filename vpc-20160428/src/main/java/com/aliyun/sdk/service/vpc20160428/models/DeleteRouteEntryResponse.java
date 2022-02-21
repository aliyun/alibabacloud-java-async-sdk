// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>DeleteRouteEntryResponse</p>
 */
public class DeleteRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRouteEntryResponseBody body;

    private DeleteRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRouteEntryResponse create() {
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
    public DeleteRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRouteEntryResponseBody body);

        @Override
        DeleteRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRouteEntryResponse response) {
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
        public Builder body(DeleteRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRouteEntryResponse build() {
            return new DeleteRouteEntryResponse(this);
        } 

    } 

}
