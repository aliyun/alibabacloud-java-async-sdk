// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteShadowSchemaResponse} extends {@link TeaModel}
 *
 * <p>DeleteShadowSchemaResponse</p>
 */
public class DeleteShadowSchemaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteShadowSchemaResponseBody body;

    private DeleteShadowSchemaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteShadowSchemaResponse create() {
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
    public DeleteShadowSchemaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteShadowSchemaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteShadowSchemaResponseBody body);

        @Override
        DeleteShadowSchemaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteShadowSchemaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteShadowSchemaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteShadowSchemaResponse response) {
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
        public Builder body(DeleteShadowSchemaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteShadowSchemaResponse build() {
            return new DeleteShadowSchemaResponse(this);
        } 

    } 

}
