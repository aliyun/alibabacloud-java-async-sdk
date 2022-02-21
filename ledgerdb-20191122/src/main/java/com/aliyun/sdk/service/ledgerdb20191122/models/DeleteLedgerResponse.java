// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLedgerResponse} extends {@link TeaModel}
 *
 * <p>DeleteLedgerResponse</p>
 */
public class DeleteLedgerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLedgerResponseBody body;

    private DeleteLedgerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLedgerResponse create() {
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
    public DeleteLedgerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLedgerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLedgerResponseBody body);

        @Override
        DeleteLedgerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLedgerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLedgerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLedgerResponse response) {
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
        public Builder body(DeleteLedgerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLedgerResponse build() {
            return new DeleteLedgerResponse(this);
        } 

    } 

}
