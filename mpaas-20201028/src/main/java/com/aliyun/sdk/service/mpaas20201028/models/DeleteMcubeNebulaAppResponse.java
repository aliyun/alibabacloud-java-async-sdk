// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMcubeNebulaAppResponse} extends {@link TeaModel}
 *
 * <p>DeleteMcubeNebulaAppResponse</p>
 */
public class DeleteMcubeNebulaAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMcubeNebulaAppResponseBody body;

    private DeleteMcubeNebulaAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMcubeNebulaAppResponse create() {
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
    public DeleteMcubeNebulaAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMcubeNebulaAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMcubeNebulaAppResponseBody body);

        @Override
        DeleteMcubeNebulaAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMcubeNebulaAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMcubeNebulaAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMcubeNebulaAppResponse response) {
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
        public Builder body(DeleteMcubeNebulaAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMcubeNebulaAppResponse build() {
            return new DeleteMcubeNebulaAppResponse(this);
        } 

    } 

}
