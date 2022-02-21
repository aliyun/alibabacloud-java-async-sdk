// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupResponse} extends {@link TeaModel}
 *
 * <p>DeleteBackupResponse</p>
 */
public class DeleteBackupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBackupResponseBody body;

    private DeleteBackupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBackupResponse create() {
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
    public DeleteBackupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBackupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBackupResponseBody body);

        @Override
        DeleteBackupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBackupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBackupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBackupResponse response) {
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
        public Builder body(DeleteBackupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBackupResponse build() {
            return new DeleteBackupResponse(this);
        } 

    } 

}
