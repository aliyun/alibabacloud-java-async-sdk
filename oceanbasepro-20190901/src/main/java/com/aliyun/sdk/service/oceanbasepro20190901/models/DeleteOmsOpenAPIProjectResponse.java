// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOmsOpenAPIProjectResponse} extends {@link TeaModel}
 *
 * <p>DeleteOmsOpenAPIProjectResponse</p>
 */
public class DeleteOmsOpenAPIProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteOmsOpenAPIProjectResponseBody body;

    private DeleteOmsOpenAPIProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteOmsOpenAPIProjectResponse create() {
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
    public DeleteOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteOmsOpenAPIProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteOmsOpenAPIProjectResponseBody body);

        @Override
        DeleteOmsOpenAPIProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteOmsOpenAPIProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteOmsOpenAPIProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteOmsOpenAPIProjectResponse response) {
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
        public Builder body(DeleteOmsOpenAPIProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteOmsOpenAPIProjectResponse build() {
            return new DeleteOmsOpenAPIProjectResponse(this);
        } 

    } 

}
