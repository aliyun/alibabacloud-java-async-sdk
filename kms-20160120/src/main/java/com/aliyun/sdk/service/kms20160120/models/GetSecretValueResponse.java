// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSecretValueResponse} extends {@link TeaModel}
 *
 * <p>GetSecretValueResponse</p>
 */
public class GetSecretValueResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSecretValueResponseBody body;

    private GetSecretValueResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSecretValueResponse create() {
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
    public GetSecretValueResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSecretValueResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSecretValueResponseBody body);

        @Override
        GetSecretValueResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSecretValueResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSecretValueResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSecretValueResponse response) {
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
        public Builder body(GetSecretValueResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSecretValueResponse build() {
            return new GetSecretValueResponse(this);
        } 

    } 

}
