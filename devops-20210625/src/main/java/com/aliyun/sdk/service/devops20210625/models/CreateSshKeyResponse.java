// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSshKeyResponse} extends {@link TeaModel}
 *
 * <p>CreateSshKeyResponse</p>
 */
public class CreateSshKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSshKeyResponseBody body;

    private CreateSshKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSshKeyResponse create() {
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
    public CreateSshKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSshKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSshKeyResponseBody body);

        @Override
        CreateSshKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSshKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSshKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSshKeyResponse response) {
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
        public Builder body(CreateSshKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSshKeyResponse build() {
            return new CreateSshKeyResponse(this);
        } 

    } 

}
