// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOutboundCallNumberResponse} extends {@link TeaModel}
 *
 * <p>DeleteOutboundCallNumberResponse</p>
 */
public class DeleteOutboundCallNumberResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteOutboundCallNumberResponseBody body;

    private DeleteOutboundCallNumberResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteOutboundCallNumberResponse create() {
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
    public DeleteOutboundCallNumberResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteOutboundCallNumberResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteOutboundCallNumberResponseBody body);

        @Override
        DeleteOutboundCallNumberResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteOutboundCallNumberResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteOutboundCallNumberResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteOutboundCallNumberResponse response) {
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
        public Builder body(DeleteOutboundCallNumberResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteOutboundCallNumberResponse build() {
            return new DeleteOutboundCallNumberResponse(this);
        } 

    } 

}
