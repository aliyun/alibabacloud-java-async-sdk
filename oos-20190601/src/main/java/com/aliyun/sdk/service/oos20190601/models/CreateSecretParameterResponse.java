// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSecretParameterResponse} extends {@link TeaModel}
 *
 * <p>CreateSecretParameterResponse</p>
 */
public class CreateSecretParameterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSecretParameterResponseBody body;

    private CreateSecretParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSecretParameterResponse create() {
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
    public CreateSecretParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSecretParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSecretParameterResponseBody body);

        @Override
        CreateSecretParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSecretParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSecretParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSecretParameterResponse response) {
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
        public Builder body(CreateSecretParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSecretParameterResponse build() {
            return new CreateSecretParameterResponse(this);
        } 

    } 

}
