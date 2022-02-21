// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSecretBlacklistResponse} extends {@link TeaModel}
 *
 * <p>DeleteSecretBlacklistResponse</p>
 */
public class DeleteSecretBlacklistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSecretBlacklistResponseBody body;

    private DeleteSecretBlacklistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSecretBlacklistResponse create() {
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
    public DeleteSecretBlacklistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSecretBlacklistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSecretBlacklistResponseBody body);

        @Override
        DeleteSecretBlacklistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSecretBlacklistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSecretBlacklistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSecretBlacklistResponse response) {
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
        public Builder body(DeleteSecretBlacklistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSecretBlacklistResponse build() {
            return new DeleteSecretBlacklistResponse(this);
        } 

    } 

}
