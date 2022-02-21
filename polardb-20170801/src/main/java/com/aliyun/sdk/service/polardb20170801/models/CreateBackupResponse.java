// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateBackupResponse} extends {@link TeaModel}
 *
 * <p>CreateBackupResponse</p>
 */
public class CreateBackupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateBackupResponseBody body;

    private CreateBackupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateBackupResponse create() {
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
    public CreateBackupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateBackupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateBackupResponseBody body);

        @Override
        CreateBackupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateBackupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateBackupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateBackupResponse response) {
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
        public Builder body(CreateBackupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateBackupResponse build() {
            return new CreateBackupResponse(this);
        } 

    } 

}
