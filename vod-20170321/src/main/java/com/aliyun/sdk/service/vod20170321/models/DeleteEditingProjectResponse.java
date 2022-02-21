// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteEditingProjectResponse} extends {@link TeaModel}
 *
 * <p>DeleteEditingProjectResponse</p>
 */
public class DeleteEditingProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteEditingProjectResponseBody body;

    private DeleteEditingProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteEditingProjectResponse create() {
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
    public DeleteEditingProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteEditingProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteEditingProjectResponseBody body);

        @Override
        DeleteEditingProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteEditingProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteEditingProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteEditingProjectResponse response) {
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
        public Builder body(DeleteEditingProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteEditingProjectResponse build() {
            return new DeleteEditingProjectResponse(this);
        } 

    } 

}
