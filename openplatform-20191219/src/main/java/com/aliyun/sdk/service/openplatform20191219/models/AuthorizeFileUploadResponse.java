// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openplatform20191219.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeFileUploadResponse} extends {@link TeaModel}
 *
 * <p>AuthorizeFileUploadResponse</p>
 */
public class AuthorizeFileUploadResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AuthorizeFileUploadResponseBody body;

    private AuthorizeFileUploadResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AuthorizeFileUploadResponse create() {
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
    public AuthorizeFileUploadResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuthorizeFileUploadResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AuthorizeFileUploadResponseBody body);

        @Override
        AuthorizeFileUploadResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuthorizeFileUploadResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AuthorizeFileUploadResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuthorizeFileUploadResponse response) {
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
        public Builder body(AuthorizeFileUploadResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeFileUploadResponse build() {
            return new AuthorizeFileUploadResponse(this);
        } 

    } 

}
