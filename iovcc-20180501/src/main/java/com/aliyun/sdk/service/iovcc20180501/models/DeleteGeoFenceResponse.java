// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteGeoFenceResponse} extends {@link TeaModel}
 *
 * <p>DeleteGeoFenceResponse</p>
 */
public class DeleteGeoFenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteGeoFenceResponseBody body;

    private DeleteGeoFenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteGeoFenceResponse create() {
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
    public DeleteGeoFenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteGeoFenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteGeoFenceResponseBody body);

        @Override
        DeleteGeoFenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteGeoFenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteGeoFenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteGeoFenceResponse response) {
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
        public Builder body(DeleteGeoFenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteGeoFenceResponse build() {
            return new DeleteGeoFenceResponse(this);
        } 

    } 

}
