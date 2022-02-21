// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBackupClientResourceResponse} extends {@link TeaModel}
 *
 * <p>DeleteBackupClientResourceResponse</p>
 */
public class DeleteBackupClientResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteBackupClientResourceResponseBody body;

    private DeleteBackupClientResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteBackupClientResourceResponse create() {
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
    public DeleteBackupClientResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteBackupClientResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteBackupClientResourceResponseBody body);

        @Override
        DeleteBackupClientResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteBackupClientResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteBackupClientResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteBackupClientResourceResponse response) {
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
        public Builder body(DeleteBackupClientResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteBackupClientResourceResponse build() {
            return new DeleteBackupClientResourceResponse(this);
        } 

    } 

}
