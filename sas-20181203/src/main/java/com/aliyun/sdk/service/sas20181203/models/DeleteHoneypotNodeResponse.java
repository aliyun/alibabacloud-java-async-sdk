// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHoneypotNodeResponse} extends {@link TeaModel}
 *
 * <p>DeleteHoneypotNodeResponse</p>
 */
public class DeleteHoneypotNodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHoneypotNodeResponseBody body;

    private DeleteHoneypotNodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHoneypotNodeResponse create() {
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
    public DeleteHoneypotNodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHoneypotNodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHoneypotNodeResponseBody body);

        @Override
        DeleteHoneypotNodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHoneypotNodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHoneypotNodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHoneypotNodeResponse response) {
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
        public Builder body(DeleteHoneypotNodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHoneypotNodeResponse build() {
            return new DeleteHoneypotNodeResponse(this);
        } 

    } 

}
