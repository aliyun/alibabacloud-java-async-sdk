// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAccountResponse} extends {@link TeaModel}
 *
 * <p>DeleteAccountResponse</p>
 */
public class DeleteAccountResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteAccountResponseBody body;

    private DeleteAccountResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteAccountResponse create() {
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
    public DeleteAccountResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAccountResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteAccountResponseBody body);

        @Override
        DeleteAccountResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAccountResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteAccountResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAccountResponse response) {
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
        public Builder body(DeleteAccountResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAccountResponse build() {
            return new DeleteAccountResponse(this);
        } 

    } 

}
