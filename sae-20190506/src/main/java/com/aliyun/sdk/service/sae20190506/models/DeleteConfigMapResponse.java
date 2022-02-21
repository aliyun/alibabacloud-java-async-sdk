// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigMapResponse} extends {@link TeaModel}
 *
 * <p>DeleteConfigMapResponse</p>
 */
public class DeleteConfigMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteConfigMapResponseBody body;

    private DeleteConfigMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteConfigMapResponse create() {
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
    public DeleteConfigMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteConfigMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteConfigMapResponseBody body);

        @Override
        DeleteConfigMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteConfigMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteConfigMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteConfigMapResponse response) {
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
        public Builder body(DeleteConfigMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteConfigMapResponse build() {
            return new DeleteConfigMapResponse(this);
        } 

    } 

}
