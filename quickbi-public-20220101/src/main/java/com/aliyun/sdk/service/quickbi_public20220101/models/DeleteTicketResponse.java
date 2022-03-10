// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTicketResponse} extends {@link TeaModel}
 *
 * <p>DeleteTicketResponse</p>
 */
public class DeleteTicketResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteTicketResponseBody body;

    private DeleteTicketResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteTicketResponse create() {
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
    public DeleteTicketResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteTicketResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteTicketResponseBody body);

        @Override
        DeleteTicketResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteTicketResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteTicketResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteTicketResponse response) {
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
        public Builder body(DeleteTicketResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteTicketResponse build() {
            return new DeleteTicketResponse(this);
        } 

    } 

}
