// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCenRouteMapResponse} extends {@link TeaModel}
 *
 * <p>DeleteCenRouteMapResponse</p>
 */
public class DeleteCenRouteMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCenRouteMapResponseBody body;

    private DeleteCenRouteMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCenRouteMapResponse create() {
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
    public DeleteCenRouteMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCenRouteMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCenRouteMapResponseBody body);

        @Override
        DeleteCenRouteMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCenRouteMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCenRouteMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCenRouteMapResponse response) {
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
        public Builder body(DeleteCenRouteMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCenRouteMapResponse build() {
            return new DeleteCenRouteMapResponse(this);
        } 

    } 

}
