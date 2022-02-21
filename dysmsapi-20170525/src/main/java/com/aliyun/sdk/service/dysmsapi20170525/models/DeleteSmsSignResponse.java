// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSmsSignResponse} extends {@link TeaModel}
 *
 * <p>DeleteSmsSignResponse</p>
 */
public class DeleteSmsSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSmsSignResponseBody body;

    private DeleteSmsSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSmsSignResponse create() {
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
    public DeleteSmsSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSmsSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSmsSignResponseBody body);

        @Override
        DeleteSmsSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSmsSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSmsSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSmsSignResponse response) {
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
        public Builder body(DeleteSmsSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSmsSignResponse build() {
            return new DeleteSmsSignResponse(this);
        } 

    } 

}
