// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppSecretResponse} extends {@link TeaModel}
 *
 * <p>GetAppSecretResponse</p>
 */
public class GetAppSecretResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAppSecretResponseBody body;

    private GetAppSecretResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAppSecretResponse create() {
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
    public GetAppSecretResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAppSecretResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAppSecretResponseBody body);

        @Override
        GetAppSecretResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAppSecretResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAppSecretResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAppSecretResponse response) {
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
        public Builder body(GetAppSecretResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAppSecretResponse build() {
            return new GetAppSecretResponse(this);
        } 

    } 

}
