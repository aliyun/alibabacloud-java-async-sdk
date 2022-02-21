// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dm20151123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteReceiverResponse} extends {@link TeaModel}
 *
 * <p>DeleteReceiverResponse</p>
 */
public class DeleteReceiverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteReceiverResponseBody body;

    private DeleteReceiverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteReceiverResponse create() {
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
    public DeleteReceiverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteReceiverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteReceiverResponseBody body);

        @Override
        DeleteReceiverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteReceiverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteReceiverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteReceiverResponse response) {
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
        public Builder body(DeleteReceiverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteReceiverResponse build() {
            return new DeleteReceiverResponse(this);
        } 

    } 

}
