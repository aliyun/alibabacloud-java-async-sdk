// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppTemplateResponse} extends {@link TeaModel}
 *
 * <p>DeleteAppTemplateResponse</p>
 */
public class DeleteAppTemplateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAppTemplateResponseBody body;

    private DeleteAppTemplateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAppTemplateResponse create() {
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
    public DeleteAppTemplateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAppTemplateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAppTemplateResponseBody body);

        @Override
        DeleteAppTemplateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAppTemplateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAppTemplateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAppTemplateResponse response) {
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
        public Builder body(DeleteAppTemplateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAppTemplateResponse build() {
            return new DeleteAppTemplateResponse(this);
        } 

    } 

}
