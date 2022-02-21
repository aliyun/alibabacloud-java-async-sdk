// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCredentialResponse} extends {@link TeaModel}
 *
 * <p>CreateCredentialResponse</p>
 */
public class CreateCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCredentialResponseBody body;

    private CreateCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCredentialResponse create() {
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
    public CreateCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCredentialResponseBody body);

        @Override
        CreateCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCredentialResponse response) {
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
        public Builder body(CreateCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCredentialResponse build() {
            return new CreateCredentialResponse(this);
        } 

    } 

}
