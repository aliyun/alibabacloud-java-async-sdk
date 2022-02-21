// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteCustomImageResponse} extends {@link TeaModel}
 *
 * <p>DeleteCustomImageResponse</p>
 */
public class DeleteCustomImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteCustomImageResponseBody body;

    private DeleteCustomImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteCustomImageResponse create() {
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
    public DeleteCustomImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteCustomImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteCustomImageResponseBody body);

        @Override
        DeleteCustomImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteCustomImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteCustomImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteCustomImageResponse response) {
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
        public Builder body(DeleteCustomImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteCustomImageResponse build() {
            return new DeleteCustomImageResponse(this);
        } 

    } 

}
