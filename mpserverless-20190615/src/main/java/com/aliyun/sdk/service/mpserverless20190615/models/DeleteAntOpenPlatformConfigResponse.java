// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntOpenPlatformConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteAntOpenPlatformConfigResponse</p>
 */
public class DeleteAntOpenPlatformConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAntOpenPlatformConfigResponseBody body;

    private DeleteAntOpenPlatformConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAntOpenPlatformConfigResponse create() {
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
    public DeleteAntOpenPlatformConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAntOpenPlatformConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAntOpenPlatformConfigResponseBody body);

        @Override
        DeleteAntOpenPlatformConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAntOpenPlatformConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAntOpenPlatformConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAntOpenPlatformConfigResponse response) {
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
        public Builder body(DeleteAntOpenPlatformConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAntOpenPlatformConfigResponse build() {
            return new DeleteAntOpenPlatformConfigResponse(this);
        } 

    } 

}
