// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserBackupFileResponse} extends {@link TeaModel}
 *
 * <p>DeleteUserBackupFileResponse</p>
 */
public class DeleteUserBackupFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteUserBackupFileResponseBody body;

    private DeleteUserBackupFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteUserBackupFileResponse create() {
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
    public DeleteUserBackupFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteUserBackupFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteUserBackupFileResponseBody body);

        @Override
        DeleteUserBackupFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteUserBackupFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteUserBackupFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteUserBackupFileResponse response) {
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
        public Builder body(DeleteUserBackupFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteUserBackupFileResponse build() {
            return new DeleteUserBackupFileResponse(this);
        } 

    } 

}
