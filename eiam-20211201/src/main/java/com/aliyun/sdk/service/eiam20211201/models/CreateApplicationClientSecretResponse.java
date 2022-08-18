// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationClientSecretResponse} extends {@link TeaModel}
 *
 * <p>CreateApplicationClientSecretResponse</p>
 */
public class CreateApplicationClientSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateApplicationClientSecretResponseBody body;

    private CreateApplicationClientSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateApplicationClientSecretResponse create() {
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
    public CreateApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateApplicationClientSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateApplicationClientSecretResponseBody body);

        @Override
        CreateApplicationClientSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateApplicationClientSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateApplicationClientSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateApplicationClientSecretResponse response) {
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
        public Builder body(CreateApplicationClientSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateApplicationClientSecretResponse build() {
            return new CreateApplicationClientSecretResponse(this);
        } 

    } 

}
