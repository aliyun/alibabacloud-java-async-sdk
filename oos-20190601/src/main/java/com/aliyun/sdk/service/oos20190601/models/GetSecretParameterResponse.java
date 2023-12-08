// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParameterResponse} extends {@link TeaModel}
 *
 * <p>GetSecretParameterResponse</p>
 */
public class GetSecretParameterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSecretParameterResponseBody body;

    private GetSecretParameterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSecretParameterResponse create() {
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
    public GetSecretParameterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecretParameterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSecretParameterResponseBody body);

        @Override
        GetSecretParameterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecretParameterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSecretParameterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecretParameterResponse response) {
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
        public Builder body(GetSecretParameterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecretParameterResponse build() {
            return new GetSecretParameterResponse(this);
        } 

    } 

}
