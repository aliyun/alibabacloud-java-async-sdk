// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretParametersByPathResponse} extends {@link TeaModel}
 *
 * <p>GetSecretParametersByPathResponse</p>
 */
public class GetSecretParametersByPathResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSecretParametersByPathResponseBody body;

    private GetSecretParametersByPathResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSecretParametersByPathResponse create() {
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
    public GetSecretParametersByPathResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecretParametersByPathResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSecretParametersByPathResponseBody body);

        @Override
        GetSecretParametersByPathResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecretParametersByPathResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSecretParametersByPathResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecretParametersByPathResponse response) {
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
        public Builder body(GetSecretParametersByPathResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecretParametersByPathResponse build() {
            return new GetSecretParametersByPathResponse(this);
        } 

    } 

}
