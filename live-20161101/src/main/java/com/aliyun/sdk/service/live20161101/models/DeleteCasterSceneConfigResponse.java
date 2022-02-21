// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCasterSceneConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteCasterSceneConfigResponse</p>
 */
public class DeleteCasterSceneConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCasterSceneConfigResponseBody body;

    private DeleteCasterSceneConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCasterSceneConfigResponse create() {
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
    public DeleteCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCasterSceneConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCasterSceneConfigResponseBody body);

        @Override
        DeleteCasterSceneConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCasterSceneConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCasterSceneConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCasterSceneConfigResponse response) {
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
        public Builder body(DeleteCasterSceneConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCasterSceneConfigResponse build() {
            return new DeleteCasterSceneConfigResponse(this);
        } 

    } 

}
