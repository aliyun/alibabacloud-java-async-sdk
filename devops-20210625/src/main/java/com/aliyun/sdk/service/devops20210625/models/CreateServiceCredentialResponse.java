// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceCredentialResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceCredentialResponse</p>
 */
public class CreateServiceCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceCredentialResponseBody body;

    private CreateServiceCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceCredentialResponse create() {
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
    public CreateServiceCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceCredentialResponseBody body);

        @Override
        CreateServiceCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceCredentialResponse response) {
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
        public Builder body(CreateServiceCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceCredentialResponse build() {
            return new CreateServiceCredentialResponse(this);
        } 

    } 

}
