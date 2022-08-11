// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMetaCategoryResponse} extends {@link TeaModel}
 *
 * <p>DeleteMetaCategoryResponse</p>
 */
public class DeleteMetaCategoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMetaCategoryResponseBody body;

    private DeleteMetaCategoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMetaCategoryResponse create() {
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
    public DeleteMetaCategoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMetaCategoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMetaCategoryResponseBody body);

        @Override
        DeleteMetaCategoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMetaCategoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMetaCategoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMetaCategoryResponse response) {
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
        public Builder body(DeleteMetaCategoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMetaCategoryResponse build() {
            return new DeleteMetaCategoryResponse(this);
        } 

    } 

}
