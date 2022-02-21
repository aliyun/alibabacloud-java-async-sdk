// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFilesetResponse} extends {@link TeaModel}
 *
 * <p>DeleteFilesetResponse</p>
 */
public class DeleteFilesetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFilesetResponseBody body;

    private DeleteFilesetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFilesetResponse create() {
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
    public DeleteFilesetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFilesetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFilesetResponseBody body);

        @Override
        DeleteFilesetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFilesetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFilesetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFilesetResponse response) {
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
        public Builder body(DeleteFilesetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFilesetResponse build() {
            return new DeleteFilesetResponse(this);
        } 

    } 

}
