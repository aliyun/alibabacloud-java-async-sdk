// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupClientResponse} extends {@link TeaModel}
 *
 * <p>DeleteBackupClientResponse</p>
 */
public class DeleteBackupClientResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBackupClientResponseBody body;

    private DeleteBackupClientResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBackupClientResponse create() {
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
    public DeleteBackupClientResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBackupClientResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBackupClientResponseBody body);

        @Override
        DeleteBackupClientResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBackupClientResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBackupClientResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBackupClientResponse response) {
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
        public Builder body(DeleteBackupClientResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBackupClientResponse build() {
            return new DeleteBackupClientResponse(this);
        } 

    } 

}
