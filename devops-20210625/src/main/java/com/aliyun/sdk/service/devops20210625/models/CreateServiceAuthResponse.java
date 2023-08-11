// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceAuthResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceAuthResponse</p>
 */
public class CreateServiceAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceAuthResponseBody body;

    private CreateServiceAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceAuthResponse create() {
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
    public CreateServiceAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceAuthResponseBody body);

        @Override
        CreateServiceAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceAuthResponse response) {
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
        public Builder body(CreateServiceAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceAuthResponse build() {
            return new CreateServiceAuthResponse(this);
        } 

    } 

}
