// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteVpdResponse} extends {@link TeaModel}
 *
 * <p>DeleteVpdResponse</p>
 */
public class DeleteVpdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteVpdResponseBody body;

    private DeleteVpdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteVpdResponse create() {
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
    public DeleteVpdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteVpdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteVpdResponseBody body);

        @Override
        DeleteVpdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteVpdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteVpdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteVpdResponse response) {
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
        public Builder body(DeleteVpdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteVpdResponse build() {
            return new DeleteVpdResponse(this);
        } 

    } 

}
