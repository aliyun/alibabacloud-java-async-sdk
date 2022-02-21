// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteFileResponse</p>
 */
public class DeleteFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFileResponseBody body;

    private DeleteFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFileResponse create() {
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
    public DeleteFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFileResponseBody body);

        @Override
        DeleteFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFileResponse response) {
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
        public Builder body(DeleteFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFileResponse build() {
            return new DeleteFileResponse(this);
        } 

    } 

}
