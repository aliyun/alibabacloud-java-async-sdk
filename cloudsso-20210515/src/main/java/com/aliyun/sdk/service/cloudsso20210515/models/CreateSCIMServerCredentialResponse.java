// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSCIMServerCredentialResponse} extends {@link TeaModel}
 *
 * <p>CreateSCIMServerCredentialResponse</p>
 */
public class CreateSCIMServerCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSCIMServerCredentialResponseBody body;

    private CreateSCIMServerCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSCIMServerCredentialResponse create() {
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
    public CreateSCIMServerCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSCIMServerCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSCIMServerCredentialResponseBody body);

        @Override
        CreateSCIMServerCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSCIMServerCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSCIMServerCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSCIMServerCredentialResponse response) {
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
        public Builder body(CreateSCIMServerCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSCIMServerCredentialResponse build() {
            return new CreateSCIMServerCredentialResponse(this);
        } 

    } 

}
