// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePtsSceneResponse} extends {@link TeaModel}
 *
 * <p>DeletePtsSceneResponse</p>
 */
public class DeletePtsSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePtsSceneResponseBody body;

    private DeletePtsSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePtsSceneResponse create() {
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
    public DeletePtsSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePtsSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePtsSceneResponseBody body);

        @Override
        DeletePtsSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePtsSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePtsSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePtsSceneResponse response) {
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
        public Builder body(DeletePtsSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePtsSceneResponse build() {
            return new DeletePtsSceneResponse(this);
        } 

    } 

}
