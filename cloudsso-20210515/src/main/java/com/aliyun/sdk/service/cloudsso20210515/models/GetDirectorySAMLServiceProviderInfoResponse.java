// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectorySAMLServiceProviderInfoResponse} extends {@link TeaModel}
 *
 * <p>GetDirectorySAMLServiceProviderInfoResponse</p>
 */
public class GetDirectorySAMLServiceProviderInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDirectorySAMLServiceProviderInfoResponseBody body;

    private GetDirectorySAMLServiceProviderInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDirectorySAMLServiceProviderInfoResponse create() {
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
    public GetDirectorySAMLServiceProviderInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDirectorySAMLServiceProviderInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDirectorySAMLServiceProviderInfoResponseBody body);

        @Override
        GetDirectorySAMLServiceProviderInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDirectorySAMLServiceProviderInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDirectorySAMLServiceProviderInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDirectorySAMLServiceProviderInfoResponse response) {
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
        public Builder body(GetDirectorySAMLServiceProviderInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDirectorySAMLServiceProviderInfoResponse build() {
            return new GetDirectorySAMLServiceProviderInfoResponse(this);
        } 

    } 

}
