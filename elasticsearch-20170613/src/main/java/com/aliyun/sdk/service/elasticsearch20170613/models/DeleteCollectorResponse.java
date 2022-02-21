// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCollectorResponse} extends {@link TeaModel}
 *
 * <p>DeleteCollectorResponse</p>
 */
public class DeleteCollectorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCollectorResponseBody body;

    private DeleteCollectorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCollectorResponse create() {
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
    public DeleteCollectorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCollectorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCollectorResponseBody body);

        @Override
        DeleteCollectorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCollectorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCollectorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCollectorResponse response) {
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
        public Builder body(DeleteCollectorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCollectorResponse build() {
            return new DeleteCollectorResponse(this);
        } 

    } 

}
