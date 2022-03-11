// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHostShareKeyResponse} extends {@link TeaModel}
 *
 * <p>DeleteHostShareKeyResponse</p>
 */
public class DeleteHostShareKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHostShareKeyResponseBody body;

    private DeleteHostShareKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHostShareKeyResponse create() {
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
    public DeleteHostShareKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHostShareKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHostShareKeyResponseBody body);

        @Override
        DeleteHostShareKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHostShareKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHostShareKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHostShareKeyResponse response) {
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
        public Builder body(DeleteHostShareKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHostShareKeyResponse build() {
            return new DeleteHostShareKeyResponse(this);
        } 

    } 

}
