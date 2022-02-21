// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteBackupFileResponse</p>
 */
public class DeleteBackupFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBackupFileResponseBody body;

    private DeleteBackupFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBackupFileResponse create() {
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
    public DeleteBackupFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBackupFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBackupFileResponseBody body);

        @Override
        DeleteBackupFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBackupFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBackupFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBackupFileResponse response) {
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
        public Builder body(DeleteBackupFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBackupFileResponse build() {
            return new DeleteBackupFileResponse(this);
        } 

    } 

}
