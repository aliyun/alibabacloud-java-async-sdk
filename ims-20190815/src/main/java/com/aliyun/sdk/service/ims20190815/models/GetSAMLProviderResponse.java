// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSAMLProviderResponse} extends {@link TeaModel}
 *
 * <p>GetSAMLProviderResponse</p>
 */
public class GetSAMLProviderResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetSAMLProviderResponseBody body;

    private GetSAMLProviderResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetSAMLProviderResponse create() {
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
    public GetSAMLProviderResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetSAMLProviderResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetSAMLProviderResponseBody body);

        @Override
        GetSAMLProviderResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetSAMLProviderResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetSAMLProviderResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetSAMLProviderResponse response) {
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
        public Builder body(GetSAMLProviderResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetSAMLProviderResponse build() {
            return new GetSAMLProviderResponse(this);
        } 

    } 

}
