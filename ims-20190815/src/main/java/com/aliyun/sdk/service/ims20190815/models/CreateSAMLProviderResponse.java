// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSAMLProviderResponse} extends {@link TeaModel}
 *
 * <p>CreateSAMLProviderResponse</p>
 */
public class CreateSAMLProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSAMLProviderResponseBody body;

    private CreateSAMLProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSAMLProviderResponse create() {
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
    public CreateSAMLProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSAMLProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSAMLProviderResponseBody body);

        @Override
        CreateSAMLProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSAMLProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSAMLProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSAMLProviderResponse response) {
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
        public Builder body(CreateSAMLProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSAMLProviderResponse build() {
            return new CreateSAMLProviderResponse(this);
        } 

    } 

}
