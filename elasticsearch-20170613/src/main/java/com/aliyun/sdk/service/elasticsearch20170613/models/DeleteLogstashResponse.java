// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLogstashResponse} extends {@link TeaModel}
 *
 * <p>DeleteLogstashResponse</p>
 */
public class DeleteLogstashResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteLogstashResponseBody body;

    private DeleteLogstashResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteLogstashResponse create() {
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
    public DeleteLogstashResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteLogstashResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteLogstashResponseBody body);

        @Override
        DeleteLogstashResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteLogstashResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteLogstashResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteLogstashResponse response) {
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
        public Builder body(DeleteLogstashResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteLogstashResponse build() {
            return new DeleteLogstashResponse(this);
        } 

    } 

}
