// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParametersResponse} extends {@link TeaModel}
 *
 * <p>GetSecretParametersResponse</p>
 */
public class GetSecretParametersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSecretParametersResponseBody body;

    private GetSecretParametersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSecretParametersResponse create() {
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
    public GetSecretParametersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecretParametersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSecretParametersResponseBody body);

        @Override
        GetSecretParametersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecretParametersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSecretParametersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecretParametersResponse response) {
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
        public Builder body(GetSecretParametersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecretParametersResponse build() {
            return new GetSecretParametersResponse(this);
        } 

    } 

}
