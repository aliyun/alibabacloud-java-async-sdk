// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBusinessCategoryResponse} extends {@link TeaModel}
 *
 * <p>DeleteBusinessCategoryResponse</p>
 */
public class DeleteBusinessCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBusinessCategoryResponseBody body;

    private DeleteBusinessCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBusinessCategoryResponse create() {
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
    public DeleteBusinessCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBusinessCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBusinessCategoryResponseBody body);

        @Override
        DeleteBusinessCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBusinessCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBusinessCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBusinessCategoryResponse response) {
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
        public Builder body(DeleteBusinessCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBusinessCategoryResponse build() {
            return new DeleteBusinessCategoryResponse(this);
        } 

    } 

}
