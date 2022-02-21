// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRouteServiceInCenResponse} extends {@link TeaModel}
 *
 * <p>DeleteRouteServiceInCenResponse</p>
 */
public class DeleteRouteServiceInCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRouteServiceInCenResponseBody body;

    private DeleteRouteServiceInCenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRouteServiceInCenResponse create() {
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
    public DeleteRouteServiceInCenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRouteServiceInCenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRouteServiceInCenResponseBody body);

        @Override
        DeleteRouteServiceInCenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRouteServiceInCenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRouteServiceInCenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRouteServiceInCenResponse response) {
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
        public Builder body(DeleteRouteServiceInCenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRouteServiceInCenResponse build() {
            return new DeleteRouteServiceInCenResponse(this);
        } 

    } 

}
