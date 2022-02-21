// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAutoCcWhitelistResponse} extends {@link TeaModel}
 *
 * <p>DeleteAutoCcWhitelistResponse</p>
 */
public class DeleteAutoCcWhitelistResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAutoCcWhitelistResponseBody body;

    private DeleteAutoCcWhitelistResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAutoCcWhitelistResponse create() {
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
    public DeleteAutoCcWhitelistResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAutoCcWhitelistResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAutoCcWhitelistResponseBody body);

        @Override
        DeleteAutoCcWhitelistResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAutoCcWhitelistResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAutoCcWhitelistResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAutoCcWhitelistResponse response) {
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
        public Builder body(DeleteAutoCcWhitelistResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAutoCcWhitelistResponse build() {
            return new DeleteAutoCcWhitelistResponse(this);
        } 

    } 

}
