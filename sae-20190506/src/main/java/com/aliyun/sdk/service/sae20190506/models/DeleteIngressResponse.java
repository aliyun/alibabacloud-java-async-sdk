// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIngressResponse} extends {@link TeaModel}
 *
 * <p>DeleteIngressResponse</p>
 */
public class DeleteIngressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIngressResponseBody body;

    private DeleteIngressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIngressResponse create() {
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
    public DeleteIngressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIngressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIngressResponseBody body);

        @Override
        DeleteIngressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIngressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIngressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIngressResponse response) {
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
        public Builder body(DeleteIngressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIngressResponse build() {
            return new DeleteIngressResponse(this);
        } 

    } 

}
