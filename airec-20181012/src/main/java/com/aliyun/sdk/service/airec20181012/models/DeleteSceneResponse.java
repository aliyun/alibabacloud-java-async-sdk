// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSceneResponse} extends {@link TeaModel}
 *
 * <p>DeleteSceneResponse</p>
 */
public class DeleteSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSceneResponseBody body;

    private DeleteSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSceneResponse create() {
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
    public DeleteSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSceneResponseBody body);

        @Override
        DeleteSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSceneResponse response) {
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
        public Builder body(DeleteSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSceneResponse build() {
            return new DeleteSceneResponse(this);
        } 

    } 

}
